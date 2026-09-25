package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* JADX INFO: compiled from: ChainedMemberScope.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ChainedMemberScope implements kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope {
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope.Companion Companion = new kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope.Companion(null);
    private final java.lang.String debugName;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> scopes;

    /* JADX WARN: Multi-variable type inference failed */
    public ChainedMemberScope(java.lang.String debugName, java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> scopes) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(debugName, "debugName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scopes, "scopes");
        this.debugName = debugName;
        this.scopes = scopes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo1270getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) null;
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> it = this.scopes.iterator();
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
        java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> list = this.scopes;
        if (list.isEmpty()) {
            return kotlin.collections.SetsKt.emptySet();
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> collectionConcat = (java.util.Collection) null;
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> it = list.iterator();
        while (it.hasNext()) {
            collectionConcat = kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt.concat(collectionConcat, it.next().getContributedVariables(name, location));
        }
        return collectionConcat != null ? collectionConcat : kotlin.collections.SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> list = this.scopes;
        if (list.isEmpty()) {
            return kotlin.collections.SetsKt.emptySet();
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collectionConcat = (java.util.Collection) null;
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> it = list.iterator();
        while (it.hasNext()) {
            collectionConcat = kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt.concat(collectionConcat, it.next().getContributedFunctions(name, location));
        }
        return collectionConcat != null ? collectionConcat : kotlin.collections.SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> nameFilter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameFilter, "nameFilter");
        java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> list = this.scopes;
        if (list.isEmpty()) {
            return kotlin.collections.SetsKt.emptySet();
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> collectionConcat = (java.util.Collection) null;
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> it = list.iterator();
        while (it.hasNext()) {
            collectionConcat = kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt.concat(collectionConcat, it.next().getContributedDescriptors(kindFilter, nameFilter));
        }
        return collectionConcat != null ? collectionConcat : kotlin.collections.SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames() {
        java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> list = this.scopes;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(linkedHashSet, ((kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope) it.next()).getFunctionNames());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames() {
        java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> list = this.scopes;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(linkedHashSet, ((kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope) it.next()).getVariableNames());
        }
        return linkedHashSet;
    }

    public java.lang.String toString() {
        return this.debugName;
    }

    /* JADX INFO: compiled from: ChainedMemberScope.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope create(java.lang.String debugName, java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> scopes) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(debugName, "debugName");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scopes, "scopes");
            int size = scopes.size();
            if (size == 0) {
                return kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
            }
            if (size == 1) {
                return (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope) kotlin.collections.CollectionsKt.single((java.util.List) scopes);
            }
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope(debugName, scopes);
        }
    }
}
