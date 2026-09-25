package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentShareActivityBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentShareActivityBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentShareActivityBindingImpl.OnClickListenerImpl1 mViewModelOnCancelClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentShareActivityBindingImpl.OnClickListenerImpl2 mViewModelOnGPXClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentShareActivityBindingImpl.OnClickListenerImpl mViewModelOnTCXClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView1;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView2;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView3;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        return false;
    }

    public FragmentShareActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }

    private FragmentShareActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 0);
        this.mDirtyFlags = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[1];
        this.mboundView1 = fontableTextView;
        fontableTextView.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView2 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[2];
        this.mboundView2 = fontableTextView2;
        fontableTextView2.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView3 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[3];
        this.mboundView3 = fontableTextView3;
        fontableTextView3.setTag(null);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentShareActivityBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel ViewModel) {
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
        powerwatch.matrix.com.pwgen2android.databinding.FragmentShareActivityBindingImpl.OnClickListenerImpl1 value;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentShareActivityBindingImpl.OnClickListenerImpl2 value2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel shareViewModel = this.mViewModel;
        long j2 = j & 3;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentShareActivityBindingImpl.OnClickListenerImpl value3 = null;
        if (j2 == 0 || shareViewModel == null) {
            value = null;
            value2 = null;
        } else {
            powerwatch.matrix.com.pwgen2android.databinding.FragmentShareActivityBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnTCXClickedAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentShareActivityBindingImpl.OnClickListenerImpl();
                this.mViewModelOnTCXClickedAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            value3 = onClickListenerImpl.setValue(shareViewModel);
            powerwatch.matrix.com.pwgen2android.databinding.FragmentShareActivityBindingImpl.OnClickListenerImpl1 onClickListenerImpl1 = this.mViewModelOnCancelClickedAndroidViewViewOnClickListener;
            if (onClickListenerImpl1 == null) {
                onClickListenerImpl1 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentShareActivityBindingImpl.OnClickListenerImpl1();
                this.mViewModelOnCancelClickedAndroidViewViewOnClickListener = onClickListenerImpl1;
            }
            value = onClickListenerImpl1.setValue(shareViewModel);
            powerwatch.matrix.com.pwgen2android.databinding.FragmentShareActivityBindingImpl.OnClickListenerImpl2 onClickListenerImpl2 = this.mViewModelOnGPXClickedAndroidViewViewOnClickListener;
            if (onClickListenerImpl2 == null) {
                onClickListenerImpl2 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentShareActivityBindingImpl.OnClickListenerImpl2();
                this.mViewModelOnGPXClickedAndroidViewViewOnClickListener = onClickListenerImpl2;
            }
            value2 = onClickListenerImpl2.setValue(shareViewModel);
        }
        if (j2 != 0) {
            this.mboundView1.setOnClickListener(value3);
            this.mboundView2.setOnClickListener(value2);
            this.mboundView3.setOnClickListener(value);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentShareActivityBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onTCXClicked(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentShareActivityBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onCancelClicked(arg0);
        }
    }

    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentShareActivityBindingImpl.OnClickListenerImpl2 setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onGPXClicked(arg0);
        }
    }
}
