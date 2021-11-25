package itcv.vn;

import androidx.databinding.BaseObservable;
import androidx.lifecycle.MutableLiveData;

public class GeneralInformationViewModel extends BaseObservable {
    private MutableLiveData<GeneralInformation> generalInformation;

    public GeneralInformation getInfo(){
        return generalInformation.getValue();
    }
    public String getTitle(){
        return getInfo().getTitle();
    }
    public String getDescription(){
        return getInfo().getDescription();
    }
    public void setTitle(String title){
        if(getTitle()!=title) getInfo().setTitle(title);

    }

}
