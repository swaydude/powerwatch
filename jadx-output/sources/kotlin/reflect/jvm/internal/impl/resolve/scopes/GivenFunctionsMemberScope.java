package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* JADX INFO: compiled from: GivenFunctionsMemberScope.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class GivenFunctionsMemberScope extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue allDescriptors$delegate;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor containingClass;

    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getAllDescriptors() {
        return (java.util.List) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.allDescriptors$delegate, this, (kotlin.reflect.KProperty<?>) $$delegatedProperties[0]);
    }

    protected abstract java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> computeDeclaredFunctions();

    protected final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getContainingClass() {
        return this.containingClass;
    }

    public GivenFunctionsMemberScope(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor containingClass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(containingClass, "containingClass");
        this.containingClass = containingClass;
        this.allDescriptors$delegate = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$allDescriptors$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> invoke() {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> listComputeDeclaredFunctions = this.this$0.computeDeclaredFunctions();
                return kotlin.collections.CollectionsKt.plus((java.util.Collection) listComputeDeclaredFunctions, (java.lang.Iterable) this.this$0.createFakeOverrides(listComputeDeclaredFunctions));
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> nameFilter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameFilter, "nameFilter");
        return !kindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.CALLABLES.getKindMask()) ? kotlin.collections.CollectionsKt.emptyList() : getAllDescriptors();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> allDescriptors = getAllDescriptors();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : allDescriptors) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj2).getName(), name)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> allDescriptors = getAllDescriptors();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : allDescriptors) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) obj2).getName(), name)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> createFakeOverrides(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> list) {
        java.util.ArrayList arrayListEmptyList;
        final java.util.ArrayList arrayList = new java.util.ArrayList(3);
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = this.containingClass.getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "containingClass.typeConstructor");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collectionMo1269getSupertypes = typeConstructor.mo1269getSupertypes();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionMo1269getSupertypes, "containingClass.typeConstructor.supertypes");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it = collectionMo1269getSupertypes.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList2, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.getContributedDescriptors$default(((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).getMemberScope(), null, null, 3, null));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList2) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) {
                arrayList3.add(obj);
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj2 : arrayList3) {
            kotlin.reflect.jvm.internal.impl.name.Name name = ((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj2).getName();
            java.lang.Object arrayList4 = linkedHashMap.get(name);
            if (arrayList4 == null) {
                arrayList4 = new java.util.ArrayList();
                linkedHashMap.put(name, arrayList4);
            }
            ((java.util.List) arrayList4).add(obj2);
        }
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            kotlin.reflect.jvm.internal.impl.name.Name name2 = (kotlin.reflect.jvm.internal.impl.name.Name) entry.getKey();
            java.util.List list2 = (java.util.List) entry.getValue();
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            for (java.lang.Object obj3 : list2) {
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj3) instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor);
                java.lang.Object arrayList5 = linkedHashMap2.get(boolValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new java.util.ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList5);
                }
                ((java.util.List) arrayList5).add(obj3);
            }
            for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((java.lang.Boolean) entry2.getKey()).booleanValue();
                java.util.List list3 = (java.util.List) entry2.getValue();
                if (!zBooleanValue) {
                    arrayListEmptyList = kotlin.collections.CollectionsKt.emptyList();
                } else {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    for (java.lang.Object obj4 : list) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) obj4).getName(), name2)) {
                            arrayList6.add(obj4);
                        }
                    }
                    arrayListEmptyList = arrayList6;
                }
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.generateOverridesInFunctionGroup(name2, list3, arrayListEmptyList, this.containingClass, new kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope.createFakeOverrides.4
                    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                    public void addFakeOverride(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor fakeOverride) {
                        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fakeOverride, "fakeOverride");
                        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.resolveUnknownVisibilityForMember(fakeOverride, null);
                        arrayList.add(fakeOverride);
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                    protected void conflict(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor fromSuper, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor fromCurrent) {
                        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fromSuper, "fromSuper");
                        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fromCurrent, "fromCurrent");
                        throw new java.lang.IllegalStateException(("Conflict in scope of " + kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope.this.getContainingClass() + ": " + fromSuper + " vs " + fromCurrent).toString());
                    }
                });
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList);
    }
}
