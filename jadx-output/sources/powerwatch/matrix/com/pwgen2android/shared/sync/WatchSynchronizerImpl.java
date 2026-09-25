package powerwatch.matrix.com.pwgen2android.shared.sync;

/* JADX INFO: compiled from: WatchSynchronizer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bß\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020*\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020.\u0012\u0006\u0010/\u001a\u000200\u0012\u0006\u00101\u001a\u000202\u0012\u0006\u00103\u001a\u000204\u0012\u0006\u00105\u001a\u000206\u0012\b\b\u0002\u00107\u001a\u000208¢\u0006\u0002\u00109J\u0016\u0010R\u001a\b\u0012\u0004\u0012\u00020D0@2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020VH\u0002J\u000e\u0010W\u001a\b\u0012\u0004\u0012\u00020A0@H\u0016J\u000e\u0010X\u001a\b\u0012\u0004\u0012\u00020D0@H\u0016J\u0010\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020NH\u0016J\u0084\u0001\u0010\\\u001a~\u00128\u00126\u0012\u0004\u0012\u00020^\u0012\u0006\u0012\u0004\u0018\u00010_\u0012\u0006\u0012\u0004\u0018\u00010` <*\u001a\u0012\u0004\u0012\u00020^\u0012\u0006\u0012\u0004\u0018\u00010_\u0012\u0006\u0012\u0004\u0018\u00010`\u0018\u00010]0] <*>\u00128\u00126\u0012\u0004\u0012\u00020^\u0012\u0006\u0012\u0004\u0018\u00010_\u0012\u0006\u0012\u0004\u0018\u00010` <*\u001a\u0012\u0004\u0012\u00020^\u0012\u0006\u0012\u0004\u0018\u00010_\u0012\u0006\u0012\u0004\u0018\u00010`\u0018\u00010]0]\u0018\u00010@0@H\u0016R\u0016\u0010:\u001a\n <*\u0004\u0018\u00010;0;X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010B\u001a\u0010\u0012\f\u0012\n <*\u0004\u0018\u00010D0D0CX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010E\u001a\u00020FX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0014\u0010K\u001a\b\u0012\u0004\u0012\u00020L0@X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010M\u001a\u0010\u0012\f\u0012\n <*\u0004\u0018\u00010N0N0CX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010O\u001a\u0010\u0012\f\u0012\n <*\u0004\u0018\u00010Q0Q0PX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "deviceManager", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;", "logger", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;", "languageController", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;", "context", "Landroid/content/Context;", "goalConfigurationRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "walkingLogRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;", "restingLogRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;", "sleepLogRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;", "walkingHourPeriodRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;", "restingHourPeriodRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;", "sleepHourPeriodRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;", "userActivitySessionRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;", "metricsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;", "bluetoothManager", "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;", "deviceCommunicationQueuer", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;", "gpsUpdateProcessExecutor", "Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;", "cloudSynchronizer", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;", "fontUpdateController", "Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;", "sleepTimeStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;", "sleepTimeCloudStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;", "stravaController", "Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;", "googleFitController", "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;", "bugfenderConfig", "Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;", "locationInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;", "postSyncDataTransferCoordinator", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;)V", "TAG", "", "kotlin.jvm.PlatformType", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "formattedLogsObservable", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;", "processBehaviorSubject", "Lio/reactivex/subjects/PublishSubject;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;", "syncInProgress", "", "getSyncInProgress", "()Z", "setSyncInProgress", "(Z)V", "syncObservable", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;", "triggerSubject", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;", "userDataSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;", "createStartGPS", "decodeSyncError", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "error", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;", "formattedDataOutput", "gpsTransferOutput", "startSync", "", "syncConfig", "syncOutput", "Lkotlin/Triple;", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WatchSynchronizerImpl implements powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final java.lang.String TAG;
    private final powerwatch.matrix.com.pwgen2android.BugfenderConfig bugfenderConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer cloudSynchronizer;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager;
    private final powerwatch.matrix.com.pwgen2android.main.FontUpdateController fontUpdateController;
    private final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncEvent.SyncFinishedEvent> formattedLogsObservable;
    private final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController;
    private final powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor gpsUpdateProcessExecutor;
    private final powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController;
    private final powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider locationInfoProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput logger;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository;
    private final powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator postSyncDataTransferCoordinator;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult> processBehaviorSubject;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage sleepTimeCloudStorage;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage sleepTimeStorage;
    private final powerwatch.matrix.com.pwgen2android.strava.StravaController stravaController;
    private boolean syncInProgress;
    private final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult> syncObservable;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig> triggerSubject;
    private final io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig> userDataSubject;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-28, reason: not valid java name */
    public static final void m3383_init_$lambda28() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-29, reason: not valid java name */
    public static final void m3384_init_$lambda29(java.lang.Throwable th) {
    }

    public WatchSynchronizerImpl(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput logger, powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController, final android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepository walkingLogRepository, final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepository restingLogRepository, final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepository sleepLogRepository, final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository walkingHourPeriodRepository, final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepository restingHourPeriodRepository, final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository sleepHourPeriodRepository, final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository userActivitySessionRepository, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository, final powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager, final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor gpsUpdateProcessExecutor, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer cloudSynchronizer, powerwatch.matrix.com.pwgen2android.main.FontUpdateController fontUpdateController, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage sleepTimeStorage, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage sleepTimeCloudStorage, powerwatch.matrix.com.pwgen2android.strava.StravaController stravaController, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController, powerwatch.matrix.com.pwgen2android.BugfenderConfig bugfenderConfig, powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider locationInfoProvider, powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator postSyncDataTransferCoordinator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageController, "languageController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationRepository, "goalConfigurationRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingLogRepository, "walkingLogRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingLogRepository, "restingLogRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogRepository, "sleepLogRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingHourPeriodRepository, "walkingHourPeriodRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingHourPeriodRepository, "restingHourPeriodRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepHourPeriodRepository, "sleepHourPeriodRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivitySessionRepository, "userActivitySessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRepository, "metricsRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "deviceCommunicationQueuer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsUpdateProcessExecutor, "gpsUpdateProcessExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudSynchronizer, "cloudSynchronizer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fontUpdateController, "fontUpdateController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepTimeStorage, "sleepTimeStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepTimeCloudStorage, "sleepTimeCloudStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stravaController, "stravaController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleFitController, "googleFitController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bugfenderConfig, "bugfenderConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationInfoProvider, "locationInfoProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postSyncDataTransferCoordinator, "postSyncDataTransferCoordinator");
        this.communicator = communicator;
        this.deviceManager = deviceManager;
        this.logger = logger;
        this.languageController = languageController;
        this.metricsRepository = metricsRepository;
        this.gpsUpdateProcessExecutor = gpsUpdateProcessExecutor;
        this.cloudSynchronizer = cloudSynchronizer;
        this.fontUpdateController = fontUpdateController;
        this.sleepTimeStorage = sleepTimeStorage;
        this.sleepTimeCloudStorage = sleepTimeCloudStorage;
        this.stravaController = stravaController;
        this.googleFitController = googleFitController;
        this.bugfenderConfig = bugfenderConfig;
        this.locationInfoProvider = locationInfoProvider;
        this.postSyncDataTransferCoordinator = postSyncDataTransferCoordinator;
        this.TAG = getClass().getSimpleName();
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.compositeDisposable = compositeDisposable;
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<SyncConfig>()");
        this.triggerSubject = publishSubjectCreate;
        io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig> behaviorSubjectCreate = io.reactivex.subjects.BehaviorSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create<PairingConfig>()");
        this.userDataSubject = behaviorSubjectCreate;
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult> publishSubjectCreate2 = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate2, "create<SyncProcessResult>()");
        this.processBehaviorSubject = publishSubjectCreate2;
        compositeDisposable.add(io.reactivex.Observable.combineLatest(powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository.DefaultImpls.load$default(userAccountRepository, false, true, 1, null), powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository.DefaultImpls.load$default(goalConfigurationRepository, false, true, 1, null), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$WlAKr9bipwD4Na5QQ0IMXfiT-gU
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3374_init_$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj, (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) obj2);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$5uMAb11JOeDncmDQxHl152dLUbg
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3375_init_$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$d5g5XPSq7aPTLiFabPK39VRI1Ac
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3377_init_$lambda2(this.f$0, (java.lang.Throwable) obj);
            }
        }));
        io.reactivex.observables.ConnectableObservable connectableObservableReplay = publishSubjectCreate.flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$4WXGpBWSWWC28WY9kHZQLDkc4GA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3376_init_$lambda19(this.f$0, bluetoothManager, deviceCommunicationQueuer, (powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig) obj);
            }
        }).repeat().replay(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(connectableObservableReplay, "triggerSubject\n                .flatMap { config ->\n                    Observable.just(config)\n                            .doOnNext {\n                                metricsRepository.logEvent(LogEvent(\n                                        DeviceEventType.SyncStart, null)\n                                )\n                            }\n                            .flatMap { syncConfig ->\n                                Observable.combineLatest(\n                                        deviceManager.connect(true)\n                                                .firstOrError()\n                                                .toObservable(), bluetoothManager.getChangeState(BluetoothState.Enabled, BluetoothState.Disabled),\n                                        BiFunction<DeviceInfo, BluetoothState, Pair<DeviceInfo, BluetoothState>> { deviceInfo, bluetoothState ->\n                                            Pair(deviceInfo, bluetoothState)\n                                        })\n                                        .flatMap {\n                                            (if (it.second == BluetoothState.Enabled) Observable.just(it.first) else Observable.error(SyncError.DeviceNotConnected))\n                                                    .map { Pair(syncConfig, it) }\n                                        }\n                            }\n                            .switchMap { syncConfigDeviceInfoPair ->\n                                (if (syncConfigDeviceInfoPair.second.isConnected) Observable.just(syncConfigDeviceInfoPair) else Observable.error(SyncError.DeviceNotConnected))\n                            }\n                            .doOnNext { syncInProgress = true }\n                            .concatMap {\n\n                                val deviceInfo = it.second\n                                val userData = userDataSubject.value?.apply {\n                                    this.userInfoData.sleepTimeSelection = sleepTimeStorage.getSleepTime()\n                                }\n                                config.deviceInfo = deviceInfo\n                                if (userData == null) {\n                                    wtfError(\"User data value is null!!!\")\n                                }\n                                val syncOperation = DeviceCommunicationOperation<Triple<Int, DataInfo?, Throwable?>>(\n\n                                        ExecutorsFactory.createSyncExecutor(deviceInfo, communicator, logger, locationInfoProvider)\n                                                .transferDataWithProgress(deviceInfo.uid, userData!!)\n                                                .map {\n                                                    Triple<Int, DataInfo?, Throwable?>(it.first, it.second, null)\n                                                }\n                                                .takeUntil { it.second != null }\n                                                .onErrorResumeNext(Function {\n                                                    communicator.resubscribeCharacteristics(ProtocolType.GEN2_DTP)\n                                                            .andThen(Observable.error(it))\n                                                })\n\n                                )\n                                // if sync is already part of some other operation, we should not put it into queue\n                                if (config.putInOperationQueue) deviceCommunicationQueuer.queue(syncOperation) else syncOperation.operationObs\n\n                            }\n                            // need to catch error, so it cannot be propagated, error is wrapped into onNext item\n                            .onErrorReturn {\n                                val error = when (it) {\n                                    is DTPProtocolError.SyncLocked -> SyncError.ActivityInProgress\n                                    is DTPProtocolError.WatchBusy -> SyncError.WatchBusy\n                                    is SyncError.DeviceNotConnected -> SyncError.DeviceNotConnected\n                                    is DTPProtocolParsingError.ActivityStartLogSizeMismatch -> SyncError.SyncParsingError(DTPProtocolParsingError.ActivityStartLogSizeMismatch.code)\n                                    is DTPProtocolParsingError.ActivityDeltaLogSizeMismatch -> SyncError.SyncParsingError(DTPProtocolParsingError.ActivityDeltaLogSizeMismatch.code)\n                                    is DTPProtocolParsingError.ActivityEndLogSizeMismatch -> SyncError.SyncParsingError(DTPProtocolParsingError.ActivityEndLogSizeMismatch.code)\n                                    is DTPProtocolParsingError.BackgroundLogSizeMismatch -> SyncError.SyncParsingError(DTPProtocolParsingError.BackgroundLogSizeMismatch.code)\n                                    is DTPProtocolParsingError.InvalidBackLogTimestampIndex -> SyncError.SyncParsingError(DTPProtocolParsingError.InvalidBackLogTimestampIndex.code)\n                                    is DTPProtocolParsingError.BackgroundLogEntryWithUnknownType -> SyncError.SyncParsingError(DTPProtocolParsingError.BackgroundLogEntryWithUnknownType.code)\n                                    is TimeoutException -> SyncError.SyncTimeoutError\n                                    else -> SyncError.Unknown\n                                }\n                                Triple(0, null, error)\n                            }\n                            .doOnEach {\n                                val dataInfo = it.value?.second\n                                val error = it.value?.third\n\n                                if (dataInfo != null || error != null) {\n                                    syncInProgress = false\n                                }\n                                if (error != null && (error is SyncError)) {\n                                    metricsRepository.logEvent(LogEvent(\n                                            DeviceEventType.SyncEnd, decodeSyncError(error))\n                                    )\n                                }\n                            }\n                            .map {\n                                SyncInternalResult(it.first, config, it.second, it.third)\n                            }\n                            .takeUntil { it.dataInfo != null || it.throwable != null }\n                            // sync executor pushes more than one finished event, so we need to ignore duplicates\n                            .distinctUntilChanged()\n                }\n                // need to resubscribe in case if error was caught\n                .repeat()\n                .replay(1)");
        io.reactivex.observables.ConnectableObservable connectableObservable = connectableObservableReplay;
        this.syncObservable = connectableObservable;
        compositeDisposable.add(connectableObservable.connect());
        io.reactivex.Observable observableShare = connectableObservable.map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$k88V2xofCdcHCBsIMbSiyFGZnnI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3378_init_$lambda20((powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$BxdvBZ3KqOgdu8Lj4hWvDyN9_GY
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3379_init_$lambda21((kotlin.Triple) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$d7OfK7fN8JWoez0iqgR7zYF9x7o
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3380_init_$lambda22((kotlin.Triple) obj);
            }
        }).repeat().retry().share();
        compositeDisposable.add(observableShare.doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$G6Qd0t1Lb9t179GEFbT3JNzUVB4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3381_init_$lambda23(this.f$0, (kotlin.Pair) obj);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$4XAGdCiHV6nElandwOLnAtUl8wU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3382_init_$lambda27(walkingLogRepository, restingLogRepository, sleepLogRepository, this, (kotlin.Pair) obj);
            }
        }).repeat().retry().subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$OQcOqotUuNTxXyd01jRtMu95pns
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3383_init_$lambda28();
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$-5INMbW2qWi4zgj-zYBGXkRsdEo
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3384_init_$lambda29((java.lang.Throwable) obj);
            }
        }));
        final io.reactivex.Single singleSubscribeOn = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$ZsNij2fw25sDQKFEGFXANWznse4
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3385_init_$lambda30(walkingHourPeriodRepository, restingHourPeriodRepository, sleepHourPeriodRepository, singleEmitter);
            }
        }).subscribeOn(io.reactivex.schedulers.Schedulers.io());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "create<LastPeriodsContainer> {\n                    val walkingHour = walkingHourPeriodRepository.getLastPeriod()\n                    val restingHour = restingHourPeriodRepository.getLastPeriod()\n                    val sleepHour = sleepHourPeriodRepository.getLastPeriod()\n\n                    it.onSuccess(\n                            LastPeriodsContainer(\n                                    walkingHour = walkingHour,\n                                    restingHour = restingHour,\n                                    sleepHour = sleepHour\n                            )\n                    )\n                }\n                        .subscribeOn(Schedulers.io())");
        io.reactivex.observables.ConnectableObservable connectableObservablePublish = observableShare.map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$WmbRH64PbPcWHsuxjNSOR8FgePg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3386_init_$lambda31((kotlin.Pair) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$RYPP5E_hlDxzVysinLTljIh5O4I
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3387_init_$lambda33(singleSubscribeOn, (powerwatch.matrix.com.pwgen2android.shared.sync.LogsContainer) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$rUYxqBlEfajXIHfHpxFS2nm3zqE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3388_init_$lambda35(this.f$0, context, (kotlin.Pair) obj);
            }
        }).flatMapSingle(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$s9nqm2QnkiODKyXb9yDLGKrLGio
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3389_init_$lambda39(walkingHourPeriodRepository, restingHourPeriodRepository, sleepHourPeriodRepository, userActivitySessionRepository, this, (powerwatch.matrix.com.pwgen2android.shared.sync.HoursContainer) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$Zw89B2HAxaehWfI0BOBto8QIwH0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3390_init_$lambda40(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.sync.HoursContainer) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$FV7mFmT0bVrPfc0mQJAnLUC3iS8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3391_init_$lambda41(this.f$0, (java.lang.Throwable) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$oTR78w6hewRP5tlWvK-fBsAizYE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3392_init_$lambda42((powerwatch.matrix.com.pwgen2android.shared.sync.HoursContainer) obj);
            }
        }).retry().repeat().publish();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(connectableObservablePublish, "syncLogsObservable\n                .map { it.second }\n                .flatMap { logs ->\n                    lastPeriods\n                            .map {\n                                Pair(logs, it)\n                            }\n                            .toObservable()\n                }\n                .map {\n                    //                    debug(\"Sync data for formatting arrived: $it\")\n                    Log.d(TAG, \"Sync data for formatting arrived: $it\")\n                    val logs = it.first\n                    val periods = it.second\n\n                    val userData = userDataSubject.value\n                    if (userData == null) {\n                        wtfError(\"User data null!!!\")\n                    }\n\n                    val walkingHours =\n                            WalkingHourPeriodFormatterImpl(logs.walkingLogs, periods.walkingHour).format()\n                    val restingHours =\n                            RestingHourPeriodFormatterImpl(logs.restingLogs, periods.restingHour).format()\n\n                    val sleepFiveMins = SleepFiveMinsPeriodFormatterImpl(logs.sleepLogs, periods.sleepHour?.sleepFiveMins?.maxByOrNull { it.startTime }, sleepTimeCloudStorage.getSleepTime()).format()\n                    val sleepHours =\n                            SleepHourPeriodFormatterImpl(sleepFiveMins, sleepTimeCloudStorage.getSleepTime()).format()\n                    val activitySessions =\n                            RunningSessionActivityFormatter(logs.activitySessions, userData!!.userInfoData.email, context).format()\n\n                    HoursContainer(walkingHours, restingHours, sleepHours, activitySessions)\n                }\n                .flatMapSingle {\n                    Completable.mergeArray(\n                            walkingHourPeriodRepository.save(it.walkingHourPeriods),\n                            restingHourPeriodRepository.save(it.restingHourPeriods),\n                            sleepHourPeriodRepository.save(it.sleepHourPeriods),\n                            userActivitySessionRepository.save(it.userActivitySessions, toCacheOnly = true),\n                            userActivitySessionRepository.saveActivityDates(it.userActivitySessions.map { session -> UserActivityDate(session.startTime) })\n                    ).toSingleDefault(it)\n                            .doOnSuccess {\n                                cloudSynchronizer.syncData()\n                                metricsRepository.logEvent(LogEvent(DeviceEventType.SyncEnd, DeviceEventStatus.SUCCESS))\n                            }.doOnEvent { _, _ ->\n                                val stravaAuth = stravaController.hasAuthorize()\n                                val googleFitAuth = googleFitController.hasPermissions()\n                                bugfenderConfig.setStravaAndFitStatus(stravaAuth, googleFitAuth)\n                            }\n                }\n                .doOnNext {\n                    debug(\"Data successfully formatted: $it\")\n                }\n                .doOnError {\n                    error(\"Error occurred while formatting sync data. Error is: \", it)\n                }\n                .map { SyncEvent.SyncFinishedEvent }\n                .retry()\n                .repeat()\n                .publish()");
        io.reactivex.observables.ConnectableObservable connectableObservable2 = connectableObservablePublish;
        this.formattedLogsObservable = connectableObservable2;
        compositeDisposable.add(connectableObservable2.connect());
        compositeDisposable.add(createStartGPS(deviceCommunicationQueuer).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$n9XAqaSyE1Qn1resTMZ-6AUMg2o
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3393_init_$lambda43(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$NOooeP9uVEEG4m1I-oCj4dwVTtQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3394_init_$lambda44(this.f$0, (java.lang.Throwable) obj);
            }
        }));
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public /* synthetic */ WatchSynchronizerImpl(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput pWLoggerInput, powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepository walkingLogRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepository restingLogRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepository sleepLogRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository walkingHourPeriodRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepository restingHourPeriodRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository sleepHourPeriodRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository userActivitySessionRepository, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor gPSUpdateProcessExecutor, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer cloudSynchronizer, powerwatch.matrix.com.pwgen2android.main.FontUpdateController fontUpdateController, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage sleepTimeStorage, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage sleepTimeCloudStorage, powerwatch.matrix.com.pwgen2android.strava.StravaController stravaController, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController, powerwatch.matrix.com.pwgen2android.BugfenderConfig bugfenderConfig, powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider locationInfoProvider, powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator postSyncDataTransferCoordinator, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(communicator, deviceManager, pWLoggerInput, languageController, context, goalConfigurationRepository, userAccountRepository, walkingLogRepository, restingLogRepository, sleepLogRepository, walkingHourPeriodRepository, restingHourPeriodRepository, sleepHourPeriodRepository, userActivitySessionRepository, metricsRepository, bluetoothManager, deviceCommunicationQueuer, gPSUpdateProcessExecutor, cloudSynchronizer, fontUpdateController, sleepTimeStorage, sleepTimeCloudStorage, stravaController, googleFitController, bugfenderConfig, locationInfoProvider, (i & 67108864) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator(gPSUpdateProcessExecutor, fontUpdateController, deviceManager) : postSyncDataTransferCoordinator);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer
    public boolean getSyncInProgress() {
        return this.syncInProgress;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer
    public void setSyncInProgress(boolean z) {
        this.syncInProgress = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig m3374_init_$lambda0(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.User user, powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "user");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "goal");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig(new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData(user.getAccountSettings().getTimeFormatType() == powerwatch.matrix.com.pwgen2android.shared.data.models.HourFormat.Twelve.INSTANCE.getFormat(), kotlin.jvm.internal.Intrinsics.areEqual(user.getAccountSettings().getUnitType(), powerwatch.matrix.com.pwgen2android.shared.data.models.UnitType.METRIC.INSTANCE.getType())), new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData(kotlin.jvm.internal.Intrinsics.areEqual(user.getGender(), powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDescription()), user.getAge(), user.getHeight(), user.getWeight(), user.getEmail(), this$0.sleepTimeStorage.getSleepTime()), new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData(goal.getSteps(), goal.getDistance(), goal.getCalories(), goal.getSleep()), new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LanguageInfoData(this$0.languageController.getLanguageByKey(user.getAccountSettings().getLanguage()).getLocale()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final void m3375_init_$lambda1(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.userDataSubject.onNext(pairingConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-2, reason: not valid java name */
    public static final void m3377_init_$lambda2(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.wtfError(this$0, "Subscription for userData died!!!", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-19, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3376_init_$lambda19(final powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, final powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager, final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, final powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothManager, "$bluetoothManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "$deviceCommunicationQueuer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        return io.reactivex.Observable.just(config).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$nf2lyFpWugfHLEdDS5Jcd9qnJ0c
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3420lambda19$lambda3(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$5cJ5ldlidoEuAMaafgulJjM7BkE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3421lambda19$lambda7(this.f$0, bluetoothManager, (powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig) obj);
            }
        }).switchMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$_i8s87Qz4UW5Gr9grpEqsKuVqEE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3425lambda19$lambda8((kotlin.Pair) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$7-ODdbkmSSX3C1mB19aAqmY9a0s
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3426lambda19$lambda9(this.f$0, (kotlin.Pair) obj);
            }
        }).concatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$Q3cYywZ142SXTkKiji3mZIG199Y
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3412lambda19$lambda14(this.f$0, config, deviceCommunicationQueuer, (kotlin.Pair) obj);
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$DmukQMSbCXQCXCkWuPh90tFvAx4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3416lambda19$lambda15((java.lang.Throwable) obj);
            }
        }).doOnEach(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$QmI6QR5Mdu6iRKpIjpg3aQbODgo
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3417lambda19$lambda16(this.f$0, (io.reactivex.Notification) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$5GrqIWxvBDbgcw3rpmUbvgFEdzc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3418lambda19$lambda17(config, (kotlin.Triple) obj);
            }
        }).takeUntil(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$Ad9qZBUQxXuPXjb3EEnInIiTSuk
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3419lambda19$lambda18((powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult) obj);
            }
        }).distinctUntilChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-19$lambda-3, reason: not valid java name */
    public static final void m3420lambda19$lambda3(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig syncConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.metricsRepository.logEvent(new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent(powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.SyncStart.INSTANCE, null, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-19$lambda-7, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3421lambda19$lambda7(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager, final powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig syncConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothManager, "$bluetoothManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syncConfig, "syncConfig");
        return io.reactivex.Observable.combineLatest(this$0.deviceManager.connect(true).firstOrError().toObservable(), bluetoothManager.getChangeState(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Enabled.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Disabled.INSTANCE), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$TuHepmMrG7wRBhC0DTCMtkAZAmM
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3422lambda19$lambda7$lambda4((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj, (powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState) obj2);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$aD1mzkrUK6IEMNxgPvQC9a37GEw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3423lambda19$lambda7$lambda6(syncConfig, (kotlin.Pair) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-19$lambda-7$lambda-4, reason: not valid java name */
    public static final kotlin.Pair m3422lambda19$lambda7$lambda4(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState bluetoothState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothState, "bluetoothState");
        return new kotlin.Pair(deviceInfo, bluetoothState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-19$lambda-7$lambda-6, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3423lambda19$lambda7$lambda6(final powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig syncConfig, kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syncConfig, "$syncConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (kotlin.jvm.internal.Intrinsics.areEqual(it.getSecond(), powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Enabled.INSTANCE) ? io.reactivex.Observable.just(it.getFirst()) : io.reactivex.Observable.error(powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.DeviceNotConnected.INSTANCE)).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$NUxHI0VOCEHFPWgeJKC9PoEYZO0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3424lambda19$lambda7$lambda6$lambda5(syncConfig, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-19$lambda-7$lambda-6$lambda-5, reason: not valid java name */
    public static final kotlin.Pair m3424lambda19$lambda7$lambda6$lambda5(powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig syncConfig, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syncConfig, "$syncConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new kotlin.Pair(syncConfig, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-19$lambda-8, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3425lambda19$lambda8(kotlin.Pair syncConfigDeviceInfoPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syncConfigDeviceInfoPair, "syncConfigDeviceInfoPair");
        return ((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) syncConfigDeviceInfoPair.getSecond()).isConnected() ? io.reactivex.Observable.just(syncConfigDeviceInfoPair) : io.reactivex.Observable.error(powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.DeviceNotConnected.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-19$lambda-9, reason: not valid java name */
    public static final void m3426lambda19$lambda9(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setSyncInProgress(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-19$lambda-14, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3412lambda19$lambda14(final powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig config, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, kotlin.Pair it) {
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "$config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "$deviceCommunicationQueuer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.lang.Object second = it.getSecond();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(second, "it.second");
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo = (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) second;
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig value = this$0.userDataSubject.getValue();
        if (value == null) {
            pairingConfig = null;
        } else {
            value.getUserInfoData().setSleepTimeSelection(this$0.sleepTimeStorage.getSleepTime());
            pairingConfig = value;
        }
        config.setDeviceInfo(deviceInfo);
        if (pairingConfig == null) {
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.wtfError$default(this$0, "User data value is null!!!", null, 2, null);
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor dataTransferExecutorCreateSyncExecutor = powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.ExecutorsFactory.INSTANCE.createSyncExecutor(deviceInfo, this$0.communicator, this$0.logger, this$0.locationInfoProvider);
        java.lang.String uid = deviceInfo.getUid();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pairingConfig);
        io.reactivex.Observable observableOnErrorResumeNext = powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.transferDataWithProgress$default(dataTransferExecutorCreateSyncExecutor, uid, pairingConfig, 0.0f, 4, null).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$sJiYYz9vY8s24Z2ukQQnbwBMAxg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3413lambda19$lambda14$lambda11((kotlin.Pair) obj);
            }
        }).takeUntil(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$dvNTwHDzLjF7ucsoY1y0KrGE2JM
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3414lambda19$lambda14$lambda12((kotlin.Triple) obj);
            }
        }).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$isocrRS6vdIfDst6ziBvr9V6fTE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3415lambda19$lambda14$lambda13(this.f$0, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "ExecutorsFactory.createSyncExecutor(deviceInfo, communicator, logger, locationInfoProvider)\n                                                .transferDataWithProgress(deviceInfo.uid, userData!!)\n                                                .map {\n                                                    Triple<Int, DataInfo?, Throwable?>(it.first, it.second, null)\n                                                }\n                                                .takeUntil { it.second != null }\n                                                .onErrorResumeNext(Function {\n                                                    communicator.resubscribeCharacteristics(ProtocolType.GEN2_DTP)\n                                                            .andThen(Observable.error(it))\n                                                })");
        powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation deviceCommunicationOperation = new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation(observableOnErrorResumeNext, null, null, 6, null);
        return config.getPutInOperationQueue() ? deviceCommunicationQueuer.queue(deviceCommunicationOperation) : deviceCommunicationOperation.getOperationObs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-19$lambda-14$lambda-11, reason: not valid java name */
    public static final kotlin.Triple m3413lambda19$lambda14$lambda11(kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new kotlin.Triple(it.getFirst(), it.getSecond(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-19$lambda-14$lambda-12, reason: not valid java name */
    public static final boolean m3414lambda19$lambda14$lambda12(kotlin.Triple it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getSecond() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-19$lambda-14$lambda-13, reason: not valid java name */
    public static final io.reactivex.Observable m3415lambda19$lambda14$lambda13(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.communicator.resubscribeCharacteristics(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_DTP).andThen(io.reactivex.Observable.error(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-19$lambda-15, reason: not valid java name */
    public static final kotlin.Triple m3416lambda19$lambda15(java.lang.Throwable it) {
        powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.Unknown syncParsingError;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError.SyncLocked) {
            syncParsingError = powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.ActivityInProgress.INSTANCE;
        } else if (it instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError.WatchBusy) {
            syncParsingError = powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.WatchBusy.INSTANCE;
        } else if (it instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.DeviceNotConnected) {
            syncParsingError = powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.DeviceNotConnected.INSTANCE;
        } else if (it instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityStartLogSizeMismatch) {
            syncParsingError = new powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.SyncParsingError(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityStartLogSizeMismatch.INSTANCE.getCode());
        } else if (it instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityDeltaLogSizeMismatch) {
            syncParsingError = new powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.SyncParsingError(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityDeltaLogSizeMismatch.INSTANCE.getCode());
        } else if (it instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityEndLogSizeMismatch) {
            syncParsingError = new powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.SyncParsingError(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityEndLogSizeMismatch.INSTANCE.getCode());
        } else if (it instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.BackgroundLogSizeMismatch) {
            syncParsingError = new powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.SyncParsingError(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.BackgroundLogSizeMismatch.INSTANCE.getCode());
        } else if (it instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.InvalidBackLogTimestampIndex) {
            syncParsingError = new powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.SyncParsingError(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.InvalidBackLogTimestampIndex.INSTANCE.getCode());
        } else if (it instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.BackgroundLogEntryWithUnknownType) {
            syncParsingError = new powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.SyncParsingError(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.BackgroundLogEntryWithUnknownType.INSTANCE.getCode());
        } else {
            syncParsingError = it instanceof java.util.concurrent.TimeoutException ? powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.SyncTimeoutError.INSTANCE : powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.Unknown.INSTANCE;
        }
        return new kotlin.Triple(0, null, syncParsingError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-19$lambda-16, reason: not valid java name */
    public static final void m3417lambda19$lambda16(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, io.reactivex.Notification notification) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.Triple triple = (kotlin.Triple) notification.getValue();
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo = triple == null ? null : (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) triple.getSecond();
        kotlin.Triple triple2 = (kotlin.Triple) notification.getValue();
        java.lang.Throwable th = triple2 != null ? (java.lang.Throwable) triple2.getThird() : null;
        if (dataInfo != null || th != null) {
            this$0.setSyncInProgress(false);
        }
        if (th == null || !(th instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError)) {
            return;
        }
        this$0.metricsRepository.logEvent(new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent(powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.SyncEnd.INSTANCE, this$0.decodeSyncError((powerwatch.matrix.com.pwgen2android.shared.sync.SyncError) th), null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-19$lambda-17, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult m3418lambda19$lambda17(powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig config, kotlin.Triple it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "$config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult(((java.lang.Number) it.getFirst()).intValue(), config, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) it.getSecond(), (java.lang.Throwable) it.getThird());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-19$lambda-18, reason: not valid java name */
    public static final boolean m3419lambda19$lambda18(powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (it.getDataInfo() == null && it.getThrowable() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-20, reason: not valid java name */
    public static final kotlin.Triple m3378_init_$lambda20(powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new kotlin.Triple(java.lang.Integer.valueOf(it.getProgress()), it.getDataInfo(), it.getThrowable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-21, reason: not valid java name */
    public static final boolean m3379_init_$lambda21(kotlin.Triple it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getSecond() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-22, reason: not valid java name */
    public static final kotlin.Pair m3380_init_$lambda22(kotlin.Triple it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) it.getSecond();
        kotlin.jvm.internal.Intrinsics.checkNotNull(dataInfo);
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> list = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WatchEntryToWalkingFormatter().format(dataInfo.getActivityLogs(), dataInfo.getActivitySummary(), dataInfo.getActivityLogInterval(), dataInfo.getData().getPid() == 4);
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> list2 = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WatchEntryToRestingFormatter().format(dataInfo.getActivityLogs(), dataInfo.getActivitySummary(), dataInfo.getActivityLogInterval(), dataInfo.getData().getPid() == 4);
        powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WatchEntryToSleepFormatter watchEntryToSleepFormatter = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WatchEntryToSleepFormatter();
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo2 = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) it.getSecond();
        java.util.ArrayList activityLogs = dataInfo2 == null ? null : dataInfo2.getActivityLogs();
        if (activityLogs == null) {
            activityLogs = new java.util.ArrayList();
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry> list3 = activityLogs;
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo3 = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) it.getSecond();
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TotalActivityData activitySummary = dataInfo3 != null ? dataInfo3.getActivitySummary() : null;
        return new kotlin.Pair(dataInfo.getData(), new powerwatch.matrix.com.pwgen2android.shared.sync.LogsContainer(list, list2, watchEntryToSleepFormatter.format(list3, activitySummary == null ? 0L : activitySummary.getLastLogTime(), dataInfo.getActivityLogInterval(), dataInfo.getData().getPid() == 4), dataInfo.getRunningLogs()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-23, reason: not valid java name */
    public static final void m3381_init_$lambda23(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Starting data save: ", java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-27, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3382_init_$lambda27(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepository walkingLogRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepository restingLogRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepository sleepLogRepository, final powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingLogRepository, "$walkingLogRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingLogRepository, "$restingLogRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogRepository, "$sleepLogRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return io.reactivex.Completable.mergeArray(powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddAllRepository.DefaultImpls.save$default(walkingLogRepository, ((powerwatch.matrix.com.pwgen2android.shared.sync.LogsContainer) it.getSecond()).getWalkingLogs(), false, 2, null).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$X1ukgTp4HuSZdpCDQo7zc7sJiH8
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3427lambda27$lambda24(this.f$0);
            }
        }), powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddAllRepository.DefaultImpls.save$default(restingLogRepository, ((powerwatch.matrix.com.pwgen2android.shared.sync.LogsContainer) it.getSecond()).getRestingLogs(), false, 2, null).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$htgj1VZKfotE1A06l3Sxb_CZPEc
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3428lambda27$lambda25(this.f$0);
            }
        }), powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddAllRepository.DefaultImpls.save$default(sleepLogRepository, ((powerwatch.matrix.com.pwgen2android.shared.sync.LogsContainer) it.getSecond()).getSleepLogs(), false, 2, null).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$x0w-YlV2tLDoUXEhS2YFVF7QGMo
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3429lambda27$lambda26(this.f$0);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-27$lambda-24, reason: not valid java name */
    public static final void m3427lambda27$lambda24(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Walking logs saved, time - ", java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-27$lambda-25, reason: not valid java name */
    public static final void m3428lambda27$lambda25(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Resting logs saved, time - ", java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-27$lambda-26, reason: not valid java name */
    public static final void m3429lambda27$lambda26(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Sleep logs saved, time - ", java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-30, reason: not valid java name */
    public static final void m3385_init_$lambda30(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository walkingHourPeriodRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepository restingHourPeriodRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository sleepHourPeriodRepository, io.reactivex.SingleEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingHourPeriodRepository, "$walkingHourPeriodRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingHourPeriodRepository, "$restingHourPeriodRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepHourPeriodRepository, "$sleepHourPeriodRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.onSuccess(new powerwatch.matrix.com.pwgen2android.shared.sync.LastPeriodsContainer(walkingHourPeriodRepository.getLastPeriod(), restingHourPeriodRepository.getLastPeriod(), sleepHourPeriodRepository.getLastPeriod()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-31, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.sync.LogsContainer m3386_init_$lambda31(kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (powerwatch.matrix.com.pwgen2android.shared.sync.LogsContainer) it.getSecond();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-33, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3387_init_$lambda33(io.reactivex.Single lastPeriods, final powerwatch.matrix.com.pwgen2android.shared.sync.LogsContainer logs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastPeriods, "$lastPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "logs");
        return lastPeriods.map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$QeD6jGALJE7dC1yqwIhWsIXJSNs
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3430lambda33$lambda32(logs, (powerwatch.matrix.com.pwgen2android.shared.sync.LastPeriodsContainer) obj);
            }
        }).toObservable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-33$lambda-32, reason: not valid java name */
    public static final kotlin.Pair m3430lambda33$lambda32(powerwatch.matrix.com.pwgen2android.shared.sync.LogsContainer logs, powerwatch.matrix.com.pwgen2android.shared.sync.LastPeriodsContainer it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "$logs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new kotlin.Pair(logs, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-35, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.sync.HoursContainer m3388_init_$lambda35(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, android.content.Context context, kotlin.Pair it) {
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> sleepFiveMins;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        android.util.Log.d(this$0.TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Sync data for formatting arrived: ", it));
        java.lang.Object first = it.getFirst();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(first, "it.first");
        powerwatch.matrix.com.pwgen2android.shared.sync.LogsContainer logsContainer = (powerwatch.matrix.com.pwgen2android.shared.sync.LogsContainer) first;
        java.lang.Object second = it.getSecond();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(second, "it.second");
        powerwatch.matrix.com.pwgen2android.shared.sync.LastPeriodsContainer lastPeriodsContainer = (powerwatch.matrix.com.pwgen2android.shared.sync.LastPeriodsContainer) second;
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig value = this$0.userDataSubject.getValue();
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod sleepFiveMinPeriod = null;
        java.lang.Object next = null;
        sleepFiveMinPeriod = null;
        if (value == null) {
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.wtfError$default(this$0, "User data null!!!", null, 2, null);
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> list = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingHourPeriodFormatterImpl(logsContainer.getWalkingLogs(), lastPeriodsContainer.getWalkingHour()).format();
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> list2 = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingHourPeriodFormatterImpl(logsContainer.getRestingLogs(), lastPeriodsContainer.getRestingHour()).format();
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> sleepLogs = logsContainer.getSleepLogs();
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHour = lastPeriodsContainer.getSleepHour();
        if (sleepHour != null && (sleepFiveMins = sleepHour.getSleepFiveMins()) != null) {
            java.util.Iterator<T> it2 = sleepFiveMins.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    long startTime = ((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod) next).getStartTime();
                    do {
                        java.lang.Object next2 = it2.next();
                        long startTime2 = ((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod) next2).getStartTime();
                        if (startTime < startTime2) {
                            next = next2;
                            startTime = startTime2;
                        }
                    } while (it2.hasNext());
                }
            }
            sleepFiveMinPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod) next;
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> list3 = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepHourPeriodFormatterImpl(new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepFiveMinsPeriodFormatterImpl(sleepLogs, sleepFiveMinPeriod, this$0.sleepTimeCloudStorage.getSleepTime()).format(), this$0.sleepTimeCloudStorage.getSleepTime()).format();
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry> activitySessions = logsContainer.getActivitySessions();
        kotlin.jvm.internal.Intrinsics.checkNotNull(value);
        return new powerwatch.matrix.com.pwgen2android.shared.sync.HoursContainer(list, list2, list3, new powerwatch.matrix.com.pwgen2android.shared.data.RunningSessionActivityFormatter(activitySessions, value.getUserInfoData().getEmail(), context).format());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-39, reason: not valid java name */
    public static final io.reactivex.SingleSource m3389_init_$lambda39(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository walkingHourPeriodRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepository restingHourPeriodRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository sleepHourPeriodRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository userActivitySessionRepository, final powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, powerwatch.matrix.com.pwgen2android.shared.sync.HoursContainer it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingHourPeriodRepository, "$walkingHourPeriodRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingHourPeriodRepository, "$restingHourPeriodRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepHourPeriodRepository, "$sleepHourPeriodRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivitySessionRepository, "$userActivitySessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        io.reactivex.CompletableSource[] completableSourceArr = new io.reactivex.CompletableSource[5];
        completableSourceArr[0] = powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddAllRepository.DefaultImpls.save$default(walkingHourPeriodRepository, it.getWalkingHourPeriods(), false, 2, null);
        completableSourceArr[1] = powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddAllRepository.DefaultImpls.save$default(restingHourPeriodRepository, it.getRestingHourPeriods(), false, 2, null);
        completableSourceArr[2] = powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddAllRepository.DefaultImpls.save$default(sleepHourPeriodRepository, it.getSleepHourPeriods(), false, 2, null);
        completableSourceArr[3] = userActivitySessionRepository.save(it.getUserActivitySessions(), true);
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> userActivitySessions = it.getUserActivitySessions();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(userActivitySessions, 10));
        java.util.Iterator<T> it2 = userActivitySessions.iterator();
        while (it2.hasNext()) {
            arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate(((powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession) it2.next()).getStartTime()));
        }
        completableSourceArr[4] = userActivitySessionRepository.saveActivityDates(arrayList);
        return io.reactivex.Completable.mergeArray(completableSourceArr).toSingleDefault(it).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$JIoMXQuK-ElwJJMp6EE8l6TQvCU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3431lambda39$lambda37(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.sync.HoursContainer) obj);
            }
        }).doOnEvent(new io.reactivex.functions.BiConsumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$HLrvzlbdHzMg2xtbOg_3UnX08rw
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3432lambda39$lambda38(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.sync.HoursContainer) obj, (java.lang.Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-39$lambda-37, reason: not valid java name */
    public static final void m3431lambda39$lambda37(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, powerwatch.matrix.com.pwgen2android.shared.sync.HoursContainer hoursContainer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cloudSynchronizer.syncData();
        this$0.metricsRepository.logEvent(new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent(powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.SyncEnd.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.SUCCESS.INSTANCE, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-39$lambda-38, reason: not valid java name */
    public static final void m3432lambda39$lambda38(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, powerwatch.matrix.com.pwgen2android.shared.sync.HoursContainer hoursContainer, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.bugfenderConfig.setStravaAndFitStatus(this$0.stravaController.hasAuthorize(), this$0.googleFitController.hasPermissions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-40, reason: not valid java name */
    public static final void m3390_init_$lambda40(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, powerwatch.matrix.com.pwgen2android.shared.sync.HoursContainer hoursContainer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Data successfully formatted: ", hoursContainer), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-41, reason: not valid java name */
    public static final void m3391_init_$lambda41(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Error occurred while formatting sync data. Error is: ", th, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-42, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.sync.SyncEvent.SyncFinishedEvent m3392_init_$lambda42(powerwatch.matrix.com.pwgen2android.shared.sync.HoursContainer it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.shared.sync.SyncEvent.SyncFinishedEvent.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-43, reason: not valid java name */
    public static final void m3393_init_$lambda43(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult syncProcessResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.processBehaviorSubject.onNext(syncProcessResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-44, reason: not valid java name */
    public static final void m3394_init_$lambda44(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "ERROR!!!", th, null, 4, null);
    }

    private final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus decodeSyncError(powerwatch.matrix.com.pwgen2android.shared.sync.SyncError error) {
        if (error instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.DeviceNotConnected) {
            return powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.DEVICE_DISCONNECTED.INSTANCE;
        }
        if (error instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.ActivityInProgress) {
            return powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.ACTIVITY_IN_PROGRESS.INSTANCE;
        }
        if (error instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.WatchBusy) {
            return powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.WATCH_BUSY.INSTANCE;
        }
        if (!(error instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.SyncParsingError)) {
            return error instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.SyncTimeoutError ? powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.COMMUNICATION_TIMEOUT.INSTANCE : new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.UNKNOWN();
        }
        int code = ((powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.SyncParsingError) error).getCode();
        if (code == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityStartLogSizeMismatch.INSTANCE.getCode()) {
            return powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.START_ACTIVITY_LOG_SIZE_MISMATCH.INSTANCE;
        }
        if (code == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityDeltaLogSizeMismatch.INSTANCE.getCode()) {
            return powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.DELTA_ACTIVITY_LOG_SIZE_MISMATCH.INSTANCE;
        }
        if (code == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityEndLogSizeMismatch.INSTANCE.getCode()) {
            return powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.END_ACTIVITY_LOG_SIZE_MISMATCH.INSTANCE;
        }
        if (code == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.BackgroundLogSizeMismatch.INSTANCE.getCode()) {
            return powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.BACKGROUND_LOG_SIZE_MISMATCH.INSTANCE;
        }
        if (code == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.InvalidBackLogTimestampIndex.INSTANCE.getCode()) {
            return powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.INVALID_RTL_INDEX.INSTANCE;
        }
        return code == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.BackgroundLogEntryWithUnknownType.INSTANCE.getCode() ? powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.BACKGROUND_LOG_UNKNOWN_TYPE.INSTANCE : new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.UNKNOWN();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer
    public void startSync(powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig syncConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syncConfig, "syncConfig");
        this.triggerSubject.onNext(syncConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: syncOutput$lambda-45, reason: not valid java name */
    public static final kotlin.Triple m3433syncOutput$lambda45(powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new kotlin.Triple(java.lang.Integer.valueOf(it.getProgress()), it.getDataInfo(), it.getThrowable());
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer
    public io.reactivex.Observable<kotlin.Triple<java.lang.Integer, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo, java.lang.Throwable>> syncOutput() {
        return this.syncObservable.map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$2Nu8qM4GDvfv_1v-9Ebw2ynfVUE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3433syncOutput$lambda45((powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult) obj);
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncEvent.SyncFinishedEvent> formattedDataOutput() {
        return this.formattedLogsObservable;
    }

    private final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult> createStartGPS(final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer) {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult> observableSwitchMap = this.syncObservable.distinctUntilChanged().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$GS6Da3K9m5H8EvztxJhddxbRevM
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3395createStartGPS$lambda46((powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$U2wv3ZAociQKdl3eU-dccnfrc0c
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3396createStartGPS$lambda47(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$KF5qbXkvaGwOYe2F8G18mtOdHbo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3397createStartGPS$lambda48(this.f$0, deviceCommunicationQueuer, (powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$S90vR4N3Ttd0OP_1bchaG0BCTNk
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3398createStartGPS$lambda49(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult) obj);
            }
        }).switchMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$SMAHWC45EBt1a97JEGh_o12G3YI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3399createStartGPS$lambda51(this.f$0, deviceCommunicationQueuer, (powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "syncObservable\n                .distinctUntilChanged()\n                .filter { internalResult ->\n                    !internalResult.syncConfig.isFromOTA &&\n                            (internalResult.dataInfo != null ||\n                                    (internalResult.throwable != null\n                                            && (internalResult.throwable !is SyncError.DeviceNotConnected && internalResult.throwable !is SyncError.WatchBusy)))\n                }\n                .doOnNext { debug(\"AGPS_Command\") }\n                .flatMap { syncResult ->\n                    postSyncDataTransferCoordinator.isAGPSUpdateNeeded(deviceCommunicationQueuer, syncResult)\n                }\n                .doOnNext { syncInProgress = true }\n                .switchMap {internalResult ->\n                    postSyncDataTransferCoordinator.runMainProcess(internalResult, deviceCommunicationQueuer)\n                            .doOnTerminate { syncInProgress = false }\n                }");
        return observableSwitchMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createStartGPS$lambda-46, reason: not valid java name */
    public static final boolean m3395createStartGPS$lambda46(powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult internalResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalResult, "internalResult");
        return (internalResult.getSyncConfig().isFromOTA() || (internalResult.getDataInfo() == null && (internalResult.getThrowable() == null || (internalResult.getThrowable() instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.DeviceNotConnected) || (internalResult.getThrowable() instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.WatchBusy)))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createStartGPS$lambda-47, reason: not valid java name */
    public static final void m3396createStartGPS$lambda47(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult syncInternalResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "AGPS_Command", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createStartGPS$lambda-48, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3397createStartGPS$lambda48(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult syncResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "$deviceCommunicationQueuer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syncResult, "syncResult");
        return this$0.postSyncDataTransferCoordinator.isAGPSUpdateNeeded(deviceCommunicationQueuer, syncResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createStartGPS$lambda-49, reason: not valid java name */
    public static final void m3398createStartGPS$lambda49(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult syncInternalResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setSyncInProgress(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createStartGPS$lambda-51, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3399createStartGPS$lambda51(final powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult internalResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "$deviceCommunicationQueuer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalResult, "internalResult");
        return this$0.postSyncDataTransferCoordinator.runMainProcess(internalResult, deviceCommunicationQueuer).doOnTerminate(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$INPJ518nTxhLDGdqHMM5P65wA98
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3400createStartGPS$lambda51$lambda50(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createStartGPS$lambda-51$lambda-50, reason: not valid java name */
    public static final void m3400createStartGPS$lambda51$lambda50(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setSyncInProgress(false);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult> gpsTransferOutput() {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult> observableMerge = io.reactivex.Observable.merge(this.syncObservable.map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$WatchSynchronizerImpl$1XXxyNxQqiOtraOJqPYBFaUiLf4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl.m3401gpsTransferOutput$lambda52((powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult) obj);
            }
        }), this.processBehaviorSubject);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(syncObservable.map {\n                SyncProcessResult.SyncProgress(it.progress, it.dataInfo, it.throwable, it.syncConfig.isGPSUpdateNeeded)\n            }, processBehaviorSubject)");
        return observableMerge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: gpsTransferOutput$lambda-52, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.SyncProgress m3401gpsTransferOutput$lambda52(powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.SyncProgress(it.getProgress(), it.getDataInfo(), it.getThrowable(), it.getSyncConfig().isGPSUpdateNeeded());
    }
}
