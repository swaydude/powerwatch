package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: CombinedGraphFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/YAxisValueFormatter;", "Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;", "format", "", "useFloatYValues", "", "indexAxisValueFormatter", "Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;", "(Ljava/lang/String;ZLcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;)V", "getFormattedValue", "value", "", "axis", "Lcom/github/mikephil/charting/components/AxisBase;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class YAxisValueFormatter implements com.github.mikephil.charting.formatter.IAxisValueFormatter {
    private final java.lang.String format;
    private final com.github.mikephil.charting.formatter.IndexAxisValueFormatter indexAxisValueFormatter;
    private final boolean useFloatYValues;

    public YAxisValueFormatter(java.lang.String format, boolean z, com.github.mikephil.charting.formatter.IndexAxisValueFormatter indexAxisValueFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(indexAxisValueFormatter, "indexAxisValueFormatter");
        this.format = format;
        this.useFloatYValues = z;
        this.indexAxisValueFormatter = indexAxisValueFormatter;
    }

    public /* synthetic */ YAxisValueFormatter(java.lang.String str, boolean z, com.github.mikephil.charting.formatter.IndexAxisValueFormatter indexAxisValueFormatter, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(kotlin.collections.CollectionsKt.emptyList()) : indexAxisValueFormatter);
    }

    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    public java.lang.String getFormattedValue(float value, com.github.mikephil.charting.components.AxisBase axis) {
        if (!this.useFloatYValues) {
            return java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(value));
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(value)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        return kotlin.jvm.internal.Intrinsics.stringPlus(str, this.format);
    }
}
