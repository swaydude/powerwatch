package kotlin.reflect.jvm.internal.impl.resolve;

/* JADX INFO: compiled from: DescriptorEquivalenceForOverrides.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorEquivalenceForOverrides {
    public static final kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides INSTANCE = new kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides();

    private DescriptorEquivalenceForOverrides() {
    }

    public final boolean areEquivalent(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2) {
        if ((declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && (declarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            return areClassesEquivalent((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor, (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor2);
        }
        if ((declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) && (declarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor)) {
            return areTypeParametersEquivalent$default(this, (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) declarationDescriptor, (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) declarationDescriptor2, null, 4, null);
        }
        if ((declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) && (declarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor)) {
            return areCallableDescriptorsEquivalent$default(this, (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) declarationDescriptor, (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) declarationDescriptor2, false, 4, null);
        }
        return ((declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) && (declarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor)) ? kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) declarationDescriptor).getFqName(), ((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) declarationDescriptor2).getFqName()) : kotlin.jvm.internal.Intrinsics.areEqual(declarationDescriptor, declarationDescriptor2);
    }

    private final boolean areClassesEquivalent(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(classDescriptor.getTypeConstructor(), classDescriptor2.getTypeConstructor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean areTypeParametersEquivalent$default(kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor2, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function2 = new kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides.areTypeParametersEquivalent.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final boolean invoke2(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2) {
                    return false;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2) {
                    return java.lang.Boolean.valueOf(invoke2(declarationDescriptor, declarationDescriptor2));
                }
            };
        }
        return descriptorEquivalenceForOverrides.areTypeParametersEquivalent(typeParameterDescriptor, typeParameterDescriptor2, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean areTypeParametersEquivalent(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor2, kotlin.jvm.functions.Function2<? super kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, ? super kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, java.lang.Boolean> function2) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(typeParameterDescriptor, typeParameterDescriptor2)) {
            return true;
        }
        return !kotlin.jvm.internal.Intrinsics.areEqual(typeParameterDescriptor.getContainingDeclaration(), typeParameterDescriptor2.getContainingDeclaration()) && ownersEquivalent(typeParameterDescriptor, typeParameterDescriptor2, function2) && typeParameterDescriptor.getIndex() == typeParameterDescriptor2.getIndex();
    }

    public static /* synthetic */ boolean areCallableDescriptorsEquivalent$default(kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return descriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent(callableDescriptor, callableDescriptor2, z);
    }

    public final boolean areCallableDescriptorsEquivalent(final kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor a, final kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor b, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(a, "a");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(b, "b");
        if (kotlin.jvm.internal.Intrinsics.areEqual(a, b)) {
            return true;
        }
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(a.getName(), b.getName())) || kotlin.jvm.internal.Intrinsics.areEqual(a.getContainingDeclaration(), b.getContainingDeclaration())) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor = a;
        if (!kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isLocal(callableDescriptor)) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2 = b;
            if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isLocal(callableDescriptor2) || !ownersEquivalent(callableDescriptor, callableDescriptor2, new kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final boolean invoke2(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2) {
                    return false;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2) {
                    return java.lang.Boolean.valueOf(invoke2(declarationDescriptor, declarationDescriptor2));
                }
            })) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil overridingUtilCreateWithEqualityAxioms = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.createWithEqualityAxioms(new kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1
                @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final boolean equals(kotlin.reflect.jvm.internal.impl.types.TypeConstructor c1, kotlin.reflect.jvm.internal.impl.types.TypeConstructor c2) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c1, "c1");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c2, "c2");
                    if (kotlin.jvm.internal.Intrinsics.areEqual(c1, c2)) {
                        return true;
                    }
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = c1.mo1268getDeclarationDescriptor();
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor2 = c2.mo1268getDeclarationDescriptor();
                    if ((classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) && (classifierDescriptorMo1268getDeclarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor)) {
                        return kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides.INSTANCE.areTypeParametersEquivalent((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) classifierDescriptorMo1268getDeclarationDescriptor, (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) classifierDescriptorMo1268getDeclarationDescriptor2, new kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1.1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2) {
                                return java.lang.Boolean.valueOf(invoke2(declarationDescriptor, declarationDescriptor2));
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final boolean invoke2(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2) {
                                return kotlin.jvm.internal.Intrinsics.areEqual(declarationDescriptor, a) && kotlin.jvm.internal.Intrinsics.areEqual(declarationDescriptor2, b);
                            }
                        });
                    }
                    return false;
                }
            });
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(overridingUtilCreateWithEqualityAxioms, "OverridingUtil.createWit…= a && y == b})\n        }");
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoIsOverridableBy = overridingUtilCreateWithEqualityAxioms.isOverridableBy(a, b, null, !z);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(overrideCompatibilityInfoIsOverridableBy, "overridingUtil.isOverrid… null, !ignoreReturnType)");
            if (overrideCompatibilityInfoIsOverridableBy.getResult() == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoIsOverridableBy2 = overridingUtilCreateWithEqualityAxioms.isOverridableBy(b, a, null, !z);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(overrideCompatibilityInfoIsOverridableBy2, "overridingUtil.isOverrid… null, !ignoreReturnType)");
                if (overrideCompatibilityInfoIsOverridableBy2.getResult() == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private final boolean ownersEquivalent(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2, kotlin.jvm.functions.Function2<? super kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, ? super kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, java.lang.Boolean> function2) {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = declarationDescriptor2.getContainingDeclaration();
        if ((containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) || (containingDeclaration2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor)) {
            return function2.invoke(containingDeclaration, containingDeclaration2).booleanValue();
        }
        return areEquivalent(containingDeclaration, containingDeclaration2);
    }
}
