package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractClassTypeConstructor extends kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor implements kotlin.reflect.jvm.internal.impl.types.TypeConstructor {
    private int hashCode;

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i == 2) {
            objArr[0] = "descriptor";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i == 3 || i == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i != 1) {
            if (i == 2) {
                objArr[2] = "hasMeaningfulFqName";
            } else if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 1 && i != 3 && i != 4) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo1268getDeclarationDescriptor();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClassTypeConstructor(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
        super(storageManager);
        if (storageManager == null) {
            $$$reportNull$$$0(0);
        }
        this.hashCode = 0;
    }

    public final int hashCode() {
        int iIdentityHashCode;
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorMo1268getDeclarationDescriptor = mo1268getDeclarationDescriptor();
        if (hasMeaningfulFqName(classDescriptorMo1268getDeclarationDescriptor)) {
            iIdentityHashCode = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(classDescriptorMo1268getDeclarationDescriptor).hashCode();
        } else {
            iIdentityHashCode = java.lang.System.identityHashCode(this);
        }
        this.hashCode = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(mo1268getDeclarationDescriptor());
        if (builtIns == null) {
            $$$reportNull$$$0(1);
        }
        return builtIns;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) || obj.hashCode() != hashCode()) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = (kotlin.reflect.jvm.internal.impl.types.TypeConstructor) obj;
        if (typeConstructor.getParameters().size() != getParameters().size()) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorMo1268getDeclarationDescriptor = mo1268getDeclarationDescriptor();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = typeConstructor.mo1268getDeclarationDescriptor();
        if (hasMeaningfulFqName(classDescriptorMo1268getDeclarationDescriptor) && ((classifierDescriptorMo1268getDeclarationDescriptor == null || hasMeaningfulFqName(classifierDescriptorMo1268getDeclarationDescriptor)) && (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor))) {
            return areFqNamesEqual(classDescriptorMo1268getDeclarationDescriptor, (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor);
        }
        return false;
    }

    private static boolean areFqNamesEqual(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2) {
        if (!classDescriptor.getName().equals(classDescriptor2.getName())) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
        for (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = classDescriptor2.getContainingDeclaration(); containingDeclaration != null && containingDeclaration2 != null; containingDeclaration2 = containingDeclaration2.getContainingDeclaration()) {
            if (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor) {
                return containingDeclaration2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
            }
            if (containingDeclaration2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor) {
                return false;
            }
            if (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) {
                return (containingDeclaration2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) && ((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) containingDeclaration).getFqName().equals(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) containingDeclaration2).getFqName());
            }
            if ((containingDeclaration2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) || !containingDeclaration.getName().equals(containingDeclaration2.getName())) {
                return false;
            }
            containingDeclaration = containingDeclaration.getContainingDeclaration();
        }
        return true;
    }

    private static boolean hasMeaningfulFqName(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor) {
        if (classifierDescriptor == null) {
            $$$reportNull$$$0(2);
        }
        return (kotlin.reflect.jvm.internal.impl.types.ErrorUtils.isError(classifierDescriptor) || kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isLocal(classifierDescriptor)) ? false : true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    protected java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getAdditionalNeighboursInSupertypeGraph(boolean z) {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = mo1268getDeclarationDescriptor().getContainingDeclaration();
        if (!(containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            java.util.List listEmptyList = java.util.Collections.emptyList();
            if (listEmptyList == null) {
                $$$reportNull$$$0(3);
            }
            return listEmptyList;
        }
        kotlin.reflect.jvm.internal.impl.utils.SmartList smartList = new kotlin.reflect.jvm.internal.impl.utils.SmartList();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration;
        smartList.add(classDescriptor.getDefaultType());
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorMo1261getCompanionObjectDescriptor = classDescriptor.mo1261getCompanionObjectDescriptor();
        if (z && classDescriptorMo1261getCompanionObjectDescriptor != null) {
            smartList.add(classDescriptorMo1261getCompanionObjectDescriptor.getDefaultType());
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    protected kotlin.reflect.jvm.internal.impl.types.KotlinType defaultSupertypeIfEmpty() {
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isSpecialClassWithNoSupertypes(mo1268getDeclarationDescriptor())) {
            return null;
        }
        return getBuiltIns().getAnyType();
    }
}
