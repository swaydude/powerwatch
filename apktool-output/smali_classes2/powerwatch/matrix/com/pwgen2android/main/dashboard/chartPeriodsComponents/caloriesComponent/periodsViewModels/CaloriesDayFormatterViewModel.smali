.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;
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
    value = "SMAP\nCaloriesPeriodFormatterViewModels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaloriesPeriodFormatterViewModels.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,434:1\n1043#2:435\n1547#2:436\n1618#2,3:437\n1043#2:440\n1547#2:441\n1618#2,3:442\n1043#2:445\n1547#2:446\n1618#2,3:447\n1547#2:450\n1618#2,3:451\n1557#2:454\n1588#2,4:455\n1547#2:459\n1618#2,3:460\n1895#2,14:463\n*S KotlinDebug\n*F\n+ 1 CaloriesPeriodFormatterViewModels.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel\n*L\n98#1:435\n101#1:436\n101#1:437,3\n108#1:440\n111#1:441\n111#1:442,3\n118#1:445\n121#1:446\n121#1:447,3\n141#1:450\n141#1:451,3\n152#1:454\n152#1:455,4\n155#1:459\n155#1:460,3\n155#1:463,14\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;",
        "dayWalkingPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;",
        "dayRestingPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;",
        "daySleepPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;",
        "animate",
        "",
        "combinedDayPeriodDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;",
        "configProvider",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;ZLpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;)V",
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
.field private final animate:Z

.field private final combinedDayPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;",
            ">;"
        }
    .end annotation
.end field

.field private final configProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;ZLpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;",
            "Z",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;",
            ")V"
        }
    .end annotation

    const-string v0, "dayWalkingPeriodProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "dayRestingPeriodProvider"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "daySleepPeriodProvider"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "combinedDayPeriodDataProvider"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "configProvider"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-boolean p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;->animate:Z

    .line 72
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;->combinedDayPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;

    .line 74
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;->configProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;ZLpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    const/4 p4, 0x1

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    move v4, p4

    :goto_0
    and-int/lit8 p4, p7, 0x10

    if-eqz p4, :cond_1

    .line 73
    new-instance p4, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataProviderImpl;

    invoke-direct {p4, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataProviderImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;)V

    move-object p5, p4

    check-cast p5, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;

    :cond_1
    move-object v5, p5

    and-int/lit8 p4, p7, 0x20

    if-eqz p4, :cond_2

    .line 74
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;

    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->DAY:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-direct {p6, p4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;)V

    :cond_2
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 68
    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;ZLpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;)V

    return-void
.end method

