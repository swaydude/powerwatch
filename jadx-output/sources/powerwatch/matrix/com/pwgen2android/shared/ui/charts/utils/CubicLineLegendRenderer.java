package powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils;

/* JADX INFO: loaded from: classes3.dex */
public class CubicLineLegendRenderer extends com.github.mikephil.charting.renderer.LineChartRenderer {
    public CubicLineLegendRenderer(com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider chart, com.github.mikephil.charting.animation.ChartAnimator animator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(chart, animator, viewPortHandler);
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    protected void drawDataSet(android.graphics.Canvas c, com.github.mikephil.charting.interfaces.datasets.ILineDataSet dataSet) {
        super.drawDataSet(c, dataSet);
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    protected void drawCubicFill(android.graphics.Canvas c, com.github.mikephil.charting.interfaces.datasets.ILineDataSet dataSet, android.graphics.Path spline, com.github.mikephil.charting.utils.Transformer trans, com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer.XBounds bounds) {
        int i;
        int i2;
        android.graphics.Path path = new android.graphics.Path();
        android.graphics.Path path2 = new android.graphics.Path();
        int i3 = bounds.min;
        int i4 = bounds.range + bounds.min;
        dataSet.getEntryForIndex(0);
        if (dataSet.getFillFormatter() instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.MinMaxFillFormatter) {
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.MinMaxFillFormatter minMaxFillFormatter = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.MinMaxFillFormatter) dataSet.getFillFormatter();
            int i5 = 0;
            do {
                int i6 = i3 + (i5 * 128);
                int i7 = i6 + 128;
                int i8 = i7 > i4 ? i4 : i7;
                if (i6 <= i8) {
                    i = i8;
                    i2 = i6;
                    generateAboveFilledPath(dataSet, i6, i8, path, minMaxFillFormatter);
                    generateAreaFilledPath(dataSet, i2, i, path2, minMaxFillFormatter);
                    trans.pathValueToPixel(path);
                    trans.pathValueToPixel(path2);
                    android.graphics.drawable.Drawable fillDrawable = dataSet.getFillDrawable();
                    if (fillDrawable != null) {
                        drawFilledPath(c, path, fillDrawable);
                        drawFilledPath(c, path2, fillDrawable);
                    } else {
                        drawFilledPath(c, path, minMaxFillFormatter.aboveLineChartColor, dataSet.getFillAlpha());
                        drawFilledPath(c, path2, dataSet.getFillColor(), dataSet.getFillAlpha());
                    }
                } else {
                    i = i8;
                    i2 = i6;
                }
                i5++;
            } while (i2 <= i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.github.mikephil.charting.data.Entry] */
    private void generateAboveFilledPath(final com.github.mikephil.charting.interfaces.datasets.ILineDataSet dataSet, final int startIndex, final int endIndex, final android.graphics.Path outputPath, final powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.MinMaxFillFormatter fillFormatter) {
        float f = fillFormatter.max + 30.0f;
        float phaseY = this.mAnimator.getPhaseY();
        outputPath.reset();
        ?? entryForIndex = dataSet.getEntryForIndex(startIndex);
        outputPath.moveTo(entryForIndex.getX(), entryForIndex.getY());
        float f2 = f * phaseY;
        outputPath.lineTo(entryForIndex.getX(), f2);
        for (int i = startIndex + 1; i <= endIndex; i++) {
            outputPath.lineTo(dataSet.getEntryForIndex(i).getX(), f2);
        }
        while (endIndex > startIndex) {
            ?? entryForIndex2 = dataSet.getEntryForIndex(endIndex);
            outputPath.lineTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
            endIndex--;
        }
        outputPath.close();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.github.mikephil.charting.data.Entry] */
    private void generateAreaFilledPath(final com.github.mikephil.charting.interfaces.datasets.ILineDataSet dataSet, final int startIndex, final int endIndex, final android.graphics.Path outputPath, final powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.MinMaxFillFormatter fillFormatter) {
        float f = fillFormatter.min;
        float phaseY = this.mAnimator.getPhaseY();
        outputPath.reset();
        ?? entryForIndex = dataSet.getEntryForIndex(startIndex);
        outputPath.moveTo(entryForIndex.getX(), f);
        outputPath.lineTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
        for (int i = startIndex + 1; i <= endIndex; i++) {
            ?? entryForIndex2 = dataSet.getEntryForIndex(i);
            outputPath.lineTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
        }
        while (endIndex > startIndex) {
            outputPath.lineTo(dataSet.getEntryForIndex(endIndex).getX(), f * phaseY);
            endIndex--;
        }
        outputPath.close();
    }
}
