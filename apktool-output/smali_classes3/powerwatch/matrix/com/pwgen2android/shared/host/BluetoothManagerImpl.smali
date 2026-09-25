.class public final Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;
.super Ljava/lang/Object;
.source "BluetoothManager.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0008\u0010\u0011\u001a\u00020\u0012H\u0016J\'\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00142\u0012\u0010\u0015\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u000c0\u0016\"\u00020\u000cH\u0016\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u000c\u0012\n \r*\u0004\u0018\u00010\u000c0\u000c0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u0010\u00a8\u0006\u0018"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "bluetoothAdapter",
        "Landroid/bluetooth/BluetoothAdapter;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/bluetooth/BluetoothAdapter;Landroid/content/Context;)V",
        "bluetoothReceiver",
        "Landroid/content/BroadcastReceiver;",
        "bluetoothStateChangeSubject",
        "Lio/reactivex/subjects/ReplaySubject;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;",
        "kotlin.jvm.PlatformType",
        "isEnabled",
        "",
        "()Z",
        "enable",
        "",
        "getChangeState",
        "Lio/reactivex/Observable;",
        "states",
        "",
        "([Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Lio/reactivex/Observable;",
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
.field private final bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

.field private final bluetoothReceiver:Landroid/content/BroadcastReceiver;

.field private final bluetoothStateChangeSubject:Lio/reactivex/subjects/ReplaySubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/ReplaySubject<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothAdapter;Landroid/content/Context;)V
    .locals 2

    const-string v0, "bluetoothAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    const/4 p1, 0x1

    .line 36
    invoke-static {p1}, Lio/reactivex/subjects/ReplaySubject;->createWithSize(I)Lio/reactivex/subjects/ReplaySubject;

    move-result-object p1

    const-string v0, "createWithSize<BluetoothState>(1)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;->bluetoothStateChangeSubject:Lio/reactivex/subjects/ReplaySubject;

    .line 37
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl$bluetoothReceiver$1;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl$bluetoothReceiver$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;)V

    check-cast v0, Landroid/content/BroadcastReceiver;

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;->bluetoothReceiver:Landroid/content/BroadcastReceiver;

    .line 65
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;

    goto :goto_0

    :cond_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;

    :goto_0
    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    invoke-virtual {p1, v1}, Lio/reactivex/subjects/ReplaySubject;->onNext(Ljava/lang/Object;)V

    .line 67
    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.bluetooth.device.action.FOUND"

    .line 68
    invoke-virtual {p1, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.bluetooth.adapter.action.STATE_CHANGED"

    .line 69
    invoke-virtual {p1, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.bluetooth.adapter.action.DISCOVERY_FINISHED"

    .line 70
    invoke-virtual {p1, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.bluetooth.adapter.action.DISCOVERY_STARTED"

    .line 71
    invoke-virtual {p1, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 73
    invoke-virtual {p2, v0, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public static final synthetic access$getBluetoothStateChangeSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;)Lio/reactivex/subjects/ReplaySubject;
    .locals 0

    .line 33
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;->bluetoothStateChangeSubject:Lio/reactivex/subjects/ReplaySubject;

    return-object p0
.end method

.method private static final getChangeState$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Unknown;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Unknown;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final getChangeState$lambda-1([Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Z
    .locals 4

    const-string v0, "$states"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    add-int/lit8 v2, v2, 0x1

    .line 83
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    return v1
.end method

.method public static synthetic lambda$R22tSg5u5iM5wqC3rLrHaFwFKLE(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;->getChangeState$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$kk90q7HrsyrdMW4Dud4nAJty4FQ([Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;->getChangeState$lambda-1([Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public enable()V
    .locals 1

    .line 92
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->enable()Z

    return-void
.end method

.method public varargs getChangeState([Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;",
            ">;"
        }
    .end annotation

    const-string v0, "states"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;->bluetoothStateChangeSubject:Lio/reactivex/subjects/ReplaySubject;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$BluetoothManagerImpl$R22tSg5u5iM5wqC3rLrHaFwFKLE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$BluetoothManagerImpl$R22tSg5u5iM5wqC3rLrHaFwFKLE;

    .line 80
    invoke-virtual {v0, v1}, Lio/reactivex/subjects/ReplaySubject;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    .line 81
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$BluetoothManagerImpl$kk90q7HrsyrdMW4Dud4nAJty4FQ;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$BluetoothManagerImpl$kk90q7HrsyrdMW4Dud4nAJty4FQ;-><init>([Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "bluetoothStateChangeSubject\n                .filter { it != BluetoothState.Unknown }\n                .filter { newState ->\n                    for (wantedState in states) {\n                        if (wantedState == newState) {\n                            return@filter true\n                        }\n                    }\n                    false\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 33
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public isEnabled()Z
    .locals 1

    .line 60
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    return v0
.end method
