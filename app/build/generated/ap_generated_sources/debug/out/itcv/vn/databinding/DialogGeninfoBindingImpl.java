package itcv.vn.databinding;
import itcv.vn.R;
import itcv.vn.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogGeninfoBindingImpl extends DialogGeninfoBinding implements itcv.vn.generated.callback.OnClickListener.Listener {

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
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of genInfoViewModel.title
            //         is genInfoViewModel.setTitle((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // genInfoViewModel.title
            java.lang.String genInfoViewModelTitle = null;
            // genInfoViewModel
            itcv.vn.dialogfragment.geninfo.GenInfoDialogViewModel genInfoViewModel = mGenInfoViewModel;
            // genInfoViewModel != null
            boolean genInfoViewModelJavaLangObjectNull = false;



            genInfoViewModelJavaLangObjectNull = (genInfoViewModel) != (null);
            if (genInfoViewModelJavaLangObjectNull) {




                genInfoViewModel.setTitle(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of genInfoViewModel.description
            //         is genInfoViewModel.setDescription((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // genInfoViewModel.description
            java.lang.String genInfoViewModelDescription = null;
            // genInfoViewModel
            itcv.vn.dialogfragment.geninfo.GenInfoDialogViewModel genInfoViewModel = mGenInfoViewModel;
            // genInfoViewModel != null
            boolean genInfoViewModelJavaLangObjectNull = false;



            genInfoViewModelJavaLangObjectNull = (genInfoViewModel) != (null);
            if (genInfoViewModelJavaLangObjectNull) {




                genInfoViewModel.setDescription(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public DialogGeninfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private DialogGeninfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        mCallback12 = new itcv.vn.generated.callback.OnClickListener(this, 2);
        mCallback11 = new itcv.vn.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.handlers == variableId) {
            setHandlers((itcv.vn.dialogfragment.DialogHandlers) variable);
        }
        else if (BR.genInfoViewModel == variableId) {
            setGenInfoViewModel((itcv.vn.dialogfragment.geninfo.GenInfoDialogViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandlers(@Nullable itcv.vn.dialogfragment.DialogHandlers Handlers) {
        this.mHandlers = Handlers;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.handlers);
        super.requestRebind();
    }
    public void setGenInfoViewModel(@Nullable itcv.vn.dialogfragment.geninfo.GenInfoDialogViewModel GenInfoViewModel) {
        updateRegistration(0, GenInfoViewModel);
        this.mGenInfoViewModel = GenInfoViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.genInfoViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeGenInfoViewModel((itcv.vn.dialogfragment.geninfo.GenInfoDialogViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeGenInfoViewModel(itcv.vn.dialogfragment.geninfo.GenInfoDialogViewModel GenInfoViewModel, int fieldId) {
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
        else if (fieldId == BR.description) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.String genInfoViewModelTitle = null;
        boolean textUtilsIsEmptyGenInfoViewModelTitle = false;
        boolean textUtilsIsEmptyGenInfoViewModelDescription = false;
        java.lang.String genInfoViewModelDescription = null;
        itcv.vn.dialogfragment.DialogHandlers handlers = mHandlers;
        itcv.vn.dialogfragment.geninfo.GenInfoDialogViewModel genInfoViewModel = mGenInfoViewModel;
        boolean textUtilsIsEmptyGenInfoViewModelTitleBooleanTrueTextUtilsIsEmptyGenInfoViewModelDescription = false;
        boolean TextUtilsIsEmptyGenInfoViewModelTitleBooleanTrueTextUtilsIsEmptyGenInfoViewModelDescription1 = false;

        if ((dirtyFlags & 0x1dL) != 0) {



                if (genInfoViewModel != null) {
                    // read genInfoViewModel.title
                    genInfoViewModelTitle = genInfoViewModel.getTitle();
                }


                // read TextUtils.isEmpty(genInfoViewModel.title)
                textUtilsIsEmptyGenInfoViewModelTitle = android.text.TextUtils.isEmpty(genInfoViewModelTitle);
            if((dirtyFlags & 0x1dL) != 0) {
                if(textUtilsIsEmptyGenInfoViewModelTitle) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (genInfoViewModel != null) {
                        // read genInfoViewModel.description
                        genInfoViewModelDescription = genInfoViewModel.getDescription();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20L) != 0) {

                if (genInfoViewModel != null) {
                    // read genInfoViewModel.description
                    genInfoViewModelDescription = genInfoViewModel.getDescription();
                }


                // read TextUtils.isEmpty(genInfoViewModel.description)
                textUtilsIsEmptyGenInfoViewModelDescription = android.text.TextUtils.isEmpty(genInfoViewModelDescription);
        }

        if ((dirtyFlags & 0x1dL) != 0) {

                // read TextUtils.isEmpty(genInfoViewModel.title) ? true : TextUtils.isEmpty(genInfoViewModel.description)
                textUtilsIsEmptyGenInfoViewModelTitleBooleanTrueTextUtilsIsEmptyGenInfoViewModelDescription = ((textUtilsIsEmptyGenInfoViewModelTitle) ? (true) : (textUtilsIsEmptyGenInfoViewModelDescription));


                // read !TextUtils.isEmpty(genInfoViewModel.title) ? true : TextUtils.isEmpty(genInfoViewModel.description)
                TextUtilsIsEmptyGenInfoViewModelTitleBooleanTrueTextUtilsIsEmptyGenInfoViewModelDescription1 = !textUtilsIsEmptyGenInfoViewModelTitleBooleanTrueTextUtilsIsEmptyGenInfoViewModelDescription;
        }
        // batch finished
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, genInfoViewModelTitle);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            this.mboundView3.setOnClickListener(mCallback11);
            this.mboundView4.setOnClickListener(mCallback12);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, genInfoViewModelDescription);
        }
        if ((dirtyFlags & 0x1dL) != 0) {
            // api target 1

            this.mboundView4.setEnabled(TextUtilsIsEmptyGenInfoViewModelTitleBooleanTrueTextUtilsIsEmptyGenInfoViewModelDescription1);
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
        flag 0 (0x1L): genInfoViewModel
        flag 1 (0x2L): handlers
        flag 2 (0x3L): genInfoViewModel.title
        flag 3 (0x4L): genInfoViewModel.description
        flag 4 (0x5L): null
        flag 5 (0x6L): TextUtils.isEmpty(genInfoViewModel.title) ? true : TextUtils.isEmpty(genInfoViewModel.description)
        flag 6 (0x7L): TextUtils.isEmpty(genInfoViewModel.title) ? true : TextUtils.isEmpty(genInfoViewModel.description)
    flag mapping end*/
    //end
}