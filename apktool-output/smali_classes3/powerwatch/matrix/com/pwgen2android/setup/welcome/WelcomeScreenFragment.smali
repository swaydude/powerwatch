.class public final Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "WelcomeScreenFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWelcomeScreenBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWelcomeScreenFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelcomeScreenFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n54#2,3:90\n1849#3,2:93\n*S KotlinDebug\n*F\n+ 1 WelcomeScreenFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment\n*L\n23#1:90,3\n69#1:93,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u000c\u0010\u0016\u001a\u00020\u0017*\u00020\u0018H\u0002R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u001a"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWelcomeScreenBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenViewModel;",
        "()V",
        "welcomeScreenViewModel",
        "getWelcomeScreenViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenViewModel;",
        "welcomeScreenViewModel$delegate",
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
        "fitImages",
        "",
        "Landroid/widget/LinearLayout;",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment$Companion;


# instance fields
.field private final welcomeScreenViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 23
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 20
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 23
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment$welcomeScreenViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment$welcomeScreenViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 90
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 92
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 23
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;->welcomeScreenViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final fitImages(Landroid/widget/LinearLayout;)V
    .locals 1

    .line 67
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/-$$Lambda$WelcomeScreenFragment$R-pZ8irmtMLU45fmHyj66FFKngE;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/-$$Lambda$WelcomeScreenFragment$R-pZ8irmtMLU45fmHyj66FFKngE;-><init>(Landroid/widget/LinearLayout;)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final fitImages$lambda-1(Landroid/widget/LinearLayout;)V
    .locals 9

    const-string v0, "$this_fitImages"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 93
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lkotlin/collections/IntIterator;

    invoke-virtual {v1}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v1

    .line 70
    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 71
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-double v3, v3

    const-wide/high16 v5, 0x3ff4000000000000L    # 1.25

    mul-double v3, v3, v5

    invoke-static {v3, v4}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result v3

    .line 73
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    int-to-float v5, v3

    float-to-double v5, v5

    const-wide v7, 0x3fe5975fcdc5f110L    # 0.6747283

    div-double/2addr v5, v7

    invoke-static {v5, v6}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result v5

    invoke-direct {v4, v3, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    if-nez v1, :cond_0

    .line 76
    div-int/lit8 v3, v3, 0x2

    neg-int v1, v3

    invoke-virtual {v4, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    goto :goto_1

    .line 77
    :cond_0
    div-int/lit8 v3, v3, 0x5

    invoke-virtual {v4, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 80
    :goto_1
    check-cast v4, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 82
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->invalidate()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final getWelcomeScreenViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenViewModel;
    .locals 1

    .line 23
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;->welcomeScreenViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenViewModel;

    return-object v0
.end method

.method public static synthetic lambda$R-pZ8irmtMLU45fmHyj66FFKngE(Landroid/widget/LinearLayout;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;->fitImages$lambda-1(Landroid/widget/LinearLayout;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;

    move-result-object v0

    return-object v0
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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenViewModel;
    .locals 1

    .line 27
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;->getWelcomeScreenViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 20
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0086

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 36
    sget p2, Lpowerwatch/matrix/com/pwgen2android/R$id;->carouselViewPager:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/viewpager/widget/ViewPager;

    .line 39
    new-instance p3, Landroid/util/DisplayMetrics;

    invoke-direct {p3}, Landroid/util/DisplayMetrics;-><init>()V

    .line 40
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0, p3}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 41
    :goto_1
    iget p3, p3, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 p3, p3, 0x4

    mul-int/lit8 p3, p3, 0x2

    neg-int p3, p3

    .line 42
    invoke-virtual {p2, p3}, Landroidx/viewpager/widget/ViewPager;->setPageMargin(I)V

    .line 44
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    const-string v2, "childFragmentManager"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroidx/viewpager/widget/ViewPager;->getId()I

    move-result v2

    invoke-direct {p3, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;-><init>(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V

    .line 45
    move-object v0, p3

    check-cast v0, Landroidx/viewpager/widget/PagerAdapter;

    invoke-virtual {p2, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 48
    move-object v0, p3

    check-cast v0, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    invoke-virtual {p2, v0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    const/4 v0, 0x1

    .line 52
    invoke-virtual {p2, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    const/4 v0, 0x3

    .line 53
    invoke-virtual {p2, v0}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 54
    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->notifyDataSetChanged()V

    return-object p1
.end method