.method private static final getPeriodConfig$lambda-10(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "dayPeriods"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getWalkingDays()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 85
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getRestingDays()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 86
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getSleepDays()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 87
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;->configProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;->getDefaultConfig(Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x3b

    const/4 v11, 0x0

    move-object v3, v2

    invoke-direct/range {v3 .. v11}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;-><init>(Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;Ljava/util/List;ZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    .line 90
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getWalkingDays()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    if-nez v2, :cond_1

    .line 91
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

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

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const v33, 0xffffff

    const/16 v34, 0x0

    invoke-direct/range {v4 .. v34}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;-><init>(JJIILjava/util/List;FIIFFFFFFFIIDIJIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    invoke-static {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->fillWithEmptyHours(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    move-result-object v2

    .line 92
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getRestingDays()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    if-nez v4, :cond_2

    .line 93
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

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

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const v31, 0x3fffff

    const/16 v32, 0x0

    invoke-direct/range {v5 .. v32}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;-><init>(JJFIIFFFFFFFIIIILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_2
    invoke-static {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->fillWithEmptyHours(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    move-result-object v4

    .line 94
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getSleepDays()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    if-nez v3, :cond_3

    .line 95
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    move-object v5, v3

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

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const v33, 0xffffff

    const/16 v34, 0x0

    invoke-direct/range {v5 .. v34}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;-><init>(JJFIIFFFFFFFIIIILpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;ILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_3
    invoke-static {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->fillWithEmptyHours(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    move-result-object v3

    .line 97
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getWalkingHours()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 435
    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$1;

    invoke-direct {v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$1;-><init>()V

    check-cast v6, Ljava/util/Comparator;

    invoke-static {v5, v6}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 436
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v5, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 437
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v8, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 438
    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    .line 102
    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getActiveCalories()I

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getBmrCalories()I

    .line 103
    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getActiveCalories()I

    move-result v14

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getBmrCalories()I

    move-result v16

    add-int v16, v14, v16

    .line 104
    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getStartTime()J

    move-result-wide v17

    cmp-long v14, v17, v9

    if-nez v14, :cond_4

    const/4 v9, 0x1

    goto :goto_1

    :cond_4
    const/4 v9, 0x0

    :goto_1
    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getHeartRate()F

    move-result v8

    cmpg-float v8, v8, v11

    if-nez v8, :cond_5

    const/4 v13, 0x1

    :cond_5
    xor-int/lit8 v17, v13, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x8

    const/16 v20, 0x0

    move-object v14, v15

    move-object v8, v15

    move/from16 v15, v16

    move/from16 v16, v9

    .line 103
    invoke-direct/range {v14 .. v20}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;-><init>(IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 439
    :cond_6
    check-cast v6, Ljava/util/List;

    .line 107
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getRestingHours()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 440
    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$2;

    invoke-direct {v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$2;-><init>()V

    check-cast v8, Ljava/util/Comparator;

    invoke-static {v5, v8}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 441
    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v5, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v8, v14}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v8, Ljava/util/Collection;

    .line 442
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 443
    check-cast v14, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;

    .line 112
    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getActiveCalories()I

    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getBmrCalories()I

    .line 113
    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;

    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getActiveCalories()I

    move-result v16

    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getBmrCalories()I

    move-result v17

    add-int v16, v16, v17

    .line 114
    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getStartTime()J

    move-result-wide v17

    cmp-long v19, v17, v9

    if-nez v19, :cond_7

    const/16 v17, 0x1

    goto :goto_3

    :cond_7
    const/16 v17, 0x0

    :goto_3
    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHeartRate()F

    move-result v14

    cmpg-float v14, v14, v11

    if-nez v14, :cond_8

    const/4 v14, 0x1

    goto :goto_4

    :cond_8
    const/4 v14, 0x0

    :goto_4
    xor-int/lit8 v18, v14, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x8

    const/16 v21, 0x0

    move-object v14, v15

    .line 113
    invoke-direct/range {v15 .. v21}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;-><init>(IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v8, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 444
    :cond_9
    check-cast v8, Ljava/util/List;

    .line 117
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getSleepHours()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 445
    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$3;

    invoke-direct {v14}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$3;-><init>()V

    check-cast v14, Ljava/util/Comparator;

    invoke-static {v5, v14}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 446
    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v5, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v14, Ljava/util/Collection;

    .line 447
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .line 448
    check-cast v15, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;

    .line 122
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getActiveCalories()I

    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getBmrCalories()I

    .line 123
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;

    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getActiveCalories()I

    move-result v16

    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getBmrCalories()I

    move-result v17

    add-int v17, v16, v17

    .line 124
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getStartTime()J

    move-result-wide v18

    cmp-long v16, v18, v9

    if-nez v16, :cond_a

    const/16 v18, 0x1

    goto :goto_6

    :cond_a
    const/16 v18, 0x0

    :goto_6
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getHeartRate()F

    move-result v15

    cmpg-float v15, v15, v11

    if-nez v15, :cond_b

    const/4 v15, 0x1

    goto :goto_7

    :cond_b
    const/4 v15, 0x0

    :goto_7
    xor-int/lit8 v19, v15, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x8

    const/16 v22, 0x0

    move-object/from16 v16, v7

    .line 123
    invoke-direct/range {v16 .. v22}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;-><init>(IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v14, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/16 v7, 0xa

    goto :goto_5

    .line 449
    :cond_c
    check-cast v14, Ljava/util/List;

    .line 127
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getActiveCalories()I

    move-result v5

    .line 128
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getActiveCalories()I

    move-result v7

    add-int/2addr v5, v7

    .line 129
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getActiveCalories()I

    move-result v7

    add-int/2addr v5, v7

    .line 131
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getBmrCalories()I

    move-result v7

    .line 132
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getBmrCalories()I

    move-result v4

    add-int/2addr v7, v4

    .line 133
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getBmrCalories()I

    move-result v3

    add-int/2addr v7, v3

    const/4 v3, 0x2

    new-array v4, v3, [Lkotlin/Pair;

    .line 136
    new-instance v9, Lkotlin/Pair;

    const v10, 0x7f0f001f

    invoke-virtual {v1, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    const/16 v15, 0x3e8

    invoke-static {v5, v15}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->divideRounded(Ljava/lang/Number;I)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-static {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->formatByLocale(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v9, v10, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v9, v4, v13

    .line 137
    new-instance v5, Lkotlin/Pair;

    const v9, 0x7f0f0059

    invoke-virtual {v1, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-static {v7, v15}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->divideRounded(Ljava/lang/Number;I)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-static {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->formatByLocale(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v1, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v5, v4, v12

    .line 135
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v24

    .line 140
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getWalkingHours()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v13, v1}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 450
    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 451
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_13

    move-object v4, v1

    check-cast v4, Lkotlin/collections/IntIterator;

    invoke-virtual {v4}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v4

    .line 142
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;

    .line 143
    invoke-static {v8, v4}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;

    .line 144
    invoke-static {v14, v4}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;

    .line 146
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->getCalories()I

    move-result v9

    if-nez v7, :cond_d

    const/4 v10, 0x0

    goto :goto_9

    :cond_d
    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->getCalories()I

    move-result v10

    :goto_9
    add-int/2addr v9, v10

    if-nez v4, :cond_e

    const/4 v10, 0x0

    goto :goto_a

    :cond_e
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->getCalories()I

    move-result v10

    :goto_a
    add-int v17, v9, v10

    .line 148
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->getMalformed()Z

    move-result v5

    if-nez v5, :cond_12

    if-nez v7, :cond_f

    const/4 v5, 0x0

    goto :goto_b

    .line 149
    :cond_f
    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->getMalformed()Z

    move-result v5

    :goto_b
    if-nez v5, :cond_12

    if-nez v4, :cond_10

    const/4 v4, 0x0

    goto :goto_c

    :cond_10
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->getMalformed()Z

    move-result v4

    :goto_c
    if-eqz v4, :cond_11

    goto :goto_d

    :cond_11
    const/16 v20, 0x0

    goto :goto_e

    :cond_12
    :goto_d
    const/16 v20, 0x1

    :goto_e
    const/16 v21, 0x6

    const/16 v22, 0x0

    move-object/from16 v16, v9

    .line 148
    invoke-direct/range {v16 .. v22}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;-><init>(IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 453
    :cond_13
    check-cast v2, Ljava/util/List;

    .line 450
    check-cast v2, Ljava/lang/Iterable;

    .line 454
    new-instance v1, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 456
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x0

    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v4, 0x1

    if-gez v4, :cond_14

    .line 457
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_14
    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;

    .line 153
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;

    int-to-float v4, v4

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->getCalories()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-static {v8, v15}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->divideRounded(Ljava/lang/Number;I)I

    move-result v8

    int-to-float v8, v8

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->getMalformed()Z

    move-result v5

    invoke-direct {v7, v4, v8, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;-><init>(FFZ)V

    invoke-interface {v1, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v4, v6

    goto :goto_f

    .line 458
    :cond_15
    check-cast v1, Ljava/util/List;

    .line 155
    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    .line 459
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .line 460
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 461
    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;

    .line 155
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;->createBarEntry()Lcom/github/mikephil/charting/data/BarEntry;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_10

    .line 462
    :cond_16
    check-cast v4, Ljava/util/List;

    .line 459
    check-cast v4, Ljava/lang/Iterable;

    .line 463
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 464
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_17

    const/4 v2, 0x0

    goto :goto_12

    .line 465
    :cond_17
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 466
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_18

    :goto_11
    move-object v2, v4

    goto :goto_12

    .line 467
    :cond_18
    move-object v5, v4

    check-cast v5, Lcom/github/mikephil/charting/data/BarEntry;

    .line 155
    invoke-virtual {v5}, Lcom/github/mikephil/charting/data/BarEntry;->getY()F

    move-result v5

    .line 469
    :cond_19
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 470
    move-object v7, v6

    check-cast v7, Lcom/github/mikephil/charting/data/BarEntry;

    .line 155
    invoke-virtual {v7}, Lcom/github/mikephil/charting/data/BarEntry;->getY()F

    move-result v7

    .line 471
    invoke-static {v5, v7}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-gez v8, :cond_1a

    move-object v4, v6

    move v5, v7

    .line 475
    :cond_1a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_19

    goto :goto_11

    .line 155
    :goto_12
    check-cast v2, Lcom/github/mikephil/charting/data/BarEntry;

    if-nez v2, :cond_1b

    goto :goto_13

    :cond_1b
    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/BarEntry;->getY()F

    move-result v11

    :goto_13
    const v2, 0x3f99999a    # 1.2f

    mul-float v2, v2, v11

    .line 163
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    .line 164
    sget-object v17, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->DAY:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    .line 165
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    .line 166
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v19

    const/16 v20, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Integer;

    const v5, 0x7f050025

    .line 173
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v1, v13

    const v5, 0x7f0500de

    .line 174
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v1, v12

    const v5, 0x7f0500ec

    .line 175
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v1, v3

    .line 172
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v26

    .line 176
    iget-boolean v0, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;->animate:Z

    const/16 v28, 0x0

    const/16 v29, 0x900

    const/16 v30, 0x0

    move-object/from16 v16, v4

    move/from16 v21, v2

    move/from16 v27, v0

    .line 163
    invoke-direct/range {v16 .. v30}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;FFZZLjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;Ljava/util/List;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 159
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x18

    const/16 v22, 0x0

    const-string v15, ""

    move-object v14, v0

    move-object/from16 v17, v4

    move/from16 v20, v2

    invoke-direct/range {v14 .. v22}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;-><init>(Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;Ljava/util/List;ZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final getPeriodConfig$lambda-11(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;
    .locals 10

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    .line 181
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;->configProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;

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

    .line 180
    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;-><init>(Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;Ljava/util/List;ZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p2
.end method

.method public static synthetic lambda$SdMsH9HY9pvN84kk1DyPBzFXoGY(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;->getPeriodConfig$lambda-11(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$ZnB0w9oIgh95PpS4zOcIZsgn6cQ(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;->getPeriodConfig$lambda-10(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

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

    .line 80
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->dayHoursOffsetFromToday(Ljava/util/Calendar;)J

    move-result-wide v3

    const/16 v2, 0x18

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;-><init>(IJJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 81
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;->combinedDayPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;->loadCombinedPeriodData(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;

    move-result-object p1

    .line 82
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/-$$Lambda$CaloriesDayFormatterViewModel$ZnB0w9oIgh95PpS4zOcIZsgn6cQ;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/-$$Lambda$CaloriesDayFormatterViewModel$ZnB0w9oIgh95PpS4zOcIZsgn6cQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 179
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/-$$Lambda$CaloriesDayFormatterViewModel$SdMsH9HY9pvN84kk1DyPBzFXoGY;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/-$$Lambda$CaloriesDayFormatterViewModel$SdMsH9HY9pvN84kk1DyPBzFXoGY;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->onErrorReturn(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "combinedDayPeriodDataProvider.loadCombinedPeriodData(page)\n                .map { dayPeriods ->\n                    // if there is no data, just return default config\n                    if (dayPeriods.walkingDays.isEmpty() &&\n                            dayPeriods.restingDays.isEmpty() &&\n                            dayPeriods.sleepDays.isEmpty()) {\n                        return@map CombinedBarChartConfig(barConfig = configProvider.getDefaultConfig(context))\n                    }\n\n                    val walking = (dayPeriods.walkingDays.lastOrNull()\n                            ?: WalkingDayPeriod()).fillWithEmptyHours()\n                    val resting = (dayPeriods.restingDays.lastOrNull()\n                            ?: RestingDayPeriod()).fillWithEmptyHours()\n                    val sleep = (dayPeriods.sleepDays.lastOrNull()\n                            ?: SleepDayPeriod()).fillWithEmptyHours()\n\n                    val walkingSortedCalories = walking.walkingHours\n                            .sortedBy {\n                                it.hourInDay\n                            }\n                            .map {\n                                val cals = it.activeCalories.plus(it.bmrCalories)\n                                CaloriesDataContainer(it.activeCalories.plus(it.bmrCalories),\n                                        it.startTime == 0L, it.heartRate != 0F)\n                            }\n\n                    val restingSortedCalories = resting.restingHours\n                            .sortedBy {\n                                it.hourInDay\n                            }\n                            .map {\n                                val cals = it.activeCalories.plus(it.bmrCalories)\n                                CaloriesDataContainer(it.activeCalories.plus(it.bmrCalories),\n                                        it.startTime == 0L, it.heartRate != 0F)\n                            }\n\n                    val sleepSortedCalories = sleep.sleepHours\n                            .sortedBy {\n                                it.hourInDay\n                            }\n                            .map {\n                                val cals = it.activeCalories.plus(it.bmrCalories)\n                                CaloriesDataContainer(it.activeCalories.plus(it.bmrCalories),\n                                        it.startTime == 0L, it.heartRate != 0F)\n                            }\n\n                    val activeCalories = walking.activeCalories\n                            .plus(resting.activeCalories)\n                            .plus(sleep.activeCalories)\n\n                    val bmrCalories = walking.bmrCalories\n                            .plus(resting.bmrCalories)\n                            .plus(sleep.bmrCalories)\n\n                    val headerValues = listOf(\n                            Pair(context.getString(R.string.active_calories_title), activeCalories.divideRounded(1000).formatByLocale()),\n                            Pair(context.getString(R.string.bmr_calories_title), bmrCalories.divideRounded(1000).formatByLocale())\n                    )\n\n                    val entries = 0.until(walking.walkingHours.size)\n                            .map { index ->\n                                val walking = walkingSortedCalories[index]\n                                val resting = restingSortedCalories.getOrNull(index)\n                                val sleeping = sleepSortedCalories.getOrNull(index)\n\n                                val sum = walking.calories + (resting?.calories?: 0) + (sleeping?.calories ?: 0)\n\n                                CaloriesDataContainer(sum, malformedContainer = walking.malformed ||\n                                        (resting?.malformed ?: false) || (sleeping?.malformed ?: false)\n                                )\n                            }\n                            .mapIndexed { index, value ->\n                                BarChartEntryData(index.toFloat(), value.calories.divideRounded(1000).toFloat(), malformed = value.malformed)\n                            }\n                    val max = entries.map { it.createBarEntry() }.maxByOrNull { it.y }?.y ?: 0f\n\n\n\n                    CombinedBarChartConfig(\n                            \"\",\n                            chartMaximum = 1.2f * max,\n                            chartMinimum = 0f,\n                            barConfig = BarChartConfig(\n                                    mode = ChartPeriodMode.DAY,\n                                    barEntries = listOf(entries),\n                                    limitLines = listOf(),\n                                    yMinValue = 0f,\n                                    yMaxValue = 1.2f * max,\n                                    yLinesEnabled = true,\n                                    multipleColors = false,\n                                    headerValues = headerValues,\n                                    barColors = listOf(\n                                            R.color.blue_chart,\n                                            R.color.orange_chart,\n                                            R.color.red_chart),\n                                    performAnimation = animate)\n                    )\n\n                }.onErrorReturn {\n                    CombinedBarChartConfig(\n                     barConfig = configProvider.getDefaultConfig(context)\n                    )\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
