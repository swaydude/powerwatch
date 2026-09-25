package com.github.mikephil.charting.formatter;

/* JADX INFO: loaded from: classes.dex */
public class DefaultValueFormatter implements com.github.mikephil.charting.formatter.IValueFormatter {
    protected int mDecimalDigits;
    protected java.text.DecimalFormat mFormat;

    public DefaultValueFormatter(int i) {
        setup(i);
    }

    public void setup(int i) {
        this.mDecimalDigits = i;
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
        return this.mFormat.format(f);
    }

    public int getDecimalDigits() {
        return this.mDecimalDigits;
    }
}
