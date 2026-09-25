package com.google.android.material.shadow;

/* JADX INFO: loaded from: classes.dex */
public class ShadowRenderer {
    private static final int COLOR_ALPHA_END = 0;
    private static final int COLOR_ALPHA_MIDDLE = 20;
    private static final int COLOR_ALPHA_START = 68;
    private final android.graphics.Paint cornerShadowPaint;
    private final android.graphics.Paint edgeShadowPaint;
    private final android.graphics.Path scratch;
    private int shadowEndColor;
    private int shadowMiddleColor;
    private final android.graphics.Paint shadowPaint;
    private int shadowStartColor;
    private static final int[] edgeColors = new int[3];
    private static final float[] edgePositions = {0.0f, 0.5f, 1.0f};
    private static final int[] cornerColors = new int[4];
    private static final float[] cornerPositions = {0.0f, 0.0f, 0.5f, 1.0f};

    public ShadowRenderer() {
        this(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
    }

    public ShadowRenderer(int i) {
        this.scratch = new android.graphics.Path();
        setShadowColor(i);
        android.graphics.Paint paint = new android.graphics.Paint(4);
        this.cornerShadowPaint = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.shadowPaint = paint2;
        paint2.setColor(this.shadowStartColor);
        this.edgeShadowPaint = new android.graphics.Paint(paint);
    }

    public void setShadowColor(int i) {
        this.shadowStartColor = androidx.core.graphics.ColorUtils.setAlphaComponent(i, 68);
        this.shadowMiddleColor = androidx.core.graphics.ColorUtils.setAlphaComponent(i, 20);
        this.shadowEndColor = androidx.core.graphics.ColorUtils.setAlphaComponent(i, 0);
    }

    public void drawEdgeShadow(android.graphics.Canvas canvas, android.graphics.Matrix matrix, android.graphics.RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = edgeColors;
        iArr[0] = this.shadowEndColor;
        iArr[1] = this.shadowMiddleColor;
        iArr[2] = this.shadowStartColor;
        this.edgeShadowPaint.setShader(new android.graphics.LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, iArr, edgePositions, android.graphics.Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.edgeShadowPaint);
        canvas.restore();
    }

    public void drawCornerShadow(android.graphics.Canvas canvas, android.graphics.Matrix matrix, android.graphics.RectF rectF, int i, float f, float f2) {
        boolean z = f2 < 0.0f;
        android.graphics.Path path = this.scratch;
        if (z) {
            int[] iArr = cornerColors;
            iArr[0] = 0;
            iArr[1] = this.shadowEndColor;
            iArr[2] = this.shadowMiddleColor;
            iArr[3] = this.shadowStartColor;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = cornerColors;
            iArr2[0] = 0;
            iArr2[1] = this.shadowStartColor;
            iArr2[2] = this.shadowMiddleColor;
            iArr2[3] = this.shadowEndColor;
        }
        float fWidth = 1.0f - (i / (rectF.width() / 2.0f));
        float[] fArr = cornerPositions;
        fArr[1] = fWidth;
        fArr[2] = ((1.0f - fWidth) / 2.0f) + fWidth;
        this.cornerShadowPaint.setShader(new android.graphics.RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, cornerColors, fArr, android.graphics.Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, android.graphics.Region.Op.DIFFERENCE);
        }
        canvas.drawArc(rectF, f, f2, true, this.cornerShadowPaint);
        canvas.restore();
    }

    public android.graphics.Paint getShadowPaint() {
        return this.shadowPaint;
    }
}
