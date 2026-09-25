package com.github.mikephil.charting.components;

/* JADX INFO: loaded from: classes.dex */
public class MarkerImage implements com.github.mikephil.charting.components.IMarker {
    private android.content.Context mContext;
    private android.graphics.drawable.Drawable mDrawable;
    private java.lang.ref.WeakReference<com.github.mikephil.charting.charts.Chart> mWeakChart;
    private com.github.mikephil.charting.utils.MPPointF mOffset = new com.github.mikephil.charting.utils.MPPointF();
    private com.github.mikephil.charting.utils.MPPointF mOffset2 = new com.github.mikephil.charting.utils.MPPointF();
    private com.github.mikephil.charting.utils.FSize mSize = new com.github.mikephil.charting.utils.FSize();
    private android.graphics.Rect mDrawableBoundsCache = new android.graphics.Rect();

    @Override // com.github.mikephil.charting.components.IMarker
    public void refreshContent(com.github.mikephil.charting.data.Entry entry, com.github.mikephil.charting.highlight.Highlight highlight) {
    }

    public MarkerImage(android.content.Context context, int i) {
        this.mContext = context;
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            this.mDrawable = this.mContext.getResources().getDrawable(i, null);
        } else {
            this.mDrawable = this.mContext.getResources().getDrawable(i);
        }
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

    public void setSize(com.github.mikephil.charting.utils.FSize fSize) {
        this.mSize = fSize;
        if (fSize == null) {
            this.mSize = new com.github.mikephil.charting.utils.FSize();
        }
    }

    public com.github.mikephil.charting.utils.FSize getSize() {
        return this.mSize;
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
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2;
        com.github.mikephil.charting.utils.MPPointF offset = getOffset();
        this.mOffset2.x = offset.x;
        this.mOffset2.y = offset.y;
        com.github.mikephil.charting.charts.Chart chartView = getChartView();
        float intrinsicWidth = this.mSize.width;
        float intrinsicHeight = this.mSize.height;
        if (intrinsicWidth == 0.0f && (drawable2 = this.mDrawable) != null) {
            intrinsicWidth = drawable2.getIntrinsicWidth();
        }
        if (intrinsicHeight == 0.0f && (drawable = this.mDrawable) != null) {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        if (this.mOffset2.x + f < 0.0f) {
            this.mOffset2.x = -f;
        } else if (chartView != null && f + intrinsicWidth + this.mOffset2.x > chartView.getWidth()) {
            this.mOffset2.x = (chartView.getWidth() - f) - intrinsicWidth;
        }
        if (this.mOffset2.y + f2 < 0.0f) {
            this.mOffset2.y = -f2;
        } else if (chartView != null && f2 + intrinsicHeight + this.mOffset2.y > chartView.getHeight()) {
            this.mOffset2.y = (chartView.getHeight() - f2) - intrinsicHeight;
        }
        return this.mOffset2;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void draw(android.graphics.Canvas canvas, float f, float f2) {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2;
        if (this.mDrawable == null) {
            return;
        }
        com.github.mikephil.charting.utils.MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f, f2);
        float intrinsicWidth = this.mSize.width;
        float intrinsicHeight = this.mSize.height;
        if (intrinsicWidth == 0.0f && (drawable2 = this.mDrawable) != null) {
            intrinsicWidth = drawable2.getIntrinsicWidth();
        }
        if (intrinsicHeight == 0.0f && (drawable = this.mDrawable) != null) {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        this.mDrawable.copyBounds(this.mDrawableBoundsCache);
        this.mDrawable.setBounds(this.mDrawableBoundsCache.left, this.mDrawableBoundsCache.top, this.mDrawableBoundsCache.left + ((int) intrinsicWidth), this.mDrawableBoundsCache.top + ((int) intrinsicHeight));
        int iSave = canvas.save();
        canvas.translate(f + offsetForDrawingAtPoint.x, f2 + offsetForDrawingAtPoint.y);
        this.mDrawable.draw(canvas);
        canvas.restoreToCount(iSave);
        this.mDrawable.setBounds(this.mDrawableBoundsCache);
    }
}
