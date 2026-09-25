package com.github.mikephil.charting.formatter;

/* JADX INFO: loaded from: classes.dex */
public class IndexAxisValueFormatter implements com.github.mikephil.charting.formatter.IAxisValueFormatter {
    private int mValueCount;
    private java.lang.String[] mValues;

    public IndexAxisValueFormatter() {
        this.mValues = new java.lang.String[0];
        this.mValueCount = 0;
    }

    public IndexAxisValueFormatter(java.lang.String[] strArr) {
        this.mValues = new java.lang.String[0];
        this.mValueCount = 0;
        if (strArr != null) {
            setValues(strArr);
        }
    }

    public IndexAxisValueFormatter(java.util.Collection<java.lang.String> collection) {
        this.mValues = new java.lang.String[0];
        this.mValueCount = 0;
        if (collection != null) {
            setValues((java.lang.String[]) collection.toArray(new java.lang.String[collection.size()]));
        }
    }

    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    public java.lang.String getFormattedValue(float f, com.github.mikephil.charting.components.AxisBase axisBase) {
        int iRound = java.lang.Math.round(f);
        return (iRound < 0 || iRound >= this.mValueCount || iRound != ((int) f)) ? "" : this.mValues[iRound];
    }

    public java.lang.String[] getValues() {
        return this.mValues;
    }

    public void setValues(java.lang.String[] strArr) {
        if (strArr == null) {
            strArr = new java.lang.String[0];
        }
        this.mValues = strArr;
        this.mValueCount = strArr.length;
    }
}
