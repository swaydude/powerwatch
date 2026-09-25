package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* JADX INFO: compiled from: JvmBuiltInsSettings.kt */
/* JADX INFO: loaded from: classes2.dex */
public class JvmBuiltInsSettings implements kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.class), "ownerModuleDescriptor", "getOwnerModuleDescriptor()Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.class), "isAdditionalBuiltInsFeatureSupported", "isAdditionalBuiltInsFeatureSupported()Z")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    private static final java.util.Set<java.lang.String> BLACK_LIST_CONSTRUCTOR_SIGNATURES;
    private static final java.util.Set<java.lang.String> BLACK_LIST_METHOD_SIGNATURES;
    public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.Companion Companion;
    private static final java.util.Set<java.lang.String> DROP_LIST_METHOD_SIGNATURES;
    private static final java.util.Set<java.lang.String> MUTABLE_METHOD_SIGNATURES;
    private static final java.util.Set<java.lang.String> WHITE_LIST_CONSTRUCTOR_SIGNATURES;
    private static final java.util.Set<java.lang.String> WHITE_LIST_METHOD_SIGNATURES;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue cloneableType$delegate;
    private final kotlin.Lazy isAdditionalBuiltInsFeatureSupported$delegate;
    private final kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap j2kClassMap;
    private final kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> javaAnalogueClassesWithCustomSupertypeCache;
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType mockSerializableType;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue notConsideredDeprecation$delegate;
    private final kotlin.Lazy ownerModuleDescriptor$delegate;

    /* JADX INFO: compiled from: JvmBuiltInsSettings.kt */
    private enum JDKMemberStatus {
        BLACK_LIST,
        WHITE_LIST,
        NOT_CONSIDERED,
        DROP
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.JDKMemberStatus.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.JDKMemberStatus.BLACK_LIST.ordinal()] = 1;
            iArr[kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.JDKMemberStatus.NOT_CONSIDERED.ordinal()] = 2;
            iArr[kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.JDKMemberStatus.DROP.ordinal()] = 3;
            iArr[kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.JDKMemberStatus.WHITE_LIST.ordinal()] = 4;
        }
    }

    private final kotlin.reflect.jvm.internal.impl.types.SimpleType getCloneableType() {
        return (kotlin.reflect.jvm.internal.impl.types.SimpleType) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.cloneableType$delegate, this, (kotlin.reflect.KProperty<?>) $$delegatedProperties[2]);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getNotConsideredDeprecation() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.notConsideredDeprecation$delegate, this, (kotlin.reflect.KProperty<?>) $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getOwnerModuleDescriptor() {
        kotlin.Lazy lazy = this.ownerModuleDescriptor$delegate;
        kotlin.reflect.KProperty kProperty = $$delegatedProperties[0];
        return (kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor) lazy.getValue();
    }

    private final boolean isAdditionalBuiltInsFeatureSupported() {
        kotlin.Lazy lazy = this.isAdditionalBuiltInsFeatureSupported$delegate;
        kotlin.reflect.KProperty kProperty = $$delegatedProperties[1];
        return ((java.lang.Boolean) lazy.getValue()).booleanValue();
    }

    public JvmBuiltInsSettings(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, final kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.jvm.functions.Function0<? extends kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor> deferredOwnerModuleDescriptor, kotlin.jvm.functions.Function0<java.lang.Boolean> isAdditionalBuiltInsFeatureSupported) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(deferredOwnerModuleDescriptor, "deferredOwnerModuleDescriptor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isAdditionalBuiltInsFeatureSupported, "isAdditionalBuiltInsFeatureSupported");
        this.moduleDescriptor = moduleDescriptor;
        this.j2kClassMap = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE;
        this.ownerModuleDescriptor$delegate = kotlin.LazyKt.lazy(deferredOwnerModuleDescriptor);
        this.isAdditionalBuiltInsFeatureSupported$delegate = kotlin.LazyKt.lazy(isAdditionalBuiltInsFeatureSupported);
        this.mockSerializableType = createMockJavaIoSerializableType(storageManager);
        this.cloneableType$delegate = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$cloneableType$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.types.SimpleType invoke() {
                return kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.this$0.getOwnerModuleDescriptor(), kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory.Companion.getCLONEABLE_CLASS_ID(), new kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses(storageManager, this.this$0.getOwnerModuleDescriptor())).getDefaultType();
            }
        });
        this.javaAnalogueClassesWithCustomSupertypeCache = storageManager.createCacheWithNotNullValues();
        this.notConsideredDeprecation$delegate = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$notConsideredDeprecation$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations invoke() {
                return kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.create(kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt.createDeprecatedAnnotation$default(this.this$0.moduleDescriptor.getBuiltIns(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, 6, null)));
            }
        });
    }

    private final kotlin.reflect.jvm.internal.impl.types.KotlinType createMockJavaIoSerializableType(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
        final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor = this.moduleDescriptor;
        final kotlin.reflect.jvm.internal.impl.name.FqName fqName = new kotlin.reflect.jvm.internal.impl.name.FqName("java.io");
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl classDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl(new kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl(moduleDescriptor, fqName) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$createMockJavaIoSerializableType$mockJavaIoPackageFragment$1
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
            public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty getMemberScope() {
                return kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
            }
        }, kotlin.reflect.jvm.internal.impl.name.Name.identifier("Serializable"), kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE, kotlin.collections.CollectionsKt.listOf(new kotlin.reflect.jvm.internal.impl.types.LazyWrappedType(storageManager, new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$createMockJavaIoSerializableType$superTypes$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.types.SimpleType invoke() {
                kotlin.reflect.jvm.internal.impl.types.SimpleType anyType = this.this$0.moduleDescriptor.getBuiltIns().getAnyType();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(anyType, "moduleDescriptor.builtIns.anyType");
                return anyType;
            }
        })), kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, false, storageManager);
        classDescriptorImpl.initialize(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE, kotlin.collections.SetsKt.emptySet(), null);
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = classDescriptorImpl.getDefaultType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(defaultType, "mockSerializableClass.defaultType");
        return defaultType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getSupertypes(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.Companion companion = Companion;
        if (!companion.isArrayOrPrimitiveArray(fqNameUnsafe)) {
            return companion.isSerializableInJava(fqNameUnsafe) ? kotlin.collections.CollectionsKt.listOf(this.mockSerializableType) : kotlin.collections.CollectionsKt.emptyList();
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType cloneableType = getCloneableType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(cloneableType, "cloneableType");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.types.KotlinType[]{cloneableType, this.mockSerializableType});
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0138  */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getFunctions(final kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptorBuild;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
        boolean z = true;
        if (kotlin.jvm.internal.Intrinsics.areEqual(name, kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope.Companion.getCLONE_NAME$descriptors_jvm()) && (classDescriptor instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) && kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isArrayOrPrimitiveArray(classDescriptor)) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) classDescriptor;
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> functionList = deserializedClassDescriptor.getClassProto().getFunctionList();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(functionList, "classDescriptor.classProto.functionList");
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> list = functionList;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                z = false;
            } else {
                for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function functionProto : list) {
                    kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver = deserializedClassDescriptor.getC().getNameResolver();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(functionProto, "functionProto");
                    if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(nameResolver, functionProto.getName()), kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope.Companion.getCLONE_NAME$descriptors_jvm())) {
                    }
                }
                z = false;
            }
            if (z) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            return kotlin.collections.CollectionsKt.listOf(createCloneForArray(deserializedClassDescriptor, (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) kotlin.collections.CollectionsKt.single(getCloneableType().getMemberScope().getContributedFunctions(name, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS))));
        }
        if (!isAdditionalBuiltInsFeatureSupported()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> additionalFunctions = getAdditionalFunctions(classDescriptor, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.getFunctions.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> invoke(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it.getContributedFunctions(name, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS);
            }
        });
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor : additionalFunctions) {
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = simpleFunctionDescriptor.getContainingDeclaration();
            if (containingDeclaration != null) {
                kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptorSubstitute = simpleFunctionDescriptor.substitute(kotlin.reflect.jvm.internal.impl.builtins.jvm.MappingUtilKt.createMappedTypeParametersSubstitution((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration, classDescriptor).buildSubstitutor());
                if (functionDescriptorSubstitute == null) {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
                }
                kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = ((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) functionDescriptorSubstitute).newCopyBuilder();
                copyBuilderNewCopyBuilder.setOwner(classDescriptor);
                copyBuilderNewCopyBuilder.setDispatchReceiverParameter(classDescriptor.getThisAsReceiverParameter());
                copyBuilderNewCopyBuilder.setPreserveSourceElement();
                int i = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.WhenMappings.$EnumSwitchMapping$0[getJdkMethodStatus(simpleFunctionDescriptor).ordinal()];
                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor2 = null;
                if (i == 1) {
                    if (!kotlin.reflect.jvm.internal.impl.descriptors.ModalityKt.isFinalClass(classDescriptor)) {
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(copyBuilderNewCopyBuilder.setHiddenForResolutionEverywhereBesideSupercalls(), "setHiddenForResolutionEverywhereBesideSupercalls()");
                        functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
                        if (functionDescriptorBuild == null) {
                            kotlin.jvm.internal.Intrinsics.throwNpe();
                        }
                        simpleFunctionDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) functionDescriptorBuild;
                    }
                } else {
                    if (i == 2) {
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(copyBuilderNewCopyBuilder.setAdditionalAnnotations(getNotConsideredDeprecation()), "setAdditionalAnnotations(notConsideredDeprecation)");
                    } else if (i != 3) {
                    }
                    functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
                    if (functionDescriptorBuild == null) {
                        kotlin.jvm.internal.Intrinsics.throwNpe();
                    }
                    simpleFunctionDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) functionDescriptorBuild;
                }
                if (simpleFunctionDescriptor2 != null) {
                    arrayList.add(simpleFunctionDescriptor2);
                }
            } else {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionsNames(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope unsubstitutedMemberScope;
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> functionNames;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
        if (!isAdditionalBuiltInsFeatureSupported()) {
            return kotlin.collections.SetsKt.emptySet();
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        return (javaAnalogue == null || (unsubstitutedMemberScope = javaAnalogue.getUnsubstitutedMemberScope()) == null || (functionNames = unsubstitutedMemberScope.getFunctionNames()) == null) ? kotlin.collections.SetsKt.emptySet() : functionNames;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x009e  */
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getAdditionalFunctions(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> function1) {
        boolean z;
        boolean z2;
        final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        if (javaAnalogue == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor lazyJavaClassDescriptor = javaAnalogue;
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> collectionMapPlatformClass = this.j2kClassMap.mapPlatformClass(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptor), kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns.Companion.getInstance());
        final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) kotlin.collections.CollectionsKt.lastOrNull(collectionMapPlatformClass);
        if (classDescriptor2 == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion companion = kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collectionMapPlatformClass, 10));
        java.util.Iterator<T> it = collectionMapPlatformClass.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) it.next()));
        }
        kotlin.reflect.jvm.internal.impl.utils.SmartSet smartSetCreate = companion.create(arrayList);
        boolean zIsMutable = this.j2kClassMap.isMutable(classDescriptor);
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedMemberScope = this.javaAnalogueClassesWithCustomSupertypeCache.computeIfAbsent(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptor), new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$getAdditionalFunctions$fakeJavaClassDescriptor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor invoke() {
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor lazyJavaClassDescriptor2 = javaAnalogue;
                kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache javaResolverCache = kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache.EMPTY;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(javaResolverCache, "JavaResolverCache.EMPTY");
                return lazyJavaClassDescriptor2.copy$descriptors_jvm(javaResolverCache, classDescriptor2);
            }
        }).getUnsubstitutedMemberScope();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(unsubstitutedMemberScope, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collectionInvoke = function1.invoke(unsubstitutedMemberScope);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : collectionInvoke) {
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj;
            if (simpleFunctionDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION && simpleFunctionDescriptor.getVisibility().isPublicAPI() && !kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isDeprecated(simpleFunctionDescriptor)) {
                java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> overriddenDescriptors = simpleFunctionDescriptor.getOverriddenDescriptors();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(overriddenDescriptors, "analogueMember.overriddenDescriptors");
                java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> collection = overriddenDescriptors;
                if (!(collection instanceof java.util.Collection) || !collection.isEmpty()) {
                    java.util.Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = false;
                            break;
                        }
                        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor it3 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) it2.next();
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it3, "it");
                        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = it3.getContainingDeclaration();
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(containingDeclaration, "it.containingDeclaration");
                        if (smartSetCreate.contains(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(containingDeclaration))) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
                z2 = (z || isMutabilityViolation(simpleFunctionDescriptor, zIsMutable)) ? false : true;
            }
            if (z2) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor createCloneForArray(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
        copyBuilderNewCopyBuilder.setOwner(deserializedClassDescriptor);
        copyBuilderNewCopyBuilder.setVisibility(kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PUBLIC);
        copyBuilderNewCopyBuilder.setReturnType(deserializedClassDescriptor.getDefaultType());
        copyBuilderNewCopyBuilder.setDispatchReceiverParameter(deserializedClassDescriptor.getThisAsReceiverParameter());
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
        if (functionDescriptorBuild == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) functionDescriptorBuild;
    }

    private final boolean isMutabilityViolation(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor, boolean z) {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = simpleFunctionDescriptor.getContainingDeclaration();
        if (containingDeclaration == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
        java.lang.String strComputeJvmDescriptor$default = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 3, null);
        if (z ^ MUTABLE_METHOD_SIGNATURES.contains(kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE.signature((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration, strComputeJvmDescriptor$default))) {
            return true;
        }
        java.lang.Boolean boolIfAny = kotlin.reflect.jvm.internal.impl.utils.DFS.ifAny(kotlin.collections.CollectionsKt.listOf(simpleFunctionDescriptor), new kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors<N>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.isMutabilityViolation.1
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public final java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> getNeighbors(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor it) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor original = it.getOriginal();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(original, "it.original");
                return original.getOverriddenDescriptors();
            }
        }, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.isMutabilityViolation.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
                return java.lang.Boolean.valueOf(invoke2(callableMemberDescriptor));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor overridden) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(overridden, "overridden");
                if (overridden.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION) {
                    kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap javaToKotlinClassMap = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.this.j2kClassMap;
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = overridden.getContainingDeclaration();
                    if (containingDeclaration2 == null) {
                        throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    }
                    if (javaToKotlinClassMap.isMutable((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration2)) {
                        return true;
                    }
                }
                return false;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(boolIfAny, "DFS.ifAny<CallableMember…lassDescriptor)\n        }");
        return boolIfAny.booleanValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$JDKMemberStatus] */
    private final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.JDKMemberStatus getJdkMethodStatus(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
        if (containingDeclaration == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
        final java.lang.String strComputeJvmDescriptor$default = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 3, null);
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.JDKMemberStatus) 0;
        java.lang.Object objDfs = kotlin.reflect.jvm.internal.impl.utils.DFS.dfs(kotlin.collections.CollectionsKt.listOf((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration), new kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors<N>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.getJdkMethodStatus.1
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor> getNeighbors(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor it) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = it.getTypeConstructor();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "it.typeConstructor");
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collectionMo1269getSupertypes = typeConstructor.mo1269getSupertypes();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionMo1269getSupertypes, "it.typeConstructor.supertypes");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<T> it2 = collectionMo1269getSupertypes.iterator();
                while (it2.hasNext()) {
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.types.KotlinType) it2.next()).getConstructor().mo1268getDeclarationDescriptor();
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor original = classifierDescriptorMo1268getDeclarationDescriptor != null ? classifierDescriptorMo1268getDeclarationDescriptor.getOriginal() : null;
                    if (!(original instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
                        original = null;
                    }
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) original;
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor javaAnalogue = classDescriptor != null ? kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.this.getJavaAnalogue(classDescriptor) : null;
                    if (javaAnalogue != null) {
                        arrayList.add(javaAnalogue);
                    }
                }
                return arrayList;
            }
        }, new kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.JDKMemberStatus>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.getJdkMethodStatus.2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$JDKMemberStatus] */
            /* JADX WARN: Type inference failed for: r0v11, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$JDKMemberStatus] */
            /* JADX WARN: Type inference failed for: r0v12, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$JDKMemberStatus] */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public boolean beforeChildren(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor javaClassDescriptor) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaClassDescriptor, "javaClassDescriptor");
                java.lang.String strSignature = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE.signature(javaClassDescriptor, strComputeJvmDescriptor$default);
                if (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.Companion.getBLACK_LIST_METHOD_SIGNATURES().contains(strSignature)) {
                    objectRef.element = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.JDKMemberStatus.BLACK_LIST;
                } else if (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.Companion.getWHITE_LIST_METHOD_SIGNATURES().contains(strSignature)) {
                    objectRef.element = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.JDKMemberStatus.WHITE_LIST;
                } else if (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.Companion.getDROP_LIST_METHOD_SIGNATURES().contains(strSignature)) {
                    objectRef.element = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.JDKMemberStatus.DROP;
                }
                return ((kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.JDKMemberStatus) objectRef.element) == null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.JDKMemberStatus result() {
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.JDKMemberStatus jDKMemberStatus = (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.JDKMemberStatus) objectRef.element;
                return jDKMemberStatus != null ? jDKMemberStatus : kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.JDKMemberStatus.NOT_CONSIDERED;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objDfs, "DFS.dfs<ClassDescriptor,…CONSIDERED\n            })");
        return (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.JDKMemberStatus) objDfs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor getJavaAnalogue(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.reflect.jvm.internal.impl.name.ClassId classIdMapKotlinToJava;
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameAsSingleFqName;
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isAny(classDescriptor)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = classDescriptor;
        if (!kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isUnderKotlinPackage(classDescriptor2)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(classDescriptor2);
        if (!fqNameUnsafe.isSafe() || (classIdMapKotlinToJava = this.j2kClassMap.mapKotlinToJava(fqNameUnsafe)) == null || (fqNameAsSingleFqName = classIdMapKotlinToJava.asSingleFqName()) == null) {
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameAsSingleFqName, "j2kClassMap.mapKotlinToJ…leFqName() ?: return null");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorResolveClassByFqName = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt.resolveClassByFqName(getOwnerModuleDescriptor(), fqNameAsSingleFqName, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS);
        return (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor) (classDescriptorResolveClassByFqName instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor ? classDescriptorResolveClassByFqName : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
        if (classDescriptor.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS || !isAdditionalBuiltInsFeatureSupported()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        if (javaAnalogue == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorMapJavaToKotlin$default = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.mapJavaToKotlin$default(this.j2kClassMap, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(javaAnalogue), kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns.Companion.getInstance(), null, 4, null);
        if (classDescriptorMapJavaToKotlin$default == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor lazyJavaClassDescriptor = javaAnalogue;
        final kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutorBuildSubstitutor = kotlin.reflect.jvm.internal.impl.builtins.jvm.MappingUtilKt.createMappedTypeParametersSubstitution(classDescriptorMapJavaToKotlin$default, lazyJavaClassDescriptor).buildSubstitutor();
        kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, java.lang.Boolean> function2 = new kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.getConstructors.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor constructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor constructorDescriptor2) {
                return java.lang.Boolean.valueOf(invoke2(constructorDescriptor, constructorDescriptor2));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor isEffectivelyTheSameAs, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor javaConstructor) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isEffectivelyTheSameAs, "$this$isEffectivelyTheSameAs");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaConstructor, "javaConstructor");
                return kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.getBothWaysOverridability(isEffectivelyTheSameAs, javaConstructor.substitute(typeSubstitutorBuildSubstitutor)) == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
            }
        };
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> constructors = javaAnalogue.getConstructors();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = constructors.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor javaConstructor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) next;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(javaConstructor, "javaConstructor");
            if (javaConstructor.getVisibility().isPublicAPI()) {
                java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> constructors2 = classDescriptorMapJavaToKotlin$default.getConstructors();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(constructors2, "defaultKotlinVersion.constructors");
                java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> collection = constructors2;
                if (!(collection instanceof java.util.Collection) || !collection.isEmpty()) {
                    java.util.Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = true;
                            break;
                        }
                        kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor it3 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) it2.next();
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it3, "it");
                        if (function2.invoke2((kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) it3, (kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) javaConstructor)) {
                            z = false;
                            break;
                        }
                    }
                } else {
                    z = true;
                    break;
                }
                if (z && !isTrivialCopyConstructorFor(javaConstructor, classDescriptor) && !kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isDeprecated(javaConstructor) && !BLACK_LIST_CONSTRUCTOR_SIGNATURES.contains(kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE.signature(lazyJavaClassDescriptor, kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(javaConstructor, false, false, 3, null)))) {
                    z2 = true;
                }
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor javaConstructor2 : arrayList2) {
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> copyBuilderNewCopyBuilder = javaConstructor2.newCopyBuilder();
            copyBuilderNewCopyBuilder.setOwner(classDescriptor);
            copyBuilderNewCopyBuilder.setReturnType(classDescriptor.getDefaultType());
            copyBuilderNewCopyBuilder.setPreserveSourceElement();
            copyBuilderNewCopyBuilder.setSubstitution(typeSubstitutorBuildSubstitutor.getSubstitution());
            java.util.Set<java.lang.String> set = WHITE_LIST_CONSTRUCTOR_SIGNATURES;
            kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(javaConstructor2, "javaConstructor");
            if (!set.contains(signatureBuildingComponents.signature(lazyJavaClassDescriptor, kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(javaConstructor2, false, false, 3, null)))) {
                copyBuilderNewCopyBuilder.setAdditionalAnnotations(getNotConsideredDeprecation());
            }
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
            if (functionDescriptorBuild == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            }
            arrayList3.add((kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) functionDescriptorBuild);
        }
        return arrayList3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
    public boolean isFunctionAvailable(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor functionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionDescriptor, "functionDescriptor");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        if (javaAnalogue == null || !functionDescriptor.getAnnotations().hasAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilterKt.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME())) {
            return true;
        }
        if (!isAdditionalBuiltInsFeatureSupported()) {
            return false;
        }
        java.lang.String strComputeJvmDescriptor$default = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 3, null);
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope unsubstitutedMemberScope = javaAnalogue.getUnsubstitutedMemberScope();
        kotlin.reflect.jvm.internal.impl.name.Name name = functionDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "functionDescriptor.name");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> contributedFunctions = unsubstitutedMemberScope.getContributedFunctions(name, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS);
        if (!(contributedFunctions instanceof java.util.Collection) || !contributedFunctions.isEmpty()) {
            java.util.Iterator<T> it = contributedFunctions.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) it.next(), false, false, 3, null), strComputeJvmDescriptor$default)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean isTrivialCopyConstructorFor(kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor constructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (constructorDescriptor.getValueParameters().size() == 1) {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = constructorDescriptor.getValueParameters();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "valueParameters");
            java.lang.Object objSingle = kotlin.collections.CollectionsKt.single((java.util.List<? extends java.lang.Object>) valueParameters);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objSingle, "valueParameters.single()");
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) objSingle).getType().getConstructor().mo1268getDeclarationDescriptor();
            if (kotlin.jvm.internal.Intrinsics.areEqual(classifierDescriptorMo1268getDeclarationDescriptor != null ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(classifierDescriptorMo1268getDeclarationDescriptor) : null, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(classDescriptor))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: compiled from: JvmBuiltInsSettings.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isSerializableInJava(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqName) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
            if (isArrayOrPrimitiveArray(fqName)) {
                return true;
            }
            kotlin.reflect.jvm.internal.impl.name.ClassId classIdMapKotlinToJava = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(fqName);
            if (classIdMapKotlinToJava != null) {
                try {
                    return java.io.Serializable.class.isAssignableFrom(java.lang.Class.forName(classIdMapKotlinToJava.asSingleFqName().asString()));
                } catch (java.lang.ClassNotFoundException unused) {
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isArrayOrPrimitiveArray(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
            return kotlin.jvm.internal.Intrinsics.areEqual(fqNameUnsafe, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.array) || kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveArray(fqNameUnsafe);
        }

        public final java.util.Set<java.lang.String> getDROP_LIST_METHOD_SIGNATURES() {
            return kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.DROP_LIST_METHOD_SIGNATURES;
        }

        public final java.util.Set<java.lang.String> getBLACK_LIST_METHOD_SIGNATURES() {
            return kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.BLACK_LIST_METHOD_SIGNATURES;
        }

        public final java.util.Set<java.lang.String> getWHITE_LIST_METHOD_SIGNATURES() {
            return kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.WHITE_LIST_METHOD_SIGNATURES;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.util.Set<java.lang.String> buildPrimitiveValueMethodsSet() {
            kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
            java.util.List<kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType> listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType[]{kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.CHAR});
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            for (kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType : listListOf) {
                java.lang.String strAsString = jvmPrimitiveType.getWrapperFqName().shortName().asString();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "it.wrapperFqName.shortName().asString()");
                kotlin.collections.CollectionsKt.addAll(linkedHashSet, signatureBuildingComponents.inJavaLang(strAsString, jvmPrimitiveType.getJavaKeywordName() + "Value()" + jvmPrimitiveType.getDesc()));
            }
            return linkedHashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.util.Set<java.lang.String> buildPrimitiveStringConstructorsSet() {
            kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
            java.util.List listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType[]{kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BYTE, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.DOUBLE, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.FLOAT, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BYTE, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.LONG, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.SHORT});
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                java.lang.String strAsString = ((kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType) it.next()).getWrapperFqName().shortName().asString();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "it.wrapperFqName.shortName().asString()");
                java.lang.String[] strArrConstructors = signatureBuildingComponents.constructors("Ljava/lang/String;");
                kotlin.collections.CollectionsKt.addAll(linkedHashSet, signatureBuildingComponents.inJavaLang(strAsString, (java.lang.String[]) java.util.Arrays.copyOf(strArrConstructors, strArrConstructors.length)));
            }
            return linkedHashSet;
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.Companion companion = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.Companion(null);
        Companion = companion;
        DROP_LIST_METHOD_SIGNATURES = kotlin.collections.SetsKt.plus(kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE.inJavaUtil("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
        BLACK_LIST_METHOD_SIGNATURES = kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(companion.buildPrimitiveValueMethodsSet(), (java.lang.Iterable) signatureBuildingComponents.inJavaUtil("List", "sort(Ljava/util/Comparator;)V")), (java.lang.Iterable) signatureBuildingComponents.inJavaLang("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), (java.lang.Iterable) signatureBuildingComponents.inJavaLang("Double", "isInfinite()Z", "isNaN()Z")), (java.lang.Iterable) signatureBuildingComponents.inJavaLang("Float", "isInfinite()Z", "isNaN()Z")), (java.lang.Iterable) signatureBuildingComponents.inJavaLang("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V"));
        kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents2 = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
        WHITE_LIST_METHOD_SIGNATURES = kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus((java.util.Set) signatureBuildingComponents2.inJavaLang("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), (java.lang.Iterable) signatureBuildingComponents2.inJavaUtil("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), (java.lang.Iterable) signatureBuildingComponents2.inJavaLang("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), (java.lang.Iterable) signatureBuildingComponents2.inJavaLang("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), (java.lang.Iterable) signatureBuildingComponents2.inJavaUtil("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), (java.lang.Iterable) signatureBuildingComponents2.inJavaUtil("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), (java.lang.Iterable) signatureBuildingComponents2.inJavaUtil("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents3 = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
        MUTABLE_METHOD_SIGNATURES = kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus((java.util.Set) signatureBuildingComponents3.inJavaUtil("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), (java.lang.Iterable) signatureBuildingComponents3.inJavaUtil("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), (java.lang.Iterable) signatureBuildingComponents3.inJavaUtil("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents4 = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
        java.util.Set setBuildPrimitiveStringConstructorsSet = companion.buildPrimitiveStringConstructorsSet();
        java.lang.String[] strArrConstructors = signatureBuildingComponents4.constructors("D");
        java.util.Set setPlus = kotlin.collections.SetsKt.plus(setBuildPrimitiveStringConstructorsSet, (java.lang.Iterable) signatureBuildingComponents4.inJavaLang("Float", (java.lang.String[]) java.util.Arrays.copyOf(strArrConstructors, strArrConstructors.length)));
        java.lang.String[] strArrConstructors2 = signatureBuildingComponents4.constructors("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        BLACK_LIST_CONSTRUCTOR_SIGNATURES = kotlin.collections.SetsKt.plus(setPlus, (java.lang.Iterable) signatureBuildingComponents4.inJavaLang("String", (java.lang.String[]) java.util.Arrays.copyOf(strArrConstructors2, strArrConstructors2.length)));
        kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents5 = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
        java.lang.String[] strArrConstructors3 = signatureBuildingComponents5.constructors("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        WHITE_LIST_CONSTRUCTOR_SIGNATURES = signatureBuildingComponents5.inJavaLang("Throwable", (java.lang.String[]) java.util.Arrays.copyOf(strArrConstructors3, strArrConstructors3.length));
    }
}
