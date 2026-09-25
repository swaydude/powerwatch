.class public Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryAreaChartRenderer;
.super Lcom/github/mikephil/charting/renderer/LineChartRenderer;
.source "BoundaryAreaChartRenderer.java"


# direct methods
.method public constructor <init>(Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V
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

    .line 22
    invoke-direct {p0, p1, p2, p3}, Lcom/github/mikephil/charting/renderer/LineChartRenderer;-><init>(Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V

    return-void
.end method


# virtual methods
.method protected drawCubicFill(Landroid/graphics/Canvas;Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;Landroid/graphics/Path;Lcom/github/mikephil/charting/utils/Transformer;Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;)V
    .locals 19
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "c",
            "dataSet",
            "spline",
            "trans",
            "bounds"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    .line 27
    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryAreaChartRenderer;->mXBounds:Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;

    iget v3, v3, Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;->range:I

    const/4 v4, 0x1

    if-ge v3, v4, :cond_0

    .line 28
    invoke-super/range {p0 .. p5}, Lcom/github/mikephil/charting/renderer/LineChartRenderer;->drawCubicFill(Landroid/graphics/Canvas;Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;Landroid/graphics/Path;Lcom/github/mikephil/charting/utils/Transformer;Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;)V

    return-void

    .line 32
    :cond_0
    invoke-interface/range {p2 .. p2}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getFillFormatter()Lcom/github/mikephil/charting/formatter/IFillFormatter;

    move-result-object v3

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryFillFormatter;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryFillFormatter;->getBoundaryDataSet()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v3

    .line 33
    iget-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryAreaChartRenderer;->mAnimator:Lcom/github/mikephil/charting/animation/ChartAnimator;

    invoke-virtual {v5}, Lcom/github/mikephil/charting/animation/ChartAnimator;->getPhaseY()F

    move-result v5

    .line 34
    iget-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryAreaChartRenderer;->mXBounds:Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;

    iget-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryAreaChartRenderer;->mChart:Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;

    invoke-virtual {v6, v7, v3}, Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;->set(Lcom/github/mikephil/charting/interfaces/dataprovider/BarLineScatterCandleBubbleDataProvider;Lcom/github/mikephil/charting/interfaces/datasets/IBarLineScatterCandleBubbleDataSet;)V

    .line 35
    invoke-virtual {v3}, Lcom/github/mikephil/charting/data/LineDataSet;->getCubicIntensity()F

    .line 37
    iget-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryAreaChartRenderer;->mXBounds:Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;

    iget v6, v6, Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;->min:I

    .line 38
    iget-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryAreaChartRenderer;->mXBounds:Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;

    iget v7, v7, Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;->min:I

    iget-object v8, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryAreaChartRenderer;->mXBounds:Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;

    iget v8, v8, Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;->range:I

    add-int/2addr v7, v8

    .line 39
    invoke-virtual {v3}, Lcom/github/mikephil/charting/data/LineDataSet;->getEntryCount()I

    move-result v8

    sub-int/2addr v8, v4

    .line 41
    invoke-virtual {v3, v6}, Lcom/github/mikephil/charting/data/LineDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v9

    .line 42
    invoke-virtual {v3, v7}, Lcom/github/mikephil/charting/data/LineDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v10

    .line 44
    iget-object v11, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryAreaChartRenderer;->cubicFillPath:Landroid/graphics/Path;

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v12

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v10

    invoke-virtual {v11, v12, v10}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 v10, v7, 0x1

    .line 47
    invoke-static {v10, v8}, Ljava/lang/Math;->min(II)I

    move-result v10

    invoke-virtual {v3, v10}, Lcom/github/mikephil/charting/data/LineDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v10

    .line 48
    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    invoke-virtual {v3, v8}, Lcom/github/mikephil/charting/data/LineDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v8

    if-nez v8, :cond_1

    return-void

    :cond_1
    sub-int/2addr v7, v4

    :goto_0
    if-lt v7, v6, :cond_2

    .line 62
    invoke-virtual {v3, v7}, Lcom/github/mikephil/charting/data/LineDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v4

    add-int/lit8 v11, v7, -0x1

    const/4 v12, 0x0

    .line 64
    invoke-static {v11, v12}, Ljava/lang/Math;->max(II)I

    move-result v11

    .line 65
    invoke-virtual {v3, v11}, Lcom/github/mikephil/charting/data/LineDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v11

    .line 67
    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    .line 68
    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    .line 69
    invoke-virtual {v11}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    invoke-virtual {v8}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    .line 70
    invoke-virtual {v11}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    invoke-virtual {v8}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    .line 78
    invoke-virtual {v8}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v10

    .line 79
    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v11

    invoke-virtual {v8}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v12

    sub-float/2addr v11, v12

    const/high16 v12, 0x40000000    # 2.0f

    div-float/2addr v11, v12

    add-float v15, v10, v11

    .line 81
    iget-object v12, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryAreaChartRenderer;->cubicFillPath:Landroid/graphics/Path;

    .line 82
    invoke-virtual {v8}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v10

    mul-float v14, v10, v5

    .line 83
    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v10

    mul-float v16, v10, v5

    .line 84
    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v17

    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v10

    mul-float v18, v10, v5

    move v13, v15

    .line 81
    invoke-virtual/range {v12 .. v18}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    add-int/lit8 v7, v7, -0x1

    move-object v10, v8

    move-object v8, v4

    goto :goto_0

    .line 93
    :cond_2
    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryAreaChartRenderer;->cubicFillPath:Landroid/graphics/Path;

    invoke-virtual {v9}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v4

    invoke-virtual {v9}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v5

    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 94
    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryAreaChartRenderer;->cubicFillPath:Landroid/graphics/Path;

    invoke-virtual {v3}, Landroid/graphics/Path;->close()V

    move-object/from16 v3, p4

    .line 96
    invoke-virtual {v3, v2}, Lcom/github/mikephil/charting/utils/Transformer;->pathValueToPixel(Landroid/graphics/Path;)V

    .line 98
    invoke-interface/range {p2 .. p2}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getFillDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 100
    invoke-virtual {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryAreaChartRenderer;->drawFilledPath(Landroid/graphics/Canvas;Landroid/graphics/Path;Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 102
    :cond_3
    invoke-interface/range {p2 .. p2}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getFillColor()I

    move-result v3

    invoke-interface/range {p2 .. p2}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getFillAlpha()I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/BoundaryAreaChartRenderer;->drawFilledPath(Landroid/graphics/Canvas;Landroid/graphics/Path;II)V

    :goto_1
    return-void
.end method
