package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: KotlinTypeFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
final class AnnotatedSimpleType extends kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleTypeImpl {
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations;

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        return this.annotations;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotatedSimpleType(kotlin.reflect.jvm.internal.impl.types.SimpleType delegate, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        super(delegate);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(delegate, "delegate");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        this.annotations = annotations;
    }
}
