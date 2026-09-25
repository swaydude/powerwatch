package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentNotificationSettingsBinding extends androidx.databinding.ViewDataBinding {
    public final androidx.appcompat.widget.SwitchCompat batteryNotification;
    public final androidx.appcompat.widget.SwitchCompat connectionNotification;
    public final androidx.appcompat.widget.SwitchCompat goalsNotifications;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM mViewModel;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM viewModel);

    protected FragmentNotificationSettingsBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, androidx.appcompat.widget.SwitchCompat batteryNotification, androidx.appcompat.widget.SwitchCompat connectionNotification, androidx.appcompat.widget.SwitchCompat goalsNotifications) {
        super(_bindingComponent, _root, _localFieldCount);
        this.batteryNotification = batteryNotification;
        this.connectionNotification = connectionNotification;
        this.goalsNotifications = goalsNotifications;
    }

    public powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_notification_settings, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_notification_settings, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationSettingsBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_notification_settings);
    }
}
