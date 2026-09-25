package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* JADX INFO: compiled from: AnnotationDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface AnnotationDescriptor {
    java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> getAllValueArguments();

    kotlin.reflect.jvm.internal.impl.name.FqName getFqName();

    kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource();

    kotlin.reflect.jvm.internal.impl.types.KotlinType getType();

    /* JADX INFO: compiled from: AnnotationDescriptor.kt */
    public static final class DefaultImpls {
        public static kotlin.reflect.jvm.internal.impl.name.FqName getFqName(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor annotationClass = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
            if (annotationClass == null) {
                return null;
            }
            if (kotlin.reflect.jvm.internal.impl.types.ErrorUtils.isError(annotationClass)) {
                annotationClass = null;
            }
            if (annotationClass != null) {
                return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.fqNameOrNull(annotationClass);
            }
            return null;
        }
    }
}
