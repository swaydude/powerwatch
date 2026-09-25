package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DeserializationComponents {
    private final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider additionalClassPartsProvider;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> annotationAndConstantLoader;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder classDataFinder;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer classDeserializer;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration configuration;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer contractDeserializer;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter;
    private final kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite;
    private final java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> fictitiousClassDescriptorFactories;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer flexibleTypeDeserializer;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings localClassifierTypeSettings;
    private final kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker lookupTracker;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses;
    private final kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider packageFragmentProvider;
    private final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter platformDependentDeclarationFilter;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager;

    /* JADX WARN: Multi-variable type inference failed */
    public DeserializationComponents(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration configuration, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder classDataFinder, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> annotationAndConstantLoader, kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider packageFragmentProvider, kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings localClassifierTypeSettings, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker lookupTracker, kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer flexibleTypeDeserializer, java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> fictitiousClassDescriptorFactories, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer contractDeserializer, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider additionalClassPartsProvider, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter platformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(configuration, "configuration");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classDataFinder, "classDataFinder");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotationAndConstantLoader, "annotationAndConstantLoader");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packageFragmentProvider, "packageFragmentProvider");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(localClassifierTypeSettings, "localClassifierTypeSettings");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(errorReporter, "errorReporter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lookupTracker, "lookupTracker");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(contractDeserializer, "contractDeserializer");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(additionalClassPartsProvider, "additionalClassPartsProvider");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(extensionRegistryLite, "extensionRegistryLite");
        this.storageManager = storageManager;
        this.moduleDescriptor = moduleDescriptor;
        this.configuration = configuration;
        this.classDataFinder = classDataFinder;
        this.annotationAndConstantLoader = annotationAndConstantLoader;
        this.packageFragmentProvider = packageFragmentProvider;
        this.localClassifierTypeSettings = localClassifierTypeSettings;
        this.errorReporter = errorReporter;
        this.lookupTracker = lookupTracker;
        this.flexibleTypeDeserializer = flexibleTypeDeserializer;
        this.fictitiousClassDescriptorFactories = fictitiousClassDescriptorFactories;
        this.notFoundClasses = notFoundClasses;
        this.contractDeserializer = contractDeserializer;
        this.additionalClassPartsProvider = additionalClassPartsProvider;
        this.platformDependentDeclarationFilter = platformDependentDeclarationFilter;
        this.extensionRegistryLite = extensionRegistryLite;
        this.classDeserializer = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer(this);
    }

    public final kotlin.reflect.jvm.internal.impl.storage.StorageManager getStorageManager() {
        return this.storageManager;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getModuleDescriptor() {
        return this.moduleDescriptor;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration getConfiguration() {
        return this.configuration;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder getClassDataFinder() {
        return this.classDataFinder;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> getAnnotationAndConstantLoader() {
        return this.annotationAndConstantLoader;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider getPackageFragmentProvider() {
        return this.packageFragmentProvider;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings getLocalClassifierTypeSettings() {
        return this.localClassifierTypeSettings;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    public final kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker getLookupTracker() {
        return this.lookupTracker;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer getFlexibleTypeDeserializer() {
        return this.flexibleTypeDeserializer;
    }

    public final java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> getFictitiousClassDescriptorFactories() {
        return this.fictitiousClassDescriptorFactories;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses getNotFoundClasses() {
        return this.notFoundClasses;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer getContractDeserializer() {
        return this.contractDeserializer;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return this.additionalClassPartsProvider;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return this.platformDependentDeclarationFilter;
    }

    public final kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite getExtensionRegistryLite() {
        return this.extensionRegistryLite;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer getClassDeserializer() {
        return this.classDeserializer;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor deserializeClass(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.deserializeClass$default(this.classDeserializer, classId, null, 2, null);
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext createContext(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor descriptor, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable versionRequirementTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion metadataVersion, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource deserializedContainerSource) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(versionRequirementTable, "versionRequirementTable");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(metadataVersion, "metadataVersion");
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, deserializedContainerSource, null, kotlin.collections.CollectionsKt.emptyList());
    }
}
