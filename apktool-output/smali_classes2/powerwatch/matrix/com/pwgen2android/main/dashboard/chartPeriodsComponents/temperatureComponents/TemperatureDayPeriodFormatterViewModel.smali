.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;
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
    value = "SMAP\nTemperaturePeriodFormatterViewModels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemperaturePeriodFormatterViewModels.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,574:1\n1547#2:575\n1618#2,3:576\n1043#2:579\n1358#2:580\n1444#2,2:581\n1043#2:583\n1446#2,3:584\n1547#2:587\n1618#2,3:588\n1043#2:591\n1358#2:592\n1444#2,2:593\n1043#2:595\n1446#2,3:596\n1547#2:599\n1618#2,3:600\n1043#2:603\n1358#2:604\n1444#2,2:605\n1043#2:607\n1446#2,3:608\n1557#2:611\n1588#2,3:612\n1591#2:616\n764#2:617\n855#2,2:618\n1475#2:620\n1500#2,3:621\n1503#2,3:631\n1043#2:637\n1547#2:638\n1618#2,3:639\n1547#2:642\n1618#2,3:643\n1547#2:646\n1618#2,3:647\n1043#2:651\n1547#2:652\n1618#2,3:653\n1043#2:656\n1043#2:657\n1043#2:658\n1557#2:659\n1588#2,3:660\n1547#2:666\n1618#2,3:667\n1547#2:673\n1618#2,3:674\n1591#2:677\n764#2:678\n855#2,2:679\n2190#2,14:681\n764#2:695\n855#2,2:696\n1895#2,14:698\n1895#2,14:712\n2190#2,14:726\n2190#2,14:740\n2190#2,14:754\n764#2:768\n855#2,2:769\n1849#2,2:771\n1547#2:773\n1618#2,3:774\n1547#2:777\n1618#2,3:778\n1547#2:781\n1618#2,3:782\n1#3:615\n355#4,7:624\n125#5:634\n152#5,2:635\n154#5:650\n3785#6:663\n4300#6,2:664\n3785#6:670\n4300#6,2:671\n*S KotlinDebug\n*F\n+ 1 TemperaturePeriodFormatterViewModels.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel\n*L\n93#1:575\n93#1:576,3\n94#1:579\n95#1:580\n95#1:581,2\n95#1:583\n95#1:584,3\n99#1:587\n99#1:588,3\n100#1:591\n101#1:592\n101#1:593,2\n101#1:595\n101#1:596,3\n105#1:599\n105#1:600,3\n106#1:603\n107#1:604\n107#1:605,2\n107#1:607\n107#1:608,3\n110#1:611\n110#1:612,3\n110#1:616\n151#1:617\n151#1:618,2\n151#1:620\n151#1:621,3\n151#1:631,3\n154#1:637\n158#1:638\n158#1:639,3\n159#1:642\n159#1:643,3\n160#1:646\n160#1:647,3\n175#1:651\n175#1:652\n175#1:653,3\n211#1:656\n216#1:657\n221#1:658\n225#1:659\n225#1:660,3\n234#1:666\n234#1:667,3\n238#1:673\n238#1:674,3\n225#1:677\n258#1:678\n258#1:679,2\n258#1:681,14\n260#1:695\n260#1:696,2\n260#1:698,14\n261#1:712,14\n265#1:726,14\n266#1:740,14\n267#1:754,14\n273#1:768\n273#1:769,2\n273#1:771,2\n294#1:773\n294#1:774,3\n295#1:777\n295#1:778,3\n296#1:781\n296#1:782,3\n151#1:624,7\n151#1:634\n151#1:635,2\n151#1:650\n234#1:663\n234#1:664,2\n238#1:670\n238#1:671,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J&\u0010\u0011\u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\u00020\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;",
        "walkingDayPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;",
        "restingDayPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;",
        "sleepDayPeriodProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "combinedDayPeriodDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;",
        "defaultTemperatureConfigProvider",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;)V",
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
.field private final combinedDayPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;",
            ">;"
        }
    .end annotation
.end field

.field private final defaultTemperatureConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;

.field private final userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;",
            "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;",
            ")V"
        }
    .end annotation

    const-string v0, "walkingDayPeriodProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "restingDayPeriodProvider"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "sleepDayPeriodProvider"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "userPrefsUtils"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "combinedDayPeriodDataProvider"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "defaultTemperatureConfigProvider"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    .line 74
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->combinedDayPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;

    .line 76
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->defaultTemperatureConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_0

    .line 75
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataProviderImpl;

    invoke-direct {p5, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataProviderImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;)V

    check-cast p5, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;

    :cond_0
    move-object v5, p5

    and-int/lit8 p5, p7, 0x20

    if-eqz p5, :cond_1

    .line 77
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;

    sget-object p5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->DAY:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-direct {p6, p5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;)V

    :cond_1
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 69
    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;)V

    return-void
.end method

