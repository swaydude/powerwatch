package kotlin;

/* JADX INFO: compiled from: BigIntegers.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0087\f\u001a\u0015\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0087\f\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0010\u001a\u00020\u0011*\u00020\u0001H\u0087\b\u001a!\u0010\u0010\u001a\u00020\u0011*\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\rH\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\u0016H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f¨\u0006\u0019"}, d2 = {"and", "Ljava/math/BigInteger;", com.google.android.gms.fitness.FitnessActivities.OTHER, "dec", "div", "inc", "inv", "minus", "or", "plus", "rem", "shl", "n", "", "shr", "times", "toBigDecimal", "Ljava/math/BigDecimal;", "scale", "mathContext", "Ljava/math/MathContext;", "toBigInteger", "", "unaryMinus", "xor", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/NumbersKt")
class NumbersKt__BigIntegersKt extends kotlin.NumbersKt__BigDecimalsKt {
    private static final java.math.BigInteger plus(java.math.BigInteger plus, java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plus, "$this$plus");
        java.math.BigInteger bigIntegerAdd = plus.add(bigInteger);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "this.add(other)");
        return bigIntegerAdd;
    }

    private static final java.math.BigInteger minus(java.math.BigInteger minus, java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minus, "$this$minus");
        java.math.BigInteger bigIntegerSubtract = minus.subtract(bigInteger);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerSubtract, "this.subtract(other)");
        return bigIntegerSubtract;
    }

    private static final java.math.BigInteger times(java.math.BigInteger times, java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(times, "$this$times");
        java.math.BigInteger bigIntegerMultiply = times.multiply(bigInteger);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerMultiply, "this.multiply(other)");
        return bigIntegerMultiply;
    }

    private static final java.math.BigInteger div(java.math.BigInteger div, java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(div, "$this$div");
        java.math.BigInteger bigIntegerDivide = div.divide(bigInteger);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerDivide, "this.divide(other)");
        return bigIntegerDivide;
    }

    private static final java.math.BigInteger rem(java.math.BigInteger rem, java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rem, "$this$rem");
        java.math.BigInteger bigIntegerRemainder = rem.remainder(bigInteger);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerRemainder, "this.remainder(other)");
        return bigIntegerRemainder;
    }

    private static final java.math.BigInteger unaryMinus(java.math.BigInteger unaryMinus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unaryMinus, "$this$unaryMinus");
        java.math.BigInteger bigIntegerNegate = unaryMinus.negate();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerNegate, "this.negate()");
        return bigIntegerNegate;
    }

    private static final java.math.BigInteger inc(java.math.BigInteger inc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inc, "$this$inc");
        java.math.BigInteger bigIntegerAdd = inc.add(java.math.BigInteger.ONE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "this.add(BigInteger.ONE)");
        return bigIntegerAdd;
    }

    private static final java.math.BigInteger dec(java.math.BigInteger dec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dec, "$this$dec");
        java.math.BigInteger bigIntegerSubtract = dec.subtract(java.math.BigInteger.ONE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerSubtract, "this.subtract(BigInteger.ONE)");
        return bigIntegerSubtract;
    }

    private static final java.math.BigInteger inv(java.math.BigInteger bigInteger) {
        java.math.BigInteger bigIntegerNot = bigInteger.not();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerNot, "this.not()");
        return bigIntegerNot;
    }

    private static final java.math.BigInteger and(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        java.math.BigInteger bigIntegerAnd = bigInteger.and(bigInteger2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerAnd, "this.and(other)");
        return bigIntegerAnd;
    }

    private static final java.math.BigInteger or(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        java.math.BigInteger bigIntegerOr = bigInteger.or(bigInteger2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerOr, "this.or(other)");
        return bigIntegerOr;
    }

    private static final java.math.BigInteger xor(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        java.math.BigInteger bigIntegerXor = bigInteger.xor(bigInteger2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerXor, "this.xor(other)");
        return bigIntegerXor;
    }

    private static final java.math.BigInteger shl(java.math.BigInteger bigInteger, int i) {
        java.math.BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerShiftLeft, "this.shiftLeft(n)");
        return bigIntegerShiftLeft;
    }

    private static final java.math.BigInteger shr(java.math.BigInteger bigInteger, int i) {
        java.math.BigInteger bigIntegerShiftRight = bigInteger.shiftRight(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerShiftRight, "this.shiftRight(n)");
        return bigIntegerShiftRight;
    }

    private static final java.math.BigInteger toBigInteger(int i) {
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "BigInteger.valueOf(this.toLong())");
        return bigIntegerValueOf;
    }

    private static final java.math.BigInteger toBigInteger(long j) {
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(j);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "BigInteger.valueOf(this)");
        return bigIntegerValueOf;
    }

    private static final java.math.BigDecimal toBigDecimal(java.math.BigInteger bigInteger) {
        return new java.math.BigDecimal(bigInteger);
    }

    static /* synthetic */ java.math.BigDecimal toBigDecimal$default(java.math.BigInteger bigInteger, int i, java.math.MathContext mathContext, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            mathContext = java.math.MathContext.UNLIMITED;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mathContext, "MathContext.UNLIMITED");
        }
        return new java.math.BigDecimal(bigInteger, i, mathContext);
    }

    private static final java.math.BigDecimal toBigDecimal(java.math.BigInteger bigInteger, int i, java.math.MathContext mathContext) {
        return new java.math.BigDecimal(bigInteger, i, mathContext);
    }
}
