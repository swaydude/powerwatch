package powerwatch.matrix.com.pwgen2android.shared.extensions;

/* JADX INFO: compiled from: NumberExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0003\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u0012\u0010\u000b\u001a\u00020\u0003*\u00020\b2\u0006\u0010\t\u001a\u00020\u0003\u001a\u0012\u0010\u000b\u001a\u00020\u0003*\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a$\u0010\f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\b\u001a\n\u0010\u0013\u001a\u00020\u0012*\u00020\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u001a\n\u0010\u0017\u001a\u00020\u0012*\u00020\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"createMask", "Lkotlin/UInt;", "a", "", "b", "(II)I", "divide", "", "", "divideIndex", "", "divideRounded", "extractNumber", "low", "high", "useSign", "", "formatByLocale", "", "oneDecimalFormat", "", "toFloatingNumber", "bias", "twoDecimalsFormat", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class NumberExtensionsKt {
    public static final java.lang.String twoDecimalsFormat(float f) {
        java.lang.String str = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(this, *args)");
        return str;
    }

    public static final java.lang.String oneDecimalFormat(float f) {
        java.lang.String str = java.lang.String.format("%.1f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(this, *args)");
        return str;
    }

    public static final java.lang.String formatByLocale(java.lang.Number number) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "<this>");
        java.lang.String str = java.text.NumberFormat.getNumberInstance().format(number);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "getNumberInstance().format(this)");
        return str;
    }

    public static /* synthetic */ int extractNumber$default(int i, int i2, int i3, boolean z, int i4, java.lang.Object obj) {
        if ((i4 & 4) != 0) {
            z = false;
        }
        return extractNumber(i, i2, i3, z);
    }

    public static final int extractNumber(int i, int i2, int i3, boolean z) {
        int iM107constructorimpl = kotlin.UInt.m107constructorimpl(kotlin.UInt.m107constructorimpl(kotlin.UInt.m107constructorimpl(i) & createMask(i3, i2)) >>> i2);
        if (!z) {
            return iM107constructorimpl;
        }
        int i4 = i3 - i2;
        return iM107constructorimpl > ((int) java.lang.Math.pow(2.0d, (double) i4)) + (-1) ? iM107constructorimpl - ((int) java.lang.Math.pow(2.0d, i4 + 1)) : iM107constructorimpl;
    }

    public static /* synthetic */ int toFloatingNumber$default(int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 3;
        }
        return toFloatingNumber(i, i2);
    }

    public static final int toFloatingNumber(int i, int i2) {
        int iExtractNumber$default = extractNumber$default(i, 0, i2 - 2, false, 4, null);
        int iExtractNumber$default2 = extractNumber$default(i, i2 - 1, (i2 * 2) - 1, false, 4, null);
        return iExtractNumber$default2 == 0 ? iExtractNumber$default : (int) (java.lang.Math.pow(2.0d, ((double) iExtractNumber$default2) + 1.0d) + (((double) iExtractNumber$default) * java.lang.Math.pow(2.0d, iExtractNumber$default2 - 1)));
    }

    public static final int createMask(int i, int i2) {
        int iM107constructorimpl = 0;
        while (i >= i2) {
            iM107constructorimpl = kotlin.UInt.m107constructorimpl(kotlin.UInt.m107constructorimpl(iM107constructorimpl << 1) | 1);
            i--;
        }
        while (i >= 0) {
            iM107constructorimpl = kotlin.UInt.m107constructorimpl(iM107constructorimpl << 1);
            i--;
        }
        return iM107constructorimpl;
    }

    public static final double divide(java.lang.Number number, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "<this>");
        return number.doubleValue() / j;
    }

    public static final double divide(java.lang.Number number, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "<this>");
        return divide(number, i);
    }

    public static final int divideRounded(java.lang.Number number, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "<this>");
        return kotlin.math.MathKt.roundToInt(number.doubleValue() / j);
    }

    public static final int divideRounded(java.lang.Number number, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "<this>");
        return divideRounded(number, i);
    }
}
