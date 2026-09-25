package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentUserActivityBinding extends androidx.databinding.ViewDataBinding {
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView activityName;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView ascendedTitle;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView avgHrTitle;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView caloriesTitle;
    public final android.widget.FrameLayout chartFragmentContainer;
    public final android.widget.FrameLayout controlViewContainer;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView dateTitle;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView descendedTitle;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView durationTitle;
    public final android.widget.LinearLayout headerLayout;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel mViewModel;
    public final android.widget.FrameLayout mapsFragmentContainer;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView maxHrTitle;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView paceTitle;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView subtitleLabel;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView timeTitle;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView totalDistanceTitle;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel viewModel);

    protected FragmentUserActivityBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView activityName, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView ascendedTitle, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView avgHrTitle, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView caloriesTitle, android.widget.FrameLayout chartFragmentContainer, android.widget.FrameLayout controlViewContainer, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView dateTitle, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView descendedTitle, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView durationTitle, android.widget.LinearLayout headerLayout, android.widget.FrameLayout mapsFragmentContainer, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView maxHrTitle, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView paceTitle, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView subtitleLabel, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView timeTitle, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView totalDistanceTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.activityName = activityName;
        this.ascendedTitle = ascendedTitle;
        this.avgHrTitle = avgHrTitle;
        this.caloriesTitle = caloriesTitle;
        this.chartFragmentContainer = chartFragmentContainer;
        this.controlViewContainer = controlViewContainer;
        this.dateTitle = dateTitle;
        this.descendedTitle = descendedTitle;
        this.durationTitle = durationTitle;
        this.headerLayout = headerLayout;
        this.mapsFragmentContainer = mapsFragmentContainer;
        this.maxHrTitle = maxHrTitle;
        this.paceTitle = paceTitle;
        this.subtitleLabel = subtitleLabel;
        this.timeTitle = timeTitle;
        this.totalDistanceTitle = totalDistanceTitle;
    }

    public powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_user_activity, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_user_activity, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_user_activity);
    }
}
