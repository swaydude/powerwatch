.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard;
.super Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/DashboardActivityItemFragment;
.source "PowerDayFragmentDashboard.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/DashboardActivityItemFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;",
        ">;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPowerDayFragmentDashboard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PowerDayFragmentDashboard.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,31:1\n54#2,3:32\n*S KotlinDebug\n*F\n+ 1 PowerDayFragmentDashboard.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard\n*L\n16#1:32,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \u000e2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\u000c\u001a\u00020\u0002H\u0016J\u0008\u0010\r\u001a\u00020\u0007H\u0014R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/DashboardActivityItemFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;",
        "()V",
        "powerDayViewModel",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayViewModelDashboard;",
        "getPowerDayViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayViewModelDashboard;",
        "powerDayViewModel$delegate",
        "Lkotlin/Lazy;",
        "getChartInstance",
        "getViewModel",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard$Companion;


# instance fields
.field private final powerDayViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 16
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 10
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/DashboardActivityItemFragment;-><init>()V

    .line 16
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard$powerDayViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard$powerDayViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 32
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 34
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 16
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard;->powerDayViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getPowerDayViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayViewModelDashboard;
    .locals 1

    .line 16
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard;->powerDayViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayViewModelDashboard;

    return-object v0
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method public bridge synthetic getChartInstance()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard;->getChartInstance()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartFragment;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;

    return-object v0
.end method

.method public getChartInstance()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartFragment;
    .locals 3

    .line 12
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartFragment$Companion;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartFragment$Companion;->newInstance$default(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartFragment$Companion;Ljava/lang/Object;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartFragment;

    move-result-object v0

    return-object v0
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayViewModelDashboard;
    .locals 1

    .line 20
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard;->getPowerDayViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayViewModelDashboard;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayFragmentDashboard;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayViewModelDashboard;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method
