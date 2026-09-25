package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* JADX INFO: compiled from: FieldDescriptorImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FieldDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl implements kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor {
    private final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor correspondingProperty;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor correspondingProperty) {
        super(annotations);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(correspondingProperty, "correspondingProperty");
        this.correspondingProperty = correspondingProperty;
    }
}
