.class public final Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl$registerReceiverGPS$1;
.super Landroid/content/BroadcastReceiver;
.source "LocationInfoProvider.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->registerReceiverGPS()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "powerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl$registerReceiverGPS$1",
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
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl$registerReceiverGPS$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;

    .line 104
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 107
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, "android.location.PROVIDERS_CHANGED"

    .line 109
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 110
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl$registerReceiverGPS$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->access$getLocationSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;)Lio/reactivex/subjects/BehaviorSubject;

    move-result-object p1

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl$registerReceiverGPS$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->access$checkLocation(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
