package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentPermissionInfoBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBindingImpl.OnClickListenerImpl mViewModelOnDoneClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBindingImpl.OnClickListenerImpl1 mViewModelOnSkipClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.FrameLayout mboundView1;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView3;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.permissions_list, 4);
    }

    public FragmentPermissionInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }

    private FragmentPermissionInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 1, (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton) bindings[2], (androidx.recyclerview.widget.RecyclerView) bindings[4]);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel ViewModel) {
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
        return onChangeViewModelDoneEnabled((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelDoneEnabled(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelDoneEnabled, int fieldId) {
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
        powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBindingImpl.OnClickListenerImpl value;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBindingImpl.OnClickListenerImpl1 value2;
        boolean zSafeUnbox;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel permissionsInfoViewModel = this.mViewModel;
        long j2 = j & 7;
        boolean zSafeUnbox2 = false;
        android.graphics.drawable.Drawable drawable = null;
        if (j2 != 0) {
            if ((j & 6) == 0 || permissionsInfoViewModel == null) {
                value = null;
                value2 = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnDoneClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl == null) {
                    onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnDoneClickedAndroidViewViewOnClickListener = onClickListenerImpl;
                }
                value = onClickListenerImpl.setValue(permissionsInfoViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBindingImpl.OnClickListenerImpl1 onClickListenerImpl1 = this.mViewModelOnSkipClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl1 == null) {
                    onClickListenerImpl1 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBindingImpl.OnClickListenerImpl1();
                    this.mViewModelOnSkipClickedAndroidViewViewOnClickListener = onClickListenerImpl1;
                }
                value2 = onClickListenerImpl1.setValue(permissionsInfoViewModel);
            }
            androidx.databinding.ObservableField<java.lang.Boolean> doneEnabled = permissionsInfoViewModel != null ? permissionsInfoViewModel.getDoneEnabled() : null;
            updateRegistration(0, doneEnabled);
            zSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(doneEnabled != null ? doneEnabled.get() : null);
            if (j2 != 0) {
                j |= zSafeUnbox2 ? 16L : 8L;
            }
            drawable = androidx.appcompat.content.res.AppCompatResources.getDrawable(this.loginButton.getContext(), zSafeUnbox2 ? powerwatch.matrix.com.pwgen2android.R.drawable.rounded_red_button_background : powerwatch.matrix.com.pwgen2android.R.drawable.rounded_disabled_transparent_button);
            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox2));
        } else {
            value = null;
            value2 = null;
            zSafeUnbox = false;
        }
        if ((7 & j) != 0) {
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.loginButton, drawable);
            this.loginButton.setEnabled(zSafeUnbox2);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView3, zSafeUnbox);
        }
        if ((j & 6) != 0) {
            this.loginButton.setOnClickListener(value);
            this.mboundView3.setOnClickListener(value2);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel value) {
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
        private powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel value) {
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
