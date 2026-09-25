package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: PackageFragmentProviderImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PackageFragmentProviderImpl implements kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider {
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> packageFragments;

    /* JADX WARN: Multi-variable type inference failed */
    public PackageFragmentProviderImpl(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> packageFragments) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packageFragments, "packageFragments");
        this.packageFragments = packageFragments;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> getPackageFragments(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> collection = this.packageFragments;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) obj).getFqName(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.name.FqName> getSubPackagesOf(final kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> nameFilter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameFilter, "nameFilter");
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.filter(kotlin.sequences.SequencesKt.map(kotlin.collections.CollectionsKt.asSequence(this.packageFragments), new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor, kotlin.reflect.jvm.internal.impl.name.FqName>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl.getSubPackagesOf.1
            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.name.FqName invoke(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it.getFqName();
            }
        }), new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.FqName, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl.getSubPackagesOf.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.name.FqName fqName2) {
                return java.lang.Boolean.valueOf(invoke2(fqName2));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(kotlin.reflect.jvm.internal.impl.name.FqName it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return !it.isRoot() && kotlin.jvm.internal.Intrinsics.areEqual(it.parent(), fqName);
            }
        }));
    }
}
