package kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: compiled from: IntersectionType.kt */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1 extends kotlin.jvm.internal.FunctionReference implements kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType, java.lang.Boolean> {
    TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1(kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector typeIntersector) {
        super(2, typeIntersector);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final java.lang.String getName() {
        return "isStrictSupertype";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final kotlin.reflect.KDeclarationContainer getOwner() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final java.lang.String getSignature() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2) {
        return java.lang.Boolean.valueOf(invoke2(kotlinType, kotlinType2));
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final boolean invoke2(kotlin.reflect.jvm.internal.impl.types.KotlinType p1, kotlin.reflect.jvm.internal.impl.types.KotlinType p2) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p1, "p1");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p2, "p2");
        return ((kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector) this.receiver).isStrictSupertype(p1, p2);
    }
}
