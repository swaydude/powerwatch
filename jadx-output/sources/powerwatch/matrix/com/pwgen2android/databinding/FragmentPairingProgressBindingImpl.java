package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentPairingProgressBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentPairingProgressBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentPairingProgressBindingImpl.OnClickListenerImpl mViewModelOnBluetoothEnableClickedAndroidViewViewOnClickListener;
    private final android.widget.FrameLayout mboundView0;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView2;
    private final android.widget.LinearLayout mboundView3;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView4;

    public FragmentPairingProgressBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }

    private FragmentPairingProgressBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 3, (powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView) bindings[1]);
        this.mDirtyFlags = -1L;
        this.mainPairingCircle.setTag(null);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) bindings[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[2];
        this.mboundView2 = fontableTextView;
        fontableTextView.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[3];
        this.mboundView3 = linearLayout;
        linearLayout.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView2 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[4];
        this.mboundView4 = fontableTextView2;
        fontableTextView2.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 16L;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentPairingProgressBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        if (localFieldId == 0) {
            return onChangeViewModelBluetoothWarnDisplayed((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 1) {
            return onChangeViewModelPairingProgressText((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId != 2) {
            return false;
        }
        return onChangeViewModelPairingProgressField((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelBluetoothWarnDisplayed(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelBluetoothWarnDisplayed, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelPairingProgressText(androidx.databinding.ObservableField<java.lang.String> ViewModelPairingProgressText, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelPairingProgressField(androidx.databinding.ObservableField<java.lang.Integer> ViewModelPairingProgressField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentPairingProgressBindingImpl.OnClickListenerImpl value;
        java.lang.String str;
        androidx.databinding.ObservableField<java.lang.Integer> pairingProgressField;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel pairingProgressViewModel = this.mViewModel;
        boolean zSafeUnbox = false;
        if ((31 & j) != 0) {
            if ((j & 24) == 0 || pairingProgressViewModel == null) {
                value = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentPairingProgressBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnBluetoothEnableClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl == null) {
                    onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentPairingProgressBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnBluetoothEnableClickedAndroidViewViewOnClickListener = onClickListenerImpl;
                }
                value = onClickListenerImpl.setValue(pairingProgressViewModel);
            }
            if ((j & 25) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> bluetoothWarnDisplayed = pairingProgressViewModel != null ? pairingProgressViewModel.getBluetoothWarnDisplayed() : null;
                updateRegistration(0, bluetoothWarnDisplayed);
                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(bluetoothWarnDisplayed != null ? bluetoothWarnDisplayed.get() : null);
            }
            if ((j & 26) == 0) {
                str = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> pairingProgressText = pairingProgressViewModel != null ? pairingProgressViewModel.getPairingProgressText() : null;
                updateRegistration(1, pairingProgressText);
                if (pairingProgressText != null) {
                    str = pairingProgressText.get();
                } else {
                    str = null;
                }
            }
            if ((j & 28) != 0) {
                pairingProgressField = pairingProgressViewModel != null ? pairingProgressViewModel.getPairingProgressField() : null;
                updateRegistration(2, pairingProgressField);
                if (pairingProgressField != null) {
                    pairingProgressField.get();
                }
            }
            if ((j & 28) != 0) {
                this.mainPairingCircle.setCircleValue(pairingProgressField);
            }
            if ((26 & j) != 0) {
                androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, str);
            }
            if ((j & 25) != 0) {
                powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView3, zSafeUnbox);
            }
            if ((j & 24) != 0) {
                this.mboundView4.setOnClickListener(value);
            }
        }
        value = null;
        str = null;
        pairingProgressField = null;
        if ((j & 28) != 0) {
            this.mainPairingCircle.setCircleValue(pairingProgressField);
        }
        if ((26 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, str);
        }
        if ((j & 25) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView3, zSafeUnbox);
        }
        if ((j & 24) != 0) {
            this.mboundView4.setOnClickListener(value);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentPairingProgressBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onBluetoothEnableClicked(arg0);
        }
    }
}
