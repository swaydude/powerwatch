package com.github.mikephil.charting.data;

/* JADX INFO: loaded from: classes.dex */
public class RadarData extends com.github.mikephil.charting.data.ChartData<com.github.mikephil.charting.interfaces.datasets.IRadarDataSet> {
    private java.util.List<java.lang.String> mLabels;

    public RadarData() {
    }

    public RadarData(java.util.List<com.github.mikephil.charting.interfaces.datasets.IRadarDataSet> list) {
        super(list);
    }

    public RadarData(com.github.mikephil.charting.interfaces.datasets.IRadarDataSet... iRadarDataSetArr) {
        super(iRadarDataSetArr);
    }

    public void setLabels(java.util.List<java.lang.String> list) {
        this.mLabels = list;
    }

    public void setLabels(java.lang.String... strArr) {
        this.mLabels = java.util.Arrays.asList(strArr);
    }

    public java.util.List<java.lang.String> getLabels() {
        return this.mLabels;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.data.ChartData
    public com.github.mikephil.charting.data.Entry getEntryForHighlight(com.github.mikephil.charting.highlight.Highlight highlight) {
        return getDataSetByIndex(highlight.getDataSetIndex()).getEntryForIndex((int) highlight.getX());
    }
}
