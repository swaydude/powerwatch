package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: flexibleTypes.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FlexibleTypeImpl extends kotlin.reflect.jvm.internal.impl.types.FlexibleType implements kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable {
    public static final kotlin.reflect.jvm.internal.impl.types.FlexibleTypeImpl.Companion Companion = new kotlin.reflect.jvm.internal.impl.types.FlexibleTypeImpl.Companion(null);
    public static boolean RUN_SLOW_ASSERTIONS;
    private boolean assertionsDone;

    /* JADX INFO: compiled from: flexibleTypes.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleTypeImpl(kotlin.reflect.jvm.internal.impl.types.SimpleType lowerBound, kotlin.reflect.jvm.internal.impl.types.SimpleType upperBound) {
        super(lowerBound, upperBound);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lowerBound, "lowerBound");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(upperBound, "upperBound");
    }

    private final void runAssertions() {
        if (!RUN_SLOW_ASSERTIONS || this.assertionsDone) {
            return;
        }
        this.assertionsDone = true;
        kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(getLowerBound());
        kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(getUpperBound());
        kotlin.jvm.internal.Intrinsics.areEqual(getLowerBound(), getUpperBound());
        kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT.isSubtypeOf(getLowerBound(), getUpperBound());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate() {
        runAssertions();
        return getLowerBound();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable
    public boolean isTypeVariable() {
        return (getLowerBound().getConstructor().mo1268getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) && kotlin.jvm.internal.Intrinsics.areEqual(getLowerBound().getConstructor(), getUpperBound().getConstructor());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable
    public kotlin.reflect.jvm.internal.impl.types.KotlinType substitutionResult(kotlin.reflect.jvm.internal.impl.types.KotlinType replacement) {
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeFlexibleType;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(replacement, "replacement");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeUnwrap = replacement.unwrap();
        if (unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            unwrappedTypeFlexibleType = unwrappedTypeUnwrap;
        } else {
            if (!(unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = (kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrappedTypeUnwrap;
            unwrappedTypeFlexibleType = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(simpleType, simpleType.makeNullableAsSpecified(true));
        }
        return kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.inheritEnhancement(unwrappedTypeFlexibleType, unwrappedTypeUnwrap);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.types.UnwrappedType replaceAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations newAnnotations) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newAnnotations, "newAnnotations");
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(getLowerBound().replaceAnnotations(newAnnotations), getUpperBound().replaceAnnotations(newAnnotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public java.lang.String render(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer renderer, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions options) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(renderer, "renderer");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(options, "options");
        if (options.getDebugMode()) {
            return '(' + renderer.renderType(getLowerBound()) + ".." + renderer.renderType(getUpperBound()) + ')';
        }
        return renderer.renderFlexibleType(renderer.renderType(getLowerBound()), renderer.renderType(getUpperBound()), kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.types.UnwrappedType makeNullableAsSpecified(boolean z) {
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(getLowerBound().makeNullableAsSpecified(z), getUpperBound().makeNullableAsSpecified(z));
    }
}
