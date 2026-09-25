.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;
.super Ljava/lang/Object;
.source "PowerPeriodFormatterViewModels.kt"

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
    value = "SMAP\nPowerPeriodFormatterViewModels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PowerPeriodFormatterViewModels.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,556:1\n1043#2:557\n1043#2:558\n1043#2:559\n1557#2:560\n1588#2,4:561\n1557#2:565\n1588#2,4:566\n1557#2:570\n1588#2,4:571\n1547#2:575\n1618#2,3:576\n1547#2:579\n1618#2,3:580\n2833#2,5:583\n1547#2:588\n1618#2,3:589\n2833#2,5:592\n*S KotlinDebug\n*F\n+ 1 PowerPeriodFormatterViewModels.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel\n*L\n278#1:557\n281#1:558\n284#1:559\n288#1:560\n288#1:561,4\n311#1:565\n311#1:566,4\n335#1:570\n335#1:571,4\n346#1:575\n346#1:576,3\n351#1:579\n351#1:580,3\n351#1:583,5\n352#1:588\n352#1:589,3\n352#1:592,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J&\u0010\u0011\u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\u00020\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;",
        "walkingWeekPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;",
        "restingWeekPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;",
        "sleepWeekPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;",
        "goalsRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;",
        "weekCombinedPeriodDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;",
        "defaultPowerConfigProvider",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;)V",
        "getPeriodConfig",
        "Lio/reactivex/Observable;",
        "kotlin.jvm.PlatformType",
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
.field private final defaultPowerConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;

.field private final goalsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

.field private final weekCombinedPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;",
            ")V"
        }
    .end annotation

    const-string v0, "walkingWeekPeriodProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "restingWeekPeriodProvider"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "sleepWeekPeriodProvider"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "goalsRepository"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "weekCombinedPeriodDataProvider"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "defaultPowerConfigProvider"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 235
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;->goalsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    .line 236
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;->weekCombinedPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;

    .line 238
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;->defaultPowerConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_0

    .line 237
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataProviderImpl;

    invoke-direct {p5, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataProviderImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;)V

    check-cast p5, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;

    :cond_0
    move-object v5, p5

    and-int/lit8 p5, p7, 0x20

    if-eqz p5, :cond_1

    .line 239
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;

    sget-object p5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->WEEK:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-direct {p6, p5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;)V

    :cond_1
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 231
    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;)V

    return-void
.end method

