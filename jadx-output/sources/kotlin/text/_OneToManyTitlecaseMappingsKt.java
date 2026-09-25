package kotlin.text;

/* JADX INFO: compiled from: _OneToManyTitlecaseMappings.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\f\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"titlecaseImpl", "", "", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
public final class _OneToManyTitlecaseMappingsKt {
    public static final java.lang.String titlecaseImpl(char c) {
        java.lang.String strValueOf = java.lang.String.valueOf(c);
        java.util.Objects.requireNonNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        java.lang.String upperCase = strValueOf.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
        if (upperCase.length() <= 1) {
            return java.lang.String.valueOf(java.lang.Character.toTitleCase(c));
        }
        if (c == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        java.util.Objects.requireNonNull(upperCase, "null cannot be cast to non-null type java.lang.String");
        java.lang.String strSubstring = upperCase.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
        java.util.Objects.requireNonNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        java.lang.String lowerCase = strSubstring.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        return java.lang.String.valueOf(cCharAt) + lowerCase;
    }
}
