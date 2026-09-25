package com.github.mikephil.charting.highlight;

/* JADX INFO: loaded from: classes.dex */
public class RadarHighlighter extends com.github.mikephil.charting.highlight.PieRadarHighlighter<com.github.mikephil.charting.charts.RadarChart> {
    public RadarHighlighter(com.github.mikephil.charting.charts.RadarChart radarChart) {
        super(radarChart);
    }

    @Override // com.github.mikephil.charting.highlight.PieRadarHighlighter
    protected com.github.mikephil.charting.highlight.Highlight getClosestHighlight(int i, float f, float f2) {
        java.util.List<com.github.mikephil.charting.highlight.Highlight> highlightsAtIndex = getHighlightsAtIndex(i);
        float fDistanceToCenter = ((com.github.mikephil.charting.charts.RadarChart) this.mChart).distanceToCenter(f, f2) / ((com.github.mikephil.charting.charts.RadarChart) this.mChart).getFactor();
        com.github.mikephil.charting.highlight.Highlight highlight = null;
        float f3 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < highlightsAtIndex.size(); i2++) {
            com.github.mikephil.charting.highlight.Highlight highlight2 = highlightsAtIndex.get(i2);
            float fAbs = java.lang.Math.abs(highlight2.getY() - fDistanceToCenter);
            if (fAbs < f3) {
                highlight = highlight2;
                f3 = fAbs;
            }
        }
        return highlight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.github.mikephil.charting.data.Entry] */
    protected java.util.List<com.github.mikephil.charting.highlight.Highlight> getHighlightsAtIndex(int i) {
        this.mHighlightBuffer.clear();
        float phaseX = ((com.github.mikephil.charting.charts.RadarChart) this.mChart).getAnimator().getPhaseX();
        float phaseY = ((com.github.mikephil.charting.charts.RadarChart) this.mChart).getAnimator().getPhaseY();
        float sliceAngle = ((com.github.mikephil.charting.charts.RadarChart) this.mChart).getSliceAngle();
        float factor = ((com.github.mikephil.charting.charts.RadarChart) this.mChart).getFactor();
        com.github.mikephil.charting.utils.MPPointF mPPointF = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        for (int i2 = 0; i2 < ((com.github.mikephil.charting.data.RadarData) ((com.github.mikephil.charting.charts.RadarChart) this.mChart).getData()).getDataSetCount(); i2++) {
            com.github.mikephil.charting.interfaces.datasets.IRadarDataSet dataSetByIndex = ((com.github.mikephil.charting.data.RadarData) ((com.github.mikephil.charting.charts.RadarChart) this.mChart).getData()).getDataSetByIndex(i2);
            ?? entryForIndex = dataSetByIndex.getEntryForIndex(i);
            float f = i;
            com.github.mikephil.charting.utils.Utils.getPosition(((com.github.mikephil.charting.charts.RadarChart) this.mChart).getCenterOffsets(), (entryForIndex.getY() - ((com.github.mikephil.charting.charts.RadarChart) this.mChart).getYChartMin()) * factor * phaseY, (sliceAngle * f * phaseX) + ((com.github.mikephil.charting.charts.RadarChart) this.mChart).getRotationAngle(), mPPointF);
            this.mHighlightBuffer.add(new com.github.mikephil.charting.highlight.Highlight(f, entryForIndex.getY(), mPPointF.x, mPPointF.y, i2, dataSetByIndex.getAxisDependency()));
        }
        return this.mHighlightBuffer;
    }
}
