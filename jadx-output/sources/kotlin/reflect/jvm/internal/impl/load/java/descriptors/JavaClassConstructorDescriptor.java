package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

/* JADX INFO: loaded from: classes2.dex */
public class JavaClassConstructorDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private java.lang.Boolean hasStableParameterNames;
    private java.lang.Boolean hasSynthesizedParameterNames;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = com.google.firebase.analytics.FirebaseAnalytics.Param.SOURCE;
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor enhance(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List list, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.Pair pair) {
        return enhance(kotlinType, (java.util.List<kotlin.reflect.jvm.internal.impl.load.java.descriptors.ValueParameterData>) list, kotlinType2, (kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, ?>) pair);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected JavaClassConstructorDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor javaClassConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, boolean z, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        super(classDescriptor, javaClassConstructorDescriptor, annotations, z, kind, sourceElement);
        if (classDescriptor == null) {
            $$$reportNull$$$0(0);
        }
        if (annotations == null) {
            $$$reportNull$$$0(1);
        }
        if (kind == null) {
            $$$reportNull$$$0(2);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(3);
        }
        this.hasStableParameterNames = null;
        this.hasSynthesizedParameterNames = null;
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor createJavaConstructor(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, boolean z, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(4);
        }
        if (annotations == null) {
            $$$reportNull$$$0(5);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(6);
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor(classDescriptor, null, annotations, z, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public boolean hasStableParameterNames() {
        return this.hasStableParameterNames.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public void setHasStableParameterNames(boolean z) {
        this.hasStableParameterNames = java.lang.Boolean.valueOf(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return this.hasSynthesizedParameterNames.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public void setHasSynthesizedParameterNames(boolean z) {
        this.hasSynthesizedParameterNames = java.lang.Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor createSubstitutedCopy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(7);
        }
        if (kind == null) {
            $$$reportNull$$$0(8);
        }
        if (annotations == null) {
            $$$reportNull$$$0(9);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(10);
        }
        if (kind != kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION && kind != kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED) {
            throw new java.lang.IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + declarationDescriptor + "\nkind: " + kind);
        }
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateDescriptor = createDescriptor((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor, (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor) functionDescriptor, kind, sourceElement, annotations);
        javaClassConstructorDescriptorCreateDescriptor.setHasStableParameterNames(hasStableParameterNames());
        javaClassConstructorDescriptorCreateDescriptor.setHasSynthesizedParameterNames(hasSynthesizedParameterNames());
        if (javaClassConstructorDescriptorCreateDescriptor == null) {
            $$$reportNull$$$0(11);
        }
        return javaClassConstructorDescriptorCreateDescriptor;
    }

    protected kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor createDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor javaClassConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(12);
        }
        if (kind == null) {
            $$$reportNull$$$0(13);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(14);
        }
        if (annotations == null) {
            $$$reportNull$$$0(15);
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor(classDescriptor, javaClassConstructorDescriptor, annotations, this.isPrimary, kind, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor enhance(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List<kotlin.reflect.jvm.internal.impl.load.java.descriptors.ValueParameterData> list, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, ?> pair) {
        if (list == null) {
            $$$reportNull$$$0(16);
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(17);
        }
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateSubstitutedCopy = createSubstitutedCopy((kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) getContainingDeclaration(), (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) null, getKind(), (kotlin.reflect.jvm.internal.impl.name.Name) null, getAnnotations(), getSource());
        javaClassConstructorDescriptorCreateSubstitutedCopy.initialize(kotlinType == null ? null : kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createExtensionReceiverParameterForCallable(javaClassConstructorDescriptorCreateSubstitutedCopy, kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY()), getDispatchReceiverParameter(), getTypeParameters(), kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt.copyValueParameters(list, getValueParameters(), javaClassConstructorDescriptorCreateSubstitutedCopy), kotlinType2, getModality(), getVisibility());
        if (pair != null) {
            javaClassConstructorDescriptorCreateSubstitutedCopy.putInUserDataMap(pair.getFirst(), pair.getSecond());
        }
        if (javaClassConstructorDescriptorCreateSubstitutedCopy == null) {
            $$$reportNull$$$0(18);
        }
        return javaClassConstructorDescriptorCreateSubstitutedCopy;
    }
}
