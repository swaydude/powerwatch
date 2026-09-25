package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

/* JADX INFO: compiled from: CapturedTypeConstructor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CapturedType extends kotlin.reflect.jvm.internal.impl.types.SimpleType implements kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives, kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker {
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations;
    private final kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor constructor;
    private final boolean isMarkedNullable;
    private final kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection;

    public /* synthetic */ CapturedType(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl capturedTypeConstructorImpl, boolean z, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i & 2) != 0 ? new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl(typeProjection) : capturedTypeConstructorImpl, (i & 4) != 0 ? false : z, (i & 8) != 0 ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY() : annotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor getConstructor() {
        return this.constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        return this.annotations;
    }

    public CapturedType(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor constructor, boolean z, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeProjection, "typeProjection");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(constructor, "constructor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        this.typeProjection = typeProjection;
        this.constructor = constructor;
        this.isMarkedNullable = z;
        this.annotations = annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getArguments() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScopeCreateErrorScope = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorScope("No member resolution should be done on captured type, it used only during constraint system resolution", true);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(memberScopeCreateErrorScope, "ErrorUtils.createErrorSc…solution\", true\n        )");
        return memberScopeCreateErrorScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getSubTypeRepresentative() {
        kotlin.reflect.jvm.internal.impl.types.Variance variance = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE;
        kotlin.reflect.jvm.internal.impl.types.SimpleType nullableAnyType = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(this).getNullableAnyType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nullableAnyType, "builtIns.nullableAnyType");
        return representative(variance, nullableAnyType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getSuperTypeRepresentative() {
        kotlin.reflect.jvm.internal.impl.types.Variance variance = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE;
        kotlin.reflect.jvm.internal.impl.types.SimpleType nothingType = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(this).getNothingType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nothingType, "builtIns.nothingType");
        return representative(variance, nothingType);
    }

    private final kotlin.reflect.jvm.internal.impl.types.KotlinType representative(kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (this.typeProjection.getProjectionKind() == variance) {
            kotlinType = this.typeProjection.getType();
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kotlinType, "if (typeProjection.proje…jection.type else default");
        return kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives
    public boolean sameTypeConstructor(kotlin.reflect.jvm.internal.impl.types.KotlinType type) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        return getConstructor() == type.getConstructor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Captured(");
        sb.append(this.typeProjection);
        sb.append(')');
        sb.append(isMarkedNullable() ? "?" : "");
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType makeNullableAsSpecified(boolean z) {
        return z == isMarkedNullable() ? this : new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType(this.typeProjection, getConstructor(), z, getAnnotations());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType replaceAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations newAnnotations) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newAnnotations, "newAnnotations");
        return new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType(this.typeProjection, getConstructor(), isMarkedNullable(), newAnnotations);
    }
}
