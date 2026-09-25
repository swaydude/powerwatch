package com.github.mikephil.charting.components;

/* JADX INFO: loaded from: classes.dex */
public abstract class AxisBase extends com.github.mikephil.charting.components.ComponentBase {
    protected com.github.mikephil.charting.formatter.IAxisValueFormatter mAxisValueFormatter;
    public int mDecimals;
    public int mEntryCount;
    protected java.util.List<com.github.mikephil.charting.components.LimitLine> mLimitLines;
    private int mGridColor = -7829368;
    private float mGridLineWidth = 1.0f;
    private int mAxisLineColor = -7829368;
    private float mAxisLineWidth = 1.0f;
    public float[] mEntries = new float[0];
    public float[] mCenteredEntries = new float[0];
    private int mLabelCount = 6;
    protected float mGranularity = 1.0f;
    protected boolean mGranularityEnabled = false;
    protected boolean mForceLabels = false;
    protected boolean mDrawGridLines = true;
    protected boolean mDrawAxisLine = true;
    protected boolean mDrawLabels = true;
    protected boolean mCenterAxisLabels = false;
    private android.graphics.DashPathEffect mAxisLineDashPathEffect = null;
    private android.graphics.DashPathEffect mGridDashPathEffect = null;
    protected boolean mDrawLimitLineBehindData = false;
    protected float mSpaceMin = 0.0f;
    protected float mSpaceMax = 0.0f;
    protected boolean mCustomAxisMin = false;
    protected boolean mCustomAxisMax = false;
    public float mAxisMaximum = 0.0f;
    public float mAxisMinimum = 0.0f;
    public float mAxisRange = 0.0f;

    public AxisBase() {
        this.mTextSize = com.github.mikephil.charting.utils.Utils.convertDpToPixel(10.0f);
        this.mXOffset = com.github.mikephil.charting.utils.Utils.convertDpToPixel(5.0f);
        this.mYOffset = com.github.mikephil.charting.utils.Utils.convertDpToPixel(5.0f);
        this.mLimitLines = new java.util.ArrayList();
    }

    public void setDrawGridLines(boolean z) {
        this.mDrawGridLines = z;
    }

    public boolean isDrawGridLinesEnabled() {
        return this.mDrawGridLines;
    }

    public void setDrawAxisLine(boolean z) {
        this.mDrawAxisLine = z;
    }

    public boolean isDrawAxisLineEnabled() {
        return this.mDrawAxisLine;
    }

    public void setCenterAxisLabels(boolean z) {
        this.mCenterAxisLabels = z;
    }

    public boolean isCenterAxisLabelsEnabled() {
        return this.mCenterAxisLabels && this.mEntryCount > 0;
    }

    public void setGridColor(int i) {
        this.mGridColor = i;
    }

    public int getGridColor() {
        return this.mGridColor;
    }

