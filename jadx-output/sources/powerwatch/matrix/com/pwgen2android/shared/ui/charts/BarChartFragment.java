package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: BarChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0014J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0014H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;", "()V", "barChart", "Lcom/github/mikephil/charting/charts/BarChart;", "currentConfig", "init", "", "config", "rootView", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setConfig", "", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BarChartFragment extends powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment<powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartFragment.Companion(null);
    private com.github.mikephil.charting.charts.BarChart barChart;
    private powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig currentConfig;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartFragment newInstance(java.lang.Object obj) {
        return INSTANCE.newInstance(obj);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View rootView = inflater.inflate(powerwatch.matrix.com.pwgen2android.R.layout.fragment_pedometer, container, false);
        android.os.Bundle arguments = getArguments();
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig barChartConfig = arguments == null ? null : (powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig) arguments.getParcelable("pedometerConfig");
        this.barChart = (com.github.mikephil.charting.charts.BarChart) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.bar_chart);
        if (barChartConfig != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
            init(barChartConfig, rootView);
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment
    public void init(final powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig config, android.view.View rootView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.charts.-$$Lambda$BarChartFragment$EiiNNfnmNt-6u6guXu4ZWIJ1zEI
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartFragment.m3444init$lambda15(this.f$0, config);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-15, reason: not valid java name */
    public static final void m3444init$lambda15(powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartFragment this$0, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig config) {
        com.github.mikephil.charting.charts.BarChart barChart;
        com.github.mikephil.charting.data.BarData barData;
        java.lang.Iterable<com.github.mikephil.charting.interfaces.datasets.IBarDataSet> dataSets;
        java.util.ArrayList arrayList;
        java.lang.Integer numValueOf;
        com.github.mikephil.charting.data.BaseDataSet barDataSet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "$config");
        if (this$0.getContext() == null || (barChart = this$0.barChart) == null) {
            return;
        }
        barChart.setExtraOffsets(0.0f, 0.0f, 0.0f, 0.0f);
        barChart.setAutoScaleMinMaxEnabled(true);
        barChart.getDescription().setEnabled(false);
        barChart.setDrawValueAboveBar(true);
        barChart.getLegend().setEnabled(false);
        powerwatch.matrix.com.pwgen2android.shared.extensions.ChartExtensionsKt.hideBackgroundGridLines(barChart);
        powerwatch.matrix.com.pwgen2android.shared.extensions.ChartExtensionsKt.removeTouch(barChart);
        android.content.Context context = barChart.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        barChart.setNoDataText(context.getString(powerwatch.matrix.com.pwgen2android.R.string.no_chart_data_available));
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        com.github.mikephil.charting.components.XAxis xAxis = barChart.getXAxis();
        com.github.mikephil.charting.components.YAxis axisLeft = barChart.getAxisLeft();
        com.github.mikephil.charting.components.YAxis axisRight = barChart.getAxisRight();
        axisRight.enableGridDashedLine(12.0f, 5.0f, 0.0f);
        xAxis.setTextColor(-1);
        xAxis.setPosition(com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM);
        int size = config.getBarEntries().size();
        int i = 10;
        if (size > 0) {
            if (size == 1) {
                java.util.List<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData>> barEntries = config.getBarEntries();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : barEntries) {
                    if (!((java.util.List) obj).isEmpty()) {
                        arrayList2.add(obj);
                    }
                }
                java.util.ArrayList<java.util.List> arrayList3 = arrayList2;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                for (java.util.List list : arrayList3) {
                    java.util.List list2 = list;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    java.util.Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(((powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData) it.next()).createBarEntry());
                    }
                    java.util.ArrayList arrayList6 = arrayList5;
                    powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData barChartEntryData = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData) kotlin.collections.CollectionsKt.firstOrNull(list);
                    com.github.mikephil.charting.data.BarEntry barEntryCreateBarEntry = barChartEntryData == null ? null : barChartEntryData.createBarEntry();
                    if (barEntryCreateBarEntry != null && barEntryCreateBarEntry.isStacked()) {
                        barDataSet = new com.github.mikephil.charting.data.BarDataSet(arrayList6, "");
                        android.content.Context context2 = this$0.getContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(context2);
                        android.content.Context context3 = this$0.getContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(context3);
                        barDataSet.setColors(androidx.core.content.ContextCompat.getColor(context2, powerwatch.matrix.com.pwgen2android.R.color.white), androidx.core.content.ContextCompat.getColor(context3, powerwatch.matrix.com.pwgen2android.R.color.yellow));
                    } else {
                        boolean multipleColors = config.getMultipleColors();
                        android.content.Context context4 = this$0.getContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(context4);
                        barDataSet = (com.github.mikephil.charting.data.BarDataSet) new powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalsBarDataSet(multipleColors, context4, arrayList6, config.getGoalThreshold().getMin(), config.getGoalThreshold().getMax(), config.getBarColors());
                    }
                    arrayList4.add(barDataSet);
                }
                arrayList = arrayList4;
            } else {
                java.util.List<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData>> barEntries2 = config.getBarEntries();
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                for (java.lang.Object obj2 : barEntries2) {
                    if (!((java.util.List) obj2).isEmpty()) {
                        arrayList7.add(obj2);
                    }
                }
                java.util.ArrayList arrayList8 = arrayList7;
                java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList8, 10));
                int i2 = 0;
                for (java.lang.Object obj3 : arrayList8) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    java.util.List list3 = (java.util.List) obj3;
                    java.util.ArrayList arrayList10 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, i));
                    java.util.Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList10.add(((powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData) it2.next()).createBarEntry());
                    }
                    com.github.mikephil.charting.data.BarDataSet barDataSet2 = new com.github.mikephil.charting.data.BarDataSet(arrayList10, "");
                    android.content.Context context5 = this$0.getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(context5);
                    java.util.List<java.lang.Integer> barColors = config.getBarColors();
                    if (i2 < 0 || i2 > kotlin.collections.CollectionsKt.getLastIndex(barColors)) {
                        android.content.Context context6 = this$0.getContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(context6);
                        numValueOf = java.lang.Integer.valueOf(androidx.core.content.ContextCompat.getColor(context6, powerwatch.matrix.com.pwgen2android.R.color.white));
                    } else {
                        numValueOf = barColors.get(i2);
                    }
                    barDataSet2.setColor(androidx.core.content.ContextCompat.getColor(context5, numValueOf.intValue()));
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    arrayList9.add(barDataSet2);
                    i2 = i3;
                    i = 10;
                }
                arrayList = arrayList9;
            }
            barData = new com.github.mikephil.charting.data.BarData(arrayList);
        } else {
            barData = null;
        }
        axisRight.setAxisMinimum(0.0f);
        if (barData != null) {
            barData.setBarWidth(0.93f);
            barData.setHighlightEnabled(false);
            barChart.setData(barData);
            java.lang.Iterable dataSets2 = ((com.github.mikephil.charting.data.BarData) barChart.getData()).getDataSets();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dataSets2, "chart.data.dataSets");
            java.util.Iterator it3 = dataSets2.iterator();
            while (it3.hasNext()) {
                ((com.github.mikephil.charting.interfaces.datasets.IBarDataSet) it3.next()).setDrawValues(false);
            }
            java.util.List<T> dataSets3 = barData.getDataSets();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dataSets3, "barData.dataSets");
            xAxis.setLabelCount(((com.github.mikephil.charting.interfaces.datasets.IBarDataSet) kotlin.collections.CollectionsKt.first((java.util.List) dataSets3)).getEntryCount());
        }
        if (config.getYLinesEnabled()) {
            axisRight.setDrawGridLines(true);
            axisRight.setEnabled(true);
            axisRight.setLabelCount(4);
            axisRight.setTextColor(-7829368);
            axisRight.setGridColor(-7829368);
            axisRight.setGridLineWidth(0.3f);
            axisRight.setDrawLabels(true);
            axisRight.setDrawLimitLinesBehindData(true);
            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
        }
        barChart.setData(barData);
        if (config.getMode() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY) {
            barChart.getXAxis().setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"12A", "", "", "3", "", "", "6", "", "", "9", "", "", "12P", "", "", "3", "", "", "6", "", "", "9", "", ""})));
            if (barData != null) {
                barData.setBarWidth(0.75f);
            }
        } else if (config.getMode() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK) {
            xAxis.setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.weekDaysByLocale$default(new java.text.DateFormatSymbols(), null, 1, null)));
            com.github.mikephil.charting.data.BarData barData2 = (com.github.mikephil.charting.data.BarData) barChart.getData();
            if (barData2 != null && (dataSets = barData2.getDataSets()) != null) {
                for (com.github.mikephil.charting.interfaces.datasets.IBarDataSet iBarDataSet : dataSets) {
                    iBarDataSet.setDrawValues(true);
                    iBarDataSet.setValueTextSize(10.0f);
                    iBarDataSet.setValueTextColor(-1);
                }
                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
            }
        } else {
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            if (barChart.getData() != null) {
                int entryCount = ((com.github.mikephil.charting.interfaces.datasets.IBarDataSet) ((com.github.mikephil.charting.data.BarData) barChart.getData()).getDataSets().get(0)).getEntryCount();
                int i4 = 1;
                if (1 <= entryCount) {
                    while (true) {
                        int i5 = i4 + 1;
                        arrayList11.add((i4 == 3 || i4 == 10 || i4 == 17 || i4 == 24) ? java.lang.String.valueOf(i4) : "");
                        if (i4 == entryCount) {
                            break;
                        } else {
                            i4 = i5;
                        }
                    }
                }
            }
            barChart.getXAxis().setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(arrayList11));
            if (barData != null) {
                barData.setBarWidth(0.75f);
            }
            axisRight.setGridLineWidth(0.3f);
        }
        axisLeft.setAxisMaximum(config.getYMaxValue() * 1.07f);
        axisRight.setAxisMaximum(config.getYMaxValue() * 1.07f);
        axisLeft.setAxisMinimum(0.0f);
        axisRight.setAxisMinimum(0.0f);
        axisLeft.getLimitLines().clear();
        axisRight.getLimitLines().clear();
        com.github.mikephil.charting.components.LimitLine limitLine = new com.github.mikephil.charting.components.LimitLine(axisLeft.getAxisMinimum());
        limitLine.setLineColor(-1);
        limitLine.setTextColor(-7829368);
        limitLine.setLineWidth(1.5f);
        kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
        axisLeft.addLimitLine(limitLine);
        java.util.Iterator<T> it4 = config.getLimitLines().iterator();
        while (it4.hasNext()) {
            com.github.mikephil.charting.components.LimitLine limitLine2 = new com.github.mikephil.charting.components.LimitLine(((powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData) it4.next()).getValue());
            android.content.Context context7 = this$0.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context7);
            java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) config.getBarColors());
            int color = androidx.core.content.ContextCompat.getColor(context7, num == null ? powerwatch.matrix.com.pwgen2android.R.color.grey : num.intValue());
            limitLine2.setLineColor(color);
            limitLine2.setLabelPosition(com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP);
            android.content.Context context8 = this$0.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context8);
            limitLine2.setLabel(context8.getString(powerwatch.matrix.com.pwgen2android.R.string.goal));
            limitLine2.setLineWidth(2.0f);
            limitLine2.setTextColor(color);
            limitLine2.setTextSize(12.0f);
            kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
            axisRight.addLimitLine(limitLine2);
        }
        barChart.invalidate();
        if (config.getPerformAnimation()) {
            barChart.animateY(com.baidu.mapapi.UIMsg.d_ResultType.SHORT_URL, com.github.mikephil.charting.animation.Easing.EasingOption.EaseOutBack);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment
    public void setConfig(java.lang.Object config) {
        if (!(config instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig)) {
            throw new java.lang.IllegalArgumentException("Wrong config type for bar chart provided!!!");
        }
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putParcelable("pedometerConfig", (android.os.Parcelable) config);
        }
        android.view.View view = getView();
        if (view != null && !kotlin.jvm.internal.Intrinsics.areEqual(config, this.currentConfig)) {
            init((powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig) config, view);
        }
        this.currentConfig = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig) config;
    }

    /* JADX INFO: compiled from: BarChartFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\u0006"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;", "config", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartFragment newInstance$default(powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartFragment.Companion companion, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = null;
            }
            return companion.newInstance(obj);
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartFragment newInstance(java.lang.Object config) {
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartFragment barChartFragment = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            if (config instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig) {
                bundle.putParcelable("pedometerConfig", (android.os.Parcelable) config);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            barChartFragment.setArguments(bundle);
            return barChartFragment;
        }
    }
}
