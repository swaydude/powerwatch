.class public final Lpowerwatch/matrix/com/pwgen2android/fcm/PushNotificationsFactory;
.super Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;
.source "PushNotificationsFactory.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/fcm/PushNotificationsFactory$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/fcm/PushNotificationsFactory;",
        "Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;",
        "context",
        "Landroid/content/Context;",
        "contentExtractor",
        "Lpowerwatch/matrix/com/pwgen2android/fcm/FCMContentExtractor;",
        "messageSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lcom/google/firebase/messaging/RemoteMessage;",
        "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/fcm/FCMContentExtractor;Lio/reactivex/subjects/PublishSubject;)V",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/fcm/PushNotificationsFactory$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final contentExtractor:Lpowerwatch/matrix/com/pwgen2android/fcm/FCMContentExtractor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/fcm/PushNotificationsFactory$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/fcm/PushNotificationsFactory$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/fcm/PushNotificationsFactory;->Companion:Lpowerwatch/matrix/com/pwgen2android/fcm/PushNotificationsFactory$Companion;

    .line 26
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/fcm/PushNotificationsFactory;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/fcm/PushNotificationsFactory;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/fcm/FCMContentExtractor;Lio/reactivex/subjects/PublishSubject;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lpowerwatch/matrix/com/pwgen2android/fcm/FCMContentExtractor;",
            "Lio/reactivex/subjects/PublishSubject<",
            "Lcom/google/firebase/messaging/RemoteMessage;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentExtractor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageSubject"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;-><init>(Lio/reactivex/subjects/PublishSubject;)V

    .line 22
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/PushNotificationsFactory;->contentExtractor:Lpowerwatch/matrix/com/pwgen2android/fcm/FCMContentExtractor;

    .line 31
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/fcm/PushNotificationsFactory;->TAG:Ljava/lang/String;

    const-string p3, "PushNotificationsFactory initialized.."

    .line 30
    invoke-static {p2, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    new-instance p2, Landroid/content/IntentFilter;

    const-string p3, "com.example.slobodanpavic.consultations.FIREBASE_MESSAGE_ARRIVED"

    invoke-direct {p2, p3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/16 p3, -0x3e7

    .line 36
    invoke-virtual {p2, p3}, Landroid/content/IntentFilter;->setPriority(I)V

    .line 37
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/fcm/PushNotificationsFactory$1;

    invoke-direct {p3}, Lpowerwatch/matrix/com/pwgen2android/fcm/PushNotificationsFactory$1;-><init>()V

    check-cast p3, Landroid/content/BroadcastReceiver;

    invoke-virtual {p1, p3, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/fcm/FCMContentExtractor;Lio/reactivex/subjects/PublishSubject;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 22
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/fcm/FCMContentExtractorImpl;

    invoke-direct {p2}, Lpowerwatch/matrix/com/pwgen2android/fcm/FCMContentExtractorImpl;-><init>()V

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/fcm/FCMContentExtractor;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 23
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p3

    const-string p4, "create()"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/fcm/PushNotificationsFactory;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/fcm/FCMContentExtractor;Lio/reactivex/subjects/PublishSubject;)V

    return-void
.end method
