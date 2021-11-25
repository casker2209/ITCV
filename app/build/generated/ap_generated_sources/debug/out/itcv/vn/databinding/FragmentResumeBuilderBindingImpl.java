package itcv.vn.databinding;
import itcv.vn.R;
import itcv.vn.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentResumeBuilderBindingImpl extends FragmentResumeBuilderBinding implements itcv.vn.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.listskill, 16);
        sViewsWithIds.put(R.id.listachievement, 17);
        sViewsWithIds.put(R.id.listhobby, 18);
        sViewsWithIds.put(R.id.listeducation, 19);
        sViewsWithIds.put(R.id.listexperience, 20);
        sViewsWithIds.put(R.id.listactivity, 21);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.widget.Button mboundView15;
    @NonNull
    private final android.widget.EditText mboundView2;
    @NonNull
    private final android.widget.EditText mboundView3;
    @NonNull
    private final android.widget.EditText mboundView4;
    @NonNull
    private final android.widget.EditText mboundView5;
    @NonNull
    private final android.widget.EditText mboundView6;
    @NonNull
    private final android.widget.EditText mboundView7;
    @NonNull
    private final android.widget.EditText mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profileViewModel.name
            //         is profileViewModel.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // profileViewModel.name
            java.lang.String profileViewModelName = null;
            // profileViewModel
            itcv.vn.ProfileViewModel profileViewModel = mProfileViewModel;
            // profileViewModel != null
            boolean profileViewModelJavaLangObjectNull = false;



            profileViewModelJavaLangObjectNull = (profileViewModel) != (null);
            if (profileViewModelJavaLangObjectNull) {




                profileViewModel.setName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profileViewModel.position
            //         is profileViewModel.setPosition((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // profileViewModel.position
            java.lang.String profileViewModelPosition = null;
            // profileViewModel
            itcv.vn.ProfileViewModel profileViewModel = mProfileViewModel;
            // profileViewModel != null
            boolean profileViewModelJavaLangObjectNull = false;



            profileViewModelJavaLangObjectNull = (profileViewModel) != (null);
            if (profileViewModelJavaLangObjectNull) {




                profileViewModel.setPosition(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profileViewModel.address
            //         is profileViewModel.setAddress((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // profileViewModel
            itcv.vn.ProfileViewModel profileViewModel = mProfileViewModel;
            // profileViewModel.address
            java.lang.String profileViewModelAddress = null;
            // profileViewModel != null
            boolean profileViewModelJavaLangObjectNull = false;



            profileViewModelJavaLangObjectNull = (profileViewModel) != (null);
            if (profileViewModelJavaLangObjectNull) {




                profileViewModel.setAddress(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profileViewModel.email
            //         is profileViewModel.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // profileViewModel
            itcv.vn.ProfileViewModel profileViewModel = mProfileViewModel;
            // profileViewModel != null
            boolean profileViewModelJavaLangObjectNull = false;
            // profileViewModel.email
            java.lang.String profileViewModelEmail = null;



            profileViewModelJavaLangObjectNull = (profileViewModel) != (null);
            if (profileViewModelJavaLangObjectNull) {




                profileViewModel.setEmail(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profileViewModel.phone
            //         is profileViewModel.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // profileViewModel.phone
            java.lang.String profileViewModelPhone = null;
            // profileViewModel
            itcv.vn.ProfileViewModel profileViewModel = mProfileViewModel;
            // profileViewModel != null
            boolean profileViewModelJavaLangObjectNull = false;



            profileViewModelJavaLangObjectNull = (profileViewModel) != (null);
            if (profileViewModelJavaLangObjectNull) {




                profileViewModel.setPhone(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView7androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profileViewModel.date
            //         is profileViewModel.setDate((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView7);
            // localize variables for thread safety
            // profileViewModel
            itcv.vn.ProfileViewModel profileViewModel = mProfileViewModel;
            // profileViewModel != null
            boolean profileViewModelJavaLangObjectNull = false;
            // profileViewModel.date
            java.lang.String profileViewModelDate = null;



            profileViewModelJavaLangObjectNull = (profileViewModel) != (null);
            if (profileViewModelJavaLangObjectNull) {




                profileViewModel.setDate(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profileViewModel.description
            //         is profileViewModel.setDescription((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
            // localize variables for thread safety
            // profileViewModel.description
            java.lang.String profileViewModelDescription = null;
            // profileViewModel
            itcv.vn.ProfileViewModel profileViewModel = mProfileViewModel;
            // profileViewModel != null
            boolean profileViewModelJavaLangObjectNull = false;



            profileViewModelJavaLangObjectNull = (profileViewModel) != (null);
            if (profileViewModelJavaLangObjectNull) {




                profileViewModel.setDescription(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentResumeBuilderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private FragmentResumeBuilderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[10]
            , (android.widget.ImageButton) bindings[14]
            , (android.widget.ImageButton) bindings[12]
            , (android.widget.ImageButton) bindings[13]
            , (android.widget.ImageButton) bindings[11]
            , (android.widget.ImageButton) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[17]
            , (androidx.recyclerview.widget.RecyclerView) bindings[21]
            , (androidx.recyclerview.widget.RecyclerView) bindings[19]
            , (androidx.recyclerview.widget.RecyclerView) bindings[20]
            , (androidx.recyclerview.widget.RecyclerView) bindings[18]
            , (androidx.recyclerview.widget.RecyclerView) bindings[16]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            );
        this.addAchievement.setTag(null);
        this.addActivity.setTag(null);
        this.addEducation.setTag(null);
        this.addExperience.setTag(null);
        this.addHobby.setTag(null);
        this.addSkill.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView15 = (android.widget.Button) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.EditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.EditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.EditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.EditText) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.EditText) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.EditText) bindings[8];
        this.mboundView8.setTag(null);
        this.profilepicture.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new itcv.vn.generated.callback.OnClickListener(this, 8);
        mCallback6 = new itcv.vn.generated.callback.OnClickListener(this, 6);
        mCallback4 = new itcv.vn.generated.callback.OnClickListener(this, 4);
        mCallback2 = new itcv.vn.generated.callback.OnClickListener(this, 2);
        mCallback7 = new itcv.vn.generated.callback.OnClickListener(this, 7);
        mCallback5 = new itcv.vn.generated.callback.OnClickListener(this, 5);
        mCallback3 = new itcv.vn.generated.callback.OnClickListener(this, 3);
        mCallback1 = new itcv.vn.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.profileViewModel == variableId) {
            setProfileViewModel((itcv.vn.ProfileViewModel) variable);
        }
        else if (BR.handlers == variableId) {
            setHandlers((itcv.vn.MyHandlers) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProfileViewModel(@Nullable itcv.vn.ProfileViewModel ProfileViewModel) {
        this.mProfileViewModel = ProfileViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.profileViewModel);
        super.requestRebind();
    }
    public void setHandlers(@Nullable itcv.vn.MyHandlers Handlers) {
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
        java.lang.String profileViewModelPosition = null;
        java.lang.String profileViewModelName = null;
        itcv.vn.ProfileViewModel profileViewModel = mProfileViewModel;
        java.lang.String profileViewModelPhone = null;
        android.graphics.drawable.Drawable profileViewModelDrawable = null;
        java.lang.String profileViewModelAddress = null;
        java.lang.String profileViewModelDate = null;
        java.lang.String profileViewModelDescription = null;
        itcv.vn.MyHandlers handlers = mHandlers;
        java.lang.String profileViewModelEmail = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (profileViewModel != null) {
                    // read profileViewModel.position
                    profileViewModelPosition = profileViewModel.getPosition();
                    // read profileViewModel.name
                    profileViewModelName = profileViewModel.getName();
                    // read profileViewModel.phone
                    profileViewModelPhone = profileViewModel.getPhone();
                    // read profileViewModel.drawable
                    profileViewModelDrawable = profileViewModel.getDrawable();
                    // read profileViewModel.address
                    profileViewModelAddress = profileViewModel.getAddress();
                    // read profileViewModel.date
                    profileViewModelDate = profileViewModel.getDate();
                    // read profileViewModel.description
                    profileViewModelDescription = profileViewModel.getDescription();
                    // read profileViewModel.email
                    profileViewModelEmail = profileViewModel.getEmail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.addAchievement.setOnClickListener(mCallback3);
            this.addActivity.setOnClickListener(mCallback7);
            this.addEducation.setOnClickListener(mCallback5);
            this.addExperience.setOnClickListener(mCallback6);
            this.addHobby.setOnClickListener(mCallback4);
            this.addSkill.setOnClickListener(mCallback2);
            this.mboundView15.setOnClickListener(mCallback8);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView7, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView7androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
            this.profilepicture.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, profileViewModelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, profileViewModelPosition);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, profileViewModelAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, profileViewModelEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, profileViewModelPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, profileViewModelDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, profileViewModelDescription);
            itcv.vn.ProfileViewModelImpl.setImage(this.profilepicture, profileViewModelDrawable);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 8: {
                // localize variables for thread safety
                // handlers
                itcv.vn.MyHandlers handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onCompleteClick(callbackArg_0);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // handlers
                itcv.vn.MyHandlers handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onSpecInfoButtonClick(callbackArg_0);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handlers
                itcv.vn.MyHandlers handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onGenInfoButtonClick(callbackArg_0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handlers
                itcv.vn.MyHandlers handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onGenInfoButtonClick(callbackArg_0);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // handlers
                itcv.vn.MyHandlers handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onSpecInfoButtonClick(callbackArg_0);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // handlers
                itcv.vn.MyHandlers handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onSpecInfoButtonClick(callbackArg_0);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handlers
                itcv.vn.MyHandlers handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onGenInfoButtonClick(callbackArg_0);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handlers
                itcv.vn.MyHandlers handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onImageClick(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): profileViewModel
        flag 1 (0x2L): handlers
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}