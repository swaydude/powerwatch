.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;
.super Ljava/lang/Object;
.source "Cloud.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/SleepHourPeriodCloudService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00bc\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\u00082\u00020\t2\u00020\n2\u00020\u000b2\u00020\u000c2\u00020\rB\u00ff\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020\'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\u0008\u0008\u0002\u0010,\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010-\u001a\u00020\u0001\u0012\u0008\u0008\u0002\u0010.\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010/\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u00100\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u00101\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u00102\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u00103\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u00104\u001a\u00020\t\u0012\u0008\u0008\u0002\u00105\u001a\u00020\n\u0012\u0008\u0008\u0002\u00106\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u00107\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u00108\u001a\u00020\r\u00a2\u0006\u0002\u00109J\u0013\u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010E\u001a\u00020FH\u0096\u0001J\u0011\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0096\u0001J\u0015\u0010K\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020N0M0LH\u0096\u0001J\u0011\u0010O\u001a\u00020H2\u0006\u0010P\u001a\u00020QH\u0096\u0001J\u0011\u0010R\u001a\u00020H2\u0006\u0010S\u001a\u00020FH\u0096\u0001J\u0015\u0010T\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020U0M0LH\u0096\u0001J%\u0010V\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020W0M0L2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[H\u0096\u0001J%\u0010\\\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020]0M0L2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[H\u0096\u0001J\u001d\u0010^\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Q0M0L2\u0006\u0010X\u001a\u00020YH\u0096\u0001J\u001d\u0010_\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020`0M0L2\u0006\u0010X\u001a\u00020YH\u0096\u0001J%\u0010a\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020b0M0L2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[H\u0096\u0001J\u0017\u0010c\u001a\u0008\u0012\u0004\u0012\u00020N0L2\u0006\u0010d\u001a\u00020FH\u0096\u0001J\u0017\u0010e\u001a\u0008\u0012\u0004\u0012\u00020Q0L2\u0006\u0010f\u001a\u00020FH\u0096\u0001J\u001f\u0010g\u001a\u0008\u0012\u0004\u0012\u00020h0L2\u0006\u0010i\u001a\u00020F2\u0006\u0010j\u001a\u00020FH\u0096\u0001J\u000f\u0010k\u001a\u0008\u0012\u0004\u0012\u00020J0LH\u0096\u0001J\u0011\u0010l\u001a\u00020H2\u0006\u0010m\u001a\u00020<H\u0096\u0001J\u001f\u0010n\u001a\u0008\u0012\u0004\u0012\u00020o0L2\u0006\u0010m\u001a\u00020<2\u0006\u0010p\u001a\u00020oH\u0096\u0001J\t\u0010q\u001a\u00020rH\u0096\u0001J\u001f\u0010s\u001a\u0008\u0012\u0004\u0012\u00020J0L2\u0006\u0010S\u001a\u00020F2\u0006\u0010t\u001a\u00020FH\u0096\u0001J\t\u0010u\u001a\u00020HH\u0096\u0001J\u0011\u0010v\u001a\u00020H2\u0006\u0010w\u001a\u00020NH\u0096\u0001J\u0011\u0010x\u001a\u00020H2\u0006\u0010w\u001a\u00020NH\u0096\u0001J\u0011\u0010y\u001a\u00020H2\u0006\u0010S\u001a\u00020FH\u0096\u0001J\u0019\u0010z\u001a\u00020H2\u0006\u0010{\u001a\u00020F2\u0006\u0010|\u001a\u00020FH\u0096\u0001J\u0011\u0010}\u001a\u00020H2\u0006\u0010~\u001a\u00020UH\u0096\u0001J\u0019\u0010\u007f\u001a\u00020H2\u000e\u0010\u0080\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010MH\u0096\u0001J\u001a\u0010\u0082\u0001\u001a\u00020H2\u000e\u0010\u0083\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010MH\u0096\u0001J\u001a\u0010\u0085\u0001\u001a\u00020H2\u000e\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010MH\u0096\u0001J\u0019\u0010\u0088\u0001\u001a\u00020H2\r\u0010\u0089\u0001\u001a\u0008\u0012\u0004\u0012\u00020Q0MH\u0096\u0001J\u0012\u0010\u008a\u0001\u001a\u00020H2\u0006\u0010w\u001a\u00020NH\u0096\u0001J\u0012\u0010\u008b\u0001\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0096\u0001J\u0012\u0010\u008c\u0001\u001a\u00020H2\u0006\u0010P\u001a\u00020QH\u0096\u0001R\u0018\u0010:\u001a\u0008\u0012\u0004\u0012\u00020<0;X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010>R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010?\u001a\u0010\u0012\u000c\u0012\n B*\u0004\u0018\u00010A0A0@X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u008d\u0001"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/SleepHourPeriodCloudService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;",
        "cloudConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;",
        "authService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;",
        "tokenProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;",
        "userAccountService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;",
        "deviceService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;",
        "hostInfoProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;",
        "userDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;",
        "httpClient",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
        "updateInfoService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;",
        "goalConfigurationService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationService;",
        "walkingLogService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogService;",
        "restingLogService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingLogService;",
        "sleepLogService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepLogService;",
        "userActivityService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;",
        "pushMessagingTokenProvider",
        "Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;",
        "userAccountCloudService",
        "loginCloudService",
        "deviceCloudService",
        "walkingHourPeriodCloudService",
        "restingHourPeriodCloudService",
        "sleepHourPeriodCloudService",
        "updateInfoCloudService",
        "goalConfigurationCloudService",
        "walkingLogCloudService",
        "restingLogCloudService",
        "sleepLogCloudService",
        "userActivityCloudService",
        "cloudErrorHandler",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/SleepHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;)V",
        "authRequiredError",
        "Lio/reactivex/Observable;",
        "",
        "getAuthRequiredError",
        "()Lio/reactivex/Observable;",
        "tokenRequestSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "",
        "kotlin.jvm.PlatformType",
        "addPushNotificationsToken",
        "Lio/reactivex/CompletableSource;",
        "token",
        "",
        "addUser",
        "Lio/reactivex/Completable;",
        "user",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        "allDevices",
        "Lio/reactivex/Single;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        "deleteUserActivity",
        "userActivity",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        "forgotUserPassword",
        "email",
        "getAllConfigurations",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
        "getAllRestingPeriods",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
        "page",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
        "type",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;",
        "getAllSleepPeriods",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;",
        "getAllUserActivities",
        "getAllUserActivityDates",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;",
        "getAllWalkingPeriods",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
        "getDevice",
        "serialNumber",
        "getOneUserActivity",
        "id",
        "getUpdateInfo",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;",
        "pid",
        "language",
        "getUser",
        "handleApiError",
        "error",
        "handleAuthError",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;",
        "passwordCredentials",
        "isLoggedIn",
        "",
        "login",
        "password",
        "logout",
        "registerDevice",
        "device",
        "removeDevice",
        "resendVerifyEmail",
        "resetUserPassword",
        "oldPassword",
        "newPassword",
        "save",
        "goalConfiguration",
        "saveAllRestingLogs",
        "restingLogs",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;",
        "saveAllSleepLogs",
        "sleepLogs",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
        "saveAllWalkingLogs",
        "walkingLogs",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
        "saveUserActivities",
        "userActivities",
        "updateDevice",
        "updateUser",
        "updateUserActivity",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final synthetic $$delegate_10:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;

