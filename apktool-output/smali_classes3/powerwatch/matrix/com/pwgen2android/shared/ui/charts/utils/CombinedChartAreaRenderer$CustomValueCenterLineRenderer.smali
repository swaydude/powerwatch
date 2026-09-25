.class Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer$CustomValueCenterLineRenderer;
.super Lcom/github/mikephil/charting/renderer/LineChartRenderer;
.source "CombinedChartAreaRenderer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "CustomValueCenterLineRenderer"
.end annotation


# instance fields
.field private radius:F


# direct methods
.method public constructor <init>(Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;F)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "chart",
            "animator",
            "viewPortHandler",
            "radius"
        }
    .end annotation

    .line 78
    invoke-direct {p0, p1, p2, p3}, Lcom/github/mikephil/charting/renderer/LineChartRenderer;-><init>(Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V

    .line 79
    iput p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer$CustomValueCenterLineRenderer;->radius:F

    return-void
.end method


# virtual methods
.method public drawValue(Landroid/graphics/Canvas;Lcom/github/mikephil/charting/formatter/IValueFormatter;FLcom/github/mikephil/charting/data/Entry;IFFI)V
    .locals 10
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "c",
            "formatter",
            "value",
            "entry",
            "dataSetIndex",
            "x",
            "y",
            "color"
        }
    .end annotation

    move-object v9, p0

    .line 84
    iget v0, v9, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CombinedChartAreaRenderer$CustomValueCenterLineRenderer;->radius:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float v0, v0, v1

    add-float v7, p7, v0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    move/from16 v6, p6

    move/from16 v8, p8

    invoke-super/range {v0 .. v8}, Lcom/github/mikephil/charting/renderer/LineChartRenderer;->drawValue(Landroid/graphics/Canvas;Lcom/github/mikephil/charting/formatter/IValueFormatter;FLcom/github/mikephil/charting/data/Entry;IFFI)V

    return-void
.end method
