.class public final Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "Gen1PairingFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGen1PairingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Gen1PairingFragment.kt\npowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,91:1\n54#2,3:92\n*S KotlinDebug\n*F\n+ 1 Gen1PairingFragment.kt\npowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment\n*L\n26#1:92,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;",
        "()V",
        "gen1PairingViewModel",
        "getGen1PairingViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;",
        "gen1PairingViewModel$delegate",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$Companion;


# instance fields
.field private final gen1PairingViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 26
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 24
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 26
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$gen1PairingViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$gen1PairingViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 92
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 94
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 26
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->gen1PairingViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getGen1PairingViewModel(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;)Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;
    .locals 0

    .line 24
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->getGen1PairingViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;

    move-result-object p0

    return-object p0
.end method

.method private final getGen1PairingViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;
    .locals 1

    .line 26
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->gen1PairingViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;

    return-object v0
.end method

.method public static synthetic lambda$98RFoCVpuNIlcaNNP7Z7vNAV1xM(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$LkDm_UUVAT-m4TTo146Ms9YMWfw(Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->onCreateView$lambda-1(Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic lambda$gKl1_bDUPAH-QSQRl0ppIwV1foo(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->onCreateView$lambda-2(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;

    move-result-object v0

    return-object v0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onCreateView$lambda-1(Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;Ljava/lang/Boolean;)V
    .locals 3

    const-string v0, "$rootView"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "approved"

    .line 51
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    const p2, 0x7f0801e5

    .line 52
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x7f0f0151

    .line 53
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    :goto_0
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/FoundDevicesRecyclerAdapter;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->getGen1PairingViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->getFoundDevices()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 55
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$onCreateView$2$adapter$1;

    invoke-direct {v2, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$onCreateView$2$adapter$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 54
    invoke-direct {p2, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/FoundDevicesRecyclerAdapter;-><init>(Ljava/util/List;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    .line 59
    sget v0, Lpowerwatch/matrix/com/pwgen2android/R$id;->devices_list:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 61
    move-object v0, p2

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 62
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    .line 63
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    .line 64
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 66
    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->getGen1PairingViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->getFoundDevices()Landroidx/databinding/ObservableField;

    move-result-object p0

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$onCreateView$2$1;

    invoke-direct {v0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$onCreateView$2$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/FoundDevicesRecyclerAdapter;Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;)V

    check-cast v0, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {p0, v0}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 72
    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->getGen1PairingViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;

    move-result-object p0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->onCreateView(Landroid/content/Context;)V

    :cond_1
    return-void
.end method

.method private static final onCreateView$lambda-2(Ljava/lang/Throwable;)V
    .locals 0

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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;
    .locals 1

    .line 30
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->getGen1PairingViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b005d

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const p2, 0x7f08015d

    .line 40
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;

    const p3, 0x7f080081

    .line 42
    invoke-virtual {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$Gen1PairingFragment$98RFoCVpuNIlcaNNP7Z7vNAV1xM;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$Gen1PairingFragment$98RFoCVpuNIlcaNNP7Z7vNAV1xM;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;)V

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p2

    .line 47
    new-instance p3, Lcom/tbruyelle/rxpermissions2/RxPermissions;

    move-object v0, p0

    check-cast v0, Landroidx/fragment/app/Fragment;

    invoke-direct {p3, v0}, Lcom/tbruyelle/rxpermissions2/RxPermissions;-><init>(Landroidx/fragment/app/Fragment;)V

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    .line 48
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    .line 47
    invoke-virtual {p3, v0}, Lcom/tbruyelle/rxpermissions2/RxPermissions;->request([Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p3

    .line 49
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v0

    invoke-virtual {p3, v0}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object p3

    .line 50
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$Gen1PairingFragment$LkDm_UUVAT-m4TTo146Ms9YMWfw;

    invoke-direct {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$Gen1PairingFragment$LkDm_UUVAT-m4TTo146Ms9YMWfw;-><init>(Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;)V

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$Gen1PairingFragment$gKl1_bDUPAH-QSQRl0ppIwV1foo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$Gen1PairingFragment$gKl1_bDUPAH-QSQRl0ppIwV1foo;

    invoke-virtual {p3, v0, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p3

    .line 46
    invoke-virtual {p2, p3}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-object p1
.end method
