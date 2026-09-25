.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;
.source "HeartRatePeriodsViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0008\u0008\u0002\u0010!\u001a\u00020\"\u0012\u0008\u0008\u0002\u0010#\u001a\u00020$\u0012\u0008\u0008\u0002\u0010%\u001a\u00020&\u00a2\u0006\u0002\u0010\'J&\u0010(\u001a\u0010\u0012\u000c\u0012\n **\u0004\u0018\u00010\u00020\u00020)2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J&\u0010-\u001a\u0010\u0012\u000c\u0012\n **\u0004\u0018\u00010\u00020\u00020)2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J&\u0010.\u001a\u0010\u0012\u000c\u0012\n **\u0004\u0018\u00010\u00020\u00020)2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;",
        "dayWalkingPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;",
        "weekWalkingPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;",
        "monthWalkingPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;",
        "dayRestingPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;",
        "weekRestingPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;",
        "monthRestingPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;",
        "daySleepPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;",
        "weekSleepPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;",
        "monthSleepPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;",
        "selectedDateProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;",
        "goalConfigurationRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "parentFragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "context",
        "Landroid/content/Context;",
        "activity",
        "Landroid/app/Activity;",
        "dayFormatterViewModel",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDayPeriodFormatterViewModel;",
        "weekFormatterViewModel",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;",
        "monthFormatterViewModel",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateMonthPeriodFormatterViewModel;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDayPeriodFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateMonthPeriodFormatterViewModel;)V",
        "loadDayPeriod",
        "Lio/reactivex/Observable;",
        "kotlin.jvm.PlatformType",
        "date",
        "Ljava/util/Calendar;",
        "loadMonthPeriod",
        "loadWeekPeriod",
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
.field private final dayFormatterViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDayPeriodFormatterViewModel;

.field private final monthFormatterViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateMonthPeriodFormatterViewModel;

.field private final weekFormatterViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDayPeriodFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateMonthPeriodFormatterViewModel;)V
    .locals 11

    move-object v0, p0

    move-object/from16 v1, p14

    move-object/from16 v2, p16

    move-object/from16 v3, p17

    move-object/from16 v4, p18

    const-string v5, "dayWalkingPeriodProvider"

    move-object v6, p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "weekWalkingPeriodProvider"

    move-object v6, p2

    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "monthWalkingPeriodProvider"

    move-object v6, p3

    invoke-static {p3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "dayRestingPeriodProvider"

    move-object v6, p4

    invoke-static {p4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "weekRestingPeriodProvider"

    move-object/from16 v6, p5

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "monthRestingPeriodProvider"

    move-object/from16 v6, p6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "daySleepPeriodProvider"

    move-object/from16 v6, p7

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "weekSleepPeriodProvider"

    move-object/from16 v6, p8

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "monthSleepPeriodProvider"

    move-object/from16 v6, p9

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "selectedDateProvider"

    move-object/from16 v6, p10

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "goalConfigurationRepository"

    move-object/from16 v7, p11

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "userPrefsUtils"

    move-object/from16 v8, p12

    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "parentFragmentManager"

    move-object/from16 v9, p13

    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "context"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "activity"

    move-object/from16 v10, p15

    invoke-static {v10, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "dayFormatterViewModel"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "weekFormatterViewModel"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "monthFormatterViewModel"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object p1, p0

    move-object/from16 p2, p10

    move-object/from16 p3, p11

    move-object/from16 p4, p12

    move-object/from16 p5, p13

    move-object/from16 p6, p14

    move-object/from16 p7, p15

    .line 48
    invoke-direct/range {p1 .. p7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Landroid/app/Activity;)V

    .line 42
    iput-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;->dayFormatterViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDayPeriodFormatterViewModel;

    .line 44
    iput-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;->weekFormatterViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;

    .line 46
    iput-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;->monthFormatterViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateMonthPeriodFormatterViewModel;

    .line 57
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;->getNavigationColor()Landroidx/databinding/ObservableField;

    move-result-object v2

    const v3, 0x7f0500ec

    invoke-static {v1, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDayPeriodFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateMonthPeriodFormatterViewModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 29

    const v0, 0x8000

    and-int v0, p19, v0

    if-eqz v0, :cond_0

    .line 43
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDayPeriodFormatterViewModel;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x38

    const/4 v9, 0x0

    move-object v1, v0

    move-object/from16 v2, p1

    move-object/from16 v3, p4

    move-object/from16 v4, p7

    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDayPeriodFormatterViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;ZLpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v26, v0

    goto :goto_0

    :cond_0
    move-object/from16 v26, p16

    :goto_0
    const/high16 v0, 0x10000

    and-int v0, p19, v0

    if-eqz v0, :cond_1

    .line 45
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-object v1, v0

    move-object/from16 v2, p2

    move-object/from16 v3, p5

    move-object/from16 v4, p8

    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v27, v0

    goto :goto_1

    :cond_1
    move-object/from16 v27, p17

    :goto_1
    const/high16 v0, 0x20000

    and-int v0, p19, v0

    if-eqz v0, :cond_2

    .line 47
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateMonthPeriodFormatterViewModel;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-object v1, v0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p9

    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateMonthPeriodFormatterViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v28, v0

    goto :goto_2

    :cond_2
    move-object/from16 v28, p18

    :goto_2
    move-object/from16 v10, p0

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    move-object/from16 v13, p3

    move-object/from16 v14, p4

    move-object/from16 v15, p5

    move-object/from16 v16, p6

    move-object/from16 v17, p7

    move-object/from16 v18, p8

    move-object/from16 v19, p9

    move-object/from16 v20, p10

    move-object/from16 v21, p11

    move-object/from16 v22, p12

    move-object/from16 v23, p13

    move-object/from16 v24, p14

    move-object/from16 v25, p15

    .line 27
    invoke-direct/range {v10 .. v28}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDayPeriodFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateMonthPeriodFormatterViewModel;)V

    return-void
.end method


# virtual methods
.method protected loadDayPeriod(Ljava/util/Calendar;Landroid/content/Context;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Calendar;",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;",
            ">;"
        }
    .end annotation

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;->dayFormatterViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDayPeriodFormatterViewModel;

    invoke-virtual {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDayPeriodFormatterViewModel;->getPeriodConfig(Ljava/util/Calendar;Landroid/content/Context;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method protected loadMonthPeriod(Ljava/util/Calendar;Landroid/content/Context;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Calendar;",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;",
            ">;"
        }
    .end annotation

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;->monthFormatterViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateMonthPeriodFormatterViewModel;

    invoke-virtual {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateMonthPeriodFormatterViewModel;->getPeriodConfig(Ljava/util/Calendar;Landroid/content/Context;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method protected loadWeekPeriod(Ljava/util/Calendar;Landroid/content/Context;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Calendar;",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;",
            ">;"
        }
    .end annotation

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodsViewModel;->weekFormatterViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;

    invoke-virtual {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;->getPeriodConfig(Ljava/util/Calendar;Landroid/content/Context;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
