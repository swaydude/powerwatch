package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: SpecialTypes.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DefinitelyNotNullType extends kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType implements kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable, kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker {
    public static final kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType.Companion Companion = new kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType.Companion(null);
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType original;

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    private DefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        this.original = simpleType;
    }

    public /* synthetic */ DefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(simpleType);
    }

    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getOriginal() {
        return this.original;
    }

    /* JADX INFO: compiled from: SpecialTypes.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType makeDefinitelyNotNull$descriptors(kotlin.reflect.jvm.internal.impl.types.UnwrappedType type) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (type instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) {
                return (kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) type;
            }
            if (!makesSenseToBeDefinitelyNotNull(type)) {
                return null;
            }
            if (type instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
                kotlin.reflect.jvm.internal.impl.types.FlexibleType flexibleType = (kotlin.reflect.jvm.internal.impl.types.FlexibleType) type;
                kotlin.jvm.internal.Intrinsics.areEqual(flexibleType.getLowerBound().getConstructor(), flexibleType.getUpperBound().getConstructor());
            }
            return new kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.lowerIfFlexible(type), defaultConstructorMarker);
        }

        private final boolean makesSenseToBeDefinitelyNotNull(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType) {
            return kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.canHaveUndefinedNullability(unwrappedType) && !kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker.INSTANCE.isSubtypeOfAny(unwrappedType);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    protected kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate() {
        return this.original;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable
    public boolean isTypeVariable() {
        return (getDelegate().getConstructor() instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor) || (getDelegate().getConstructor().mo1268getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable
    public kotlin.reflect.jvm.internal.impl.types.KotlinType substitutionResult(kotlin.reflect.jvm.internal.impl.types.KotlinType replacement) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(replacement, "replacement");
        return kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.makeDefinitelyNotNullOrNotNull(replacement.unwrap());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType replaceAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations newAnnotations) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newAnnotations, "newAnnotations");
        return new kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType(getDelegate().replaceAnnotations(newAnnotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableAsSpecified(boolean z) {
        return z ? getDelegate().makeNullableAsSpecified(z) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public java.lang.String toString() {
        return getDelegate() + "!!";
    }
}
