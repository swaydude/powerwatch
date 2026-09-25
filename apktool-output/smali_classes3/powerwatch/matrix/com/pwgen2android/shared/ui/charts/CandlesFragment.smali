.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;
.source "CandlesFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCandlesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CandlesFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,212:1\n1547#2:213\n1618#2,3:214\n*S KotlinDebug\n*F\n+ 1 CandlesFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment\n*L\n115#1:213\n115#1:214,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0018\u0000 \u00152\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0014J&\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\u0014H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;",
        "()V",
        "candlesChart",
        "Lcom/github/mikephil/charting/charts/CandleStickChart;",
        "currentConfig",
        "init",
        "",
        "config",
        "rootView",
        "Landroid/view/View;",
        "onCreateView",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "setConfig",
        "",
        "Companion",
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


# static fields
.field private static final CANDLES_CONFIG_PARAM:Ljava/lang/String; = "candlesConfig"

.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment$Companion;


# instance fields
.field private candlesChart:Lcom/github/mikephil/charting/charts/CandleStickChart;

.field private currentConfig:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 56
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;-><init>()V

    return-void
.end method

.method private static final init$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;)V
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$rootView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$config"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;->getContext()Landroid/content/Context;

    move-result-object v2

    if-nez v2, :cond_0

    return-void

    .line 84
    :cond_0
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;->candlesChart:Lcom/github/mikephil/charting/charts/CandleStickChart;

    const v4, 0x7f080133

    .line 85
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    if-eqz v2, :cond_a

    .line 90
    invoke-static {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ChartExtensionsKt;->hideBackgroundGridLines(Lcom/github/mikephil/charting/charts/CandleStickChart;)V

    .line 91
    invoke-static {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ChartExtensionsKt;->removeTouch(Lcom/github/mikephil/charting/charts/CandleStickChart;)V

    .line 92
    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/CandleStickChart;->getDescription()Lcom/github/mikephil/charting/components/Description;

    move-result-object v1

    const/4 v4, 0x0

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v4}, Lcom/github/mikephil/charting/components/Description;->setEnabled(Z)V

    .line 94
    :goto_0
    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/CandleStickChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v1

    .line 95
    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/CandleStickChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v5

    const/high16 v6, 0x41400000    # 12.0f

    const/high16 v7, 0x40a00000    # 5.0f

    const/4 v8, 0x0

    .line 96
    invoke-virtual {v5, v6, v7, v8}, Lcom/github/mikephil/charting/components/YAxis;->enableGridDashedLine(FFF)V

    const/4 v6, 0x1

    .line 97
    invoke-virtual {v5, v6}, Lcom/github/mikephil/charting/components/YAxis;->setDrawLabels(Z)V

    .line 98
    invoke-virtual {v1, v4}, Lcom/github/mikephil/charting/components/YAxis;->setDrawGridLines(Z)V

    .line 99
    invoke-virtual {v5, v6}, Lcom/github/mikephil/charting/components/YAxis;->setDrawGridLines(Z)V

    .line 101
    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/CandleStickChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v7

    .line 102
    sget-object v9, Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;->BOTTOM:Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;

    invoke-virtual {v7, v9}, Lcom/github/mikephil/charting/components/XAxis;->setPosition(Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;)V

    .line 104
    invoke-virtual {v7, v4}, Lcom/github/mikephil/charting/components/XAxis;->setDrawGridLines(Z)V

    .line 105
    invoke-virtual {v7, v6}, Lcom/github/mikephil/charting/components/XAxis;->setDrawLabels(Z)V

    const/4 v9, -0x1

    .line 106
    invoke-virtual {v7, v9}, Lcom/github/mikephil/charting/components/XAxis;->setTextColor(I)V

    .line 107
    invoke-virtual {v5, v9}, Lcom/github/mikephil/charting/components/YAxis;->setTextColor(I)V

    .line 108
    invoke-virtual {v1, v4}, Lcom/github/mikephil/charting/components/YAxis;->setDrawLabels(Z)V

    const/high16 v10, 0x3f800000    # 1.0f

    .line 109
    invoke-virtual {v7, v10}, Lcom/github/mikephil/charting/components/XAxis;->setGranularity(F)V

    .line 110
    invoke-virtual {v7, v6}, Lcom/github/mikephil/charting/components/XAxis;->setGranularityEnabled(Z)V

    .line 111
    invoke-virtual {v7, v6}, Lcom/github/mikephil/charting/components/XAxis;->setAvoidFirstLastClipping(Z)V

    .line 113
    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/CandleStickChart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v10

    invoke-virtual {v10, v4}, Lcom/github/mikephil/charting/components/Legend;->setEnabled(Z)V

    .line 115
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;->getEntries()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    .line 213
    new-instance v11, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v10, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v11, Ljava/util/Collection;

    .line 214
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 215
    check-cast v13, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;

    .line 115
    invoke-virtual {v13}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->createCandleEntry()Lcom/github/mikephil/charting/data/CandleEntry;

    move-result-object v13

    invoke-interface {v11, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 216
    :cond_2
    check-cast v11, Ljava/util/List;

    .line 115
    new-instance v10, Lcom/github/mikephil/charting/data/CandleDataSet;

    const-string v13, ""

    invoke-direct {v10, v11, v13}, Lcom/github/mikephil/charting/data/CandleDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    const/16 v11, 0x50

    .line 116
    invoke-static {v11, v11, v11}, Landroid/graphics/Color;->rgb(III)I

    move-result v11

    invoke-virtual {v10, v11}, Lcom/github/mikephil/charting/data/CandleDataSet;->setColor(I)V

    .line 117
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    const v14, 0x7f050048

    invoke-virtual {v11, v14}, Landroid/content/res/Resources;->getColor(I)I

    move-result v11

    invoke-virtual {v10, v11}, Lcom/github/mikephil/charting/data/CandleDataSet;->setShadowColor(I)V

    const v11, 0x3f4ccccd    # 0.8f

    .line 118
    invoke-virtual {v10, v11}, Lcom/github/mikephil/charting/data/CandleDataSet;->setShadowWidth(F)V

    .line 119
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;->getDecreasingColor()I

    move-result v14

    invoke-virtual {v11, v14}, Landroid/content/res/Resources;->getColor(I)I

    move-result v11

    invoke-virtual {v10, v11}, Lcom/github/mikephil/charting/data/CandleDataSet;->setDecreasingColor(I)V

    .line 120
    sget-object v11, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v10, v11}, Lcom/github/mikephil/charting/data/CandleDataSet;->setDecreasingPaintStyle(Landroid/graphics/Paint$Style;)V

    .line 121
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;->getIncreasingColor()I

    move-result v14

    invoke-virtual {v11, v14}, Landroid/content/res/Resources;->getColor(I)I

    move-result v11

    invoke-virtual {v10, v11}, Lcom/github/mikephil/charting/data/CandleDataSet;->setIncreasingColor(I)V

    .line 122
    sget-object v11, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v10, v11}, Lcom/github/mikephil/charting/data/CandleDataSet;->setIncreasingPaintStyle(Landroid/graphics/Paint$Style;)V

    const v11, -0x333334

    .line 123
    invoke-virtual {v10, v11}, Lcom/github/mikephil/charting/data/CandleDataSet;->setNeutralColor(I)V

    .line 124
    invoke-virtual {v10, v4}, Lcom/github/mikephil/charting/data/CandleDataSet;->setDrawValues(Z)V

    .line 126
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;->getEntries()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    xor-int/2addr v11, v6

    const/4 v14, 0x0

    if-eqz v11, :cond_3

    .line 127
    new-instance v11, Lcom/github/mikephil/charting/data/CandleData;

    new-array v15, v6, [Lcom/github/mikephil/charting/interfaces/datasets/ICandleDataSet;

    check-cast v10, Lcom/github/mikephil/charting/interfaces/datasets/ICandleDataSet;

    aput-object v10, v15, v4

    invoke-direct {v11, v15}, Lcom/github/mikephil/charting/data/CandleData;-><init>([Lcom/github/mikephil/charting/interfaces/datasets/ICandleDataSet;)V

    check-cast v11, Lcom/github/mikephil/charting/data/ChartData;

    invoke-virtual {v2, v11}, Lcom/github/mikephil/charting/charts/CandleStickChart;->setData(Lcom/github/mikephil/charting/data/ChartData;)V

    goto :goto_2

    .line 129
    :cond_3
    invoke-virtual {v2, v14}, Lcom/github/mikephil/charting/charts/CandleStickChart;->setData(Lcom/github/mikephil/charting/data/ChartData;)V

    .line 133
    :goto_2
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;->getMode()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    move-result-object v10

    sget-object v11, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->DAY:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    const/16 v15, 0x18

    if-ne v10, v11, :cond_4

    .line 134
    new-instance v4, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;

    const-string v16, "12A"

    const-string v17, ""

    const-string v18, ""

    const-string v19, "3"

    const-string v20, ""

    const-string v21, ""

    const-string v22, "6"

    const-string v23, ""

    const-string v24, ""

    const-string v25, "9"

    const-string v26, ""

    const-string v27, ""

    const-string v28, "12P"

    const-string v29, ""

    const-string v30, ""

    const-string v31, "3"

    const-string v32, ""

    const-string v33, ""

    const-string v34, "6"

    const-string v35, ""

    const-string v36, ""

    const-string v37, "9"

    const-string v38, ""

    const-string v39, ""

    .line 135
    filled-new-array/range {v16 .. v39}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    .line 134
    invoke-direct {v4, v6}, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;-><init>(Ljava/util/Collection;)V

    check-cast v4, Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;

    invoke-virtual {v7, v4}, Lcom/github/mikephil/charting/components/XAxis;->setValueFormatter(Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;)V

    .line 136
    invoke-virtual {v7, v15}, Lcom/github/mikephil/charting/components/XAxis;->setLabelCount(I)V

    goto/16 :goto_7

    .line 138
    :cond_4
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;->getMode()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    move-result-object v10

    sget-object v11, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->WEEK:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    if-ne v10, v11, :cond_5

    .line 139
    new-instance v4, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;

    new-instance v10, Ljava/text/DateFormatSymbols;

    invoke-direct {v10}, Ljava/text/DateFormatSymbols;-><init>()V

    invoke-static {v10, v14, v6, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->weekDaysByLocale$default(Ljava/text/DateFormatSymbols;Ljava/util/Locale;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    invoke-direct {v4, v6}, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;-><init>(Ljava/util/Collection;)V

    check-cast v4, Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;

    invoke-virtual {v7, v4}, Lcom/github/mikephil/charting/components/XAxis;->setValueFormatter(Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;)V

    .line 140
    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/CandleStickChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/github/mikephil/charting/components/XAxis;->setAxisMinimum(F)V

    const/4 v4, 0x7

    .line 141
    invoke-virtual {v7, v4}, Lcom/github/mikephil/charting/components/XAxis;->setLabelCount(I)V

    goto :goto_7

    .line 144
    :cond_5
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    check-cast v10, Ljava/util/List;

    .line 145
    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/CandleStickChart;->getData()Lcom/github/mikephil/charting/data/ChartData;

    move-result-object v11

    if-eqz v11, :cond_9

    .line 146
    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/CandleStickChart;->getData()Lcom/github/mikephil/charting/data/ChartData;

    move-result-object v11

    check-cast v11, Lcom/github/mikephil/charting/data/CandleData;

    invoke-virtual {v11}, Lcom/github/mikephil/charting/data/CandleData;->getDataSets()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/github/mikephil/charting/interfaces/datasets/ICandleDataSet;

    invoke-interface {v4}, Lcom/github/mikephil/charting/interfaces/datasets/ICandleDataSet;->getEntryCount()I

    move-result v4

    if-gt v6, v4, :cond_9

    :goto_3
    add-int/lit8 v11, v6, 0x1

    const/4 v14, 0x3

    if-eq v6, v14, :cond_7

    if-eq v6, v12, :cond_7

    const/16 v14, 0x11

    if-eq v6, v14, :cond_7

    if-ne v6, v15, :cond_6

    goto :goto_4

    :cond_6
    move-object v14, v13

    goto :goto_5

    .line 147
    :cond_7
    :goto_4
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v14

    .line 148
    :goto_5
    invoke-interface {v10, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-ne v6, v4, :cond_8

    goto :goto_6

    :cond_8
    move v6, v11

    goto :goto_3

    .line 151
    :cond_9
    :goto_6
    new-instance v4, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;

    move-object v6, v10

    check-cast v6, Ljava/util/Collection;

    invoke-direct {v4, v6}, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;-><init>(Ljava/util/Collection;)V

    check-cast v4, Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;

    invoke-virtual {v7, v4}, Lcom/github/mikephil/charting/components/XAxis;->setValueFormatter(Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;)V

    .line 152
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v7, v4}, Lcom/github/mikephil/charting/components/XAxis;->setLabelCount(I)V

    .line 155
    :goto_7
    invoke-virtual {v5, v8}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMinimum(F)V

    .line 156
    invoke-virtual {v1, v8}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMinimum(F)V

    .line 159
    new-instance v4, Lcom/github/mikephil/charting/components/LimitLine;

    invoke-virtual {v5}, Lcom/github/mikephil/charting/components/YAxis;->getAxisMinimum()F

    move-result v6

    invoke-direct {v4, v6}, Lcom/github/mikephil/charting/components/LimitLine;-><init>(F)V

    .line 161
    invoke-virtual {v4, v9}, Lcom/github/mikephil/charting/components/LimitLine;->setLineColor(I)V

    const v6, -0x777778

    .line 162
    invoke-virtual {v4, v6}, Lcom/github/mikephil/charting/components/LimitLine;->setTextColor(I)V

    const/high16 v7, 0x3fc00000    # 1.5f

    .line 163
    invoke-virtual {v4, v7}, Lcom/github/mikephil/charting/components/LimitLine;->setLineWidth(F)V

    .line 164
    sget-object v8, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 159
    invoke-virtual {v5, v4}, Lcom/github/mikephil/charting/components/YAxis;->addLimitLine(Lcom/github/mikephil/charting/components/LimitLine;)V

    .line 165
    new-instance v4, Lcom/github/mikephil/charting/components/LimitLine;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/components/YAxis;->getAxisMinimum()F

    move-result v5

    invoke-direct {v4, v5}, Lcom/github/mikephil/charting/components/LimitLine;-><init>(F)V

    .line 167
    invoke-virtual {v4, v9}, Lcom/github/mikephil/charting/components/LimitLine;->setLineColor(I)V

    .line 168
    invoke-virtual {v4, v6}, Lcom/github/mikephil/charting/components/LimitLine;->setTextColor(I)V

    .line 169
    invoke-virtual {v4, v7}, Lcom/github/mikephil/charting/components/LimitLine;->setLineWidth(F)V

    .line 170
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 165
    invoke-virtual {v1, v4}, Lcom/github/mikephil/charting/components/YAxis;->addLimitLine(Lcom/github/mikephil/charting/components/LimitLine;)V

    .line 173
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v1, 0x7f0f013e

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/github/mikephil/charting/charts/CandleStickChart;->setNoDataText(Ljava/lang/String;)V

    .line 175
    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/CandleStickChart;->invalidate()V

    .line 176
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;->getPerformAnimation()Z

    move-result v0

    if-eqz v0, :cond_a

    const/16 v0, 0x1f4

    .line 177
    sget-object v1, Lcom/github/mikephil/charting/animation/Easing$EasingOption;->EaseOutBack:Lcom/github/mikephil/charting/animation/Easing$EasingOption;

    invoke-virtual {v2, v0, v1}, Lcom/github/mikephil/charting/charts/CandleStickChart;->animateY(ILcom/github/mikephil/charting/animation/Easing$EasingOption;)V

    :cond_a
    return-void
.end method

.method public static synthetic lambda$mvKO5M01jp8zd-BT3PxoI_i62DU(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;->init$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;)V

    return-void
.end method

.method public static final newInstance(Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment$Companion;

    invoke-virtual {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment$Companion;->newInstance(Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method public bridge synthetic init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;Landroid/view/View;)V
    .locals 0

    .line 56
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;->init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;Landroid/view/View;)V

    return-void
.end method

.method protected init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;Landroid/view/View;)V
    .locals 2

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rootView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 82
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/-$$Lambda$CandlesFragment$mvKO5M01jp8zd-BT3PxoI_i62DU;

    invoke-direct {v1, p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/-$$Lambda$CandlesFragment$mvKO5M01jp8zd-BT3PxoI_i62DU;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0b0047

    const/4 v0, 0x0

    .line 66
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 68
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const-string p3, "candlesConfig"

    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;

    .line 70
    :goto_0
    sget p3, Lpowerwatch/matrix/com/pwgen2android/R$id;->candle_chart:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/github/mikephil/charting/charts/CandleStickChart;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;->candlesChart:Lcom/github/mikephil/charting/charts/CandleStickChart;

    if-eqz p2, :cond_1

    const-string p3, "rootView"

    .line 73
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;->init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;Landroid/view/View;)V

    :cond_1
    return-object p1
.end method

.method public setConfig(Ljava/lang/Object;)V
    .locals 3

    .line 185
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;

    if-eqz v0, :cond_2

    .line 186
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 187
    :cond_0
    move-object v1, p1

    check-cast v1, Landroid/os/Parcelable;

    const-string v2, "candlesConfig"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 190
    :goto_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 191
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;->currentConfig:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 192
    move-object v1, p1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;

    invoke-virtual {p0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;->init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;Landroid/view/View;)V

    .line 194
    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;->currentConfig:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;

    return-void

    .line 185
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong config type for candle chart provided!!!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
