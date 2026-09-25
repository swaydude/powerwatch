.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;
.super Ljava/lang/Object;
.source "AlertsCommunicator.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAlertsCommunicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertsCommunicator.kt\npowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,255:1\n1741#2,3:256\n*S KotlinDebug\n*F\n+ 1 AlertsCommunicator.kt\npowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator\n*L\n61#1:256,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ:\u0010\u0018\u001a\u00020\u0019\"\u0008\u0008\u0000\u0010\u001a*\u00020\u001b2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u0002H\u001a0\u001d2\u0018\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u00020\u00150 0\u001fH\u0002J:\u0010!\u001a\u00020\u0019\"\u0008\u0008\u0000\u0010\u001a*\u00020\"2\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u0002H\u001a0\u001d2\u0018\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u00020\u00150 0\u001fH\u0002J\u0006\u0010$\u001a\u00020\u0019J\u0006\u0010%\u001a\u00020\u0019J\u0018\u0010&\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001bH\u0002J\u001c\u0010*\u001a\u00020\u00192\u0008\u0010+\u001a\u0004\u0018\u00010,2\u0008\u0008\u0002\u0010-\u001a\u00020.H\u0002J\u0008\u0010/\u001a\u00020\u0019H\u0002J\u0008\u00100\u001a\u00020\u0019H\u0002R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\u000c\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "alertsManager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "deviceManager",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;",
        "deviceCommunicationQueuer",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;",
        "appContext",
        "Landroid/content/Context;",
        "alertsCache",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;)V",
        "alertsLiteCommunicator",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;",
        "compositeDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "deviceStatusSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "kotlin.jvm.PlatformType",
        "notificationsDisposable",
        "createSendingEventObservable",
        "",
        "T",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;",
        "eventObservable",
        "Lio/reactivex/Observable;",
        "action",
        "Lio/reactivex/functions/Consumer;",
        "Lkotlin/Pair;",
        "createSendingMissingObservable",
        "",
        "missingObservable",
        "destroy",
        "init",
        "logSendingMessage",
        "messageType",
        "",
        "messageEvent",
        "sendNotification",
        "operationObs",
        "Lio/reactivex/Completable;",
        "discardIfNeeded",
        "",
        "subscribeToGen1",
        "subscribeToGen2",
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
.field private final alertsCache:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;

.field private alertsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;

.field private final alertsManager:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;

.field private final appContext:Landroid/content/Context;

.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field private compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

.field private final deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

.field private final deviceStatusSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation
.end field

.field private notificationsDisposable:Lio/reactivex/disposables/CompositeDisposable;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;)V
    .locals 1

    const-string v0, "alertsManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communicator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceCommunicationQueuer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alertsCache"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsManager:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;

    .line 33
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 34
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    .line 35
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    .line 36
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->appContext:Landroid/content/Context;

    .line 37
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsCache:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;

    .line 39
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 40
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->notificationsDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 41
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string p2, "create<DeviceInfo>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->deviceStatusSubject:Lio/reactivex/subjects/PublishSubject;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 37
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;

    invoke-direct {p6}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;-><init>()V

    :cond_0
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 31
    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;)V

    return-void
.end method

