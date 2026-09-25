package com.github.mikephil.charting.components;

/* JADX INFO: loaded from: classes.dex */
public class MarkerView extends android.widget.RelativeLayout implements com.github.mikephil.charting.components.IMarker {
    private com.github.mikephil.charting.utils.MPPointF mOffset;
    private com.github.mikephil.charting.utils.MPPointF mOffset2;
    private java.lang.ref.WeakReference<com.github.mikephil.charting.charts.Chart> mWeakChart;

    public MarkerView(android.content.Context context, int i) {
        super(context);
        this.mOffset = new com.github.mikephil.charting.utils.MPPointF();
        this.mOffset2 = new com.github.mikephil.charting.utils.MPPointF();
        setupLayoutResource(i);
    }

    private void setupLayoutResource(int i) {
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(i, this);
        viewInflate.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
        viewInflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        viewInflate.layout(0, 0, viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight());
    }

    public void setOffset(com.github.mikephil.charting.utils.MPPointF mPPointF) {
        this.mOffset = mPPointF;
        if (mPPointF == null) {
            this.mOffset = new com.github.mikephil.charting.utils.MPPointF();
        }
    }

    public void setOffset(float f, float f2) {
        this.mOffset.x = f;
        this.mOffset.y = f2;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public com.github.mikephil.charting.utils.MPPointF getOffset() {
        return this.mOffset;
    }

    public void setChartView(com.github.mikephil.charting.charts.Chart chart) {
        this.mWeakChart = new java.lang.ref.WeakReference<>(chart);
    }

    public com.github.mikephil.charting.charts.Chart getChartView() {
        java.lang.ref.WeakReference<com.github.mikephil.charting.charts.Chart> weakReference = this.mWeakChart;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public com.github.mikephil.charting.utils.MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        com.github.mikephil.charting.utils.MPPointF offset = getOffset();
        this.mOffset2.x = offset.x;
        this.mOffset2.y = offset.y;
        com.github.mikephil.charting.charts.Chart chartView = getChartView();
        float width = getWidth();
        float height = getHeight();
        if (this.mOffset2.x + f < 0.0f) {
            this.mOffset2.x = -f;
        } else if (chartView != null && f + width + this.mOffset2.x > chartView.getWidth()) {
            this.mOffset2.x = (chartView.getWidth() - f) - width;
        }
        if (this.mOffset2.y + f2 < 0.0f) {
            this.mOffset2.y = -f2;
        } else if (chartView != null && f2 + height + this.mOffset2.y > chartView.getHeight()) {
            this.mOffset2.y = (chartView.getHeight() - f2) - height;
        }
        return this.mOffset2;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void refreshContent(com.github.mikephil.charting.data.Entry entry, com.github.mikephil.charting.highlight.Highlight highlight) {
        measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void draw(android.graphics.Canvas canvas, float f, float f2) {
        com.github.mikephil.charting.utils.MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f, f2);
        int iSave = canvas.save();
        canvas.translate(f + offsetForDrawingAtPoint.x, f2 + offsetForDrawingAtPoint.y);
        draw(canvas);
        canvas.restoreToCount(iSave);
    }
}
