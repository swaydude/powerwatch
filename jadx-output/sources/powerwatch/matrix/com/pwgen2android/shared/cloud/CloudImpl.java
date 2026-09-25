package powerwatch.matrix.com.pwgen2android.shared.cloud;

/* JADX INFO: compiled from: Cloud.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000¼\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\rBÿ\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\b\b\u0002\u0010,\u001a\u00020\u0002\u0012\b\b\u0002\u0010-\u001a\u00020\u0001\u0012\b\b\u0002\u0010.\u001a\u00020\u0003\u0012\b\b\u0002\u0010/\u001a\u00020\u0004\u0012\b\b\u0002\u00100\u001a\u00020\u0005\u0012\b\b\u0002\u00101\u001a\u00020\u0006\u0012\b\b\u0002\u00102\u001a\u00020\u0007\u0012\b\b\u0002\u00103\u001a\u00020\b\u0012\b\b\u0002\u00104\u001a\u00020\t\u0012\b\b\u0002\u00105\u001a\u00020\n\u0012\b\b\u0002\u00106\u001a\u00020\u000b\u0012\b\b\u0002\u00107\u001a\u00020\f\u0012\b\b\u0002\u00108\u001a\u00020\r¢\u0006\u0002\u00109J\u0013\u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010E\u001a\u00020FH\u0096\u0001J\u0011\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0096\u0001J\u0015\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0M0LH\u0096\u0001J\u0011\u0010O\u001a\u00020H2\u0006\u0010P\u001a\u00020QH\u0096\u0001J\u0011\u0010R\u001a\u00020H2\u0006\u0010S\u001a\u00020FH\u0096\u0001J\u0015\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0M0LH\u0096\u0001J%\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0M0L2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[H\u0096\u0001J%\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0M0L2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[H\u0096\u0001J\u001d\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0M0L2\u0006\u0010X\u001a\u00020YH\u0096\u0001J\u001d\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020`0M0L2\u0006\u0010X\u001a\u00020YH\u0096\u0001J%\u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020b0M0L2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[H\u0096\u0001J\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020N0L2\u0006\u0010d\u001a\u00020FH\u0096\u0001J\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020Q0L2\u0006\u0010f\u001a\u00020FH\u0096\u0001J\u001f\u0010g\u001a\b\u0012\u0004\u0012\u00020h0L2\u0006\u0010i\u001a\u00020F2\u0006\u0010j\u001a\u00020FH\u0096\u0001J\u000f\u0010k\u001a\b\u0012\u0004\u0012\u00020J0LH\u0096\u0001J\u0011\u0010l\u001a\u00020H2\u0006\u0010m\u001a\u00020<H\u0096\u0001J\u001f\u0010n\u001a\b\u0012\u0004\u0012\u00020o0L2\u0006\u0010m\u001a\u00020<2\u0006\u0010p\u001a\u00020oH\u0096\u0001J\t\u0010q\u001a\u00020rH\u0096\u0001J\u001f\u0010s\u001a\b\u0012\u0004\u0012\u00020J0L2\u0006\u0010S\u001a\u00020F2\u0006\u0010t\u001a\u00020FH\u0096\u0001J\t\u0010u\u001a\u00020HH\u0096\u0001J\u0011\u0010v\u001a\u00020H2\u0006\u0010w\u001a\u00020NH\u0096\u0001J\u0011\u0010x\u001a\u00020H2\u0006\u0010w\u001a\u00020NH\u0096\u0001J\u0011\u0010y\u001a\u00020H2\u0006\u0010S\u001a\u00020FH\u0096\u0001J\u0019\u0010z\u001a\u00020H2\u0006\u0010{\u001a\u00020F2\u0006\u0010|\u001a\u00020FH\u0096\u0001J\u0011\u0010}\u001a\u00020H2\u0006\u0010~\u001a\u00020UH\u0096\u0001J\u0019\u0010\u007f\u001a\u00020H2\u000e\u0010\u0080\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010MH\u0096\u0001J\u001a\u0010\u0082\u0001\u001a\u00020H2\u000e\u0010\u0083\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010MH\u0096\u0001J\u001a\u0010\u0085\u0001\u001a\u00020H2\u000e\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010MH\u0096\u0001J\u0019\u0010\u0088\u0001\u001a\u00020H2\r\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020Q0MH\u0096\u0001J\u0012\u0010\u008a\u0001\u001a\u00020H2\u0006\u0010w\u001a\u00020NH\u0096\u0001J\u0012\u0010\u008b\u0001\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0096\u0001J\u0012\u0010\u008c\u0001\u001a\u00020H2\u0006\u0010P\u001a\u00020QH\u0096\u0001R\u0018\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;X\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010?\u001a\u0010\u0012\f\u0012\n B*\u0004\u0018\u00010A0A0@X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u008d\u0001"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/SleepHourPeriodCloudService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;", "cloudConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;", "authService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;", "tokenProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;", "userAccountService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;", "deviceService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;", "hostInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;", "userDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "updateInfoService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;", "goalConfigurationService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationService;", "walkingLogService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogService;", "restingLogService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingLogService;", "sleepLogService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepLogService;", "userActivityService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;", "pushMessagingTokenProvider", "Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;", "userAccountCloudService", "loginCloudService", "deviceCloudService", "walkingHourPeriodCloudService", "restingHourPeriodCloudService", "sleepHourPeriodCloudService", "updateInfoCloudService", "goalConfigurationCloudService", "walkingLogCloudService", "restingLogCloudService", "sleepLogCloudService", "userActivityCloudService", "cloudErrorHandler", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/SleepHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;)V", "authRequiredError", "Lio/reactivex/Observable;", "", "getAuthRequiredError", "()Lio/reactivex/Observable;", "tokenRequestSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "addPushNotificationsToken", "Lio/reactivex/CompletableSource;", "token", "", "addUser", "Lio/reactivex/Completable;", "user", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "allDevices", "Lio/reactivex/Single;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;", "deleteUserActivity", "userActivity", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "forgotUserPassword", "email", "getAllConfigurations", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;", "getAllRestingPeriods", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "type", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;", "getAllSleepPeriods", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;", "getAllUserActivities", "getAllUserActivityDates", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;", "getAllWalkingPeriods", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;", "getDevice", "serialNumber", "getOneUserActivity", "id", "getUpdateInfo", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;", "pid", "language", "getUser", "handleApiError", "error", "handleAuthError", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;", "passwordCredentials", "isLoggedIn", "", com.google.firebase.analytics.FirebaseAnalytics.Event.LOGIN, "password", "logout", "registerDevice", "device", "removeDevice", "resendVerifyEmail", "resetUserPassword", "oldPassword", "newPassword", "save", "goalConfiguration", "saveAllRestingLogs", "restingLogs", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;", "saveAllSleepLogs", "sleepLogs", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;", "saveAllWalkingLogs", "walkingLogs", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;", "saveUserActivities", "userActivities", "updateDevice", "updateUser", "updateUserActivity", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CloudImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.WalkingHourPeriodCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.RestingHourPeriodCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.SleepHourPeriodCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.WalkingLogCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.RestingLogCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.SleepLogCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler {
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.SleepLogCloudService $$delegate_10;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService $$delegate_11;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService $$delegate_2;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.WalkingHourPeriodCloudService $$delegate_3;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.RestingHourPeriodCloudService $$delegate_4;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.SleepHourPeriodCloudService $$delegate_5;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoCloudService $$delegate_6;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationCloudService $$delegate_7;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.WalkingLogCloudService $$delegate_8;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.RestingLogCloudService $$delegate_9;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.AuthService authService;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler cloudErrorHandler;
    private final powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider hostInfoProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider tokenProvider;
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> tokenRequestSubject;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService userAccountCloudService;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserAccountService userAccountService;

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService
    public io.reactivex.CompletableSource addPushNotificationsToken(java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
        return this.userAccountCloudService.addPushNotificationsToken(token);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService
    public io.reactivex.Completable addUser(powerwatch.matrix.com.pwgen2android.shared.data.models.User user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "user");
        return this.userAccountCloudService.addUser(user);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>> allDevices() {
        return this.$$delegate_2.allDevices();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService
    public io.reactivex.Completable deleteUserActivity(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivity, "userActivity");
        return this.$$delegate_11.deleteUserActivity(userActivity);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService
    public io.reactivex.Completable forgotUserPassword(java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        return this.userAccountCloudService.forgotUserPassword(email);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationCloudService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration>> getAllConfigurations() {
        return this.$$delegate_7.getAllConfigurations();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.RestingHourPeriodCloudService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod>> getAllRestingPeriods(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return this.$$delegate_4.getAllRestingPeriods(page, type);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.SleepHourPeriodCloudService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod>> getAllSleepPeriods(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return this.$$delegate_5.getAllSleepPeriods(page, type);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>> getAllUserActivities(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        return this.$$delegate_11.getAllUserActivities(page);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate>> getAllUserActivityDates(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        return this.$$delegate_11.getAllUserActivityDates(page);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.WalkingHourPeriodCloudService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod>> getAllWalkingPeriods(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return this.$$delegate_3.getAllWalkingPeriods(page, type);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler
    public io.reactivex.Observable<java.lang.Throwable> getAuthRequiredError() {
        return this.cloudErrorHandler.getAuthRequiredError();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> getDevice(java.lang.String serialNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        return this.$$delegate_2.getDevice(serialNumber);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> getOneUserActivity(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        return this.$$delegate_11.getOneUserActivity(id);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoCloudService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo> getUpdateInfo(java.lang.String pid, java.lang.String language) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pid, "pid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "language");
        return this.$$delegate_6.getUpdateInfo(pid, language);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.User> getUser() {
        return this.userAccountCloudService.getUser();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler
    public io.reactivex.Completable handleApiError(java.lang.Throwable error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        return this.cloudErrorHandler.handleApiError(error);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials> handleAuthError(java.lang.Throwable error, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials passwordCredentials) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordCredentials, "passwordCredentials");
        return this.cloudErrorHandler.handleAuthError(error, passwordCredentials);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService
    public boolean isLoggedIn() {
        return this.loginCloudService.isLoggedIn();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.User> login(java.lang.String email, java.lang.String password) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "password");
        return this.loginCloudService.login(email, password);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService
    public io.reactivex.Completable logout() {
        return this.loginCloudService.logout();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService
    public io.reactivex.Completable registerDevice(powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        return this.$$delegate_2.registerDevice(device);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService
    public io.reactivex.Completable removeDevice(powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        return this.$$delegate_2.removeDevice(device);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService
    public io.reactivex.Completable resendVerifyEmail(java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        return this.userAccountCloudService.resendVerifyEmail(email);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService
    public io.reactivex.Completable resetUserPassword(java.lang.String oldPassword, java.lang.String newPassword) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldPassword, "oldPassword");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newPassword, "newPassword");
        return this.userAccountCloudService.resetUserPassword(oldPassword, newPassword);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationCloudService
    public io.reactivex.Completable save(powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfiguration, "goalConfiguration");
        return this.$$delegate_7.save(goalConfiguration);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.RestingLogCloudService
    public io.reactivex.Completable saveAllRestingLogs(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> restingLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingLogs, "restingLogs");
        return this.$$delegate_9.saveAllRestingLogs(restingLogs);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.SleepLogCloudService
    public io.reactivex.Completable saveAllSleepLogs(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> sleepLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogs, "sleepLogs");
        return this.$$delegate_10.saveAllSleepLogs(sleepLogs);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.WalkingLogCloudService
    public io.reactivex.Completable saveAllWalkingLogs(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> walkingLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingLogs, "walkingLogs");
        return this.$$delegate_8.saveAllWalkingLogs(walkingLogs);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService
    public io.reactivex.Completable saveUserActivities(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> userActivities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivities, "userActivities");
        return this.$$delegate_11.saveUserActivities(userActivities);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService
    public io.reactivex.Completable updateDevice(powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        return this.$$delegate_2.updateDevice(device);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService
    public io.reactivex.Completable updateUser(powerwatch.matrix.com.pwgen2android.shared.data.models.User user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "user");
        return this.userAccountCloudService.updateUser(user);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService
    public io.reactivex.Completable updateUserActivity(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivity, "userActivity");
        return this.$$delegate_11.updateUserActivity(userActivity);
    }

    public CloudImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.AuthService authService, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider tokenProvider, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserAccountService userAccountService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeviceService deviceService, powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider hostInfoProvider, powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao userDao, final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateInfoService updateInfoService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GoalConfigurationService goalConfigurationService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingLogService walkingLogService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingLogService restingLogService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepLogService sleepLogService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserActivityService userActivityService, powerwatch.matrix.com.pwgen2android.fcm.PushMessagingTokenProvider pushMessagingTokenProvider, powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService userAccountCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService deviceCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.WalkingHourPeriodCloudService walkingHourPeriodCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.RestingHourPeriodCloudService restingHourPeriodCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.SleepHourPeriodCloudService sleepHourPeriodCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoCloudService updateInfoCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationCloudService goalConfigurationCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.WalkingLogCloudService walkingLogCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.RestingLogCloudService restingLogCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.SleepLogCloudService sleepLogCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService userActivityCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler cloudErrorHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudConfig, "cloudConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authService, "authService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountService, "userAccountService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceService, "deviceService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostInfoProvider, "hostInfoProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userDao, "userDao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoService, "updateInfoService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationService, "goalConfigurationService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingLogService, "walkingLogService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingLogService, "restingLogService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogService, "sleepLogService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivityService, "userActivityService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushMessagingTokenProvider, "pushMessagingTokenProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountCloudService, "userAccountCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginCloudService, "loginCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCloudService, "deviceCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingHourPeriodCloudService, "walkingHourPeriodCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingHourPeriodCloudService, "restingHourPeriodCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepHourPeriodCloudService, "sleepHourPeriodCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoCloudService, "updateInfoCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationCloudService, "goalConfigurationCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingLogCloudService, "walkingLogCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingLogCloudService, "restingLogCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogCloudService, "sleepLogCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivityCloudService, "userActivityCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudErrorHandler, "cloudErrorHandler");
        this.cloudConfig = cloudConfig;
        this.authService = authService;
        this.tokenProvider = tokenProvider;
        this.userAccountService = userAccountService;
        this.hostInfoProvider = hostInfoProvider;
        this.userAccountCloudService = userAccountCloudService;
        this.loginCloudService = loginCloudService;
        this.cloudErrorHandler = cloudErrorHandler;
        this.$$delegate_2 = deviceCloudService;
        this.$$delegate_3 = walkingHourPeriodCloudService;
        this.$$delegate_4 = restingHourPeriodCloudService;
        this.$$delegate_5 = sleepHourPeriodCloudService;
        this.$$delegate_6 = updateInfoCloudService;
        this.$$delegate_7 = goalConfigurationCloudService;
        this.$$delegate_8 = walkingLogCloudService;
        this.$$delegate_9 = restingLogCloudService;
        this.$$delegate_10 = sleepLogCloudService;
        this.$$delegate_11 = userActivityCloudService;
        io.reactivex.subjects.PublishSubject<kotlin.Unit> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Unit>()");
        this.tokenRequestSubject = publishSubjectCreate;
        io.reactivex.Observable<java.util.Map<java.lang.String, java.lang.String>> observableFlatMap = publishSubjectCreate.concatMapSingle(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudImpl$8gt7EiUOi-ZKeOntvBwZuMD0M4U
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.m2980_init_$lambda9(this.f$0, httpClient, (kotlin.Unit) obj);
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudImpl$dTzQcMsnly-ESvO99NRr9qp8g8c
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.m2978_init_$lambda10((java.lang.Throwable) obj);
            }
        }).repeat().publish().autoConnect().flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudImpl$8zALl4ELJaW4vmo4lqqeDL59EPs
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.m2979_init_$lambda11((powerwatch.matrix.com.pwgen2android.shared.cloud.AuthHeaderData) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "tokenRequestSubject\n                        .concatMapSingle {\n                            tokenProvider.get()\n                                    .firstOrError()\n                                    .flatMap { passCredentials ->\n                                        if (passCredentials.element != null) {\n\n                                            if (passCredentials.element.shouldTryLogin) {\n                                                httpClient.setErrorHandler(null)\n                                                return@flatMap cloudErrorHandler.handleAuthError(\n                                                        CloudErrorType.InvalidGrant,\n                                                        passCredentials.element\n                                                )\n                                                        .flatMap { refreshedToken ->\n                                                            tokenProvider.add(refreshedToken)\n                                                                    .toSingleDefault(refreshedToken)\n                                                        }\n                                                        .doOnSuccess {\n                                                            httpClient.setErrorHandler(cloudErrorHandler)\n                                                        }\n                                                        .map { token ->\n                                                            AuthHeaderData(\n                                                                    mapOf(\n                                                                            Pair(\n                                                                                    \"Authorization\",\n                                                                                    \"${token.tokenType} ${token.accessToken}\"\n                                                                            )\n                                                                    )\n                                                            )\n                                                        }\n                                            }\n\n                                            if (passCredentials.element.hasExpired()) {\n                                                httpClient.setErrorHandler(null)\n                                                authService.refresh(\n                                                        passCredentials.element.refreshToken,\n                                                        cloudConfig.authConfig,\n                                                        hostInfoProvider.hostInfo()\n                                                )\n                                                        .onErrorResumeNext {\n                                                            cloudErrorHandler.handleAuthError(\n                                                                    error = it,\n                                                                    passwordCredentials = passCredentials.element\n                                                            )\n                                                        }\n                                                        .flatMap { refreshedToken ->\n                                                            tokenProvider.add(refreshedToken)\n                                                                    .toSingleDefault(refreshedToken)\n                                                        }\n                                                        .doOnSuccess {\n                                                            httpClient.setErrorHandler(cloudErrorHandler)\n                                                        }\n                                                        .map { token ->\n                                                            AuthHeaderData(\n                                                                    mapOf(\n                                                                            Pair(\n                                                                                    \"Authorization\",\n                                                                                    \"${token.tokenType} ${token.accessToken}\"\n                                                                            )\n                                                                    )\n                                                            )\n                                                        }\n                                            } else {\n                                                httpClient.setErrorHandler(cloudErrorHandler)\n                                                Single.just(passCredentials.element)\n                                                        .map { token ->\n                                                            AuthHeaderData(\n                                                                    mapOf(\n                                                                            Pair(\n                                                                                    \"Authorization\",\n                                                                                    \"${token.tokenType} ${token.accessToken}\"\n                                                                            )\n                                                                    )\n                                                            )\n                                                        }\n                                            }\n                                        } else {\n                                            Single.just(AuthHeaderData(mapOf()))\n                                        }\n                                    }\n                        }\n                        .onErrorReturn {\n                            AuthHeaderData(error = it)\n                        }\n                        .repeat()\n                        .publish()\n                        .autoConnect()\n                        .flatMap {\n                            if (it.error != null) Observable.error<Headers>(it.error) else Observable.just(\n                                    it.headers\n                            )\n                        }");
        httpClient.setHeadersProvider(observableFlatMap, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.this.tokenRequestSubject.onNext(kotlin.Unit.INSTANCE);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CloudImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.AuthService authService, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider tokenProvider, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserAccountService userAccountService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeviceService deviceService, powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider hostInfoProvider, powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao userDao, powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateInfoService updateInfoService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GoalConfigurationService goalConfigurationService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingLogService walkingLogService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingLogService restingLogService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepLogService sleepLogService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserActivityService userActivityService, powerwatch.matrix.com.pwgen2android.fcm.PushMessagingTokenProvider pushMessagingTokenProvider, powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService userAccountCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService deviceCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.WalkingHourPeriodCloudService walkingHourPeriodCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.RestingHourPeriodCloudService restingHourPeriodCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.SleepHourPeriodCloudService sleepHourPeriodCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoCloudService updateInfoCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationCloudService goalConfigurationCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.WalkingLogCloudService walkingLogCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.RestingLogCloudService restingLogCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.SleepLogCloudService sleepLogCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService userActivityCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler cloudErrorHandler, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService userAccountCloudServiceImpl = (i & 32768) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudServiceImpl(userAccountService, cloudConfig, userDao) : userAccountCloudService;
        this(cloudConfig, authService, tokenProvider, userAccountService, deviceService, hostInfoProvider, userDao, httpClient, updateInfoService, goalConfigurationService, walkingLogService, restingLogService, sleepLogService, userActivityService, pushMessagingTokenProvider, userAccountCloudServiceImpl, (i & 65536) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudServiceImpl(authService, cloudConfig.getAuthConfig(), tokenProvider, hostInfoProvider, userAccountCloudServiceImpl, pushMessagingTokenProvider, userDao) : loginCloudService, (i & 131072) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudServiceImpl(deviceService, cloudConfig.getDeviceConfig()) : deviceCloudService, (i & 262144) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.WalkingHourPeriodCloudServiceImpl(httpClient, cloudConfig.getWalkingHourPeriodConfig(), null, null, null, null, 60, null) : walkingHourPeriodCloudService, (i & 524288) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.RestingHourPeriodCloudServiceImpl(httpClient, cloudConfig.getRestingHourPeriodConfig(), null, null, null, null, 60, null) : restingHourPeriodCloudService, (i & 1048576) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.SleepHourPeriodCloudServiceImpl(httpClient, cloudConfig.getSleepHourPeriodConfig(), null, null, null, null, 60, null) : sleepHourPeriodCloudService, (i & 2097152) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoCloudServiceImpl(updateInfoService) : updateInfoCloudService, (i & 4194304) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationCloudServiceImpl(goalConfigurationService) : goalConfigurationCloudService, (i & 8388608) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.WalkingLogCloudServiceImpl(walkingLogService) : walkingLogCloudService, (i & 16777216) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.RestingLogCloudServiceImpl(restingLogService) : restingLogCloudService, (i & 33554432) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.SleepLogCloudServiceImpl(sleepLogService) : sleepLogCloudService, (i & 67108864) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudServiceImpl(userActivityService) : userActivityCloudService, (i & 134217728) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandlerImpl(authService, cloudConfig, hostInfoProvider, tokenProvider) : cloudErrorHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-9, reason: not valid java name */
    public static final io.reactivex.SingleSource m2980_init_$lambda9(final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl this$0, final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, kotlin.Unit it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "$httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.tokenProvider.get().firstOrError().flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudImpl$03jrsCNjk_5aoOyOTD21KZyvzGU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.m2987lambda9$lambda8(httpClient, this$0, (powerwatch.matrix.com.pwgen2android.shared.cloud.Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-9$lambda-8, reason: not valid java name */
    public static final io.reactivex.SingleSource m2987lambda9$lambda8(final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl this$0, final powerwatch.matrix.com.pwgen2android.shared.cloud.Optional passCredentials) {
        io.reactivex.Single singleJust;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "$httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passCredentials, "passCredentials");
        if (passCredentials.getElement() != null) {
            if (((powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) passCredentials.getElement()).getShouldTryLogin()) {
                httpClient.setErrorHandler(null);
                return this$0.cloudErrorHandler.handleAuthError(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.InvalidGrant.INSTANCE, (powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) passCredentials.getElement()).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudImpl$Y2sTnDDKgV_owjuFkq0GbpnGqyE
                    @Override // io.reactivex.functions.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.m2988lambda9$lambda8$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) obj);
                    }
                }).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudImpl$cZ5_yilFZO0KI44xpznLyXQI--w
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(java.lang.Object obj) {
                        powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.m2989lambda9$lambda8$lambda1(httpClient, this$0, (powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) obj);
                    }
                }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudImpl$7_uG2-s16mewLZXgyhd81pG43aY
                    @Override // io.reactivex.functions.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.m2990lambda9$lambda8$lambda2((powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) obj);
                    }
                });
            }
            if (((powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) passCredentials.getElement()).hasExpired()) {
                httpClient.setErrorHandler(null);
                singleJust = this$0.authService.refresh(((powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) passCredentials.getElement()).getRefreshToken(), this$0.cloudConfig.getAuthConfig(), powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider.DefaultImpls.hostInfo$default(this$0.hostInfoProvider, false, 1, null)).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudImpl$I7vi41UKLMIijBvV0ldao8rFufk
                    @Override // io.reactivex.functions.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.m2991lambda9$lambda8$lambda3(this.f$0, passCredentials, (java.lang.Throwable) obj);
                    }
                }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudImpl$FI_WpzDBnTGFx4uYJPjFN6tj7jU
                    @Override // io.reactivex.functions.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.m2992lambda9$lambda8$lambda4(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) obj);
                    }
                }).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudImpl$0hXDoQeLZAWD9RhzzQMZjGMY4ao
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(java.lang.Object obj) {
                        powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.m2993lambda9$lambda8$lambda5(httpClient, this$0, (powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) obj);
                    }
                }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudImpl$5-4QBK3_IX83PmbH7knaQhAsMls
                    @Override // io.reactivex.functions.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.m2994lambda9$lambda8$lambda6((powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) obj);
                    }
                });
            } else {
                httpClient.setErrorHandler(this$0.cloudErrorHandler);
                singleJust = io.reactivex.Single.just(passCredentials.getElement()).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudImpl$CVA-MA-Gsk1LiONPiZi6pQQjdyI
                    @Override // io.reactivex.functions.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.m2995lambda9$lambda8$lambda7((powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) obj);
                    }
                });
            }
        } else {
            singleJust = io.reactivex.Single.just(new powerwatch.matrix.com.pwgen2android.shared.cloud.AuthHeaderData(kotlin.collections.MapsKt.emptyMap(), null, 2, null));
        }
        return singleJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-9$lambda-8$lambda-0, reason: not valid java name */
    public static final io.reactivex.SingleSource m2988lambda9$lambda8$lambda0(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials refreshedToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshedToken, "refreshedToken");
        return this$0.tokenProvider.add(refreshedToken).toSingleDefault(refreshedToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-9$lambda-8$lambda-1, reason: not valid java name */
    public static final void m2989lambda9$lambda8$lambda1(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials passwordCredentials) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "$httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        httpClient.setErrorHandler(this$0.cloudErrorHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-9$lambda-8$lambda-2, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.cloud.AuthHeaderData m2990lambda9$lambda8$lambda2(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.AuthHeaderData(kotlin.collections.MapsKt.mapOf(new kotlin.Pair(io.fabric.sdk.android.services.network.HttpRequest.HEADER_AUTHORIZATION, token.getTokenType() + ' ' + token.getAccessToken())), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-9$lambda-8$lambda-3, reason: not valid java name */
    public static final io.reactivex.SingleSource m2991lambda9$lambda8$lambda3(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.Optional passCredentials, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passCredentials, "$passCredentials");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.cloudErrorHandler.handleAuthError(it, (powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) passCredentials.getElement());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-9$lambda-8$lambda-4, reason: not valid java name */
    public static final io.reactivex.SingleSource m2992lambda9$lambda8$lambda4(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials refreshedToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshedToken, "refreshedToken");
        return this$0.tokenProvider.add(refreshedToken).toSingleDefault(refreshedToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-9$lambda-8$lambda-5, reason: not valid java name */
    public static final void m2993lambda9$lambda8$lambda5(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials passwordCredentials) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "$httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        httpClient.setErrorHandler(this$0.cloudErrorHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-9$lambda-8$lambda-6, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.cloud.AuthHeaderData m2994lambda9$lambda8$lambda6(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.AuthHeaderData(kotlin.collections.MapsKt.mapOf(new kotlin.Pair(io.fabric.sdk.android.services.network.HttpRequest.HEADER_AUTHORIZATION, token.getTokenType() + ' ' + token.getAccessToken())), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-9$lambda-8$lambda-7, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.cloud.AuthHeaderData m2995lambda9$lambda8$lambda7(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.AuthHeaderData(kotlin.collections.MapsKt.mapOf(new kotlin.Pair(io.fabric.sdk.android.services.network.HttpRequest.HEADER_AUTHORIZATION, token.getTokenType() + ' ' + token.getAccessToken())), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-10, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.cloud.AuthHeaderData m2978_init_$lambda10(java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.AuthHeaderData(null, it, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-11, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2979_init_$lambda11(powerwatch.matrix.com.pwgen2android.shared.cloud.AuthHeaderData it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getError() != null ? io.reactivex.Observable.error(it.getError()) : io.reactivex.Observable.just(it.getHeaders());
    }
}
