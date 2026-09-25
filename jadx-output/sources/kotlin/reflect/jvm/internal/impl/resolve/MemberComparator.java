package kotlin.reflect.jvm.internal.impl.resolve;

/* JADX INFO: loaded from: classes2.dex */
public class MemberComparator implements java.util.Comparator<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final kotlin.reflect.jvm.internal.impl.resolve.MemberComparator INSTANCE = new kotlin.reflect.jvm.internal.impl.resolve.MemberComparator();
    private static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer RENDERER = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.Companion.withOptions(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.MemberComparator.1
        @Override // kotlin.jvm.functions.Function1
        public kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
            descriptorRendererOptions.setWithDefinedIn(false);
            descriptorRendererOptions.setVerbose(true);
            descriptorRendererOptions.setAnnotationArgumentsRenderingPolicy(kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY);
            descriptorRendererOptions.setModifiers(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ALL);
            return kotlin.Unit.INSTANCE;
        }
    });

    private MemberComparator() {
    }

    public static class NameAndTypeMemberComparator implements java.util.Comparator<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> {
        public static final kotlin.reflect.jvm.internal.impl.resolve.MemberComparator.NameAndTypeMemberComparator INSTANCE = new kotlin.reflect.jvm.internal.impl.resolve.MemberComparator.NameAndTypeMemberComparator();

        private NameAndTypeMemberComparator() {
        }

        private static int getDeclarationPriority(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
            if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isEnumEntry(declarationDescriptor)) {
                return 8;
            }
            if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) {
                return 7;
            }
            if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) {
                return ((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) declarationDescriptor).getExtensionReceiverParameter() == null ? 6 : 5;
            }
            if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) {
                return ((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) declarationDescriptor).getExtensionReceiverParameter() == null ? 4 : 3;
            }
            if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
                return 2;
            }
            return declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor ? 1 : 0;
        }

        @Override // java.util.Comparator
        public int compare(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2) {
            java.lang.Integer numCompareInternal = compareInternal(declarationDescriptor, declarationDescriptor2);
            if (numCompareInternal != null) {
                return numCompareInternal.intValue();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static java.lang.Integer compareInternal(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2) {
            int declarationPriority = getDeclarationPriority(declarationDescriptor2) - getDeclarationPriority(declarationDescriptor);
            if (declarationPriority != 0) {
                return java.lang.Integer.valueOf(declarationPriority);
            }
            if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isEnumEntry(declarationDescriptor) && kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isEnumEntry(declarationDescriptor2)) {
                return 0;
            }
            int iCompareTo = declarationDescriptor.getName().compareTo(declarationDescriptor2.getName());
            if (iCompareTo != 0) {
                return java.lang.Integer.valueOf(iCompareTo);
            }
            return null;
        }
    }

    @Override // java.util.Comparator
    public int compare(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2) {
        int iOrdinal;
        java.lang.Integer numCompareInternal = kotlin.reflect.jvm.internal.impl.resolve.MemberComparator.NameAndTypeMemberComparator.compareInternal(declarationDescriptor, declarationDescriptor2);
        if (numCompareInternal != null) {
            return numCompareInternal.intValue();
        }
        if ((declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) && (declarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor)) {
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer = RENDERER;
            int iCompareTo = descriptorRenderer.renderType(((kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) declarationDescriptor).getUnderlyingType()).compareTo(descriptorRenderer.renderType(((kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) declarationDescriptor2).getUnderlyingType()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        } else if ((declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) && (declarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor)) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) declarationDescriptor;
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) declarationDescriptor2;
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter2 = callableDescriptor2.getExtensionReceiverParameter();
            if (extensionReceiverParameter != null) {
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer2 = RENDERER;
                int iCompareTo2 = descriptorRenderer2.renderType(extensionReceiverParameter.getType()).compareTo(descriptorRenderer2.renderType(extensionReceiverParameter2.getType()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
            }
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = callableDescriptor.getValueParameters();
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters2 = callableDescriptor2.getValueParameters();
            for (int i = 0; i < java.lang.Math.min(valueParameters.size(), valueParameters2.size()); i++) {
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer3 = RENDERER;
                int iCompareTo3 = descriptorRenderer3.renderType(valueParameters.get(i).getType()).compareTo(descriptorRenderer3.renderType(valueParameters2.get(i).getType()));
                if (iCompareTo3 != 0) {
                    return iCompareTo3;
                }
            }
            int size = valueParameters.size() - valueParameters2.size();
            if (size != 0) {
                return size;
            }
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = callableDescriptor.getTypeParameters();
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters2 = callableDescriptor2.getTypeParameters();
            for (int i2 = 0; i2 < java.lang.Math.min(typeParameters.size(), typeParameters2.size()); i2++) {
                java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds = typeParameters.get(i2).getUpperBounds();
                java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds2 = typeParameters2.get(i2).getUpperBounds();
                int size2 = upperBounds.size() - upperBounds2.size();
                if (size2 != 0) {
                    return size2;
                }
                for (int i3 = 0; i3 < upperBounds.size(); i3++) {
                    kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer4 = RENDERER;
                    int iCompareTo4 = descriptorRenderer4.renderType(upperBounds.get(i3)).compareTo(descriptorRenderer4.renderType(upperBounds2.get(i3)));
                    if (iCompareTo4 != 0) {
                        return iCompareTo4;
                    }
                }
            }
            int size3 = typeParameters.size() - typeParameters2.size();
            if (size3 != 0) {
                return size3;
            }
            if ((callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) && (callableDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) && (iOrdinal = ((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) callableDescriptor).getKind().ordinal() - ((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) callableDescriptor2).getKind().ordinal()) != 0) {
                return iOrdinal;
            }
        } else if ((declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && (declarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor;
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor2;
            if (classDescriptor.getKind().ordinal() != classDescriptor2.getKind().ordinal()) {
                return classDescriptor.getKind().ordinal() - classDescriptor2.getKind().ordinal();
            }
            if (classDescriptor.isCompanionObject() != classDescriptor2.isCompanionObject()) {
                return classDescriptor.isCompanionObject() ? 1 : -1;
            }
        } else {
            throw new java.lang.AssertionError(java.lang.String.format("Unsupported pair of descriptors:\n'%s' Class: %s\n%s' Class: %s", declarationDescriptor, declarationDescriptor.getClass(), declarationDescriptor2, declarationDescriptor2.getClass()));
        }
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer5 = RENDERER;
        int iCompareTo5 = descriptorRenderer5.render(declarationDescriptor).compareTo(descriptorRenderer5.render(declarationDescriptor2));
        return iCompareTo5 != 0 ? iCompareTo5 : kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingModule(declarationDescriptor).getName().compareTo(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingModule(declarationDescriptor2).getName());
    }
}
