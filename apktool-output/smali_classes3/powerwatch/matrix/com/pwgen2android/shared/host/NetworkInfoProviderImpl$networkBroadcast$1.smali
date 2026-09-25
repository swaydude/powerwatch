.class public final Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl$networkBroadcast$1;
.super Landroid/content/BroadcastReceiver;
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
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "powerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl$networkBroadcast$1",
        "Landroid/content/BroadcastReceiver;",
        "onReceive",
        "",
        "context",
        "Landroid/content/Context;",
        "intent",
        "Landroid/content/Intent;",
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

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl$networkBroadcast$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;

    .line 56
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 59
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl$networkBroadcast$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;->access$getNetworkSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;)Lio/reactivex/subjects/BehaviorSubject;

    move-result-object p1

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl$networkBroadcast$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;->access$currentState(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;)Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method
