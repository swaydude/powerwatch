package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: ReflectJavaWildcardType.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaWildcardType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaWildcardType;", "reflectType", "Ljava/lang/reflect/WildcardType;", "(Ljava/lang/reflect/WildcardType;)V", "bound", "getBound", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "isExtends", "", "()Z", "getReflectType", "()Ljava/lang/reflect/WildcardType;", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
public final class ReflectJavaWildcardType extends kotlin.reflect.jvm.internal.structure.ReflectJavaType implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType {
    private final java.lang.reflect.WildcardType reflectType;

    public ReflectJavaWildcardType(java.lang.reflect.WildcardType reflectType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(reflectType, "reflectType");
        this.reflectType = reflectType;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaType
    public java.lang.reflect.WildcardType getReflectType() {
        return this.reflectType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public kotlin.reflect.jvm.internal.structure.ReflectJavaType getBound() {
        java.lang.reflect.Type[] upperBounds = getReflectType().getUpperBounds();
        java.lang.reflect.Type[] lowerBounds = getReflectType().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new java.lang.UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + getReflectType());
        }
        if (lowerBounds.length == 1) {
            kotlin.reflect.jvm.internal.structure.ReflectJavaType.Companion factory = kotlin.reflect.jvm.internal.structure.ReflectJavaType.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lowerBounds, "lowerBounds");
            java.lang.Object objSingle = kotlin.collections.ArraysKt.single(lowerBounds);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objSingle, "lowerBounds.single()");
            return factory.create((java.lang.reflect.Type) objSingle);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(upperBounds, "upperBounds");
        java.lang.reflect.Type ub = (java.lang.reflect.Type) kotlin.collections.ArraysKt.single(upperBounds);
        if (!(!kotlin.jvm.internal.Intrinsics.areEqual(ub, java.lang.Object.class))) {
            return null;
        }
        kotlin.reflect.jvm.internal.structure.ReflectJavaType.Companion factory2 = kotlin.reflect.jvm.internal.structure.ReflectJavaType.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(ub, "ub");
        return factory2.create(ub);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public boolean isExtends() {
        java.lang.reflect.Type[] upperBounds = getReflectType().getUpperBounds();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(upperBounds, "reflectType.upperBounds");
        return !kotlin.jvm.internal.Intrinsics.areEqual((java.lang.reflect.Type) kotlin.collections.ArraysKt.firstOrNull(upperBounds), java.lang.Object.class);
    }
}
