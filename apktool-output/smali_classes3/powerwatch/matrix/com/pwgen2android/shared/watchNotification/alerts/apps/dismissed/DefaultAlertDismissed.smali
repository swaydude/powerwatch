.class public Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/dismissed/DefaultAlertDismissed;
.super Ljava/lang/Object;
.source "DefaultAlertDismissed.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/dismissed/DefaultAlertDismissed;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;",
        "appContext",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "getAppContext",
        "()Landroid/content/Context;",
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
.field private final appContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/dismissed/DefaultAlertDismissed;->appContext:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method protected final getAppContext()Landroid/content/Context;
    .locals 1

    .line 9
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/dismissed/DefaultAlertDismissed;->appContext:Landroid/content/Context;

    return-object v0
.end method

.method public resolveAlert(Landroid/service/notification/StatusBarNotification;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;
    .locals 3

    const-string v0, "statusBarNotification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$Companion;->getCALL_NOTIFICATION_CATEGORY()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v1

    iget-object v1, v1, Landroid/app/Notification;->category:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 13
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->DISMISSED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/dismissed/DefaultAlertDismissed;->appContext:Landroid/content/Context;

    invoke-static {p1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->createCallNotification(Landroid/service/notification/StatusBarNotification;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;

    goto :goto_0

    .line 15
    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;->DISMISSED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/dismissed/DefaultAlertDismissed;->appContext:Landroid/content/Context;

    invoke-static {p1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->createMessageNotification(Landroid/service/notification/StatusBarNotification;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;

    :goto_0
    return-object p1
.end method
