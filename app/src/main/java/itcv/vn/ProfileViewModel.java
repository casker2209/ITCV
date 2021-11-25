package itcv.vn;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;

public interface ProfileViewModel {

    String getName();

    String getPosition();

    String getDate();

    String getPhone();

    String getEmail();

    String getAddress();

    void setName(String name);

    void setAddress(String address);

    void setDate(String date);

    void setEmail(String email);

    void setModel(MutableLiveData<ProfileModel> model);

    void setPhone(String phone);

    void setPosition(String position);

    MutableLiveData<ProfileModel> getModel();

    String getDescription();

    void setDescription(String description);


    List<GeneralInformation> getSkillList();

    void setSkillList(List<GeneralInformation> skillList);


    List<GeneralInformation> getAchievementList();

    List<GeneralInformation> getHobbyList();

    Observable<ProfileModel> getObservable();
    ProfileModel getProfileModel();

    void setProfileModel(ProfileModel profileModel);

    void addSkill(GeneralInformation generalInformation);

    void addHobby(GeneralInformation generalInformation);

    void addAchievement(GeneralInformation generalInformation);

    void addEducation(SpecializedInformation specializedInformation);

    void saveProfile();

    void addExperience(SpecializedInformation specializedInformation);

    void addActivity(SpecializedInformation specializedInformation);

    List<SpecializedInformation> getExperienceList();

    List<SpecializedInformation> getEducationList();

    List<SpecializedInformation> getActivityList();

    void setDrawable(Drawable drawable);

    Drawable getDrawable();
}
