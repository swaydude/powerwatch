package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeCapabilities.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeCapabilitiesKt {
    public static final boolean isCustomTypeVariable(kotlin.reflect.jvm.internal.impl.types.KotlinType isCustomTypeVariable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isCustomTypeVariable, "$this$isCustomTypeVariable");
        java.lang.Object objUnwrap = isCustomTypeVariable.unwrap();
        if (!(objUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable)) {
            objUnwrap = null;
        }
        kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable customTypeVariable = (kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable) objUnwrap;
        if (customTypeVariable != null) {
            return customTypeVariable.isTypeVariable();
        }
        return false;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable getCustomTypeVariable(kotlin.reflect.jvm.internal.impl.types.KotlinType getCustomTypeVariable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getCustomTypeVariable, "$this$getCustomTypeVariable");
        java.lang.Object objUnwrap = getCustomTypeVariable.unwrap();
        if (!(objUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable)) {
            objUnwrap = null;
        }
        kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable customTypeVariable = (kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable) objUnwrap;
        if (customTypeVariable == null || !customTypeVariable.isTypeVariable()) {
            return null;
        }
        return customTypeVariable;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType getSubtypeRepresentative(kotlin.reflect.jvm.internal.impl.types.KotlinType getSubtypeRepresentative) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType subTypeRepresentative;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getSubtypeRepresentative, "$this$getSubtypeRepresentative");
        java.lang.Object objUnwrap = getSubtypeRepresentative.unwrap();
        if (!(objUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives)) {
            objUnwrap = null;
        }
        kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives subtypingRepresentatives = (kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives) objUnwrap;
        return (subtypingRepresentatives == null || (subTypeRepresentative = subtypingRepresentatives.getSubTypeRepresentative()) == null) ? getSubtypeRepresentative : subTypeRepresentative;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType getSupertypeRepresentative(kotlin.reflect.jvm.internal.impl.types.KotlinType getSupertypeRepresentative) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType superTypeRepresentative;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getSupertypeRepresentative, "$this$getSupertypeRepresentative");
        java.lang.Object objUnwrap = getSupertypeRepresentative.unwrap();
        if (!(objUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives)) {
            objUnwrap = null;
        }
        kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives subtypingRepresentatives = (kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives) objUnwrap;
        return (subtypingRepresentatives == null || (superTypeRepresentative = subtypingRepresentatives.getSuperTypeRepresentative()) == null) ? getSupertypeRepresentative : superTypeRepresentative;
    }

    public static final boolean sameTypeConstructors(kotlin.reflect.jvm.internal.impl.types.KotlinType first, kotlin.reflect.jvm.internal.impl.types.KotlinType second) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(first, "first");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(second, "second");
        java.lang.Object objUnwrap = first.unwrap();
        if (!(objUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives)) {
            objUnwrap = null;
        }
        kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives subtypingRepresentatives = (kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives) objUnwrap;
        if (!(subtypingRepresentatives != null ? subtypingRepresentatives.sameTypeConstructor(second) : false)) {
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeUnwrap = second.unwrap();
            kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives subtypingRepresentatives2 = (kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives) (unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives ? unwrappedTypeUnwrap : null);
            if (!(subtypingRepresentatives2 != null ? subtypingRepresentatives2.sameTypeConstructor(first) : false)) {
                return false;
            }
        }
        return true;
    }
}
