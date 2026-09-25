package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentMyPowerwatchBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.ImageView arrowAge;
    public final android.widget.ImageView arrowCalories;
    public final android.widget.ImageView arrowClock;
    public final android.widget.ImageView arrowFirmware;
    public final android.widget.ImageView arrowGender;
    public final android.widget.ImageView arrowHeight;
    public final android.widget.ImageView arrowLanguage;
    public final android.widget.ImageView arrowNotifications;
    public final android.widget.ImageView arrowPassChange;
    public final android.widget.ImageView arrowPower;
    public final android.widget.ImageView arrowSleep;
    public final android.widget.ImageView arrowSleepTime;
    public final android.widget.ImageView arrowSteps;
    public final android.widget.ImageView arrowUnits;
    public final android.widget.ImageView arrowWeight;
    public final androidx.viewpager.widget.ViewPager bannerPager;
    public final androidx.appcompat.widget.SwitchCompat connectionToggle;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView emailValueView;
    public final android.widget.ImageView goalsSettingsArrow;
    public final androidx.appcompat.widget.SwitchCompat googleFitToggle;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel mViewModel;
    public final android.widget.ImageView notificationSettings;
    public final android.widget.ImageView personalPreferencesSettings;
    public final android.widget.ScrollView pwWatchScroll;
    public final androidx.appcompat.widget.SwitchCompat stravaToggle;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView versionLabel;
    public final android.widget.ImageView watchPreferencesSettings;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel viewModel);

    protected FragmentMyPowerwatchBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.ImageView arrowAge, android.widget.ImageView arrowCalories, android.widget.ImageView arrowClock, android.widget.ImageView arrowFirmware, android.widget.ImageView arrowGender, android.widget.ImageView arrowHeight, android.widget.ImageView arrowLanguage, android.widget.ImageView arrowNotifications, android.widget.ImageView arrowPassChange, android.widget.ImageView arrowPower, android.widget.ImageView arrowSleep, android.widget.ImageView arrowSleepTime, android.widget.ImageView arrowSteps, android.widget.ImageView arrowUnits, android.widget.ImageView arrowWeight, androidx.viewpager.widget.ViewPager bannerPager, androidx.appcompat.widget.SwitchCompat connectionToggle, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView emailValueView, android.widget.ImageView goalsSettingsArrow, androidx.appcompat.widget.SwitchCompat googleFitToggle, android.widget.ImageView notificationSettings, android.widget.ImageView personalPreferencesSettings, android.widget.ScrollView pwWatchScroll, androidx.appcompat.widget.SwitchCompat stravaToggle, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView versionLabel, android.widget.ImageView watchPreferencesSettings) {
        super(_bindingComponent, _root, _localFieldCount);
        this.arrowAge = arrowAge;
        this.arrowCalories = arrowCalories;
        this.arrowClock = arrowClock;
        this.arrowFirmware = arrowFirmware;
        this.arrowGender = arrowGender;
        this.arrowHeight = arrowHeight;
        this.arrowLanguage = arrowLanguage;
        this.arrowNotifications = arrowNotifications;
        this.arrowPassChange = arrowPassChange;
        this.arrowPower = arrowPower;
        this.arrowSleep = arrowSleep;
        this.arrowSleepTime = arrowSleepTime;
        this.arrowSteps = arrowSteps;
        this.arrowUnits = arrowUnits;
        this.arrowWeight = arrowWeight;
        this.bannerPager = bannerPager;
        this.connectionToggle = connectionToggle;
        this.emailValueView = emailValueView;
        this.goalsSettingsArrow = goalsSettingsArrow;
        this.googleFitToggle = googleFitToggle;
        this.notificationSettings = notificationSettings;
        this.personalPreferencesSettings = personalPreferencesSettings;
        this.pwWatchScroll = pwWatchScroll;
        this.stravaToggle = stravaToggle;
        this.versionLabel = versionLabel;
        this.watchPreferencesSettings = watchPreferencesSettings;
    }

    public powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentMyPowerwatchBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentMyPowerwatchBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentMyPowerwatchBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_my_powerwatch, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentMyPowerwatchBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentMyPowerwatchBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentMyPowerwatchBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_my_powerwatch, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentMyPowerwatchBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentMyPowerwatchBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentMyPowerwatchBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_my_powerwatch);
    }
}
