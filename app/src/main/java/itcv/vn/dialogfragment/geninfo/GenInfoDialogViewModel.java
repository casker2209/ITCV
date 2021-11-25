package itcv.vn.dialogfragment.geninfo;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.InverseMethod;
import androidx.lifecycle.MutableLiveData;

import itcv.vn.BR;
import itcv.vn.GeneralInformation;

public class GenInfoDialogViewModel extends BaseObservable {
    private MutableLiveData<GeneralInformation> genInfo;
    public GenInfoDialogViewModel(){
        genInfo = new MutableLiveData<>();
        genInfo.setValue(new GeneralInformation("",""));
    }

    public MutableLiveData<GeneralInformation> getGenInfo() {
        return genInfo;
    }

    @Bindable
    public String getTitle(){
        return getGenInfo().getValue().getTitle();
    }
    @Bindable
    public String getDescription(){
        return getGenInfo().getValue().getDescription();
    }


    public void setTitle(String title){
        if(getTitle()!=title) getGenInfo().getValue().setTitle(title);
        notifyPropertyChanged(BR.title);
    }
    public void setDescription(String description){
        if(getDescription()!=description) getGenInfo().getValue().setDescription(description);
        notifyPropertyChanged(BR.description);
    }


}
