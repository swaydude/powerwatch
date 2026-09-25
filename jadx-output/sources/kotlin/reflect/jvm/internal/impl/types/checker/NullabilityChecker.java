package kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: compiled from: NewKotlinTypeChecker.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NullabilityChecker {
    public static final kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker INSTANCE = new kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker();

    private NullabilityChecker() {
    }

    public final boolean isSubtypeOfAny(kotlin.reflect.jvm.internal.impl.types.UnwrappedType type) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        return kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker.INSTANCE.hasNotNullSupertype(kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext.INSTANCE.newBaseTypeCheckerContext(false), kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.lowerIfFlexible(type), kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible.INSTANCE);
    }
}
