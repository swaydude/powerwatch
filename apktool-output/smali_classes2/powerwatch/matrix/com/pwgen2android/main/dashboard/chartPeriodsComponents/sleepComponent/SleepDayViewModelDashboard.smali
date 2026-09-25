.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;
.super Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;
.source "SleepDayViewModelDashboard.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BG\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\u0008\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0002H\u0014J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\rH\u0016J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\rH\u0016R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "sleepDayPeriodDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;",
        "selectedDateProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;",
        "rxBus",
        "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "activityContext",
        "Landroid/content/Context;",
        "parentFragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "sleepTimeCloudStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;",
        "dayFormatterViewModel",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;)V",
        "headerColor",
        "Landroidx/databinding/ObservableField;",
        "",
        "getHeaderColor",
        "()Landroidx/databinding/ObservableField;",
        "rxBusDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "sleepHeaderTitleText",
        "",
        "goToDrillDown",
        "",
        "onConfigurationArrived",
        "configuration",
        "onCreateView",
        "context",
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
.field private final dayFormatterViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;

.field private final headerColor:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

.field private final rxBusDisposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final sleepHeaderTitleText:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;)V
    .locals 7

    const-string v0, "sleepDayPeriodDataProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "selectedDateProvider"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "rxBus"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "userPrefsUtils"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "activityContext"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "parentFragmentManager"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "sleepTimeCloudStorage"

    invoke-static {p7, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "dayFormatterViewModel"

    invoke-static {p8, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x7f0f0199

    .line 31
    invoke-virtual {p5, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string p1, "activityContext.getString(R.string.sleep_title)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p8

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;

    move-object v0, p0

    move-object v3, p2

    move-object v4, p5

    move-object v5, p6

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V

    .line 24
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    .line 29
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;->dayFormatterViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;

    .line 33
    new-instance p1, Landroidx/databinding/ObservableField;

    const p2, 0x7f050024

    invoke-static {p5, p2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;->headerColor:Landroidx/databinding/ObservableField;

    const p1, 0x7f0f003b

    .line 35
    invoke-virtual {p5, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, " "

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;->sleepHeaderTitleText:Ljava/lang/String;

    .line 37
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;->rxBusDisposable:Lio/reactivex/disposables/CompositeDisposable;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p9

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    .line 30
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;

    const/4 v3, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x30

    const/4 v9, 0x0

    move-object v1, v0

    move-object/from16 v2, p1

    move-object/from16 v4, p4

    move-object/from16 v5, p7

    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;ZLpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v0

    goto :goto_0

    :cond_0
    move-object/from16 v18, p8

    :goto_0
    move-object/from16 v10, p0

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    move-object/from16 v13, p3

    move-object/from16 v14, p4

    move-object/from16 v15, p5

    move-object/from16 v16, p6

    move-object/from16 v17, p7

    .line 22
    invoke-direct/range {v10 .. v18}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;)V

    return-void
.end method

.method public static synthetic lambda$mqDOr24PANmjc7aRhAVBOPpSyS4(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;->onCreateView$lambda-0(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$vDJ8lWkswnbpDnrESRf-1ZUnN-k(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;->onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;Ljava/lang/Object;)V

    return-void
.end method

.method private static final onCreateView$lambda-0(Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    instance-of p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/SleepChartClicked;

    return p0
.end method

.method private static final onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;Ljava/lang/Object;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;->goToDrillDown()V

    return-void
.end method


# virtual methods
.method public getHeaderColor()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;->headerColor:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public goToDrillDown()V
    .locals 8

    .line 51
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;->getParentFragmentManagerWeakReference()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_0

    goto :goto_0

    .line 52
    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepPeriodsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepPeriodsFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepPeriodsFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepPeriodsFragment;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f0800db

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic onConfigurationArrived(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;)V
    .locals 0

    .line 22
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;->onConfigurationArrived(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;)V

    return-void
.end method

.method protected onConfigurationArrived(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;)V
    .locals 3

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    move-object v0, p1

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;

    invoke-super {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;->onConfigurationArrived(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;)V

    .line 57
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;->getSubTitle()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;->getDaySubtitle()Ljava/lang/String;

    move-result-object v1

    const-string v2, "--"

    if-nez v1, :cond_0

    goto :goto_0

    .line 58
    :cond_0
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;->sleepHeaderTitleText:Ljava/lang/String;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;->getDaySubtitle()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, p1

    .line 57
    :goto_0
    invoke-virtual {v0, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public onCreateView(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;->onCreateView(Landroid/content/Context;)V

    .line 45
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;->rxBusDisposable:Lio/reactivex/disposables/CompositeDisposable;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;->getEvents()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/-$$Lambda$SleepDayViewModelDashboard$mqDOr24PANmjc7aRhAVBOPpSyS4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/-$$Lambda$SleepDayViewModelDashboard$mqDOr24PANmjc7aRhAVBOPpSyS4;

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/-$$Lambda$SleepDayViewModelDashboard$vDJ8lWkswnbpDnrESRf-1ZUnN-k;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/-$$Lambda$SleepDayViewModelDashboard$vDJ8lWkswnbpDnrESRf-1ZUnN-k;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public onDestroyView(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;->onDestroyView(Landroid/content/Context;)V

    .line 64
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;->rxBusDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {p1}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method
