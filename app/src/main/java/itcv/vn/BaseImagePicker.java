package itcv.vn;

import android.content.Context;
import android.database.Observable;

import com.qingmei2.rximagepicker.entity.Result;
import com.qingmei2.rximagepicker.entity.sources.Gallery;

public interface BaseImagePicker {
    @Gallery
    Observable<Result> openGallery(Context context);
}
