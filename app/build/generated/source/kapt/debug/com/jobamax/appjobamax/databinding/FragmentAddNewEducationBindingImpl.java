package com.jobamax.appjobamax.databinding;
import com.jobamax.appjobamax.R;
import com.jobamax.appjobamax.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddNewEducationBindingImpl extends FragmentAddNewEducationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout16, 1);
        sViewsWithIds.put(R.id.iv_back_button, 2);
        sViewsWithIds.put(R.id.textView3, 3);
        sViewsWithIds.put(R.id.btn_edit, 4);
        sViewsWithIds.put(R.id.view, 5);
        sViewsWithIds.put(R.id.ll_most_parent, 6);
        sViewsWithIds.put(R.id.tv1, 7);
        sViewsWithIds.put(R.id.et_school, 8);
        sViewsWithIds.put(R.id.tv2, 9);
        sViewsWithIds.put(R.id.et_program, 10);
        sViewsWithIds.put(R.id.ll1, 11);
        sViewsWithIds.put(R.id.cb_current_student, 12);
        sViewsWithIds.put(R.id.ll2, 13);
        sViewsWithIds.put(R.id.tv_Start_date, 14);
        sViewsWithIds.put(R.id.ll_end_date, 15);
        sViewsWithIds.put(R.id.tv_end_date, 16);
        sViewsWithIds.put(R.id.tv7, 17);
        sViewsWithIds.put(R.id.et_description, 18);
        sViewsWithIds.put(R.id.tv_description, 19);
        sViewsWithIds.put(R.id.rv_universities, 20);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAddNewEducationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private FragmentAddNewEducationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.EditText) bindings[18]
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[8]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[20]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[14]
            , (android.view.View) bindings[5]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}