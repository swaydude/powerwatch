package com.github.mikephil.charting.charts;

/* JADX INFO: loaded from: classes.dex */
public class ScatterChart extends com.github.mikephil.charting.charts.BarLineChartBase<com.github.mikephil.charting.data.ScatterData> implements com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider {
    public ScatterChart(android.content.Context context) {
        super(context);
    }

    public ScatterChart(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScatterChart(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mRenderer = new com.github.mikephil.charting.renderer.ScatterChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        getXAxis().setSpaceMin(0.5f);
        getXAxis().setSpaceMax(0.5f);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider
    public com.github.mikephil.charting.data.ScatterData getScatterData() {
        return (com.github.mikephil.charting.data.ScatterData) this.mData;
    }

    public enum ScatterShape {
        SQUARE("SQUARE"),
        CIRCLE("CIRCLE"),
        TRIANGLE("TRIANGLE"),
        CROSS("CROSS"),
        X("X"),
        CHEVRON_UP("CHEVRON_UP"),
        CHEVRON_DOWN("CHEVRON_DOWN");

        private final java.lang.String shapeIdentifier;

        ScatterShape(java.lang.String str) {
            this.shapeIdentifier = str;
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return this.shapeIdentifier;
        }

        public static com.github.mikephil.charting.charts.ScatterChart.ScatterShape[] getAllDefaultShapes() {
            return new com.github.mikephil.charting.charts.ScatterChart.ScatterShape[]{SQUARE, CIRCLE, TRIANGLE, CROSS, X, CHEVRON_UP, CHEVRON_DOWN};
        }
    }
}
