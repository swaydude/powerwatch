package kotlin;

/* JADX INFO: compiled from: BigDecimals.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\nH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\rH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u000eH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u000fH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u0001*\u00020\u0001H\u0087\n¨\u0006\u0011"}, d2 = {"dec", "Ljava/math/BigDecimal;", "div", com.google.android.gms.fitness.FitnessActivities.OTHER, "inc", "minus", "plus", "rem", "times", "toBigDecimal", "", "mathContext", "Ljava/math/MathContext;", "", "", "", "unaryMinus", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/NumbersKt")
class NumbersKt__BigDecimalsKt {
    private static final java.math.BigDecimal plus(java.math.BigDecimal plus, java.math.BigDecimal bigDecimal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plus, "$this$plus");
        java.math.BigDecimal bigDecimalAdd = plus.add(bigDecimal);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "this.add(other)");
        return bigDecimalAdd;
    }

    private static final java.math.BigDecimal minus(java.math.BigDecimal minus, java.math.BigDecimal bigDecimal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minus, "$this$minus");
        java.math.BigDecimal bigDecimalSubtract = minus.subtract(bigDecimal);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "this.subtract(other)");
        return bigDecimalSubtract;
    }

    private static final java.math.BigDecimal times(java.math.BigDecimal times, java.math.BigDecimal bigDecimal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(times, "$this$times");
        java.math.BigDecimal bigDecimalMultiply = times.multiply(bigDecimal);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "this.multiply(other)");
        return bigDecimalMultiply;
    }

    private static final java.math.BigDecimal div(java.math.BigDecimal div, java.math.BigDecimal bigDecimal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(div, "$this$div");
        java.math.BigDecimal bigDecimalDivide = div.divide(bigDecimal, java.math.RoundingMode.HALF_EVEN);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "this.divide(other, RoundingMode.HALF_EVEN)");
        return bigDecimalDivide;
    }

    private static final java.math.BigDecimal rem(java.math.BigDecimal rem, java.math.BigDecimal bigDecimal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rem, "$this$rem");
        java.math.BigDecimal bigDecimalRemainder = rem.remainder(bigDecimal);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalRemainder, "this.remainder(other)");
        return bigDecimalRemainder;
    }

    private static final java.math.BigDecimal unaryMinus(java.math.BigDecimal unaryMinus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unaryMinus, "$this$unaryMinus");
        java.math.BigDecimal bigDecimalNegate = unaryMinus.negate();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "this.negate()");
        return bigDecimalNegate;
    }

    private static final java.math.BigDecimal inc(java.math.BigDecimal inc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inc, "$this$inc");
        java.math.BigDecimal bigDecimalAdd = inc.add(java.math.BigDecimal.ONE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "this.add(BigDecimal.ONE)");
        return bigDecimalAdd;
    }

    private static final java.math.BigDecimal dec(java.math.BigDecimal dec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dec, "$this$dec");
        java.math.BigDecimal bigDecimalSubtract = dec.subtract(java.math.BigDecimal.ONE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "this.subtract(BigDecimal.ONE)");
        return bigDecimalSubtract;
    }

    private static final java.math.BigDecimal toBigDecimal(int i) {
        java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "BigDecimal.valueOf(this.toLong())");
        return bigDecimalValueOf;
    }

    private static final java.math.BigDecimal toBigDecimal(int i, java.math.MathContext mathContext) {
        return new java.math.BigDecimal(i, mathContext);
    }

    private static final java.math.BigDecimal toBigDecimal(long j) {
        java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(j);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "BigDecimal.valueOf(this)");
        return bigDecimalValueOf;
    }

    private static final java.math.BigDecimal toBigDecimal(long j, java.math.MathContext mathContext) {
        return new java.math.BigDecimal(j, mathContext);
    }

    private static final java.math.BigDecimal toBigDecimal(float f) {
        return new java.math.BigDecimal(java.lang.String.valueOf(f));
    }

    private static final java.math.BigDecimal toBigDecimal(float f, java.math.MathContext mathContext) {
        return new java.math.BigDecimal(java.lang.String.valueOf(f), mathContext);
    }

    private static final java.math.BigDecimal toBigDecimal(double d) {
        return new java.math.BigDecimal(java.lang.String.valueOf(d));
    }

    private static final java.math.BigDecimal toBigDecimal(double d, java.math.MathContext mathContext) {
        return new java.math.BigDecimal(java.lang.String.valueOf(d), mathContext);
    }
}
