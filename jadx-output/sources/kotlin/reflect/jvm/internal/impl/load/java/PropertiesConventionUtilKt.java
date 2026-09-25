package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: compiled from: propertiesConventionUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PropertiesConventionUtilKt {
    public static final kotlin.reflect.jvm.internal.impl.name.Name propertyNameByGetMethodName(kotlin.reflect.jvm.internal.impl.name.Name methodName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(methodName, "methodName");
        kotlin.reflect.jvm.internal.impl.name.Name namePropertyNameFromAccessorMethodName$default = propertyNameFromAccessorMethodName$default(methodName, "get", false, null, 12, null);
        return namePropertyNameFromAccessorMethodName$default != null ? namePropertyNameFromAccessorMethodName$default : propertyNameFromAccessorMethodName$default(methodName, "is", false, null, 8, null);
    }

    public static final kotlin.reflect.jvm.internal.impl.name.Name propertyNameBySetMethodName(kotlin.reflect.jvm.internal.impl.name.Name methodName, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(methodName, "methodName");
        return propertyNameFromAccessorMethodName$default(methodName, "set", false, z ? "is" : null, 4, null);
    }

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> propertyNamesBySetMethodName(kotlin.reflect.jvm.internal.impl.name.Name methodName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(methodName, "methodName");
        return kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.Name[]{propertyNameBySetMethodName(methodName, false), propertyNameBySetMethodName(methodName, true)});
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.name.Name propertyNameFromAccessorMethodName$default(kotlin.reflect.jvm.internal.impl.name.Name name, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = (java.lang.String) null;
        }
        return propertyNameFromAccessorMethodName(name, str, z, str2);
    }

    private static final kotlin.reflect.jvm.internal.impl.name.Name propertyNameFromAccessorMethodName(kotlin.reflect.jvm.internal.impl.name.Name name, java.lang.String str, boolean z, java.lang.String str2) {
        if (name.isSpecial()) {
            return null;
        }
        java.lang.String identifier = name.getIdentifier();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(identifier, "methodName.identifier");
        if (!kotlin.text.StringsKt.startsWith$default(identifier, str, false, 2, (java.lang.Object) null) || identifier.length() == str.length()) {
            return null;
        }
        char cCharAt = identifier.charAt(str.length());
        if ('a' <= cCharAt && 'z' >= cCharAt) {
            return null;
        }
        if (str2 != null) {
            return kotlin.reflect.jvm.internal.impl.name.Name.identifier(str2 + kotlin.text.StringsKt.removePrefix(identifier, (java.lang.CharSequence) str));
        }
        if (!z) {
            return name;
        }
        java.lang.String strDecapitalizeSmartForCompiler = kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt.decapitalizeSmartForCompiler(kotlin.text.StringsKt.removePrefix(identifier, (java.lang.CharSequence) str), true);
        if (kotlin.reflect.jvm.internal.impl.name.Name.isValidIdentifier(strDecapitalizeSmartForCompiler)) {
            return kotlin.reflect.jvm.internal.impl.name.Name.identifier(strDecapitalizeSmartForCompiler);
        }
        return null;
    }

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> getPropertyNamesCandidatesByAccessorName(kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        java.lang.String strAsString = name.asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "name.asString()");
        if (kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.isGetterName(strAsString)) {
            return kotlin.collections.CollectionsKt.listOfNotNull(propertyNameByGetMethodName(name));
        }
        if (kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.isSetterName(strAsString)) {
            return propertyNamesBySetMethodName(name);
        }
        return kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties.INSTANCE.getPropertyNameCandidatesBySpecialGetterName(name);
    }
}
