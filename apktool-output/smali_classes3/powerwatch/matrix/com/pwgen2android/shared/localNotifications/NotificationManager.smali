.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;
.super Ljava/lang/Object;
.source "NotificationManager.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0008H&J(\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&J$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J(\u0010\u0011\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0008H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J(\u0010\u0016\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;",
        "",
        "dismissBatteryNotification",
        "",
        "context",
        "Landroid/content/Context;",
        "dismissNotification",
        "notificationID",
        "",
        "showBatteryNotification",
        "deviceID",
        "",
        "title",
        "message",
        "showConnectionNotification",
        "realtimeDataNotification",
        "Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;",
        "showGoalsAchievedMessage",
        "showOTAFailedNotification",
        "showOTAProgressNotification",
        "progress",
        "showOTASuccessNotification",
        "showWatchConnectedMessage",
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


# virtual methods
.method public abstract dismissBatteryNotification(Landroid/content/Context;)V
.end method

.method public abstract dismissNotification(Landroid/content/Context;I)V
.end method

.method public abstract showBatteryNotification(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract showConnectionNotification(Landroid/content/Context;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;)V
.end method

.method public abstract showGoalsAchievedMessage(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract showOTAFailedNotification(Landroid/content/Context;)V
.end method

.method public abstract showOTAProgressNotification(Landroid/content/Context;I)V
.end method

.method public abstract showOTASuccessNotification(Landroid/content/Context;)V
.end method

.method public abstract showWatchConnectedMessage(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
.end method
