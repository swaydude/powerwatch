package kotlin.reflect.jvm.internal.impl.resolve.jvm;

/* JADX INFO: compiled from: JavaDescriptorResolver.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JavaDescriptorResolver {
    private final kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache javaResolverCache;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider packageFragmentProvider;

    public JavaDescriptorResolver(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider packageFragmentProvider, kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache javaResolverCache) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packageFragmentProvider, "packageFragmentProvider");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaResolverCache, "javaResolverCache");
        this.packageFragmentProvider = packageFragmentProvider;
        this.javaResolverCache = javaResolverCache;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider getPackageFragmentProvider() {
        return this.packageFragmentProvider;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor resolveClass(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaClass, "javaClass");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = javaClass.getFqName();
        if (fqName != null && javaClass.getLightClassOriginKind() == kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind.SOURCE) {
            return this.javaResolverCache.getClassResolvedFromSource(fqName);
        }
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass outerClass = javaClass.getOuterClass();
        if (outerClass != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorResolveClass = resolveClass(outerClass);
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedInnerClassesScope = classDescriptorResolveClass != null ? classDescriptorResolveClass.getUnsubstitutedInnerClassesScope() : null;
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier = unsubstitutedInnerClassesScope != null ? unsubstitutedInnerClassesScope.mo1270getContributedClassifier(javaClass.getName(), kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_JAVA_LOADER) : null;
            return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) (contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? contributedClassifier : null);
        }
        if (fqName == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = this.packageFragmentProvider;
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameParent = fqName.parent();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameParent, "fqName.parent()");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment lazyJavaPackageFragment = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) lazyJavaPackageFragmentProvider.getPackageFragments(fqNameParent));
        if (lazyJavaPackageFragment != null) {
            return lazyJavaPackageFragment.findClassifierByJavaClass$descriptors_jvm(javaClass);
        }
        return null;
    }
}
