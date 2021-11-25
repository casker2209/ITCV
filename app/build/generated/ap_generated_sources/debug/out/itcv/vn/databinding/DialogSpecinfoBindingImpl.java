package itcv.vn.databinding;
import itcv.vn.R;
import itcv.vn.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogSpecinfoBindingImpl extends DialogSpecinfoBinding implements itcv.vn.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final android.widget.EditText mboundView2;
    @NonNull
    private final android.widget.EditText mboundView3;
    @NonNull
    private final android.widget.EditText mboundView4;
    @NonNull
    private final android.widget.EditText mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of specInfoViewModel.title
            //         is specInfoViewModel.setTitle((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // specInfoViewModel != null
            boolean specInfoViewModelJavaLangObjectNull = false;
            // specInfoViewModel
            itcv.vn.dialogfragment.specinfo.SpecInfoDialogViewModel specInfoViewModel = mSpecInfoViewModel;
            // specInfoViewModel.title
            java.lang.String specInfoViewModelTitle = null;



            specInfoViewModelJavaLangObjectNull = (specInfoViewModel) != (null);
            if (specInfoViewModelJavaLangObjectNull) {




                specInfoViewModel.setTitle(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of specInfoViewModel.location
            //         is specInfoViewModel.setLocation((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // specInfoViewModel != null
            boolean specInfoViewModelJavaLangObjectNull = false;
            // specInfoViewModel
            itcv.vn.dialogfragment.specinfo.SpecInfoDialogViewModel specInfoViewModel = mSpecInfoViewModel;
            // specInfoViewModel.location
            java.lang.String specInfoViewModelLocation = null;



            specInfoViewModelJavaLangObjectNull = (specInfoViewModel) != (null);
            if (specInfoViewModelJavaLangObjectNull) {




                specInfoViewModel.setLocation(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of specInfoViewModel.durationStart
            //         is specInfoViewModel.setDurationStart((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // specInfoViewModel.durationStart
            java.lang.String specInfoViewModelDurationStart = null;
            // specInfoViewModel != null
            boolean specInfoViewModelJavaLangObjectNull = false;
            // specInfoViewModel
            itcv.vn.dialogfragment.specinfo.SpecInfoDialogViewModel specInfoViewModel = mSpecInfoViewModel;



            specInfoViewModelJavaLangObjectNull = (specInfoViewModel) != (null);
            if (specInfoViewModelJavaLangObjectNull) {




                specInfoViewModel.setDurationStart(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of specInfoViewModel.durationEnd
            //         is specInfoViewModel.setDurationEnd((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // specInfoViewModel != null
            boolean specInfoViewModelJavaLangObjectNull = false;
            // specInfoViewModel
            itcv.vn.dialogfragment.specinfo.SpecInfoDialogViewModel specInfoViewModel = mSpecInfoViewModel;
            // specInfoViewModel.durationEnd
            java.lang.String specInfoViewModelDurationEnd = null;



            specInfoViewModelJavaLangObjectNull = (specInfoViewModel) != (null);
            if (specInfoViewModelJavaLangObjectNull) {




                specInfoViewModel.setDurationEnd(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of specInfoViewModel.description
            //         is specInfoViewModel.setDescription((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // specInfoViewModel != null
            boolean specInfoViewModelJavaLangObjectNull = false;
            // specInfoViewModel
            itcv.vn.dialogfragment.specinfo.SpecInfoDialogViewModel specInfoViewModel = mSpecInfoViewModel;
            // specInfoViewModel.description
            java.lang.String specInfoViewModelDescription = null;



            specInfoViewModelJavaLangObjectNull = (specInfoViewModel) != (null);
            if (specInfoViewModelJavaLangObjectNull) {




                specInfoViewModel.setDescription(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public DialogSpecinfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private DialogSpecinfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.EditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.EditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.EditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new itcv.vn.generated.callback.OnClickListener(this, 2);
        mCallback9 = new itcv.vn.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.specInfoViewModel == variableId) {
            setSpecInfoViewModel((itcv.vn.dialogfragment.specinfo.SpecInfoDialogViewModel) variable);
        }
        else if (BR.handlers == variableId) {
            setHandlers((itcv.vn.dialogfragment.DialogHandlers) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSpecInfoViewModel(@Nullable itcv.vn.dialogfragment.specinfo.SpecInfoDialogViewModel SpecInfoViewModel) {
        updateRegistration(0, SpecInfoViewModel);
        this.mSpecInfoViewModel = SpecInfoViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.specInfoViewModel);
        super.requestRebind();
    }
    public void setHandlers(@Nullable itcv.vn.dialogfragment.DialogHandlers Handlers) {
        this.mHandlers = Handlers;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.handlers);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSpecInfoViewModel((itcv.vn.dialogfragment.specinfo.SpecInfoDialogViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSpecInfoViewModel(itcv.vn.dialogfragment.specinfo.SpecInfoDialogViewModel SpecInfoViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.title) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.location) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.durationStart) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.durationEnd) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.description) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        itcv.vn.dialogfragment.specinfo.SpecInfoDialogViewModel specInfoViewModel = mSpecInfoViewModel;
        java.lang.String specInfoViewModelDescription = null;
        boolean textUtilsIsEmptySpecInfoViewModelTitleBooleanTrueTextUtilsIsEmptySpecInfoViewModelDescription = false;
        java.lang.String specInfoViewModelDurationEnd = null;
        java.lang.String specInfoViewModelDurationStart = null;
        boolean TextUtilsIsEmptySpecInfoViewModelTitleBooleanTrueTextUtilsIsEmptySpecInfoViewModelDescription1 = false;
        java.lang.String specInfoViewModelLocation = null;
        boolean textUtilsIsEmptySpecInfoViewModelDescription = false;
        boolean textUtilsIsEmptySpecInfoViewModelTitle = false;
        itcv.vn.dialogfragment.DialogHandlers handlers = mHandlers;
        java.lang.String specInfoViewModelTitle = null;

        if ((dirtyFlags & 0xfdL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (specInfoViewModel != null) {
                        // read specInfoViewModel.description
                        specInfoViewModelDescription = specInfoViewModel.getDescription();
                    }
            }
            if ((dirtyFlags & 0xa1L) != 0) {

                    if (specInfoViewModel != null) {
                        // read specInfoViewModel.durationEnd
                        specInfoViewModelDurationEnd = specInfoViewModel.getDurationEnd();
                    }
            }
            if ((dirtyFlags & 0x91L) != 0) {

                    if (specInfoViewModel != null) {
                        // read specInfoViewModel.durationStart
                        specInfoViewModelDurationStart = specInfoViewModel.getDurationStart();
                    }
            }
            if ((dirtyFlags & 0x89L) != 0) {

                    if (specInfoViewModel != null) {
                        // read specInfoViewModel.location
                        specInfoViewModelLocation = specInfoViewModel.getLocation();
                    }
            }
            if ((dirtyFlags & 0xc5L) != 0) {

                    if (specInfoViewModel != null) {
                        // read specInfoViewModel.title
                        specInfoViewModelTitle = specInfoViewModel.getTitle();
                    }


                    // read TextUtils.isEmpty(specInfoViewModel.title)
                    textUtilsIsEmptySpecInfoViewModelTitle = android.text.TextUtils.isEmpty(specInfoViewModelTitle);
                if((dirtyFlags & 0xc5L) != 0) {
                    if(textUtilsIsEmptySpecInfoViewModelTitle) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100L) != 0) {

                if (specInfoViewModel != null) {
                    // read specInfoViewModel.description
                    specInfoViewModelDescription = specInfoViewModel.getDescription();
                }


                // read TextUtils.isEmpty(specInfoViewModel.description)
                textUtilsIsEmptySpecInfoViewModelDescription = android.text.TextUtils.isEmpty(specInfoViewModelDescription);
        }

        if ((dirtyFlags & 0xc5L) != 0) {

                // read TextUtils.isEmpty(specInfoViewModel.title) ? true : TextUtils.isEmpty(specInfoViewModel.description)
                textUtilsIsEmptySpecInfoViewModelTitleBooleanTrueTextUtilsIsEmptySpecInfoViewModelDescription = ((textUtilsIsEmptySpecInfoViewModelTitle) ? (true) : (textUtilsIsEmptySpecInfoViewModelDescription));


                // read !TextUtils.isEmpty(specInfoViewModel.title) ? true : TextUtils.isEmpty(specInfoViewModel.description)
                TextUtilsIsEmptySpecInfoViewModelTitleBooleanTrueTextUtilsIsEmptySpecInfoViewModelDescription1 = !textUtilsIsEmptySpecInfoViewModelTitleBooleanTrueTextUtilsIsEmptySpecInfoViewModelDescription;
        }
        // batch finished
        if ((dirtyFlags & 0x85L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, specInfoViewModelTitle);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            this.mboundView6.setOnClickListener(mCallback9);
            this.mboundView7.setOnClickListener(mCallback10);
        }
        if ((dirtyFlags & 0x89L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, specInfoViewModelLocation);
        }
        if ((dirtyFlags & 0x91L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, specInfoViewModelDurationStart);
        }
        if ((dirtyFlags & 0xa1L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, specInfoViewModelDurationEnd);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, specInfoViewModelDescription);
        }
        if ((dirtyFlags & 0xc5L) != 0) {
            // api target 1

            this.mboundView7.setEnabled(TextUtilsIsEmptySpecInfoViewModelTitleBooleanTrueTextUtilsIsEmptySpecInfoViewModelDescription1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // handlers
                itcv.vn.dialogfragment.DialogHandlers handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onCompleteClick(callbackArg_0);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handlers
                itcv.vn.dialogfragment.DialogHandlers handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onCancelClick(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): specInfoViewModel
        flag 1 (0x2L): handlers
        flag 2 (0x3L): specInfoViewModel.title
        flag 3 (0x4L): specInfoViewModel.location
        flag 4 (0x5L): specInfoViewModel.durationStart
        flag 5 (0x6L): specInfoViewModel.durationEnd
        flag 6 (0x7L): specInfoViewModel.description
        flag 7 (0x8L): null
        flag 8 (0x9L): TextUtils.isEmpty(specInfoViewModel.title) ? true : TextUtils.isEmpty(specInfoViewModel.description)
        flag 9 (0xaL): TextUtils.isEmpty(specInfoViewModel.title) ? true : TextUtils.isEmpty(specInfoViewModel.description)
    flag mapping end*/
    //end
}