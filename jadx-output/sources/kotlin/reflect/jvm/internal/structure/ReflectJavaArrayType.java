package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: ReflectJavaArrayType.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaArrayType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaArrayType;", "reflectType", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)V", "componentType", "getComponentType", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "getReflectType", "()Ljava/lang/reflect/Type;", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
public final class ReflectJavaArrayType extends kotlin.reflect.jvm.internal.structure.ReflectJavaType implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType {
    private final kotlin.reflect.jvm.internal.structure.ReflectJavaType componentType;
    private final java.lang.reflect.Type reflectType;

    public ReflectJavaArrayType(java.lang.reflect.Type reflectType) {
        kotlin.reflect.jvm.internal.structure.ReflectJavaType reflectJavaTypeCreate;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(reflectType, "reflectType");
        this.reflectType = reflectType;
        java.lang.reflect.Type reflectType2 = getReflectType();
        if (!(reflectType2 instanceof java.lang.reflect.GenericArrayType)) {
            if (reflectType2 instanceof java.lang.Class) {
                java.lang.Class cls = (java.lang.Class) reflectType2;
                if (cls.isArray()) {
                    kotlin.reflect.jvm.internal.structure.ReflectJavaType.Companion factory = kotlin.reflect.jvm.internal.structure.ReflectJavaType.INSTANCE;
                    java.lang.Class<?> componentType = cls.getComponentType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(componentType, "getComponentType()");
                    reflectJavaTypeCreate = factory.create(componentType);
                }
            }
            throw new java.lang.IllegalArgumentException("Not an array type (" + getReflectType().getClass() + "): " + getReflectType());
        }
        kotlin.reflect.jvm.internal.structure.ReflectJavaType.Companion factory2 = kotlin.reflect.jvm.internal.structure.ReflectJavaType.INSTANCE;
        java.lang.reflect.Type genericComponentType = ((java.lang.reflect.GenericArrayType) reflectType2).getGenericComponentType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(genericComponentType, "genericComponentType");
        reflectJavaTypeCreate = factory2.create(genericComponentType);
        this.componentType = reflectJavaTypeCreate;
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaType
    protected java.lang.reflect.Type getReflectType() {
        return this.reflectType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType
    public kotlin.reflect.jvm.internal.structure.ReflectJavaType getComponentType() {
        return this.componentType;
    }
}
