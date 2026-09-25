package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentHeartRateChartBinding extends androidx.databinding.ViewDataBinding {
    public final com.github.mikephil.charting.charts.LineChart heartRateChart;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel mViewModel;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel viewModel);

    protected FragmentHeartRateChartBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, com.github.mikephil.charting.charts.LineChart heartRateChart) {
        super(_bindingComponent, _root, _localFieldCount);
        this.heartRateChart = heartRateChart;
    }

    public powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentHeartRateChartBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentHeartRateChartBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentHeartRateChartBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_heart_rate_chart, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentHeartRateChartBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentHeartRateChartBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentHeartRateChartBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_heart_rate_chart, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentHeartRateChartBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentHeartRateChartBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentHeartRateChartBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_heart_rate_chart);
    }
}
