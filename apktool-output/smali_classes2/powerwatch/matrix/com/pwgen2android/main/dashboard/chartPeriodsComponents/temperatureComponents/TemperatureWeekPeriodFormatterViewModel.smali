.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;
.super Ljava/lang/Object;
.source "TemperaturePeriodFormatterViewModels.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTemperaturePeriodFormatterViewModels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemperaturePeriodFormatterViewModels.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,574:1\n1043#2:575\n1043#2:576\n1043#2:577\n1557#2:578\n1588#2,3:579\n1547#2:585\n1618#2,3:586\n1547#2:592\n1618#2,3:593\n1591#2:596\n764#2:597\n855#2,2:598\n2190#2,14:600\n764#2:614\n855#2,2:615\n1895#2,14:617\n764#2:631\n855#2,2:632\n1849#2,2:634\n3785#3:582\n4300#3,2:583\n3785#3:589\n4300#3,2:590\n*S KotlinDebug\n*F\n+ 1 TemperaturePeriodFormatterViewModels.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel\n*L\n344#1:575\n347#1:576\n350#1:577\n356#1:578\n356#1:579,3\n367#1:585\n367#1:586,3\n371#1:592\n371#1:593,3\n356#1:596\n392#1:597\n392#1:598,2\n392#1:600,14\n393#1:614\n393#1:615,2\n393#1:617,14\n394#1:631\n394#1:632,2\n394#1:634,2\n367#1:582\n367#1:583,2\n371#1:589\n371#1:590,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J&\u0010\u0011\u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\u00020\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;",
        "walkingWeekPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;",
        "restingWeekPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;",
        "sleepWeekPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "weekCombinedPeriodDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;",
        "defaultTemperatureConfigProvider",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;)V",
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
.field private final defaultTemperatureConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;

.field private final userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

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
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;",
            "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;",
            ")V"
        }
    .end annotation

    const-string v0, "walkingWeekPeriodProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "restingWeekPeriodProvider"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "sleepWeekPeriodProvider"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "userPrefsUtils"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "weekCombinedPeriodDataProvider"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "defaultTemperatureConfigProvider"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 313
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    .line 314
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;->weekCombinedPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;

    .line 316
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;->defaultTemperatureConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_0

    .line 315
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataProviderImpl;

    invoke-direct {p5, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataProviderImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;)V

    check-cast p5, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;

    :cond_0
    move-object v5, p5

    and-int/lit8 p5, p7, 0x20

    if-eqz p5, :cond_1

    .line 317
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;

    sget-object p5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->WEEK:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-direct {p6, p5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;)V

    :cond_1
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 309
    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;)V

    return-void
.end method

