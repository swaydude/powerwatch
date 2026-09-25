.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;
.super Ljava/lang/Object;
.source "TimezoneAdvertizer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u0012J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0008\u0010\u0019\u001a\u00020\u0012H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;",
        "",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "context",
        "Landroid/content/Context;",
        "bluetoothManager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;",
        "timeZoneListener",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListener;",
        "pwBleServer",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListener;Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;)V",
        "compositeDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "getCompositeDisposable",
        "()Lio/reactivex/disposables/CompositeDisposable;",
        "notifyRegisteredDevices",
        "",
        "timestamp",
        "",
        "adjustReason",
        "",
        "onCreate",
        "startServer",
        "stopServer",
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
.field private final bluetoothManager:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

.field private final compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final context:Landroid/content/Context;

.field private final pwBleServer:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;

.field private final timeZoneListener:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListener;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListener;Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;)V
    .locals 1

    const-string v0, "communicator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "context"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "bluetoothManager"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "timeZoneListener"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "pwBleServer"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->context:Landroid/content/Context;

    .line 11
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->bluetoothManager:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

    .line 12
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->timeZoneListener:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListener;

    .line 13
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->pwBleServer:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;

    .line 15
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListener;Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 13
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;

    invoke-direct {p5, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 10
    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListener;Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;)V

    return-void
.end method

.method public static synthetic lambda$0rKya4vvPoE-YewrLT3ZI6q5hP4(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->onCreate$lambda-1(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$fsVSBps40FDJvq2Qp904pAOQbLk(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->onCreate$lambda-3(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$fznLOD8d_ulwfqQcZRcaYre2aQo(Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->onCreate$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)V

    return-void
.end method

.method public static synthetic lambda$uPPVVFuALWGiSA0skweWgcjSpzc(Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->onCreate$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason;)V

    return-void
.end method

.method private final notifyRegisteredDevices(JB)V
    .locals 1

    .line 68
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->pwBleServer:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;

    invoke-virtual {v0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->notifyRegisteredDevices(JB)V

    return-void
.end method

.method private static final onCreate$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 21
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->context:Landroid/content/Context;

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->startServer(Landroid/content/Context;)V

    goto :goto_0

    .line 23
    :cond_0
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->stopServer()V

    :goto_0
    return-void
.end method

.method private static final onCreate$lambda-1(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final onCreate$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 34
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason$TimeZoneChange;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason$TimeZoneChange;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    .line 35
    :cond_0
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason$TimeChange;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason$TimeChange;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    .line 37
    :goto_0
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->bluetoothManager:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

    invoke-interface {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-direct {p0, v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->notifyRegisteredDevices(JB)V

    :cond_1
    return-void

    .line 35
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final onCreate$lambda-3(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private final startServer(Landroid/content/Context;)V
    .locals 1

    .line 53
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->pwBleServer:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->startServer(Landroid/content/Context;)V

    return-void
.end method

.method private final stopServer()V
    .locals 1

    .line 60
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->pwBleServer:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->stopServer()V

    return-void
.end method


# virtual methods
.method public final getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;
    .locals 1

    .line 15
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    return-object v0
.end method

.method public final onCreate()V
    .locals 5

    .line 18
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->bluetoothManager:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

    const/4 v2, 0x2

    new-array v2, v2, [Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;->getChangeState([Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Lio/reactivex/Observable;

    move-result-object v1

    .line 19
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/-$$Lambda$CurrentTimeService$fznLOD8d_ulwfqQcZRcaYre2aQo;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/-$$Lambda$CurrentTimeService$fznLOD8d_ulwfqQcZRcaYre2aQo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;)V

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/-$$Lambda$CurrentTimeService$0rKya4vvPoE-YewrLT3ZI6q5hP4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/-$$Lambda$CurrentTimeService$0rKya4vvPoE-YewrLT3ZI6q5hP4;

    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 30
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;->timeZoneListener:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListener;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListener;->timeZoneChanged()Lio/reactivex/Observable;

    move-result-object v1

    .line 31
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/-$$Lambda$CurrentTimeService$uPPVVFuALWGiSA0skweWgcjSpzc;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/-$$Lambda$CurrentTimeService$uPPVVFuALWGiSA0skweWgcjSpzc;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;)V

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/-$$Lambda$CurrentTimeService$fsVSBps40FDJvq2Qp904pAOQbLk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/-$$Lambda$CurrentTimeService$fsVSBps40FDJvq2Qp904pAOQbLk;

    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method
