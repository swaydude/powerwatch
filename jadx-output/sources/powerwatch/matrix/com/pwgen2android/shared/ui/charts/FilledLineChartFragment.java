package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: FilledLineChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0014J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0014H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;", "()V", "currentConfig", "lineChart", "Lcom/github/mikephil/charting/charts/LineChart;", "init", "", "config", "rootView", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setConfig", "", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FilledLineChartFragment extends powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment<powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig> {
    private static final java.lang.String CHART_CONFIG = "filledLineChartConfig";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartFragment.Companion(null);
    private powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig currentConfig;
    private com.github.mikephil.charting.charts.LineChart lineChart;

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewInflate = inflater.inflate(powerwatch.matrix.com.pwgen2android.R.layout.fragment_filled_line_chart, container, false);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewInflate);
        android.os.Bundle arguments = getArguments();
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig filledLineChartConfig = arguments == null ? null : (powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig) arguments.getParcelable(CHART_CONFIG);
        this.lineChart = (com.github.mikephil.charting.charts.LineChart) viewInflate.findViewById(powerwatch.matrix.com.pwgen2android.R.id.filled_line_chart);
        if (filledLineChartConfig != null) {
            init(filledLineChartConfig, viewInflate);
        }
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment
    public void init(final powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig config, android.view.View rootView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.charts.-$$Lambda$FilledLineChartFragment$8DgONy72uiX848J1cFvTYBrGwSE
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartFragment.m3459init$lambda6(this.f$0, config);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-6, reason: not valid java name */
    public static final void m3459init$lambda6(powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartFragment this$0, powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig config) {
        com.github.mikephil.charting.charts.LineChart lineChart;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "$config");
        if (this$0.getContext() == null || (lineChart = this$0.lineChart) == null) {
            return;
        }
        lineChart.setExtraOffsets(0.0f, 0.0f, 0.0f, 0.0f);
        lineChart.setAutoScaleMinMaxEnabled(false);
        lineChart.getDescription().setEnabled(false);
        lineChart.getLegend().setEnabled(false);
        powerwatch.matrix.com.pwgen2android.shared.extensions.ChartExtensionsKt.hideBackgroundGridLines(lineChart);
        powerwatch.matrix.com.pwgen2android.shared.extensions.ChartExtensionsKt.removeTouch(lineChart);
        android.content.Context context = lineChart.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        lineChart.setNoDataText(context.getString(powerwatch.matrix.com.pwgen2android.R.string.no_chart_data_available));
        com.github.mikephil.charting.components.XAxis xAxis = lineChart.getXAxis();
        xAxis.disableGridDashedLine();
        com.github.mikephil.charting.components.YAxis axisRight = lineChart.getAxisRight();
        axisRight.enableGridDashedLine(12.0f, 5.0f, 0.0f);
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(true);
        xAxis.setTextColor(-1);
        xAxis.setPosition(com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawLabels(true);
        xAxis.setDrawGridLines(false);
        com.github.mikephil.charting.data.LineData lineData = null;
        if (!config.getTopAreaEntries().isEmpty()) {
            com.github.mikephil.charting.data.LineDataSet lineDataSet = new com.github.mikephil.charting.data.LineDataSet(config.getTopAreaEntries(), "TopArea");
            com.github.mikephil.charting.data.LineDataSet lineDataSet2 = new com.github.mikephil.charting.data.LineDataSet(config.getBottomAreaEntries(), "BottomArea");
            com.github.mikephil.charting.data.LineDataSet lineDataSet3 = new com.github.mikephil.charting.data.LineDataSet(config.getMiddleAreaEntries(), "MiddleArea");
            lineDataSet.setLineWidth(2.0f);
            android.content.Context context2 = this$0.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context2);
            lineDataSet.setFillColor(androidx.core.content.ContextCompat.getColor(context2, powerwatch.matrix.com.pwgen2android.R.color.color_7_yellow));
            lineDataSet.setDrawFilled(true);
            lineDataSet.setDrawCircles(false);
            lineDataSet.setDrawCircleHole(false);
            lineDataSet.setAxisDependency(com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT);
            lineDataSet.setCircleRadius(3.0f);
            lineDataSet.setFillAlpha(90);
            lineDataSet.setMode(com.github.mikephil.charting.data.LineDataSet.Mode.HORIZONTAL_BEZIER);
            android.content.Context context3 = this$0.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context3);
            lineDataSet.setColor(androidx.core.content.ContextCompat.getColor(context3, powerwatch.matrix.com.pwgen2android.R.color.color_7_yellow));
            lineDataSet3.setLineWidth(1.0f);
            lineDataSet3.setDrawCircles(false);
            lineDataSet3.setDrawCircleHole(false);
            lineDataSet3.setAxisDependency(com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT);
            lineDataSet3.setMode(com.github.mikephil.charting.data.LineDataSet.Mode.HORIZONTAL_BEZIER);
            lineDataSet2.setLineWidth(2.0f);
            lineDataSet2.setCircleRadius(3.0f);
            lineDataSet2.setAxisDependency(com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT);
            lineDataSet2.setMode(com.github.mikephil.charting.data.LineDataSet.Mode.HORIZONTAL_BEZIER);
            lineDataSet2.setFillAlpha(65);
            lineDataSet2.setDrawCircles(false);
            lineDataSet2.setDrawCircleHole(false);
            android.content.Context context4 = this$0.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context4);
            lineDataSet2.setColor(androidx.core.content.ContextCompat.getColor(context4, powerwatch.matrix.com.pwgen2android.R.color.color_7_yellow));
            lineDataSet.setFillFormatter(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.BoundaryFillFormatter(lineDataSet2));
            lineData = new com.github.mikephil.charting.data.LineData((java.util.List<com.github.mikephil.charting.interfaces.datasets.ILineDataSet>) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.github.mikephil.charting.data.LineDataSet[]{lineDataSet, lineDataSet2}));
        }
        lineChart.setRenderer(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.BoundaryAreaChartRenderer(lineChart, lineChart.getAnimator(), lineChart.getViewPortHandler()));
        if (lineData != null) {
            lineData.setHighlightEnabled(false);
            lineChart.setData(lineData);
            java.lang.Iterable dataSets = ((com.github.mikephil.charting.data.LineData) lineChart.getData()).getDataSets();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dataSets, "chart.data.dataSets");
            java.util.Iterator it = dataSets.iterator();
            while (it.hasNext()) {
                ((com.github.mikephil.charting.interfaces.datasets.ILineDataSet) it.next()).setDrawValues(false);
            }
            com.github.mikephil.charting.components.XAxis xAxis2 = lineChart.getXAxis();
            java.util.List<T> dataSets2 = lineData.getDataSets();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dataSets2, "linesData.dataSets");
            xAxis2.setLabelCount(((com.github.mikephil.charting.interfaces.datasets.ILineDataSet) kotlin.collections.CollectionsKt.first((java.util.List) dataSets2)).getEntryCount());
        }
        lineChart.setData(lineData);
        if (config.getMode() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY) {
            xAxis.setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"12A", "", "", "3", "", "", "6", "", "", "9", "", "", "12P", "", "", "3", "", "", "6", "", "", "9", "", ""})));
            axisRight.setDrawGridLines(true);
            axisRight.setEnabled(true);
            axisRight.setLabelCount(3);
            axisRight.setTextColor(-7829368);
            axisRight.setDrawLabels(true);
        }
        axisRight.setAxisMinimum(0.0f);
        lineChart.invalidate();
        if (config.getPerformAnimation()) {
            lineChart.animateY(com.baidu.mapapi.UIMsg.d_ResultType.SHORT_URL, com.github.mikephil.charting.animation.Easing.EasingOption.EaseOutBack);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment
    public void setConfig(java.lang.Object config) {
        if (!(config instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig)) {
            throw new java.lang.IllegalArgumentException("Wrong config type for filled line chart provided!!!");
        }
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putParcelable(CHART_CONFIG, (android.os.Parcelable) config);
        }
        android.view.View view = getView();
        if (view != null && !kotlin.jvm.internal.Intrinsics.areEqual(config, this.currentConfig)) {
            init((powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig) config, view);
        }
        this.currentConfig = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig) config;
    }

    /* JADX INFO: compiled from: FilledLineChartFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment$Companion;", "", "()V", "CHART_CONFIG", "", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartFragment;", "config", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartFragment newInstance$default(powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartFragment.Companion companion, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = null;
            }
            return companion.newInstance(obj);
        }

        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartFragment newInstance(java.lang.Object config) {
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartFragment filledLineChartFragment = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            if (config instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig) {
                bundle.putParcelable(powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartFragment.CHART_CONFIG, (android.os.Parcelable) config);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            filledLineChartFragment.setArguments(bundle);
            return filledLineChartFragment;
        }
    }
}