.method private static final getPeriodConfig$lambda-15(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;
    .locals 46

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "periods"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 324
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;->getWalkingWeeks()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 325
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;->getRestingWeeks()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 326
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;->getSleepWeeks()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 327
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;->defaultTemperatureConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;->getDefaultConfig(Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;

    move-result-object v0

    return-object v0

    .line 330
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;->getWalkingWeeks()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;

    if-nez v2, :cond_1

    .line 331
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;

    move-object v4, v2

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

    invoke-direct/range {v4 .. v33}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;-><init>(JJIFIIFFFFFFFDIIILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->fillWithEmptyDays(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;

    move-result-object v2

    .line 332
    :cond_1
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;->getRestingWeeks()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;

    if-nez v4, :cond_2

    .line 333
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;

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

    invoke-direct/range {v5 .. v31}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;-><init>(JJFIIFFFFFFFIIILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->fillWithEmptyDays(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;

    move-result-object v4

    .line 334
    :cond_2
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;->getSleepWeeks()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;

    const/4 v5, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x0

    if-nez v3, :cond_3

    .line 335
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;

    move-object v8, v3

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

    invoke-static {v3, v7, v7, v6, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->fillWithEmptyDays$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;ZIILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;

    move-result-object v3

    .line 338
    :cond_3
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;->getWalkingDays()Ljava/util/List;

    move-result-object v2

    .line 339
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;->getRestingDays()Ljava/util/List;

    move-result-object v4

    .line 340
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;->getSleepDays()Ljava/util/List;

    move-result-object v3

    .line 343
    check-cast v2, Ljava/lang/Iterable;

    .line 575
    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel$getPeriodConfig$lambda-15$$inlined$sortedBy$1;

    invoke-direct {v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel$getPeriodConfig$lambda-15$$inlined$sortedBy$1;-><init>()V

    check-cast v8, Ljava/util/Comparator;

    invoke-static {v2, v8}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    .line 346
    check-cast v4, Ljava/lang/Iterable;

    .line 576
    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel$getPeriodConfig$lambda-15$$inlined$sortedBy$2;

    invoke-direct {v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel$getPeriodConfig$lambda-15$$inlined$sortedBy$2;-><init>()V

    check-cast v8, Ljava/util/Comparator;

    invoke-static {v4, v8}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v4

    .line 349
    check-cast v3, Ljava/lang/Iterable;

    .line 577
    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel$getPeriodConfig$lambda-15$$inlined$sortedBy$3;

    invoke-direct {v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel$getPeriodConfig$lambda-15$$inlined$sortedBy$3;-><init>()V

    check-cast v8, Ljava/util/Comparator;

    invoke-static {v3, v8}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3

    .line 356
    check-cast v2, Ljava/lang/Iterable;

    .line 578
    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v2, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v8, Ljava/util/Collection;

    .line 580
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v10, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    const/4 v13, 0x1

    if-eqz v11, :cond_15

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v14, v10, 0x1

    if-gez v10, :cond_4

    .line 581
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_4
    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    .line 359
    invoke-static {v4, v10}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    if-nez v15, :cond_5

    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    move-object/from16 v16, v15

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

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

    const v42, 0x3fffff

    const/16 v43, 0x0

    invoke-direct/range {v16 .. v43}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;-><init>(JJFIIFFFFFFFIIIILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 360
    :cond_5
    invoke-static {v3, v10}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    if-nez v10, :cond_6

    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    move-object/from16 v16, v10

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

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

    const/16 v36, 0x0

    const/16 v37, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const v44, 0xffffff

    const/16 v45, 0x0

    invoke-direct/range {v16 .. v45}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;-><init>(JJFIIFFFFFFFIIIILpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;ILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 362
    :cond_6
    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getStartTime()J

    move-result-wide v16

    const-wide/16 v18, 0x0

    cmp-long v20, v16, v18

    if-lez v20, :cond_7

    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getMinsInPeriod()I

    move-result v16

    goto :goto_1

    :cond_7
    const/16 v16, 0x0

    .line 363
    :goto_1
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getStartTime()J

    move-result-wide v20

    cmp-long v17, v20, v18

    if-lez v17, :cond_8

    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getMinsInPeriod()I

    move-result v17

    goto :goto_2

    :cond_8
    const/16 v17, 0x0

    :goto_2
    add-int v16, v16, v17

    .line 364
    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getStartTime()J

    move-result-wide v20

    cmp-long v17, v20, v18

    if-lez v17, :cond_9

    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getMinsInPeriod()I

    move-result v17

    goto :goto_3

    :cond_9
    const/16 v17, 0x0

    :goto_3
    add-int v5, v16, v17

    new-array v12, v6, [Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 366
    move-object/from16 v17, v11

    check-cast v17, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    aput-object v17, v12, v7

    move-object/from16 v20, v15

    check-cast v20, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    aput-object v20, v12, v13

    move-object/from16 v21, v10

    check-cast v21, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    const/16 v22, 0x2

    aput-object v21, v12, v22

    .line 582
    new-instance v23, Ljava/util/ArrayList;

    invoke-direct/range {v23 .. v23}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v13, v23

    check-cast v13, Ljava/util/Collection;

    :goto_4
    if-ge v7, v6, :cond_c

    .line 583
    aget-object v6, v12, v7

    .line 367
    move-object/from16 v26, v6

    check-cast v26, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    invoke-interface/range {v26 .. v26}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getStartTime()J

    move-result-wide v26

    cmp-long v28, v26, v18

    if-lez v28, :cond_a

    const/16 v26, 0x1

    goto :goto_5

    :cond_a
    const/16 v26, 0x0

    :goto_5
    if-eqz v26, :cond_b

    invoke-interface {v13, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_b
    add-int/lit8 v7, v7, 0x1

    const/4 v6, 0x3

    goto :goto_4

    .line 584
    :cond_c
    check-cast v13, Ljava/util/List;

    .line 582
    check-cast v13, Ljava/lang/Iterable;

    .line 585
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v13, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 586
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_d

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 587
    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 367
    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    invoke-interface {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMinSkinTemp()F

    move-result v12

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-interface {v6, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 588
    :cond_d
    check-cast v6, Ljava/util/List;

    .line 585
    check-cast v6, Ljava/lang/Iterable;

    .line 367
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->minOrNull(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object v6

    if-nez v6, :cond_e

    const/4 v6, 0x3

    const/16 v27, 0x0

    goto :goto_7

    :cond_e
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    move/from16 v27, v6

    const/4 v6, 0x3

    :goto_7
    new-array v7, v6, [Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    const/4 v12, 0x0

    aput-object v17, v7, v12

    const/4 v12, 0x1

    aput-object v20, v7, v12

    aput-object v21, v7, v22

    .line 589
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    check-cast v12, Ljava/util/Collection;

    const/4 v13, 0x0

    :goto_8
    if-ge v13, v6, :cond_11

    .line 590
    aget-object v6, v7, v13

    .line 371
    move-object/from16 v17, v6

    check-cast v17, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    invoke-interface/range {v17 .. v17}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getStartTime()J

    move-result-wide v20

    cmp-long v17, v20, v18

    if-lez v17, :cond_f

    const/16 v17, 0x1

    goto :goto_9

    :cond_f
    const/16 v17, 0x0

    :goto_9
    if-eqz v17, :cond_10

    invoke-interface {v12, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_10
    add-int/lit8 v13, v13, 0x1

    const/4 v6, 0x3

    goto :goto_8

    .line 591
    :cond_11
    check-cast v12, Ljava/util/List;

    .line 589
    check-cast v12, Ljava/lang/Iterable;

    .line 592
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v12, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 593
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_12

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 594
    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 371
    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    invoke-interface {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMaxSkinTemp()F

    move-result v12

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-interface {v6, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 595
    :cond_12
    check-cast v6, Ljava/util/List;

    .line 592
    check-cast v6, Ljava/lang/Iterable;

    .line 371
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->maxOrNull(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object v6

    if-nez v6, :cond_13

    const/16 v29, 0x0

    goto :goto_b

    :cond_13
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v12

    move/from16 v29, v12

    .line 374
    :goto_b
    invoke-static {v11, v15, v10}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodFormatterViewModelsKt;->processWeekPeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;)Z

    move-result v32

    .line 376
    invoke-static {v11, v15, v10}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodFormatterViewModelsKt;->processForArtificial(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;)Z

    move-result v30

    if-nez v5, :cond_14

    .line 380
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    const/16 v28, 0x0

    const/16 v31, 0x0

    move-object/from16 v26, v5

    invoke-direct/range {v26 .. v32}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;-><init>(FFFZZZ)V

    move v15, v14

    goto :goto_c

    .line 383
    :cond_14
    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getSkinTemp()F

    move-result v6

    float-to-double v6, v6

    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getMinsInPeriod()I

    move-result v11

    int-to-double v11, v11

    move-object/from16 v17, v10

    int-to-double v9, v5

    div-double/2addr v11, v9

    mul-double v6, v6, v11

    .line 384
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getSkinTemp()F

    move-result v5

    float-to-double v11, v5

    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getMinsInPeriod()I

    move-result v5

    move v15, v14

    int-to-double v13, v5

    div-double/2addr v13, v9

    mul-double v11, v11, v13

    add-double/2addr v6, v11

    .line 385
    invoke-virtual/range {v17 .. v17}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getSkinTemp()F

    move-result v5

    float-to-double v11, v5

    invoke-virtual/range {v17 .. v17}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getMinsInPeriod()I

    move-result v5

    int-to-double v13, v5

    div-double/2addr v13, v9

    mul-double v11, v11, v13

    add-double/2addr v6, v11

    .line 388
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    double-to-float v6, v6

    const/16 v31, 0x1

    move-object/from16 v26, v5

    move/from16 v28, v6

    invoke-direct/range {v26 .. v32}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;-><init>(FFFZZZ)V

    :goto_c
    invoke-interface {v8, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v10, v15

    const/4 v5, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/16 v9, 0xa

    goto/16 :goto_0

    .line 596
    :cond_15
    check-cast v8, Ljava/util/List;

    .line 391
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-static {v8, v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperaturePeriodFormatterViewModelsKt;->convertDataTemperature(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;)Ljava/util/List;

    move-result-object v2

    .line 392
    move-object v3, v2

    check-cast v3, Ljava/lang/Iterable;

    .line 597
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .line 598
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_16
    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    .line 392
    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->getValid()Z

    move-result v7

    if-eqz v7, :cond_16

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .line 599
    :cond_17
    check-cast v4, Ljava/util/List;

    .line 597
    check-cast v4, Ljava/lang/Iterable;

    .line 600
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 601
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_18

    const/4 v5, 0x0

    goto :goto_e

    .line 602
    :cond_18
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 603
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_19

    goto :goto_e

    .line 604
    :cond_19
    move-object v6, v5

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    .line 392
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->getMin()F

    move-result v6

    .line 606
    :cond_1a
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 607
    move-object v8, v7

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    .line 392
    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->getMin()F

    move-result v8

    .line 608
    invoke-static {v6, v8}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    if-lez v9, :cond_1b

    move-object v5, v7

    move v6, v8

    .line 612
    :cond_1b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_1a

    .line 392
    :goto_e
    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    if-nez v5, :cond_1c

    const/4 v7, 0x0

    goto :goto_f

    :cond_1c
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->getMin()F

    move-result v4

    move v7, v4

    .line 614
    :goto_f
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .line 615
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1d
    :goto_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    .line 393
    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->getValid()Z

    move-result v8

    if-eqz v8, :cond_1d

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_10

    .line 616
    :cond_1e
    check-cast v4, Ljava/util/List;

    .line 614
    check-cast v4, Ljava/lang/Iterable;

    .line 617
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 618
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1f

    const/4 v5, 0x0

    goto :goto_11

    .line 619
    :cond_1f
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 620
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_20

    goto :goto_11

    .line 621
    :cond_20
    move-object v4, v5

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    .line 393
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->getMax()F

    move-result v4

    .line 623
    :cond_21
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 624
    move-object v9, v6

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    .line 393
    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->getMax()F

    move-result v9

    .line 625
    invoke-static {v4, v9}, Ljava/lang/Float;->compare(FF)I

    move-result v10

    if-gez v10, :cond_22

    move-object v5, v6

    move v4, v9

    .line 629
    :cond_22
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_21

    .line 393
    :goto_11
    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    if-nez v5, :cond_23

    const/4 v12, 0x0

    goto :goto_12

    :cond_23
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->getMax()F

    move-result v12

    .line 631
    :goto_12
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .line 632
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_24
    :goto_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_25

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    .line 394
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->getValid()Z

    move-result v6

    const/4 v9, 0x1

    xor-int/2addr v6, v9

    if-eqz v6, :cond_24

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_13

    .line 633
    :cond_25
    check-cast v4, Ljava/util/List;

    .line 631
    check-cast v4, Ljava/lang/Iterable;

    .line 634
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_14
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_26

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    .line 396
    invoke-virtual {v4, v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->setMin(F)V

    .line 397
    invoke-virtual {v4, v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->setAvg(F)V

    .line 398
    invoke-virtual {v4, v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->setMax(F)V

    .line 399
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_14

    .line 403
    :cond_26
    invoke-static {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperaturePeriodFormatterViewModelsKt;->buildEntries(Ljava/util/List;)Ljava/util/List;

    move-result-object v26

    .line 404
    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isMetricsUsedOrNull()Ljava/lang/Boolean;

    move-result-object v3

    const/4 v10, 0x0

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_27

    const-string v3, "\u00b0C"

    goto :goto_15

    :cond_27
    const-string v3, "\u00b0F"

    :goto_15
    move-object v6, v3

    .line 405
    invoke-static {v2, v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperaturePeriodFormatterViewModelsKt;->buildHeaderValues(Ljava/util/List;Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureHeaderValues;

    move-result-object v2

    .line 410
    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;

    .line 411
    sget-object v25, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->WEEK:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    .line 414
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;->defaultTemperatureConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;->getHeaders$default(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureHeaderValues;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object v31

    .line 410
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const v33, 0x7f0500fc

    const v34, 0x7f0500fc

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0xcbc

    const/16 v38, 0x0

    move-object/from16 v24, v0

    invoke-direct/range {v24 .. v38}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;FFZLjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;IILjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    const v1, 0x3f99999a    # 1.2f

    mul-float v37, v12, v1

    const/16 v38, 0x0

    const/16 v39, 0x17f8

    const/16 v40, 0x0

    move-object/from16 v25, v8

    move-object/from16 v26, v6

    move/from16 v27, v7

    move-object/from16 v28, v0

    invoke-direct/range {v25 .. v40}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;-><init>(Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;FZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method private static final getPeriodConfig$lambda-16(Ljava/lang/Throwable;)V
    .locals 0

    .line 421
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final getPeriodConfig$lambda-17(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 422
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;->defaultTemperatureConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;->getDefaultConfig(Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$5ccimIQMhJu6jWDQxrSYep2RUYY(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;->getPeriodConfig$lambda-15(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Rhf5SnoOY0k4G4p6_TLWhW0FT1U(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;->getPeriodConfig$lambda-17(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$k8QDcClvELw4XGb9RxM5lu43vig(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;->getPeriodConfig$lambda-16(Ljava/lang/Throwable;)V

    return-void
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
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;",
            ">;"
        }
    .end annotation

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;->weekCombinedPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;

    .line 321
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

    .line 322
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureWeekPeriodFormatterViewModel$5ccimIQMhJu6jWDQxrSYep2RUYY;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureWeekPeriodFormatterViewModel$5ccimIQMhJu6jWDQxrSYep2RUYY;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureWeekPeriodFormatterViewModel$k8QDcClvELw4XGb9RxM5lu43vig;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureWeekPeriodFormatterViewModel$k8QDcClvELw4XGb9RxM5lu43vig;

    .line 421
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 422
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureWeekPeriodFormatterViewModel$Rhf5SnoOY0k4G4p6_TLWhW0FT1U;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureWeekPeriodFormatterViewModel$Rhf5SnoOY0k4G4p6_TLWhW0FT1U;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureWeekPeriodFormatterViewModel;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->onErrorReturn(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1
.end method
