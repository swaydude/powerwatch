package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class HandlerCompat {
    private static final java.lang.String TAG = "HandlerCompat";

    public static android.os.Handler createAsync(android.os.Looper looper) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return android.os.Handler.createAsync(looper);
        }
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            try {
                return (android.os.Handler) android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, null, true);
            } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException unused) {
                android.util.Log.v(TAG, "Unable to invoke Handler(Looper, Callback, boolean) constructor");
            } catch (java.lang.reflect.InvocationTargetException e) {
                java.lang.Throwable cause = e.getCause();
                if (cause instanceof java.lang.RuntimeException) {
                    throw ((java.lang.RuntimeException) cause);
                }
                if (cause instanceof java.lang.Error) {
                    throw ((java.lang.Error) cause);
                }
                throw new java.lang.RuntimeException(cause);
            }
        }
        return new android.os.Handler(looper);
    }

    public static android.os.Handler createAsync(android.os.Looper looper, android.os.Handler.Callback callback) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return android.os.Handler.createAsync(looper, callback);
        }
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            try {
                return (android.os.Handler) android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, callback, true);
            } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException unused) {
                android.util.Log.v(TAG, "Unable to invoke Handler(Looper, Callback, boolean) constructor");
            } catch (java.lang.reflect.InvocationTargetException e) {
                java.lang.Throwable cause = e.getCause();
                if (cause instanceof java.lang.RuntimeException) {
                    throw ((java.lang.RuntimeException) cause);
                }
                if (cause instanceof java.lang.Error) {
                    throw ((java.lang.Error) cause);
                }
                throw new java.lang.RuntimeException(cause);
            }
        }
        return new android.os.Handler(looper, callback);
    }

    public static boolean postDelayed(android.os.Handler handler, java.lang.Runnable runnable, java.lang.Object obj, long j) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return handler.postDelayed(runnable, obj, j);
        }
        android.os.Message messageObtain = android.os.Message.obtain(handler, runnable);
        messageObtain.obj = obj;
        return handler.sendMessageDelayed(messageObtain, j);
    }

    private HandlerCompat() {
    }
}
