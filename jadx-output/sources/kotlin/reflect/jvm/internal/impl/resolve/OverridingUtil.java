package kotlin.reflect.jvm.internal.impl.resolve;

/* JADX INFO: loaded from: classes2.dex */
public class OverridingUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality equalityAxioms;
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition> EXTERNAL_CONDITIONS = kotlin.collections.CollectionsKt.toList(java.util.ServiceLoader.load(kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.class, kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.class.getClassLoader()));
    public static final kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil DEFAULT = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil(new kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.1
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
        public boolean equals(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor2) {
            if (typeConstructor == null) {
                $$$reportNull$$$0(0);
            }
            if (typeConstructor2 == null) {
                $$$reportNull$$$0(1);
            }
            return typeConstructor.equals(typeConstructor2);
        }
    });

    /* JADX WARN: Code duplicated, block: B:17:0x0033 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:33:0x0056 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:99:0x018b  */
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str;
        int i2;
        if (i != 4 && i != 5 && i != 9 && i != 14 && i != 87 && i != 90 && i != 95 && i != 37 && i != 38) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 82:
                                        case 83:
                                        case 84:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 72:
                                case 73:
                                case 74:
                                case 75:
                                case 76:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 5 && i != 9 && i != 14 && i != 87 && i != 90 && i != 95 && i != 37 && i != 38) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 82:
                                        case 83:
                                        case 84:
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                case 72:
                                case 73:
                                case 74:
                                case 75:
                                case 76:
                                    i2 = 2;
                                    break;
                            }
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                            i2 = 2;
                            break;
                    }
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    i2 = 2;
                    break;
            }
        } else {
            i2 = 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
            case 2:
                objArr[0] = "candidateSet";
                break;
            case 3:
                objArr[0] = "transformFirst";
                break;
            case 4:
            case 5:
            case 9:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 37:
            case 38:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 82:
            case 83:
            case 84:
            case 87:
            case 90:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 6:
                objArr[0] = "f";
                break;
            case 7:
                objArr[0] = "g";
                break;
            case 8:
            case 10:
                objArr[0] = "descriptor";
                break;
            case 11:
                objArr[0] = "result";
                break;
            case 12:
            case 15:
            case 23:
            case 33:
                objArr[0] = "superDescriptor";
                break;
            case 13:
            case 16:
            case 24:
            case 34:
                objArr[0] = "subDescriptor";
                break;
            case 35:
                objArr[0] = "firstParameters";
                break;
            case 36:
                objArr[0] = "secondParameters";
                break;
            case 39:
                objArr[0] = "typeInSuper";
                break;
            case 40:
                objArr[0] = "typeInSub";
                break;
            case 41:
            case 44:
                objArr[0] = "typeChecker";
                break;
            case 42:
                objArr[0] = "superTypeParameter";
                break;
            case 43:
                objArr[0] = "subTypeParameter";
                break;
            case 45:
                objArr[0] = com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 46:
                objArr[0] = "membersFromSupertypes";
                break;
            case 47:
                objArr[0] = "membersFromCurrent";
                break;
            case 48:
            case 54:
            case 57:
            case 78:
            case 81:
            case 88:
                objArr[0] = "current";
                break;
            case 49:
            case 55:
            case 59:
            case 79:
            case 98:
                objArr[0] = "strategy";
                break;
            case 50:
                objArr[0] = "overriding";
                break;
            case 51:
                objArr[0] = "fromSuper";
                break;
            case 52:
                objArr[0] = "fromCurrent";
                break;
            case 53:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 56:
            case 58:
                objArr[0] = "notOverridden";
                break;
            case 60:
            case 62:
            case 66:
                objArr[0] = "a";
                break;
            case 61:
            case 63:
            case 68:
                objArr[0] = "b";
                break;
            case 64:
                objArr[0] = "candidate";
                break;
            case 65:
            case 80:
            case 85:
            case 101:
                objArr[0] = "descriptors";
                break;
            case 67:
                objArr[0] = "aReturnType";
                break;
            case 69:
                objArr[0] = "bReturnType";
                break;
            case 70:
            case 77:
                objArr[0] = "overridables";
                break;
            case 71:
            case 93:
                objArr[0] = "descriptorByHandle";
                break;
            case 86:
                objArr[0] = "classModality";
                break;
            case 89:
                objArr[0] = "toFilter";
                break;
            case 91:
            case 96:
                objArr[0] = "overrider";
                break;
            case 92:
            case 97:
                objArr[0] = "extractFrom";
                break;
            case 94:
                objArr[0] = "onConflict";
                break;
            case 99:
            case 100:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "equalityAxioms";
                break;
        }
        if (i == 4 || i == 5) {
            objArr[1] = "filterOverrides";
        } else if (i == 9) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i == 14) {
            objArr[1] = "isOverridableBy";
        } else if (i == 87) {
            objArr[1] = "getMinimalModality";
        } else if (i == 90) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i == 95) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i != 37 && i != 38) {
            switch (i) {
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i) {
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i) {
                                case 72:
                                case 73:
                                case 74:
                                case 75:
                                case 76:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i) {
                                        case 82:
                                        case 83:
                                        case 84:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeChecker";
        }
        switch (i) {
            case 1:
                objArr[2] = "filterOutOverridden";
                break;
            case 2:
            case 3:
                objArr[2] = "filterOverrides";
                break;
            case 4:
            case 5:
            case 9:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 37:
            case 38:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 82:
            case 83:
            case 84:
            case 87:
            case 90:
            case 95:
                break;
            case 6:
            case 7:
                objArr[2] = "overrides";
                break;
            case 8:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 10:
            case 11:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 12:
            case 13:
            case 15:
            case 16:
                objArr[2] = "isOverridableBy";
                break;
            case 23:
            case 24:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 33:
            case 34:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 35:
            case 36:
                objArr[2] = "createTypeChecker";
                break;
            case 39:
            case 40:
            case 41:
                objArr[2] = "areTypesEquivalent";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 50:
            case 51:
                objArr[2] = "isVisibleForOverride";
                break;
            case 52:
            case 53:
            case 54:
            case 55:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 56:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 57:
            case 58:
            case 59:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 60:
            case 61:
                objArr[2] = "isMoreSpecific";
                break;
            case 62:
            case 63:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 64:
            case 65:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 66:
            case 67:
            case 68:
            case 69:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 70:
            case 71:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 77:
            case 78:
            case 79:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 80:
            case 81:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 85:
            case 86:
                objArr[2] = "getMinimalModality";
                break;
            case 88:
            case 89:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 91:
            case 92:
            case 93:
            case 94:
            case 96:
            case 97:
            case 98:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 99:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 100:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 101:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithEqualityAxioms";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 4 && i != 5 && i != 9 && i != 14 && i != 87 && i != 90 && i != 95 && i != 37 && i != 38) {
            switch (i) {
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    switch (i) {
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                            break;
                        default:
                            switch (i) {
                                case 72:
                                case 73:
                                case 74:
                                case 75:
                                case 76:
                                    break;
                                default:
                                    switch (i) {
                                        case 82:
                                        case 83:
                                        case 84:
                                            break;
                                        default:
                                            throw new java.lang.IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil createWithEqualityAxioms(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality) {
        if (typeConstructorEquality == null) {
            $$$reportNull$$$0(0);
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil(typeConstructorEquality);
    }

    private OverridingUtil(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality) {
        this.equalityAxioms = typeConstructorEquality;
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> java.util.Set<D> filterOutOverridden(java.util.Set<D> set) {
        if (set == null) {
            $$$reportNull$$$0(1);
        }
        return filterOverrides(set, new kotlin.jvm.functions.Function2<D, D, kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.2
            /* JADX WARN: Incorrect types in method signature: (TD;TD;)Lkotlin/Pair<Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;>; */
            @Override // kotlin.jvm.functions.Function2
            public kotlin.Pair invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2) {
                return new kotlin.Pair(callableDescriptor, callableDescriptor2);
            }
        });
    }

    public static <D> java.util.Set<D> filterOverrides(java.util.Set<D> set, kotlin.jvm.functions.Function2<? super D, ? super D, kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor>> function2) {
        if (set == null) {
            $$$reportNull$$$0(2);
        }
        if (function2 == null) {
            $$$reportNull$$$0(3);
        }
        if (set.size() <= 1) {
            if (set == null) {
                $$$reportNull$$$0(4);
            }
            return set;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.Object obj : set) {
            java.util.Iterator it = linkedHashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> pairInvoke = function2.invoke(obj, (java.lang.Object) it.next());
                    kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptorComponent1 = pairInvoke.component1();
                    kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptorComponent2 = pairInvoke.component2();
                    if (overrides(callableDescriptorComponent1, callableDescriptorComponent2)) {
                        it.remove();
                    } else if (overrides(callableDescriptorComponent2, callableDescriptorComponent1)) {
                        break;
                    }
                } else {
                    linkedHashSet.add(obj);
                    break;
                }
            }
        }
        return linkedHashSet;
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> boolean overrides(D d, D d2) {
        if (d == null) {
            $$$reportNull$$$0(6);
        }
        if (d2 == null) {
            $$$reportNull$$$0(7);
        }
        if (!d.equals(d2) && kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(d.getOriginal(), d2.getOriginal())) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor original = d2.getOriginal();
        java.util.Iterator it = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getAllOverriddenDescriptors(d).iterator();
        while (it.hasNext()) {
            if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(original, (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> getOverriddenDeclarations(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(8);
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        collectOverriddenDeclarations(callableMemberDescriptor, linkedHashSet);
        return linkedHashSet;
    }

    private static void collectOverriddenDeclarations(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> set) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(10);
        }
        if (set == null) {
            $$$reportNull$$$0(11);
        }
        if (callableMemberDescriptor.getKind().isReal()) {
            set.add(callableMemberDescriptor);
            return;
        }
        if (callableMemberDescriptor.getOverriddenDescriptors().isEmpty()) {
            throw new java.lang.IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor);
        }
        java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> it = callableMemberDescriptor.getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            collectOverriddenDeclarations(it.next(), set);
        }
    }

    public kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo isOverridableBy(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(12);
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(13);
        }
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoIsOverridableBy = isOverridableBy(callableDescriptor, callableDescriptor2, classDescriptor, false);
        if (overrideCompatibilityInfoIsOverridableBy == null) {
            $$$reportNull$$$0(14);
        }
        return overrideCompatibilityInfoIsOverridableBy;
    }

    public kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo isOverridableBy(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, boolean z) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(15);
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(16);
        }
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoIsOverridableByWithoutExternalConditions = isOverridableByWithoutExternalConditions(callableDescriptor, callableDescriptor2, z);
        boolean z2 = overrideCompatibilityInfoIsOverridableByWithoutExternalConditions.getResult() == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        for (kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition externalOverridabilityCondition : EXTERNAL_CONDITIONS) {
            if (externalOverridabilityCondition.getContract() != kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY && (!z2 || externalOverridabilityCondition.getContract() != kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.SUCCESS_ONLY)) {
                int i = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.AnonymousClass9.$SwitchMap$org$jetbrains$kotlin$resolve$ExternalOverridabilityCondition$Result[externalOverridabilityCondition.isOverridable(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                if (i == 1) {
                    z2 = true;
                } else {
                    if (i == 2) {
                        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoConflict = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.conflict("External condition failed");
                        if (overrideCompatibilityInfoConflict == null) {
                            $$$reportNull$$$0(17);
                        }
                        return overrideCompatibilityInfoConflict;
                    }
                    if (i == 3) {
                        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.incompatible("External condition");
                        if (overrideCompatibilityInfoIncompatible == null) {
                            $$$reportNull$$$0(18);
                        }
                        return overrideCompatibilityInfoIncompatible;
                    }
                }
            }
        }
        if (!z2) {
            if (overrideCompatibilityInfoIsOverridableByWithoutExternalConditions == null) {
                $$$reportNull$$$0(19);
            }
            return overrideCompatibilityInfoIsOverridableByWithoutExternalConditions;
        }
        for (kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition externalOverridabilityCondition2 : EXTERNAL_CONDITIONS) {
            if (externalOverridabilityCondition2.getContract() == kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY) {
                int i2 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.AnonymousClass9.$SwitchMap$org$jetbrains$kotlin$resolve$ExternalOverridabilityCondition$Result[externalOverridabilityCondition2.isOverridable(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                if (i2 == 1) {
                    throw new java.lang.IllegalStateException("Contract violation in " + externalOverridabilityCondition2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i2 == 2) {
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoConflict2 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.conflict("External condition failed");
                    if (overrideCompatibilityInfoConflict2 == null) {
                        $$$reportNull$$$0(20);
                    }
                    return overrideCompatibilityInfoConflict2;
                }
                if (i2 == 3) {
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible2 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.incompatible("External condition");
                    if (overrideCompatibilityInfoIncompatible2 == null) {
                        $$$reportNull$$$0(21);
                    }
                    return overrideCompatibilityInfoIncompatible2;
                }
            }
        }
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoSuccess = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.success();
        if (overrideCompatibilityInfoSuccess == null) {
            $$$reportNull$$$0(22);
        }
        return overrideCompatibilityInfoSuccess;
    }

    public kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo isOverridableByWithoutExternalConditions(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2, boolean z) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(23);
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(24);
        }
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo basicOverridabilityProblem = getBasicOverridabilityProblem(callableDescriptor, callableDescriptor2);
        if (basicOverridabilityProblem != null) {
            if (basicOverridabilityProblem == null) {
                $$$reportNull$$$0(25);
            }
            return basicOverridabilityProblem;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> listCompiledValueParameters = compiledValueParameters(callableDescriptor);
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> listCompiledValueParameters2 = compiledValueParameters(callableDescriptor2);
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = callableDescriptor.getTypeParameters();
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters2 = callableDescriptor2.getTypeParameters();
        int i = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i < listCompiledValueParameters.size()) {
                if (!kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT.equalTypes(listCompiledValueParameters.get(i), listCompiledValueParameters2.get(i))) {
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.incompatible("Type parameter number mismatch");
                    if (overrideCompatibilityInfoIncompatible == null) {
                        $$$reportNull$$$0(26);
                    }
                    return overrideCompatibilityInfoIncompatible;
                }
                i++;
            }
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoConflict = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.conflict("Type parameter number mismatch");
            if (overrideCompatibilityInfoConflict == null) {
                $$$reportNull$$$0(27);
            }
            return overrideCompatibilityInfoConflict;
        }
        kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker kotlinTypeCheckerCreateTypeChecker = createTypeChecker(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            if (!areTypeParametersEquivalent(typeParameters.get(i2), typeParameters2.get(i2), kotlinTypeCheckerCreateTypeChecker)) {
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible2 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.incompatible("Type parameter bounds mismatch");
                if (overrideCompatibilityInfoIncompatible2 == null) {
                    $$$reportNull$$$0(28);
                }
                return overrideCompatibilityInfoIncompatible2;
            }
        }
        for (int i3 = 0; i3 < listCompiledValueParameters.size(); i3++) {
            if (!areTypesEquivalent(listCompiledValueParameters.get(i3), listCompiledValueParameters2.get(i3), kotlinTypeCheckerCreateTypeChecker)) {
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible3 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.incompatible("Value parameter type mismatch");
                if (overrideCompatibilityInfoIncompatible3 == null) {
                    $$$reportNull$$$0(29);
                }
                return overrideCompatibilityInfoIncompatible3;
            }
        }
        if ((callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) && (callableDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) && ((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) callableDescriptor).isSuspend() != ((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) callableDescriptor2).isSuspend()) {
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoConflict2 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.conflict("Incompatible suspendability");
            if (overrideCompatibilityInfoConflict2 == null) {
                $$$reportNull$$$0(30);
            }
            return overrideCompatibilityInfoConflict2;
        }
        if (z) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = callableDescriptor.getReturnType();
            kotlin.reflect.jvm.internal.impl.types.KotlinType returnType2 = callableDescriptor2.getReturnType();
            if (returnType != null && returnType2 != null) {
                if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(returnType2) && kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(returnType)) {
                    i = 1;
                }
                if (i == 0 && !kotlinTypeCheckerCreateTypeChecker.isSubtypeOf(returnType2, returnType)) {
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoConflict3 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.conflict("Return type mismatch");
                    if (overrideCompatibilityInfoConflict3 == null) {
                        $$$reportNull$$$0(31);
                    }
                    return overrideCompatibilityInfoConflict3;
                }
            }
        }
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoSuccess = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.success();
        if (overrideCompatibilityInfoSuccess == null) {
            $$$reportNull$$$0(32);
        }
        return overrideCompatibilityInfoSuccess;
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo getBasicOverridabilityProblem(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2) {
        boolean z;
        if (callableDescriptor == null) {
            $$$reportNull$$$0(33);
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(34);
        }
        boolean z2 = callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
        if ((z2 && !(callableDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor)) || (((z = callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor)) && !(callableDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor))) {
            return kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.incompatible("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new java.lang.IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + callableDescriptor);
        }
        if (!callableDescriptor.getName().equals(callableDescriptor2.getName())) {
            return kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.incompatible("Name mismatch");
        }
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoCheckReceiverAndParameterCount = checkReceiverAndParameterCount(callableDescriptor, callableDescriptor2);
        if (overrideCompatibilityInfoCheckReceiverAndParameterCount != null) {
            return overrideCompatibilityInfoCheckReceiverAndParameterCount;
        }
        return null;
    }

    private kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker createTypeChecker(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2) {
        if (list == null) {
            $$$reportNull$$$0(35);
        }
        if (list2 == null) {
            $$$reportNull$$$0(36);
        }
        if (list.isEmpty()) {
            kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker kotlinTypeCheckerWithAxioms = kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeCheckerImpl.withAxioms(this.equalityAxioms);
            if (kotlinTypeCheckerWithAxioms == null) {
                $$$reportNull$$$0(37);
            }
            return kotlinTypeCheckerWithAxioms;
        }
        final java.util.HashMap map = new java.util.HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i).getTypeConstructor(), list2.get(i).getTypeConstructor());
        }
        kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker kotlinTypeCheckerWithAxioms2 = kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeCheckerImpl.withAxioms(new kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.3
            private static /* synthetic */ void $$$reportNull$$$0(int i2) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i2 != 1) {
                    objArr[0] = "a";
                } else {
                    objArr[0] = "b";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$3";
                objArr[2] = "equals";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
            public boolean equals(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor2) {
                if (typeConstructor == null) {
                    $$$reportNull$$$0(0);
                }
                if (typeConstructor2 == null) {
                    $$$reportNull$$$0(1);
                }
                if (kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.this.equalityAxioms.equals(typeConstructor, typeConstructor2)) {
                    return true;
                }
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor3 = (kotlin.reflect.jvm.internal.impl.types.TypeConstructor) map.get(typeConstructor);
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor4 = (kotlin.reflect.jvm.internal.impl.types.TypeConstructor) map.get(typeConstructor2);
                return (typeConstructor3 != null && typeConstructor3.equals(typeConstructor2)) || (typeConstructor4 != null && typeConstructor4.equals(typeConstructor));
            }
        });
        if (kotlinTypeCheckerWithAxioms2 == null) {
            $$$reportNull$$$0(38);
        }
        return kotlinTypeCheckerWithAxioms2;
    }

    private static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo checkReceiverAndParameterCount(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2) {
        if ((callableDescriptor.getExtensionReceiverParameter() == null) != (callableDescriptor2.getExtensionReceiverParameter() == null)) {
            return kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.incompatible("Receiver presence mismatch");
        }
        if (callableDescriptor.getValueParameters().size() != callableDescriptor2.getValueParameters().size()) {
            return kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.incompatible("Value parameter number mismatch");
        }
        return null;
    }

    private static boolean areTypesEquivalent(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker kotlinTypeChecker) {
        if (kotlinType == null) {
            $$$reportNull$$$0(39);
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(40);
        }
        if (kotlinTypeChecker == null) {
            $$$reportNull$$$0(41);
        }
        return (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(kotlinType) && kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(kotlinType2)) || kotlinTypeChecker.equalTypes(kotlinType, kotlinType2);
    }

    private static boolean areTypeParametersEquivalent(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor2, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker kotlinTypeChecker) {
        if (typeParameterDescriptor == null) {
            $$$reportNull$$$0(42);
        }
        if (typeParameterDescriptor2 == null) {
            $$$reportNull$$$0(43);
        }
        if (kotlinTypeChecker == null) {
            $$$reportNull$$$0(44);
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameterDescriptor2.getUpperBounds());
        if (upperBounds.size() != arrayList.size()) {
            return false;
        }
        for (kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType : upperBounds) {
            java.util.ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (areTypesEquivalent(kotlinType, (kotlin.reflect.jvm.internal.impl.types.KotlinType) listIterator.next(), kotlinTypeChecker)) {
                    listIterator.remove();
                }
            }
            return false;
        }
        return true;
    }

    private static java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> compiledValueParameters(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (extensionReceiverParameter != null) {
            arrayList.add(extensionReceiverParameter.getType());
        }
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> it = callableDescriptor.getValueParameters().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    public static void generateOverridesInFunctionGroup(kotlin.reflect.jvm.internal.impl.name.Name name, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy overridingStrategy) {
        if (name == null) {
            $$$reportNull$$$0(45);
        }
        if (collection == null) {
            $$$reportNull$$$0(46);
        }
        if (collection2 == null) {
            $$$reportNull$$$0(47);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(48);
        }
        if (overridingStrategy == null) {
            $$$reportNull$$$0(49);
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(collection);
        java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(extractAndBindOverridesForMember(it.next(), collection, classDescriptor, overridingStrategy));
        }
        createAndBindFakeOverrides(classDescriptor, linkedHashSet, overridingStrategy);
    }

    public static boolean isVisibleForOverride(kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor memberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor memberDescriptor2) {
        if (memberDescriptor == null) {
            $$$reportNull$$$0(50);
        }
        if (memberDescriptor2 == null) {
            $$$reportNull$$$0(51);
        }
        return !kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.isPrivate(memberDescriptor2.getVisibility()) && kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.isVisibleIgnoringReceiver(memberDescriptor2, memberDescriptor);
    }

    private static java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> extractAndBindOverridesForMember(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy overridingStrategy) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(52);
        }
        if (collection == null) {
            $$$reportNull$$$0(53);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(54);
        }
        if (overridingStrategy == null) {
            $$$reportNull$$$0(55);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        kotlin.reflect.jvm.internal.impl.utils.SmartSet smartSetCreate = kotlin.reflect.jvm.internal.impl.utils.SmartSet.create();
        for (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result result = DEFAULT.isOverridableBy(callableMemberDescriptor2, callableMemberDescriptor, classDescriptor).getResult();
            boolean zIsVisibleForOverride = isVisibleForOverride(callableMemberDescriptor, callableMemberDescriptor2);
            int i = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.AnonymousClass9.$SwitchMap$org$jetbrains$kotlin$resolve$OverridingUtil$OverrideCompatibilityInfo$Result[result.ordinal()];
            if (i == 1) {
                if (zIsVisibleForOverride) {
                    smartSetCreate.add(callableMemberDescriptor2);
                }
                arrayList.add(callableMemberDescriptor2);
            } else if (i == 2) {
                if (zIsVisibleForOverride) {
                    overridingStrategy.overrideConflict(callableMemberDescriptor2, callableMemberDescriptor);
                }
                arrayList.add(callableMemberDescriptor2);
            }
        }
        overridingStrategy.setOverriddenDescriptors(callableMemberDescriptor, smartSetCreate);
        return arrayList;
    }

    private static boolean allHasSameContainingDeclaration(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection) {
        if (collection == null) {
            $$$reportNull$$$0(56);
        }
        if (collection.size() < 2) {
            return true;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = collection.iterator().next().getContainingDeclaration();
        return kotlin.collections.CollectionsKt.all(collection, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.4
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
                return java.lang.Boolean.valueOf(callableMemberDescriptor.getContainingDeclaration() == containingDeclaration);
            }
        });
    }

    private static void createAndBindFakeOverrides(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection, kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy overridingStrategy) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(57);
        }
        if (collection == null) {
            $$$reportNull$$$0(58);
        }
        if (overridingStrategy == null) {
            $$$reportNull$$$0(59);
        }
        if (allHasSameContainingDeclaration(collection)) {
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> it = collection.iterator();
            while (it.hasNext()) {
                createAndBindFakeOverride(java.util.Collections.singleton(it.next()), classDescriptor, overridingStrategy);
            }
        } else {
            java.util.LinkedList linkedList = new java.util.LinkedList(collection);
            while (!linkedList.isEmpty()) {
                createAndBindFakeOverride(extractMembersOverridableInBothWays(kotlin.reflect.jvm.internal.impl.resolve.VisibilityUtilKt.findMemberWithMaxVisibility(linkedList), linkedList, overridingStrategy), classDescriptor, overridingStrategy);
            }
        }
    }

    public static boolean isMoreSpecific(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(60);
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(61);
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = callableDescriptor.getReturnType();
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType2 = callableDescriptor2.getReturnType();
        if (!isVisibilityMoreSpecific(callableDescriptor, callableDescriptor2)) {
            return false;
        }
        if (callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) {
            return isReturnTypeMoreSpecific(callableDescriptor, returnType, callableDescriptor2, returnType2);
        }
        if (callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) {
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) callableDescriptor;
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) callableDescriptor2;
            if (!isAccessorMoreSpecific(propertyDescriptor.getSetter(), propertyDescriptor2.getSetter())) {
                return false;
            }
            if (propertyDescriptor.isVar() && propertyDescriptor2.isVar()) {
                return DEFAULT.createTypeChecker(callableDescriptor.getTypeParameters(), callableDescriptor2.getTypeParameters()).equalTypes(returnType, returnType2);
            }
            return (propertyDescriptor.isVar() || !propertyDescriptor2.isVar()) && isReturnTypeMoreSpecific(callableDescriptor, returnType, callableDescriptor2, returnType2);
        }
        throw new java.lang.IllegalArgumentException("Unexpected callable: " + callableDescriptor.getClass());
    }

    private static boolean isVisibilityMoreSpecific(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2) {
        if (declarationDescriptorWithVisibility == null) {
            $$$reportNull$$$0(62);
        }
        if (declarationDescriptorWithVisibility2 == null) {
            $$$reportNull$$$0(63);
        }
        java.lang.Integer numCompare = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.compare(declarationDescriptorWithVisibility.getVisibility(), declarationDescriptorWithVisibility2.getVisibility());
        return numCompare == null || numCompare.intValue() >= 0;
    }

    private static boolean isAccessorMoreSpecific(kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor propertyAccessorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor propertyAccessorDescriptor2) {
        if (propertyAccessorDescriptor == null || propertyAccessorDescriptor2 == null) {
            return true;
        }
        return isVisibilityMoreSpecific(propertyAccessorDescriptor, propertyAccessorDescriptor2);
    }

    private static boolean isMoreSpecificThenAllOf(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> collection) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(64);
        }
        if (collection == null) {
            $$$reportNull$$$0(65);
        }
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> it = collection.iterator();
        while (it.hasNext()) {
            if (!isMoreSpecific(callableDescriptor, it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean isReturnTypeMoreSpecific(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(66);
        }
        if (kotlinType == null) {
            $$$reportNull$$$0(67);
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(68);
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(69);
        }
        return DEFAULT.createTypeChecker(callableDescriptor.getTypeParameters(), callableDescriptor2.getTypeParameters()).isSubtypeOf(kotlinType, kotlinType2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <H> H selectMostSpecificMember(java.util.Collection<H> collection, kotlin.jvm.functions.Function1<H, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> function1) {
        if (collection == null) {
            $$$reportNull$$$0(70);
        }
        if (function1 == 0) {
            $$$reportNull$$$0(71);
        }
        if (collection.size() == 1) {
            H h = (H) kotlin.collections.CollectionsKt.first(collection);
            if (h == null) {
                $$$reportNull$$$0(72);
            }
            return h;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        java.util.List map = kotlin.collections.CollectionsKt.map(collection, function1);
        H h2 = (H) kotlin.collections.CollectionsKt.first(collection);
        kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) function1.invoke(h2);
        for (H h3 : collection) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) function1.invoke(h3);
            if (isMoreSpecificThenAllOf(callableDescriptor2, map)) {
                arrayList.add(h3);
            }
            if (isMoreSpecific(callableDescriptor2, callableDescriptor) && !isMoreSpecific(callableDescriptor, callableDescriptor2)) {
                h2 = h3;
            }
        }
        if (arrayList.isEmpty()) {
            if (h2 == null) {
                $$$reportNull$$$0(73);
            }
            return h2;
        }
        if (arrayList.size() == 1) {
            H h4 = (H) kotlin.collections.CollectionsKt.first((java.lang.Iterable) arrayList);
            if (h4 == null) {
                $$$reportNull$$$0(74);
            }
            return h4;
        }
        H h5 = null;
        for (java.lang.Object obj : arrayList) {
            if (!kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(((kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) function1.invoke(obj)).getReturnType())) {
                h5 = (H) obj;
                break;
            }
        }
        if (h5 != null) {
            if (h5 == null) {
                $$$reportNull$$$0(75);
            }
            return h5;
        }
        H h6 = (H) kotlin.collections.CollectionsKt.first((java.lang.Iterable) arrayList);
        if (h6 == null) {
            $$$reportNull$$$0(76);
        }
        return h6;
    }

    private static void createAndBindFakeOverride(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy overridingStrategy) {
        if (collection == null) {
            $$$reportNull$$$0(77);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(78);
        }
        if (overridingStrategy == null) {
            $$$reportNull$$$0(79);
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collectionFilterVisibleFakeOverrides = filterVisibleFakeOverrides(classDescriptor, collection);
        boolean zIsEmpty = collectionFilterVisibleFakeOverrides.isEmpty();
        if (!zIsEmpty) {
            collection = collectionFilterVisibleFakeOverrides;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptorCopy = ((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) selectMostSpecificMember(collection, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.5
            @Override // kotlin.jvm.functions.Function1
            public kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
                return callableMemberDescriptor;
            }
        })).copy(classDescriptor, determineModalityForFakeOverride(collection, classDescriptor), zIsEmpty ? kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.INVISIBLE_FAKE : kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.INHERITED, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE, false);
        overridingStrategy.setOverriddenDescriptors(callableMemberDescriptorCopy, collection);
        overridingStrategy.addFakeOverride(callableMemberDescriptorCopy);
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$9, reason: invalid class name */
    static /* synthetic */ class AnonymousClass9 {
        static final /* synthetic */ int[] $SwitchMap$org$jetbrains$kotlin$descriptors$Modality;
        static final /* synthetic */ int[] $SwitchMap$org$jetbrains$kotlin$resolve$ExternalOverridabilityCondition$Result;
        static final /* synthetic */ int[] $SwitchMap$org$jetbrains$kotlin$resolve$OverridingUtil$OverrideCompatibilityInfo$Result;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.descriptors.Modality.values().length];
            $SwitchMap$org$jetbrains$kotlin$descriptors$Modality = iArr;
            try {
                iArr[kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$descriptors$Modality[kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$descriptors$Modality[kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$descriptors$Modality[kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            $SwitchMap$org$jetbrains$kotlin$resolve$OverridingUtil$OverrideCompatibilityInfo$Result = iArr2;
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$resolve$OverridingUtil$OverrideCompatibilityInfo$Result[kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$resolve$OverridingUtil$OverrideCompatibilityInfo$Result[kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.INCOMPATIBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.values().length];
            $SwitchMap$org$jetbrains$kotlin$resolve$ExternalOverridabilityCondition$Result = iArr3;
            try {
                iArr3[kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$resolve$ExternalOverridabilityCondition$Result[kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.CONFLICT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$resolve$ExternalOverridabilityCondition$Result[kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$resolve$ExternalOverridabilityCondition$Result[kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
        }
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.Modality determineModalityForFakeOverride(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (collection == null) {
            $$$reportNull$$$0(80);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(81);
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor : collection) {
            int i = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.AnonymousClass9.$SwitchMap$org$jetbrains$kotlin$descriptors$Modality[callableMemberDescriptor.getModality().ordinal()];
            if (i == 1) {
                kotlin.reflect.jvm.internal.impl.descriptors.Modality modality = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
                if (modality == null) {
                    $$$reportNull$$$0(82);
                }
                return modality;
            }
            if (i == 2) {
                throw new java.lang.IllegalStateException("Member cannot have SEALED modality: " + callableMemberDescriptor);
            }
            if (i == 3) {
                z2 = true;
            } else if (i == 4) {
                z3 = true;
            }
        }
        if (classDescriptor.isExpect() && classDescriptor.getModality() != kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT && classDescriptor.getModality() != kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED) {
            z = true;
        }
        if (z2 && !z3) {
            kotlin.reflect.jvm.internal.impl.descriptors.Modality modality2 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN;
            if (modality2 == null) {
                $$$reportNull$$$0(83);
            }
            return modality2;
        }
        if (!z2 && z3) {
            kotlin.reflect.jvm.internal.impl.descriptors.Modality modality3 = z ? classDescriptor.getModality() : kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT;
            if (modality3 == null) {
                $$$reportNull$$$0(84);
            }
            return modality3;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(getOverriddenDeclarations(it.next()));
        }
        return getMinimalModality(filterOutOverridden(hashSet), z, classDescriptor.getModality());
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.Modality getMinimalModality(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection, boolean z, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality) {
        if (collection == null) {
            $$$reportNull$$$0(85);
        }
        if (modality == null) {
            $$$reportNull$$$0(86);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality2 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT;
        for (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor : collection) {
            kotlin.reflect.jvm.internal.impl.descriptors.Modality modality3 = (z && callableMemberDescriptor.getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT) ? modality : callableMemberDescriptor.getModality();
            if (modality3.compareTo(modality2) < 0) {
                modality2 = modality3;
            }
        }
        if (modality2 == null) {
            $$$reportNull$$$0(87);
        }
        return modality2;
    }

    private static java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> filterVisibleFakeOverrides(final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(88);
        }
        if (collection == null) {
            $$$reportNull$$$0(89);
        }
        java.util.List listFilter = kotlin.collections.CollectionsKt.filter(collection, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.6
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
                return java.lang.Boolean.valueOf(!kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.isPrivate(callableMemberDescriptor.getVisibility()) && kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.isVisibleIgnoringReceiver(callableMemberDescriptor, classDescriptor));
            }
        });
        if (listFilter == null) {
            $$$reportNull$$$0(90);
        }
        return listFilter;
    }

    public static <H> java.util.Collection<H> extractMembersOverridableInBothWays(H h, java.util.Collection<H> collection, kotlin.jvm.functions.Function1<H, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> function1, kotlin.jvm.functions.Function1<H, kotlin.Unit> function2) {
        if (h == null) {
            $$$reportNull$$$0(91);
        }
        if (collection == null) {
            $$$reportNull$$$0(92);
        }
        if (function1 == null) {
            $$$reportNull$$$0(93);
        }
        if (function2 == null) {
            $$$reportNull$$$0(94);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(h);
        kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptorInvoke = function1.invoke(h);
        java.util.Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptorInvoke2 = function1.invoke(next);
            if (h == next) {
                it.remove();
            } else {
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result bothWaysOverridability = getBothWaysOverridability(callableDescriptorInvoke, callableDescriptorInvoke2);
                if (bothWaysOverridability == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (bothWaysOverridability == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT) {
                    function2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result getBothWaysOverridability(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2) {
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil overridingUtil = DEFAULT;
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result result = overridingUtil.isOverridableBy(callableDescriptor2, callableDescriptor, null).getResult();
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result result2 = overridingUtil.isOverridableBy(callableDescriptor, callableDescriptor2, null).getResult();
        if (result == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && result2 == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE) {
            return kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        }
        return (result == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT || result2 == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT) ? kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT : kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.INCOMPATIBLE;
    }

    private static java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> extractMembersOverridableInBothWays(final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, java.util.Queue<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> queue, final kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy overridingStrategy) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(96);
        }
        if (queue == null) {
            $$$reportNull$$$0(97);
        }
        if (overridingStrategy == null) {
            $$$reportNull$$$0(98);
        }
        return extractMembersOverridableInBothWays(callableMemberDescriptor, queue, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.7
            @Override // kotlin.jvm.functions.Function1
            public kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2) {
                return callableMemberDescriptor2;
            }
        }, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.8
            @Override // kotlin.jvm.functions.Function1
            public kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2) {
                overridingStrategy.inheritanceConflict(callableMemberDescriptor, callableMemberDescriptor2);
                return kotlin.Unit.INSTANCE;
            }
        });
    }

    public static void resolveUnknownVisibilityForMember(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.Unit> function1) {
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility;
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(99);
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.getOverriddenDescriptors()) {
            if (callableMemberDescriptor2.getVisibility() == kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.INHERITED) {
                resolveUnknownVisibilityForMember(callableMemberDescriptor2, function1);
            }
        }
        if (callableMemberDescriptor.getVisibility() != kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.INHERITED) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibilityComputeVisibilityToInherit = computeVisibilityToInherit(callableMemberDescriptor);
        if (visibilityComputeVisibilityToInherit == null) {
            if (function1 != null) {
                function1.invoke(callableMemberDescriptor);
            }
            visibility = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PUBLIC;
        } else {
            visibility = visibilityComputeVisibilityToInherit;
        }
        if (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl) {
            ((kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl) callableMemberDescriptor).setVisibility(visibility);
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor> it = ((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) callableMemberDescriptor).getAccessors().iterator();
            while (it.hasNext()) {
                resolveUnknownVisibilityForMember(it.next(), visibilityComputeVisibilityToInherit == null ? null : function1);
            }
            return;
        }
        if (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl) {
            ((kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl) callableMemberDescriptor).setVisibility(visibility);
            return;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl propertyAccessorDescriptorImpl = (kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl) callableMemberDescriptor;
        propertyAccessorDescriptorImpl.setVisibility(visibility);
        if (visibility != propertyAccessorDescriptorImpl.getCorrespondingProperty().getVisibility()) {
            propertyAccessorDescriptorImpl.setDefault(false);
        }
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.Visibility computeVisibilityToInherit(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(100);
        }
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibilityFindMaxVisibility = findMaxVisibility(overriddenDescriptors);
        if (visibilityFindMaxVisibility == null) {
            return null;
        }
        if (callableMemberDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            for (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2 : overriddenDescriptors) {
                if (callableMemberDescriptor2.getModality() != kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT && !callableMemberDescriptor2.getVisibility().equals(visibilityFindMaxVisibility)) {
                    return null;
                }
            }
            return visibilityFindMaxVisibility;
        }
        return visibilityFindMaxVisibility.normalize();
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.Visibility findMaxVisibility(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection) {
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility;
        if (collection == null) {
            $$$reportNull$$$0(101);
        }
        if (collection.isEmpty()) {
            return kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.DEFAULT_VISIBILITY;
        }
        java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> it = collection.iterator();
        loop0: while (true) {
            visibility = null;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility2 = it.next().getVisibility();
                if (visibility != null) {
                    java.lang.Integer numCompare = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.compare(visibility2, visibility);
                    if (numCompare == null) {
                        break;
                    }
                    if (numCompare.intValue() > 0) {
                    }
                }
                visibility = visibility2;
            }
        }
        if (visibility == null) {
            return null;
        }
        java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> it2 = collection.iterator();
        while (it2.hasNext()) {
            java.lang.Integer numCompare2 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.compare(visibility, it2.next().getVisibility());
            if (numCompare2 == null || numCompare2.intValue() < 0) {
                return null;
            }
        }
        return visibility;
    }

    public static class OverrideCompatibilityInfo {
        private static final kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo SUCCESS = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo(kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE, "SUCCESS");
        private final java.lang.String debugMessage;
        private final kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result overridable;

        public enum Result {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0031  */
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 3 : 2];
            if (i == 1 || i == 2) {
                objArr[0] = "debugMessage";
            } else if (i == 3) {
                objArr[0] = com.google.firebase.analytics.FirebaseAnalytics.Param.SUCCESS;
            } else if (i != 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
            } else {
                objArr[0] = "debugMessage";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                case 5:
                    objArr[1] = "getResult";
                    break;
                case 6:
                    objArr[1] = "getDebugMessage";
                    break;
                default:
                    objArr[1] = com.google.firebase.analytics.FirebaseAnalytics.Param.SUCCESS;
                    break;
            }
            if (i == 1) {
                objArr[2] = "incompatible";
            } else if (i == 2) {
                objArr[2] = "conflict";
            } else if (i == 3 || i == 4) {
                objArr[2] = "<init>";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new java.lang.IllegalStateException(str2);
            }
            throw new java.lang.IllegalArgumentException(str2);
        }

        public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo success() {
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfo = SUCCESS;
            if (overrideCompatibilityInfo == null) {
                $$$reportNull$$$0(0);
            }
            return overrideCompatibilityInfo;
        }

        public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo incompatible(java.lang.String str) {
            if (str == null) {
                $$$reportNull$$$0(1);
            }
            return new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo(kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.INCOMPATIBLE, str);
        }

        public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo conflict(java.lang.String str) {
            if (str == null) {
                $$$reportNull$$$0(2);
            }
            return new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo(kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT, str);
        }

        public OverrideCompatibilityInfo(kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result result, java.lang.String str) {
            if (result == null) {
                $$$reportNull$$$0(3);
            }
            if (str == null) {
                $$$reportNull$$$0(4);
            }
            this.overridable = result;
            this.debugMessage = str;
        }

        public kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result getResult() {
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result result = this.overridable;
            if (result == null) {
                $$$reportNull$$$0(5);
            }
            return result;
        }
    }
}
