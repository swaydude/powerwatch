package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentCreateAccountBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private androidx.databinding.InverseBindingListener emailEditTextandroidTextAttrChanged;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.OnClickListenerImpl1 mViewModelGoToLoginAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.OnClickListenerImpl2 mViewModelOnCreateAccountClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.OnClickListenerImpl mViewModelOnTermsAndConditionsClickedAndroidViewViewOnClickListener;
    private final android.widget.FrameLayout mboundView0;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView10;
    private final android.widget.LinearLayout mboundView11;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView12;
    private final android.widget.LinearLayout mboundView13;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView7;
    private final android.widget.ProgressBar mboundView9;
    private androidx.databinding.InverseBindingListener nameEditTextandroidTextAttrChanged;
    private androidx.databinding.InverseBindingListener passwordConfirmEditTextandroidTextAttrChanged;
    private androidx.databinding.InverseBindingListener passwordEditTextandroidTextAttrChanged;
    private androidx.databinding.InverseBindingListener termsCheckBoxandroidCheckedAttrChanged;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.biometrics_container, 14);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.terms_and_conditions_layout, 15);
    }

    public FragmentCreateAccountBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }

    private FragmentCreateAccountBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 9, (android.widget.FrameLayout) bindings[14], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton) bindings[8], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText) bindings[2], (android.widget.LinearLayout) bindings[1], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText) bindings[3], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText) bindings[5], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText) bindings[4], (android.widget.RelativeLayout) bindings[15], (androidx.appcompat.widget.AppCompatCheckBox) bindings[6]);
        this.emailEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.1
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.this.emailEditText);
                powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel createAccountViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.this.mViewModel;
                if (createAccountViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> emailField = createAccountViewModel.getEmailField();
                    if (emailField != null) {
                        emailField.set(textString);
                    }
                }
            }
        };
        this.nameEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.2
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.this.nameEditText);
                powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel createAccountViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.this.mViewModel;
                if (createAccountViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> nameField = createAccountViewModel.getNameField();
                    if (nameField != null) {
                        nameField.set(textString);
                    }
                }
            }
        };
        this.passwordConfirmEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.3
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.this.passwordConfirmEditText);
                powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel createAccountViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.this.mViewModel;
                if (createAccountViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> confirmPasswordField = createAccountViewModel.getConfirmPasswordField();
                    if (confirmPasswordField != null) {
                        confirmPasswordField.set(textString);
                    }
                }
            }
        };
        this.passwordEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.4
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.this.passwordEditText);
                powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel createAccountViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.this.mViewModel;
                if (createAccountViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> passwordField = createAccountViewModel.getPasswordField();
                    if (passwordField != null) {
                        passwordField.set(textString);
                    }
                }
            }
        };
        this.termsCheckBoxandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.5
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                boolean zIsChecked = powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.this.termsCheckBox.isChecked();
                powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel createAccountViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.this.mViewModel;
                if (createAccountViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.Boolean> licenceAccepted = createAccountViewModel.getLicenceAccepted();
                    if (licenceAccepted != null) {
                        licenceAccepted.set(java.lang.Boolean.valueOf(zIsChecked));
                    }
                }
            }
        };
        this.mDirtyFlags = -1L;
        this.createAccount.setTag(null);
        this.emailEditText.setTag(null);
        this.loginDetails.setTag(null);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) bindings[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[10];
        this.mboundView10 = fontableTextView;
        fontableTextView.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[11];
        this.mboundView11 = linearLayout;
        linearLayout.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView2 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[12];
        this.mboundView12 = fontableTextView2;
        fontableTextView2.setTag(null);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) bindings[13];
        this.mboundView13 = linearLayout2;
        linearLayout2.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView3 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[7];
        this.mboundView7 = fontableTextView3;
        fontableTextView3.setTag(null);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) bindings[9];
        this.mboundView9 = progressBar;
        progressBar.setTag(null);
        this.nameEditText.setTag(null);
        this.passwordConfirmEditText.setTag(null);
        this.passwordEditText.setTag(null);
        this.termsCheckBox.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 512;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return onChangeViewModelLicenceAccepted((androidx.databinding.ObservableField) object, fieldId);
            case 1:
                return onChangeViewModelDisplayNetworkError((androidx.databinding.ObservableField) object, fieldId);
            case 2:
                return onChangeViewModelNameField((androidx.databinding.ObservableField) object, fieldId);
            case 3:
                return onChangeViewModelPasswordField((androidx.databinding.ObservableField) object, fieldId);
            case 4:
                return onChangeViewModelIsButtonVisible((androidx.databinding.ObservableField) object, fieldId);
            case 5:
                return onChangeViewModelEmailField((androidx.databinding.ObservableField) object, fieldId);
            case 6:
                return onChangeViewModelGoToLoginLinkDisplayed((androidx.databinding.ObservableField) object, fieldId);
            case 7:
                return onChangeViewModelConfirmPasswordField((androidx.databinding.ObservableField) object, fieldId);
            case 8:
                return onChangeViewModelErrorMessage((androidx.databinding.ObservableField) object, fieldId);
            default:
                return false;
        }
    }

    private boolean onChangeViewModelLicenceAccepted(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelLicenceAccepted, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelDisplayNetworkError(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelDisplayNetworkError, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelNameField(androidx.databinding.ObservableField<java.lang.String> ViewModelNameField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeViewModelPasswordField(androidx.databinding.ObservableField<java.lang.String> ViewModelPasswordField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeViewModelIsButtonVisible(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsButtonVisible, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeViewModelEmailField(androidx.databinding.ObservableField<java.lang.String> ViewModelEmailField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeViewModelGoToLoginLinkDisplayed(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelGoToLoginLinkDisplayed, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    private boolean onChangeViewModelConfirmPasswordField(androidx.databinding.ObservableField<java.lang.String> ViewModelConfirmPasswordField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        return true;
    }

    private boolean onChangeViewModelErrorMessage(androidx.databinding.ObservableField<java.lang.String> ViewModelErrorMessage, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 256;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0179  */
    /* JADX WARN: Code duplicated, block: B:107:0x017e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0186  */
    /* JADX WARN: Code duplicated, block: B:111:0x018f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x0120  */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        java.lang.String str;
        java.lang.String str2;
        boolean zSafeUnbox;
        boolean zSafeUnbox2;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.OnClickListenerImpl1 onClickListenerImpl1;
        boolean zSafeUnbox3;
        java.lang.String str3;
        java.lang.String str4;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.OnClickListenerImpl onClickListenerImpl;
        boolean zSafeUnbox4;
        java.lang.String str5;
        boolean z;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.OnClickListenerImpl2 value;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.OnClickListenerImpl value2;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.OnClickListenerImpl1 value3;
        boolean zSafeUnbox5;
        androidx.databinding.ObservableField<java.lang.String> errorMessage;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel createAccountViewModel = this.mViewModel;
        if ((2047 & j) != 0) {
            if ((j & 1537) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> licenceAccepted = createAccountViewModel != null ? createAccountViewModel.getLicenceAccepted() : null;
                updateRegistration(0, licenceAccepted);
                zSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(licenceAccepted != null ? licenceAccepted.get() : null);
            } else {
                zSafeUnbox2 = false;
            }
            if ((j & 1536) == 0 || createAccountViewModel == null) {
                value2 = null;
                value3 = null;
                value = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.OnClickListenerImpl onClickListenerImpl2 = this.mViewModelOnTermsAndConditionsClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl2 == null) {
                    onClickListenerImpl2 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnTermsAndConditionsClickedAndroidViewViewOnClickListener = onClickListenerImpl2;
                }
                value2 = onClickListenerImpl2.setValue(createAccountViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.OnClickListenerImpl1 onClickListenerImpl3 = this.mViewModelGoToLoginAndroidViewViewOnClickListener;
                if (onClickListenerImpl3 == null) {
                    onClickListenerImpl3 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.OnClickListenerImpl1();
                    this.mViewModelGoToLoginAndroidViewViewOnClickListener = onClickListenerImpl3;
                }
                value3 = onClickListenerImpl3.setValue(createAccountViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.OnClickListenerImpl2 onClickListenerImpl4 = this.mViewModelOnCreateAccountClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl4 == null) {
                    onClickListenerImpl4 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.OnClickListenerImpl2();
                    this.mViewModelOnCreateAccountClickedAndroidViewViewOnClickListener = onClickListenerImpl4;
                }
                value = onClickListenerImpl4.setValue(createAccountViewModel);
            }
            if ((j & 1538) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> displayNetworkError = createAccountViewModel != null ? createAccountViewModel.getDisplayNetworkError() : null;
                updateRegistration(1, displayNetworkError);
                zSafeUnbox3 = androidx.databinding.ViewDataBinding.safeUnbox(displayNetworkError != null ? displayNetworkError.get() : null);
            } else {
                zSafeUnbox3 = false;
            }
            if ((j & 1540) == 0) {
                str3 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> nameField = createAccountViewModel != null ? createAccountViewModel.getNameField() : null;
                updateRegistration(2, nameField);
                if (nameField != null) {
                    str3 = nameField.get();
                } else {
                    str3 = null;
                }
            }
            if ((j & 1544) == 0) {
                str4 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> passwordField = createAccountViewModel != null ? createAccountViewModel.getPasswordField() : null;
                updateRegistration(3, passwordField);
                if (passwordField != null) {
                    str4 = passwordField.get();
                } else {
                    str4 = null;
                }
            }
            if ((j & 1552) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> observableFieldIsButtonVisible = createAccountViewModel != null ? createAccountViewModel.isButtonVisible() : null;
                updateRegistration(4, observableFieldIsButtonVisible);
                zSafeUnbox5 = androidx.databinding.ViewDataBinding.safeUnbox(observableFieldIsButtonVisible != null ? observableFieldIsButtonVisible.get() : null);
                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox5));
            } else {
                zSafeUnbox5 = false;
                zSafeUnbox4 = false;
            }
            if ((j & 1568) == 0) {
                str5 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> emailField = createAccountViewModel != null ? createAccountViewModel.getEmailField() : null;
                updateRegistration(5, emailField);
                if (emailField != null) {
                    str5 = emailField.get();
                } else {
                    str5 = null;
                }
            }
            if ((j & 1600) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> goToLoginLinkDisplayed = createAccountViewModel != null ? createAccountViewModel.getGoToLoginLinkDisplayed() : null;
                updateRegistration(6, goToLoginLinkDisplayed);
                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(goToLoginLinkDisplayed != null ? goToLoginLinkDisplayed.get() : null);
            } else {
                zSafeUnbox = false;
            }
            if ((j & 1664) != 0) {
                androidx.databinding.ObservableField<java.lang.String> confirmPasswordField = createAccountViewModel != null ? createAccountViewModel.getConfirmPasswordField() : null;
                updateRegistration(7, confirmPasswordField);
                str2 = confirmPasswordField != null ? confirmPasswordField.get() : null;
                if ((j & 1792) == 0) {
                    str = null;
                } else {
                    if (createAccountViewModel != null) {
                        errorMessage = createAccountViewModel.getErrorMessage();
                    } else {
                        errorMessage = null;
                    }
                    updateRegistration(8, errorMessage);
                    if (errorMessage != null) {
                        str = errorMessage.get();
                    } else {
                        str = null;
                    }
                }
                boolean z2 = zSafeUnbox5;
                onClickListenerImpl = value2;
                onClickListenerImpl1 = value3;
                z = z2;
            } else {
                str5 = str5;
            }
            if ((j & 1792) == 0) {
                str = null;
            } else {
                if (createAccountViewModel != null) {
                    errorMessage = createAccountViewModel.getErrorMessage();
                } else {
                    errorMessage = null;
                }
                updateRegistration(8, errorMessage);
                if (errorMessage != null) {
                    str = errorMessage.get();
                } else {
                    str = null;
                }
            }
            boolean z3 = zSafeUnbox5;
            onClickListenerImpl = value2;
            onClickListenerImpl1 = value3;
            z = z3;
        } else {
            str = null;
            str2 = null;
            zSafeUnbox = false;
            zSafeUnbox2 = false;
            onClickListenerImpl1 = null;
            zSafeUnbox3 = false;
            str3 = null;
            str4 = null;
            onClickListenerImpl = null;
            zSafeUnbox4 = false;
            str5 = null;
            z = false;
            value = null;
        }
        boolean z4 = zSafeUnbox2;
        if ((j & 1536) != 0) {
            this.createAccount.setOnClickListener(value);
            this.mboundView12.setOnClickListener(onClickListenerImpl1);
            this.mboundView7.setOnClickListener(onClickListenerImpl);
        }
        if ((j & 1552) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.createAccount, z);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView9, zSafeUnbox4);
        }
        if ((j & 1568) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.emailEditText, str5);
        }
        if ((android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null;
            androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged onTextChanged = (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null;
            androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged afterTextChanged = (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null;
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.emailEditText, beforeTextChanged, onTextChanged, afterTextChanged, this.emailEditTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.nameEditText, beforeTextChanged, onTextChanged, afterTextChanged, this.nameEditTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.passwordConfirmEditText, beforeTextChanged, onTextChanged, afterTextChanged, this.passwordConfirmEditTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.passwordEditText, beforeTextChanged, onTextChanged, afterTextChanged, this.passwordEditTextandroidTextAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.termsCheckBox, (android.widget.CompoundButton.OnCheckedChangeListener) null, this.termsCheckBoxandroidCheckedAttrChanged);
        }
        if ((1792 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, str);
        }
        if ((1600 & j) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView11, zSafeUnbox);
        }
        if ((j & 1538) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.showWithTimer(this.mboundView13, zSafeUnbox3);
        }
        if ((j & 1540) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nameEditText, str3);
        }
        if ((1664 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.passwordConfirmEditText, str2);
        }
        if ((1544 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.passwordEditText, str4);
        }
        if ((j & 1537) != 0) {
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.termsCheckBox, z4);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onTermsAndConditionsClicked(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.goToLogin(arg0);
        }
    }

    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBindingImpl.OnClickListenerImpl2 setValue(powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onCreateAccountClicked(arg0);
        }
    }
}
