package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmAbi {
    public static final kotlin.reflect.jvm.internal.impl.name.FqName JVM_FIELD_ANNOTATION_FQ_NAME = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.JvmField");
    public static final kotlin.reflect.jvm.internal.impl.name.ClassId REFLECTION_FACTORY_IMPL = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 1 || i == 3 || i == 7 || i == 9) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 3 || i == 7 || i == 9) ? 2 : 3];
        switch (i) {
            case 1:
            case 3:
            case 7:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JvmAbi";
                break;
            case 2:
                objArr[0] = "typeAliasName";
                break;
            case 4:
            case 5:
                objArr[0] = com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 6:
            case 8:
            default:
                objArr[0] = "propertyName";
                break;
            case 10:
                objArr[0] = "propertyDescriptor";
                break;
            case 11:
            case 12:
                objArr[0] = "companionObject";
                break;
            case 13:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i == 1) {
            objArr[1] = "getSyntheticMethodNameForAnnotatedProperty";
        } else if (i == 3) {
            objArr[1] = "getSyntheticMethodNameForAnnotatedTypeAlias";
        } else if (i == 7) {
            objArr[1] = "getterName";
        } else if (i != 9) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JvmAbi";
        } else {
            objArr[1] = "setterName";
        }
        switch (i) {
            case 1:
            case 3:
            case 7:
            case 9:
                break;
            case 2:
                objArr[2] = "getSyntheticMethodNameForAnnotatedTypeAlias";
                break;
            case 4:
                objArr[2] = "isGetterName";
                break;
            case 5:
                objArr[2] = "isSetterName";
                break;
            case 6:
                objArr[2] = "getterName";
                break;
            case 8:
                objArr[2] = "setterName";
                break;
            case 10:
                objArr[2] = "isPropertyWithBackingFieldInOuterClass";
                break;
            case 11:
                objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
                break;
            case 12:
                objArr[2] = "isMappedIntrinsicCompanionObject";
                break;
            case 13:
                objArr[2] = "hasJvmFieldAnnotation";
                break;
            default:
                objArr[2] = "getSyntheticMethodNameForAnnotatedProperty";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 1 && i != 3 && i != 7 && i != 9) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static boolean isGetterName(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(4);
        }
        return str.startsWith("get") || str.startsWith("is");
    }

    public static boolean isSetterName(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(5);
        }
        return str.startsWith("set");
    }

    public static java.lang.String getterName(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(6);
        }
        if (!startsWithIsPrefix(str)) {
            str = "get" + kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str);
        }
        if (str == null) {
            $$$reportNull$$$0(7);
        }
        return str;
    }

    public static java.lang.String setterName(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(8);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("set");
        sb.append(startsWithIsPrefix(str) ? str.substring(2) : kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str));
        java.lang.String string = sb.toString();
        if (string == null) {
            $$$reportNull$$$0(9);
        }
        return string;
    }

    public static boolean startsWithIsPrefix(java.lang.String str) {
        if (!str.startsWith("is") || str.length() == 2) {
            return false;
        }
        char cCharAt = str.charAt(2);
        return 'a' > cCharAt || cCharAt > 'z';
    }

    public static boolean isPropertyWithBackingFieldInOuterClass(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor == null) {
            $$$reportNull$$$0(10);
        }
        if (propertyDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return false;
        }
        if (isClassCompanionObjectWithBackingFieldsInOuter(propertyDescriptor.getContainingDeclaration())) {
            return true;
        }
        return kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isCompanionObject(propertyDescriptor.getContainingDeclaration()) && hasJvmFieldAnnotation(propertyDescriptor);
    }

    public static boolean isClassCompanionObjectWithBackingFieldsInOuter(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(11);
        }
        return kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isCompanionObject(declarationDescriptor) && kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isClassOrEnumClass(declarationDescriptor.getContainingDeclaration()) && !isMappedIntrinsicCompanionObject((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor);
    }

    public static boolean isMappedIntrinsicCompanionObject(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(12);
        }
        return kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping.INSTANCE.isMappedIntrinsicCompanionObject(classDescriptor);
    }

    public static boolean hasJvmFieldAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor backingField;
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(13);
        }
        if ((callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) && (backingField = ((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) callableMemberDescriptor).getBackingField()) != null && backingField.getAnnotations().hasAnnotation(JVM_FIELD_ANNOTATION_FQ_NAME)) {
            return true;
        }
        return callableMemberDescriptor.getAnnotations().hasAnnotation(JVM_FIELD_ANNOTATION_FQ_NAME);
    }
}
