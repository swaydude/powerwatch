package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: ReflectJavaType.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaType;", "()V", "reflectType", "Ljava/lang/reflect/Type;", "getReflectType", "()Ljava/lang/reflect/Type;", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "", "toString", "", "Factory", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
public abstract class ReflectJavaType implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType {

    /* JADX INFO: renamed from: Factory, reason: from kotlin metadata */
    public static final kotlin.reflect.jvm.internal.structure.ReflectJavaType.Companion INSTANCE = new kotlin.reflect.jvm.internal.structure.ReflectJavaType.Companion(null);

    protected abstract java.lang.reflect.Type getReflectType();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.structure.ReflectJavaType$Factory, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ReflectJavaType.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaType$Factory;", "", "()V", "create", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "type", "Ljava/lang/reflect/Type;", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.reflect.jvm.internal.structure.ReflectJavaType create(java.lang.reflect.Type type) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
            boolean z = type instanceof java.lang.Class;
            if (z) {
                java.lang.Class cls = (java.lang.Class) type;
                if (cls.isPrimitive()) {
                    return new kotlin.reflect.jvm.internal.structure.ReflectJavaPrimitiveType(cls);
                }
            }
            if ((type instanceof java.lang.reflect.GenericArrayType) || (z && ((java.lang.Class) type).isArray())) {
                return new kotlin.reflect.jvm.internal.structure.ReflectJavaArrayType(type);
            }
            return type instanceof java.lang.reflect.WildcardType ? new kotlin.reflect.jvm.internal.structure.ReflectJavaWildcardType((java.lang.reflect.WildcardType) type) : new kotlin.reflect.jvm.internal.structure.ReflectJavaClassifierType(type);
        }
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof kotlin.reflect.jvm.internal.structure.ReflectJavaType) && kotlin.jvm.internal.Intrinsics.areEqual(getReflectType(), ((kotlin.reflect.jvm.internal.structure.ReflectJavaType) other).getReflectType());
    }

    public int hashCode() {
        return getReflectType().hashCode();
    }

    public java.lang.String toString() {
        return getClass().getName() + ": " + getReflectType();
    }
}
