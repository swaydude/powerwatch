package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentChooseProductBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseProductBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final android.widget.ScrollView mboundView0;
    private final android.widget.LinearLayout mboundView1;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.products_view_pager, 2);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.radio_group, 3);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.button_choose_watch, 4);
    }

    public FragmentChooseProductBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }

    private FragmentChooseProductBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 0, (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton) bindings[4], (androidx.viewpager.widget.ViewPager) bindings[2], (android.widget.RadioGroup) bindings[3]);
        this.mDirtyFlags = -1L;
        android.widget.ScrollView scrollView = (android.widget.ScrollView) bindings[0];
        this.mboundView0 = scrollView;
        scrollView.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[1];
        this.mboundView1 = linearLayout;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseProductBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
    }
}
