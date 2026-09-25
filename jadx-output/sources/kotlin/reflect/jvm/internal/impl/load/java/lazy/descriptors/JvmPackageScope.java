package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* JADX INFO: compiled from: JvmPackageScope.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmPackageScope implements kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope.class), "kotlinScopes", "getKotlinScopes()Ljava/util/List;"))};
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope javaScope;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue kotlinScopes$delegate;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment packageFragment;

    private final java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> getKotlinScopes() {
        return (java.util.List) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.kotlinScopes$delegate, this, (kotlin.reflect.KProperty<?>) $$delegatedProperties[0]);
    }

    public JvmPackageScope(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage jPackage, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment packageFragment) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jPackage, "jPackage");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packageFragment, "packageFragment");
        this.c = c;
        this.packageFragment = packageFragment;
        this.javaScope = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope(c, jPackage, packageFragment);
        this.kotlinScopes$delegate = c.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope$kotlinScopes$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> invoke() {
                java.util.Collection<kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass> collectionValues = this.this$0.packageFragment.getBinaryClasses$descriptors_jvm().values();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScopeCreateKotlinPackagePartScope = this.this$0.c.getComponents().getDeserializedDescriptorResolver().createKotlinPackagePartScope(this.this$0.packageFragment, (kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass) it.next());
                    if (memberScopeCreateKotlinPackagePartScope != null) {
                        arrayList.add(memberScopeCreateKotlinPackagePartScope);
                    }
                }
                return kotlin.collections.CollectionsKt.toList(arrayList);
            }
        });
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope getJavaScope$descriptors_jvm() {
        return this.javaScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo1270getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        recordLookup(name, location);
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorMo1270getContributedClassifier = this.javaScope.mo1270getContributedClassifier(name, location);
        if (classDescriptorMo1270getContributedClassifier != null) {
            return classDescriptorMo1270getContributedClassifier;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) null;
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> it = getKotlinScopes().iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier = it.next().mo1270getContributedClassifier(name, location);
            if (contributedClassifier != null) {
                if (!(contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters) || !((kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters) contributedClassifier).isExpect()) {
                    return contributedClassifier;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = contributedClassifier;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        recordLookup(name, location);
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope lazyJavaPackageScope = this.javaScope;
        java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> kotlinScopes = getKotlinScopes();
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> contributedVariables = lazyJavaPackageScope.getContributedVariables(name, location);
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> it = kotlinScopes.iterator();
        java.util.Collection collectionConcat = contributedVariables;
        while (it.hasNext()) {
            collectionConcat = kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt.concat(collectionConcat, it.next().getContributedVariables(name, location));
        }
        return collectionConcat != null ? collectionConcat : kotlin.collections.SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        recordLookup(name, location);
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope lazyJavaPackageScope = this.javaScope;
        java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> kotlinScopes = getKotlinScopes();
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> contributedFunctions = lazyJavaPackageScope.getContributedFunctions(name, location);
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> it = kotlinScopes.iterator();
        java.util.Collection collectionConcat = contributedFunctions;
        while (it.hasNext()) {
            collectionConcat = kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt.concat(collectionConcat, it.next().getContributedFunctions(name, location));
        }
        return collectionConcat != null ? collectionConcat : kotlin.collections.SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> nameFilter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameFilter, "nameFilter");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope lazyJavaPackageScope = this.javaScope;
        java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> kotlinScopes = getKotlinScopes();
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> contributedDescriptors = lazyJavaPackageScope.getContributedDescriptors(kindFilter, nameFilter);
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> it = kotlinScopes.iterator();
        while (it.hasNext()) {
            contributedDescriptors = kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt.concat(contributedDescriptors, it.next().getContributedDescriptors(kindFilter, nameFilter));
        }
        return contributedDescriptors != null ? contributedDescriptors : kotlin.collections.SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames() {
        java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> kotlinScopes = getKotlinScopes();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator<T> it = kotlinScopes.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(linkedHashSet, ((kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope) it.next()).getFunctionNames());
        }
        java.util.LinkedHashSet linkedHashSet2 = linkedHashSet;
        linkedHashSet2.addAll(this.javaScope.getFunctionNames());
        return linkedHashSet2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames() {
        java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> kotlinScopes = getKotlinScopes();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator<T> it = kotlinScopes.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(linkedHashSet, ((kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope) it.next()).getVariableNames());
        }
        java.util.LinkedHashSet linkedHashSet2 = linkedHashSet;
        linkedHashSet2.addAll(this.javaScope.getVariableNames());
        return linkedHashSet2;
    }

    public void recordLookup(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.record(this.c.getComponents().getLookupTracker(), location, this.packageFragment, name);
    }
}
