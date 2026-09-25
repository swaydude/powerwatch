package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX INFO: compiled from: ClassifierNamePolicy.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface ClassifierNamePolicy {
    java.lang.String renderClassifier(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer);

    /* JADX INFO: compiled from: ClassifierNamePolicy.kt */
    public static final class SHORT implements kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy {
        public static final kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SHORT INSTANCE = new kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SHORT();

        private SHORT() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public java.lang.String renderClassifier(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifier, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer renderer) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classifier, "classifier");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(renderer, "renderer");
            if (classifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
                kotlin.reflect.jvm.internal.impl.name.Name name = ((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) classifier).getName();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "classifier.name");
                return renderer.renderName(name, false);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor containingDeclaration = classifier;
            do {
                arrayList.add(containingDeclaration.getName());
                containingDeclaration = containingDeclaration.getContainingDeclaration();
            } while (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor);
            return kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.renderFqName(kotlin.collections.CollectionsKt.asReversedMutable(arrayList));
        }
    }

    /* JADX INFO: compiled from: ClassifierNamePolicy.kt */
    public static final class FULLY_QUALIFIED implements kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy {
        public static final kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.FULLY_QUALIFIED INSTANCE = new kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.FULLY_QUALIFIED();

        private FULLY_QUALIFIED() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public java.lang.String renderClassifier(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifier, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer renderer) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classifier, "classifier");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(renderer, "renderer");
            if (classifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
                kotlin.reflect.jvm.internal.impl.name.Name name = ((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) classifier).getName();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "classifier.name");
                return renderer.renderName(name, false);
            }
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqName = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(classifier);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "DescriptorUtils.getFqName(classifier)");
            return renderer.renderFqName(fqName);
        }
    }

    /* JADX INFO: compiled from: ClassifierNamePolicy.kt */
    public static final class SOURCE_CODE_QUALIFIED implements kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy {
        public static final kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED INSTANCE = new kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED();

        private SOURCE_CODE_QUALIFIED() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public java.lang.String renderClassifier(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifier, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer renderer) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classifier, "classifier");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(renderer, "renderer");
            return qualifiedNameForSourceCode(classifier);
        }

        private final java.lang.String qualifiedNameForSourceCode(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor) {
            kotlin.reflect.jvm.internal.impl.name.Name name = classifierDescriptor.getName();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "descriptor.name");
            java.lang.String strRender = kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.render(name);
            if (classifierDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
                return strRender;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = classifierDescriptor.getContainingDeclaration();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(containingDeclaration, "descriptor.containingDeclaration");
            java.lang.String strQualifierName = qualifierName(containingDeclaration);
            if (strQualifierName == null || !(!kotlin.jvm.internal.Intrinsics.areEqual(strQualifierName, ""))) {
                return strRender;
            }
            return strQualifierName + "." + strRender;
        }

        private final java.lang.String qualifierName(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
                return qualifiedNameForSourceCode((kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) declarationDescriptor);
            }
            if (!(declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor)) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe unsafe = ((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) declarationDescriptor).getFqName().toUnsafe();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(unsafe, "descriptor.fqName.toUnsafe()");
            return kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.render(unsafe);
        }
    }
}
