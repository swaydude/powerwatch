package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: loaded from: classes2.dex */
public class DescriptorSubstitutor {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i == 4) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    public static kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor substituteTypeParameters(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2) {
        if (list == null) {
            $$$reportNull$$$0(0);
        }
        if (typeSubstitution == null) {
            $$$reportNull$$$0(1);
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(2);
        }
        if (list2 == null) {
            $$$reportNull$$$0(3);
        }
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutorSubstituteTypeParameters = substituteTypeParameters(list, typeSubstitution, declarationDescriptor, list2, null);
        if (typeSubstitutorSubstituteTypeParameters == null) {
            throw new java.lang.AssertionError("Substitution failed");
        }
        if (typeSubstitutorSubstituteTypeParameters == null) {
            $$$reportNull$$$0(4);
        }
        return typeSubstitutorSubstituteTypeParameters;
    }

    public static kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor substituteTypeParameters(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2, boolean[] zArr) {
        if (list == null) {
            $$$reportNull$$$0(5);
        }
        if (typeSubstitution == null) {
            $$$reportNull$$$0(6);
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(7);
        }
        if (list2 == null) {
            $$$reportNull$$$0(8);
        }
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        int i = 0;
        for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor : list) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl typeParameterDescriptorImplCreateForFurtherModification = kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl.createForFurtherModification(declarationDescriptor, typeParameterDescriptor.getAnnotations(), typeParameterDescriptor.isReified(), typeParameterDescriptor.getVariance(), typeParameterDescriptor.getName(), i, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
            map.put(typeParameterDescriptor.getTypeConstructor(), new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(typeParameterDescriptorImplCreateForFurtherModification.getDefaultType()));
            map2.put(typeParameterDescriptor, typeParameterDescriptorImplCreateForFurtherModification);
            list2.add(typeParameterDescriptorImplCreateForFurtherModification);
            i++;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutorCreateChainedSubstitutor = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.createChainedSubstitutor(typeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.createByConstructorsMap(map));
        for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor2 : list) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl typeParameterDescriptorImpl = (kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl) map2.get(typeParameterDescriptor2);
            for (kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType : typeParameterDescriptor2.getUpperBounds()) {
                kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeSubstitute = typeSubstitutorCreateChainedSubstitutor.substitute(kotlinType, kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE);
                if (kotlinTypeSubstitute == null) {
                    return null;
                }
                if (kotlinTypeSubstitute != kotlinType && zArr != null) {
                    zArr[0] = true;
                }
                typeParameterDescriptorImpl.addUpperBound(kotlinTypeSubstitute);
            }
            typeParameterDescriptorImpl.setInitialized();
        }
        return typeSubstitutorCreateChainedSubstitutor;
    }
}
