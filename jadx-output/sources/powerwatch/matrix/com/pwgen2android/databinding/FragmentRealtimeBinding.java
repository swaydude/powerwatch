package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentRealtimeBinding extends androidx.databinding.ViewDataBinding {
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView caloriesCircle;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView currentDateTitle;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel mViewModel;
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView mainInnerCircle;
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView sleepCircle;
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView stepsCircle;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView todayTitle;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel viewModel);

    protected FragmentRealtimeBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView caloriesCircle, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView currentDateTitle, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView mainInnerCircle, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView sleepCircle, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView stepsCircle, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView todayTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.caloriesCircle = caloriesCircle;
        this.currentDateTitle = currentDateTitle;
        this.mainInnerCircle = mainInnerCircle;
        this.sleepCircle = sleepCircle;
        this.stepsCircle = stepsCircle;
        this.todayTitle = todayTitle;
    }

    public powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_realtime, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_realtime, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_realtime);
    }
}
