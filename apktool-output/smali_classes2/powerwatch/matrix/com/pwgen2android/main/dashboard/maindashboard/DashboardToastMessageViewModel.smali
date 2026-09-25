.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;
.super Ljava/lang/Object;
.source "DashboardToastMessageViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0006\u0010(\u001a\u00020)R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0015\u001a\u0010\u0012\u000c\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0010\u0012\u000c\u0012\n \u0018*\u0004\u0018\u00010#0#0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;",
        "",
        "bluetoothManager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "watchSynchronizer",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;",
        "updateInfoRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;",
        "otaProcessExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;",
        "appContext",
        "Landroid/content/Context;",
        "metricsRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V",
        "bluetoothActionText",
        "",
        "bluetoothDisabledText",
        "btPermissionMissing",
        "currentConfig",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;",
        "kotlin.jvm.PlatformType",
        "getCurrentConfig",
        "()Lio/reactivex/Observable;",
        "deviceNotConnectedText",
        "firmwareUpdateActionText",
        "fontUpdateFailed",
        "mandatoryUpdateText",
        "syncErrorText",
        "syncNotAllowedDuringActivityText",
        "syncResetEvent",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;",
        "syncTimeoutErrorText",
        "unknownError",
        "updateErrorText",
        "watchBusyText",
        "resetSyncErrorEvent",
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
.field private final bluetoothActionText:Ljava/lang/String;

.field private final bluetoothDisabledText:Ljava/lang/String;

.field private final btPermissionMissing:Ljava/lang/String;

.field private final currentConfig:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceNotConnectedText:Ljava/lang/String;

.field private final firmwareUpdateActionText:Ljava/lang/String;

.field private final fontUpdateFailed:Ljava/lang/String;

.field private final mandatoryUpdateText:Ljava/lang/String;

.field private final metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

.field private final syncErrorText:Ljava/lang/String;

.field private final syncNotAllowedDuringActivityText:Ljava/lang/String;

.field private final syncResetEvent:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;",
            ">;"
        }
    .end annotation
.end field

.field private final syncTimeoutErrorText:Ljava/lang/String;

.field private final unknownError:Ljava/lang/String;

.field private final updateErrorText:Ljava/lang/String;

