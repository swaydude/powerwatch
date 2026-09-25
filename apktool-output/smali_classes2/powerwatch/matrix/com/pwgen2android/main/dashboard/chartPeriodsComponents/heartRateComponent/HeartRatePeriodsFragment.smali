.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment;
.super Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;
.source "HeartRatePeriodsFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHeartRatePeriodsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRatePeriodsFragment.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,54:1\n54#2,3:55\n*S KotlinDebug\n*F\n+ 1 HeartRatePeriodsFragment.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment\n*L\n40#1:55,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0018\u0000 \u00162\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0014J\u0016\u0010\r\u001a\u0006\u0012\u0002\u0008\u00030\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0016\u0010\u0011\u001a\u0006\u0012\u0002\u0008\u00030\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0008\u0010\u0012\u001a\u00020\u0002H\u0014J\u0016\u0010\u0013\u001a\u0006\u0012\u0002\u0008\u00030\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0008\u0010\u0014\u001a\u00020\u0015H\u0014R\u001b\u0010\u0004\u001a\u00020\u00028BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;",
        "()V",
        "heartRatePeriodsViewModel",
        "getHeartRatePeriodsViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;",
        "heartRatePeriodsViewModel$delegate",
        "Lkotlin/Lazy;",
        "configureToolbar",
        "",
        "rootView",
        "Landroid/view/View;",
        "getDayFragmentInstance",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;",
        "config",
        "",
        "getMonthFragmentInstance",
        "getViewModel",
        "getWeekFragmentInstance",
        "layoutRes",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment$Companion;


# instance fields
.field private final heartRatePeriodsViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 40
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 15
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;-><init>()V

    .line 40
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment$heartRatePeriodsViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment$heartRatePeriodsViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 55
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 57
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 40
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment;->heartRatePeriodsViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private static final configureToolbar$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;->onBackClicked()V

    return-void
.end method

.method private final getHeartRatePeriodsViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;
    .locals 1

    .line 40
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment;->heartRatePeriodsViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;

    return-object v0
.end method

.method public static synthetic lambda$zEkVpGw5nE5nNA_OQmB45C59ciE(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment;->configureToolbar$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method protected configureToolbar(Landroid/view/View;)V
    .locals 2

    const-string v0, "rootView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f080165

    .line 31
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    if-eqz p1, :cond_0

    const v0, 0x7f0f00ef

    .line 33
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(R.string.heart_rate_title)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    .line 34
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/-$$Lambda$HeartRatePeriodsFragment$zEkVpGw5nE5nNA_OQmB45C59ciE;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/-$$Lambda$HeartRatePeriodsFragment$zEkVpGw5nE5nNA_OQmB45C59ciE;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment;)V

    invoke-static {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method protected getDayFragmentInstance(Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment<",
            "*>;"
        }
    .end annotation

    .line 19
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedGraphFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedGraphFragment$Companion;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedGraphFragment$Companion;->newInstance(Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedGraphFragment;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;

    return-object p1
.end method

.method protected getMonthFragmentInstance(Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment<",
            "*>;"
        }
    .end annotation

    .line 27
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedGraphFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedGraphFragment$Companion;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedGraphFragment$Companion;->newInstance(Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedGraphFragment;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;

    return-object p1
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;
    .locals 1

    .line 46
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment;->getHeartRatePeriodsViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected getWeekFragmentInstance(Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment<",
            "*>;"
        }
    .end annotation

    .line 23
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedGraphFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedGraphFragment$Companion;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedGraphFragment$Companion;->newInstance(Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedGraphFragment;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;

    return-object p1
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0042

    return v0
.end method
