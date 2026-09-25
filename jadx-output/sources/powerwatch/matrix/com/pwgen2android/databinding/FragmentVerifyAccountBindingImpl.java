package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentVerifyAccountBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBindingImpl.OnClickListenerImpl1 mViewModelOnContinueClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBindingImpl.OnClickListenerImpl mViewModelOnResendClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.FrameLayout mboundView1;
    private final android.widget.TextView mboundView2;
    private final android.widget.ProgressBar mboundView4;
    private final android.widget.TextView mboundView5;
    private final android.widget.TextView mboundView6;
    private final android.widget.TextView mboundView7;

    public FragmentVerifyAccountBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }

    private FragmentVerifyAccountBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 4, (android.widget.Button) bindings[3]);
        this.mDirtyFlags = -1L;
        this.continueButton.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) bindings[1];
        this.mboundView1 = frameLayout;
        frameLayout.setTag(null);
        android.widget.TextView textView = (android.widget.TextView) bindings[2];
        this.mboundView2 = textView;
        textView.setTag(null);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) bindings[4];
        this.mboundView4 = progressBar;
        progressBar.setTag(null);
        android.widget.TextView textView2 = (android.widget.TextView) bindings[5];
        this.mboundView5 = textView2;
        textView2.setTag(null);
        android.widget.TextView textView3 = (android.widget.TextView) bindings[6];
        this.mboundView6 = textView3;
        textView3.setTag(null);
        android.widget.TextView textView4 = (android.widget.TextView) bindings[7];
        this.mboundView7 = textView4;
        textView4.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 32L;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        if (localFieldId == 0) {
            return onChangeViewModelEmail((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 1) {
            return onChangeViewModelIsButtonVisible((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 2) {
            return onChangeViewModelInfoMessage((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId != 3) {
            return false;
        }
        return onChangeViewModelErrorMessage((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelEmail(androidx.databinding.ObservableField<java.lang.String> ViewModelEmail, int fieldId) {
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

    private boolean onChangeViewModelInfoMessage(androidx.databinding.ObservableField<java.lang.String> ViewModelInfoMessage, int fieldId) {
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

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBindingImpl.OnClickListenerImpl onClickListenerImpl;
        java.lang.String str;
        boolean zSafeUnbox;
        java.lang.String str2;
        java.lang.String str3;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBindingImpl.OnClickListenerImpl1 onClickListenerImpl1;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBindingImpl.OnClickListenerImpl value;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBindingImpl.OnClickListenerImpl1 value2;
        java.lang.String str4;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel verifyAccountViewModel = this.mViewModel;
        boolean z = false;
        if ((63 & j) != 0) {
            if ((j & 49) == 0) {
                str = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> email = verifyAccountViewModel != null ? verifyAccountViewModel.getEmail() : null;
                updateRegistration(0, email);
                if (email != null) {
                    str = email.get();
                } else {
                    str = null;
                }
            }
            if ((j & 50) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> observableFieldIsButtonVisible = verifyAccountViewModel != null ? verifyAccountViewModel.isButtonVisible() : null;
                updateRegistration(1, observableFieldIsButtonVisible);
                boolean zSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(observableFieldIsButtonVisible != null ? observableFieldIsButtonVisible.get() : null);
                z = zSafeUnbox2;
                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox2));
            } else {
                zSafeUnbox = false;
            }
            if ((j & 48) == 0 || verifyAccountViewModel == null) {
                value = null;
                value2 = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBindingImpl.OnClickListenerImpl onClickListenerImpl2 = this.mViewModelOnResendClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl2 == null) {
                    onClickListenerImpl2 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnResendClickedAndroidViewViewOnClickListener = onClickListenerImpl2;
                }
                value = onClickListenerImpl2.setValue(verifyAccountViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBindingImpl.OnClickListenerImpl1 onClickListenerImpl3 = this.mViewModelOnContinueClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl3 == null) {
                    onClickListenerImpl3 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBindingImpl.OnClickListenerImpl1();
                    this.mViewModelOnContinueClickedAndroidViewViewOnClickListener = onClickListenerImpl3;
                }
                value2 = onClickListenerImpl3.setValue(verifyAccountViewModel);
            }
            if ((j & 52) == 0) {
                str4 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> infoMessage = verifyAccountViewModel != null ? verifyAccountViewModel.getInfoMessage() : null;
                updateRegistration(2, infoMessage);
                if (infoMessage != null) {
                    str4 = infoMessage.get();
                } else {
                    str4 = null;
                }
            }
            if ((j & 56) == 0) {
                str3 = str4;
                onClickListenerImpl = value;
                onClickListenerImpl1 = value2;
                str2 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> errorMessage = verifyAccountViewModel != null ? verifyAccountViewModel.getErrorMessage() : null;
                updateRegistration(3, errorMessage);
                if (errorMessage != null) {
                    str3 = str4;
                    str2 = errorMessage.get();
                    onClickListenerImpl = value;
                    onClickListenerImpl1 = value2;
                } else {
                    str3 = str4;
                    onClickListenerImpl = value;
                    onClickListenerImpl1 = value2;
                    str2 = null;
                }
            }
        } else {
            onClickListenerImpl = null;
            str = null;
            zSafeUnbox = false;
            str2 = null;
            str3 = null;
            onClickListenerImpl1 = null;
        }
        if ((j & 48) != 0) {
            this.continueButton.setOnClickListener(onClickListenerImpl1);
            this.mboundView5.setOnClickListener(onClickListenerImpl);
        }
        if ((j & 50) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.continueButton, z);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView4, zSafeUnbox);
        }
        if ((49 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, str);
        }
        if ((56 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, str2);
        }
        if ((j & 52) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, str3);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onResendClicked(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel value) {
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
