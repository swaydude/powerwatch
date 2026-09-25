package kotlin.reflect.jvm.internal.impl.resolve;

/* JADX INFO: loaded from: classes2.dex */
public class DescriptorFactory {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 30:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = com.google.firebase.analytics.FirebaseAnalytics.Param.SOURCE;
                break;
            case 22:
            case 24:
                objArr[0] = "enumClass";
                break;
            case 26:
            case 27:
            case 28:
                objArr[0] = "descriptor";
                break;
            case 29:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 27:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 28:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 29:
            case 30:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    private static class DefaultClassConstructorDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = com.google.firebase.analytics.FirebaseAnalytics.Param.SOURCE;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DefaultClassConstructorDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
            super(classDescriptor, null, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), true, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
            if (classDescriptor == null) {
                $$$reportNull$$$0(0);
            }
            if (sourceElement == null) {
                $$$reportNull$$$0(1);
            }
            initialize(java.util.Collections.emptyList(), kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getDefaultConstructorVisibility(classDescriptor));
        }
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl createDefaultSetter(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations2) {
        if (propertyDescriptor == null) {
            $$$reportNull$$$0(0);
        }
        if (annotations == null) {
            $$$reportNull$$$0(1);
        }
        if (annotations2 == null) {
            $$$reportNull$$$0(2);
        }
        return createSetter(propertyDescriptor, annotations, annotations2, true, false, false, propertyDescriptor.getSource());
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl createSetter(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations2, boolean z, boolean z2, boolean z3, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            $$$reportNull$$$0(3);
        }
        if (annotations == null) {
            $$$reportNull$$$0(4);
        }
        if (annotations2 == null) {
            $$$reportNull$$$0(5);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(6);
        }
        return createSetter(propertyDescriptor, annotations, annotations2, z, z2, z3, propertyDescriptor.getVisibility(), sourceElement);
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl createSetter(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations2, boolean z, boolean z2, boolean z3, kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            $$$reportNull$$$0(7);
        }
        if (annotations == null) {
            $$$reportNull$$$0(8);
        }
        if (annotations2 == null) {
            $$$reportNull$$$0(9);
        }
        if (visibility == null) {
            $$$reportNull$$$0(10);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(11);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl propertySetterDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.getModality(), visibility, z, z2, z3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, null, sourceElement);
        propertySetterDescriptorImpl.initialize(kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl.createSetterParameter(propertySetterDescriptorImpl, propertyDescriptor.getType(), annotations2));
        return propertySetterDescriptorImpl;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl createDefaultGetter(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        if (propertyDescriptor == null) {
            $$$reportNull$$$0(13);
        }
        if (annotations == null) {
            $$$reportNull$$$0(14);
        }
        return createGetter(propertyDescriptor, annotations, true, false, false);
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl createGetter(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, boolean z, boolean z2, boolean z3) {
        if (propertyDescriptor == null) {
            $$$reportNull$$$0(15);
        }
        if (annotations == null) {
            $$$reportNull$$$0(16);
        }
        return createGetter(propertyDescriptor, annotations, z, z2, z3, propertyDescriptor.getSource());
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl createGetter(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, boolean z, boolean z2, boolean z3, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            $$$reportNull$$$0(17);
        }
        if (annotations == null) {
            $$$reportNull$$$0(18);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(19);
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.getModality(), propertyDescriptor.getVisibility(), z, z2, z3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, null, sourceElement);
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl createPrimaryConstructorForObject(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(20);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(21);
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.DefaultClassConstructorDescriptor(classDescriptor, sourceElement);
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor createEnumValuesMethod(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(22);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplInitialize = kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl.create(classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.ENUM_VALUES, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED, classDescriptor.getSource()).initialize((kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) null, (kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) null, java.util.Collections.emptyList(), java.util.Collections.emptyList(), (kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(classDescriptor).getArrayType(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, classDescriptor.getDefaultType()), kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL, kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PUBLIC);
        if (simpleFunctionDescriptorImplInitialize == null) {
            $$$reportNull$$$0(23);
        }
        return simpleFunctionDescriptorImplInitialize;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor createEnumValueOfMethod(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(24);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplCreate = kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl.create(classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.ENUM_VALUE_OF, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED, classDescriptor.getSource());
        kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplInitialize = simpleFunctionDescriptorImplCreate.initialize((kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) null, (kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) null, java.util.Collections.emptyList(), java.util.Collections.singletonList(new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl(simpleFunctionDescriptorImplCreate, null, 0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), kotlin.reflect.jvm.internal.impl.name.Name.identifier("value"), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(classDescriptor).getStringType(), false, false, false, null, classDescriptor.getSource())), (kotlin.reflect.jvm.internal.impl.types.KotlinType) classDescriptor.getDefaultType(), kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL, kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PUBLIC);
        if (simpleFunctionDescriptorImplInitialize == null) {
            $$$reportNull$$$0(25);
        }
        return simpleFunctionDescriptorImplInitialize;
    }

    public static boolean isEnumValuesMethod(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        if (functionDescriptor == null) {
            $$$reportNull$$$0(26);
        }
        return functionDescriptor.getName().equals(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.ENUM_VALUES) && isEnumSpecialMethod(functionDescriptor);
    }

    public static boolean isEnumValueOfMethod(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        if (functionDescriptor == null) {
            $$$reportNull$$$0(27);
        }
        return functionDescriptor.getName().equals(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.ENUM_VALUE_OF) && isEnumSpecialMethod(functionDescriptor);
    }

    private static boolean isEnumSpecialMethod(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        if (functionDescriptor == null) {
            $$$reportNull$$$0(28);
        }
        return functionDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED && kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isEnumClass(functionDescriptor.getContainingDeclaration());
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor createExtensionReceiverParameterForCallable(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(29);
        }
        if (annotations == null) {
            $$$reportNull$$$0(30);
        }
        if (kotlinType == null) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl(callableDescriptor, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver(callableDescriptor, kotlinType, null), annotations);
    }
}
