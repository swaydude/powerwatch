.class public final Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "NotificationsFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNotificationsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationsFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,107:1\n54#2,3:108\n*S KotlinDebug\n*F\n+ 1 NotificationsFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment\n*L\n37#1:108,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;",
        "()V",
        "notificationsViewModel",
        "getNotificationsViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;",
        "notificationsViewModel$delegate",
        "Lkotlin/Lazy;",
        "getBindingVariable",
        "",
        "getViewModel",
        "layoutRes",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$Companion;


# instance fields
.field private final notificationsViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 37
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 35
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 37
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$notificationsViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$notificationsViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 108
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 110
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 37
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->notificationsViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getNotificationsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;
    .locals 1

    .line 37
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->notificationsViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;

    return-object v0
.end method

.method public static synthetic lambda$jYhp7tRpxuwMVhIfa0SIQGiJkTM(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$t8wggu-Ohs96dkrEQFs3zwn8a9I(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;

    move-result-object v0

    return-object v0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->getNotificationsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->getNotificationsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->onSaveClicked()V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method protected getBindingVariable()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;
    .locals 1

    .line 41
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->getNotificationsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 35
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b006a

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->setRootView(Landroid/view/View;)V

    .line 51
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    move-object p1, p2

    goto :goto_0

    :cond_0
    const p3, 0x7f080165

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const p3, 0x7f0f0060

    .line 52
    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, "getString(R.string.button_save)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonText(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    :goto_1
    if-nez p1, :cond_2

    goto :goto_2

    .line 54
    :cond_2
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/-$$Lambda$NotificationsFragment$t8wggu-Ohs96dkrEQFs3zwn8a9I;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/-$$Lambda$NotificationsFragment$t8wggu-Ohs96dkrEQFs3zwn8a9I;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;)V

    invoke-static {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    :goto_2
    if-nez p1, :cond_3

    goto :goto_3

    .line 58
    :cond_3
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/-$$Lambda$NotificationsFragment$jYhp7tRpxuwMVhIfa0SIQGiJkTM;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/-$$Lambda$NotificationsFragment$jYhp7tRpxuwMVhIfa0SIQGiJkTM;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;)V

    invoke-static {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    :goto_3
    if-nez p1, :cond_4

    goto :goto_4

    :cond_4
    const p3, 0x7f0f0145

    .line 62
    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, "getString(R.string.notifications)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    .line 64
    :goto_4
    new-instance p3, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 65
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->getRefreshView()Landroidx/databinding/ObservableField;

    move-result-object v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$onCreateView$3;

    invoke-direct {v1, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$onCreateView$3;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    check-cast v1, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 70
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$onCreateView$4;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$onCreateView$4;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    check-cast v1, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 82
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;

    move-result-object p1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->onCreateView(Landroid/content/Context;)V

    .line 84
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->getNotificationsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->getAppsResolver()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;

    .line 85
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->getNotificationsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->getWhiteListResolver()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->getNotificationsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->getNotificationTypeController()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

    move-result-object v2

    .line 84
    invoke-direct {p1, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;)V

    .line 86
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;Lcom/tbruyelle/rxpermissions2/RxPermissions;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 88
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_5

    :cond_5
    const p2, 0x7f080059

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 91
    :goto_5
    new-instance p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    .line 92
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    if-nez p2, :cond_6

    goto :goto_6

    .line 93
    :cond_6
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    :goto_6
    if-nez p2, :cond_7

    goto :goto_7

    .line 95
    :cond_7
    iget-object p1, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 97
    :goto_7
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
