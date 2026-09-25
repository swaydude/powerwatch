package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

/* JADX INFO: compiled from: BuiltInsResourceLoader.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BuiltInsResourceLoader {
    public final java.io.InputStream loadResource(java.lang.String path) {
        java.io.InputStream resourceAsStream;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(path, "path");
        java.lang.ClassLoader classLoader = getClass().getClassLoader();
        return (classLoader == null || (resourceAsStream = classLoader.getResourceAsStream(path)) == null) ? java.lang.ClassLoader.getSystemResourceAsStream(path) : resourceAsStream;
    }
}
