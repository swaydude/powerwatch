package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentChangePasswordBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBindingImpl.OnClickListenerImpl mViewModelOnChangePasswordClickedAndroidViewViewOnClickListener;
    private final android.widget.FrameLayout mboundView0;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView10;
    private final android.widget.LinearLayout mboundView11;
    private final android.widget.LinearLayout mboundView2;
    private final android.widget.ProgressBar mboundView7;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView8;
    private final android.widget.FrameLayout mboundView9;
    private androidx.databinding.InverseBindingListener oldPasswordEditTextandroidTextAttrChanged;
    private androidx.databinding.InverseBindingListener passwordConfirmEditTextandroidTextAttrChanged;
    private androidx.databinding.InverseBindingListener passwordEditTextandroidTextAttrChanged;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.biometrics_container, 12);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.main_sync_circle, 13);
    }

    public FragmentChangePasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }

    private FragmentChangePasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 7, (android.widget.FrameLayout) bindings[12], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton) bindings[6], (android.widget.LinearLayout) bindings[1], (powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView) bindings[13], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText) bindings[3], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText) bindings[5], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText) bindings[4]);
        this.oldPasswordEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBindingImpl.1
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBindingImpl.this.oldPasswordEditText);
                powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel changePasswordViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBindingImpl.this.mViewModel;
                if (changePasswordViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> oldPasswordField = changePasswordViewModel.getOldPasswordField();
                    if (oldPasswordField != null) {
                        oldPasswordField.set(textString);
                    }
                }
            }
        };
        this.passwordConfirmEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBindingImpl.2
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBindingImpl.this.passwordConfirmEditText);
                powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel changePasswordViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBindingImpl.this.mViewModel;
                if (changePasswordViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> confirmPasswordField = changePasswordViewModel.getConfirmPasswordField();
                    if (confirmPasswordField != null) {
                        confirmPasswordField.set(textString);
                    }
                }
            }
        };
        this.passwordEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBindingImpl.3
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBindingImpl.this.passwordEditText);
                powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel changePasswordViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBindingImpl.this.mViewModel;
                if (changePasswordViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> passwordField = changePasswordViewModel.getPasswordField();
                    if (passwordField != null) {
                        passwordField.set(textString);
                    }
                }
            }
        };
        this.mDirtyFlags = -1L;
        this.createAccount.setTag(null);
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
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2 = linearLayout2;
        linearLayout2.setTag(null);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) bindings[7];
        this.mboundView7 = progressBar;
        progressBar.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView2 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[8];
        this.mboundView8 = fontableTextView2;
        fontableTextView2.setTag(null);
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) bindings[9];
        this.mboundView9 = frameLayout2;
        frameLayout2.setTag(null);
        this.oldPasswordEditText.setTag(null);
        this.passwordConfirmEditText.setTag(null);
        this.passwordEditText.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 256L;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return onChangeViewModelDisplayNetworkError((androidx.databinding.ObservableField) object, fieldId);
            case 1:
                return onChangeViewModelResponseSuccess((androidx.databinding.ObservableField) object, fieldId);
            case 2:
                return onChangeViewModelIsButtonVisible((androidx.databinding.ObservableField) object, fieldId);
            case 3:
                return onChangeViewModelOldPasswordField((androidx.databinding.ObservableField) object, fieldId);
            case 4:
                return onChangeViewModelConfirmPasswordField((androidx.databinding.ObservableField) object, fieldId);
            case 5:
                return onChangeViewModelErrorMessage((androidx.databinding.ObservableField) object, fieldId);
            case 6:
                return onChangeViewModelPasswordField((androidx.databinding.ObservableField) object, fieldId);
            default:
                return false;
        }
    }

    private boolean onChangeViewModelDisplayNetworkError(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelDisplayNetworkError, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelResponseSuccess(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelResponseSuccess, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelIsButtonVisible(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsButtonVisible, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeViewModelOldPasswordField(androidx.databinding.ObservableField<java.lang.String> ViewModelOldPasswordField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeViewModelConfirmPasswordField(androidx.databinding.ObservableField<java.lang.String> ViewModelConfirmPasswordField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeViewModelErrorMessage(androidx.databinding.ObservableField<java.lang.String> ViewModelErrorMessage, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeViewModelPasswordField(androidx.databinding.ObservableField<java.lang.String> ViewModelPasswordField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:75:0x010e  */
    /* JADX WARN: Code duplicated, block: B:84:0x012d  */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        java.lang.String str;
        boolean z;
        boolean zSafeUnbox;
        boolean z2;
        boolean z3;
        boolean z4;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBindingImpl.OnClickListenerImpl value;
        boolean zSafeUnbox2;
        boolean zSafeUnbox3;
        boolean zSafeUnbox4;
        boolean zSafeUnbox5;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel changePasswordViewModel = this.mViewModel;
        if ((511 & j) != 0) {
            if ((j & 385) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> displayNetworkError = changePasswordViewModel != null ? changePasswordViewModel.getDisplayNetworkError() : null;
                updateRegistration(0, displayNetworkError);
                zSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(displayNetworkError != null ? displayNetworkError.get() : null);
            } else {
                zSafeUnbox2 = false;
            }
            if ((j & 386) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> responseSuccess = changePasswordViewModel != null ? changePasswordViewModel.getResponseSuccess() : null;
                updateRegistration(1, responseSuccess);
                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(responseSuccess != null ? responseSuccess.get() : null);
                zSafeUnbox3 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox));
            } else {
                zSafeUnbox = false;
                zSafeUnbox3 = false;
            }
            if ((j & 388) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> observableFieldIsButtonVisible = changePasswordViewModel != null ? changePasswordViewModel.isButtonVisible() : null;
                updateRegistration(2, observableFieldIsButtonVisible);
                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(observableFieldIsButtonVisible != null ? observableFieldIsButtonVisible.get() : null);
                zSafeUnbox5 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox4));
            } else {
                zSafeUnbox4 = false;
                zSafeUnbox5 = false;
            }
            if ((j & 384) == 0 || changePasswordViewModel == null) {
                value = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnChangePasswordClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl == null) {
                    onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnChangePasswordClickedAndroidViewViewOnClickListener = onClickListenerImpl;
                }
                value = onClickListenerImpl.setValue(changePasswordViewModel);
            }
            if ((j & 392) == 0) {
                str3 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> oldPasswordField = changePasswordViewModel != null ? changePasswordViewModel.getOldPasswordField() : null;
                updateRegistration(3, oldPasswordField);
                if (oldPasswordField != null) {
                    str3 = oldPasswordField.get();
                } else {
                    str3 = null;
                }
            }
            if ((j & 400) == 0) {
                str4 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> confirmPasswordField = changePasswordViewModel != null ? changePasswordViewModel.getConfirmPasswordField() : null;
                updateRegistration(4, confirmPasswordField);
                if (confirmPasswordField != null) {
                    str4 = confirmPasswordField.get();
                } else {
                    str4 = null;
                }
            }
            if ((j & 416) == 0) {
                str2 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> errorMessage = changePasswordViewModel != null ? changePasswordViewModel.getErrorMessage() : null;
                updateRegistration(5, errorMessage);
                if (errorMessage != null) {
                    str2 = errorMessage.get();
                } else {
                    str2 = null;
                }
            }
            if ((j & 448) == 0) {
                str = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> passwordField = changePasswordViewModel != null ? changePasswordViewModel.getPasswordField() : null;
                updateRegistration(6, passwordField);
                if (passwordField != null) {
                    str = passwordField.get();
                } else {
                    str = null;
                }
            }
            z4 = zSafeUnbox2;
            z = zSafeUnbox5;
            boolean z5 = zSafeUnbox4;
            z3 = zSafeUnbox3;
            z2 = z5;
        } else {
            str = null;
            z = false;
            zSafeUnbox = false;
            z2 = false;
            z3 = false;
            z4 = false;
            str2 = null;
            str3 = null;
            str4 = null;
            value = null;
        }
        if ((j & 384) != 0) {
            this.createAccount.setOnClickListener(value);
        }
        if ((j & 388) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.createAccount, z2);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView7, z);
        }
        if ((j & 386) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView10, zSafeUnbox);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView2, z3);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView9, zSafeUnbox);
        }
        if ((j & 385) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.showWithTimer(this.mboundView11, z4);
        }
        if ((416 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, str2);
        }
        if ((392 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.oldPasswordEditText, str3);
        }
        if ((256 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null;
            androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged onTextChanged = (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null;
            androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged afterTextChanged = (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null;
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.oldPasswordEditText, beforeTextChanged, onTextChanged, afterTextChanged, this.oldPasswordEditTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.passwordConfirmEditText, beforeTextChanged, onTextChanged, afterTextChanged, this.passwordConfirmEditTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.passwordEditText, beforeTextChanged, onTextChanged, afterTextChanged, this.passwordEditTextandroidTextAttrChanged);
        }
        if ((400 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.passwordConfirmEditText, str4);
        }
        if ((j & 448) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.passwordEditText, str);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onChangePasswordClicked(arg0);
        }
    }
}
