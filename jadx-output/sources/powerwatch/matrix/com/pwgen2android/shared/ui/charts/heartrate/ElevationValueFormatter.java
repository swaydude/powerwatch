package powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate;

/* JADX INFO: compiled from: ActivityHeartRateChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ElevationValueFormatter;", "Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "indexAxisValueFormatter", "Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;", "(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;)V", "getFormattedValue", "", "value", "", "axis", "Lcom/github/mikephil/charting/components/AxisBase;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ElevationValueFormatter implements com.github.mikephil.charting.formatter.IAxisValueFormatter {
    private final com.github.mikephil.charting.formatter.IndexAxisValueFormatter indexAxisValueFormatter;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    public ElevationValueFormatter(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, com.github.mikephil.charting.formatter.IndexAxisValueFormatter indexAxisValueFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(indexAxisValueFormatter, "indexAxisValueFormatter");
        this.userPrefsUtils = userPrefsUtils;
        this.indexAxisValueFormatter = indexAxisValueFormatter;
    }

    public /* synthetic */ ElevationValueFormatter(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, com.github.mikephil.charting.formatter.IndexAxisValueFormatter indexAxisValueFormatter, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(userPrefsUtils, (i & 2) != 0 ? new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(kotlin.collections.CollectionsKt.emptyList()) : indexAxisValueFormatter);
    }

    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    public java.lang.String getFormattedValue(float value, com.github.mikephil.charting.components.AxisBase axis) {
        java.lang.Boolean boolIsMetricsUsedOrNull = this.userPrefsUtils.isMetricsUsedOrNull();
        java.lang.String str = boolIsMetricsUsedOrNull == null ? false : boolIsMetricsUsedOrNull.booleanValue() ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricsMetersUnit : powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.imperialFeetUnit;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str2 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(value)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        return kotlin.jvm.internal.Intrinsics.stringPlus(str2, str);
    }
}
