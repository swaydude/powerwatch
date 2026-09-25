.class public Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;
.super Lcom/github/mikephil/charting/renderer/CombinedChartRenderer;
.source "CombinedChartAreaRenderer.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer$CustomValueCenterLineRenderer;
    }
.end annotation


# instance fields
.field private radius:F

.field private useCenteredValues:Z


# direct methods
.method public constructor <init>(Lcom/github/mikephil/charting/charts/CombinedChart;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "chart",
            "animator",
            "viewPortHandler"
        }
    .end annotation

    .line 23
    invoke-direct {p0, p1, p2, p3}, Lcom/github/mikephil/charting/renderer/CombinedChartRenderer;-><init>(Lcom/github/mikephil/charting/charts/CombinedChart;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V

    const/4 p1, 0x0

    .line 19
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->useCenteredValues:Z

    return-void
.end method

.method public constructor <init>(Lcom/github/mikephil/charting/charts/CombinedChart;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;ZF)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "chart",
            "animator",
            "viewPortHandler",
            "useCenteredValues",
            "radius"
        }
    .end annotation

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lcom/github/mikephil/charting/renderer/CombinedChartRenderer;-><init>(Lcom/github/mikephil/charting/charts/CombinedChart;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V

    const/4 p1, 0x0

    .line 19
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->useCenteredValues:Z

    .line 29
    iput-boolean p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->useCenteredValues:Z

    .line 30
    iput p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->radius:F

    .line 31
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->createRenderers()V

    return-void
.end method


# virtual methods
.method public createRenderers()V
    .locals 9

    .line 36
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->mRenderers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 38
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->mChart:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/charts/CombinedChart;

    if-nez v0, :cond_0

    return-void

    .line 42
    :cond_0
    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/CombinedChart;->getDrawOrder()[Lcom/github/mikephil/charting/charts/CombinedChart$DrawOrder;

    move-result-object v1

    .line 44
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_8

    aget-object v4, v1, v3

    .line 46
    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer$1;->$SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder:[I

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/CombinedChart$DrawOrder;->ordinal()I

    move-result v4

    aget v4, v5, v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_6

    const/4 v5, 0x2

    if-eq v4, v5, :cond_5

    const/4 v5, 0x3

    if-eq v4, v5, :cond_3

    const/4 v5, 0x4

    if-eq v4, v5, :cond_2

    const/4 v5, 0x5

    if-eq v4, v5, :cond_1

    goto/16 :goto_2

    .line 67
    :cond_1
    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/CombinedChart;->getScatterData()Lcom/github/mikephil/charting/data/ScatterData;

    move-result-object v4

    if-eqz v4, :cond_7

    .line 68
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->mRenderers:Ljava/util/List;

    new-instance v5, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;

    iget-object v6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->mAnimator:Lcom/github/mikephil/charting/animation/ChartAnimator;

    iget-object v7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->mViewPortHandler:Lcom/github/mikephil/charting/utils/ViewPortHandler;

    invoke-direct {v5, v0, v6, v7}, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;-><init>(Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 63
    :cond_2
    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/CombinedChart;->getCandleData()Lcom/github/mikephil/charting/data/CandleData;

    move-result-object v4

    if-eqz v4, :cond_7

    .line 64
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->mRenderers:Ljava/util/List;

    new-instance v5, Lcom/github/mikephil/charting/renderer/CandleStickChartRenderer;

    iget-object v6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->mAnimator:Lcom/github/mikephil/charting/animation/ChartAnimator;

    iget-object v7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->mViewPortHandler:Lcom/github/mikephil/charting/utils/ViewPortHandler;

    invoke-direct {v5, v0, v6, v7}, Lcom/github/mikephil/charting/renderer/CandleStickChartRenderer;-><init>(Lcom/github/mikephil/charting/interfaces/dataprovider/CandleDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 56
    :cond_3
    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/CombinedChart;->getLineData()Lcom/github/mikephil/charting/data/LineData;

    move-result-object v4

    if-eqz v4, :cond_7

    .line 57
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->mRenderers:Ljava/util/List;

    iget-boolean v5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->useCenteredValues:Z

    if-eqz v5, :cond_4

    .line 58
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer$CustomValueCenterLineRenderer;

    iget-object v6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->mAnimator:Lcom/github/mikephil/charting/animation/ChartAnimator;

    iget-object v7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->mViewPortHandler:Lcom/github/mikephil/charting/utils/ViewPortHandler;

    iget v8, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->radius:F

    invoke-direct {v5, v0, v6, v7, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer$CustomValueCenterLineRenderer;-><init>(Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;F)V

    goto :goto_1

    .line 59
    :cond_4
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryAreaChartRenderer;

    iget-object v6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->mAnimator:Lcom/github/mikephil/charting/animation/ChartAnimator;

    iget-object v7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->mViewPortHandler:Lcom/github/mikephil/charting/utils/ViewPortHandler;

    invoke-direct {v5, v0, v6, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryAreaChartRenderer;-><init>(Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V

    .line 57
    :goto_1
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 52
    :cond_5
    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/CombinedChart;->getBubbleData()Lcom/github/mikephil/charting/data/BubbleData;

    move-result-object v4

    if-eqz v4, :cond_7

    .line 53
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->mRenderers:Ljava/util/List;

    new-instance v5, Lcom/github/mikephil/charting/renderer/BubbleChartRenderer;

    iget-object v6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->mAnimator:Lcom/github/mikephil/charting/animation/ChartAnimator;

    iget-object v7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->mViewPortHandler:Lcom/github/mikephil/charting/utils/ViewPortHandler;

    invoke-direct {v5, v0, v6, v7}, Lcom/github/mikephil/charting/renderer/BubbleChartRenderer;-><init>(Lcom/github/mikephil/charting/interfaces/dataprovider/BubbleDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 48
    :cond_6
    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/CombinedChart;->getBarData()Lcom/github/mikephil/charting/data/BarData;

    move-result-object v4

    if-eqz v4, :cond_7

    .line 49
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->mRenderers:Ljava/util/List;

    new-instance v5, Lcom/github/mikephil/charting/renderer/BarChartRenderer;

    iget-object v6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->mAnimator:Lcom/github/mikephil/charting/animation/ChartAnimator;

    iget-object v7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;->mViewPortHandler:Lcom/github/mikephil/charting/utils/ViewPortHandler;

    invoke-direct {v5, v0, v6, v7}, Lcom/github/mikephil/charting/renderer/BarChartRenderer;-><init>(Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_8
    return-void
.end method
