package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class ViewGroupUtilsApi18 {
    private static final java.lang.String TAG = "ViewUtilsApi18";
    private static java.lang.reflect.Method sSuppressLayoutMethod;
    private static boolean sSuppressLayoutMethodFetched;

    static void suppressLayout(android.view.ViewGroup viewGroup, boolean z) {
        fetchSuppressLayoutMethod();
        java.lang.reflect.Method method = sSuppressLayoutMethod;
        if (method != null) {
            try {
                method.invoke(viewGroup, java.lang.Boolean.valueOf(z));
            } catch (java.lang.IllegalAccessException e) {
                android.util.Log.i(TAG, "Failed to invoke suppressLayout method", e);
            } catch (java.lang.reflect.InvocationTargetException e2) {
                android.util.Log.i(TAG, "Error invoking suppressLayout method", e2);
            }
        }
    }

    private static void fetchSuppressLayoutMethod() {
        if (sSuppressLayoutMethodFetched) {
            return;
        }
        try {
            java.lang.reflect.Method declaredMethod = android.view.ViewGroup.class.getDeclaredMethod("suppressLayout", java.lang.Boolean.TYPE);
            sSuppressLayoutMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (java.lang.NoSuchMethodException e) {
            android.util.Log.i(TAG, "Failed to retrieve suppressLayout method", e);
        }
        sSuppressLayoutMethodFetched = true;
    }

    private ViewGroupUtilsApi18() {
    }
}
