package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* JADX INFO: compiled from: ModuleDescriptorImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ModuleDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl implements kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl.class), "packageFragmentProviderForWholeModuleWithDependencies", "getPackageFragmentProviderForWholeModuleWithDependencies()Lorg/jetbrains/kotlin/descriptors/impl/CompositePackageFragmentProvider;"))};
    private final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns;
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor.Capability<? extends java.lang.Object>, java.lang.Object> capabilities;
    private kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies dependencies;
    private boolean isValid;
    private kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider packageFragmentProviderForModuleContent;
    private final kotlin.Lazy packageFragmentProviderForWholeModuleWithDependencies$delegate;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor> packages;
    private final kotlin.reflect.jvm.internal.impl.name.Name stableName;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager;

    public ModuleDescriptorImpl(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns, kotlin.reflect.jvm.internal.impl.resolve.MultiTargetPlatform multiTargetPlatform) {
        this(name, storageManager, kotlinBuiltIns, multiTargetPlatform, null, null, 48, null);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider getPackageFragmentProviderForWholeModuleWithDependencies() {
        kotlin.Lazy lazy = this.packageFragmentProviderForWholeModuleWithDependencies$delegate;
        kotlin.reflect.KProperty kProperty = $$delegatedProperties[0];
        return (kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider) lazy.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> visitor, D d) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(visitor, "visitor");
        return (R) kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor.DefaultImpls.accept(this, visitor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration() {
        return kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor.DefaultImpls.getContainingDeclaration(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
        return this.builtIns;
    }

    public /* synthetic */ ModuleDescriptorImpl(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns, kotlin.reflect.jvm.internal.impl.resolve.MultiTargetPlatform multiTargetPlatform, java.util.Map map, kotlin.reflect.jvm.internal.impl.name.Name name2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(name, storageManager, kotlinBuiltIns, (i & 8) != 0 ? (kotlin.reflect.jvm.internal.impl.resolve.MultiTargetPlatform) null : multiTargetPlatform, (i & 16) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 32) != 0 ? (kotlin.reflect.jvm.internal.impl.name.Name) null : name2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(kotlin.reflect.jvm.internal.impl.name.Name moduleName, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns, kotlin.reflect.jvm.internal.impl.resolve.MultiTargetPlatform multiTargetPlatform, java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor.Capability<?>, ? extends java.lang.Object> capabilities, kotlin.reflect.jvm.internal.impl.name.Name name) {
        java.util.Map mapMapOf;
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), moduleName);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(moduleName, "moduleName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builtIns, "builtIns");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(capabilities, "capabilities");
        this.storageManager = storageManager;
        this.builtIns = builtIns;
        this.stableName = name;
        if (!moduleName.isSpecial()) {
            throw new java.lang.IllegalArgumentException("Module name must be special: " + moduleName);
        }
        this.capabilities = kotlin.collections.MapsKt.plus(capabilities, (multiTargetPlatform == null || (mapMapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.resolve.MultiTargetPlatform.CAPABILITY, multiTargetPlatform))) == null) ? kotlin.collections.MapsKt.emptyMap() : mapMapOf);
        this.isValid = true;
        this.packages = storageManager.createMemoizedFunction(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packages$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl invoke(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
                kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl moduleDescriptorImpl = this.this$0;
                return new kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl(moduleDescriptorImpl, fqName, moduleDescriptorImpl.storageManager);
            }
        });
        this.packageFragmentProviderForWholeModuleWithDependencies$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider invoke() {
                kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies moduleDependencies = this.this$0.dependencies;
                if (moduleDependencies == null) {
                    throw new java.lang.AssertionError("Dependencies of module " + this.this$0.getId() + " were not set before querying module content");
                }
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> allDependencies = moduleDependencies.getAllDependencies();
                allDependencies.contains(this.this$0);
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> list = allDependencies;
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl) it.next()).isInitialized();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider packageFragmentProvider = ((kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl) it2.next()).packageFragmentProviderForModuleContent;
                    if (packageFragmentProvider == null) {
                        kotlin.jvm.internal.Intrinsics.throwNpe();
                    }
                    arrayList.add(packageFragmentProvider);
                }
                return new kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider(arrayList);
            }
        });
    }

    public boolean isValid() {
        return this.isValid;
    }

    public void assertValid() {
        if (isValid()) {
            return;
        }
        throw new kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException("Accessing invalid module descriptor " + this);
    }

    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor> getExpectedByModules() {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies moduleDependencies = this.dependencies;
        if (moduleDependencies != null) {
            return moduleDependencies.getExpectedByDependencies();
        }
        throw new java.lang.AssertionError("Dependencies of module " + getId() + " were not set");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor getPackage(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        assertValid();
        return this.packages.invoke(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.name.FqName> getSubPackagesOf(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> nameFilter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameFilter, "nameFilter");
        assertValid();
        return getPackageFragmentProvider().getSubPackagesOf(fqName, nameFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInitialized() {
        return this.packageFragmentProviderForModuleContent != null;
    }

    public final void setDependencies(kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies dependencies) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(dependencies, "dependencies");
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies moduleDependencies = this.dependencies;
        this.dependencies = dependencies;
    }

    public final void setDependencies(kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl... descriptors) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptors, "descriptors");
        setDependencies(kotlin.collections.ArraysKt.toList(descriptors));
    }

    public final void setDependencies(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> descriptors) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptors, "descriptors");
        setDependencies(descriptors, kotlin.collections.SetsKt.emptySet());
    }

    public final void setDependencies(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> descriptors, java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> friends) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptors, "descriptors");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(friends, "friends");
        setDependencies(new kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependenciesImpl(descriptors, friends, kotlin.collections.CollectionsKt.emptyList()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public boolean shouldSeeInternalsOf(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor targetModule) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(targetModule, "targetModule");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this, targetModule)) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies moduleDependencies = this.dependencies;
            if (moduleDependencies == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            if (!kotlin.collections.CollectionsKt.contains(moduleDependencies.getModulesWhoseInternalsAreVisible(), targetModule) && !getExpectedByModules().contains(targetModule)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String getId() {
        java.lang.String string = getName().toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "name.toString()");
        return string;
    }

    public final void initialize(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider providerForModuleContent) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(providerForModuleContent, "providerForModuleContent");
        isInitialized();
        this.packageFragmentProviderForModuleContent = providerForModuleContent;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider getPackageFragmentProvider() {
        assertValid();
        return getPackageFragmentProviderForWholeModuleWithDependencies();
    }
}
