package kotlin.reflect.jvm.internal.impl.name;

/* JADX INFO: compiled from: NameUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NameUtils {
    public static final kotlin.reflect.jvm.internal.impl.name.NameUtils INSTANCE = new kotlin.reflect.jvm.internal.impl.name.NameUtils();
    private static final kotlin.text.Regex SANITIZE_AS_JAVA_INVALID_CHARACTERS = new kotlin.text.Regex("[^\\p{L}\\p{Digit}]");

    private NameUtils() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String sanitizeAsJavaIdentifier(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        return SANITIZE_AS_JAVA_INVALID_CHARACTERS.replace(name, io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR);
    }
}
