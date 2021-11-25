// Generated by data binding compiler. Do not edit!
package itcv.vn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import itcv.vn.R;
import itcv.vn.dialogfragment.DialogHandlers;
import itcv.vn.dialogfragment.specinfo.SpecInfoDialogViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogSpecinfoBinding extends ViewDataBinding {
  @Bindable
  protected SpecInfoDialogViewModel mSpecInfoViewModel;

  @Bindable
  protected DialogHandlers mHandlers;

  protected DialogSpecinfoBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setSpecInfoViewModel(@Nullable SpecInfoDialogViewModel specInfoViewModel);

  @Nullable
  public SpecInfoDialogViewModel getSpecInfoViewModel() {
    return mSpecInfoViewModel;
  }

  public abstract void setHandlers(@Nullable DialogHandlers handlers);

  @Nullable
  public DialogHandlers getHandlers() {
    return mHandlers;
  }

  @NonNull
  public static DialogSpecinfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_specinfo, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogSpecinfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogSpecinfoBinding>inflateInternal(inflater, R.layout.dialog_specinfo, root, attachToRoot, component);
  }

  @NonNull
  public static DialogSpecinfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_specinfo, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogSpecinfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogSpecinfoBinding>inflateInternal(inflater, R.layout.dialog_specinfo, null, false, component);
  }

  public static DialogSpecinfoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static DialogSpecinfoBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogSpecinfoBinding)bind(component, view, R.layout.dialog_specinfo);
  }
}
