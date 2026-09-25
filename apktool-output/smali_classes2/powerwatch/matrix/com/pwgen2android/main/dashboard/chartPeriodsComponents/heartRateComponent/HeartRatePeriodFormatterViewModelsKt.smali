.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodFormatterViewModelsKt;
.super Ljava/lang/Object;
.source "HeartRatePeriodFormatterViewModels.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHeartRatePeriodFormatterViewModels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRatePeriodFormatterViewModels.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodFormatterViewModelsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,639:1\n1720#2,3:640\n1720#2,3:643\n1720#2,3:646\n1741#2,3:649\n1741#2,3:652\n1741#2,3:655\n764#2:658\n855#2,2:659\n1895#2,14:661\n1895#2,14:675\n1557#2:689\n1588#2,4:690\n764#2:694\n855#2,2:695\n1547#2:697\n1618#2,3:698\n764#2:701\n855#2,2:702\n1547#2:704\n1618#2,3:705\n764#2:708\n855#2,2:709\n1547#2:711\n1618#2,3:712\n*S KotlinDebug\n*F\n+ 1 HeartRatePeriodFormatterViewModels.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodFormatterViewModelsKt\n*L\n75#1:640,3\n76#1:643,3\n77#1:646,3\n98#1:649,3\n99#1:652,3\n100#1:655,3\n346#1:658\n346#1:659,2\n346#1:661,14\n347#1:675,14\n353#1:689\n353#1:690,4\n362#1:694\n362#1:695,2\n362#1:697\n362#1:698,3\n365#1:701\n365#1:702,2\n365#1:704\n365#1:705,3\n366#1:708\n366#1:709,2\n366#1:711\n366#1:712,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001a\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0001\u001a\u001c\u0010\u0005\u001a\u00020\u00062\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0007\u001a\u00020\u0008\u001a\"\u0010\t\u001a\u00020\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0001\u001a\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b\u001a\u001e\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b\u001a\u001e\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b\u001a\u001e\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015\u00a8\u0006\u001f"
    }
    d2 = {
        "buildEntries",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;",
        "combinedData",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;",
        "buildHeaderValues",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateHeaderValues;",
        "hrv",
        "",
        "getMaximum",
        "",
        "combinedHeartRate",
        "lineChartData",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;",
        "processForArtificial",
        "",
        "walkingDay",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;",
        "restingDay",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;",
        "sleepDay",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;",
        "walkingHour",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
        "restingHour",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
        "sleepHour",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;",
        "processForValid",
        "processHourPeriod",
        "processWeekPeriod",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final buildEntries(Ljava/util/List;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;",
            ">;)",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;",
            ">;"
        }
    .end annotation

    const-string v0, "combinedData"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 353
    check-cast p0, Ljava/lang/Iterable;

    .line 689
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 691
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_0

    .line 692
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    .line 354
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;

    int-to-float v5, v1

    .line 355
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMax()I

    move-result v1

    int-to-float v6, v1

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMin()I

    move-result v1

    int-to-float v7, v1

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMax()I

    move-result v1

    int-to-float v8, v1

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMin()I

    move-result v1

    int-to-float v9, v1

    .line 356
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMalformed()Z

    move-result v10

    move-object v4, v11

    .line 354
    invoke-direct/range {v4 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;-><init>(FFFFFZ)V

    invoke-interface {v0, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v1, v3

    goto :goto_0

    .line 693
    :cond_1
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public static final buildHeaderValues(Ljava/util/List;D)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateHeaderValues;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;",
            ">;D)",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateHeaderValues;"
        }
    .end annotation

    const-string v0, "combinedData"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 362
    check-cast p0, Ljava/lang/Iterable;

    .line 694
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 695
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    .line 362
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMalformed()Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 696
    :cond_1
    check-cast v0, Ljava/util/List;

    .line 694
    check-cast v0, Ljava/lang/Iterable;

    .line 697
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 698
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 699
    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    .line 362
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getAvg()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 700
    :cond_2
    check-cast v1, Ljava/util/List;

    .line 697
    check-cast v1, Ljava/lang/Iterable;

    .line 362
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->averageOfInt(Ljava/lang/Iterable;)D

    move-result-wide v0

    .line 363
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v0, "0"

    goto :goto_2

    :cond_3
    invoke-static {v0, v1}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 701
    :goto_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 702
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    .line 365
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMalformed()Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    if-eqz v5, :cond_4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 703
    :cond_5
    check-cast v1, Ljava/util/List;

    .line 701
    check-cast v1, Ljava/lang/Iterable;

    .line 704
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 705
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 706
    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    .line 365
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMin()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 707
    :cond_6
    check-cast v3, Ljava/util/List;

    .line 704
    check-cast v3, Ljava/lang/Iterable;

    .line 365
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->minOrNull(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    const/4 v3, 0x0

    if-nez v1, :cond_7

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    .line 708
    :cond_7
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .line 709
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_8
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    .line 366
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMalformed()Z

    move-result v6

    xor-int/lit8 v6, v6, 0x1

    if-eqz v6, :cond_8

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 710
    :cond_9
    check-cast v4, Ljava/util/List;

    .line 708
    check-cast v4, Ljava/lang/Iterable;

    .line 711
    new-instance p0, Ljava/util/ArrayList;

    invoke-static {v4, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p0, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p0, Ljava/util/Collection;

    .line 712
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 713
    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    .line 366
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMax()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 714
    :cond_a
    check-cast p0, Ljava/util/List;

    .line 711
    check-cast p0, Ljava/lang/Iterable;

    .line 366
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->maxOrNull(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-nez p0, :cond_b

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    .line 368
    :cond_b
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " - "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 370
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateHeaderValues;

    double-to-int p1, p1

    .line 373
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    .line 370
    invoke-direct {v1, v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateHeaderValues;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public static final getMaximum(Ljava/util/List;Ljava/util/List;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;",
            ">;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;",
            ">;)I"
        }
    .end annotation

    const-string v0, "combinedHeartRate"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lineChartData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 346
    check-cast p0, Ljava/lang/Iterable;

    .line 658
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 659
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    .line 346
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMalformed()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 660
    :cond_1
    check-cast v0, Ljava/util/List;

    .line 658
    check-cast v0, Ljava/lang/Iterable;

    .line 661
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 662
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    move-object v0, v1

    goto :goto_1

    .line 663
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 664
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    .line 665
    :cond_3
    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    .line 346
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMax()I

    move-result v2

    .line 667
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 668
    move-object v4, v3

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    .line 346
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMax()I

    move-result v4

    if-ge v2, v4, :cond_5

    move-object v0, v3

    move v2, v4

    .line 673
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_4

    .line 346
    :goto_1
    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;

    if-nez v0, :cond_6

    const/4 p0, 0x0

    const/4 v3, 0x0

    goto :goto_2

    :cond_6
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;->getMax()I

    move-result p0

    move v3, p0

    .line 347
    :goto_2
    check-cast p1, Ljava/lang/Iterable;

    .line 675
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 676
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-nez p0, :cond_7

    move-object p0, v1

    goto :goto_3

    .line 677
    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    .line 678
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_3

    .line 679
    :cond_8
    move-object p1, p0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;

    .line 347
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getMaxAvg()F

    move-result p1

    .line 681
    :cond_9
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 682
    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;

    .line 347
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getMaxAvg()F

    move-result v2

    .line 683
    invoke-static {p1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v5

    if-gez v5, :cond_a

    move-object p0, v0

    move p1, v2

    .line 687
    :cond_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_9

    .line 347
    :goto_3
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;

    if-nez p0, :cond_b

    goto :goto_4

    :cond_b
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object p0

    if-nez p0, :cond_c

    goto :goto_4

    :cond_c
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getMaxAvg()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    :goto_4
    if-nez v1, :cond_d

    move p0, v3

    goto :goto_5

    :cond_d
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result p0

    invoke-static {p0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result p0

    .line 348
    :goto_5
    invoke-static {p0, v3}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public static final processForArtificial(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;)Z
    .locals 7

    const-string v0, "walkingDay"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restingDay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepDay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getWalkingHours()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 640
    instance-of v0, p0, Ljava/util/Collection;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_1

    .line 641
    :cond_1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    .line 75
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getStartTime()J

    move-result-wide v5

    cmp-long v0, v5, v1

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    const/4 p0, 0x0

    :goto_1
    if-eqz p0, :cond_c

    .line 76
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getRestingHours()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 643
    instance-of p1, p0, Ljava/util/Collection;

    if-eqz p1, :cond_5

    move-object p1, p0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    :cond_4
    const/4 p0, 0x1

    goto :goto_3

    .line 644
    :cond_5
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;

    .line 76
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getStartTime()J

    move-result-wide v5

    cmp-long p1, v5, v1

    if-nez p1, :cond_7

    const/4 p1, 0x1

    goto :goto_2

    :cond_7
    const/4 p1, 0x0

    :goto_2
    if-nez p1, :cond_6

    const/4 p0, 0x0

    :goto_3
    if-eqz p0, :cond_c

    .line 77
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getSleepHours()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 646
    instance-of p1, p0, Ljava/util/Collection;

    if-eqz p1, :cond_9

    move-object p1, p0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_9

    :cond_8
    const/4 p0, 0x1

    goto :goto_5

    .line 647
    :cond_9
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;

    .line 77
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getStartTime()J

    move-result-wide p1

    cmp-long v0, p1, v1

    if-nez v0, :cond_b

    const/4 p1, 0x1

    goto :goto_4

    :cond_b
    const/4 p1, 0x0

    :goto_4
    if-nez p1, :cond_a

    const/4 p0, 0x0

    :goto_5
    if-eqz p0, :cond_c

    const/4 v3, 0x1

    :cond_c
    return v3
.end method

.method public static final processForArtificial(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;)Z
    .locals 4

    const-string v0, "walkingHour"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restingHour"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepHour"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getStartTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getStartTime()J

    move-result-wide p0

    cmp-long v0, p0, v2

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getStartTime()J

    move-result-wide p0

    cmp-long p2, p0, v2

    if-nez p2, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final processForValid(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;)Z
    .locals 3

    const-string v0, "walkingHour"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restingHour"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepHour"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getHeartRate()F

    move-result p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    cmpg-float p0, p0, v0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_3

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHeartRate()F

    move-result p0

    cmpg-float p0, p0, v0

    if-nez p0, :cond_1

    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    if-eqz p0, :cond_3

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getHeartRate()F

    move-result p0

    cmpg-float p0, p0, v0

    if-nez p0, :cond_2

    const/4 p0, 0x1

    goto :goto_2

    :cond_2
    const/4 p0, 0x0

    :goto_2
    if-eqz p0, :cond_3

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :goto_3
    return v1
.end method

.method public static final processHourPeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;)Z
    .locals 3

    const-string v0, "walkingHour"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restingHour"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepHour"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getHeartRate()F

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getMinsInPeriod()I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 82
    :goto_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHeartRate()F

    move-result v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinsInPeriod()I

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    add-int/2addr p0, p1

    .line 83
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getHeartRate()F

    move-result p1

    cmpl-float p1, p1, v1

    if-lez p1, :cond_2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getMinsInPeriod()I

    move-result p1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    add-int/2addr p0, p1

    if-nez p0, :cond_3

    const/4 v2, 0x1

    :cond_3
    return v2
.end method

.method public static final processWeekPeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;)Z
    .locals 9

    const-string v0, "walkingDay"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restingDay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepDay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getWalkingHours()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 649
    instance-of v0, p0, Ljava/util/Collection;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 p0, 0x0

    goto :goto_2

    .line 650
    :cond_1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    .line 98
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getStartTime()J

    move-result-wide v6

    cmp-long v8, v6, v2

    if-eqz v8, :cond_4

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getHeartRate()F

    move-result v0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    const/4 p0, 0x1

    :goto_2
    if-nez p0, :cond_10

    .line 99
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getRestingHours()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 652
    instance-of p1, p0, Ljava/util/Collection;

    if-eqz p1, :cond_6

    move-object p1, p0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_6

    :cond_5
    const/4 p0, 0x0

    goto :goto_5

    .line 653
    :cond_6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;

    .line 99
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getStartTime()J

    move-result-wide v6

    cmp-long v0, v6, v2

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHeartRate()F

    move-result p1

    cmpg-float p1, p1, v1

    if-nez p1, :cond_8

    const/4 p1, 0x1

    goto :goto_3

    :cond_8
    const/4 p1, 0x0

    :goto_3
    if-eqz p1, :cond_9

    const/4 p1, 0x1

    goto :goto_4

    :cond_9
    const/4 p1, 0x0

    :goto_4
    if-eqz p1, :cond_7

    const/4 p0, 0x1

    :goto_5
    if-nez p0, :cond_10

    .line 100
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getSleepHours()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 655
    instance-of p1, p0, Ljava/util/Collection;

    if-eqz p1, :cond_b

    move-object p1, p0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_b

    :cond_a
    const/4 p0, 0x0

    goto :goto_8

    .line 656
    :cond_b
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;

    .line 100
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getStartTime()J

    move-result-wide v6

    cmp-long p2, v6, v2

    if-eqz p2, :cond_e

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getHeartRate()F

    move-result p1

    cmpg-float p1, p1, v1

    if-nez p1, :cond_d

    const/4 p1, 0x1

    goto :goto_6

    :cond_d
    const/4 p1, 0x0

    :goto_6
    if-eqz p1, :cond_e

    const/4 p1, 0x1

    goto :goto_7

    :cond_e
    const/4 p1, 0x0

    :goto_7
    if-eqz p1, :cond_c

    const/4 p0, 0x1

    :goto_8
    if-eqz p0, :cond_f

    goto :goto_9

    :cond_f
    const/4 v4, 0x0

    :cond_10
    :goto_9
    return v4
.end method
