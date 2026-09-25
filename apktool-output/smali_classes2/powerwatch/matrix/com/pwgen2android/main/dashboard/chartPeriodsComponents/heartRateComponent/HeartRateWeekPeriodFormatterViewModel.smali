.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;
.super Ljava/lang/Object;
.source "HeartRatePeriodFormatterViewModels.kt"

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
    value = "SMAP\nHeartRatePeriodFormatterViewModels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRatePeriodFormatterViewModels.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,639:1\n1043#2:640\n1043#2:641\n1043#2:642\n1557#2:643\n1588#2,3:644\n1547#2:650\n1618#2,3:651\n764#2:654\n855#2,2:655\n1591#2:657\n1557#2:658\n1588#2,4:659\n764#2:663\n855#2,2:664\n1547#2:666\n1618#2,3:667\n764#2:670\n855#2,2:671\n1547#2:673\n1618#2,3:674\n764#2:677\n855#2,2:678\n1547#2:680\n1618#2,3:681\n1895#2,14:684\n3785#3:647\n4300#3,2:648\n*S KotlinDebug\n*F\n+ 1 HeartRatePeriodFormatterViewModels.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel\n*L\n411#1:640\n414#1:641\n417#1:642\n422#1:643\n422#1:644,3\n464#1:650\n464#1:651,3\n464#1:654\n464#1:655,2\n422#1:657\n479#1:658\n479#1:659,4\n489#1:663\n489#1:664,2\n489#1:666\n489#1:667,3\n492#1:670\n492#1:671,2\n492#1:673\n492#1:674,3\n493#1:677\n493#1:678,2\n493#1:680\n493#1:681,3\n507#1:684,14\n432#1:647\n432#1:648,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ&\u0010\u000f\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u00020\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;",
        "walkingWeekPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;",
        "restingWeekPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;",
        "sleepWeekPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;",
        "weekCombinedPeriodDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;",
        "defaultHeartRateConfigProvider",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;)V",
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
.field private final defaultHeartRateConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;

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
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;",
            ")V"
        }
    .end annotation

    const-string v0, "walkingWeekPeriodProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "restingWeekPeriodProvider"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "sleepWeekPeriodProvider"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "weekCombinedPeriodDataProvider"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "defaultHeartRateConfigProvider"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 377
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 381
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;->weekCombinedPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;

    .line 383
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;->defaultHeartRateConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    .line 382
    new-instance p4, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataProviderImpl;

    invoke-direct {p4, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataProviderImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;)V

    check-cast p4, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    .line 384
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;

    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->WEEK:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    const/4 p6, 0x0

    invoke-direct {p5, p4, p6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Z)V

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 377
    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;)V

    return-void
.end method

