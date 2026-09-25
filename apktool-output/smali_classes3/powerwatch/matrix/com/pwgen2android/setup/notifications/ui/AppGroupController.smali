.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;
.super Ljava/lang/Object;
.source "NotificationsRecyclerViewAdapter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\"\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\t2\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;",
        "",
        "enableApp",
        "",
        "appInfo",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;",
        "enable",
        "",
        "getAppGroups",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;",
        "activityContext",
        "Landroid/content/Context;",
        "isAppEnabled",
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
.method public abstract enableApp(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;Z)V
.end method

.method public abstract getAppGroups(Landroid/content/Context;)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Map<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract isAppEnabled(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)Z
.end method
