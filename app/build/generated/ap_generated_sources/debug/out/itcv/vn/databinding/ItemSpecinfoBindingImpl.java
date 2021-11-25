package itcv.vn.databinding;
import itcv.vn.R;
import itcv.vn.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSpecinfoBindingImpl extends ItemSpecinfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.remove, 5);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSpecinfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemSpecinfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[5]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.SpecInfo == variableId) {
            setSpecInfo((itcv.vn.SpecializedInformation) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSpecInfo(@Nullable itcv.vn.SpecializedInformation SpecInfo) {
        this.mSpecInfo = SpecInfo;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.SpecInfo);
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
        java.lang.String specInfoDurationStart = null;
        java.lang.String specInfoTitle = null;
        java.lang.String specInfoDescription = null;
        itcv.vn.SpecializedInformation specInfo = mSpecInfo;
        java.lang.String specInfoDurationStartChar = null;
        java.lang.String specInfoDurationEnd = null;
        java.lang.String specInfoLocation = null;
        java.lang.String specInfoDurationStartCharSpecInfoDurationEnd = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (specInfo != null) {
                    // read SpecInfo.durationStart
                    specInfoDurationStart = specInfo.getDurationStart();
                    // read SpecInfo.title
                    specInfoTitle = specInfo.getTitle();
                    // read SpecInfo.description
                    specInfoDescription = specInfo.getDescription();
                    // read SpecInfo.durationEnd
                    specInfoDurationEnd = specInfo.getDurationEnd();
                    // read SpecInfo.location
                    specInfoLocation = specInfo.getLocation();
                }


                // read (SpecInfo.durationStart) + ('-')
                specInfoDurationStartChar = (specInfoDurationStart) + ('-');


                // read ((SpecInfo.durationStart) + ('-')) + (SpecInfo.durationEnd)
                specInfoDurationStartCharSpecInfoDurationEnd = (specInfoDurationStartChar) + (specInfoDurationEnd);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, specInfoTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, specInfoLocation);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, specInfoDurationStartCharSpecInfoDurationEnd);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, specInfoDescription);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): SpecInfo
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}