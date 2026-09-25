package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface Annotations extends java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion Companion = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.$$INSTANCE;

    /* JADX INFO: renamed from: findAnnotation */
    kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor mo1263findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName);

    boolean hasAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName);

    boolean isEmpty();

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class DefaultImpls {
        public static kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor findAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor next;
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> it = annotations.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(next.getFqName(), fqName)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        public static boolean hasAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
            return annotations.mo1263findAnnotation(fqName) != null;
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class Companion {
        static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion $$INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion();
        private static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations EMPTY = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1
            public java.lang.Void findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            public boolean isEmpty() {
                return true;
            }

            public java.lang.String toString() {
                return "EMPTY";
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            /* JADX INFO: renamed from: findAnnotation, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor mo1263findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
                return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor) findAnnotation(fqName);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            public boolean hasAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
                return kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.DefaultImpls.hasAnnotation(this, fqName);
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> iterator() {
                return kotlin.collections.CollectionsKt.emptyList().iterator();
            }
        };

        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getEMPTY() {
            return EMPTY;
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations create(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> annotations) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "annotations");
            return annotations.isEmpty() ? EMPTY : new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsImpl(annotations);
        }
    }
}
