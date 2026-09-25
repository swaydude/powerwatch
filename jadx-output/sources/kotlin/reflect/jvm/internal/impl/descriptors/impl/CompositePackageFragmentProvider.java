package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* JADX INFO: compiled from: CompositePackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CompositePackageFragmentProvider implements kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider {
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider> providers;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositePackageFragmentProvider(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider> providers) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(providers, "providers");
        this.providers = providers;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> getPackageFragments(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider> it = this.providers.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getPackageFragments(fqName));
        }
        return kotlin.collections.CollectionsKt.toList(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.name.FqName> getSubPackagesOf(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> nameFilter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameFilter, "nameFilter");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider> it = this.providers.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().getSubPackagesOf(fqName, nameFilter));
        }
        return hashSet;
    }
}
