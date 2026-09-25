.class public final Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "NotificationsRecyclerViewAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNotificationsRecyclerViewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationsRecyclerViewAdapter.kt\npowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,214:1\n211#2,2:215\n*S KotlinDebug\n*F\n+ 1 NotificationsRecyclerViewAdapter.kt\npowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter\n*L\n79#1:215,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u0008\u00100\u001a\u00020(H\u0016J\u0010\u00101\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0016J\u0018\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0016J\u0018\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u0002062\u0006\u0010\u0019\u001a\u00020(H\u0016J\u0018\u00107\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u000c2\u0006\u00109\u001a\u00020(H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u000c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012RJ\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\u0008(\u0017\u0012\u0013\u0012\u00110\u0018\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\u0008(\u0019\u0012\u0004\u0012\u00020\u001a0\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR \u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020!0 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000Rc\u0010&\u001aG\u0012\u0013\u0012\u00110(\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\u0008()\u0012\u0013\u0012\u00110*\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\u0008(+\u0012\u0013\u0012\u00110\u0018\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\u0008(\u0019\u0012\u0004\u0012\u00020\u001a0\'8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008,\u0010-\"\u0004\u0008.\u0010/\u00a8\u0006:"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;",
        "activityContext",
        "Landroid/content/Context;",
        "resolverContainer",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;",
        "rxPermissions",
        "Lcom/tbruyelle/rxpermissions2/RxPermissions;",
        "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V",
        "appGroupMap",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;",
        "getAppGroupMap",
        "()Ljava/util/Map;",
        "setAppGroupMap",
        "(Ljava/util/Map;)V",
        "clickListener",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "name",
        "viewHolder",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;",
        "viewType",
        "",
        "getClickListener",
        "()Lkotlin/jvm/functions/Function2;",
        "setClickListener",
        "(Lkotlin/jvm/functions/Function2;)V",
        "itemList",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;",
        "getItemList",
        "()Ljava/util/List;",
        "setItemList",
        "(Ljava/util/List;)V",
        "toggleListener",
        "Lkotlin/Function3;",
        "",
        "position",
        "",
        "enabled",
        "getToggleListener",
        "()Lkotlin/jvm/functions/Function3;",
        "setToggleListener",
        "(Lkotlin/jvm/functions/Function3;)V",
        "getItemCount",
        "getItemViewType",
        "onBindViewHolder",
        "holder",
        "onCreateViewHolder",
        "parent",
        "Landroid/view/ViewGroup;",
        "onGroupExpanded",
        "group",
        "groupPositionInList",
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
.field private final activityContext:Landroid/content/Context;

.field private appGroupMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;",
            ">;>;"
        }
    .end annotation
.end field

.field private clickListener:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;",
            "-",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private itemList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;",
            ">;"
        }
    .end annotation
.end field

.field private final resolverContainer:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;

.field private final rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

.field private toggleListener:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Boolean;",
            "-",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V
    .locals 1

    const-string v0, "activityContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resolverContainer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rxPermissions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 68
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->activityContext:Landroid/content/Context;

    .line 69
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->resolverContainer:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;

    .line 70
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

    .line 73
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    check-cast p3, Ljava/util/List;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->itemList:Ljava/util/List;

    .line 74
    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-direct {p3}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast p3, Ljava/util/Map;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->appGroupMap:Ljava/util/Map;

    .line 78
    invoke-interface {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;->getAppGroups(Landroid/content/Context;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->appGroupMap:Ljava/util/Map;

    .line 215
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    .line 80
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;

    .line 81
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 82
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->getItemList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->getItemList()Ljava/util/List;

    move-result-object p3

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p3, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 88
    :cond_0
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$toggleListener$1;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$toggleListener$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;)V

    check-cast p1, Lkotlin/jvm/functions/Function3;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->toggleListener:Lkotlin/jvm/functions/Function3;

    .line 119
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$clickListener$1;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$clickListener$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;)V

    check-cast p1, Lkotlin/jvm/functions/Function2;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->clickListener:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;Lcom/tbruyelle/rxpermissions2/RxPermissions;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 70
    new-instance p3, Lcom/tbruyelle/rxpermissions2/RxPermissions;

    .line 68
    move-object p4, p1

    check-cast p4, Landroidx/fragment/app/FragmentActivity;

    .line 70
    invoke-direct {p3, p4}, Lcom/tbruyelle/rxpermissions2/RxPermissions;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    .line 68
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V

    return-void
