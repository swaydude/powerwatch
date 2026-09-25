.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;
.source "FilledLineChartFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFilledLineChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilledLineChartFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,204:1\n1849#2,2:205\n*S KotlinDebug\n*F\n+ 1 FilledLineChartFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment\n*L\n146#1:205,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0018\u0000 \u00152\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0014J&\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\u0014H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;",
        "()V",
        "currentConfig",
        "lineChart",
        "Lcom/github/mikephil/charting/charts/LineChart;",
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
.field private static final CHART_CONFIG:Ljava/lang/String; = "filledLineChartConfig"

.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment$Companion;


# instance fields
.field private currentConfig:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;

.field private lineChart:Lcom/github/mikephil/charting/charts/LineChart;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;-><init>()V

    return-void
.end method

.method private static final init$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;)V
    .locals 32

    move-object/from16 v0, p0

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$config"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    .line 63
    :cond_0
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-eqz v1, :cond_5

    const/4 v3, 0x0

    .line 69
    invoke-virtual {v1, v3, v3, v3, v3}, Lcom/github/mikephil/charting/charts/LineChart;->setExtraOffsets(FFFF)V

    const/4 v4, 0x0

    .line 70
    invoke-virtual {v1, v4}, Lcom/github/mikephil/charting/charts/LineChart;->setAutoScaleMinMaxEnabled(Z)V

    .line 71
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/LineChart;->getDescription()Lcom/github/mikephil/charting/components/Description;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/github/mikephil/charting/components/Description;->setEnabled(Z)V

    .line 72
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/LineChart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/github/mikephil/charting/components/Legend;->setEnabled(Z)V

    .line 75
    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ChartExtensionsKt;->hideBackgroundGridLines(Lcom/github/mikephil/charting/charts/LineChart;)V

    .line 76
    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ChartExtensionsKt;->removeTouch(Lcom/github/mikephil/charting/charts/LineChart;)V

    .line 77
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/LineChart;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v6, 0x7f0f013e

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/github/mikephil/charting/charts/LineChart;->setNoDataText(Ljava/lang/String;)V

    .line 80
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/LineChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v5

    .line 81
    invoke-virtual {v5}, Lcom/github/mikephil/charting/components/XAxis;->disableGridDashedLine()V

    .line 82
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v6

    const/high16 v7, 0x41400000    # 12.0f

    const/high16 v8, 0x40a00000    # 5.0f

    .line 83
    invoke-virtual {v6, v7, v8, v3}, Lcom/github/mikephil/charting/components/YAxis;->enableGridDashedLine(FFF)V

    .line 87
    invoke-virtual {v5, v4}, Lcom/github/mikephil/charting/components/XAxis;->setDrawGridLines(Z)V

    const/4 v7, 0x1

    .line 88
    invoke-virtual {v5, v7}, Lcom/github/mikephil/charting/components/XAxis;->setDrawAxisLine(Z)V

    const/4 v8, -0x1

    .line 89
    invoke-virtual {v5, v8}, Lcom/github/mikephil/charting/components/XAxis;->setTextColor(I)V

    .line 90
    sget-object v8, Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;->BOTTOM:Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;

    invoke-virtual {v5, v8}, Lcom/github/mikephil/charting/components/XAxis;->setPosition(Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;)V

    .line 91
    invoke-virtual {v5, v7}, Lcom/github/mikephil/charting/components/XAxis;->setDrawLabels(Z)V

    .line 92
    invoke-virtual {v5, v4}, Lcom/github/mikephil/charting/components/XAxis;->setDrawGridLines(Z)V

    const/4 v8, 0x0

    .line 98
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;->getTopAreaEntries()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    xor-int/2addr v9, v7

    if-eqz v9, :cond_1

    .line 99
    new-instance v8, Lcom/github/mikephil/charting/data/LineDataSet;

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;->getTopAreaEntries()Ljava/util/List;

    move-result-object v9

    const-string v10, "TopArea"

    invoke-direct {v8, v9, v10}, Lcom/github/mikephil/charting/data/LineDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 100
    new-instance v9, Lcom/github/mikephil/charting/data/LineDataSet;

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;->getBottomAreaEntries()Ljava/util/List;

    move-result-object v10

    const-string v11, "BottomArea"

    invoke-direct {v9, v10, v11}, Lcom/github/mikephil/charting/data/LineDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 101
    new-instance v10, Lcom/github/mikephil/charting/data/LineDataSet;

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;->getMiddleAreaEntries()Ljava/util/List;

    move-result-object v11

    const-string v12, "MiddleArea"

    invoke-direct {v10, v11, v12}, Lcom/github/mikephil/charting/data/LineDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    const/high16 v11, 0x40000000    # 2.0f

    .line 104
    invoke-virtual {v8, v11}, Lcom/github/mikephil/charting/data/LineDataSet;->setLineWidth(F)V

    .line 105
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;->getContext()Landroid/content/Context;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v13, 0x7f05003c

    invoke-static {v12, v13}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v12

    invoke-virtual {v8, v12}, Lcom/github/mikephil/charting/data/LineDataSet;->setFillColor(I)V

    .line 106
    invoke-virtual {v8, v7}, Lcom/github/mikephil/charting/data/LineDataSet;->setDrawFilled(Z)V

    .line 107
    invoke-virtual {v8, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->setDrawCircles(Z)V

    .line 108
    invoke-virtual {v8, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->setDrawCircleHole(Z)V

    .line 109
    sget-object v12, Lcom/github/mikephil/charting/components/YAxis$AxisDependency;->RIGHT:Lcom/github/mikephil/charting/components/YAxis$AxisDependency;

    invoke-virtual {v8, v12}, Lcom/github/mikephil/charting/data/LineDataSet;->setAxisDependency(Lcom/github/mikephil/charting/components/YAxis$AxisDependency;)V

    const/high16 v12, 0x40400000    # 3.0f

    .line 110
    invoke-virtual {v8, v12}, Lcom/github/mikephil/charting/data/LineDataSet;->setCircleRadius(F)V

    const/16 v14, 0x5a

    .line 111
    invoke-virtual {v8, v14}, Lcom/github/mikephil/charting/data/LineDataSet;->setFillAlpha(I)V

    .line 112
    sget-object v14, Lcom/github/mikephil/charting/data/LineDataSet$Mode;->HORIZONTAL_BEZIER:Lcom/github/mikephil/charting/data/LineDataSet$Mode;

    invoke-virtual {v8, v14}, Lcom/github/mikephil/charting/data/LineDataSet;->setMode(Lcom/github/mikephil/charting/data/LineDataSet$Mode;)V

    .line 113
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;->getContext()Landroid/content/Context;

    move-result-object v14

    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v14, v13}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v14

    invoke-virtual {v8, v14}, Lcom/github/mikephil/charting/data/LineDataSet;->setColor(I)V

    const/high16 v14, 0x3f800000    # 1.0f

    .line 117
    invoke-virtual {v10, v14}, Lcom/github/mikephil/charting/data/LineDataSet;->setLineWidth(F)V

    .line 118
    invoke-virtual {v10, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->setDrawCircles(Z)V

    .line 119
    invoke-virtual {v10, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->setDrawCircleHole(Z)V

    .line 120
    sget-object v14, Lcom/github/mikephil/charting/components/YAxis$AxisDependency;->RIGHT:Lcom/github/mikephil/charting/components/YAxis$AxisDependency;

    invoke-virtual {v10, v14}, Lcom/github/mikephil/charting/data/LineDataSet;->setAxisDependency(Lcom/github/mikephil/charting/components/YAxis$AxisDependency;)V

    .line 121
    sget-object v14, Lcom/github/mikephil/charting/data/LineDataSet$Mode;->HORIZONTAL_BEZIER:Lcom/github/mikephil/charting/data/LineDataSet$Mode;

    invoke-virtual {v10, v14}, Lcom/github/mikephil/charting/data/LineDataSet;->setMode(Lcom/github/mikephil/charting/data/LineDataSet$Mode;)V

    .line 126
    invoke-virtual {v9, v11}, Lcom/github/mikephil/charting/data/LineDataSet;->setLineWidth(F)V

    .line 127
    invoke-virtual {v9, v12}, Lcom/github/mikephil/charting/data/LineDataSet;->setCircleRadius(F)V

    .line 128
    sget-object v10, Lcom/github/mikephil/charting/components/YAxis$AxisDependency;->RIGHT:Lcom/github/mikephil/charting/components/YAxis$AxisDependency;

    invoke-virtual {v9, v10}, Lcom/github/mikephil/charting/data/LineDataSet;->setAxisDependency(Lcom/github/mikephil/charting/components/YAxis$AxisDependency;)V

    .line 129
    sget-object v10, Lcom/github/mikephil/charting/data/LineDataSet$Mode;->HORIZONTAL_BEZIER:Lcom/github/mikephil/charting/data/LineDataSet$Mode;

    invoke-virtual {v9, v10}, Lcom/github/mikephil/charting/data/LineDataSet;->setMode(Lcom/github/mikephil/charting/data/LineDataSet$Mode;)V

    const/16 v10, 0x41

    .line 130
    invoke-virtual {v9, v10}, Lcom/github/mikephil/charting/data/LineDataSet;->setFillAlpha(I)V

    .line 131
    invoke-virtual {v9, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->setDrawCircles(Z)V

    .line 132
    invoke-virtual {v9, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->setDrawCircleHole(Z)V

    .line 133
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0, v13}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/github/mikephil/charting/data/LineDataSet;->setColor(I)V

    .line 136
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryFillFormatter;

    move-object v10, v9

    check-cast v10, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    invoke-direct {v0, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryFillFormatter;-><init>(Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;)V

    .line 137
    check-cast v0, Lcom/github/mikephil/charting/formatter/IFillFormatter;

    invoke-virtual {v8, v0}, Lcom/github/mikephil/charting/data/LineDataSet;->setFillFormatter(Lcom/github/mikephil/charting/formatter/IFillFormatter;)V

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/github/mikephil/charting/data/LineDataSet;

    aput-object v8, v0, v4

    aput-object v9, v0, v7

    .line 138
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 139
    new-instance v8, Lcom/github/mikephil/charting/data/LineData;

    invoke-direct {v8, v0}, Lcom/github/mikephil/charting/data/LineData;-><init>(Ljava/util/List;)V

    .line 141
    :cond_1
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryAreaChartRenderer;

    move-object v9, v1

    check-cast v9, Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/LineChart;->getAnimator()Lcom/github/mikephil/charting/animation/ChartAnimator;

    move-result-object v10

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/LineChart;->getViewPortHandler()Lcom/github/mikephil/charting/utils/ViewPortHandler;

    move-result-object v11

    invoke-direct {v0, v9, v10, v11}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryAreaChartRenderer;-><init>(Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V

    check-cast v0, Lcom/github/mikephil/charting/renderer/DataRenderer;

    invoke-virtual {v1, v0}, Lcom/github/mikephil/charting/charts/LineChart;->setRenderer(Lcom/github/mikephil/charting/renderer/DataRenderer;)V

    if-eqz v8, :cond_3

    .line 144
    invoke-virtual {v8, v4}, Lcom/github/mikephil/charting/data/LineData;->setHighlightEnabled(Z)V

    .line 145
    move-object v0, v8

    check-cast v0, Lcom/github/mikephil/charting/data/ChartData;

    invoke-virtual {v1, v0}, Lcom/github/mikephil/charting/charts/LineChart;->setData(Lcom/github/mikephil/charting/data/ChartData;)V

    .line 146
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/LineChart;->getData()Lcom/github/mikephil/charting/data/ChartData;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/data/LineData;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/data/LineData;->getDataSets()Ljava/util/List;

    move-result-object v0

    const-string v9, "chart.data.dataSets"

    invoke-static {v0, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    .line 205
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    .line 147
    invoke-interface {v9, v4}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->setDrawValues(Z)V

    goto :goto_0

    .line 149
    :cond_2
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/LineChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    invoke-virtual {v8}, Lcom/github/mikephil/charting/data/LineData;->getDataSets()Ljava/util/List;

    move-result-object v4

    const-string v9, "linesData.dataSets"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    invoke-interface {v4}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getEntryCount()I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/github/mikephil/charting/components/XAxis;->setLabelCount(I)V

    .line 151
    :cond_3
    check-cast v8, Lcom/github/mikephil/charting/data/ChartData;

    invoke-virtual {v1, v8}, Lcom/github/mikephil/charting/charts/LineChart;->setData(Lcom/github/mikephil/charting/data/ChartData;)V

    .line 153
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;->getMode()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    move-result-object v0

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->DAY:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    if-ne v0, v4, :cond_4

    .line 156
    new-instance v0, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;

    const-string v8, "12A"

    const-string v9, ""

    const-string v10, ""

    const-string v11, "3"

    const-string v12, ""

    const-string v13, ""

    const-string v14, "6"

    const-string v15, ""

    const-string v16, ""

    const-string v17, "9"

    const-string v18, ""

    const-string v19, ""

    const-string v20, "12P"

    const-string v21, ""

    const-string v22, ""

    const-string v23, "3"

    const-string v24, ""

    const-string v25, ""

    const-string v26, "6"

    const-string v27, ""

    const-string v28, ""

    const-string v29, "9"

    const-string v30, ""

    const-string v31, ""

    .line 157
    filled-new-array/range {v8 .. v31}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    .line 156
    invoke-direct {v0, v4}, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;-><init>(Ljava/util/Collection;)V

    check-cast v0, Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;

    .line 155
    invoke-virtual {v5, v0}, Lcom/github/mikephil/charting/components/XAxis;->setValueFormatter(Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;)V

    .line 159
    invoke-virtual {v6, v7}, Lcom/github/mikephil/charting/components/YAxis;->setDrawGridLines(Z)V

    .line 160
    invoke-virtual {v6, v7}, Lcom/github/mikephil/charting/components/YAxis;->setEnabled(Z)V

    const/4 v0, 0x3

    .line 161
    invoke-virtual {v6, v0}, Lcom/github/mikephil/charting/components/YAxis;->setLabelCount(I)V

    const v0, -0x777778

    .line 162
    invoke-virtual {v6, v0}, Lcom/github/mikephil/charting/components/YAxis;->setTextColor(I)V

    .line 163
    invoke-virtual {v6, v7}, Lcom/github/mikephil/charting/components/YAxis;->setDrawLabels(Z)V

    .line 168
    :cond_4
    invoke-virtual {v6, v3}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMinimum(F)V

    .line 170
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/LineChart;->invalidate()V

    .line 171
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;->getPerformAnimation()Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v0, 0x1f4

    .line 172
    sget-object v2, Lcom/github/mikephil/charting/animation/Easing$EasingOption;->EaseOutBack:Lcom/github/mikephil/charting/animation/Easing$EasingOption;

    invoke-virtual {v1, v0, v2}, Lcom/github/mikephil/charting/charts/LineChart;->animateY(ILcom/github/mikephil/charting/animation/Easing$EasingOption;)V

    :cond_5
    return-void
.end method

.method public static synthetic lambda$8DgONy72uiX848J1cFvTYBrGwSE(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;->init$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;)V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method public bridge synthetic init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;Landroid/view/View;)V
    .locals 0

    .line 39
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;->init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;Landroid/view/View;)V

    return-void
.end method

.method protected init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;Landroid/view/View;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rootView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 61
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/-$$Lambda$FilledLineChartFragment$8DgONy72uiX848J1cFvTYBrGwSE;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/-$$Lambda$FilledLineChartFragment$8DgONy72uiX848J1cFvTYBrGwSE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0b0059

    const/4 v0, 0x0

    .line 46
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 48
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const-string p3, "filledLineChartConfig"

    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;

    :goto_0
    const p3, 0x7f08011a

    .line 50
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/github/mikephil/charting/charts/LineChart;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-eqz p2, :cond_1

    .line 53
    invoke-virtual {p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;->init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;Landroid/view/View;)V

    :cond_1
    return-object p1
.end method

.method public setConfig(Ljava/lang/Object;)V
    .locals 3

    .line 179
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;

    if-eqz v0, :cond_2

    .line 180
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 181
    :cond_0
    move-object v1, p1

    check-cast v1, Landroid/os/Parcelable;

    const-string v2, "filledLineChartConfig"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 184
    :goto_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 185
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;->currentConfig:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 186
    move-object v1, p1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;

    invoke-virtual {p0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;->init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;Landroid/view/View;)V

    .line 188
    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;->currentConfig:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;

    return-void

    .line 179
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong config type for filled line chart provided!!!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
