package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent;

/* JADX INFO: compiled from: PowerPeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ4\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;", "", "mode", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;", "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;)V", "getDefaultDayConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;", "context", "Landroid/content/Context;", "getDefaultMonthConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;", "getDefaultWeekConfig", "getHeaders", "", "Lkotlin/Pair;", "", "powerHeaderValues", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerHeaderValues;", "shortLegend", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DefaultPowerConfigProvider {
    private final powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode;

    /* JADX INFO: compiled from: PowerPeriodFormatterViewModels.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.valuesCustom().length];
            iArr[powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultPowerConfigProvider(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        this.mode = mode;
    }

    public static /* synthetic */ java.util.List getHeaders$default(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.DefaultPowerConfigProvider defaultPowerConfigProvider, android.content.Context context, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerHeaderValues powerHeaderValues, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            powerHeaderValues = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerHeaderValues(null, null, null, null, 15, null);
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return defaultPowerConfigProvider.getHeaders(context, powerHeaderValues, z);
    }

    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getHeaders(android.content.Context context, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerHeaderValues powerHeaderValues, boolean shortLegend) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(powerHeaderValues, "powerHeaderValues");
        if (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.DefaultPowerConfigProvider.WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()] == 1) {
            java.lang.String string = context.getString(powerwatch.matrix.com.pwgen2android.R.string.power_from_body);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.power_from_body)");
            java.lang.String upperCase = string.toUpperCase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            kotlin.Pair pair = new kotlin.Pair(upperCase, powerHeaderValues.getPwFromBody());
            java.lang.String string2 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.power_from_light);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.power_from_light)");
            java.lang.String upperCase2 = string2.toUpperCase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase()");
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{pair, new kotlin.Pair(upperCase2, powerHeaderValues.getSolarPower())});
        }
        java.lang.String string3 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.power_from_body);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.string.power_from_body)");
        java.lang.String upperCase3 = string3.toUpperCase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase3, "(this as java.lang.String).toUpperCase()");
        kotlin.Pair pair2 = new kotlin.Pair(upperCase3, powerHeaderValues.getAvgFromBody());
        java.lang.String string4 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.power_from_light);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.string.power_from_light)");
        java.lang.String upperCase4 = string4.toUpperCase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase4, "(this as java.lang.String).toUpperCase()");
        kotlin.Pair pair3 = new kotlin.Pair(upperCase4, powerHeaderValues.getAvgFromLight());
        java.lang.String string5 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.total_from_body);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.string.total_from_body)");
        java.lang.String upperCase5 = string5.toUpperCase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase5, "(this as java.lang.String).toUpperCase()");
        kotlin.Pair pair4 = new kotlin.Pair(upperCase5, powerHeaderValues.getPwFromBody());
        java.lang.String string6 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.total_from_light);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "context.getString(R.string.total_from_light)");
        java.lang.String upperCase6 = string6.toUpperCase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase6, "(this as java.lang.String).toUpperCase()");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{pair2, pair3, pair4, new kotlin.Pair(upperCase6, powerHeaderValues.getSolarPower())});
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig getDefaultDayConfig(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig(this.mode, null, null, 0.0f, 0.0f, false, false, getHeaders$default(this, context, null, false, 6, null), null, null, false, null, 3966, null), null, false, 0.0f, 59, null);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig getDefaultWeekConfig(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig(this.mode, null, null, 0.0f, 0.0f, false, false, getHeaders$default(this, context, null, false, 6, null), null, null, false, null, 3966, null);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig getDefaultMonthConfig(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig(this.mode, null, null, 0.0f, 0.0f, false, false, getHeaders$default(this, context, null, false, 6, null), null, null, false, null, 3966, null);
    }
}
