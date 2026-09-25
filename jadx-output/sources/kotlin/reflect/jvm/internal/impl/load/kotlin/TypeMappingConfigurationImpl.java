package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: compiled from: methodSignatureMapping.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeMappingConfigurationImpl implements kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration<kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType> {
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfigurationImpl INSTANCE = new kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfigurationImpl();

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public java.lang.String getPredefinedInternalNameForClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType getPredefinedTypeForClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public void processErrorType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinType, "kotlinType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
    }

    private TypeMappingConfigurationImpl() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public kotlin.reflect.jvm.internal.impl.types.KotlinType preprocessType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinType, "kotlinType");
        return kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration.DefaultImpls.preprocessType(this, kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public boolean releaseCoroutines() {
        return kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration.DefaultImpls.releaseCoroutines(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public kotlin.reflect.jvm.internal.impl.types.KotlinType commonSupertype(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> types) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(types, "types");
        throw new java.lang.AssertionError("There should be no intersection type in existing descriptors, but found: " + kotlin.collections.CollectionsKt.joinToString$default(types, null, null, null, 0, null, null, 63, null));
    }
}
