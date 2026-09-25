package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentMapsBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentMapsBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final android.widget.FrameLayout mboundView0;
    private final android.widget.ProgressBar mboundView1;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.map_view, 2);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.transparent_touch_panel, 3);
    }

    public FragmentMapsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }

    private FragmentMapsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 1, (android.widget.FrameLayout) bindings[2], (android.view.View) bindings[3]);
        this.mDirtyFlags = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) bindings[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) bindings[1];
        this.mboundView1 = progressBar;
        progressBar.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4L;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentMapsBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return onChangeViewModelShowProgressField((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelShowProgressField(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelShowProgressField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel baseMapViewModel = this.mViewModel;
        long j2 = j & 7;
        boolean zSafeUnbox = false;
        if (j2 != 0) {
            androidx.databinding.ObservableField<java.lang.Boolean> showProgressField = baseMapViewModel != null ? baseMapViewModel.getShowProgressField() : null;
            updateRegistration(0, showProgressField);
            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(showProgressField != null ? showProgressField.get() : null);
        }
        if (j2 != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView1, zSafeUnbox);
        }
    }
}
