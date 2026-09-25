package kotlin.text;

/* JADX INFO: compiled from: _StringsJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\f\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a)\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\t\u001a)\u0010\u0005\u001a\u00020\n*\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000b\u001a\u0010\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r*\u00020\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"elementAt", "", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "sumOf", "Ljava/math/BigDecimal;", "selector", "Lkotlin/Function1;", "sumOfBigDecimal", "Ljava/math/BigInteger;", "sumOfBigInteger", "toSortedSet", "Ljava/util/SortedSet;", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/text/StringsKt")
class StringsKt___StringsJvmKt extends kotlin.text.StringsKt__StringsKt {
    private static final char elementAt(java.lang.CharSequence charSequence, int i) {
        return charSequence.charAt(i);
    }

    public static final java.util.SortedSet<java.lang.Character> toSortedSet(java.lang.CharSequence toSortedSet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toSortedSet, "$this$toSortedSet");
        return (java.util.SortedSet) kotlin.text.StringsKt.toCollection(toSortedSet, new java.util.TreeSet());
    }

    private static final java.math.BigDecimal sumOfBigDecimal(java.lang.CharSequence charSequence, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends java.math.BigDecimal> function1) {
        java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "BigDecimal.valueOf(this.toLong())");
        for (int i = 0; i < charSequence.length(); i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(java.lang.Character.valueOf(charSequence.charAt(i))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    private static final java.math.BigInteger sumOfBigInteger(java.lang.CharSequence charSequence, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends java.math.BigInteger> function1) {
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "BigInteger.valueOf(this.toLong())");
        for (int i = 0; i < charSequence.length(); i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(java.lang.Character.valueOf(charSequence.charAt(i))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }
}
