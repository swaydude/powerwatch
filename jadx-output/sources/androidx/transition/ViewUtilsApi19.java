package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class ViewUtilsApi19 extends androidx.transition.ViewUtilsBase {
    private static final java.lang.String TAG = "ViewUtilsApi19";
    private static java.lang.reflect.Method sGetTransitionAlphaMethod;
    private static boolean sGetTransitionAlphaMethodFetched;
    private static java.lang.reflect.Method sSetTransitionAlphaMethod;
    private static boolean sSetTransitionAlphaMethodFetched;

    @Override // androidx.transition.ViewUtilsBase
    public void clearNonTransitionAlpha(android.view.View view) {
    }

    @Override // androidx.transition.ViewUtilsBase
    public void saveNonTransitionAlpha(android.view.View view) {
    }

    ViewUtilsApi19() {
    }

    @Override // androidx.transition.ViewUtilsBase
    public void setTransitionAlpha(android.view.View view, float f) {
        fetchSetTransitionAlphaMethod();
        java.lang.reflect.Method method = sSetTransitionAlphaMethod;
        if (method != null) {
            try {
                method.invoke(view, java.lang.Float.valueOf(f));
                return;
            } catch (java.lang.IllegalAccessException unused) {
                return;
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw new java.lang.RuntimeException(e.getCause());
            }
        }
        view.setAlpha(f);
    }

    @Override // androidx.transition.ViewUtilsBase
    public float getTransitionAlpha(android.view.View view) {
        fetchGetTransitionAlphaMethod();
        java.lang.reflect.Method method = sGetTransitionAlphaMethod;
        if (method != null) {
            try {
                return ((java.lang.Float) method.invoke(view, new java.lang.Object[0])).floatValue();
            } catch (java.lang.IllegalAccessException unused) {
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw new java.lang.RuntimeException(e.getCause());
            }
        }
        return super.getTransitionAlpha(view);
    }

    private void fetchSetTransitionAlphaMethod() {
        if (sSetTransitionAlphaMethodFetched) {
            return;
        }
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("setTransitionAlpha", java.lang.Float.TYPE);
            sSetTransitionAlphaMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (java.lang.NoSuchMethodException e) {
            android.util.Log.i(TAG, "Failed to retrieve setTransitionAlpha method", e);
        }
        sSetTransitionAlphaMethodFetched = true;
    }

    private void fetchGetTransitionAlphaMethod() {
        if (sGetTransitionAlphaMethodFetched) {
            return;
        }
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("getTransitionAlpha", new java.lang.Class[0]);
            sGetTransitionAlphaMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (java.lang.NoSuchMethodException e) {
            android.util.Log.i(TAG, "Failed to retrieve getTransitionAlpha method", e);
        }
        sGetTransitionAlphaMethodFetched = true;
    }
}