.method private static final getPeriodConfig$lambda-24(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;Ljava/util/Calendar;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;)Lio/reactivex/ObservableSource;
    .locals 11

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayPeriods"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getWalkingDays()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getRestingDays()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getSleepDays()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    new-instance p0, Lkotlin/Pair;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_0

    .line 89
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->combinedDayPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;

    .line 90
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    const/16 v2, 0xa8

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->dayHoursOffsetFromToday(Ljava/util/Calendar;)J

    move-result-wide v3

    const/16 p1, 0x18

    int-to-long v5, p1

    add-long/2addr v3, v5

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;-><init>(IJJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;->loadCombinedPeriodData(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;

    move-result-object p1

    .line 91
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$hHrMXxclwiy1i-zPuWtg_nbuk_M;

    invoke-direct {v0, p2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$hHrMXxclwiy1i-zPuWtg_nbuk_M;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    :goto_0
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final getPeriodConfig$lambda-24$lambda-23(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;)Lkotlin/Pair;
    .locals 49

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "$dayPeriods"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "this$0"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "fullDayPeriods"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getRestingDays()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/16 v4, 0xa

    if-eqz v2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    goto :goto_2

    :cond_0
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getRestingDays()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 575
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .line 576
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 577
    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    .line 93
    invoke-static {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->fillWithEmptyHours(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 578
    :cond_1
    check-cast v5, Ljava/util/List;

    .line 575
    check-cast v5, Ljava/lang/Iterable;

    .line 579
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$$inlined$sortedBy$1;

    invoke-direct {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$$inlined$sortedBy$1;-><init>()V

    check-cast v2, Ljava/util/Comparator;

    invoke-static {v5, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 580
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .line 581
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 582
    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    .line 95
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getRestingHours()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    .line 583
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$lambda-3$$inlined$sortedBy$1;

    invoke-direct {v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$lambda-3$$inlined$sortedBy$1;-><init>()V

    check-cast v7, Ljava/util/Comparator;

    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v6

    .line 95
    check-cast v6, Ljava/lang/Iterable;

    .line 584
    invoke-static {v5, v6}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_1

    .line 586
    :cond_2
    move-object v2, v5

    check-cast v2, Ljava/util/List;

    .line 98
    :goto_2
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getWalkingDays()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    goto :goto_5

    :cond_3
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getWalkingDays()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 587
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 588
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 589
    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    .line 99
    invoke-static {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->fillWithEmptyHours(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 590
    :cond_4
    check-cast v6, Ljava/util/List;

    .line 587
    check-cast v6, Ljava/lang/Iterable;

    .line 591
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$$inlined$sortedBy$2;

    invoke-direct {v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$$inlined$sortedBy$2;-><init>()V

    check-cast v5, Ljava/util/Comparator;

    invoke-static {v6, v5}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 592
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .line 593
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 594
    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    .line 101
    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getWalkingHours()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    .line 595
    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$lambda-7$$inlined$sortedBy$1;

    invoke-direct {v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$lambda-7$$inlined$sortedBy$1;-><init>()V

    check-cast v8, Ljava/util/Comparator;

    invoke-static {v7, v8}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v7

    .line 101
    check-cast v7, Ljava/lang/Iterable;

    .line 596
    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_4

    .line 598
    :cond_5
    move-object v5, v6

    check-cast v5, Ljava/util/List;

    .line 104
    :goto_5
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getSleepDays()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_8

    :cond_6
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getSleepDays()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 599
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 600
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 601
    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    .line 105
    invoke-static {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->fillWithEmptyHours(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 602
    :cond_7
    check-cast v6, Ljava/util/List;

    .line 599
    check-cast v6, Ljava/lang/Iterable;

    .line 603
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$$inlined$sortedBy$3;

    invoke-direct {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$$inlined$sortedBy$3;-><init>()V

    check-cast v3, Ljava/util/Comparator;

    invoke-static {v6, v3}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 604
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .line 605
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 606
    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    .line 107
    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getSleepHours()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    .line 607
    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$lambda-11$$inlined$sortedBy$1;

    invoke-direct {v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$lambda-11$$inlined$sortedBy$1;-><init>()V

    check-cast v8, Ljava/util/Comparator;

    invoke-static {v7, v8}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v7

    .line 107
    check-cast v7, Ljava/lang/Iterable;

    .line 608
    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_7

    .line 610
    :cond_8
    move-object v3, v6

    check-cast v3, Ljava/util/List;

    .line 110
    :goto_8
    check-cast v2, Ljava/lang/Iterable;

    .line 611
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 613
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v15, 0x0

    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v19, v15, 0x1

    if-gez v15, :cond_9

    .line 614
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_9
    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;

    .line 112
    invoke-static {v3, v15}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;

    if-nez v11, :cond_a

    .line 113
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;

    move-object/from16 v20, v11

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

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

    const/16 v39, 0x0

    const-wide/16 v40, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const v47, 0x7fffff

    const/16 v48, 0x0

    invoke-direct/range {v20 .. v48}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;-><init>(JJFIIFFFFFFFIIILjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;JIIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_a
    if-ltz v15, :cond_b

    .line 114
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v12

    if-gt v15, v12, :cond_b

    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    goto :goto_a

    :cond_b
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    move-object/from16 v20, v12

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

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

    const-wide/16 v40, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const v47, 0x3fffff

    const/16 v48, 0x0

    invoke-direct/range {v20 .. v48}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;-><init>(JJIIIFFFFFFFFIIDJIIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_a
    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    .line 116
    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getStartTime()J

    move-result-wide v13

    const-wide/16 v16, 0x0

    cmp-long v18, v13, v16

    if-lez v18, :cond_c

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinsInPeriod()I

    move-result v13

    goto :goto_b

    :cond_c
    const/4 v13, 0x0

    .line 117
    :goto_b
    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getStartTime()J

    move-result-wide v20

    cmp-long v14, v20, v16

    if-lez v14, :cond_d

    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getMinsInPeriod()I

    move-result v14

    goto :goto_c

    :cond_d
    const/4 v14, 0x0

    :goto_c
    add-int/2addr v13, v14

    .line 118
    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getStartTime()J

    move-result-wide v20

    cmp-long v14, v20, v16

    if-lez v14, :cond_e

    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getMinsInPeriod()I

    move-result v14

    goto :goto_d

    :cond_e
    const/4 v14, 0x0

    :goto_d
    add-int/2addr v13, v14

    if-nez v13, :cond_f

    .line 121
    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TotalHourAverageData;

    const-wide/16 v21, -0x1

    const-wide/16 v23, -0x1

    const/16 v25, -0x1

    new-instance v26, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x7

    const/4 v14, 0x0

    move-object/from16 v9, v26

    invoke-direct/range {v9 .. v14}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;-><init>(FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v27, -0x1

    const/16 v28, 0x0

    move-object/from16 v20, v8

    invoke-direct/range {v20 .. v28}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TotalHourAverageData;-><init>(JJILpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;IZ)V

    move-object/from16 v25, v2

    move-object/from16 v24, v3

    move-object/from16 v21, v5

    const/16 v27, 0x0

    goto/16 :goto_10

    .line 124
    :cond_f
    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getSkinTemp()F

    move-result v14

    move-object/from16 v21, v5

    float-to-double v4, v14

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinsInPeriod()I

    move-result v14

    int-to-double v9, v14

    int-to-double v13, v13

    div-double/2addr v9, v13

    mul-double v4, v4, v9

    .line 125
    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getSkinTemp()F

    move-result v9

    float-to-double v9, v9

    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getMinsInPeriod()I

    move-result v7

    move-object/from16 v25, v2

    move-object/from16 v24, v3

    int-to-double v2, v7

    div-double/2addr v2, v13

    mul-double v9, v9, v2

    add-double/2addr v4, v9

    .line 126
    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getSkinTemp()F

    move-result v2

    float-to-double v2, v2

    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getMinsInPeriod()I

    move-result v7

    int-to-double v9, v7

    div-double/2addr v9, v13

    mul-double v2, v2, v9

    add-double/2addr v4, v2

    .line 128
    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxSkinTemp()F

    move-result v2

    float-to-double v2, v2

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinsInPeriod()I

    move-result v7

    int-to-double v9, v7

    div-double/2addr v9, v13

    mul-double v2, v2, v9

    .line 129
    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getMaxSkinTemp()F

    move-result v7

    float-to-double v9, v7

    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getMinsInPeriod()I

    move-result v7

    int-to-double v0, v7

    div-double/2addr v0, v13

    mul-double v9, v9, v0

    add-double/2addr v2, v9

    .line 130
    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getMaxSkinTemp()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getMinsInPeriod()I

    move-result v7

    int-to-double v9, v7

    div-double/2addr v9, v13

    mul-double v0, v0, v9

    add-double/2addr v2, v0

    .line 133
    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinSkinTemp()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinsInPeriod()I

    move-result v7

    int-to-double v9, v7

    div-double/2addr v9, v13

    mul-double v0, v0, v9

    .line 134
    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getMinSkinTemp()F

    move-result v7

    float-to-double v9, v7

    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getMinsInPeriod()I

    move-result v7

    move-object/from16 v26, v6

    int-to-double v6, v7

    div-double/2addr v6, v13

    mul-double v9, v9, v6

    add-double/2addr v0, v9

    .line 135
    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getMinSkinTemp()F

    move-result v6

    float-to-double v6, v6

    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getMinsInPeriod()I

    move-result v9

    int-to-double v9, v9

    div-double/2addr v9, v13

    mul-double v6, v6, v9

    add-double/2addr v0, v6

    .line 141
    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getStartTime()J

    move-result-wide v6

    cmp-long v9, v6, v16

    if-lez v9, :cond_10

    new-instance v6, Lkotlin/Pair;

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getStartTime()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHourInDay()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-direct {v6, v7, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_e
    const/16 v27, 0x0

    goto :goto_f

    .line 142
    :cond_10
    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getStartTime()J

    move-result-wide v6

    cmp-long v9, v6, v16

    if-lez v9, :cond_11

    new-instance v6, Lkotlin/Pair;

    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getStartTime()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getHourInDay()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-direct {v6, v7, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_e

    .line 143
    :cond_11
    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getStartTime()J

    move-result-wide v6

    cmp-long v9, v6, v16

    if-lez v9, :cond_12

    new-instance v6, Lkotlin/Pair;

    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getStartTime()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getHourInDay()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-direct {v6, v7, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_e

    .line 144
    :cond_12
    new-instance v6, Lkotlin/Pair;

    const-wide/16 v9, -0x1

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const/16 v27, 0x0

    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-direct {v6, v7, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    :goto_f
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TotalHourAverageData;

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getStartTime()J

    move-result-wide v9

    invoke-virtual {v6}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    move-result-wide v11

    invoke-virtual {v6}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v13

    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    double-to-float v2, v2

    double-to-float v3, v4

    double-to-float v0, v0

    invoke-direct {v14, v2, v3, v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;-><init>(FFF)V

    const/16 v16, 0x0

    const/16 v17, 0x20

    const/16 v18, 0x0

    move-object v8, v7

    invoke-direct/range {v8 .. v18}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TotalHourAverageData;-><init>(JJILpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v26

    :goto_10
    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/16 v4, 0xa

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v15, v19

    move-object/from16 v5, v21

    move-object/from16 v3, v24

    move-object/from16 v2, v25

    goto/16 :goto_9

    :cond_13
    const/16 v27, 0x0

    .line 616
    check-cast v6, Ljava/util/List;

    .line 611
    check-cast v6, Ljava/lang/Iterable;

    .line 617
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 618
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_14
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TotalHourAverageData;

    .line 151
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TotalHourAverageData;->getFullTime()J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v7, v3, v5

    if-lez v7, :cond_15

    const/4 v3, 0x1

    goto :goto_12

    :cond_15
    const/4 v3, 0x0

    :goto_12
    if-eqz v3, :cond_14

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_11

    .line 619
    :cond_16
    check-cast v0, Ljava/util/List;

    .line 617
    check-cast v0, Ljava/lang/Iterable;

    .line 620
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v1, Ljava/util/Map;

    .line 621
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 622
    move-object v3, v2

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TotalHourAverageData;

    .line 151
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TotalHourAverageData;->getHourInDay()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 624
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_17

    .line 623
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/List;

    .line 627
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 623
    :cond_17
    check-cast v4, Ljava/util/List;

    .line 631
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_13

    .line 634
    :cond_18
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 635
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 154
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 637
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$lambda-20$$inlined$sortedBy$1;

    invoke-direct {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$lambda-20$$inlined$sortedBy$1;-><init>()V

    check-cast v4, Ljava/util/Comparator;

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3

    .line 158
    check-cast v3, Ljava/lang/Iterable;

    .line 638
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .line 639
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_15
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_19

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 640
    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TotalHourAverageData;

    .line 158
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TotalHourAverageData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getAvg()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_15

    .line 641
    :cond_19
    check-cast v4, Ljava/util/List;

    .line 638
    check-cast v4, Ljava/lang/Iterable;

    .line 158
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->averageOfFloat(Ljava/lang/Iterable;)D

    move-result-wide v4

    .line 642
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v3, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 643
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_16
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 644
    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TotalHourAverageData;

    .line 159
    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TotalHourAverageData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object v8

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getMaxAvg()F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_16

    .line 645
    :cond_1a
    check-cast v6, Ljava/util/List;

    .line 642
    check-cast v6, Ljava/lang/Iterable;

    .line 159
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->averageOfFloat(Ljava/lang/Iterable;)D

    move-result-wide v6

    .line 646
    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v3, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v8, Ljava/util/Collection;

    .line 647
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_17
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 648
    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TotalHourAverageData;

    .line 160
    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TotalHourAverageData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object v9

    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getMinAvg()F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_17

    .line 649
    :cond_1b
    check-cast v8, Ljava/util/List;

    .line 646
    check-cast v8, Ljava/lang/Iterable;

    .line 160
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->averageOfFloat(Ljava/lang/Iterable;)D

    move-result-wide v8

    const/16 v3, 0x200

    const-wide v10, 0x406fe00000000000L    # 255.0

    cmpl-double v12, v4, v10

    if-lez v12, :cond_1c

    int-to-double v12, v3

    sub-double/2addr v4, v12

    :cond_1c
    cmpl-double v12, v6, v10

    if-lez v12, :cond_1d

    int-to-double v12, v3

    sub-double/2addr v6, v12

    :cond_1d
    cmpl-double v12, v8, v10

    if-lez v12, :cond_1e

    int-to-double v10, v3

    sub-double/2addr v8, v10

    :cond_1e
    move-object/from16 v3, p1

    .line 168
    iget-object v10, v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    const/high16 v11, 0x40800000    # 4.0f

    float-to-double v11, v11

    div-double/2addr v4, v11

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$TEMPERATURE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$TEMPERATURE;

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v10, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v4

    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    .line 169
    iget-object v5, v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    div-double/2addr v6, v11

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    sget-object v7, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$TEMPERATURE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$TEMPERATURE;

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v5, v6, v7}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v5

    invoke-virtual {v5}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    .line 170
    iget-object v6, v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    div-double/2addr v8, v11

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    sget-object v8, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$TEMPERATURE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$TEMPERATURE;

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v6, v7, v8}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v6

    invoke-virtual {v6}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    .line 173
    new-instance v7, Lkotlin/Pair;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    invoke-direct {v8, v5, v4, v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;-><init>(FFF)V

    invoke-direct {v7, v2, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_14

    .line 650
    :cond_1f
    check-cast v0, Ljava/util/List;

    .line 634
    check-cast v0, Ljava/lang/Iterable;

    .line 651
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$$inlined$sortedBy$4;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$$inlined$sortedBy$4;-><init>()V

    check-cast v1, Ljava/util/Comparator;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 652
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 653
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_20

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 654
    check-cast v2, Lkotlin/Pair;

    .line 177
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;

    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    invoke-direct {v3, v4, v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;-><init>(FLpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_18

    .line 655
    :cond_20
    check-cast v1, Ljava/util/List;

    .line 184
    new-instance v0, Lkotlin/Pair;

    move-object/from16 v2, p0

    invoke-direct {v0, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final getPeriodConfig$lambda-47(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;Landroid/content/Context;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;
    .locals 44

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$context"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "dayPeriodPair"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    invoke-virtual/range {p2 .. p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    const-string v3, "dayPeriodPair.first"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;

    .line 192
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getWalkingDays()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 193
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getRestingDays()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 194
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getSleepDays()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 195
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->defaultTemperatureConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;

    invoke-virtual {v0, v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;->getDefaultConfig(Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;

    move-result-object v0

    return-object v0

    .line 198
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 202
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getWalkingDays()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    if-nez v3, :cond_1

    .line 203
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

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

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const v37, 0xffffff

    const/16 v38, 0x0

    invoke-direct/range {v8 .. v38}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;-><init>(JJIILjava/util/List;FIIFFFFFFFIIDIJIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    invoke-static {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->fillWithEmptyHours(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    move-result-object v3

    .line 204
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getRestingDays()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    if-nez v4, :cond_2

    .line 205
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    move-object v8, v4

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

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const v34, 0x3fffff

    const/16 v35, 0x0

    invoke-direct/range {v8 .. v35}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;-><init>(JJFIIFFFFFFFIIIILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_2
    invoke-static {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->fillWithEmptyHours(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    move-result-object v4

    .line 206
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;->getSleepDays()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    if-nez v1, :cond_3

    .line 207
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

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

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const v36, 0xffffff

    const/16 v37, 0x0

    invoke-direct/range {v8 .. v37}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;-><init>(JJFIIFFFFFFFIIIILpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;ILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_3
    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->fillWithEmptyHours(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    move-result-object v1

    .line 210
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getWalkingHours()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 656
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-47$$inlined$sortedBy$1;

    invoke-direct {v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-47$$inlined$sortedBy$1;-><init>()V

    check-cast v5, Ljava/util/Comparator;

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3

    .line 215
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getRestingHours()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    .line 657
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-47$$inlined$sortedBy$2;

    invoke-direct {v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-47$$inlined$sortedBy$2;-><init>()V

    check-cast v5, Ljava/util/Comparator;

    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v4

    .line 220
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getSleepHours()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 658
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-47$$inlined$sortedBy$3;

    invoke-direct {v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-47$$inlined$sortedBy$3;-><init>()V

    check-cast v5, Ljava/util/Comparator;

    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    .line 225
    check-cast v3, Ljava/lang/Iterable;

    .line 659
    new-instance v5, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v3, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .line 661
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v9, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const/4 v12, 0x1

    if-eqz v10, :cond_15

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v13, v9, 0x1

    if-gez v9, :cond_4

    .line 662
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_4
    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    .line 226
    invoke-static {v4, v9}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;

    if-nez v14, :cond_5

    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;

    move-object v15, v14

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

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

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const v39, 0xfffff

    const/16 v40, 0x0

    invoke-direct/range {v15 .. v40}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;-><init>(JJIFIIFFFFFFFIJIIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 227
    :cond_5
    invoke-static {v1, v9}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;

    if-nez v9, :cond_6

    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;

    move-object v15, v9

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

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

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const v42, 0x7fffff

    const/16 v43, 0x0

    invoke-direct/range {v15 .. v43}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;-><init>(JJFIIFFFFFFFIIILjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;JIIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 229
    :cond_6
    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getStartTime()J

    move-result-wide v15

    const-wide/16 v17, 0x0

    cmp-long v19, v15, v17

    if-lez v19, :cond_7

    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getMinsInPeriod()I

    move-result v15

    goto :goto_1

    :cond_7
    const/4 v15, 0x0

    .line 230
    :goto_1
    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getStartTime()J

    move-result-wide v19

    cmp-long v16, v19, v17

    if-lez v16, :cond_8

    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinsInPeriod()I

    move-result v16

    goto :goto_2

    :cond_8
    const/16 v16, 0x0

    :goto_2
    add-int v15, v15, v16

    .line 231
    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getStartTime()J

    move-result-wide v19

    cmp-long v16, v19, v17

    if-lez v16, :cond_9

    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getMinsInPeriod()I

    move-result v16

    goto :goto_3

    :cond_9
    const/16 v16, 0x0

    :goto_3
    add-int v15, v15, v16

    const/4 v11, 0x3

    new-array v8, v11, [Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 233
    move-object/from16 v19, v10

    check-cast v19, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    aput-object v19, v8, v6

    move-object/from16 v20, v14

    check-cast v20, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    aput-object v20, v8, v12

    move-object/from16 v21, v9

    check-cast v21, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    const/16 v22, 0x2

    aput-object v21, v8, v22

    .line 663
    new-instance v23, Ljava/util/ArrayList;

    invoke-direct/range {v23 .. v23}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v12, v23

    check-cast v12, Ljava/util/Collection;

    :goto_4
    if-ge v6, v11, :cond_c

    .line 664
    aget-object v11, v8, v6

    .line 234
    move-object/from16 v26, v11

    check-cast v26, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    invoke-interface/range {v26 .. v26}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getStartTime()J

    move-result-wide v26

    cmp-long v28, v26, v17

    if-lez v28, :cond_a

    const/16 v26, 0x1

    goto :goto_5

    :cond_a
    const/16 v26, 0x0

    :goto_5
    if-eqz v26, :cond_b

    invoke-interface {v12, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_b
    add-int/lit8 v6, v6, 0x1

    const/4 v11, 0x3

    goto :goto_4

    .line 665
    :cond_c
    check-cast v12, Ljava/util/List;

    .line 663
    check-cast v12, Ljava/lang/Iterable;

    .line 666
    new-instance v6, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v12, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v6, v11}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 667
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 668
    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 234
    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    invoke-interface {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMinSkinTemp()F

    move-result v11

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    invoke-interface {v6, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 669
    :cond_d
    check-cast v6, Ljava/util/List;

    .line 666
    check-cast v6, Ljava/lang/Iterable;

    .line 234
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
    new-array v8, v6, [Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    const/4 v11, 0x0

    aput-object v19, v8, v11

    const/4 v11, 0x1

    aput-object v20, v8, v11

    aput-object v21, v8, v22

    .line 670
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    check-cast v11, Ljava/util/Collection;

    const/4 v12, 0x0

    :goto_8
    if-ge v12, v6, :cond_11

    .line 671
    aget-object v6, v8, v12

    .line 238
    move-object/from16 v19, v6

    check-cast v19, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    invoke-interface/range {v19 .. v19}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getStartTime()J

    move-result-wide v19

    cmp-long v21, v19, v17

    if-lez v21, :cond_f

    const/16 v19, 0x1

    goto :goto_9

    :cond_f
    const/16 v19, 0x0

    :goto_9
    if-eqz v19, :cond_10

    invoke-interface {v11, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_10
    add-int/lit8 v12, v12, 0x1

    const/4 v6, 0x3

    goto :goto_8

    .line 672
    :cond_11
    check-cast v11, Ljava/util/List;

    .line 670
    check-cast v11, Ljava/lang/Iterable;

    .line 673
    new-instance v6, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v11, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v6, v12}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 674
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_12

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 675
    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;

    .line 238
    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    invoke-interface {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;->getMaxSkinTemp()F

    move-result v11

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    invoke-interface {v6, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 676
    :cond_12
    check-cast v6, Ljava/util/List;

    .line 673
    check-cast v6, Ljava/lang/Iterable;

    .line 238
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->maxOrNull(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object v6

    if-nez v6, :cond_13

    const/16 v29, 0x0

    goto :goto_b

    :cond_13
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v11

    move/from16 v29, v11

    .line 240
    :goto_b
    invoke-static {v10, v14, v9}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodFormatterViewModelsKt;->processForArtificial(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;)Z

    move-result v30

    .line 241
    invoke-static {v10, v14, v9}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRatePeriodFormatterViewModelsKt;->processForValid(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;)Z

    move-result v32

    if-nez v15, :cond_14

    .line 244
    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    const/16 v28, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x20

    const/16 v34, 0x0

    move-object/from16 v26, v6

    invoke-direct/range {v26 .. v34}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;-><init>(FFFZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v3

    move-object v8, v4

    goto :goto_c

    .line 247
    :cond_14
    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getSkinTemp()F

    move-result v6

    float-to-double v11, v6

    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getMinsInPeriod()I

    move-result v6

    move-object v10, v3

    move-object v8, v4

    int-to-double v3, v6

    int-to-double v6, v15

    div-double/2addr v3, v6

    mul-double v11, v11, v3

    .line 248
    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getSkinTemp()F

    move-result v3

    float-to-double v3, v3

    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinsInPeriod()I

    move-result v14

    int-to-double v14, v14

    div-double/2addr v14, v6

    mul-double v3, v3, v14

    add-double/2addr v11, v3

    .line 249
    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getSkinTemp()F

    move-result v3

    float-to-double v3, v3

    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;->getMinsInPeriod()I

    move-result v9

    int-to-double v14, v9

    div-double/2addr v14, v6

    mul-double v3, v3, v14

    add-double/2addr v11, v3

    .line 252
    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    double-to-float v3, v11

    const/16 v31, 0x0

    const/16 v33, 0x10

    const/16 v34, 0x0

    move-object/from16 v26, v6

    move/from16 v28, v3

    invoke-direct/range {v26 .. v34}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;-><init>(FFFZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_c
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v7, p1

    move-object v4, v8

    move-object v3, v10

    move v9, v13

    const/4 v6, 0x0

    const/16 v8, 0xa

    goto/16 :goto_0

    .line 677
    :cond_15
    check-cast v5, Ljava/util/List;

    .line 256
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-static {v5, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperaturePeriodFormatterViewModelsKt;->convertDataTemperature(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;)Ljava/util/List;

    move-result-object v1

    .line 258
    move-object v3, v1

    check-cast v3, Ljava/lang/Iterable;

    .line 678
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .line 679
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

    .line 258
    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->getValid()Z

    move-result v7

    if-eqz v7, :cond_16

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .line 680
    :cond_17
    check-cast v4, Ljava/util/List;

    .line 678
    check-cast v4, Ljava/lang/Iterable;

    .line 681
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 682
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_18

    move-object v5, v6

    goto :goto_e

    .line 683
    :cond_18
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 684
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_19

    goto :goto_e

    .line 685
    :cond_19
    move-object v7, v5

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    .line 258
    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->getMin()F

    move-result v7

    .line 687
    :cond_1a
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 688
    move-object v9, v8

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    .line 258
    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->getMin()F

    move-result v9

    .line 689
    invoke-static {v7, v9}, Ljava/lang/Float;->compare(FF)I

    move-result v10

    if-lez v10, :cond_1b

    move-object v5, v8

    move v7, v9

    .line 693
    :cond_1b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_1a

    .line 258
    :goto_e
    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    if-nez v5, :cond_1c

    const/4 v8, 0x0

    goto :goto_f

    :cond_1c
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->getMin()F

    move-result v4

    move v8, v4

    .line 695
    :goto_f
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .line 696
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1d
    :goto_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    .line 260
    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->getMalformed()Z

    move-result v9

    const/4 v10, 0x1

    xor-int/2addr v9, v10

    if-eqz v9, :cond_1d

    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_10

    .line 697
    :cond_1e
    check-cast v4, Ljava/util/List;

    .line 695
    check-cast v4, Ljava/lang/Iterable;

    .line 698
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    .line 699
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1f

    move-object v4, v6

    goto :goto_11

    .line 700
    :cond_1f
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 701
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_20

    goto :goto_11

    .line 702
    :cond_20
    move-object v5, v4

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    .line 260
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->getMax()F

    move-result v5

    .line 704
    :cond_21
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 705
    move-object v10, v7

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    .line 260
    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->getMax()F

    move-result v10

    .line 706
    invoke-static {v5, v10}, Ljava/lang/Float;->compare(FF)I

    move-result v11

    if-gez v11, :cond_22

    move-object v4, v7

    move v5, v10

    .line 710
    :cond_22
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_21

    .line 260
    :goto_11
    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    if-nez v4, :cond_23

    const/4 v11, 0x0

    goto :goto_12

    :cond_23
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->getMax()F

    move-result v11

    .line 261
    :goto_12
    move-object v7, v2

    check-cast v7, Ljava/lang/Iterable;

    .line 712
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    .line 713
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_24

    move-object v2, v6

    goto :goto_13

    .line 714
    :cond_24
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 715
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_25

    goto :goto_13

    .line 716
    :cond_25
    move-object v4, v2

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;

    .line 261
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getMaxAvg()F

    move-result v4

    .line 718
    :cond_26
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 719
    move-object v9, v5

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;

    .line 261
    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object v9

    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getMaxAvg()F

    move-result v9

    .line 720
    invoke-static {v4, v9}, Ljava/lang/Float;->compare(FF)I

    move-result v12

    if-gez v12, :cond_27

    move-object v2, v5

    move v4, v9

    .line 724
    :cond_27
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_26

    .line 261
    :goto_13
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;

    if-nez v2, :cond_28

    move-object v2, v6

    goto :goto_14

    :cond_28
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object v2

    :goto_14
    if-nez v2, :cond_29

    move v2, v11

    goto :goto_15

    :cond_29
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getMaxAvg()F

    move-result v2

    .line 262
    :goto_15
    invoke-static {v11, v2}, Ljava/lang/Math;->max(FF)F

    move-result v9

    .line 726
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 727
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2a

    move-object v2, v6

    goto :goto_16

    .line 728
    :cond_2a
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 729
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_2b

    goto :goto_16

    .line 730
    :cond_2b
    move-object v4, v2

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;

    .line 265
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getAvg()F

    move-result v4

    .line 732
    :cond_2c
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 733
    move-object v11, v10

    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;

    .line 265
    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object v11

    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getAvg()F

    move-result v11

    .line 734
    invoke-static {v4, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v12

    if-lez v12, :cond_2d

    move-object v2, v10

    move v4, v11

    .line 738
    :cond_2d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-nez v10, :cond_2c

    .line 265
    :goto_16
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;

    if-nez v2, :cond_2e

    move-object v2, v6

    goto :goto_17

    :cond_2e
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object v2

    :goto_17
    if-nez v2, :cond_2f

    move v10, v8

    goto :goto_18

    :cond_2f
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getAvg()F

    move-result v2

    move v10, v2

    .line 740
    :goto_18
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    .line 741
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_30

    move-object v2, v6

    goto :goto_19

    .line 742
    :cond_30
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 743
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_31

    goto :goto_19

    .line 744
    :cond_31
    move-object v4, v2

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;

    .line 266
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getMinAvg()F

    move-result v4

    .line 746
    :cond_32
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 747
    move-object v12, v5

    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;

    .line 266
    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object v12

    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getMinAvg()F

    move-result v12

    .line 748
    invoke-static {v4, v12}, Ljava/lang/Float;->compare(FF)I

    move-result v13

    if-lez v13, :cond_33

    move-object v2, v5

    move v4, v12

    .line 752
    :cond_33
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_32

    .line 266
    :goto_19
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;

    if-nez v2, :cond_34

    move-object v2, v6

    goto :goto_1a

    :cond_34
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object v2

    :goto_1a
    if-nez v2, :cond_35

    move v5, v8

    goto :goto_1b

    :cond_35
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getMaxAvg()F

    move-result v2

    move v5, v2

    .line 754
    :goto_1b
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    .line 755
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_36

    move-object v2, v6

    goto :goto_1d

    .line 756
    :cond_36
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 757
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_37

    goto :goto_1d

    .line 758
    :cond_37
    move-object v4, v2

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;

    .line 267
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getMaxAvg()F

    move-result v4

    .line 760
    :goto_1c
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 761
    move-object v13, v11

    check-cast v13, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;

    .line 267
    invoke-virtual {v13}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object v13

    invoke-virtual {v13}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getMaxAvg()F

    move-result v13

    .line 762
    invoke-static {v4, v13}, Ljava/lang/Float;->compare(FF)I

    move-result v14

    if-lez v14, :cond_38

    move-object v2, v11

    move v4, v13

    .line 766
    :cond_38
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-nez v11, :cond_42

    .line 267
    :goto_1d
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;

    if-nez v2, :cond_39

    goto :goto_1e

    :cond_39
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object v6

    :goto_1e
    if-nez v6, :cond_3a

    move v2, v8

    goto :goto_1f

    :cond_3a
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getMinAvg()F

    move-result v2

    .line 269
    :goto_1f
    invoke-static {v5, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    invoke-static {v10, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    .line 271
    invoke-static {v2, v8}, Ljava/lang/Math;->min(FF)F

    move-result v8

    .line 768
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .line 769
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3b
    :goto_20
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    .line 273
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->getValid()Z

    move-result v5

    const/4 v13, 0x1

    xor-int/2addr v5, v13

    if-eqz v5, :cond_3b

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_20

    .line 770
    :cond_3c
    check-cast v2, Ljava/util/List;

    .line 768
    check-cast v2, Ljava/lang/Iterable;

    .line 771
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_21
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;

    .line 275
    invoke-virtual {v3, v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->setMin(F)V

    .line 276
    invoke-virtual {v3, v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->setAvg(F)V

    .line 277
    invoke-virtual {v3, v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;->setMax(F)V

    .line 278
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_21

    .line 281
    :cond_3d
    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperaturePeriodFormatterViewModelsKt;->buildEntries(Ljava/util/List;)Ljava/util/List;

    move-result-object v26

    .line 282
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isMetricsUsedOrNull()Ljava/lang/Boolean;

    move-result-object v2

    const/4 v14, 0x0

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3e

    const-string v2, "\u00b0C"

    goto :goto_22

    :cond_3e
    const-string v2, "\u00b0F"

    :goto_22
    move-object v10, v2

    .line 283
    invoke-static {v1, v10}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperaturePeriodFormatterViewModelsKt;->buildHeaderValues(Ljava/util/List;Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureHeaderValues;

    move-result-object v3

    .line 289
    sget-object v25, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->DAY:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    .line 292
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->defaultTemperatureConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;->getHeaders$default(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureHeaderValues;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object v31

    .line 288
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;

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

    move-object/from16 v24, v1

    invoke-direct/range {v24 .. v38}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;FFZLjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;IILjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 773
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v7, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 774
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_23
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 775
    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;

    .line 294
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LineChartEntryData;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getXValue()F

    move-result v6

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getAvg()F

    move-result v4

    invoke-direct {v5, v6, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LineChartEntryData;-><init>(FF)V

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_23

    .line 776
    :cond_3f
    move-object/from16 v29, v2

    check-cast v29, Ljava/util/List;

    .line 777
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v7, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 778
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_24
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_40

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 779
    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;

    .line 295
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LineChartEntryData;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getXValue()F

    move-result v6

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getMaxAvg()F

    move-result v4

    invoke-direct {v5, v6, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LineChartEntryData;-><init>(FF)V

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_24

    .line 780
    :cond_40
    move-object/from16 v30, v2

    check-cast v30, Ljava/util/List;

    .line 781
    new-instance v2, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v7, v15}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 782
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_25
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_41

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 783
    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;

    .line 296
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LineChartEntryData;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getXValue()F

    move-result v6

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;->getAvgData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;->getMinAvg()F

    move-result v4

    invoke-direct {v5, v6, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LineChartEntryData;-><init>(FF)V

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_25

    .line 784
    :cond_41
    move-object/from16 v31, v2

    check-cast v31, Ljava/util/List;

    const/16 v32, 0x0

    const/16 v33, 0x0

    .line 297
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->defaultTemperatureConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;

    move-object/from16 v11, p1

    invoke-virtual {v0, v11}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;->getLegendValues(Landroid/content/Context;)Ljava/util/List;

    move-result-object v34

    const/16 v35, 0x0

    const/16 v36, 0x0

    const v0, 0x3f99999a    # 1.2f

    mul-float v37, v9, v0

    const/16 v38, 0x0

    const/16 v39, 0x16c0

    const/16 v40, 0x0

    .line 286
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;

    move-object/from16 v25, v0

    move-object/from16 v26, v10

    move/from16 v27, v8

    move-object/from16 v28, v1

    invoke-direct/range {v25 .. v40}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;-><init>(Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;FZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_42
    move-object/from16 v11, p1

    goto/16 :goto_1c
.end method

.method private static final getPeriodConfig$lambda-48(Ljava/lang/Throwable;)V
    .locals 0

    .line 303
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final getPeriodConfig$lambda-49(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 304
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->defaultTemperatureConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;->getDefaultConfig(Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$AS4PxM8v-ruVqARsicK71YcWems(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;Ljava/util/Calendar;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->getPeriodConfig$lambda-24(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;Ljava/util/Calendar;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$JL-5ZcIxbKmUFxvL-9vDdFjSDUA(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->getPeriodConfig$lambda-48(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$UprLBB2PujAFKSxE1vGFzP836IA(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;Landroid/content/Context;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->getPeriodConfig$lambda-47(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;Landroid/content/Context;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$hHrMXxclwiy1i-zPuWtg_nbuk_M(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->getPeriodConfig$lambda-24$lambda-23(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$jd5nmJGnmwcmKyM9jNTVlNyPIjA(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->getPeriodConfig$lambda-49(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;

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

    .line 81
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->combinedDayPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;

    .line 82
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->dayHoursOffsetFromToday(Ljava/util/Calendar;)J

    move-result-wide v3

    const/16 v2, 0x18

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;-><init>(IJJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;->loadCombinedPeriodData(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;

    move-result-object v0

    .line 83
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$AS4PxM8v-ruVqARsicK71YcWems;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$AS4PxM8v-ruVqARsicK71YcWems;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;Ljava/util/Calendar;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 189
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$UprLBB2PujAFKSxE1vGFzP836IA;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$UprLBB2PujAFKSxE1vGFzP836IA;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$JL-5ZcIxbKmUFxvL-9vDdFjSDUA;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$JL-5ZcIxbKmUFxvL-9vDdFjSDUA;

    .line 303
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 304
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$jd5nmJGnmwcmKyM9jNTVlNyPIjA;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$jd5nmJGnmwcmKyM9jNTVlNyPIjA;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->onErrorReturn(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1
.end method
