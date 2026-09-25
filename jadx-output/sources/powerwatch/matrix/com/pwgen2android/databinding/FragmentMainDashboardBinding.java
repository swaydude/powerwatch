package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentMainDashboardBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.FrameLayout caloriesDayFragment;
    public final android.widget.FrameLayout heartRateDayFragment;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel mViewModel;
    public final androidx.core.widget.NestedScrollView mainScroll;
    public final android.widget.FrameLayout pedometerDayFragment;
    public final android.widget.FrameLayout powerDayFragment;
    public final android.widget.FrameLayout realTimeFragment;
    public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout refreshLayout;
    public final android.widget.FrameLayout sleepDayFragment;
    public final android.widget.FrameLayout syncFragment;
    public final android.widget.FrameLayout temperatureDayFragment;
    public final android.widget.FrameLayout userActivityFragment;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel viewModel);

    protected FragmentMainDashboardBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.FrameLayout caloriesDayFragment, android.widget.FrameLayout heartRateDayFragment, androidx.core.widget.NestedScrollView mainScroll, android.widget.FrameLayout pedometerDayFragment, android.widget.FrameLayout powerDayFragment, android.widget.FrameLayout realTimeFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout refreshLayout, android.widget.FrameLayout sleepDayFragment, android.widget.FrameLayout syncFragment, android.widget.FrameLayout temperatureDayFragment, android.widget.FrameLayout userActivityFragment) {
        super(_bindingComponent, _root, _localFieldCount);
        this.caloriesDayFragment = caloriesDayFragment;
        this.heartRateDayFragment = heartRateDayFragment;
        this.mainScroll = mainScroll;
        this.pedometerDayFragment = pedometerDayFragment;
        this.powerDayFragment = powerDayFragment;
        this.realTimeFragment = realTimeFragment;
        this.refreshLayout = refreshLayout;
        this.sleepDayFragment = sleepDayFragment;
        this.syncFragment = syncFragment;
        this.temperatureDayFragment = temperatureDayFragment;
        this.userActivityFragment = userActivityFragment;
    }

    public powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentMainDashboardBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentMainDashboardBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentMainDashboardBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_main_dashboard, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentMainDashboardBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentMainDashboardBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentMainDashboardBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_main_dashboard, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentMainDashboardBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentMainDashboardBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentMainDashboardBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_main_dashboard);
    }
}
