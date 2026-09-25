package kotlin.reflect.jvm.internal.impl.name;

/* JADX INFO: compiled from: FqNamesUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FqNamesUtilKt {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.name.State.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.name.State.BEGINNING.ordinal()] = 1;
            iArr[kotlin.reflect.jvm.internal.impl.name.State.AFTER_DOT.ordinal()] = 2;
            iArr[kotlin.reflect.jvm.internal.impl.name.State.MIDDLE.ordinal()] = 3;
        }
    }

    public static final boolean isSubpackageOf(kotlin.reflect.jvm.internal.impl.name.FqName isSubpackageOf, kotlin.reflect.jvm.internal.impl.name.FqName packageName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isSubpackageOf, "$this$isSubpackageOf");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packageName, "packageName");
        if (kotlin.jvm.internal.Intrinsics.areEqual(isSubpackageOf, packageName) || packageName.isRoot()) {
            return true;
        }
        java.lang.String strAsString = isSubpackageOf.asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "this.asString()");
        java.lang.String strAsString2 = packageName.asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString2, "packageName.asString()");
        return isSubpackageOf(strAsString, strAsString2);
    }

    private static final boolean isSubpackageOf(java.lang.String str, java.lang.String str2) {
        return kotlin.text.StringsKt.startsWith$default(str, str2, false, 2, (java.lang.Object) null) && str.charAt(str2.length()) == '.';
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName tail(kotlin.reflect.jvm.internal.impl.name.FqName tail, kotlin.reflect.jvm.internal.impl.name.FqName prefix) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(tail, "$this$tail");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(prefix, "prefix");
        if (!isSubpackageOf(tail, prefix) || prefix.isRoot()) {
            return tail;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(tail, prefix)) {
            kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.name.FqName.ROOT;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "FqName.ROOT");
            return fqName;
        }
        java.lang.String strAsString = tail.asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "asString()");
        int length = prefix.asString().length() + 1;
        if (strAsString == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        java.lang.String strSubstring = strAsString.substring(length);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return new kotlin.reflect.jvm.internal.impl.name.FqName(strSubstring);
    }

    public static final boolean isValidJavaFqName(java.lang.String str) {
        if (str == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.name.State state = kotlin.reflect.jvm.internal.impl.name.State.BEGINNING;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            int i2 = kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!java.lang.Character.isJavaIdentifierPart(cCharAt)) {
                    return false;
                }
                state = kotlin.reflect.jvm.internal.impl.name.State.MIDDLE;
            } else if (i2 != 3) {
                continue;
            } else if (cCharAt == '.') {
                state = kotlin.reflect.jvm.internal.impl.name.State.AFTER_DOT;
            } else if (!java.lang.Character.isJavaIdentifierPart(cCharAt)) {
                return false;
            }
        }
        return state != kotlin.reflect.jvm.internal.impl.name.State.AFTER_DOT;
    }
}
