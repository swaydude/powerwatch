.class public final Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl$1;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "NetworkInfoProvider.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "powerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl$1",
        "Landroid/net/ConnectivityManager$NetworkCallback;",
        "onCapabilitiesChanged",
        "",
        "network",
        "Landroid/net/Network;",
        "networkCapabilities",
        "Landroid/net/NetworkCapabilities;",
        "onLost",
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
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;

    .line 42
    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 1

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkCapabilities"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-super {p0, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V

    const/16 p1, 0xc

    .line 45
    invoke-virtual {p2, p1}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result p1

    .line 46
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;->access$getNetworkSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;)Lio/reactivex/subjects/BehaviorSubject;

    move-result-object p2

    if-eqz p1, :cond_0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Connected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Connected;

    goto :goto_0

    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Disconnected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Disconnected;

    :goto_0
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;

    invoke-virtual {p2, p1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 1

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onLost(Landroid/net/Network;)V

    .line 51
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;->access$getNetworkSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;)Lio/reactivex/subjects/BehaviorSubject;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Disconnected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Disconnected;

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method
