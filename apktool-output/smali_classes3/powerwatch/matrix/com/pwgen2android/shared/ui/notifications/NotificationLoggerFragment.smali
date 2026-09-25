.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "NotificationLoggerFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNotificationLoggerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationLoggerFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,77:1\n54#2,3:78\n*S KotlinDebug\n*F\n+ 1 NotificationLoggerFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment\n*L\n24#1:78,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0008\u0010\u0016\u001a\u00020\u0017H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;",
        "()V",
        "internalLoggerViewModel",
        "getInternalLoggerViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;",
        "internalLoggerViewModel$delegate",
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
        "onDestroyView",
        "",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$Companion;


# instance fields
.field private final internalLoggerViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 24
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 22
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 24
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$internalLoggerViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$internalLoggerViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 78
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 80
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 24
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;->internalLoggerViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getInternalLoggerViewModel(Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;
    .locals 0

    .line 22
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;->getInternalLoggerViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;

    move-result-object p0

    return-object p0
.end method

.method private final getInternalLoggerViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;
    .locals 1

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;->internalLoggerViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;

    return-object v0
.end method

.method public static synthetic lambda$8dVI00-8L3vBZVzaxHyR2QOZDH8(Landroidx/recyclerview/widget/RecyclerView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerRecyclerAdapter;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;->onCreateView$lambda-0(Landroidx/recyclerview/widget/RecyclerView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerRecyclerAdapter;Landroid/view/View;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;

    move-result-object v0

    return-object v0
.end method

.method private static final onCreateView$lambda-0(Landroidx/recyclerview/widget/RecyclerView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerRecyclerAdapter;Landroid/view/View;)V
    .locals 0

    const-string p2, "$adapter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerRecyclerAdapter;->getItemCount()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

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

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 22
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;
    .locals 1

    .line 33
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;->getInternalLoggerViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;

    move-result-object v0

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0068

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 39
    sget p2, Lpowerwatch/matrix/com/pwgen2android/R$id;->logs_list:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 40
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerRecyclerAdapter;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$onCreateView$adapter$1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$onCreateView$adapter$1;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-direct {p3, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerRecyclerAdapter;-><init>(Ljava/util/List;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    .line 41
    move-object v0, p3

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 42
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    .line 43
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    .line 44
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 46
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;->getInternalLoggerViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;->getLogsObservableField()Landroidx/databinding/ObservableField;

    move-result-object v0

    .line 47
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$onCreateView$1;

    invoke-direct {v1, p3, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$onCreateView$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerRecyclerAdapter;Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;)V

    check-cast v1, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    const v0, 0x7f0801ea

    .line 53
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatButton;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/-$$Lambda$NotificationLoggerFragment$8dVI00-8L3vBZVzaxHyR2QOZDH8;

    invoke-direct {v1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/-$$Lambda$NotificationLoggerFragment$8dVI00-8L3vBZVzaxHyR2QOZDH8;-><init>(Landroidx/recyclerview/widget/RecyclerView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerRecyclerAdapter;)V

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;->getInternalLoggerViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;

    move-result-object p2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;->onCreateView(Landroid/content/Context;)V

    return-object p1
.end method

.method public onDestroyView()V
    .locals 2

    .line 63
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onDestroyView()V

    .line 64
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;->getInternalLoggerViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;->onDestroyView(Landroid/content/Context;)V

    return-void
.end method
