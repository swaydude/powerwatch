package powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils;

/* JADX INFO: loaded from: classes3.dex */
public class BoundaryAreaChartRenderer extends com.github.mikephil.charting.renderer.LineChartRenderer {
    public BoundaryAreaChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider chart, com.github.mikephil.charting.animation.ChartAnimator animator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(chart, animator, viewPortHandler);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    protected void drawCubicFill(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet, android.graphics.Path path, com.github.mikephil.charting.utils.Transformer transformer, com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        ?? r10;
        ?? r8;
        if (this.mXBounds.range < 1) {
            super.drawCubicFill(canvas, iLineDataSet, path, transformer, xBounds);
            return;
        }
        com.github.mikephil.charting.data.LineDataSet boundaryDataSet = ((powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.BoundaryFillFormatter) iLineDataSet.getFillFormatter()).getBoundaryDataSet();
        float phaseY = this.mAnimator.getPhaseY();
        this.mXBounds.set(this.mChart, boundaryDataSet);
        boundaryDataSet.getCubicIntensity();
        int i = this.mXBounds.min;
        int i2 = this.mXBounds.min + this.mXBounds.range;
        int entryCount = boundaryDataSet.getEntryCount() - 1;
        ?? entryForIndex = boundaryDataSet.getEntryForIndex(i);
        ?? entryForIndex2 = boundaryDataSet.getEntryForIndex(i2);
        this.cubicFillPath.lineTo(entryForIndex2.getX(), entryForIndex2.getY());
        java.lang.Object entryForIndex3 = boundaryDataSet.getEntryForIndex(java.lang.Math.min(i2 + 1, entryCount));
        java.lang.Object entryForIndex4 = boundaryDataSet.getEntryForIndex(java.lang.Math.min(i2, entryCount));
        if (entryForIndex4 == null) {
            return;
        }
        int i3 = i2 - 1;
        while (i3 >= i) {
            r8 = entryForIndex4;
            r10 = entryForIndex3;
            ?? entryForIndex5 = boundaryDataSet.getEntryForIndex(i3);
            ?? entryForIndex6 = boundaryDataSet.getEntryForIndex(java.lang.Math.max(i3 - 1, 0));
            entryForIndex5.getX();
            r10.getX();
            entryForIndex5.getY();
            r10.getY();
            entryForIndex6.getX();
            r8.getX();
            entryForIndex6.getY();
            r8.getY();
            float x = r8.getX() + ((entryForIndex5.getX() - r8.getX()) / 2.0f);
            this.cubicFillPath.cubicTo(x, r8.getY() * phaseY, x, entryForIndex5.getY() * phaseY, entryForIndex5.getX(), entryForIndex5.getY() * phaseY);
            i3--;
            r10 = r8;
            r8 = entryForIndex5;
        }
        r8 = entryForIndex4;
        r10 = entryForIndex3;
        this.cubicFillPath.lineTo(entryForIndex.getX(), entryForIndex.getY());
        this.cubicFillPath.close();
        transformer.pathValueToPixel(path);
        android.graphics.drawable.Drawable fillDrawable = iLineDataSet.getFillDrawable();
        if (fillDrawable != null) {
            drawFilledPath(canvas, path, fillDrawable);
        } else {
            drawFilledPath(canvas, path, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
        }
    }
}
