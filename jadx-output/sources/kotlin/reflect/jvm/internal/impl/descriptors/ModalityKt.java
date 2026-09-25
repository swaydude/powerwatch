package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: Modality.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ModalityKt {
    public static final boolean isFinalClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor isFinalClass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isFinalClass, "$this$isFinalClass");
        return isFinalClass.getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL && isFinalClass.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS;
    }
}
