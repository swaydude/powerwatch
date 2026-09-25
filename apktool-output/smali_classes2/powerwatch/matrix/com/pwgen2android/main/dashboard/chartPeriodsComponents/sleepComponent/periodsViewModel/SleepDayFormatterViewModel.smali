.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;
.super Ljava/lang/Object;
.source "SleepPeriodsFormatterViewModels.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ&\u0010\u0010\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010\u00020\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;",
        "sleepDayPeriodDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;",
        "shortLegend",
        "",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "sleepTimeCloudStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;",
        "defaultConfigProvider",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;",
        "sleepLogsAdjustment",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;ZLpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;)V",
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
.field private final defaultConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;

.field private final shortLegend:Z

.field private final sleepDayPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;

.field private final sleepLogsAdjustment:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;

.field private final sleepTimeCloudStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;

.field private final userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;ZLpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;)V
    .locals 1

    const-string v0, "sleepDayPeriodDataProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userPrefsUtils"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepTimeCloudStorage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultConfigProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepLogsAdjustment"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->sleepDayPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;

    .line 105
    iput-boolean p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->shortLegend:Z

    .line 106
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    .line 107
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->sleepTimeCloudStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;

    .line 108
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->defaultConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;

    .line 110
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->sleepLogsAdjustment:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;ZLpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    const/4 p2, 0x0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    move v2, p2

    :goto_0
    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_1

    .line 109
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->DAY:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-direct {p5, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;)V

    :cond_1
    move-object v5, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_2

    .line 110
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;

    invoke-direct {p6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;-><init>()V

    :cond_2
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    .line 104
    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;ZLpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;)V

    return-void
.end method

