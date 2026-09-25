package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentScanBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentScanBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentScanBindingImpl.OnClickListenerImpl mViewModelOnPinCodeClickedAndroidViewViewOnClickListener;
    private final android.widget.RelativeLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.cicleOverlay, 2);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.camera_preview, 3);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.dashed, 4);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.main_text_view, 5);
    }

    public FragmentScanBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }

    private FragmentScanBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 0, (powerwatch.matrix.com.pwgen2android.pair.camera.CameraPreview) bindings[3], (powerwatch.matrix.com.pwgen2android.pair.camera.OverlayView) bindings[2], (powerwatch.matrix.com.pwgen2android.pair.camera.CustomTextView) bindings[4], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[5], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[1]);
        this.mDirtyFlags = -1L;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag(null);
        this.unableToScanText.setTag(null);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentScanBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel ViewModel) {
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
        powerwatch.matrix.com.pwgen2android.databinding.FragmentScanBindingImpl.OnClickListenerImpl value = null;
        powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel qRPairingViewModel = this.mViewModel;
        long j2 = j & 3;
        if (j2 != 0 && qRPairingViewModel != null) {
            powerwatch.matrix.com.pwgen2android.databinding.FragmentScanBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnPinCodeClickedAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentScanBindingImpl.OnClickListenerImpl();
                this.mViewModelOnPinCodeClickedAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            value = onClickListenerImpl.setValue(qRPairingViewModel);
        }
        if (j2 != 0) {
            this.unableToScanText.setOnClickListener(value);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentScanBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onPinCodeClicked(arg0);
        }
    }
}
