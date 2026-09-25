package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class ViewBindingAdapter {
    public static final int FADING_EDGE_HORIZONTAL = 1;
    public static final int FADING_EDGE_NONE = 0;
    public static final int FADING_EDGE_VERTICAL = 2;

    public interface OnViewAttachedToWindow {
        void onViewAttachedToWindow(android.view.View view);
    }

    public interface OnViewDetachedFromWindow {
        void onViewDetachedFromWindow(android.view.View view);
    }

    private static int pixelsToDimensionPixelSize(float f) {
        int i = (int) (0.5f + f);
        if (i != 0) {
            return i;
        }
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    public static void setPadding(android.view.View view, float f) {
        int iPixelsToDimensionPixelSize = pixelsToDimensionPixelSize(f);
        view.setPadding(iPixelsToDimensionPixelSize, iPixelsToDimensionPixelSize, iPixelsToDimensionPixelSize, iPixelsToDimensionPixelSize);
    }

    public static void setPaddingBottom(android.view.View view, float f) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), pixelsToDimensionPixelSize(f));
    }

    public static void setPaddingEnd(android.view.View view, float f) {
        int iPixelsToDimensionPixelSize = pixelsToDimensionPixelSize(f);
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), iPixelsToDimensionPixelSize, view.getPaddingBottom());
        } else {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), iPixelsToDimensionPixelSize, view.getPaddingBottom());
        }
    }

    public static void setPaddingLeft(android.view.View view, float f) {
        view.setPadding(pixelsToDimensionPixelSize(f), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void setPaddingRight(android.view.View view, float f) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), pixelsToDimensionPixelSize(f), view.getPaddingBottom());
    }

    public static void setPaddingStart(android.view.View view, float f) {
        int iPixelsToDimensionPixelSize = pixelsToDimensionPixelSize(f);
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(iPixelsToDimensionPixelSize, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        } else {
            view.setPadding(iPixelsToDimensionPixelSize, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public static void setPaddingTop(android.view.View view, float f) {
        view.setPadding(view.getPaddingLeft(), pixelsToDimensionPixelSize(f), view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void setRequiresFadingEdge(android.view.View view, int i) {
        boolean z = (i & 2) != 0;
        boolean z2 = (i & 1) != 0;
        view.setVerticalFadingEdgeEnabled(z);
        view.setHorizontalFadingEdgeEnabled(z2);
    }

    public static void setClickListener(android.view.View view, android.view.View.OnClickListener onClickListener, boolean z) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z);
    }

    public static void setOnClick(android.view.View view, android.view.View.OnClickListener onClickListener, boolean z) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z);
    }

    public static void setOnLongClickListener(android.view.View view, android.view.View.OnLongClickListener onLongClickListener, boolean z) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z);
    }

    public static void setOnLongClick(android.view.View view, android.view.View.OnLongClickListener onLongClickListener, boolean z) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z);
    }

    public static void setOnAttachStateChangeListener(android.view.View view, final androidx.databinding.adapters.ViewBindingAdapter.OnViewDetachedFromWindow onViewDetachedFromWindow, final androidx.databinding.adapters.ViewBindingAdapter.OnViewAttachedToWindow onViewAttachedToWindow) {
        android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = (onViewDetachedFromWindow == null && onViewAttachedToWindow == null) ? null : new android.view.View.OnAttachStateChangeListener() { // from class: androidx.databinding.adapters.ViewBindingAdapter.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(android.view.View view2) {
                androidx.databinding.adapters.ViewBindingAdapter.OnViewAttachedToWindow onViewAttachedToWindow2 = onViewAttachedToWindow;
                if (onViewAttachedToWindow2 != null) {
                    onViewAttachedToWindow2.onViewAttachedToWindow(view2);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(android.view.View view2) {
                androidx.databinding.adapters.ViewBindingAdapter.OnViewDetachedFromWindow onViewDetachedFromWindow2 = onViewDetachedFromWindow;
                if (onViewDetachedFromWindow2 != null) {
                    onViewDetachedFromWindow2.onViewDetachedFromWindow(view2);
                }
            }
        };
        android.view.View.OnAttachStateChangeListener onAttachStateChangeListener2 = (android.view.View.OnAttachStateChangeListener) androidx.databinding.adapters.ListenerUtil.trackListener(view, onAttachStateChangeListener, androidx.databinding.library.baseAdapters.R.id.onAttachStateChangeListener);
        if (onAttachStateChangeListener2 != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener2);
        }
        if (onAttachStateChangeListener != null) {
            view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    public static void setOnLayoutChangeListener(android.view.View view, android.view.View.OnLayoutChangeListener onLayoutChangeListener, android.view.View.OnLayoutChangeListener onLayoutChangeListener2) {
        if (onLayoutChangeListener != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        if (onLayoutChangeListener2 != null) {
            view.addOnLayoutChangeListener(onLayoutChangeListener2);
        }
    }

    public static void setBackground(android.view.View view, android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }
}
