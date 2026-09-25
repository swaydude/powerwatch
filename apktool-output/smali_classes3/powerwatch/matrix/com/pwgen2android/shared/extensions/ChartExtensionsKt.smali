.class public final Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ChartExtensionsKt;
.super Ljava/lang/Object;
.source "ChartExtensions.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "hideBackgroundGridLines",
        "",
        "Lcom/github/mikephil/charting/charts/BarChart;",
        "Lcom/github/mikephil/charting/charts/CandleStickChart;",
        "Lcom/github/mikephil/charting/charts/CombinedChart;",
        "Lcom/github/mikephil/charting/charts/LineChart;",
        "removeTouch",
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
.method public static final hideBackgroundGridLines(Lcom/github/mikephil/charting/charts/BarChart;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/XAxis;->setDrawGridLines(Z)V

    .line 8
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawGridLines(Z)V

    .line 9
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawAxisLine(Z)V

    .line 10
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawLabels(Z)V

    .line 11
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawGridLines(Z)V

    .line 12
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawAxisLine(Z)V

    .line 13
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object p0

    invoke-virtual {p0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawLabels(Z)V

    return-void
.end method

.method public static final hideBackgroundGridLines(Lcom/github/mikephil/charting/charts/CandleStickChart;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/CandleStickChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/XAxis;->setDrawGridLines(Z)V

    .line 50
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/CandleStickChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/XAxis;->setDrawAxisLine(Z)V

    .line 51
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/CandleStickChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    const/high16 v2, 0x41200000    # 10.0f

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v2, v3}, Lcom/github/mikephil/charting/components/XAxis;->enableGridDashedLine(FFF)V

    .line 52
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/CandleStickChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawGridLines(Z)V

    .line 53
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/CandleStickChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawAxisLine(Z)V

    .line 54
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/CandleStickChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawLabels(Z)V

    .line 55
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/CandleStickChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawGridLines(Z)V

    .line 56
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/CandleStickChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawAxisLine(Z)V

    .line 57
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/CandleStickChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object p0

    invoke-virtual {p0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawLabels(Z)V

    return-void
.end method

.method public static final hideBackgroundGridLines(Lcom/github/mikephil/charting/charts/CombinedChart;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/CombinedChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/XAxis;->setDrawGridLines(Z)V

    .line 62
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/CombinedChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/XAxis;->setDrawAxisLine(Z)V

    .line 63
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/CombinedChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    const/high16 v2, 0x41200000    # 10.0f

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v2, v3}, Lcom/github/mikephil/charting/components/XAxis;->enableGridDashedLine(FFF)V

    .line 64
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/CombinedChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawGridLines(Z)V

    .line 65
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/CombinedChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawAxisLine(Z)V

    .line 66
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/CombinedChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawLabels(Z)V

    .line 67
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/CombinedChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawGridLines(Z)V

    .line 68
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/CombinedChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawAxisLine(Z)V

    .line 69
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/CombinedChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object p0

    invoke-virtual {p0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawLabels(Z)V

    return-void
.end method

.method public static final hideBackgroundGridLines(Lcom/github/mikephil/charting/charts/LineChart;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/XAxis;->setDrawGridLines(Z)V

    .line 37
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/XAxis;->setDrawAxisLine(Z)V

    .line 38
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    const/high16 v2, 0x41200000    # 10.0f

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v2, v3}, Lcom/github/mikephil/charting/components/XAxis;->enableGridDashedLine(FFF)V

    .line 39
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawGridLines(Z)V

    .line 40
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawAxisLine(Z)V

    .line 41
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawLabels(Z)V

    .line 42
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawGridLines(Z)V

    .line 43
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawAxisLine(Z)V

    .line 44
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object p0

    invoke-virtual {p0, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawLabels(Z)V

    return-void
.end method

.method public static final removeTouch(Lcom/github/mikephil/charting/charts/BarChart;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/BarChart;->setTouchEnabled(Z)V

    .line 19
    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/BarChart;->setScaleEnabled(Z)V

    .line 20
    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/BarChart;->setClickable(Z)V

    return-void
.end method

.method public static final removeTouch(Lcom/github/mikephil/charting/charts/CandleStickChart;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 30
    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/CandleStickChart;->setTouchEnabled(Z)V

    .line 31
    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/CandleStickChart;->setScaleEnabled(Z)V

    .line 32
    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/CandleStickChart;->setClickable(Z)V

    return-void
.end method

.method public static final removeTouch(Lcom/github/mikephil/charting/charts/CombinedChart;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 73
    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/CombinedChart;->setTouchEnabled(Z)V

    .line 74
    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/CombinedChart;->setScaleEnabled(Z)V

    .line 75
    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/CombinedChart;->setClickable(Z)V

    return-void
.end method

.method public static final removeTouch(Lcom/github/mikephil/charting/charts/LineChart;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/LineChart;->setTouchEnabled(Z)V

    .line 25
    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/LineChart;->setScaleEnabled(Z)V

    .line 26
    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/LineChart;->setClickable(Z)V

    return-void
.end method
