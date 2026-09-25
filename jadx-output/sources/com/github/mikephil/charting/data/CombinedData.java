package com.github.mikephil.charting.data;

/* JADX INFO: loaded from: classes.dex */
public class CombinedData extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleData<com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<? extends com.github.mikephil.charting.data.Entry>> {
    private com.github.mikephil.charting.data.BarData mBarData;
    private com.github.mikephil.charting.data.BubbleData mBubbleData;
    private com.github.mikephil.charting.data.CandleData mCandleData;
    private com.github.mikephil.charting.data.LineData mLineData;
    private com.github.mikephil.charting.data.ScatterData mScatterData;

    public void setData(com.github.mikephil.charting.data.LineData lineData) {
        this.mLineData = lineData;
        notifyDataChanged();
    }

    public void setData(com.github.mikephil.charting.data.BarData barData) {
        this.mBarData = barData;
        notifyDataChanged();
    }

    public void setData(com.github.mikephil.charting.data.ScatterData scatterData) {
        this.mScatterData = scatterData;
        notifyDataChanged();
    }

    public void setData(com.github.mikephil.charting.data.CandleData candleData) {
        this.mCandleData = candleData;
        notifyDataChanged();
    }

    public void setData(com.github.mikephil.charting.data.BubbleData bubbleData) {
        this.mBubbleData = bubbleData;
        notifyDataChanged();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.github.mikephil.charting.data.ChartData
    public void calcMinMax() {
        if (this.mDataSets == 0) {
            this.mDataSets = new java.util.ArrayList();
        }
        this.mDataSets.clear();
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        for (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData barLineScatterCandleBubbleData : getAllData()) {
            barLineScatterCandleBubbleData.calcMinMax();
            this.mDataSets.addAll((java.util.Collection<? extends T>) barLineScatterCandleBubbleData.getDataSets());
            if (barLineScatterCandleBubbleData.getYMax() > this.mYMax) {
                this.mYMax = barLineScatterCandleBubbleData.getYMax();
            }
            if (barLineScatterCandleBubbleData.getYMin() < this.mYMin) {
                this.mYMin = barLineScatterCandleBubbleData.getYMin();
            }
            if (barLineScatterCandleBubbleData.getXMax() > this.mXMax) {
                this.mXMax = barLineScatterCandleBubbleData.getXMax();
            }
            if (barLineScatterCandleBubbleData.getXMin() < this.mXMin) {
                this.mXMin = barLineScatterCandleBubbleData.getXMin();
            }
            if (barLineScatterCandleBubbleData.mLeftAxisMax > this.mLeftAxisMax) {
                this.mLeftAxisMax = barLineScatterCandleBubbleData.mLeftAxisMax;
            }
            if (barLineScatterCandleBubbleData.mLeftAxisMin < this.mLeftAxisMin) {
                this.mLeftAxisMin = barLineScatterCandleBubbleData.mLeftAxisMin;
            }
            if (barLineScatterCandleBubbleData.mRightAxisMax > this.mRightAxisMax) {
                this.mRightAxisMax = barLineScatterCandleBubbleData.mRightAxisMax;
            }
            if (barLineScatterCandleBubbleData.mRightAxisMin < this.mRightAxisMin) {
                this.mRightAxisMin = barLineScatterCandleBubbleData.mRightAxisMin;
            }
        }
    }

    public com.github.mikephil.charting.data.BubbleData getBubbleData() {
        return this.mBubbleData;
    }

    public com.github.mikephil.charting.data.LineData getLineData() {
        return this.mLineData;
    }

    public com.github.mikephil.charting.data.BarData getBarData() {
        return this.mBarData;
    }

    public com.github.mikephil.charting.data.ScatterData getScatterData() {
        return this.mScatterData;
    }

    public com.github.mikephil.charting.data.CandleData getCandleData() {
        return this.mCandleData;
    }

    public java.util.List<com.github.mikephil.charting.data.BarLineScatterCandleBubbleData> getAllData() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.github.mikephil.charting.data.LineData lineData = this.mLineData;
        if (lineData != null) {
            arrayList.add(lineData);
        }
        com.github.mikephil.charting.data.BarData barData = this.mBarData;
        if (barData != null) {
            arrayList.add(barData);
        }
        com.github.mikephil.charting.data.ScatterData scatterData = this.mScatterData;
        if (scatterData != null) {
            arrayList.add(scatterData);
        }
        com.github.mikephil.charting.data.CandleData candleData = this.mCandleData;
        if (candleData != null) {
            arrayList.add(candleData);
        }
        com.github.mikephil.charting.data.BubbleData bubbleData = this.mBubbleData;
        if (bubbleData != null) {
            arrayList.add(bubbleData);
        }
        return arrayList;
    }

