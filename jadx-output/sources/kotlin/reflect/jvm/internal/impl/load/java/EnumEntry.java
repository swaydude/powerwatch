package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumEntry extends kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultValue {
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumEntry(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor descriptor) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
        this.descriptor = descriptor;
    }
}
