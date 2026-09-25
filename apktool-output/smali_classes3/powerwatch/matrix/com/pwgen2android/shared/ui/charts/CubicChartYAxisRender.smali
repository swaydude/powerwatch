.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;
.super Lcom/github/mikephil/charting/renderer/YAxisRenderer;
.source "CubicLineChartFragment.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCubicLineChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CubicLineChartFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,546:1\n1358#2:547\n1444#2,5:548\n2190#2,14:553\n1895#2,14:567\n1895#2,14:585\n2190#2,14:599\n1895#2,14:614\n11468#3:581\n11594#3,3:582\n11597#3:613\n*S KotlinDebug\n*F\n+ 1 CubicLineChartFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender\n*L\n352#1:547\n352#1:548,5\n353#1:553,14\n354#1:567,14\n455#1:585,14\n456#1:599,14\n489#1:614,14\n448#1:581\n448#1:582,3\n448#1:613\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0014\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B+\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J,\u0010\u0011\u001a\u00020\r2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0014R\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;",
        "Lcom/github/mikephil/charting/renderer/YAxisRenderer;",
        "lineDatas",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;",
        "viewPortHandler",
        "Lcom/github/mikephil/charting/utils/ViewPortHandler;",
        "yAxis",
        "Lcom/github/mikephil/charting/components/YAxis;",
        "trans",
        "Lcom/github/mikephil/charting/utils/Transformer;",
        "(Ljava/util/List;Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/utils/Transformer;)V",
        "computeAxisValues",
        "",
        "min",
        "",
        "max",
        "drawYLabels",
        "c",
        "Landroid/graphics/Canvas;",
        "fixedPosition",
        "positions",
        "",
        "offset",
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
.field private final lineDatas:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/utils/Transformer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;",
            ">;",
            "Lcom/github/mikephil/charting/utils/ViewPortHandler;",
            "Lcom/github/mikephil/charting/components/YAxis;",
            "Lcom/github/mikephil/charting/utils/Transformer;",
            ")V"
        }
    .end annotation

    const-string v0, "lineDatas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewPortHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "yAxis"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trans"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 347
    invoke-direct {p0, p2, p3, p4}, Lcom/github/mikephil/charting/renderer/YAxisRenderer;-><init>(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/utils/Transformer;)V

    .line 346
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->lineDatas:Ljava/util/List;

    return-void
.end method


