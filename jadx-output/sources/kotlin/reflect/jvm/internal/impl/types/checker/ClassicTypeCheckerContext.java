package kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: compiled from: ClassicTypeCheckerContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public class ClassicTypeCheckerContext extends kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext implements kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext {
    public static final kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerContext.Companion Companion = new kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerContext.Companion(null);
    private final boolean allowedTypeVariable;
    private final boolean errorTypeEqualsToAnything;

    public ClassicTypeCheckerContext(boolean z, boolean z2) {
        this.errorTypeEqualsToAnything = z;
        this.allowedTypeVariable = z2;
    }

    public /* synthetic */ ClassicTypeCheckerContext(boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? true : z2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public int argumentsCount(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker argumentsCount) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(argumentsCount, "$this$argumentsCount");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.argumentsCount(this, argumentsCount);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker asArgumentList(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker asArgumentList) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(asArgumentList, "$this$asArgumentList");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.asArgumentList(this, asArgumentList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker asCapturedType(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker asCapturedType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(asCapturedType, "$this$asCapturedType");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.asCapturedType(this, asCapturedType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker asDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker asDefinitelyNotNullType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(asDefinitelyNotNullType, "$this$asDefinitelyNotNullType");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.asDefinitelyNotNullType(this, asDefinitelyNotNullType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker asDynamicType(kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker asDynamicType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(asDynamicType, "$this$asDynamicType");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.asDynamicType(this, asDynamicType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker asFlexibleType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker asFlexibleType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(asFlexibleType, "$this$asFlexibleType");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.asFlexibleType(this, asFlexibleType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext, kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker asSimpleType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker asSimpleType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(asSimpleType, "$this$asSimpleType");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.asSimpleType(this, asSimpleType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker asTypeArgument(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker asTypeArgument) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(asTypeArgument, "$this$asTypeArgument");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.asTypeArgument(this, asTypeArgument);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker captureFromArguments(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker type, kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus status) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(status, "status");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.captureFromArguments(this, type, status);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker get(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker get, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(get, "$this$get");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.get(this, get, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker getArgument(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getArgument, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getArgument, "$this$getArgument");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getArgument(this, getArgument, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext
    public kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker getArgumentOrNull(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker getArgumentOrNull, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getArgumentOrNull, "$this$getArgumentOrNull");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getArgumentOrNull(this, getArgumentOrNull, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker getParameter(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker getParameter, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getParameter, "$this$getParameter");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getParameter(this, getParameter, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getType(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker getType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getType, "$this$getType");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getType(this, getType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.TypeVariance getVariance(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker getVariance) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getVariance, "$this$getVariance");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getVariance(this, getVariance);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.TypeVariance getVariance(kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker getVariance) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getVariance, "$this$getVariance");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getVariance(this, getVariance);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext
    public boolean hasFlexibleNullability(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker hasFlexibleNullability) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(hasFlexibleNullability, "$this$hasFlexibleNullability");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.hasFlexibleNullability(this, hasFlexibleNullability);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext
    public boolean identicalArguments(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker a, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker b) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(a, "a");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(b, "b");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.identicalArguments(this, a, b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker intersectTypes(java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> types) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(types, "types");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.intersectTypes(this, types);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isAnyConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker isAnyConstructor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isAnyConstructor, "$this$isAnyConstructor");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isAnyConstructor(this, isAnyConstructor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext
    public boolean isClassType(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker isClassType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isClassType, "$this$isClassType");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isClassType(this, isClassType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isClassTypeConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker isClassTypeConstructor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isClassTypeConstructor, "$this$isClassTypeConstructor");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isClassTypeConstructor(this, isClassTypeConstructor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isCommonFinalClassConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker isCommonFinalClassConstructor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isCommonFinalClassConstructor, "$this$isCommonFinalClassConstructor");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isCommonFinalClassConstructor(this, isCommonFinalClassConstructor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext
    public boolean isDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker isDefinitelyNotNullType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isDefinitelyNotNullType, "$this$isDefinitelyNotNullType");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isDefinitelyNotNullType(this, isDefinitelyNotNullType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isDenotable(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker isDenotable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isDenotable, "$this$isDenotable");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isDenotable(this, isDenotable);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext
    public boolean isDynamic(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker isDynamic) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isDynamic, "$this$isDynamic");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isDynamic(this, isDynamic);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isEqualTypeConstructors(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker c1, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker c2) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c1, "c1");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c2, "c2");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isEqualTypeConstructors(this, c1, c2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isError(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker isError) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isError, "$this$isError");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isError(this, isError);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext
    public boolean isIntegerLiteralType(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker isIntegerLiteralType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isIntegerLiteralType, "$this$isIntegerLiteralType");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isIntegerLiteralType(this, isIntegerLiteralType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isIntegerLiteralTypeConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker isIntegerLiteralTypeConstructor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isIntegerLiteralTypeConstructor, "$this$isIntegerLiteralTypeConstructor");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isIntegerLiteralTypeConstructor(this, isIntegerLiteralTypeConstructor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isIntersection(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker isIntersection) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isIntersection, "$this$isIntersection");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isIntersection(this, isIntersection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isMarkedNullable(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker isMarkedNullable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isMarkedNullable, "$this$isMarkedNullable");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isMarkedNullable(this, isMarkedNullable);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isNotNullNothing(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker isNotNullNothing) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isNotNullNothing, "$this$isNotNullNothing");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isNotNullNothing(this, isNotNullNothing);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext, kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
    public boolean isNothingConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker isNothingConstructor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isNothingConstructor, "$this$isNothingConstructor");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isNothingConstructor(this, isNothingConstructor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isSingleClassifierType(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker isSingleClassifierType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isSingleClassifierType, "$this$isSingleClassifierType");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isSingleClassifierType(this, isSingleClassifierType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isStarProjection(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker isStarProjection) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isStarProjection, "$this$isStarProjection");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isStarProjection(this, isStarProjection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isStubType(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker isStubType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isStubType, "$this$isStubType");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isStubType(this, isStubType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker lowerBound(kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker lowerBound) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lowerBound, "$this$lowerBound");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.lowerBound(this, lowerBound);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker lowerBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker lowerBoundIfFlexible) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lowerBoundIfFlexible, "$this$lowerBoundIfFlexible");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.lowerBoundIfFlexible(this, lowerBoundIfFlexible);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker lowerType(kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker lowerType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lowerType, "$this$lowerType");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.lowerType(this, lowerType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public int parametersCount(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker parametersCount) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parametersCount, "$this$parametersCount");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.parametersCount(this, parametersCount);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> possibleIntegerTypes(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker possibleIntegerTypes) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(possibleIntegerTypes, "$this$possibleIntegerTypes");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.possibleIntegerTypes(this, possibleIntegerTypes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public int size(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker size) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(size, "$this$size");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.size(this, size);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> supertypes(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker supertypes) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(supertypes, "$this$supertypes");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.supertypes(this, supertypes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker typeConstructor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeConstructor, "$this$typeConstructor");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.typeConstructor(this, typeConstructor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext, kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker typeConstructor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeConstructor, "$this$typeConstructor");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.typeConstructor((kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext) this, typeConstructor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker upperBound(kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker upperBound) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(upperBound, "$this$upperBound");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.upperBound(this, upperBound);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker upperBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker upperBoundIfFlexible) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(upperBoundIfFlexible, "$this$upperBoundIfFlexible");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.upperBoundIfFlexible(this, upperBoundIfFlexible);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker withNullability(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker withNullability, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(withNullability, "$this$withNullability");
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.withNullability(this, withNullability, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext
    public kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker prepareType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        return kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker.INSTANCE.transformToNewType(((kotlin.reflect.jvm.internal.impl.types.KotlinType) type).unwrap());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext
    public boolean isErrorTypeEqualsToAnything() {
        return this.errorTypeEqualsToAnything;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext
    public boolean areEqualTypeConstructors(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker a, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker b) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(a, "a");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(b, "b");
        if (!(a instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor)) {
            throw new java.lang.IllegalArgumentException(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerContextKt.errorMessage(a).toString());
        }
        if (!(b instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor)) {
            throw new java.lang.IllegalArgumentException(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerContextKt.errorMessage(b).toString());
        }
        return areEqualTypeConstructors((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) a, (kotlin.reflect.jvm.internal.impl.types.TypeConstructor) b);
    }

    public boolean areEqualTypeConstructors(kotlin.reflect.jvm.internal.impl.types.TypeConstructor a, kotlin.reflect.jvm.internal.impl.types.TypeConstructor b) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(a, "a");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(b, "b");
        if (a instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor) {
            return ((kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor) a).checkConstructor(b);
        }
        return b instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor ? ((kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor) b).checkConstructor(a) : kotlin.jvm.internal.Intrinsics.areEqual(a, b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext
    public kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.DoCustomTransform substitutionSupertypePolicy(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker type) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        return Companion.classicSubstitutionSupertypePolicy(this, type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext
    public boolean isAllowedTypeVariable(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker isAllowedTypeVariable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isAllowedTypeVariable, "$this$isAllowedTypeVariable");
        return (isAllowedTypeVariable instanceof kotlin.reflect.jvm.internal.impl.types.UnwrappedType) && this.allowedTypeVariable && (((kotlin.reflect.jvm.internal.impl.types.UnwrappedType) isAllowedTypeVariable).getConstructor() instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor);
    }

    /* JADX INFO: compiled from: ClassicTypeCheckerContext.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.DoCustomTransform classicSubstitutionSupertypePolicy(final kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicSubstitutionSupertypePolicy, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker type) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classicSubstitutionSupertypePolicy, "$this$classicSubstitutionSupertypePolicy");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
            if (!(type instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType)) {
                throw new java.lang.IllegalArgumentException(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerContextKt.errorMessage(type).toString());
            }
            final kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutorBuildSubstitutor = kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion.create((kotlin.reflect.jvm.internal.impl.types.KotlinType) type).buildSubstitutor();
            return new kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.DoCustomTransform() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerContext$Companion$classicSubstitutionSupertypePolicy$2
                @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy
                /* JADX INFO: renamed from: transformType */
                public kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker mo1272transformType(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext context, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type2) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type2, "type");
                    kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext = classicSubstitutionSupertypePolicy;
                    kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor = typeSubstitutorBuildSubstitutor;
                    java.lang.Object objLowerBoundIfFlexible = classicTypeSystemContext.lowerBoundIfFlexible(type2);
                    if (objLowerBoundIfFlexible != null) {
                        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeSafeSubstitute = typeSubstitutor.safeSubstitute((kotlin.reflect.jvm.internal.impl.types.KotlinType) objLowerBoundIfFlexible, kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT);
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kotlinTypeSafeSubstitute, "substitutor.safeSubstitu…ANT\n                    )");
                        kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarkerAsSimpleType = classicTypeSystemContext.asSimpleType(kotlinTypeSafeSubstitute);
                        if (simpleTypeMarkerAsSimpleType == null) {
                            kotlin.jvm.internal.Intrinsics.throwNpe();
                        }
                        return simpleTypeMarkerAsSimpleType;
                    }
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                }
            };
        }
    }
}
