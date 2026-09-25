package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: ChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;", "", "(Ljava/lang/String;I)V", "DAY", "WEEK", "MONTH", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum ChartPeriodMode {
    DAY,
    WEEK,
    MONTH;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode[] valuesCustom() {
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode[] chartPeriodModeArrValuesCustom = values();
        return (powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode[]) java.util.Arrays.copyOf(chartPeriodModeArrValuesCustom, chartPeriodModeArrValuesCustom.length);
    }
}
