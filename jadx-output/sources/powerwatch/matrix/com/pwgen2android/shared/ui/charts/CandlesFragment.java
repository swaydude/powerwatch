package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: CandlesFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0014J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0014H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;", "()V", "candlesChart", "Lcom/github/mikephil/charting/charts/CandleStickChart;", "currentConfig", "init", "", "config", "rootView", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setConfig", "", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CandlesFragment extends powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig> {
    private static final java.lang.String CANDLES_CONFIG_PARAM = "candlesConfig";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandlesFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandlesFragment.Companion(null);
    private com.github.mikephil.charting.charts.CandleStickChart candlesChart;
    private powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig currentConfig;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandlesFragment newInstance(java.lang.Object obj) {
        return INSTANCE.newInstance(obj);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View rootView = inflater.inflate(powerwatch.matrix.com.pwgen2android.R.layout.fragment_candles, container, false);
        android.os.Bundle arguments = getArguments();
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig candleChartConfig = arguments == null ? null : (powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig) arguments.getParcelable(CANDLES_CONFIG_PARAM);
        this.candlesChart = (com.github.mikephil.charting.charts.CandleStickChart) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.candle_chart);
        if (candleChartConfig != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
            init(candleChartConfig, rootView);
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment
    public void init(final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig config, final android.view.View rootView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.charts.-$$Lambda$CandlesFragment$mvKO5M01jp8zd-BT3PxoI_i62DU
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandlesFragment.m3446init$lambda3(this.f$0, rootView, config);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-3, reason: not valid java name */
    public static final void m3446init$lambda3(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandlesFragment this$0, android.view.View rootView, powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig config) {
        int entryCount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "$rootView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "$config");
        if (this$0.getContext() == null) {
            return;
        }
        com.github.mikephil.charting.charts.CandleStickChart candleStickChart = this$0.candlesChart;
        if (candleStickChart != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ChartExtensionsKt.hideBackgroundGridLines(candleStickChart);
            powerwatch.matrix.com.pwgen2android.shared.extensions.ChartExtensionsKt.removeTouch(candleStickChart);
            com.github.mikephil.charting.components.Description description = candleStickChart.getDescription();
            if (description != null) {
                description.setEnabled(false);
            }
            com.github.mikephil.charting.components.YAxis axisLeft = candleStickChart.getAxisLeft();
            com.github.mikephil.charting.components.YAxis axisRight = candleStickChart.getAxisRight();
            axisRight.enableGridDashedLine(12.0f, 5.0f, 0.0f);
            int i = 1;
            axisRight.setDrawLabels(true);
            axisLeft.setDrawGridLines(false);
            axisRight.setDrawGridLines(true);
            com.github.mikephil.charting.components.XAxis xAxis = candleStickChart.getXAxis();
            xAxis.setPosition(com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM);
            xAxis.setDrawGridLines(false);
            xAxis.setDrawLabels(true);
            xAxis.setTextColor(-1);
            axisRight.setTextColor(-1);
            axisLeft.setDrawLabels(false);
            xAxis.setGranularity(1.0f);
            xAxis.setGranularityEnabled(true);
            xAxis.setAvoidFirstLastClipping(true);
            candleStickChart.getLegend().setEnabled(false);
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData> entries = config.getEntries();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entries, 10));
            java.util.Iterator<T> it = entries.iterator();
            while (it.hasNext()) {
                arrayList.add(((powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData) it.next()).createCandleEntry());
            }
            com.github.mikephil.charting.data.CandleDataSet candleDataSet = new com.github.mikephil.charting.data.CandleDataSet(arrayList, "");
            candleDataSet.setColor(android.graphics.Color.rgb(80, 80, 80));
            candleDataSet.setShadowColor(this$0.getResources().getColor(powerwatch.matrix.com.pwgen2android.R.color.cyan));
            candleDataSet.setShadowWidth(0.8f);
            candleDataSet.setDecreasingColor(this$0.getResources().getColor(config.getDecreasingColor()));
            candleDataSet.setDecreasingPaintStyle(android.graphics.Paint.Style.FILL);
            candleDataSet.setIncreasingColor(this$0.getResources().getColor(config.getIncreasingColor()));
            candleDataSet.setIncreasingPaintStyle(android.graphics.Paint.Style.FILL);
            candleDataSet.setNeutralColor(-3355444);
            candleDataSet.setDrawValues(false);
            if (!config.getEntries().isEmpty()) {
                candleStickChart.setData(new com.github.mikephil.charting.data.CandleData(candleDataSet));
            } else {
                candleStickChart.setData(null);
            }
            if (config.getMode() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY) {
                xAxis.setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"12A", "", "", "3", "", "", "6", "", "", "9", "", "", "12P", "", "", "3", "", "", "6", "", "", "9", "", ""})));
                xAxis.setLabelCount(24);
            } else if (config.getMode() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK) {
                xAxis.setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.weekDaysByLocale$default(new java.text.DateFormatSymbols(), null, 1, null)));
                candleStickChart.getXAxis().setAxisMinimum(0.0f);
                xAxis.setLabelCount(7);
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (candleStickChart.getData() != null && 1 <= (entryCount = ((com.github.mikephil.charting.interfaces.datasets.ICandleDataSet) ((com.github.mikephil.charting.data.CandleData) candleStickChart.getData()).getDataSets().get(0)).getEntryCount())) {
                    while (true) {
                        int i2 = i + 1;
                        arrayList2.add((i == 3 || i == 10 || i == 17 || i == 24) ? java.lang.String.valueOf(i) : "");
                        if (i == entryCount) {
                            break;
                        } else {
                            i = i2;
                        }
                    }
                }
                xAxis.setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(arrayList2));
                xAxis.setLabelCount(arrayList2.size());
            }
            axisRight.setAxisMinimum(0.0f);
            axisLeft.setAxisMinimum(0.0f);
            com.github.mikephil.charting.components.LimitLine limitLine = new com.github.mikephil.charting.components.LimitLine(axisRight.getAxisMinimum());
            limitLine.setLineColor(-1);
            limitLine.setTextColor(-7829368);
            limitLine.setLineWidth(1.5f);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            axisRight.addLimitLine(limitLine);
            com.github.mikephil.charting.components.LimitLine limitLine2 = new com.github.mikephil.charting.components.LimitLine(axisLeft.getAxisMinimum());
            limitLine2.setLineColor(-1);
            limitLine2.setTextColor(-7829368);
            limitLine2.setLineWidth(1.5f);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            axisLeft.addLimitLine(limitLine2);
            android.content.Context context = this$0.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context);
            candleStickChart.setNoDataText(context.getString(powerwatch.matrix.com.pwgen2android.R.string.no_chart_data_available));
            candleStickChart.invalidate();
            if (config.getPerformAnimation()) {
                candleStickChart.animateY(com.baidu.mapapi.UIMsg.d_ResultType.SHORT_URL, com.github.mikephil.charting.animation.Easing.EasingOption.EaseOutBack);
            }
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment
    public void setConfig(java.lang.Object config) {
        if (!(config instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig)) {
            throw new java.lang.IllegalArgumentException("Wrong config type for candle chart provided!!!");
        }
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putParcelable(CANDLES_CONFIG_PARAM, (android.os.Parcelable) config);
        }
        android.view.View view = getView();
        if (view != null && !kotlin.jvm.internal.Intrinsics.areEqual(config, this.currentConfig)) {
            init((powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig) config, view);
        }
        this.currentConfig = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig) config;
    }

    /* JADX INFO: compiled from: CandlesFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment$Companion;", "", "()V", "CANDLES_CONFIG_PARAM", "", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandlesFragment;", "config", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandlesFragment newInstance$default(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandlesFragment.Companion companion, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = null;
            }
            return companion.newInstance(obj);
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandlesFragment newInstance(java.lang.Object config) {
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandlesFragment candlesFragment = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandlesFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            if (config instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig) {
                bundle.putParcelable(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandlesFragment.CANDLES_CONFIG_PARAM, (android.os.Parcelable) config);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            candlesFragment.setArguments(bundle);
            return candlesFragment;
        }
    }
}
