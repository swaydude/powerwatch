package powerwatch.matrix.com.pwgen2android.shared.extensions;

/* JADX INFO: compiled from: ChartExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0005¨\u0006\u0007"}, d2 = {"hideBackgroundGridLines", "", "Lcom/github/mikephil/charting/charts/BarChart;", "Lcom/github/mikephil/charting/charts/CandleStickChart;", "Lcom/github/mikephil/charting/charts/CombinedChart;", "Lcom/github/mikephil/charting/charts/LineChart;", "removeTouch", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ChartExtensionsKt {
    public static final void hideBackgroundGridLines(com.github.mikephil.charting.charts.BarChart barChart) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barChart, "<this>");
        barChart.getXAxis().setDrawGridLines(false);
        barChart.getAxisLeft().setDrawGridLines(false);
        barChart.getAxisLeft().setDrawAxisLine(false);
        barChart.getAxisLeft().setDrawLabels(false);
        barChart.getAxisRight().setDrawGridLines(false);
        barChart.getAxisRight().setDrawAxisLine(false);
        barChart.getAxisRight().setDrawLabels(false);
    }

    public static final void removeTouch(com.github.mikephil.charting.charts.BarChart barChart) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barChart, "<this>");
        barChart.setTouchEnabled(false);
        barChart.setScaleEnabled(false);
        barChart.setClickable(false);
    }

    public static final void removeTouch(com.github.mikephil.charting.charts.LineChart lineChart) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineChart, "<this>");
        lineChart.setTouchEnabled(false);
        lineChart.setScaleEnabled(false);
        lineChart.setClickable(false);
    }

    public static final void removeTouch(com.github.mikephil.charting.charts.CandleStickChart candleStickChart) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candleStickChart, "<this>");
        candleStickChart.setTouchEnabled(false);
        candleStickChart.setScaleEnabled(false);
        candleStickChart.setClickable(false);
    }

    public static final void hideBackgroundGridLines(com.github.mikephil.charting.charts.LineChart lineChart) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineChart, "<this>");
        lineChart.getXAxis().setDrawGridLines(true);
        lineChart.getXAxis().setDrawAxisLine(false);
        lineChart.getXAxis().enableGridDashedLine(10.0f, 10.0f, 0.0f);
        lineChart.getAxisLeft().setDrawGridLines(false);
        lineChart.getAxisLeft().setDrawAxisLine(false);
        lineChart.getAxisLeft().setDrawLabels(false);
        lineChart.getAxisRight().setDrawGridLines(false);
        lineChart.getAxisRight().setDrawAxisLine(false);
        lineChart.getAxisRight().setDrawLabels(false);
    }

    public static final void hideBackgroundGridLines(com.github.mikephil.charting.charts.CandleStickChart candleStickChart) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candleStickChart, "<this>");
        candleStickChart.getXAxis().setDrawGridLines(true);
        candleStickChart.getXAxis().setDrawAxisLine(false);
        candleStickChart.getXAxis().enableGridDashedLine(10.0f, 10.0f, 0.0f);
        candleStickChart.getAxisLeft().setDrawGridLines(false);
        candleStickChart.getAxisLeft().setDrawAxisLine(false);
        candleStickChart.getAxisLeft().setDrawLabels(false);
        candleStickChart.getAxisRight().setDrawGridLines(false);
        candleStickChart.getAxisRight().setDrawAxisLine(false);
        candleStickChart.getAxisRight().setDrawLabels(false);
    }

    public static final void hideBackgroundGridLines(com.github.mikephil.charting.charts.CombinedChart combinedChart) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedChart, "<this>");
        combinedChart.getXAxis().setDrawGridLines(true);
        combinedChart.getXAxis().setDrawAxisLine(false);
        combinedChart.getXAxis().enableGridDashedLine(10.0f, 10.0f, 0.0f);
        combinedChart.getAxisLeft().setDrawGridLines(false);
        combinedChart.getAxisLeft().setDrawAxisLine(false);
        combinedChart.getAxisLeft().setDrawLabels(false);
        combinedChart.getAxisRight().setDrawGridLines(false);
        combinedChart.getAxisRight().setDrawAxisLine(false);
        combinedChart.getAxisRight().setDrawLabels(false);
    }

    public static final void removeTouch(com.github.mikephil.charting.charts.CombinedChart combinedChart) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedChart, "<this>");
        combinedChart.setTouchEnabled(false);
        combinedChart.setScaleEnabled(false);
        combinedChart.setClickable(false);
    }
}
