package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: typeParameterUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeParameterUtilsKt {
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> computeConstructorTypeParameters(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters computeConstructorTypeParameters) {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> listEmptyList;
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor next;
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(computeConstructorTypeParameters, "$this$computeConstructorTypeParameters");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = computeConstructorTypeParameters.getDeclaredTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaredTypeParameters, "declaredTypeParameters");
        if (!computeConstructorTypeParameters.isInner() && !(computeConstructorTypeParameters.getContainingDeclaration() instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor)) {
            return declaredTypeParameters;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters = computeConstructorTypeParameters;
        java.util.List list = kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.flatMap(kotlin.sequences.SequencesKt.takeWhile(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters), new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
                return java.lang.Boolean.valueOf(invoke2(declarationDescriptor));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
            }
        }), new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.sequences.Sequence<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$2
            @Override // kotlin.jvm.functions.Function1
            public final kotlin.sequences.Sequence<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> invoke(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = ((kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) it).getTypeParameters();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameters, "(it as CallableDescriptor).typeParameters");
                return kotlin.collections.CollectionsKt.asSequence(typeParameters);
            }
        }));
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> it = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters).iterator();
        do {
            listEmptyList = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor));
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) next;
        if (classDescriptor != null && (typeConstructor = classDescriptor.getTypeConstructor()) != null) {
            listEmptyList = typeConstructor.getParameters();
        }
        if (listEmptyList == null) {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        if (list.isEmpty() && listEmptyList.isEmpty()) {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters2 = computeConstructorTypeParameters.getDeclaredTypeParameters();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaredTypeParameters2, "declaredTypeParameters");
            return declaredTypeParameters2;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> listPlus = kotlin.collections.CollectionsKt.plus((java.util.Collection) list, (java.lang.Iterable) listEmptyList);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor it2 : listPlus) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it2, "it");
            arrayList.add(capturedCopyForInnerDeclaration(it2, classifierDescriptorWithTypeParameters, declaredTypeParameters.size()));
        }
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) declaredTypeParameters, (java.lang.Iterable) arrayList);
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.CapturedTypeParameterDescriptor capturedCopyForInnerDeclaration(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, int i) {
        return new kotlin.reflect.jvm.internal.impl.descriptors.CapturedTypeParameterDescriptor(typeParameterDescriptor, declarationDescriptor, i);
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType buildPossiblyInnerType(kotlin.reflect.jvm.internal.impl.types.KotlinType buildPossiblyInnerType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(buildPossiblyInnerType, "$this$buildPossiblyInnerType");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = buildPossiblyInnerType.getConstructor().mo1268getDeclarationDescriptor();
        if (!(classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters)) {
            classifierDescriptorMo1268getDeclarationDescriptor = null;
        }
        return buildPossiblyInnerType(buildPossiblyInnerType, (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters) classifierDescriptorMo1268getDeclarationDescriptor, 0);
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType buildPossiblyInnerType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i) {
        if (classifierDescriptorWithTypeParameters != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters2 = classifierDescriptorWithTypeParameters;
            if (!kotlin.reflect.jvm.internal.impl.types.ErrorUtils.isError(classifierDescriptorWithTypeParameters2)) {
                int size = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters().size() + i;
                if (!classifierDescriptorWithTypeParameters.isInner()) {
                    if (size != kotlinType.getArguments().size()) {
                        kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isLocal(classifierDescriptorWithTypeParameters2);
                    }
                    return new kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType(classifierDescriptorWithTypeParameters, kotlinType.getArguments().subList(i, kotlinType.getArguments().size()), null);
                }
                java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> listSubList = kotlinType.getArguments().subList(i, size);
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = classifierDescriptorWithTypeParameters.getContainingDeclaration();
                return new kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType(classifierDescriptorWithTypeParameters, listSubList, buildPossiblyInnerType(kotlinType, (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters) (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters ? containingDeclaration : null), size));
            }
        }
        return null;
    }
}
