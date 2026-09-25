.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;
.super Ljava/lang/Object;
.source "PedometerPeriodFormatterViewModels.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPedometerPeriodFormatterViewModels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PedometerPeriodFormatterViewModels.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,469:1\n1043#2:470\n1043#2:471\n1043#2:472\n1557#2:473\n1588#2,4:474\n1547#2:478\n1618#2,3:479\n764#2:482\n855#2,2:483\n1547#2:485\n1618#2,3:486\n764#2:489\n855#2,2:490\n1547#2:492\n1618#2,3:493\n*S KotlinDebug\n*F\n+ 1 PedometerPeriodFormatterViewModels.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel\n*L\n387#1:470\n388#1:471\n389#1:472\n392#1:473\n392#1:474,4\n400#1:478\n400#1:479,3\n406#1:482\n406#1:483,2\n407#1:485\n407#1:486,3\n414#1:489\n414#1:490,2\n415#1:492\n415#1:493,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\"\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J<\u0010\u001a\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010\u00020\u0002 \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u001b0\u001b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;",
        "monthPeriodDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;",
        "restingMonthPeriodDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;",
        "sleepMonthPeriodDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;",
        "goalConfigurationRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "combinedMonthPeriodDataProviderImpl",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataProviderImpl;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataProviderImpl;)V",
        "defaultHeaderWeekMonthValues",
        "",
        "Lkotlin/Pair;",
        "",
        "context",
        "Landroid/content/Context;",
        "defaultMonthConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;",
        "date",
        "Ljava/util/Calendar;",
        "getPeriodConfig",
        "Lio/reactivex/Observable;",
        "kotlin.jvm.PlatformType",
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
.field private final combinedMonthPeriodDataProviderImpl:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataProviderImpl;

.field private final goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

.field private final userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataProviderImpl;)V
    .locals 1

    const-string v0, "monthPeriodDataProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "restingMonthPeriodDataProvider"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "sleepMonthPeriodDataProvider"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "goalConfigurationRepository"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "userPrefsUtils"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "combinedMonthPeriodDataProviderImpl"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 343
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;->goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    .line 344
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    .line 345
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;->combinedMonthPeriodDataProviderImpl:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataProviderImpl;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataProviderImpl;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 345
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataProviderImpl;

    invoke-direct {p6, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataProviderImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;)V

    :cond_0
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 340
    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataProviderImpl;)V

    return-void
.end method

