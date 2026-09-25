package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeWithEnhancement.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SimpleTypeWithEnhancement extends kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType implements kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement {
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType delegate;
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType enhancement;

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    protected kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate() {
        return this.delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getEnhancement() {
        return this.enhancement;
    }

    public SimpleTypeWithEnhancement(kotlin.reflect.jvm.internal.impl.types.SimpleType delegate, kotlin.reflect.jvm.internal.impl.types.KotlinType enhancement) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(delegate, "delegate");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(enhancement, "enhancement");
        this.delegate = delegate;
        this.enhancement = enhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public kotlin.reflect.jvm.internal.impl.types.UnwrappedType getOrigin() {
        return getDelegate();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.types.SimpleType replaceAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations newAnnotations) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newAnnotations, "newAnnotations");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeWrapEnhancement = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.wrapEnhancement(getOrigin().replaceAnnotations(newAnnotations), getEnhancement());
        if (unwrappedTypeWrapEnhancement != null) {
            return (kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrappedTypeWrapEnhancement;
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableAsSpecified(boolean z) {
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeWrapEnhancement = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.wrapEnhancement(getOrigin().makeNullableAsSpecified(z), getEnhancement().unwrap().makeNullableAsSpecified(z));
        if (unwrappedTypeWrapEnhancement != null) {
            return (kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrappedTypeWrapEnhancement;
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
    }
}
