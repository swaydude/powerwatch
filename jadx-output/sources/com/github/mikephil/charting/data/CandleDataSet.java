package com.github.mikephil.charting.data;

/* JADX INFO: loaded from: classes.dex */
public class CandleDataSet extends com.github.mikephil.charting.data.LineScatterCandleRadarDataSet<com.github.mikephil.charting.data.CandleEntry> implements com.github.mikephil.charting.interfaces.datasets.ICandleDataSet {
    private float mBarSpace;
    protected int mDecreasingColor;
    protected android.graphics.Paint.Style mDecreasingPaintStyle;
    protected int mIncreasingColor;
    protected android.graphics.Paint.Style mIncreasingPaintStyle;
    protected int mNeutralColor;
    protected int mShadowColor;
    private boolean mShadowColorSameAsCandle;
    private float mShadowWidth;
    private boolean mShowCandleBar;

    public CandleDataSet(java.util.List<com.github.mikephil.charting.data.CandleEntry> list, java.lang.String str) {
        super(list, str);
        this.mShadowWidth = 3.0f;
        this.mShowCandleBar = true;
        this.mBarSpace = 0.1f;
        this.mShadowColorSameAsCandle = false;
        this.mIncreasingPaintStyle = android.graphics.Paint.Style.STROKE;
        this.mDecreasingPaintStyle = android.graphics.Paint.Style.FILL;
        this.mNeutralColor = com.github.mikephil.charting.utils.ColorTemplate.COLOR_SKIP;
        this.mIncreasingColor = com.github.mikephil.charting.utils.ColorTemplate.COLOR_SKIP;
        this.mDecreasingColor = com.github.mikephil.charting.utils.ColorTemplate.COLOR_SKIP;
        this.mShadowColor = com.github.mikephil.charting.utils.ColorTemplate.COLOR_SKIP;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.CandleEntry> copy() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.clear();
        for (int i = 0; i < this.mValues.size(); i++) {
            arrayList.add(((com.github.mikephil.charting.data.CandleEntry) this.mValues.get(i)).copy());
        }
        com.github.mikephil.charting.data.CandleDataSet candleDataSet = new com.github.mikephil.charting.data.CandleDataSet(arrayList, getLabel());
        candleDataSet.mColors = this.mColors;
        candleDataSet.mShadowWidth = this.mShadowWidth;
        candleDataSet.mShowCandleBar = this.mShowCandleBar;
        candleDataSet.mBarSpace = this.mBarSpace;
        candleDataSet.mHighLightColor = this.mHighLightColor;
        candleDataSet.mIncreasingPaintStyle = this.mIncreasingPaintStyle;
        candleDataSet.mDecreasingPaintStyle = this.mDecreasingPaintStyle;
        candleDataSet.mShadowColor = this.mShadowColor;
        return candleDataSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.DataSet
    public void calcMinMax(com.github.mikephil.charting.data.CandleEntry candleEntry) {
        if (candleEntry.getLow() < this.mYMin) {
            this.mYMin = candleEntry.getLow();
        }
        if (candleEntry.getHigh() > this.mYMax) {
            this.mYMax = candleEntry.getHigh();
        }
        calcMinMaxX(candleEntry);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.DataSet
    public void calcMinMaxY(com.github.mikephil.charting.data.CandleEntry candleEntry) {
        if (candleEntry.getHigh() < this.mYMin) {
            this.mYMin = candleEntry.getHigh();
        }
        if (candleEntry.getHigh() > this.mYMax) {
            this.mYMax = candleEntry.getHigh();
        }
        if (candleEntry.getLow() < this.mYMin) {
            this.mYMin = candleEntry.getLow();
        }
        if (candleEntry.getLow() > this.mYMax) {
            this.mYMax = candleEntry.getLow();
        }
    }

    public void setBarSpace(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 0.45f) {
            f = 0.45f;
        }
        this.mBarSpace = f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public float getBarSpace() {
        return this.mBarSpace;
    }

    public void setShadowWidth(float f) {
        this.mShadowWidth = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public float getShadowWidth() {
        return this.mShadowWidth;
    }

    public void setShowCandleBar(boolean z) {
        this.mShowCandleBar = z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public boolean getShowCandleBar() {
        return this.mShowCandleBar;
    }

    public void setNeutralColor(int i) {
        this.mNeutralColor = i;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public int getNeutralColor() {
        return this.mNeutralColor;
    }

    public void setIncreasingColor(int i) {
        this.mIncreasingColor = i;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public int getIncreasingColor() {
        return this.mIncreasingColor;
    }

    public void setDecreasingColor(int i) {
        this.mDecreasingColor = i;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public int getDecreasingColor() {
        return this.mDecreasingColor;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public android.graphics.Paint.Style getIncreasingPaintStyle() {
        return this.mIncreasingPaintStyle;
    }

    public void setIncreasingPaintStyle(android.graphics.Paint.Style style) {
        this.mIncreasingPaintStyle = style;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public android.graphics.Paint.Style getDecreasingPaintStyle() {
        return this.mDecreasingPaintStyle;
    }

    public void setDecreasingPaintStyle(android.graphics.Paint.Style style) {
        this.mDecreasingPaintStyle = style;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public int getShadowColor() {
        return this.mShadowColor;
    }

    public void setShadowColor(int i) {
        this.mShadowColor = i;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public boolean getShadowColorSameAsCandle() {
        return this.mShadowColorSameAsCandle;
    }

    public void setShadowColorSameAsCandle(boolean z) {
        this.mShadowColorSameAsCandle = z;
    }
}