.method private final defaultHeaderWeekMonthValues(Landroid/content/Context;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x4

    new-array v0, v0, [Lkotlin/Pair;

    .line 458
    new-instance v1, Lkotlin/Pair;

    const v2, 0x7f0f01c4

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "--"

    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 459
    new-instance v1, Lkotlin/Pair;

    const v2, 0x7f0f01c1

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 460
    new-instance v1, Lkotlin/Pair;

    const v2, 0x7f0f0049

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 461
    new-instance v1, Lkotlin/Pair;

    const v2, 0x7f0f0043

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x3

    aput-object v1, v0, p1

    .line 457
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final defaultMonthConfig(Ljava/util/Calendar;Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;
    .locals 17

    .line 466
    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->MONTH:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    move-object/from16 v14, p0

    move-object/from16 v0, p2

    invoke-direct {v14, v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;->defaultHeaderWeekMonthValues(Landroid/content/Context;)Ljava/util/List;

    move-result-object v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xf7c

    const/16 v16, 0x0

    move-object v0, v15

    move-object/from16 v14, v16

    invoke-direct/range {v0 .. v14}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;FFZZLjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;Ljava/util/List;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v15
.end method

.method private static final getPeriodConfig$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;Ljava/util/List;)Lkotlin/Pair;
    .locals 2

    const-string v0, "periods"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 352
    new-instance v0, Lkotlin/Pair;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 353
    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    .line 354
    new-instance v0, Lkotlin/Pair;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method private static final getPeriodConfig$lambda-10(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;Ljava/util/Calendar;Landroid/content/Context;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;
    .locals 47

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$date"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "walkingMonthsGoalsPair"

    move-object/from16 v4, p3

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 361
    invoke-virtual/range {p3 .. p3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;

    .line 364
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;->getWalkingMonths()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 365
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;->getRestingMonths()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 366
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;->getSleepMonths()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 367
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {p0 .. p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;->defaultMonthConfig(Ljava/util/Calendar;Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0x3b

    const/4 v14, 0x0

    move-object v6, v2

    invoke-direct/range {v6 .. v14}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;-><init>(Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;Ljava/util/List;ZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    .line 370
    :cond_0
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x7

    const/16 v20, 0x0

    move-object v15, v3

    invoke-direct/range {v15 .. v20}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;-><init>(IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 372
    invoke-virtual/range {p3 .. p3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    .line 374
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSteps()I

    move-result v3

    .line 375
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;

    const v6, 0x3e99999a    # 0.3f

    int-to-float v7, v3

    mul-float v7, v7, v6

    invoke-static {v7}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v6

    invoke-direct {v4, v3, v5, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;-><init>(III)V

    move-object/from16 v16, v4

    goto :goto_0

    :cond_1
    move-object/from16 v16, v3

    .line 379
    :goto_0
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;->getWalkingMonths()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingMonthPeriod;

    if-nez v3, :cond_2

    .line 380
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingMonthPeriod;

    move-object/from16 v17, v3

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const-wide/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const-wide/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const v45, 0x7fffff

    const/16 v46, 0x0

    invoke-direct/range {v17 .. v46}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingMonthPeriod;-><init>(JJIFIIFFFFFFFDIIILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 381
    :cond_2
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;->getRestingMonths()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingMonthPeriod;

    if-nez v4, :cond_3

    .line 382
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingMonthPeriod;

    move-object/from16 v17, v4

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const-wide/16 v36, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const v42, 0x1fffff

    const/16 v43, 0x0

    invoke-direct/range {v17 .. v43}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingMonthPeriod;-><init>(JJFIIFFFFFFFIIILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 383
    :cond_3
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;->getSleepMonths()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepMonthPeriod;

    if-nez v2, :cond_4

    .line 384
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepMonthPeriod;

    move-object/from16 v17, v2

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const-wide/16 v36, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const v44, 0x7fffff

    const/16 v45, 0x0

    invoke-direct/range {v17 .. v45}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepMonthPeriod;-><init>(JJFIIFFFFFFFIIILjava/util/List;JIFIFFLpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 387
    :cond_4
    invoke-static {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->getFilledDays(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingMonthPeriod;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    .line 470
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$1;

    invoke-direct {v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$1;-><init>()V

    check-cast v7, Ljava/util/Comparator;

    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v6

    .line 388
    invoke-static {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->getFilledDays(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingMonthPeriod;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    .line 471
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$2;

    invoke-direct {v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$2;-><init>()V

    check-cast v7, Ljava/util/Comparator;

    invoke-static {v4, v7}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v4

    const/4 v7, 0x0

    const/4 v8, 0x1

    .line 389
    invoke-static {v2, v5, v8, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->getFilledDays$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepMonthPeriod;IILjava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 472
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$3;

    invoke-direct {v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$3;-><init>()V

    check-cast v7, Ljava/util/Comparator;

    invoke-static {v2, v7}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    .line 391
    check-cast v6, Ljava/lang/Iterable;

    .line 473
    new-instance v7, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v6, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v7, v10}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v7, Ljava/util/Collection;

    .line 475
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const/4 v11, 0x0

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    add-int/lit8 v13, v11, 0x1

    if-gez v11, :cond_5

    .line 476
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_5
    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    .line 394
    invoke-static {v4, v11}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    if-nez v14, :cond_6

    const/4 v14, 0x0

    goto :goto_2

    :cond_6
    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getMalformed()Z

    move-result v14

    .line 395
    :goto_2
    invoke-static {v2, v11}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    if-nez v11, :cond_7

    const/4 v11, 0x0

    goto :goto_3

    :cond_7
    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getMalformed()Z

    move-result v11

    .line 396
    :goto_3
    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;

    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getDayInMonth()I

    move-result v5

    int-to-float v5, v5

    int-to-float v9, v8

    sub-float/2addr v5, v9

    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getSteps()I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getMalformed()Z

    move-result v12

    if-nez v12, :cond_9

    if-nez v14, :cond_9

    if-eqz v11, :cond_8

    goto :goto_4

    :cond_8
    const/4 v11, 0x0

    goto :goto_5

    :cond_9
    :goto_4
    const/4 v11, 0x1

    :goto_5
    invoke-direct {v15, v5, v9, v11}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;-><init>(FFZ)V

    invoke-interface {v7, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v11, v13

    const/4 v5, 0x0

    const/16 v9, 0xa

    goto :goto_1

    .line 477
    :cond_a
    check-cast v7, Ljava/util/List;

    .line 478
    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v6, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 479
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 480
    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    .line 401
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getSteps()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 481
    :cond_b
    check-cast v2, Ljava/util/List;

    .line 478
    check-cast v2, Ljava/lang/Iterable;

    .line 403
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->maxOrNull(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_c

    const/4 v2, 0x0

    goto :goto_7

    .line 399
    :cond_c
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 482
    :goto_7
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .line 483
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_d
    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const-wide/16 v10, 0x0

    if-eqz v9, :cond_f

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v12, v9

    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    .line 406
    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getStartTime()J

    move-result-wide v12

    cmp-long v14, v12, v10

    if-lez v14, :cond_e

    const/4 v10, 0x1

    goto :goto_9

    :cond_e
    const/4 v10, 0x0

    :goto_9
    if-eqz v10, :cond_d

    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 484
    :cond_f
    check-cast v4, Ljava/util/List;

    .line 482
    check-cast v4, Ljava/lang/Iterable;

    .line 485
    new-instance v5, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v4, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v5, v12}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .line 486
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_10

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 487
    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    .line 408
    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getSteps()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 488
    :cond_10
    check-cast v5, Ljava/util/List;

    .line 485
    check-cast v5, Ljava/lang/Iterable;

    .line 410
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->averageOfInt(Ljava/lang/Iterable;)D

    move-result-wide v4

    .line 411
    invoke-static {v4, v5}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result v4

    .line 489
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .line 490
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_11
    :goto_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_13

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v12, v9

    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    .line 414
    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getStartTime()J

    move-result-wide v12

    cmp-long v14, v12, v10

    if-lez v14, :cond_12

    const/4 v12, 0x1

    goto :goto_c

    :cond_12
    const/4 v12, 0x0

    :goto_c
    if-eqz v12, :cond_11

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_b

    .line 491
    :cond_13
    check-cast v5, Ljava/util/List;

    .line 489
    check-cast v5, Ljava/lang/Iterable;

    .line 492
    new-instance v6, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v5, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 493
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/16 v10, 0x3e8

    if-eqz v9, :cond_14

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 494
    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    .line 416
    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getDistance()D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-static {v9, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->divide(Ljava/lang/Number;I)D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .line 495
    :cond_14
    check-cast v6, Ljava/util/List;

    .line 492
    check-cast v6, Ljava/lang/Iterable;

    .line 418
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->averageOfDouble(Ljava/lang/Iterable;)D

    move-result-wide v5

    .line 420
    iget-object v9, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    double-to-float v5, v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$DISTANCE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$DISTANCE;

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v9, v5, v6}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v5

    .line 421
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingMonthPeriod;->getDistance()D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-static {v6, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->divide(Ljava/lang/Number;I)D

    move-result-wide v9

    double-to-float v6, v9

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    sget-object v9, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$DISTANCE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$DISTANCE;

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v0, v6, v9}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v0

    const/4 v6, 0x4

    new-array v6, v6, [Lkotlin/Pair;

    .line 425
    new-instance v9, Lkotlin/Pair;

    const v10, 0x7f0f0049

    invoke-virtual {v1, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-static {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->formatByLocale(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v9, v10, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v4, 0x0

    aput-object v9, v6, v4

    .line 426
    new-instance v4, Lkotlin/Pair;

    const v9, 0x7f0f01c1

    invoke-virtual {v1, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    move-result v11

    invoke-static {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->twoDecimalsFormat(F)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v11, 0x20

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v9, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v4, v6, v8

    .line 427
    new-instance v0, Lkotlin/Pair;

    const v4, 0x7f0f01c4

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingMonthPeriod;->getSteps()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-static {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->formatByLocale(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v3, 0x2

    aput-object v0, v6, v3

    .line 428
    new-instance v0, Lkotlin/Pair;

    const v4, 0x7f0f0043

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    move-result v9

    invoke-static {v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->twoDecimalsFormat(F)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aput-object v0, v6, v1

    .line 424
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    int-to-float v0, v2

    .line 431
    invoke-virtual/range {v16 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;->getMax()I

    move-result v2

    int-to-float v2, v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const v2, 0x3f99999a    # 1.2f

    mul-float v23, v0, v2

    .line 436
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    .line 437
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->MONTH:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    .line 438
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    .line 439
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;

    invoke-virtual/range {v16 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;->getMax()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual/range {v16 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;->getMax()I

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;-><init>(FLjava/lang/String;)V

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    new-array v1, v1, [Ljava/lang/Integer;

    const v4, 0x7f050087

    .line 446
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v1, v5

    const v4, 0x7f0500de

    .line 447
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v8

    const v4, 0x7f0500ec

    .line 448
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v3

    .line 445
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xc20

    const/16 v21, 0x0

    move-object v7, v0

    move-object v8, v2

    move/from16 v12, v23

    .line 436
    invoke-direct/range {v7 .. v21}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;FFZZLjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;Ljava/util/List;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 433
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x19

    const/16 v25, 0x0

    move-object/from16 v17, v1

    move-object/from16 v20, v0

    invoke-direct/range {v17 .. v25}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;-><init>(Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;Ljava/util/List;ZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final getPeriodConfig$lambda-11(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;Ljava/util/Calendar;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;
    .locals 10

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 453
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;->defaultMonthConfig(Ljava/util/Calendar;Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    move-result-object v4

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x3b

    const/4 v9, 0x0

    move-object v1, p3

    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;-><init>(Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;Ljava/util/List;ZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p3
.end method

.method public static synthetic lambda$CiwiaUsjuQPY3xZL_NDbwNrw6aU(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;Ljava/util/List;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;->getPeriodConfig$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;Ljava/util/List;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$DFFl2dXqNc0pfqnktDrHmqthhzw(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;Ljava/util/Calendar;Landroid/content/Context;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;->getPeriodConfig$lambda-10(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;Ljava/util/Calendar;Landroid/content/Context;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$oJRk4VuTrp7Uitrf1VvHJM7GhpA(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;Ljava/util/Calendar;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;->getPeriodConfig$lambda-11(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;Ljava/util/Calendar;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getPeriodConfig(Ljava/util/Calendar;Landroid/content/Context;)Lio/reactivex/Observable;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Calendar;",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;",
            ">;"
        }
    .end annotation

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 348
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;->combinedMonthPeriodDataProviderImpl:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataProviderImpl;

    .line 349
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->numOfDaysInMonth(Ljava/util/Calendar;)I

    move-result v1

    mul-int/lit8 v2, v1, 0x18

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->monthHoursOffsetFromToday(Ljava/util/Calendar;)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;-><init>(IJJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataProviderImpl;->loadCombinedPeriodData(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;

    move-result-object v0

    .line 350
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;->goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository$DefaultImpls;->all$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    check-cast v1, Lio/reactivex/ObservableSource;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerMonthFormatterViewModel$CiwiaUsjuQPY3xZL_NDbwNrw6aU;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerMonthFormatterViewModel$CiwiaUsjuQPY3xZL_NDbwNrw6aU;

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->withLatestFrom(Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object v0

    .line 359
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerMonthFormatterViewModel$DFFl2dXqNc0pfqnktDrHmqthhzw;

    invoke-direct {v1, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerMonthFormatterViewModel$DFFl2dXqNc0pfqnktDrHmqthhzw;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;Ljava/util/Calendar;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 452
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerMonthFormatterViewModel$oJRk4VuTrp7Uitrf1VvHJM7GhpA;

    invoke-direct {v1, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerMonthFormatterViewModel$oJRk4VuTrp7Uitrf1VvHJM7GhpA;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;Ljava/util/Calendar;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->onErrorReturn(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