.method private static final getPeriodConfig$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;Ljava/util/List;)Lkotlin/Pair;
    .locals 2

    const-string v0, "periods"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    new-instance v0, Lkotlin/Pair;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 247
    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    .line 248
    new-instance v0, Lkotlin/Pair;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method private static final getPeriodConfig$lambda-12(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;Landroid/content/Context;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;
    .locals 44

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "periodsGoalsPair"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    invoke-virtual/range {p2 .. p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;

    .line 255
    invoke-virtual/range {p2 .. p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    .line 258
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;->getWalkingWeeks()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 259
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;->getRestingWeeks()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 260
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;->getSleepWeeks()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 261
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;->defaultPowerConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;->getDefaultWeekConfig(Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x3b

    const/4 v13, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;-><init>(Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;Ljava/util/List;ZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    .line 264
    :cond_0
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;->getWalkingWeeks()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;

    if-nez v4, :cond_1

    .line 265
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;

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

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const v33, 0x7fffff

    const/16 v34, 0x0

    invoke-direct/range {v5 .. v34}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;-><init>(JJIFIIFFFFFFFDIIILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->fillWithEmptyDays(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;

    move-result-object v4

    .line 266
    :cond_1
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;->getRestingWeeks()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;

    if-nez v5, :cond_2

    .line 267
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;

    move-object v6, v5

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

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

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const v31, 0x1fffff

    const/16 v32, 0x0

    invoke-direct/range {v6 .. v32}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;-><init>(JJFIIFFFFFFFIIILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->fillWithEmptyDays(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;

    move-result-object v5

    .line 268
    :cond_2
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;->getSleepWeeks()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;

    const/4 v6, 0x3

    const/4 v7, 0x0

    if-nez v2, :cond_3

    .line 269
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;

    move-object v8, v2

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

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

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const v35, 0x7fffff

    const/16 v36, 0x0

    invoke-direct/range {v8 .. v36}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;-><init>(JJFIIFFFFFFFIIILjava/util/List;JIFIFFLpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v8, 0x0

    invoke-static {v2, v7, v7, v6, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->fillWithEmptyDays$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;ZIILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;

    move-result-object v2

    .line 272
    :cond_3
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;->getWalkingDays()Ljava/util/List;

    move-result-object v8

    .line 273
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;->getRestingDays()Ljava/util/List;

    move-result-object v9

    .line 274
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;->getSleepDays()Ljava/util/List;

    move-result-object v10

    .line 277
    check-cast v8, Ljava/lang/Iterable;

    .line 557
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel$getPeriodConfig$lambda-12$$inlined$sortedBy$1;

    invoke-direct {v11}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel$getPeriodConfig$lambda-12$$inlined$sortedBy$1;-><init>()V

    check-cast v11, Ljava/util/Comparator;

    invoke-static {v8, v11}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v8

    .line 280
    check-cast v9, Ljava/lang/Iterable;

    .line 558
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel$getPeriodConfig$lambda-12$$inlined$sortedBy$2;

    invoke-direct {v11}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel$getPeriodConfig$lambda-12$$inlined$sortedBy$2;-><init>()V

    check-cast v11, Ljava/util/Comparator;

    invoke-static {v9, v11}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v9

    .line 283
    check-cast v10, Ljava/lang/Iterable;

    .line 559
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel$getPeriodConfig$lambda-12$$inlined$sortedBy$3;

    invoke-direct {v11}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel$getPeriodConfig$lambda-12$$inlined$sortedBy$3;-><init>()V

    check-cast v11, Ljava/util/Comparator;

    invoke-static {v10, v11}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v10

    .line 287
    check-cast v8, Ljava/lang/Iterable;

    .line 560
    new-instance v11, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v8, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v11, Ljava/util/Collection;

    .line 562
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    const/4 v14, 0x0

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    const/high16 v16, 0x42700000    # 60.0f

    const/16 v17, 0x0

    const/16 v18, 0x1

    if-eqz v15, :cond_b

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    add-int/lit8 v19, v14, 0x1

    if-gez v14, :cond_4

    .line 563
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_4
    check-cast v15, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    .line 290
    invoke-static {v9, v14}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    .line 291
    invoke-static {v10, v14}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v21

    check-cast v21, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    .line 293
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getBodyPower()F

    move-result v22

    .line 294
    invoke-static {v9, v14}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    if-nez v23, :cond_5

    const/16 v23, 0x0

    goto :goto_1

    :cond_5
    invoke-virtual/range {v23 .. v23}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getBodyPower()F

    move-result v23

    .line 295
    :goto_1
    invoke-static {v10, v14}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    if-nez v14, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getBodyPower()F

    move-result v17

    :goto_2
    add-float v22, v22, v23

    add-float v22, v22, v17

    div-float v25, v22, v16

    .line 301
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getMalformed()Z

    move-result v14

    if-nez v14, :cond_a

    if-nez v20, :cond_7

    const/4 v14, 0x0

    goto :goto_3

    .line 302
    :cond_7
    invoke-virtual/range {v20 .. v20}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getMalformed()Z

    move-result v14

    :goto_3
    if-nez v14, :cond_a

    if-nez v21, :cond_8

    const/4 v14, 0x0

    goto :goto_4

    :cond_8
    invoke-virtual/range {v21 .. v21}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getMalformed()Z

    move-result v14

    :goto_4
    if-eqz v14, :cond_9

    goto :goto_5

    :cond_9
    const/16 v28, 0x0

    goto :goto_6

    :cond_a
    :goto_5
    const/16 v28, 0x1

    .line 299
    :goto_6
    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0xc

    const/16 v30, 0x0

    move-object/from16 v23, v14

    invoke-direct/range {v23 .. v30}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;-><init>(FFZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v11, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v14, v19

    goto/16 :goto_0

    .line 564
    :cond_b
    check-cast v11, Ljava/util/List;

    .line 565
    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v8, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v13, Ljava/util/Collection;

    .line 567
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v14, 0x0

    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_13

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    add-int/lit8 v19, v14, 0x1

    if-gez v14, :cond_c

    .line 568
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_c
    check-cast v15, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    .line 313
    invoke-static {v9, v14}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    .line 314
    invoke-static {v10, v14}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v21

    check-cast v21, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    .line 316
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getSolarPower()F

    move-result v22

    .line 317
    invoke-static {v9, v14}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    if-nez v23, :cond_d

    const/16 v23, 0x0

    goto :goto_8

    :cond_d
    invoke-virtual/range {v23 .. v23}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getSolarPower()F

    move-result v23

    .line 318
    :goto_8
    invoke-static {v10, v14}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    if-nez v14, :cond_e

    const/4 v14, 0x0

    goto :goto_9

    :cond_e
    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getSolarPower()F

    move-result v14

    :goto_9
    add-float v22, v22, v23

    add-float v22, v22, v14

    div-float v24, v22, v16

    .line 324
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getMalformed()Z

    move-result v14

    if-nez v14, :cond_12

    if-nez v20, :cond_f

    const/4 v14, 0x0

    goto :goto_a

    .line 325
    :cond_f
    invoke-virtual/range {v20 .. v20}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getMalformed()Z

    move-result v14

    :goto_a
    if-nez v14, :cond_12

    if-nez v21, :cond_10

    const/4 v14, 0x0

    goto :goto_b

    .line 326
    :cond_10
    invoke-virtual/range {v21 .. v21}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getMalformed()Z

    move-result v14

    :goto_b
    if-eqz v14, :cond_11

    goto :goto_c

    :cond_11
    const/16 v28, 0x0

    goto :goto_d

    :cond_12
    :goto_c
    const/16 v28, 0x1

    .line 322
    :goto_d
    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0xc

    const/16 v30, 0x0

    move-object/from16 v23, v14

    invoke-direct/range {v23 .. v30}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;-><init>(FFZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v13, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v14, v19

    goto :goto_7

    .line 569
    :cond_13
    check-cast v13, Ljava/util/List;

    .line 334
    check-cast v11, Ljava/lang/Iterable;

    check-cast v13, Ljava/lang/Iterable;

    invoke-static {v11, v13}, Lkotlin/collections/CollectionsKt;->zip(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    .line 570
    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v8, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v9, Ljava/util/Collection;

    .line 572
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v10, 0x0

    const/4 v14, 0x0

    :goto_e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    const/4 v6, 0x2

    if-eqz v15, :cond_18

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    add-int/lit8 v16, v10, 0x1

    if-gez v10, :cond_14

    .line 573
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_14
    check-cast v15, Lkotlin/Pair;

    .line 336
    invoke-virtual {v15}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;

    invoke-virtual/range {v19 .. v19}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;->getBodyPower()F

    move-result v19

    invoke-virtual {v15}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;

    invoke-virtual/range {v20 .. v20}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;->getSolarPower()F

    move-result v20

    add-float v19, v19, v20

    cmpg-float v20, v14, v19

    if-gez v20, :cond_15

    move/from16 v14, v19

    .line 338
    :cond_15
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;

    int-to-float v10, v10

    new-array v6, v6, [F

    invoke-virtual {v15}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;

    invoke-virtual/range {v20 .. v20}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;->getBodyPower()F

    move-result v20

    aput v20, v6, v7

    invoke-virtual {v15}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;

    invoke-virtual/range {v20 .. v20}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;->getSolarPower()F

    move-result v20

    aput v20, v6, v18

    invoke-virtual {v15}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;

    invoke-virtual/range {v20 .. v20}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;->getMalformed()Z

    move-result v20

    if-nez v20, :cond_17

    invoke-virtual {v15}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;

    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;->getMalformed()Z

    move-result v15

    if-eqz v15, :cond_16

    goto :goto_f

    :cond_16
    const/4 v15, 0x0

    goto :goto_10

    :cond_17
    :goto_f
    const/4 v15, 0x1

    :goto_10
    invoke-direct {v12, v10, v6, v15}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;-><init>(F[FZ)V

    invoke-interface {v9, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v10, v16

    const/4 v6, 0x3

    const/16 v12, 0xa

    goto :goto_e

    .line 574
    :cond_18
    check-cast v9, Ljava/util/List;

    .line 344
    invoke-static {v11, v13}, Lkotlin/collections/CollectionsKt;->zip(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v8

    .line 346
    check-cast v8, Ljava/lang/Iterable;

    .line 575
    new-instance v10, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v8, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v10, v15}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v10, Ljava/util/Collection;

    .line 576
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_11
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_19

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 577
    check-cast v12, Lkotlin/Pair;

    .line 347
    invoke-virtual {v12}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;

    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;->getBodyPower()F

    move-result v15

    invoke-virtual {v12}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;

    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;->getSolarPower()F

    move-result v12

    add-float/2addr v15, v12

    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-interface {v10, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_11

    .line 578
    :cond_19
    check-cast v10, Ljava/util/List;

    .line 575
    check-cast v10, Ljava/lang/Iterable;

    .line 348
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->maxOrNull(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object v8

    if-nez v8, :cond_1a

    goto :goto_12

    .line 346
    :cond_1a
    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v17

    .line 579
    :goto_12
    new-instance v8, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v11, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v8, v12}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v8, Ljava/util/Collection;

    .line 580
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_13
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1b

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 581
    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;

    .line 351
    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;->getBodyPower()F

    move-result v11

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    invoke-interface {v8, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_13

    .line 582
    :cond_1b
    check-cast v8, Ljava/util/List;

    .line 579
    check-cast v8, Ljava/lang/Iterable;

    .line 584
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const-wide/16 v10, 0x0

    :goto_14
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1c

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 585
    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    move-result v12

    float-to-double v6, v12

    add-double/2addr v10, v6

    const/4 v6, 0x2

    const/4 v7, 0x0

    goto :goto_14

    :cond_1c
    double-to-float v6, v10

    .line 588
    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v13, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v7, Ljava/util/Collection;

    .line 589
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_15
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 590
    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;

    .line 352
    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;->getSolarPower()F

    move-result v10

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-interface {v7, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_15

    .line 591
    :cond_1d
    check-cast v7, Ljava/util/List;

    .line 588
    check-cast v7, Ljava/lang/Iterable;

    .line 593
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const-wide/16 v10, 0x0

    :goto_16
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 594
    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    float-to-double v12, v8

    add-double/2addr v10, v12

    goto :goto_16

    :cond_1e
    double-to-float v7, v10

    .line 357
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 354
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;->getBodyPower()F

    move-result v10

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;->getBodyPower()F

    move-result v11

    add-float/2addr v10, v11

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;->getBodyPower()F

    move-result v11

    add-float/2addr v10, v11

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;->getWalkingDays()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    int-to-float v11, v11

    div-float/2addr v10, v11

    const/16 v11, 0x3c

    int-to-float v11, v11

    div-float/2addr v10, v11

    .line 356
    invoke-static {v10}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v10

    .line 357
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, " \u00b5Wh"

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 362
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 359
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;->getSolarPower()F

    move-result v13

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;->getSolarPower()F

    move-result v5

    add-float/2addr v13, v5

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;->getSolarPower()F

    move-result v2

    add-float/2addr v13, v2

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;->getWalkingDays()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v13, v2

    div-float/2addr v13, v11

    .line 361
    invoke-static {v13}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    .line 362
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 364
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    float-to-int v5, v6

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 365
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    float-to-int v11, v7

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 367
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x7

    const/16 v27, 0x0

    move-object/from16 v22, v10

    invoke-direct/range {v22 .. v27}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;-><init>(IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-eqz v3, :cond_1f

    .line 370
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getPower()I

    move-result v3

    .line 371
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;

    const v11, 0x3e99999a    # 0.3f

    int-to-float v12, v3

    mul-float v12, v12, v11

    invoke-static {v12}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v11

    const/4 v12, 0x0

    invoke-direct {v10, v3, v12, v11}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;-><init>(III)V

    :cond_1f
    const v3, 0x3f99999a    # 1.2f

    mul-float v28, v14, v3

    .line 378
    sget-object v30, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->WEEK:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    .line 379
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v31

    mul-float v34, v17, v3

    .line 382
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;

    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;->getMax()I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;->getMax()I

    move-result v10

    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v3, v9, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;-><init>(FLjava/lang/String;)V

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v32

    .line 383
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;->defaultPowerConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;

    .line 384
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerHeaderValues;

    invoke-direct {v3, v8, v2, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerHeaderValues;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v8, 0x0

    move-object/from16 v1, p1

    move-object v2, v3

    move v3, v4

    move v4, v5

    move-object v5, v8

    .line 383
    invoke-static/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;->getHeaders$default(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerHeaderValues;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object v37

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Integer;

    const v1, 0x7f0500de

    .line 391
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const v1, 0x7f05004c

    .line 392
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v18

    const v1, 0x7f0500ec

    .line 393
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 390
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v39

    add-float/2addr v6, v7

    .line 394
    invoke-static {v6}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v41

    .line 377
    new-instance v25, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x1

    const/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v42, 0x528

    const/16 v43, 0x0

    move-object/from16 v29, v25

    invoke-direct/range {v29 .. v43}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;FFZZLjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;Ljava/util/List;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 375
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x1b

    const/16 v30, 0x0

    move-object/from16 v22, v0

    invoke-direct/range {v22 .. v30}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;-><init>(Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;Ljava/util/List;ZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final getPeriodConfig$lambda-13(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;
    .locals 10

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 398
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;->defaultPowerConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;->getDefaultWeekConfig(Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

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

.method public static synthetic lambda$IoaUS6yZPZNhT7Nn7oluS8galf8(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;Landroid/content/Context;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;->getPeriodConfig$lambda-12(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;Landroid/content/Context;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$ueoKVOMmdBek_3JsLQGPZk2oy80(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;Ljava/util/List;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;->getPeriodConfig$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;Ljava/util/List;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$v2r9MhJB8GdYMVmDnR2ReABcl-8(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;->getPeriodConfig$lambda-13(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

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

    .line 242
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;->weekCombinedPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;

    .line 243
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->weekHoursOffsetFromToday(Ljava/util/Calendar;)J

    move-result-wide v3

    const/16 v2, 0xa8

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;-><init>(IJJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;->loadCombinedPeriodData(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;

    move-result-object p1

    .line 244
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;->goalsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository$DefaultImpls;->all$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/-$$Lambda$PowerWeekPeriodFormatterViewModel$ueoKVOMmdBek_3JsLQGPZk2oy80;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/-$$Lambda$PowerWeekPeriodFormatterViewModel$ueoKVOMmdBek_3JsLQGPZk2oy80;

    invoke-virtual {p1, v0, v1}, Lio/reactivex/Observable;->withLatestFrom(Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object p1

    .line 252
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/-$$Lambda$PowerWeekPeriodFormatterViewModel$IoaUS6yZPZNhT7Nn7oluS8galf8;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/-$$Lambda$PowerWeekPeriodFormatterViewModel$IoaUS6yZPZNhT7Nn7oluS8galf8;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 398
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/-$$Lambda$PowerWeekPeriodFormatterViewModel$v2r9MhJB8GdYMVmDnR2ReABcl-8;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/-$$Lambda$PowerWeekPeriodFormatterViewModel$v2r9MhJB8GdYMVmDnR2ReABcl-8;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->onErrorReturn(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1
.end method