.method private static final getPeriodConfig$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;Landroid/content/Context;Ljava/util/List;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->defaultConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;

    iget-boolean p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->shortLegend:Z

    invoke-virtual {p2, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;->getDefaultConfig(Landroid/content/Context;Z)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 122
    :cond_0
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    .line 124
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->sleepLogsAdjustment:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->sleepTimeCloudStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;->getSleepTime()I

    move-result v1

    invoke-static {p2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepPeriodsFormatterViewModelsKt;->access$splitSleepDayToSleepSessions(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;I)Lio/reactivex/Observable;

    move-result-object v0

    .line 125
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/-$$Lambda$SleepDayFormatterViewModel$KUPgCkBOiOWKS71TEutduBvaK9I;

    invoke-direct {v1, p1, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/-$$Lambda$SleepDayFormatterViewModel$KUPgCkBOiOWKS71TEutduBvaK9I;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final getPeriodConfig$lambda-1$lambda-0(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "$context"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "this$0"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$sleepDay"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "sleepSessions"

    move-object/from16 v4, p3

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x4

    new-array v2, v2, [Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;

    .line 128
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;

    const v6, 0x7f0f004a

    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    const-string v7, "context.getString(R.string.awake_state)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v7, 0x43160000    # 150.0f

    invoke-direct {v5, v7, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;-><init>(FLjava/lang/String;)V

    const/4 v6, 0x0

    aput-object v5, v2, v6

    .line 129
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;

    const v7, 0x7f0f017c

    invoke-virtual {v0, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v8, "context.getString(R.string.restless)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v7

    const-string v8, "(this as java.lang.String).toLowerCase()"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7}, Lkotlin/text/StringsKt;->capitalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/high16 v8, 0x42c80000    # 100.0f

    invoke-direct {v5, v8, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;-><init>(FLjava/lang/String;)V

    const/4 v7, 0x1

    aput-object v5, v2, v7

    .line 130
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;

    const v8, 0x7f0f0199

    invoke-virtual {v0, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, "context.getString(R.string.sleep_title)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v9, 0x42480000    # 50.0f

    invoke-direct {v5, v9, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;-><init>(FLjava/lang/String;)V

    const/4 v8, 0x2

    aput-object v5, v2, v8

    .line 131
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;

    const v9, 0x7f0f00a0

    invoke-virtual {v0, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    const-string v10, "context.getString(R.string.deep_sleep_state)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x0

    invoke-direct {v5, v10, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;-><init>(FLjava/lang/String;)V

    const/4 v9, 0x3

    aput-object v5, v2, v9

    .line 127
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    .line 134
    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isTwelveHourFormatUsed()Z

    move-result v2

    .line 135
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getStartTime()J

    move-result-wide v9

    invoke-static {v9, v10, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->hoursMinutesTimeFormat(JZ)Ljava/lang/String;

    move-result-object v5

    .line 136
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getEndTime()J

    move-result-wide v9

    invoke-static {v9, v10, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->hoursMinutesTimeFormat(JZ)Ljava/lang/String;

    move-result-object v2

    new-array v8, v8, [Ljava/lang/String;

    aput-object v5, v8, v6

    aput-object v2, v8, v7

    .line 138
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    .line 141
    sget-object v11, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->DAY:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    .line 145
    iget-object v9, v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->sleepTimeCloudStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;

    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;->getSleepTime()I

    move-result v9

    .line 146
    iget-object v10, v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->defaultConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;

    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepHeaderValues;

    .line 149
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getMinsInPeriod()I

    move-result v13

    const/4 v14, 0x0

    invoke-static {v13, v6, v7, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->minutesToHoursAndMinutesFormat$default(IZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    .line 150
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getRestlessMinutes()I

    move-result v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " m"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    const/4 v3, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x22

    const/16 v21, 0x0

    move-object v13, v15

    move-object v14, v5

    move-object v6, v15

    move-object v15, v3

    move-object/from16 v16, v2

    .line 146
    invoke-direct/range {v13 .. v21}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepHeaderValues;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 151
    iget-boolean v3, v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->shortLegend:Z

    .line 146
    invoke-virtual {v10, v0, v6, v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;->getHeaders(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepHeaderValues;Z)Ljava/util/List;

    move-result-object v14

    .line 152
    invoke-static/range {p3 .. p3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " - "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    .line 154
    iget-boolean v0, v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->shortLegend:Z

    xor-int/lit8 v19, v0, 0x1

    .line 140
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;

    const/high16 v13, 0x43cd0000    # 410.0f

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v22, 0xa0

    const/16 v23, 0x0

    move-object v10, v0

    move-object/from16 v17, v8

    move/from16 v21, v9

    invoke-direct/range {v10 .. v23}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;FLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final getPeriodConfig$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->defaultConfigProvider:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;

    iget-boolean p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->shortLegend:Z

    invoke-virtual {p2, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;->getDefaultConfig(Landroid/content/Context;Z)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$BiGJaFnYJ_cHc8lpYDKwFamj4uY(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;Landroid/content/Context;Ljava/util/List;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->getPeriodConfig$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;Landroid/content/Context;Ljava/util/List;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$KUPgCkBOiOWKS71TEutduBvaK9I(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->getPeriodConfig$lambda-1$lambda-0(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Z38LmWIA7XPL6iduQeKhb3_AdKw(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->getPeriodConfig$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;

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
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;",
            ">;"
        }
    .end annotation

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->sleepDayPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;

    .line 116
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->dayHoursOffsetFromToday(Ljava/util/Calendar;)J

    move-result-wide v3

    .line 117
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;->sleepTimeCloudStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;->getSleepTime()I

    move-result v7

    const/16 v2, 0x18

    const-wide/16 v5, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v1, v10

    .line 116
    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;-><init>(IJJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;->loadData(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;

    move-result-object p1

    .line 118
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/-$$Lambda$SleepDayFormatterViewModel$BiGJaFnYJ_cHc8lpYDKwFamj4uY;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/-$$Lambda$SleepDayFormatterViewModel$BiGJaFnYJ_cHc8lpYDKwFamj4uY;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 158
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/-$$Lambda$SleepDayFormatterViewModel$Z38LmWIA7XPL6iduQeKhb3_AdKw;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/-$$Lambda$SleepDayFormatterViewModel$Z38LmWIA7XPL6iduQeKhb3_AdKw;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->onErrorReturn(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1
.end method
