package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* JADX INFO: compiled from: LazyPackageViewDescriptorImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LazyPackageViewDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl implements kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl.class), "fragments", "getFragments()Ljava/util/List;"))};
    private final kotlin.reflect.jvm.internal.impl.name.FqName fqName;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue fragments$delegate;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope;
    private final kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl module;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> getFragments() {
        return (java.util.List) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.fragments$delegate, this, (kotlin.reflect.KProperty<?>) $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public boolean isEmpty() {
        return kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor.DefaultImpls.isEmpty(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl getModule() {
        return this.module;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public kotlin.reflect.jvm.internal.impl.name.FqName getFqName() {
        return this.fqName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl module, kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), fqName.shortNameOrSpecial());
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        this.module = module;
        this.fqName = fqName;
        this.fragments$delegate = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$fragments$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> invoke() {
                return this.this$0.getModule().getPackageFragmentProvider().getPackageFragments(this.this$0.getFqName());
            }
        });
        this.memberScope = new kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter(storageManager.createLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$memberScope$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope invoke() {
                if (this.this$0.getFragments().isEmpty()) {
                    return kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
                }
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> fragments = this.this$0.getFragments();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(fragments, 10));
                java.util.Iterator<T> it = fragments.iterator();
                while (it.hasNext()) {
                    arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) it.next()).getMemberScope());
                }
                return new kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope("package view scope for " + this.this$0.getFqName() + " in " + this.this$0.getModule().getName(), kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.impl.SubpackagesScope>) arrayList, new kotlin.reflect.jvm.internal.impl.descriptors.impl.SubpackagesScope(this.this$0.getModule(), this.this$0.getFqName())));
            }
        }));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope() {
        return this.memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor getContainingDeclaration() {
        if (getFqName().isRoot()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl module = getModule();
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameParent = getFqName().parent();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameParent, "fqName.parent()");
        return module.getPackage(fqNameParent);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor)) {
            obj = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor packageViewDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor) obj;
        return packageViewDescriptor != null && kotlin.jvm.internal.Intrinsics.areEqual(getFqName(), packageViewDescriptor.getFqName()) && kotlin.jvm.internal.Intrinsics.areEqual(getModule(), packageViewDescriptor.getModule());
    }

    public int hashCode() {
        return (getModule().hashCode() * 31) + getFqName().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> visitor, D d) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(visitor, "visitor");
        return visitor.visitPackageViewDescriptor(this, d);
    }
}