.field private final watchBusyText:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    const-string v6, "bluetoothManager"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "deviceRepository"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "watchSynchronizer"

    move-object/from16 v7, p3

    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "updateInfoRepository"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "otaProcessExecutor"

    move-object/from16 v8, p5

    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "appContext"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "metricsRepository"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

    const v5, 0x7f0f0058

    .line 56
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "appContext.getString(R.string.bluetooth_disabled_message)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->bluetoothDisabledText:Ljava/lang/String;

    const v5, 0x7f0f010d

    .line 57
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "appContext.getString(R.string.mandatory_update_message)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->mandatoryUpdateText:Ljava/lang/String;

    const v5, 0x7f0f00bf

    .line 58
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "appContext.getString(R.string.enable_text)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->bluetoothActionText:Ljava/lang/String;

    const v5, 0x7f0f00fd

    .line 59
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "appContext.getString(R.string.install_update)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->firmwareUpdateActionText:Ljava/lang/String;

    const v5, 0x7f0f01ae

    .line 60
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "appContext.getString(R.string.sync_not_allowed_message)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->syncNotAllowedDuringActivityText:Ljava/lang/String;

    const v5, 0x7f0f01e4

    .line 61
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "appContext.getString(R.string.watch_busy_text)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->watchBusyText:Ljava/lang/String;

    const v5, 0x7f0f01a9

    .line 62
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "appContext.getString(R.string.syncError)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->syncErrorText:Ljava/lang/String;

    const v5, 0x7f0f01af

    .line 63
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "appContext.getString(R.string.sync_timeout)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->syncTimeoutErrorText:Ljava/lang/String;

    const v5, 0x7f0f015f

    .line 64
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "appContext.getString(R.string.performance_update_error)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->updateErrorText:Ljava/lang/String;

    const v5, 0x7f0f00a6

    .line 65
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "appContext.getString(R.string.device_communication_error)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->unknownError:Ljava/lang/String;

    const v5, 0x7f0f00d7

    .line 66
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "appContext.getString(R.string.font_update_failed)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->fontUpdateFailed:Ljava/lang/String;

    const v5, 0x7f0f00a7

    .line 68
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "appContext.getString(R.string.device_not_connected)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->deviceNotConnectedText:Ljava/lang/String;

    const v5, 0x7f0f00b8

    .line 69
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "appContext.getString(R.string.enable_bt_permission)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->btPermissionMissing:Ljava/lang/String;

    .line 71
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v5

    const-string v6, "create<SyncProcessResult>()"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->syncResetEvent:Lio/reactivex/subjects/PublishSubject;

    const/4 v6, 0x2

    new-array v9, v6, [Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    .line 76
    sget-object v10, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    const/4 v11, 0x0

    aput-object v10, v9, v11

    sget-object v10, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    const/4 v12, 0x1

    aput-object v10, v9, v12

    invoke-interface {v1, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;->getChangeState([Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Lio/reactivex/Observable;

    move-result-object v1

    check-cast v1, Lio/reactivex/ObservableSource;

    .line 78
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;

    const/4 v9, 0x0

    invoke-static {v2, v12, v11, v6, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository$DefaultImpls;->load$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;ZZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v2

    check-cast v2, Lio/reactivex/ObservableSource;

    .line 81
    invoke-interface/range {p3 .. p3}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;->gpsTransferOutput()Lio/reactivex/Observable;

    move-result-object v7

    .line 82
    sget-object v10, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v13, 0xc8

    invoke-virtual {v7, v13, v14, v10}, Lio/reactivex/Observable;->skip(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v7

    .line 84
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;

    const/4 v13, -0x1

    invoke-direct {v10, v13, v9, v9, v11}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;-><init>(ILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/lang/Throwable;Z)V

    invoke-virtual {v7, v10}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v7

    check-cast v7, Lio/reactivex/ObservableSource;

    check-cast v5, Lio/reactivex/ObservableSource;

    .line 80
    invoke-static {v7, v5}, Lio/reactivex/Observable;->merge(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object v5

    check-cast v5, Lio/reactivex/ObservableSource;

    .line 86
    invoke-interface/range {p5 .. p5}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;->otaOutput()Lio/reactivex/Observable;

    move-result-object v7

    check-cast v7, Lio/reactivex/ObservableSource;

    .line 88
    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;

    invoke-static {v3, v12, v11, v6, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository$DefaultImpls;->load$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;ZZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v3

    .line 90
    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;

    const-wide/16 v14, -0x1

    const/16 v16, -0x1

    const-string v17, ""

    const-string v18, ""

    const-string v19, ""

    const-string v20, ""

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x100

    const/16 v25, 0x0

    move-object v13, v6

    invoke-direct/range {v13 .. v25}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;-><init>(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v6}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v3

    check-cast v3, Lio/reactivex/ObservableSource;

    .line 91
    invoke-static/range {p6 .. p6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->isBluetoothPermissionGranted(Landroid/content/Context;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v4

    check-cast v4, Lio/reactivex/ObservableSource;

    .line 93
    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$DashboardToastMessageViewModel$HnT7bhwgsvBvTYPH58Av1BiMoo8;

    invoke-direct {v6, v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$DashboardToastMessageViewModel$HnT7bhwgsvBvTYPH58Av1BiMoo8;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;)V

    move-object/from16 p1, v1

    move-object/from16 p2, v2

    move-object/from16 p3, v5

    move-object/from16 p4, v7

    move-object/from16 p5, v3

    move-object/from16 p6, v4

    move-object/from16 p7, v6

    .line 75
    invoke-static/range {p1 .. p7}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/Function6;)Lio/reactivex/Observable;

    move-result-object v1

    .line 142
    invoke-virtual {v1, v12}, Lio/reactivex/Observable;->replay(I)Lio/reactivex/observables/ConnectableObservable;

    move-result-object v1

    .line 143
    invoke-virtual {v1}, Lio/reactivex/observables/ConnectableObservable;->autoConnect()Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, "combineLatest(\n                    bluetoothManager.getChangeState(BluetoothState.Enabled, BluetoothState.Disabled),\n\n                    deviceRepository.load(true),\n\n                    Observable.merge(\n                            watchSynchronizer.gpsTransferOutput()\n                                    .skip(200, TimeUnit.MILLISECONDS)\n                                    // need to push dummy event, so combineLatest can be triggered\n                                    .startWith(SyncProcessResult.SyncProgress(-1, null, null, false)), syncResetEvent),\n\n                    otaProcessExecutor.otaOutput(),\n\n                    updateInfoRepository.load(true)\n                            // need to push initial value here, so combine latest could be triggered\n                            .startWith(UpdateInfo(-1, -1, \"\", \"\", \"\", \"\", mandatory = false, forced = false)),\n                    Observable.just(appContext.isBluetoothPermissionGranted()),\n\n                        Function6<BluetoothState, Device, SyncProcessResult, OTAStatus, UpdateInfo, Boolean, DashboardToastMessageConfig> { bluetoothState, device, syncWithAGpsEvent, otaStatus, updateInfo, btPermissionOn ->\n\n                        val syncEvent = syncWithAGpsEvent as? SyncProcessResult.SyncProgress\n                        val bluetoothDisabled = bluetoothState == BluetoothState.Disabled\n                        val criticalUpdateRequired = updateInfo.mandatory && updateInfo.isUpdateAvailable(device.firmwareVersion)\n                        val otaInProgress = !(otaStatus.phase == OtaProcessPhase.INITIAL || otaStatus.phase == OtaProcessPhase.COMPLETE || otaStatus.phase == OtaProcessPhase.ERROR)\n\n\n                        val aGpsTransferFailed = (syncWithAGpsEvent as? SyncProcessResult.AGPSProgress)?.error != null\n\n\n                        val syncNotAllowed = syncEvent?.error as? SyncError.ActivityInProgress != null\n                        val watchBusy = syncEvent?.error as? SyncError.WatchBusy != null\n                        val deviceNotConnected = syncEvent?.error as? SyncError.DeviceNotConnected != null\n\n                        val syncParsingError = (syncEvent?.error as? SyncError.SyncParsingError)\n                        val syncParsingErrorText = if (syncParsingError != null) String.format(syncErrorText, syncParsingError.code) else null\n\n                        val isTimeoutError = syncEvent?.error as? SyncError.SyncTimeoutError != null\n                        val unknownSyncError = syncEvent?.error as? SyncError.Unknown != null\n\n                        val criticalUpdateError = criticalUpdateRequired && !otaInProgress\n\n                        val fontUpdateEvent = syncWithAGpsEvent is SyncProcessResult.FontUpdateProgress\n                        val fontUpdateInProgress = fontUpdateEvent &&\n                                (syncWithAGpsEvent as SyncProcessResult.FontUpdateProgress).started &&\n                                !syncWithAGpsEvent.completed\n\n                        val fontUpdateError = syncWithAGpsEvent is SyncProcessResult.FontUpdateProgress\n                                && syncWithAGpsEvent.error != null\n\n                        when {\n                            deviceNotConnected -> return@Function6 DashboardToastMessageConfig(deviceNotConnectedText, \"\", updateInfo, device, DashboardToastType.DeviceNotConnected, durationSec = 3)\n                            syncNotAllowed -> return@Function6 DashboardToastMessageConfig(syncNotAllowedDuringActivityText, \"\", updateInfo, device, DashboardToastType.SyncNotAllowed, durationSec = 3)\n                            watchBusy -> return@Function6 DashboardToastMessageConfig(watchBusyText, \"\", updateInfo, device, DashboardToastType.SyncNotAllowed, durationSec = 3)\n                            criticalUpdateError -> return@Function6 DashboardToastMessageConfig(mandatoryUpdateText, firmwareUpdateActionText, updateInfo, device, DashboardToastType.CriticalUpdateRequired)\n                            bluetoothDisabled -> return@Function6 DashboardToastMessageConfig(bluetoothDisabledText, bluetoothActionText, updateInfo, device, DashboardToastType.BluetoothDisabled)\n                            otaInProgress -> return@Function6 DashboardToastMessageConfig(updateInfo = updateInfo, device = device, type = DashboardToastType.OTAInProgress)\n                            syncParsingErrorText != null -> return@Function6 DashboardToastMessageConfig(syncParsingErrorText, updateInfo = updateInfo, device = device, type = DashboardToastType.SyncParsingError, durationSec = 3)\n                            isTimeoutError -> return@Function6 DashboardToastMessageConfig(syncTimeoutErrorText, updateInfo = updateInfo, device = device, type = DashboardToastType.SyncTimeoutError, durationSec = 3)\n                            aGpsTransferFailed -> return@Function6 DashboardToastMessageConfig(updateErrorText, updateInfo = updateInfo, device = device, type = DashboardToastType.SyncTimeoutError, durationSec = 3)\n                            unknownSyncError -> return@Function6 DashboardToastMessageConfig(unknownError, updateInfo = updateInfo, device = device, type = DashboardToastType.UnknownSyncError, durationSec = 3)\n                            fontUpdateInProgress -> return@Function6 DashboardToastMessageConfig(updateInfo = updateInfo, device = device, type = DashboardToastType.FontUpdateInProgress)\n                            fontUpdateError -> return@Function6 DashboardToastMessageConfig(updateInfo = updateInfo, device = device, type = DashboardToastType.FontUpdateFailed, text = fontUpdateFailed, durationSec = 3)\n                            !btPermissionOn -> return@Function6  DashboardToastMessageConfig(btPermissionMissing, \"\", updateInfo, device, DashboardToastType.DeviceNotConnected, durationSec = 3)\n                            else -> DashboardToastMessageConfig(updateInfo = updateInfo, device = device, type = DashboardToastType.None)\n                        }\n                    }\n            )\n            .replay(1)\n            .autoConnect()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->currentConfig:Lio/reactivex/Observable;

    return-void
.end method

.method private static final currentConfig$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Ljava/lang/Boolean;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    const-string v4, "this$0"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "bluetoothState"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "device"

    move-object/from16 v5, p2

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "syncWithAGpsEvent"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "otaStatus"

    move-object/from16 v6, p4

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "updateInfo"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "btPermissionOn"

    move-object/from16 v7, p6

    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    instance-of v4, v2, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;

    if-eqz v4, :cond_0

    move-object v4, v2

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 96
    :goto_0
    sget-object v9, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;

    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    .line 97
    invoke-virtual/range {p5 .. p5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;->getMandatory()Z

    move-result v9

    const/4 v10, 0x1

    if-eqz v9, :cond_1

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;->isUpdateAvailable(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x1

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    .line 98
    :goto_1
    invoke-virtual/range {p4 .. p4}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object v12

    sget-object v13, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_2

    invoke-virtual/range {p4 .. p4}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object v12

    sget-object v13, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_2

    invoke-virtual/range {p4 .. p4}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object v6

    sget-object v12, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;

    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    const/4 v6, 0x1

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    .line 101
    :goto_2
    instance-of v12, v2, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;

    if-eqz v12, :cond_3

    move-object v12, v2

    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;

    goto :goto_3

    :cond_3
    const/4 v12, 0x0

    :goto_3
    if-nez v12, :cond_4

    const/4 v12, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;->getError()Ljava/lang/Throwable;

    move-result-object v12

    :goto_4
    if-eqz v12, :cond_5

    const/4 v12, 0x1

    goto :goto_5

    :cond_5
    const/4 v12, 0x0

    :goto_5
    if-nez v4, :cond_6

    const/4 v13, 0x0

    goto :goto_6

    .line 104
    :cond_6
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->getError()Ljava/lang/Throwable;

    move-result-object v13

    :goto_6
    instance-of v14, v13, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$ActivityInProgress;

    if-eqz v14, :cond_7

    check-cast v13, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$ActivityInProgress;

    goto :goto_7

    :cond_7
    const/4 v13, 0x0

    :goto_7
    if-eqz v13, :cond_8

    const/4 v13, 0x1

    goto :goto_8

    :cond_8
    const/4 v13, 0x0

    :goto_8
    if-nez v4, :cond_9

    const/4 v14, 0x0

    goto :goto_9

    .line 105
    :cond_9
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->getError()Ljava/lang/Throwable;

    move-result-object v14

    :goto_9
    instance-of v15, v14, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$WatchBusy;

    if-eqz v15, :cond_a

    check-cast v14, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$WatchBusy;

    goto :goto_a

    :cond_a
    const/4 v14, 0x0

    :goto_a
    if-eqz v14, :cond_b

    const/4 v14, 0x1

    goto :goto_b

    :cond_b
    const/4 v14, 0x0

    :goto_b
    if-nez v4, :cond_c

    const/4 v15, 0x0

    goto :goto_c

    .line 106
    :cond_c
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->getError()Ljava/lang/Throwable;

    move-result-object v15

    :goto_c
    instance-of v8, v15, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$DeviceNotConnected;

    if-eqz v8, :cond_d

    check-cast v15, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$DeviceNotConnected;

    goto :goto_d

    :cond_d
    const/4 v15, 0x0

    :goto_d
    if-eqz v15, :cond_e

    const/4 v8, 0x1

    goto :goto_e

    :cond_e
    const/4 v8, 0x0

    :goto_e
    if-nez v4, :cond_f

    const/4 v15, 0x0

    goto :goto_f

    .line 108
    :cond_f
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->getError()Ljava/lang/Throwable;

    move-result-object v15

    :goto_f
    instance-of v11, v15, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;

    if-eqz v11, :cond_10

    check-cast v15, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;

    goto :goto_10

    :cond_10
    const/4 v15, 0x0

    :goto_10
    if-eqz v15, :cond_11

    .line 109
    sget-object v11, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    iget-object v11, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->syncErrorText:Ljava/lang/String;

    new-array v3, v10, [Ljava/lang/Object;

    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;->getCode()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v17, 0x0

    aput-object v15, v3, v17

    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v11, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v11, "java.lang.String.format(format, *args)"

    invoke-static {v3, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_11

    :cond_11
    const/16 v17, 0x0

    const/4 v3, 0x0

    :goto_11
    if-nez v4, :cond_12

    const/4 v11, 0x0

    goto :goto_12

    .line 111
    :cond_12
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->getError()Ljava/lang/Throwable;

    move-result-object v11

    :goto_12
    instance-of v15, v11, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncTimeoutError;

    if-eqz v15, :cond_13

    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncTimeoutError;

    goto :goto_13

    :cond_13
    const/4 v11, 0x0

    :goto_13
    if-eqz v11, :cond_14

    const/4 v11, 0x1

    goto :goto_14

    :cond_14
    const/4 v11, 0x0

    :goto_14
    if-nez v4, :cond_15

    const/4 v4, 0x0

    goto :goto_15

    .line 112
    :cond_15
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->getError()Ljava/lang/Throwable;

    move-result-object v4

    :goto_15
    instance-of v15, v4, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$Unknown;

    if-eqz v15, :cond_16

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$Unknown;

    move-object/from16 v16, v4

    goto :goto_16

    :cond_16
    const/16 v16, 0x0

    :goto_16
    if-eqz v16, :cond_17

    const/4 v4, 0x1

    goto :goto_17

    :cond_17
    const/4 v4, 0x0

    :goto_17
    if-eqz v9, :cond_18

    if-nez v6, :cond_18

    const/4 v9, 0x1

    goto :goto_18

    :cond_18
    const/4 v9, 0x0

    .line 116
    :goto_18
    instance-of v15, v2, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;

    if-eqz v15, :cond_19

    .line 118
    move-object/from16 v16, v2

    check-cast v16, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;

    invoke-virtual/range {v16 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;->getStarted()Z

    move-result v18

    if-eqz v18, :cond_19

    .line 119
    invoke-virtual/range {v16 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;->getCompleted()Z

    move-result v16

    if-nez v16, :cond_19

    const/16 v16, 0x1

    goto :goto_19

    :cond_19
    const/16 v16, 0x0

    :goto_19
    if-eqz v15, :cond_1a

    .line 122
    invoke-virtual/range {p3 .. p3}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;->getError()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_1a

    goto :goto_1a

    :cond_1a
    const/4 v10, 0x0

    :goto_1a
    const/4 v2, 0x3

    if-eqz v8, :cond_1b

    .line 125
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;

    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->deviceNotConnectedText:Ljava/lang/String;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$DeviceNotConnected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$DeviceNotConnected;

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v2, ""

    move-object v0, v7

    move-object/from16 v3, p5

    move-object/from16 v4, p2

    move-object v5, v6

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;Ljava/lang/Integer;)V

    return-object v7

    :cond_1b
    if-eqz v13, :cond_1c

    .line 126
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;

    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->syncNotAllowedDuringActivityText:Ljava/lang/String;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$SyncNotAllowed;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$SyncNotAllowed;

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v2, ""

    move-object v0, v7

    move-object/from16 v3, p5

    move-object/from16 v4, p2

    move-object v5, v6

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;Ljava/lang/Integer;)V

    return-object v7

    :cond_1c
    if-eqz v14, :cond_1d

    .line 127
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;

    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->watchBusyText:Ljava/lang/String;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$SyncNotAllowed;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$SyncNotAllowed;

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v2, ""

    move-object v0, v7

    move-object/from16 v3, p5

    move-object/from16 v4, p2

    move-object v5, v6

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;Ljava/lang/Integer;)V

    return-object v7

    :cond_1d
    if-eqz v9, :cond_1e

    .line 128
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;

    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->mandatoryUpdateText:Ljava/lang/String;

    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->firmwareUpdateActionText:Ljava/lang/String;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$CriticalUpdateRequired;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$CriticalUpdateRequired;

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;

    const/4 v7, 0x0

    const/16 v8, 0x20

    const/4 v10, 0x0

    move-object v0, v9

    move-object/from16 v3, p5

    move-object/from16 v4, p2

    move-object v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v10

    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_1e
    if-eqz v1, :cond_1f

    .line 129
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;

    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->bluetoothDisabledText:Ljava/lang/String;

    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->bluetoothActionText:Ljava/lang/String;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$BluetoothDisabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$BluetoothDisabled;

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;

    const/4 v7, 0x0

    const/16 v8, 0x20

    const/4 v10, 0x0

    move-object v0, v9

    move-object/from16 v3, p5

    move-object/from16 v4, p2

    move-object v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v10

    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_1f
    if-eqz v6, :cond_20

    .line 130
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;

    const/4 v1, 0x0

    const/4 v2, 0x0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$OTAInProgress;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$OTAInProgress;

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;

    const/4 v7, 0x0

    const/16 v8, 0x23

    const/4 v10, 0x0

    move-object v0, v9

    move-object/from16 v3, p5

    move-object/from16 v4, p2

    move-object v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v10

    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_20
    if-eqz v3, :cond_21

    .line 131
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;

    const/4 v4, 0x0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$SyncParsingError;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$SyncParsingError;

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x2

    const/4 v10, 0x0

    move-object v0, v9

    move-object v1, v3

    move-object v2, v4

    move-object/from16 v3, p5

    move-object/from16 v4, p2

    move-object v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v10

    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_21
    if-eqz v11, :cond_22

    .line 132
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;

    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->syncTimeoutErrorText:Ljava/lang/String;

    const/4 v3, 0x0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$SyncTimeoutError;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$SyncTimeoutError;

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x2

    const/4 v10, 0x0

    move-object v0, v9

    move-object v2, v3

    move-object/from16 v3, p5

    move-object/from16 v4, p2

    move-object v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v10

    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_22
    # PW_OFFLINE: aGpsTransferFailed branch disabled - the AGPS blob is a cloud-only
    # download; offline it is blocked by design (HttpClientImpl canary) and would
    # surface as the misleading "Performance update failed." toast. Fall through
    # to the next case instead (resolves to no toast).
    goto :cond_23

    .line 133
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;

    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->updateErrorText:Ljava/lang/String;

    const/4 v3, 0x0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$SyncTimeoutError;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$SyncTimeoutError;

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x2

    const/4 v10, 0x0

    move-object v0, v9

    move-object v2, v3

    move-object/from16 v3, p5

    move-object/from16 v4, p2

    move-object v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v10

    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_23
    if-eqz v4, :cond_24

    .line 134
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;

    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->unknownError:Ljava/lang/String;

    const/4 v3, 0x0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$UnknownSyncError;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$UnknownSyncError;

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x2

    const/4 v10, 0x0

    move-object v0, v9

    move-object v2, v3

    move-object/from16 v3, p5

    move-object/from16 v4, p2

    move-object v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v10

    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_24
    if-eqz v16, :cond_25

    .line 135
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;

    const/4 v1, 0x0

    const/4 v2, 0x0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$FontUpdateInProgress;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$FontUpdateInProgress;

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;

    const/4 v7, 0x0

    const/16 v8, 0x23

    const/4 v10, 0x0

    move-object v0, v9

    move-object/from16 v3, p5

    move-object/from16 v4, p2

    move-object v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v10

    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_25
    if-eqz v10, :cond_26

    .line 136
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$FontUpdateFailed;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$FontUpdateFailed;

    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->fontUpdateFailed:Ljava/lang/String;

    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;

    const/4 v4, 0x0

    move-object v6, v1

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x2

    const/4 v10, 0x0

    move-object v0, v9

    move-object v1, v3

    move-object v2, v4

    move-object/from16 v3, p5

    move-object/from16 v4, p2

    move-object v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v10

    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    .line 137
    :cond_26
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_27

    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;

    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->btPermissionMissing:Ljava/lang/String;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$DeviceNotConnected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$DeviceNotConnected;

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v2, ""

    move-object v0, v7

    move-object/from16 v3, p5

    move-object/from16 v4, p2

    move-object v5, v6

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;Ljava/lang/Integer;)V

    return-object v7

    .line 138
    :cond_27
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;

    const/4 v1, 0x0

    const/4 v2, 0x0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$None;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$None;

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;

    const/4 v7, 0x0

    const/16 v8, 0x23

    const/4 v10, 0x0

    move-object v0, v9

    move-object/from16 v3, p5

    move-object/from16 v4, p2

    move-object v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v10

    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9
.end method

.method public static synthetic lambda$HnT7bhwgsvBvTYPH58Av1BiMoo8(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Ljava/lang/Boolean;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;
    .locals 0

    invoke-static/range {p0 .. p6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->currentConfig$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Ljava/lang/Boolean;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getCurrentConfig()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;",
            ">;"
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->currentConfig:Lio/reactivex/Observable;

    return-object v0
.end method

.method public final resetSyncErrorEvent()V
    .locals 5

    .line 146
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->syncResetEvent:Lio/reactivex/subjects/PublishSubject;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;-><init>(ILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/lang/Throwable;Z)V

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method
