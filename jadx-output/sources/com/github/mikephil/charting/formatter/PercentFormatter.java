package com.github.mikephil.charting.formatter;

/* JADX INFO: loaded from: classes.dex */
public class PercentFormatter implements com.github.mikephil.charting.formatter.IValueFormatter, com.github.mikephil.charting.formatter.IAxisValueFormatter {
    protected java.text.DecimalFormat mFormat;

    public int getDecimalDigits() {
        return 1;
    }

    public PercentFormatter() {
        this.mFormat = new java.text.DecimalFormat("###,###,##0.0");
    }

    public PercentFormatter(java.text.DecimalFormat decimalFormat) {
        this.mFormat = decimalFormat;
    }

    @Override // com.github.mikephil.charting.formatter.IValueFormatter
    public java.lang.String getFormattedValue(float f, com.github.mikephil.charting.data.Entry entry, int i, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        return this.mFormat.format(f) + " %";
    }

    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    public java.lang.String getFormattedValue(float f, com.github.mikephil.charting.components.AxisBase axisBase) {
        return this.mFormat.format(f) + " %";
    }
}
