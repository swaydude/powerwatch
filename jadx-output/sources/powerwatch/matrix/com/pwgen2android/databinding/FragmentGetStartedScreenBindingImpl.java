package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentGetStartedScreenBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentGetStartedScreenBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentGetStartedScreenBindingImpl.OnClickListenerImpl mViewModelOnNextClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.ProgressBar mboundView2;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.biometrics_container, 3);
    }

    public FragmentGetStartedScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }

    private FragmentGetStartedScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 1, (android.widget.FrameLayout) bindings[3], (android.widget.Button) bindings[1]);
        this.mDirtyFlags = -1L;
        this.loginButton.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) bindings[2];
        this.mboundView2 = progressBar;
        progressBar.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4L;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentGetStartedScreenBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return onChangeViewModelIsButtonVisible((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelIsButtonVisible(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsButtonVisible, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        boolean zSafeUnbox;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentGetStartedScreenBindingImpl.OnClickListenerImpl value;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel getStartedViewModel = this.mViewModel;
        long j2 = 7 & j;
        boolean zSafeUnbox2 = false;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentGetStartedScreenBindingImpl.OnClickListenerImpl onClickListenerImpl = null;
        if (j2 != 0) {
            if ((j & 6) == 0 || getStartedViewModel == null) {
                value = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentGetStartedScreenBindingImpl.OnClickListenerImpl onClickListenerImpl2 = this.mViewModelOnNextClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl2 == null) {
                    onClickListenerImpl2 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentGetStartedScreenBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnNextClickedAndroidViewViewOnClickListener = onClickListenerImpl2;
                }
                value = onClickListenerImpl2.setValue(getStartedViewModel);
            }
            androidx.databinding.ObservableField<java.lang.Boolean> observableFieldIsButtonVisible = getStartedViewModel != null ? getStartedViewModel.isButtonVisible() : null;
            updateRegistration(0, observableFieldIsButtonVisible);
            zSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(observableFieldIsButtonVisible != null ? observableFieldIsButtonVisible.get() : null);
            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox2));
            onClickListenerImpl = value;
        } else {
            zSafeUnbox = false;
        }
        if ((j & 6) != 0) {
            this.loginButton.setOnClickListener(onClickListenerImpl);
        }
        if (j2 != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.loginButton, zSafeUnbox2);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView2, zSafeUnbox);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentGetStartedScreenBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onNextClicked(arg0);
        }
    }
}
