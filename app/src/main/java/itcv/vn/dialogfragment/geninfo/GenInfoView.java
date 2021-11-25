package itcv.vn.dialogfragment.geninfo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;

import itcv.vn.GeneralInformation;
import itcv.vn.R;
import itcv.vn.databinding.DialogGeninfoBinding;
import itcv.vn.dialogfragment.DialogHandlers;

public class GenInfoView extends DialogFragment{
    GenInfoDialogViewModel viewModel;
    MutableLiveData<Boolean> isComplete;

    public GenInfoView(){
        viewModel = new GenInfoDialogViewModel();
        isComplete = new MutableLiveData<>();
        isComplete.setValue(false);
    }
    public static GenInfoView newInstance(){
        GenInfoView dialogFragment = new GenInfoView();
        return dialogFragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Điền thông tin vào chỗ trống");
        return super.onCreateDialog(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        DialogGeninfoBinding binding = DataBindingUtil.inflate(inflater, R.layout.dialog_geninfo,container,false);
        binding.setGenInfoViewModel(viewModel);
        binding.setHandlers(new DialogHandlers() {
            @Override
            public void onCompleteClick(View view) {
                isComplete.setValue(true);
            }

            @Override
            public void onCancelClick(View view) {
                dismiss();
            }
        });

        return binding.getRoot();
    }

    public MutableLiveData<Boolean> getIsComplete() {
        return isComplete ;
    }

    public GenInfoDialogViewModel getViewModel() {
        return viewModel;
    }

}
