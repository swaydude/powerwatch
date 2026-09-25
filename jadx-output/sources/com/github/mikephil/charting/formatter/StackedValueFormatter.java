package com.github.mikephil.charting.formatter;

/* JADX INFO: loaded from: classes.dex */
public class StackedValueFormatter implements com.github.mikephil.charting.formatter.IValueFormatter {
    private java.lang.String mAppendix;
    private boolean mDrawWholeStack;
    private java.text.DecimalFormat mFormat;

    public StackedValueFormatter(boolean z, java.lang.String str, int i) {
        this.mDrawWholeStack = z;
        this.mAppendix = str;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.mFormat = new java.text.DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // com.github.mikephil.charting.formatter.IValueFormatter
    public java.lang.String getFormattedValue(float f, com.github.mikephil.charting.data.Entry entry, int i, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        com.github.mikephil.charting.data.BarEntry barEntry;
        float[] yVals;
        if (this.mDrawWholeStack || !(entry instanceof com.github.mikephil.charting.data.BarEntry) || (yVals = (barEntry = (com.github.mikephil.charting.data.BarEntry) entry).getYVals()) == null) {
            return this.mFormat.format(f) + this.mAppendix;
        }
        if (yVals[yVals.length - 1] != f) {
            return "";
        }
        return this.mFormat.format(barEntry.getY()) + this.mAppendix;
    }
}
