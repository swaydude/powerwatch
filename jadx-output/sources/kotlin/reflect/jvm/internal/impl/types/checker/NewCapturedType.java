package kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: compiled from: NewCapturedType.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NewCapturedType extends kotlin.reflect.jvm.internal.impl.types.SimpleType implements kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker {
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations;
    private final kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus;
    private final kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor constructor;
    private final boolean isMarkedNullable;
    private final kotlin.reflect.jvm.internal.impl.types.UnwrappedType lowerType;

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor getConstructor() {
        return this.constructor;
    }

    public final kotlin.reflect.jvm.internal.impl.types.UnwrappedType getLowerType() {
        return this.lowerType;
    }

    public /* synthetic */ NewCapturedType(kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus, kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor newCapturedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(captureStatus, newCapturedTypeConstructor, unwrappedType, (i & 8) != 0 ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY() : annotations, (i & 16) != 0 ? false : z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        return this.annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    public NewCapturedType(kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus, kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor constructor, kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(captureStatus, "captureStatus");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(constructor, "constructor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        this.captureStatus = captureStatus;
        this.constructor = constructor;
        this.lowerType = unwrappedType;
        this.annotations = annotations;
        this.isMarkedNullable = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NewCapturedType(kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus, kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType, kotlin.reflect.jvm.internal.impl.types.TypeProjection projection) {
        this(captureStatus, new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor(projection, null, 2, 0 == true ? 1 : 0), unwrappedType, null, false, 24, null);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(captureStatus, "captureStatus");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(projection, "projection");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getArguments() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScopeCreateErrorScope = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorScope("No member resolution should be done on captured type!", true);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(memberScopeCreateErrorScope, "ErrorUtils.createErrorSc…on captured type!\", true)");
        return memberScopeCreateErrorScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType replaceAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations newAnnotations) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newAnnotations, "newAnnotations");
        return new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType(this.captureStatus, getConstructor(), this.lowerType, newAnnotations, isMarkedNullable());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType makeNullableAsSpecified(boolean z) {
        return new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType(this.captureStatus, getConstructor(), this.lowerType, getAnnotations(), z);
    }
}