.method private final createSendingEventObservable(Lio/reactivex/Observable;Lio/reactivex/functions/Consumer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;",
            ">(",
            "Lio/reactivex/Observable<",
            "TT;>;",
            "Lio/reactivex/functions/Consumer<",
            "Lkotlin/Pair<",
            "TT;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;>;)V"
        }
    .end annotation

    .line 216
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->notificationsDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 217
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->deviceStatusSubject:Lio/reactivex/subjects/PublishSubject;

    check-cast v1, Lio/reactivex/ObservableSource;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$TIY8vhzBSjXcHPyj5tkyeshMbXU;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$TIY8vhzBSjXcHPyj5tkyeshMbXU;

    invoke-virtual {p1, v1, v2}, Lio/reactivex/Observable;->withLatestFrom(Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$cB25r7Jtgp28CwcTb6MtnMmkl_g;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$cB25r7Jtgp28CwcTb6MtnMmkl_g;

    .line 220
    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    .line 223
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 216
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method private static final createSendingEventObservable$lambda-22(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lkotlin/Pair;
    .locals 1

    const-string v0, "call"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final createSendingEventObservable$lambda-23(Lkotlin/Pair;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isConnected()Z

    move-result p0

    return p0
.end method

.method private final createSendingMissingObservable(Lio/reactivex/Observable;Lio/reactivex/functions/Consumer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Number;",
            ">(",
            "Lio/reactivex/Observable<",
            "TT;>;",
            "Lio/reactivex/functions/Consumer<",
            "Lkotlin/Pair<",
            "TT;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;>;)V"
        }
    .end annotation

    .line 227
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->notificationsDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 228
    check-cast p1, Lio/reactivex/ObservableSource;

    .line 229
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->deviceStatusSubject:Lio/reactivex/subjects/PublishSubject;

    check-cast v1, Lio/reactivex/ObservableSource;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$-aTIMPS2DNBhqTuGQmgaL6rBnxo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$-aTIMPS2DNBhqTuGQmgaL6rBnxo;

    .line 228
    invoke-static {p1, v1, v2}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$l-HEwcwD6IWIDlti7QPPuNZzyM0;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$l-HEwcwD6IWIDlti7QPPuNZzyM0;

    .line 232
    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    .line 235
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 227
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method private static final createSendingMissingObservable$lambda-24(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lkotlin/Pair;
    .locals 1

    const-string v0, "missedNumber"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final createSendingMissingObservable$lambda-25(Lkotlin/Pair;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isConnected()Z

    move-result p0

    return p0
.end method

.method private static final init$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isDefault()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final init$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 11

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 60
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->appContext:Landroid/content/Context;

    const-class v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/NotificationCollectorMonitorService;

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v2}, Landroidx/core/app/JobIntentService;->enqueueWork(Landroid/content/Context;Ljava/lang/Class;ILandroid/content/Intent;)V

    .line 61
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getConnectionInfos()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 256
    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    .line 257
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    .line 62
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object v1

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_STANDARD_BASICS:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    if-ne v1, v4, :cond_3

    const/4 v1, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    :goto_1
    if-eqz v3, :cond_4

    .line 64
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;

    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    const-string v1, "deviceInfo"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    iget-object v8, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsCache:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;

    const/4 v9, 0x4

    const/4 v10, 0x0

    move-object v4, v0

    move-object v6, p1

    invoke-direct/range {v4 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;

    .line 65
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->subscribeToGen2()V

    goto :goto_2

    .line 67
    :cond_4
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;

    .line 68
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->subscribeToGen1()V

    goto :goto_2

    .line 72
    :cond_5
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const/4 v1, 0x2

    const-string v2, "Clearing notification subscribers on watch disconnect..."

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 73
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->notificationsDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    .line 75
    :goto_2
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->deviceStatusSubject:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final init$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v0, "Connection for sending notifications died!"

    invoke-static {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->wtfError(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$-aTIMPS2DNBhqTuGQmgaL6rBnxo(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->createSendingMissingObservable$lambda-24(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$2IyLh5TL3qiWFD-t32NFEQxzT84(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->subscribeToGen2$lambda-20(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$6ijcxN8Z2G5cSU5QgPO7efUngXY(Lkotlin/Unit;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->sendNotification$lambda-28$lambda-26(Lkotlin/Unit;)V

    return-void
.end method

.method public static synthetic lambda$8SuO7AE5W3DZRd9Vuw8uIS4xVuM(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->subscribeToGen2$lambda-18(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$8vdWCZOGizQ8qdns6KQZBu9FFc4(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->subscribeToGen1$lambda-14(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$Dk3WYMzu1Cta5FDMjkgFGrnWlt8(Ljava/lang/Integer;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->subscribeToGen1$lambda-9(Ljava/lang/Integer;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$FIGsXhR1utIFPATqgjXAnuwHkqQ(Ljava/lang/Integer;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->subscribeToGen1$lambda-11(Ljava/lang/Integer;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$ICVfqYjNioAG7GcH2YeGuQhLv3U(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->init$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$Ix79mZ30ofUuHWPXzraS__oDEGM(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->subscribeToGen2$lambda-16(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$RNnGU4QG1cV4lrF7hJN9T5Lo0XA(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->subscribeToGen1$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$SVqmpyZ9nLJIdLWvGtZn9wha9Po(Ljava/lang/Integer;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->subscribeToGen1$lambda-7(Ljava/lang/Integer;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$Sq0RI6lQGDPl9JSKdtrmnytTpjc(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->init$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method

.method public static synthetic lambda$TIY8vhzBSjXcHPyj5tkyeshMbXU(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->createSendingEventObservable$lambda-22(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Wv0w1eOVNyw1vMmeq7q9ziRKU3M(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->subscribeToGen2$lambda-15(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$_AblNJuM3VJ6rQqR799Joy3pEd4(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->sendNotification$lambda-28$lambda-27(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$cB25r7Jtgp28CwcTb6MtnMmkl_g(Lkotlin/Pair;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->createSendingEventObservable$lambda-23(Lkotlin/Pair;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$dnNLDmWaFUBriiT8qCHcyILdGf4(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->subscribeToGen2$lambda-19(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$fg_dEtuqIp3XBOq9dD3igfACZV4(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->init$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$l-HEwcwD6IWIDlti7QPPuNZzyM0(Lkotlin/Pair;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->createSendingMissingObservable$lambda-25(Lkotlin/Pair;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$mkUrE9XMvsh6cI323Pzg2X1OB28(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->subscribeToGen1$lambda-12(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$pGHpbAcgDpI0zUBUzesQ6QLv0iE(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->subscribeToGen2$lambda-21(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$rXc0nLU7qxmQByX-wVKV28ZgmX8(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->subscribeToGen1$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$v5zvv7JdN9Z-SZYb_S8WWdyjt4o(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->subscribeToGen1$lambda-8(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$wfIDDF9rDqUVddGnMYtBXJXiips(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->subscribeToGen1$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$whapDCeeq1XwNXIRKiyo4CunKPw(Ljava/lang/Integer;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->subscribeToGen1$lambda-13(Ljava/lang/Integer;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$xWsk-i7bxiWhHjAB_7GIlnBggfI(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->subscribeToGen2$lambda-17(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V

    return-void
.end method

.method private final logSendingMessage(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;)V
    .locals 3

    .line 211
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sending "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " notification: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;->getAppPackageName()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "null"

    :cond_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", time - "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;->getNotificationTimestamp()J

    move-result-wide p1

    .line 211
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x2

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, p2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private final sendNotification(Lio/reactivex/Completable;Z)V
    .locals 7

    if-nez p1, :cond_0

    goto :goto_1

    .line 242
    :cond_0
    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    .line 243
    invoke-virtual {p1}, Lio/reactivex/Completable;->toObservable()Lio/reactivex/Observable;

    move-result-object v1

    const-string p1, "it\n                            .toObservable<Unit>()"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Discard;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Discard;

    goto :goto_0

    :cond_1
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Delayer;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Delayer;

    :goto_0
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;

    move-object v2, p1

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    .line 242
    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;-><init>(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 244
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    invoke-interface {p1, v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;->queue(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$6ijcxN8Z2G5cSU5QgPO7efUngXY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$6ijcxN8Z2G5cSU5QgPO7efUngXY;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$_AblNJuM3VJ6rQqR799Joy3pEd4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$_AblNJuM3VJ6rQqR799Joy3pEd4;

    .line 245
    invoke-virtual {p1, p2, v0}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    :goto_1
    return-void
.end method

.method static synthetic sendNotification$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lio/reactivex/Completable;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 239
    :cond_0
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->sendNotification(Lio/reactivex/Completable;Z)V

    return-void
.end method

.method private static final sendNotification$lambda-28$lambda-26(Lkotlin/Unit;)V
    .locals 0

    return-void
.end method

.method private static final sendNotification$lambda-28$lambda-27(Ljava/lang/Throwable;)V
    .locals 0

    .line 245
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private final subscribeToGen1()V
    .locals 5

    .line 85
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Listener for Gen1 subscribed, waiting for notifications to be pushed.."

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 87
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsManager:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;

    const/4 v1, 0x1

    new-array v2, v1, [Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->RINGING:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;->getRealtimeCallEvents([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$RNnGU4QG1cV4lrF7hJN9T5Lo0XA;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$RNnGU4QG1cV4lrF7hJN9T5Lo0XA;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;)V

    invoke-direct {p0, v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->createSendingEventObservable(Lio/reactivex/Observable;Lio/reactivex/functions/Consumer;)V

    .line 99
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsManager:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;

    new-array v1, v1, [Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;->RECEIVED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;

    aput-object v2, v1, v4

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;->getSMSRealtimeEvent([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;)Lio/reactivex/Observable;

    move-result-object v0

    .line 100
    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "alertsManager.getSMSRealtimeEvent(SMSState.RECEIVED)\n                .distinctUntilChanged()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$wfIDDF9rDqUVddGnMYtBXJXiips;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$wfIDDF9rDqUVddGnMYtBXJXiips;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;)V

    .line 99
    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->createSendingEventObservable(Lio/reactivex/Observable;Lio/reactivex/functions/Consumer;)V

    .line 105
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsManager:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;->getNumOfMissedCalls()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$SVqmpyZ9nLJIdLWvGtZn9wha9Po;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$SVqmpyZ9nLJIdLWvGtZn9wha9Po;

    .line 106
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "alertsManager.getNumOfMissedCalls()\n                .filter { it > 0 }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$v5zvv7JdN9Z-SZYb_S8WWdyjt4o;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$v5zvv7JdN9Z-SZYb_S8WWdyjt4o;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;)V

    .line 105
    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->createSendingMissingObservable(Lio/reactivex/Observable;Lio/reactivex/functions/Consumer;)V

    .line 110
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsManager:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;->getNumOfMissedCalls()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$Dk3WYMzu1Cta5FDMjkgFGrnWlt8;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$Dk3WYMzu1Cta5FDMjkgFGrnWlt8;

    .line 111
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "alertsManager.getNumOfMissedCalls()\n                .filter { it == 0 }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$rXc0nLU7qxmQByX-wVKV28ZgmX8;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$rXc0nLU7qxmQByX-wVKV28ZgmX8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;)V

    .line 110
    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->createSendingMissingObservable(Lio/reactivex/Observable;Lio/reactivex/functions/Consumer;)V

    .line 115
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsManager:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;->getNumOfUnreadSMS()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$FIGsXhR1utIFPATqgjXAnuwHkqQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$FIGsXhR1utIFPATqgjXAnuwHkqQ;

    .line 116
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "alertsManager.getNumOfUnreadSMS()\n                .filter { it > 0 }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$mkUrE9XMvsh6cI323Pzg2X1OB28;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$mkUrE9XMvsh6cI323Pzg2X1OB28;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;)V

    .line 115
    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->createSendingMissingObservable(Lio/reactivex/Observable;Lio/reactivex/functions/Consumer;)V

    .line 120
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsManager:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;->getNumOfUnreadSMS()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$whapDCeeq1XwNXIRKiyo4CunKPw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$whapDCeeq1XwNXIRKiyo4CunKPw;

    .line 121
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "alertsManager.getNumOfUnreadSMS()\n                .filter { it == 0 }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$8vdWCZOGizQ8qdns6KQZBu9FFc4;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$8vdWCZOGizQ8qdns6KQZBu9FFc4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;)V

    .line 120
    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->createSendingMissingObservable(Lio/reactivex/Observable;Lio/reactivex/functions/Consumer;)V

    .line 126
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsManager:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->appContext:Landroid/content/Context;

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;->invalidateNotifications(Landroid/content/Context;)V

    return-void
.end method

.method private static final subscribeToGen1$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 11

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;

    const/4 v0, 0x0

    if-nez v1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v2

    const/4 v3, -0x1

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    invoke-interface/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendClearCallIconAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object p1

    :goto_0
    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, p1, v1, v2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->sendNotification$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lio/reactivex/Completable;ZILjava/lang/Object;)V

    return-void
.end method

.method private static final subscribeToGen1$lambda-11(Ljava/lang/Integer;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final subscribeToGen1$lambda-12(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 11

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;

    const/4 v0, 0x0

    if-nez v1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v2

    const/4 v3, -0x1

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    invoke-interface/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendSilentMessageAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object p1

    :goto_0
    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, p1, v1, v2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->sendNotification$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lio/reactivex/Completable;ZILjava/lang/Object;)V

    return-void
.end method

.method private static final subscribeToGen1$lambda-13(Ljava/lang/Integer;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final subscribeToGen1$lambda-14(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 11

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;

    const/4 v0, 0x0

    if-nez v1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v2

    const/4 v3, -0x1

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    invoke-interface/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendClearMessageIconAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object p1

    :goto_0
    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, p1, v1, v2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->sendNotification$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lio/reactivex/Completable;ZILjava/lang/Object;)V

    return-void
.end method

.method private static final subscribeToGen1$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    .line 90
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;

    if-nez v1, :cond_0

    goto :goto_0

    .line 92
    :cond_0
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getId()I

    move-result p1

    int-to-short v3, p1

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getSubTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getText()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getPostTimestamp()J

    move-result-wide v7

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getNotificationTimestamp()J

    move-result-wide v9

    invoke-interface/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendImportantCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object p1

    .line 93
    invoke-virtual {p1}, Lio/reactivex/Completable;->toObservable()Lio/reactivex/Observable;

    move-result-object v3

    const-string p1, "alertsCommunicatorNotNull.sendImportantCallAlert(it.second.uid, notification.id.toShort(), notification.title, notification.subTitle, notification.text, notification.postTimestamp, notification.notificationTimestamp)\n                                .toObservable<Unit>()"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v2, v11

    .line 92
    invoke-direct/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;-><init>(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 94
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    invoke-interface {p0, v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;->queue(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)Lio/reactivex/Observable;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Observable;->subscribe()Lio/reactivex/disposables/Disposable;

    :goto_0
    return-void
.end method

.method private static final subscribeToGen1$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;

    .line 102
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;

    const/4 v11, 0x0

    if-nez v1, :cond_0

    move-object p1, v11

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getId()I

    move-result p1

    int-to-short v3, p1

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getSubTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getText()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getPostTimestamp()J

    move-result-wide v7

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getNotificationTimestamp()J

    move-result-wide v9

    invoke-interface/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendImportantMessageAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v11}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->sendNotification$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lio/reactivex/Completable;ZILjava/lang/Object;)V

    return-void
.end method

.method private static final subscribeToGen1$lambda-7(Ljava/lang/Integer;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final subscribeToGen1$lambda-8(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 11

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;

    const/4 v0, 0x0

    if-nez v1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v2

    const/4 v3, -0x1

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    invoke-interface/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendSilentCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object p1

    :goto_0
    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, p1, v1, v2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->sendNotification$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lio/reactivex/Completable;ZILjava/lang/Object;)V

    return-void
.end method

.method private static final subscribeToGen1$lambda-9(Ljava/lang/Integer;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private final subscribeToGen2()V
    .locals 8

    .line 131
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Listener for Gen2 subscribed, waiting for notifications to be pushed.."

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 137
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsManager:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;

    const/4 v1, 0x1

    new-array v2, v1, [Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->MISSED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    const/4 v5, 0x0

    aput-object v4, v2, v5

    invoke-interface {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;->getCurrentCallNotifications([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)Lio/reactivex/Observable;

    move-result-object v0

    .line 138
    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "alertsManager.getCurrentCallNotifications(CallState.MISSED)\n                        .distinctUntilChanged()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$Wv0w1eOVNyw1vMmeq7q9ziRKU3M;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$Wv0w1eOVNyw1vMmeq7q9ziRKU3M;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;)V

    .line 135
    invoke-direct {p0, v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->createSendingEventObservable(Lio/reactivex/Observable;Lio/reactivex/functions/Consumer;)V

    .line 147
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsManager:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;

    new-array v2, v1, [Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;->RECEIVED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;

    aput-object v4, v2, v5

    invoke-interface {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;->getCurrentMessagesNotifications([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;)Lio/reactivex/Observable;

    move-result-object v0

    .line 148
    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "alertsManager.getCurrentMessagesNotifications(SMSState.RECEIVED)\n                .distinctUntilChanged()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$Ix79mZ30ofUuHWPXzraS__oDEGM;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$Ix79mZ30ofUuHWPXzraS__oDEGM;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;)V

    .line 147
    invoke-direct {p0, v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->createSendingEventObservable(Lio/reactivex/Observable;Lio/reactivex/functions/Consumer;)V

    .line 158
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsManager:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;

    new-array v2, v1, [Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->RINGING:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    aput-object v4, v2, v5

    invoke-interface {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;->getRealtimeCallEvents([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)Lio/reactivex/Observable;

    move-result-object v0

    .line 159
    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "alertsManager.getRealtimeCallEvents(CallState.RINGING)\n                        .distinctUntilChanged()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$xWsk-i7bxiWhHjAB_7GIlnBggfI;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$xWsk-i7bxiWhHjAB_7GIlnBggfI;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;)V

    .line 157
    invoke-direct {p0, v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->createSendingEventObservable(Lio/reactivex/Observable;Lio/reactivex/functions/Consumer;)V

    .line 171
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsManager:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;

    new-array v2, v1, [Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->MISSED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    aput-object v4, v2, v5

    invoke-interface {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;->getRealtimeCallEvents([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)Lio/reactivex/Observable;

    move-result-object v0

    .line 172
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v6, 0x7d0

    invoke-virtual {v0, v6, v7, v2}, Lio/reactivex/Observable;->throttleFirst(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v0

    .line 173
    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "alertsManager.getRealtimeCallEvents(CallState.MISSED)\n                        .throttleFirst(2000, TimeUnit.MILLISECONDS)\n                        .distinctUntilChanged()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$8SuO7AE5W3DZRd9Vuw8uIS4xVuM;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$8SuO7AE5W3DZRd9Vuw8uIS4xVuM;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;)V

    .line 169
    invoke-direct {p0, v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->createSendingEventObservable(Lio/reactivex/Observable;Lio/reactivex/functions/Consumer;)V

    .line 181
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsManager:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;

    new-array v2, v3, [Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->DISMISSED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    aput-object v3, v2, v5

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->ANSWERED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    aput-object v3, v2, v1

    invoke-interface {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;->getRealtimeCallEvents([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$dnNLDmWaFUBriiT8qCHcyILdGf4;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$dnNLDmWaFUBriiT8qCHcyILdGf4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;)V

    invoke-direct {p0, v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->createSendingEventObservable(Lio/reactivex/Observable;Lio/reactivex/functions/Consumer;)V

    .line 190
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsManager:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;

    new-array v2, v1, [Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;->RECEIVED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;

    aput-object v3, v2, v5

    invoke-interface {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;->getSMSRealtimeEvent([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;)Lio/reactivex/Observable;

    move-result-object v0

    .line 191
    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "alertsManager.getSMSRealtimeEvent(SMSState.RECEIVED)\n                        .distinctUntilChanged()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$2IyLh5TL3qiWFD-t32NFEQxzT84;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$2IyLh5TL3qiWFD-t32NFEQxzT84;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;)V

    .line 188
    invoke-direct {p0, v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->createSendingEventObservable(Lio/reactivex/Observable;Lio/reactivex/functions/Consumer;)V

    .line 199
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsManager:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;

    new-array v1, v1, [Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;->DISMISSED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;

    aput-object v2, v1, v5

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;->getSMSRealtimeEvent([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;)Lio/reactivex/Observable;

    move-result-object v0

    .line 200
    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "alertsManager.getSMSRealtimeEvent(SMSState.DISMISSED)\n                .distinctUntilChanged()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$pGHpbAcgDpI0zUBUzesQ6QLv0iE;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$pGHpbAcgDpI0zUBUzesQ6QLv0iE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;)V

    .line 199
    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->createSendingEventObservable(Lio/reactivex/Observable;Lio/reactivex/functions/Consumer;)V

    .line 207
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsManager:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->appContext:Landroid/content/Context;

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;->invalidateNotifications(Landroid/content/Context;)V

    return-void
.end method

.method private static final subscribeToGen2$lambda-15(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 13

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    const-string v1, "notification"

    .line 141
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;

    const-string v2, "important call from existing"

    invoke-direct {p0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->logSendingMessage(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;)V

    .line 142
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;

    const/4 v1, 0x0

    if-nez v3, :cond_0

    move-object p1, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getId()I

    move-result p1

    int-to-short v5, p1

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getSubTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getText()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getPostTimestamp()J

    move-result-wide v9

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getNotificationTimestamp()J

    move-result-wide v11

    invoke-interface/range {v3 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendPreExistingCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    const/4 v2, 0x2

    invoke-static {p0, p1, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->sendNotification$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lio/reactivex/Completable;ZILjava/lang/Object;)V

    return-void
.end method

.method private static final subscribeToGen2$lambda-16(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 13

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;

    const-string v1, "notification"

    .line 150
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;

    const-string v2, "silent message"

    invoke-direct {p0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->logSendingMessage(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;)V

    .line 151
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;

    const/4 v1, 0x0

    if-nez v3, :cond_0

    move-object p1, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getId()I

    move-result p1

    int-to-short v5, p1

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getSubTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getText()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getPostTimestamp()J

    move-result-wide v9

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getNotificationTimestamp()J

    move-result-wide v11

    invoke-interface/range {v3 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendPreExistingMessageAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    const/4 v2, 0x2

    invoke-static {p0, p1, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->sendNotification$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lio/reactivex/Completable;ZILjava/lang/Object;)V

    return-void
.end method

.method private static final subscribeToGen2$lambda-17(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 13

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    const-string v1, "notification"

    .line 161
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;

    const-string v2, "important call realtime"

    invoke-direct {p0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->logSendingMessage(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;)V

    .line 162
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->isVoip()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 163
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getId()I

    move-result p1

    int-to-short v5, p1

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getSubTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getText()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getPostTimestamp()J

    move-result-wide v9

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getNotificationTimestamp()J

    move-result-wide v11

    invoke-interface/range {v3 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendSilentIncomingCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object v2

    goto :goto_0

    .line 164
    :cond_1
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getId()I

    move-result p1

    int-to-short v5, p1

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getSubTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getText()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getPostTimestamp()J

    move-result-wide v9

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getNotificationTimestamp()J

    move-result-wide v11

    invoke-interface/range {v3 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendImportantCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object v2

    :goto_0
    const/4 p1, 0x1

    .line 166
    invoke-direct {p0, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->sendNotification(Lio/reactivex/Completable;Z)V

    return-void
.end method

.method private static final subscribeToGen2$lambda-18(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 13

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    const-string v1, "notification"

    .line 176
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;

    const-string v2, "silent call"

    invoke-direct {p0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->logSendingMessage(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;)V

    .line 177
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;

    const/4 v1, 0x0

    if-nez v3, :cond_0

    move-object p1, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getId()I

    move-result p1

    int-to-short v5, p1

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getSubTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getText()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getPostTimestamp()J

    move-result-wide v9

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getNotificationTimestamp()J

    move-result-wide v11

    invoke-interface/range {v3 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendSilentCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    const/4 v2, 0x2

    invoke-static {p0, p1, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->sendNotification$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lio/reactivex/Completable;ZILjava/lang/Object;)V

    return-void
.end method

.method private static final subscribeToGen2$lambda-19(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 13

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    .line 183
    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;

    const-string v2, "clear call"

    invoke-direct {p0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->logSendingMessage(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;)V

    .line 184
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;

    const/4 v1, 0x0

    if-nez v3, :cond_0

    move-object p1, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getId()I

    move-result p1

    int-to-short v5, p1

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getSubTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getText()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getPostTimestamp()J

    move-result-wide v9

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getNotificationTimestamp()J

    move-result-wide v11

    invoke-interface/range {v3 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendClearCallIconAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    const/4 v2, 0x2

    invoke-static {p0, p1, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->sendNotification$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lio/reactivex/Completable;ZILjava/lang/Object;)V

    return-void
.end method

.method private static final subscribeToGen2$lambda-20(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 13

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;

    const-string v1, "notification"

    .line 194
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;

    const-string v2, "silent message"

    invoke-direct {p0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->logSendingMessage(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;)V

    .line 195
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;

    const/4 v1, 0x0

    if-nez v3, :cond_0

    move-object p1, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getId()I

    move-result p1

    int-to-short v5, p1

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getSubTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getText()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getPostTimestamp()J

    move-result-wide v9

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getNotificationTimestamp()J

    move-result-wide v11

    invoke-interface/range {v3 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendSilentMessageAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    const/4 v2, 0x2

    invoke-static {p0, p1, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->sendNotification$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lio/reactivex/Completable;ZILjava/lang/Object;)V

    return-void
.end method

.method private static final subscribeToGen2$lambda-21(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lkotlin/Pair;)V
    .locals 13

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;

    const-string v1, "notification"

    .line 202
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;

    const-string v2, "clear message"

    invoke-direct {p0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->logSendingMessage(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;)V

    .line 203
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->alertsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;

    const/4 v1, 0x0

    if-nez v3, :cond_0

    move-object p1, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getId()I

    move-result p1

    int-to-short v5, p1

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getSubTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getText()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getPostTimestamp()J

    move-result-wide v9

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getNotificationTimestamp()J

    move-result-wide v11

    invoke-interface/range {v3 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;->sendClearMessageIconAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    const/4 v2, 0x2

    invoke-static {p0, p1, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->sendNotification$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;Lio/reactivex/Completable;ZILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final destroy()V
    .locals 1

    .line 250
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->notificationsDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->dispose()V

    .line 251
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->dispose()V

    return-void
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 31
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final init()V
    .locals 5

    .line 49
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->dispose()V

    .line 50
    new-instance v0, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {v0}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 51
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->notificationsDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->dispose()V

    .line 52
    new-instance v0, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {v0}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->notificationsDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 55
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 56
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager$DefaultImpls;->connect$default(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$ICVfqYjNioAG7GcH2YeGuQhLv3U;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$ICVfqYjNioAG7GcH2YeGuQhLv3U;

    .line 57
    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v1

    .line 58
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$Sq0RI6lQGDPl9JSKdtrmnytTpjc;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$Sq0RI6lQGDPl9JSKdtrmnytTpjc;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;)V

    .line 76
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$fg_dEtuqIp3XBOq9dD3igfACZV4;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$fg_dEtuqIp3XBOq9dD3igfACZV4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;)V

    .line 58
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 55
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method
