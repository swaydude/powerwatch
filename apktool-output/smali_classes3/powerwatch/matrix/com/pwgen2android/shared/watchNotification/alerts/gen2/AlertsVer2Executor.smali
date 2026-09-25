.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsVer2Executor;
.super Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsExecutor;
.source "AlertsExecutor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016\u00a8\u0006\r"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsVer2Executor;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsExecutor;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V",
        "sendAlert",
        "Lio/reactivex/Completable;",
        "deviceId",
        "",
        "gen2AlertsData",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;",
        "power",
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


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V
    .locals 1

    const-string v0, "communicator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V

    return-void
.end method

.method public static synthetic lambda$Puy5EJJzCUqg8eKgf7nccRkdm9M(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsVer2Executor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsVer2Executor;->sendAlert$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsVer2Executor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final sendAlert$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsVer2Executor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2FullAlertsTypeCommand;

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getAlertsData()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;

    move-result-object v0

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2FullAlertsTypeCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;)V

    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x37

    const/4 v11, 0x0

    move-object v3, p0

    move-object v7, p3

    invoke-direct/range {v3 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;-><init>(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/high16 p3, 0x3f800000    # 1.0f

    mul-float v6, p2, p3

    const-wide/16 v7, 0x0

    const-string v9, "notif_tracker"

    const/16 v10, 0x28

    move-object v3, p1

    move-object v4, p0

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method


# virtual methods
.method public sendAlert(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;F)Lio/reactivex/Completable;
    .locals 17

    move-object/from16 v0, p1

    const-string v1, "deviceId"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "gen2AlertsData"

    move-object/from16 v12, p2

    invoke-static {v12, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x3f

    const/4 v10, 0x0

    move-object v2, v11

    invoke-direct/range {v2 .. v10}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const-wide/16 v13, 0x0

    const/16 v15, 0xfb

    const/16 v16, 0x0

    move-object v2, v1

    move-object v5, v11

    move-wide v10, v13

    move v13, v15

    move-object/from16 v14, v16

    invoke-direct/range {v2 .. v14}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;-><init>(ZZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;FLjava/util/List;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;JLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    .line 42
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$AlertsVer2Executor$Puy5EJJzCUqg8eKgf7nccRkdm9M;

    move-object/from16 v3, p0

    move/from16 v4, p3

    invoke-direct {v2, v3, v0, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$AlertsVer2Executor$Puy5EJJzCUqg8eKgf7nccRkdm9M;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsVer2Executor;Ljava/lang/String;F)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 43
    invoke-virtual {v0}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "just(DataInfo(data = WatchDataInfo(), alertsData = gen2AlertsData))\n                .flatMap { sendSingleCommandWithAck(Gen2FullAlertsTypeCommand(it.alertsData), deviceId, Gen2DataInfo(dataInfo = it), power = 1F * power, logTag = \"notif_tracker\") }\n                .ignoreElements()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
