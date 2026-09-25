package com.github.mikephil.charting.data;

/* JADX INFO: loaded from: classes.dex */
public class BarData extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleData<com.github.mikephil.charting.interfaces.datasets.IBarDataSet> {
    private float mBarWidth;

    public BarData() {
        this.mBarWidth = 0.85f;
    }

    public BarData(com.github.mikephil.charting.interfaces.datasets.IBarDataSet... iBarDataSetArr) {
        super(iBarDataSetArr);
        this.mBarWidth = 0.85f;
    }

    public BarData(java.util.List<com.github.mikephil.charting.interfaces.datasets.IBarDataSet> list) {
        super(list);
        this.mBarWidth = 0.85f;
    }

    public void setBarWidth(float f) {
        this.mBarWidth = f;
    }

    public float getBarWidth() {
        return this.mBarWidth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void groupBars(float f, float f2, float f3) {
        com.github.mikephil.charting.data.BarEntry barEntry;
        if (this.mDataSets.size() <= 1) {
            throw new java.lang.RuntimeException("BarData needs to hold at least 2 BarDataSets to allow grouping.");
        }
        int entryCount = ((com.github.mikephil.charting.interfaces.datasets.IBarDataSet) getMaxEntryCountSet()).getEntryCount();
        float f4 = f2 / 2.0f;
        float f5 = f3 / 2.0f;
        float f6 = this.mBarWidth / 2.0f;
        float groupWidth = getGroupWidth(f2, f3);
        for (int i = 0; i < entryCount; i++) {
            float f7 = f + f4;
            for (T t : this.mDataSets) {
                float f8 = f7 + f5 + f6;
                if (i < t.getEntryCount() && (barEntry = (com.github.mikephil.charting.data.BarEntry) t.getEntryForIndex(i)) != null) {
                    barEntry.setX(f8);
                }
                f7 = f8 + f6 + f5;
            }
            float f9 = f7 + f4;
            float f10 = groupWidth - (f9 - f);
            if (f10 > 0.0f || f10 < 0.0f) {
                f9 += f10;
            }
            f = f9;
        }
        notifyDataChanged();
    }

    public float getGroupWidth(float f, float f2) {
        return (this.mDataSets.size() * (this.mBarWidth + f2)) + f;
    }
}
