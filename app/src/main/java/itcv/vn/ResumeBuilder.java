package itcv.vn;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.gson.Gson;
import com.qingmei2.rximagepicker.core.RxImagePicker;
import com.qingmei2.rximagepicker.entity.Result;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Scheduler;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.schedulers.Schedulers;
import itcv.vn.databinding.FragmentResumeBuilderBinding;
import itcv.vn.dialogfragment.geninfo.GenInfoView;
import itcv.vn.dialogfragment.specinfo.SpecInfoView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ResumeBuilder#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ResumeBuilder extends Fragment{
    private ProfileViewModel viewModel;
    private MyHandlers handlers;
    private Disposable disposable;
    public ResumeBuilder() {
    }
    public static ResumeBuilder newInstance() {
        ResumeBuilder fragment = new ResumeBuilder();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewModel = new ProfileViewModelImpl();

        FragmentResumeBuilderBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_resume_builder, container, false);
        binding.setProfileViewModel(viewModel);

        binding.listskill.setAdapter(new GeneralInformationAdapter(viewModel.getSkillList()));
        binding.listskill.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        binding.listachievement.setAdapter(new GeneralInformationAdapter(viewModel.getAchievementList()));
        binding.listachievement.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        binding.listhobby.setAdapter(new GeneralInformationAdapter(viewModel.getHobbyList()));
        binding.listhobby.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));

        binding.listactivity.setAdapter(new SpecializedInformationAdapter(viewModel.getActivityList()));
        binding.listactivity.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        binding.listeducation.setAdapter(new SpecializedInformationAdapter(viewModel.getEducationList()));
        binding.listeducation.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        binding.listexperience.setAdapter(new SpecializedInformationAdapter(viewModel.getExperienceList()));
        binding.listexperience.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        binding.setLifecycleOwner(getViewLifecycleOwner());






        binding.setHandlers(new MyHandlers() {
            @Override
            public void onCompleteClick(View view) {
                viewModel.saveProfile();
                Log.d("Result",new Gson().toJson(SharePreferencesHelper.getProfile()));
            }

            @Override
            public void onGenInfoButtonClick(View view) {
                GenInfoView dialogFragment = GenInfoView.newInstance();
                dialogFragment.show(getActivity().getSupportFragmentManager(),"General Info dialog");
                dialogFragment.getIsComplete().observe(
                        getViewLifecycleOwner(),aBoolean -> {
                            if(aBoolean) {
                                GeneralInformation generalInformation = dialogFragment.getViewModel().getGenInfo().getValue();
                                dialogFragment.dismiss();
                                if(view.equals(binding.addSkill))
                                {
                                    viewModel.addSkill(generalInformation);
                                }
                                else if(view.equals(binding.addAchievement)){
                                    viewModel.addAchievement(generalInformation);
                                }
                                else if(view.equals(binding.addHobby)){
                                    viewModel.addHobby(generalInformation);
                                }
                            }
                        });
            }

            @Override
            public void onSpecInfoButtonClick(View view) {
                SpecInfoView dialogFragment = SpecInfoView.newInstance();
                dialogFragment.show(getActivity().getSupportFragmentManager(),"General Info dialog");
                dialogFragment.getIsComplete().observe(
                        getViewLifecycleOwner(),aBoolean -> {
                            if(aBoolean) {
                                SpecializedInformation specializedInformation = dialogFragment.getViewModel().getSpecInfo().getValue();
                                dialogFragment.dismiss();
                                if(view.equals(binding.addExperience))
                                {
                                    viewModel.addExperience(specializedInformation);
                                }
                                else if(view.equals(binding.addEducation)){
                                    viewModel.addEducation(specializedInformation);
                                }
                                else if(view.equals(binding.addActivity)){
                                    viewModel.addActivity(specializedInformation);
                                }
                            }
                        });
            }

            @Override
            public void onImageClick(View view) {
                final Drawable[] drawable = new Drawable[1];
                final String[] string = new String[1];
                RxImagePicker.INSTANCE.create().openGallery(getActivity()).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread())
                        .subscribeOn(io.reactivex.schedulers.Schedulers.io())
                        .subscribe(result -> {
                                    Uri uri = result.getUri();
                                    string[0] = BitmapStringConverter.getRealPathFromURI(getActivity(),uri);
                                    drawable[0] = new BitmapDrawable(getActivity().getResources(),BitmapFactory.decodeFile(string[0]));
                                },
                                throwable -> {Log.d("Something wrong",throwable.getMessage());},
                                ()->{
                                    Log.d("Tag","OK: "+string[0]);
                                    viewModel.setDrawable(drawable[0]);
                                    binding.profilepicture.setImageDrawable(drawable[0]);
                                });
            }
        });
        disposable = viewModel.getObservable().observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io())
                .subscribe(profileModel -> {
                    binding.listskill.getAdapter().notifyDataSetChanged();
                    binding.listachievement.setAdapter(new GeneralInformationAdapter(profileModel.getAchievements()));
                    binding.listhobby.setAdapter(new GeneralInformationAdapter(profileModel.getHobbies()));
                    binding.listexperience.setAdapter(new SpecializedInformationAdapter(profileModel.getExperiences()));
                    binding.listeducation.setAdapter(new SpecializedInformationAdapter(profileModel.getEducation()));
                    binding.listactivity.setAdapter(new SpecializedInformationAdapter(profileModel.getActivities()));
                        },
                        throwable -> {},
                        ()->{

                        })  ;
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if(disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
        }    }
}