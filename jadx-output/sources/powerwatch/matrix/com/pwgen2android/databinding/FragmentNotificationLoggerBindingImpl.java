package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentNotificationLoggerBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBindingImpl.OnClickListenerImpl1 mViewModelOnBackClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBindingImpl.OnClickListenerImpl2 mViewModelOnRemoveClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBindingImpl.OnClickListenerImpl mViewModelOnSharedClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final androidx.appcompat.widget.AppCompatButton mboundView3;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.toolbar_title, 4);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.logs_list, 5);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.scroll_button, 6);
    }

    public FragmentNotificationLoggerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }

    private FragmentNotificationLoggerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 0, (android.widget.ImageView) bindings[1], (androidx.recyclerview.widget.RecyclerView) bindings[5], (androidx.appcompat.widget.AppCompatButton) bindings[6], (android.widget.ImageView) bindings[2], (android.widget.TextView) bindings[4]);
        this.mDirtyFlags = -1L;
        this.backButton.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        androidx.appcompat.widget.AppCompatButton appCompatButton = (androidx.appcompat.widget.AppCompatButton) bindings[3];
        this.mboundView3 = appCompatButton;
        appCompatButton.setTag(null);
        this.shareButton.setTag(null);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel ViewModel) {
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
        powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBindingImpl.OnClickListenerImpl onClickListenerImpl;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBindingImpl.OnClickListenerImpl2 value;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel notificationLoggerViewModel = this.mViewModel;
        long j2 = j & 3;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBindingImpl.OnClickListenerImpl1 onClickListenerImpl1 = null;
        if (j2 == 0 || notificationLoggerViewModel == null) {
            onClickListenerImpl = null;
            value = null;
        } else {
            powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBindingImpl.OnClickListenerImpl onClickListenerImpl2 = this.mViewModelOnSharedClickedAndroidViewViewOnClickListener;
            if (onClickListenerImpl2 == null) {
                onClickListenerImpl2 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBindingImpl.OnClickListenerImpl();
                this.mViewModelOnSharedClickedAndroidViewViewOnClickListener = onClickListenerImpl2;
            }
            powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBindingImpl.OnClickListenerImpl value2 = onClickListenerImpl2.setValue(notificationLoggerViewModel);
            powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBindingImpl.OnClickListenerImpl1 onClickListenerImpl3 = this.mViewModelOnBackClickedAndroidViewViewOnClickListener;
            if (onClickListenerImpl3 == null) {
                onClickListenerImpl3 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBindingImpl.OnClickListenerImpl1();
                this.mViewModelOnBackClickedAndroidViewViewOnClickListener = onClickListenerImpl3;
            }
            powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBindingImpl.OnClickListenerImpl1 value3 = onClickListenerImpl3.setValue(notificationLoggerViewModel);
            powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBindingImpl.OnClickListenerImpl2 onClickListenerImpl4 = this.mViewModelOnRemoveClickedAndroidViewViewOnClickListener;
            if (onClickListenerImpl4 == null) {
                onClickListenerImpl4 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBindingImpl.OnClickListenerImpl2();
                this.mViewModelOnRemoveClickedAndroidViewViewOnClickListener = onClickListenerImpl4;
            }
            value = onClickListenerImpl4.setValue(notificationLoggerViewModel);
            onClickListenerImpl1 = value3;
            onClickListenerImpl = value2;
        }
        if (j2 != 0) {
            this.backButton.setOnClickListener(onClickListenerImpl1);
            this.mboundView3.setOnClickListener(value);
            this.shareButton.setOnClickListener(onClickListenerImpl);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) throws java.lang.Throwable {
            this.value.onSharedClicked(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onBackClicked(arg0);
        }
    }

    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBindingImpl.OnClickListenerImpl2 setValue(powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onRemoveClicked(arg0);
        }
    }
}
