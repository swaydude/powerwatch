package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: KotlinTypeFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
final class SimpleTypeImpl extends kotlin.reflect.jvm.internal.impl.types.SimpleType {
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments;
    private final kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor;
    private final boolean isMarkedNullable;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope;

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public kotlin.reflect.jvm.internal.impl.types.TypeConstructor getConstructor() {
        return this.constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getArguments() {
        return this.arguments;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope() {
        return this.memberScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleTypeImpl(kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments, boolean z, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(constructor, "constructor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(arguments, "arguments");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(memberScope, "memberScope");
        this.constructor = constructor;
        this.arguments = arguments;
        this.isMarkedNullable = z;
        this.memberScope = memberScope;
        if (getMemberScope() instanceof kotlin.reflect.jvm.internal.impl.types.ErrorUtils.ErrorScope) {
            throw new java.lang.IllegalStateException("SimpleTypeImpl should not be created for error type: " + getMemberScope() + '\n' + getConstructor());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.types.SimpleType replaceAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations newAnnotations) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newAnnotations, "newAnnotations");
        if (newAnnotations.isEmpty()) {
            return this;
        }
        return new kotlin.reflect.jvm.internal.impl.types.AnnotatedSimpleType(this, newAnnotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableAsSpecified(boolean z) {
        if (z == isMarkedNullable()) {
            return this;
        }
        if (z) {
            return new kotlin.reflect.jvm.internal.impl.types.NullableSimpleType(this);
        }
        return new kotlin.reflect.jvm.internal.impl.types.NotNullSimpleType(this);
    }
}
