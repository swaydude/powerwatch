package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: CubicLineChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J&\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u001cH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;", "()V", "chartContainer", "Landroid/widget/LinearLayout;", "currentConfig", "lineChart", "Lcom/github/mikephil/charting/charts/LineChart;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "getRxBus", "()Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "rxBus$delegate", "Lkotlin/Lazy;", "init", "", "config", "rootView", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setConfig", "", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CubicLineChartFragment extends powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig> {
    private static final java.lang.String CHART_CONFIG = "cubicLineChartConfig";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment.Companion(null);
    private android.widget.LinearLayout chartContainer;
    private powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig currentConfig;
    private com.github.mikephil.charting.charts.LineChart lineChart;

    /* JADX INFO: renamed from: rxBus$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy rxBus;

    /* JADX INFO: compiled from: CubicLineChartFragment.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.valuesCustom().length];
            iArr[powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY.ordinal()] = 1;
            iArr[powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment
    public void _$_clearFindViewByIdCache() {
    }

    public CubicLineChartFragment() {
        final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment cubicLineChartFragment = this;
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) null;
        this.rxBus = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.RxBus>() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.shared.RxBus] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.RxBus invoke() {
                android.content.ComponentCallbacks componentCallbacks = cubicLineChartFragment;
                return org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(componentCallbacks).getRootScope().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.shared.RxBus getRxBus() {
        return (powerwatch.matrix.com.pwgen2android.shared.RxBus) this.rxBus.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewInflate = inflater.inflate(powerwatch.matrix.com.pwgen2android.R.layout.fragment_cubic_chart, container, false);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewInflate);
        android.os.Bundle arguments = getArguments();
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig cubicLineChartConfig = arguments == null ? null : (powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig) arguments.getParcelable(CHART_CONFIG);
        this.lineChart = (com.github.mikephil.charting.charts.LineChart) viewInflate.findViewById(powerwatch.matrix.com.pwgen2android.R.id.line_chart);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewInflate.findViewById(powerwatch.matrix.com.pwgen2android.R.id.chart_container);
        this.chartContainer = linearLayout;
        kotlin.jvm.internal.Intrinsics.checkNotNull(linearLayout);
        linearLayout.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.charts.-$$Lambda$CubicLineChartFragment$0yIZylhKtPfi0WksjCmYNUrvjBU
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment.m3458onCreateView$lambda0(this.f$0, view);
            }
        });
        if (cubicLineChartConfig != null) {
            init(cubicLineChartConfig, viewInflate);
        }
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m3458onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getRxBus().send(powerwatch.matrix.com.pwgen2android.shared.SleepChartClicked.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment
    public void init(final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig config, final android.view.View rootView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.charts.-$$Lambda$CubicLineChartFragment$sL-ta6aisOAGCJhMMKtrcQI6pF0
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment.m3455init$lambda18(this.f$0, rootView, config);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-18, reason: not valid java name */
    public static final void m3455init$lambda18(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment this$0, android.view.View rootView, final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig config) {
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.String label;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "$rootView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "$config");
        if (this$0.getContext() == null) {
            return;
        }
        final com.github.mikephil.charting.charts.LineChart lineChart = this$0.lineChart;
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.start_time_legend_text);
        android.widget.TextView textView2 = (android.widget.TextView) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.end_time_legend_text);
        if (lineChart == null) {
            return;
        }
        if (lineChart.getData() != null) {
            lineChart.clearValues();
            lineChart.setData(null);
        }
        lineChart.getDescription().setEnabled(false);
        powerwatch.matrix.com.pwgen2android.shared.extensions.ChartExtensionsKt.hideBackgroundGridLines(lineChart);
        powerwatch.matrix.com.pwgen2android.shared.extensions.ChartExtensionsKt.removeTouch(lineChart);
        com.github.mikephil.charting.components.XAxis xAxis = lineChart.getXAxis();
        com.github.mikephil.charting.components.YAxis yAxisRight = lineChart.getAxisRight();
        float f = 0.0f;
        yAxisRight.enableGridDashedLine(12.0f, 5.0f, 0.0f);
        com.github.mikephil.charting.components.YAxis axisLeft = lineChart.getAxisLeft();
        xAxis.setTextColor(-1);
        lineChart.getLegend().setEnabled(false);
        android.content.Context context = this$0.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        lineChart.setNoDataText(context.getString(powerwatch.matrix.com.pwgen2android.R.string.no_chart_data_available));
        float f2 = 40 * this$0.getResources().getDisplayMetrics().density;
        if (!config.getEntries().isEmpty()) {
            java.util.List<java.util.List<java.util.List<com.github.mikephil.charting.data.Entry>>> entries = config.getEntries();
            int i = 10;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entries, 10));
            java.util.Iterator it = entries.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                java.lang.Object next3 = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) next3);
                if (mutableList.isEmpty()) {
                    mutableList.add(kotlin.collections.CollectionsKt.listOf(new com.github.mikephil.charting.data.Entry(f, f)));
                }
                android.content.Context context2 = this$0.getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNull(context2);
                androidx.core.content.ContextCompat.getDrawable(context2, powerwatch.matrix.com.pwgen2android.R.drawable.sleep_drawable);
                java.util.List list = mutableList;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, i));
                java.util.Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    java.util.List list2 = (java.util.List) it2.next();
                    java.util.List<java.lang.String> dataSetsLabels = config.getDataSetsLabels();
                    java.util.Iterator it3 = it;
                    java.lang.String str = (i2 < 0 || i2 > kotlin.collections.CollectionsKt.getLastIndex(dataSetsLabels)) ? "" : dataSetsLabels.get(i2);
                    java.util.List list3 = list2;
                    java.util.Iterator it4 = it2;
                    if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
                        java.util.Iterator it5 = list3.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                if (!(((com.github.mikephil.charting.data.Entry) it5.next()).getY() == 150.0f)) {
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
                    com.github.mikephil.charting.data.LineDataSet lineDataSet = new com.github.mikephil.charting.data.LineDataSet(list2, str);
                    lineDataSet.setDrawCircles(false);
                    lineDataSet.setDrawCircleHole(false);
                    lineDataSet.setMode(com.github.mikephil.charting.data.LineDataSet.Mode.HORIZONTAL_BEZIER);
                    android.content.Context context3 = this$0.getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(context3);
                    lineDataSet.setFillColor(androidx.core.content.ContextCompat.getColor(context3, powerwatch.matrix.com.pwgen2android.R.color.dark_purple_chart));
                    lineDataSet.setDrawFilled(true);
                    lineDataSet.setLineWidth(1.5f);
                    if (z) {
                        lineDataSet.setColor(androidx.core.internal.view.SupportMenu.CATEGORY_MASK);
                    }
                    lineDataSet.setFillAlpha(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricHeightDefault);
                    lineDataSet.setDrawValues(false);
                    lineDataSet.setAxisDependency(com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    arrayList2.add(lineDataSet);
                    it = it3;
                    it2 = it4;
                }
                arrayList.add(arrayList2);
                i2 = i3;
                f = 0.0f;
                i = 10;
            }
            java.util.ArrayList arrayList3 = arrayList;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            java.util.Iterator it6 = arrayList3.iterator();
            int i4 = 0;
            while (it6.hasNext()) {
                java.lang.Object next4 = it6.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                java.util.List list4 = (java.util.List) next4;
                java.util.Iterator it7 = it6;
                powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaySetData daySetData = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaySetData(null, null, 3, null);
                com.github.mikephil.charting.data.LineDataSet lineDataSet2 = (com.github.mikephil.charting.data.LineDataSet) kotlin.collections.CollectionsKt.firstOrNull(list4);
                if (lineDataSet2 == null || (label = lineDataSet2.getLabel()) == null) {
                    label = "";
                }
                daySetData.setLabel(label);
                java.util.Iterator it8 = list4.iterator();
                while (it8.hasNext()) {
                    com.github.mikephil.charting.data.LineDataSet lineDataSet3 = (com.github.mikephil.charting.data.LineDataSet) it8.next();
                    daySetData.getDataSets().add(lineDataSet3);
                    java.util.Iterator it9 = it8;
                    float f3 = (i4 * 260) + 150.0f;
                    int i6 = i5;
                    float f4 = i4 * 260.0f;
                    int i7 = i4;
                    android.content.Context context4 = this$0.getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(context4);
                    lineDataSet3.setFillFormatter(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.MinMaxFillFormatter(f3, f4, androidx.core.content.ContextCompat.getColor(context4, powerwatch.matrix.com.pwgen2android.R.color.dark_blue_chart_background)));
                    it8 = it9;
                    i5 = i6;
                    i4 = i7;
                }
                arrayList4.add(daySetData);
                it6 = it7;
                i4 = i5;
            }
            java.util.ArrayList arrayList5 = arrayList4;
            java.util.ArrayList arrayList6 = arrayList5;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.util.Iterator it10 = arrayList6.iterator();
            while (it10.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList7, ((powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaySetData) it10.next()).getDataSets());
            }
            com.github.mikephil.charting.data.LineData lineData = new com.github.mikephil.charting.data.LineData(arrayList7);
            lineData.setHighlightEnabled(false);
            java.util.List<java.lang.String> xAxisLabels = config.getXAxisLabels();
            if (xAxisLabels == null) {
                xAxisLabels = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"9", "", "", "12A", "", "", "3", "", "", "6", "", "", "9", "", "", "12P"});
            }
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.util.Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList8, ((powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaySetData) it11.next()).getDataSets());
            }
            java.util.Iterator it12 = arrayList8.iterator();
            if (it12.hasNext()) {
                next = it12.next();
                if (it12.hasNext()) {
                    float yMax = ((com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next).getYMax();
                    do {
                        java.lang.Object next5 = it12.next();
                        java.lang.Object obj = next;
                        float yMax2 = ((com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next5).getYMax();
                        if (java.lang.Float.compare(yMax, yMax2) < 0) {
                            yMax = yMax2;
                            next = next5;
                        } else {
                            next = obj;
                        }
                    } while (it12.hasNext());
                }
            } else {
                next = null;
            }
            com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet = (com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next;
            java.lang.Float fValueOf = iLineDataSet == null ? null : java.lang.Float.valueOf(iLineDataSet.getYMax());
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.util.Iterator it13 = arrayList6.iterator();
            while (it13.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList9, ((powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaySetData) it13.next()).getDataSets());
            }
            java.util.Iterator it14 = arrayList9.iterator();
            if (it14.hasNext()) {
                next2 = it14.next();
                if (it14.hasNext()) {
                    float yMin = ((com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next2).getYMin();
                    do {
                        java.lang.Object next6 = it14.next();
                        java.lang.Object obj2 = next2;
                        float yMin2 = ((com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next6).getYMin();
                        if (java.lang.Float.compare(yMin, yMin2) > 0) {
                            yMin = yMin2;
                            next2 = next6;
                        } else {
                            next2 = obj2;
                        }
                    } while (it14.hasNext());
                }
            } else {
                next2 = null;
            }
            com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet2 = (com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next2;
            java.lang.Float fValueOf2 = iLineDataSet2 == null ? null : java.lang.Float.valueOf(iLineDataSet2.getYMin());
            int i8 = powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment.WhenMappings.$EnumSwitchMapping$0[config.getMode().ordinal()];
            if (i8 == 1) {
                lineChart.setExtraOffsets(0.0f, 0.0f, 0.0f, 0.0f);
                android.content.Context context5 = this$0.getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNull(context5);
                int color = androidx.core.content.ContextCompat.getColor(context5, powerwatch.matrix.com.pwgen2android.R.color.blue_chart);
                android.content.Context context6 = this$0.getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNull(context6);
                lineChart.getRenderer().getPaintRender().setShader(new android.graphics.LinearGradient(0.0f, 800.0f, 0.0f, 0.0f, color, androidx.core.content.ContextCompat.getColor(context6, powerwatch.matrix.com.pwgen2android.R.color.awake_red), android.graphics.Shader.TileMode.CLAMP));
                xAxis.setDrawLabels(false);
                xAxis.setEnabled(false);
                if (!config.getEntries().isEmpty()) {
                    textView.setText((java.lang.CharSequence) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) xAxisLabels));
                    textView2.setText((java.lang.CharSequence) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) xAxisLabels));
                }
                xAxis.setDrawGridLines(false);
                com.github.mikephil.charting.components.LimitLine limitLine = new com.github.mikephil.charting.components.LimitLine(axisLeft.getAxisMinimum());
                limitLine.setLineColor(-1);
                limitLine.setTextColor(-7829368);
                limitLine.setLineWidth(1.5f);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                axisLeft.addLimitLine(limitLine);
                android.widget.LinearLayout linearLayout = this$0.chartContainer;
                if (linearLayout != null) {
                    android.content.Context context7 = this$0.getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(context7);
                    linearLayout.setBackgroundColor(androidx.core.content.ContextCompat.getColor(context7, powerwatch.matrix.com.pwgen2android.R.color.dark_blue_chart_background));
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                }
            } else if (i8 != 2) {
                xAxis.setValueFormatter(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.WeekMonthXAxisValueFormatter(null, config.getHourOffset(), 1, null));
                java.util.ArrayList arrayList10 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
                int i9 = 0;
                for (java.lang.Object obj3 : arrayList6) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    arrayList10.add(java.lang.String.valueOf(i10));
                    i9 = i10;
                }
                java.util.List list5 = kotlin.collections.CollectionsKt.toList(kotlin.collections.CollectionsKt.reversed(arrayList10));
                yAxisRight.setLabelCount(list5.size(), true);
                lineChart.setRenderer(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.CubicLineLegendRenderer(lineChart, lineChart.getAnimator(), lineChart.getViewPortHandler()));
                yAxisRight.setValueFormatter(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaysYAxisValueFormatter(list5, null, 2, null));
                yAxisRight.setDrawLabels(true);
                yAxisRight.setTextColor(-1);
                lineChart.setMinimumHeight((int) (arrayList5.size() * f2));
                if (fValueOf != null) {
                    lineChart.getAxisRight().setAxisMaximum(config.getMaxValue());
                }
                if (fValueOf2 != null) {
                    lineChart.getAxisRight().setAxisMinimum(fValueOf2.floatValue() - 90.0f);
                }
                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
            } else {
                yAxisRight.setValueFormatter(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaysYAxisValueFormatter(config.getYAxisLabels(), null, 2, null));
                xAxis.setValueFormatter(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.WeekMonthXAxisValueFormatter(null, config.getHourOffset(), 1, null));
                xAxis.setPosition(com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP);
                lineChart.setRenderer(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.CubicLineLegendRenderer(lineChart, lineChart.getAnimator(), lineChart.getViewPortHandler()));
                yAxisRight.setLabelCount(arrayList5.size(), true);
                yAxisRight.setDrawLabels(true);
                yAxisRight.setTextColor(-1);
                yAxisRight.setGridLineWidth(0.3f);
                lineChart.setVerticalScrollBarEnabled(true);
                if (fValueOf != null) {
                    lineChart.getAxisRight().setAxisMaximum(config.getMaxValue());
                }
                if (fValueOf2 != null) {
                    lineChart.getAxisRight().setAxisMinimum(fValueOf2.floatValue() - 90.0f);
                }
                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
            }
            com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewPortHandler, "chart.viewPortHandler");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(yAxisRight, "yAxisRight");
            com.github.mikephil.charting.utils.Transformer transformer = lineChart.getTransformer(yAxisRight.getAxisDependency());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(transformer, "chart.getTransformer(yAxisRight.axisDependency)");
            lineChart.setRendererRightYAxis(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicChartYAxisRender(arrayList5, viewPortHandler, yAxisRight, transformer));
            lineChart.setData(lineData);
            yAxisRight.getYOffset();
        } else {
            textView.setText("");
            textView2.setText("");
        }
        axisLeft.setAxisMinimum(0.0f);
        lineChart.setVerticalScrollBarEnabled(true);
        for (powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData limitLineData : config.getLimitLines()) {
            com.github.mikephil.charting.components.LimitLine limitLine2 = new com.github.mikephil.charting.components.LimitLine(limitLineData.getValue());
            limitLine2.setLineColor(-7829368);
            limitLine2.setLabelPosition(com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP);
            limitLine2.setLabel(limitLineData.getText());
            limitLine2.enableDashedLine(10.0f, 10.0f, 0.0f);
            limitLine2.setLineWidth(0.3f);
            limitLine2.setTextColor(-7829368);
            limitLine2.setTextSize(12.0f);
            kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
            yAxisRight.addLimitLine(limitLine2);
        }
        lineChart.post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.charts.-$$Lambda$CubicLineChartFragment$rEiA4rGSGxcReeMhWi9snOLFPAA
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment.m3456init$lambda18$lambda17(lineChart, config);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-18$lambda-17, reason: not valid java name */
    public static final void m3456init$lambda18$lambda17(com.github.mikephil.charting.charts.LineChart lineChart, powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "$config");
        lineChart.invalidate();
        if (config.getPerformAnimation()) {
            lineChart.animateY(com.baidu.mapapi.UIMsg.d_ResultType.SHORT_URL, com.github.mikephil.charting.animation.Easing.EasingOption.EaseOutBack);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment
    public void setConfig(java.lang.Object config) {
        if (!(config instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig)) {
            throw new java.lang.IllegalArgumentException("Wrong config type for cubic line chart provided!!!");
        }
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putParcelable(CHART_CONFIG, (android.os.Parcelable) config);
        }
        android.view.View view = getView();
        if (view != null && !kotlin.jvm.internal.Intrinsics.areEqual(config, this.currentConfig)) {
            init((powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig) config, view);
        }
        this.currentConfig = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig) config;
    }

    /* JADX INFO: compiled from: CubicLineChartFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment$Companion;", "", "()V", "CHART_CONFIG", "", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;", "config", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment newInstance$default(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment.Companion companion, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = null;
            }
            return companion.newInstance(obj);
        }

        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment newInstance(java.lang.Object config) {
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment cubicLineChartFragment = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            if (config instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig) {
                bundle.putParcelable(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment.CHART_CONFIG, (android.os.Parcelable) config);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            cubicLineChartFragment.setArguments(bundle);
            return cubicLineChartFragment;
        }
    }
}
