package kotlin.reflect.jvm.internal.components;

/* JADX INFO: compiled from: RuntimeModuleData.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "", "deserialization", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/DeserializationComponents;", "packagePartScopeCache", "Lkotlin/reflect/jvm/internal/components/PackagePartScopeCache;", "(Lorg/jetbrains/kotlin/serialization/deserialization/DeserializationComponents;Lkotlin/reflect/jvm/internal/components/PackagePartScopeCache;)V", "getDeserialization", "()Lorg/jetbrains/kotlin/serialization/deserialization/DeserializationComponents;", "module", "Lkotlin/reflect/jvm/internal/impl/descriptors/ModuleDescriptor;", "getModule", "()Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "getPackagePartScopeCache", "()Lkotlin/reflect/jvm/internal/components/PackagePartScopeCache;", "Companion", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
public final class RuntimeModuleData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.reflect.jvm.internal.components.RuntimeModuleData.Companion INSTANCE = new kotlin.reflect.jvm.internal.components.RuntimeModuleData.Companion(null);
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserialization;
    private final kotlin.reflect.jvm.internal.components.PackagePartScopeCache packagePartScopeCache;

    private RuntimeModuleData(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents, kotlin.reflect.jvm.internal.components.PackagePartScopeCache packagePartScopeCache) {
        this.deserialization = deserializationComponents;
        this.packagePartScopeCache = packagePartScopeCache;
    }

    public /* synthetic */ RuntimeModuleData(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents, kotlin.reflect.jvm.internal.components.PackagePartScopeCache packagePartScopeCache, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(deserializationComponents, packagePartScopeCache);
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents getDeserialization() {
        return this.deserialization;
    }

    public final kotlin.reflect.jvm.internal.components.PackagePartScopeCache getPackagePartScopeCache() {
        return this.packagePartScopeCache;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getModule() {
        return this.deserialization.getModuleDescriptor();
    }

    /* JADX INFO: compiled from: RuntimeModuleData.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimeModuleData$Companion;", "", "()V", "create", "Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "classLoader", "Ljava/lang/ClassLoader;", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.reflect.jvm.internal.components.RuntimeModuleData create(java.lang.ClassLoader classLoader) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classLoader, "classLoader");
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager = new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager("RuntimeModuleData");
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns jvmBuiltIns = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns(lockBasedStorageManager, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.FROM_DEPENDENCIES);
            kotlin.reflect.jvm.internal.impl.name.Name nameSpecial = kotlin.reflect.jvm.internal.impl.name.Name.special("<runtime module for " + classLoader + kotlin.text.Typography.greater);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameSpecial, "Name.special(\"<runtime module for $classLoader>\")");
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl moduleDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl(nameSpecial, lockBasedStorageManager, jvmBuiltIns, null, null, null, 56, null);
            jvmBuiltIns.setBuiltInsModule(moduleDescriptorImpl);
            kotlin.reflect.jvm.internal.components.ReflectKotlinClassFinder reflectKotlinClassFinder = new kotlin.reflect.jvm.internal.components.ReflectKotlinClassFinder(classLoader);
            kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver deserializedDescriptorResolver = new kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver();
            kotlin.reflect.jvm.internal.impl.load.java.lazy.SingleModuleClassResolver singleModuleClassResolver = new kotlin.reflect.jvm.internal.impl.load.java.lazy.SingleModuleClassResolver();
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl moduleDescriptorImpl2 = moduleDescriptorImpl;
            kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses = new kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses(lockBasedStorageManager, moduleDescriptorImpl2);
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver annotationTypeQualifierResolver = new kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver(lockBasedStorageManager, kotlin.reflect.jvm.internal.impl.utils.Jsr305State.DISABLED);
            kotlin.reflect.jvm.internal.components.ReflectJavaClassFinder reflectJavaClassFinder = new kotlin.reflect.jvm.internal.components.ReflectJavaClassFinder(classLoader);
            kotlin.reflect.jvm.internal.components.ReflectKotlinClassFinder reflectKotlinClassFinder2 = reflectKotlinClassFinder;
            kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator signaturePropagator = kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator.DO_NOTHING;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(signaturePropagator, "SignaturePropagator.DO_NOTHING");
            kotlin.reflect.jvm.internal.components.RuntimeErrorReporter runtimeErrorReporter = kotlin.reflect.jvm.internal.components.RuntimeErrorReporter.INSTANCE;
            kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache javaResolverCache = kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache.EMPTY;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(javaResolverCache, "JavaResolverCache.EMPTY");
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider(new kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents(lockBasedStorageManager, reflectJavaClassFinder, reflectKotlinClassFinder2, deserializedDescriptorResolver, signaturePropagator, runtimeErrorReporter, javaResolverCache, kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator.DoNothing.INSTANCE, kotlin.reflect.jvm.internal.impl.load.java.components.SamConversionResolver.Empty.INSTANCE, kotlin.reflect.jvm.internal.components.RuntimeSourceElementFactory.INSTANCE, singleModuleClassResolver, kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider.Empty.INSTANCE, kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY.INSTANCE, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING.INSTANCE, moduleDescriptorImpl2, new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes(moduleDescriptorImpl2, notFoundClasses), annotationTypeQualifierResolver, new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement(annotationTypeQualifierResolver, kotlin.reflect.jvm.internal.impl.utils.Jsr305State.DISABLED), kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker.Default.INSTANCE, kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings.Default.INSTANCE));
            jvmBuiltIns.initialize(moduleDescriptorImpl2, true);
            kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache javaResolverCache2 = kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache.EMPTY;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(javaResolverCache2, "JavaResolverCache.EMPTY");
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver javaDescriptorResolver = new kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver(lazyJavaPackageFragmentProvider, javaResolverCache2);
            kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava deserializationComponentsForJava = new kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava(lockBasedStorageManager, moduleDescriptorImpl2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.Default.INSTANCE, new kotlin.reflect.jvm.internal.impl.load.kotlin.JavaClassDataFinder(reflectKotlinClassFinder2, deserializedDescriptorResolver), new kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl(moduleDescriptorImpl2, notFoundClasses, lockBasedStorageManager, reflectKotlinClassFinder2), lazyJavaPackageFragmentProvider, notFoundClasses, kotlin.reflect.jvm.internal.components.RuntimeErrorReporter.INSTANCE, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING.INSTANCE, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer.Companion.getDEFAULT());
            java.lang.ClassLoader stdlibClassLoader = kotlin.Unit.class.getClassLoader();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(stdlibClassLoader, "stdlibClassLoader");
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsPackageFragmentProvider jvmBuiltInsPackageFragmentProvider = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsPackageFragmentProvider(lockBasedStorageManager, new kotlin.reflect.jvm.internal.components.ReflectKotlinClassFinder(stdlibClassLoader), moduleDescriptorImpl2, notFoundClasses, jvmBuiltIns.getSettings(), jvmBuiltIns.getSettings(), kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.Default.INSTANCE);
            singleModuleClassResolver.setResolver(javaDescriptorResolver);
            deserializedDescriptorResolver.setComponents(deserializationComponentsForJava);
            moduleDescriptorImpl.setDependencies(moduleDescriptorImpl);
            moduleDescriptorImpl.initialize(new kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider[]{javaDescriptorResolver.getPackageFragmentProvider(), jvmBuiltInsPackageFragmentProvider})));
            return new kotlin.reflect.jvm.internal.components.RuntimeModuleData(deserializationComponentsForJava.getComponents(), new kotlin.reflect.jvm.internal.components.PackagePartScopeCache(deserializedDescriptorResolver, reflectKotlinClassFinder), null);
        }
    }
}
