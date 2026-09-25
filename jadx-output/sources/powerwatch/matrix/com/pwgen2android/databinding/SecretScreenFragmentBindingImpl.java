package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class SecretScreenFragmentBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl3 mViewModelDeleteLogsAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl9 mViewModelExportAccelLogAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl5 mViewModelOnDeleteAllDataClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl8 mViewModelOnDeleteDevicesClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl13 mViewModelOnDeleteGoalsClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl6 mViewModelOnDeleteLogsClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl4 mViewModelOnDevRadioClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl7 mViewModelOnMockDataCheckedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl2 mViewModelOnOpenDBDebugClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl12 mViewModelOnOpenInternalLoggerClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl1 mViewModelOnOpenNotificationLoggerClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl11 mViewModelOnOpenNotificationServiceSettingsAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl10 mViewModelOnProdRadioClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl mViewModelOnSaveClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final androidx.appcompat.widget.AppCompatCheckBox mboundView10;
    private final androidx.appcompat.widget.AppCompatCheckBox mboundView11;
    private final androidx.appcompat.widget.AppCompatCheckBox mboundView12;
    private final android.widget.Button mboundView14;
    private final android.widget.Button mboundView15;
    private final android.widget.Button mboundView3;
    private final android.widget.Button mboundView4;
    private final android.widget.Button mboundView5;
    private final android.widget.Button mboundView6;
    private final android.widget.TextView mboundView7;
    private final android.widget.Button mboundView8;
    private final androidx.appcompat.widget.AppCompatCheckBox mboundView9;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, 16);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.clout_content, 17);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.logger_content, 18);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.database_content, 19);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.watch_settings, 20);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.calls, 21);
    }

    public SecretScreenFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }

    private SecretScreenFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 3, (android.widget.FrameLayout) bindings[21], (androidx.appcompat.widget.SwitchCompat) bindings[13], (android.widget.LinearLayout) bindings[17], (android.widget.LinearLayout) bindings[19], (android.widget.LinearLayout) bindings[18], (android.widget.RadioButton) bindings[2], (android.widget.RadioButton) bindings[1], (android.widget.LinearLayout) bindings[16], (android.widget.LinearLayout) bindings[20]);
        this.mDirtyFlags = -1L;
        this.callsToggle.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        androidx.appcompat.widget.AppCompatCheckBox appCompatCheckBox = (androidx.appcompat.widget.AppCompatCheckBox) bindings[10];
        this.mboundView10 = appCompatCheckBox;
        appCompatCheckBox.setTag(null);
        androidx.appcompat.widget.AppCompatCheckBox appCompatCheckBox2 = (androidx.appcompat.widget.AppCompatCheckBox) bindings[11];
        this.mboundView11 = appCompatCheckBox2;
        appCompatCheckBox2.setTag(null);
        androidx.appcompat.widget.AppCompatCheckBox appCompatCheckBox3 = (androidx.appcompat.widget.AppCompatCheckBox) bindings[12];
        this.mboundView12 = appCompatCheckBox3;
        appCompatCheckBox3.setTag(null);
        android.widget.Button button = (android.widget.Button) bindings[14];
        this.mboundView14 = button;
        button.setTag(null);
        android.widget.Button button2 = (android.widget.Button) bindings[15];
        this.mboundView15 = button2;
        button2.setTag(null);
        android.widget.Button button3 = (android.widget.Button) bindings[3];
        this.mboundView3 = button3;
        button3.setTag(null);
        android.widget.Button button4 = (android.widget.Button) bindings[4];
        this.mboundView4 = button4;
        button4.setTag(null);
        android.widget.Button button5 = (android.widget.Button) bindings[5];
        this.mboundView5 = button5;
        button5.setTag(null);
        android.widget.Button button6 = (android.widget.Button) bindings[6];
        this.mboundView6 = button6;
        button6.setTag(null);
        android.widget.TextView textView = (android.widget.TextView) bindings[7];
        this.mboundView7 = textView;
        textView.setTag(null);
        android.widget.Button button7 = (android.widget.Button) bindings[8];
        this.mboundView8 = button7;
        button7.setTag(null);
        androidx.appcompat.widget.AppCompatCheckBox appCompatCheckBox4 = (androidx.appcompat.widget.AppCompatCheckBox) bindings[9];
        this.mboundView9 = appCompatCheckBox4;
        appCompatCheckBox4.setTag(null);
        this.radioDev.setTag(null);
        this.radioProd.setTag(null);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel ViewModel) {
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
            return onChangeViewModelMockLogDataEnabled((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 1) {
            return onChangeViewModelProdEnabled((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId != 2) {
            return false;
        }
        return onChangeViewModelIsDebugBuild((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelMockLogDataEnabled(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelMockLogDataEnabled, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelProdEnabled(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelProdEnabled, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelIsDebugBuild(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsDebugBuild, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl6 onClickListenerImpl6;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl3 onClickListenerImpl3;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl2 onClickListenerImpl2;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl8 onClickListenerImpl8;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl13 onClickListenerImpl13;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl11 onClickListenerImpl11;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl5 onClickListenerImpl5;
        boolean zSafeUnbox;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl7 onClickListenerImpl7;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl onClickListenerImpl;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl12 value;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl1 onClickListenerImpl1;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl9 onClickListenerImpl9;
        boolean z;
        boolean z2;
        boolean zSafeUnbox2;
        long j2;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl4 onClickListenerImpl4;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl10 onClickListenerImpl10;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl8 onClickListenerImpl12;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl13 value2;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl9 onClickListenerImpl14;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl onClickListenerImpl15;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl1 onClickListenerImpl16;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl2 onClickListenerImpl17;
        long j3;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl11 onClickListenerImpl18;
        boolean zSafeUnbox3;
        boolean zSafeUnbox4;
        androidx.databinding.ObservableField<java.lang.Boolean> mockLogDataEnabled;
        int i;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel secretScreenViewModel = this.mViewModel;
        if ((31 & j) != 0) {
            if ((j & 24) == 0 || secretScreenViewModel == null) {
                onClickListenerImpl12 = null;
                value2 = null;
                onClickListenerImpl14 = null;
                onClickListenerImpl15 = null;
                onClickListenerImpl16 = null;
                onClickListenerImpl5 = null;
                onClickListenerImpl6 = null;
                onClickListenerImpl7 = null;
                onClickListenerImpl17 = null;
                onClickListenerImpl3 = null;
                onClickListenerImpl4 = null;
                onClickListenerImpl10 = null;
                j3 = 25;
                onClickListenerImpl18 = null;
                value = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl onClickListenerImpl19 = this.mViewModelOnSaveClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl19 == null) {
                    onClickListenerImpl19 = new powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnSaveClickedAndroidViewViewOnClickListener = onClickListenerImpl19;
                }
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl value3 = onClickListenerImpl19.setValue(secretScreenViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl1 onClickListenerImpl20 = this.mViewModelOnOpenNotificationLoggerClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl20 == null) {
                    onClickListenerImpl20 = new powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl1();
                    this.mViewModelOnOpenNotificationLoggerClickedAndroidViewViewOnClickListener = onClickListenerImpl20;
                }
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl1 value4 = onClickListenerImpl20.setValue(secretScreenViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl2 onClickListenerImpl21 = this.mViewModelOnOpenDBDebugClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl21 == null) {
                    onClickListenerImpl21 = new powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl2();
                    this.mViewModelOnOpenDBDebugClickedAndroidViewViewOnClickListener = onClickListenerImpl21;
                }
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl2 value5 = onClickListenerImpl21.setValue(secretScreenViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl3 onClickListenerImpl22 = this.mViewModelDeleteLogsAndroidViewViewOnClickListener;
                if (onClickListenerImpl22 == null) {
                    onClickListenerImpl22 = new powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl3();
                    this.mViewModelDeleteLogsAndroidViewViewOnClickListener = onClickListenerImpl22;
                }
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl3 value6 = onClickListenerImpl22.setValue(secretScreenViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl4 onClickListenerImpl23 = this.mViewModelOnDevRadioClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl23 == null) {
                    onClickListenerImpl23 = new powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl4();
                    this.mViewModelOnDevRadioClickedAndroidViewViewOnClickListener = onClickListenerImpl23;
                }
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl4 value7 = onClickListenerImpl23.setValue(secretScreenViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl5 onClickListenerImpl24 = this.mViewModelOnDeleteAllDataClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl24 == null) {
                    onClickListenerImpl24 = new powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl5();
                    this.mViewModelOnDeleteAllDataClickedAndroidViewViewOnClickListener = onClickListenerImpl24;
                }
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl5 value8 = onClickListenerImpl24.setValue(secretScreenViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl6 onClickListenerImpl25 = this.mViewModelOnDeleteLogsClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl25 == null) {
                    onClickListenerImpl25 = new powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl6();
                    this.mViewModelOnDeleteLogsClickedAndroidViewViewOnClickListener = onClickListenerImpl25;
                }
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl6 value9 = onClickListenerImpl25.setValue(secretScreenViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl7 onClickListenerImpl26 = this.mViewModelOnMockDataCheckedAndroidViewViewOnClickListener;
                if (onClickListenerImpl26 == null) {
                    onClickListenerImpl26 = new powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl7();
                    this.mViewModelOnMockDataCheckedAndroidViewViewOnClickListener = onClickListenerImpl26;
                }
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl7 value10 = onClickListenerImpl26.setValue(secretScreenViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl8 onClickListenerImpl27 = this.mViewModelOnDeleteDevicesClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl27 == null) {
                    onClickListenerImpl27 = new powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl8();
                    this.mViewModelOnDeleteDevicesClickedAndroidViewViewOnClickListener = onClickListenerImpl27;
                }
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl8 value11 = onClickListenerImpl27.setValue(secretScreenViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl9 onClickListenerImpl28 = this.mViewModelExportAccelLogAndroidViewViewOnClickListener;
                if (onClickListenerImpl28 == null) {
                    onClickListenerImpl28 = new powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl9();
                    this.mViewModelExportAccelLogAndroidViewViewOnClickListener = onClickListenerImpl28;
                }
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl9 value12 = onClickListenerImpl28.setValue(secretScreenViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl10 onClickListenerImpl110 = this.mViewModelOnProdRadioClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl110 == null) {
                    onClickListenerImpl110 = new powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl10();
                    this.mViewModelOnProdRadioClickedAndroidViewViewOnClickListener = onClickListenerImpl110;
                }
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl10 value13 = onClickListenerImpl110.setValue(secretScreenViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl11 onClickListenerImpl111 = this.mViewModelOnOpenNotificationServiceSettingsAndroidViewViewOnClickListener;
                if (onClickListenerImpl111 == null) {
                    onClickListenerImpl111 = new powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl11();
                    this.mViewModelOnOpenNotificationServiceSettingsAndroidViewViewOnClickListener = onClickListenerImpl111;
                }
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl11 value14 = onClickListenerImpl111.setValue(secretScreenViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl12 onClickListenerImpl112 = this.mViewModelOnOpenInternalLoggerClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl112 == null) {
                    onClickListenerImpl112 = new powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl12();
                    this.mViewModelOnOpenInternalLoggerClickedAndroidViewViewOnClickListener = onClickListenerImpl112;
                }
                value = onClickListenerImpl112.setValue(secretScreenViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl13 onClickListenerImpl113 = this.mViewModelOnDeleteGoalsClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl113 == null) {
                    onClickListenerImpl113 = new powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl13();
                    this.mViewModelOnDeleteGoalsClickedAndroidViewViewOnClickListener = onClickListenerImpl113;
                }
                j3 = 25;
                value2 = onClickListenerImpl113.setValue(secretScreenViewModel);
                onClickListenerImpl12 = value11;
                onClickListenerImpl18 = value14;
                onClickListenerImpl10 = value13;
                onClickListenerImpl4 = value7;
                onClickListenerImpl3 = value6;
                onClickListenerImpl17 = value5;
                onClickListenerImpl7 = value10;
                onClickListenerImpl6 = value9;
                onClickListenerImpl5 = value8;
                onClickListenerImpl16 = value4;
                onClickListenerImpl15 = value3;
                onClickListenerImpl14 = value12;
            }
            if ((j & j3) != 0) {
                if (secretScreenViewModel != null) {
                    i = 0;
                    mockLogDataEnabled = secretScreenViewModel.getMockLogDataEnabled();
                } else {
                    mockLogDataEnabled = null;
                    i = 0;
                }
                updateRegistration(i, mockLogDataEnabled);
                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(mockLogDataEnabled != null ? mockLogDataEnabled.get() : null);
            } else {
                onClickListenerImpl12 = onClickListenerImpl12;
                value2 = value2;
                zSafeUnbox = false;
            }
            if ((j & 26) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> prodEnabled = secretScreenViewModel != null ? secretScreenViewModel.getProdEnabled() : null;
                updateRegistration(1, prodEnabled);
                zSafeUnbox3 = androidx.databinding.ViewDataBinding.safeUnbox(prodEnabled != null ? prodEnabled.get() : null);
                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox3));
            } else {
                zSafeUnbox = zSafeUnbox;
                zSafeUnbox3 = false;
                zSafeUnbox4 = false;
            }
            if ((j & 28) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> observableFieldIsDebugBuild = secretScreenViewModel != null ? secretScreenViewModel.isDebugBuild() : null;
                updateRegistration(2, observableFieldIsDebugBuild);
                zSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(observableFieldIsDebugBuild != null ? observableFieldIsDebugBuild.get() : null);
                z = zSafeUnbox3;
            } else {
                z = zSafeUnbox3;
                zSafeUnbox2 = false;
            }
            onClickListenerImpl9 = onClickListenerImpl14;
            onClickListenerImpl1 = onClickListenerImpl16;
            onClickListenerImpl11 = onClickListenerImpl18;
            onClickListenerImpl8 = onClickListenerImpl12;
            j2 = 25;
            powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl13 onClickListenerImpl114 = value2;
            z2 = zSafeUnbox4;
            onClickListenerImpl2 = onClickListenerImpl17;
            onClickListenerImpl = onClickListenerImpl15;
            onClickListenerImpl13 = onClickListenerImpl114;
        } else {
            onClickListenerImpl6 = null;
            onClickListenerImpl3 = null;
            onClickListenerImpl2 = null;
            onClickListenerImpl8 = null;
            onClickListenerImpl13 = null;
            onClickListenerImpl11 = null;
            onClickListenerImpl5 = null;
            zSafeUnbox = false;
            onClickListenerImpl7 = null;
            onClickListenerImpl = null;
            value = null;
            onClickListenerImpl1 = null;
            onClickListenerImpl9 = null;
            z = false;
            z2 = false;
            zSafeUnbox2 = false;
            j2 = 25;
            onClickListenerImpl4 = null;
            onClickListenerImpl10 = null;
        }
        long j4 = j & j2;
        powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl6 onClickListenerImpl29 = onClickListenerImpl6;
        if (j4 != 0) {
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.callsToggle, zSafeUnbox);
        }
        if ((j & 24) != 0) {
            this.callsToggle.setOnClickListener(onClickListenerImpl7);
            this.mboundView10.setOnClickListener(onClickListenerImpl8);
            this.mboundView11.setOnClickListener(onClickListenerImpl13);
            this.mboundView12.setOnClickListener(onClickListenerImpl5);
            this.mboundView14.setOnClickListener(onClickListenerImpl11);
            this.mboundView15.setOnClickListener(onClickListenerImpl);
            this.mboundView3.setOnClickListener(value);
            this.mboundView4.setOnClickListener(onClickListenerImpl1);
            this.mboundView5.setOnClickListener(onClickListenerImpl9);
            this.mboundView6.setOnClickListener(onClickListenerImpl3);
            this.mboundView8.setOnClickListener(onClickListenerImpl2);
            this.mboundView9.setOnClickListener(onClickListenerImpl29);
            this.radioDev.setOnClickListener(onClickListenerImpl4);
            this.radioProd.setOnClickListener(onClickListenerImpl10);
        }
        if ((28 & j) != 0) {
            boolean z3 = zSafeUnbox2;
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView7, z3);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView8, z3);
        }
        if ((j & 26) != 0) {
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.radioDev, z2);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.radioProd, z);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onSaveClicked(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onOpenNotificationLoggerClicked(arg0);
        }
    }

    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl2 setValue(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onOpenDBDebugClicked(arg0);
        }
    }

    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl3 setValue(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.deleteLogs(arg0);
        }
    }

    public static class OnClickListenerImpl4 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl4 setValue(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onDevRadioClicked(arg0);
        }
    }

    public static class OnClickListenerImpl5 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl5 setValue(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onDeleteAllDataClicked(arg0);
        }
    }

    public static class OnClickListenerImpl6 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl6 setValue(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onDeleteLogsClicked(arg0);
        }
    }

    public static class OnClickListenerImpl7 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl7 setValue(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onMockDataChecked(arg0);
        }
    }

    public static class OnClickListenerImpl8 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl8 setValue(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onDeleteDevicesClicked(arg0);
        }
    }

    public static class OnClickListenerImpl9 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl9 setValue(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.exportAccelLog(arg0);
        }
    }

    public static class OnClickListenerImpl10 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl10 setValue(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onProdRadioClicked(arg0);
        }
    }

    public static class OnClickListenerImpl11 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl11 setValue(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onOpenNotificationServiceSettings(arg0);
        }
    }

    public static class OnClickListenerImpl12 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl12 setValue(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onOpenInternalLoggerClicked(arg0);
        }
    }

    public static class OnClickListenerImpl13 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBindingImpl.OnClickListenerImpl13 setValue(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onDeleteGoalsClicked(arg0);
        }
    }
}
