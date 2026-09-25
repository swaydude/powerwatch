.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayViewModelDashboard;
.super Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;
.source "PowerDayViewModelDashboard.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J\u0008\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0002H\u0014R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayViewModelDashboard;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;",
        "walkingDayPeriodDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;",
        "restingDayPeriodDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;",
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
        "dayFormatterViewModel",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayPeriodFormatterViewModel;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayPeriodFormatterViewModel;)V",
        "headerColor",
        "Landroidx/databinding/ObservableField;",
        "",
        "getHeaderColor",
        "()Landroidx/databinding/ObservableField;",
        "powerGeneratedToday",
        "",
        "goToDrillDown",
        "",
        "onConfigurationArrived",
        "configuration",
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
.field private final headerColor:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final powerGeneratedToday:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayPeriodFormatterViewModel;)V
    .locals 9

    move-object v7, p0

    move-object/from16 v8, p7

    move-object/from16 v0, p9

    const-string v1, "walkingDayPeriodDataProvider"

    move-object v2, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "restingDayPeriodDataProvider"

    move-object v2, p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "sleepDayPeriodDataProvider"

    move-object v2, p3

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "selectedDateProvider"

    move-object v3, p4

    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "rxBus"

    move-object v6, p5

    invoke-static {p5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "userPrefsUtils"

    move-object v2, p6

    invoke-static {p6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "activityContext"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "parentFragmentManager"

    move-object/from16 v5, p8

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "dayFormatterViewModel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f0f016b

    .line 32
    invoke-virtual {v8, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "activityContext.getString(R.string.power_title)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;

    move-object v0, p0

    move-object/from16 v4, p7

    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V

    const v0, 0x7f0f0169

    .line 34
    invoke-virtual {v8, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "activityContext.getString(R.string.power_generated)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v7, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayViewModelDashboard;->powerGeneratedToday:Ljava/lang/String;

    .line 35
    new-instance v0, Landroidx/databinding/ObservableField;

    const v1, 0x7f05003c

    invoke-static {v8, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v0, v7, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayViewModelDashboard;->headerColor:Landroidx/databinding/ObservableField;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayPeriodFormatterViewModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p10

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    .line 30
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayPeriodFormatterViewModel;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-object v1, v0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayPeriodFormatterViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v0

    goto :goto_0

    :cond_0
    move-object/from16 v18, p9

    :goto_0
    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    move-object/from16 v14, p5

    move-object/from16 v15, p6

    move-object/from16 v16, p7

    move-object/from16 v17, p8

    .line 21
    invoke-direct/range {v9 .. v18}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayViewModelDashboard;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayPeriodFormatterViewModel;)V

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

    .line 35
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayViewModelDashboard;->headerColor:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public goToDrillDown()V
    .locals 8

    .line 38
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayViewModelDashboard;->getParentFragmentManagerWeakReference()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_0

    goto :goto_0

    .line 39
    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerPeriodsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerPeriodsFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerPeriodsFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerPeriodsFragment;

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

    .line 21
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayViewModelDashboard;->onConfigurationArrived(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;)V

    return-void
.end method

.method protected onConfigurationArrived(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;)V
    .locals 6

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    move-object v0, p1

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;

    invoke-super {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;->onConfigurationArrived(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;)V

    .line 44
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayViewModelDashboard;->getSubTitle()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;->getBarConfig()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getDaySubtitle()Ljava/lang/String;

    move-result-object v1

    const-string v2, "--"

    if-nez v1, :cond_0

    goto :goto_0

    .line 45
    :cond_0
    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayViewModelDashboard;->powerGeneratedToday:Ljava/lang/String;

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;->getBarConfig()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getDaySubtitle()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v4, v5

    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "java.lang.String.format(format, *args)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, p1

    .line 44
    :goto_0
    invoke-virtual {v0, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method