# virtual methods
.method protected computeAxisValues(FF)V
    .locals 13

    .line 352
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->lineDatas:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 547
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 548
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 549
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;

    .line 352
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;->getDataSets()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 550
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    .line 552
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 353
    check-cast v1, Ljava/lang/Iterable;

    .line 553
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 554
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    move-object v2, v3

    goto :goto_1

    .line 555
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 556
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    .line 557
    :cond_2
    move-object v4, v2

    check-cast v4, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    .line 353
    invoke-interface {v4}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getYMin()F

    move-result v4

    .line 559
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 560
    move-object v6, v5

    check-cast v6, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    .line 353
    invoke-interface {v6}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getYMin()F

    move-result v6

    .line 561
    invoke-static {v4, v6}, Ljava/lang/Float;->compare(FF)I

    move-result v7

    if-lez v7, :cond_4

    move-object v2, v5

    move v4, v6

    .line 565
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_3

    .line 353
    :goto_1
    check-cast v2, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface {v2}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getYMin()F

    move-result p1

    :goto_2
    move v5, p1

    .line 567
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 568
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_3

    .line 569
    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 570
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_3

    .line 571
    :cond_7
    move-object p1, v3

    check-cast p1, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    .line 354
    invoke-interface {p1}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getYMax()F

    move-result p1

    .line 573
    :cond_8
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 574
    move-object v1, v0

    check-cast v1, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    .line 354
    invoke-interface {v1}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getYMax()F

    move-result v1

    .line 575
    invoke-static {p1, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v2

    if-gez v2, :cond_9

    move-object v3, v0

    move p1, v1

    .line 579
    :cond_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_8

    .line 354
    :goto_3
    check-cast v3, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    if-nez v3, :cond_a

    goto :goto_4

    :cond_a
    invoke-interface {v3}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getYMax()F

    move-result p2

    .line 355
    :goto_4
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->lineDatas:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    sub-float v0, p2, v5

    .line 356
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x0

    if-eqz p1, :cond_21

    const-wide/16 v3, 0x0

    cmpg-double v6, v0, v3

    if-lez v6, :cond_21

    .line 357
    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v6

    if-eqz v6, :cond_b

    goto/16 :goto_12

    :cond_b
    int-to-double v6, p1

    div-double v6, v0, v6

    .line 365
    invoke-static {v6, v7}, Lcom/github/mikephil/charting/utils/Utils;->roundToNextSignificant(D)F

    move-result v6

    float-to-double v6, v6

    .line 368
    iget-object v8, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    invoke-virtual {v8}, Lcom/github/mikephil/charting/components/AxisBase;->isGranularityEnabled()Z

    move-result v8

    if-eqz v8, :cond_c

    .line 369
    iget-object v8, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    invoke-virtual {v8}, Lcom/github/mikephil/charting/components/AxisBase;->getGranularity()F

    move-result v8

    float-to-double v8, v8

    cmpg-double v10, v6, v8

    if-gez v10, :cond_c

    iget-object v6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    invoke-virtual {v6}, Lcom/github/mikephil/charting/components/AxisBase;->getGranularity()F

    move-result v6

    float-to-double v6, v6

    :cond_c
    const-wide/high16 v8, 0x4024000000000000L    # 10.0

    .line 371
    invoke-static {v6, v7}, Ljava/lang/Math;->log10(D)D

    move-result-wide v10

    double-to-int v10, v10

    int-to-double v10, v10

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v8

    invoke-static {v8, v9}, Lcom/github/mikephil/charting/utils/Utils;->roundToNextSignificant(D)F

    move-result v8

    float-to-double v8, v8

    div-double v10, v6, v8

    double-to-int v10, v10

    const/4 v11, 0x5

    if-le v10, v11, :cond_d

    const/16 v6, 0xa

    int-to-double v6, v6

    mul-double v6, v6, v8

    .line 376
    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    move-result-wide v6

    .line 378
    :cond_d
    iget-object v8, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    invoke-virtual {v8}, Lcom/github/mikephil/charting/components/AxisBase;->isCenterAxisLabelsEnabled()Z

    move-result v8

    .line 380
    iget-object v9, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    invoke-virtual {v9}, Lcom/github/mikephil/charting/components/AxisBase;->isForceLabelsEnabled()Z

    move-result v9

    if-eqz v9, :cond_10

    double-to-float p2, v0

    add-int/lit8 v0, p1, -0x1

    int-to-float v0, v0

    div-float/2addr p2, v0

    float-to-double v6, p2

    .line 382
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    iput p1, p2, Lcom/github/mikephil/charting/components/AxisBase;->mEntryCount:I

    .line 383
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    iget-object p2, p2, Lcom/github/mikephil/charting/components/AxisBase;->mEntries:[F

    array-length p2, p2

    if-ge p2, p1, :cond_e

    .line 385
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    new-array v0, p1, [F

    iput-object v0, p2, Lcom/github/mikephil/charting/components/AxisBase;->mEntries:[F

    :cond_e
    if-lez p1, :cond_1c

    const/4 p2, 0x0

    :goto_5
    add-int/lit8 v0, p2, 0x1

    .line 389
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    iget-object v1, v1, Lcom/github/mikephil/charting/components/AxisBase;->mEntries:[F

    aput v5, v1, p2

    double-to-float p2, v6

    add-float/2addr v5, p2

    if-lt v0, p1, :cond_f

    goto/16 :goto_e

    :cond_f
    move p2, v0

    goto :goto_5

    :cond_10
    const/4 p1, 0x1

    cmpg-double v0, v6, v3

    if-nez v0, :cond_11

    const/4 v1, 0x1

    goto :goto_6

    :cond_11
    const/4 v1, 0x0

    :goto_6
    if-eqz v1, :cond_12

    move-wide v9, v3

    goto :goto_7

    :cond_12
    float-to-double v9, v5

    div-double/2addr v9, v6

    .line 395
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v9

    mul-double v9, v9, v6

    .line 396
    :goto_7
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/components/AxisBase;->isCenterAxisLabelsEnabled()Z

    move-result v1

    if-eqz v1, :cond_13

    sub-double/2addr v9, v6

    :cond_13
    if-nez v0, :cond_14

    const/4 v1, 0x1

    goto :goto_8

    :cond_14
    const/4 v1, 0x0

    :goto_8
    if-eqz v1, :cond_15

    move-wide v11, v3

    goto :goto_9

    :cond_15
    float-to-double v11, p2

    div-double/2addr v11, v6

    .line 399
    invoke-static {v11, v12}, Ljava/lang/Math;->floor(D)D

    move-result-wide v11

    mul-double v11, v11, v6

    invoke-static {v11, v12}, Lcom/github/mikephil/charting/utils/Utils;->nextUp(D)D

    move-result-wide v11

    :goto_9
    if-nez v0, :cond_16

    const/4 p2, 0x1

    goto :goto_a

    :cond_16
    const/4 p2, 0x0

    :goto_a
    if-nez p2, :cond_17

    move-wide v0, v9

    :goto_b
    cmpg-double p2, v0, v11

    if-gtz p2, :cond_17

    add-int/lit8 v8, v8, 0x1

    add-double/2addr v0, v6

    goto :goto_b

    .line 409
    :cond_17
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    iput v8, p2, Lcom/github/mikephil/charting/components/AxisBase;->mEntryCount:I

    .line 410
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    iget-object p2, p2, Lcom/github/mikephil/charting/components/AxisBase;->mEntries:[F

    array-length p2, p2

    if-ge p2, v8, :cond_18

    .line 412
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    new-array v0, v8, [F

    iput-object v0, p2, Lcom/github/mikephil/charting/components/AxisBase;->mEntries:[F

    :cond_18
    const/4 p2, 0x0

    :goto_c
    if-ge p2, v8, :cond_1b

    cmpg-double v0, v9, v3

    if-nez v0, :cond_19

    const/4 v0, 0x1

    goto :goto_d

    :cond_19
    const/4 v0, 0x0

    :goto_d
    if-eqz v0, :cond_1a

    move-wide v9, v3

    .line 419
    :cond_1a
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    iget-object v0, v0, Lcom/github/mikephil/charting/components/AxisBase;->mEntries:[F

    double-to-float v1, v9

    aput v1, v0, p2

    add-double/2addr v9, v6

    add-int/lit8 p2, p2, 0x1

    goto :goto_c

    :cond_1b
    move p1, v8

    :cond_1c
    :goto_e
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double p2, v6, v0

    if-gez p2, :cond_1d

    .line 426
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    invoke-static {v6, v7}, Ljava/lang/Math;->log10(D)D

    move-result-wide v0

    neg-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    iput v0, p2, Lcom/github/mikephil/charting/components/AxisBase;->mDecimals:I

    goto :goto_f

    .line 428
    :cond_1d
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    iput v2, p2, Lcom/github/mikephil/charting/components/AxisBase;->mDecimals:I

    .line 430
    :goto_f
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    invoke-virtual {p2}, Lcom/github/mikephil/charting/components/AxisBase;->isCenterAxisLabelsEnabled()Z

    move-result p2

    if-eqz p2, :cond_20

    .line 431
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    iget-object p2, p2, Lcom/github/mikephil/charting/components/AxisBase;->mCenteredEntries:[F

    array-length p2, p2

    if-ge p2, p1, :cond_1e

    .line 432
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    new-array v0, p1, [F

    iput-object v0, p2, Lcom/github/mikephil/charting/components/AxisBase;->mCenteredEntries:[F

    :cond_1e
    double-to-float p2, v6

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p2, v0

    if-lez p1, :cond_20

    :goto_10
    add-int/lit8 v0, v2, 0x1

    .line 436
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    iget-object v1, v1, Lcom/github/mikephil/charting/components/AxisBase;->mCenteredEntries:[F

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    iget-object v3, v3, Lcom/github/mikephil/charting/components/AxisBase;->mEntries:[F

    aget v3, v3, v2

    add-float/2addr v3, p2

    aput v3, v1, v2

    if-lt v0, p1, :cond_1f

    goto :goto_11

    :cond_1f
    move v2, v0

    goto :goto_10

    :cond_20
    :goto_11
    return-void

    .line 358
    :cond_21
    :goto_12
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    new-array p2, v2, [F

    iput-object p2, p1, Lcom/github/mikephil/charting/components/AxisBase;->mEntries:[F

    .line 359
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    new-array p2, v2, [F

    iput-object p2, p1, Lcom/github/mikephil/charting/components/AxisBase;->mCenteredEntries:[F

    .line 360
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxis:Lcom/github/mikephil/charting/components/AxisBase;

    iput v2, p1, Lcom/github/mikephil/charting/components/AxisBase;->mEntryCount:I

    return-void
.end method

.method protected drawYLabels(Landroid/graphics/Canvas;F[FF)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    if-eqz v3, :cond_1d

    .line 443
    array-length v4, v3

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    goto/16 :goto_12

    .line 445
    :cond_1
    aget v4, v3, v5

    .line 581
    new-instance v7, Ljava/util/ArrayList;

    array-length v8, v3

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v7, Ljava/util/Collection;

    .line 583
    array-length v8, v3

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_1
    if-ge v9, v8, :cond_10

    aget v13, v3, v9

    add-int/lit8 v14, v10, 0x1

    .line 450
    rem-int/lit8 v15, v14, 0x2

    if-nez v15, :cond_f

    .line 451
    div-int/lit8 v10, v10, 0x2

    .line 452
    iget-object v15, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->lineDatas:Ljava/util/List;

    invoke-static {v15, v10}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;

    if-eqz v10, :cond_f

    .line 455
    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;->getDataSets()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    .line 585
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    .line 586
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-nez v13, :cond_2

    const/4 v13, 0x0

    goto :goto_2

    .line 587
    :cond_2
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 588
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-nez v16, :cond_3

    goto :goto_2

    .line 589
    :cond_3
    move-object/from16 v16, v13

    check-cast v16, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    .line 455
    invoke-interface/range {v16 .. v16}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getYMax()F

    move-result v16

    move/from16 v11, v16

    .line 591
    :cond_4
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    .line 592
    move-object/from16 v18, v17

    check-cast v18, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    .line 455
    invoke-interface/range {v18 .. v18}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getYMax()F

    move-result v12

    .line 593
    invoke-static {v11, v12}, Ljava/lang/Float;->compare(FF)I

    move-result v18

    if-gez v18, :cond_5

    move v11, v12

    move-object/from16 v13, v17

    .line 597
    :cond_5
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-nez v12, :cond_4

    .line 455
    :goto_2
    check-cast v13, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    if-nez v13, :cond_6

    const/4 v12, 0x0

    goto :goto_3

    :cond_6
    invoke-interface {v13}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getYMax()F

    move-result v11

    move v12, v11

    .line 456
    :goto_3
    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;->getDataSets()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    .line 599
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    .line 600
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-nez v11, :cond_7

    const/4 v11, 0x0

    goto :goto_5

    .line 601
    :cond_7
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 602
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-nez v13, :cond_8

    goto :goto_5

    .line 603
    :cond_8
    move-object v13, v11

    check-cast v13, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    .line 456
    invoke-interface {v13}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getYMin()F

    move-result v13

    .line 605
    :goto_4
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .line 606
    move-object/from16 v18, v15

    check-cast v18, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    .line 456
    invoke-interface/range {v18 .. v18}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getYMin()F

    move-result v5

    .line 607
    invoke-static {v13, v5}, Ljava/lang/Float;->compare(FF)I

    move-result v18

    if-lez v18, :cond_9

    move v13, v5

    move-object v11, v15

    .line 611
    :cond_9
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_e

    .line 456
    :goto_5
    check-cast v11, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    if-nez v11, :cond_a

    const/4 v11, 0x0

    goto :goto_6

    :cond_a
    invoke-interface {v11}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getYMin()F

    move-result v11

    .line 457
    :goto_6
    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;->getDataSets()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    if-nez v5, :cond_b

    const/4 v5, 0x0

    goto :goto_7

    :cond_b
    invoke-interface {v5}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getFillFormatter()Lcom/github/mikephil/charting/formatter/IFillFormatter;

    move-result-object v5

    :goto_7
    instance-of v10, v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/MinMaxFillFormatter;

    if-eqz v10, :cond_c

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/MinMaxFillFormatter;

    goto :goto_8

    :cond_c
    const/4 v5, 0x0

    :goto_8
    const/high16 v10, 0x40000000    # 2.0f

    if-eqz v5, :cond_d

    .line 459
    iget v11, v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/MinMaxFillFormatter;->max:F

    iget v5, v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/MinMaxFillFormatter;->min:F

    add-float/2addr v11, v5

    div-float v13, v11, v10

    goto :goto_9

    :cond_d
    add-float/2addr v12, v11

    div-float v13, v12, v10

    goto :goto_9

    :cond_e
    const/4 v5, 0x0

    goto :goto_4

    .line 450
    :cond_f
    :goto_9
    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-interface {v7, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    move v10, v14

    const/4 v5, 0x0

    goto/16 :goto_1

    .line 613
    :cond_10
    check-cast v7, Ljava/util/List;

    .line 581
    check-cast v7, Ljava/util/Collection;

    .line 468
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->toFloatArray(Ljava/util/Collection;)[F

    move-result-object v3

    .line 471
    iget-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mYAxis:Lcom/github/mikephil/charting/components/YAxis;

    invoke-virtual {v5}, Lcom/github/mikephil/charting/components/YAxis;->isDrawBottomYLabelEntryEnabled()Z

    move-result v5

    xor-int/2addr v5, v6

    .line 472
    iget-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mYAxis:Lcom/github/mikephil/charting/components/YAxis;

    invoke-virtual {v7}, Lcom/github/mikephil/charting/components/YAxis;->isDrawTopYLabelEntryEnabled()Z

    move-result v7

    if-eqz v7, :cond_11

    iget-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mYAxis:Lcom/github/mikephil/charting/components/YAxis;

    iget v7, v7, Lcom/github/mikephil/charting/components/YAxis;->mEntryCount:I

    goto :goto_a

    :cond_11
    iget-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mYAxis:Lcom/github/mikephil/charting/components/YAxis;

    iget v7, v7, Lcom/github/mikephil/charting/components/YAxis;->mEntryCount:I

    sub-int/2addr v7, v6

    .line 473
    :goto_a
    iget-object v8, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mTrans:Lcom/github/mikephil/charting/utils/Transformer;

    invoke-virtual {v8, v3}, Lcom/github/mikephil/charting/utils/Transformer;->pointValuesToPixel([F)V

    .line 475
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    const/high16 v9, 0x41800000    # 16.0f

    .line 476
    invoke-static {v9}, Lcom/github/mikephil/charting/utils/Utils;->convertDpToPixel(F)F

    move-result v10

    invoke-virtual {v8, v10}, Landroid/graphics/Paint;->setTextSize(F)V

    const/4 v10, -0x1

    .line 477
    invoke-virtual {v8, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 478
    sget-object v10, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {v10, v6}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 481
    new-instance v10, Landroid/graphics/Paint;

    invoke-direct {v10}, Landroid/graphics/Paint;-><init>()V

    .line 482
    invoke-static {v9}, Lcom/github/mikephil/charting/utils/Utils;->convertDpToPixel(F)F

    move-result v9

    invoke-virtual {v10, v9}, Landroid/graphics/Paint;->setTextSize(F)V

    const/high16 v9, -0x10000

    .line 483
    invoke-virtual {v10, v9}, Landroid/graphics/Paint;->setColor(I)V

    if-ge v5, v7, :cond_1d

    :goto_b
    add-int/lit8 v9, v5, 0x1

    .line 488
    iget-object v11, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->lineDatas:Ljava/util/List;

    invoke-interface {v11, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;

    const/4 v12, 0x2

    new-array v13, v12, [F

    .line 489
    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;->getDataSets()Ljava/util/List;

    move-result-object v14

    check-cast v14, Ljava/lang/Iterable;

    .line 614
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    .line 615
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-nez v15, :cond_12

    const/4 v15, 0x0

    goto :goto_d

    .line 616
    :cond_12
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .line 617
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-nez v17, :cond_13

    goto :goto_d

    .line 618
    :cond_13
    move-object/from16 v17, v15

    check-cast v17, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    .line 489
    invoke-interface/range {v17 .. v17}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getXMax()F

    move-result v17

    move/from16 v12, v17

    .line 620
    :goto_c
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    .line 621
    move-object/from16 v18, v17

    check-cast v18, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    .line 489
    invoke-interface/range {v18 .. v18}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getXMax()F

    move-result v6

    .line 622
    invoke-static {v12, v6}, Ljava/lang/Float;->compare(FF)I

    move-result v18

    if-gez v18, :cond_14

    move v12, v6

    move-object/from16 v15, v17

    .line 626
    :cond_14
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_1c

    .line 489
    :goto_d
    check-cast v15, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    if-nez v15, :cond_15

    const/4 v6, 0x0

    goto :goto_e

    :cond_15
    invoke-interface {v15}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getXMax()F

    move-result v6

    :goto_e
    const/4 v12, 0x0

    aput v6, v13, v12

    const/4 v6, 0x1

    aput v4, v13, v6

    .line 491
    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;->getLabel()Ljava/lang/String;

    move-result-object v12

    invoke-static {v8, v12}, Lcom/github/mikephil/charting/utils/Utils;->calcTextWidth(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v12

    .line 492
    iget-object v14, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mTrans:Lcom/github/mikephil/charting/utils/Transformer;

    invoke-virtual {v14, v13}, Lcom/github/mikephil/charting/utils/Transformer;->pointValuesToPixel([F)V

    .line 493
    iget-object v14, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mYAxis:Lcom/github/mikephil/charting/components/YAxis;

    invoke-virtual {v14, v5}, Lcom/github/mikephil/charting/components/YAxis;->getFormattedLabel(I)Ljava/lang/String;

    move-result-object v14

    const-string v15, "mYAxis.getFormattedLabel(i)"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v19, v14

    check-cast v19, Ljava/lang/CharSequence;

    new-array v14, v6, [C

    const/16 v6, 0xa

    const/4 v15, 0x0

    aput-char v6, v14, v15

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x6

    const/16 v24, 0x0

    move-object/from16 v20, v14

    invoke-static/range {v19 .. v24}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v6

    .line 495
    iget-object v14, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxisLabelPaint:Landroid/graphics/Paint;

    invoke-virtual {v14}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v14

    .line 496
    iget v15, v14, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v14, v14, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v15, v14

    .line 497
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v14

    move/from16 v17, v4

    const/4 v4, 0x1

    if-le v14, v4, :cond_18

    if-nez v1, :cond_16

    move/from16 v19, v7

    goto :goto_f

    :cond_16
    const/4 v14, 0x0

    .line 498
    invoke-interface {v6, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v14, v18

    check-cast v14, Ljava/lang/String;

    mul-int/lit8 v18, v5, 0x2

    add-int/lit8 v18, v18, 0x1

    aget v18, v3, v18

    add-float v18, v18, p4

    move/from16 v19, v7

    const/4 v4, 0x2

    int-to-float v7, v4

    div-float v4, v15, v7

    add-float v4, v18, v4

    iget-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxisLabelPaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v14, v2, v4, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :goto_f
    if-nez v1, :cond_17

    goto :goto_10

    :cond_17
    const/4 v4, 0x1

    .line 499
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    mul-int/lit8 v7, v5, 0x2

    add-int/2addr v7, v4

    aget v4, v3, v7

    add-float v4, v4, p4

    const/4 v7, 0x2

    int-to-float v7, v7

    div-float/2addr v15, v7

    sub-float/2addr v4, v15

    invoke-virtual {v1, v6, v2, v4, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_10

    :cond_18
    move/from16 v19, v7

    if-nez v1, :cond_19

    goto :goto_10

    :cond_19
    const/4 v4, 0x0

    .line 502
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    mul-int/lit8 v4, v5, 0x2

    const/4 v7, 0x1

    add-int/2addr v4, v7

    aget v4, v3, v4

    add-float v4, v4, p4

    iget-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;->mAxisLabelPaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v6, v2, v4, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :goto_10
    if-nez v1, :cond_1a

    move/from16 v4, v19

    const/4 v6, 0x0

    const/16 v18, 0x1

    goto :goto_11

    .line 504
    :cond_1a
    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;->getLabel()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    aget v7, v13, v6

    int-to-float v11, v12

    sub-float/2addr v7, v11

    const/high16 v11, 0x41f00000    # 30.0f

    sub-float/2addr v7, v11

    mul-int/lit8 v5, v5, 0x2

    const/16 v18, 0x1

    add-int/lit8 v5, v5, 0x1

    aget v5, v3, v5

    add-float v5, v5, p4

    invoke-virtual {v1, v4, v7, v5, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    move/from16 v4, v19

    :goto_11
    if-lt v9, v4, :cond_1b

    goto :goto_12

    :cond_1b
    move v7, v4

    move v5, v9

    move/from16 v4, v17

    const/4 v6, 0x1

    goto/16 :goto_b

    :cond_1c
    move/from16 v17, v4

    move v4, v7

    move/from16 v4, v17

    const/4 v6, 0x1

    goto/16 :goto_c

    :cond_1d
    :goto_12
    return-void
.end method
