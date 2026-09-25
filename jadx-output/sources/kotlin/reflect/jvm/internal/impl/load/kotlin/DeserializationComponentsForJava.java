package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: compiled from: DeserializationComponentsForJava.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DeserializationComponentsForJava {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents components;

    public DeserializationComponentsForJava(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration configuration, kotlin.reflect.jvm.internal.impl.load.kotlin.JavaClassDataFinder classDataFinder, kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl annotationAndConstantLoader, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider packageFragmentProvider, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker lookupTracker, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer contractDeserializer) {
        kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter settings;
        kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider settings2;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(configuration, "configuration");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classDataFinder, "classDataFinder");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotationAndConstantLoader, "annotationAndConstantLoader");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packageFragmentProvider, "packageFragmentProvider");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(errorReporter, "errorReporter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lookupTracker, "lookupTracker");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(contractDeserializer, "contractDeserializer");
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns = moduleDescriptor.getBuiltIns();
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns jvmBuiltIns = (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns) (builtIns instanceof kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns ? builtIns : null);
        this.components = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents(storageManager, moduleDescriptor, configuration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default.INSTANCE, errorReporter, lookupTracker, kotlin.reflect.jvm.internal.impl.load.kotlin.JavaFlexibleTypeDeserializer.INSTANCE, kotlin.collections.CollectionsKt.emptyList(), notFoundClasses, contractDeserializer, (jvmBuiltIns == null || (settings2 = jvmBuiltIns.getSettings()) == null) ? kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None.INSTANCE : settings2, (jvmBuiltIns == null || (settings = jvmBuiltIns.getSettings()) == null) ? kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.NoPlatformDependent.INSTANCE : settings, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.INSTANCE.getEXTENSION_REGISTRY());
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents getComponents() {
        return this.components;
    }
}
