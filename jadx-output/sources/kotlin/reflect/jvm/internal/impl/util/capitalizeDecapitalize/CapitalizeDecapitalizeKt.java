package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

/* JADX INFO: compiled from: capitalizeDecapitalize.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CapitalizeDecapitalizeKt {
    public static final java.lang.String decapitalizeSmartForCompiler(java.lang.String decapitalizeSmartForCompiler, boolean z) {
        java.lang.Integer next;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(decapitalizeSmartForCompiler, "$this$decapitalizeSmartForCompiler");
        java.lang.String str = decapitalizeSmartForCompiler;
        if ((str.length() == 0) || !isUpperCaseCharAt(decapitalizeSmartForCompiler, 0, z)) {
            return decapitalizeSmartForCompiler;
        }
        if (decapitalizeSmartForCompiler.length() == 1 || !isUpperCaseCharAt(decapitalizeSmartForCompiler, 1, z)) {
            return z ? decapitalizeAsciiOnly(decapitalizeSmartForCompiler) : kotlin.text.StringsKt.decapitalize(decapitalizeSmartForCompiler);
        }
        java.util.Iterator<java.lang.Integer> it = kotlin.text.StringsKt.getIndices(str).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!isUpperCaseCharAt(decapitalizeSmartForCompiler, next.intValue(), z)));
        java.lang.Integer num = next;
        if (num == null) {
            return toLowerCase(decapitalizeSmartForCompiler, z);
        }
        int iIntValue = num.intValue() - 1;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strSubstring = decapitalizeSmartForCompiler.substring(0, iIntValue);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(toLowerCase(strSubstring, z));
        java.lang.String strSubstring2 = decapitalizeSmartForCompiler.substring(iIntValue);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strSubstring2, "(this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring2);
        return sb.toString();
    }

    private static final boolean isUpperCaseCharAt(java.lang.String str, int i, boolean z) {
        char cCharAt = str.charAt(i);
        if (z) {
            return 'A' <= cCharAt && 'Z' >= cCharAt;
        }
        return java.lang.Character.isUpperCase(cCharAt);
    }

    private static final java.lang.String toLowerCase(java.lang.String str, boolean z) {
        if (z) {
            return toLowerCaseAsciiOnly(str);
        }
        if (str == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        java.lang.String lowerCase = str.toLowerCase();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    public static final java.lang.String capitalizeAsciiOnly(java.lang.String capitalizeAsciiOnly) {
        char cCharAt;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(capitalizeAsciiOnly, "$this$capitalizeAsciiOnly");
        if ((capitalizeAsciiOnly.length() == 0) || 'a' > (cCharAt = capitalizeAsciiOnly.charAt(0)) || 'z' < cCharAt) {
            return capitalizeAsciiOnly;
        }
        char upperCase = java.lang.Character.toUpperCase(cCharAt);
        java.lang.String strSubstring = capitalizeAsciiOnly.substring(1);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return java.lang.String.valueOf(upperCase) + strSubstring;
    }

    public static final java.lang.String decapitalizeAsciiOnly(java.lang.String decapitalizeAsciiOnly) {
        char cCharAt;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(decapitalizeAsciiOnly, "$this$decapitalizeAsciiOnly");
        if ((decapitalizeAsciiOnly.length() == 0) || 'A' > (cCharAt = decapitalizeAsciiOnly.charAt(0)) || 'Z' < cCharAt) {
            return decapitalizeAsciiOnly;
        }
        char lowerCase = java.lang.Character.toLowerCase(cCharAt);
        java.lang.String strSubstring = decapitalizeAsciiOnly.substring(1);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return java.lang.String.valueOf(lowerCase) + strSubstring;
    }

    public static final java.lang.String toLowerCaseAsciiOnly(java.lang.String toLowerCaseAsciiOnly) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(toLowerCaseAsciiOnly, "$this$toLowerCaseAsciiOnly");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(toLowerCaseAsciiOnly.length());
        int length = toLowerCaseAsciiOnly.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = toLowerCaseAsciiOnly.charAt(i);
            if ('A' <= cCharAt && 'Z' >= cCharAt) {
                cCharAt = java.lang.Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "builder.toString()");
        return string;
    }
}
