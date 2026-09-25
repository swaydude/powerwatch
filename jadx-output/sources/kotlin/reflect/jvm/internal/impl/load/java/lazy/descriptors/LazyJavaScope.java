package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* JADX INFO: compiled from: LazyJavaScope.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class LazyJavaScope extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor>> allDescriptors;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue classNamesLazy$delegate;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex> declaredMemberIndex;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue functionNamesLazy$delegate;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> functions;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.name.Name, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor>> properties;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue propertyNamesLazy$delegate;

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNamesLazy() {
        return (java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.functionNamesLazy$delegate, this, (kotlin.reflect.KProperty<?>) $$delegatedProperties[0]);
    }

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getPropertyNamesLazy() {
        return (java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.propertyNamesLazy$delegate, this, (kotlin.reflect.KProperty<?>) $$delegatedProperties[1]);
    }

    protected abstract java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computeClassNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1);

    protected abstract java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computeFunctionNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1);

    protected abstract kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex computeMemberIndex();

    protected abstract void computeNonDeclaredFunctions(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection, kotlin.reflect.jvm.internal.impl.name.Name name);

    protected abstract void computeNonDeclaredProperties(kotlin.reflect.jvm.internal.impl.name.Name name, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> collection);

    protected abstract java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computePropertyNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1);

    protected abstract kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getDispatchReceiverParameter();

    protected abstract kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getOwnerDescriptor();

    protected boolean isVisibleAsFunction(kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor isVisibleAsFunction) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isVisibleAsFunction, "$this$isVisibleAsFunction");
        return true;
    }

    protected abstract kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData resolveMethodSignature(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list2);

    public LazyJavaScope(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        this.c = c;
        this.allDescriptors = c.getStorageManager().createRecursionTolerantLazyValue(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$allDescriptors$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> invoke() {
                return this.this$0.computeDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.ALL, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Companion.getALL_NAME_FILTER());
            }
        }, kotlin.collections.CollectionsKt.emptyList());
        this.declaredMemberIndex = c.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$declaredMemberIndex$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex invoke() {
                return this.this$0.computeMemberIndex();
            }
        });
        this.functions = c.getStorageManager().createMemoizedFunction(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$functions$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> invoke(kotlin.reflect.jvm.internal.impl.name.Name name) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                for (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod : this.this$0.getDeclaredMemberIndex().invoke().findMethodsByName(name)) {
                    kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor javaMethodDescriptorResolveMethodToFunctionDescriptor = this.this$0.resolveMethodToFunctionDescriptor(javaMethod);
                    if (this.this$0.isVisibleAsFunction(javaMethodDescriptorResolveMethodToFunctionDescriptor)) {
                        this.this$0.getC().getComponents().getJavaResolverCache().recordMethod(javaMethod, javaMethodDescriptorResolveMethodToFunctionDescriptor);
                        linkedHashSet.add(javaMethodDescriptorResolveMethodToFunctionDescriptor);
                    }
                }
                java.util.LinkedHashSet linkedHashSet2 = linkedHashSet;
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt.retainMostSpecificInEachOverridableGroup(linkedHashSet2);
                this.this$0.computeNonDeclaredFunctions(linkedHashSet2, name);
                return kotlin.collections.CollectionsKt.toList(this.this$0.getC().getComponents().getSignatureEnhancement().enhanceSignatures(this.this$0.getC(), linkedHashSet2));
            }
        });
        this.functionNamesLazy$delegate = c.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$functionNamesLazy$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.Name> invoke() {
                return this.this$0.computeFunctionNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.FUNCTIONS, null);
            }
        });
        this.propertyNamesLazy$delegate = c.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$propertyNamesLazy$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.Name> invoke() {
                return this.this$0.computePropertyNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.VARIABLES, null);
            }
        });
        this.classNamesLazy$delegate = c.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$classNamesLazy$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.Name> invoke() {
                return this.this$0.computeClassNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.CLASSIFIERS, null);
            }
        });
        this.properties = c.getStorageManager().createMemoizedFunction(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$properties$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> invoke(kotlin.reflect.jvm.internal.impl.name.Name name) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField javaFieldFindFieldByName = this.this$0.getDeclaredMemberIndex().invoke().findFieldByName(name);
                if (javaFieldFindFieldByName != null && !javaFieldFindFieldByName.isEnumEntry()) {
                    arrayList.add(this.this$0.resolveProperty(javaFieldFindFieldByName));
                }
                java.util.ArrayList arrayList2 = arrayList;
                this.this$0.computeNonDeclaredProperties(name, arrayList2);
                if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isAnnotationClass(this.this$0.getOwnerDescriptor())) {
                    return kotlin.collections.CollectionsKt.toList(arrayList);
                }
                return kotlin.collections.CollectionsKt.toList(this.this$0.getC().getComponents().getSignatureEnhancement().enhanceSignatures(this.this$0.getC(), arrayList2));
            }
        });
    }

    protected final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext getC() {
        return this.c;
    }

    protected final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex> getDeclaredMemberIndex() {
        return this.declaredMemberIndex;
    }

    /* JADX INFO: compiled from: LazyJavaScope.kt */
    protected static final class MethodSignatureData {
        private final java.util.List<java.lang.String> errors;
        private final boolean hasStableParameterNames;
        private final kotlin.reflect.jvm.internal.impl.types.KotlinType receiverType;
        private final kotlin.reflect.jvm.internal.impl.types.KotlinType returnType;
        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters;
        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters;

        public boolean equals(java.lang.Object obj) {
            if (this != obj) {
                if (obj instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData) {
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData methodSignatureData = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData) obj;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.returnType, methodSignatureData.returnType) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiverType, methodSignatureData.receiverType) && kotlin.jvm.internal.Intrinsics.areEqual(this.valueParameters, methodSignatureData.valueParameters) && kotlin.jvm.internal.Intrinsics.areEqual(this.typeParameters, methodSignatureData.typeParameters)) {
                        if (!(this.hasStableParameterNames == methodSignatureData.hasStableParameterNames) || !kotlin.jvm.internal.Intrinsics.areEqual(this.errors, methodSignatureData.errors)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10, types: [int] */
        /* JADX WARN: Type inference failed for: r2v10, types: [int] */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v16 */
        public int hashCode() {
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = this.returnType;
            int iHashCode = (kotlinType != null ? kotlinType.hashCode() : 0) * 31;
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2 = this.receiverType;
            int iHashCode2 = (iHashCode + (kotlinType2 != null ? kotlinType2.hashCode() : 0)) * 31;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list = this.valueParameters;
            int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2 = this.typeParameters;
            int iHashCode4 = (iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
            boolean z = this.hasStableParameterNames;
            ?? r2 = z;
            if (z) {
                r2 = 1;
            }
            int i = (iHashCode4 + r2) * 31;
            java.util.List<java.lang.String> list3 = this.errors;
            return i + (list3 != null ? list3.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "MethodSignatureData(returnType=" + this.returnType + ", receiverType=" + this.receiverType + ", valueParameters=" + this.valueParameters + ", typeParameters=" + this.typeParameters + ", hasStableParameterNames=" + this.hasStableParameterNames + ", errors=" + this.errors + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MethodSignatureData(kotlin.reflect.jvm.internal.impl.types.KotlinType returnType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters, boolean z, java.util.List<java.lang.String> errors) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(returnType, "returnType");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(valueParameters, "valueParameters");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeParameters, "typeParameters");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(errors, "errors");
            this.returnType = returnType;
            this.receiverType = kotlinType;
            this.valueParameters = valueParameters;
            this.typeParameters = typeParameters;
            this.hasStableParameterNames = z;
            this.errors = errors;
        }

        public final kotlin.reflect.jvm.internal.impl.types.KotlinType getReturnType() {
            return this.returnType;
        }

        public final kotlin.reflect.jvm.internal.impl.types.KotlinType getReceiverType() {
            return this.receiverType;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getValueParameters() {
            return this.valueParameters;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getTypeParameters() {
            return this.typeParameters;
        }

        public final boolean getHasStableParameterNames() {
            return this.hasStableParameterNames;
        }

        public final java.util.List<java.lang.String> getErrors() {
            return this.errors;
        }
    }

    protected final kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor resolveMethodToFunctionDescriptor(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod method) {
        java.util.Map<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, ?> mapEmptyMap;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(method, "method");
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor javaMethodDescriptorCreateJavaMethod = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.createJavaMethod(getOwnerDescriptor(), kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(this.c, method), method.getName(), this.c.getComponents().getSourceElementFactory().source(method));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(javaMethodDescriptorCreateJavaMethod, "JavaMethodDescriptor.cre….source(method)\n        )");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContextChildForMethod$default = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.childForMethod$default(this.c, javaMethodDescriptorCreateJavaMethod, method, 0, 4, null);
        java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter> typeParameters = method.getTypeParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(typeParameters, 10));
        java.util.Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = lazyJavaResolverContextChildForMethod$default.getTypeParameterResolver().resolveTypeParameter((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter) it.next());
            if (typeParameterDescriptorResolveTypeParameter == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            arrayList.add(typeParameterDescriptorResolveTypeParameter);
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.ResolvedValueParameters resolvedValueParametersResolveValueParameters = resolveValueParameters(lazyJavaResolverContextChildForMethod$default, javaMethodDescriptorCreateJavaMethod, method.getValueParameters());
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData methodSignatureDataResolveMethodSignature = resolveMethodSignature(method, arrayList, computeMethodReturnType(method, lazyJavaResolverContextChildForMethod$default), resolvedValueParametersResolveValueParameters.getDescriptors());
        kotlin.reflect.jvm.internal.impl.types.KotlinType receiverType = methodSignatureDataResolveMethodSignature.getReceiverType();
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = receiverType != null ? kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createExtensionReceiverParameterForCallable(javaMethodDescriptorCreateJavaMethod, receiverType, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY()) : null;
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters2 = methodSignatureDataResolveMethodSignature.getTypeParameters();
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = methodSignatureDataResolveMethodSignature.getValueParameters();
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = methodSignatureDataResolveMethodSignature.getReturnType();
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modalityConvertFromFlags = kotlin.reflect.jvm.internal.impl.descriptors.Modality.Companion.convertFromFlags(method.isAbstract(), !method.isFinal());
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = method.getVisibility();
        if (methodSignatureDataResolveMethodSignature.getReceiverType() != null) {
            mapEmptyMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER, kotlin.collections.CollectionsKt.first((java.util.List) resolvedValueParametersResolveValueParameters.getDescriptors())));
        } else {
            mapEmptyMap = kotlin.collections.MapsKt.emptyMap();
        }
        javaMethodDescriptorCreateJavaMethod.initialize(receiverParameterDescriptorCreateExtensionReceiverParameterForCallable, dispatchReceiverParameter, typeParameters2, valueParameters, returnType, modalityConvertFromFlags, visibility, mapEmptyMap);
        javaMethodDescriptorCreateJavaMethod.setParameterNamesStatus(methodSignatureDataResolveMethodSignature.getHasStableParameterNames(), resolvedValueParametersResolveValueParameters.getHasSynthesizedNames());
        if (!methodSignatureDataResolveMethodSignature.getErrors().isEmpty()) {
            lazyJavaResolverContextChildForMethod$default.getComponents().getSignaturePropagator().reportSignatureErrors(javaMethodDescriptorCreateJavaMethod, methodSignatureDataResolveMethodSignature.getErrors());
        }
        return javaMethodDescriptorCreateJavaMethod;
    }

    protected final kotlin.reflect.jvm.internal.impl.types.KotlinType computeMethodReturnType(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod method, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(method, "method");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        return c.getTypeResolver().transformJavaType(method.getReturnType(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON, method.getContainingClass().isAnnotationType(), null, 2, null));
    }

    /* JADX INFO: compiled from: LazyJavaScope.kt */
    protected static final class ResolvedValueParameters {
        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> descriptors;
        private final boolean hasSynthesizedNames;

        /* JADX WARN: Multi-variable type inference failed */
        public ResolvedValueParameters(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> descriptors, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptors, "descriptors");
            this.descriptors = descriptors;
            this.hasSynthesizedNames = z;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getDescriptors() {
            return this.descriptors;
        }

        public final boolean getHasSynthesizedNames() {
            return this.hasSynthesizedNames;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x012f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0135  */
    /* JADX WARN: Code duplicated, block: B:49:0x0139  */
    /* JADX WARN: Code duplicated, block: B:58:0x014e A[SYNTHETIC] */
    protected final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.ResolvedValueParameters resolveValueParameters(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor function, java.util.List<? extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter> jValueParameters) {
        java.lang.String value;
        kotlin.Pair pair;
        kotlin.reflect.jvm.internal.impl.name.Name name;
        kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValueFirstArgument;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function, "function");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jValueParameters, "jValueParameters");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.lang.Iterable<kotlin.collections.IndexedValue> iterableWithIndex = kotlin.collections.CollectionsKt.withIndex(jValueParameters);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10));
        boolean z = false;
        boolean z2 = false;
        for (kotlin.collections.IndexedValue indexedValue : iterableWithIndex) {
            int index = indexedValue.getIndex();
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter javaValueParameter = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter) indexedValue.component2();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotationsResolveAnnotations = kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(c, javaValueParameter);
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes attributes$default = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON, z, null, 3, null);
            kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.PARAMETER_NAME_FQ_NAME;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "JvmAnnotationNames.PARAMETER_NAME_FQ_NAME");
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptorMo1263findAnnotation = annotationsResolveAnnotations.mo1263findAnnotation(fqName);
            if (annotationDescriptorMo1263findAnnotation == null || (constantValueFirstArgument = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstArgument(annotationDescriptorMo1263findAnnotation)) == null) {
                value = null;
            } else {
                if (!(constantValueFirstArgument instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue)) {
                    constantValueFirstArgument = null;
                }
                kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue stringValue = (kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue) constantValueFirstArgument;
                if (stringValue != null) {
                    value = stringValue.getValue();
                } else {
                    value = null;
                }
            }
            if (javaValueParameter.getIsVararg()) {
                kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType type = javaValueParameter.getType();
                kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType javaArrayType = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType) (type instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType ? type : null);
                if (javaArrayType == null) {
                    throw new java.lang.AssertionError("Vararg parameter should be an array: " + javaValueParameter);
                }
                kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeTransformArrayType = c.getTypeResolver().transformArrayType(javaArrayType, attributes$default, true);
                pair = kotlin.TuplesKt.to(kotlinTypeTransformArrayType, c.getModule().getBuiltIns().getArrayElementType(kotlinTypeTransformArrayType));
            } else {
                pair = kotlin.TuplesKt.to(c.getTypeResolver().transformJavaType(javaValueParameter.getType(), attributes$default), null);
            }
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = (kotlin.reflect.jvm.internal.impl.types.KotlinType) pair.component1();
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) pair.component2();
            if (kotlin.jvm.internal.Intrinsics.areEqual(function.getName().asString(), "equals") && jValueParameters.size() == 1 && kotlin.jvm.internal.Intrinsics.areEqual(c.getModule().getBuiltIns().getNullableAnyType(), kotlinType)) {
                name = kotlin.reflect.jvm.internal.impl.name.Name.identifier(com.google.android.gms.fitness.FitnessActivities.OTHER);
            } else if (value != null) {
                if ((value.length() > 0) && linkedHashSet.add(value)) {
                    name = kotlin.reflect.jvm.internal.impl.name.Name.identifier(value);
                } else {
                    name = javaValueParameter.getName();
                    if (name == null) {
                        z2 = true;
                    }
                    if (name != null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append('p');
                        sb.append(index);
                        name = kotlin.reflect.jvm.internal.impl.name.Name.identifier(sb.toString());
                    }
                }
            } else {
                name = javaValueParameter.getName();
                if (name == null) {
                    z2 = true;
                }
                if (name != null) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append('p');
                    sb2.append(index);
                    name = kotlin.reflect.jvm.internal.impl.name.Name.identifier(sb2.toString());
                }
            }
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "if (function.name.asStri…(\"p$index\")\n            }");
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl(function, null, index, annotationsResolveAnnotations, name, kotlinType, false, false, false, kotlinType2, c.getComponents().getSourceElementFactory().source(javaValueParameter)));
            z = false;
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.ResolvedValueParameters(kotlin.collections.CollectionsKt.toList(arrayList), z2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames() {
        return getFunctionNamesLazy();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames() {
        return getPropertyNamesLazy();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        return !getFunctionNames().contains(name) ? kotlin.collections.CollectionsKt.emptyList() : this.functions.invoke(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor resolveProperty(final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField javaField) {
        final kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl propertyDescriptorImplCreatePropertyDescriptor = createPropertyDescriptor(javaField);
        propertyDescriptorImplCreatePropertyDescriptor.initialize(null, null, null, null);
        propertyDescriptorImplCreatePropertyDescriptor.setType(getPropertyType(javaField), kotlin.collections.CollectionsKt.emptyList(), getDispatchReceiverParameter(), null);
        if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.shouldRecordInitializerForProperty(propertyDescriptorImplCreatePropertyDescriptor, propertyDescriptorImplCreatePropertyDescriptor.getType())) {
            propertyDescriptorImplCreatePropertyDescriptor.setCompileTimeInitializer(this.c.getStorageManager().createNullableLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.resolveProperty.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> invoke() {
                    return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.this.getC().getComponents().getJavaPropertyInitializerEvaluator().getInitializerConstant(javaField, propertyDescriptorImplCreatePropertyDescriptor);
                }
            }));
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl propertyDescriptorImpl = propertyDescriptorImplCreatePropertyDescriptor;
        this.c.getComponents().getJavaResolverCache().recordField(javaField, propertyDescriptorImpl);
        return propertyDescriptorImpl;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl createPropertyDescriptor(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField javaField) {
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor javaPropertyDescriptorCreate = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor.create(getOwnerDescriptor(), kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(this.c, javaField), kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL, javaField.getVisibility(), !javaField.isFinal(), javaField.getName(), this.c.getComponents().getSourceElementFactory().source(javaField), isFinalStatic(javaField));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(javaPropertyDescriptorCreate, "JavaPropertyDescriptor.c…d.isFinalStatic\n        )");
        return javaPropertyDescriptorCreate;
    }

    private final boolean isFinalStatic(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField javaField) {
        return javaField.isFinal() && javaField.isStatic();
    }

    private final kotlin.reflect.jvm.internal.impl.types.KotlinType getPropertyType(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField javaField) {
        boolean z = false;
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeTransformJavaType = this.c.getTypeResolver().transformJavaType(javaField.getType(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON, false, null, 3, null));
        if ((kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveType(kotlinTypeTransformJavaType) || kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isString(kotlinTypeTransformJavaType)) && isFinalStatic(javaField) && javaField.getHasConstantNotNullInitializer()) {
            z = true;
        }
        if (!z) {
            return kotlinTypeTransformJavaType;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeMakeNotNullable = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNotNullable(kotlinTypeTransformJavaType);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kotlinTypeMakeNotNullable, "TypeUtils.makeNotNullable(propertyType)");
        return kotlinTypeMakeNotNullable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        return !getVariableNames().contains(name) ? kotlin.collections.CollectionsKt.emptyList() : this.properties.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> nameFilter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameFilter, "nameFilter");
        return this.allDescriptors.invoke();
    }

    protected final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> computeDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> nameFilter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameFilter, "nameFilter");
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        if (kindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getCLASSIFIERS_MASK())) {
            for (kotlin.reflect.jvm.internal.impl.name.Name name : computeClassNames(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(linkedHashSet, mo1270getContributedClassifier(name, noLookupLocation));
                }
            }
        }
        if (kindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getFUNCTIONS_MASK()) && !kindFilter.getExcludes().contains(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude.NonExtensions.INSTANCE)) {
            for (kotlin.reflect.jvm.internal.impl.name.Name name2 : computeFunctionNames(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name2).booleanValue()) {
                    linkedHashSet.addAll(getContributedFunctions(name2, noLookupLocation));
                }
            }
        }
        if (kindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getVARIABLES_MASK()) && !kindFilter.getExcludes().contains(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude.NonExtensions.INSTANCE)) {
            for (kotlin.reflect.jvm.internal.impl.name.Name name3 : computePropertyNames(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name3).booleanValue()) {
                    linkedHashSet.addAll(getContributedVariables(name3, noLookupLocation));
                }
            }
        }
        return kotlin.collections.CollectionsKt.toList(linkedHashSet);
    }

    public java.lang.String toString() {
        return "Lazy scope for " + getOwnerDescriptor();
    }
}
