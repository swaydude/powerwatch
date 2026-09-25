package kotlin.time;

/* JADX INFO: compiled from: formatToDecimals.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000\"\u001c\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"precisionFormats", "", "Ljava/lang/ThreadLocal;", "Ljava/text/DecimalFormat;", "[Ljava/lang/ThreadLocal;", "rootNegativeExpFormatSymbols", "Ljava/text/DecimalFormatSymbols;", "rootPositiveExpFormatSymbols", "scientificFormat", "createFormatForDecimals", "decimals", "", "formatScientific", "", "value", "", "formatToExactDecimals", "formatUpToDecimals", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
public final class FormatToDecimalsKt {
    private static final java.lang.ThreadLocal<java.text.DecimalFormat>[] precisionFormats;
    private static final java.text.DecimalFormatSymbols rootNegativeExpFormatSymbols;
    private static final java.text.DecimalFormatSymbols rootPositiveExpFormatSymbols;
    private static final java.lang.ThreadLocal<java.text.DecimalFormat> scientificFormat;

    static {
        java.text.DecimalFormatSymbols decimalFormatSymbols = new java.text.DecimalFormatSymbols(java.util.Locale.ROOT);
        decimalFormatSymbols.setExponentSeparator(com.baidu.mapsdkplatform.comapi.e.a);
        rootNegativeExpFormatSymbols = decimalFormatSymbols;
        java.text.DecimalFormatSymbols decimalFormatSymbols2 = new java.text.DecimalFormatSymbols(java.util.Locale.ROOT);
        decimalFormatSymbols2.setExponentSeparator("e+");
        rootPositiveExpFormatSymbols = decimalFormatSymbols2;
        java.lang.ThreadLocal<java.text.DecimalFormat>[] threadLocalArr = new java.lang.ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new java.lang.ThreadLocal<>();
        }
        precisionFormats = threadLocalArr;
        scientificFormat = new java.lang.ThreadLocal<>();
    }

    private static final java.text.DecimalFormat createFormatForDecimals(int i) {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0", rootNegativeExpFormatSymbols);
        if (i > 0) {
            decimalFormat.setMinimumFractionDigits(i);
        }
        decimalFormat.setRoundingMode(java.math.RoundingMode.HALF_UP);
        return decimalFormat;
    }

    public static final java.lang.String formatToExactDecimals(double d, int i) {
        java.text.DecimalFormat decimalFormatCreateFormatForDecimals;
        java.lang.ThreadLocal<java.text.DecimalFormat>[] threadLocalArr = precisionFormats;
        if (i < threadLocalArr.length) {
            java.lang.ThreadLocal<java.text.DecimalFormat> threadLocal = threadLocalArr[i];
            java.text.DecimalFormat decimalFormatCreateFormatForDecimals2 = threadLocal.get();
            if (decimalFormatCreateFormatForDecimals2 == null) {
                decimalFormatCreateFormatForDecimals2 = createFormatForDecimals(i);
                threadLocal.set(decimalFormatCreateFormatForDecimals2);
            }
            decimalFormatCreateFormatForDecimals = decimalFormatCreateFormatForDecimals2;
        } else {
            decimalFormatCreateFormatForDecimals = createFormatForDecimals(i);
        }
        java.lang.String str = decimalFormatCreateFormatForDecimals.format(d);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format.format(value)");
        return str;
    }

    public static final java.lang.String formatUpToDecimals(double d, int i) {
        java.text.DecimalFormat decimalFormatCreateFormatForDecimals = createFormatForDecimals(0);
        decimalFormatCreateFormatForDecimals.setMaximumFractionDigits(i);
        java.lang.String str = decimalFormatCreateFormatForDecimals.format(d);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "createFormatForDecimals(… }\n        .format(value)");
        return str;
    }

    public static final java.lang.String formatScientific(double d) {
        java.lang.ThreadLocal<java.text.DecimalFormat> threadLocal = scientificFormat;
        java.text.DecimalFormat decimalFormat = threadLocal.get();
        if (decimalFormat == null) {
            decimalFormat = new java.text.DecimalFormat("0E0", rootNegativeExpFormatSymbols);
            decimalFormat.setMinimumFractionDigits(2);
            threadLocal.set(decimalFormat);
        }
        java.text.DecimalFormat decimalFormat2 = decimalFormat;
        decimalFormat2.setDecimalFormatSymbols((d >= ((double) 1) || d <= ((double) (-1))) ? rootPositiveExpFormatSymbols : rootNegativeExpFormatSymbols);
        java.lang.String str = decimalFormat2.format(d);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "scientificFormat.getOrSe… }\n        .format(value)");
        return str;
    }
}
