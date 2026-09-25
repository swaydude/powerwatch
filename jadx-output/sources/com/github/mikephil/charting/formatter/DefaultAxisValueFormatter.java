package com.github.mikephil.charting.formatter;

/* JADX INFO: loaded from: classes.dex */
public class DefaultAxisValueFormatter implements com.github.mikephil.charting.formatter.IAxisValueFormatter {
    protected int digits;
    protected java.text.DecimalFormat mFormat;

    public DefaultAxisValueFormatter(int i) {
        this.digits = 0;
        this.digits = i;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.mFormat = new java.text.DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    public java.lang.String getFormattedValue(float f, com.github.mikephil.charting.components.AxisBase axisBase) {
        return this.mFormat.format(f);
    }

    public int getDecimalDigits() {
        return this.digits;
    }
}
