package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: AbstractTypeChecker.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractTypeCheckerContext implements kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext {
    private int argumentsDepth;
    private java.util.ArrayDeque<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> supertypesDeque;
    private boolean supertypesLocked;
    private java.util.Set<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> supertypesSet;

    /* JADX INFO: compiled from: AbstractTypeChecker.kt */
    public enum LowerCapturedTypePolicy {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* JADX INFO: compiled from: AbstractTypeChecker.kt */
    public enum SeveralSupertypesWithSameConstructorPolicy {
        TAKE_FIRST_FOR_SUBTYPING,
        FORCE_NOT_SUBTYPE,
        CHECK_ANY_OF_THEM,
        INTERSECT_ARGUMENTS_AND_CHECK_AGAIN
    }

    public java.lang.Boolean addSubtypeConstraint(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker subType, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker superType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(subType, "subType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(superType, "superType");
        return null;
    }

    public abstract boolean areEqualTypeConstructors(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker2);

    public abstract boolean isAllowedTypeVariable(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean isErrorTypeEqualsToAnything();

    public kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker prepareType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        return type;
    }

    public abstract kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.DoCustomTransform substitutionSupertypePolicy(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker get(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker get, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(get, "$this$get");
        return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.get(this, get, i);
    }

    public kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker getArgumentOrNull(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker getArgumentOrNull, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getArgumentOrNull, "$this$getArgumentOrNull");
        return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.getArgumentOrNull(this, getArgumentOrNull, i);
    }

    public boolean hasFlexibleNullability(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker hasFlexibleNullability) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(hasFlexibleNullability, "$this$hasFlexibleNullability");
        return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.hasFlexibleNullability(this, hasFlexibleNullability);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext
    public boolean identicalArguments(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker a, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker b) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(a, "a");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(b, "b");
        return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.identicalArguments(this, a, b);
    }

    public boolean isClassType(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker isClassType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isClassType, "$this$isClassType");
        return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.isClassType(this, isClassType);
    }

    public boolean isDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker isDefinitelyNotNullType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isDefinitelyNotNullType, "$this$isDefinitelyNotNullType");
        return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.isDefinitelyNotNullType(this, isDefinitelyNotNullType);
    }

    public boolean isDynamic(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker isDynamic) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isDynamic, "$this$isDynamic");
        return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.isDynamic(this, isDynamic);
    }

    public boolean isIntegerLiteralType(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker isIntegerLiteralType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isIntegerLiteralType, "$this$isIntegerLiteralType");
        return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.isIntegerLiteralType(this, isIntegerLiteralType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker lowerBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker lowerBoundIfFlexible) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lowerBoundIfFlexible, "$this$lowerBoundIfFlexible");
        return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.lowerBoundIfFlexible(this, lowerBoundIfFlexible);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public int size(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker size) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(size, "$this$size");
        return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.size(this, size);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker typeConstructor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeConstructor, "$this$typeConstructor");
        return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.typeConstructor(this, typeConstructor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker upperBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker upperBoundIfFlexible) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(upperBoundIfFlexible, "$this$upperBoundIfFlexible");
        return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.upperBoundIfFlexible(this, upperBoundIfFlexible);
    }

    public kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.LowerCapturedTypePolicy getLowerCapturedTypePolicy(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker subType, kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker superType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(subType, "subType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(superType, "superType");
        return kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER;
    }

    public kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SeveralSupertypesWithSameConstructorPolicy getSameConstructorPolicy() {
        return kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SeveralSupertypesWithSameConstructorPolicy.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN;
    }

    public final java.util.ArrayDeque<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> getSupertypesDeque() {
        return this.supertypesDeque;
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> getSupertypesSet() {
        return this.supertypesSet;
    }

    public final void initialize() {
        this.supertypesLocked = true;
        if (this.supertypesDeque == null) {
            this.supertypesDeque = new java.util.ArrayDeque<>(4);
        }
        if (this.supertypesSet == null) {
            this.supertypesSet = kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion.create();
        }
    }

    public final void clear() {
        java.util.ArrayDeque<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> arrayDeque = this.supertypesDeque;
        if (arrayDeque == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        arrayDeque.clear();
        java.util.Set<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> set = this.supertypesSet;
        if (set == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        set.clear();
        this.supertypesLocked = false;
    }

    /* JADX INFO: compiled from: AbstractTypeChecker.kt */
    public static abstract class SupertypesPolicy {
        /* JADX INFO: renamed from: transformType */
        public abstract kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker mo1272transformType(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext abstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

        private SupertypesPolicy() {
        }

        public /* synthetic */ SupertypesPolicy(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public static final class None extends kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy {
            public static final kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.None INSTANCE = new kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.None();

            private None() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy
            /* JADX INFO: renamed from: transformType, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker mo1272transformType(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext abstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
                return (kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) transformType(abstractTypeCheckerContext, kotlinTypeMarker);
            }

            public java.lang.Void transformType(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext context, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
                throw new java.lang.UnsupportedOperationException("Should not be called");
            }
        }

        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public static final class UpperIfFlexible extends kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy {
            public static final kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.UpperIfFlexible INSTANCE = new kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.UpperIfFlexible();

            private UpperIfFlexible() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy
            /* JADX INFO: renamed from: transformType */
            public kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker mo1272transformType(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext context, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
                return context.upperBoundIfFlexible(type);
            }
        }

        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public static final class LowerIfFlexible extends kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy {
            public static final kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible INSTANCE = new kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible();

            private LowerIfFlexible() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy
            /* JADX INFO: renamed from: transformType */
            public kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker mo1272transformType(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext context, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
                return context.lowerBoundIfFlexible(type);
            }
        }

        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public static abstract class DoCustomTransform extends kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy {
            public DoCustomTransform() {
                super(null);
            }
        }
    }
}
