package com.github.mikephil.charting.formatter;

/* JADX INFO: loaded from: classes.dex */
public class LargeValueFormatter implements com.github.mikephil.charting.formatter.IValueFormatter, com.github.mikephil.charting.formatter.IAxisValueFormatter {
    private static final int MAX_LENGTH = 5;
    private static java.lang.String[] SUFFIX = {"", "k", "m", "b", "t"};
    private java.text.DecimalFormat mFormat;
    private java.lang.String mText;

    public int getDecimalDigits() {
        return 0;
    }

    public LargeValueFormatter() {
        this.mText = "";
        this.mFormat = new java.text.DecimalFormat("###E00");
    }

    public LargeValueFormatter(java.lang.String str) {
        this();
        this.mText = str;
    }

    @Override // com.github.mikephil.charting.formatter.IValueFormatter
    public java.lang.String getFormattedValue(float f, com.github.mikephil.charting.data.Entry entry, int i, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        return makePretty(f) + this.mText;
    }

    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    public java.lang.String getFormattedValue(float f, com.github.mikephil.charting.components.AxisBase axisBase) {
        return makePretty(f) + this.mText;
    }

    public void setAppendix(java.lang.String str) {
        this.mText = str;
    }

    public void setSuffix(java.lang.String[] strArr) {
        SUFFIX = strArr;
    }

    private java.lang.String makePretty(double d) {
        java.lang.String str = this.mFormat.format(d);
        int numericValue = java.lang.Character.getNumericValue(str.charAt(str.length() - 1));
        java.lang.String strReplaceAll = str.replaceAll("E[0-9][0-9]", SUFFIX[java.lang.Integer.valueOf(java.lang.Character.getNumericValue(str.charAt(str.length() - 2)) + "" + numericValue).intValue() / 3]);
        while (true) {
            if (strReplaceAll.length() <= 5 && !strReplaceAll.matches("[0-9]+\\.[a-z]")) {
                return strReplaceAll;
            }
            strReplaceAll = strReplaceAll.substring(0, strReplaceAll.length() - 2) + strReplaceAll.substring(strReplaceAll.length() - 1);
        }
    }
}
