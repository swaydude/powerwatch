package com.github.mikephil.charting.renderer;

/* JADX INFO: loaded from: classes.dex */
public abstract class LineRadarRenderer extends com.github.mikephil.charting.renderer.LineScatterCandleRadarRenderer {
    public LineRadarRenderer(com.github.mikephil.charting.animation.ChartAnimator chartAnimator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
    }

    protected void drawFilledPath(android.graphics.Canvas canvas, android.graphics.Path path, android.graphics.drawable.Drawable drawable) {
        if (clipPathSupported()) {
            int iSave = canvas.save();
            canvas.clipPath(path);
            drawable.setBounds((int) this.mViewPortHandler.contentLeft(), (int) this.mViewPortHandler.contentTop(), (int) this.mViewPortHandler.contentRight(), (int) this.mViewPortHandler.contentBottom());
            drawable.draw(canvas);
            canvas.restoreToCount(iSave);
            return;
        }
        throw new java.lang.RuntimeException("Fill-drawables not (yet) supported below API level 18, this code was run on API level " + com.github.mikephil.charting.utils.Utils.getSDKInt() + ".");
    }

    protected void drawFilledPath(android.graphics.Canvas canvas, android.graphics.Path path, int i, int i2) {
        int i3 = (i & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK) | (i2 << 24);
        if (clipPathSupported()) {
            int iSave = canvas.save();
            canvas.clipPath(path);
            canvas.drawColor(i3);
            canvas.restoreToCount(iSave);
            return;
        }
        android.graphics.Paint.Style style = this.mRenderPaint.getStyle();
        int color = this.mRenderPaint.getColor();
        this.mRenderPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mRenderPaint.setColor(i3);
        canvas.drawPath(path, this.mRenderPaint);
        this.mRenderPaint.setColor(color);
        this.mRenderPaint.setStyle(style);
    }

    private boolean clipPathSupported() {
        return com.github.mikephil.charting.utils.Utils.getSDKInt() >= 18;
    }
}
