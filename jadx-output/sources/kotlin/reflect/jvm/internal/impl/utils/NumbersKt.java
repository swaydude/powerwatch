package kotlin.reflect.jvm.internal.impl.utils;

/* JADX INFO: compiled from: numbers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NumbersKt {
    public static final kotlin.reflect.jvm.internal.impl.utils.NumberWithRadix extractRadix(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(value, "value");
        if (kotlin.text.StringsKt.startsWith$default(value, "0x", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(value, "0X", false, 2, (java.lang.Object) null)) {
            java.lang.String strSubstring = value.substring(2);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.String).substring(startIndex)");
            return new kotlin.reflect.jvm.internal.impl.utils.NumberWithRadix(strSubstring, 16);
        }
        if (kotlin.text.StringsKt.startsWith$default(value, "0b", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(value, "0B", false, 2, (java.lang.Object) null)) {
            java.lang.String strSubstring2 = value.substring(2);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strSubstring2, "(this as java.lang.String).substring(startIndex)");
            return new kotlin.reflect.jvm.internal.impl.utils.NumberWithRadix(strSubstring2, 2);
        }
        return new kotlin.reflect.jvm.internal.impl.utils.NumberWithRadix(value, 10);
    }
}
