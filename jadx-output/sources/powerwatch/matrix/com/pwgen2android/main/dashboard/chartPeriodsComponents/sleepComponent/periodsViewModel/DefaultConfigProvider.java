package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel;

/* JADX INFO: compiled from: SleepPeriodsFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ4\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;", "", "mode", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;", "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;)V", "getDefaultConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;", "context", "Landroid/content/Context;", "shortLegend", "", "getHeaders", "", "Lkotlin/Pair;", "", "sleepHeaderValues", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepHeaderValues;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DefaultConfigProvider {
    private final powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode;

    /* JADX INFO: compiled from: SleepPeriodsFormatterViewModels.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.valuesCustom().length];
            iArr[powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultConfigProvider(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        this.mode = mode;
    }

    public static /* synthetic */ java.util.List getHeaders$default(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.DefaultConfigProvider defaultConfigProvider, android.content.Context context, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepHeaderValues sleepHeaderValues, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            sleepHeaderValues = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepHeaderValues(null, null, null, null, null, null, 63, null);
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return defaultConfigProvider.getHeaders(context, sleepHeaderValues, z);
    }

    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getHeaders(android.content.Context context, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepHeaderValues sleepHeaderValues, boolean shortLegend) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepHeaderValues, "sleepHeaderValues");
        int i = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.DefaultConfigProvider.WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        java.lang.String str = powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText;
        if (i == 1) {
            java.lang.String string = context.getString(powerwatch.matrix.com.pwgen2android.R.string.duration);
            java.lang.String duration = sleepHeaderValues.getDuration();
            if (duration == null) {
                duration = powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText;
            }
            kotlin.Pair pair = new kotlin.Pair(string, duration);
            java.lang.String string2 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.restless);
            java.lang.String restless = sleepHeaderValues.getRestless();
            if (restless == null) {
                restless = powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText;
            }
            kotlin.Pair pair2 = new kotlin.Pair(string2, restless);
            if (!shortLegend) {
                kotlin.Pair[] pairArr = new kotlin.Pair[4];
                java.lang.String string3 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.went_to_bed);
                java.lang.String wentToBed = sleepHeaderValues.getWentToBed();
                if (wentToBed == null) {
                    wentToBed = powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText;
                }
                pairArr[0] = new kotlin.Pair(string3, wentToBed);
                java.lang.String string4 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.woke_up);
                java.lang.String wokeUp = sleepHeaderValues.getWokeUp();
                if (wokeUp != null) {
                    str = wokeUp;
                }
                pairArr[1] = new kotlin.Pair(string4, str);
                pairArr[2] = pair;
                pairArr[3] = pair2;
                return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) pairArr);
            }
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{pair, pair2});
        }
        kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
        java.lang.String string5 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.avg_duration);
        java.lang.String avgDuration = sleepHeaderValues.getAvgDuration();
        if (avgDuration == null) {
            avgDuration = powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText;
        }
        pairArr2[0] = new kotlin.Pair(string5, avgDuration);
        java.lang.String string6 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.avg_restless);
        java.lang.String avgRestless = sleepHeaderValues.getAvgRestless();
        if (avgRestless != null) {
            str = avgRestless;
        }
        pairArr2[1] = new kotlin.Pair(string6, str);
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) pairArr2);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig getDefaultConfig$default(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.DefaultConfigProvider defaultConfigProvider, android.content.Context context, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return defaultConfigProvider.getDefaultConfig(context, z);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig getDefaultConfig(android.content.Context context, boolean shortLegend) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig(this.mode, kotlin.collections.CollectionsKt.emptyList(), 0.0f, getHeaders$default(this, context, null, shortLegend, 2, null), kotlin.collections.CollectionsKt.emptyList(), null, null, null, false, null, 0, 2016, null);
    }
}
