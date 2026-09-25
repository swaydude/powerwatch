package com.github.mikephil.charting.data;

/* JADX INFO: loaded from: classes.dex */
public class PieData extends com.github.mikephil.charting.data.ChartData<com.github.mikephil.charting.interfaces.datasets.IPieDataSet> {
    public PieData() {
    }

    public PieData(com.github.mikephil.charting.interfaces.datasets.IPieDataSet iPieDataSet) {
        super(iPieDataSet);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void setDataSet(com.github.mikephil.charting.interfaces.datasets.IPieDataSet iPieDataSet) {
        this.mDataSets.clear();
        this.mDataSets.add(iPieDataSet);
        notifyDataChanged();
    }

    public com.github.mikephil.charting.interfaces.datasets.IPieDataSet getDataSet() {
        return (com.github.mikephil.charting.interfaces.datasets.IPieDataSet) this.mDataSets.get(0);
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public com.github.mikephil.charting.interfaces.datasets.IPieDataSet getDataSetByIndex(int i) {
        if (i == 0) {
            return getDataSet();
        }
        return null;
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public com.github.mikephil.charting.interfaces.datasets.IPieDataSet getDataSetByLabel(java.lang.String str, boolean z) {
        if (z) {
            if (str.equalsIgnoreCase(((com.github.mikephil.charting.interfaces.datasets.IPieDataSet) this.mDataSets.get(0)).getLabel())) {
                return (com.github.mikephil.charting.interfaces.datasets.IPieDataSet) this.mDataSets.get(0);
            }
            return null;
        }
        if (str.equals(((com.github.mikephil.charting.interfaces.datasets.IPieDataSet) this.mDataSets.get(0)).getLabel())) {
            return (com.github.mikephil.charting.interfaces.datasets.IPieDataSet) this.mDataSets.get(0);
        }
        return null;
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public com.github.mikephil.charting.data.Entry getEntryForHighlight(com.github.mikephil.charting.highlight.Highlight highlight) {
        return getDataSet().getEntryForIndex((int) highlight.getX());
    }

    public float getYValueSum() {
        float y = 0.0f;
        for (int i = 0; i < getDataSet().getEntryCount(); i++) {
            y += getDataSet().getEntryForIndex(i).getY();
        }
        return y;
    }
}
