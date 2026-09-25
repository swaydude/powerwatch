.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/NotificationManager;
.super Ljava/lang/Object;
.source "NotificationManager.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/NotificationManager$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008f\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H&J\u0010\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/NotificationManager;",
        "",
        "dismissNotification",
        "",
        "context",
        "Landroid/content/Context;",
        "notificationID",
        "",
        "showConnectionNotification",
        "showOTAFailedNotification",
        "showOTAProgressNotification",
        "progress",
        "showOTASuccessNotification",
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
.field public static final CONNECT_NOTIFICATION_ID:I = 0x28e

.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/NotificationManager$Companion;

.field public static final OTA_NOTIFICATION_ID:I = 0x28f


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/NotificationManager$Companion;->$$INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/NotificationManager$Companion;

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/NotificationManager;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/NotificationManager$Companion;

    return-void
.end method


# virtual methods
.method public abstract dismissNotification(Landroid/content/Context;I)V
.end method

.method public abstract showConnectionNotification(Landroid/content/Context;)V
.end method

.method public abstract showOTAFailedNotification(Landroid/content/Context;)V
.end method

.method public abstract showOTAProgressNotification(Landroid/content/Context;I)V
.end method

.method public abstract showOTASuccessNotification(Landroid/content/Context;)V
.end method
