package itcv.vn;

import android.content.ContentProvider;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;

import java.io.File;
import java.util.List;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;

public class ProfileViewModelImpl extends BaseObservable implements ProfileViewModel {

    private MutableLiveData<ProfileModel> model;
    private MutableLiveData<Drawable> mutableDrawable;
    private ProfileModel profileModel;
    private PublishSubject<ProfileModel> subject;
    public ProfileViewModelImpl(){
        model = new MutableLiveData<>();
        model.setValue(new ProfileModel("","","","","",""));
        profileModel = new ProfileModel("","","","","","");
        subject = PublishSubject.create();
        mutableDrawable = new MutableLiveData<>();
        mutableDrawable.setValue(null);

    }
    @Override
    @Bindable
    public String getName(){
        return profileModel.getName();
    }
    @Override
    @Bindable
    public String getPosition(){
        return profileModel.getPosition();
    }
    @Override
    @Bindable
    public String getDate(){
        return profileModel.getDate();
    }
    @Override
    @Bindable
    public String getPhone(){
        return profileModel.getPhone();
    }
    @Override
    @Bindable
    public String getEmail(){
        return profileModel.getEmail();
    }

    @Override
    @Bindable
    public String getAddress(){
        return profileModel.getAddress();
    }

    @Override
    public void setName(String name) {
        profileModel.setName(name);
        subject.onNext(profileModel);
    }

    @Override
    public void setAddress(String address) {
        profileModel.setAddress(address);
        subject.onNext(profileModel);
    }

    @Override
    public void setDate(String date) {
        profileModel.setDate(date);
        subject.onNext(profileModel);
    }

    @Override
    public void setEmail(String email) {
        profileModel.setEmail(email);
        subject.onNext(profileModel);
    }

    @Override
    public void setModel(MutableLiveData<ProfileModel> model) {
        this.model = model;

    }

    @Override
    public void setPhone(String phone) {
        profileModel.setPhone(phone);
        subject.onNext(profileModel);
    }

    @Override
    public void setPosition(String position) {
        profileModel.setPosition(position);
        subject.onNext(profileModel);
    }

    @Override
    public MutableLiveData<ProfileModel> getModel(){
        return model;
    }

    @Override
    @Bindable
    public String getDescription() {
        return profileModel.getDescription();
    }


    @Override
    public void setDescription(String description) {
        profileModel.setDescription(description);
        subject.onNext(profileModel);
    }
    @Override
    @Bindable
    public List<GeneralInformation> getSkillList(){
        return profileModel.getSkills();
    }

    public void setSkillList(List<GeneralInformation> skillList) {
        profileModel.setSkills(skillList);
        subject.onNext(profileModel);
    }
    @Override
    @Bindable
    public List<GeneralInformation> getAchievementList(){return profileModel.getAchievements();}
    @Override
    @Bindable
    public List<GeneralInformation> getHobbyList(){return profileModel.getHobbies();
    }

    public void setAchievementList(List<GeneralInformation> list){
        profileModel.setAchievements(list);
        subject.onNext(profileModel);

    }
    public void setHobbyList(List<GeneralInformation> list){
        profileModel.setHobbies(list);
        subject.onNext(profileModel);

    }

    public Observable<ProfileModel> getObservable(){
        return subject.hide();
    }

    @Override
    @Bindable
    public ProfileModel getProfileModel() {
        return profileModel;
    }

    @Override
    public void setProfileModel(ProfileModel profileModel) {
        this.profileModel = profileModel;
        subject.onNext(profileModel);
    }

    @Override
    public void addSkill(GeneralInformation generalInformation){
        List<GeneralInformation> list = getSkillList();
        list.add(generalInformation);
        setSkillList(list);
    }

    @Override
    public void addHobby(GeneralInformation generalInformation) {
        List<GeneralInformation> list = getHobbyList();
        list.add(generalInformation);
        setHobbyList(list);
    }

    @Override
    public void addAchievement(GeneralInformation generalInformation) {
        List<GeneralInformation> list = getAchievementList();
        list.add(generalInformation);
        setAchievementList(list);
    }

    @Override
    public List<SpecializedInformation> getExperienceList(){
        return profileModel.getExperiences();
    }
    @Override
    public List<SpecializedInformation> getEducationList(){
        return profileModel.getEducation();
    }
    @Override
    public List<SpecializedInformation> getActivityList(){
        return profileModel.getActivities();
    }



    public void setExperienceList(List<SpecializedInformation> list){
        profileModel.setExperiences(list);
        subject.onNext(profileModel);
    }
    public void setEducationList(List<SpecializedInformation> list){
        profileModel.setEducation(list);
        subject.onNext(profileModel);
    }
    public void setActivityList(List<SpecializedInformation> list){
        profileModel.setActivities(list);
        subject.onNext(profileModel);
    }

    public void addExperience(SpecializedInformation specializedInformations) {
        List<SpecializedInformation> list = getExperienceList();
        list.add(specializedInformations);
        setExperienceList(list);
    }

    public void addEducation(SpecializedInformation specializedInformations) {
        List<SpecializedInformation> list = getEducationList();
        list.add(specializedInformations);
        setEducationList(list);
    }

    public void addActivity(SpecializedInformation specializedInformations) {
        List<SpecializedInformation> list = getActivityList();
        list.add(specializedInformations);
        setActivityList(list);
    }
    @Override
    public void saveProfile(){
        SharePreferencesHelper.saveProfile(profileModel);
    }

    @BindingAdapter({"android:src"})
    public static void setImage(ShapeableImageView view, Drawable drawable){

        if(drawable!=null){
            view.setImageDrawable(drawable);
        }
    }


    @Override
    public void setDrawable(Drawable drawable) {
        mutableDrawable.setValue(drawable);
        notifyPropertyChanged(BR.drawable);
    }

    @Bindable
    @Override
    public Drawable getDrawable() {
        return mutableDrawable.getValue();
    }


}
