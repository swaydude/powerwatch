package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentSelectItemsBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentSelectItemsBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final android.widget.LinearLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.language_list, 1);
    }

    public FragmentSelectItemsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }

    private FragmentSelectItemsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 0, (androidx.recyclerview.widget.RecyclerView) bindings[1]);
        this.mDirtyFlags = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.mDirtyFlags != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, java.lang.Object variable) {
        if (1 != variableId) {
            return false;
        }
        setViewModel((powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentSelectItemsBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
    }
}
