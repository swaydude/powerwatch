package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationsKt {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations composeAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations first, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations second) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(first, "first");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(second, "second");
        if (first.isEmpty()) {
            return second;
        }
        return second.isEmpty() ? first : new kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations(first, second);
    }
}
