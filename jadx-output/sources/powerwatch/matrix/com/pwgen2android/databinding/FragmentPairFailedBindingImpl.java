package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentPairFailedBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentPairFailedBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentPairFailedBindingImpl.OnClickListenerImpl mViewModelOnTryAgainClickedAndroidViewViewOnClickListener;
    private final android.widget.FrameLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.center_image_view, 2);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.back_button, 3);
    }

    public FragmentPairFailedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }

    private FragmentPairFailedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 0, (android.widget.ImageView) bindings[3], (android.widget.ImageView) bindings[2], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton) bindings[1]);
        this.mDirtyFlags = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) bindings[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        this.tryAgainButton.setTag(null);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.pair.ui.PairFailedViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentPairFailedBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.pair.ui.PairFailedViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.databinding.FragmentPairFailedBindingImpl.OnClickListenerImpl value = null;
        powerwatch.matrix.com.pwgen2android.pair.ui.PairFailedViewModel pairFailedViewModel = this.mViewModel;
        long j2 = j & 3;
        if (j2 != 0 && pairFailedViewModel != null) {
            powerwatch.matrix.com.pwgen2android.databinding.FragmentPairFailedBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnTryAgainClickedAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentPairFailedBindingImpl.OnClickListenerImpl();
                this.mViewModelOnTryAgainClickedAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            value = onClickListenerImpl.setValue(pairFailedViewModel);
        }
        if (j2 != 0) {
            this.tryAgainButton.setOnClickListener(value);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.pair.ui.PairFailedViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentPairFailedBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.pair.ui.PairFailedViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onTryAgainClicked(arg0);
        }
    }
}
