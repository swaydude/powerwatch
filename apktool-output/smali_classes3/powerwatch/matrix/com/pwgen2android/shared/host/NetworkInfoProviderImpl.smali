.class public final Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;
.super Ljava/lang/Object;
.source "NetworkInfoProvider.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0011\u001a\u00020\u000cH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\tR\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "connectivityManager",
        "Landroid/net/ConnectivityManager;",
        "isEnabled",
        "",
        "()Z",
        "networkStatusChange",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;",
        "getNetworkStatusChange",
        "()Lio/reactivex/Observable;",
        "networkSubject",
        "Lio/reactivex/subjects/BehaviorSubject;",
        "currentState",
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
.field private final connectivityManager:Landroid/net/ConnectivityManager;

.field private final context:Landroid/content/Context;

.field private final networkSubject:Lio/reactivex/subjects/BehaviorSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/BehaviorSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;->context:Landroid/content/Context;

    .line 31
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;->currentState()Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/subjects/BehaviorSubject;->createDefault(Ljava/lang/Object;)Lio/reactivex/subjects/BehaviorSubject;

    move-result-object v0

    const-string v1, "createDefault(currentState())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;->networkSubject:Lio/reactivex/subjects/BehaviorSubject;

    const-string v1, "connectivity"

    .line 32
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Landroid/net/ConnectivityManager;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Landroid/net/ConnectivityManager;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    iput-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;->connectivityManager:Landroid/net/ConnectivityManager;

    .line 35
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-lt v2, v4, :cond_3

    if-eqz v1, :cond_4

    .line 37
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v2, 0xc

    .line 38
    invoke-virtual {p1, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    :goto_1
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 39
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Connected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Connected;

    goto :goto_2

    :cond_2
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Disconnected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Disconnected;

    :goto_2
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;

    .line 40
    invoke-virtual {v0, p1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 42
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl$1;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;)V

    check-cast p1, Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {v1, p1}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    goto :goto_3

    .line 56
    :cond_3
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl$networkBroadcast$1;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl$networkBroadcast$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;)V

    .line 62
    check-cast v0, Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_4
    :goto_3
    return-void
.end method

.method public static final synthetic access$currentState(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;)Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;
    .locals 0

    .line 29
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;->currentState()Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getNetworkSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;)Lio/reactivex/subjects/BehaviorSubject;
    .locals 0

    .line 29
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;->networkSubject:Lio/reactivex/subjects/BehaviorSubject;

    return-object p0
.end method

.method private final currentState()Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;
    .locals 1

    .line 70
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;->connectivityManager:Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_1

    .line 71
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 72
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Connected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Connected;

    goto :goto_0

    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Disconnected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Disconnected;

    :goto_0
    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;

    return-object v0

    .line 75
    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Disconnected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Disconnected;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;

    return-object v0
.end method


# virtual methods
.method public getNetworkStatusChange()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;",
            ">;"
        }
    .end annotation

    .line 79
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;->networkSubject:Lio/reactivex/subjects/BehaviorSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public isEnabled()Z
    .locals 2

    .line 82
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;->networkSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v0}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Connected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Connected;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
