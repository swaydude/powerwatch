.class public final Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager$DefaultImpls;
.super Ljava/lang/Object;
.source "NotificationManager.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic showConnectionNotification$default(Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;Landroid/content/Context;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 31
    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;->showConnectionNotification(Landroid/content/Context;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: showConnectionNotification"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
