.class final Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$toggleListener$1;
.super Lkotlin/jvm/internal/Lambda;
.source "NotificationsRecyclerViewAdapter.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "position",
        "",
        "enabled",
        "",
        "viewType",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$toggleListener$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method private static final invoke$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;ZLcom/tbruyelle/rxpermissions2/Permission;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$appInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    iget-object v0, p3, Lcom/tbruyelle/rxpermissions2/Permission;->name:Ljava/lang/String;

    const-string v1, "android.permission.READ_PHONE_STATE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 100
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->access$getResolverContainer$p(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;)Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;

    move-result-object v0

    if-eqz p2, :cond_0

    iget-boolean p2, p3, Lcom/tbruyelle/rxpermissions2/Permission;->granted:Z

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;->enableApp(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;Z)V

    .line 101
    iget-boolean p1, p3, Lcom/tbruyelle/rxpermissions2/Permission;->granted:Z

    if-eqz p1, :cond_1

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1d

    if-lt p1, p2, :cond_1

    .line 103
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->access$getActivityContext$p(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;)Landroid/content/Context;

    move-result-object p1

    const-string p2, "role"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.app.role.RoleManager"

    invoke-static {p1, p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Landroid/app/role/RoleManager;

    const-string p2, "android.app.role.CALL_SCREENING"

    .line 105
    invoke-virtual {p1, p2}, Landroid/app/role/RoleManager;->isRoleHeld(Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_1

    .line 106
    invoke-virtual {p1, p2}, Landroid/app/role/RoleManager;->createRequestRoleIntent(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "roleManager.createRequestRoleIntent(RoleManager.ROLE_CALL_SCREENING)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->access$getActivityContext$p(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;)Landroid/content/Context;

    move-result-object p2

    check-cast p2, Landroidx/fragment/app/FragmentActivity;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModelKt;->getREQUEST_ID()I

    move-result p3

    invoke-virtual {p2, p1, p3}, Landroidx/fragment/app/FragmentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 110
    :cond_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->notifyDataSetChanged()V

    :cond_2
    return-void
.end method

.method private static final invoke$lambda-1(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public static synthetic lambda$eYgY6JmtZTpT_QiXNbE5JjzfZ2s(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$toggleListener$1;->invoke$lambda-1(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$oOmUqEgOqFA94qqim2wgqVls-YI(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;ZLcom/tbruyelle/rxpermissions2/Permission;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$toggleListener$1;->invoke$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;ZLcom/tbruyelle/rxpermissions2/Permission;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 88
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;

    invoke-virtual {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$toggleListener$1;->invoke(IZLpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(IZLpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;)V
    .locals 2

    const-string v0, "viewType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$SimpleItem;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$SimpleItem;

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    if-ltz p1, :cond_3

    .line 90
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$toggleListener$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->getItemList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_3

    .line 91
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$SimpleItem;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$SimpleItem;

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$toggleListener$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->getItemList()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;->getAppInfo()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    move-result-object p1

    goto :goto_0

    .line 92
    :cond_1
    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$toggleListener$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->getItemList()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ActionHeader;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ActionHeader;->getAppInfo()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    move-result-object p1

    .line 94
    :goto_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object p3

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolverKt;->getMainGlobalDialerPackage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    if-eqz p2, :cond_3

    .line 96
    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$toggleListener$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;

    invoke-static {p3}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->access$getRxPermissions$p(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;)Lcom/tbruyelle/rxpermissions2/RxPermissions;

    move-result-object p3

    const-string v0, "android.permission.READ_PHONE_STATE"

    const-string v1, "android.permission.READ_CONTACTS"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/tbruyelle/rxpermissions2/RxPermissions;->requestEach([Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p3

    .line 97
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$toggleListener$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/-$$Lambda$NotificationsRecyclerViewAdapter$toggleListener$1$oOmUqEgOqFA94qqim2wgqVls-YI;

    invoke-direct {v1, v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/-$$Lambda$NotificationsRecyclerViewAdapter$toggleListener$1$oOmUqEgOqFA94qqim2wgqVls-YI;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;Z)V

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/-$$Lambda$NotificationsRecyclerViewAdapter$toggleListener$1$eYgY6JmtZTpT_QiXNbE5JjzfZ2s;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/-$$Lambda$NotificationsRecyclerViewAdapter$toggleListener$1$eYgY6JmtZTpT_QiXNbE5JjzfZ2s;

    invoke-virtual {p3, v1, p1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    goto :goto_1

    .line 115
    :cond_2
    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$toggleListener$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;

    invoke-static {p3}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->access$getResolverContainer$p(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;)Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;

    move-result-object p3

    invoke-interface {p3, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;->enableApp(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;Z)V

    :cond_3
    :goto_1
    return-void
.end method
