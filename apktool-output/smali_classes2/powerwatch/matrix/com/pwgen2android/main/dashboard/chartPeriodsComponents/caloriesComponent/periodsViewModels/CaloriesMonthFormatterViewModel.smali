.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;
.super Ljava/lang/Object;
.source "CaloriesPeriodFormatterViewModels.kt"

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
    value = "SMAP\nCaloriesPeriodFormatterViewModels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaloriesPeriodFormatterViewModels.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,434:1\n1043#2:435\n1043#2:436\n1043#2:437\n1557#2:438\n1588#2,4:439\n1557#2:443\n1588#2,4:444\n1547#2:448\n1618#2,3:449\n*S KotlinDebug\n*F\n+ 1 CaloriesPeriodFormatterViewModels.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel\n*L\n356#1:435\n360#1:436\n364#1:437\n367#1:438\n367#1:439,4\n382#1:443\n382#1:444,4\n394#1:448\n394#1:449,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;",
        "walkingMonthPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;",
        "restingMonthPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;",
        "sleepMonthPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;",
        "goalConfigurationRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;",
        "combinedMonthPeriodDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;",
        "configProvider",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;)V",
        "getPeriodConfig",
        "Lio/reactivex/Observable;",
        "date",
        "Ljava/util/Calendar;",
        "context",
        "Landroid/content/Context;",
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
.field private final combinedMonthPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;",
            ">;"
        }
    .end annotation
.end field

.field private final configProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;

.field private final goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;",
            ")V"
        }
    .end annotation

    const-string v0, "walkingMonthPeriodProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "restingMonthPeriodProvider"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "sleepMonthPeriodProvider"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "goalConfigurationRepository"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "combinedMonthPeriodDataProvider"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "configProvider"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 315
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 318
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;->goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    .line 319
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;->combinedMonthPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;

    .line 321
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;->configProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_0

    .line 320
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataProviderImpl;

    invoke-direct {p5, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataProviderImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;)V

    check-cast p5, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;

    :cond_0
    move-object v5, p5

    and-int/lit8 p5, p7, 0x20

    if-eqz p5, :cond_1

    .line 321
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;

    sget-object p5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->MONTH:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-direct {p6, p5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;)V

    :cond_1
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 315
    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;)V

    return-void
.end method

