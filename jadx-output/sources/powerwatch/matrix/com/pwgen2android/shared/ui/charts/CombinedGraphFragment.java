package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: CombinedGraphFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0003J \u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J&\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u001dH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedGraphFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;", "()V", "combinedChart", "Lcom/github/mikephil/charting/charts/CombinedChart;", "currentConfig", "stubView", "Landroid/view/ViewStub;", "buildHRVDataSet", "Lcom/github/mikephil/charting/data/LineDataSet;", "context", "Landroid/content/Context;", "hrvValues", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LineChartEntryData;", "init", "", "config", "rootView", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setConfig", "", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CombinedGraphFragment extends powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig> {
    private static final java.lang.String CANDLES_CONFIG_PARAM = "candlesConfig";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedGraphFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedGraphFragment.Companion(null);
    private com.github.mikephil.charting.charts.CombinedChart combinedChart;
    private powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig currentConfig;
    private android.view.ViewStub stubView;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedGraphFragment newInstance(java.lang.Object obj) {
        return INSTANCE.newInstance(obj);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View rootView = inflater.inflate(powerwatch.matrix.com.pwgen2android.R.layout.fragment_combined, container, false);
        android.os.Bundle arguments = getArguments();
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig combinedChartConfig = arguments == null ? null : (powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig) arguments.getParcelable(CANDLES_CONFIG_PARAM);
        this.combinedChart = (com.github.mikephil.charting.charts.CombinedChart) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.combined_chart);
        android.view.ViewStub viewStub = rootView == null ? null : (android.view.ViewStub) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.stub_layout);
        this.stubView = viewStub;
        if (viewStub != null) {
            viewStub.setLayoutResource(powerwatch.matrix.com.pwgen2android.R.layout.bad_placement_layout);
        }
        android.view.ViewStub viewStub2 = this.stubView;
        if (viewStub2 != null) {
            viewStub2.inflate();
        }
        android.view.View viewFindViewById = rootView != null ? rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.why_label) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.charts.-$$Lambda$CombinedGraphFragment$bakr4ops0zY3WaAb4RCjrIjd4bY
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedGraphFragment.m3454onCreateView$lambda0(this.f$0, view);
                }
            });
        }
        if (combinedChartConfig != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
            init(combinedChartConfig, rootView);
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m3454onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedGraphFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialog badPlacementDialogNewInstance = powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialog.INSTANCE.newInstance();
        badPlacementDialogNewInstance.show(this$0.getParentFragmentManager(), badPlacementDialogNewInstance.getClass().getSimpleName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment
    public void init(final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig config, final android.view.View rootView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.charts.-$$Lambda$CombinedGraphFragment$cb-b2Q1R7IoKj7AG6WnwoiVmfGo
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedGraphFragment.m3451init$lambda17(this.f$0, rootView, config);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:64:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01fd  */
    /* JADX INFO: renamed from: init$lambda-17, reason: not valid java name */
    public static final void m3451init$lambda17(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedGraphFragment this$0, android.view.View rootView, powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig config) {
        android.view.ViewStub viewStub;
        int entryCount;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "$rootView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "$config");
        if (this$0.getContext() == null) {
            return;
        }
        com.github.mikephil.charting.charts.CombinedChart combinedChart = this$0.combinedChart;
        com.github.mikephil.charting.components.Description description = combinedChart == null ? null : combinedChart.getDescription();
        if (description != null) {
            description.setEnabled(false);
        }
        if (combinedChart != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ChartExtensionsKt.hideBackgroundGridLines(combinedChart);
            powerwatch.matrix.com.pwgen2android.shared.extensions.ChartExtensionsKt.removeTouch(combinedChart);
            combinedChart.setDrawOrder(new com.github.mikephil.charting.charts.CombinedChart.DrawOrder[]{com.github.mikephil.charting.charts.CombinedChart.DrawOrder.CANDLE, com.github.mikephil.charting.charts.CombinedChart.DrawOrder.LINE});
            com.github.mikephil.charting.components.YAxis axisLeft = combinedChart.getAxisLeft();
            com.github.mikephil.charting.components.YAxis axisRight = combinedChart.getAxisRight();
            axisRight.enableGridDashedLine(12.0f, 5.0f, 0.0f);
            axisRight.setDrawLabels(true);
            axisLeft.setDrawGridLines(false);
            axisRight.setDrawGridLines(true);
            com.github.mikephil.charting.components.XAxis xAxis = combinedChart.getXAxis();
            xAxis.setPosition(com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM);
            xAxis.setDrawGridLines(false);
            xAxis.setDrawLabels(true);
            xAxis.setTextColor(-1);
            axisRight.setTextColor(-1);
            axisLeft.setDrawLabels(false);
            xAxis.setGranularity(1.0f);
            xAxis.setGranularityEnabled(true);
            xAxis.setAvoidFirstLastClipping(true);
            combinedChart.getLegend().setEnabled(false);
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> maxLineChartData = config.getMaxLineChartData();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(maxLineChartData, 10));
            java.util.Iterator<T> it = maxLineChartData.iterator();
            while (it.hasNext()) {
                arrayList.add(((powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData) it.next()).createLineEntry());
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> minLineChartData = config.getMinLineChartData();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(minLineChartData, 10));
            java.util.Iterator<T> it2 = minLineChartData.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData) it2.next()).createLineEntry());
            }
            java.util.ArrayList arrayList4 = arrayList3;
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> lineChartConfig = config.getLineChartConfig();
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(lineChartConfig, 10));
            java.util.Iterator<T> it3 = lineChartConfig.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData) it3.next()).createLineEntry());
            }
            java.util.ArrayList arrayList6 = arrayList5;
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData> entries = config.getCandleChartConfig().getEntries();
            java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entries, 10));
            java.util.Iterator<T> it4 = entries.iterator();
            while (it4.hasNext()) {
                arrayList7.add(((powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData) it4.next()).createCandleEntry());
            }
            java.util.ArrayList arrayList8 = arrayList7;
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData> entries2 = config.getCandleChartConfig().getEntries();
            java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entries2, 10));
            int i = 0;
            for (java.lang.Object obj : entries2) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData candleChartEntryData = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData) obj;
                arrayList9.add(new com.github.mikephil.charting.data.Entry(candleChartEntryData.getX(), candleChartEntryData.getMalformed() ? config.getChartMaximum() : 0.0f));
                i = i2;
            }
            java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) arrayList9);
            android.content.Context context = this$0.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context);
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.UtilsKt.reformatDataForBadPlacement(mutableList, context);
            android.content.Context context2 = this$0.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context2);
            com.github.mikephil.charting.data.LineDataSet lineDataSetBuildMalformedDataSet = powerwatch.matrix.com.pwgen2android.shared.ui.charts.UtilsKt.buildMalformedDataSet(context2, mutableList);
            android.content.Context context3 = this$0.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context3);
            com.github.mikephil.charting.data.LineDataSet lineDataSetBuildHRVDataSet = this$0.buildHRVDataSet(context3, config.getHrvValues());
            if (lineDataSetBuildMalformedDataSet != null) {
                java.util.List list = mutableList;
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    java.util.Iterator it5 = list.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            if (!(((com.github.mikephil.charting.data.Entry) it5.next()).getY() == 0.0f)) {
                                z = false;
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = true;
                    break;
                }
                if (z) {
                    viewStub = this$0.stubView;
                    if (viewStub != null) {
                        viewStub.setVisibility(4);
                    }
                } else {
                    android.view.ViewStub viewStub2 = this$0.stubView;
                    if (viewStub2 != null) {
                        viewStub2.setVisibility(0);
                    }
                }
            } else {
                viewStub = this$0.stubView;
                if (viewStub != null) {
                    viewStub.setVisibility(4);
                }
            }
            com.github.mikephil.charting.data.LineDataSet lineDataSet = new com.github.mikephil.charting.data.LineDataSet(arrayList2, "TopMaxArea");
            com.github.mikephil.charting.data.LineDataSet lineDataSet2 = new com.github.mikephil.charting.data.LineDataSet(arrayList4, "TopMinArea");
            com.github.mikephil.charting.data.LineDataSet lineDataSet3 = new com.github.mikephil.charting.data.LineDataSet(arrayList6, "TopArea");
            lineDataSet3.setLineWidth(1.0f);
            lineDataSet3.setDrawFilled(false);
            lineDataSet3.setDrawCircles(false);
            lineDataSet3.setDrawCircleHole(false);
            lineDataSet3.setAxisDependency(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT);
            lineDataSet3.setDrawValues(false);
            lineDataSet3.setMode(com.github.mikephil.charting.data.LineDataSet.Mode.HORIZONTAL_BEZIER);
            android.content.Context context4 = this$0.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context4);
            lineDataSet3.setColor(androidx.core.content.ContextCompat.getColor(context4, powerwatch.matrix.com.pwgen2android.R.color.white));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            lineDataSet.setLineWidth(1.0f);
            lineDataSet.setDrawFilled(true);
            lineDataSet.setDrawCircles(false);
            lineDataSet.setDrawCircleHole(false);
            lineDataSet.setAxisDependency(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT);
            lineDataSet.setDrawValues(false);
            lineDataSet.setMode(com.github.mikephil.charting.data.LineDataSet.Mode.HORIZONTAL_BEZIER);
            android.content.Context context5 = this$0.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context5);
            lineDataSet.setFillColor(androidx.core.content.ContextCompat.getColor(context5, powerwatch.matrix.com.pwgen2android.R.color.white));
            android.content.Context context6 = this$0.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context6);
            lineDataSet.setColor(androidx.core.content.ContextCompat.getColor(context6, powerwatch.matrix.com.pwgen2android.R.color.line_chart_white_line_color));
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            lineDataSet2.setLineWidth(1.0f);
            lineDataSet2.setDrawFilled(false);
            lineDataSet2.setDrawCircles(false);
            lineDataSet2.setDrawCircleHole(false);
            lineDataSet2.setAxisDependency(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT);
            lineDataSet2.setDrawValues(false);
            lineDataSet2.setMode(com.github.mikephil.charting.data.LineDataSet.Mode.HORIZONTAL_BEZIER);
            android.content.Context context7 = this$0.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context7);
            lineDataSet2.setColor(androidx.core.content.ContextCompat.getColor(context7, powerwatch.matrix.com.pwgen2android.R.color.line_chart_white_line_color));
            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
            com.github.mikephil.charting.data.CandleDataSet candleDataSet = new com.github.mikephil.charting.data.CandleDataSet(arrayList8, "");
            candleDataSet.setColor(android.graphics.Color.rgb(80, 80, 80));
            candleDataSet.setShadowColor(this$0.getResources().getColor(powerwatch.matrix.com.pwgen2android.R.color.cyan));
            candleDataSet.setShadowWidth(0.8f);
            candleDataSet.setDecreasingColor(this$0.getResources().getColor(config.getCandleChartConfig().getDecreasingColor()));
            candleDataSet.setDecreasingPaintStyle(android.graphics.Paint.Style.FILL);
            candleDataSet.setIncreasingColor(this$0.getResources().getColor(config.getCandleChartConfig().getIncreasingColor()));
            candleDataSet.setIncreasingPaintStyle(android.graphics.Paint.Style.FILL);
            candleDataSet.setNeutralColor(-3355444);
            candleDataSet.setDrawValues(false);
            com.github.mikephil.charting.data.CombinedData combinedData = new com.github.mikephil.charting.data.CombinedData();
            if (!arrayList8.isEmpty()) {
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                if (lineDataSetBuildMalformedDataSet != null) {
                    arrayList10.add(lineDataSetBuildMalformedDataSet);
                }
                if (lineDataSetBuildHRVDataSet != null) {
                    arrayList10.add(lineDataSetBuildHRVDataSet);
                }
                if ((!arrayList4.isEmpty()) && (!arrayList2.isEmpty())) {
                    lineDataSet.setFillFormatter(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.BoundaryFillFormatter(lineDataSet2));
                    arrayList10.add(lineDataSet2);
                    arrayList10.add(lineDataSet);
                }
                if (!arrayList6.isEmpty()) {
                    arrayList10.add(lineDataSet3);
                }
                if (!arrayList10.isEmpty()) {
                    combinedData.setData(new com.github.mikephil.charting.data.LineData((java.util.List<com.github.mikephil.charting.interfaces.datasets.ILineDataSet>) kotlin.collections.CollectionsKt.toList(arrayList10)));
                }
                combinedData.setData(new com.github.mikephil.charting.data.CandleData(candleDataSet));
                combinedChart.setData(combinedData);
                combinedChart.setMaxVisibleValueCount(combinedData.getEntryCount() + 1);
            } else {
                combinedChart.setData((com.github.mikephil.charting.data.CombinedData) null);
            }
            if (config.getCandleChartConfig().getMode() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY) {
                com.github.mikephil.charting.components.LegendEntry legendEntry = new com.github.mikephil.charting.components.LegendEntry();
                legendEntry.formColor = lineDataSet3.getColor();
                legendEntry.form = com.github.mikephil.charting.components.Legend.LegendForm.SQUARE;
                legendEntry.label = config.getLegendValues().get(0);
                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                com.github.mikephil.charting.components.LegendEntry legendEntry2 = new com.github.mikephil.charting.components.LegendEntry();
                legendEntry2.formColor = candleDataSet.getIncreasingColor();
                legendEntry2.form = com.github.mikephil.charting.components.Legend.LegendForm.SQUARE;
                legendEntry2.label = config.getLegendValues().get(1);
                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                combinedChart.getLegend().setCustom(new com.github.mikephil.charting.components.LegendEntry[]{legendEntry, legendEntry2});
                com.github.mikephil.charting.components.Legend legend = combinedChart.getLegend();
                legend.setEnabled(true);
                legend.setXOffset(20.0f);
                legend.setYOffset(-20.0f);
                legend.setOrientation(com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL);
                legend.setHorizontalAlignment(com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT);
                legend.setVerticalAlignment(com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP);
                legend.setDrawInside(true);
                legend.setTextColor(this$0.getResources().getColor(powerwatch.matrix.com.pwgen2android.R.color.white));
                kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                xAxis.setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"12A", "", "", "3", "", "", "6", "", "", "9", "", "", "12P", "", "", "3", "", "", "6", "", "", "9", "", ""})));
                xAxis.setLabelCount(24);
                combinedChart.setRenderer(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.CombinedChartAreaRenderer(combinedChart, combinedChart.getAnimator(), combinedChart.getViewPortHandler()));
            } else if (config.getCandleChartConfig().getMode() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK) {
                xAxis.setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.weekDaysByLocale$default(new java.text.DateFormatSymbols(), null, 1, null)));
                combinedChart.getXAxis().setAxisMinimum(0.0f);
                xAxis.setLabelCount(7);
                if (lineDataSetBuildHRVDataSet != null) {
                    combinedChart.setRenderer(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.CombinedChartAreaRenderer(combinedChart, combinedChart.getAnimator(), combinedChart.getViewPortHandler(), true, lineDataSetBuildHRVDataSet.getCircleRadius()));
                    android.content.Context context8 = this$0.getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(context8);
                    axisLeft.setTextColor(androidx.core.content.ContextCompat.getColor(context8, powerwatch.matrix.com.pwgen2android.R.color.hrv_color));
                    axisLeft.setDrawLabels(true);
                    kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                }
            } else {
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                if (combinedChart.getData() != null && 1 <= (entryCount = ((com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet) ((com.github.mikephil.charting.data.CombinedData) combinedChart.getData()).getDataSets().get(0)).getEntryCount())) {
                    int i3 = 1;
                    while (true) {
                        int i4 = i3 + 1;
                        arrayList11.add((i3 == 3 || i3 == 10 || i3 == 17 || i3 == 24) ? java.lang.String.valueOf(i3) : "");
                        if (i3 == entryCount) {
                            break;
                        } else {
                            i3 = i4;
                        }
                    }
                }
                if (lineDataSetBuildHRVDataSet != null) {
                    combinedChart.setRenderer(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.CombinedChartAreaRenderer(combinedChart, combinedChart.getAnimator(), combinedChart.getViewPortHandler(), true, lineDataSetBuildHRVDataSet.getCircleRadius()));
                    android.content.Context context9 = this$0.getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(context9);
                    axisLeft.setTextColor(androidx.core.content.ContextCompat.getColor(context9, powerwatch.matrix.com.pwgen2android.R.color.hrv_color));
                    axisLeft.setDrawLabels(true);
                    kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                }
                xAxis.setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(arrayList11));
                xAxis.setLabelCount(arrayList11.size());
            }
            axisRight.setAxisMinimum(config.getChartMinimum());
            axisLeft.setAxisMinimum(config.getChartMinimum());
            axisRight.setValueFormatter(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.YAxisValueFormatter(config.getValuesFormat(), config.getUseFloatYValues(), null, 4, null));
            axisRight.removeAllLimitLines();
            axisLeft.removeAllLimitLines();
            com.github.mikephil.charting.components.LimitLine limitLine = new com.github.mikephil.charting.components.LimitLine(config.getChartMinimum());
            limitLine.setLineColor(-1);
            limitLine.setTextColor(-7829368);
            limitLine.setLineWidth(1.5f);
            kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
            axisRight.addLimitLine(limitLine);
            com.github.mikephil.charting.components.LimitLine limitLine2 = new com.github.mikephil.charting.components.LimitLine(config.getChartMinimum());
            limitLine2.setLineColor(-1);
            limitLine2.setTextColor(-7829368);
            limitLine2.setLineWidth(1.5f);
            kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
            axisLeft.addLimitLine(limitLine2);
            android.content.Context context10 = this$0.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context10);
            combinedChart.setNoDataText(context10.getString(powerwatch.matrix.com.pwgen2android.R.string.no_chart_data_available));
            combinedChart.invalidate();
            if (config.getCandleChartConfig().getPerformAnimation()) {
                combinedChart.animateY(com.baidu.mapapi.UIMsg.d_ResultType.SHORT_URL, com.github.mikephil.charting.animation.Easing.EasingOption.EaseOutBack);
            }
        }
    }

    private final com.github.mikephil.charting.data.LineDataSet buildHRVDataSet(android.content.Context context, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> hrvValues) {
        boolean z;
        if (!hrvValues.isEmpty()) {
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> list = hrvValues;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData) it.next()).getY() > 0.0f) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (z) {
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                int i = 0;
                for (java.lang.Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData lineChartEntryData = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData) obj;
                    arrayList.add(new com.github.mikephil.charting.data.Entry(lineChartEntryData.getX(), lineChartEntryData.getY()));
                    i = i2;
                }
                java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) arrayList);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(java.lang.Integer.valueOf((((powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData) it2.next()).getY() > 0.0f ? 1 : (((powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData) it2.next()).getY() == 0.0f ? 0 : -1)) == 0 ? androidx.core.content.ContextCompat.getColor(context, android.R.color.transparent) : androidx.core.content.ContextCompat.getColor(context, powerwatch.matrix.com.pwgen2android.R.color.hrv_color)));
                }
                java.util.ArrayList arrayList3 = arrayList2;
                com.github.mikephil.charting.data.LineDataSet lineDataSet = new com.github.mikephil.charting.data.LineDataSet(mutableList, "Bad placement");
                lineDataSet.setColor(androidx.core.content.ContextCompat.getColor(context, android.R.color.transparent));
                lineDataSet.setDrawFilled(false);
                lineDataSet.setDrawValues(true);
                lineDataSet.setValueTextColors(arrayList3);
                lineDataSet.setValueTextSize(8.0f);
                lineDataSet.setCircleRadius(10.0f);
                lineDataSet.setDrawCircles(true);
                lineDataSet.setCircleColors(arrayList3);
                lineDataSet.setDrawCircleHole(true);
                lineDataSet.setCircleHoleRadius(8.0f);
                lineDataSet.setCircleColorHole(com.github.mikephil.charting.utils.ColorTemplate.COLOR_NONE);
                lineDataSet.setAxisDependency(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT);
                lineDataSet.setValueFormatter(new com.github.mikephil.charting.formatter.IValueFormatter() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.charts.-$$Lambda$CombinedGraphFragment$Mbn-7f7ID7iME5zpLuvwgZEVsIo
                    @Override // com.github.mikephil.charting.formatter.IValueFormatter
                    public final java.lang.String getFormattedValue(float f, com.github.mikephil.charting.data.Entry entry, int i3, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
                        return powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedGraphFragment.m3450buildHRVDataSet$lambda22$lambda21(f, entry, i3, viewPortHandler);
                    }
                });
                return lineDataSet;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: buildHRVDataSet$lambda-22$lambda-21, reason: not valid java name */
    public static final java.lang.String m3450buildHRVDataSet$lambda22$lambda21(float f, com.github.mikephil.charting.data.Entry entry, int i, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        return java.lang.String.valueOf((int) f);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment
    public void setConfig(java.lang.Object config) {
        if (!(config instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig)) {
            throw new java.lang.IllegalArgumentException("Wrong config type for candle chart provided!!!");
        }
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putParcelable(CANDLES_CONFIG_PARAM, (android.os.Parcelable) config);
        }
        android.view.View view = getView();
        if (view != null && !kotlin.jvm.internal.Intrinsics.areEqual(config, this.currentConfig)) {
            init((powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig) config, view);
        }
        this.currentConfig = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig) config;
    }

    /* JADX INFO: compiled from: CombinedGraphFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedGraphFragment$Companion;", "", "()V", "CANDLES_CONFIG_PARAM", "", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedGraphFragment;", "config", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedGraphFragment newInstance$default(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedGraphFragment.Companion companion, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = null;
            }
            return companion.newInstance(obj);
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedGraphFragment newInstance(java.lang.Object config) {
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedGraphFragment combinedGraphFragment = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedGraphFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            if (config instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig) {
                bundle.putParcelable(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedGraphFragment.CANDLES_CONFIG_PARAM, (android.os.Parcelable) config);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            combinedGraphFragment.setArguments(bundle);
            return combinedGraphFragment;
        }
    }
}
