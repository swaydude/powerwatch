package kotlin.reflect.jvm;

/* JADX INFO: compiled from: KTypesJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001c\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\"\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\b¨\u0006\t"}, d2 = {"jvmErasure", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/KClassifier;", "getJvmErasure", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KClass;", "Lkotlin/reflect/KType;", "jvmErasure$annotations", "(Lkotlin/reflect/KType;)V", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "kotlin-reflection"}, k = 2, mv = {1, 1, 15})
public final class KTypesJvm {
    public static /* synthetic */ void jvmErasure$annotations(kotlin.reflect.KType kType) {
    }

    public static final kotlin.reflect.KClass<?> getJvmErasure(kotlin.reflect.KType jvmErasure) {
        kotlin.reflect.KClass<?> jvmErasure2;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jvmErasure, "$this$jvmErasure");
        kotlin.reflect.KClassifier classifier = jvmErasure.getClassifier();
        if (classifier != null && (jvmErasure2 = getJvmErasure(classifier)) != null) {
            return jvmErasure2;
        }
        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + jvmErasure);
    }

    public static final kotlin.reflect.KClass<?> getJvmErasure(kotlin.reflect.KClassifier jvmErasure) {
        java.lang.Object obj;
        kotlin.reflect.KClass<?> jvmErasure2;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jvmErasure, "$this$jvmErasure");
        if (jvmErasure instanceof kotlin.reflect.KClass) {
            return (kotlin.reflect.KClass) jvmErasure;
        }
        if (jvmErasure instanceof kotlin.reflect.KTypeParameter) {
            java.util.List<kotlin.reflect.KType> upperBounds = ((kotlin.reflect.KTypeParameter) jvmErasure).getUpperBounds();
            java.util.Iterator<T> it = upperBounds.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                kotlin.reflect.KType kType = (kotlin.reflect.KType) next;
                if (kType != null) {
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.KTypeImpl) kType).getType().getConstructor().mo1268getDeclarationDescriptor();
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? classifierDescriptorMo1268getDeclarationDescriptor : null);
                    if ((classDescriptor == null || classDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE || classDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS) ? false : true) {
                        obj = next;
                        break;
                    }
                } else {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                }
            }
            kotlin.reflect.KType kType2 = (kotlin.reflect.KType) obj;
            if (kType2 == null) {
                kType2 = (kotlin.reflect.KType) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) upperBounds);
            }
            return (kType2 == null || (jvmErasure2 = getJvmErasure(kType2)) == null) ? kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class) : jvmErasure2;
        }
        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + jvmErasure);
    }
}
