package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentNotificationsBinding extends androidx.databinding.ViewDataBinding {
    public final androidx.recyclerview.widget.RecyclerView appList;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.setup.notifications.NotificationsViewModel mViewModel;
    public final android.widget.LinearLayout notificationsDetails;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.setup.notifications.NotificationsViewModel viewModel);

    protected FragmentNotificationsBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, androidx.recyclerview.widget.RecyclerView appList, android.widget.LinearLayout notificationsDetails) {
        super(_bindingComponent, _root, _localFieldCount);
        this.appList = appList;
        this.notificationsDetails = notificationsDetails;
    }

    public powerwatch.matrix.com.pwgen2android.setup.notifications.NotificationsViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_notifications, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationsBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationsBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_notifications, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationsBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationsBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationsBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_notifications);
    }
}
