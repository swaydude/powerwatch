package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentSignInBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private androidx.databinding.InverseBindingListener emailEditTextandroidTextAttrChanged;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.OnClickListenerImpl mViewModelOnCreateAccountClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.OnClickListenerImpl2 mViewModelOnForgotPasswordClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.OnClickListenerImpl1 mViewModelOnLoginClickedAndroidViewViewOnClickListener;
    private final android.widget.FrameLayout mboundView0;
    private final android.widget.LinearLayout mboundView10;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView4;
    private final android.widget.ProgressBar mboundView6;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView7;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView8;
    private androidx.databinding.InverseBindingListener passwordEditTextandroidTextAttrChanged;

    public FragmentSignInBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }

    private FragmentSignInBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 5, (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText) bindings[2], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[9], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton) bindings[5], (android.widget.LinearLayout) bindings[1], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText) bindings[3]);
        this.emailEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.1
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.this.emailEditText);
                powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel signInViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.this.mViewModel;
                if (signInViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> emailField = signInViewModel.getEmailField();
                    if (emailField != null) {
                        emailField.set(textString);
                    }
                }
            }
        };
        this.passwordEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.2
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.this.passwordEditText);
                powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel signInViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.this.mViewModel;
                if (signInViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> passwordField = signInViewModel.getPasswordField();
                    if (passwordField != null) {
                        passwordField.set(textString);
                    }
                }
            }
        };
        this.mDirtyFlags = -1L;
        this.emailEditText.setTag(null);
        this.errorTextView.setTag(null);
        this.loginButton.setTag(null);
        this.loginDetails.setTag(null);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) bindings[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[10];
        this.mboundView10 = linearLayout;
        linearLayout.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[4];
        this.mboundView4 = fontableTextView;
        fontableTextView.setTag(null);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) bindings[6];
        this.mboundView6 = progressBar;
        progressBar.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView2 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[7];
        this.mboundView7 = fontableTextView2;
        fontableTextView2.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView3 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[8];
        this.mboundView8 = fontableTextView3;
        fontableTextView3.setTag(null);
        this.passwordEditText.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 64L;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        if (localFieldId == 0) {
            return onChangeViewModelDisplayNetworkError((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 1) {
            return onChangeViewModelIsButtonVisible((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 2) {
            return onChangeViewModelEmailField((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 3) {
            return onChangeViewModelErrorMessage((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId != 4) {
            return false;
        }
        return onChangeViewModelPasswordField((androidx.databinding.ObservableField) object, fieldId);
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

    private boolean onChangeViewModelIsButtonVisible(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsButtonVisible, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelEmailField(androidx.databinding.ObservableField<java.lang.String> ViewModelEmailField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeViewModelErrorMessage(androidx.databinding.ObservableField<java.lang.String> ViewModelErrorMessage, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeViewModelPasswordField(androidx.databinding.ObservableField<java.lang.String> ViewModelPasswordField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00df  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fd  */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        java.lang.String str;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.OnClickListenerImpl value;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.OnClickListenerImpl1 value2;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.OnClickListenerImpl2 value3;
        java.lang.String str2;
        java.lang.String str3;
        boolean zSafeUnbox;
        boolean zSafeUnbox2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel signInViewModel = this.mViewModel;
        boolean zSafeUnbox3 = false;
        if ((127 & j) != 0) {
            if ((j & 96) == 0 || signInViewModel == null) {
                value = null;
                value2 = null;
                value3 = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnCreateAccountClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl == null) {
                    onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnCreateAccountClickedAndroidViewViewOnClickListener = onClickListenerImpl;
                }
                value = onClickListenerImpl.setValue(signInViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.OnClickListenerImpl1 onClickListenerImpl1 = this.mViewModelOnLoginClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl1 == null) {
                    onClickListenerImpl1 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.OnClickListenerImpl1();
                    this.mViewModelOnLoginClickedAndroidViewViewOnClickListener = onClickListenerImpl1;
                }
                value2 = onClickListenerImpl1.setValue(signInViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.OnClickListenerImpl2 onClickListenerImpl2 = this.mViewModelOnForgotPasswordClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl2 == null) {
                    onClickListenerImpl2 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.OnClickListenerImpl2();
                    this.mViewModelOnForgotPasswordClickedAndroidViewViewOnClickListener = onClickListenerImpl2;
                }
                value3 = onClickListenerImpl2.setValue(signInViewModel);
            }
            if ((j & 97) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> displayNetworkError = signInViewModel != null ? signInViewModel.getDisplayNetworkError() : null;
                updateRegistration(0, displayNetworkError);
                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(displayNetworkError != null ? displayNetworkError.get() : null);
            } else {
                zSafeUnbox = false;
            }
            if ((j & 98) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> observableFieldIsButtonVisible = signInViewModel != null ? signInViewModel.isButtonVisible() : null;
                updateRegistration(1, observableFieldIsButtonVisible);
                zSafeUnbox3 = androidx.databinding.ViewDataBinding.safeUnbox(observableFieldIsButtonVisible != null ? observableFieldIsButtonVisible.get() : null);
                zSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox3));
            } else {
                zSafeUnbox2 = false;
            }
            if ((j & 100) == 0) {
                str2 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> emailField = signInViewModel != null ? signInViewModel.getEmailField() : null;
                updateRegistration(2, emailField);
                if (emailField != null) {
                    str2 = emailField.get();
                } else {
                    str2 = null;
                }
            }
            if ((j & 104) == 0) {
                str3 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> errorMessage = signInViewModel != null ? signInViewModel.getErrorMessage() : null;
                updateRegistration(3, errorMessage);
                if (errorMessage != null) {
                    str3 = errorMessage.get();
                } else {
                    str3 = null;
                }
            }
            if ((j & 112) == 0) {
                str = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> passwordField = signInViewModel != null ? signInViewModel.getPasswordField() : null;
                updateRegistration(4, passwordField);
                if (passwordField != null) {
                    str = passwordField.get();
                } else {
                    str = null;
                }
            }
        } else {
            str = null;
            value = null;
            value2 = null;
            value3 = null;
            str2 = null;
            str3 = null;
            zSafeUnbox = false;
            zSafeUnbox2 = false;
        }
        if ((j & 100) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.emailEditText, str2);
        }
        if ((64 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null;
            androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged onTextChanged = (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null;
            androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged afterTextChanged = (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null;
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.emailEditText, beforeTextChanged, onTextChanged, afterTextChanged, this.emailEditTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.passwordEditText, beforeTextChanged, onTextChanged, afterTextChanged, this.passwordEditTextandroidTextAttrChanged);
        }
        if ((104 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.errorTextView, str3);
        }
        if ((j & 96) != 0) {
            this.loginButton.setOnClickListener(value2);
            this.mboundView4.setOnClickListener(value3);
            this.mboundView7.setOnClickListener(value2);
            this.mboundView8.setOnClickListener(value);
        }
        if ((98 & j) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.loginButton, zSafeUnbox3);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView6, zSafeUnbox2);
        }
        if ((97 & j) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.showWithTimer(this.mboundView10, zSafeUnbox);
        }
        if ((j & 112) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.passwordEditText, str);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel value) {
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

    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onLoginClicked(arg0);
        }
    }

    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBindingImpl.OnClickListenerImpl2 setValue(powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onForgotPasswordClicked(arg0);
        }
    }
}
