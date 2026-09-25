package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: compiled from: typeSignatureMapping.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface TypeMappingConfiguration<T> {

    /* JADX INFO: compiled from: typeSignatureMapping.kt */
    public static final class DefaultImpls {
        public static <T> kotlin.reflect.jvm.internal.impl.types.KotlinType preprocessType(kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration<? extends T> typeMappingConfiguration, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinType, "kotlinType");
            return null;
        }

        public static <T> boolean releaseCoroutines(kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration<? extends T> typeMappingConfiguration) {
            return true;
        }
    }

    kotlin.reflect.jvm.internal.impl.types.KotlinType commonSupertype(java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collection);

    java.lang.String getPredefinedInternalNameForClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor);

    T getPredefinedTypeForClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor);

    kotlin.reflect.jvm.internal.impl.types.KotlinType preprocessType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType);

    void processErrorType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor);

    boolean releaseCoroutines();
}
