.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/CellularCallAlertPosted;
.super Ljava/lang/Object;
.source "CellularCallAlertPosted.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR \u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R \u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u000f\"\u0004\u0008\u0015\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/CellularCallAlertPosted;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;",
        "isCallNotificationShown",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "appContext",
        "Landroid/content/Context;",
        "rxBus",
        "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;",
        "(Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V",
        "getAppContext",
        "()Landroid/content/Context;",
        "atomicCallReference",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;",
        "getAtomicCallReference",
        "()Ljava/util/concurrent/atomic/AtomicReference;",
        "setAtomicCallReference",
        "(Ljava/util/concurrent/atomic/AtomicReference;)V",
        "atomicSamsungIssueCategory",
        "",
        "getAtomicSamsungIssueCategory",
        "setAtomicSamsungIssueCategory",
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

.field private atomicCallReference:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;",
            ">;"
        }
    .end annotation
.end field

.field private atomicSamsungIssueCategory:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final isCallNotificationShown:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V
    .locals 1

    const-string v0, "isCallNotificationShown"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rxBus"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/CellularCallAlertPosted;->isCallNotificationShown:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/CellularCallAlertPosted;->appContext:Landroid/content/Context;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/CellularCallAlertPosted;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    .line 17
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/CellularCallAlertPosted;->atomicCallReference:Ljava/util/concurrent/atomic/AtomicReference;

    .line 18
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const-string p2, ""

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/CellularCallAlertPosted;->atomicSamsungIssueCategory:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method protected final getAppContext()Landroid/content/Context;
    .locals 1

    .line 15
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/CellularCallAlertPosted;->appContext:Landroid/content/Context;

    return-object v0
.end method

.method public final getAtomicCallReference()Ljava/util/concurrent/atomic/AtomicReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;",
            ">;"
        }
    .end annotation

    .line 17
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/CellularCallAlertPosted;->atomicCallReference:Ljava/util/concurrent/atomic/AtomicReference;

    return-object v0
.end method

.method public final getAtomicSamsungIssueCategory()Ljava/util/concurrent/atomic/AtomicReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/CellularCallAlertPosted;->atomicSamsungIssueCategory:Ljava/util/concurrent/atomic/AtomicReference;

    return-object v0
.end method

.method public resolveAlert(Landroid/service/notification/StatusBarNotification;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;
    .locals 4

    const-string v0, "statusBarNotification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v0

    .line 23
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$Companion;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$Companion;->getCALL_NOTIFICATION_CATEGORY()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Landroid/app/Notification;->category:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 25
    invoke-virtual {v0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MissedCallGroup"

    invoke-static {v1, v0, v3}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 26
    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getTag()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MissedCallNotifier"

    invoke-static {v1, v0, v3}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 27
    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getTag()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MissedCallNotification"

    invoke-static {v1, v0, v3}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    .line 28
    :cond_1
    :goto_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->MISSED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/CellularCallAlertPosted;->appContext:Landroid/content/Context;

    invoke-static {p1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->createCallNotification(Landroid/service/notification/StatusBarNotification;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;

    return-object p1
.end method

.method public final setAtomicCallReference(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/CellularCallAlertPosted;->atomicCallReference:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public final setAtomicSamsungIssueCategory(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/CellularCallAlertPosted;->atomicSamsungIssueCategory:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method
