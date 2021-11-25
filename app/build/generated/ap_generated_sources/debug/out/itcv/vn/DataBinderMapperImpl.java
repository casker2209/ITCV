package itcv.vn;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import itcv.vn.databinding.ActivityMainBindingImpl;
import itcv.vn.databinding.DialogGeninfoBindingImpl;
import itcv.vn.databinding.DialogSpecinfoBindingImpl;
import itcv.vn.databinding.FragmentResumeBuilderBindingImpl;
import itcv.vn.databinding.ItemGeninfoBindingImpl;
import itcv.vn.databinding.ItemSpecinfoBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_DIALOGGENINFO = 2;

  private static final int LAYOUT_DIALOGSPECINFO = 3;

  private static final int LAYOUT_FRAGMENTRESUMEBUILDER = 4;

  private static final int LAYOUT_ITEMGENINFO = 5;

  private static final int LAYOUT_ITEMSPECINFO = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(itcv.vn.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(itcv.vn.R.layout.dialog_geninfo, LAYOUT_DIALOGGENINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(itcv.vn.R.layout.dialog_specinfo, LAYOUT_DIALOGSPECINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(itcv.vn.R.layout.fragment_resume_builder, LAYOUT_FRAGMENTRESUMEBUILDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(itcv.vn.R.layout.item_geninfo, LAYOUT_ITEMGENINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(itcv.vn.R.layout.item_specinfo, LAYOUT_ITEMSPECINFO);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGGENINFO: {
          if ("layout/dialog_geninfo_0".equals(tag)) {
            return new DialogGeninfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_geninfo is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGSPECINFO: {
          if ("layout/dialog_specinfo_0".equals(tag)) {
            return new DialogSpecinfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_specinfo is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTRESUMEBUILDER: {
          if ("layout/fragment_resume_builder_0".equals(tag)) {
            return new FragmentResumeBuilderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_resume_builder is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMGENINFO: {
          if ("layout/item_geninfo_0".equals(tag)) {
            return new ItemGeninfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_geninfo is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSPECINFO: {
          if ("layout/item_specinfo_0".equals(tag)) {
            return new ItemSpecinfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_specinfo is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(23);

    static {
      sKeys.put(1, "GenInfo");
      sKeys.put(2, "SpecInfo");
      sKeys.put(0, "_all");
      sKeys.put(3, "achievementList");
      sKeys.put(4, "address");
      sKeys.put(5, "date");
      sKeys.put(6, "description");
      sKeys.put(7, "drawable");
      sKeys.put(8, "durationEnd");
      sKeys.put(9, "durationStart");
      sKeys.put(10, "email");
      sKeys.put(11, "genInfoViewModel");
      sKeys.put(12, "handlers");
      sKeys.put(13, "hobbyList");
      sKeys.put(14, "location");
      sKeys.put(15, "name");
      sKeys.put(16, "phone");
      sKeys.put(17, "position");
      sKeys.put(18, "profileModel");
      sKeys.put(19, "profileViewModel");
      sKeys.put(20, "skillList");
      sKeys.put(21, "specInfoViewModel");
      sKeys.put(22, "title");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_main_0", itcv.vn.R.layout.activity_main);
      sKeys.put("layout/dialog_geninfo_0", itcv.vn.R.layout.dialog_geninfo);
      sKeys.put("layout/dialog_specinfo_0", itcv.vn.R.layout.dialog_specinfo);
      sKeys.put("layout/fragment_resume_builder_0", itcv.vn.R.layout.fragment_resume_builder);
      sKeys.put("layout/item_geninfo_0", itcv.vn.R.layout.item_geninfo);
      sKeys.put("layout/item_specinfo_0", itcv.vn.R.layout.item_specinfo);
    }
  }
}
