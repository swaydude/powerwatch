package com.google.android.material.snackbar;

/* JADX INFO: loaded from: classes2.dex */
public class Snackbar extends com.google.android.material.snackbar.BaseTransientBottomBar<com.google.android.material.snackbar.Snackbar> {
    private static final int[] SNACKBAR_BUTTON_STYLE_ATTR = {com.google.android.material.R.attr.snackbarButtonStyle};
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<com.google.android.material.snackbar.Snackbar> callback;
    private boolean hasAction;

    public static class Callback extends com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<com.google.android.material.snackbar.Snackbar> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onDismissed(com.google.android.material.snackbar.Snackbar snackbar, int i) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onShown(com.google.android.material.snackbar.Snackbar snackbar) {
        }
    }

    private Snackbar(android.view.ViewGroup viewGroup, android.view.View view, com.google.android.material.snackbar.ContentViewCallback contentViewCallback) {
        super(viewGroup, view, contentViewCallback);
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void show() {
        super.show();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void dismiss() {
        super.dismiss();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean isShown() {
        return super.isShown();
    }

    public static com.google.android.material.snackbar.Snackbar make(android.view.View view, java.lang.CharSequence charSequence, int i) {
        android.view.ViewGroup viewGroupFindSuitableParent = findSuitableParent(view);
        if (viewGroupFindSuitableParent == null) {
            throw new java.lang.IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        com.google.android.material.snackbar.SnackbarContentLayout snackbarContentLayout = (com.google.android.material.snackbar.SnackbarContentLayout) android.view.LayoutInflater.from(viewGroupFindSuitableParent.getContext()).inflate(hasSnackbarButtonStyleAttr(viewGroupFindSuitableParent.getContext()) ? com.google.android.material.R.layout.mtrl_layout_snackbar_include : com.google.android.material.R.layout.design_layout_snackbar_include, viewGroupFindSuitableParent, false);
        com.google.android.material.snackbar.Snackbar snackbar = new com.google.android.material.snackbar.Snackbar(viewGroupFindSuitableParent, snackbarContentLayout, snackbarContentLayout);
        snackbar.setText(charSequence);
        snackbar.setDuration(i);
        return snackbar;
    }

    protected static boolean hasSnackbarButtonStyleAttr(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(SNACKBAR_BUTTON_STYLE_ATTR);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public static com.google.android.material.snackbar.Snackbar make(android.view.View view, int i, int i2) {
        return make(view, view.getResources().getText(i), i2);
    }

    private static android.view.ViewGroup findSuitableParent(android.view.View view) {
        android.view.ViewGroup viewGroup = null;
        while (!(view instanceof androidx.coordinatorlayout.widget.CoordinatorLayout)) {
            if (view instanceof android.widget.FrameLayout) {
                if (view.getId() == 16908290) {
                    return (android.view.ViewGroup) view;
                }
                viewGroup = (android.view.ViewGroup) view;
            }
            if (view != null) {
                java.lang.Object parent = view.getParent();
                view = parent instanceof android.view.View ? (android.view.View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (android.view.ViewGroup) view;
    }

    public com.google.android.material.snackbar.Snackbar setText(java.lang.CharSequence charSequence) {
        ((com.google.android.material.snackbar.SnackbarContentLayout) this.view.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    public com.google.android.material.snackbar.Snackbar setText(int i) {
        return setText(getContext().getText(i));
    }

    public com.google.android.material.snackbar.Snackbar setAction(int i, android.view.View.OnClickListener onClickListener) {
        return setAction(getContext().getText(i), onClickListener);
    }

    public com.google.android.material.snackbar.Snackbar setAction(java.lang.CharSequence charSequence, final android.view.View.OnClickListener onClickListener) {
        android.widget.Button actionView = ((com.google.android.material.snackbar.SnackbarContentLayout) this.view.getChildAt(0)).getActionView();
        if (android.text.TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.hasAction = false;
        } else {
            this.hasAction = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.material.snackbar.Snackbar.1
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    onClickListener.onClick(view);
                    com.google.android.material.snackbar.Snackbar.this.dispatchDismiss(1);
                }
            });
        }
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int getDuration() {
        int duration = super.getDuration();
        if (duration == -2) {
            return -2;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return this.accessibilityManager.getRecommendedTimeoutMillis(duration, (this.hasAction ? 4 : 0) | 1 | 2);
        }
        if (this.hasAction && this.accessibilityManager.isTouchExplorationEnabled()) {
            return -2;
        }
        return duration;
    }

    public com.google.android.material.snackbar.Snackbar setTextColor(android.content.res.ColorStateList colorStateList) {
        ((com.google.android.material.snackbar.SnackbarContentLayout) this.view.getChildAt(0)).getMessageView().setTextColor(colorStateList);
        return this;
    }

    public com.google.android.material.snackbar.Snackbar setTextColor(int i) {
        ((com.google.android.material.snackbar.SnackbarContentLayout) this.view.getChildAt(0)).getMessageView().setTextColor(i);
        return this;
    }

    public com.google.android.material.snackbar.Snackbar setActionTextColor(android.content.res.ColorStateList colorStateList) {
        ((com.google.android.material.snackbar.SnackbarContentLayout) this.view.getChildAt(0)).getActionView().setTextColor(colorStateList);
        return this;
    }

    public com.google.android.material.snackbar.Snackbar setActionTextColor(int i) {
        ((com.google.android.material.snackbar.SnackbarContentLayout) this.view.getChildAt(0)).getActionView().setTextColor(i);
        return this;
    }

    public com.google.android.material.snackbar.Snackbar setBackgroundTint(int i) {
        android.graphics.drawable.Drawable background = this.view.getBackground();
        if (background != null) {
            android.graphics.drawable.Drawable drawableMutate = background.mutate();
            if (android.os.Build.VERSION.SDK_INT >= 22) {
                androidx.core.graphics.drawable.DrawableCompat.setTint(drawableMutate, i);
            } else {
                drawableMutate.setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
            }
        }
        return this;
    }

    public com.google.android.material.snackbar.Snackbar setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.core.graphics.drawable.DrawableCompat.setTintList(this.view.getBackground().mutate(), colorStateList);
        return this;
    }

    @java.lang.Deprecated
    public com.google.android.material.snackbar.Snackbar setCallback(com.google.android.material.snackbar.Snackbar.Callback callback) {
        com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<com.google.android.material.snackbar.Snackbar> baseCallback = this.callback;
        if (baseCallback != null) {
            removeCallback(baseCallback);
        }
        if (callback != null) {
            addCallback(callback);
        }
        this.callback = callback;
        return this;
    }

    public static final class SnackbarLayout extends com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout {
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(android.view.View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(android.content.Context context) {
            super(context);
        }

        public SnackbarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY), android.view.View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY));
                }
            }
        }
    }
}
