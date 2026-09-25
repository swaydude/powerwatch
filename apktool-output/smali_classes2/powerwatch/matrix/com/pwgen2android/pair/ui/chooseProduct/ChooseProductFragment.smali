.class public final Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "ChooseProductFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$WatchPagerAdapter;,
        Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseProductBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChooseProductFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseProductFragment.kt\npowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n54#2,3:115\n1#3:118\n*S KotlinDebug\n*F\n+ 1 ChooseProductFragment.kt\npowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment\n*L\n32#1:115,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001a\u001bB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u000e\u001a\u00020\u000fH\u0014J\u0008\u0010\u0010\u001a\u00020\u0003H\u0014J\u0008\u0010\u0011\u001a\u00020\u000fH\u0014J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseProductBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;",
        "()V",
        "chooseProductViewModel",
        "getChooseProductViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;",
        "chooseProductViewModel$delegate",
        "Lkotlin/Lazy;",
        "productsViewPager",
        "Landroidx/viewpager/widget/ViewPager;",
        "rxPermissions",
        "Lcom/tbruyelle/rxpermissions2/RxPermissions;",
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
        "WatchPagerAdapter",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$Companion;


# instance fields
.field private final chooseProductViewModel$delegate:Lkotlin/Lazy;

.field private productsViewPager:Landroidx/viewpager/widget/ViewPager;

.field private rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 32
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 29
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 32
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$chooseProductViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$chooseProductViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 115
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 117
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 32
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->chooseProductViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getChooseProductViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;
    .locals 1

    .line 32
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->chooseProductViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;

    return-object v0
.end method

.method public static synthetic lambda$GbPEVCmyWMVnAxJL20jKrODQ0N0(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$WatchPagerAdapter;Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$WatchPagerAdapter;Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$t-KTIO4yALYX1QVq3sR28a5zYcQ(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;

    move-result-object v0

    return-object v0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->getChooseProductViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$WatchPagerAdapter;Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;Landroid/view/View;)V
    .locals 1

    const-string p2, "$pagerAdapter"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$WatchPagerAdapter;->getProducts()Ljava/util/List;

    move-result-object p0

    iget-object p2, p1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->productsViewPager:Landroidx/viewpager/widget/ViewPager;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result p2

    if-ltz p2, :cond_0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v0

    if-gt p2, v0, :cond_0

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatch2;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatch2;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;

    :goto_0
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;

    .line 69
    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->getChooseProductViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;

    move-result-object p1

    invoke-virtual {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->onProductChosen(Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;)V

    return-void

    :cond_1
    const-string p0, "productsViewPager"

    .line 68
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;
    .locals 1

    .line 38
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->getChooseProductViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 29
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b004c

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->setRootView(Landroid/view/View;)V

    .line 48
    new-instance p1, Lcom/tbruyelle/rxpermissions2/RxPermissions;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/tbruyelle/rxpermissions2/RxPermissions;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

    .line 50
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->getChooseProductViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;

    move-result-object p1

    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$onCreateView$1;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$onCreateView$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;)V

    check-cast p2, Lkotlin/jvm/functions/Function0;

    invoke-virtual {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->setBtRequestCallback(Lkotlin/jvm/functions/Function0;)V

    .line 53
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const p2, 0x7f080081

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductFragment$t-KTIO4yALYX1QVq3sR28a5zYcQ;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductFragment$t-KTIO4yALYX1QVq3sR28a5zYcQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;)V

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    :goto_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_2

    move-object p1, p2

    goto :goto_1

    :cond_2
    const p3, 0x7f0801cd

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RadioGroup;

    :goto_1
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 59
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->getRootView()Landroid/view/View;

    move-result-object p3

    if-nez p3, :cond_3

    move-object p3, p2

    goto :goto_2

    :cond_3
    const v0, 0x7f0801c6

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroidx/viewpager/widget/ViewPager;

    :goto_2
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->productsViewPager:Landroidx/viewpager/widget/ViewPager;

    .line 60
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$WatchPagerAdapter;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "childFragmentManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$WatchPagerAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Landroid/widget/RadioGroup;)V

    .line 61
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->productsViewPager:Landroidx/viewpager/widget/ViewPager;

    const-string v0, "productsViewPager"

    if-eqz p1, :cond_9

    move-object v1, p3

    check-cast v1, Landroidx/viewpager/widget/PagerAdapter;

    invoke-virtual {p1, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 62
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->productsViewPager:Landroidx/viewpager/widget/ViewPager;

    if-eqz p1, :cond_8

    move-object v0, p3

    check-cast v0, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 64
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    const p2, 0x7f0801e5

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Landroid/widget/TextView;

    :goto_3
    if-nez p2, :cond_5

    goto :goto_4

    :cond_5
    const p1, 0x7f0f0070

    .line 65
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    .line 64
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    :goto_4
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_5

    :cond_6
    const p2, 0x7f08009c

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    if-nez p1, :cond_7

    goto :goto_5

    :cond_7
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductFragment$GbPEVCmyWMVnAxJL20jKrODQ0N0;

    invoke-direct {p2, p3, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductFragment$GbPEVCmyWMVnAxJL20jKrODQ0N0;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$WatchPagerAdapter;Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;)V

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    :goto_5
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    return-object p1

    .line 62
    :cond_8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p2

    .line 61
    :cond_9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p2
.end method
