package com.github.mikephil.charting.renderer.scatter;

/* JADX INFO: loaded from: classes.dex */
public class TriangleShapeRenderer implements com.github.mikephil.charting.renderer.scatter.IShapeRenderer {
    protected android.graphics.Path mTrianglePathBuffer = new android.graphics.Path();

    @Override // com.github.mikephil.charting.renderer.scatter.IShapeRenderer
    public void renderShape(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.IScatterDataSet iScatterDataSet, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, float f, float f2, android.graphics.Paint paint) {
        float scatterShapeSize = iScatterDataSet.getScatterShapeSize();
        float f3 = scatterShapeSize / 2.0f;
        float fConvertDpToPixel = (scatterShapeSize - (com.github.mikephil.charting.utils.Utils.convertDpToPixel(iScatterDataSet.getScatterShapeHoleRadius()) * 2.0f)) / 2.0f;
        int scatterShapeHoleColor = iScatterDataSet.getScatterShapeHoleColor();
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Path path = this.mTrianglePathBuffer;
        path.reset();
        float f4 = f2 - f3;
        path.moveTo(f, f4);
        float f5 = f + f3;
        float f6 = f2 + f3;
        path.lineTo(f5, f6);
        float f7 = f - f3;
        path.lineTo(f7, f6);
        double d = scatterShapeSize;
        if (d > 0.0d) {
            path.lineTo(f, f4);
            float f8 = f7 + fConvertDpToPixel;
            float f9 = f6 - fConvertDpToPixel;
            path.moveTo(f8, f9);
            path.lineTo(f5 - fConvertDpToPixel, f9);
            path.lineTo(f, f4 + fConvertDpToPixel);
            path.lineTo(f8, f9);
        }
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
        if (d <= 0.0d || scatterShapeHoleColor == 1122867) {
            return;
        }
        paint.setColor(scatterShapeHoleColor);
        path.moveTo(f, f4 + fConvertDpToPixel);
        float f10 = f6 - fConvertDpToPixel;
        path.lineTo(f5 - fConvertDpToPixel, f10);
        path.lineTo(f7 + fConvertDpToPixel, f10);
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
    }
}
