package powerwatch.matrix.com.pwgen2android.main.watch;

/* JADX INFO: compiled from: PWWatchViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u0000 ¡\u00012\u00020\u00012\u00020\u0002:\u0002¡\u0001B¿\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020*\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020.\u0012\b\b\u0002\u0010/\u001a\u000200¢\u0006\u0002\u00101J\u0006\u0010o\u001a\u00020pJ\u0006\u0010q\u001a\u00020pJ\b\u0010r\u001a\u000204H\u0002J\u0014\u0010s\u001a\u00020p2\n\b\u0002\u0010t\u001a\u0004\u0018\u000104H\u0002J\u000e\u0010u\u001a\u00020p2\u0006\u0010v\u001a\u00020DJ1\u0010w\u001a\u00020p2\u0006\u0010x\u001a\u00020D2!\u0010y\u001a\u001d\u0012\u0013\u0012\u00110D¢\u0006\f\b{\u0012\b\b|\u0012\u0004\b\b(}\u0012\u0004\u0012\u00020p0zJ\u0006\u0010~\u001a\u00020DJ\b\u0010\u007f\u001a\u000204H\u0002J\u0013\u0010\u0080\u0001\u001a\u00020p2\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0016J\u0013\u0010\u0083\u0001\u001a\u00020p2\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0016J\t\u0010\u0084\u0001\u001a\u00020pH\u0002J\u0012\u0010\u0085\u0001\u001a\u00020p2\u0007\u0010\u0086\u0001\u001a\u000204H\u0002J\f\u0010\u0087\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u0089\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u008a\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u008b\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u008c\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u008d\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u008e\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u008f\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u0090\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u0091\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u0092\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u0093\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u0094\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u0095\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u0096\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u0097\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u0098\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u0099\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u009a\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u009b\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u009c\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u009d\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u009e\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010\u009f\u0001\u001a\u00020p*\u00030\u0088\u0001J\f\u0010 \u0001\u001a\u00020p*\u00030\u0088\u0001R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u00102\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u0001040403¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001f\u00108\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u0001040403¢\u0006\b\n\u0000\u001a\u0004\b9\u00107R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010:\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u0001040403¢\u0006\b\n\u0000\u001a\u0004\b;\u00107R\u0016\u0010<\u001a\n 5*\u0004\u0018\u00010=0=X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010>\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010@0@0?X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010A\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u0001040403¢\u0006\b\n\u0000\u001a\u0004\bB\u00107R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010C\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010D0D03¢\u0006\b\n\u0000\u001a\u0004\bE\u00107R\u0014\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001a0GX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010H\u001a\u0004\u0018\u00010IX\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010J\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u0001040403¢\u0006\b\n\u0000\u001a\u0004\bK\u00107R\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020403¢\u0006\b\n\u0000\u001a\u0004\bM\u00107R\u0014\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001c0GX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010O\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u0001040403¢\u0006\b\n\u0000\u001a\u0004\bP\u00107R\u0010\u0010Q\u001a\u0004\u0018\u00010RX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010S\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010D0D03¢\u0006\b\n\u0000\u001a\u0004\bT\u00107R\u001f\u0010U\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u0001040403¢\u0006\b\n\u0000\u001a\u0004\bV\u00107R\u001f\u0010W\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010D0D03¢\u0006\b\n\u0000\u001a\u0004\bW\u00107R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010X\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u0001040403¢\u0006\b\n\u0000\u001a\u0004\bY\u00107R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010Z\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u001e0\u001e0GX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010[\u001a\u0004\u0018\u00010\\X\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010]\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u0001040403¢\u0006\b\n\u0000\u001a\u0004\b^\u00107R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010_\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u0001040403¢\u0006\b\n\u0000\u001a\u0004\b`\u00107R\u001f\u0010a\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u0001040403¢\u0006\b\n\u0000\u001a\u0004\bb\u00107R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010c\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u0001040403¢\u0006\b\n\u0000\u001a\u0004\bd\u00107R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010e\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010D0D03¢\u0006\b\n\u0000\u001a\u0004\bf\u00107R\u001f\u0010g\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u0001040403¢\u0006\b\n\u0000\u001a\u0004\bh\u00107R\u0010\u0010i\u001a\u0004\u0018\u00010jX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020lX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010m\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u0001040403¢\u0006\b\n\u0000\u001a\u0004\bn\u00107¨\u0006¢\u0001"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "loginCloudService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "updateInfoRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "deviceManager", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;", "dbManager", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;", "dialogManager", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;", "languageController", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;", "goalsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "activityPeriodCacheClear", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;", "activity", "Landroid/app/Activity;", "fragment", "Landroidx/fragment/app/Fragment;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "googleFitController", "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;", "stravaController", "Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;", "locationInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;", "bugfenderConfig", "Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;", "sleepTimeUIStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;", "deviceProtocolStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "connectionPreference", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;", "rxPermissions", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;Landroid/app/Activity;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V", "ageField", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getAgeField", "()Landroidx/databinding/ObservableField;", "appVersionField", "getAppVersionField", "caloriesField", "getCaloriesField", "clickObservable", "Lio/reactivex/Completable;", "clickSubject", "Lio/reactivex/subjects/PublishSubject;", "", "clockField", "getClockField", "connectionStatus", "", "getConnectionStatus", "contextWeakReference", "Ljava/lang/ref/WeakReference;", "disposable", "Lio/reactivex/disposables/Disposable;", "emailField", "getEmailField", "firmwareVersionField", "getFirmwareVersionField", "fragmentWeakReference", "genderField", "getGenderField", "goalConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;", "googleFitStatus", "getGoogleFitStatus", "heightField", "getHeightField", "isUpdateAvailable", "languageField", "getLanguageField", "managerWeakReference", "pairedDevice", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;", "powerField", "getPowerField", "sleepField", "getSleepField", "sleepTimeField", "getSleepTimeField", "stepsField", "getStepsField", "stravaStatus", "getStravaStatus", "unitsField", "getUnitsField", "updateInfo", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;", "user", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "weightField", "getWeightField", "authorizationCanceled", "", "authorizationSuccess", "createAppInfoData", "displaySleepTime", "deviceID", "enableConnectionOptimization", "value", "enableConnectionOptimizationDialog", "enable", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "approved", "isConnectionOptimized", "loadFWVersion", "onCreateView", "context", "Landroid/content/Context;", "onStart", "openSecretScreen", "printMessage", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "onAgeClicked", "Landroid/view/View;", "onAppVersionFieldClick", "onCaloriesClicked", "onChangePasswordClicked", "onClockClicked", "onContactSupportClicked", "onDailySettingsClicked", "onGenderClicked", "onHeightClicked", "onLanguageClicked", "onLocationRequested", "onLogoutClicked", "onNotificationSettingsClicked", "onNotificationsClicked", "onPersonalPreferencesSettingsClicked", "onPowerClicked", "onReportIssueClicked", "onSleepClicked", "onSleepTimeClicked", "onStepsClicked", "onUnPairClicked", "onUnitsClicked", "onUpdateClicked", "onWatchSettingsClicked", "onWeightClicked", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PWWatchViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.class).getSimpleName();
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.ActivityPeriodCacheClear activityPeriodCacheClear;
    private final androidx.databinding.ObservableField<java.lang.String> ageField;
    private final androidx.databinding.ObservableField<java.lang.String> appVersionField;
    private final powerwatch.matrix.com.pwgen2android.BugfenderConfig bugfenderConfig;
    private final androidx.databinding.ObservableField<java.lang.String> caloriesField;
    private final io.reactivex.Completable clickObservable;
    private final io.reactivex.subjects.PublishSubject<java.lang.Integer> clickSubject;
    private final androidx.databinding.ObservableField<java.lang.String> clockField;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference connectionPreference;
    private final androidx.databinding.ObservableField<java.lang.Boolean> connectionStatus;
    private final java.lang.ref.WeakReference<android.app.Activity> contextWeakReference;
    private final powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager dbManager;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage deviceProtocolStorage;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager dialogManager;
    private io.reactivex.disposables.Disposable disposable;
    private final androidx.databinding.ObservableField<java.lang.String> emailField;
    private final androidx.databinding.ObservableField<java.lang.String> firmwareVersionField;
    private final java.lang.ref.WeakReference<androidx.fragment.app.Fragment> fragmentWeakReference;
    private final androidx.databinding.ObservableField<java.lang.String> genderField;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalsRepository;
    private final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController;
    private final androidx.databinding.ObservableField<java.lang.Boolean> googleFitStatus;
    private final androidx.databinding.ObservableField<java.lang.String> heightField;
    private final androidx.databinding.ObservableField<java.lang.Boolean> isUpdateAvailable;
    private final powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController;
    private final androidx.databinding.ObservableField<java.lang.String> languageField;
    private final powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider locationInfoProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> managerWeakReference;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.Device pairedDevice;
    private final androidx.databinding.ObservableField<java.lang.String> powerField;
    private final com.tbruyelle.rxpermissions2.RxPermissions rxPermissions;
    private final androidx.databinding.ObservableField<java.lang.String> sleepField;
    private final androidx.databinding.ObservableField<java.lang.String> sleepTimeField;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeUIStorage sleepTimeUIStorage;
    private final androidx.databinding.ObservableField<java.lang.String> stepsField;
    private final powerwatch.matrix.com.pwgen2android.strava.StravaController stravaController;
    private final androidx.databinding.ObservableField<java.lang.Boolean> stravaStatus;
    private final androidx.databinding.ObservableField<java.lang.String> unitsField;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo updateInfo;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepository updateInfoRepository;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.User user;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;
    private final androidx.databinding.ObservableField<java.lang.String> weightField;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAppVersionFieldClick$lambda-31, reason: not valid java name */
    public static final void m1935onAppVersionFieldClick$lambda31(java.lang.Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-9, reason: not valid java name */
    public static final void m1939onCreateView$lambda9(java.lang.Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLocationRequested$lambda-19, reason: not valid java name */
    public static final void m1943onLocationRequested$lambda19(java.lang.Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLogoutClicked$lambda-14, reason: not valid java name */
    public static final void m1949onLogoutClicked$lambda14() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLogoutClicked$lambda-15, reason: not valid java name */
    public static final void m1950onLogoutClicked$lambda15(java.lang.Throwable th) {
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWWatchViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepository updateInfoRepository, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager dbManager, powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager dialogManager, powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalsRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.ActivityPeriodCacheClear activityPeriodCacheClear, android.app.Activity activity, androidx.fragment.app.Fragment fragment, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController, powerwatch.matrix.com.pwgen2android.strava.StravaController stravaController, powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider locationInfoProvider, powerwatch.matrix.com.pwgen2android.BugfenderConfig bugfenderConfig, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeUIStorage sleepTimeUIStorage, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage deviceProtocolStorage, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference connectionPreference, com.tbruyelle.rxpermissions2.RxPermissions rxPermissions) throws android.content.pm.PackageManager.NameNotFoundException {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginCloudService, "loginCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoRepository, "updateInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dbManager, "dbManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogManager, "dialogManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageController, "languageController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalsRepository, "goalsRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityPeriodCacheClear, "activityPeriodCacheClear");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleFitController, "googleFitController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stravaController, "stravaController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationInfoProvider, "locationInfoProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bugfenderConfig, "bugfenderConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepTimeUIStorage, "sleepTimeUIStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceProtocolStorage, "deviceProtocolStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionPreference, "connectionPreference");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxPermissions, "rxPermissions");
        this.userAccountRepository = userAccountRepository;
        this.loginCloudService = loginCloudService;
        this.deviceRepository = deviceRepository;
        this.updateInfoRepository = updateInfoRepository;
        this.userPrefsUtils = userPrefsUtils;
        this.deviceManager = deviceManager;
        this.dbManager = dbManager;
        this.dialogManager = dialogManager;
        this.languageController = languageController;
        this.goalsRepository = goalsRepository;
        this.activityPeriodCacheClear = activityPeriodCacheClear;
        this.googleFitController = googleFitController;
        this.stravaController = stravaController;
        this.locationInfoProvider = locationInfoProvider;
        this.bugfenderConfig = bugfenderConfig;
        this.sleepTimeUIStorage = sleepTimeUIStorage;
        this.deviceProtocolStorage = deviceProtocolStorage;
        this.communicator = communicator;
        this.connectionPreference = connectionPreference;
        this.rxPermissions = rxPermissions;
        this.emailField = new androidx.databinding.ObservableField<>("");
        this.languageField = new androidx.databinding.ObservableField<>("");
        this.unitsField = new androidx.databinding.ObservableField<>("");
        this.clockField = new androidx.databinding.ObservableField<>("");
        this.weightField = new androidx.databinding.ObservableField<>("");
        this.heightField = new androidx.databinding.ObservableField<>("");
        this.ageField = new androidx.databinding.ObservableField<>("");
        this.genderField = new androidx.databinding.ObservableField<>("");
        this.sleepTimeField = new androidx.databinding.ObservableField<>("");
        this.stepsField = new androidx.databinding.ObservableField<>("");
        this.caloriesField = new androidx.databinding.ObservableField<>("");
        this.sleepField = new androidx.databinding.ObservableField<>("");
        this.powerField = new androidx.databinding.ObservableField<>("");
        androidx.databinding.ObservableField<java.lang.Boolean> observableField = new androidx.databinding.ObservableField<>(false);
        this.googleFitStatus = observableField;
        androidx.databinding.ObservableField<java.lang.Boolean> observableField2 = new androidx.databinding.ObservableField<>(false);
        this.connectionStatus = observableField2;
        androidx.databinding.ObservableField<java.lang.Boolean> observableField3 = new androidx.databinding.ObservableField<>(false);
        this.stravaStatus = observableField3;
        this.firmwareVersionField = new androidx.databinding.ObservableField<>();
        androidx.databinding.ObservableField<java.lang.Boolean> observableField4 = new androidx.databinding.ObservableField<>(false);
        this.isUpdateAvailable = observableField4;
        androidx.databinding.ObservableField<java.lang.String> observableField5 = new androidx.databinding.ObservableField<>("");
        this.appVersionField = observableField5;
        this.managerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        java.lang.ref.WeakReference<android.app.Activity> weakReference = new java.lang.ref.WeakReference<>(activity);
        this.contextWeakReference = weakReference;
        this.fragmentWeakReference = new java.lang.ref.WeakReference<>(fragment);
        io.reactivex.subjects.PublishSubject<java.lang.Integer> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Int>()");
        this.clickSubject = publishSubjectCreate;
        this.clickObservable = publishSubjectCreate.take(12L).ignoreElements().timeout(6000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        android.app.Activity activity2 = weakReference.get();
        if (activity2 != null) {
            observableField3.set(java.lang.Boolean.valueOf(stravaController.hasAuthorize()));
            observableField2.set(java.lang.Boolean.valueOf(isConnectionOptimized()));
            observableField2.addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.1
                @Override // androidx.databinding.Observable.OnPropertyChangedCallback
                public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                    java.lang.Boolean bool = powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.this.getConnectionStatus().get();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.valueOf(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.this.isConnectionOptimized()))) {
                        return;
                    }
                    powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel pWWatchViewModel = powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.this;
                    java.lang.Boolean bool2 = pWWatchViewModel.getConnectionStatus().get();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(bool2);
                    boolean zBooleanValue = bool2.booleanValue();
                    final powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel pWWatchViewModel2 = powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.this;
                    pWWatchViewModel.enableConnectionOptimizationDialog(zBooleanValue, new kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel$1$onPropertyChanged$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool3) {
                            invoke(bool3.booleanValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            if (z) {
                                powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel pWWatchViewModel3 = pWWatchViewModel2;
                                java.lang.Boolean bool3 = pWWatchViewModel3.getConnectionStatus().get();
                                kotlin.jvm.internal.Intrinsics.checkNotNull(bool3);
                                pWWatchViewModel3.enableConnectionOptimization(bool3.booleanValue());
                                return;
                            }
                            pWWatchViewModel2.getConnectionStatus().set(java.lang.Boolean.valueOf(pWWatchViewModel2.isConnectionOptimized()));
                        }
                    });
                }
            });
            android.content.pm.PackageInfo packageInfo = activity2.getPackageManager().getPackageInfo(activity2.getPackageName(), 0);
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string = activity2.getString(powerwatch.matrix.com.pwgen2android.R.string.app_version, new java.lang.Object[]{packageInfo.versionName, java.lang.String.valueOf(packageInfo.versionCode)});
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.app_version, packageInfo.versionName, packageInfo.versionCode.toString())");
            java.lang.String str = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            observableField5.set(str);
            observableField4.set(false);
            getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository.DefaultImpls.load$default(deviceRepository, false, false, 3, null).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$bmYTqLxSQMdFql90ht7vllH_Q-Q
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1919_init_$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.Device) obj);
                }
            }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$62QPzlPexLtORULzwGcxZ4BAQ3Q
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1920_init_$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.Device) obj);
                }
            }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$tWK0FVLn7rl-fMXFKvIkhaANw7w
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1921_init_$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo) obj);
                }
            }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$ZFc_YulnOxdOlIZo97OqPJmsJNE
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    ((java.lang.Throwable) obj).printStackTrace();
                }
            }));
            getCompositeDisposable().add(googleFitController.getSubscription().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$Jqf1obOIfGMKfXXqv79ZAuuEyZo
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1923_init_$lambda4(this.f$0, (java.lang.Boolean) obj);
                }
            }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$DDKVnTH5hCzgH-kKMIt1Y5paF_U
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    ((java.lang.Throwable) obj).printStackTrace();
                }
            }));
            observableField.addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.8
                @Override // androidx.databinding.Observable.OnPropertyChangedCallback
                public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                    androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.this.fragmentWeakReference.get();
                    if (fragment2 == null) {
                        return;
                    }
                    java.lang.Boolean bool = powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.this.getGoogleFitStatus().get();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
                    if (bool.booleanValue()) {
                        powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.this.googleFitController.authorize(fragment2);
                    } else {
                        powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.this.googleFitController.disable();
                    }
                }
            });
            observableField3.addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.9
                @Override // androidx.databinding.Observable.OnPropertyChangedCallback
                public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                    android.app.Activity activity3;
                    if (((androidx.fragment.app.Fragment) powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.this.fragmentWeakReference.get()) == null || (activity3 = (android.app.Activity) powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.this.contextWeakReference.get()) == null) {
                        return;
                    }
                    java.lang.Boolean bool = powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.this.getStravaStatus().get();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
                    if (bool.booleanValue()) {
                        powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.this.stravaController.authorize(activity3);
                    } else {
                        powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.this.stravaController.revoke();
                    }
                }
            });
        }
    }

    public /* synthetic */ PWWatchViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepository updateInfoRepository, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager dBManager, powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager dialogManager, powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.ActivityPeriodCacheClear activityPeriodCacheClear, android.app.Activity activity, androidx.fragment.app.Fragment fragment, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController, powerwatch.matrix.com.pwgen2android.strava.StravaController stravaController, powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider locationInfoProvider, powerwatch.matrix.com.pwgen2android.BugfenderConfig bugfenderConfig, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeUIStorage sleepTimeUIStorage, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage deviceProtocolStorage, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference connectionPreference, com.tbruyelle.rxpermissions2.RxPermissions rxPermissions, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(userAccountRepository, loginCloudService, deviceRepository, updateInfoRepository, userPrefsUtils, deviceManager, dBManager, dialogManager, languageController, goalConfigurationRepository, activityPeriodCacheClear, activity, fragment, fragmentManager, googleFitController, stravaController, locationInfoProvider, bugfenderConfig, sleepTimeUIStorage, deviceProtocolStorage, communicator, connectionPreference, (i & 4194304) != 0 ? new com.tbruyelle.rxpermissions2.RxPermissions(fragment) : rxPermissions);
    }

    public final androidx.databinding.ObservableField<java.lang.String> getEmailField() {
        return this.emailField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getLanguageField() {
        return this.languageField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getUnitsField() {
        return this.unitsField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getClockField() {
        return this.clockField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getWeightField() {
        return this.weightField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getHeightField() {
        return this.heightField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getAgeField() {
        return this.ageField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getGenderField() {
        return this.genderField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getSleepTimeField() {
        return this.sleepTimeField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getStepsField() {
        return this.stepsField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getCaloriesField() {
        return this.caloriesField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getSleepField() {
        return this.sleepField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getPowerField() {
        return this.powerField;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getGoogleFitStatus() {
        return this.googleFitStatus;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getConnectionStatus() {
        return this.connectionStatus;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getStravaStatus() {
        return this.stravaStatus;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getFirmwareVersionField() {
        return this.firmwareVersionField;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> isUpdateAvailable() {
        return this.isUpdateAvailable;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getAppVersionField() {
        return this.appVersionField;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m1919_init_$lambda0(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.pairedDevice = device;
        androidx.databinding.ObservableField<java.lang.String> firmwareVersionField = this$0.getFirmwareVersionField();
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device device2 = this$0.pairedDevice;
        firmwareVersionField.set(device2 == null ? null : device2.getFirmwareVersion());
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device device3 = this$0.pairedDevice;
        this$0.displaySleepTime(device3 != null ? device3.getBluetoothAddress() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1920_init_$lambda1(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.Device it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.updateInfoRepository.getOne(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoParams(java.lang.String.valueOf(it.getPid()), "en"), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-2, reason: not valid java name */
    public static final void m1921_init_$lambda2(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo updateInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.util.Log.d(TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Update info has received.. ", updateInfo));
        this$0.updateInfo = updateInfo;
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device device = this$0.pairedDevice;
        if (updateInfo.isUpdateAvailable(device == null ? null : device.getFirmwareVersion())) {
            this$0.isUpdateAvailable().set(true);
        } else {
            this$0.isUpdateAvailable().set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-4, reason: not valid java name */
    public static final void m1923_init_$lambda4(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel this$0, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getGoogleFitStatus().set(bool);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        androidx.databinding.ObservableField<java.lang.String> observableField = this.sleepTimeField;
        android.app.Activity activity = this.contextWeakReference.get();
        observableField.set(activity == null ? null : activity.getString(powerwatch.matrix.com.pwgen2android.R.string.sleep_time_fw_update));
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetFirstRepository.DefaultImpls.getFirst$default(this.userAccountRepository, false, false, 3, null).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$XbR2SFA1SnwomFZOdHmsl8z3O4Y
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1936onCreateView$lambda6(this.f$0, context, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$YzLcvqy1roivdrVFbD54QDPInIw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository.DefaultImpls.load$default(this.goalsRepository, false, false, 3, null).firstOrError().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$Yz9er8oSqQvynqxybkufATavWcE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1938onCreateView$lambda8(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$nI6Kpi3x6hYpF_mDrJDj9monvCQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1939onCreateView$lambda9((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-6, reason: not valid java name */
    public static final void m1936onCreateView$lambda6(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel this$0, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.data.models.User it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        this$0.bugfenderConfig.setUserEmail(it.getEmail());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.user = it;
        this$0.getEmailField().set(it.getEmail());
        int i = this$0.userPrefsUtils.isMetricsUsed(it) ? powerwatch.matrix.com.pwgen2android.R.string.metrics_units : powerwatch.matrix.com.pwgen2android.R.string.imperials_units;
        int i2 = this$0.userPrefsUtils.isTwelveHourFormatUsed(it) ? powerwatch.matrix.com.pwgen2android.R.string.twelve_clock : powerwatch.matrix.com.pwgen2android.R.string.twenty_four_clock;
        androidx.databinding.ObservableField<java.lang.String> unitsField = this$0.getUnitsField();
        android.app.Activity activity = this$0.contextWeakReference.get();
        unitsField.set(activity == null ? null : activity.getString(i));
        androidx.databinding.ObservableField<java.lang.String> clockField = this$0.getClockField();
        android.app.Activity activity2 = this$0.contextWeakReference.get();
        clockField.set(activity2 == null ? null : activity2.getString(i2));
        kotlin.Pair<java.lang.Float, java.lang.String> value = this$0.userPrefsUtils.getValue(java.lang.Integer.valueOf(it.getHeight()), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.HEIGHT.INSTANCE);
        this$0.getHeightField().set(kotlin.math.MathKt.roundToInt(value.getFirst().floatValue()) + value.getSecond());
        kotlin.Pair<java.lang.Float, java.lang.String> value2 = this$0.userPrefsUtils.getValue(java.lang.Float.valueOf(it.getWeight()), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.WEIGHT.INSTANCE);
        this$0.getWeightField().set(kotlin.math.MathKt.roundToInt(value2.getFirst().floatValue()) + value2.getSecond());
        this$0.getAgeField().set(java.lang.String.valueOf(it.getAge()));
        int displayResource = kotlin.jvm.internal.Intrinsics.areEqual(it.getGender(), powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDescription()) ? powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDisplayResource() : powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Female.INSTANCE.getDisplayResource();
        android.app.Activity activity3 = this$0.contextWeakReference.get();
        java.lang.String string = activity3 != null ? activity3.getString(displayResource) : null;
        if (string == null) {
            string = it.getGender();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "contextWeakReference.get()?.getString(res) ?: it.gender");
        this$0.getGenderField().set(string);
        powerwatch.matrix.com.pwgen2android.utils.LanguageInfo language = this$0.languageController.getLanguage(it.getAccountSettings().getLanguage());
        if (this$0.contextWeakReference.get() == null || language == null) {
            return;
        }
        this$0.getLanguageField().set(context.getString(language.getLanguageDisplay()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-8, reason: not valid java name */
    public static final void m1938onCreateView$lambda8(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goalConfig = goalConfiguration;
        this$0.getStepsField().set(java.lang.String.valueOf(goalConfiguration.getSteps()));
        this$0.getCaloriesField().set(java.lang.String.valueOf(goalConfiguration.getCalories()));
        androidx.databinding.ObservableField<java.lang.String> sleepField = this$0.getSleepField();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(goalConfiguration.getSleep() / 60);
        sb.append('h');
        sleepField.set(sb.toString());
        this$0.getPowerField().set(goalConfiguration.getPower() + powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.powerUnit);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onStart(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onStart(context);
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device device = this.pairedDevice;
        displaySleepTime(device == null ? null : device.getBluetoothAddress());
    }

    static /* synthetic */ void displaySleepTime$default(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel pWWatchViewModel, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pWWatchViewModel.displaySleepTime(str);
    }

    private final void displaySleepTime(java.lang.String deviceID) {
        if (this.deviceProtocolStorage.getDeviceProtocolVersion(deviceID) < 3) {
            androidx.databinding.ObservableField<java.lang.String> observableField = this.sleepTimeField;
            android.app.Activity activity = this.contextWeakReference.get();
            observableField.set(activity == null ? null : activity.getString(powerwatch.matrix.com.pwgen2android.R.string.sleep_time_fw_update));
            return;
        }
        this.sleepTimeField.set(this.sleepTimeUIStorage.getDisplayValue());
    }

    public final void onUpdateClicked(android.view.View view) {
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device device;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo updateInfo = this.updateInfo;
        if (updateInfo == null || (device = this.pairedDevice) == null) {
            return;
        }
        if (updateInfo.isUpdateAvailable(device == null ? null : device.getFirmwareVersion()) || updateInfo.getForced()) {
            java.lang.String releaseVersion = updateInfo.getReleaseVersion();
            powerwatch.matrix.com.pwgen2android.shared.data.models.Device device2 = this.pairedDevice;
            java.lang.String firmwareVersion = device2 == null ? null : device2.getFirmwareVersion();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firmwareVersion);
            java.lang.String releaseNotes = updateInfo.getReleaseNotes();
            java.lang.String downloadUrl = updateInfo.getDownloadUrl();
            powerwatch.matrix.com.pwgen2android.shared.data.models.Device device3 = this.pairedDevice;
            powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData firmwareDisplayData = new powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData(releaseVersion, firmwareVersion, releaseNotes, downloadUrl, device3 == null ? 1 : device3.getPid(), updateInfo.getReleaseDate());
            powerwatch.matrix.com.pwgen2android.shared.data.models.Device device4 = this.pairedDevice;
            java.lang.String bluetoothAddress = device4 == null ? null : device4.getBluetoothAddress();
            powerwatch.matrix.com.pwgen2android.shared.data.models.Device device5 = this.pairedDevice;
            powerwatch.matrix.com.pwgen2android.main.update.DeviceUpdateData deviceUpdateData = new powerwatch.matrix.com.pwgen2android.main.update.DeviceUpdateData(bluetoothAddress, device5 != null ? device5.getFirmwareVersion() : null);
            java.lang.Boolean bool = this.isUpdateAvailable.get();
            if (bool == null) {
                bool = false;
            }
            powerwatch.matrix.com.pwgen2android.main.update.UpdateAvailableData updateAvailableData = new powerwatch.matrix.com.pwgen2android.main.update.UpdateAvailableData(firmwareDisplayData, deviceUpdateData, bool.booleanValue());
            androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
            if (fragmentManager == null) {
                return;
            }
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableFragment.INSTANCE.newInstance(updateAvailableData.getVersion(), updateAvailableData.getDeviceInfo(), updateAvailableData.getUpdateAvailable()), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
        }
    }

    public final void onLogoutClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        io.reactivex.disposables.CompositeDisposable compositeDisposable = getCompositeDisposable();
        powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager dialogManager = this.dialogManager;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
        compositeDisposable.add(powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager.DefaultImpls.openAlertDialog$default(dialogManager, context, powerwatch.matrix.com.pwgen2android.R.string.information_dialog_title, powerwatch.matrix.com.pwgen2android.R.string.logout_dialog_message, 0, 0, 24, null).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$dzKBkFX5lv41c1vpA_x6nl5dtfo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1945onLogoutClicked$lambda13(this.f$0, (java.lang.Boolean) obj);
            }
        }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$fCNw_JASlY25ot1NKsyIXvvZYqY
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1949onLogoutClicked$lambda14();
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$0Y3Rnw1qStN4mMro6H1oR3IocYw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1950onLogoutClicked$lambda15((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLogoutClicked$lambda-13, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1945onLogoutClicked$lambda13(final powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel this$0, java.lang.Boolean it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it.booleanValue()) {
            return this$0.loginCloudService.logout().andThen(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetFirstRepository.DefaultImpls.getFirst$default(this$0.userAccountRepository, true, false, 2, null).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$e9cpvLrIxhEbx2hlaIm2QmtO1ys
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1946onLogoutClicked$lambda13$lambda10(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
                }
            }).andThen(this$0.dbManager.clearBackgroundAndActivityLogsCompletable()).andThen(this$0.dbManager.clearDevicesCompletable()).andThen(this$0.activityPeriodCacheClear.clear()).andThen(this$0.goalsRepository.deleteAll()).doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$TXu5D_4_uJuO5WF6igkgIxAeoXg
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1947onLogoutClicked$lambda13$lambda11(this.f$0, (java.lang.Throwable) obj);
                }
            }).onErrorComplete()).doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$fuE_QShYnKrR-XHwA7CSDOzgwh8
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1948onLogoutClicked$lambda13$lambda12(this.f$0, (java.lang.Throwable) obj);
                }
            });
        }
        return io.reactivex.Completable.complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLogoutClicked$lambda-13$lambda-10, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1946onLogoutClicked$lambda13$lambda10(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.User it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.userAccountRepository.delete(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLogoutClicked$lambda-13$lambda-11, reason: not valid java name */
    public static final void m1947onLogoutClicked$lambda13$lambda11(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deviceManager.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLogoutClicked$lambda-13$lambda-12, reason: not valid java name */
    public static final void m1948onLogoutClicked$lambda13$lambda12(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.app.Activity activity = this$0.contextWeakReference.get();
        if (activity != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.goToSetupActivity(activity, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.WelcomeScreen.INSTANCE);
        }
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    public final void onLocationRequested(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        getCompositeDisposable().add(this.rxPermissions.request("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION").flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$Hf86PAoBSiW8J_iU6WFDMu_UoYM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1940onLocationRequested$lambda18(this.f$0, (java.lang.Boolean) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$hTh6jfxqLUNP-izY2lsjdb_N-TM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1943onLocationRequested$lambda19((java.lang.Boolean) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$--UZa82Ld_WCdGNDbv9A6kgup5U
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLocationRequested$lambda-18, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1940onLocationRequested$lambda18(final powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel this$0, java.lang.Boolean approved) {
        io.reactivex.Observable observableJust;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(approved, "approved");
        if (approved.booleanValue()) {
            observableJust = this$0.locationInfoProvider.getLastKnownLocation().doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$W3iysnAuvTmCskuzDVsEBc5tkh0
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1941onLocationRequested$lambda18$lambda16(this.f$0, (kotlin.Pair) obj);
                }
            }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$53kHF_Y5ugd6BNPS-4_scSwCVhw
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1942onLocationRequested$lambda18$lambda17((kotlin.Pair) obj);
                }
            }).toObservable();
        } else {
            observableJust = io.reactivex.Observable.just(approved);
        }
        return observableJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLocationRequested$lambda-18$lambda-16, reason: not valid java name */
    public static final void m1941onLocationRequested$lambda18$lambda16(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Location found: ");
            android.location.Location location = (android.location.Location) pair.getSecond();
            sb.append(location == null ? null : java.lang.Double.valueOf(location.getLatitude()));
            sb.append(" , ");
            android.location.Location location2 = (android.location.Location) pair.getSecond();
            sb.append(location2 != null ? java.lang.Double.valueOf(location2.getLongitude()) : null);
            java.lang.System.out.println((java.lang.Object) sb.toString());
            this$0.printMessage("Location found");
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider locationInfoProvider = this$0.locationInfoProvider;
        android.app.Activity activity = this$0.contextWeakReference.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(activity);
        locationInfoProvider.showDialogForLocation(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLocationRequested$lambda-18$lambda-17, reason: not valid java name */
    public static final java.lang.Boolean m1942onLocationRequested$lambda18$lambda17(kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (java.lang.Boolean) it.getFirst();
    }

    private final void printMessage(java.lang.String message) {
        android.app.Activity activity = this.contextWeakReference.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(activity);
        android.widget.Toast.makeText(activity, message, 0).show();
    }

    public final void onUnPairClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogFragment unpairDialogFragmentNewInstance = powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogFragment.INSTANCE.newInstance();
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(fragmentManager);
        unpairDialogFragmentNewInstance.show(fragmentManager, unpairDialogFragmentNewInstance.getClass().getSimpleName());
    }

    public final void onNotificationsClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.notifications.NotificationsFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onUnitsClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onSleepTimeClicked(android.view.View view) {
        java.lang.Object next;
        java.lang.String uid;
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device device;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        if (this.pairedDevice != null) {
            java.util.Iterator<T> it = this.communicator.connectedDevices().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    uid = ((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) next).getUid();
                    device = this.pairedDevice;
                }
            } while (!kotlin.jvm.internal.Intrinsics.areEqual(uid, device == null ? null : device.getBluetoothAddress()));
            if (((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) next) == null) {
                return;
            }
            powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage deviceProtocolStorage = this.deviceProtocolStorage;
            powerwatch.matrix.com.pwgen2android.shared.data.models.Device device2 = this.pairedDevice;
            if (deviceProtocolStorage.getDeviceProtocolVersion(device2 == null ? null : device2.getBluetoothAddress()) >= 3) {
                java.lang.String displayValue = this.sleepTimeUIStorage.getDisplayValue();
                powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.SleepTime sleepTime = powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.SleepTime.INSTANCE;
                java.lang.Object[] array = this.sleepTimeUIStorage.getPossibleValues().toArray(new java.lang.String[0]);
                java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig wheelConfig = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig(sleepTime, displayValue, new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter(new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData(null, (java.lang.String[]) array, 0, 0, null, 29, null), null, 2, null), 0, 0, 0, 56, null);
                androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
                if (fragmentManager == null) {
                    return;
                }
                powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment.INSTANCE.newInstance(wheelConfig), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
            }
        }
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

    public final void onChangePasswordClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onHeightClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils = this.userPrefsUtils;
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user = this.user;
        if (user == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
            throw null;
        }
        kotlin.Pair<java.lang.Float, java.lang.String> value = userPrefsUtils.getValue(java.lang.Integer.valueOf(user.getHeight()), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.HEIGHT.INSTANCE);
        powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils2 = this.userPrefsUtils;
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user2 = this.user;
        if (user2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
            throw null;
        }
        boolean zIsMetricsUsed = userPrefsUtils2.isMetricsUsed(user2);
        int iMaxUnitValue = this.userPrefsUtils.maxUnitValue(powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.HEIGHT.INSTANCE, zIsMetricsUsed);
        int iMinUnitValue = this.userPrefsUtils.minUnitValue(powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.HEIGHT.INSTANCE, zIsMetricsUsed);
        java.lang.String str = kotlin.math.MathKt.roundToInt(value.getFirst().floatValue()) + value.getSecond();
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Height height = powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Height.INSTANCE;
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(iMinUnitValue, iMaxUnitValue);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((kotlin.collections.IntIterator) it).nextInt()));
        }
        java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
        java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig wheelConfig = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig(height, str, new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter(new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData(str, (java.lang.String[]) array, iMaxUnitValue, iMinUnitValue, null, 16, null), value.getSecond()), iMaxUnitValue, iMinUnitValue, 0, 32, null);
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment.INSTANCE.newInstance(wheelConfig), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onWeightClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils = this.userPrefsUtils;
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user = this.user;
        if (user == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
            throw null;
        }
        kotlin.Pair<java.lang.Float, java.lang.String> value = userPrefsUtils.getValue(java.lang.Float.valueOf(user.getWeight()), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.WEIGHT.INSTANCE);
        java.lang.String str = kotlin.math.MathKt.roundToInt(value.getFirst().floatValue()) + value.getSecond();
        powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils2 = this.userPrefsUtils;
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user2 = this.user;
        if (user2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
            throw null;
        }
        boolean zIsMetricsUsed = userPrefsUtils2.isMetricsUsed(user2);
        int iMaxUnitValue = this.userPrefsUtils.maxUnitValue(powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.WEIGHT.INSTANCE, zIsMetricsUsed);
        int iMinUnitValue = this.userPrefsUtils.minUnitValue(powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.WEIGHT.INSTANCE, zIsMetricsUsed);
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight weight = powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight.INSTANCE;
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(iMinUnitValue, iMaxUnitValue);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((kotlin.collections.IntIterator) it).nextInt()));
        }
        java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
        java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig wheelConfig = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig(weight, str, new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter(new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData(str, (java.lang.String[]) array, 0, 0, null, 28, null), value.getSecond()), iMaxUnitValue, iMinUnitValue, 0, 32, null);
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment.INSTANCE.newInstance(wheelConfig), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onGenderClicked(android.view.View view) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user = this.user;
        if (user == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
            throw null;
        }
        java.lang.String gender = user.getGender();
        int displayResource = kotlin.jvm.internal.Intrinsics.areEqual(gender, powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDescription()) ? powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDisplayResource() : powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Female.INSTANCE.getDisplayResource();
        android.app.Activity activity = this.contextWeakReference.get();
        java.lang.String str = (activity == null || (string3 = activity.getString(displayResource)) == null) ? gender : string3;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "contextWeakReference.get()?.getString(res) ?: currentGender");
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Gender gender2 = powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Gender.INSTANCE;
        java.lang.String[] strArr = {powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDescription(), powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Female.INSTANCE.getDescription()};
        java.lang.String[] strArr2 = new java.lang.String[2];
        android.app.Activity activity2 = this.contextWeakReference.get();
        if (activity2 == null || (string = activity2.getString(powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDisplayResource())) == null) {
            string = gender;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "contextWeakReference.get()?.getString(Gender.Male.displayResource) ?: currentGender");
        strArr2[0] = string;
        android.app.Activity activity3 = this.contextWeakReference.get();
        if (activity3 != null && (string2 = activity3.getString(powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Female.INSTANCE.getDisplayResource())) != null) {
            gender = string2;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(gender, "contextWeakReference.get()?.getString(Gender.Female.displayResource) ?: currentGender");
        strArr2[1] = gender;
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig wheelConfig = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig(gender2, str, new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter(new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData(null, strArr, 0, 0, strArr2, 13, null), null, 2, null), 0, 0, 0, 56, null);
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment.INSTANCE.newInstance(wheelConfig), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onAgeClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user = this.user;
        if (user == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
            throw null;
        }
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig wheelConfig = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig(powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Age.INSTANCE, java.lang.String.valueOf(user.getAge()), null, 120, 13, 0, 36, null);
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

    public final void onStepsClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = this.goalConfig;
        if (goalConfiguration == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig editGoalConfig = new powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig(powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Steps.INSTANCE, java.lang.Integer.valueOf(goalConfiguration.getSteps()), "");
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment.INSTANCE.newInstance(editGoalConfig), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onCaloriesClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = this.goalConfig;
        if (goalConfiguration == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils = this.userPrefsUtils;
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user = this.user;
        if (user == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
            throw null;
        }
        powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig editGoalConfig = new powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig(powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Calories.INSTANCE, java.lang.Integer.valueOf(goalConfiguration.getCalories()), userPrefsUtils.isMetricsUsed(user) ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricCaloriesUnit : powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.imperialCaloriesUnit);
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment.INSTANCE.newInstance(editGoalConfig), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onSleepClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = this.goalConfig;
        if (goalConfiguration == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig editGoalConfig = new powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig(powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Sleep.INSTANCE, java.lang.Float.valueOf(goalConfiguration.getSleep() / 60), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.hourUnit);
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment.INSTANCE.newInstance(editGoalConfig), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onPowerClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = this.goalConfig;
        if (goalConfiguration == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig editGoalConfig = new powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig(powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Power.INSTANCE, java.lang.Integer.valueOf(goalConfiguration.getPower()), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.powerUnit);
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment.INSTANCE.newInstance(editGoalConfig), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onReportIssueClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onContactSupportClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        java.lang.String string = view.getContext().getString(powerwatch.matrix.com.pwgen2android.R.string.contact_support);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.contact_support)");
        java.lang.String string2 = view.getContext().getString(powerwatch.matrix.com.pwgen2android.R.string.matrix_support_email);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.matrix_support_email)");
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.EMAIL", new java.lang.String[]{string2});
        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.SUBJECT", string);
        intent.putExtra("android.intent.extra.TEXT", createAppInfoData());
        view.getContext().startActivity(android.content.Intent.createChooser(intent, string));
    }

    private final java.lang.String createAppInfoData() {
        java.lang.String str;
        java.lang.String str2 = android.os.Build.MODEL + ' ' + ((java.lang.Object) android.os.Build.VERSION.RELEASE);
        java.lang.String displayLanguage = java.util.Locale.getDefault().getDisplayLanguage();
        java.lang.String strLoadFWVersion = loadFWVersion();
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user = this.user;
        if (user == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
            throw null;
        }
        java.lang.String strStringPlus = kotlin.jvm.internal.Intrinsics.stringPlus("User email: ", user.getEmail());
        java.lang.String str3 = java.util.Locale.getDefault().getLanguage() + '_' + ((java.lang.Object) java.util.Locale.getDefault().getCountry());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Device: ");
        sb.append(str2);
        sb.append(", Platform: ");
        sb.append("Android");
        sb.append(", Device language: ");
        sb.append((java.lang.Object) displayLanguage);
        sb.append(", Country: ");
        sb.append(str3);
        sb.append(", App version: ");
        sb.append("1.5.6(197)");
        sb.append(' ');
        if (strLoadFWVersion.length() > 0) {
            str = ", " + strLoadFWVersion + ", ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(strStringPlus);
        return sb.toString();
    }

    private final java.lang.String loadFWVersion() {
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device device = this.pairedDevice;
        if ((device == null ? null : device.getFirmwareVersion()) == null) {
            return "";
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device device2 = this.pairedDevice;
        return kotlin.jvm.internal.Intrinsics.stringPlus("FW Version ", device2 != null ? device2.getFirmwareVersion() : null);
    }

    public final void onAppVersionFieldClick(final android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        io.reactivex.disposables.Disposable disposable = this.disposable;
        if (disposable == null || disposable.isDisposed()) {
            this.disposable = this.clickObservable.subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$OueR02RGmpMll6zOMjToBjVGjik
                @Override // io.reactivex.functions.Action
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1933onAppVersionFieldClick$lambda30(view, this);
                }
            }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$KvoeO4ySbNQRWD1hfd0nDTWLhYQ
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1935onAppVersionFieldClick$lambda31((java.lang.Throwable) obj);
                }
            });
        }
        this.clickSubject.onNext(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAppVersionFieldClick$lambda-30, reason: not valid java name */
    public static final void m1933onAppVersionFieldClick$lambda30(android.view.View this_onAppVersionFieldClick, final powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_onAppVersionFieldClick, "$this_onAppVersionFieldClick");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.widget.Toast.makeText(this_onAppVersionFieldClick.getContext(), "Secret screen will open now.", 0).show();
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$PLy5l8FDkPlWIxMZmJt1nFfiduM
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1934onAppVersionFieldClick$lambda30$lambda29(this.f$0);
            }
        }, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAppVersionFieldClick$lambda-30$lambda-29, reason: not valid java name */
    public static final void m1934onAppVersionFieldClick$lambda30$lambda29(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.openSecretScreen();
    }

    private final void openSecretScreen() {
        powerwatch.matrix.com.pwgen2android.secret.SecretScreenFragment secretScreenFragmentNewInstance = powerwatch.matrix.com.pwgen2android.secret.SecretScreenFragment.INSTANCE.newInstance();
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, secretScreenFragmentNewInstance, powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, true, null, 8, null);
    }

    public final void authorizationSuccess() {
        this.googleFitController.authorizationSuccess();
    }

    public final void authorizationCanceled() {
        this.googleFitStatus.set(false);
    }

    public final void enableConnectionOptimization(boolean value) {
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, kotlin.jvm.internal.Intrinsics.stringPlus("Connection setting updated to: ", java.lang.Boolean.valueOf(value)), null, 2, null);
        this.connectionPreference.enableAutoConnect(!value);
    }

    public final boolean isConnectionOptimized() {
        return !this.connectionPreference.isAutoConnectEnabled();
    }

    public final void enableConnectionOptimizationDialog(boolean enable, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        android.app.Activity activity = this.contextWeakReference.get();
        if (activity == null) {
            return;
        }
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager.DefaultImpls.openAlertDialog$default(this.dialogManager, activity, powerwatch.matrix.com.pwgen2android.R.string.connection_optimization_title, enable ? powerwatch.matrix.com.pwgen2android.R.string.connection_optimization_body_enabled : powerwatch.matrix.com.pwgen2android.R.string.connection_optimization_body_disabled, powerwatch.matrix.com.pwgen2android.R.string.button_ok, 0, 16, null).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$PWWatchViewModel$fDoawfkw43Jr3BjdeJflWc09VPQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.m1925enableConnectionOptimizationDialog$lambda32(callback, (java.lang.Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: enableConnectionOptimizationDialog$lambda-32, reason: not valid java name */
    public static final void m1925enableConnectionOptimizationDialog$lambda32(kotlin.jvm.functions.Function1 callback, java.lang.Boolean it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "$callback");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        callback.invoke(it);
    }

    public final void onDailySettingsClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment(fragmentManager, powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, true, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE);
    }

    public final void onWatchSettingsClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment(fragmentManager, powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, true, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE);
    }

    public final void onPersonalPreferencesSettingsClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment(fragmentManager, powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, true, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE);
    }

    public final void onNotificationSettingsClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsFragment.Companion companion = powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsFragment.INSTANCE;
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device device = this.pairedDevice;
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment(fragmentManager, companion.newInstance(device == null ? null : device.getBluetoothAddress()), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, true, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE);
    }
}
