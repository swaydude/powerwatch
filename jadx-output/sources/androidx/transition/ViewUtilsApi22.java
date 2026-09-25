package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class ViewUtilsApi22 extends androidx.transition.ViewUtilsApi21 {
    private static final java.lang.String TAG = "ViewUtilsApi22";
    private static java.lang.reflect.Method sSetLeftTopRightBottomMethod;
    private static boolean sSetLeftTopRightBottomMethodFetched;

    ViewUtilsApi22() {
    }

    @Override // androidx.transition.ViewUtilsBase
    public void setLeftTopRightBottom(android.view.View view, int i, int i2, int i3, int i4) {
        fetchSetLeftTopRightBottomMethod();
        java.lang.reflect.Method method = sSetLeftTopRightBottomMethod;
        if (method != null) {
            try {
                method.invoke(view, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4));
            } catch (java.lang.IllegalAccessException unused) {
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw new java.lang.RuntimeException(e.getCause());
            }
        }
    }

    private void fetchSetLeftTopRightBottomMethod() {
        if (sSetLeftTopRightBottomMethodFetched) {
            return;
        }
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("setLeftTopRightBottom", java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            sSetLeftTopRightBottomMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (java.lang.NoSuchMethodException e) {
            android.util.Log.i(TAG, "Failed to retrieve setLeftTopRightBottom method", e);
        }
        sSetLeftTopRightBottomMethodFetched = true;
    }
}