.method private static final getPeriodConfig$lambda-15(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;
    .locals 47

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$context"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "periods"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 391
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;->getWalkingWeeks()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 392
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;->getRestingWeeks()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 393
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;->getSleepWeeks()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 394
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;->defaultHeartRateConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;

    invoke-virtual {v0, v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;->getDefaultConfig(Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;

    move-result-object v0

    return-object v0

    .line 397
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;->getWalkingWeeks()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;

    if-nez v1, :cond_1

    .line 398
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;

    move-object v8, v1

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

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const v36, 0x7fffff

    const/16 v37, 0x0

    invoke-direct/range {v8 .. v37}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;-><init>(JJIFIIFFFFFFFDIIILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->fillWithEmptyDays(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;

    move-result-object v1

    .line 399
    :cond_1
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;->getRestingWeeks()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;

    if-nez v3, :cond_2

    .line 400
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;

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

    const v33, 0x1fffff

    const/16 v34, 0x0

    invoke-direct/range {v8 .. v34}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;-><init>(JJFIIFFFFFFFIIILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->fillWithEmptyDays(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;

    move-result-object v3

    .line 401
    :cond_2
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;->getSleepWeeks()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;

    const/4 v8, 0x0

    const/4 v4, 0x3

    const/4 v9, 0x0

    if-nez v2, :cond_3

    .line 402
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;

    move-object v10, v2

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

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

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const v37, 0x7fffff

    const/16 v38, 0x0

    invoke-direct/range {v10 .. v38}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;-><init>(JJFIIFFFFFFFIIILjava/util/List;JIFIFFLpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v9, v9, v4, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->fillWithEmptyDays$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;ZIILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;

    move-result-object v2

    .line 405
    :cond_3
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;->getWalkingDays()Ljava/util/List;

    move-result-object v1

    .line 406
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;->getRestingDays()Ljava/util/List;

    move-result-object v3

    .line 407
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;->getSleepDays()Ljava/util/List;

    move-result-object v2

    .line 410
    check-cast v1, Ljava/lang/Iterable;

    .line 640
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel$getPeriodConfig$lambda-15$$inlined$sortedBy$1;

    invoke-direct {v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel$getPeriodConfig$lambda-15$$inlined$sortedBy$1;-><init>()V

    check-cast v5, Ljava/util/Comparator;

    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    .line 413
    check-cast v3, Ljava/lang/Iterable;

    .line 641
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel$getPeriodConfig$lambda-15$$inlined$sortedBy$2;

    invoke-direct {v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel$getPeriodConfig$lambda-15$$inlined$sortedBy$2;-><init>()V

    check-cast v5, Ljava/util/Comparator;

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3

    .line 416
    check-cast v2, Ljava/lang/Iterable;

    .line 642
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel$getPeriodConfig$lambda-15$$inlined$sortedBy$3;

    invoke-direct {v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel$getPeriodConfig$lambda-15$$inlined$sortedBy$3;-><init>()V

    check-cast v5, Ljava/util/Comparator;

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    .line 419
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    move-object v15, v5

    check-cast v15, Ljava/util/List;

    .line 422
    check-cast v1, Ljava/lang/Iterable;

    .line 643
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v1, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v5, v10}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .line 645
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v10, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    const/4 v12, 0x1

    if-eqz v11, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v13, v10, 0x1

    if-gez v10, :cond_4

    .line 646
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_4
    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    .line 423
    invoke-static {v3, v10}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    if-nez v14, :cond_5

    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    move-object/from16 v16, v14

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

    .line 424
    :cond_5
    invoke-static {v2, v10}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    if-nez v16, :cond_6

    new-instance v16, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    move-object/from16 v17, v16

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

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const-wide/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const v45, 0xffffff

    const/16 v46, 0x0

    invoke-direct/range {v17 .. v46}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;-><init>(JJFIIFFFFFFFIIIILpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;ILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_6
    move-object/from16 p2, v16

    .line 426
    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getHeartRate()F

    move-result v16

    const/16 v17, 0x0

    cmpl-float v16, v16, v17

    if-lez v16, :cond_7

    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getMinsInPeriod()I

    move-result v16

    goto :goto_1

    :cond_7
    const/16 v16, 0x0

    .line 427
    :goto_1
    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getHeartRate()F

    move-result v18

    cmpl-float v18, v18, v17

    if-lez v18, :cond_8

    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getMinsInPeriod()I

    move-result v18

    goto :goto_2

    :cond_8
    const/16 v18, 0x0

    :goto_2
    add-int v16, v16, v18

    .line 428
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getHeartRate()F

    move-result v18

    cmpl-float v18, v18, v17

    if-lez v18, :cond_9

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getMinsInPeriod()I

    move-result v18

    goto :goto_3

    :cond_9
    const/16 v18, 0x0

    :goto_3
    add-int v8, v16, v18

    new-array v6, v4, [Ljava/lang/Integer;

    .line 431
    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getMinHeartRate()I

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    aput-object v18, v6, v9

    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getMinHeartRate()I

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    aput-object v18, v6, v12

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getMinHeartRate()I

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    const/16 v20, 0x2

    aput-object v18, v6, v20

    .line 647
    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v12, v18

    check-cast v12, Ljava/util/Collection;

    :goto_4
    if-ge v9, v4, :cond_c

    .line 648
    aget-object v4, v6, v9

    move-object/from16 v23, v4

    check-cast v23, Ljava/lang/Number;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Number;->intValue()I

    move-result v23

    if-lez v23, :cond_a

    const/16 v23, 0x1

    goto :goto_5

    :cond_a
    const/16 v23, 0x0

    :goto_5
    if-eqz v23, :cond_b

    .line 432
    invoke-interface {v12, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_b
    add-int/lit8 v9, v9, 0x1

    const/4 v4, 0x3

    goto :goto_4

    .line 649
    :cond_c
    check-cast v12, Ljava/util/List;

    .line 647
    check-cast v12, Ljava/lang/Iterable;

    .line 432
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->minOrNull(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-nez v4, :cond_d

    const/4 v4, 0x0

    goto :goto_6

    :cond_d
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :goto_6
    const/4 v6, 0x3

    new-array v9, v6, [Ljava/lang/Integer;

    .line 433
    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getMaxHeartRate()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v12, 0x0

    aput-object v6, v9, v12

    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getMaxHeartRate()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v12, 0x1

    aput-object v6, v9, v12

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getMaxHeartRate()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v9, v20

    check-cast v9, [Ljava/lang/Comparable;

    invoke-static {v9}, Lkotlin/collections/ArraysKt;->maxOrNull([Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    if-nez v6, :cond_e

    const/16 v26, 0x0

    goto :goto_7

    :cond_e
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v12

    move/from16 v26, v12

    :goto_7
    if-nez v4, :cond_f

    move-object/from16 v4, p2

    move/from16 v24, v26

    goto :goto_8

    :cond_f
    move/from16 v24, v4

    move-object/from16 v4, p2

    .line 437
    :goto_8
    invoke-static {v11, v14, v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodFormatterViewModelsKt;->processWeekPeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;)Z

    move-result v29

    .line 454
    invoke-static {v11, v14, v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodFormatterViewModelsKt;->processForArtificial(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;)Z

    move-result v27

    const/4 v6, 0x3

    new-array v9, v6, [Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 464
    move-object v12, v11

    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    const/16 v18, 0x0

    aput-object v12, v9, v18

    move-object v12, v14

    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    const/16 v21, 0x1

    aput-object v12, v9, v21

    move-object v12, v4

    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    aput-object v12, v9, v20

    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    .line 650
    new-instance v12, Ljava/util/ArrayList;

    move-object/from16 p2, v1

    const/16 v6, 0xa

    invoke-static {v9, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v12, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v12, Ljava/util/Collection;

    .line 651
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 652
    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 464
    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    invoke-interface {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getHrv()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-interface {v12, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 653
    :cond_10
    check-cast v12, Ljava/util/List;

    .line 650
    check-cast v12, Ljava/lang/Iterable;

    .line 654
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 655
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_11
    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_13

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v12, v9

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    move-result v12

    cmpl-float v12, v12, v17

    if-lez v12, :cond_12

    const/4 v12, 0x1

    goto :goto_b

    :cond_12
    const/4 v12, 0x0

    :goto_b
    if-eqz v12, :cond_11

    .line 464
    invoke-interface {v1, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 656
    :cond_13
    check-cast v1, Ljava/util/List;

    .line 465
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_14

    move-object v6, v2

    const/4 v1, 0x0

    goto :goto_c

    :cond_14
    check-cast v1, Ljava/lang/Iterable;

    move-object v6, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->averageOfFloat(Ljava/lang/Iterable;)D

    move-result-wide v1

    double-to-float v1, v1

    .line 467
    :goto_c
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LineChartEntryData;

    int-to-float v9, v10

    invoke-direct {v2, v9, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LineChartEntryData;-><init>(FF)V

    invoke-interface {v15, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-nez v8, :cond_15

    .line 469
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    const/16 v25, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x40

    const/16 v32, 0x0

    move-object/from16 v23, v1

    invoke-direct/range {v23 .. v32}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;-><init>(IIIZZZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v17, v3

    move/from16 v20, v13

    goto :goto_d

    .line 471
    :cond_15
    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getHeartRate()F

    move-result v2

    float-to-double v9, v2

    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getMinsInPeriod()I

    move-result v2

    int-to-double v11, v2

    move-object/from16 v17, v3

    int-to-double v2, v8

    div-double/2addr v11, v2

    mul-double v9, v9, v11

    .line 472
    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getHeartRate()F

    move-result v8

    float-to-double v11, v8

    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getMinsInPeriod()I

    move-result v8

    move/from16 v20, v13

    int-to-double v13, v8

    div-double/2addr v13, v2

    mul-double v11, v11, v13

    add-double/2addr v9, v11

    .line 473
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getHeartRate()F

    move-result v8

    float-to-double v11, v8

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getMinsInPeriod()I

    move-result v4

    int-to-double v13, v4

    div-double/2addr v13, v2

    mul-double v11, v11, v13

    add-double/2addr v9, v11

    .line 476
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    invoke-static {v9, v10}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result v25

    const/16 v28, 0x1

    float-to-int v1, v1

    move-object/from16 v23, v2

    move/from16 v30, v1

    invoke-direct/range {v23 .. v30}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;-><init>(IIIZZZI)V

    move-object v1, v2

    :goto_d
    invoke-interface {v5, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p2

    move-object v2, v6

    move-object/from16 v3, v17

    move/from16 v10, v20

    const/4 v4, 0x3

    const/16 v6, 0xa

    const/4 v8, 0x0

    const/4 v9, 0x0

    goto/16 :goto_0

    :cond_16
    const/16 v18, 0x0

    .line 657
    check-cast v5, Ljava/util/List;

    .line 479
    move-object v8, v5

    check-cast v8, Ljava/lang/Iterable;

    .line 658
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v8, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 660
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v12, 0x0

    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_18

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v12, 0x1

    if-gez v12, :cond_17

    .line 661
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_17
    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    .line 480
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;

    int-to-float v6, v12

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMax()I

    move-result v9

    int-to-float v9, v9

    .line 481
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMin()I

    move-result v10

    int-to-float v10, v10

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMax()I

    move-result v11

    int-to-float v11, v11

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMin()I

    move-result v12

    int-to-float v12, v12

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMalformed()Z

    move-result v28

    move-object/from16 v22, v5

    move/from16 v23, v6

    move/from16 v24, v9

    move/from16 v25, v10

    move/from16 v26, v11

    move/from16 v27, v12

    .line 480
    invoke-direct/range {v22 .. v28}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;-><init>(FFFFFZ)V

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v12, v4

    goto :goto_e

    .line 662
    :cond_18
    move-object/from16 v31, v1

    check-cast v31, Ljava/util/List;

    .line 663
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 664
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_19
    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    .line 489
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getAvg()I

    move-result v4

    if-lez v4, :cond_1a

    const/4 v12, 0x1

    goto :goto_10

    :cond_1a
    const/4 v12, 0x0

    :goto_10
    if-eqz v12, :cond_19

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_f

    .line 665
    :cond_1b
    check-cast v1, Ljava/util/List;

    .line 663
    check-cast v1, Ljava/lang/Iterable;

    .line 666
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 667
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 668
    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    .line 489
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getAvg()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_11

    .line 669
    :cond_1c
    check-cast v2, Ljava/util/List;

    .line 666
    check-cast v2, Ljava/lang/Iterable;

    .line 489
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->averageOfInt(Ljava/lang/Iterable;)D

    move-result-wide v1

    .line 490
    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v3

    if-eqz v3, :cond_1d

    const-string v1, "0"

    goto :goto_12

    :cond_1d
    invoke-static {v1, v2}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :goto_12
    move-object v10, v1

    .line 670
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 671
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1e
    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_20

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    .line 492
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMin()I

    move-result v4

    if-lez v4, :cond_1f

    const/4 v12, 0x1

    goto :goto_14

    :cond_1f
    const/4 v12, 0x0

    :goto_14
    if-eqz v12, :cond_1e

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_13

    .line 672
    :cond_20
    check-cast v1, Ljava/util/List;

    .line 670
    check-cast v1, Ljava/lang/Iterable;

    .line 673
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 674
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_21

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 675
    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    .line 492
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMin()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_15

    .line 676
    :cond_21
    check-cast v2, Ljava/util/List;

    .line 673
    check-cast v2, Ljava/lang/Iterable;

    .line 492
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->minOrNull(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-nez v1, :cond_22

    const/4 v12, 0x0

    goto :goto_16

    :cond_22
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v12

    .line 677
    :goto_16
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 678
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_23
    :goto_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_25

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    .line 493
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMax()I

    move-result v4

    if-lez v4, :cond_24

    const/4 v4, 0x1

    goto :goto_18

    :cond_24
    const/4 v4, 0x0

    :goto_18
    if-eqz v4, :cond_23

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_17

    .line 679
    :cond_25
    check-cast v1, Ljava/util/List;

    .line 677
    check-cast v1, Ljava/lang/Iterable;

    .line 680
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 681
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_26

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 682
    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    .line 493
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMax()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_19

    .line 683
    :cond_26
    check-cast v2, Ljava/util/List;

    .line 680
    check-cast v2, Ljava/lang/Iterable;

    .line 493
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->maxOrNull(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-nez v1, :cond_27

    const/4 v1, 0x0

    goto :goto_1a

    :cond_27
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 495
    :goto_1a
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " - "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 498
    sget-object v30, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->WEEK:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    .line 499
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;->defaultHeartRateConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;

    .line 500
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateHeaderValues;

    const/4 v12, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    move-object v9, v3

    invoke-direct/range {v9 .. v14}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateHeaderValues;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object/from16 v2, p1

    .line 499
    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;->getHeaders$default(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateHeaderValues;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object v36

    .line 497
    new-instance v13, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0xfbc

    const/16 v43, 0x0

    move-object/from16 v29, v13

    invoke-direct/range {v29 .. v43}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;FFZLjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;IILjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 684
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 685
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_28

    const/4 v8, 0x0

    goto :goto_1b

    .line 686
    :cond_28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 687
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_29

    goto :goto_1b

    .line 688
    :cond_29
    move-object v2, v8

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    .line 507
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMax()I

    move-result v2

    .line 690
    :cond_2a
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 691
    move-object v4, v3

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    .line 507
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMax()I

    move-result v4

    if-ge v2, v4, :cond_2b

    move-object v8, v3

    move v2, v4

    .line 696
    :cond_2b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_2a

    .line 507
    :goto_1b
    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    if-nez v8, :cond_2c

    const/4 v9, 0x0

    goto :goto_1c

    :cond_2c
    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMax()I

    move-result v9

    :goto_1c
    const v1, 0x3f99999a    # 1.2f

    int-to-float v2, v9

    mul-float v22, v2, v1

    .line 513
    move-object v1, v15

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v3, 0x1

    xor-int/lit8 v23, v1, 0x1

    .line 514
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;->defaultHeartRateConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;

    invoke-virtual {v0, v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;->getLegendValues(Landroid/content/Context;)Ljava/util/List;

    move-result-object v19

    .line 509
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x4f9

    const/16 v25, 0x0

    move-object v10, v0

    move-object v5, v15

    move-object v15, v1

    move-object/from16 v20, v5

    invoke-direct/range {v10 .. v25}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;-><init>(Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;FZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final getPeriodConfig$lambda-16(Ljava/lang/Throwable;)V
    .locals 0

    .line 520
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final getPeriodConfig$lambda-17(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 522
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;->defaultHeartRateConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;->getDefaultConfig(Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Fc8GVAdtIrPG36F9EO_-RgIR1wI(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;->getPeriodConfig$lambda-15(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$OxXa5JyeGXUDgPhrHk5waTJQAx0(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;->getPeriodConfig$lambda-16(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$oZ0FWALYJf8S2dWgCbwj3u1yxDs(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;->getPeriodConfig$lambda-17(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;

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
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;",
            ">;"
        }
    .end annotation

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 387
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;->weekCombinedPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;

    .line 388
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

    .line 389
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/-$$Lambda$HeartRateWeekPeriodFormatterViewModel$Fc8GVAdtIrPG36F9EO_-RgIR1wI;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/-$$Lambda$HeartRateWeekPeriodFormatterViewModel$Fc8GVAdtIrPG36F9EO_-RgIR1wI;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/-$$Lambda$HeartRateWeekPeriodFormatterViewModel$OxXa5JyeGXUDgPhrHk5waTJQAx0;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/-$$Lambda$HeartRateWeekPeriodFormatterViewModel$OxXa5JyeGXUDgPhrHk5waTJQAx0;

    .line 519
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 522
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/-$$Lambda$HeartRateWeekPeriodFormatterViewModel$oZ0FWALYJf8S2dWgCbwj3u1yxDs;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/-$$Lambda$HeartRateWeekPeriodFormatterViewModel$oZ0FWALYJf8S2dWgCbwj3u1yxDs;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateWeekPeriodFormatterViewModel;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->onErrorReturn(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1
.end method
