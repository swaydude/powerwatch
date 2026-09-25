.class public final Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ActionHeader;
.super Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;
.source "NotificationsRecyclerViewAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ActionHeader"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ActionHeader;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;",
        "title",
        "",
        "collapsed",
        "",
        "headerIndex",
        "",
        "appInfo",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;",
        "actionTitle",
        "(Ljava/lang/String;ZILpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;Ljava/lang/String;)V",
        "getActionTitle",
        "()Ljava/lang/String;",
        "getAppInfo",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;",
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
.field private final actionTitle:Ljava/lang/String;

.field private final appInfo:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZILpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appInfo"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionTitle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    invoke-direct {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;-><init>(Ljava/lang/String;ZI)V

    .line 59
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ActionHeader;->appInfo:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ActionHeader;->actionTitle:Ljava/lang/String;

    .line 62
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ActionHeader;->setType(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;)V

    return-void
.end method


# virtual methods
.method public final getActionTitle()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ActionHeader;->actionTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getAppInfo()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;
    .locals 1

    .line 59
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ActionHeader;->appInfo:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    return-object v0
.end method
