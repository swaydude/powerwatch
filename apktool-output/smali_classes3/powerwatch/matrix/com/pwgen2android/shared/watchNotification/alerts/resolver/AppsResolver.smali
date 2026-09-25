.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolver;
.super Ljava/lang/Object;
.source "OtherAppsResolver.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\n"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolver;",
        "",
        "resolveAppNotification",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;",
        "notification",
        "Landroid/service/notification/StatusBarNotification;",
        "notificationEventType",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/NotificationEventType;",
        "shouldResolve",
        "",
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
.method public abstract resolveAppNotification(Landroid/service/notification/StatusBarNotification;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/NotificationEventType;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;
.end method

.method public abstract shouldResolve(Landroid/service/notification/StatusBarNotification;)Z
.end method
