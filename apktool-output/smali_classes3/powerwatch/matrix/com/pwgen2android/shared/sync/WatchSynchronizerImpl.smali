.class public final Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;
.super Ljava/lang/Object;
.source "WatchSynchronizer.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWatchSynchronizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchSynchronizer.kt\npowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,473:1\n1895#2,14:474\n1547#2:488\n1618#2,3:489\n*S KotlinDebug\n*F\n+ 1 WatchSynchronizer.kt\npowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl\n*L\n371#1:474,14\n385#1:488\n385#1:489,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u00df\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010\'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020*\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020.\u0012\u0006\u0010/\u001a\u000200\u0012\u0006\u00101\u001a\u000202\u0012\u0006\u00103\u001a\u000204\u0012\u0006\u00105\u001a\u000206\u0012\u0008\u0008\u0002\u00107\u001a\u000208\u00a2\u0006\u0002\u00109J\u0016\u0010R\u001a\u0008\u0012\u0004\u0012\u00020D0@2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020VH\u0002J\u000e\u0010W\u001a\u0008\u0012\u0004\u0012\u00020A0@H\u0016J\u000e\u0010X\u001a\u0008\u0012\u0004\u0012\u00020D0@H\u0016J\u0010\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020NH\u0016J\u0084\u0001\u0010\\\u001a~\u00128\u00126\u0012\u0004\u0012\u00020^\u0012\u0006\u0012\u0004\u0018\u00010_\u0012\u0006\u0012\u0004\u0018\u00010` <*\u001a\u0012\u0004\u0012\u00020^\u0012\u0006\u0012\u0004\u0018\u00010_\u0012\u0006\u0012\u0004\u0018\u00010`\u0018\u00010]0] <*>\u00128\u00126\u0012\u0004\u0012\u00020^\u0012\u0006\u0012\u0004\u0018\u00010_\u0012\u0006\u0012\u0004\u0018\u00010` <*\u001a\u0012\u0004\u0012\u00020^\u0012\u0006\u0012\u0004\u0018\u00010_\u0012\u0006\u0012\u0004\u0018\u00010`\u0018\u00010]0]\u0018\u00010@0@H\u0016R\u0016\u0010:\u001a\n <*\u0004\u0018\u00010;0;X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010?\u001a\u0008\u0012\u0004\u0012\u00020A0@X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010B\u001a\u0010\u0012\u000c\u0012\n <*\u0004\u0018\u00010D0D0CX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010E\u001a\u00020FX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008G\u0010H\"\u0004\u0008I\u0010JR\u0014\u0010K\u001a\u0008\u0012\u0004\u0012\u00020L0@X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010M\u001a\u0010\u0012\u000c\u0012\n <*\u0004\u0018\u00010N0N0CX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010O\u001a\u0010\u0012\u000c\u0012\n <*\u0004\u0018\u00010Q0Q0PX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006a"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "deviceManager",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;",
        "logger",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;",
        "languageController",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;",
        "context",
        "Landroid/content/Context;",
        "goalConfigurationRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "walkingLogRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;",
        "restingLogRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;",
        "sleepLogRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;",
        "walkingHourPeriodRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;",
        "restingHourPeriodRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;",
        "sleepHourPeriodRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;",
        "userActivitySessionRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;",
        "metricsRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;",
        "bluetoothManager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;",
        "deviceCommunicationQueuer",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;",
        "gpsUpdateProcessExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;",
        "cloudSynchronizer",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;",
        "fontUpdateController",
        "Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;",
        "sleepTimeStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;",
        "sleepTimeCloudStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;",
        "stravaController",
        "Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;",
        "googleFitController",
        "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;",
        "bugfenderConfig",
        "Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;",
        "locationInfoProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;",
        "postSyncDataTransferCoordinator",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;)V",
        "TAG",
        "",
        "kotlin.jvm.PlatformType",
        "compositeDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "formattedLogsObservable",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;",
        "processBehaviorSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;",
        "syncInProgress",
        "",
        "getSyncInProgress",
        "()Z",
        "setSyncInProgress",
        "(Z)V",
        "syncObservable",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;",
        "triggerSubject",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;",
        "userDataSubject",
        "Lio/reactivex/subjects/BehaviorSubject;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;",
        "createStartGPS",
        "decodeSyncError",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;",
        "error",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;",
        "formattedDataOutput",
        "gpsTransferOutput",
        "startSync",
        "",
        "syncConfig",
        "syncOutput",
        "Lkotlin/Triple;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
        "",
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
.field private final TAG:Ljava/lang/String;

.field private final bugfenderConfig:Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;

.field private final cloudSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;

.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field private final compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

.field private final fontUpdateController:Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;

.field private final formattedLogsObservable:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final googleFitController:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

.field private final gpsUpdateProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;

.field private final languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;

.field private final locationInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;

.field private final logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

.field private final metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

.field private final postSyncDataTransferCoordinator:Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;

.field private final processBehaviorSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;",
            ">;"
        }
    .end annotation
.end field

.field private final sleepTimeCloudStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;

.field private final sleepTimeStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;

.field private final stravaController:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

.field private syncInProgress:Z

.field private final syncObservable:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;",
            ">;"
        }
    .end annotation
.end field

