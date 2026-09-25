.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/ViberPostedAlert;
.super Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/DefaultAlertPosted;
.source "ViberPostedAlert.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/ViberPostedAlert;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/DefaultAlertPosted;",
        "isCallNotificationShown",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "appContext",
        "Landroid/content/Context;",
        "(Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/content/Context;)V",
        "resolveAlert",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;",
        "statusBarNotification",
        "Landroid/service/notification/StatusBarNotification;",
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
.field private final isCallNotificationShown:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/content/Context;)V
    .locals 1

    const-string v0, "isCallNotificationShown"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/DefaultAlertPosted;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/ViberPostedAlert;->isCallNotificationShown:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public resolveAlert(Landroid/service/notification/StatusBarNotification;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;
    .locals 2

    const-string v0, "statusBarNotification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/ViberPostedAlert;->isCallNotificationShown:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$Companion;->getCALL_NOTIFICATION_CATEGORY()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v1

    iget-object v1, v1, Landroid/app/Notification;->category:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/ViberPostedAlert;->isCallNotificationShown:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 15
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/DefaultAlertPosted;->resolveAlert(Landroid/service/notification/StatusBarNotification;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;

    move-result-object p1

    return-object p1

    .line 18
    :cond_0
    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v0

    iget-object v0, v0, Landroid/app/Notification;->category:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/DefaultAlertPosted;->resolveAlert(Landroid/service/notification/StatusBarNotification;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