.end method

.method public static final synthetic access$getActivityContext$p(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;)Landroid/content/Context;
    .locals 0

    .line 68
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->activityContext:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic access$getResolverContainer$p(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;)Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;
    .locals 0

    .line 68
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->resolverContainer:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;

    return-object p0
.end method

.method public static final synthetic access$getRxPermissions$p(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;)Lcom/tbruyelle/rxpermissions2/RxPermissions;
    .locals 0

    .line 68
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

    return-object p0
.end method

.method public static final synthetic access$onGroupExpanded(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;I)V
    .locals 0

    .line 68
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->onGroupExpanded(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;I)V

    return-void
.end method

.method public static synthetic lambda$-ItioVzbgO6kZBf1RdK4ZuWtMXc(Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->onBindViewHolder$lambda-1(Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static synthetic lambda$XOm4USELumtoRu9WouDaiJ_URZg(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->onBindViewHolder$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static synthetic lambda$_u3zBLdowexR0ZptG3zQWaGuQXw(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->onBindViewHolder$lambda-3(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;Landroid/view/View;)V

    return-void
.end method

.method private static final onBindViewHolder$lambda-1(Landroid/widget/CompoundButton;Z)V
    .locals 0

    return-void
.end method

.method private static final onBindViewHolder$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;Landroid/widget/CompoundButton;Z)V
    .locals 1

    const-string p3, "this$0"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$itemType"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->getToggleListener()Lkotlin/jvm/functions/Function3;

    move-result-object p3

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->getAdapterPosition()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    invoke-interface {p3, v0, p4, p2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 173
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->getAdapterPosition()I

    move-result p1

    const/16 p2, 0x32

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->notifyItemRangeChanged(II)V

    :cond_0
    return-void
.end method

.method private static final onBindViewHolder$lambda-3(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;Landroid/view/View;)V
    .locals 0

    const-string p3, "this$0"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$itemType"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->getClickListener()Lkotlin/jvm/functions/Function2;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final onGroupExpanded(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;I)V
    .locals 2

    .line 141
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;->getColapsed()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;->setColapsed(Z)V

    .line 142
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;->getColapsed()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 143
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->itemList:Ljava/util/List;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$onGroupExpanded$1;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$onGroupExpanded$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p2, v0}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    goto :goto_0

    .line 145
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->itemList:Ljava/util/List;

    add-int/lit8 p2, p2, 0x1

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->appGroupMap:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_1
    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p2, p1}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    :goto_0
    return-void
.end method


# virtual methods
.method public final getAppGroupMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;",
            ">;>;"
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->appGroupMap:Ljava/util/Map;

    return-object v0
.end method

.method public final getClickListener()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 119
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->clickListener:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    .line 149
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->itemList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getItemList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;",
            ">;"
        }
    .end annotation

    .line 73
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->itemList:Ljava/util/List;

    return-object v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 151
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->itemList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;->getType()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;->getType()I

    move-result p1

    return p1
.end method

.method public final getToggleListener()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 88
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->toggleListener:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 68
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->onBindViewHolder(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;I)V
    .locals 4

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->itemList:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;

    .line 156
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->getAppName()Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-result-object v1

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;->getTitle()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;->getType()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;

    move-result-object v1

    .line 159
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$SimpleItem;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$SimpleItem;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 161
    :cond_0
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$SimpleItem;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$SimpleItem;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;->getAppInfo()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    move-result-object v2

    goto :goto_0

    .line 162
    :cond_1
    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ActionHeader;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ActionHeader;->getAppInfo()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    move-result-object v2

    .line 164
    :goto_0
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 165
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->getAppToggle()Landroidx/appcompat/widget/SwitchCompat;

    move-result-object v3

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ActionHeader;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ActionHeader;->getActionTitle()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v3, v0}, Landroidx/appcompat/widget/SwitchCompat;->setText(Ljava/lang/CharSequence;)V

    .line 168
    :cond_2
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->getAppToggle()Landroidx/appcompat/widget/SwitchCompat;

    move-result-object v0

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/-$$Lambda$NotificationsRecyclerViewAdapter$-ItioVzbgO6kZBf1RdK4ZuWtMXc;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/-$$Lambda$NotificationsRecyclerViewAdapter$-ItioVzbgO6kZBf1RdK4ZuWtMXc;

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/SwitchCompat;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 169
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->getAppToggle()Landroidx/appcompat/widget/SwitchCompat;

    move-result-object v0

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->resolverContainer:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;

    invoke-interface {v3, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;->isAppEnabled(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)Z

    move-result v2

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 170
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->getAppToggle()Landroidx/appcompat/widget/SwitchCompat;

    move-result-object v0

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/-$$Lambda$NotificationsRecyclerViewAdapter$XOm4USELumtoRu9WouDaiJ_URZg;

    invoke-direct {v2, p0, p1, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/-$$Lambda$NotificationsRecyclerViewAdapter$XOm4USELumtoRu9WouDaiJ_URZg;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;)V

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SwitchCompat;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 178
    :cond_3
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$Header;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$Header;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 179
    :cond_4
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->itemList:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;

    .line 180
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;->getColapsed()Z

    move-result p2

    if-eqz p2, :cond_6

    .line 181
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->getArrow()Landroid/widget/ImageView;

    move-result-object p2

    if-nez p2, :cond_5

    goto :goto_1

    :cond_5
    const v0, 0x7f0700cb

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 183
    :cond_6
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->getArrow()Landroid/widget/ImageView;

    move-result-object p2

    if-nez p2, :cond_7

    goto :goto_1

    :cond_7
    const v0, 0x7f0700a6

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 185
    :goto_1
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->getArrow()Landroid/widget/ImageView;

    move-result-object p2

    if-nez p2, :cond_8

    goto :goto_2

    :cond_8
    const/high16 v0, 0x42b40000    # 90.0f

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setRotation(F)V

    .line 187
    :goto_2
    iget-object p2, p1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/-$$Lambda$NotificationsRecyclerViewAdapter$_u3zBLdowexR0ZptG3zQWaGuQXw;

    invoke-direct {v0, p0, p1, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/-$$Lambda$NotificationsRecyclerViewAdapter$_u3zBLdowexR0ZptG3zQWaGuQXw;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_9
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 68
    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;
    .locals 4

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$Header;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$Header;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$Header;->getType()I

    move-result v0

    if-ne p2, v0, :cond_0

    const v0, 0x7f0b00ac

    goto :goto_0

    .line 131
    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;->getType()I

    move-result v0

    if-ne p2, v0, :cond_1

    const v0, 0x7f0b00ab

    goto :goto_0

    .line 132
    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$NotCollapsibleHeader;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$NotCollapsibleHeader;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$NotCollapsibleHeader;->getType()I

    move-result v0

    if-ne p2, v0, :cond_2

    const v0, 0x7f0b00ad

    goto :goto_0

    :cond_2
    const v0, 0x7f0b00aa

    .line 136
    :goto_0
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;

    .line 137
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->activityContext:Landroid/content/Context;

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v0, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string v0, "from(activityContext).inflate(layout, parent, false)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    invoke-direct {v1, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;-><init>(Landroid/view/View;I)V

    return-object v1
.end method

.method public final setAppGroupMap(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->appGroupMap:Ljava/util/Map;

    return-void
.end method

.method public final setClickListener(Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;",
            "-",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->clickListener:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public final setItemList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->itemList:Ljava/util/List;

    return-void
.end method

.method public final setToggleListener(Lkotlin/jvm/functions/Function3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Boolean;",
            "-",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->toggleListener:Lkotlin/jvm/functions/Function3;

    return-void
.end method
