package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

/* JADX INFO: compiled from: BuiltInsLoaderImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BuiltInsLoaderImpl implements kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader resourceLoader = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader();

    @Override // kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    public kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider createPackageFragmentProvider(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor builtInsModule, java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> classDescriptorFactories, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter platformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider additionalClassPartsProvider, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builtInsModule, "builtInsModule");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classDescriptorFactories, "classDescriptorFactories");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(additionalClassPartsProvider, "additionalClassPartsProvider");
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> set = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAMES;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(set, "KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAMES");
        return createBuiltInPackageFragmentProvider(storageManager, builtInsModule, set, classDescriptorFactories, platformDependentDeclarationFilter, additionalClassPartsProvider, z, new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsLoaderImpl.AnonymousClass1(this.resourceLoader));
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsLoaderImpl$createPackageFragmentProvider$1, reason: invalid class name */
    /* JADX INFO: compiled from: BuiltInsLoaderImpl.kt */
    static final /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.FunctionReference implements kotlin.jvm.functions.Function1<java.lang.String, java.io.InputStream> {
        AnonymousClass1(kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader builtInsResourceLoader) {
            super(1, builtInsResourceLoader);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final java.lang.String getName() {
            return "loadResource";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final kotlin.reflect.KDeclarationContainer getOwner() {
            return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final java.lang.String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }

        @Override // kotlin.jvm.functions.Function1
        public final java.io.InputStream invoke(java.lang.String p1) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p1, "p1");
            return ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader) this.receiver).loadResource(p1);
        }
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider createBuiltInPackageFragmentProvider(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module, java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> packageFqNames, java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> classDescriptorFactories, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter platformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider additionalClassPartsProvider, boolean z, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends java.io.InputStream> loadResource) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packageFqNames, "packageFqNames");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classDescriptorFactories, "classDescriptorFactories");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(additionalClassPartsProvider, "additionalClassPartsProvider");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(loadResource, "loadResource");
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> set = packageFqNames;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10));
        for (kotlin.reflect.jvm.internal.impl.name.FqName fqName : set) {
            java.lang.String builtInsFilePath = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol.INSTANCE.getBuiltInsFilePath(fqName);
            java.io.InputStream inputStreamInvoke = loadResource.invoke(builtInsFilePath);
            if (inputStreamInvoke == null) {
                throw new java.lang.IllegalStateException("Resource not found in classpath: " + builtInsFilePath);
            }
            arrayList.add(kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl.Companion.create(fqName, storageManager, module, inputStreamInvoke, z));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl packageFragmentProviderImpl = new kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl(arrayList2);
        kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses = new kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses(storageManager, module);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.Default r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.Default.INSTANCE;
        kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl packageFragmentProviderImpl2 = packageFragmentProviderImpl;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder deserializedClassDataFinder = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder(packageFragmentProviderImpl2);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl(module, notFoundClasses, kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol.INSTANCE);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default r7 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default.INSTANCE;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter.DO_NOTHING;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(errorReporter, "ErrorReporter.DO_NOTHING");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents(storageManager, module, r3, deserializedClassDataFinder, annotationAndConstantLoaderImpl, packageFragmentProviderImpl2, r7, errorReporter, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING.INSTANCE, kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer.ThrowException.INSTANCE, classDescriptorFactories, notFoundClasses, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer.Companion.getDEFAULT(), additionalClassPartsProvider, platformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol.INSTANCE.getExtensionRegistry());
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl) it.next()).initialize(deserializationComponents);
        }
        return packageFragmentProviderImpl2;
    }
}
