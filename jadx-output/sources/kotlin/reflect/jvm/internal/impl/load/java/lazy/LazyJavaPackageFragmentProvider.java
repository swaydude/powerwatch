package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* JADX INFO: compiled from: LazyJavaPackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaPackageFragmentProvider implements kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider {
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c;
    private final kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment> packageFragments;

    public LazyJavaPackageFragmentProvider(kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents components) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(components, "components");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext = new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext(components, kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver.EMPTY.INSTANCE, kotlin.LazyKt.lazyOf(null));
        this.c = lazyJavaResolverContext;
        this.packageFragments = lazyJavaResolverContext.getStorageManager().createCacheWithNotNullValues();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public /* bridge */ /* synthetic */ java.util.Collection getSubPackagesOf(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.jvm.functions.Function1 function1) {
        return getSubPackagesOf(fqName, (kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean>) function1);
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment getPackageFragment(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage javaPackageFindPackage = this.c.getComponents().getFinder().findPackage(fqName);
        if (javaPackageFindPackage != null) {
            return this.packageFragments.computeIfAbsent(fqName, new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider.getPackageFragment.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment invoke() {
                    return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider.this.c, javaPackageFindPackage);
                }
            });
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public java.util.List<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment> getPackageFragments(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        return kotlin.collections.CollectionsKt.listOfNotNull(getPackageFragment(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> getSubPackagesOf(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> nameFilter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameFilter, "nameFilter");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment packageFragment = getPackageFragment(fqName);
        java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> subPackageFqNames$descriptors_jvm = packageFragment != null ? packageFragment.getSubPackageFqNames$descriptors_jvm() : null;
        return subPackageFqNames$descriptors_jvm != null ? subPackageFqNames$descriptors_jvm : kotlin.collections.CollectionsKt.emptyList();
    }
}
