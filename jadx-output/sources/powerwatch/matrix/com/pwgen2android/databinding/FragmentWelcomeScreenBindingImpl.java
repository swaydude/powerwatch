package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentWelcomeScreenBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBindingImpl.OnClickListenerImpl1 mViewModelOnLoginClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBindingImpl.OnClickListenerImpl mViewModelOnSignUpClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView2;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.carouselViewPager, 3);
    }

    public FragmentWelcomeScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }

    private FragmentWelcomeScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 0, (androidx.viewpager.widget.ViewPager) bindings[3], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton) bindings[1]);
        this.mDirtyFlags = -1L;
        this.gettingStartedButton.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[2];
        this.mboundView2 = fontableTextView;
        fontableTextView.setTag(null);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.setup.welcome.WelcomeScreenViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.setup.welcome.WelcomeScreenViewModel ViewModel) {
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
        powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBindingImpl.OnClickListenerImpl1 value;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.setup.welcome.WelcomeScreenViewModel welcomeScreenViewModel = this.mViewModel;
        long j2 = j & 3;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBindingImpl.OnClickListenerImpl value2 = null;
        if (j2 == 0 || welcomeScreenViewModel == null) {
            value = null;
        } else {
            powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnSignUpClickedAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBindingImpl.OnClickListenerImpl();
                this.mViewModelOnSignUpClickedAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            value2 = onClickListenerImpl.setValue(welcomeScreenViewModel);
            powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBindingImpl.OnClickListenerImpl1 onClickListenerImpl1 = this.mViewModelOnLoginClickedAndroidViewViewOnClickListener;
            if (onClickListenerImpl1 == null) {
                onClickListenerImpl1 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBindingImpl.OnClickListenerImpl1();
                this.mViewModelOnLoginClickedAndroidViewViewOnClickListener = onClickListenerImpl1;
            }
            value = onClickListenerImpl1.setValue(welcomeScreenViewModel);
        }
        if (j2 != 0) {
            this.gettingStartedButton.setOnClickListener(value2);
            this.mboundView2.setOnClickListener(value);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.welcome.WelcomeScreenViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.setup.welcome.WelcomeScreenViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onSignUpClicked(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.welcome.WelcomeScreenViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.setup.welcome.WelcomeScreenViewModel value) {
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
}
