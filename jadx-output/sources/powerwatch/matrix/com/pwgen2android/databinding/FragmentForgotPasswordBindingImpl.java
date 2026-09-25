package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentForgotPasswordBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private androidx.databinding.InverseBindingListener emailEditTextandroidTextAttrChanged;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBindingImpl.OnClickListenerImpl mViewModelOnForgotPasswordClickedAndroidViewViewOnClickListener;
    private final android.widget.FrameLayout mboundView0;
    private final android.widget.LinearLayout mboundView2;
    private final android.widget.ProgressBar mboundView5;
    private final android.widget.TextView mboundView6;
    private final android.widget.FrameLayout mboundView7;
    private final android.widget.TextView mboundView8;
    private final android.widget.LinearLayout mboundView9;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.main_sync_circle, 10);
    }

    public FragmentForgotPasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }

    private FragmentForgotPasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 5, (android.widget.Button) bindings[4], (android.widget.EditText) bindings[3], (android.widget.LinearLayout) bindings[1], (powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView) bindings[10]);
        this.emailEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBindingImpl.1
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBindingImpl.this.emailEditText);
                powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel forgotPasswordViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBindingImpl.this.mViewModel;
                if (forgotPasswordViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> emailField = forgotPasswordViewModel.getEmailField();
                    if (emailField != null) {
                        emailField.set(textString);
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
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[2];
        this.mboundView2 = linearLayout;
        linearLayout.setTag(null);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) bindings[5];
        this.mboundView5 = progressBar;
        progressBar.setTag(null);
        android.widget.TextView textView = (android.widget.TextView) bindings[6];
        this.mboundView6 = textView;
        textView.setTag(null);
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) bindings[7];
        this.mboundView7 = frameLayout2;
        frameLayout2.setTag(null);
        android.widget.TextView textView2 = (android.widget.TextView) bindings[8];
        this.mboundView8 = textView2;
        textView2.setTag(null);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9 = linearLayout2;
        linearLayout2.setTag(null);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel ViewModel) {
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
            return onChangeViewModelResponseSuccess((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 2) {
            return onChangeViewModelIsButtonVisible((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 3) {
            return onChangeViewModelEmailField((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId != 4) {
            return false;
        }
        return onChangeViewModelErrorMessage((androidx.databinding.ObservableField) object, fieldId);
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

    private boolean onChangeViewModelEmailField(androidx.databinding.ObservableField<java.lang.String> ViewModelEmailField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeViewModelErrorMessage(androidx.databinding.ObservableField<java.lang.String> ViewModelErrorMessage, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d7  */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBindingImpl.OnClickListenerImpl value;
        boolean z;
        boolean zSafeUnbox;
        boolean z2;
        boolean z3;
        java.lang.String str;
        java.lang.String str2;
        boolean zSafeUnbox2;
        boolean zSafeUnbox3;
        boolean zSafeUnbox4;
        boolean z4;
        java.lang.String str3;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel forgotPasswordViewModel = this.mViewModel;
        if ((127 & j) != 0) {
            if ((j & 97) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> displayNetworkError = forgotPasswordViewModel != null ? forgotPasswordViewModel.getDisplayNetworkError() : null;
                updateRegistration(0, displayNetworkError);
                zSafeUnbox3 = androidx.databinding.ViewDataBinding.safeUnbox(displayNetworkError != null ? displayNetworkError.get() : null);
            } else {
                zSafeUnbox3 = false;
            }
            if ((j & 98) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> responseSuccess = forgotPasswordViewModel != null ? forgotPasswordViewModel.getResponseSuccess() : null;
                updateRegistration(1, responseSuccess);
                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(responseSuccess != null ? responseSuccess.get() : null);
                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox));
            } else {
                zSafeUnbox = false;
                zSafeUnbox4 = false;
            }
            if ((j & 100) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> observableFieldIsButtonVisible = forgotPasswordViewModel != null ? forgotPasswordViewModel.isButtonVisible() : null;
                updateRegistration(2, observableFieldIsButtonVisible);
                boolean zSafeUnbox5 = androidx.databinding.ViewDataBinding.safeUnbox(observableFieldIsButtonVisible != null ? observableFieldIsButtonVisible.get() : null);
                zSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox5));
                z4 = zSafeUnbox5;
            } else {
                zSafeUnbox2 = false;
                z4 = false;
            }
            if ((j & 104) == 0) {
                str3 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> emailField = forgotPasswordViewModel != null ? forgotPasswordViewModel.getEmailField() : null;
                updateRegistration(3, emailField);
                if (emailField != null) {
                    str3 = emailField.get();
                } else {
                    str3 = null;
                }
            }
            if ((j & 112) == 0) {
                str2 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> errorMessage = forgotPasswordViewModel != null ? forgotPasswordViewModel.getErrorMessage() : null;
                updateRegistration(4, errorMessage);
                if (errorMessage != null) {
                    str2 = errorMessage.get();
                } else {
                    str2 = null;
                }
            }
            if ((j & 96) == 0 || forgotPasswordViewModel == null) {
                value = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnForgotPasswordClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl == null) {
                    onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnForgotPasswordClickedAndroidViewViewOnClickListener = onClickListenerImpl;
                }
                value = onClickListenerImpl.setValue(forgotPasswordViewModel);
            }
            str = str3;
            z3 = zSafeUnbox3;
            z = zSafeUnbox4;
            z2 = z4;
        } else {
            value = null;
            z = false;
            zSafeUnbox = false;
            z2 = false;
            z3 = false;
            str = null;
            str2 = null;
            zSafeUnbox2 = false;
        }
        if ((j & 96) != 0) {
            this.createAccount.setOnClickListener(value);
        }
        if ((100 & j) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.createAccount, z2);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView5, zSafeUnbox2);
        }
        if ((104 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.emailEditText, str);
        }
        if ((64 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.emailEditText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, this.emailEditTextandroidTextAttrChanged);
        }
        if ((98 & j) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView2, z);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView7, zSafeUnbox);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView8, zSafeUnbox);
        }
        if ((112 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, str2);
        }
        if ((j & 97) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.showWithTimer(this.mboundView9, z3);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel value) {
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
