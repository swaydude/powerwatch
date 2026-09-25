package powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate;

/* JADX INFO: compiled from: ActivityHeartRateChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\rH\u0014J\b\u0010\u0017\u001a\u00020\u0003H\u0014J\b\u0010\u0018\u001a\u00020\rH\u0014J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\""}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentHeartRateChartBinding;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;", "()V", "activityHeartRateViewModel", "getActivityHeartRateViewModel", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;", "activityHeartRateViewModel$delegate", "Lkotlin/Lazy;", "heartRateChart", "Lcom/github/mikephil/charting/charts/LineChart;", "limitLineColor", "", "getLimitLineColor", "()I", "setLimitLineColor", "(I)V", "calculateLabelCount", "", "xAxis", "Lcom/github/mikephil/charting/components/XAxis;", "getBindingVariable", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ActivityHeartRateChartFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentHeartRateChartBinding, powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment.Companion(null);
    private com.github.mikephil.charting.charts.LineChart heartRateChart;

    /* JADX INFO: renamed from: activityHeartRateViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy activityHeartRateViewModel = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment$activityHeartRateViewModel$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel invoke() {
            androidx.fragment.app.Fragment parentFragment = this.this$0.getParentFragment();
            kotlin.jvm.internal.Intrinsics.checkNotNull(parentFragment);
            androidx.lifecycle.ViewModel viewModel = androidx.lifecycle.ViewModelProviders.of(parentFragment).get(powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel.class);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewModel, "of(parentFragment!!).get(ActivityHeartRateViewModel::class.java)");
            return (powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel) viewModel;
        }
    });
    private int limitLineColor = androidx.core.internal.view.SupportMenu.CATEGORY_MASK;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment newInstance() {
        return INSTANCE.newInstance();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int getBindingVariable() {
        return 1;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int layoutRes() {
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_heart_rate_chart;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel getActivityHeartRateViewModel() {
        return (powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel) this.activityHeartRateViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel getViewModel() {
        return getActivityHeartRateViewModel();
    }

    public final int getLimitLineColor() {
        return this.limitLineColor;
    }

    public final void setLimitLineColor(int i) {
        this.limitLineColor = i;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        setRootView(super.onCreateView(inflater, container, savedInstanceState));
        com.github.mikephil.charting.charts.LineChart lineChart = getViewDataBinding().heartRateChart;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lineChart, "viewDataBinding.heartRateChart");
        this.heartRateChart = lineChart;
        if (lineChart != null) {
            final com.github.mikephil.charting.components.XAxis xAxis = lineChart.getXAxis();
            xAxis.setTextSize(11.0f);
            xAxis.setAvoidFirstLastClipping(true);
            xAxis.setTextColor(-1);
            xAxis.setDrawGridLines(false);
            xAxis.setDrawAxisLine(false);
            xAxis.setValueFormatter(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.TimeValueFormatter(null, 1, null));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(xAxis, "xAxis");
            calculateLabelCount(xAxis);
            xAxis.setPosition(com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM);
            android.content.Context context = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context);
            this.limitLineColor = androidx.core.content.ContextCompat.getColor(context, powerwatch.matrix.com.pwgen2android.R.color.activity_heart_rate_color);
            com.github.mikephil.charting.charts.LineChart lineChart2 = this.heartRateChart;
            if (lineChart2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heartRateChart");
                throw null;
            }
            com.github.mikephil.charting.components.YAxis axisRight = lineChart2.getAxisRight();
            axisRight.setDrawGridLines(false);
            axisRight.enableGridDashedLine(10.0f, 10.0f, 0.0f);
            axisRight.setLabelCount(5, true);
            axisRight.setDrawAxisLine(false);
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context2);
            axisRight.setTextColor(androidx.core.content.ContextCompat.getColor(context2, android.R.color.darker_gray));
            axisRight.setValueFormatter(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ElevationValueFormatter(getActivityHeartRateViewModel().getUserPrefsUtils(), null, 2, null));
            axisRight.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
            com.github.mikephil.charting.charts.LineChart lineChart3 = this.heartRateChart;
            if (lineChart3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heartRateChart");
                throw null;
            }
            com.github.mikephil.charting.components.YAxis axisLeft = lineChart3.getAxisLeft();
            axisLeft.setTextColor(androidx.core.internal.view.SupportMenu.CATEGORY_MASK);
            axisLeft.enableGridDashedLine(10.0f, 10.0f, 0.0f);
            axisLeft.setLabelCount(5, true);
            axisLeft.setDrawAxisLine(false);
            axisLeft.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
            android.content.Context context3 = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context3);
            axisLeft.setTextColor(androidx.core.content.ContextCompat.getColor(context3, android.R.color.darker_gray));
            com.github.mikephil.charting.charts.LineChart lineChart4 = this.heartRateChart;
            if (lineChart4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heartRateChart");
                throw null;
            }
            lineChart4.getDescription().setEnabled(false);
            com.github.mikephil.charting.charts.LineChart lineChart5 = this.heartRateChart;
            if (lineChart5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heartRateChart");
                throw null;
            }
            lineChart5.setScaleEnabled(false);
            com.github.mikephil.charting.charts.LineChart lineChart6 = this.heartRateChart;
            if (lineChart6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heartRateChart");
                throw null;
            }
            lineChart6.setExtraTopOffset(30.0f);
            com.github.mikephil.charting.charts.LineChart lineChart7 = this.heartRateChart;
            if (lineChart7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heartRateChart");
                throw null;
            }
            lineChart7.getLegend().setEnabled(false);
            com.github.mikephil.charting.charts.LineChart lineChart8 = this.heartRateChart;
            if (lineChart8 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heartRateChart");
                throw null;
            }
            lineChart8.setClickable(false);
            getActivityHeartRateViewModel().getLinesData().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment.onCreateView.1
                @Override // androidx.databinding.Observable.OnPropertyChangedCallback
                public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                    powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment activityHeartRateChartFragment = powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment.this;
                    com.github.mikephil.charting.components.XAxis xAxis2 = xAxis;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(xAxis2, "xAxis");
                    activityHeartRateChartFragment.calculateLabelCount(xAxis2);
                }
            });
            getActivityHeartRateViewModel().getLimitLinePosition().addOnPropertyChangedCallback(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment.AnonymousClass2(xAxis));
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel activityHeartRateViewModel = getActivityHeartRateViewModel();
            android.content.Context context4 = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context4);
            activityHeartRateViewModel.onCreateView(context4);
            com.github.mikephil.charting.charts.LineChart lineChart9 = this.heartRateChart;
            if (lineChart9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heartRateChart");
                throw null;
            }
            if (lineChart9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heartRateChart");
                throw null;
            }
            com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler = lineChart9.getViewPortHandler();
            com.github.mikephil.charting.charts.LineChart lineChart10 = this.heartRateChart;
            if (lineChart10 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heartRateChart");
                throw null;
            }
            lineChart9.setXAxisRenderer(new com.github.mikephil.charting.renderer.XAxisRenderer(viewPortHandler, lineChart10.getTransformer(axisRight.getAxisDependency())) { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment.onCreateView.3
                {
                    super(viewPortHandler, this.$xAxis, transformer);
                }

                @Override // com.github.mikephil.charting.renderer.XAxisRenderer
                public void renderLimitLineLabel(android.graphics.Canvas c, com.github.mikephil.charting.components.LimitLine limitLine, float[] position, float yOffset) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "c");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limitLine, "limitLine");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "position");
                    java.lang.String label = limitLine.getLabel();
                    if (label == null || kotlin.jvm.internal.Intrinsics.areEqual(label, "")) {
                        return;
                    }
                    this.mLimitLinePaint.setStyle(limitLine.getTextStyle());
                    this.mLimitLinePaint.setPathEffect(null);
                    this.mLimitLinePaint.setColor(limitLine.getTextColor());
                    this.mLimitLinePaint.setStrokeWidth(0.5f);
                    this.mLimitLinePaint.setTextSize(limitLine.getTextSize());
                    float lineWidth = limitLine.getLineWidth() + limitLine.getXOffset();
                    com.github.mikephil.charting.components.LimitLine.LimitLabelPosition labelPosition = limitLine.getLabelPosition();
                    if (labelPosition == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP) {
                        float fCalcTextHeight = com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mLimitLinePaint, label);
                        this.mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
                        int i = 0;
                        for (java.lang.Object obj : kotlin.text.StringsKt.split$default((java.lang.CharSequence) label, new java.lang.String[]{"\n"}, false, 0, 6, (java.lang.Object) null)) {
                            int i2 = i + 1;
                            if (i < 0) {
                                kotlin.collections.CollectionsKt.throwIndexOverflow();
                            }
                            c.drawText((java.lang.String) obj, position[0] + lineWidth, this.mViewPortHandler.contentTop() + yOffset + (i2 * fCalcTextHeight), this.mLimitLinePaint);
                            i = i2;
                        }
                        return;
                    }
                    if (labelPosition == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                        this.mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
                        c.drawText(label, position[0] + lineWidth, this.mViewPortHandler.contentBottom() - yOffset, this.mLimitLinePaint);
                    } else if (labelPosition == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.LEFT_TOP) {
                        this.mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
                        c.drawText(label, position[0] - lineWidth, this.mViewPortHandler.contentTop() + yOffset + com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mLimitLinePaint, label), this.mLimitLinePaint);
                    } else {
                        this.mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
                        c.drawText(label, position[0] - lineWidth, this.mViewPortHandler.contentBottom() - yOffset, this.mLimitLinePaint);
                    }
                }
            });
            com.github.mikephil.charting.charts.LineChart lineChart11 = this.heartRateChart;
            if (lineChart11 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heartRateChart");
                throw null;
            }
            lineChart11.post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.-$$Lambda$ActivityHeartRateChartFragment$lbwi2YjbpgYUCd-pkE6MCdw5KJU
                @Override // java.lang.Runnable
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment.m3461onCreateView$lambda0(this.f$0);
                }
            });
            com.github.mikephil.charting.charts.LineChart lineChart12 = this.heartRateChart;
            if (lineChart12 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heartRateChart");
                throw null;
            }
            lineChart12.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.-$$Lambda$ActivityHeartRateChartFragment$11uAHP2tQROkYgXNEQOi_ua8Qa4
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment.m3462onCreateView$lambda1(this.f$0, view);
                }
            });
            return getRootView();
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heartRateChart");
        throw null;
    }

    /* JADX INFO: renamed from: powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment$onCreateView$2, reason: invalid class name */
    /* JADX INFO: compiled from: ActivityHeartRateChartFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"powerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$onCreateView$2", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "onPropertyChanged", "", "sender", "Landroidx/databinding/Observable;", "propertyId", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AnonymousClass2 extends androidx.databinding.Observable.OnPropertyChangedCallback {
        final /* synthetic */ com.github.mikephil.charting.components.XAxis $xAxis;

        AnonymousClass2(com.github.mikephil.charting.components.XAxis xAxis) {
            this.$xAxis = xAxis;
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            final powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment activityHeartRateChartFragment = powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment.this;
            final com.github.mikephil.charting.components.XAxis xAxis = this.$xAxis;
            handler.post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.-$$Lambda$ActivityHeartRateChartFragment$onCreateView$2$Acmp1SAQpMqU14eJDkYAJaiXdvQ
                @Override // java.lang.Runnable
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment.AnonymousClass2.m3463onPropertyChanged$lambda1(activityHeartRateChartFragment, xAxis);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onPropertyChanged$lambda-1, reason: not valid java name */
        public static final void m3463onPropertyChanged$lambda1(powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment this$0, com.github.mikephil.charting.components.XAxis xAxis) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.Pair<java.lang.String, java.lang.Float> pair = this$0.getActivityHeartRateViewModel().getLimitLinePosition().get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(pair);
            com.github.mikephil.charting.components.LimitLine limitLine = new com.github.mikephil.charting.components.LimitLine(pair.getSecond().floatValue());
            kotlin.Pair<java.lang.String, java.lang.Float> pair2 = this$0.getActivityHeartRateViewModel().getLimitLinePosition().get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(pair2);
            java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("setting_value: ", pair2));
            kotlin.Pair<java.lang.String, java.lang.Float> pair3 = this$0.getActivityHeartRateViewModel().getLimitLinePosition().get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(pair3);
            limitLine.setLabel(pair3.getFirst());
            limitLine.setLabelPosition(com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP);
            limitLine.setLineColor(this$0.getLimitLineColor());
            limitLine.setTextColor(-1);
            limitLine.setLineWidth(1.0f);
            java.util.List<com.github.mikephil.charting.components.LimitLine> limitLines = xAxis.getLimitLines();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(limitLines, "xAxis.limitLines");
            if (!limitLines.isEmpty()) {
                xAxis.getLimitLines().set(0, limitLine);
            } else {
                xAxis.addLimitLine(limitLine);
            }
            com.github.mikephil.charting.charts.LineChart lineChart = this$0.heartRateChart;
            if (lineChart != null) {
                lineChart.invalidate();
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heartRateChart");
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m3461onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.github.mikephil.charting.charts.LineChart lineChart = this$0.heartRateChart;
        if (lineChart != null) {
            lineChart.invalidate();
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heartRateChart");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m3462onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getActivityHeartRateViewModel().onChartClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calculateLabelCount(com.github.mikephil.charting.components.XAxis xAxis) {
        java.util.List<T> values;
        java.util.List<com.github.mikephil.charting.data.LineDataSet> list = getActivityHeartRateViewModel().getLinesData().get();
        java.util.List<com.github.mikephil.charting.data.LineDataSet> list2 = list;
        int size = ((list2 == null || list2.isEmpty()) || (values = list.get(0).getValues()) == 0) ? 5 : values.size();
        xAxis.setLabelCount(size <= 5 ? size : 5, true);
    }

    /* JADX INFO: compiled from: ActivityHeartRateChartFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment();
        }
    }
}
