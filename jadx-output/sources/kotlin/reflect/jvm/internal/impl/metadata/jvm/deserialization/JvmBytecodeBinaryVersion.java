package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* JADX INFO: compiled from: JvmBytecodeBinaryVersion.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmBytecodeBinaryVersion extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion {
    public static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmBytecodeBinaryVersion.Companion Companion = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmBytecodeBinaryVersion.Companion(null);
    public static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmBytecodeBinaryVersion INSTANCE = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmBytecodeBinaryVersion(1, 0, 3);
    public static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmBytecodeBinaryVersion INVALID_VERSION = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmBytecodeBinaryVersion(new int[0]);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBytecodeBinaryVersion(int... numbers) {
        super(java.util.Arrays.copyOf(numbers, numbers.length));
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(numbers, "numbers");
    }

    /* JADX INFO: compiled from: JvmBytecodeBinaryVersion.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
