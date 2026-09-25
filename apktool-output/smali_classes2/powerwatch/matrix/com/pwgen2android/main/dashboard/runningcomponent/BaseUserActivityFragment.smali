.class public abstract Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "BaseUserActivityFragment.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseUserActivityFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseUserActivityFragment.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,141:1\n54#2,3:142\n54#2,3:145\n54#2,3:148\n*S KotlinDebug\n*F\n+ 1 BaseUserActivityFragment.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment\n*L\n32#1:142,3\n33#1:145,3\n34#1:148,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\u0016\u001a\u00020\u0017H\u0002J\u0008\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0008\u0010\u001c\u001a\u00020\u001dH\u0014J\u0008\u0010\u001e\u001a\u00020\u001fH$J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0008\u0010$\u001a\u0004\u0018\u00010%2\u0008\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0008\u0010(\u001a\u00020\u0017H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\tR\u001b\u0010\u000c\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000b\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u000b\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006)"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "()V",
        "controlViewViewModel",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;",
        "getControlViewViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;",
        "controlViewViewModel$delegate",
        "Lkotlin/Lazy;",
        "heartRateViewModel",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;",
        "getHeartRateViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;",
        "heartRateViewModel$delegate",
        "mapsViewModel",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;",
        "getMapsViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;",
        "mapsViewModel$delegate",
        "addControlViewFragment",
        "",
        "addHeartRateFragment",
        "addMapsFragment",
        "it",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;",
        "getBindingVariable",
        "",
        "isMainScreen",
        "",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onDestroyView",
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
.field private final controlViewViewModel$delegate:Lkotlin/Lazy;

.field private final heartRateViewModel$delegate:Lkotlin/Lazy;

.field private final mapsViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 30
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 32
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    const/4 v1, 0x0

    .line 142
    move-object v2, v1

    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 143
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 144
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v3

    .line 32
    iput-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->controlViewViewModel$delegate:Lkotlin/Lazy;

    .line 147
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment$special$$inlined$viewModel$default$2;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment$special$$inlined$viewModel$default$2;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v3

    .line 33
    iput-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->heartRateViewModel$delegate:Lkotlin/Lazy;

    .line 150
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment$special$$inlined$viewModel$default$3;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment$special$$inlined$viewModel$default$3;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 34
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->mapsViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final addControlViewFragment()V
    .locals 3

    .line 106
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment;

    move-result-object v0

    .line 107
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    .line 108
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v1

    .line 109
    check-cast v0, Landroidx/fragment/app/Fragment;

    const v2, 0x7f0800d0

    invoke-virtual {v1, v2, v0}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    .line 110
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    return-void
.end method

.method private final addHeartRateFragment()V
    .locals 3

    .line 114
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;

    move-result-object v0

    .line 116
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    .line 117
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v1

    .line 118
    check-cast v0, Landroidx/fragment/app/Fragment;

    const v2, 0x7f0800b3

    invoke-virtual {v1, v2, v0}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    .line 119
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    return-void
.end method

.method private final addMapsFragment(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;)V
    .locals 2

    .line 124
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const v1, 0x7f080168

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-nez v0, :cond_2

    .line 126
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType$Google;

    if-eqz v0, :cond_0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$Companion;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->isMainScreen()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$Companion;->newInstance(Z)Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/Fragment;

    goto :goto_0

    .line 127
    :cond_0
    instance-of p1, p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType$Baidu;

    if-eqz p1, :cond_1

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment$Companion;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->isMainScreen()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment$Companion;->newInstance(Z)Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 129
    :goto_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    .line 130
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    .line 131
    invoke-virtual {v0, v1, p1}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    .line 132
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto :goto_1

    .line 127
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_1
    return-void
.end method

.method private final getControlViewViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;
    .locals 1

    .line 32
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->controlViewViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;

    return-object v0
.end method

.method private final getHeartRateViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;
    .locals 1

    .line 33
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->heartRateViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;

    return-object v0
.end method

.method private final getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;
    .locals 1

    .line 34
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->mapsViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    return-object v0
.end method

.method public static synthetic lambda$J-oQcGFkD8jJnxENsaAV-vyrrlo(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$UJ_A0ar6FcRd7C0HoZdS-FXfw28(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$XiWKwjaIKdrU2KuIct9K0GdrHuc(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;)V

    return-void
.end method

.method public static synthetic lambda$fBd_QaNj3e8_BaAtGvmYm2AxRSc(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->onCreateView$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->onRightButtonClicked()V

    return-void
.end method

.method private static final onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 66
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;->getHasLocations()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "it"

    .line 67
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->addMapsFragment(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;)V

    .line 69
    :cond_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;->getHasHeartRate()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const v1, 0x7f0800b3

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-nez v0, :cond_1

    .line 70
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->addHeartRateFragment()V

    .line 73
    :cond_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->isMainScreen()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;->getHasLocations()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;->getHasHeartRate()Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const v0, 0x7f0800d0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    move-result-object p1

    if-nez p1, :cond_3

    .line 74
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->addControlViewFragment()V

    :cond_3
    return-void
.end method

.method private static final onCreateView$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Error in BaseActivity Fragment: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 79
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

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

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 29
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method protected abstract isMainScreen()Z
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->setRootView(Landroid/view/View;)V

    .line 43
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const p2, 0x7f080165

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    :goto_0
    if-eqz p1, :cond_1

    const p2, 0x7f0f002d

    .line 45
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const-string p3, "getString(R.string.activity_title)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    const p2, 0x7f0f01db

    .line 46
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const-string p3, "getString(R.string.user_activity_screen_right_text)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonText(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    .line 48
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/-$$Lambda$BaseUserActivityFragment$UJ_A0ar6FcRd7C0HoZdS-FXfw28;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/-$$Lambda$BaseUserActivityFragment$UJ_A0ar6FcRd7C0HoZdS-FXfw28;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;)V

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    .line 52
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/-$$Lambda$BaseUserActivityFragment$J-oQcGFkD8jJnxENsaAV-vyrrlo;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/-$$Lambda$BaseUserActivityFragment$J-oQcGFkD8jJnxENsaAV-vyrrlo;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;)V

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    .line 56
    :cond_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getControlViewViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;

    move-result-object p2

    invoke-virtual {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->setControlViewViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;)V

    .line 57
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getHeartRateViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;

    move-result-object p2

    invoke-virtual {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->setHeartRateChartViewModel(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;)V

    .line 58
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object p2

    invoke-virtual {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->setMapsViewModel(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;)V

    .line 61
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getMapData()Lio/reactivex/subjects/BehaviorSubject;

    move-result-object p2

    const-wide/16 v0, 0x1

    .line 62
    invoke-virtual {p2, v0, v1}, Lio/reactivex/subjects/BehaviorSubject;->skip(J)Lio/reactivex/Observable;

    move-result-object p2

    .line 63
    invoke-virtual {p2}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object p2

    .line 64
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/-$$Lambda$BaseUserActivityFragment$XiWKwjaIKdrU2KuIct9K0GdrHuc;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/-$$Lambda$BaseUserActivityFragment$XiWKwjaIKdrU2KuIct9K0GdrHuc;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;)V

    .line 77
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/-$$Lambda$BaseUserActivityFragment$fBd_QaNj3e8_BaAtGvmYm2AxRSc;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/-$$Lambda$BaseUserActivityFragment$fBd_QaNj3e8_BaAtGvmYm2AxRSc;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;)V

    .line 64
    invoke-virtual {p2, p3, v0}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p2

    .line 61
    invoke-virtual {p1, p2}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 102
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 137
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onDestroyView()V

    .line 138
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method
