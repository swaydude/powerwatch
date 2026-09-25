package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents;

/* JADX INFO: compiled from: TemperaturePeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ4\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;", "", "mode", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;", "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;)V", "getDefaultConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;", "context", "Landroid/content/Context;", "getHeaders", "", "Lkotlin/Pair;", "", "sleepHeaderValues", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureHeaderValues;", "shortLegend", "", "getLegendValues", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DefaultTemperatureConfigProvider {
    private final powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode;

    public DefaultTemperatureConfigProvider(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        this.mode = mode;
    }

    public static /* synthetic */ java.util.List getHeaders$default(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.DefaultTemperatureConfigProvider defaultTemperatureConfigProvider, android.content.Context context, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureHeaderValues temperatureHeaderValues, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            temperatureHeaderValues = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureHeaderValues(null, null, 3, null);
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return defaultTemperatureConfigProvider.getHeaders(context, temperatureHeaderValues, z);
    }

    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getHeaders(android.content.Context context, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureHeaderValues sleepHeaderValues, boolean shortLegend) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepHeaderValues, "sleepHeaderValues");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.heart_rate_average), sleepHeaderValues.getAverage()), new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.heart_rate_range), sleepHeaderValues.getRange())});
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig getDefaultConfig(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig("", 0.0f, new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig(this.mode, kotlin.collections.CollectionsKt.emptyList(), null, 0.0f, 0.0f, false, getHeaders$default(this, context, null, false, 6, null), null, 0, 0, null, false, 4028, null), null, null, null, null, false, getLegendValues(context), null, null, 0.0f, false, 7930, null);
    }

    public final java.util.List<java.lang.String> getLegendValues(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.String string = context.getString(powerwatch.matrix.com.pwgen2android.R.string.average_days);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.average_days)");
        java.lang.String string2 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.hourly_temp_range);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.hourly_temp_range)");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{string, string2});
    }
}
