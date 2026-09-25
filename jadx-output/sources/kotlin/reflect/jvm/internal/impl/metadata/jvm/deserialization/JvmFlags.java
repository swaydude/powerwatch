package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* JADX INFO: compiled from: JvmFlags.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmFlags {
    public static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmFlags INSTANCE = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmFlags();
    private static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_MOVED_FROM_INTERFACE_COMPANION = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanFirst();

    private JvmFlags() {
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField getIS_MOVED_FROM_INTERFACE_COMPANION() {
        return IS_MOVED_FROM_INTERFACE_COMPANION;
    }
}
