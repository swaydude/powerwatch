package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentDashboardContainerBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.FrameLayout dashboardFragmentContainer;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerViewModel mViewModel;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerViewModel viewModel);

    protected FragmentDashboardContainerBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.FrameLayout dashboardFragmentContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.dashboardFragmentContainer = dashboardFragmentContainer;
    }

    public powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentDashboardContainerBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentDashboardContainerBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentDashboardContainerBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_dashboard_container, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentDashboardContainerBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentDashboardContainerBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentDashboardContainerBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_dashboard_container, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentDashboardContainerBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentDashboardContainerBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentDashboardContainerBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_dashboard_container);
    }
}
