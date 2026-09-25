package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JavaResolverComponents {
    private final kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver annotationTypeQualifierResolver;
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver deserializedDescriptorResolver;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter;
    private final kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder finder;
    private final kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker javaClassesTracker;
    private final kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator;
    private final kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache javaResolverCache;
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder;
    private final kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker lookupTracker;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver moduleClassResolver;
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider packagePartProvider;
    private final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes reflectionTypes;
    private final kotlin.reflect.jvm.internal.impl.load.java.components.SamConversionResolver samConversionResolver;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings settings;
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement signatureEnhancement;
    private final kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator signaturePropagator;
    private final kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory sourceElementFactory;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager;
    private final kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker supertypeLoopChecker;

    public JavaResolverComponents(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder finder, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder, kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver deserializedDescriptorResolver, kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator signaturePropagator, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter, kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache javaResolverCache, kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, kotlin.reflect.jvm.internal.impl.load.java.components.SamConversionResolver samConversionResolver, kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory sourceElementFactory, kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver moduleClassResolver, kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider packagePartProvider, kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker supertypeLoopChecker, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker lookupTracker, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module, kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes reflectionTypes, kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver annotationTypeQualifierResolver, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement signatureEnhancement, kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker javaClassesTracker, kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings settings) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(finder, "finder");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinClassFinder, "kotlinClassFinder");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signaturePropagator, "signaturePropagator");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(errorReporter, "errorReporter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaResolverCache, "javaResolverCache");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaPropertyInitializerEvaluator, "javaPropertyInitializerEvaluator");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(samConversionResolver, "samConversionResolver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(sourceElementFactory, "sourceElementFactory");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(moduleClassResolver, "moduleClassResolver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packagePartProvider, "packagePartProvider");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(supertypeLoopChecker, "supertypeLoopChecker");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lookupTracker, "lookupTracker");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(reflectionTypes, "reflectionTypes");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signatureEnhancement, "signatureEnhancement");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaClassesTracker, "javaClassesTracker");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(settings, "settings");
        this.storageManager = storageManager;
        this.finder = finder;
        this.kotlinClassFinder = kotlinClassFinder;
        this.deserializedDescriptorResolver = deserializedDescriptorResolver;
        this.signaturePropagator = signaturePropagator;
        this.errorReporter = errorReporter;
        this.javaResolverCache = javaResolverCache;
        this.javaPropertyInitializerEvaluator = javaPropertyInitializerEvaluator;
        this.samConversionResolver = samConversionResolver;
        this.sourceElementFactory = sourceElementFactory;
        this.moduleClassResolver = moduleClassResolver;
        this.packagePartProvider = packagePartProvider;
        this.supertypeLoopChecker = supertypeLoopChecker;
        this.lookupTracker = lookupTracker;
        this.module = module;
        this.reflectionTypes = reflectionTypes;
        this.annotationTypeQualifierResolver = annotationTypeQualifierResolver;
        this.signatureEnhancement = signatureEnhancement;
        this.javaClassesTracker = javaClassesTracker;
        this.settings = settings;
    }

    public final kotlin.reflect.jvm.internal.impl.storage.StorageManager getStorageManager() {
        return this.storageManager;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder getFinder() {
        return this.finder;
    }

    public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder getKotlinClassFinder() {
        return this.kotlinClassFinder;
    }

    public final kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver getDeserializedDescriptorResolver() {
        return this.deserializedDescriptorResolver;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator getSignaturePropagator() {
        return this.signaturePropagator;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache getJavaResolverCache() {
        return this.javaResolverCache;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator getJavaPropertyInitializerEvaluator() {
        return this.javaPropertyInitializerEvaluator;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory getSourceElementFactory() {
        return this.sourceElementFactory;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver getModuleClassResolver() {
        return this.moduleClassResolver;
    }

    public final kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider getPackagePartProvider() {
        return this.packagePartProvider;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker getSupertypeLoopChecker() {
        return this.supertypeLoopChecker;
    }

    public final kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker getLookupTracker() {
        return this.lookupTracker;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getModule() {
        return this.module;
    }

    public final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes getReflectionTypes() {
        return this.reflectionTypes;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver getAnnotationTypeQualifierResolver() {
        return this.annotationTypeQualifierResolver;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement getSignatureEnhancement() {
        return this.signatureEnhancement;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker getJavaClassesTracker() {
        return this.javaClassesTracker;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings getSettings() {
        return this.settings;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents replace(kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache javaResolverCache) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaResolverCache, "javaResolverCache");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents(this.storageManager, this.finder, this.kotlinClassFinder, this.deserializedDescriptorResolver, this.signaturePropagator, this.errorReporter, javaResolverCache, this.javaPropertyInitializerEvaluator, this.samConversionResolver, this.sourceElementFactory, this.moduleClassResolver, this.packagePartProvider, this.supertypeLoopChecker, this.lookupTracker, this.module, this.reflectionTypes, this.annotationTypeQualifierResolver, this.signatureEnhancement, this.javaClassesTracker, this.settings);
    }
}
