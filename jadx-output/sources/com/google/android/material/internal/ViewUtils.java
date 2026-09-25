package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
public class ViewUtils {

    public interface OnApplyWindowInsetsListener {
        androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat, com.google.android.material.internal.ViewUtils.RelativePadding relativePadding);
    }

    private ViewUtils() {
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

    public static boolean isLayoutRtl(android.view.View view) {
        return androidx.core.view.ViewCompat.getLayoutDirection(view) == 1;
    }

    public static float dpToPx(android.content.Context context, int i) {
        return android.util.TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static void requestFocusAndShowKeyboard(final android.view.View view) {
        view.requestFocus();
        view.post(new java.lang.Runnable() { // from class: com.google.android.material.internal.ViewUtils.1
            @Override // java.lang.Runnable
            public void run() {
                ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
            }
        });
    }

    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public RelativePadding(int i, int i2, int i3, int i4) {
            this.start = i;
            this.top = i2;
            this.end = i3;
            this.bottom = i4;
        }

        public RelativePadding(com.google.android.material.internal.ViewUtils.RelativePadding relativePadding) {
            this.start = relativePadding.start;
            this.top = relativePadding.top;
            this.end = relativePadding.end;
            this.bottom = relativePadding.bottom;
        }

        public void applyToView(android.view.View view) {
            androidx.core.view.ViewCompat.setPaddingRelative(view, this.start, this.top, this.end, this.bottom);
        }
    }

    public static void doOnApplyWindowInsets(android.view.View view, final com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        final com.google.android.material.internal.ViewUtils.RelativePadding relativePadding = new com.google.android.material.internal.ViewUtils.RelativePadding(androidx.core.view.ViewCompat.getPaddingStart(view), view.getPaddingTop(), androidx.core.view.ViewCompat.getPaddingEnd(view), view.getPaddingBottom());
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(view, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.2
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view2, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                return onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsetsCompat, new com.google.android.material.internal.ViewUtils.RelativePadding(relativePadding));
            }
        });
        requestApplyInsetsWhenAttached(view);
    }

    public static void requestApplyInsetsWhenAttached(android.view.View view) {
        if (androidx.core.view.ViewCompat.isAttachedToWindow(view)) {
            androidx.core.view.ViewCompat.requestApplyInsets(view);
        } else {
            view.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: com.google.android.material.internal.ViewUtils.3
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(android.view.View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(android.view.View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    androidx.core.view.ViewCompat.requestApplyInsets(view2);
                }
            });
        }
    }

    public static float getParentAbsoluteElevation(android.view.View view) {
        float elevation = 0.0f;
        for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            elevation += androidx.core.view.ViewCompat.getElevation((android.view.View) parent);
        }
        return elevation;
    }
}
