package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CompositeAnnotations implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations {
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations> delegates;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeAnnotations(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations> delegates) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(delegates, "delegates");
        this.delegates = delegates;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations... delegates) {
        this((java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations>) kotlin.collections.ArraysKt.toList(delegates));
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(delegates, "delegates");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations> list = this.delegates;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        java.util.Iterator it = kotlin.collections.CollectionsKt.asSequence(this.delegates).iterator();
        while (it.hasNext()) {
            if (((kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations) it.next()).hasAnnotation(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: findAnnotation */
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor mo1263findAnnotation(final kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor) kotlin.sequences.SequencesKt.firstOrNull(kotlin.sequences.SequencesKt.mapNotNull(kotlin.collections.CollectionsKt.asSequence(this.delegates), new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations.findAnnotation.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor invoke(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it.mo1263findAnnotation(fqName);
            }
        }));
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> iterator() {
        return kotlin.sequences.SequencesKt.flatMap(kotlin.collections.CollectionsKt.asSequence(this.delegates), new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations, kotlin.sequences.Sequence<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations.iterator.1
            @Override // kotlin.jvm.functions.Function1
            public final kotlin.sequences.Sequence<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> invoke(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return kotlin.collections.CollectionsKt.asSequence(it);
            }
        }).iterator();
    }
}
