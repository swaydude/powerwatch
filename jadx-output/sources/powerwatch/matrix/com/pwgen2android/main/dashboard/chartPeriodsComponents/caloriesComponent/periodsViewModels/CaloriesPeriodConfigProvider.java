package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels;

/* JADX INFO: compiled from: CaloriesPeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ4\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;", "", "mode", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;", "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;)V", "getConfigWithData", "", "context", "Landroid/content/Context;", "getDefaultConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;", "getHeaders", "", "Lkotlin/Pair;", "", "caloriedHeaderValues", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodValues;", "shortLegend", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CaloriesPeriodConfigProvider {
    private final powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode;

    /* JADX INFO: compiled from: CaloriesPeriodFormatterViewModels.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.valuesCustom().length];
            iArr[powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void getConfigWithData(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public CaloriesPeriodConfigProvider(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        this.mode = mode;
    }

    public static /* synthetic */ java.util.List getHeaders$default(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodConfigProvider caloriesPeriodConfigProvider, android.content.Context context, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodValues caloriesPeriodValues, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            caloriesPeriodValues = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodValues(null, null, null, null, 15, null);
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return caloriesPeriodConfigProvider.getHeaders(context, caloriesPeriodValues, z);
    }

    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getHeaders(android.content.Context context, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodValues caloriedHeaderValues, boolean shortLegend) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(caloriedHeaderValues, "caloriedHeaderValues");
        kotlin.Pair pair = new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.active_calories_title), caloriedHeaderValues.getActiveCalories());
        kotlin.Pair pair2 = new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.bmr_calories_title), caloriedHeaderValues.getBmrCalories());
        if (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodConfigProvider.WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()] == 1) {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{pair, pair2});
        }
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{pair, pair2});
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig getDefaultConfig(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig(this.mode, kotlin.collections.CollectionsKt.emptyList(), null, 0.0f, 0.0f, false, false, getHeaders$default(this, context, null, false, 6, null), null, null, false, null, 3964, null);
    }
}
