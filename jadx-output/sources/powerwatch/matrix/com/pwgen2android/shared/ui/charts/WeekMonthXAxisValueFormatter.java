package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: CubicLineChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/WeekMonthXAxisValueFormatter;", "Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;", "indexAxisValueFormatter", "Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;", "offsetValue", "", "(Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;F)V", "getFormattedValue", "", "value", "axis", "Lcom/github/mikephil/charting/components/AxisBase;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WeekMonthXAxisValueFormatter implements com.github.mikephil.charting.formatter.IAxisValueFormatter {
    private final com.github.mikephil.charting.formatter.IndexAxisValueFormatter indexAxisValueFormatter;
    private final float offsetValue;

    public WeekMonthXAxisValueFormatter(com.github.mikephil.charting.formatter.IndexAxisValueFormatter indexAxisValueFormatter, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(indexAxisValueFormatter, "indexAxisValueFormatter");
        this.indexAxisValueFormatter = indexAxisValueFormatter;
        this.offsetValue = f;
    }

    public /* synthetic */ WeekMonthXAxisValueFormatter(com.github.mikephil.charting.formatter.IndexAxisValueFormatter indexAxisValueFormatter, float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(kotlin.collections.CollectionsKt.emptyList()) : indexAxisValueFormatter, f);
    }

    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    public java.lang.String getFormattedValue(float value, com.github.mikephil.charting.components.AxisBase axis) {
        float f = this.offsetValue;
        if (f == 0.0f) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String str = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(kotlin.math.MathKt.roundToInt(value))}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            return kotlin.jvm.internal.Intrinsics.stringPlus(str, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.hourUnit);
        }
        float f2 = 24;
        float f3 = (f2 - f) + value;
        if (f3 > 24.0f) {
            f3 -= f2;
        }
        if (f3 == 24.0f) {
            f3 = 0.0f;
        }
        if (f3 < 0.0f) {
            f3 += f2;
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str2 = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(kotlin.math.MathKt.roundToInt(f3))}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        return kotlin.jvm.internal.Intrinsics.stringPlus(str2, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.hourUnit);
    }
}
