package com.github.mikephil.charting.data;

/* JADX INFO: loaded from: classes.dex */
public class BubbleDataSet extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleDataSet<com.github.mikephil.charting.data.BubbleEntry> implements com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet {
    private float mHighlightCircleWidth;
    protected float mMaxSize;
    protected boolean mNormalizeSize;

    public BubbleDataSet(java.util.List<com.github.mikephil.charting.data.BubbleEntry> list, java.lang.String str) {
        super(list, str);
        this.mNormalizeSize = true;
        this.mHighlightCircleWidth = 2.5f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet
    public void setHighlightCircleWidth(float f) {
        this.mHighlightCircleWidth = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet
    public float getHighlightCircleWidth() {
        return this.mHighlightCircleWidth;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.DataSet
    public void calcMinMax(com.github.mikephil.charting.data.BubbleEntry bubbleEntry) {
        super.calcMinMax(bubbleEntry);
        float size = bubbleEntry.getSize();
        if (size > this.mMaxSize) {
            this.mMaxSize = size;
        }
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.BubbleEntry> copy() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.mValues.size(); i++) {
            arrayList.add(((com.github.mikephil.charting.data.BubbleEntry) this.mValues.get(i)).copy());
        }
        com.github.mikephil.charting.data.BubbleDataSet bubbleDataSet = new com.github.mikephil.charting.data.BubbleDataSet(arrayList, getLabel());
        bubbleDataSet.mColors = this.mColors;
        bubbleDataSet.mHighLightColor = this.mHighLightColor;
        return bubbleDataSet;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet
    public float getMaxSize() {
        return this.mMaxSize;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet
    public boolean isNormalizeSizeEnabled() {
        return this.mNormalizeSize;
    }

    public void setNormalizeSizeEnabled(boolean z) {
        this.mNormalizeSize = z;
    }
}
