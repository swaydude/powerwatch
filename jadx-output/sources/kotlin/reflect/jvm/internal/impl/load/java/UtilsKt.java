package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UtilsKt {
    public static final kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultValue lexicalCastFrom(kotlin.reflect.jvm.internal.impl.types.KotlinType lexicalCastFrom, java.lang.String value) {
        java.lang.Object doubleOrNull;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lexicalCastFrom, "$this$lexicalCastFrom");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(value, "value");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = lexicalCastFrom.getConstructor().mo1268getDeclarationDescriptor();
        if (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor;
            if (classDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS) {
                kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedInnerClassesScope = classDescriptor.getUnsubstitutedInnerClassesScope();
                kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(value);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(value)");
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier = unsubstitutedInnerClassesScope.mo1270getContributedClassifier(nameIdentifier, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BACKEND);
                if (!(contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier;
                if (classDescriptor2.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY) {
                    return new kotlin.reflect.jvm.internal.impl.load.java.EnumEntry(classDescriptor2);
                }
                return null;
            }
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeMakeNotNullable = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.makeNotNullable(lexicalCastFrom);
        kotlin.reflect.jvm.internal.impl.utils.NumberWithRadix numberWithRadixExtractRadix = kotlin.reflect.jvm.internal.impl.utils.NumbersKt.extractRadix(value);
        java.lang.String strComponent1 = numberWithRadixExtractRadix.component1();
        int iComponent2 = numberWithRadixExtractRadix.component2();
        try {
            if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBoolean(kotlinTypeMakeNotNullable)) {
                doubleOrNull = java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(value));
            } else if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isChar(kotlinTypeMakeNotNullable)) {
                doubleOrNull = kotlin.text.StringsKt.singleOrNull(value);
            } else if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isByte(kotlinTypeMakeNotNullable)) {
                doubleOrNull = kotlin.text.StringsKt.toByteOrNull(strComponent1, iComponent2);
            } else if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isShort(kotlinTypeMakeNotNullable)) {
                doubleOrNull = kotlin.text.StringsKt.toShortOrNull(strComponent1, iComponent2);
            } else if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isInt(kotlinTypeMakeNotNullable)) {
                doubleOrNull = kotlin.text.StringsKt.toIntOrNull(strComponent1, iComponent2);
            } else if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isLong(kotlinTypeMakeNotNullable)) {
                doubleOrNull = kotlin.text.StringsKt.toLongOrNull(strComponent1, iComponent2);
            } else if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isFloat(kotlinTypeMakeNotNullable)) {
                doubleOrNull = kotlin.text.StringsKt.toFloatOrNull(value);
            } else if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isDouble(kotlinTypeMakeNotNullable)) {
                doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(value);
            } else {
                doubleOrNull = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isString(kotlinTypeMakeNotNullable) ? null : null;
            }
        } catch (java.lang.IllegalArgumentException unused) {
        }
        if (doubleOrNull != null) {
            return new kotlin.reflect.jvm.internal.impl.load.java.Constant(doubleOrNull);
        }
        return null;
    }
}
