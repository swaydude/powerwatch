package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* JADX INFO: compiled from: StaticScopeForKotlinEnum.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StaticScopeForKotlinEnum extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum.class), "functions", "getFunctions()Ljava/util/List;"))};
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor containingClass;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue functions$delegate;

    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getFunctions() {
        return (java.util.List) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.functions$delegate, this, (kotlin.reflect.KProperty<?>) $$delegatedProperties[0]);
    }

    public java.lang.Void getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo1270getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        return (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) getContributedClassifier(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public /* bridge */ /* synthetic */ java.util.Collection getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1 function1) {
        return getContributedDescriptors(descriptorKindFilter, (kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean>) function1);
    }

    public StaticScopeForKotlinEnum(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor containingClass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(containingClass, "containingClass");
        this.containingClass = containingClass;
        containingClass.getKind();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS;
        this.functions$delegate = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum$functions$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> invoke() {
                return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor[]{kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createEnumValueOfMethod(this.this$0.containingClass), kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createEnumValuesMethod(this.this$0.containingClass)});
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> nameFilter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameFilter, "nameFilter");
        return getFunctions();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> functions = getFunctions();
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        for (java.lang.Object obj : functions) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj).getName(), name)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
