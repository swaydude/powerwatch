.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;
.super Ljava/lang/Object;
.source "AlertsExecutor.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\n\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0096\u0001J\"\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00142\u0008\u0008\u0002\u0010\"\u001a\u00020#H\u0002J@\u0010$\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J@\u0010-\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J@\u0010.\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J@\u0010/\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J@\u00100\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J@\u00101\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J@\u00102\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J@\u00103\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J@\u00104\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016R\u001c\u0010\u000c\u001a\u0010\u0012\u000c\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R4\u0010\u0010\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014 \u000f*\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00120\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u000e\u0010\u0008\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "deviceInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "gen2AlertsConfiguration",
        "alertsCache",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;)V",
        "alertExecutorObs",
        "Lio/reactivex/Observable;",
        "",
        "kotlin.jvm.PlatformType",
        "alertRequestSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lkotlin/Pair;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;",
        "alertsExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsExecutor;",
        "getCommunicator",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "getDeviceInfo",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "initAlerts",
        "Lio/reactivex/Completable;",
        "deviceId",
        "alertsConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfig;",
        "sendAlertToExecutor",
        "gen2AlertsData",
        "checkCache",
        "",
        "sendClearCallIconAlert",
        "uid",
        "",
        "title",
        "subTitle",
        "body",
        "postTime",
        "",
        "notificationTime",
        "sendClearMessageIconAlert",
        "sendImportantCallAlert",
        "sendImportantMessageAlert",
        "sendPreExistingCallAlert",
        "sendPreExistingMessageAlert",
        "sendSilentCallAlert",
        "sendSilentIncomingCallAlert",
        "sendSilentMessageAlert",
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
.field private final alertExecutorObs:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final alertRequestSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;",
            ">;>;"
        }
    .end annotation
.end field

.field private final alertsCache:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;

.field private final alertsExecutor:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsExecutor;

.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field private final deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

