package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* JADX INFO: compiled from: LazyJavaStaticClassScope.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaStaticClassScope extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope {
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass jClass;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor ownerDescriptor;

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo1270getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor getOwnerDescriptor() {
        return this.ownerDescriptor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass jClass, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor ownerDescriptor) {
        super(c);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jClass, "jClass");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(ownerDescriptor, "ownerDescriptor");
        this.jClass = jClass;
        this.ownerDescriptor = ownerDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex computeMemberIndex() {
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex(this.jClass, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeMemberIndex.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember javaMember) {
                return java.lang.Boolean.valueOf(invoke2(javaMember));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it.isStatic();
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computeFunctionNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> mutableSet = kotlin.collections.CollectionsKt.toMutableSet(getDeclaredMemberIndex().invoke().getMethodNames());
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope parentJavaStaticClassScope = kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt.getParentJavaStaticClassScope(getOwnerDescriptor());
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> functionNames = parentJavaStaticClassScope != null ? parentJavaStaticClassScope.getFunctionNames() : null;
        if (functionNames == null) {
            functionNames = kotlin.collections.SetsKt.emptySet();
        }
        mutableSet.addAll(functionNames);
        if (this.jClass.isEnum()) {
            mutableSet.addAll(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.Name[]{kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.ENUM_VALUE_OF, kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.ENUM_VALUES}));
        }
        return mutableSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computePropertyNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> mutableSet = kotlin.collections.CollectionsKt.toMutableSet(getDeclaredMemberIndex().invoke().getFieldNames());
        flatMapJavaStaticSupertypesScopes(getOwnerDescriptor(), mutableSet, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$computePropertyNames$1$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> invoke(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it.getVariableNames();
            }
        });
        return mutableSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computeClassNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void computeNonDeclaredFunctions(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> result, kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(result, "result");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collectionResolveOverridesForStaticMembers = kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.resolveOverridesForStaticMembers(name, getStaticFunctionsFromJavaSuperClasses(name, getOwnerDescriptor()), result, getOwnerDescriptor(), getC().getComponents().getErrorReporter());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionResolveOverridesForStaticMembers, "resolveOverridesForStati…components.errorReporter)");
        result.addAll(collectionResolveOverridesForStaticMembers);
        if (this.jClass.isEnum()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(name, kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.ENUM_VALUE_OF)) {
                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptorCreateEnumValueOfMethod = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createEnumValueOfMethod(getOwnerDescriptor());
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(simpleFunctionDescriptorCreateEnumValueOfMethod, "createEnumValueOfMethod(ownerDescriptor)");
                result.add(simpleFunctionDescriptorCreateEnumValueOfMethod);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(name, kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.ENUM_VALUES)) {
                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptorCreateEnumValuesMethod = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createEnumValuesMethod(getOwnerDescriptor());
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(simpleFunctionDescriptorCreateEnumValuesMethod, "createEnumValuesMethod(ownerDescriptor)");
                result.add(simpleFunctionDescriptorCreateEnumValuesMethod);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void computeNonDeclaredProperties(final kotlin.reflect.jvm.internal.impl.name.Name name, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> result) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(result, "result");
        java.util.Set setFlatMapJavaStaticSupertypesScopes = flatMapJavaStaticSupertypesScopes(getOwnerDescriptor(), new java.util.LinkedHashSet(), new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> invoke(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it.getContributedVariables(name, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            }
        });
        if (!result.isEmpty()) {
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> collectionResolveOverridesForStaticMembers = kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.resolveOverridesForStaticMembers(name, setFlatMapJavaStaticSupertypesScopes, result, getOwnerDescriptor(), getC().getComponents().getErrorReporter());
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionResolveOverridesForStaticMembers, "resolveOverridesForStati…components.errorReporter)");
            result.addAll(collectionResolveOverridesForStaticMembers);
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : setFlatMapJavaStaticSupertypesScopes) {
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor realOriginal = getRealOriginal((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) obj);
            java.lang.Object arrayList = linkedHashMap.get(realOriginal);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(realOriginal, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList2, kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.resolveOverridesForStaticMembers(name, (java.util.Collection) ((java.util.Map.Entry) it.next()).getValue(), result, getOwnerDescriptor(), getC().getComponents().getErrorReporter()));
        }
        result.addAll(arrayList2);
    }

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getStaticFunctionsFromJavaSuperClasses(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope parentJavaStaticClassScope = kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt.getParentJavaStaticClassScope(classDescriptor);
        if (parentJavaStaticClassScope == null) {
            return kotlin.collections.SetsKt.emptySet();
        }
        return kotlin.collections.CollectionsKt.toSet(parentJavaStaticClassScope.getContributedFunctions(name, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
    }

    private final <R> java.util.Set<R> flatMapJavaStaticSupertypesScopes(final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, final java.util.Set<R> set, final kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, ? extends java.util.Collection<? extends R>> function1) {
        kotlin.reflect.jvm.internal.impl.utils.DFS.dfs(kotlin.collections.CollectionsKt.listOf(classDescriptor), new kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors<N>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes.1
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public final java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> getNeighbors(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor it) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = it.getTypeConstructor();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "it.typeConstructor");
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collectionMo1269getSupertypes = typeConstructor.mo1269getSupertypes();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionMo1269getSupertypes, "it.typeConstructor.supertypes");
                return kotlin.sequences.SequencesKt.asIterable(kotlin.sequences.SequencesKt.mapNotNull(kotlin.collections.CollectionsKt.asSequence(collectionMo1269getSupertypes), new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes.1.1
                    @Override // kotlin.jvm.functions.Function1
                    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor invoke(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
                        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = kotlinType.getConstructor().mo1268getDeclarationDescriptor();
                        if (!(classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
                            classifierDescriptorMo1268getDeclarationDescriptor = null;
                        }
                        return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor;
                    }
                }));
            }
        }, new kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes.2
            /* JADX INFO: renamed from: result, reason: collision with other method in class */
            public void m1265result() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public /* bridge */ /* synthetic */ java.lang.Object result() {
                m1265result();
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public boolean beforeChildren(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor current) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(current, "current");
                if (current == classDescriptor) {
                    return true;
                }
                kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope staticScope = current.getStaticScope();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(staticScope, "current.staticScope");
                if (!(staticScope instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope)) {
                    return true;
                }
                set.addAll((java.util.Collection) function1.invoke(staticScope));
                return false;
            }
        });
        return set;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor getRealOriginal(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind = propertyDescriptor.getKind();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kind, "this.kind");
        if (kind.isReal()) {
            return propertyDescriptor;
        }
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> overriddenDescriptors = propertyDescriptor.getOverriddenDescriptors();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(overriddenDescriptors, "this.overriddenDescriptors");
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> collection = overriddenDescriptors;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor it : collection) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
            arrayList.add(getRealOriginal(it));
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) kotlin.collections.CollectionsKt.single(kotlin.collections.CollectionsKt.distinct(arrayList));
    }
}
