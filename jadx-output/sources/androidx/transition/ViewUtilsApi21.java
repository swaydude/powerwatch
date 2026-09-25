package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class ViewUtilsApi21 extends androidx.transition.ViewUtilsApi19 {
    private static final java.lang.String TAG = "ViewUtilsApi21";
    private static java.lang.reflect.Method sSetAnimationMatrixMethod;
    private static boolean sSetAnimationMatrixMethodFetched;
    private static java.lang.reflect.Method sTransformMatrixToGlobalMethod;
    private static boolean sTransformMatrixToGlobalMethodFetched;
    private static java.lang.reflect.Method sTransformMatrixToLocalMethod;
    private static boolean sTransformMatrixToLocalMethodFetched;

    ViewUtilsApi21() {
    }

    @Override // androidx.transition.ViewUtilsBase
    public void transformMatrixToGlobal(android.view.View view, android.graphics.Matrix matrix) {
        fetchTransformMatrixToGlobalMethod();
        java.lang.reflect.Method method = sTransformMatrixToGlobalMethod;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (java.lang.IllegalAccessException unused) {
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw new java.lang.RuntimeException(e.getCause());
            }
        }
    }

    @Override // androidx.transition.ViewUtilsBase
    public void transformMatrixToLocal(android.view.View view, android.graphics.Matrix matrix) {
        fetchTransformMatrixToLocalMethod();
        java.lang.reflect.Method method = sTransformMatrixToLocalMethod;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (java.lang.IllegalAccessException unused) {
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw new java.lang.RuntimeException(e.getCause());
            }
        }
    }

    @Override // androidx.transition.ViewUtilsBase
    public void setAnimationMatrix(android.view.View view, android.graphics.Matrix matrix) {
        fetchSetAnimationMatrix();
        java.lang.reflect.Method method = sSetAnimationMatrixMethod;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.RuntimeException(e.getCause());
            } catch (java.lang.reflect.InvocationTargetException unused) {
            }
        }
    }

    private void fetchTransformMatrixToGlobalMethod() {
        if (sTransformMatrixToGlobalMethodFetched) {
            return;
        }
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("transformMatrixToGlobal", android.graphics.Matrix.class);
            sTransformMatrixToGlobalMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (java.lang.NoSuchMethodException e) {
            android.util.Log.i(TAG, "Failed to retrieve transformMatrixToGlobal method", e);
        }
        sTransformMatrixToGlobalMethodFetched = true;
    }

    private void fetchTransformMatrixToLocalMethod() {
        if (sTransformMatrixToLocalMethodFetched) {
            return;
        }
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("transformMatrixToLocal", android.graphics.Matrix.class);
            sTransformMatrixToLocalMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (java.lang.NoSuchMethodException e) {
            android.util.Log.i(TAG, "Failed to retrieve transformMatrixToLocal method", e);
        }
        sTransformMatrixToLocalMethodFetched = true;
    }

    private void fetchSetAnimationMatrix() {
        if (sSetAnimationMatrixMethodFetched) {
            return;
        }
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("setAnimationMatrix", android.graphics.Matrix.class);
            sSetAnimationMatrixMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (java.lang.NoSuchMethodException e) {
            android.util.Log.i(TAG, "Failed to retrieve setAnimationMatrix method", e);
        }
        sSetAnimationMatrixMethodFetched = true;
    }
}
