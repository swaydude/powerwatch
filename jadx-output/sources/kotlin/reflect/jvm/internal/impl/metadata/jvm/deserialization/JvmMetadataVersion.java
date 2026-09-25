package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* JADX INFO: compiled from: JvmMetadataVersion.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmMetadataVersion extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion {
    public static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion.Companion Companion = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion.Companion(null);
    public static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion INSTANCE = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion(1, 1, 15);
    public static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion INVALID_VERSION = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion(new int[0]);
    private final boolean isStrictSemantics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmMetadataVersion(int[] versionArray, boolean z) {
        super(java.util.Arrays.copyOf(versionArray, versionArray.length));
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(versionArray, "versionArray");
        this.isStrictSemantics = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JvmMetadataVersion(int... numbers) {
        this(numbers, false);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(numbers, "numbers");
    }

    public boolean isCompatible() {
        boolean zIsCompatibleTo;
        if (getMajor() == 1 && getMinor() == 0) {
            return false;
        }
        if (this.isStrictSemantics) {
            zIsCompatibleTo = isCompatibleTo(INSTANCE);
        } else {
            zIsCompatibleTo = getMajor() == 1 && getMinor() <= 4;
        }
        return zIsCompatibleTo;
    }

    /* JADX INFO: compiled from: JvmMetadataVersion.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
