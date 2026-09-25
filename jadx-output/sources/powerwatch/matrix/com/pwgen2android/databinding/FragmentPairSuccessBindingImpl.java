package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentPairSuccessBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentPairSuccessBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentPairSuccessBindingImpl.OnClickListenerImpl mViewModelOnContinueClickedAndroidViewViewOnClickListener;
    private final android.widget.FrameLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.center_image_view, 2);
    }

    public FragmentPairSuccessBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }

    private FragmentPairSuccessBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 0, (android.widget.ImageView) bindings[2], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton) bindings[1]);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.pair.ui.PairingSuccessViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentPairSuccessBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.pair.ui.PairingSuccessViewModel ViewModel) {
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
        powerwatch.matrix.com.pwgen2android.databinding.FragmentPairSuccessBindingImpl.OnClickListenerImpl value = null;
        powerwatch.matrix.com.pwgen2android.pair.ui.PairingSuccessViewModel pairingSuccessViewModel = this.mViewModel;
        long j2 = j & 3;
        if (j2 != 0 && pairingSuccessViewModel != null) {
            powerwatch.matrix.com.pwgen2android.databinding.FragmentPairSuccessBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnContinueClickedAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentPairSuccessBindingImpl.OnClickListenerImpl();
                this.mViewModelOnContinueClickedAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            value = onClickListenerImpl.setValue(pairingSuccessViewModel);
        }
        if (j2 != 0) {
            this.tryAgainButton.setOnClickListener(value);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.pair.ui.PairingSuccessViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentPairSuccessBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.pair.ui.PairingSuccessViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onContinueClicked(arg0);
        }
    }
}
