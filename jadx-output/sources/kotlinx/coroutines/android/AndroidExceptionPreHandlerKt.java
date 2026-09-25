package kotlinx.coroutines.android;

/* JADX INFO: compiled from: AndroidExceptionPreHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0002"}, d2 = {"getter", "Ljava/lang/reflect/Method;", "kotlinx-coroutines-android"}, k = 2, mv = {1, 1, 13})
public final class AndroidExceptionPreHandlerKt {
    private static final java.lang.reflect.Method getter;

    static {
        java.lang.reflect.Method method = null;
        try {
            boolean z = false;
            java.lang.reflect.Method it = java.lang.Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new java.lang.Class[0]);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
            if (java.lang.reflect.Modifier.isPublic(it.getModifiers()) && java.lang.reflect.Modifier.isStatic(it.getModifiers())) {
                z = true;
            }
            if (z) {
                method = it;
            }
        } catch (java.lang.Throwable unused) {
        }
        getter = method;
    }
}