.field private final gen2AlertsConfiguration:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;)V
    .locals 1

    const-string v0, "communicator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gen2AlertsConfiguration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alertsCache"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 48
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    .line 49
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->gen2AlertsConfiguration:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;

    .line 50
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->alertsCache:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;

    .line 54
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getProtocolVersion()S

    move-result p2

    if-eqz p2, :cond_0

    const/4 p3, 0x1

    if-eq p2, p3, :cond_0

    .line 56
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsVer2Executor;

    invoke-direct {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsVer2Executor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsExecutor;

    goto :goto_0

    .line 55
    :cond_0
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsExecutor;

    invoke-direct {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V

    .line 54
    :goto_0
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->alertsExecutor:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsExecutor;

    .line 59
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string p2, "create<Pair<String, Gen2AlertsData>>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->alertRequestSubject:Lio/reactivex/subjects/PublishSubject;

    .line 63
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$gqs4V9xus_Bm7Uk-0UBPcG5vreo;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$gqs4V9xus_Bm7Uk-0UBPcG5vreo;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;)V

    invoke-virtual {p1, p2}, Lio/reactivex/subjects/PublishSubject;->concatMapSingle(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 74
    invoke-virtual {p1}, Lio/reactivex/Observable;->repeat()Lio/reactivex/Observable;

    move-result-object p1

    .line 75
    invoke-virtual {p1}, Lio/reactivex/Observable;->publish()Lio/reactivex/observables/ConnectableObservable;

    move-result-object p1

    .line 76
    invoke-virtual {p1}, Lio/reactivex/observables/ConnectableObservable;->autoConnect()Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "alertRequestSubject\n            .concatMapSingle {\n                alertsExecutor.sendAlert(it.first, it.second)\n                        .toSingleDefault(Unit)\n                        .doOnError {error ->\n                            error(\"Notification sending failed. Error is: \", error)\n                            error.printStackTrace()\n                        }\n                        .onErrorReturn {\n                            Unit\n                        }\n            }\n            .repeat()\n            .publish()\n            .autoConnect()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->alertExecutorObs:Lio/reactivex/Observable;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 49
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen2AlertsConfiguration;

    invoke-direct {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen2AlertsConfiguration;-><init>()V

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 50
    new-instance p4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;

    invoke-direct {p4}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;-><init>()V

    .line 47
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;)V

    return-void
.end method

.method private static final alertExecutorObs$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Lkotlin/Pair;)Lio/reactivex/SingleSource;
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->alertsExecutor:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsExecutor;

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsExecutor;->sendAlert$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;FILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p1

    .line 65
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p1

    .line 66
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$JOULsAztzApoPaUScgAJnXgI8bE;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$JOULsAztzApoPaUScgAJnXgI8bE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Single;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$FTdX8x2X8TOrS1Yi9kDVELkRiQ4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$FTdX8x2X8TOrS1Yi9kDVELkRiQ4;

    .line 70
    invoke-virtual {p0, p1}, Lio/reactivex/Single;->onErrorReturn(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final alertExecutorObs$lambda-2$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "Notification sending failed. Error is: "

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 68
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final alertExecutorObs$lambda-2$lambda-1(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic lambda$-iv7mKQiY4tqGS4nC04ObdYJpV8(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static/range {p0 .. p9}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendClearMessageIconAlert$lambda-11(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$0NCXpaynKWFTWnqonmc5QX3izoE(Lio/reactivex/disposables/Disposable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendAlertToExecutor$lambda-8(Lio/reactivex/disposables/Disposable;)V

    return-void
.end method

.method public static synthetic lambda$4dZjv0OC6aK1xw6_DugQdegKwSs(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendAlertToExecutor$lambda-9(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$6plNiEGN1SXTbJWJpe_-dy1BzwQ(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendAlertToExecutor$lambda-7$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$70wi97uUdpStKTigMuUSKRaFW7o(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static/range {p0 .. p8}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendClearMessageIconAlert$lambda-11$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$FTdX8x2X8TOrS1Yi9kDVELkRiQ4(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->alertExecutorObs$lambda-2$lambda-1(Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$JOULsAztzApoPaUScgAJnXgI8bE(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->alertExecutorObs$lambda-2$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$gqs4V9xus_Bm7Uk-0UBPcG5vreo(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Lkotlin/Pair;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->alertExecutorObs$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Lkotlin/Pair;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$mKCVCWyaLwTk_GErGAu-iRcrbho(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendAlertToExecutor$lambda-7$lambda-4(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$pKezd1LZYkIdPJ2zGWqjyul2gUw(ZLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;Ljava/lang/String;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendAlertToExecutor$lambda-7(ZLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;Ljava/lang/String;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$v9LOYo6FuOiHgHnIiN2WhbUxYnM(ZLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendAlertToExecutor$lambda-7$lambda-6(ZLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;)V

    return-void
.end method

.method public static synthetic lambda$zLU7yhD2RJQpQCEIDBfPWKfau-4(Lkotlin/Unit;Lkotlin/Unit;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendAlertToExecutor$lambda-7$lambda-5(Lkotlin/Unit;Lkotlin/Unit;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final sendAlertToExecutor(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;Z)Lio/reactivex/Completable;
    .locals 1

    .line 80
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$pKezd1LZYkIdPJ2zGWqjyul2gUw;

    invoke-direct {v0, p3, p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$pKezd1LZYkIdPJ2zGWqjyul2gUw;-><init>(ZLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/Completable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Completable;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$0NCXpaynKWFTWnqonmc5QX3izoE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$0NCXpaynKWFTWnqonmc5QX3izoE;

    .line 104
    invoke-virtual {p1, p2}, Lio/reactivex/Completable;->doOnSubscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$4dZjv0OC6aK1xw6_DugQdegKwSs;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$4dZjv0OC6aK1xw6_DugQdegKwSs;

    .line 105
    invoke-virtual {p1, p2}, Lio/reactivex/Completable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "defer {\n            if (checkCache && alertsCache.contains(AlertCacheInfo(gen2AlertsData.notificationTime, gen2AlertsData.uid.toInt(), \"\")))\n                return@defer Completable.complete()\n\n            val request = Single.create<Unit> {\n                alertRequestSubject.onNext(Pair(deviceId, gen2AlertsData))\n                it.onSuccess(Unit)\n            }\n\n            Single.zip(\n                    alertExecutorObs.firstOrError()\n                            .doOnError {\n                                Unit\n                            }, request, BiFunction<Unit, Unit, Unit> { _, _ ->\n                Unit\n            }).ignoreElement()\n                    .doOnComplete {\n                        if (checkCache)\n                            alertsCache.add(AlertCacheInfo(gen2AlertsData.notificationTime, gen2AlertsData.uid.toInt(), gen2AlertsData.title,\n                                    gen2AlertsData.categoryId == ANCSConstants.CategoryID.CATEGORY_ID_OTHER &&\n                                            checkCache &&\n                                            gen2AlertsData.eventId == ANCSConstants.EventID.EVENT_ID_NOTIFICATION_ADDED))\n                    }\n        }\n                .doOnSubscribe { Unit }\n                .doOnError { Unit }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method static synthetic sendAlertToExecutor$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;ZILjava/lang/Object;)Lio/reactivex/Completable;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 78
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendAlertToExecutor(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;Z)Lio/reactivex/Completable;

    move-result-object p0

    return-object p0
.end method

.method private static final sendAlertToExecutor$lambda-7(ZLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;Ljava/lang/String;)Lio/reactivex/CompletableSource;
    .locals 10

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$gen2AlertsData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    .line 81
    iget-object v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->alertsCache:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;

    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;->getNotificationTime()J

    move-result-wide v2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;->getUid()S

    move-result v4

    const/4 v6, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    const-string v5, ""

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;-><init>(JILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;->contains(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0

    .line 84
    :cond_0
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$6plNiEGN1SXTbJWJpe_-dy1BzwQ;

    invoke-direct {v0, p1, p3, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$6plNiEGN1SXTbJWJpe_-dy1BzwQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;)V

    invoke-static {v0}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object p3

    const-string v0, "create<Unit> {\n                alertRequestSubject.onNext(Pair(deviceId, gen2AlertsData))\n                it.onSuccess(Unit)\n            }"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    iget-object v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->alertExecutorObs:Lio/reactivex/Observable;

    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$mKCVCWyaLwTk_GErGAu-iRcrbho;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$mKCVCWyaLwTk_GErGAu-iRcrbho;

    .line 91
    invoke-virtual {v0, v1}, Lio/reactivex/Single;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object v0

    check-cast v0, Lio/reactivex/SingleSource;

    .line 93
    check-cast p3, Lio/reactivex/SingleSource;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$zLU7yhD2RJQpQCEIDBfPWKfau-4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$zLU7yhD2RJQpQCEIDBfPWKfau-4;

    .line 89
    invoke-static {v0, p3, v1}, Lio/reactivex/Single;->zip(Lio/reactivex/SingleSource;Lio/reactivex/SingleSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Single;

    move-result-object p3

    .line 95
    invoke-virtual {p3}, Lio/reactivex/Single;->ignoreElement()Lio/reactivex/Completable;

    move-result-object p3

    .line 96
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$v9LOYo6FuOiHgHnIiN2WhbUxYnM;

    invoke-direct {v0, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$v9LOYo6FuOiHgHnIiN2WhbUxYnM;-><init>(ZLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;)V

    invoke-virtual {p3, v0}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final sendAlertToExecutor$lambda-7$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;Lio/reactivex/SingleEmitter;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$gen2AlertsData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->alertRequestSubject:Lio/reactivex/subjects/PublishSubject;

    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, p1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    .line 86
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-interface {p3, p0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method private static final sendAlertToExecutor$lambda-7$lambda-4(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final sendAlertToExecutor$lambda-7$lambda-5(Lkotlin/Unit;Lkotlin/Unit;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$noName_0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "$noName_1"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final sendAlertToExecutor$lambda-7$lambda-6(ZLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$gen2AlertsData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_1

    .line 98
    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->alertsCache:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;

    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;->getNotificationTime()J

    move-result-wide v1

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;->getUid()S

    move-result v3

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;->getTitle()Ljava/lang/String;

    move-result-object v4

    .line 99
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;->getCategoryId()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;

    move-result-object v0

    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->CATEGORY_ID_OTHER:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;

    if-ne v0, v5, :cond_0

    if-eqz p0, :cond_0

    .line 101
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;->getEventId()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;

    move-result-object p0

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;->EVENT_ID_NOTIFICATION_ADDED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;

    if-ne p0, p2, :cond_0

    const/4 p0, 0x1

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    const/4 v5, 0x0

    :goto_0
    move-object v0, v6

    .line 98
    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;-><init>(JILjava/lang/String;Z)V

    invoke-virtual {p1, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;->add(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;)V

    :cond_1
    return-void
.end method

.method private static final sendAlertToExecutor$lambda-8(Lio/reactivex/disposables/Disposable;)V
    .locals 0

    return-void
.end method

.method private static final sendAlertToExecutor$lambda-9(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final sendClearMessageIconAlert$lambda-11(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/CompletableSource;
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "this$0"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$title"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$deviceId"

    move-object/from16 v14, p2

    invoke-static {v14, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$subTitle"

    move-object/from16 v9, p4

    invoke-static {v9, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$body"

    move-object/from16 v10, p5

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->alertsCache:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;

    invoke-virtual {v2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;->contains(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 220
    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->alertsCache:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;

    invoke-virtual {v2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;->fetchAndRemove(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lio/reactivex/Observable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object v11

    .line 221
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$70wi97uUdpStKTigMuUSKRaFW7o;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-wide/from16 v5, p6

    move-wide/from16 v7, p8

    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$70wi97uUdpStKTigMuUSKRaFW7o;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V

    invoke-virtual {v11, v12}, Lio/reactivex/Observable;->concatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    goto :goto_0

    .line 245
    :cond_0
    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;->EVENT_ID_NOTIFICATION_REMOVED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;

    .line 246
    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->EVENT_FLAG_SILENT:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;

    .line 247
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->CATEGORY_ID_OTHER:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;

    .line 238
    new-instance v20, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;

    move-object/from16 v2, v20

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v18, 0x710

    const/16 v19, 0x0

    move/from16 v4, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-wide/from16 v14, p6

    move-wide/from16 v16, p8

    invoke-direct/range {v2 .. v19}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;SLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x0

    const/4 v2, 0x4

    const/4 v3, 0x0

    move-object/from16 p3, p0

    move-object/from16 p4, p2

    move-object/from16 p5, v20

    move/from16 p6, v0

    move/from16 p7, v2

    move-object/from16 p8, v3

    .line 237
    invoke-static/range {p3 .. p8}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendAlertToExecutor$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;ZILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    :goto_0
    return-object v0
.end method

.method private static final sendClearMessageIconAlert$lambda-11$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;)Lio/reactivex/CompletableSource;
    .locals 19

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-wide/from16 v12, p4

    move-wide/from16 v14, p6

    const-string v0, "this$0"

    move-object/from16 v11, p0

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceId"

    move-object/from16 v10, p1

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$subTitle"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$body"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    invoke-virtual/range {p8 .. p8}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->getAlertId()I

    move-result v0

    int-to-short v2, v0

    .line 228
    invoke-virtual/range {p8 .. p8}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->getTitle()Ljava/lang/String;

    move-result-object v6

    .line 231
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;->EVENT_ID_NOTIFICATION_REMOVED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;

    .line 232
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->EVENT_FLAG_SILENT:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;

    .line 233
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->CATEGORY_ID_OTHER:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;

    .line 224
    new-instance v18, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;

    move-object/from16 v0, v18

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/16 v16, 0x0

    move/from16 v10, v16

    move/from16 v11, v16

    const/16 v16, 0x710

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;SLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/4 v2, 0x0

    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v18

    move/from16 p5, v0

    move/from16 p6, v1

    move-object/from16 p7, v2

    .line 222
    invoke-static/range {p2 .. p7}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendAlertToExecutor$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;ZILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    return-object v0
.end method


# virtual methods
.method public final getCommunicator()Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;
    .locals 1

    .line 47
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    return-object v0
.end method

.method public final getDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
    .locals 1

    .line 48
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 47
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public initAlerts(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfig;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alertsConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->gen2AlertsConfiguration:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;->initAlerts(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfig;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public sendClearCallIconAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
    .locals 19

    move/from16 v2, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-wide/from16 v12, p6

    move-wide/from16 v14, p8

    const-string v0, "deviceId"

    move-object/from16 v11, p1

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subTitle"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    move-object/from16 v1, p5

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;->EVENT_ID_NOTIFICATION_REMOVED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;

    .line 213
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->EVENT_FLAG_SILENT:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;

    .line 214
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->CATEGORY_ID_MISSED_CALL:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;

    .line 205
    new-instance v18, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;

    move-object/from16 v0, v18

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v16, 0x0

    move/from16 v11, v16

    const/16 v16, 0x710

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;SLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/4 v2, 0x0

    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v18

    move/from16 p5, v0

    move/from16 p6, v1

    move-object/from16 p7, v2

    .line 204
    invoke-static/range {p2 .. p7}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendAlertToExecutor$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;ZILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object v0

    return-object v0
.end method

.method public sendClearMessageIconAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
    .locals 12

    const-string v0, "deviceId"

    move-object v4, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object v3, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subTitle"

    move-object/from16 v6, p4

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    move-object/from16 v7, p5

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$-iv7mKQiY4tqGS4nC04ObdYJpV8;

    move-object v1, v0

    move-object v2, p0

    move v5, p2

    move-wide/from16 v8, p6

    move-wide/from16 v10, p8

    invoke-direct/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$-iv7mKQiY4tqGS4nC04ObdYJpV8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;JJ)V

    invoke-static {v0}, Lio/reactivex/Completable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "defer {\n            if (alertsCache.contains(title)) {\n                Observable.fromIterable(alertsCache.fetchAndRemove(title))\n                        .concatMapCompletable {\n                            sendAlertToExecutor(\n                                    deviceId,\n                                    Gen2AlertsData(\n                                            notificationTime = notificationTime,\n                                            postTime = postTime,\n                                            uid = it.alertId.toShort(),\n                                            title = it.title,\n                                            subTitle = subTitle,\n                                            message = body,\n                                            eventId = ANCSConstants.EventID.EVENT_ID_NOTIFICATION_REMOVED,\n                                            eventFlags = ANCSConstants.EventFlag.EVENT_FLAG_SILENT,\n                                            categoryId = ANCSConstants.CategoryID.CATEGORY_ID_OTHER)\n                            )\n                        }\n            } else\n                sendAlertToExecutor(deviceId,\n                        Gen2AlertsData(\n                                notificationTime = notificationTime,\n                                postTime = postTime,\n                                uid = uid,\n                                title = title,\n                                subTitle = subTitle,\n                                message = body,\n                                eventId = ANCSConstants.EventID.EVENT_ID_NOTIFICATION_REMOVED,\n                                eventFlags = ANCSConstants.EventFlag.EVENT_FLAG_SILENT,\n                                categoryId = ANCSConstants.CategoryID.CATEGORY_ID_OTHER))\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public sendImportantCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
    .locals 19

    move/from16 v2, p2

    move-object/from16 v6, p3

    move-object/from16 v8, p5

    move-wide/from16 v12, p6

    move-wide/from16 v14, p8

    const-string v0, "deviceId"

    move-object/from16 v11, p1

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subTitle"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    move-object/from16 v1, p5

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;->EVENT_ID_NOTIFICATION_ADDED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;

    .line 118
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->EVENT_FLAG_IMPORTANT:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;

    .line 119
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->CATEGORY_ID_INCOMING_CALL:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;

    .line 111
    new-instance v18, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;

    move-object/from16 v0, v18

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v16, 0x0

    move/from16 v11, v16

    const/16 v16, 0x750

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;SLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/4 v2, 0x0

    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v18

    move/from16 p5, v0

    move/from16 p6, v1

    move-object/from16 p7, v2

    .line 110
    invoke-static/range {p2 .. p7}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendAlertToExecutor$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;ZILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object v0

    return-object v0
.end method

.method public sendImportantMessageAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
    .locals 20

    move-object/from16 v0, p1

    move/from16 v3, p2

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move-wide/from16 v13, p6

    move-wide/from16 v15, p8

    const-string v1, "deviceId"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "title"

    move-object/from16 v2, p3

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "subTitle"

    move-object/from16 v2, p4

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "body"

    move-object/from16 v2, p5

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;->EVENT_ID_NOTIFICATION_ADDED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;

    .line 170
    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->EVENT_FLAG_IMPORTANT:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;

    .line 171
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->CATEGORY_ID_OTHER:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;

    .line 162
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;

    move-object v1, v12

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v12

    move/from16 v12, v17

    const/16 v17, 0x710

    const/16 v18, 0x0

    invoke-direct/range {v1 .. v18}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;SLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x1

    move-object/from16 v2, p0

    move-object/from16 v3, v19

    .line 161
    invoke-direct {v2, v0, v3, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendAlertToExecutor(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;Z)Lio/reactivex/Completable;

    move-result-object v0

    return-object v0
.end method

.method public sendPreExistingCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
    .locals 20

    move-object/from16 v0, p1

    move/from16 v3, p2

    move-object/from16 v7, p3

    move-object/from16 v9, p5

    move-wide/from16 v13, p6

    move-wide/from16 v15, p8

    const-string v1, "deviceId"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "title"

    move-object/from16 v2, p3

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "subTitle"

    move-object/from16 v2, p4

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "body"

    move-object/from16 v2, p5

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;->EVENT_ID_NOTIFICATION_ADDED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;

    .line 155
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->CATEGORY_ID_MISSED_CALL:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;

    .line 156
    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->EVENT_FLAG_PRE_EXISTING:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;

    .line 149
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;

    move-object v1, v12

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v12

    move/from16 v12, v17

    const/16 v17, 0x750

    const/16 v18, 0x0

    invoke-direct/range {v1 .. v18}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;SLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x1

    move-object/from16 v2, p0

    move-object/from16 v3, v19

    .line 148
    invoke-direct {v2, v0, v3, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendAlertToExecutor(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;Z)Lio/reactivex/Completable;

    move-result-object v0

    return-object v0
.end method

.method public sendPreExistingMessageAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
    .locals 20

    move-object/from16 v0, p1

    move/from16 v3, p2

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move-wide/from16 v13, p6

    move-wide/from16 v15, p8

    const-string v1, "deviceId"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "title"

    move-object/from16 v2, p3

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "subTitle"

    move-object/from16 v2, p4

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "body"

    move-object/from16 v2, p5

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;->EVENT_ID_NOTIFICATION_ADDED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;

    .line 198
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->CATEGORY_ID_OTHER:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;

    .line 199
    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->EVENT_FLAG_PRE_EXISTING:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;

    .line 190
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;

    move-object v1, v12

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v12

    move/from16 v12, v17

    const/16 v17, 0x710

    const/16 v18, 0x0

    invoke-direct/range {v1 .. v18}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;SLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x1

    move-object/from16 v2, p0

    move-object/from16 v3, v19

    .line 189
    invoke-direct {v2, v0, v3, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendAlertToExecutor(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;Z)Lio/reactivex/Completable;

    move-result-object v0

    return-object v0
.end method

.method public sendSilentCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
    .locals 20

    move-object/from16 v0, p1

    move/from16 v3, p2

    move-object/from16 v7, p3

    move-object/from16 v9, p5

    move-wide/from16 v13, p6

    move-wide/from16 v15, p8

    const-string v1, "deviceId"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "title"

    move-object/from16 v2, p3

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "subTitle"

    move-object/from16 v2, p4

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "body"

    move-object/from16 v2, p5

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;->EVENT_ID_NOTIFICATION_ADDED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;

    .line 143
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->CATEGORY_ID_MISSED_CALL:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;

    .line 144
    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->EVENT_FLAG_SILENT:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;

    .line 137
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;

    move-object v1, v12

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v12

    move/from16 v12, v17

    const/16 v17, 0x750

    const/16 v18, 0x0

    invoke-direct/range {v1 .. v18}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;SLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x1

    move-object/from16 v2, p0

    move-object/from16 v3, v19

    .line 136
    invoke-direct {v2, v0, v3, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendAlertToExecutor(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;Z)Lio/reactivex/Completable;

    move-result-object v0

    return-object v0
.end method

.method public sendSilentIncomingCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
    .locals 19

    move/from16 v2, p2

    move-object/from16 v6, p3

    move-object/from16 v8, p5

    move-wide/from16 v12, p6

    move-wide/from16 v14, p8

    const-string v0, "deviceId"

    move-object/from16 v11, p1

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subTitle"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    move-object/from16 v1, p5

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;->EVENT_ID_NOTIFICATION_ADDED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;

    .line 131
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->EVENT_FLAG_SILENT:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;

    .line 132
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->CATEGORY_ID_INCOMING_CALL:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;

    .line 124
    new-instance v18, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;

    move-object/from16 v0, v18

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v16, 0x0

    move/from16 v11, v16

    const/16 v16, 0x750

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;SLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/4 v2, 0x0

    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v18

    move/from16 p5, v0

    move/from16 p6, v1

    move-object/from16 p7, v2

    .line 123
    invoke-static/range {p2 .. p7}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendAlertToExecutor$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;ZILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object v0

    return-object v0
.end method

.method public sendSilentMessageAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
    .locals 20

    move-object/from16 v0, p1

    move/from16 v3, p2

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move-wide/from16 v13, p6

    move-wide/from16 v15, p8

    const-string v1, "deviceId"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "title"

    move-object/from16 v2, p3

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "subTitle"

    move-object/from16 v2, p4

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "body"

    move-object/from16 v2, p5

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;->EVENT_ID_NOTIFICATION_ADDED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;

    .line 184
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;->CATEGORY_ID_OTHER:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;

    .line 185
    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;->EVENT_FLAG_SILENT:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;

    .line 176
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;

    move-object v1, v12

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v12

    move/from16 v12, v17

    const/16 v17, 0x710

    const/16 v18, 0x0

    invoke-direct/range {v1 .. v18}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;SLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x1

    move-object/from16 v2, p0

    move-object/from16 v3, v19

    .line 175
    invoke-direct {v2, v0, v3, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->sendAlertToExecutor(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;Z)Lio/reactivex/Completable;

    move-result-object v0

    return-object v0
.end method
