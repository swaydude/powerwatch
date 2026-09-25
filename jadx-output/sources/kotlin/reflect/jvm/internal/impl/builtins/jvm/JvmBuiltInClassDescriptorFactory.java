package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* JADX INFO: compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmBuiltInClassDescriptorFactory implements kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory {
    private static final kotlin.reflect.jvm.internal.impl.name.ClassId CLONEABLE_CLASS_ID;
    private static final kotlin.reflect.jvm.internal.impl.name.Name CLONEABLE_NAME;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue cloneable$delegate;
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> computeContainingDeclaration;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor;
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
    public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory.Companion Companion = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory.Companion(null);
    private static final kotlin.reflect.jvm.internal.impl.name.FqName KOTLIN_FQ_NAME = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME;

    private final kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl getCloneable() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.cloneable$delegate, this, (kotlin.reflect.KProperty<?>) $$delegatedProperties[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JvmBuiltInClassDescriptorFactory(final kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, ? extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> computeContainingDeclaration) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(computeContainingDeclaration, "computeContainingDeclaration");
        this.moduleDescriptor = moduleDescriptor;
        this.computeContainingDeclaration = computeContainingDeclaration;
        this.cloneable$delegate = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory$cloneable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl invoke() {
                kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl classDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl((kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) this.this$0.computeContainingDeclaration.invoke(this.this$0.moduleDescriptor), kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory.CLONEABLE_NAME, kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE, kotlin.collections.CollectionsKt.listOf(this.this$0.moduleDescriptor.getBuiltIns().getAnyType()), kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, false, storageManager);
                classDescriptorImpl.initialize(new kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope(storageManager, classDescriptorImpl), kotlin.collections.SetsKt.emptySet(), null);
                return classDescriptorImpl;
            }
        });
    }

    public /* synthetic */ JvmBuiltInClassDescriptorFactory(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory.AnonymousClass1 anonymousClass1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, (i & 4) != 0 ? new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory.1
            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment invoke(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
                kotlin.reflect.jvm.internal.impl.name.FqName KOTLIN_FQ_NAME2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory.KOTLIN_FQ_NAME;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(KOTLIN_FQ_NAME2, "KOTLIN_FQ_NAME");
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> fragments = module.getPackage(KOTLIN_FQ_NAME2).getFragments();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : fragments) {
                    if (obj instanceof kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment) {
                        arrayList.add(obj);
                    }
                }
                return (kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment) kotlin.collections.CollectionsKt.first((java.util.List) arrayList);
            }
        } : anonymousClass1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean shouldCreateClass(kotlin.reflect.jvm.internal.impl.name.FqName packageFqName, kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packageFqName, "packageFqName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        return kotlin.jvm.internal.Intrinsics.areEqual(name, CLONEABLE_NAME) && kotlin.jvm.internal.Intrinsics.areEqual(packageFqName, KOTLIN_FQ_NAME);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor createClass(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
        if (kotlin.jvm.internal.Intrinsics.areEqual(classId, CLONEABLE_CLASS_ID)) {
            return getCloneable();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> getAllContributedClassesIfPossible(kotlin.reflect.jvm.internal.impl.name.FqName packageFqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packageFqName, "packageFqName");
        return kotlin.jvm.internal.Intrinsics.areEqual(packageFqName, KOTLIN_FQ_NAME) ? kotlin.collections.SetsKt.setOf(getCloneable()) : kotlin.collections.SetsKt.emptySet();
    }

    /* JADX INFO: compiled from: JvmBuiltInClassDescriptorFactory.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.reflect.jvm.internal.impl.name.ClassId getCLONEABLE_CLASS_ID() {
            return kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory.CLONEABLE_CLASS_ID;
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.Name nameShortName = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.cloneable.shortName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameShortName, "KotlinBuiltIns.FQ_NAMES.cloneable.shortName()");
        CLONEABLE_NAME = nameShortName;
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.cloneable.toSafe());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId, "ClassId.topLevel(KotlinB…NAMES.cloneable.toSafe())");
        CLONEABLE_CLASS_ID = classId;
    }
}
