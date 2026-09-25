.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;
.super Ljava/lang/Object;
.source "ResolverContainer.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nResolverContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolverContainer.kt\npowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1547#2:76\n1618#2,3:77\n1547#2:80\n1618#2,3:81\n1547#2:84\n1618#2,3:85\n764#2:88\n855#2:89\n2468#2,3:90\n856#2:93\n1849#2,2:94\n*S KotlinDebug\n*F\n+ 1 ResolverContainer.kt\npowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl\n*L\n23#1:76\n23#1:77,3\n31#1:80\n31#1:81,3\n37#1:84\n37#1:85,3\n38#1:88\n38#1:89\n38#1:90,3\n38#1:93\n70#1:94,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;",
        "otherAppsResolver",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;",
        "whiteListResolver",
        "notificationTypeController",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;)V",
        "otherAppsListGroupList",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;",
        "enableAllApps",
        "",
        "enable",
        "",
        "enableApp",
        "appInfo",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;",
        "getAppGroups",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;",
        "",
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


# instance fields
.field private final notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

.field private otherAppsListGroupList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;",
            ">;"
        }
    .end annotation
.end field

.field private final otherAppsResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;

.field private final whiteListResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;)V
    .locals 1

    const-string v0, "otherAppsResolver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whiteListResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationTypeController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->otherAppsResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;

    .line 12
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->whiteListResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;

    .line 13
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

    .line 16
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->otherAppsListGroupList:Ljava/util/List;

    return-void
.end method

.method private final enableAllApps(Z)V
    .locals 3

    .line 70
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->otherAppsListGroupList:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 94
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;

    .line 71
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->otherAppsResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;->getAppInfo()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;->enableApp(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public enableApp(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;Z)V
    .locals 2

    const-string v0, "appInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;->getAppInfoType()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;

    move-result-object v0

    .line 58
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$NotificationType;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$NotificationType;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;->enableApp(Ljava/lang/String;Z)V

    goto :goto_0

    .line 59
    :cond_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$Whitelist;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$Whitelist;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->whiteListResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;->enableApp(Ljava/lang/String;Z)V

    goto :goto_0

    .line 60
    :cond_1
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$OtherApp;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$OtherApp;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->otherAppsResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;->enableApp(Ljava/lang/String;Z)V

    goto :goto_0

    .line 61
    :cond_2
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$OtherAppMasterSwitch;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$OtherAppMasterSwitch;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 62
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->otherAppsResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;->enableApp(Ljava/lang/String;Z)V

    .line 63
    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->enableAllApps(Z)V

    :cond_3
    :goto_0
    return-void
.end method

.method public getAppGroups(Landroid/content/Context;)Ljava/util/Map;
    .locals 12
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

    const-string v0, "activityContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    .line 22
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$NonCollapsibleHeader;

    const v2, 0x7f0f0144

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "activityContext.getString(R.string.notification_types)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$NonCollapsibleHeader;-><init>(Ljava/lang/String;I)V

    .line 23
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

    invoke-interface {v2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;->getSupportedApps(Landroid/content/Context;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 76
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .line 77
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 78
    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationApp;

    .line 24
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationApp;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationApp;->getAppIdentifier()Ljava/lang/String;

    move-result-object v6

    sget-object v9, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$NotificationType;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$NotificationType;

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;

    invoke-direct {v7, v8, v6, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;)V

    .line 25
    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;->getAppName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$NonCollapsibleHeader;->getHeaderIndex()I

    move-result v9

    invoke-direct {v6, v8, v7, v9}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;I)V

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 79
    :cond_0
    check-cast v4, Ljava/util/List;

    .line 27
    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;

    const v2, 0x7f0f01a8

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, "activityContext.getString(R.string.supported_apps)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x1

    invoke-direct {v1, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;-><init>(Ljava/lang/String;ZI)V

    .line 31
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->whiteListResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;

    invoke-interface {v2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;->getAppInfo(Landroid/content/Context;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 80
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 81
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 82
    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    .line 31
    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;->getAppName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;->getHeaderIndex()I

    move-result v10

    invoke-direct {v8, v9, v7, v10}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;I)V

    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 83
    :cond_1
    check-cast v6, Ljava/util/List;

    .line 33
    invoke-interface {v0, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x2

    .line 37
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->otherAppsResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;

    invoke-interface {v2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;->getAppInfo(Landroid/content/Context;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 84
    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v7, Ljava/util/Collection;

    .line 85
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 86
    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    .line 37
    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;->getAppName()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9, v5, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;I)V

    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 87
    :cond_2
    check-cast v7, Ljava/util/List;

    .line 84
    check-cast v7, Ljava/lang/Iterable;

    .line 88
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .line 89
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;

    .line 38
    move-object v9, v6

    check-cast v9, Ljava/lang/Iterable;

    .line 90
    instance-of v10, v9, Ljava/util/Collection;

    if-eqz v10, :cond_5

    move-object v10, v9

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_5

    :cond_4
    const/4 v8, 0x1

    goto :goto_4

    .line 91
    :cond_5
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;

    .line 38
    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;->getAppInfo()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    move-result-object v10

    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;->getAppInfo()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    move-result-object v11

    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const/4 v8, 0x0

    :goto_4
    if-eqz v8, :cond_3

    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 93
    :cond_7
    check-cast v2, Ljava/util/List;

    .line 88
    check-cast v2, Ljava/util/Collection;

    .line 38
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    .line 37
    iput-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->otherAppsListGroupList:Ljava/util/List;

    .line 40
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;

    sget-object v5, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const v5, 0x7f0f014c

    invoke-virtual {p1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v5, "activityContext.getString(R.string.other_apps)"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v5, v4, [Ljava/lang/Object;

    iget-object v6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->otherAppsListGroupList:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v3

    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {p1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v4, "java.lang.String.format(format, *args)"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, p1, v3, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;-><init>(Ljava/lang/String;ZI)V

    .line 42
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->otherAppsListGroupList:Ljava/util/List;

    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public isAppEnabled(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)Z
    .locals 2

    const-string v0, "appInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;->getAppInfoType()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;

    move-result-object v0

    .line 49
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$NotificationType;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$NotificationType;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;->isAppEnabled(Ljava/lang/String;)Z

    move-result p1

    goto :goto_1

    .line 50
    :cond_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$Whitelist;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$Whitelist;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->whiteListResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;->isAppEnabled(Ljava/lang/String;)Z

    move-result p1

    goto :goto_1

    .line 51
    :cond_1
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$OtherApp;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$OtherApp;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$OtherAppMasterSwitch;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$OtherAppMasterSwitch;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;->otherAppsResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;->isAppEnabled(Ljava/lang/String;)Z

    move-result p1

    :goto_1
    return p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
