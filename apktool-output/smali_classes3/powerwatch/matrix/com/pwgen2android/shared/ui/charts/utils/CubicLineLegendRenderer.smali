.class public Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CubicLineLegendRenderer;
.super Lcom/github/mikephil/charting/renderer/LineChartRenderer;
.source "CubicLineLegendRenderer.java"


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

    .line 17
    invoke-direct {p0, p1, p2, p3}, Lcom/github/mikephil/charting/renderer/LineChartRenderer;-><init>(Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V

    return-void
.end method

.method private generateAboveFilledPath(Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;IILandroid/graphics/Path;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/MinMaxFillFormatter;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x10,
            0x10,
            0x10,
            0x10
        }
        names = {
            "dataSet",
            "startIndex",
            "endIndex",
            "outputPath",
            "fillFormatter"
        }
    .end annotation

    .line 75
    iget p5, p5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/MinMaxFillFormatter;->max:F

    const/high16 v0, 0x41f00000    # 30.0f

    add-float/2addr p5, v0

    .line 77
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CubicLineLegendRenderer;->mAnimator:Lcom/github/mikephil/charting/animation/ChartAnimator;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/animation/ChartAnimator;->getPhaseY()F

    move-result v0

    .line 78
    invoke-virtual {p4}, Landroid/graphics/Path;->reset()V

    .line 80
    invoke-interface {p1, p2}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v1

    .line 82
    invoke-virtual {v1}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    invoke-virtual {v1}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v3

    invoke-virtual {p4, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 83
    invoke-virtual {v1}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    mul-float p5, p5, v0

    invoke-virtual {p4, v1, p5}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 v1, p2, 0x1

    :goto_0
    if-gt v1, p3, :cond_0

    .line 89
    invoke-interface {p1, v1}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v2

    .line 93
    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    invoke-virtual {p4, v2, p5}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-le p3, p2, :cond_1

    .line 99
    invoke-interface {p1, p3}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object p5

    .line 100
    invoke-virtual {p5}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual {p5}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result p5

    mul-float p5, p5, v0

    invoke-virtual {p4, v1, p5}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 p3, p3, -0x1

    goto :goto_1

    .line 103
    :cond_1
    invoke-virtual {p4}, Landroid/graphics/Path;->close()V

    return-void
.end method

.method private generateAreaFilledPath(Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;IILandroid/graphics/Path;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/MinMaxFillFormatter;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x10,
            0x10,
            0x10,
            0x10
        }
        names = {
            "dataSet",
            "startIndex",
            "endIndex",
            "outputPath",
            "fillFormatter"
        }
    .end annotation

    .line 112
    iget p5, p5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/MinMaxFillFormatter;->min:F

    .line 114
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CubicLineLegendRenderer;->mAnimator:Lcom/github/mikephil/charting/animation/ChartAnimator;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/animation/ChartAnimator;->getPhaseY()F

    move-result v0

    .line 115
    invoke-virtual {p4}, Landroid/graphics/Path;->reset()V

    .line 117
    invoke-interface {p1, p2}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v1

    .line 119
    invoke-virtual {v1}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    invoke-virtual {p4, v2, p5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 120
    invoke-virtual {v1}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    invoke-virtual {v1}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    mul-float v1, v1, v0

    invoke-virtual {p4, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 v1, p2, 0x1

    :goto_0
    if-gt v1, p3, :cond_0

    .line 126
    invoke-interface {p1, v1}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v2

    .line 127
    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v3

    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float v2, v2, v0

    invoke-virtual {p4, v3, v2}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-le p3, p2, :cond_1

    .line 133
    invoke-interface {p1, p3}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v1

    .line 134
    invoke-virtual {v1}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    mul-float v2, p5, v0

    invoke-virtual {p4, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 p3, p3, -0x1

    goto :goto_1

    .line 137
    :cond_1
    invoke-virtual {p4}, Landroid/graphics/Path;->close()V

    return-void
.end method


# virtual methods
.method protected drawCubicFill(Landroid/graphics/Canvas;Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;Landroid/graphics/Path;Lcom/github/mikephil/charting/utils/Transformer;Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;)V
    .locals 16
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

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p4

    move-object/from16 v0, p5

    .line 28
    new-instance v9, Landroid/graphics/Path;

    invoke-direct {v9}, Landroid/graphics/Path;-><init>()V

    .line 29
    new-instance v10, Landroid/graphics/Path;

    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    .line 30
    iget v11, v0, Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;->min:I

    .line 31
    iget v1, v0, Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;->range:I

    iget v0, v0, Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;->min:I

    add-int v12, v1, v0

    const/4 v0, 0x0

    move-object/from16 v13, p2

    .line 38
    invoke-interface {v13, v0}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    .line 40
    invoke-interface/range {p2 .. p2}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getFillFormatter()Lcom/github/mikephil/charting/formatter/IFillFormatter;

    move-result-object v1

    instance-of v1, v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/MinMaxFillFormatter;

    if-eqz v1, :cond_4

    .line 41
    invoke-interface/range {p2 .. p2}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getFillFormatter()Lcom/github/mikephil/charting/formatter/IFillFormatter;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/MinMaxFillFormatter;

    const/4 v15, 0x0

    :cond_0
    mul-int/lit16 v0, v15, 0x80

    add-int v5, v11, v0

    add-int/lit16 v0, v5, 0x80

    if-le v0, v12, :cond_1

    move v4, v12

    goto :goto_0

    :cond_1
    move v4, v0

    :goto_0
    if-gt v5, v4, :cond_3

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move v2, v5

    move v3, v4

    move/from16 p3, v4

    move-object v4, v9

    move/from16 p5, v5

    move-object v5, v14

    .line 49
    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CubicLineLegendRenderer;->generateAboveFilledPath(Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;IILandroid/graphics/Path;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/MinMaxFillFormatter;)V

    move/from16 v2, p5

    move/from16 v3, p3

    move-object v4, v10

    .line 50
    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CubicLineLegendRenderer;->generateAreaFilledPath(Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;IILandroid/graphics/Path;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/MinMaxFillFormatter;)V

    .line 52
    invoke-virtual {v8, v9}, Lcom/github/mikephil/charting/utils/Transformer;->pathValueToPixel(Landroid/graphics/Path;)V

    .line 53
    invoke-virtual {v8, v10}, Lcom/github/mikephil/charting/utils/Transformer;->pathValueToPixel(Landroid/graphics/Path;)V

    .line 55
    invoke-interface/range {p2 .. p2}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getFillDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 57
    invoke-virtual {v6, v7, v9, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CubicLineLegendRenderer;->drawFilledPath(Landroid/graphics/Canvas;Landroid/graphics/Path;Landroid/graphics/drawable/Drawable;)V

    .line 58
    invoke-virtual {v6, v7, v10, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CubicLineLegendRenderer;->drawFilledPath(Landroid/graphics/Canvas;Landroid/graphics/Path;Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 60
    :cond_2
    iget v0, v14, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/MinMaxFillFormatter;->aboveLineChartColor:I

    invoke-interface/range {p2 .. p2}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getFillAlpha()I

    move-result v1

    invoke-virtual {v6, v7, v9, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CubicLineLegendRenderer;->drawFilledPath(Landroid/graphics/Canvas;Landroid/graphics/Path;II)V

    .line 61
    invoke-interface/range {p2 .. p2}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getFillColor()I

    move-result v0

    invoke-interface/range {p2 .. p2}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getFillAlpha()I

    move-result v1

    invoke-virtual {v6, v7, v10, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CubicLineLegendRenderer;->drawFilledPath(Landroid/graphics/Canvas;Landroid/graphics/Path;II)V

    goto :goto_1

    :cond_3
    move/from16 p3, v4

    move/from16 p5, v5

    :goto_1
    add-int/lit8 v15, v15, 0x1

    move/from16 v1, p3

    move/from16 v0, p5

    if-le v0, v1, :cond_0

    :cond_4
    return-void
.end method

.method protected drawDataSet(Landroid/graphics/Canvas;Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "c",
            "dataSet"
        }
    .end annotation

    .line 22
    invoke-super {p0, p1, p2}, Lcom/github/mikephil/charting/renderer/LineChartRenderer;->drawDataSet(Landroid/graphics/Canvas;Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;)V

    return-void
.end method
