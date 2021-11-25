package itcv.vn.dialogfragment.specinfo;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import itcv.vn.BR;
import itcv.vn.SpecializedInformation;

public class SpecInfoDialogViewModel extends BaseObservable {
    private MutableLiveData<SpecializedInformation> specInfo;
    public SpecInfoDialogViewModel(){
        specInfo = new MutableLiveData<>();
        specInfo.setValue(new SpecializedInformation("","","","",""));
    }

    public MutableLiveData<SpecializedInformation> getSpecInfo() {
        return specInfo;
    }

    @Bindable
    public String getTitle(){
        return getSpecInfo().getValue().getTitle();
    }
    @Bindable
    public String getDescription(){
        return getSpecInfo().getValue().getDescription();
    }
    @Bindable
    public String getDurationStart(){
        return getSpecInfo().getValue().getDurationStart();
    }
    @Bindable
    public String getDurationEnd(){
        return getSpecInfo().getValue().getDurationEnd();
    }
    @Bindable
    public String getLocation(){
        return getSpecInfo().getValue().getLocation();
    }

    public void setDurationStart(String durationStart){
        if(getDurationStart()!=durationStart) getSpecInfo().getValue().setDurationStart(durationStart);
        notifyPropertyChanged(BR.durationStart);
    }

    public void setDescription(String description){
        if(getDescription()!=description) getSpecInfo().getValue().setDescription(description);
        notifyPropertyChanged(BR.description);
    }

    public void setDurationEnd(String durationEnd){
        if(getDurationEnd()!=durationEnd) getSpecInfo().getValue().setDurationEnd(durationEnd);
        notifyPropertyChanged(BR.durationEnd);
    }

    public void setTitle(String title){
        if(getTitle()!=title) getSpecInfo().getValue().setTitle(title);
        notifyPropertyChanged(BR.title);
    }

    public void setLocation(String location){
        if(getLocation()!=location) getSpecInfo().getValue().setLocation(location);
        notifyPropertyChanged(BR.location);
    }

    public void setSpecInfo(MutableLiveData<SpecializedInformation> specInfo) {
        this.specInfo = specInfo;
    }
}
