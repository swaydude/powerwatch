package powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils;

/* JADX INFO: loaded from: classes3.dex */
public class MinMaxFillFormatter extends com.github.mikephil.charting.formatter.DefaultFillFormatter {
    public final int aboveLineChartColor;
    public final float max;
    public final float min;

    public MinMaxFillFormatter(float max, float min, int aboveLineChartColor) {
        this.max = max;
        this.min = min;
        this.aboveLineChartColor = aboveLineChartColor;
    }
}
