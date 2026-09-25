package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

/* JADX INFO: compiled from: DescriptorUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorUtilsKt {
    private static final kotlin.reflect.jvm.internal.impl.name.Name RETENTION_PARAMETER_NAME;

    static {
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier("value");
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(\"value\")");
        RETENTION_PARAMETER_NAME = nameIdentifier;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe getFqNameUnsafe(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor fqNameUnsafe) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqNameUnsafe, "$this$fqNameUnsafe");
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqName = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(fqNameUnsafe);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "DescriptorUtils.getFqName(this)");
        return fqName;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getFqNameSafe(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor fqNameSafe) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqNameSafe, "$this$fqNameSafe");
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameSafe2 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqNameSafe(fqNameSafe);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameSafe2, "DescriptorUtils.getFqNameSafe(this)");
        return fqNameSafe2;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getModule(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor module) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "$this$module");
        kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor containingModule = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingModule(module);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(containingModule, "DescriptorUtils.getContainingModule(this)");
        return containingModule;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor resolveTopLevelClass(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor resolveTopLevelClass, kotlin.reflect.jvm.internal.impl.name.FqName topLevelClassFqName, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(resolveTopLevelClass, "$this$resolveTopLevelClass");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(topLevelClassFqName, "topLevelClassFqName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        topLevelClassFqName.isRoot();
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameParent = topLevelClassFqName.parent();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameParent, "topLevelClassFqName.parent()");
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = resolveTopLevelClass.getPackage(fqNameParent).getMemberScope();
        kotlin.reflect.jvm.internal.impl.name.Name nameShortName = topLevelClassFqName.shortName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameShortName, "topLevelClassFqName.shortName()");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier = memberScope.mo1270getContributedClassifier(nameShortName, location);
        if (!(contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            contributedClassifier = null;
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration;
        kotlin.reflect.jvm.internal.impl.name.ClassId classId;
        if (classifierDescriptor == null || (containingDeclaration = classifierDescriptor.getContainingDeclaration()) == null) {
            return null;
        }
        if (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) {
            return new kotlin.reflect.jvm.internal.impl.name.ClassId(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) containingDeclaration).getFqName(), classifierDescriptor.getName());
        }
        if (!(containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters) || (classId = getClassId((kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) containingDeclaration)) == null) {
            return null;
        }
        return classId.createNestedClassId(classifierDescriptor.getName());
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getSuperClassNotAny(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getSuperClassNotAny) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getSuperClassNotAny, "$this$getSuperClassNotAny");
        for (kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType : getSuperClassNotAny.getDefaultType().getConstructor().mo1269getSupertypes()) {
            if (!kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isAnyOrNullableAny(kotlinType)) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = kotlinType.getConstructor().mo1268getDeclarationDescriptor();
                if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isClassOrEnumClass(classifierDescriptorMo1268getDeclarationDescriptor)) {
                    if (classifierDescriptorMo1268getDeclarationDescriptor != null) {
                        return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor;
                    }
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                }
            }
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor builtIns) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builtIns, "$this$builtIns");
        return getModule(builtIns).getBuiltIns();
    }

    public static final boolean declaresOrInheritsDefaultValue(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor declaresOrInheritsDefaultValue) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(declaresOrInheritsDefaultValue, "$this$declaresOrInheritsDefaultValue");
        java.lang.Boolean boolIfAny = kotlin.reflect.jvm.internal.impl.utils.DFS.ifAny(kotlin.collections.CollectionsKt.listOf(declaresOrInheritsDefaultValue), new kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors<N>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.declaresOrInheritsDefaultValue.1
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getNeighbors(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor current) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(current, "current");
                java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> overriddenDescriptors = current.getOverriddenDescriptors();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(overriddenDescriptors, 10));
                java.util.Iterator<T> it = overriddenDescriptors.iterator();
                while (it.hasNext()) {
                    arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) it.next()).getOriginal());
                }
                return arrayList;
            }
        }, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.AnonymousClass2.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(boolIfAny, "DFS.ifAny(\n        listO…eclaresDefaultValue\n    )");
        return boolIfAny.booleanValue();
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$declaresOrInheritsDefaultValue$2, reason: invalid class name */
    /* JADX INFO: compiled from: DescriptorUtils.kt */
    static final /* synthetic */ class AnonymousClass2 extends kotlin.jvm.internal.FunctionReference implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, java.lang.Boolean> {
        public static final kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.AnonymousClass2 INSTANCE = new kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final java.lang.String getName() {
            return "declaresDefaultValue";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final kotlin.reflect.KDeclarationContainer getOwner() {
            return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final java.lang.String getSignature() {
            return "declaresDefaultValue()Z";
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor) {
            return java.lang.Boolean.valueOf(invoke2(valueParameterDescriptor));
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor p1) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p1, "p1");
            return p1.declaresDefaultValue();
        }
    }

    public static final kotlin.sequences.Sequence<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getParentsWithSelf(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor parentsWithSelf) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parentsWithSelf, "$this$parentsWithSelf");
        return kotlin.sequences.SequencesKt.generateSequence(parentsWithSelf, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$parentsWithSelf$1
            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor invoke(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it.getContainingDeclaration();
            }
        });
    }

    public static final kotlin.sequences.Sequence<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getParents(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor parents) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parents, "$this$parents");
        return kotlin.sequences.SequencesKt.drop(getParentsWithSelf(parents), 1);
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor getPropertyIfAccessor(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor propertyIfAccessor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(propertyIfAccessor, "$this$propertyIfAccessor");
        if (!(propertyIfAccessor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor)) {
            return propertyIfAccessor;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor correspondingProperty = ((kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor) propertyIfAccessor).getCorrespondingProperty();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(correspondingProperty, "correspondingProperty");
        return correspondingProperty;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName fqNameOrNull(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor fqNameOrNull) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqNameOrNull, "$this$fqNameOrNull");
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe = getFqNameUnsafe(fqNameOrNull);
        if (!fqNameUnsafe.isSafe()) {
            fqNameUnsafe = null;
        }
        if (fqNameUnsafe != null) {
            return fqNameUnsafe.toSafe();
        }
        return null;
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor firstOverridden$default(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return firstOverridden(callableMemberDescriptor, z, function1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor] */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor firstOverridden(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor firstOverridden, final boolean z, final kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(firstOverridden, "$this$firstOverridden");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) 0;
        return (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) kotlin.reflect.jvm.internal.impl.utils.DFS.dfs(kotlin.collections.CollectionsKt.listOf(firstOverridden), new kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors<N>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden.1
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public final java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> getNeighbors(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
                java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collectionEmptyList;
                if (z) {
                    callableMemberDescriptor = callableMemberDescriptor != null ? callableMemberDescriptor.getOriginal() : null;
                }
                if (callableMemberDescriptor == null || (collectionEmptyList = callableMemberDescriptor.getOverriddenDescriptors()) == null) {
                    collectionEmptyList = kotlin.collections.CollectionsKt.emptyList();
                }
                return collectionEmptyList;
            }
        }, new kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden.2
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public boolean beforeChildren(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor current) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(current, "current");
                return ((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) objectRef.element) == null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public void afterChildren(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor current) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(current, "current");
                if (((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) objectRef.element) == null && ((java.lang.Boolean) predicate.invoke(current)).booleanValue()) {
                    objectRef.element = current;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor result() {
                return (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) objectRef.element;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$computeSealedSubclasses$1] */
    public static final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> computeSealedSubclasses(final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor sealedClass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(sealedClass, "sealedClass");
        if (sealedClass.getModality() != kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        final java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        ?? r1 = new kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, java.lang.Boolean, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.computeSealedSubclasses.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope, java.lang.Boolean bool) {
                invoke(memberScope, bool.booleanValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope scope, boolean z) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scope, "scope");
                for (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor : kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.getContributedDescriptors$default(scope, kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.CLASSIFIERS, null, 2, null)) {
                    if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
                        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor;
                        if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isDirectSubclass(classDescriptor, sealedClass)) {
                            linkedHashSet.add(declarationDescriptor);
                        }
                        if (z) {
                            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedInnerClassesScope = classDescriptor.getUnsubstitutedInnerClassesScope();
                            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(unsubstitutedInnerClassesScope, "descriptor.unsubstitutedInnerClassesScope");
                            invoke(unsubstitutedInnerClassesScope, z);
                        }
                    }
                }
            }
        };
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = sealedClass.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(containingDeclaration, "sealedClass.containingDeclaration");
        if (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) {
            r1.invoke(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) containingDeclaration).getMemberScope(), false);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedInnerClassesScope = sealedClass.getUnsubstitutedInnerClassesScope();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(unsubstitutedInnerClassesScope, "sealedClass.unsubstitutedInnerClassesScope");
        r1.invoke(unsubstitutedInnerClassesScope, true);
        return linkedHashSet;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getAnnotationClass(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationClass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotationClass, "$this$annotationClass");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = annotationClass.getType().getConstructor().mo1268getDeclarationDescriptor();
        if (!(classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            classifierDescriptorMo1268getDeclarationDescriptor = null;
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor;
    }

    public static final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> firstArgument(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor firstArgument) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(firstArgument, "$this$firstArgument");
        return (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) kotlin.collections.CollectionsKt.firstOrNull(firstArgument.getAllValueArguments().values());
    }
}
