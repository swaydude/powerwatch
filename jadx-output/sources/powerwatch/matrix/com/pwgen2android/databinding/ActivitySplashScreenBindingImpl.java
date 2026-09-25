package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class ActivitySplashScreenBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.ActivitySplashScreenBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private final android.widget.FrameLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        return false;
    }

    public ActivitySplashScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }

    private ActivitySplashScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 0);
        this.mDirtyFlags = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) bindings[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.splash.SplashViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.ActivitySplashScreenBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.splash.SplashViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
    }
}
