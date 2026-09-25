package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: CubicLineChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;", "Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;", "values", "", "", "indexAxisValueFormatter", "Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;", "(Ljava/util/List;Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;)V", "counter", "", "getValues", "()Ljava/util/List;", "getFormattedValue", "value", "", "axis", "Lcom/github/mikephil/charting/components/AxisBase;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DaysYAxisValueFormatter implements com.github.mikephil.charting.formatter.IAxisValueFormatter {
    private int counter;
    private final com.github.mikephil.charting.formatter.IndexAxisValueFormatter indexAxisValueFormatter;
    private final java.util.List<java.lang.String> values;

    public DaysYAxisValueFormatter(java.util.List<java.lang.String> values, com.github.mikephil.charting.formatter.IndexAxisValueFormatter indexAxisValueFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(indexAxisValueFormatter, "indexAxisValueFormatter");
        this.values = values;
        this.indexAxisValueFormatter = indexAxisValueFormatter;
    }

    public final java.util.List<java.lang.String> getValues() {
        return this.values;
    }

    public /* synthetic */ DaysYAxisValueFormatter(java.util.List list, com.github.mikephil.charting.formatter.IndexAxisValueFormatter indexAxisValueFormatter, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(kotlin.collections.CollectionsKt.emptyList()) : indexAxisValueFormatter);
    }

    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    public java.lang.String getFormattedValue(float value, com.github.mikephil.charting.components.AxisBase axis) {
        java.lang.Integer numValueOf = axis == null ? null : java.lang.Integer.valueOf(axis.mEntryCount);
        int size = this.values.size();
        if (numValueOf == null || numValueOf.intValue() != size) {
            return "";
        }
        java.lang.String str = this.counter < this.values.size() ? this.values.get(this.counter) : "ERROR";
        int i = this.counter + 1;
        this.counter = i;
        if (i >= this.values.size()) {
            this.counter = 0;
        }
        return str;
    }
}
