package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class DrawableUtils {
    private static final int[] CHECKED_STATE_SET = {android.R.attr.state_checked};
    private static final int[] EMPTY_STATE_SET = new int[0];
    public static final android.graphics.Rect INSETS_NONE = new android.graphics.Rect();
    private static final java.lang.String TAG = "DrawableUtils";
    private static final java.lang.String VECTOR_DRAWABLE_CLAZZ_NAME = "android.graphics.drawable.VectorDrawable";
    private static java.lang.Class<?> sInsetsClazz;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            try {
                sInsetsClazz = java.lang.Class.forName("android.graphics.Insets");
            } catch (java.lang.ClassNotFoundException unused) {
            }
        }
    }

    private DrawableUtils() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static android.graphics.Rect getOpticalBounds(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.graphics.Insets opticalInsets = drawable.getOpticalInsets();
            android.graphics.Rect rect = new android.graphics.Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (sInsetsClazz != null) {
            try {
                android.graphics.drawable.Drawable drawableUnwrap = androidx.core.graphics.drawable.DrawableCompat.unwrap(drawable);
                java.lang.Object objInvoke = drawableUnwrap.getClass().getMethod("getOpticalInsets", new java.lang.Class[0]).invoke(drawableUnwrap, new java.lang.Object[0]);
                if (objInvoke != null) {
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    for (java.lang.reflect.Field field : sInsetsClazz.getFields()) {
                        java.lang.String name = field.getName();
                        byte b = -1;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    b = 3;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    b = 1;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    b = 0;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    b = 2;
                                }
                                break;
                        }
                        if (b == 0) {
                            rect2.left = field.getInt(objInvoke);
                        } else if (b == 1) {
                            rect2.top = field.getInt(objInvoke);
                        } else if (b == 2) {
                            rect2.right = field.getInt(objInvoke);
                        } else if (b == 3) {
                            rect2.bottom = field.getInt(objInvoke);
                        }
                    }
                    return rect2;
                }
            } catch (java.lang.Exception unused) {
                android.util.Log.e(TAG, "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return INSETS_NONE;
    }

    static void fixDrawable(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT == 21 && VECTOR_DRAWABLE_CLAZZ_NAME.equals(drawable.getClass().getName())) {
            fixVectorDrawableTinting(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean canSafelyMutateDrawable(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT < 15 && (drawable instanceof android.graphics.drawable.InsetDrawable)) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT < 15 && (drawable instanceof android.graphics.drawable.GradientDrawable)) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT < 17 && (drawable instanceof android.graphics.drawable.LayerDrawable)) {
            return false;
        }
        if (drawable instanceof android.graphics.drawable.DrawableContainer) {
            android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof android.graphics.drawable.DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (android.graphics.drawable.Drawable drawable2 : ((android.graphics.drawable.DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!canSafelyMutateDrawable(drawable2)) {
                    return false;
                }
            }
            return true;
        }
        if (drawable instanceof androidx.core.graphics.drawable.WrappedDrawable) {
            return canSafelyMutateDrawable(((androidx.core.graphics.drawable.WrappedDrawable) drawable).getWrappedDrawable());
        }
        if (drawable instanceof androidx.appcompat.graphics.drawable.DrawableWrapper) {
            return canSafelyMutateDrawable(((androidx.appcompat.graphics.drawable.DrawableWrapper) drawable).getWrappedDrawable());
        }
        if (drawable instanceof android.graphics.drawable.ScaleDrawable) {
            return canSafelyMutateDrawable(((android.graphics.drawable.ScaleDrawable) drawable).getDrawable());
        }
        return true;
    }

    private static void fixVectorDrawableTinting(android.graphics.drawable.Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(CHECKED_STATE_SET);
        } else {
            drawable.setState(EMPTY_STATE_SET);
        }
        drawable.setState(state);
    }

    public static android.graphics.PorterDuff.Mode parseTintMode(int i, android.graphics.PorterDuff.Mode mode) {
        if (i == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
