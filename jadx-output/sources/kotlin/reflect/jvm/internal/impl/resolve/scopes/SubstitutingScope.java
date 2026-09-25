package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* JADX INFO: compiled from: SubstitutingScope.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SubstitutingScope implements kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope.class), "_allDescriptors", "get_allDescriptors()Ljava/util/Collection;"))};
    private final kotlin.Lazy _allDescriptors$delegate;
    private java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> substitutedDescriptors;
    private final kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor substitutor;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope workerScope;

    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> get_allDescriptors() {
        kotlin.Lazy lazy = this._allDescriptors$delegate;
        kotlin.reflect.KProperty kProperty = $$delegatedProperties[0];
        return (java.util.Collection) lazy.getValue();
    }

    public SubstitutingScope(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope workerScope, kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor givenSubstitutor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(workerScope, "workerScope");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(givenSubstitutor, "givenSubstitutor");
        this.workerScope = workerScope;
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitution substitution = givenSubstitutor.getSubstitution();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(substitution, "givenSubstitutor.substitution");
        this.substitutor = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(substitution, false, 1, null).buildSubstitutor();
        this._allDescriptors$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope$_allDescriptors$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> invoke() {
                kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope substitutingScope = this.this$0;
                return substitutingScope.substitute(kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.getContributedDescriptors$default(substitutingScope.workerScope, null, null, 3, null));
            }
        });
    }

    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> D substitute(D d) {
        if (this.substitutor.isEmpty()) {
            return d;
        }
        if (this.substitutedDescriptors == null) {
            this.substitutedDescriptors = new java.util.HashMap();
        }
        java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> map = this.substitutedDescriptors;
        if (map == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot declarationDescriptorNonRoot = map.get(d);
        if (declarationDescriptorNonRoot == null) {
            if (!(d instanceof kotlin.reflect.jvm.internal.impl.descriptors.Substitutable)) {
                throw new java.lang.IllegalStateException(("Unknown descriptor in scope: " + d).toString());
            }
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot declarationDescriptorNonRootSubstitute = ((kotlin.reflect.jvm.internal.impl.descriptors.Substitutable) d).substitute(this.substitutor);
            if (declarationDescriptorNonRootSubstitute == null) {
                throw new java.lang.AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d + " substitution fails");
            }
            declarationDescriptorNonRoot = declarationDescriptorNonRootSubstitute;
            map.put(d, declarationDescriptorNonRoot);
        }
        D d2 = (D) declarationDescriptorNonRoot;
        if (d2 != null) {
            return d2;
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type D");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> java.util.Collection<D> substitute(java.util.Collection<? extends D> collection) {
        if (this.substitutor.isEmpty() || collection.isEmpty()) {
            return collection;
        }
        java.util.LinkedHashSet linkedHashSetNewLinkedHashSetWithExpectedSize = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.newLinkedHashSetWithExpectedSize(collection.size());
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetNewLinkedHashSetWithExpectedSize.add(substitute((kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) it.next()));
        }
        return linkedHashSetNewLinkedHashSetWithExpectedSize;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        return substitute(this.workerScope.getContributedVariables(name, location));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo1270getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier = this.workerScope.mo1270getContributedClassifier(name, location);
        if (contributedClassifier != null) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) substitute(contributedClassifier);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        return substitute(this.workerScope.getContributedFunctions(name, location));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> nameFilter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameFilter, "nameFilter");
        return get_allDescriptors();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames() {
        return this.workerScope.getFunctionNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames() {
        return this.workerScope.getVariableNames();
    }
}
