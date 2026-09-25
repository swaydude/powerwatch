package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent;

/* JADX INFO: compiled from: HeartRatePeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ4\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0005J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;", "", "mode", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;", "displayHrv", "", "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Z)V", "getDefaultConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;", "context", "Landroid/content/Context;", "getHeaders", "", "Lkotlin/Pair;", "", "sleepHeaderValues", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateHeaderValues;", "shortLegend", "getLegendValues", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DefaultHeartRateConfigProvider {
    private final boolean displayHrv;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode;

    public DefaultHeartRateConfigProvider(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        this.mode = mode;
        this.displayHrv = z;
    }

    public static /* synthetic */ java.util.List getHeaders$default(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.DefaultHeartRateConfigProvider defaultHeartRateConfigProvider, android.content.Context context, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateHeaderValues heartRateHeaderValues, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            heartRateHeaderValues = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateHeaderValues(null, null, null, 7, null);
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return defaultHeartRateConfigProvider.getHeaders(context, heartRateHeaderValues, z);
    }

    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getHeaders(android.content.Context context, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateHeaderValues sleepHeaderValues, boolean shortLegend) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepHeaderValues, "sleepHeaderValues");
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> listMutableListOf = kotlin.collections.CollectionsKt.mutableListOf(new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.heart_rate_average), sleepHeaderValues.getAverage()), new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.heart_rate_range), sleepHeaderValues.getRange()));
        if (this.mode == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY && this.displayHrv) {
            listMutableListOf.add(new kotlin.Pair<>(context.getString(powerwatch.matrix.com.pwgen2android.R.string.hrv_lbl), sleepHeaderValues.getHrv()));
        }
        return listMutableListOf;
    }

    public final java.util.List<java.lang.String> getLegendValues(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.String string = context.getString(powerwatch.matrix.com.pwgen2android.R.string.average_days);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.average_days)");
        java.lang.String string2 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.hourly_hr_range);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.hourly_hr_range)");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{string, string2});
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig getDefaultConfig(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig(null, 0.0f, new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig(this.mode, kotlin.collections.CollectionsKt.emptyList(), null, 0.0f, 0.0f, false, getHeaders$default(this, context, null, false, 6, null), null, 0, 0, null, false, 4028, null), null, null, null, null, false, getLegendValues(context), null, null, 0.0f, false, 7803, null);
    }
}
