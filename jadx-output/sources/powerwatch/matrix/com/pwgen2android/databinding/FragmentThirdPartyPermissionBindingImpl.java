package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentThirdPartyPermissionBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentThirdPartyPermissionBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentThirdPartyPermissionBindingImpl.OnClickListenerImpl mViewModelOnDoneClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentThirdPartyPermissionBindingImpl.OnClickListenerImpl1 mViewModelOnSkipClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.FrameLayout mboundView1;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView3;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.permissions_list, 4);
    }

    public FragmentThirdPartyPermissionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }

    private FragmentThirdPartyPermissionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 0, (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton) bindings[2], (androidx.recyclerview.widget.RecyclerView) bindings[4]);
        this.mDirtyFlags = -1L;
        this.loginButton.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) bindings[1];
        this.mboundView1 = frameLayout;
        frameLayout.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[3];
        this.mboundView3 = fontableTextView;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentThirdPartyPermissionBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel ViewModel) {
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
        powerwatch.matrix.com.pwgen2android.databinding.FragmentThirdPartyPermissionBindingImpl.OnClickListenerImpl1 value;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel thirdPartyPermissionViewModel = this.mViewModel;
        long j2 = j & 3;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentThirdPartyPermissionBindingImpl.OnClickListenerImpl value2 = null;
        if (j2 == 0 || thirdPartyPermissionViewModel == null) {
            value = null;
        } else {
            powerwatch.matrix.com.pwgen2android.databinding.FragmentThirdPartyPermissionBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnDoneClickedAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentThirdPartyPermissionBindingImpl.OnClickListenerImpl();
                this.mViewModelOnDoneClickedAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            value2 = onClickListenerImpl.setValue(thirdPartyPermissionViewModel);
            powerwatch.matrix.com.pwgen2android.databinding.FragmentThirdPartyPermissionBindingImpl.OnClickListenerImpl1 onClickListenerImpl1 = this.mViewModelOnSkipClickedAndroidViewViewOnClickListener;
            if (onClickListenerImpl1 == null) {
                onClickListenerImpl1 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentThirdPartyPermissionBindingImpl.OnClickListenerImpl1();
                this.mViewModelOnSkipClickedAndroidViewViewOnClickListener = onClickListenerImpl1;
            }
            value = onClickListenerImpl1.setValue(thirdPartyPermissionViewModel);
        }
        if (j2 != 0) {
            this.loginButton.setOnClickListener(value2);
            this.mboundView3.setOnClickListener(value);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentThirdPartyPermissionBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onDoneClicked(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentThirdPartyPermissionBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onSkipClicked(arg0);
        }
    }
}
