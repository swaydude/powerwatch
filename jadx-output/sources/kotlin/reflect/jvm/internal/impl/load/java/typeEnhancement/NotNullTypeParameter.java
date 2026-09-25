package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NotNullTypeParameter extends kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType implements kotlin.reflect.jvm.internal.impl.types.NotNullTypeVariable {
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType delegate;

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable
    public boolean isTypeVariable() {
        return true;
    }

    public NotNullTypeParameter(kotlin.reflect.jvm.internal.impl.types.SimpleType delegate) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    protected kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate() {
        return this.delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable
    public kotlin.reflect.jvm.internal.impl.types.KotlinType substitutionResult(kotlin.reflect.jvm.internal.impl.types.KotlinType replacement) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(replacement, "replacement");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeUnwrap = replacement.unwrap();
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType = unwrappedTypeUnwrap;
        if (!kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(unwrappedType) && !kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isTypeParameter(unwrappedType)) {
            return unwrappedType;
        }
        if (unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
            return prepareReplacement((kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrappedTypeUnwrap);
        }
        if (unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            kotlin.reflect.jvm.internal.impl.types.FlexibleType flexibleType = (kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrappedTypeUnwrap;
            return kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.wrapEnhancement(kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(prepareReplacement(flexibleType.getLowerBound()), prepareReplacement(flexibleType.getUpperBound())), kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.getEnhancement(unwrappedType));
        }
        throw new java.lang.IllegalStateException(("Incorrect type: " + unwrappedTypeUnwrap).toString());
    }

    private final kotlin.reflect.jvm.internal.impl.types.SimpleType prepareReplacement(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeMakeNullableAsSpecified = simpleType.makeNullableAsSpecified(false);
        return !kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isTypeParameter(simpleType) ? simpleTypeMakeNullableAsSpecified : new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameter(simpleTypeMakeNullableAsSpecified);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameter replaceAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations newAnnotations) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newAnnotations, "newAnnotations");
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameter(getDelegate().replaceAnnotations(newAnnotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableAsSpecified(boolean z) {
        return z ? getDelegate().makeNullableAsSpecified(true) : this;
    }
}
