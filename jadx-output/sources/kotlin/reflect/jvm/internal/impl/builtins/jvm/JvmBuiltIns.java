package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* JADX INFO: compiled from: JvmBuiltIns.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmBuiltIns extends kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsSettings;"))};
    private boolean isAdditionalBuiltInsFeatureSupported;
    private kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor ownerModuleDescriptor;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue settings$delegate;

    /* JADX INFO: compiled from: JvmBuiltIns.kt */
    public enum Kind {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            iArr[kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            iArr[kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.FALLBACK.ordinal()] = 3;
        }
    }

    public final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings getSettings() {
        return (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.settings$delegate, this, (kotlin.reflect.KProperty<?>) $$delegatedProperties[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(final kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind kind) {
        super(storageManager);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kind, "kind");
        this.isAdditionalBuiltInsFeatureSupported = true;
        this.settings$delegate = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$settings$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings invoke() {
                kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl builtInsModule = this.this$0.getBuiltInsModule();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(builtInsModule, "builtInsModule");
                return new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings(builtInsModule, storageManager, new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$settings$2.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor invoke() {
                        kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$settings$2.this.this$0.ownerModuleDescriptor;
                        if (moduleDescriptor != null) {
                            return moduleDescriptor;
                        }
                        throw new java.lang.AssertionError("JvmBuiltins has not been initialized properly");
                    }
                }, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$settings$2.2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ java.lang.Boolean invoke() {
                        return java.lang.Boolean.valueOf(invoke2());
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final boolean invoke2() {
                        if (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$settings$2.this.this$0.ownerModuleDescriptor != null) {
                            return kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$settings$2.this.this$0.isAdditionalBuiltInsFeatureSupported;
                        }
                        throw new java.lang.AssertionError("JvmBuiltins has not been initialized properly");
                    }
                });
            }
        });
        int i = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i == 2) {
            createBuiltInsModule(false);
        } else {
            if (i != 3) {
                return;
            }
            createBuiltInsModule(true);
        }
    }

    public final void initialize(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(moduleDescriptor, "moduleDescriptor");
        kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor2 = this.ownerModuleDescriptor;
        this.ownerModuleDescriptor = moduleDescriptor;
        this.isAdditionalBuiltInsFeatureSupported = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    protected kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return getSettings();
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    protected kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return getSettings();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> getClassDescriptorFactories() {
        java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> classDescriptorFactories = super.getClassDescriptorFactories();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classDescriptorFactories, "super.getClassDescriptorFactories()");
        kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager = getStorageManager();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(storageManager, "storageManager");
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl builtInsModule = getBuiltInsModule();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(builtInsModule, "builtInsModule");
        return kotlin.collections.CollectionsKt.plus(classDescriptorFactories, new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory(storageManager, builtInsModule, null, 4, null));
    }
}
