.class public final Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;
.super Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;
.source "PushMessagingFactory.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 \u00082\u00020\u0001:\u0001\u0008B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;",
        "Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;",
        "context",
        "Landroid/content/Context;",
        "messageSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lcom/google/firebase/messaging/RemoteMessage;",
        "(Landroid/content/Context;Lio/reactivex/subjects/PublishSubject;)V",
        "Companion",
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


# static fields
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory$Companion;

.field private static final TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;->Companion:Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory$Companion;

    .line 18
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/reactivex/subjects/PublishSubject;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/reactivex/subjects/PublishSubject<",
            "Lcom/google/firebase/messaging/RemoteMessage;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageSubject"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;-><init>(Lio/reactivex/subjects/PublishSubject;)V

    .line 23
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;->TAG:Ljava/lang/String;

    const-string v0, "PushNotificationsFactory initialized.."

    .line 22
    invoke-static {p2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory$1;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;)V

    check-cast p2, Landroid/content/BroadcastReceiver;

    .line 37
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "com.example.slobodanpavic.consultations.FIREBASE_MESSAGE_ARRIVED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lio/reactivex/subjects/PublishSubject;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 14
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p2

    const-string p3, "create()"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    :cond_0
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;-><init>(Landroid/content/Context;Lio/reactivex/subjects/PublishSubject;)V

    return-void
.end method