    public com.github.mikephil.charting.data.BarLineScatterCandleBubbleData getDataByIndex(int i) {
        return getAllData().get(i);
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public void notifyDataChanged() {
        com.github.mikephil.charting.data.LineData lineData = this.mLineData;
        if (lineData != null) {
            lineData.notifyDataChanged();
        }
        com.github.mikephil.charting.data.BarData barData = this.mBarData;
        if (barData != null) {
            barData.notifyDataChanged();
        }
        com.github.mikephil.charting.data.CandleData candleData = this.mCandleData;
        if (candleData != null) {
            candleData.notifyDataChanged();
        }
        com.github.mikephil.charting.data.ScatterData scatterData = this.mScatterData;
        if (scatterData != null) {
            scatterData.notifyDataChanged();
        }
        com.github.mikephil.charting.data.BubbleData bubbleData = this.mBubbleData;
        if (bubbleData != null) {
            bubbleData.notifyDataChanged();
        }
        calcMinMax();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.github.mikephil.charting.interfaces.datasets.IDataSet] */
    @Override // com.github.mikephil.charting.data.ChartData
    public com.github.mikephil.charting.data.Entry getEntryForHighlight(com.github.mikephil.charting.highlight.Highlight highlight) {
        if (highlight.getDataIndex() >= getAllData().size()) {
            return null;
        }
        com.github.mikephil.charting.data.BarLineScatterCandleBubbleData dataByIndex = getDataByIndex(highlight.getDataIndex());
        if (highlight.getDataSetIndex() >= dataByIndex.getDataSetCount()) {
            return null;
        }
        for (com.github.mikephil.charting.data.Entry entry : dataByIndex.getDataSetByIndex(highlight.getDataSetIndex()).getEntriesForXValue(highlight.getX())) {
            if (entry.getY() == highlight.getY() || java.lang.Float.isNaN(highlight.getY())) {
                return entry;
            }
        }
        return null;
    }

    public com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<? extends com.github.mikephil.charting.data.Entry> getDataSetByHighlight(com.github.mikephil.charting.highlight.Highlight highlight) {
        if (highlight.getDataIndex() >= getAllData().size()) {
            return null;
        }
        com.github.mikephil.charting.data.BarLineScatterCandleBubbleData dataByIndex = getDataByIndex(highlight.getDataIndex());
        if (highlight.getDataSetIndex() >= dataByIndex.getDataSetCount()) {
            return null;
        }
        return (com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet) dataByIndex.getDataSets().get(highlight.getDataSetIndex());
    }

    public int getDataIndex(com.github.mikephil.charting.data.ChartData chartData) {
        return getAllData().indexOf(chartData);
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public boolean removeDataSet(com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<? extends com.github.mikephil.charting.data.Entry> iBarLineScatterCandleBubbleDataSet) {
        java.util.Iterator<com.github.mikephil.charting.data.BarLineScatterCandleBubbleData> it = getAllData().iterator();
        boolean zRemoveDataSet = false;
        while (it.hasNext() && !(zRemoveDataSet = it.next().removeDataSet(iBarLineScatterCandleBubbleDataSet))) {
        }
        return zRemoveDataSet;
    }

    @Override // com.github.mikephil.charting.data.ChartData
    @java.lang.Deprecated
    public boolean removeDataSet(int i) {
        android.util.Log.e(com.github.mikephil.charting.charts.Chart.LOG_TAG, "removeDataSet(int index) not supported for CombinedData");
        return false;
    }

    @Override // com.github.mikephil.charting.data.ChartData
    @java.lang.Deprecated
    public boolean removeEntry(com.github.mikephil.charting.data.Entry entry, int i) {
        android.util.Log.e(com.github.mikephil.charting.charts.Chart.LOG_TAG, "removeEntry(...) not supported for CombinedData");
        return false;
    }

    @Override // com.github.mikephil.charting.data.ChartData
    @java.lang.Deprecated
    public boolean removeEntry(float f, int i) {
        android.util.Log.e(com.github.mikephil.charting.charts.Chart.LOG_TAG, "removeEntry(...) not supported for CombinedData");
        return false;
    }
}
