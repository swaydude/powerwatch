package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentQrCodeTutorialBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentQrCodeTutorialBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentQrCodeTutorialBindingImpl.OnClickListenerImpl mViewModelOnBackClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.header_layout, 2);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.step_one_title, 3);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.step_one_body, 4);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.step_two_title, 5);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.step_two_body, 6);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.step_three_title, 7);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.step_three_body, 8);
    }

    public FragmentQrCodeTutorialBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }

    private FragmentQrCodeTutorialBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 0, (android.widget.ImageView) bindings[1], (android.widget.RelativeLayout) bindings[2], (android.widget.TextView) bindings[4], (android.widget.TextView) bindings[3], (android.widget.TextView) bindings[8], (android.widget.TextView) bindings[7], (android.widget.TextView) bindings[6], (android.widget.TextView) bindings[5]);
        this.mDirtyFlags = -1L;
        this.backButton.setTag(null);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentQrCodeTutorialBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel ViewModel) {
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
        powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel qRCodeViewModel = this.mViewModel;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentQrCodeTutorialBindingImpl.OnClickListenerImpl value = null;
        long j2 = j & 3;
        if (j2 != 0 && qRCodeViewModel != null) {
            powerwatch.matrix.com.pwgen2android.databinding.FragmentQrCodeTutorialBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnBackClickedAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentQrCodeTutorialBindingImpl.OnClickListenerImpl();
                this.mViewModelOnBackClickedAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            value = onClickListenerImpl.setValue(qRCodeViewModel);
        }
        if (j2 != 0) {
            this.backButton.setOnClickListener(value);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentQrCodeTutorialBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onBackClicked(arg0);
        }
    }
}
