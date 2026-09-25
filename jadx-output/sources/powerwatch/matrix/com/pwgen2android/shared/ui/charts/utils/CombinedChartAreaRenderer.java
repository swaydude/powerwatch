package powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils;

/* JADX INFO: loaded from: classes3.dex */
public class CombinedChartAreaRenderer extends com.github.mikephil.charting.renderer.CombinedChartRenderer {
    private float radius;
    private boolean useCenteredValues;

    public CombinedChartAreaRenderer(com.github.mikephil.charting.charts.CombinedChart chart, com.github.mikephil.charting.animation.ChartAnimator animator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(chart, animator, viewPortHandler);
        this.useCenteredValues = false;
    }

    public CombinedChartAreaRenderer(com.github.mikephil.charting.charts.CombinedChart chart, com.github.mikephil.charting.animation.ChartAnimator animator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, boolean useCenteredValues, float radius) {
        super(chart, animator, viewPortHandler);
        this.useCenteredValues = false;
        this.useCenteredValues = useCenteredValues;
        this.radius = radius;
        createRenderers();
    }

    @Override // com.github.mikephil.charting.renderer.CombinedChartRenderer
    public void createRenderers() {
        com.github.mikephil.charting.renderer.DataRenderer boundaryAreaChartRenderer;
        this.mRenderers.clear();
        com.github.mikephil.charting.charts.CombinedChart combinedChart = (com.github.mikephil.charting.charts.CombinedChart) this.mChart.get();
        if (combinedChart == null) {
            return;
        }
        for (com.github.mikephil.charting.charts.CombinedChart.DrawOrder drawOrder : combinedChart.getDrawOrder()) {
            int i = powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.CombinedChartAreaRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder[drawOrder.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (combinedChart.getCandleData() != null) {
                                this.mRenderers.add(new com.github.mikephil.charting.renderer.CandleStickChartRenderer(combinedChart, this.mAnimator, this.mViewPortHandler));
                            }
                        } else if (i == 5 && combinedChart.getScatterData() != null) {
                            this.mRenderers.add(new com.github.mikephil.charting.renderer.ScatterChartRenderer(combinedChart, this.mAnimator, this.mViewPortHandler));
                        }
                    } else if (combinedChart.getLineData() != null) {
                        java.util.List<com.github.mikephil.charting.renderer.DataRenderer> list = this.mRenderers;
                        if (this.useCenteredValues) {
                            boundaryAreaChartRenderer = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.CombinedChartAreaRenderer.CustomValueCenterLineRenderer(combinedChart, this.mAnimator, this.mViewPortHandler, this.radius);
                        } else {
                            boundaryAreaChartRenderer = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.BoundaryAreaChartRenderer(combinedChart, this.mAnimator, this.mViewPortHandler);
                        }
                        list.add(boundaryAreaChartRenderer);
                    }
                } else if (combinedChart.getBubbleData() != null) {
                    this.mRenderers.add(new com.github.mikephil.charting.renderer.BubbleChartRenderer(combinedChart, this.mAnimator, this.mViewPortHandler));
                }
            } else if (combinedChart.getBarData() != null) {
                this.mRenderers.add(new com.github.mikephil.charting.renderer.BarChartRenderer(combinedChart, this.mAnimator, this.mViewPortHandler));
            }
        }
    }

    /* JADX INFO: renamed from: powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.CombinedChartAreaRenderer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder;

        static {
            int[] iArr = new int[com.github.mikephil.charting.charts.CombinedChart.DrawOrder.values().length];
            $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder = iArr;
            try {
                iArr[com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder[com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BUBBLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder[com.github.mikephil.charting.charts.CombinedChart.DrawOrder.LINE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder[com.github.mikephil.charting.charts.CombinedChart.DrawOrder.CANDLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder[com.github.mikephil.charting.charts.CombinedChart.DrawOrder.SCATTER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    static class CustomValueCenterLineRenderer extends com.github.mikephil.charting.renderer.LineChartRenderer {
        private float radius;

        public CustomValueCenterLineRenderer(com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider chart, com.github.mikephil.charting.animation.ChartAnimator animator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, float radius) {
            super(chart, animator, viewPortHandler);
            this.radius = radius;
        }

        @Override // com.github.mikephil.charting.renderer.DataRenderer
        public void drawValue(android.graphics.Canvas c, com.github.mikephil.charting.formatter.IValueFormatter formatter, float value, com.github.mikephil.charting.data.Entry entry, int dataSetIndex, float x, float y, int color) {
            super.drawValue(c, formatter, value, entry, dataSetIndex, x, y + (this.radius * 2.0f), color);
        }
    }
}
