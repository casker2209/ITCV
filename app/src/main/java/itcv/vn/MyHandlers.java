package itcv.vn;

import android.view.View;
import android.widget.Button;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public interface MyHandlers {
    void onCompleteClick(View view);
    void onGenInfoButtonClick(View view);
    void onSpecInfoButtonClick(View view);
    void onImageClick(View view);
}
