package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: CombinedBarChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0018H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;", "()V", "combinedChart", "Lcom/github/mikephil/charting/charts/CombinedChart;", "currentConfig", "stubView", "Landroid/view/ViewStub;", "extractMalformedData", "Lcom/github/mikephil/charting/data/LineDataSet;", "config", "init", "", "rootView", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setConfig", "", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CombinedBarChartFragment extends powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> {
    private static final java.lang.String BAR_CONFIG_PARAM = "barConfig";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartFragment.Companion(null);
    private com.github.mikephil.charting.charts.CombinedChart combinedChart;
    private powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig currentConfig;
    private android.view.ViewStub stubView;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartFragment newInstance(java.lang.Object obj) {
        return INSTANCE.newInstance(obj);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View rootView = inflater.inflate(powerwatch.matrix.com.pwgen2android.R.layout.fragment_bar_combined, container, false);
        android.os.Bundle arguments = getArguments();
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig combinedBarChartConfig = arguments == null ? null : (powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig) arguments.getParcelable(BAR_CONFIG_PARAM);
        this.combinedChart = (com.github.mikephil.charting.charts.CombinedChart) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.combined_bar_chart);
        android.view.ViewStub viewStub = rootView == null ? null : (android.view.ViewStub) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.stub_layout);
        this.stubView = viewStub;
        if (viewStub != null) {
            viewStub.setLayoutResource(powerwatch.matrix.com.pwgen2android.R.layout.bad_placement_layout);
        }
        android.view.ViewStub viewStub2 = this.stubView;
        if (viewStub2 != null) {
            viewStub2.inflate();
        }
        android.view.ViewStub viewStub3 = this.stubView;
        if (viewStub3 != null) {
            viewStub3.setVisibility(4);
        }
        android.view.View viewFindViewById = rootView != null ? rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.why_label) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.charts.-$$Lambda$CombinedBarChartFragment$kMR3xIKZPKR7d0hmoQsehU09ChY
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartFragment.m3449onCreateView$lambda0(this.f$0, view);
                }
            });
        }
        if (combinedBarChartConfig != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
            init(combinedBarChartConfig, rootView);
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m3449onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialog badPlacementDialogNewInstance = powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialog.INSTANCE.newInstance();
        badPlacementDialogNewInstance.show(this$0.getParentFragmentManager(), badPlacementDialogNewInstance.getClass().getSimpleName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment
    public void init(final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig config, android.view.View rootView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.charts.-$$Lambda$CombinedBarChartFragment$zGfX9uIwl5rZxLBkVqSy9_1HO6w
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartFragment.m3448init$lambda17(this.f$0, config);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-17, reason: not valid java name */
    public static final void m3448init$lambda17(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartFragment this$0, powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig config) {
        float f;
        com.github.mikephil.charting.data.BarData barData;
        boolean z;
        java.util.ArrayList arrayList;
        java.lang.Integer numValueOf;
        com.github.mikephil.charting.data.BaseDataSet barDataSet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
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
            combinedChart.setExtraOffsets(0.0f, 0.0f, 0.0f, 0.0f);
            combinedChart.setAutoScaleMinMaxEnabled(true);
            combinedChart.getDescription().setEnabled(false);
            combinedChart.setDrawValueAboveBar(true);
            combinedChart.getLegend().setEnabled(false);
            powerwatch.matrix.com.pwgen2android.shared.extensions.ChartExtensionsKt.hideBackgroundGridLines(combinedChart);
            powerwatch.matrix.com.pwgen2android.shared.extensions.ChartExtensionsKt.removeTouch(combinedChart);
            combinedChart.setDrawOrder(new com.github.mikephil.charting.charts.CombinedChart.DrawOrder[]{com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BAR, com.github.mikephil.charting.charts.CombinedChart.DrawOrder.LINE});
            android.content.Context context = combinedChart.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context);
            combinedChart.setNoDataText(context.getString(powerwatch.matrix.com.pwgen2android.R.string.no_chart_data_available));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            com.github.mikephil.charting.components.XAxis xAxis = combinedChart.getXAxis();
            com.github.mikephil.charting.components.YAxis axisLeft = combinedChart.getAxisLeft();
            com.github.mikephil.charting.components.YAxis axisRight = combinedChart.getAxisRight();
            axisRight.enableGridDashedLine(12.0f, 5.0f, 0.0f);
            xAxis.setTextColor(-1);
            xAxis.setPosition(com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM);
            xAxis.setDrawGridLines(false);
            int size = config.getBarConfig().getBarEntries().size();
            int i = 10;
            if (size > 0) {
                if (size == 1) {
                    java.util.List<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData>> barEntries = config.getBarConfig().getBarEntries();
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
                            boolean multipleColors = config.getBarConfig().getMultipleColors();
                            android.content.Context context4 = this$0.getContext();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(context4);
                            barDataSet = (com.github.mikephil.charting.data.BarDataSet) new powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalsBarDataSet(multipleColors, context4, arrayList6, config.getBarConfig().getGoalThreshold().getMin(), config.getBarConfig().getGoalThreshold().getMax(), config.getBarConfig().getBarColors());
                        }
                        arrayList4.add(barDataSet);
                    }
                    arrayList = arrayList4;
                } else {
                    java.util.List<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData>> barEntries2 = config.getBarConfig().getBarEntries();
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
                        java.util.List<java.lang.Integer> barColors = config.getBarConfig().getBarColors();
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
                f = 0.0f;
            } else {
                f = 0.0f;
                barData = null;
            }
            axisRight.setAxisMinimum(f);
            if (barData != null) {
                barData.setBarWidth(0.93f);
                barData.setHighlightEnabled(false);
                java.util.List<T> dataSets = barData.getDataSets();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dataSets, "barData.dataSets");
                xAxis.setLabelCount(((com.github.mikephil.charting.interfaces.datasets.IBarDataSet) kotlin.collections.CollectionsKt.first((java.util.List) dataSets)).getEntryCount());
                combinedChart.getLegend().setEnabled(false);
                com.github.mikephil.charting.data.CombinedData combinedData = new com.github.mikephil.charting.data.CombinedData();
                com.github.mikephil.charting.data.LineDataSet lineDataSetExtractMalformedData = this$0.extractMalformedData(config);
                if (lineDataSetExtractMalformedData != null) {
                    z = true;
                    combinedData.setData(new com.github.mikephil.charting.data.LineData(lineDataSetExtractMalformedData));
                } else {
                    z = true;
                }
                combinedData.setData(barData);
                if (config.getBarConfig().getYLinesEnabled()) {
                    axisRight.setDrawGridLines(z);
                    axisRight.setEnabled(z);
                    axisRight.setLabelCount(4);
                    axisRight.setTextColor(-7829368);
                    axisRight.setGridColor(-7829368);
                    axisRight.setGridLineWidth(0.3f);
                    axisRight.setDrawLabels(z);
                    axisRight.setDrawLimitLinesBehindData(z);
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                }
                combinedChart.setData(combinedData);
                java.lang.Iterable dataSets2 = ((com.github.mikephil.charting.data.CombinedData) combinedChart.getData()).getDataSets();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dataSets2, "chart.data.dataSets");
                java.util.Iterator it3 = dataSets2.iterator();
                while (it3.hasNext()) {
                    ((com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet) it3.next()).setDrawValues(false);
                }
                combinedChart.setMaxVisibleValueCount(combinedData.getEntryCount() + 1);
            } else {
                combinedChart.setData((com.github.mikephil.charting.data.CombinedData) null);
            }
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig barConfig = config.getBarConfig();
            if (barConfig.getMode() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY) {
                combinedChart.getXAxis().setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"12A", "", "", "3", "", "", "6", "", "", "9", "", "", "12P", "", "", "3", "", "", "6", "", "", "9", "", ""})));
                if (barData != null) {
                    barData.setBarWidth(0.75f);
                }
            } else if (barConfig.getMode() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK) {
                xAxis.setGranularity(1.0f);
                xAxis.setGranularityEnabled(true);
                xAxis.setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.weekDaysByLocale$default(new java.text.DateFormatSymbols(), null, 1, null)));
                com.github.mikephil.charting.data.CombinedData combinedData2 = (com.github.mikephil.charting.data.CombinedData) combinedChart.getData();
                java.lang.Iterable dataSets3 = combinedData2 == null ? null : combinedData2.getDataSets();
                if (dataSets3 != null) {
                    java.util.ArrayList<com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet> arrayList11 = new java.util.ArrayList();
                    for (java.lang.Object obj4 : dataSets3) {
                        if (!(((com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet) obj4) instanceof com.github.mikephil.charting.data.LineDataSet)) {
                            arrayList11.add(obj4);
                        }
                    }
                    for (com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet : arrayList11) {
                        iBarLineScatterCandleBubbleDataSet.setDrawValues(true);
                        iBarLineScatterCandleBubbleDataSet.setValueTextSize(10.0f);
                        iBarLineScatterCandleBubbleDataSet.setValueTextColor(-1);
                    }
                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                }
            } else {
                java.util.ArrayList arrayList12 = new java.util.ArrayList();
                if (combinedChart.getData() != null) {
                    int entryCount = ((com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet) ((com.github.mikephil.charting.data.CombinedData) combinedChart.getData()).getDataSets().get(0)).getEntryCount();
                    int i4 = 1;
                    if (1 <= entryCount) {
                        while (true) {
                            int i5 = i4 + 1;
                            arrayList12.add((i4 == 3 || i4 == 10 || i4 == 17 || i4 == 24) ? java.lang.String.valueOf(i4) : "");
                            if (i4 == entryCount) {
                                break;
                            } else {
                                i4 = i5;
                            }
                        }
                    }
                }
                combinedChart.getXAxis().setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(arrayList12));
                if (barData != null) {
                    barData.setBarWidth(0.75f);
                }
                axisRight.setGridLineWidth(0.3f);
            }
            axisLeft.setAxisMaximum(barConfig.getYMaxValue() * 1.07f);
            axisRight.setAxisMaximum(barConfig.getYMaxValue() * 1.07f);
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
            java.util.Iterator<T> it4 = barConfig.getLimitLines().iterator();
            while (it4.hasNext()) {
                com.github.mikephil.charting.components.LimitLine limitLine2 = new com.github.mikephil.charting.components.LimitLine(((powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData) it4.next()).getValue());
                android.content.Context context7 = this$0.getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNull(context7);
                java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) barConfig.getBarColors());
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
            combinedChart.invalidate();
            if (barConfig.getPerformAnimation()) {
                combinedChart.animateY(com.baidu.mapapi.UIMsg.d_ResultType.SHORT_URL, com.github.mikephil.charting.animation.Easing.EasingOption.EaseOutBack);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2  */
    private final com.github.mikephil.charting.data.LineDataSet extractMalformedData(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig config) {
        boolean z;
        java.lang.Object next;
        java.util.List mutableList;
        android.view.ViewStub viewStub;
        java.util.Iterator<T> it = config.getBarConfig().getBarEntries().iterator();
        do {
            z = true;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!((java.util.List) next).isEmpty()));
        java.util.List list = (java.util.List) next;
        if (list == null) {
            mutableList = null;
        } else {
            java.util.List list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            int i = 0;
            for (java.lang.Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData barChartEntryData = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData) obj;
                arrayList.add(new com.github.mikephil.charting.data.Entry(barChartEntryData.getXValue(), barChartEntryData.getMalformed() ? config.getChartMaximum() : 0.0f));
                i = i2;
            }
            mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) arrayList);
        }
        if (mutableList == null) {
            return null;
        }
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.UtilsKt.reformatDataForBadPlacement(mutableList, context);
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context2);
        com.github.mikephil.charting.data.LineDataSet lineDataSetBuildMalformedDataSet = powerwatch.matrix.com.pwgen2android.shared.ui.charts.UtilsKt.buildMalformedDataSet(context2, mutableList);
        if (lineDataSetBuildMalformedDataSet != null) {
            java.util.List list3 = mutableList;
            if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
                java.util.Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    if (!(((com.github.mikephil.charting.data.Entry) it2.next()).getY() == 0.0f)) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                viewStub = this.stubView;
                if (viewStub != null) {
                    viewStub.setVisibility(4);
                }
            } else {
                android.view.ViewStub viewStub2 = this.stubView;
                if (viewStub2 != null) {
                    viewStub2.setVisibility(0);
                }
            }
        } else {
            viewStub = this.stubView;
            if (viewStub != null) {
                viewStub.setVisibility(4);
            }
        }
        return lineDataSetBuildMalformedDataSet;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment
    public void setConfig(java.lang.Object config) {
        if (!(config instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig)) {
            throw new java.lang.IllegalArgumentException("Wrong config type for candle chart provided!!!");
        }
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putParcelable(BAR_CONFIG_PARAM, (android.os.Parcelable) config);
        }
        android.view.View view = getView();
        if (view != null && !kotlin.jvm.internal.Intrinsics.areEqual(config, this.currentConfig)) {
            init((powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig) config, view);
        }
        this.currentConfig = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig) config;
    }

    /* JADX INFO: compiled from: CombinedBarChartFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartFragment$Companion;", "", "()V", "BAR_CONFIG_PARAM", "", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartFragment;", "config", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartFragment newInstance$default(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartFragment.Companion companion, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = null;
            }
            return companion.newInstance(obj);
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartFragment newInstance(java.lang.Object config) {
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartFragment combinedBarChartFragment = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            if (config instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig) {
                bundle.putParcelable(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartFragment.BAR_CONFIG_PARAM, (android.os.Parcelable) config);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            combinedBarChartFragment.setArguments(bundle);
            return combinedBarChartFragment;
        }
    }
}
