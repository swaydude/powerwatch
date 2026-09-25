package powerwatch.matrix.com.pwgen2android.main.watch.settings;

/* JADX INFO: compiled from: WatchSettingsVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 h2\u00020\u00012\u00020\u0002:\u0001hBe\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\u0012\u0010H\u001a\u0004\u0018\u00010\u001e2\u0006\u0010I\u001a\u00020JH\u0002J\u000e\u0010K\u001a\b\u0012\u0004\u0012\u00020=0LH\u0002J\u0018\u0010M\u001a\u00020N2\u0006\u0010I\u001a\u00020J2\u0006\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u00020NH\u0016J\u0010\u0010R\u001a\u00020N2\u0006\u0010S\u001a\u00020TH\u0016J\u0010\u0010U\u001a\u00020N2\u0006\u0010S\u001a\u00020TH\u0016J\u0010\u0010V\u001a\u00020N2\u0006\u0010S\u001a\u00020TH\u0016J\u0010\u0010W\u001a\u00020N2\u0006\u0010X\u001a\u00020=H\u0002J\n\u0010Y\u001a\u00020N*\u00020ZJ\n\u0010[\u001a\u00020N*\u00020ZJ\n\u0010\\\u001a\u00020N*\u00020ZJ\n\u0010]\u001a\u00020N*\u00020ZJ\n\u0010^\u001a\u00020N*\u00020ZJ\n\u0010_\u001a\u00020N*\u00020ZJ\n\u0010`\u001a\u00020N*\u00020ZJ\n\u0010a\u001a\u00020N*\u00020ZJ\n\u0010b\u001a\u00020N*\u00020ZJ\n\u0010c\u001a\u00020N*\u00020ZJ\n\u0010d\u001a\u00020N*\u00020ZJ\n\u0010e\u001a\u00020N*\u00020ZJ\n\u0010f\u001a\u00020N*\u00020ZJ\n\u0010g\u001a\u00020N*\u00020ZR\u001f\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001f\u0010\"\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u001f\u0010$\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u001f\u0010&\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u001f\u0010(\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u001f\u0010*\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010,\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u001f\u0010.\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u001f\u00100\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u00102\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u001c\u00104\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001a0\u001a05X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u00108\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b9\u0010!R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010:\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b;\u0010!R\u001c\u0010<\u001a\u0004\u0018\u00010=X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010B\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\bC\u0010!R\u000e\u0010D\u001a\u00020EX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010F\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\bG\u0010!¨\u0006i"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;", "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "languageController", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;", "realTimeDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;", "settingsDisplayValueLoader", "Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "deviceProtocolStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;", "settingsDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;", "settingsDataRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;", "activity", "Landroid/app/Activity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V", "alarmField", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getAlarmField", "()Landroidx/databinding/ObservableField;", "alertModeField", "getAlertModeField", "backLightDurationField", "getBackLightDurationField", "backLightModeField", "getBackLightModeField", "bleDisconnectionField", "getBleDisconnectionField", "clockField", "getClockField", "dndField", "getDndField", "gpsUpdateField", "getGpsUpdateField", "homeScreenModeField", "getHomeScreenModeField", "languageField", "getLanguageField", "managerWeakReference", "Ljava/lang/ref/WeakReference;", "pairedDevice", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;", "popUpDurationField", "getPopUpDurationField", "ringtoneField", "getRingtoneField", "settingsData", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;", "getSettingsData", "()Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;", "setSettingsData", "(Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V", "unitsField", "getUnitsField", "user", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "watchOnlySectionTitle", "getWatchOnlySectionTitle", "getTitle", "type", "Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;", "loadSettingsData", "Lio/reactivex/Observable;", "moveToNextScreen", "", "value", "", "onBackClicked", "onCreateView", "context", "Landroid/content/Context;", "onDestroyView", "onStart", "updateUI", "data", "onAlarmClicked", "Landroid/view/View;", "onAlertClicked", "onBLEAlertClicked", "onBackLightDurationClicked", "onBackLightModeClicked", "onClockClicked", "onDNDClicked", "onGPSUpdateClicked", "onHomeScreenClicked", "onLanguageClicked", "onPopUpDurationClicked", "onRingtoneClicked", "onTimerClicked", "onUnitsClicked", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WatchSettingsVM extends powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.class).getSimpleName();
    private final androidx.databinding.ObservableField<java.lang.String> alarmField;
    private final androidx.databinding.ObservableField<java.lang.String> alertModeField;
    private final androidx.databinding.ObservableField<java.lang.String> backLightDurationField;
    private final androidx.databinding.ObservableField<java.lang.String> backLightModeField;
    private final androidx.databinding.ObservableField<java.lang.String> bleDisconnectionField;
    private final androidx.databinding.ObservableField<java.lang.String> clockField;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage deviceProtocolStorage;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository;
    private final androidx.databinding.ObservableField<java.lang.String> dndField;
    private final androidx.databinding.ObservableField<java.lang.String> gpsUpdateField;
    private final androidx.databinding.ObservableField<java.lang.String> homeScreenModeField;
    private final powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController;
    private final androidx.databinding.ObservableField<java.lang.String> languageField;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> managerWeakReference;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.Device pairedDevice;
    private final androidx.databinding.ObservableField<java.lang.String> popUpDurationField;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider realTimeDataProvider;
    private final androidx.databinding.ObservableField<java.lang.String> ringtoneField;
    private powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider settingsDataProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository settingsDataRepository;
    private final powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader settingsDisplayValueLoader;
    private final androidx.databinding.ObservableField<java.lang.String> unitsField;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.User user;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;
    private final androidx.databinding.ObservableField<java.lang.String> watchOnlySectionTitle;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-5, reason: not valid java name */
    public static final void m1962onCreateView$lambda5(java.lang.Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-7, reason: not valid java name */
    public static final void m1964onCreateView$lambda7(java.lang.Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onStart$lambda-10, reason: not valid java name */
    public static final void m1965onStart$lambda10(java.lang.Throwable th) {
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchSettingsVM(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController, powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider realTimeDataProvider, powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader settingsDisplayValueLoader, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage deviceProtocolStorage, powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider settingsDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository settingsDataRepository, android.app.Activity activity, androidx.fragment.app.FragmentManager fragmentManager) {
        super(activity, null, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageController, "languageController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realTimeDataProvider, "realTimeDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDisplayValueLoader, "settingsDisplayValueLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceProtocolStorage, "deviceProtocolStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDataProvider, "settingsDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDataRepository, "settingsDataRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.userAccountRepository = userAccountRepository;
        this.userPrefsUtils = userPrefsUtils;
        this.languageController = languageController;
        this.realTimeDataProvider = realTimeDataProvider;
        this.settingsDisplayValueLoader = settingsDisplayValueLoader;
        this.deviceRepository = deviceRepository;
        this.communicator = communicator;
        this.deviceProtocolStorage = deviceProtocolStorage;
        this.settingsDataProvider = settingsDataProvider;
        this.settingsDataRepository = settingsDataRepository;
        this.clockField = new androidx.databinding.ObservableField<>("");
        this.unitsField = new androidx.databinding.ObservableField<>("");
        this.languageField = new androidx.databinding.ObservableField<>("");
        this.dndField = new androidx.databinding.ObservableField<>("");
        this.backLightModeField = new androidx.databinding.ObservableField<>("");
        this.backLightDurationField = new androidx.databinding.ObservableField<>("");
        this.popUpDurationField = new androidx.databinding.ObservableField<>("");
        this.gpsUpdateField = new androidx.databinding.ObservableField<>("");
        this.homeScreenModeField = new androidx.databinding.ObservableField<>("");
        this.bleDisconnectionField = new androidx.databinding.ObservableField<>("");
        this.ringtoneField = new androidx.databinding.ObservableField<>("");
        this.alertModeField = new androidx.databinding.ObservableField<>("");
        this.watchOnlySectionTitle = new androidx.databinding.ObservableField<>(activity.getString(powerwatch.matrix.com.pwgen2android.R.string.watch_only_settings));
        this.alarmField = new androidx.databinding.ObservableField<>("");
        this.managerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
    }

    public final androidx.databinding.ObservableField<java.lang.String> getClockField() {
        return this.clockField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getUnitsField() {
        return this.unitsField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getLanguageField() {
        return this.languageField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getDndField() {
        return this.dndField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getBackLightModeField() {
        return this.backLightModeField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getBackLightDurationField() {
        return this.backLightDurationField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getPopUpDurationField() {
        return this.popUpDurationField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getGpsUpdateField() {
        return this.gpsUpdateField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getHomeScreenModeField() {
        return this.homeScreenModeField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getBleDisconnectionField() {
        return this.bleDisconnectionField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getRingtoneField() {
        return this.ringtoneField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getAlertModeField() {
        return this.alertModeField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getWatchOnlySectionTitle() {
        return this.watchOnlySectionTitle;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getAlarmField() {
        return this.alarmField;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.SettingsData getSettingsData() {
        return this.settingsData;
    }

    public final void setSettingsData(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
        this.settingsData = settingsData;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetFirstRepository.DefaultImpls.getFirst$default(this.userAccountRepository, false, false, 3, null).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.-$$Lambda$WatchSettingsVM$sIruRqO24zHxmk3-r_gPRuNc-14
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM.m1957onCreateView$lambda0(this.f$0, context, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.-$$Lambda$WatchSettingsVM$d6sEkkOMJ4pF4KQPAYlEzElfJMo
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository.DefaultImpls.load$default(this.deviceRepository, false, false, 3, null).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.-$$Lambda$WatchSettingsVM$f_hKzL3Mf20F8zftlP7JBDbI_ms
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM.m1959onCreateView$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.Device) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.-$$Lambda$WatchSettingsVM$jk24b1FWtuCtqNjabKOAlHNRs7c
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM.m1960onCreateView$lambda3(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.Device) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.-$$Lambda$WatchSettingsVM$ty6p-KankbXymwiyXkYlYqijZQw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM.m1961onCreateView$lambda4(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.SettingsData) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.-$$Lambda$WatchSettingsVM$g2EZcTu2e0eI7QU-akd5gDyHlCM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM.m1962onCreateView$lambda5((java.lang.Throwable) obj);
            }
        }));
        getCompositeDisposable().add(this.settingsDataProvider.observe().observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.-$$Lambda$WatchSettingsVM$wCifHmVUALsxrCBrwlCmIp9gHWI
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM.m1963onCreateView$lambda6(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.SettingsData) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.-$$Lambda$WatchSettingsVM$QqbvZjG_bkAeeqlKCHVVTGCGsGs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM.m1964onCreateView$lambda7((java.lang.Throwable) obj);
            }
        }));
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmData alarmDataLoadAlarm = this.settingsDataRepository.loadAlarm();
        if (alarmDataLoadAlarm != null) {
            java.lang.String displayValue = this.settingsDisplayValueLoader.getDisplayValue(alarmDataLoadAlarm.getAlarmControl().getMode(), powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.AlarmActivation.INSTANCE, context);
            powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegateKt.setCurrentRepeat(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection.INSTANCE.getDaySelection(alarmDataLoadAlarm.getDaySelection().getMode()));
            powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegateKt.setCurrentSelectionMode(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl.INSTANCE.getAlarmControl(alarmDataLoadAlarm.getAlarmControl().getMode()));
            this.alarmField.set(displayValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m1957onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM this$0, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.data.models.User it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.user = it;
        int i = this$0.userPrefsUtils.isMetricsUsed(it) ? powerwatch.matrix.com.pwgen2android.R.string.metrics_units : powerwatch.matrix.com.pwgen2android.R.string.imperials_units;
        int i2 = this$0.userPrefsUtils.isTwelveHourFormatUsed(it) ? powerwatch.matrix.com.pwgen2android.R.string.twelve_clock : powerwatch.matrix.com.pwgen2android.R.string.twenty_four_clock;
        androidx.databinding.ObservableField<java.lang.String> unitsField = this$0.getUnitsField();
        android.content.Context activityContext = this$0.getActivityContext();
        unitsField.set(activityContext == null ? null : activityContext.getString(i));
        androidx.databinding.ObservableField<java.lang.String> clockField = this$0.getClockField();
        android.content.Context activityContext2 = this$0.getActivityContext();
        clockField.set(activityContext2 != null ? activityContext2.getString(i2) : null);
        powerwatch.matrix.com.pwgen2android.utils.LanguageInfo language = this$0.languageController.getLanguage(it.getAccountSettings().getLanguage());
        if (this$0.getActivityContext() == null || language == null) {
            return;
        }
        this$0.getLanguageField().set(context.getString(language.getLanguageDisplay()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m1959onCreateView$lambda2(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.pairedDevice = device;
        powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage deviceProtocolStorage = this$0.deviceProtocolStorage;
        kotlin.jvm.internal.Intrinsics.checkNotNull(device);
        if (deviceProtocolStorage.getDeviceProtocolVersion(device.getBluetoothAddress()) < 4) {
            androidx.databinding.ObservableField<java.lang.String> watchOnlySectionTitle = this$0.getWatchOnlySectionTitle();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            android.content.Context activityContext = this$0.getActivityContext();
            sb.append((java.lang.Object) (activityContext == null ? null : activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.watch_only_settings)));
            sb.append(" - ");
            android.content.Context activityContext2 = this$0.getActivityContext();
            sb.append((java.lang.Object) (activityContext2 != null ? activityContext2.getString(powerwatch.matrix.com.pwgen2android.R.string.sleep_time_fw_update) : null));
            watchOnlySectionTitle.set(sb.toString());
            return;
        }
        androidx.databinding.ObservableField<java.lang.String> watchOnlySectionTitle2 = this$0.getWatchOnlySectionTitle();
        android.content.Context activityContext3 = this$0.getActivityContext();
        watchOnlySectionTitle2.set(activityContext3 != null ? activityContext3.getString(powerwatch.matrix.com.pwgen2android.R.string.watch_only_settings) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-3, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1960onCreateView$lambda3(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.Device it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.loadSettingsData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-4, reason: not valid java name */
    public static final void m1961onCreateView$lambda4(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM this$0, powerwatch.matrix.com.pwgen2android.sdk.SettingsData it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.updateUI(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-6, reason: not valid java name */
    public static final void m1963onCreateView$lambda6(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM this$0, powerwatch.matrix.com.pwgen2android.sdk.SettingsData it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.updateUI(it);
    }

    private final void updateUI(powerwatch.matrix.com.pwgen2android.sdk.SettingsData data) {
        this.settingsData = data;
        if (data != null) {
            androidx.databinding.ObservableField<java.lang.String> observableField = this.dndField;
            powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader settingsDisplayValueLoader = this.settingsDisplayValueLoader;
            kotlin.jvm.internal.Intrinsics.checkNotNull(data);
            byte dnd = (byte) data.getDnd();
            powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.DND dnd2 = powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.DND.INSTANCE;
            android.content.Context activityContext = getActivityContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(activityContext);
            observableField.set(settingsDisplayValueLoader.getDisplayValue(dnd, dnd2, activityContext));
            androidx.databinding.ObservableField<java.lang.String> observableField2 = this.backLightModeField;
            powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader settingsDisplayValueLoader2 = this.settingsDisplayValueLoader;
            powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData = this.settingsData;
            kotlin.jvm.internal.Intrinsics.checkNotNull(settingsData);
            observableField2.set(settingsDisplayValueLoader2.getDisplayValue((byte) settingsData.getBackLight(), powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BackLight.INSTANCE, getActivityContext()));
            androidx.databinding.ObservableField<java.lang.String> observableField3 = this.backLightDurationField;
            powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader settingsDisplayValueLoader3 = this.settingsDisplayValueLoader;
            powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData2 = this.settingsData;
            kotlin.jvm.internal.Intrinsics.checkNotNull(settingsData2);
            observableField3.set(settingsDisplayValueLoader3.getDisplayValue((byte) settingsData2.getBackLightDuration(), powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BackLightDuration.INSTANCE, getActivityContext()));
            androidx.databinding.ObservableField<java.lang.String> observableField4 = this.popUpDurationField;
            powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader settingsDisplayValueLoader4 = this.settingsDisplayValueLoader;
            powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData3 = this.settingsData;
            kotlin.jvm.internal.Intrinsics.checkNotNull(settingsData3);
            observableField4.set(settingsDisplayValueLoader4.getDisplayValue((byte) settingsData3.getPopupDuration(), powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.PopUpDuration.INSTANCE, getActivityContext()));
            androidx.databinding.ObservableField<java.lang.String> observableField5 = this.gpsUpdateField;
            powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader settingsDisplayValueLoader5 = this.settingsDisplayValueLoader;
            powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData4 = this.settingsData;
            kotlin.jvm.internal.Intrinsics.checkNotNull(settingsData4);
            observableField5.set(settingsDisplayValueLoader5.getDisplayValue((byte) settingsData4.getGpsUpdateRate(), powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.GPSUpdateRate.INSTANCE, getActivityContext()));
            androidx.databinding.ObservableField<java.lang.String> observableField6 = this.homeScreenModeField;
            powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader settingsDisplayValueLoader6 = this.settingsDisplayValueLoader;
            powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData5 = this.settingsData;
            kotlin.jvm.internal.Intrinsics.checkNotNull(settingsData5);
            observableField6.set(settingsDisplayValueLoader6.getDisplayValue((byte) settingsData5.getHomeScreen(), powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.HomeScreen.INSTANCE, getActivityContext()));
            androidx.databinding.ObservableField<java.lang.String> observableField7 = this.bleDisconnectionField;
            powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader settingsDisplayValueLoader7 = this.settingsDisplayValueLoader;
            powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData6 = this.settingsData;
            kotlin.jvm.internal.Intrinsics.checkNotNull(settingsData6);
            observableField7.set(settingsDisplayValueLoader7.getDisplayValue((byte) settingsData6.getBleDisconnect(), powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BLEDisconnection.INSTANCE, getActivityContext()));
            androidx.databinding.ObservableField<java.lang.String> observableField8 = this.ringtoneField;
            powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader settingsDisplayValueLoader8 = this.settingsDisplayValueLoader;
            powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData7 = this.settingsData;
            kotlin.jvm.internal.Intrinsics.checkNotNull(settingsData7);
            observableField8.set(settingsDisplayValueLoader8.getDisplayValue((byte) settingsData7.getRingtone(), powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.Ringtone.INSTANCE, getActivityContext()));
            androidx.databinding.ObservableField<java.lang.String> observableField9 = this.alertModeField;
            powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader settingsDisplayValueLoader9 = this.settingsDisplayValueLoader;
            powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData8 = this.settingsData;
            kotlin.jvm.internal.Intrinsics.checkNotNull(settingsData8);
            observableField9.set(settingsDisplayValueLoader9.getDisplayValue((byte) settingsData8.getAlert(), powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.Alert.INSTANCE, getActivityContext()));
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroyView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroyView(context);
        getCompositeDisposable().clear();
    }

    private final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.SettingsData> loadSettingsData() {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.SettingsData> observableDefer = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.-$$Lambda$WatchSettingsVM$Gx_Vd51jY9IzkL8rv_CcruYVoho
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM.m1956loadSettingsData$lambda8(this.f$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDefer, "defer<SettingsData> {\n            val address = pairedDevice?.bluetoothAddress\n            if (address == null) Observable.empty<SettingsData>()\n            else {\n                val data = settingsDataProvider.loadStoredSettings(address)\n                if (data == null) Observable.empty<SettingsData>()\n                else Observable.just(data)\n            }\n        }");
        return observableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadSettingsData$lambda-8, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1956loadSettingsData$lambda8(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM this$0) {
        powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsDataLoadStoredSettings;
        io.reactivex.Observable observableJust;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device device = this$0.pairedDevice;
        java.lang.String bluetoothAddress = device == null ? null : device.getBluetoothAddress();
        if (bluetoothAddress == null || (settingsDataLoadStoredSettings = this$0.settingsDataProvider.loadStoredSettings(bluetoothAddress)) == null) {
            observableJust = io.reactivex.Observable.empty();
        } else {
            observableJust = io.reactivex.Observable.just(settingsDataLoadStoredSettings);
        }
        return observableJust;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onStart(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onStart(context);
        getCompositeDisposable().add(loadSettingsData().observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.-$$Lambda$WatchSettingsVM$9MTBT3QFApLPbD5_jLQqBlvhz6A
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM.m1966onStart$lambda9(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.SettingsData) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.-$$Lambda$WatchSettingsVM$rYELHU3lS_4jce1EYW6VcvNz9lw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM.m1965onStart$lambda10((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onStart$lambda-9, reason: not valid java name */
    public static final void m1966onStart$lambda9(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM this$0, powerwatch.matrix.com.pwgen2android.sdk.SettingsData it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.updateUI(it);
    }

    public final void onDNDClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        if (this.settingsData == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.DND dnd = powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.DND.INSTANCE;
        powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData = this.settingsData;
        kotlin.jvm.internal.Intrinsics.checkNotNull(settingsData);
        moveToNextScreen(dnd, (byte) settingsData.getDnd());
    }

    public final void onBackLightModeClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        if (this.settingsData == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BackLight backLight = powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BackLight.INSTANCE;
        powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData = this.settingsData;
        kotlin.jvm.internal.Intrinsics.checkNotNull(settingsData);
        moveToNextScreen(backLight, (byte) settingsData.getBackLight());
    }

    public final void onBackLightDurationClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        if (this.settingsData == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BackLightDuration backLightDuration = powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BackLightDuration.INSTANCE;
        powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData = this.settingsData;
        kotlin.jvm.internal.Intrinsics.checkNotNull(settingsData);
        moveToNextScreen(backLightDuration, (byte) settingsData.getBackLightDuration());
    }

    public final void onPopUpDurationClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        if (this.settingsData == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.PopUpDuration popUpDuration = powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.PopUpDuration.INSTANCE;
        powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData = this.settingsData;
        kotlin.jvm.internal.Intrinsics.checkNotNull(settingsData);
        moveToNextScreen(popUpDuration, (byte) settingsData.getPopupDuration());
    }

    public final void onGPSUpdateClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        if (this.settingsData == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.GPSUpdateRate gPSUpdateRate = powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.GPSUpdateRate.INSTANCE;
        powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData = this.settingsData;
        kotlin.jvm.internal.Intrinsics.checkNotNull(settingsData);
        moveToNextScreen(gPSUpdateRate, (byte) settingsData.getGpsUpdateRate());
    }

    public final void onHomeScreenClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        if (this.settingsData == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.HomeScreen homeScreen = powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.HomeScreen.INSTANCE;
        powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData = this.settingsData;
        kotlin.jvm.internal.Intrinsics.checkNotNull(settingsData);
        moveToNextScreen(homeScreen, (byte) settingsData.getHomeScreen());
    }

    public final void onBLEAlertClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        if (this.settingsData == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BLEDisconnection bLEDisconnection = powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BLEDisconnection.INSTANCE;
        powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData = this.settingsData;
        kotlin.jvm.internal.Intrinsics.checkNotNull(settingsData);
        moveToNextScreen(bLEDisconnection, (byte) settingsData.getBleDisconnect());
    }

    public final void onRingtoneClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        if (this.settingsData == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.Ringtone ringtone = powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.Ringtone.INSTANCE;
        powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData = this.settingsData;
        kotlin.jvm.internal.Intrinsics.checkNotNull(settingsData);
        moveToNextScreen(ringtone, (byte) settingsData.getRingtone());
    }

    public final void onAlertClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        if (this.settingsData == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.Alert alert = powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.Alert.INSTANCE;
        powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData = this.settingsData;
        kotlin.jvm.internal.Intrinsics.checkNotNull(settingsData);
        moveToNextScreen(alert, (byte) settingsData.getAlert());
    }

    public final void onAlarmClicked(android.view.View view) {
        androidx.fragment.app.FragmentManager fragmentManager;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage deviceProtocolStorage = this.deviceProtocolStorage;
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device device = this.pairedDevice;
        if (deviceProtocolStorage.getDeviceProtocolVersion(device == null ? null : device.getBluetoothAddress()) < 4) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfoDefaultConnectedDevice = this.communicator.defaultConnectedDevice();
        if ((deviceInfoDefaultConnectedDevice != null ? deviceInfoDefaultConnectedDevice.getUid() : null) == null || (fragmentManager = this.managerWeakReference.get()) == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmSettingFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onTimerClicked(android.view.View view) {
        androidx.fragment.app.FragmentManager fragmentManager;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage deviceProtocolStorage = this.deviceProtocolStorage;
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device device = this.pairedDevice;
        if (deviceProtocolStorage.getDeviceProtocolVersion(device == null ? null : device.getBluetoothAddress()) < 4) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfoDefaultConnectedDevice = this.communicator.defaultConnectedDevice();
        if ((deviceInfoDefaultConnectedDevice != null ? deviceInfoDefaultConnectedDevice.getUid() : null) == null || (fragmentManager = this.managerWeakReference.get()) == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    private final void moveToNextScreen(powerwatch.matrix.com.pwgen2android.setup.language.SupportedType type, byte value) {
        androidx.fragment.app.FragmentManager fragmentManager;
        powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage deviceProtocolStorage = this.deviceProtocolStorage;
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device device = this.pairedDevice;
        if (deviceProtocolStorage.getDeviceProtocolVersion(device == null ? null : device.getBluetoothAddress()) < 4) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfoDefaultConnectedDevice = this.communicator.defaultConnectedDevice();
        if ((deviceInfoDefaultConnectedDevice != null ? deviceInfoDefaultConnectedDevice.getUid() : null) == null || (fragmentManager = this.managerWeakReference.get()) == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment.Companion companion = powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment.INSTANCE;
        java.lang.String title = getTitle(type);
        if (title == null) {
            title = "";
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, companion.newInstance(type, title, value), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    private final java.lang.String getTitle(powerwatch.matrix.com.pwgen2android.setup.language.SupportedType type) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.DND.INSTANCE)) {
            android.content.Context activityContext = getActivityContext();
            if (activityContext != null) {
                return activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.dnd_set);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BackLight.INSTANCE)) {
            android.content.Context activityContext2 = getActivityContext();
            if (activityContext2 != null) {
                return activityContext2.getString(powerwatch.matrix.com.pwgen2android.R.string.backlight_set);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BackLightDuration.INSTANCE)) {
            android.content.Context activityContext3 = getActivityContext();
            if (activityContext3 != null) {
                return activityContext3.getString(powerwatch.matrix.com.pwgen2android.R.string.backlight_duration_set);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.PopUpDuration.INSTANCE)) {
            android.content.Context activityContext4 = getActivityContext();
            if (activityContext4 != null) {
                return activityContext4.getString(powerwatch.matrix.com.pwgen2android.R.string.popup_duration_set);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.GPSUpdateRate.INSTANCE)) {
            android.content.Context activityContext5 = getActivityContext();
            if (activityContext5 != null) {
                return activityContext5.getString(powerwatch.matrix.com.pwgen2android.R.string.gps_update_set);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.HomeScreen.INSTANCE)) {
            android.content.Context activityContext6 = getActivityContext();
            if (activityContext6 != null) {
                return activityContext6.getString(powerwatch.matrix.com.pwgen2android.R.string.home_screen_set);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BLEDisconnection.INSTANCE)) {
            android.content.Context activityContext7 = getActivityContext();
            if (activityContext7 != null) {
                return activityContext7.getString(powerwatch.matrix.com.pwgen2android.R.string.ble_disconnection_set);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.Ringtone.INSTANCE)) {
            android.content.Context activityContext8 = getActivityContext();
            if (activityContext8 != null) {
                return activityContext8.getString(powerwatch.matrix.com.pwgen2android.R.string.ringtone_set);
            }
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.Alert.INSTANCE)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.UNKNOWN.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.AlarmRepeatMode.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.AlarmActivation.INSTANCE)) {
                    return "";
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
            android.content.Context activityContext9 = getActivityContext();
            if (activityContext9 != null) {
                return activityContext9.getString(powerwatch.matrix.com.pwgen2android.R.string.alert_set);
            }
        }
        return null;
    }

    public final void onUnitsClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onClockClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user = this.user;
        if (user == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
            throw null;
        }
        int timeFormatType = user.getAccountSettings().getTimeFormatType();
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Clock clock = powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Clock.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(timeFormatType);
        sb.append('h');
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig wheelConfig = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig(clock, sb.toString(), new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter(new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData(null, new java.lang.String[]{java.lang.String.valueOf(powerwatch.matrix.com.pwgen2android.shared.data.models.HourFormat.Twelve.INSTANCE.getFormat()), java.lang.String.valueOf(powerwatch.matrix.com.pwgen2android.shared.data.models.HourFormat.TwentyFour.INSTANCE.getFormat())}, 0, 0, null, 29, null), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.hourUnit), 0, 0, 0, 56, null);
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment.INSTANCE.newInstance(wheelConfig), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onLanguageClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.language.ChooseLanguageFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel
    public void onBackClicked() {
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }
}