    public void setAxisLineWidth(float f) {
        this.mAxisLineWidth = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public float getAxisLineWidth() {
        return this.mAxisLineWidth;
    }

    public void setGridLineWidth(float f) {
        this.mGridLineWidth = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public float getGridLineWidth() {
        return this.mGridLineWidth;
    }

    public void setAxisLineColor(int i) {
        this.mAxisLineColor = i;
    }

    public int getAxisLineColor() {
        return this.mAxisLineColor;
    }

    public void setDrawLabels(boolean z) {
        this.mDrawLabels = z;
    }

    public boolean isDrawLabelsEnabled() {
        return this.mDrawLabels;
    }

    public void setLabelCount(int i) {
        if (i > 25) {
            i = 25;
        }
        if (i < 2) {
            i = 2;
        }
        this.mLabelCount = i;
        this.mForceLabels = false;
    }

    public void setLabelCount(int i, boolean z) {
        setLabelCount(i);
        this.mForceLabels = z;
    }

    public boolean isForceLabelsEnabled() {
        return this.mForceLabels;
    }

    public int getLabelCount() {
        return this.mLabelCount;
    }

    public boolean isGranularityEnabled() {
        return this.mGranularityEnabled;
    }

    public void setGranularityEnabled(boolean z) {
        this.mGranularityEnabled = z;
    }

    public float getGranularity() {
        return this.mGranularity;
    }

    public void setGranularity(float f) {
        this.mGranularity = f;
        this.mGranularityEnabled = true;
    }

    public void addLimitLine(com.github.mikephil.charting.components.LimitLine limitLine) {
        this.mLimitLines.add(limitLine);
        if (this.mLimitLines.size() > 6) {
            android.util.Log.e("MPAndroiChart", "Warning! You have more than 6 LimitLines on your axis, do you really want that?");
        }
    }

    public void removeLimitLine(com.github.mikephil.charting.components.LimitLine limitLine) {
        this.mLimitLines.remove(limitLine);
    }

    public void removeAllLimitLines() {
        this.mLimitLines.clear();
    }

    public java.util.List<com.github.mikephil.charting.components.LimitLine> getLimitLines() {
        return this.mLimitLines;
    }

    public void setDrawLimitLinesBehindData(boolean z) {
        this.mDrawLimitLineBehindData = z;
    }

    public boolean isDrawLimitLinesBehindDataEnabled() {
        return this.mDrawLimitLineBehindData;
    }

    public java.lang.String getLongestLabel() {
        java.lang.String str = "";
        for (int i = 0; i < this.mEntries.length; i++) {
            java.lang.String formattedLabel = getFormattedLabel(i);
            if (formattedLabel != null && str.length() < formattedLabel.length()) {
                str = formattedLabel;
            }
        }
        return str;
    }

    public java.lang.String getFormattedLabel(int i) {
        return (i < 0 || i >= this.mEntries.length) ? "" : getValueFormatter().getFormattedValue(this.mEntries[i], this);
    }

    public void setValueFormatter(com.github.mikephil.charting.formatter.IAxisValueFormatter iAxisValueFormatter) {
        if (iAxisValueFormatter == null) {
            this.mAxisValueFormatter = new com.github.mikephil.charting.formatter.DefaultAxisValueFormatter(this.mDecimals);
        } else {
            this.mAxisValueFormatter = iAxisValueFormatter;
        }
    }

    public com.github.mikephil.charting.formatter.IAxisValueFormatter getValueFormatter() {
        com.github.mikephil.charting.formatter.IAxisValueFormatter iAxisValueFormatter = this.mAxisValueFormatter;
        if (iAxisValueFormatter == null || ((iAxisValueFormatter instanceof com.github.mikephil.charting.formatter.DefaultAxisValueFormatter) && ((com.github.mikephil.charting.formatter.DefaultAxisValueFormatter) iAxisValueFormatter).getDecimalDigits() != this.mDecimals)) {
            this.mAxisValueFormatter = new com.github.mikephil.charting.formatter.DefaultAxisValueFormatter(this.mDecimals);
        }
        return this.mAxisValueFormatter;
    }

    public void enableGridDashedLine(float f, float f2, float f3) {
        this.mGridDashPathEffect = new android.graphics.DashPathEffect(new float[]{f, f2}, f3);
    }

    public void setGridDashedLine(android.graphics.DashPathEffect dashPathEffect) {
        this.mGridDashPathEffect = dashPathEffect;
    }

    public void disableGridDashedLine() {
        this.mGridDashPathEffect = null;
    }

    public boolean isGridDashedLineEnabled() {
        return this.mGridDashPathEffect != null;
    }

    public android.graphics.DashPathEffect getGridDashPathEffect() {
        return this.mGridDashPathEffect;
    }

    public void enableAxisLineDashedLine(float f, float f2, float f3) {
        this.mAxisLineDashPathEffect = new android.graphics.DashPathEffect(new float[]{f, f2}, f3);
    }

    public void setAxisLineDashedLine(android.graphics.DashPathEffect dashPathEffect) {
        this.mAxisLineDashPathEffect = dashPathEffect;
    }

    public void disableAxisLineDashedLine() {
        this.mAxisLineDashPathEffect = null;
    }

    public boolean isAxisLineDashedLineEnabled() {
        return this.mAxisLineDashPathEffect != null;
    }

    public android.graphics.DashPathEffect getAxisLineDashPathEffect() {
        return this.mAxisLineDashPathEffect;
    }

    public float getAxisMaximum() {
        return this.mAxisMaximum;
    }

    public float getAxisMinimum() {
        return this.mAxisMinimum;
    }

    public void resetAxisMaximum() {
        this.mCustomAxisMax = false;
    }

    public boolean isAxisMaxCustom() {
        return this.mCustomAxisMax;
    }

    public void resetAxisMinimum() {
        this.mCustomAxisMin = false;
    }

    public boolean isAxisMinCustom() {
        return this.mCustomAxisMin;
    }

    public void setAxisMinimum(float f) {
        this.mCustomAxisMin = true;
        this.mAxisMinimum = f;
        this.mAxisRange = java.lang.Math.abs(this.mAxisMaximum - f);
    }

    @java.lang.Deprecated
    public void setAxisMinValue(float f) {
        setAxisMinimum(f);
    }

    public void setAxisMaximum(float f) {
        this.mCustomAxisMax = true;
        this.mAxisMaximum = f;
        this.mAxisRange = java.lang.Math.abs(f - this.mAxisMinimum);
    }

    @java.lang.Deprecated
    public void setAxisMaxValue(float f) {
        setAxisMaximum(f);
    }

    public void calculate(float f, float f2) {
        float f3 = this.mCustomAxisMin ? this.mAxisMinimum : f - this.mSpaceMin;
        float f4 = this.mCustomAxisMax ? this.mAxisMaximum : f2 + this.mSpaceMax;
        if (java.lang.Math.abs(f4 - f3) == 0.0f) {
            f4 += 1.0f;
            f3 -= 1.0f;
        }
        this.mAxisMinimum = f3;
        this.mAxisMaximum = f4;
        this.mAxisRange = java.lang.Math.abs(f4 - f3);
    }

    public float getSpaceMin() {
        return this.mSpaceMin;
    }

    public void setSpaceMin(float f) {
        this.mSpaceMin = f;
    }

    public float getSpaceMax() {
        return this.mSpaceMax;
    }

    public void setSpaceMax(float f) {
        this.mSpaceMax = f;
    }
}
