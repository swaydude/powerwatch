package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentDailyGoalsSettingsBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.ImageView arrowCalories;
    public final android.widget.ImageView arrowPower;
    public final android.widget.ImageView arrowSleep;
    public final android.widget.ImageView arrowSteps;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM mViewModel;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM viewModel);

    protected FragmentDailyGoalsSettingsBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.ImageView arrowCalories, android.widget.ImageView arrowPower, android.widget.ImageView arrowSleep, android.widget.ImageView arrowSteps) {
        super(_bindingComponent, _root, _localFieldCount);
        this.arrowCalories = arrowCalories;
        this.arrowPower = arrowPower;
        this.arrowSleep = arrowSleep;
        this.arrowSteps = arrowSteps;
    }

    public powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_daily_goals_settings, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_daily_goals_settings, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_daily_goals_settings);
    }
}
