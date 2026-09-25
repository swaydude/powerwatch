package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* JADX INFO: compiled from: JvmBuiltInsPackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmBuiltInsPackageFragmentProvider extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsPackageFragmentProvider(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder finder, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider additionalClassPartsProvider, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter platformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration deserializationConfiguration) {
        super(storageManager, finder, moduleDescriptor);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(finder, "finder");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(additionalClassPartsProvider, "additionalClassPartsProvider");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(deserializationConfiguration, "deserializationConfiguration");
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsPackageFragmentProvider jvmBuiltInsPackageFragmentProvider = this;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder deserializedClassDataFinder = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder(jvmBuiltInsPackageFragmentProvider);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl(moduleDescriptor, notFoundClasses, kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol.INSTANCE);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default r14 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default.INSTANCE;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter.DO_NOTHING;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(errorReporter, "ErrorReporter.DO_NOTHING");
        setComponents(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents(storageManager, moduleDescriptor, deserializationConfiguration, deserializedClassDataFinder, annotationAndConstantLoaderImpl, jvmBuiltInsPackageFragmentProvider, r14, errorReporter, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING.INSTANCE, kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer.ThrowException.INSTANCE, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory[]{new kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory(storageManager, moduleDescriptor), new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory(storageManager, moduleDescriptor, null, 4, null)}), notFoundClasses, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer.Companion.getDEFAULT(), additionalClassPartsProvider, platformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol.INSTANCE.getExtensionRegistry()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider
    protected kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment findPackage(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        java.io.InputStream inputStreamFindBuiltInsData = getFinder().findBuiltInsData(fqName);
        return inputStreamFindBuiltInsData != null ? kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl.Companion.create(fqName, getStorageManager(), getModuleDescriptor(), inputStreamFindBuiltInsData, false) : null;
    }
}
