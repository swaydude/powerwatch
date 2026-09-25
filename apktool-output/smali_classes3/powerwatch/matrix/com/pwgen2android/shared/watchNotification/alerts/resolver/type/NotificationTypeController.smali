.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;
.super Ljava/lang/Object;
.source "NotificationTypeController.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0008H&J\u0016\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0010\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00122\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;",
        "",
        "clearMemory",
        "",
        "enableApp",
        "appIdentifier",
        "",
        "enable",
        "",
        "appType",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;",
        "getSupportedApps",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationApp;",
        "activityContext",
        "Landroid/content/Context;",
        "isAppEnabled",
        "listenForChange",
        "Lio/reactivex/Observable;",
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
.method public abstract clearMemory()V
.end method

.method public abstract enableApp(Ljava/lang/String;Z)V
.end method

.method public abstract enableApp(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;Z)V
.end method

.method public abstract getSupportedApps(Landroid/content/Context;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationApp;",
            ">;"
        }
    .end annotation
.end method

.method public abstract isAppEnabled(Ljava/lang/String;)Z
.end method

.method public abstract isAppEnabled(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;)Z
.end method

.method public abstract listenForChange(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method
