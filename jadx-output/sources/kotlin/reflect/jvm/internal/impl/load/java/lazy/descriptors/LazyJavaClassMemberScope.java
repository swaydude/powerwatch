package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaClassMemberScope extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope {
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor>> constructors;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField>> enumEntryIndex;
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass jClass;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name>> nestedClassIndex;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase> nestedClasses;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ownerDescriptor;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public /* bridge */ /* synthetic */ java.util.Set computeFunctionNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1 function1) {
        return computeFunctionNames(descriptorKindFilter, (kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean>) function1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getOwnerDescriptor() {
        return this.ownerDescriptor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ownerDescriptor, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass jClass) {
        super(c);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(ownerDescriptor, "ownerDescriptor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jClass, "jClass");
        this.ownerDescriptor = ownerDescriptor;
        this.jClass = jClass;
        this.constructors = c.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$constructors$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> invoke() {
                java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor> constructors = this.this$0.jClass.getConstructors();
                java.util.ArrayList arrayList = new java.util.ArrayList(constructors.size());
                java.util.Iterator<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor> it = constructors.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.this$0.resolveConstructor(it.next()));
                }
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement signatureEnhancement = c.getComponents().getSignatureEnhancement();
                kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext = c;
                java.util.List listListOfNotNull = arrayList;
                if (listListOfNotNull.isEmpty()) {
                    listListOfNotNull = kotlin.collections.CollectionsKt.listOfNotNull(this.this$0.createDefaultConstructor());
                }
                return kotlin.collections.CollectionsKt.toList(signatureEnhancement.enhanceSignatures(lazyJavaResolverContext, listListOfNotNull));
            }
        });
        this.nestedClassIndex = c.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClassIndex$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.Name> invoke() {
                return kotlin.collections.CollectionsKt.toSet(this.this$0.jClass.getInnerClassNames());
            }
        });
        this.enumEntryIndex = c.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, ? extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$enumEntryIndex$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, ? extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField> invoke() {
                java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField> fields = this.this$0.jClass.getFields();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : fields) {
                    if (((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField) obj).isEnumEntry()) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = arrayList;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
                for (java.lang.Object obj2 : arrayList2) {
                    linkedHashMap.put(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField) obj2).getName(), obj2);
                }
                return linkedHashMap;
            }
        });
        this.nestedClasses = c.getStorageManager().createMemoizedFunctionWithNullableValues(new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClasses$1(this, c));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex computeMemberIndex() {
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex(this.jClass, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeMemberIndex.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember javaMember) {
                return java.lang.Boolean.valueOf(invoke2(javaMember));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return !it.isStatic();
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected java.util.HashSet<kotlin.reflect.jvm.internal.impl.name.Name> computeFunctionNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = getOwnerDescriptor().getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "ownerDescriptor.typeConstructor");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collectionMo1269getSupertypes = typeConstructor.mo1269getSupertypes();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionMo1269getSupertypes, "ownerDescriptor.typeConstructor.supertypes");
        java.util.HashSet<kotlin.reflect.jvm.internal.impl.name.Name> hashSet = new java.util.HashSet<>();
        java.util.Iterator<T> it = collectionMo1269getSupertypes.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(hashSet, ((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).getMemberScope().getFunctionNames());
        }
        java.util.HashSet<kotlin.reflect.jvm.internal.impl.name.Name> hashSet2 = hashSet;
        hashSet2.addAll(getDeclaredMemberIndex().invoke().getMethodNames());
        hashSet2.addAll(computeClassNames(kindFilter, function1));
        return hashSet2;
    }

    public final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor>> getConstructors$descriptors_jvm() {
        return this.constructors;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected boolean isVisibleAsFunction(kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor isVisibleAsFunction) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isVisibleAsFunction, "$this$isVisibleAsFunction");
        if (this.jClass.isAnnotationType()) {
            return false;
        }
        return isVisibleAsFunctionInCurrentClass(isVisibleAsFunction);
    }

    private final boolean isVisibleAsFunctionInCurrentClass(final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
        boolean z;
        boolean z2;
        kotlin.reflect.jvm.internal.impl.name.Name name = simpleFunctionDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "function.name");
        java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> propertyNamesCandidatesByAccessorName = kotlin.reflect.jvm.internal.impl.load.java.PropertiesConventionUtilKt.getPropertyNamesCandidatesByAccessorName(name);
        if (!(propertyNamesCandidatesByAccessorName instanceof java.util.Collection) || !propertyNamesCandidatesByAccessorName.isEmpty()) {
            java.util.Iterator<T> it = propertyNamesCandidatesByAccessorName.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> propertiesFromSupertypes = getPropertiesFromSupertypes((kotlin.reflect.jvm.internal.impl.name.Name) it.next());
                if (!(propertiesFromSupertypes instanceof java.util.Collection) || !propertiesFromSupertypes.isEmpty()) {
                    java.util.Iterator<T> it2 = propertiesFromSupertypes.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = false;
                            break;
                        }
                        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) it2.next();
                        if (doesClassOverridesProperty(propertyDescriptor, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$$inlined$any$lambda$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> invoke(kotlin.reflect.jvm.internal.impl.name.Name accessorName) {
                                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(accessorName, "accessorName");
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(simpleFunctionDescriptor.getName(), accessorName)) {
                                    return kotlin.collections.CollectionsKt.plus(this.this$0.searchMethodsByNameWithoutBuiltinMagic(accessorName), (java.lang.Iterable) this.this$0.searchMethodsInSupertypesWithoutBuiltinMagic(accessorName));
                                }
                                return kotlin.collections.CollectionsKt.listOf(simpleFunctionDescriptor);
                            }
                        }) && (propertyDescriptor.isVar() || !kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.isSetterName(simpleFunctionDescriptor.getName().asString()))) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = false;
                    break;
                    break;
                }
                if (z) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        return (z2 || doesOverrideRenamedBuiltins(simpleFunctionDescriptor) || shouldBeVisibleAsOverrideOfBuiltInWithErasedValueParameters(simpleFunctionDescriptor) || doesOverrideSuspendFunction(simpleFunctionDescriptor)) ? false : true;
    }

    private final boolean shouldBeVisibleAsOverrideOfBuiltInWithErasedValueParameters(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
        kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        kotlin.reflect.jvm.internal.impl.name.Name name = simpleFunctionDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "name");
        if (!builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.name.Name name2 = simpleFunctionDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name2, "name");
        java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> functionsFromSupertypes = getFunctionsFromSupertypes(name2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = functionsFromSupertypes.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) it.next());
            if (overriddenBuiltinFunctionWithErasedValueParametersInJava != null) {
                arrayList.add(overriddenBuiltinFunctionWithErasedValueParametersInJava);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if ((arrayList2 instanceof java.util.Collection) && arrayList2.isEmpty()) {
            return false;
        }
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (hasSameJvmDescriptorButDoesNotOverride(simpleFunctionDescriptor, (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) it2.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> searchMethodsByNameWithoutBuiltinMagic(kotlin.reflect.jvm.internal.impl.name.Name name) {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod> collectionFindMethodsByName = getDeclaredMemberIndex().invoke().findMethodsByName(name);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collectionFindMethodsByName, 10));
        java.util.Iterator<T> it = collectionFindMethodsByName.iterator();
        while (it.hasNext()) {
            arrayList.add(resolveMethodToFunctionDescriptor((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> searchMethodsInSupertypesWithoutBuiltinMagic(kotlin.reflect.jvm.internal.impl.name.Name name) {
        java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> functionsFromSupertypes = getFunctionsFromSupertypes(name);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : functionsFromSupertypes) {
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj;
            if (!(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName(simpleFunctionDescriptor) || kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor) != null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    private final boolean doesOverrideRenamedBuiltins(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
        boolean z;
        kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName builtinMethodsWithDifferentJvmName = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName.INSTANCE;
        kotlin.reflect.jvm.internal.impl.name.Name name = simpleFunctionDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "name");
        java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> builtinFunctionNamesByJvmName = builtinMethodsWithDifferentJvmName.getBuiltinFunctionNamesByJvmName(name);
        if (!(builtinFunctionNamesByJvmName instanceof java.util.Collection) || !builtinFunctionNamesByJvmName.isEmpty()) {
            for (kotlin.reflect.jvm.internal.impl.name.Name name2 : builtinFunctionNamesByJvmName) {
                java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> functionsFromSupertypes = getFunctionsFromSupertypes(name2);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : functionsFromSupertypes) {
                    if (kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj)) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = arrayList;
                if (arrayList2.isEmpty()) {
                    z = false;
                    break;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptorCreateRenamedCopy = createRenamedCopy(simpleFunctionDescriptor, name2);
                java.util.ArrayList arrayList3 = arrayList2;
                if (!(arrayList3 instanceof java.util.Collection) || !arrayList3.isEmpty()) {
                    java.util.Iterator it = arrayList3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                            break;
                        }
                        if (doesOverrideRenamedDescriptor((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) it.next(), simpleFunctionDescriptorCreateRenamedCopy)) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = false;
                    break;
                    break;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean doesOverrideSuspendFunction(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptorCreateSuspendView = createSuspendView(simpleFunctionDescriptor);
        if (simpleFunctionDescriptorCreateSuspendView == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.name.Name name = simpleFunctionDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "name");
        java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> functionsFromSupertypes = getFunctionsFromSupertypes(name);
        if ((functionsFromSupertypes instanceof java.util.Collection) && functionsFromSupertypes.isEmpty()) {
            return false;
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor2 : functionsFromSupertypes) {
            if (simpleFunctionDescriptor2.isSuspend() && doesOverride(simpleFunctionDescriptorCreateSuspendView, simpleFunctionDescriptor2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor createSuspendView(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
        kotlin.reflect.jvm.internal.impl.name.FqName safe;
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = simpleFunctionDescriptor.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "valueParameters");
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) valueParameters);
        if (valueParameterDescriptor != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = valueParameterDescriptor.getType().getConstructor().mo1268getDeclarationDescriptor();
            if (classifierDescriptorMo1268getDeclarationDescriptor == null || (fqNameUnsafe = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(classifierDescriptorMo1268getDeclarationDescriptor)) == null) {
                safe = null;
            } else {
                if (!fqNameUnsafe.isSafe()) {
                    fqNameUnsafe = null;
                }
                if (fqNameUnsafe != null) {
                    safe = fqNameUnsafe.toSafe();
                } else {
                    safe = null;
                }
            }
            if (!kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt.isContinuation(safe, getC().getComponents().getSettings().isReleaseCoroutines())) {
                valueParameterDescriptor = null;
            }
            if (valueParameterDescriptor != null) {
                kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters2 = simpleFunctionDescriptor.getValueParameters();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters2, "valueParameters");
                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) copyBuilderNewCopyBuilder.setValueParameters(kotlin.collections.CollectionsKt.dropLast(valueParameters2, 1)).setReturnType(valueParameterDescriptor.getType().getArguments().get(0).getType()).build();
                kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl simpleFunctionDescriptorImpl = (kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl) simpleFunctionDescriptor2;
                if (simpleFunctionDescriptorImpl != null) {
                    simpleFunctionDescriptorImpl.setSuspend(true);
                }
                return simpleFunctionDescriptor2;
            }
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor createRenamedCopy(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor, kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
        copyBuilderNewCopyBuilder.setName(name);
        copyBuilderNewCopyBuilder.setSignatureChange();
        copyBuilderNewCopyBuilder.setPreserveSourceElement();
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
        if (functionDescriptorBuild == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) functionDescriptorBuild;
    }

    private final boolean doesOverrideRenamedDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        if (kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName.INSTANCE.isRemoveAtByIndex(simpleFunctionDescriptor)) {
            functionDescriptor = functionDescriptor.getOriginal();
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(functionDescriptor, "if (superDescriptor.isRe…iginal else subDescriptor");
        return doesOverride(functionDescriptor, simpleFunctionDescriptor);
    }

    private final boolean doesOverride(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2) {
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoIsOverridableByWithoutExternalConditions = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(callableDescriptor2, callableDescriptor, true);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(overrideCompatibilityInfoIsOverridableByWithoutExternalConditions, "OverridingUtil.DEFAULT.i…erDescriptor, this, true)");
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result result = overrideCompatibilityInfoIsOverridableByWithoutExternalConditions.getResult();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(result, "OverridingUtil.DEFAULT.i…iptor, this, true).result");
        return result == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && !kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(callableDescriptor2, callableDescriptor);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor findGetterOverride(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> function1) {
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor propertyGetterDescriptor = getter != null ? (kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor) kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(getter) : null;
        java.lang.String builtinSpecialPropertyGetterName = propertyGetterDescriptor != null ? kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(propertyGetterDescriptor) : null;
        if (builtinSpecialPropertyGetterName != null && !kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(getOwnerDescriptor(), propertyGetterDescriptor)) {
            return findGetterByName(propertyDescriptor, builtinSpecialPropertyGetterName, function1);
        }
        java.lang.String str = kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.getterName(propertyDescriptor.getName().asString());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(str, "JvmAbi.getterName(name.asString())");
        return findGetterByName(propertyDescriptor, str, function1);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor findGetterByName(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, java.lang.String str, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> function1) {
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor;
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(getterName)");
        java.util.Iterator<T> it = function1.invoke(nameIdentifier).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 0) {
                kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker kotlinTypeChecker = kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT;
                kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType != null ? kotlinTypeChecker.isSubtypeOf(returnType, propertyDescriptor.getType()) : false) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor findSetterOverride(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> function1) {
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor;
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType;
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.setterName(propertyDescriptor.getName().asString()));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(JvmAbi.s…terName(name.asString()))");
        java.util.Iterator<T> it = function1.invoke(nameIdentifier).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 1 && (returnType = simpleFunctionDescriptor2.getReturnType()) != null && kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isUnit(returnType)) {
                kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker kotlinTypeChecker = kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT;
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = simpleFunctionDescriptor2.getValueParameters();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "descriptor.valueParameters");
                java.lang.Object objSingle = kotlin.collections.CollectionsKt.single((java.util.List<? extends java.lang.Object>) valueParameters);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objSingle, "descriptor.valueParameters.single()");
                if (kotlinTypeChecker.equalTypes(((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) objSingle).getType(), propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    private final boolean doesClassOverridesProperty(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> function1) {
        if (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptorFindGetterOverride = findGetterOverride(propertyDescriptor, function1);
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptorFindSetterOverride = findSetterOverride(propertyDescriptor, function1);
        if (simpleFunctionDescriptorFindGetterOverride == null) {
            return false;
        }
        if (propertyDescriptor.isVar()) {
            return simpleFunctionDescriptorFindSetterOverride != null && simpleFunctionDescriptorFindSetterOverride.getModality() == simpleFunctionDescriptorFindGetterOverride.getModality();
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void computeNonDeclaredFunctions(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> result, kotlin.reflect.jvm.internal.impl.name.Name name) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(result, "result");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> functionsFromSupertypes = getFunctionsFromSupertypes(name);
        if (!kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName.INSTANCE.getSameAsRenamedInJvmBuiltin(name) && !kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> set = functionsFromSupertypes;
            if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
                java.util.Iterator<T> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) it.next()).isSuspend()) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
            } else {
                z = true;
                break;
            }
            if (z) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : set) {
                    if (isVisibleAsFunctionInCurrentClass((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj)) {
                        arrayList.add(obj);
                    }
                }
                addFunctionFromSupertypes(result, name, arrayList, false);
                return;
            }
        }
        kotlin.reflect.jvm.internal.impl.utils.SmartSet smartSetCreate = kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion.create();
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collectionResolveOverridesForNonStaticMembers = kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, functionsFromSupertypes, kotlin.collections.CollectionsKt.emptyList(), getOwnerDescriptor(), kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter.DO_NOTHING);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionResolveOverridesForNonStaticMembers, "resolveOverridesForNonSt…rter.DO_NOTHING\n        )");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope lazyJavaClassMemberScope = this;
        addOverriddenSpecialMethods(name, result, collectionResolveOverridesForNonStaticMembers, result, new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.AnonymousClass3(lazyJavaClassMemberScope));
        addOverriddenSpecialMethods(name, result, collectionResolveOverridesForNonStaticMembers, smartSetCreate, new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.AnonymousClass4(lazyJavaClassMemberScope));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : functionsFromSupertypes) {
            if (isVisibleAsFunctionInCurrentClass((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj2)) {
                arrayList2.add(obj2);
            }
        }
        addFunctionFromSupertypes(result, name, kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList2, (java.lang.Iterable) smartSetCreate), true);
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeNonDeclaredFunctions$3, reason: invalid class name */
    /* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
    static final /* synthetic */ class AnonymousClass3 extends kotlin.jvm.internal.FunctionReference implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> {
        AnonymousClass3(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope lazyJavaClassMemberScope) {
            super(1, lazyJavaClassMemberScope);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final java.lang.String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final kotlin.reflect.KDeclarationContainer getOwner() {
            return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final java.lang.String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // kotlin.jvm.functions.Function1
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> invoke(kotlin.reflect.jvm.internal.impl.name.Name p1) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p1, "p1");
            return ((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope) this.receiver).searchMethodsByNameWithoutBuiltinMagic(p1);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeNonDeclaredFunctions$4, reason: invalid class name */
    /* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
    static final /* synthetic */ class AnonymousClass4 extends kotlin.jvm.internal.FunctionReference implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> {
        AnonymousClass4(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope lazyJavaClassMemberScope) {
            super(1, lazyJavaClassMemberScope);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final java.lang.String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final kotlin.reflect.KDeclarationContainer getOwner() {
            return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final java.lang.String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // kotlin.jvm.functions.Function1
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> invoke(kotlin.reflect.jvm.internal.impl.name.Name p1) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p1, "p1");
            return ((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope) this.receiver).searchMethodsInSupertypesWithoutBuiltinMagic(p1);
        }
    }

    private final void addFunctionFromSupertypes(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection, kotlin.reflect.jvm.internal.impl.name.Name name, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection2, boolean z) {
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collectionResolveOverridesForNonStaticMembers = kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, collection2, collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionResolveOverridesForNonStaticMembers, "resolveOverridesForNonSt…s.errorReporter\n        )");
        if (!z) {
            collection.addAll(collectionResolveOverridesForNonStaticMembers);
            return;
        }
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection3 = collectionResolveOverridesForNonStaticMembers;
        java.util.List listPlus = kotlin.collections.CollectionsKt.plus((java.util.Collection) collection, (java.lang.Iterable) collection3);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection3, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor resolvedOverride : collection3) {
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.getOverriddenSpecialBuiltin(resolvedOverride);
            if (simpleFunctionDescriptor != null) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(resolvedOverride, "resolvedOverride");
                resolvedOverride = createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(resolvedOverride, simpleFunctionDescriptor, listPlus);
            }
            arrayList.add(resolvedOverride);
        }
        collection.addAll(arrayList);
    }

    private final void addOverriddenSpecialMethods(kotlin.reflect.jvm.internal.impl.name.Name name, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection2, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection3, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> function1) {
        for (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor : collection2) {
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection3, obtainOverrideForBuiltinWithDifferentJvmName(simpleFunctionDescriptor, function1, name, collection));
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection3, obtainOverrideForBuiltInWithErasedValueParametersInJava(simpleFunctionDescriptor, function1, collection));
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection3, obtainOverrideForSuspend(simpleFunctionDescriptor, function1));
        }
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor obtainOverrideForBuiltInWithErasedValueParametersInJava(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> function1, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection) {
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptorCreateOverrideForBuiltinFunctionWithErasedParameterIfNeeded;
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor);
        if (overriddenBuiltinFunctionWithErasedValueParametersInJava == null || (simpleFunctionDescriptorCreateOverrideForBuiltinFunctionWithErasedParameterIfNeeded = createOverrideForBuiltinFunctionWithErasedParameterIfNeeded(overriddenBuiltinFunctionWithErasedValueParametersInJava, function1)) == null) {
            return null;
        }
        if (!isVisibleAsFunctionInCurrentClass(simpleFunctionDescriptorCreateOverrideForBuiltinFunctionWithErasedParameterIfNeeded)) {
            simpleFunctionDescriptorCreateOverrideForBuiltinFunctionWithErasedParameterIfNeeded = null;
        }
        if (simpleFunctionDescriptorCreateOverrideForBuiltinFunctionWithErasedParameterIfNeeded != null) {
            return createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(simpleFunctionDescriptorCreateOverrideForBuiltinFunctionWithErasedParameterIfNeeded, overriddenBuiltinFunctionWithErasedValueParametersInJava, collection);
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor obtainOverrideForBuiltinWithDifferentJvmName(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> function1, kotlin.reflect.jvm.internal.impl.name.Name name, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection) {
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(simpleFunctionDescriptor);
        if (simpleFunctionDescriptor2 != null) {
            java.lang.String jvmMethodNameIfSpecial = kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.getJvmMethodNameIfSpecial(simpleFunctionDescriptor2);
            if (jvmMethodNameIfSpecial == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(jvmMethodNameIfSpecial);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(nameInJava)");
            java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> it = function1.invoke(nameIdentifier).iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptorCreateRenamedCopy = createRenamedCopy(it.next(), name);
                if (doesOverrideRenamedDescriptor(simpleFunctionDescriptor2, simpleFunctionDescriptorCreateRenamedCopy)) {
                    return createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(simpleFunctionDescriptorCreateRenamedCopy, simpleFunctionDescriptor2, collection);
                }
            }
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor obtainOverrideForSuspend(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> function1) {
        if (!simpleFunctionDescriptor.isSuspend()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.Name name = simpleFunctionDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "descriptor.name");
        java.util.Iterator<T> it = function1.invoke(name).iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptorCreateSuspendView = createSuspendView((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) it.next());
            if (simpleFunctionDescriptorCreateSuspendView == null || !doesOverride(simpleFunctionDescriptorCreateSuspendView, simpleFunctionDescriptor)) {
                simpleFunctionDescriptorCreateSuspendView = null;
            }
            if (simpleFunctionDescriptorCreateSuspendView != null) {
                return simpleFunctionDescriptorCreateSuspendView;
            }
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection) {
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor2;
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection2 = collection;
        boolean z = false;
        if (!(collection2 instanceof java.util.Collection) || !collection2.isEmpty()) {
            java.util.Iterator<T> it = collection2.iterator();
            do {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                simpleFunctionDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) it.next();
            } while (!((kotlin.jvm.internal.Intrinsics.areEqual(simpleFunctionDescriptor, simpleFunctionDescriptor2) ^ true) && simpleFunctionDescriptor2.getInitialSignatureDescriptor() == null && doesOverride(simpleFunctionDescriptor2, callableDescriptor)));
        } else {
            z = true;
            break;
        }
        if (z) {
            return simpleFunctionDescriptor;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptorBuild = simpleFunctionDescriptor.newCopyBuilder().setHiddenToOvercomeSignatureClash().build();
        if (functionDescriptorBuild == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) functionDescriptorBuild;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor createOverrideForBuiltinFunctionWithErasedParameterIfNeeded(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> function1) {
        java.lang.Object next;
        kotlin.reflect.jvm.internal.impl.name.Name name = functionDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "overridden.name");
        java.util.Iterator<T> it = function1.invoke(name).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!hasSameJvmDescriptorButDoesNotOverride((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) next, functionDescriptor));
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) next;
        if (simpleFunctionDescriptor == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "overridden.valueParameters");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list = valueParameters;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor it2 : list) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it2, "it");
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = it2.getType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "it.type");
            arrayList.add(new kotlin.reflect.jvm.internal.impl.load.java.descriptors.ValueParameterData(type, it2.declaresDefaultValue()));
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters2 = simpleFunctionDescriptor.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters2, "override.valueParameters");
        copyBuilderNewCopyBuilder.setValueParameters(kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt.copyValueParameters(arrayList, valueParameters2, functionDescriptor));
        copyBuilderNewCopyBuilder.setSignatureChange();
        copyBuilderNewCopyBuilder.setPreserveSourceElement();
        return (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) copyBuilderNewCopyBuilder.build();
    }

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getFunctionsFromSupertypes(kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = getOwnerDescriptor().getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "ownerDescriptor.typeConstructor");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collectionMo1269getSupertypes = typeConstructor.mo1269getSupertypes();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionMo1269getSupertypes, "ownerDescriptor.typeConstructor.supertypes");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator<T> it = collectionMo1269getSupertypes.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(linkedHashSet, ((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).getMemberScope().getContributedFunctions(name, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void computeNonDeclaredProperties(kotlin.reflect.jvm.internal.impl.name.Name name, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> result) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(result, "result");
        if (this.jClass.isAnnotationType()) {
            computeAnnotationProperties(name, result);
        }
        java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> propertiesFromSupertypes = getPropertiesFromSupertypes(name);
        if (propertiesFromSupertypes.isEmpty()) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.utils.SmartSet smartSetCreate = kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion.create();
        addPropertyOverrideByMethod(propertiesFromSupertypes, result, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredProperties.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> invoke(kotlin.reflect.jvm.internal.impl.name.Name it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.this.searchMethodsByNameWithoutBuiltinMagic(it);
            }
        });
        addPropertyOverrideByMethod(propertiesFromSupertypes, smartSetCreate, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredProperties.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> invoke(kotlin.reflect.jvm.internal.impl.name.Name it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.this.searchMethodsInSupertypesWithoutBuiltinMagic(it);
            }
        });
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> collectionResolveOverridesForNonStaticMembers = kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, kotlin.collections.SetsKt.plus((java.util.Set) propertiesFromSupertypes, (java.lang.Iterable) smartSetCreate), result, getOwnerDescriptor(), getC().getComponents().getErrorReporter());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionResolveOverridesForNonStaticMembers, "resolveOverridesForNonSt…rorReporter\n            )");
        result.addAll(collectionResolveOverridesForNonStaticMembers);
    }

    private final void addPropertyOverrideByMethod(java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> set, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> collection, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> function1) {
        java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> it = set.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor javaPropertyDescriptorCreatePropertyDescriptorByMethods = createPropertyDescriptorByMethods(it.next(), function1);
            if (javaPropertyDescriptorCreatePropertyDescriptorByMethods != null) {
                collection.add(javaPropertyDescriptorCreatePropertyDescriptorByMethods);
                return;
            }
        }
    }

    private final void computeAnnotationProperties(kotlin.reflect.jvm.internal.impl.name.Name name, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> collection) {
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod) kotlin.collections.CollectionsKt.singleOrNull(getDeclaredMemberIndex().invoke().findMethodsByName(name));
        if (javaMethod != null) {
            collection.add(createPropertyDescriptorWithDefaultGetter$default(this, javaMethod, null, kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL, 2, null));
        }
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor createPropertyDescriptorWithDefaultGetter$default(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope lazyJavaClassMemberScope, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            kotlinType = (kotlin.reflect.jvm.internal.impl.types.KotlinType) null;
        }
        return lazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter(javaMethod, kotlinType, modality);
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor createPropertyDescriptorWithDefaultGetter(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality) {
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor javaPropertyDescriptorCreate = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor.create(getOwnerDescriptor(), kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(getC(), javaMethod), modality, javaMethod.getVisibility(), false, javaMethod.getName(), getC().getComponents().getSourceElementFactory().source(javaMethod), false);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(javaPropertyDescriptorCreate, "JavaPropertyDescriptor.c…inal = */ false\n        )");
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateDefaultGetter = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createDefaultGetter(javaPropertyDescriptorCreate, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(propertyGetterDescriptorImplCreateDefaultGetter, "DescriptorFactory.create…iptor, Annotations.EMPTY)");
        javaPropertyDescriptorCreate.initialize(propertyGetterDescriptorImplCreateDefaultGetter, null);
        if (kotlinType == null) {
            kotlinType = computeMethodReturnType(javaMethod, kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.childForMethod$default(getC(), javaPropertyDescriptorCreate, javaMethod, 0, 4, null));
        }
        javaPropertyDescriptorCreate.setType(kotlinType, kotlin.collections.CollectionsKt.emptyList(), getDispatchReceiverParameter(), null);
        propertyGetterDescriptorImplCreateDefaultGetter.initialize(kotlinType);
        return javaPropertyDescriptorCreate;
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor createPropertyDescriptorByMethods(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> function1) {
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptorFindSetterOverride;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl propertySetterDescriptorImplCreateSetter = null;
        if (!doesClassOverridesProperty(propertyDescriptor, function1)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptorFindGetterOverride = findGetterOverride(propertyDescriptor, function1);
        if (simpleFunctionDescriptorFindGetterOverride == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        if (propertyDescriptor.isVar()) {
            simpleFunctionDescriptorFindSetterOverride = findSetterOverride(propertyDescriptor, function1);
            if (simpleFunctionDescriptorFindSetterOverride == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
        } else {
            simpleFunctionDescriptorFindSetterOverride = null;
        }
        if (simpleFunctionDescriptorFindSetterOverride != null) {
            simpleFunctionDescriptorFindSetterOverride.getModality();
            simpleFunctionDescriptorFindGetterOverride.getModality();
        }
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor(getOwnerDescriptor(), simpleFunctionDescriptorFindGetterOverride, simpleFunctionDescriptorFindSetterOverride, propertyDescriptor);
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = simpleFunctionDescriptorFindGetterOverride.getReturnType();
        if (returnType == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        javaForKotlinOverridePropertyDescriptor.setType(returnType, kotlin.collections.CollectionsKt.emptyList(), getDispatchReceiverParameter(), null);
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor2 = javaForKotlinOverridePropertyDescriptor;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateGetter = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createGetter(javaForKotlinOverridePropertyDescriptor2, simpleFunctionDescriptorFindGetterOverride.getAnnotations(), false, false, false, simpleFunctionDescriptorFindGetterOverride.getSource());
        propertyGetterDescriptorImplCreateGetter.setInitialSignatureDescriptor(simpleFunctionDescriptorFindGetterOverride);
        propertyGetterDescriptorImplCreateGetter.initialize(javaForKotlinOverridePropertyDescriptor.getType());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(propertyGetterDescriptorImplCreateGetter, "DescriptorFactory.create…escriptor.type)\n        }");
        if (simpleFunctionDescriptorFindSetterOverride != null) {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = simpleFunctionDescriptorFindSetterOverride.getValueParameters();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "setterMethod.valueParameters");
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) valueParameters);
            if (valueParameterDescriptor == null) {
                throw new java.lang.AssertionError("No parameter found for " + simpleFunctionDescriptorFindSetterOverride);
            }
            propertySetterDescriptorImplCreateSetter = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createSetter(javaForKotlinOverridePropertyDescriptor2, simpleFunctionDescriptorFindSetterOverride.getAnnotations(), valueParameterDescriptor.getAnnotations(), false, false, false, simpleFunctionDescriptorFindSetterOverride.getVisibility(), simpleFunctionDescriptorFindSetterOverride.getSource());
            propertySetterDescriptorImplCreateSetter.setInitialSignatureDescriptor(simpleFunctionDescriptorFindSetterOverride);
        }
        javaForKotlinOverridePropertyDescriptor.initialize(propertyGetterDescriptorImplCreateGetter, propertySetterDescriptorImplCreateSetter);
        return javaForKotlinOverridePropertyDescriptor;
    }

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getPropertiesFromSupertypes(kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = getOwnerDescriptor().getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "ownerDescriptor.typeConstructor");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collectionMo1269getSupertypes = typeConstructor.mo1269getSupertypes();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionMo1269getSupertypes, "ownerDescriptor.typeConstructor.supertypes");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = collectionMo1269getSupertypes.iterator();
        while (it.hasNext()) {
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> contributedVariables = ((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).getMemberScope().getContributedVariables(name, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(contributedVariables, 10));
            java.util.Iterator<T> it2 = contributedVariables.iterator();
            while (it2.hasNext()) {
                arrayList2.add((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) it2.next());
            }
            kotlin.collections.CollectionsKt.addAll(arrayList, arrayList2);
        }
        return kotlin.collections.CollectionsKt.toSet(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData resolveMethodSignature(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod method, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> methodTypeParameters, kotlin.reflect.jvm.internal.impl.types.KotlinType returnType, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(method, "method");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(methodTypeParameters, "methodTypeParameters");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(returnType, "returnType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(valueParameters, "valueParameters");
        kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator.PropagatedSignature propagatedSignatureResolvePropagatedSignature = getC().getComponents().getSignaturePropagator().resolvePropagatedSignature(method, getOwnerDescriptor(), returnType, null, valueParameters, methodTypeParameters);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(propagatedSignatureResolvePropagatedSignature, "c.components.signaturePr…dTypeParameters\n        )");
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType2 = propagatedSignatureResolvePropagatedSignature.getReturnType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(returnType2, "propagated.returnType");
        kotlin.reflect.jvm.internal.impl.types.KotlinType receiverType = propagatedSignatureResolvePropagatedSignature.getReceiverType();
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters2 = propagatedSignatureResolvePropagatedSignature.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters2, "propagated.valueParameters");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = propagatedSignatureResolvePropagatedSignature.getTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameters, "propagated.typeParameters");
        boolean zHasStableParameterNames = propagatedSignatureResolvePropagatedSignature.hasStableParameterNames();
        java.util.List<java.lang.String> errors = propagatedSignatureResolvePropagatedSignature.getErrors();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(errors, "propagated.errors");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData(returnType2, receiverType, valueParameters2, typeParameters, zHasStableParameterNames, errors);
    }

    private final boolean hasSameJvmDescriptorButDoesNotOverride(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        java.lang.String strComputeJvmDescriptor$default = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 2, null);
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor original = functionDescriptor.getOriginal();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(original, "builtinWithErasedParameters.original");
        return kotlin.jvm.internal.Intrinsics.areEqual(strComputeJvmDescriptor$default, kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(original, false, false, 2, null)) && !doesOverride(simpleFunctionDescriptor, functionDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor resolveConstructor(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor javaConstructor) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ownerDescriptor = getOwnerDescriptor();
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor javaConstructor2 = javaConstructor;
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateJavaConstructor = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(getC(), javaConstructor), false, getC().getComponents().getSourceElementFactory().source(javaConstructor2));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(javaClassConstructorDescriptorCreateJavaConstructor, "JavaClassConstructorDesc…ce(constructor)\n        )");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContextChildForMethod = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.childForMethod(getC(), javaClassConstructorDescriptorCreateJavaConstructor, javaConstructor, ownerDescriptor.getDeclaredTypeParameters().size());
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.ResolvedValueParameters resolvedValueParametersResolveValueParameters = resolveValueParameters(lazyJavaResolverContextChildForMethod, javaClassConstructorDescriptorCreateJavaConstructor, javaConstructor.getValueParameters());
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = ownerDescriptor.getDeclaredTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaredTypeParameters, "classDescriptor.declaredTypeParameters");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = declaredTypeParameters;
        java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter> typeParameters = javaConstructor.getTypeParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(typeParameters, 10));
        java.util.Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = lazyJavaResolverContextChildForMethod.getTypeParameterResolver().resolveTypeParameter((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter) it.next());
            if (typeParameterDescriptorResolveTypeParameter == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            arrayList.add(typeParameterDescriptorResolveTypeParameter);
        }
        javaClassConstructorDescriptorCreateJavaConstructor.initialize(resolvedValueParametersResolveValueParameters.getDescriptors(), javaConstructor.getVisibility(), kotlin.collections.CollectionsKt.plus((java.util.Collection) list, (java.lang.Iterable) arrayList));
        javaClassConstructorDescriptorCreateJavaConstructor.setHasStableParameterNames(false);
        javaClassConstructorDescriptorCreateJavaConstructor.setHasSynthesizedParameterNames(resolvedValueParametersResolveValueParameters.getHasSynthesizedNames());
        javaClassConstructorDescriptorCreateJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
        lazyJavaResolverContextChildForMethod.getComponents().getJavaResolverCache().recordConstructor(javaConstructor2, javaClassConstructorDescriptorCreateJavaConstructor);
        return javaClassConstructorDescriptorCreateJavaConstructor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor createDefaultConstructor() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> listEmptyList;
        boolean zIsAnnotationType = this.jClass.isAnnotationType();
        if (this.jClass.isInterface() && !zIsAnnotationType) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ownerDescriptor = getOwnerDescriptor();
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateJavaConstructor = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), true, getC().getComponents().getSourceElementFactory().source(this.jClass));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(javaClassConstructorDescriptorCreateJavaConstructor, "JavaClassConstructorDesc….source(jClass)\n        )");
        if (zIsAnnotationType) {
            listEmptyList = createAnnotationConstructorParameters(javaClassConstructorDescriptorCreateJavaConstructor);
        } else {
            listEmptyList = java.util.Collections.emptyList();
        }
        javaClassConstructorDescriptorCreateJavaConstructor.setHasSynthesizedParameterNames(false);
        javaClassConstructorDescriptorCreateJavaConstructor.initialize(listEmptyList, getConstructorVisibility(ownerDescriptor));
        javaClassConstructorDescriptorCreateJavaConstructor.setHasStableParameterNames(true);
        javaClassConstructorDescriptorCreateJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
        getC().getComponents().getJavaResolverCache().recordConstructor(this.jClass, javaClassConstructorDescriptorCreateJavaConstructor);
        return javaClassConstructorDescriptorCreateJavaConstructor;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.Visibility getConstructorVisibility(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = classDescriptor.getVisibility();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(visibility, "classDescriptor.visibility");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(visibility, kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities.PROTECTED_STATIC_VISIBILITY)) {
            return visibility;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility2 = kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities.PROTECTED_AND_PACKAGE;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(visibility2, "JavaVisibilities.PROTECTED_AND_PACKAGE");
        return visibility2;
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> createAnnotationConstructorParameters(kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl classConstructorDescriptorImpl) {
        kotlin.Pair pair;
        java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod> methods = this.jClass.getMethods();
        java.util.ArrayList arrayList = new java.util.ArrayList(methods.size());
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes attributes$default = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON, true, null, 2, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : methods) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod) obj).getName(), kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        kotlin.Pair pair2 = new kotlin.Pair(arrayList2, arrayList3);
        java.util.List list = (java.util.List) pair2.component1();
        java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod> list2 = (java.util.List) pair2.component2();
        list.size();
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod) kotlin.collections.CollectionsKt.firstOrNull(list);
        if (javaMethod != null) {
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType returnType = javaMethod.getReturnType();
            if (returnType instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType) {
                kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType javaArrayType = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType) returnType;
                pair = new kotlin.Pair(getC().getTypeResolver().transformArrayType(javaArrayType, attributes$default, true), getC().getTypeResolver().transformJavaType(javaArrayType.getComponentType(), attributes$default));
            } else {
                pair = new kotlin.Pair(getC().getTypeResolver().transformJavaType(returnType, attributes$default), null);
            }
            addAnnotationValueParameter(arrayList, classConstructorDescriptorImpl, 0, javaMethod, (kotlin.reflect.jvm.internal.impl.types.KotlinType) pair.component1(), (kotlin.reflect.jvm.internal.impl.types.KotlinType) pair.component2());
        }
        int i = 0;
        int i2 = javaMethod != null ? 1 : 0;
        for (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod2 : list2) {
            addAnnotationValueParameter(arrayList, classConstructorDescriptorImpl, i + i2, javaMethod2, getC().getTypeResolver().transformJavaType(javaMethod2.getReturnType(), attributes$default), null);
            i++;
        }
        return arrayList;
    }

    private final void addAnnotationValueParameter(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor constructorDescriptor, int i, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2) {
        kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor constructorDescriptor2 = constructorDescriptor;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations empty = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
        kotlin.reflect.jvm.internal.impl.name.Name name = javaMethod.getName();
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeMakeNotNullable = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNotNullable(kotlinType);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kotlinTypeMakeNotNullable, "TypeUtils.makeNotNullable(returnType)");
        list.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl(constructorDescriptor2, null, i, empty, name, kotlinTypeMakeNotNullable, javaMethod.getHasAnnotationParameterDefaultValue(), false, false, kotlinType2 != null ? kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNotNullable(kotlinType2) : null, getC().getComponents().getSourceElementFactory().source(javaMethod)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getDispatchReceiverParameterIfNeeded(getOwnerDescriptor());
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo1270getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        recordLookup(name, location);
        return this.nestedClasses.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        recordLookup(name, location);
        return super.getContributedFunctions(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        recordLookup(name, location);
        return super.getContributedVariables(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computeClassNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
        return kotlin.collections.SetsKt.plus((java.util.Set) this.nestedClassIndex.invoke(), (java.lang.Iterable) this.enumEntryIndex.invoke().keySet());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computePropertyNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
        if (this.jClass.isAnnotationType()) {
            return getFunctionNames();
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(getDeclaredMemberIndex().invoke().getFieldNames());
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = getOwnerDescriptor().getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "ownerDescriptor.typeConstructor");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collectionMo1269getSupertypes = typeConstructor.mo1269getSupertypes();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionMo1269getSupertypes, "ownerDescriptor.typeConstructor.supertypes");
        java.util.Iterator<T> it = collectionMo1269getSupertypes.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(linkedHashSet, ((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).getMemberScope().getVariableNames());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    public void recordLookup(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.record(getC().getComponents().getLookupTracker(), location, getOwnerDescriptor(), name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public java.lang.String toString() {
        return "Lazy Java member scope for " + this.jClass.getFqName();
    }
}