.field private final triggerSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final userDataSubject:Lio/reactivex/subjects/BehaviorSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/BehaviorSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;)V
    .locals 16

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

    move-object/from16 v14, p15

    move-object/from16 v15, p16

    move-object/from16 v0, p17

    const-string v0, "communicator"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceManager"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "languageController"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalConfigurationRepository"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userAccountRepository"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "walkingLogRepository"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restingLogRepository"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepLogRepository"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "walkingHourPeriodRepository"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restingHourPeriodRepository"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepHourPeriodRepository"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userActivitySessionRepository"

    move-object/from16 v5, p14

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricsRepository"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothManager"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceCommunicationQueuer"

    move-object/from16 v5, p17

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gpsUpdateProcessExecutor"

    move-object/from16 v5, p18

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cloudSynchronizer"

    move-object/from16 v11, p19

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fontUpdateController"

    move-object/from16 v12, p20

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepTimeStorage"

    move-object/from16 v13, p21

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepTimeCloudStorage"

    move-object/from16 v8, p22

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stravaController"

    move-object/from16 v9, p23

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googleFitController"

    move-object/from16 v10, p24

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bugfenderConfig"

    move-object/from16 v15, p25

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationInfoProvider"

    move-object/from16 v6, p26

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "postSyncDataTransferCoordinator"

    move-object/from16 v7, p27

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 119
    iput-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    .line 120
    iput-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    .line 121
    iput-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;

    .line 132
    iput-object v14, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

    .line 135
    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->gpsUpdateProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;

    .line 136
    iput-object v11, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->cloudSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;

    .line 137
    iput-object v12, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->fontUpdateController:Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;

    .line 138
    iput-object v13, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->sleepTimeStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;

    .line 139
    iput-object v8, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->sleepTimeCloudStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;

    .line 140
    iput-object v9, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->stravaController:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

    .line 141
    iput-object v10, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->googleFitController:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

    .line 142
    iput-object v15, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->bugfenderConfig:Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;

    .line 143
    iput-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->locationInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;

    .line 144
    iput-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->postSyncDataTransferCoordinator:Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;

    .line 149
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->TAG:Ljava/lang/String;

    .line 151
    new-instance v1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {v1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 154
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v2

    const-string v3, "create<SyncConfig>()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->triggerSubject:Lio/reactivex/subjects/PublishSubject;

    .line 156
    invoke-static {}, Lio/reactivex/subjects/BehaviorSubject;->create()Lio/reactivex/subjects/BehaviorSubject;

    move-result-object v3

    const-string v4, "create<PairingConfig>()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->userDataSubject:Lio/reactivex/subjects/BehaviorSubject;

    # PATCHED (offline sync fix #2): the only upstream feeding userDataSubject
    # (combineLatest of user+goal Room observations) never emits offline
    # (both tables empty), so the sync pipeline NPEs on userData!!. Seed the
    # subject with the default offline PairingConfig built by this class's
    # own mapper (_init_$lambda-0). (private method -> invoke-direct)
    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->offlineSeedUserData()V

    .line 158
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v3

    const-string v4, "create<SyncProcessResult>()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->processBehaviorSubject:Lio/reactivex/subjects/PublishSubject;

    .line 164
    move-object/from16 v3, p7

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v5, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository$DefaultImpls;->load$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;ZZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v3

    check-cast v3, Lio/reactivex/ObservableSource;

    move-object/from16 v7, p6

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;

    invoke-static {v7, v4, v5, v5, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository$DefaultImpls;->load$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;ZZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v4

    check-cast v4, Lio/reactivex/ObservableSource;

    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$WlAKr9bipwD4Na5QQ0IMXfiT-gU;

    invoke-direct {v6, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$WlAKr9bipwD4Na5QQ0IMXfiT-gU;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    .line 163
    invoke-static {v3, v4, v6}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object v3

    .line 172
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$5uMAb11JOeDncmDQxHl152dLUbg;

    invoke-direct {v4, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$5uMAb11JOeDncmDQxHl152dLUbg;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    .line 174
    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$d5g5XPSq7aPTLiFabPK39VRI1Ac;

    invoke-direct {v6, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$d5g5XPSq7aPTLiFabPK39VRI1Ac;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    .line 172
    invoke-virtual {v3, v4, v6}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v3

    .line 162
    invoke-virtual {v1, v3}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 180
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4WXGpBWSWWC28WY9kHZQLDkc4GA;

    move-object/from16 v4, p16

    move-object/from16 v6, p17

    invoke-direct {v3, v0, v4, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4WXGpBWSWWC28WY9kHZQLDkc4GA;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)V

    invoke-virtual {v2, v3}, Lio/reactivex/subjects/PublishSubject;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v2

    .line 270
    invoke-virtual {v2}, Lio/reactivex/Observable;->repeat()Lio/reactivex/Observable;

    move-result-object v2

    .line 271
    invoke-virtual {v2, v5}, Lio/reactivex/Observable;->replay(I)Lio/reactivex/observables/ConnectableObservable;

    move-result-object v2

    const-string v3, "triggerSubject\n                .flatMap { config ->\n                    Observable.just(config)\n                            .doOnNext {\n                                metricsRepository.logEvent(LogEvent(\n                                        DeviceEventType.SyncStart, null)\n                                )\n                            }\n                            .flatMap { syncConfig ->\n                                Observable.combineLatest(\n                                        deviceManager.connect(true)\n                                                .firstOrError()\n                                                .toObservable(), bluetoothManager.getChangeState(BluetoothState.Enabled, BluetoothState.Disabled),\n                                        BiFunction<DeviceInfo, BluetoothState, Pair<DeviceInfo, BluetoothState>> { deviceInfo, bluetoothState ->\n                                            Pair(deviceInfo, bluetoothState)\n                                        })\n                                        .flatMap {\n                                            (if (it.second == BluetoothState.Enabled) Observable.just(it.first) else Observable.error(SyncError.DeviceNotConnected))\n                                                    .map { Pair(syncConfig, it) }\n                                        }\n                            }\n                            .switchMap { syncConfigDeviceInfoPair ->\n                                (if (syncConfigDeviceInfoPair.second.isConnected) Observable.just(syncConfigDeviceInfoPair) else Observable.error(SyncError.DeviceNotConnected))\n                            }\n                            .doOnNext { syncInProgress = true }\n                            .concatMap {\n\n                                val deviceInfo = it.second\n                                val userData = userDataSubject.value?.apply {\n                                    this.userInfoData.sleepTimeSelection = sleepTimeStorage.getSleepTime()\n                                }\n                                config.deviceInfo = deviceInfo\n                                if (userData == null) {\n                                    wtfError(\"User data value is null!!!\")\n                                }\n                                val syncOperation = DeviceCommunicationOperation<Triple<Int, DataInfo?, Throwable?>>(\n\n                                        ExecutorsFactory.createSyncExecutor(deviceInfo, communicator, logger, locationInfoProvider)\n                                                .transferDataWithProgress(deviceInfo.uid, userData!!)\n                                                .map {\n                                                    Triple<Int, DataInfo?, Throwable?>(it.first, it.second, null)\n                                                }\n                                                .takeUntil { it.second != null }\n                                                .onErrorResumeNext(Function {\n                                                    communicator.resubscribeCharacteristics(ProtocolType.GEN2_DTP)\n                                                            .andThen(Observable.error(it))\n                                                })\n\n                                )\n                                // if sync is already part of some other operation, we should not put it into queue\n                                if (config.putInOperationQueue) deviceCommunicationQueuer.queue(syncOperation) else syncOperation.operationObs\n\n                            }\n                            // need to catch error, so it cannot be propagated, error is wrapped into onNext item\n                            .onErrorReturn {\n                                val error = when (it) {\n                                    is DTPProtocolError.SyncLocked -> SyncError.ActivityInProgress\n                                    is DTPProtocolError.WatchBusy -> SyncError.WatchBusy\n                                    is SyncError.DeviceNotConnected -> SyncError.DeviceNotConnected\n                                    is DTPProtocolParsingError.ActivityStartLogSizeMismatch -> SyncError.SyncParsingError(DTPProtocolParsingError.ActivityStartLogSizeMismatch.code)\n                                    is DTPProtocolParsingError.ActivityDeltaLogSizeMismatch -> SyncError.SyncParsingError(DTPProtocolParsingError.ActivityDeltaLogSizeMismatch.code)\n                                    is DTPProtocolParsingError.ActivityEndLogSizeMismatch -> SyncError.SyncParsingError(DTPProtocolParsingError.ActivityEndLogSizeMismatch.code)\n                                    is DTPProtocolParsingError.BackgroundLogSizeMismatch -> SyncError.SyncParsingError(DTPProtocolParsingError.BackgroundLogSizeMismatch.code)\n                                    is DTPProtocolParsingError.InvalidBackLogTimestampIndex -> SyncError.SyncParsingError(DTPProtocolParsingError.InvalidBackLogTimestampIndex.code)\n                                    is DTPProtocolParsingError.BackgroundLogEntryWithUnknownType -> SyncError.SyncParsingError(DTPProtocolParsingError.BackgroundLogEntryWithUnknownType.code)\n                                    is TimeoutException -> SyncError.SyncTimeoutError\n                                    else -> SyncError.Unknown\n                                }\n                                Triple(0, null, error)\n                            }\n                            .doOnEach {\n                                val dataInfo = it.value?.second\n                                val error = it.value?.third\n\n                                if (dataInfo != null || error != null) {\n                                    syncInProgress = false\n                                }\n                                if (error != null && (error is SyncError)) {\n                                    metricsRepository.logEvent(LogEvent(\n                                            DeviceEventType.SyncEnd, decodeSyncError(error))\n                                    )\n                                }\n                            }\n                            .map {\n                                SyncInternalResult(it.first, config, it.second, it.third)\n                            }\n                            .takeUntil { it.dataInfo != null || it.throwable != null }\n                            // sync executor pushes more than one finished event, so we need to ignore duplicates\n                            .distinctUntilChanged()\n                }\n                // need to resubscribe in case if error was caught\n                .repeat()\n                .replay(1)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lio/reactivex/Observable;

    .line 179
    iput-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->syncObservable:Lio/reactivex/Observable;

    .line 273
    move-object v3, v2

    check-cast v3, Lio/reactivex/observables/ConnectableObservable;

    invoke-virtual {v3}, Lio/reactivex/observables/ConnectableObservable;->connect()Lio/reactivex/disposables/Disposable;

    move-result-object v3

    invoke-virtual {v1, v3}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 276
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$k88V2xofCdcHCBsIMbSiyFGZnnI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$k88V2xofCdcHCBsIMbSiyFGZnnI;

    .line 277
    invoke-virtual {v2, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v2

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$BxdvBZ3KqOgdu8Lj4hWvDyN9_GY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$BxdvBZ3KqOgdu8Lj4hWvDyN9_GY;

    .line 280
    invoke-virtual {v2, v3}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v2

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$d7OfK7fN8JWoez0iqgR7zYF9x7o;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$d7OfK7fN8JWoez0iqgR7zYF9x7o;

    .line 281
    invoke-virtual {v2, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v2

    .line 300
    invoke-virtual {v2}, Lio/reactivex/Observable;->repeat()Lio/reactivex/Observable;

    move-result-object v2

    .line 301
    invoke-virtual {v2}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object v2

    .line 302
    invoke-virtual {v2}, Lio/reactivex/Observable;->share()Lio/reactivex/Observable;

    move-result-object v2

    .line 307
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$G6Qd0t1Lb9t179GEFbT3JNzUVB4;

    invoke-direct {v3, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$G6Qd0t1Lb9t179GEFbT3JNzUVB4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    invoke-virtual {v2, v3}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v3

    .line 308
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4XAGdCiHV6nElandwOLnAtUl8wU;

    move-object/from16 v5, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    invoke-direct {v4, v5, v7, v8, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4XAGdCiHV6nElandwOLnAtUl8wU;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    invoke-virtual {v3, v4}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v3

    .line 324
    invoke-virtual {v3}, Lio/reactivex/Completable;->repeat()Lio/reactivex/Completable;

    move-result-object v3

    .line 325
    invoke-virtual {v3}, Lio/reactivex/Completable;->retry()Lio/reactivex/Completable;

    move-result-object v3

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$OQcOqotUuNTxXyd01jRtMu95pns;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$OQcOqotUuNTxXyd01jRtMu95pns;

    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$-5INMbW2qWi4zgj-zYBGXkRsdEo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$-5INMbW2qWi4zgj-zYBGXkRsdEo;

    .line 326
    invoke-virtual {v3, v4, v5}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v3

    .line 306
    invoke-virtual {v1, v3}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 329
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$ZsNij2fw25sDQKFEGFXANWznse4;

    move-object/from16 v4, p11

    move-object/from16 v5, p12

    move-object/from16 v7, p13

    invoke-direct {v3, v4, v5, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$ZsNij2fw25sDQKFEGFXANWznse4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;)V

    invoke-static {v3}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object v3

    .line 342
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->io()Lio/reactivex/Scheduler;

    move-result-object v8

    invoke-virtual {v3, v8}, Lio/reactivex/Single;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Single;

    move-result-object v3

    const-string v8, "create<LastPeriodsContainer> {\n                    val walkingHour = walkingHourPeriodRepository.getLastPeriod()\n                    val restingHour = restingHourPeriodRepository.getLastPeriod()\n                    val sleepHour = sleepHourPeriodRepository.getLastPeriod()\n\n                    it.onSuccess(\n                            LastPeriodsContainer(\n                                    walkingHour = walkingHour,\n                                    restingHour = restingHour,\n                                    sleepHour = sleepHour\n                            )\n                    )\n                }\n                        .subscribeOn(Schedulers.io())"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 346
    sget-object v8, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$WmbRH64PbPcWHsuxjNSOR8FgePg;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$WmbRH64PbPcWHsuxjNSOR8FgePg;

    .line 347
    invoke-virtual {v2, v8}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v2

    .line 348
    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$RYPP5E_hlDxzVysinLTljIh5O4I;

    invoke-direct {v8, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$RYPP5E_hlDxzVysinLTljIh5O4I;-><init>(Lio/reactivex/Single;)V

    invoke-virtual {v2, v8}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v2

    .line 355
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$rUYxqBlEfajXIHfHpxFS2nm3zqE;

    move-object/from16 v8, p5

    invoke-direct {v3, v0, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$rUYxqBlEfajXIHfHpxFS2nm3zqE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Landroid/content/Context;)V

    invoke-virtual {v2, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v2

    .line 379
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$s9nqm2QnkiODKyXb9yDLGKrLGio;

    move-object/from16 p1, v3

    move-object/from16 p2, p11

    move-object/from16 p3, p12

    move-object/from16 p4, p13

    move-object/from16 p5, p14

    move-object/from16 p6, p0

    invoke-direct/range {p1 .. p6}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$s9nqm2QnkiODKyXb9yDLGKrLGio;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    invoke-virtual {v2, v3}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v2

    .line 396
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$Zw89B2HAxaehWfI0BOBto8QIwH0;

    invoke-direct {v3, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$Zw89B2HAxaehWfI0BOBto8QIwH0;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    invoke-virtual {v2, v3}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v2

    .line 399
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$FV7mFmT0bVrPfc0mQJAnLUC3iS8;

    invoke-direct {v3, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$FV7mFmT0bVrPfc0mQJAnLUC3iS8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    invoke-virtual {v2, v3}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v2

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$oTR78w6hewRP5tlWvK-fBsAizYE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$oTR78w6hewRP5tlWvK-fBsAizYE;

    .line 402
    invoke-virtual {v2, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v2

    .line 403
    invoke-virtual {v2}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object v2

    .line 404
    invoke-virtual {v2}, Lio/reactivex/Observable;->repeat()Lio/reactivex/Observable;

    move-result-object v2

    .line 405
    invoke-virtual {v2}, Lio/reactivex/Observable;->publish()Lio/reactivex/observables/ConnectableObservable;

    move-result-object v2

    const-string v3, "syncLogsObservable\n                .map { it.second }\n                .flatMap { logs ->\n                    lastPeriods\n                            .map {\n                                Pair(logs, it)\n                            }\n                            .toObservable()\n                }\n                .map {\n                    //                    debug(\"Sync data for formatting arrived: $it\")\n                    Log.d(TAG, \"Sync data for formatting arrived: $it\")\n                    val logs = it.first\n                    val periods = it.second\n\n                    val userData = userDataSubject.value\n                    if (userData == null) {\n                        wtfError(\"User data null!!!\")\n                    }\n\n                    val walkingHours =\n                            WalkingHourPeriodFormatterImpl(logs.walkingLogs, periods.walkingHour).format()\n                    val restingHours =\n                            RestingHourPeriodFormatterImpl(logs.restingLogs, periods.restingHour).format()\n\n                    val sleepFiveMins = SleepFiveMinsPeriodFormatterImpl(logs.sleepLogs, periods.sleepHour?.sleepFiveMins?.maxByOrNull { it.startTime }, sleepTimeCloudStorage.getSleepTime()).format()\n                    val sleepHours =\n                            SleepHourPeriodFormatterImpl(sleepFiveMins, sleepTimeCloudStorage.getSleepTime()).format()\n                    val activitySessions =\n                            RunningSessionActivityFormatter(logs.activitySessions, userData!!.userInfoData.email, context).format()\n\n                    HoursContainer(walkingHours, restingHours, sleepHours, activitySessions)\n                }\n                .flatMapSingle {\n                    Completable.mergeArray(\n                            walkingHourPeriodRepository.save(it.walkingHourPeriods),\n                            restingHourPeriodRepository.save(it.restingHourPeriods),\n                            sleepHourPeriodRepository.save(it.sleepHourPeriods),\n                            userActivitySessionRepository.save(it.userActivitySessions, toCacheOnly = true),\n                            userActivitySessionRepository.saveActivityDates(it.userActivitySessions.map { session -> UserActivityDate(session.startTime) })\n                    ).toSingleDefault(it)\n                            .doOnSuccess {\n                                cloudSynchronizer.syncData()\n                                metricsRepository.logEvent(LogEvent(DeviceEventType.SyncEnd, DeviceEventStatus.SUCCESS))\n                            }.doOnEvent { _, _ ->\n                                val stravaAuth = stravaController.hasAuthorize()\n                                val googleFitAuth = googleFitController.hasPermissions()\n                                bugfenderConfig.setStravaAndFitStatus(stravaAuth, googleFitAuth)\n                            }\n                }\n                .doOnNext {\n                    debug(\"Data successfully formatted: $it\")\n                }\n                .doOnError {\n                    error(\"Error occurred while formatting sync data. Error is: \", it)\n                }\n                .map { SyncEvent.SyncFinishedEvent }\n                .retry()\n                .repeat()\n                .publish()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lio/reactivex/Observable;

    .line 346
    iput-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->formattedLogsObservable:Lio/reactivex/Observable;

    .line 408
    check-cast v2, Lio/reactivex/observables/ConnectableObservable;

    invoke-virtual {v2}, Lio/reactivex/observables/ConnectableObservable;->connect()Lio/reactivex/disposables/Disposable;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 411
    invoke-direct {v0, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->createStartGPS(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)Lio/reactivex/Observable;

    move-result-object v2

    .line 412
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$n9XAqaSyE1Qn1resTMZ-6AUMg2o;

    invoke-direct {v3, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$n9XAqaSyE1Qn1resTMZ-6AUMg2o;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    .line 414
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$NOooeP9uVEEG4m1I-oCj4dwVTtQ;

    invoke-direct {v4, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$NOooeP9uVEEG4m1I-oCj4dwVTtQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    .line 412
    invoke-virtual {v2, v3, v4}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v2

    .line 410
    invoke-virtual {v1, v2}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 29

    const/high16 v0, 0x4000000

    and-int v0, p28, v0

    if-eqz v0, :cond_0

    .line 144
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;

    move-object/from16 v3, p2

    move-object/from16 v15, p18

    move-object/from16 v14, p20

    invoke-direct {v0, v15, v14, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;)V

    move-object/from16 v28, v0

    goto :goto_0

    :cond_0
    move-object/from16 v3, p2

    move-object/from16 v15, p18

    move-object/from16 v14, p20

    move-object/from16 v28, p27

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    move-object/from16 v25, p24

    move-object/from16 v26, p25

    move-object/from16 v27, p26

    .line 118
    invoke-direct/range {v1 .. v28}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;)V

    return-void
.end method

.method private static final _init_$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goal"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAge()I

    move-result v3

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getHeight()I

    move-result v4

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getWeight()F

    move-result v5

    .line 167
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getGender()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getEmail()Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->sleepTimeStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;->getSleepTime()I

    move-result v7

    .line 166
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;-><init>(ZIIFLjava/lang/String;I)V

    .line 168
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSteps()I

    move-result v2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getDistance()F

    move-result v3

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getCalories()I

    move-result v4

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSleep()I

    move-result p2

    invoke-direct {v1, v2, v3, v4, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;-><init>(IFII)V

    .line 169
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getTimeFormatType()I

    move-result v2

    .line 170
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;->getFormat()I

    move-result v3

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getUnitType()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$METRIC;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$METRIC;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$METRIC;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    .line 169
    invoke-direct {p2, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;-><init>(ZZ)V

    .line 171
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getLanguage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;->getLanguageByKey(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLocale()Ljava/util/Locale;

    move-result-object p0

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;-><init>(Ljava/util/Locale;)V

    .line 166
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    invoke-direct {p0, p2, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;)V

    return-object p0
.end method

.method private static final _init_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->userDataSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda-19(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$bluetoothManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceCommunicationQueuer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    invoke-static {p3}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    .line 182
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$nf2lyFpWugfHLEdDS5Jcd9qnJ0c;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$nf2lyFpWugfHLEdDS5Jcd9qnJ0c;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    .line 187
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$5cJ5ldlidoEuAMaafgulJjM7BkE;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$5cJ5ldlidoEuAMaafgulJjM7BkE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$_i8s87Qz4UW5Gr9grpEqsKuVqEE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$_i8s87Qz4UW5Gr9grpEqsKuVqEE;

    .line 200
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 203
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$7-ODdbkmSSX3C1mB19aAqmY9a0s;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$7-ODdbkmSSX3C1mB19aAqmY9a0s;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 204
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$Q3cYywZ142SXTkKiji3mZIG199Y;

    invoke-direct {v0, p0, p3, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$Q3cYywZ142SXTkKiji3mZIG199Y;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->concatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$DmukQMSbCXQCXCkWuPh90tFvAx4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$DmukQMSbCXQCXCkWuPh90tFvAx4;

    .line 233
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->onErrorReturn(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 249
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$QmI6QR5Mdu6iRKpIjpg3aQbODgo;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$QmI6QR5Mdu6iRKpIjpg3aQbODgo;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnEach(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    .line 262
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$5GrqIWxvBDbgcw3rpmUbvgFEdzc;

    invoke-direct {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$5GrqIWxvBDbgcw3rpmUbvgFEdzc;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)V

    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$Ad9qZBUQxXuPXjb3EEnInIiTSuk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$Ad9qZBUQxXuPXjb3EEnInIiTSuk;

    .line 265
    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->takeUntil(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p0

    .line 267
    invoke-virtual {p0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final _init_$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v0, "Subscription for userData died!!!"

    invoke-static {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->wtfError(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final _init_$lambda-20(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Lkotlin/Triple;
    .locals 3

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 278
    new-instance v0, Lkotlin/Triple;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getProgress()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getThrowable()Ljava/lang/Throwable;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final _init_$lambda-21(Lkotlin/Triple;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    invoke-virtual {p0}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final _init_$lambda-22(Lkotlin/Triple;)Lkotlin/Pair;
    .locals 18

    const-string v0, "it"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 282
    invoke-virtual/range {p0 .. p0}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 283
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchEntryToWalkingFormatter;

    invoke-direct {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchEntryToWalkingFormatter;-><init>()V

    .line 285
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivitySummary()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;

    move-result-object v4

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogInterval()J

    move-result-wide v5

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v7

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->getPid()I

    move-result v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x4

    if-ne v7, v10, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    invoke-virtual/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchEntryToWalkingFormatter;->format(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;JZ)Ljava/util/List;

    move-result-object v2

    .line 286
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchEntryToRestingFormatter;

    invoke-direct {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchEntryToRestingFormatter;-><init>()V

    .line 288
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivitySummary()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;

    move-result-object v13

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogInterval()J

    move-result-wide v14

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->getPid()I

    move-result v3

    if-ne v3, v10, :cond_1

    const/16 v16, 0x1

    goto :goto_1

    :cond_1
    const/16 v16, 0x0

    :goto_1
    invoke-virtual/range {v11 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchEntryToRestingFormatter;->format(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;JZ)Ljava/util/List;

    move-result-object v3

    .line 289
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchEntryToSleepFormatter;

    invoke-direct {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchEntryToSleepFormatter;-><init>()V

    .line 291
    invoke-virtual/range {p0 .. p0}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    const/4 v5, 0x0

    if-nez v4, :cond_2

    move-object v4, v5

    goto :goto_2

    :cond_2
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v4

    :goto_2
    if-nez v4, :cond_3

    .line 292
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/List;

    :cond_3
    move-object v12, v4

    invoke-virtual/range {p0 .. p0}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivitySummary()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;

    move-result-object v5

    :goto_3
    if-nez v5, :cond_5

    const-wide/16 v4, 0x0

    goto :goto_4

    :cond_5
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;->getLastLogTime()J

    move-result-wide v4

    :goto_4
    move-wide v13, v4

    .line 293
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogInterval()J

    move-result-wide v15

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->getPid()I

    move-result v1

    if-ne v1, v10, :cond_6

    const/16 v17, 0x1

    goto :goto_5

    :cond_6
    const/16 v17, 0x0

    .line 291
    :goto_5
    invoke-virtual/range {v11 .. v17}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchEntryToSleepFormatter;->format(Ljava/util/List;JJZ)Ljava/util/List;

    move-result-object v1

    .line 294
    new-instance v4, Lkotlin/Pair;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v5

    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;

    .line 298
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getRunningLogs()Ljava/util/List;

    move-result-object v0

    .line 294
    invoke-direct {v6, v2, v3, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    invoke-direct {v4, v5, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v4
.end method

.method private static final _init_$lambda-23(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lkotlin/Pair;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 307
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string v0, "Starting data save: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda-27(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lkotlin/Pair;)Lio/reactivex/CompletableSource;
    .locals 5

    const-string v0, "$walkingLogRepository"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$restingLogRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$sleepLogRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    new-array v0, v0, [Lio/reactivex/CompletableSource;

    .line 310
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;

    invoke-virtual {p4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;->getWalkingLogs()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {p0, v1, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository$DefaultImpls;->save$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;Ljava/util/List;ZILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p0

    .line 311
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$X1ukgTp4HuSZdpCDQo7zc7sJiH8;

    invoke-direct {v1, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$X1ukgTp4HuSZdpCDQo7zc7sJiH8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    invoke-virtual {p0, v1}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    aput-object p0, v0, v2

    .line 314
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;

    invoke-virtual {p4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;->getRestingLogs()Ljava/util/List;

    move-result-object p0

    invoke-static {p1, p0, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository$DefaultImpls;->save$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;Ljava/util/List;ZILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p0

    .line 315
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$htgj1VZKfotE1A06l3Sxb_CZPEc;

    invoke-direct {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$htgj1VZKfotE1A06l3Sxb_CZPEc;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    const/4 p1, 0x1

    aput-object p0, v0, p1

    .line 318
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;

    invoke-virtual {p4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;->getSleepLogs()Ljava/util/List;

    move-result-object p0

    invoke-static {p2, p0, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository$DefaultImpls;->save$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;Ljava/util/List;ZILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p0

    .line 319
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$x0w-YlV2tLDoUXEhS2YFVF7QGMo;

    invoke-direct {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$x0w-YlV2tLDoUXEhS2YFVF7QGMo;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    aput-object p0, v0, v3

    .line 309
    invoke-static {v0}, Lio/reactivex/Completable;->mergeArray([Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final _init_$lambda-28()V
    .locals 0

    return-void
.end method

.method private static final _init_$lambda-29(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final _init_$lambda-30(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;Lio/reactivex/SingleEmitter;)V
    .locals 1

    const-string v0, "$walkingHourPeriodRepository"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$restingHourPeriodRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$sleepHourPeriodRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 330
    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;->getLastPeriod()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    .line 331
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;->getLastPeriod()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;

    .line 332
    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;->getLastPeriod()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;

    .line 335
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LastPeriodsContainer;

    invoke-direct {v0, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LastPeriodsContainer;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;)V

    .line 334
    invoke-interface {p3, v0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda-31(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 347
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;

    return-object p0
.end method

.method private static final _init_$lambda-33(Lio/reactivex/Single;Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "$lastPeriods"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 350
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$QeD6jGALJE7dC1yqwIhWsIXJSNs;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$QeD6jGALJE7dC1yqwIhWsIXJSNs;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;)V

    invoke-virtual {p0, v0}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    .line 353
    invoke-virtual {p0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final _init_$lambda-35(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Landroid/content/Context;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 357
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->TAG:Ljava/lang/String;

    const-string v1, "Sync data for formatting arrived: "

    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 358
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "it.first"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;

    .line 359
    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p2

    const-string v1, "it.second"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LastPeriodsContainer;

    .line 361
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->userDataSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v1}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 363
    move-object v3, p0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const/4 v4, 0x2

    const-string v5, "User data null!!!"

    invoke-static {v3, v5, v2, v4, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->wtfError$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 367
    :cond_0
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingHourPeriodFormatterImpl;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;->getWalkingLogs()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LastPeriodsContainer;->getWalkingHour()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingHourPeriodFormatterImpl;-><init>(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;)V

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingHourPeriodFormatterImpl;->format()Ljava/util/List;

    move-result-object v3

    .line 369
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingHourPeriodFormatterImpl;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;->getRestingLogs()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LastPeriodsContainer;->getRestingHour()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingHourPeriodFormatterImpl;-><init>(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;)V

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingHourPeriodFormatterImpl;->format()Ljava/util/List;

    move-result-object v4

    .line 371
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;->getSleepLogs()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LastPeriodsContainer;->getSleepHour()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;

    move-result-object p2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getSleepFiveMins()Ljava/util/List;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    check-cast p2, Ljava/lang/Iterable;

    .line 474
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 475
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_0

    .line 476
    :cond_3
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 477
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_0

    .line 478
    :cond_4
    move-object v6, v2

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    .line 371
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getStartTime()J

    move-result-wide v6

    .line 480
    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 481
    move-object v9, v8

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    .line 371
    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getStartTime()J

    move-result-wide v9

    cmp-long v11, v6, v9

    if-gez v11, :cond_6

    move-object v2, v8

    move-wide v6, v9

    .line 486
    :cond_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_5

    .line 487
    :goto_0
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    .line 371
    :goto_1
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->sleepTimeCloudStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;->getSleepTime()I

    move-result p2

    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;

    invoke-direct {v6, v5, v2, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;-><init>(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;I)V

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;->format()Ljava/util/List;

    move-result-object p2

    .line 373
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepHourPeriodFormatterImpl;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->sleepTimeCloudStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;->getSleepTime()I

    move-result p0

    invoke-direct {v2, p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepHourPeriodFormatterImpl;-><init>(Ljava/util/List;I)V

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepHourPeriodFormatterImpl;->format()Ljava/util/List;

    move-result-object p0

    .line 375
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/RunningSessionActivityFormatter;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;->getActivitySessions()Ljava/util/List;

    move-result-object v0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getUserInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/RunningSessionActivityFormatter;-><init>(Ljava/util/List;Ljava/lang/String;Landroid/content/Context;)V

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/RunningSessionActivityFormatter;->format()Ljava/util/List;

    move-result-object p1

    .line 377
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;

    invoke-direct {p2, v3, v4, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object p2
.end method

.method private static final _init_$lambda-39(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;)Lio/reactivex/SingleSource;
    .locals 5

    const-string v0, "$walkingHourPeriodRepository"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$restingHourPeriodRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$sleepHourPeriodRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$userActivitySessionRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x5

    new-array v0, v0, [Lio/reactivex/CompletableSource;

    .line 381
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;

    invoke-virtual {p5}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;->getWalkingHourPeriods()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {p0, v1, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository$DefaultImpls;->save$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;Ljava/util/List;ZILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    aput-object p0, v0, v2

    .line 382
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;

    invoke-virtual {p5}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;->getRestingHourPeriods()Ljava/util/List;

    move-result-object p0

    invoke-static {p1, p0, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository$DefaultImpls;->save$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;Ljava/util/List;ZILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    const/4 p1, 0x1

    aput-object p0, v0, p1

    .line 383
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;

    invoke-virtual {p5}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;->getSleepHourPeriods()Ljava/util/List;

    move-result-object p0

    invoke-static {p2, p0, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository$DefaultImpls;->save$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;Ljava/util/List;ZILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    aput-object p0, v0, v3

    .line 384
    invoke-virtual {p5}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;->getUserActivitySessions()Ljava/util/List;

    move-result-object p0

    invoke-interface {p3, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;->save(Ljava/util/List;Z)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    const/4 p1, 0x3

    aput-object p0, v0, p1

    .line 385
    invoke-virtual {p5}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;->getUserActivitySessions()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 488
    new-instance p1, Ljava/util/ArrayList;

    const/16 p2, 0xa

    invoke-static {p0, p2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p1, Ljava/util/Collection;

    .line 489
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    .line 490
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    .line 385
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getStartTime()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;-><init>(J)V

    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 491
    :cond_0
    check-cast p1, Ljava/util/List;

    .line 385
    invoke-interface {p3, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;->saveActivityDates(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    const/4 p1, 0x4

    aput-object p0, v0, p1

    .line 380
    invoke-static {v0}, Lio/reactivex/Completable;->mergeArray([Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p0

    .line 386
    invoke-virtual {p0, p5}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    .line 387
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$JIoMXQuK-ElwJJMp6EE8l6TQvCU;

    invoke-direct {p1, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$JIoMXQuK-ElwJJMp6EE8l6TQvCU;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    invoke-virtual {p0, p1}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p0

    .line 390
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$HLrvzlbdHzMg2xtbOg_3UnX08rw;

    invoke-direct {p1, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$HLrvzlbdHzMg2xtbOg_3UnX08rw;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    invoke-virtual {p0, p1}, Lio/reactivex/Single;->doOnEvent(Lio/reactivex/functions/BiConsumer;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final _init_$lambda-40(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 397
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v0, "Data successfully formatted: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda-41(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 400
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "Error occurred while formatting sync data. Error is: "

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda-42(Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 402
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;

    return-object p0
.end method

.method private static final _init_$lambda-43(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 413
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->processBehaviorSubject:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda-44(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 415
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "ERROR!!!"

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private final createStartGPS(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;",
            ">;"
        }
    .end annotation

    .line 449
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->syncObservable:Lio/reactivex/Observable;

    .line 450
    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$GS6Da3K9m5H8EvztxJhddxbRevM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$GS6Da3K9m5H8EvztxJhddxbRevM;

    .line 451
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    .line 457
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$U2wv3ZAociQKdl3eU-dccnfrc0c;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$U2wv3ZAociQKdl3eU-dccnfrc0c;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    .line 458
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$KF5qbXkvaGwOYe2F8G18mtOdHbo;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$KF5qbXkvaGwOYe2F8G18mtOdHbo;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 461
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$S90vR4N3Ttd0OP_1bchaG0BCTNk;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$S90vR4N3Ttd0OP_1bchaG0BCTNk;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    .line 462
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$SMAHWC45EBt1a97JEGh_o12G3YI;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$SMAHWC45EBt1a97JEGh_o12G3YI;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "syncObservable\n                .distinctUntilChanged()\n                .filter { internalResult ->\n                    !internalResult.syncConfig.isFromOTA &&\n                            (internalResult.dataInfo != null ||\n                                    (internalResult.throwable != null\n                                            && (internalResult.throwable !is SyncError.DeviceNotConnected && internalResult.throwable !is SyncError.WatchBusy)))\n                }\n                .doOnNext { debug(\"AGPS_Command\") }\n                .flatMap { syncResult ->\n                    postSyncDataTransferCoordinator.isAGPSUpdateNeeded(deviceCommunicationQueuer, syncResult)\n                }\n                .doOnNext { syncInProgress = true }\n                .switchMap {internalResult ->\n                    postSyncDataTransferCoordinator.runMainProcess(internalResult, deviceCommunicationQueuer)\n                            .doOnTerminate { syncInProgress = false }\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final createStartGPS$lambda-46(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Z
    .locals 1

    const-string v0, "internalResult"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 452
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getSyncConfig()Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isFromOTA()Z

    move-result v0

    if-nez v0, :cond_1

    .line 453
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v0

    if-nez v0, :cond_0

    .line 454
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getThrowable()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 455
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getThrowable()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$DeviceNotConnected;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getThrowable()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$WatchBusy;

    if-nez p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final createStartGPS$lambda-47(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 457
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "AGPS_Command"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final createStartGPS$lambda-48(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceCommunicationQueuer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 459
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->postSyncDataTransferCoordinator:Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->isAGPSUpdateNeeded(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final createStartGPS$lambda-49(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 461
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->setSyncInProgress(Z)V

    return-void
.end method

.method private static final createStartGPS$lambda-51(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceCommunicationQueuer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internalResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 463
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->postSyncDataTransferCoordinator:Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;

    invoke-virtual {v0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->runMainProcess(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 464
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$INPJ518nTxhLDGdqHMM5P65wA98;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$INPJ518nTxhLDGdqHMM5P65wA98;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnTerminate(Lio/reactivex/functions/Action;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final createStartGPS$lambda-51$lambda-50(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 464
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->setSyncInProgress(Z)V

    return-void
.end method

.method private final decodeSyncError(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;)Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;
    .locals 1

    .line 424
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$DeviceNotConnected;

    if-eqz v0, :cond_0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DEVICE_DISCONNECTED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DEVICE_DISCONNECTED;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    goto/16 :goto_0

    .line 425
    :cond_0
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$ActivityInProgress;

    if-eqz v0, :cond_1

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$ACTIVITY_IN_PROGRESS;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$ACTIVITY_IN_PROGRESS;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    goto/16 :goto_0

    .line 426
    :cond_1
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$WatchBusy;

    if-eqz v0, :cond_2

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$WATCH_BUSY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$WATCH_BUSY;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    goto/16 :goto_0

    .line 428
    :cond_2
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;

    if-eqz v0, :cond_9

    .line 429
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;->getCode()I

    move-result p1

    .line 430
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityStartLogSizeMismatch;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityStartLogSizeMismatch;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityStartLogSizeMismatch;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_3

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$START_ACTIVITY_LOG_SIZE_MISMATCH;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$START_ACTIVITY_LOG_SIZE_MISMATCH;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    goto :goto_0

    .line 431
    :cond_3
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityDeltaLogSizeMismatch;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityDeltaLogSizeMismatch;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityDeltaLogSizeMismatch;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_4

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DELTA_ACTIVITY_LOG_SIZE_MISMATCH;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DELTA_ACTIVITY_LOG_SIZE_MISMATCH;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    goto :goto_0

    .line 432
    :cond_4
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityEndLogSizeMismatch;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityEndLogSizeMismatch;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityEndLogSizeMismatch;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_5

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$END_ACTIVITY_LOG_SIZE_MISMATCH;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$END_ACTIVITY_LOG_SIZE_MISMATCH;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    goto :goto_0

    .line 433
    :cond_5
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogSizeMismatch;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogSizeMismatch;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogSizeMismatch;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_6

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$BACKGROUND_LOG_SIZE_MISMATCH;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$BACKGROUND_LOG_SIZE_MISMATCH;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    goto :goto_0

    .line 434
    :cond_6
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$InvalidBackLogTimestampIndex;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$InvalidBackLogTimestampIndex;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$InvalidBackLogTimestampIndex;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_7

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$INVALID_RTL_INDEX;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$INVALID_RTL_INDEX;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    goto :goto_0

    .line 435
    :cond_7
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogEntryWithUnknownType;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogEntryWithUnknownType;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogEntryWithUnknownType;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_8

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$BACKGROUND_LOG_UNKNOWN_TYPE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$BACKGROUND_LOG_UNKNOWN_TYPE;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    goto :goto_0

    .line 436
    :cond_8
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$UNKNOWN;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$UNKNOWN;-><init>()V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    goto :goto_0

    .line 439
    :cond_9
    instance-of p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncTimeoutError;

    if-eqz p1, :cond_a

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$COMMUNICATION_TIMEOUT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$COMMUNICATION_TIMEOUT;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    goto :goto_0

    .line 440
    :cond_a
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$UNKNOWN;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$UNKNOWN;-><init>()V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    :goto_0
    return-object p1
.end method

.method private static final gpsTransferOutput$lambda-52(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;
    .locals 4

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 469
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getProgress()I

    move-result v1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getThrowable()Ljava/lang/Throwable;

    move-result-object v3

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getSyncConfig()Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isGPSUpdateNeeded()Z

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;-><init>(ILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/lang/Throwable;Z)V

    return-object v0
.end method

.method public static synthetic lambda$-5INMbW2qWi4zgj-zYBGXkRsdEo(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-29(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$1XXxyNxQqiOtraOJqPYBFaUiLf4(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->gpsTransferOutput$lambda-52(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$2Nu8qM4GDvfv_1v-9Ebw2ynfVUE(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Lkotlin/Triple;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->syncOutput$lambda-45(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Lkotlin/Triple;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$4WXGpBWSWWC28WY9kHZQLDkc4GA(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-19(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$4XAGdCiHV6nElandwOLnAtUl8wU(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lkotlin/Pair;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-27(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lkotlin/Pair;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$5GrqIWxvBDbgcw3rpmUbvgFEdzc(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lkotlin/Triple;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-19$lambda-17(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lkotlin/Triple;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$5cJ5ldlidoEuAMaafgulJjM7BkE(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-19$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$5uMAb11JOeDncmDQxHl152dLUbg(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)V

    return-void
.end method

.method public static synthetic lambda$7-ODdbkmSSX3C1mB19aAqmY9a0s(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-19$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$Ad9qZBUQxXuPXjb3EEnInIiTSuk(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-19$lambda-18(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$BxdvBZ3KqOgdu8Lj4hWvDyN9_GY(Lkotlin/Triple;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-21(Lkotlin/Triple;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$DmukQMSbCXQCXCkWuPh90tFvAx4(Ljava/lang/Throwable;)Lkotlin/Triple;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-19$lambda-15(Ljava/lang/Throwable;)Lkotlin/Triple;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$FV7mFmT0bVrPfc0mQJAnLUC3iS8(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-41(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$G6Qd0t1Lb9t179GEFbT3JNzUVB4(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-23(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$GS6Da3K9m5H8EvztxJhddxbRevM(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->createStartGPS$lambda-46(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$HLrvzlbdHzMg2xtbOg_3UnX08rw(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-39$lambda-38(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$INPJ518nTxhLDGdqHMM5P65wA98(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->createStartGPS$lambda-51$lambda-50(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    return-void
.end method

.method public static synthetic lambda$JIoMXQuK-ElwJJMp6EE8l6TQvCU(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-39$lambda-37(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;)V

    return-void
.end method

.method public static synthetic lambda$KF5qbXkvaGwOYe2F8G18mtOdHbo(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->createStartGPS$lambda-48(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$NOooeP9uVEEG4m1I-oCj4dwVTtQ(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-44(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$NUxHI0VOCEHFPWgeJKC9PoEYZO0(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-19$lambda-7$lambda-6$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$OQcOqotUuNTxXyd01jRtMu95pns()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-28()V

    return-void
.end method

.method public static synthetic lambda$Q3cYywZ142SXTkKiji3mZIG199Y(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-19$lambda-14(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$QeD6jGALJE7dC1yqwIhWsIXJSNs(Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/LastPeriodsContainer;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-33$lambda-32(Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/LastPeriodsContainer;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$QmI6QR5Mdu6iRKpIjpg3aQbODgo(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lio/reactivex/Notification;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-19$lambda-16(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lio/reactivex/Notification;)V

    return-void
.end method

.method public static synthetic lambda$RYPP5E_hlDxzVysinLTljIh5O4I(Lio/reactivex/Single;Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-33(Lio/reactivex/Single;Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$S90vR4N3Ttd0OP_1bchaG0BCTNk(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->createStartGPS$lambda-49(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)V

    return-void
.end method

.method public static synthetic lambda$SMAHWC45EBt1a97JEGh_o12G3YI(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->createStartGPS$lambda-51(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$TuHepmMrG7wRBhC0DTCMtkAZAmM(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-19$lambda-7$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$U2wv3ZAociQKdl3eU-dccnfrc0c(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->createStartGPS$lambda-47(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)V

    return-void
.end method

.method public static synthetic lambda$WlAKr9bipwD4Na5QQ0IMXfiT-gU(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$WmbRH64PbPcWHsuxjNSOR8FgePg(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-31(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$X1ukgTp4HuSZdpCDQo7zc7sJiH8(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-27$lambda-24(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    return-void
.end method

.method public static synthetic lambda$ZsNij2fw25sDQKFEGFXANWznse4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-30(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$Zw89B2HAxaehWfI0BOBto8QIwH0(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-40(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;)V

    return-void
.end method

.method public static synthetic lambda$_i8s87Qz4UW5Gr9grpEqsKuVqEE(Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-19$lambda-8(Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$aD1mzkrUK6IEMNxgPvQC9a37GEw(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-19$lambda-7$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$d5g5XPSq7aPTLiFabPK39VRI1Ac(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$d7OfK7fN8JWoez0iqgR7zYF9x7o(Lkotlin/Triple;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-22(Lkotlin/Triple;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$dvNTwHDzLjF7ucsoY1y0KrGE2JM(Lkotlin/Triple;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-19$lambda-14$lambda-12(Lkotlin/Triple;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$htgj1VZKfotE1A06l3Sxb_CZPEc(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-27$lambda-25(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    return-void
.end method

.method public static synthetic lambda$isocrRS6vdIfDst6ziBvr9V6fTE(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-19$lambda-14$lambda-13(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$k88V2xofCdcHCBsIMbSiyFGZnnI(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Lkotlin/Triple;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-20(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Lkotlin/Triple;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$n9XAqaSyE1Qn1resTMZ-6AUMg2o(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-43(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;)V

    return-void
.end method

.method public static synthetic lambda$nf2lyFpWugfHLEdDS5Jcd9qnJ0c(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-19$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)V

    return-void
.end method

.method public static synthetic lambda$oTR78w6hewRP5tlWvK-fBsAizYE(Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-42(Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$rUYxqBlEfajXIHfHpxFS2nm3zqE(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Landroid/content/Context;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-35(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Landroid/content/Context;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$s9nqm2QnkiODKyXb9yDLGKrLGio(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static/range {p0 .. p5}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-39(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$sJiYYz9vY8s24Z2ukQQnbwBMAxg(Lkotlin/Pair;)Lkotlin/Triple;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-19$lambda-14$lambda-11(Lkotlin/Pair;)Lkotlin/Triple;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$x0w-YlV2tLDoUXEhS2YFVF7QGMo(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda-27$lambda-26(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    return-void
.end method

.method private static final lambda-19$lambda-14(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "this$0"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "$config"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "$deviceCommunicationQueuer"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "it"

    move-object/from16 v4, p3

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    invoke-virtual/range {p3 .. p3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "it.second"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    .line 207
    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->userDataSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v4}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    const/4 v5, 0x0

    if-nez v4, :cond_0

    move-object v10, v5

    goto :goto_0

    .line 208
    :cond_0
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getUserInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    move-result-object v6

    iget-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->sleepTimeStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;->getSleepTime()I

    move-result v7

    invoke-virtual {v6, v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;->setSleepTimeSelection(I)V

    move-object v10, v4

    .line 210
    :goto_0
    invoke-virtual {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->setDeviceInfo(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    if-nez v10, :cond_1

    .line 212
    move-object v4, v0

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const/4 v6, 0x2

    const-string v7, "User data value is null!!!"

    invoke-static {v4, v7, v5, v6, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->wtfError$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 214
    :cond_1
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    .line 216
    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ExecutorsFactory;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ExecutorsFactory$Companion;

    iget-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    iget-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    iget-object v8, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->locationInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;

    invoke-virtual {v5, v3, v6, v7, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ExecutorsFactory$Companion;->createSyncExecutor(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    move-result-object v8

    .line 217
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v9

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v11, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x0

    invoke-static/range {v8 .. v13}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->transferDataWithProgress$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v3

    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$sJiYYz9vY8s24Z2ukQQnbwBMAxg;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$sJiYYz9vY8s24Z2ukQQnbwBMAxg;

    .line 218
    invoke-virtual {v3, v5}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v3

    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$dvNTwHDzLjF7ucsoY1y0KrGE2JM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$dvNTwHDzLjF7ucsoY1y0KrGE2JM;

    .line 221
    invoke-virtual {v3, v5}, Lio/reactivex/Observable;->takeUntil(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v3

    .line 222
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$isocrRS6vdIfDst6ziBvr9V6fTE;

    invoke-direct {v5, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$isocrRS6vdIfDst6ziBvr9V6fTE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V

    invoke-virtual {v3, v5}, Lio/reactivex/Observable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v12

    const-string v0, "ExecutorsFactory.createSyncExecutor(deviceInfo, communicator, logger, locationInfoProvider)\n                                                .transferDataWithProgress(deviceInfo.uid, userData!!)\n                                                .map {\n                                                    Triple<Int, DataInfo?, Throwable?>(it.first, it.second, null)\n                                                }\n                                                .takeUntil { it.second != null }\n                                                .onErrorResumeNext(Function {\n                                                    communicator.resubscribeCharacteristics(ProtocolType.GEN2_DTP)\n                                                            .andThen(Observable.error(it))\n                                                })"

    .line 217
    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v14, 0x0

    const/4 v15, 0x6

    const/16 v16, 0x0

    move-object v11, v4

    .line 214
    invoke-direct/range {v11 .. v16}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;-><init>(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 229
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->getPutInOperationQueue()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;->queue(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)Lio/reactivex/Observable;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->getOperationObs()Lio/reactivex/Observable;

    move-result-object v0

    :goto_1
    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method

.method private static final lambda-19$lambda-14$lambda-11(Lkotlin/Pair;)Lkotlin/Triple;
    .locals 3

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    new-instance v0, Lkotlin/Triple;

    invoke-virtual {p0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final lambda-19$lambda-14$lambda-12(Lkotlin/Triple;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    invoke-virtual {p0}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final lambda-19$lambda-14$lambda-13(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_DTP:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    invoke-interface {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->resubscribeCharacteristics(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Lio/reactivex/Completable;

    move-result-object p0

    .line 224
    invoke-static {p1}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    check-cast p1, Lio/reactivex/ObservableSource;

    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method private static final lambda-19$lambda-15(Ljava/lang/Throwable;)Lkotlin/Triple;
    .locals 3

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    instance-of v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$SyncLocked;

    if-eqz v0, :cond_0

    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$ActivityInProgress;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$ActivityInProgress;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;

    goto/16 :goto_0

    .line 236
    :cond_0
    instance-of v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$WatchBusy;

    if-eqz v0, :cond_1

    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$WatchBusy;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$WatchBusy;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;

    goto/16 :goto_0

    .line 237
    :cond_1
    instance-of v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$DeviceNotConnected;

    if-eqz v0, :cond_2

    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$DeviceNotConnected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$DeviceNotConnected;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;

    goto/16 :goto_0

    .line 238
    :cond_2
    instance-of v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityStartLogSizeMismatch;

    if-eqz v0, :cond_3

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityStartLogSizeMismatch;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityStartLogSizeMismatch;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityStartLogSizeMismatch;->getCode()I

    move-result v0

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;-><init>(I)V

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;

    goto :goto_0

    .line 239
    :cond_3
    instance-of v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityDeltaLogSizeMismatch;

    if-eqz v0, :cond_4

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityDeltaLogSizeMismatch;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityDeltaLogSizeMismatch;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityDeltaLogSizeMismatch;->getCode()I

    move-result v0

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;-><init>(I)V

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;

    goto :goto_0

    .line 240
    :cond_4
    instance-of v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityEndLogSizeMismatch;

    if-eqz v0, :cond_5

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityEndLogSizeMismatch;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityEndLogSizeMismatch;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityEndLogSizeMismatch;->getCode()I

    move-result v0

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;-><init>(I)V

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;

    goto :goto_0

    .line 241
    :cond_5
    instance-of v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogSizeMismatch;

    if-eqz v0, :cond_6

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogSizeMismatch;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogSizeMismatch;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogSizeMismatch;->getCode()I

    move-result v0

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;-><init>(I)V

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;

    goto :goto_0

    .line 242
    :cond_6
    instance-of v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$InvalidBackLogTimestampIndex;

    if-eqz v0, :cond_7

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$InvalidBackLogTimestampIndex;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$InvalidBackLogTimestampIndex;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$InvalidBackLogTimestampIndex;->getCode()I

    move-result v0

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;-><init>(I)V

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;

    goto :goto_0

    .line 243
    :cond_7
    instance-of v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogEntryWithUnknownType;

    if-eqz v0, :cond_8

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogEntryWithUnknownType;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogEntryWithUnknownType;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogEntryWithUnknownType;->getCode()I

    move-result v0

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;-><init>(I)V

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;

    goto :goto_0

    .line 244
    :cond_8
    instance-of p0, p0, Ljava/util/concurrent/TimeoutException;

    if-eqz p0, :cond_9

    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncTimeoutError;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncTimeoutError;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;

    goto :goto_0

    .line 245
    :cond_9
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$Unknown;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$Unknown;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;

    .line 247
    :goto_0
    new-instance v0, Lkotlin/Triple;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final lambda-19$lambda-16(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lio/reactivex/Notification;)V
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    invoke-virtual {p1}, Lio/reactivex/Notification;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Triple;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    .line 251
    :goto_0
    invoke-virtual {p1}, Lio/reactivex/Notification;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/Triple;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/Throwable;

    :goto_1
    if-nez v0, :cond_2

    if-eqz v1, :cond_3

    :cond_2
    const/4 p1, 0x0

    .line 254
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->setSyncInProgress(Z)V

    :cond_3
    if-eqz v1, :cond_4

    .line 256
    instance-of p1, v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;

    if-eqz p1, :cond_4

    .line 257
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;

    .line 258
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$SyncEnd;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$SyncEnd;

    move-object v3, v2

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;

    invoke-direct {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->decodeSyncError(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;)Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v0

    .line 257
    invoke-direct/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;->logEvent(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;)V

    :cond_4
    return-void
.end method

.method private static final lambda-19$lambda-17(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lkotlin/Triple;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;
    .locals 3

    const-string v0, "$config"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;

    invoke-virtual {p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-virtual {p1}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {v0, v1, p0, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;-><init>(ILpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method private static final lambda-19$lambda-18(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getThrowable()Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static final lambda-19$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)V
    .locals 6

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;

    .line 184
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$SyncStart;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$SyncStart;

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p1

    .line 183
    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;->logEvent(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;)V

    return-void
.end method

.method private static final lambda-19$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)Lio/reactivex/ObservableSource;
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$bluetoothManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;->connect(Z)Lio/reactivex/Observable;

    move-result-object p0

    .line 190
    invoke-virtual {p0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object p0

    .line 191
    invoke-virtual {p0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    const/4 v1, 0x2

    new-array v1, v1, [Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;->getChangeState([Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Lio/reactivex/Observable;

    move-result-object p1

    check-cast p1, Lio/reactivex/ObservableSource;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$TuHepmMrG7wRBhC0DTCMtkAZAmM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$TuHepmMrG7wRBhC0DTCMtkAZAmM;

    .line 188
    invoke-static {p0, p1, v0}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object p0

    .line 195
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$aD1mzkrUK6IEMNxgPvQC9a37GEw;

    invoke-direct {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$aD1mzkrUK6IEMNxgPvQC9a37GEw;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)V

    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final lambda-19$lambda-7$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Lkotlin/Pair;
    .locals 1

    const-string v0, "deviceInfo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final lambda-19$lambda-7$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "$syncConfig"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$DeviceNotConnected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$DeviceNotConnected;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    .line 197
    :goto_0
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$NUxHI0VOCEHFPWgeJKC9PoEYZO0;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$NUxHI0VOCEHFPWgeJKC9PoEYZO0;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final lambda-19$lambda-7$lambda-6$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$syncConfig"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final lambda-19$lambda-8(Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "syncConfigDeviceInfoPair"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$DeviceNotConnected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$DeviceNotConnected;

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    :goto_0
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final lambda-19$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lkotlin/Pair;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 203
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->setSyncInProgress(Z)V

    return-void
.end method

.method private static final lambda-27$lambda-24(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 312
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "Walking logs saved, time - "

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final lambda-27$lambda-25(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "Resting logs saved, time - "

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final lambda-27$lambda-26(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "Sleep logs saved, time - "

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final lambda-33$lambda-32(Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/LastPeriodsContainer;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$logs"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 351
    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final lambda-39$lambda-37(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;)V
    .locals 6

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 388
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->cloudSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;->syncData()V

    .line 389
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$SyncEnd;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$SyncEnd;

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$SUCCESS;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$SUCCESS;

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;->logEvent(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;)V

    return-void
.end method

.method private static final lambda-39$lambda-38(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 391
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->stravaController:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->hasAuthorize()Z

    move-result p1

    .line 392
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->googleFitController:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->hasPermissions()Z

    move-result p2

    .line 393
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->bugfenderConfig:Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;->setStravaAndFitStatus(ZZ)V

    return-void
.end method

.method private static final syncOutput$lambda-45(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Lkotlin/Triple;
    .locals 3

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 445
    new-instance v0, Lkotlin/Triple;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getProgress()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getThrowable()Ljava/lang/Throwable;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public formattedDataOutput()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;",
            ">;"
        }
    .end annotation

    .line 446
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->formattedLogsObservable:Lio/reactivex/Observable;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 118
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public getSyncInProgress()Z
    .locals 1

    .line 150
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->syncInProgress:Z

    return v0
.end method

.method public gpsTransferOutput()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;",
            ">;"
        }
    .end annotation

    .line 468
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->syncObservable:Lio/reactivex/Observable;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$1XXxyNxQqiOtraOJqPYBFaUiLf4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$1XXxyNxQqiOtraOJqPYBFaUiLf4;

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    .line 470
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->processBehaviorSubject:Lio/reactivex/subjects/PublishSubject;

    check-cast v1, Lio/reactivex/ObservableSource;

    .line 468
    invoke-static {v0, v1}, Lio/reactivex/Observable;->merge(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "merge(syncObservable.map {\n                SyncProcessResult.SyncProgress(it.progress, it.dataInfo, it.throwable, it.syncConfig.isGPSUpdateNeeded)\n            }, processBehaviorSubject)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public setSyncInProgress(Z)V
    .locals 0

    .line 150
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->syncInProgress:Z

    return-void
.end method

.method public startSync(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)V
    .locals 1

    const-string v0, "syncConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 444
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->triggerSubject:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public syncOutput()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Triple<",
            "Ljava/lang/Integer;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
            "Ljava/lang/Throwable;",
            ">;>;"
        }
    .end annotation

    .line 445
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->syncObservable:Lio/reactivex/Observable;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$2Nu8qM4GDvfv_1v-9Ebw2ynfVUE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$2Nu8qM4GDvfv_1v-9Ebw2ynfVUE;

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

# PATCHED (offline sync fix #2, layout v3): build the same default offline
# User the login patch uses, feed it through this class's own PairingConfig
# mapper (_init_$lambda-0) and seed userDataSubject so the sync pipeline
# never sees a null userData offline.
#
# Layout v3 notes (crash-round 5+6):
# - plain invoke-xxx (format35c) lists AT MOST 5 registers; 6+ REQUIRES the
#   /range form (format3Rc, contiguous regs, FIRST reg of the range = the
#   instance). The User ctor needs 13 regs -> /range unavoidable; the layout
#   is built around it: instance v1, params v2-v13 contiguous.
# - the v1 layout's /range ranges were shifted (String/Long-half as instance,
#   real new-instance regs excluded, <init> never ran) ->
#   "Expected initialization on uninitialized reference".
# - settings ctor (4 regs) stays plain; result is moved into the User
#   window's 12th param slot with move-object.
# - .locals 15 => this = v15, usable in plain 4-bit instrs (v16 would not
#   be; /from16 reg fields are also 4-bit). v15 is NEVER overwritten.
# Register map: v1=User instance; v2-v3 uid(J); v4 enabled(Z); v5-v7
# name/email/password(S); v8 age(I); v9 height(I); v10 weight(F); v11
# gender(S); v12 shouldSync(Z); v13 accountSettings(O); v14 scratch
# (GoalConfiguration); v15 this.
.method private offlineSeedUserData()V
    .locals 15

    # 1) UserAccountSettings(language, unitType, timeFormatType) first, in
    #    the plain-invoke window v10-v13 (instance v10, params v11-v13)
    const-string v11, "en_US"

    const-string v12, "metric"

    const/4 v13, 0x0

    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    invoke-direct {v10, v11, v12, v13}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    # settings object -> the User window's 12th param slot (v13, dead const)
    move-object v13, v10

    # 2) User(J uid, Z enabled, S name, S email, S password, I age, I height,
    #    F weight, S gender, Z shouldSync, O accountSettings): instance v1 +
    #    contiguous params v2-v13 = invoke-direct/range {v1 .. v13}
    const-wide/16 v2, 0x1       # uid=1L (v2-v3 wide)

    const/4 v4, 0x1             # enabled

    const-string v5, "Test"     # name

    const-string v6, "test@test.com"   # email

    const-string v7, "test1234"        # password

    const/16 v8, 0x19           # age 25

    const/16 v9, 0xb4           # height 180

    const v10, 0x42800000       # weight 80.0f (v10 dead after the move)

    const-string v11, "Male"    # gender

    const/4 v12, 0x0            # shouldSync
    # v13 = accountSettings (already placed above)

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-direct/range {v1 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;-><init>(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFLjava/lang/String;ZLpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;)V

    # 3) default goals (Kotlin no-arg ctor, all defaults)
    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    invoke-direct {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;-><init>()V

    # 4) this class's own mapper: _init_$lambda-0(this$0, user, goal) ->
    #    PairingConfig. this$0 = v15 = this (a real WatchSynchronizerImpl -
    #    the mapper reads languageController/sleepTimeStorage from it; both
    #    assigned in the ctor before the seed call)
    invoke-static {v15, v1, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->_init_$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    move-result-object v5

    # 5) seed the subject (same invoke form the class's own _init_$lambda-1 uses)
    iget-object v14, v15, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->userDataSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v14, v5}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method
