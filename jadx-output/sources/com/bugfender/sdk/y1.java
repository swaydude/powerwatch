package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class y1 extends java.text.DateFormat {
    private static final long a = 1;
    private static java.util.Calendar b = new java.util.GregorianCalendar();
    private static java.text.NumberFormat c = new java.text.DecimalFormat();
    private static com.bugfender.sdk.y1 d;

    private y1() {
        ((java.text.DateFormat) this).numberFormat = c;
        ((java.text.DateFormat) this).calendar = b;
    }

    public static com.bugfender.sdk.y1 a() {
        if (d == null) {
            synchronized (com.bugfender.sdk.y1.class) {
                if (d == null) {
                    d = new com.bugfender.sdk.y1();
                }
            }
        }
        return d;
    }

    @Override // java.text.DateFormat
    public java.lang.StringBuffer format(java.util.Date date, java.lang.StringBuffer stringBuffer, java.text.FieldPosition fieldPosition) {
        stringBuffer.append(com.bugfender.sdk.r0.a(date, true));
        return stringBuffer;
    }

    @Override // java.text.DateFormat
    public java.util.Date parse(java.lang.String str, java.text.ParsePosition parsePosition) {
        parsePosition.setIndex(str.length());
        return com.bugfender.sdk.r0.a(str);
    }
}
