package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentUnpairWatchBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBindingImpl.OnClickListenerImpl2 mViewModelOnCancelClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBindingImpl.OnClickListenerImpl mViewModelOnUnpairAndResetClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBindingImpl.OnClickListenerImpl1 mViewModelOnUnpairClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView1;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView2;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView3;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        return false;
    }

    public FragmentUnpairWatchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }

    private FragmentUnpairWatchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
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
        setViewModel((powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM ViewModel) {
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
        powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBindingImpl.OnClickListenerImpl onClickListenerImpl;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBindingImpl.OnClickListenerImpl2 value;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM unpairDialogVM = this.mViewModel;
        long j2 = j & 3;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBindingImpl.OnClickListenerImpl1 onClickListenerImpl1 = null;
        if (j2 == 0 || unpairDialogVM == null) {
            onClickListenerImpl = null;
            value = null;
        } else {
            powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBindingImpl.OnClickListenerImpl onClickListenerImpl2 = this.mViewModelOnUnpairAndResetClickedAndroidViewViewOnClickListener;
            if (onClickListenerImpl2 == null) {
                onClickListenerImpl2 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBindingImpl.OnClickListenerImpl();
                this.mViewModelOnUnpairAndResetClickedAndroidViewViewOnClickListener = onClickListenerImpl2;
            }
            powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBindingImpl.OnClickListenerImpl value2 = onClickListenerImpl2.setValue(unpairDialogVM);
            powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBindingImpl.OnClickListenerImpl1 onClickListenerImpl3 = this.mViewModelOnUnpairClickedAndroidViewViewOnClickListener;
            if (onClickListenerImpl3 == null) {
                onClickListenerImpl3 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBindingImpl.OnClickListenerImpl1();
                this.mViewModelOnUnpairClickedAndroidViewViewOnClickListener = onClickListenerImpl3;
            }
            powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBindingImpl.OnClickListenerImpl1 value3 = onClickListenerImpl3.setValue(unpairDialogVM);
            powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBindingImpl.OnClickListenerImpl2 onClickListenerImpl4 = this.mViewModelOnCancelClickedAndroidViewViewOnClickListener;
            if (onClickListenerImpl4 == null) {
                onClickListenerImpl4 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBindingImpl.OnClickListenerImpl2();
                this.mViewModelOnCancelClickedAndroidViewViewOnClickListener = onClickListenerImpl4;
            }
            value = onClickListenerImpl4.setValue(unpairDialogVM);
            onClickListenerImpl1 = value3;
            onClickListenerImpl = value2;
        }
        if (j2 != 0) {
            this.mboundView1.setOnClickListener(onClickListenerImpl1);
            this.mboundView2.setOnClickListener(onClickListenerImpl);
            this.mboundView3.setOnClickListener(value);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onUnpairAndResetClicked(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onUnpairClicked(arg0);
        }
    }

    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBindingImpl.OnClickListenerImpl2 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM value) {
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
}