.method private static final getPeriodConfig$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;Ljava/util/List;)Lkotlin/Pair;
    .locals 1

    const-string v0, "periodsContainer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goals"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 331
    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final getPeriodConfig$lambda-7(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;Landroid/content/Context;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "it"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 334
    invoke-virtual/range {p2 .. p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;

    .line 336
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;->getWalkingMonths()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;->getRestingMonths()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 337
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;->getSleepMonths()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 338
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 339
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;->configProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;->getDefaultConfig(Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x3b

    const/4 v13, 0x0

    move-object v5, v2

    .line 338
    invoke-direct/range {v5 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;-><init>(Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;Ljava/util/List;ZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    .line 343
    :cond_0
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;->getWalkingMonths()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingMonthPeriod;

    if-nez v0, :cond_1

    .line 344
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingMonthPeriod;

    move-object v4, v0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const v32, 0x7fffff

    const/16 v33, 0x0

    invoke-direct/range {v4 .. v33}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingMonthPeriod;-><init>(JJIFIIFFFFFFFDIIILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 345
    :cond_1
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;->getRestingMonths()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingMonthPeriod;

    if-nez v4, :cond_2

    .line 346
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingMonthPeriod;

    move-object v5, v4

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const v30, 0x1fffff

    const/16 v31, 0x0

    invoke-direct/range {v5 .. v31}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingMonthPeriod;-><init>(JJFIIFFFFFFFIIILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 347
    :cond_2
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;->getSleepMonths()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepMonthPeriod;

    if-nez v2, :cond_3

    .line 348
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepMonthPeriod;

    move-object v5, v2

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const v32, 0x7fffff

    const/16 v33, 0x0

    invoke-direct/range {v5 .. v33}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepMonthPeriod;-><init>(JJFIIFFFFFFFIIILjava/util/List;JIFIFFLpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 351
    :cond_3
    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->getFilledDays(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingMonthPeriod;)Ljava/util/List;

    move-result-object v5

    .line 352
    invoke-static {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->getFilledDays(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingMonthPeriod;)Ljava/util/List;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    .line 353
    invoke-static {v2, v7, v8, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->getFilledDays$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepMonthPeriod;IILjava/lang/Object;)Ljava/util/List;

    move-result-object v10

    .line 355
    check-cast v5, Ljava/lang/Iterable;

    .line 435
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel$getPeriodConfig$lambda-7$$inlined$sortedBy$1;

    invoke-direct {v11}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel$getPeriodConfig$lambda-7$$inlined$sortedBy$1;-><init>()V

    check-cast v11, Ljava/util/Comparator;

    invoke-static {v5, v11}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v5

    .line 359
    check-cast v6, Ljava/lang/Iterable;

    .line 436
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel$getPeriodConfig$lambda-7$$inlined$sortedBy$2;

    invoke-direct {v11}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel$getPeriodConfig$lambda-7$$inlined$sortedBy$2;-><init>()V

    check-cast v11, Ljava/util/Comparator;

    invoke-static {v6, v11}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v6

    .line 363
    check-cast v10, Ljava/lang/Iterable;

    .line 437
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel$getPeriodConfig$lambda-7$$inlined$sortedBy$3;

    invoke-direct {v11}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel$getPeriodConfig$lambda-7$$inlined$sortedBy$3;-><init>()V

    check-cast v11, Ljava/util/Comparator;

    invoke-static {v10, v11}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v10

    .line 367
    check-cast v5, Ljava/lang/Iterable;

    .line 438
    new-instance v11, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v5, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v11, Ljava/util/Collection;

    .line 440
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v13, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v15, v13, 0x1

    if-gez v13, :cond_4

    .line 441
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_4
    check-cast v14, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    .line 369
    invoke-static {v6, v13}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    .line 370
    invoke-static {v10, v13}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    .line 372
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;

    .line 373
    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getActiveCalories()I

    move-result v17

    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getBmrCalories()I

    move-result v18

    add-int v17, v17, v18

    if-nez v16, :cond_5

    const/16 v18, 0x0

    goto :goto_1

    .line 374
    :cond_5
    invoke-virtual/range {v16 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getActiveCalories()I

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    :goto_1
    if-nez v18, :cond_6

    const/16 v18, 0x0

    goto :goto_2

    :cond_6
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Integer;->intValue()I

    move-result v18

    invoke-virtual/range {v16 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getBmrCalories()I

    move-result v19

    add-int v18, v18, v19

    :goto_2
    add-int v17, v17, v18

    if-nez v13, :cond_7

    const/16 v18, 0x0

    goto :goto_3

    .line 375
    :cond_7
    invoke-virtual {v13}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getActiveCalories()I

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    :goto_3
    if-nez v18, :cond_8

    const/16 v18, 0x0

    goto :goto_4

    :cond_8
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Integer;->intValue()I

    move-result v18

    invoke-virtual {v13}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getBmrCalories()I

    move-result v19

    add-int v18, v18, v19

    :goto_4
    add-int v18, v17, v18

    const/16 v19, 0x0

    const/16 v20, 0x0

    .line 376
    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getMalformed()Z

    move-result v14

    if-nez v14, :cond_c

    if-nez v16, :cond_9

    const/4 v14, 0x0

    goto :goto_5

    .line 377
    :cond_9
    invoke-virtual/range {v16 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getMalformed()Z

    move-result v14

    :goto_5
    if-nez v14, :cond_c

    if-nez v13, :cond_a

    const/4 v13, 0x0

    goto :goto_6

    :cond_a
    invoke-virtual {v13}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getMalformed()Z

    move-result v13

    :goto_6
    if-eqz v13, :cond_b

    goto :goto_7

    :cond_b
    const/16 v21, 0x0

    goto :goto_8

    :cond_c
    :goto_7
    const/16 v21, 0x1

    :goto_8
    const/16 v22, 0x6

    const/16 v23, 0x0

    move-object/from16 v17, v9

    .line 372
    invoke-direct/range {v17 .. v23}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;-><init>(IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v11, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v13, v15

    const/4 v9, 0x0

    goto/16 :goto_0

    .line 442
    :cond_d
    check-cast v11, Ljava/util/List;

    .line 382
    check-cast v11, Ljava/lang/Iterable;

    .line 443
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v11, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .line 445
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v9, 0x0

    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const/16 v13, 0x3e8

    if-eqz v10, :cond_f

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v14, v9, 0x1

    if-gez v9, :cond_e

    .line 446
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_e
    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;

    .line 383
    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;

    int-to-float v9, v9

    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->getCalories()I

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    move-object/from16 v8, v16

    check-cast v8, Ljava/lang/Number;

    invoke-static {v8, v13}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->divideRounded(Ljava/lang/Number;I)I

    move-result v8

    int-to-float v8, v8

    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->getMalformed()Z

    move-result v10

    invoke-direct {v15, v9, v8, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;-><init>(FFZ)V

    invoke-interface {v5, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v9, v14

    const/4 v8, 0x1

    goto :goto_9

    .line 447
    :cond_f
    check-cast v5, Ljava/util/List;

    .line 386
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingMonthPeriod;->getBmrCalories()I

    move-result v6

    .line 387
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingMonthPeriod;->getBmrCalories()I

    move-result v8

    add-int/2addr v6, v8

    .line 388
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepMonthPeriod;->getBmrCalories()I

    move-result v8

    add-int/2addr v6, v8

    .line 390
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingMonthPeriod;->getActiveCalories()I

    move-result v0

    .line 391
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingMonthPeriod;->getActiveCalories()I

    move-result v4

    add-int/2addr v0, v4

    .line 392
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepMonthPeriod;->getActiveCalories()I

    move-result v2

    add-int/2addr v0, v2

    .line 448
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v11, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 449
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 450
    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;

    .line 394
    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->getCalories()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 451
    :cond_10
    check-cast v2, Ljava/util/List;

    .line 448
    check-cast v2, Ljava/lang/Iterable;

    .line 394
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->maxOrNull(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_11

    const/4 v2, 0x0

    goto :goto_b

    :cond_11
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :goto_b
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-static {v2, v13}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->divideRounded(Ljava/lang/Number;I)I

    move-result v2

    const/4 v4, 0x2

    new-array v8, v4, [Lkotlin/Pair;

    .line 396
    new-instance v9, Lkotlin/Pair;

    const v10, 0x7f0f001f

    invoke-virtual {v1, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-static {v0, v13}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->divideRounded(Ljava/lang/Number;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->formatByLocale(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v10, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v9, v8, v7

    .line 397
    new-instance v0, Lkotlin/Pair;

    const v9, 0x7f0f0059

    invoke-virtual {v1, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 398
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-static {v6, v13}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->divideRounded(Ljava/lang/Number;I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-static {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->formatByLocale(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v6

    .line 397
    invoke-direct {v0, v1, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 395
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    .line 401
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x7

    const/4 v13, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;-><init>(IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 403
    invoke-virtual/range {p2 .. p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    if-eqz v1, :cond_12

    .line 405
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getCalories()I

    move-result v0

    .line 406
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;

    const v3, 0x3e99999a    # 0.3f

    int-to-float v6, v0

    mul-float v6, v6, v3

    invoke-static {v6}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-direct {v1, v0, v7, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;-><init>(III)V

    move-object/from16 v18, v1

    goto :goto_c

    :cond_12
    move-object/from16 v18, v0

    :goto_c
    int-to-float v0, v2

    .line 409
    invoke-virtual/range {v18 .. v18}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;->getMax()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const v1, 0x3f99999a    # 1.2f

    mul-float v0, v0, v1

    .line 412
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    .line 413
    sget-object v10, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->MONTH:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    .line 414
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    .line 415
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;

    invoke-virtual/range {v18 .. v18}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;->getMax()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual/range {v18 .. v18}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;->getMax()I

    move-result v5

    int-to-float v5, v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v3, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;-><init>(FLjava/lang/String;)V

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Integer;

    const v3, 0x7f050025

    .line 422
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v7

    const v3, 0x7f0500de

    .line 423
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v5, 0x1

    aput-object v3, v2, v5

    const v3, 0x7f0500ec

    .line 424
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    .line 421
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0xc20

    const/16 v23, 0x0

    move-object v9, v1

    move v14, v0

    .line 412
    invoke-direct/range {v9 .. v23}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;FFZZLjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;Ljava/util/List;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 410
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v15, 0x1b

    const/16 v16, 0x0

    move-object v8, v2

    move-object v11, v1

    invoke-direct/range {v8 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;-><init>(Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;Ljava/util/List;ZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method private static final getPeriodConfig$lambda-8(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;
    .locals 10

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 427
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;->configProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;->getDefaultConfig(Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    move-result-object v4

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x3b

    const/4 v9, 0x0

    move-object v1, p2

    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;-><init>(Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;Ljava/util/List;ZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p2
.end method

.method public static synthetic lambda$SrnKMHwCIgI8D0DPQNZ0eKSjYxY(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;Landroid/content/Context;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;->getPeriodConfig$lambda-7(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;Landroid/content/Context;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$_YlVnFFxOIgFBOcPnrhOk1Ud40o(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;->getPeriodConfig$lambda-8(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$rPLaOcsAxGhPXegy6H1lkNdt_Ps(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;Ljava/util/List;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;->getPeriodConfig$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;Ljava/util/List;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getPeriodConfig(Ljava/util/Calendar;Landroid/content/Context;)Lio/reactivex/Observable;
    .locals 10
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

    .line 326
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->numOfDaysInMonth(Ljava/util/Calendar;)I

    move-result v1

    mul-int/lit8 v2, v1, 0x18

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->monthHoursOffsetFromToday(Ljava/util/Calendar;)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;-><init>(IJJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 329
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;->combinedMonthPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;->loadCombinedPeriodData(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;

    move-result-object p1

    .line 330
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;->goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository$DefaultImpls;->all$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/-$$Lambda$CaloriesMonthFormatterViewModel$rPLaOcsAxGhPXegy6H1lkNdt_Ps;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/-$$Lambda$CaloriesMonthFormatterViewModel$rPLaOcsAxGhPXegy6H1lkNdt_Ps;

    invoke-virtual {p1, v0, v1}, Lio/reactivex/Observable;->withLatestFrom(Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object p1

    .line 332
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/-$$Lambda$CaloriesMonthFormatterViewModel$SrnKMHwCIgI8D0DPQNZ0eKSjYxY;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/-$$Lambda$CaloriesMonthFormatterViewModel$SrnKMHwCIgI8D0DPQNZ0eKSjYxY;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 426
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/-$$Lambda$CaloriesMonthFormatterViewModel$_YlVnFFxOIgFBOcPnrhOk1Ud40o;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/-$$Lambda$CaloriesMonthFormatterViewModel$_YlVnFFxOIgFBOcPnrhOk1Ud40o;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->onErrorReturn(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "combinedMonthPeriodDataProvider.loadCombinedPeriodData(page)\n                .withLatestFrom(goalConfigurationRepository.all(fromCache = true),\n                        BiFunction<CombinedMonthPeriodDataContainer, List<GoalConfiguration>, Pair<CombinedMonthPeriodDataContainer, List<GoalConfiguration>>> { periodsContainer, goals -> Pair(periodsContainer, goals) })\n                .map {\n\n                    val periodsContainer = it.first\n                    // if there is no data, just return default config\n                    if (periodsContainer.walkingMonths.isEmpty() && periodsContainer.restingMonths.isEmpty()\n                            && periodsContainer.sleepMonths.isEmpty()) {\n                        return@map CombinedBarChartConfig(\n                                barConfig = configProvider.getDefaultConfig(context)\n                        )\n                    }\n\n                    val walking = periodsContainer.walkingMonths.lastOrNull()\n                            ?: WalkingMonthPeriod()\n                    val resting = periodsContainer.restingMonths.lastOrNull()\n                            ?: RestingMonthPeriod()\n                    val sleep = periodsContainer.sleepMonths.lastOrNull()\n                            ?: SleepMonthPeriod()\n\n\n                    val filledWalkingDays = walking.getFilledDays()\n                    val filledRestingDays = resting.getFilledDays()\n                    val filledSleepDays = sleep.getFilledDays()\n\n                    val walkingCaloriesSorted = filledWalkingDays\n                            .sortedBy { it.dayInMonth }\n//                            .map { it.activeCalories.plus(it.bmrCalories) }\n\n                    val restingCaloriesSorted = filledRestingDays\n                            .sortedBy { it.dayInMonth }\n//                            .map { it.activeCalories.plus(it.bmrCalories) }\n\n                    val sleepCaloriesSorted = filledSleepDays\n                            .sortedBy { it.dayInMonth }\n//                            .map { it.activeCalories.plus(it.bmrCalories) }\n\n                    val daysCalories = walkingCaloriesSorted.mapIndexed { index, walkingCalories ->\n\n                        val restingCalories = restingCaloriesSorted.getOrNull(index)\n                        val sleepCalories = sleepCaloriesSorted.getOrNull(index)\n\n                        CaloriesDataContainer(\n                                calories = (walkingCalories.activeCalories.plus(walkingCalories.bmrCalories)) +\n                                        (restingCalories?.activeCalories?.plus(restingCalories.bmrCalories) ?: 0) +\n                                        (sleepCalories?.activeCalories?.plus(sleepCalories.bmrCalories) ?: 0 ),\n                                malformedContainer = (walkingCalories.malformed) ||\n                                        (restingCalories?.malformed ?: false) || (sleepCalories?.malformed ?: false)\n                        )\n                    }\n\n\n                    val barEntries = daysCalories.mapIndexed { index, dayCalories ->\n                        BarChartEntryData(index.toFloat(), dayCalories.calories.divideRounded(1000).toFloat(), malformed = dayCalories.malformed)\n                    }\n\n                    val bmrCalories = walking.bmrCalories\n                            .plus(resting.bmrCalories)\n                            .plus(sleep.bmrCalories)\n\n                    val activeCalories = walking.activeCalories\n                            .plus(resting.activeCalories)\n                            .plus(sleep.activeCalories)\n\n                    val max = (daysCalories.map { it.calories }.maxOrNull() ?: 0).divideRounded(1000)\n                    val headerValues = listOf(\n                            Pair(context.getString(R.string.active_calories_title), activeCalories.divideRounded(1000).formatByLocale()),\n                            Pair(context.getString(R.string.bmr_calories_title),\n                                    bmrCalories.divideRounded(1000).formatByLocale())\n                    )\n\n                    var goalThreshold = GoalThreshold()\n\n                    val goalConfig = it.second.lastOrNull()\n                    if (goalConfig != null) {\n                        val goalMax = goalConfig.calories\n                        goalThreshold = GoalThreshold(goalMax, 0, (0.3f * goalMax).roundToInt())\n                    }\n\n                    val chartMax = max(max.toFloat(), goalThreshold.max.toFloat())\n                    CombinedBarChartConfig(\n                            chartMaximum = 1.2f * chartMax,\n                            barConfig = BarChartConfig(\n                            mode = ChartPeriodMode.MONTH,\n                            barEntries = listOf(barEntries),\n                            limitLines = listOf(LimitLineData(goalThreshold.max.toFloat(), goalThreshold.max.toFloat().toString())),\n                            yMinValue = 0f,\n                            yMaxValue = 1.2f * chartMax,\n                            multipleColors = true,\n                            headerValues = headerValues,\n                            goalThreshold = goalThreshold,\n                            barColors = listOf(\n                                    R.color.blue_chart,\n                                    R.color.orange_chart,\n                                    R.color.red_chart))\n                    )\n                }.onErrorReturn {\n                    CombinedBarChartConfig(barConfig = configProvider.getDefaultConfig(context))\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
