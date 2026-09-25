package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentWatchSettingsBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.ImageView arrowAlarmSet;
    public final android.widget.ImageView arrowAlertSet;
    public final android.widget.ImageView arrowBacklight;
    public final android.widget.ImageView arrowBacklightDuration;
    public final android.widget.ImageView arrowBleAlert;
    public final android.widget.ImageView arrowClock;
    public final android.widget.ImageView arrowDnd;
    public final android.widget.ImageView arrowGps;
    public final android.widget.ImageView arrowHomeScreen;
    public final android.widget.ImageView arrowLanguage;
    public final android.widget.ImageView arrowPopupDuration;
    public final android.widget.ImageView arrowRingtoneAlert;
    public final android.widget.ImageView arrowTimerSet;
    public final android.widget.ImageView arrowUnits;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM mViewModel;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM viewModel);

    protected FragmentWatchSettingsBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.ImageView arrowAlarmSet, android.widget.ImageView arrowAlertSet, android.widget.ImageView arrowBacklight, android.widget.ImageView arrowBacklightDuration, android.widget.ImageView arrowBleAlert, android.widget.ImageView arrowClock, android.widget.ImageView arrowDnd, android.widget.ImageView arrowGps, android.widget.ImageView arrowHomeScreen, android.widget.ImageView arrowLanguage, android.widget.ImageView arrowPopupDuration, android.widget.ImageView arrowRingtoneAlert, android.widget.ImageView arrowTimerSet, android.widget.ImageView arrowUnits) {
        super(_bindingComponent, _root, _localFieldCount);
        this.arrowAlarmSet = arrowAlarmSet;
        this.arrowAlertSet = arrowAlertSet;
        this.arrowBacklight = arrowBacklight;
        this.arrowBacklightDuration = arrowBacklightDuration;
        this.arrowBleAlert = arrowBleAlert;
        this.arrowClock = arrowClock;
        this.arrowDnd = arrowDnd;
        this.arrowGps = arrowGps;
        this.arrowHomeScreen = arrowHomeScreen;
        this.arrowLanguage = arrowLanguage;
        this.arrowPopupDuration = arrowPopupDuration;
        this.arrowRingtoneAlert = arrowRingtoneAlert;
        this.arrowTimerSet = arrowTimerSet;
        this.arrowUnits = arrowUnits;
    }

    public powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_watch_settings, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_watch_settings, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_watch_settings);
    }
}
