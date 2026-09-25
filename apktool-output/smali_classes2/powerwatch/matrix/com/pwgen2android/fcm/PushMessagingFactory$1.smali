.class public final Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory$1;
.super Landroid/content/BroadcastReceiver;
.source "PushMessagingFactory.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;-><init>(Landroid/content/Context;Lio/reactivex/subjects/PublishSubject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "powerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory$1",
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
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;

    .line 27
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string p2, "com.example.slobodanpavic.consultations.FIREBASE_MESSAGE"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/messaging/RemoteMessage;

    :goto_0
    if-eqz p1, :cond_1

    .line 34
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;->getMessageSubject()Lio/reactivex/subjects/PublishSubject;

    move-result-object p2

    invoke-virtual {p2, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
