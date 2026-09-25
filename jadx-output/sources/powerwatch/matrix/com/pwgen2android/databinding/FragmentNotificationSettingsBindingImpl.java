package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentNotificationSettingsBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private androidx.databinding.InverseBindingListener batteryNotificationandroidCheckedAttrChanged;
    private androidx.databinding.InverseBindingListener connectionNotificationandroidCheckedAttrChanged;
    private androidx.databinding.InverseBindingListener goalsNotificationsandroidCheckedAttrChanged;
    private long mDirtyFlags;
    private final android.widget.LinearLayout mboundView0;

    public FragmentNotificationSettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }

    private FragmentNotificationSettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 3, (androidx.appcompat.widget.SwitchCompat) bindings[2], (androidx.appcompat.widget.SwitchCompat) bindings[1], (androidx.appcompat.widget.SwitchCompat) bindings[3]);
        this.batteryNotificationandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBindingImpl.1
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                boolean zIsChecked = powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBindingImpl.this.batteryNotification.isChecked();
                powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM notificationSettingsVM = powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBindingImpl.this.mViewModel;
                if (notificationSettingsVM != null) {
                    androidx.databinding.ObservableField<java.lang.Boolean> batteryNotificationStatus = notificationSettingsVM.getBatteryNotificationStatus();
                    if (batteryNotificationStatus != null) {
                        batteryNotificationStatus.set(java.lang.Boolean.valueOf(zIsChecked));
                    }
                }
            }
        };
        this.connectionNotificationandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBindingImpl.2
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                boolean zIsChecked = powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBindingImpl.this.connectionNotification.isChecked();
                powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM notificationSettingsVM = powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBindingImpl.this.mViewModel;
                if (notificationSettingsVM != null) {
                    androidx.databinding.ObservableField<java.lang.Boolean> connectionNotificationStatus = notificationSettingsVM.getConnectionNotificationStatus();
                    if (connectionNotificationStatus != null) {
                        connectionNotificationStatus.set(java.lang.Boolean.valueOf(zIsChecked));
                    }
                }
            }
        };
        this.goalsNotificationsandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBindingImpl.3
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                boolean zIsChecked = powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBindingImpl.this.goalsNotifications.isChecked();
                powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM notificationSettingsVM = powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBindingImpl.this.mViewModel;
                if (notificationSettingsVM != null) {
                    androidx.databinding.ObservableField<java.lang.Boolean> goalsNotificationStatus = notificationSettingsVM.getGoalsNotificationStatus();
                    if (goalsNotificationStatus != null) {
                        goalsNotificationStatus.set(java.lang.Boolean.valueOf(zIsChecked));
                    }
                }
            }
        };
        this.mDirtyFlags = -1L;
        this.batteryNotification.setTag(null);
        this.connectionNotification.setTag(null);
        this.goalsNotifications.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 16L;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        if (localFieldId == 0) {
            return onChangeViewModelGoalsNotificationStatus((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 1) {
            return onChangeViewModelBatteryNotificationStatus((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId != 2) {
            return false;
        }
        return onChangeViewModelConnectionNotificationStatus((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelGoalsNotificationStatus(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelGoalsNotificationStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelBatteryNotificationStatus(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelBatteryNotificationStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelConnectionNotificationStatus(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelConnectionNotificationStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        boolean zSafeUnbox;
        boolean zSafeUnbox2;
        boolean z;
        boolean zSafeUnbox3;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM notificationSettingsVM = this.mViewModel;
        if ((31 & j) != 0) {
            if ((j & 25) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> goalsNotificationStatus = notificationSettingsVM != null ? notificationSettingsVM.getGoalsNotificationStatus() : null;
                updateRegistration(0, goalsNotificationStatus);
                zSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(goalsNotificationStatus != null ? goalsNotificationStatus.get() : null);
            } else {
                zSafeUnbox2 = false;
            }
            if ((j & 26) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> batteryNotificationStatus = notificationSettingsVM != null ? notificationSettingsVM.getBatteryNotificationStatus() : null;
                updateRegistration(1, batteryNotificationStatus);
                zSafeUnbox3 = androidx.databinding.ViewDataBinding.safeUnbox(batteryNotificationStatus != null ? batteryNotificationStatus.get() : null);
            } else {
                zSafeUnbox3 = false;
            }
            if ((j & 28) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> connectionNotificationStatus = notificationSettingsVM != null ? notificationSettingsVM.getConnectionNotificationStatus() : null;
                updateRegistration(2, connectionNotificationStatus);
                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(connectionNotificationStatus != null ? connectionNotificationStatus.get() : null);
                z = zSafeUnbox3;
            } else {
                z = zSafeUnbox3;
                zSafeUnbox = false;
            }
        } else {
            zSafeUnbox = false;
            zSafeUnbox2 = false;
            z = false;
        }
        if ((26 & j) != 0) {
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.batteryNotification, z);
        }
        if ((16 & j) != 0) {
            android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener = (android.widget.CompoundButton.OnCheckedChangeListener) null;
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.batteryNotification, onCheckedChangeListener, this.batteryNotificationandroidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.connectionNotification, onCheckedChangeListener, this.connectionNotificationandroidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.goalsNotifications, onCheckedChangeListener, this.goalsNotificationsandroidCheckedAttrChanged);
        }
        if ((j & 28) != 0) {
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.connectionNotification, zSafeUnbox);
        }
        if ((j & 25) != 0) {
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.goalsNotifications, zSafeUnbox2);
        }
    }
}
