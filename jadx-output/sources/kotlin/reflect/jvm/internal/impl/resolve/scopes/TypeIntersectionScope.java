package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* JADX INFO: compiled from: TypeIntersectionScope.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeIntersectionScope extends kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter {
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope.Companion Companion = new kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope.Companion(null);
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope workerScope;

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope create(java.lang.String str, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> collection) {
        return Companion.create(str, collection);
    }

    private TypeIntersectionScope(kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope chainedMemberScope) {
        this.workerScope = chainedMemberScope;
    }

    public /* synthetic */ TypeIntersectionScope(kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope chainedMemberScope, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(chainedMemberScope);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope getWorkerScope() {
        return this.workerScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        return kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(super.getContributedFunctions(name, location), new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope.getContributedFunctions.1
            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor invoke(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor receiver) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                return receiver;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        return kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(super.getContributedVariables(name, location), new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope.getContributedVariables.1
            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor invoke(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor receiver) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                return receiver;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> nameFilter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameFilter, "nameFilter");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> contributedDescriptors = super.getContributedDescriptors(kindFilter, nameFilter);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : contributedDescriptors) {
            if (((kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) obj) instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        kotlin.Pair pair = new kotlin.Pair(arrayList, arrayList2);
        java.util.List list = (java.util.List) pair.component1();
        java.util.List list2 = (java.util.List) pair.component2();
        if (list != null) {
            return kotlin.collections.CollectionsKt.plus(kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope.getContributedDescriptors.2
                @Override // kotlin.jvm.functions.Function1
                public final kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor receiver) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                    return receiver;
                }
            }), (java.lang.Iterable) list2);
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
    }

    /* JADX INFO: compiled from: TypeIntersectionScope.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope create(java.lang.String message, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> types) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(message, "message");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(types, "types");
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> collection = types;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).getMemberScope());
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope chainedMemberScope = new kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope(message, arrayList);
            return types.size() <= 1 ? chainedMemberScope : new kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope(chainedMemberScope, null);
        }
    }
}