.field private final synthetic $$delegate_11:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;

.field private final synthetic $$delegate_2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;

.field private final synthetic $$delegate_3:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudService;

.field private final synthetic $$delegate_4:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;

.field private final synthetic $$delegate_5:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/SleepHourPeriodCloudService;

.field private final synthetic $$delegate_6:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;

.field private final synthetic $$delegate_7:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;

.field private final synthetic $$delegate_8:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;

.field private final synthetic $$delegate_9:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;

.field private final authService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;

.field private final cloudConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;

.field private final cloudErrorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

.field private final hostInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;

.field private final loginCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

.field private final tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

.field private final tokenRequestSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

.field private final userAccountService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/SleepHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p8

    move-object/from16 v7, p16

    move-object/from16 v8, p17

    move-object/from16 v9, p18

    move-object/from16 v10, p19

    move-object/from16 v11, p20

    move-object/from16 v12, p21

    move-object/from16 v13, p22

    move-object/from16 v14, p23

    move-object/from16 v15, p24

    move-object/from16 v0, p25

    const-string v0, "cloudConfig"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authService"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tokenProvider"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userAccountService"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceService"

    move-object/from16 v4, p5

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hostInfoProvider"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userDao"

    move-object/from16 v4, p7

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "httpClient"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateInfoService"

    move-object/from16 v4, p9

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalConfigurationService"

    move-object/from16 v4, p10

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "walkingLogService"

    move-object/from16 v4, p11

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restingLogService"

    move-object/from16 v4, p12

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepLogService"

    move-object/from16 v4, p13

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userActivityService"

    move-object/from16 v4, p14

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pushMessagingTokenProvider"

    move-object/from16 v4, p15

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userAccountCloudService"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loginCloudService"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceCloudService"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "walkingHourPeriodCloudService"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restingHourPeriodCloudService"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepHourPeriodCloudService"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateInfoCloudService"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalConfigurationCloudService"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "walkingLogCloudService"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restingLogCloudService"

    move-object/from16 v4, p25

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepLogCloudService"

    move-object/from16 v4, p26

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userActivityCloudService"

    move-object/from16 v6, p27

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cloudErrorHandler"

    move-object/from16 v6, p28

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    move-object/from16 v4, p25

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->cloudConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;

    .line 176
    iput-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->authService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;

    .line 177
    iput-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

    move-object/from16 v1, p4

    .line 178
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->userAccountService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;

    .line 180
    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->hostInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;

    .line 192
    iput-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    .line 193
    iput-object v8, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->loginCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

    .line 204
    iput-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->cloudErrorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

    .line 209
    iput-object v9, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;

    .line 210
    iput-object v10, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_3:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudService;

    .line 211
    iput-object v11, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_4:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;

    .line 212
    iput-object v12, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_5:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/SleepHourPeriodCloudService;

    .line 213
    iput-object v13, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_6:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;

    .line 214
    iput-object v14, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_7:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;

    .line 215
    iput-object v15, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_8:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;

    .line 216
    iput-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_9:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;

    move-object/from16 v1, p26

    .line 217
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_10:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;

    move-object/from16 v1, p27

    .line 218
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_11:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;

    .line 221
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v1

    const-string v2, "create<Unit>()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->tokenRequestSubject:Lio/reactivex/subjects/PublishSubject;

    .line 226
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$8gt7EiUOi-ZKeOntvBwZuMD0M4U;

    move-object/from16 v3, p8

    invoke-direct {v2, v0, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$8gt7EiUOi-ZKeOntvBwZuMD0M4U;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;)V

    invoke-virtual {v1, v2}, Lio/reactivex/subjects/PublishSubject;->concatMapSingle(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$dTzQcMsnly-ESvO99NRr9qp8g8c;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$dTzQcMsnly-ESvO99NRr9qp8g8c;

    .line 306
    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->onErrorReturn(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 309
    invoke-virtual {v1}, Lio/reactivex/Observable;->repeat()Lio/reactivex/Observable;

    move-result-object v1

    .line 310
    invoke-virtual {v1}, Lio/reactivex/Observable;->publish()Lio/reactivex/observables/ConnectableObservable;

    move-result-object v1

    .line 311
    invoke-virtual {v1}, Lio/reactivex/observables/ConnectableObservable;->autoConnect()Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$8zALl4ELJaW4vmo4lqqeDL59EPs;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$8zALl4ELJaW4vmo4lqqeDL59EPs;

    .line 312
    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, "tokenRequestSubject\n                        .concatMapSingle {\n                            tokenProvider.get()\n                                    .firstOrError()\n                                    .flatMap { passCredentials ->\n                                        if (passCredentials.element != null) {\n\n                                            if (passCredentials.element.shouldTryLogin) {\n                                                httpClient.setErrorHandler(null)\n                                                return@flatMap cloudErrorHandler.handleAuthError(\n                                                        CloudErrorType.InvalidGrant,\n                                                        passCredentials.element\n                                                )\n                                                        .flatMap { refreshedToken ->\n                                                            tokenProvider.add(refreshedToken)\n                                                                    .toSingleDefault(refreshedToken)\n                                                        }\n                                                        .doOnSuccess {\n                                                            httpClient.setErrorHandler(cloudErrorHandler)\n                                                        }\n                                                        .map { token ->\n                                                            AuthHeaderData(\n                                                                    mapOf(\n                                                                            Pair(\n                                                                                    \"Authorization\",\n                                                                                    \"${token.tokenType} ${token.accessToken}\"\n                                                                            )\n                                                                    )\n                                                            )\n                                                        }\n                                            }\n\n                                            if (passCredentials.element.hasExpired()) {\n                                                httpClient.setErrorHandler(null)\n                                                authService.refresh(\n                                                        passCredentials.element.refreshToken,\n                                                        cloudConfig.authConfig,\n                                                        hostInfoProvider.hostInfo()\n                                                )\n                                                        .onErrorResumeNext {\n                                                            cloudErrorHandler.handleAuthError(\n                                                                    error = it,\n                                                                    passwordCredentials = passCredentials.element\n                                                            )\n                                                        }\n                                                        .flatMap { refreshedToken ->\n                                                            tokenProvider.add(refreshedToken)\n                                                                    .toSingleDefault(refreshedToken)\n                                                        }\n                                                        .doOnSuccess {\n                                                            httpClient.setErrorHandler(cloudErrorHandler)\n                                                        }\n                                                        .map { token ->\n                                                            AuthHeaderData(\n                                                                    mapOf(\n                                                                            Pair(\n                                                                                    \"Authorization\",\n                                                                                    \"${token.tokenType} ${token.accessToken}\"\n                                                                            )\n                                                                    )\n                                                            )\n                                                        }\n                                            } else {\n                                                httpClient.setErrorHandler(cloudErrorHandler)\n                                                Single.just(passCredentials.element)\n                                                        .map { token ->\n                                                            AuthHeaderData(\n                                                                    mapOf(\n                                                                            Pair(\n                                                                                    \"Authorization\",\n                                                                                    \"${token.tokenType} ${token.accessToken}\"\n                                                                            )\n                                                                    )\n                                                            )\n                                                        }\n                                            }\n                                        } else {\n                                            Single.just(AuthHeaderData(mapOf()))\n                                        }\n                                    }\n                        }\n                        .onErrorReturn {\n                            AuthHeaderData(error = it)\n                        }\n                        .repeat()\n                        .publish()\n                        .autoConnect()\n                        .flatMap {\n                            if (it.error != null) Observable.error<Headers>(it.error) else Observable.just(\n                                    it.headers\n                            )\n                        }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 318
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl$4;

    invoke-direct {v2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl$4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 224
    invoke-interface {v3, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;->setHeadersProvider(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/SleepHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 30

    move-object/from16 v1, p1

    const v0, 0x8000

    and-int v0, p29, v0

    if-eqz v0, :cond_0

    .line 192
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;

    move-object/from16 v4, p4

    move-object/from16 v13, p7

    invoke-direct {v0, v4, v1, v13}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    move-object/from16 v16, v0

    goto :goto_0

    :cond_0
    move-object/from16 v4, p4

    move-object/from16 v13, p7

    move-object/from16 v16, p16

    :goto_0
    const/high16 v0, 0x10000

    and-int v0, p29, v0

    if-eqz v0, :cond_1

    .line 193
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;->getAuthConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    move-result-object v7

    move-object v5, v0

    move-object/from16 v6, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p6

    move-object/from16 v10, v16

    move-object/from16 v11, p15

    move-object/from16 v12, p7

    invoke-direct/range {v5 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

    move-object/from16 v17, v0

    goto :goto_1

    :cond_1
    move-object/from16 v17, p17

    :goto_1
    const/high16 v0, 0x20000

    and-int v0, p29, v0

    if-eqz v0, :cond_2

    .line 194
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudServiceImpl;

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;->getDeviceConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;

    move-result-object v2

    move-object/from16 v5, p5

    invoke-direct {v0, v5, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;

    move-object/from16 v18, v0

    goto :goto_2

    :cond_2
    move-object/from16 v5, p5

    move-object/from16 v18, p18

    :goto_2
    const/high16 v0, 0x40000

    and-int v0, p29, v0

    if-eqz v0, :cond_3

    .line 195
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudServiceImpl;

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;->getWalkingHourPeriodConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;

    move-result-object v21

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x3c

    const/16 v27, 0x0

    move-object/from16 v19, v0

    move-object/from16 v20, p8

    invoke-direct/range {v19 .. v27}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudService;

    move-object/from16 v19, v0

    goto :goto_3

    :cond_3
    move-object/from16 v19, p19

    :goto_3
    const/high16 v0, 0x80000

    and-int v0, p29, v0

    if-eqz v0, :cond_4

    .line 196
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudServiceImpl;

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;->getRestingHourPeriodConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;

    move-result-object v22

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x3c

    const/16 v28, 0x0

    move-object/from16 v20, v0

    move-object/from16 v21, p8

    invoke-direct/range {v20 .. v28}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingHourPeriodService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;

    move-object/from16 v20, v0

    goto :goto_4

    :cond_4
    move-object/from16 v20, p20

    :goto_4
    const/high16 v0, 0x100000

    and-int v0, p29, v0

    if-eqz v0, :cond_5

    .line 197
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/SleepHourPeriodCloudServiceImpl;

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;->getSleepHourPeriodConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;

    move-result-object v23

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x3c

    const/16 v29, 0x0

    move-object/from16 v21, v0

    move-object/from16 v22, p8

    invoke-direct/range {v21 .. v29}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/SleepHourPeriodCloudServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepHourPeriodService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/SleepHourPeriodCloudService;

    move-object/from16 v21, v0

    goto :goto_5

    :cond_5
    move-object/from16 v21, p21

    :goto_5
    const/high16 v0, 0x200000

    and-int v0, p29, v0

    if-eqz v0, :cond_6

    .line 198
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudServiceImpl;

    move-object/from16 v9, p9

    invoke-direct {v0, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;

    move-object/from16 v22, v0

    goto :goto_6

    :cond_6
    move-object/from16 v9, p9

    move-object/from16 v22, p22

    :goto_6
    const/high16 v0, 0x400000

    and-int v0, p29, v0

    if-eqz v0, :cond_7

    .line 199
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudServiceImpl;

    move-object/from16 v10, p10

    invoke-direct {v0, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationService;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;

    move-object/from16 v23, v0

    goto :goto_7

    :cond_7
    move-object/from16 v10, p10

    move-object/from16 v23, p23

    :goto_7
    const/high16 v0, 0x800000

    and-int v0, p29, v0

    if-eqz v0, :cond_8

    .line 200
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudServiceImpl;

    move-object/from16 v11, p11

    invoke-direct {v0, v11}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogService;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;

    move-object/from16 v24, v0

    goto :goto_8

    :cond_8
    move-object/from16 v11, p11

    move-object/from16 v24, p24

    :goto_8
    const/high16 v0, 0x1000000

    and-int v0, p29, v0

    if-eqz v0, :cond_9

    .line 201
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudServiceImpl;

    move-object/from16 v12, p12

    invoke-direct {v0, v12}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingLogService;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;

    move-object/from16 v25, v0

    goto :goto_9

    :cond_9
    move-object/from16 v12, p12

    move-object/from16 v25, p25

    :goto_9
    const/high16 v0, 0x2000000

    and-int v0, p29, v0

    if-eqz v0, :cond_a

    .line 202
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudServiceImpl;

    move-object/from16 v14, p13

    invoke-direct {v0, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepLogService;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;

    move-object/from16 v26, v0

    goto :goto_a

    :cond_a
    move-object/from16 v14, p13

    move-object/from16 v26, p26

    :goto_a
    const/high16 v0, 0x4000000

    and-int v0, p29, v0

    if-eqz v0, :cond_b

    .line 203
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudServiceImpl;

    move-object/from16 v15, p14

    invoke-direct {v0, v15}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;

    move-object/from16 v27, v0

    goto :goto_b

    :cond_b
    move-object/from16 v15, p14

    move-object/from16 v27, p27

    :goto_b
    const/high16 v0, 0x8000000

    and-int v0, p29, v0

    if-eqz v0, :cond_c

    .line 204
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v6, p6

    invoke-direct {v0, v2, v1, v6, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

    move-object/from16 v28, v0

    goto :goto_c

    :cond_c
    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v6, p6

    move-object/from16 v28, p28

    :goto_c
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    .line 175
    invoke-direct/range {v0 .. v28}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/SleepHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;)V

    return-void
.end method

.method private static final _init_$lambda-10(Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;
    .locals 3

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 307
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, p0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;-><init>(Ljava/util/Map;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final _init_$lambda-11(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 313
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;->getError()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;->getError()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_0

    .line 314
    :cond_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;->getHeaders()Ljava/util/Map;

    move-result-object p0

    .line 313
    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    :goto_0
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final _init_$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lkotlin/Unit;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$httpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->get()Lio/reactivex/Observable;

    move-result-object p2

    .line 228
    invoke-virtual {p2}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object p2

    .line 229
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$03jrsCNjk_5aoOyOTD21KZyvzGU;

    invoke-direct {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$03jrsCNjk_5aoOyOTD21KZyvzGU;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method public static final synthetic access$getTokenRequestSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;)Lio/reactivex/subjects/PublishSubject;
    .locals 0

    .line 175
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->tokenRequestSubject:Lio/reactivex/subjects/PublishSubject;

    return-object p0
.end method

.method public static synthetic lambda$03jrsCNjk_5aoOyOTD21KZyvzGU(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->lambda-9$lambda-8(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$0hXDoQeLZAWD9RhzzQMZjGMY4ao(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->lambda-9$lambda-8$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)V

    return-void
.end method

.method public static synthetic lambda$5-4QBK3_IX83PmbH7knaQhAsMls(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->lambda-9$lambda-8$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$7_uG2-s16mewLZXgyhd81pG43aY(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->lambda-9$lambda-8$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$8gt7EiUOi-ZKeOntvBwZuMD0M4U(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lkotlin/Unit;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->_init_$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lkotlin/Unit;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$8zALl4ELJaW4vmo4lqqeDL59EPs(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->_init_$lambda-11(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$CVA-MA-Gsk1LiONPiZi6pQQjdyI(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->lambda-9$lambda-8$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$FI_WpzDBnTGFx4uYJPjFN6tj7jU(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->lambda-9$lambda-8$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$I7vi41UKLMIijBvV0ldao8rFufk(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->lambda-9$lambda-8$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Y2sTnDDKgV_owjuFkq0GbpnGqyE(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->lambda-9$lambda-8$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$cZ5_yilFZO0KI44xpznLyXQI--w(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->lambda-9$lambda-8$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)V

    return-void
.end method

.method public static synthetic lambda$dTzQcMsnly-ESvO99NRr9qp8g8c(Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->_init_$lambda-10(Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;

    move-result-object p0

    return-object p0
.end method

.method private static final lambda-9$lambda-8(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;)Lio/reactivex/SingleSource;
    .locals 7

    const-string v0, "$httpClient"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "passCredentials"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;->getElement()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 232
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;->getElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getShouldTryLogin()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 233
    invoke-interface {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;->setErrorHandler(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;)V

    .line 234
    iget-object v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->cloudErrorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

    .line 235
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$InvalidGrant;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$InvalidGrant;

    check-cast v1, Ljava/lang/Throwable;

    .line 236
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;->getElement()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    .line 234
    invoke-interface {v0, v1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;->handleAuthError(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/Single;

    move-result-object p2

    .line 238
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$Y2sTnDDKgV_owjuFkq0GbpnGqyE;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$Y2sTnDDKgV_owjuFkq0GbpnGqyE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p2

    .line 242
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$cZ5_yilFZO0KI44xpznLyXQI--w;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$cZ5_yilFZO0KI44xpznLyXQI--w;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$7_uG2-s16mewLZXgyhd81pG43aY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$7_uG2-s16mewLZXgyhd81pG43aY;

    .line 245
    invoke-virtual {p0, p1}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0

    .line 257
    :cond_0
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;->getElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->hasExpired()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 258
    invoke-interface {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;->setErrorHandler(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;)V

    .line 259
    iget-object v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->authService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;

    .line 260
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;->getElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getRefreshToken()Ljava/lang/String;

    move-result-object v2

    .line 261
    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->cloudConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;->getAuthConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    move-result-object v3

    .line 262
    iget-object v4, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->hostInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v4, v5, v6, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider$DefaultImpls;->hostInfo$default(Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;ZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;

    move-result-object v1

    .line 259
    invoke-interface {v0, v2, v3, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;->refresh(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;)Lio/reactivex/Single;

    move-result-object v0

    .line 264
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$I7vi41UKLMIijBvV0ldao8rFufk;

    invoke-direct {v1, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$I7vi41UKLMIijBvV0ldao8rFufk;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p2

    .line 270
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$FI_WpzDBnTGFx4uYJPjFN6tj7jU;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$FI_WpzDBnTGFx4uYJPjFN6tj7jU;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p2

    .line 274
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$0hXDoQeLZAWD9RhzzQMZjGMY4ao;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$0hXDoQeLZAWD9RhzzQMZjGMY4ao;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$5-4QBK3_IX83PmbH7knaQhAsMls;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$5-4QBK3_IX83PmbH7knaQhAsMls;

    .line 277
    invoke-virtual {p0, p1}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    goto :goto_0

    .line 288
    :cond_1
    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->cloudErrorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;->setErrorHandler(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;)V

    .line 289
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;->getElement()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/Single;->just(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$CVA-MA-Gsk1LiONPiZi6pQQjdyI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$CVA-MA-Gsk1LiONPiZi6pQQjdyI;

    .line 290
    invoke-virtual {p0, p1}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    goto :goto_0

    .line 302
    :cond_2
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    const/4 p2, 0x2

    invoke-direct {p0, p1, v1, p2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;-><init>(Ljava/util/Map;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0}, Lio/reactivex/Single;->just(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    :goto_0
    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final lambda-9$lambda-8$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refreshedToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->add(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/Completable;

    move-result-object p0

    .line 240
    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final lambda-9$lambda-8$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)V
    .locals 0

    const-string p2, "$httpClient"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->cloudErrorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;->setErrorHandler(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;)V

    return-void
.end method

.method private static final lambda-9$lambda-8$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;
    .locals 4

    const-string v0, "token"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;

    .line 248
    new-instance v1, Lkotlin/Pair;

    .line 250
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getTokenType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getAccessToken()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v2, "Authorization"

    .line 248
    invoke-direct {v1, v2, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 247
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x2

    .line 246
    invoke-direct {v0, p0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;-><init>(Ljava/util/Map;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final lambda-9$lambda-8$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$passCredentials"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->cloudErrorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

    .line 267
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;->getElement()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    .line 265
    invoke-interface {p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;->handleAuthError(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final lambda-9$lambda-8$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refreshedToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->add(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/Completable;

    move-result-object p0

    .line 272
    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final lambda-9$lambda-8$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)V
    .locals 0

    const-string p2, "$httpClient"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->cloudErrorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;->setErrorHandler(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;)V

    return-void
.end method

.method private static final lambda-9$lambda-8$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;
    .locals 4

    const-string v0, "token"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 278
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;

    .line 280
    new-instance v1, Lkotlin/Pair;

    .line 282
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getTokenType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getAccessToken()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v2, "Authorization"

    .line 280
    invoke-direct {v1, v2, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 279
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x2

    .line 278
    invoke-direct {v0, p0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;-><init>(Ljava/util/Map;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final lambda-9$lambda-8$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;
    .locals 4

    const-string v0, "token"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;

    .line 293
    new-instance v1, Lkotlin/Pair;

    .line 295
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getTokenType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getAccessToken()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v2, "Authorization"

    .line 293
    invoke-direct {v1, v2, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 292
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x2

    .line 291
    invoke-direct {v0, p0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;-><init>(Ljava/util/Map;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public addPushNotificationsToken(Ljava/lang/String;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;->addPushNotificationsToken(Ljava/lang/String;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method

.method public addUser(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;->addUser(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public allDevices()Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;->allDevices()Lio/reactivex/Single;

    move-result-object v0

    return-object v0
.end method

.method public deleteUserActivity(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "userActivity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_11:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;->deleteUserActivity(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public forgotUserPassword(Ljava/lang/String;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;->forgotUserPassword(Ljava/lang/String;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public getAllConfigurations()Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_7:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;->getAllConfigurations()Lio/reactivex/Single;

    move-result-object v0

    return-object v0
.end method

.method public getAllRestingPeriods(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;",
            ")",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
            ">;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_4:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;->getAllRestingPeriods(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public getAllSleepPeriods(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;",
            ")",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;",
            ">;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_5:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/SleepHourPeriodCloudService;

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/SleepHourPeriodCloudService;->getAllSleepPeriods(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public getAllUserActivities(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            ")",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_11:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;->getAllUserActivities(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public getAllUserActivityDates(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            ")",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;",
            ">;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_11:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;->getAllUserActivityDates(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public getAllWalkingPeriods(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;",
            ")",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
            ">;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_3:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudService;

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudService;->getAllWalkingPeriods(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public getAuthRequiredError()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->cloudErrorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;->getAuthRequiredError()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public getDevice(Ljava/lang/String;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation

    const-string v0, "serialNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;->getDevice(Ljava/lang/String;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public getOneUserActivity(Ljava/lang/String;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_11:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;->getOneUserActivity(Ljava/lang/String;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public getUpdateInfo(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "pid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "language"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_6:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;->getUpdateInfo(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public getUser()Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;->getUser()Lio/reactivex/Single;

    move-result-object v0

    return-object v0
.end method

.method public handleApiError(Ljava/lang/Throwable;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->cloudErrorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;->handleApiError(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public handleAuthError(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;",
            ">;"
        }
    .end annotation

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "passwordCredentials"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->cloudErrorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;->handleAuthError(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public isLoggedIn()Z
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->loginCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;->isLoggedIn()Z

    move-result v0

    return v0
.end method

.method public login(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;"
        }
    .end annotation

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "password"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->loginCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;->login(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public logout()Lio/reactivex/Completable;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->loginCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;->logout()Lio/reactivex/Completable;

    move-result-object v0

    return-object v0
.end method

.method public registerDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;->registerDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public removeDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;->removeDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public resendVerifyEmail(Ljava/lang/String;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;->resendVerifyEmail(Ljava/lang/String;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public resetUserPassword(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "oldPassword"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newPassword"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;->resetUserPassword(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public save(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "goalConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_7:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;->save(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public saveAllRestingLogs(Ljava/util/List;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "restingLogs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_9:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;->saveAllRestingLogs(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public saveAllSleepLogs(Ljava/util/List;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "sleepLogs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_10:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;->saveAllSleepLogs(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public saveAllWalkingLogs(Ljava/util/List;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "walkingLogs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_8:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;->saveAllWalkingLogs(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public saveUserActivities(Ljava/util/List;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "userActivities"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_11:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;->saveUserActivities(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public updateDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;->updateDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public updateUser(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;->updateUser(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public updateUserActivity(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "userActivity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->$$delegate_11:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;->updateUserActivity(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method
