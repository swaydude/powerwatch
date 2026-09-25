package powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate;

/* JADX INFO: compiled from: ActivityHeartRateChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/TimeValueFormatter;", "Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;", "indexAxisValueFormatter", "Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;", "(Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;)V", "counter", "", "getFormattedValue", "", "value", "", "axis", "Lcom/github/mikephil/charting/components/AxisBase;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TimeValueFormatter implements com.github.mikephil.charting.formatter.IAxisValueFormatter {
    private int counter;
    private final com.github.mikephil.charting.formatter.IndexAxisValueFormatter indexAxisValueFormatter;

    /* JADX WARN: Multi-variable type inference failed */
    public TimeValueFormatter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TimeValueFormatter(com.github.mikephil.charting.formatter.IndexAxisValueFormatter indexAxisValueFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(indexAxisValueFormatter, "indexAxisValueFormatter");
        this.indexAxisValueFormatter = indexAxisValueFormatter;
    }

    public /* synthetic */ TimeValueFormatter(com.github.mikephil.charting.formatter.IndexAxisValueFormatter indexAxisValueFormatter, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(kotlin.collections.CollectionsKt.emptyList()) : indexAxisValueFormatter);
    }

    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    public java.lang.String getFormattedValue(float value, com.github.mikephil.charting.components.AxisBase axis) {
        return powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.completeTimeFormat((long) value);
    }
}
