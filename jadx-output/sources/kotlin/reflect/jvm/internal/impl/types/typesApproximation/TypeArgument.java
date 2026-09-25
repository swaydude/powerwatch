package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

/* JADX INFO: compiled from: CapturedTypeApproximation.kt */
/* JADX INFO: loaded from: classes2.dex */
final class TypeArgument {
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType inProjection;
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType outProjection;
    private final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameter;

    public TypeArgument(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameter, kotlin.reflect.jvm.internal.impl.types.KotlinType inProjection, kotlin.reflect.jvm.internal.impl.types.KotlinType outProjection) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeParameter, "typeParameter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(inProjection, "inProjection");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(outProjection, "outProjection");
        this.typeParameter = typeParameter;
        this.inProjection = inProjection;
        this.outProjection = outProjection;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor getTypeParameter() {
        return this.typeParameter;
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getInProjection() {
        return this.inProjection;
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getOutProjection() {
        return this.outProjection;
    }

    public final boolean isConsistent() {
        return kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT.isSubtypeOf(this.inProjection, this.outProjection);
    }
}
