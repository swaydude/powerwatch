package com.google.android.material.bottomsheet;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> {
    private static final int CORNER_ANIMATION_DURATION = 500;
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Design_BottomSheet_Modal;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final java.lang.String TAG = "BottomSheetBehavior";
    int activePointerId;
    private final java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback> callbacks;
    int collapsedOffset;
    private final androidx.customview.widget.ViewDragHelper.Callback dragCallback;
    float elevation;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    int halfExpandedOffset;
    float halfExpandedRatio;
    boolean hideable;
    private boolean ignoreEvents;
    private java.util.Map<android.view.View, java.lang.Integer> importantForAccessibilityMap;
    private int initialY;
    private android.animation.ValueAnimator interpolatorAnimator;
    private boolean isShapeExpanded;
    private int lastNestedScrollDy;
    private com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private boolean nestedScrolled;
    java.lang.ref.WeakReference<android.view.View> nestedScrollingChildRef;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightMin;
    private int saveFlags;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shapeThemingEnabled;
    private boolean skipCollapsed;
    int state;
    boolean touchingScrollingChild;
    private android.view.VelocityTracker velocityTracker;
    androidx.customview.widget.ViewDragHelper viewDragHelper;
    java.lang.ref.WeakReference<V> viewRef;

    public static abstract class BottomSheetCallback {
        public abstract void onSlide(android.view.View view, float f);

        public abstract void onStateChanged(android.view.View view, int i);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SaveFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface State {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.halfExpandedRatio = HIDE_THRESHOLD;
        this.elevation = -1.0f;
        this.state = 4;
        this.callbacks = new java.util.ArrayList<>();
        this.dragCallback = new androidx.customview.widget.ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(android.view.View view, int i) {
                if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.state == 1 || com.google.android.material.bottomsheet.BottomSheetBehavior.this.touchingScrollingChild) {
                    return false;
                }
                if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.state == 3 && com.google.android.material.bottomsheet.BottomSheetBehavior.this.activePointerId == i) {
                    android.view.View view2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this.nestedScrollingChildRef != null ? com.google.android.material.bottomsheet.BottomSheetBehavior.this.nestedScrollingChildRef.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                return com.google.android.material.bottomsheet.BottomSheetBehavior.this.viewRef != null && com.google.android.material.bottomsheet.BottomSheetBehavior.this.viewRef.get() == view;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(android.view.View view, int i, int i2, int i3, int i4) {
                com.google.android.material.bottomsheet.BottomSheetBehavior.this.dispatchOnSlide(i2);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                if (i == 1) {
                    com.google.android.material.bottomsheet.BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(android.view.View view, float f, float f2) {
                int i;
                int i2 = 4;
                if (f2 < 0.0f) {
                    if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContents) {
                        i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContentsOffset;
                    } else if (view.getTop() > com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset) {
                        i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset;
                        i2 = 6;
                    } else {
                        i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.expandedOffset;
                    }
                    i2 = 3;
                } else if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.hideable && com.google.android.material.bottomsheet.BottomSheetBehavior.this.shouldHide(view, f2) && (view.getTop() > com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset || java.lang.Math.abs(f) < java.lang.Math.abs(f2))) {
                    i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.parentHeight;
                    i2 = 5;
                } else if (f2 != 0.0f && java.lang.Math.abs(f) <= java.lang.Math.abs(f2)) {
                    if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContents) {
                        i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset;
                    } else {
                        int top = view.getTop();
                        if (java.lang.Math.abs(top - com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset) < java.lang.Math.abs(top - com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset)) {
                            i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset;
                            i2 = 6;
                        } else {
                            i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset;
                        }
                    }
                } else {
                    int top2 = view.getTop();
                    if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContents) {
                        if (java.lang.Math.abs(top2 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContentsOffset) < java.lang.Math.abs(top2 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset)) {
                            i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContentsOffset;
                            i2 = 3;
                        } else {
                            i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset;
                        }
                    } else {
                        if (top2 < com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset) {
                            if (top2 < java.lang.Math.abs(top2 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset)) {
                                i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.expandedOffset;
                                i2 = 3;
                            } else {
                                i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset;
                            }
                        } else if (java.lang.Math.abs(top2 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset) < java.lang.Math.abs(top2 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset)) {
                            i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset;
                        } else {
                            i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset;
                        }
                        i2 = 6;
                    }
                }
                com.google.android.material.bottomsheet.BottomSheetBehavior.this.startSettlingAnimation(view, i2, i, true);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(android.view.View view, int i, int i2) {
                return androidx.core.math.MathUtils.clamp(i, com.google.android.material.bottomsheet.BottomSheetBehavior.this.getExpandedOffset(), com.google.android.material.bottomsheet.BottomSheetBehavior.this.hideable ? com.google.android.material.bottomsheet.BottomSheetBehavior.this.parentHeight : com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(android.view.View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(android.view.View view) {
                if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.hideable) {
                    return com.google.android.material.bottomsheet.BottomSheetBehavior.this.parentHeight;
                }
                return com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset;
            }
        };
    }

    public BottomSheetBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.saveFlags = 0;
        this.fitToContents = true;
        this.halfExpandedRatio = HIDE_THRESHOLD;
        this.elevation = -1.0f;
        this.state = 4;
        this.callbacks = new java.util.ArrayList<>();
        this.dragCallback = new androidx.customview.widget.ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(android.view.View view, int i) {
                if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.state == 1 || com.google.android.material.bottomsheet.BottomSheetBehavior.this.touchingScrollingChild) {
                    return false;
                }
                if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.state == 3 && com.google.android.material.bottomsheet.BottomSheetBehavior.this.activePointerId == i) {
                    android.view.View view2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this.nestedScrollingChildRef != null ? com.google.android.material.bottomsheet.BottomSheetBehavior.this.nestedScrollingChildRef.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                return com.google.android.material.bottomsheet.BottomSheetBehavior.this.viewRef != null && com.google.android.material.bottomsheet.BottomSheetBehavior.this.viewRef.get() == view;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(android.view.View view, int i, int i2, int i3, int i4) {
                com.google.android.material.bottomsheet.BottomSheetBehavior.this.dispatchOnSlide(i2);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                if (i == 1) {
                    com.google.android.material.bottomsheet.BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(android.view.View view, float f, float f2) {
                int i;
                int i2 = 4;
                if (f2 < 0.0f) {
                    if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContents) {
                        i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContentsOffset;
                    } else if (view.getTop() > com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset) {
                        i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset;
                        i2 = 6;
                    } else {
                        i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.expandedOffset;
                    }
                    i2 = 3;
                } else if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.hideable && com.google.android.material.bottomsheet.BottomSheetBehavior.this.shouldHide(view, f2) && (view.getTop() > com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset || java.lang.Math.abs(f) < java.lang.Math.abs(f2))) {
                    i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.parentHeight;
                    i2 = 5;
                } else if (f2 != 0.0f && java.lang.Math.abs(f) <= java.lang.Math.abs(f2)) {
                    if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContents) {
                        i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset;
                    } else {
                        int top = view.getTop();
                        if (java.lang.Math.abs(top - com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset) < java.lang.Math.abs(top - com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset)) {
                            i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset;
                            i2 = 6;
                        } else {
                            i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset;
                        }
                    }
                } else {
                    int top2 = view.getTop();
                    if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContents) {
                        if (java.lang.Math.abs(top2 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContentsOffset) < java.lang.Math.abs(top2 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset)) {
                            i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContentsOffset;
                            i2 = 3;
                        } else {
                            i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset;
                        }
                    } else {
                        if (top2 < com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset) {
                            if (top2 < java.lang.Math.abs(top2 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset)) {
                                i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.expandedOffset;
                                i2 = 3;
                            } else {
                                i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset;
                            }
                        } else if (java.lang.Math.abs(top2 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset) < java.lang.Math.abs(top2 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset)) {
                            i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset;
                        } else {
                            i = com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset;
                        }
                        i2 = 6;
                    }
                }
                com.google.android.material.bottomsheet.BottomSheetBehavior.this.startSettlingAnimation(view, i2, i, true);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(android.view.View view, int i, int i2) {
                return androidx.core.math.MathUtils.clamp(i, com.google.android.material.bottomsheet.BottomSheetBehavior.this.getExpandedOffset(), com.google.android.material.bottomsheet.BottomSheetBehavior.this.hideable ? com.google.android.material.bottomsheet.BottomSheetBehavior.this.parentHeight : com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(android.view.View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(android.view.View view) {
                if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.hideable) {
                    return com.google.android.material.bottomsheet.BottomSheetBehavior.this.parentHeight;
                }
                return com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset;
            }
        };
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.BottomSheetBehavior_Layout);
        this.shapeThemingEnabled = typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_shapeAppearance);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_backgroundTint);
        if (zHasValue) {
            createMaterialShapeDrawable(context, attributeSet, zHasValue, com.google.android.material.resources.MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            createMaterialShapeDrawable(context, attributeSet, zHasValue);
        }
        createShapeValueAnimator();
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            this.elevation = typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        android.util.TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null && typedValuePeekValue.data == -1) {
            setPeekHeight(typedValuePeekValue.data);
        } else {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setFitToContents(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setSaveFlags(typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(typedArrayObtainStyledAttributes.getFloat(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, HIDE_THRESHOLD));
        setExpandedOffset(typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        typedArrayObtainStyledAttributes.recycle();
        this.maximumVelocity = android.view.ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public android.os.Parcelable onSaveInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v) {
        return new com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState(super.onSaveInstanceState(coordinatorLayout, v), (com.google.android.material.bottomsheet.BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.os.Parcelable parcelable) {
        com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState savedState = (com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        restoreOptionalState(savedState);
        if (savedState.state == 1 || savedState.state == 2) {
            this.state = 4;
        } else {
            this.state = savedState.state;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i) {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable;
        if (androidx.core.view.ViewCompat.getFitsSystemWindows(coordinatorLayout) && !androidx.core.view.ViewCompat.getFitsSystemWindows(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_sheet_peek_height_min);
            this.viewRef = new java.lang.ref.WeakReference<>(v);
            if (this.shapeThemingEnabled && (materialShapeDrawable = this.materialShapeDrawable) != null) {
                androidx.core.view.ViewCompat.setBackground(v, materialShapeDrawable);
            }
            com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
            if (materialShapeDrawable2 != null) {
                float elevation = this.elevation;
                if (elevation == -1.0f) {
                    elevation = androidx.core.view.ViewCompat.getElevation(v);
                }
                materialShapeDrawable2.setElevation(elevation);
                boolean z = this.state == 3;
                this.isShapeExpanded = z;
                this.materialShapeDrawable.setInterpolation(z ? 0.0f : 1.0f);
            }
            updateAccessibilityActions();
            if (androidx.core.view.ViewCompat.getImportantForAccessibility(v) == 0) {
                androidx.core.view.ViewCompat.setImportantForAccessibility(v, 1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = androidx.customview.widget.ViewDragHelper.create(coordinatorLayout, this.dragCallback);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.parentWidth = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.parentHeight = height;
        this.fitToContentsOffset = java.lang.Math.max(0, height - v.getHeight());
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i2 = this.state;
        if (i2 == 3) {
            androidx.core.view.ViewCompat.offsetTopAndBottom(v, getExpandedOffset());
        } else if (i2 == 6) {
            androidx.core.view.ViewCompat.offsetTopAndBottom(v, this.halfExpandedOffset);
        } else if (this.hideable && i2 == 5) {
            androidx.core.view.ViewCompat.offsetTopAndBottom(v, this.parentHeight);
        } else if (i2 == 4) {
            androidx.core.view.ViewCompat.offsetTopAndBottom(v, this.collapsedOffset);
        } else if (i2 == 1 || i2 == 2) {
            androidx.core.view.ViewCompat.offsetTopAndBottom(v, top - v.getTop());
        }
        this.nestedScrollingChildRef = new java.lang.ref.WeakReference<>(findScrollingChild(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.MotionEvent motionEvent) {
        androidx.customview.widget.ViewDragHelper viewDragHelper;
        if (!v.isShown()) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = android.view.VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            if (this.state != 2) {
                java.lang.ref.WeakReference<android.view.View> weakReference = this.nestedScrollingChildRef;
                android.view.View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.initialY)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.touchingScrollingChild = true;
                }
            }
            this.ignoreEvents = this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.initialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touchingScrollingChild = false;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        }
        if (!this.ignoreEvents && (viewDragHelper = this.viewDragHelper) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        java.lang.ref.WeakReference<android.view.View> weakReference2 = this.nestedScrollingChildRef;
        android.view.View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || java.lang.Math.abs(((float) this.initialY) - motionEvent.getY()) <= ((float) this.viewDragHelper.getTouchSlop())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        androidx.customview.widget.ViewDragHelper viewDragHelper = this.viewDragHelper;
        if (viewDragHelper != null) {
            viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = android.view.VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 2 && !this.ignoreEvents && java.lang.Math.abs(this.initialY - motionEvent.getY()) > this.viewDragHelper.getTouchSlop()) {
            this.viewDragHelper.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, android.view.View view2, int i, int i2) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        java.lang.ref.WeakReference<android.view.View> weakReference = this.nestedScrollingChildRef;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < getExpandedOffset()) {
                iArr[1] = top - getExpandedOffset();
                androidx.core.view.ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                setStateInternal(3);
            } else {
                iArr[1] = i2;
                androidx.core.view.ViewCompat.offsetTopAndBottom(v, -i2);
                setStateInternal(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.collapsedOffset;
            if (i4 <= i5 || this.hideable) {
                iArr[1] = i2;
                androidx.core.view.ViewCompat.offsetTopAndBottom(v, -i2);
                setStateInternal(1);
            } else {
                iArr[1] = top - i5;
                androidx.core.view.ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                setStateInternal(4);
            }
        }
        dispatchOnSlide(v.getTop());
        this.lastNestedScrollDy = i2;
        this.nestedScrolled = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i) {
        int expandedOffset;
        int i2 = 3;
        if (v.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        java.lang.ref.WeakReference<android.view.View> weakReference = this.nestedScrollingChildRef;
        if (weakReference != null && view == weakReference.get() && this.nestedScrolled) {
            if (this.lastNestedScrollDy > 0) {
                expandedOffset = getExpandedOffset();
            } else if (this.hideable && shouldHide(v, getYVelocity())) {
                expandedOffset = this.parentHeight;
                i2 = 5;
            } else if (this.lastNestedScrollDy == 0) {
                int top = v.getTop();
                if (this.fitToContents) {
                    if (java.lang.Math.abs(top - this.fitToContentsOffset) < java.lang.Math.abs(top - this.collapsedOffset)) {
                        expandedOffset = this.fitToContentsOffset;
                    } else {
                        expandedOffset = this.collapsedOffset;
                        i2 = 4;
                    }
                } else {
                    int i3 = this.halfExpandedOffset;
                    if (top < i3) {
                        if (top < java.lang.Math.abs(top - this.collapsedOffset)) {
                            expandedOffset = this.expandedOffset;
                        } else {
                            expandedOffset = this.halfExpandedOffset;
                        }
                    } else if (java.lang.Math.abs(top - i3) < java.lang.Math.abs(top - this.collapsedOffset)) {
                        expandedOffset = this.halfExpandedOffset;
                    } else {
                        expandedOffset = this.collapsedOffset;
                        i2 = 4;
                    }
                    i2 = 6;
                }
            } else {
                if (this.fitToContents) {
                    expandedOffset = this.collapsedOffset;
                } else {
                    int top2 = v.getTop();
                    if (java.lang.Math.abs(top2 - this.halfExpandedOffset) < java.lang.Math.abs(top2 - this.collapsedOffset)) {
                        expandedOffset = this.halfExpandedOffset;
                        i2 = 6;
                    } else {
                        expandedOffset = this.collapsedOffset;
                    }
                }
                i2 = 4;
            }
            startSettlingAnimation(v, i2, expandedOffset, false);
            this.nestedScrolled = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, float f, float f2) {
        java.lang.ref.WeakReference<android.view.View> weakReference = this.nestedScrollingChildRef;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.state != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2);
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public void setFitToContents(boolean z) {
        if (this.fitToContents == z) {
            return;
        }
        this.fitToContents = z;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.fitToContents && this.state == 6) ? 3 : this.state);
        updateAccessibilityActions();
    }

    public void setPeekHeight(int i) {
        setPeekHeight(i, false);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015  */
    public final void setPeekHeight(int i, boolean z) {
        V v;
        boolean z2 = true;
        if (i == -1) {
            if (this.peekHeightAuto) {
                z2 = false;
            } else {
                this.peekHeightAuto = true;
            }
        } else if (this.peekHeightAuto || this.peekHeight != i) {
            this.peekHeightAuto = false;
            this.peekHeight = java.lang.Math.max(0, i);
        } else {
            z2 = false;
        }
        if (!z2 || this.viewRef == null) {
            return;
        }
        calculateCollapsedOffset();
        if (this.state != 4 || (v = this.viewRef.get()) == null) {
            return;
        }
        if (z) {
            settleToStatePendingLayout(this.state);
        } else {
            v.requestLayout();
        }
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    public void setHalfExpandedRatio(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new java.lang.IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.halfExpandedRatio = f;
    }

    public void setExpandedOffset(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.expandedOffset = i;
    }

    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public void setHideable(boolean z) {
        if (this.hideable != z) {
            this.hideable = z;
            if (!z && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public boolean isHideable() {
        return this.hideable;
    }

    public void setSkipCollapsed(boolean z) {
        this.skipCollapsed = z;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public void setSaveFlags(int i) {
        this.saveFlags = i;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    @java.lang.Deprecated
    public void setBottomSheetCallback(com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallback) {
        android.util.Log.w(TAG, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.callbacks.clear();
        if (bottomSheetCallback != null) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public void addBottomSheetCallback(com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallback) {
        if (this.callbacks.contains(bottomSheetCallback)) {
            return;
        }
        this.callbacks.add(bottomSheetCallback);
    }

    public void removeBottomSheetCallback(com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallback) {
        this.callbacks.remove(bottomSheetCallback);
    }

    public void setState(int i) {
        if (i == this.state) {
            return;
        }
        if (this.viewRef == null) {
            if (i == 4 || i == 3 || i == 6 || (this.hideable && i == 5)) {
                this.state = i;
                return;
            }
            return;
        }
        settleToStatePendingLayout(i);
    }

    private void settleToStatePendingLayout(final int i) {
        final V v = this.viewRef.get();
        if (v == null) {
            return;
        }
        android.view.ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && androidx.core.view.ViewCompat.isAttachedToWindow(v)) {
            v.post(new java.lang.Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                @Override // java.lang.Runnable
                public void run() {
                    com.google.android.material.bottomsheet.BottomSheetBehavior.this.settleToState(v, i);
                }
            });
        } else {
            settleToState(v, i);
        }
    }

    public int getState() {
        return this.state;
    }

    void setStateInternal(int i) {
        V v;
        if (this.state == i) {
            return;
        }
        this.state = i;
        java.lang.ref.WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 6 || i == 3) {
            updateImportantForAccessibility(true);
        } else if (i == 5 || i == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i);
        for (int i2 = 0; i2 < this.callbacks.size(); i2++) {
            this.callbacks.get(i2).onStateChanged(v, i);
        }
        updateAccessibilityActions();
    }

    private void updateDrawableForTargetState(int i) {
        android.animation.ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.isShapeExpanded != z) {
            this.isShapeExpanded = z;
            if (this.materialShapeDrawable == null || (valueAnimator = this.interpolatorAnimator) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.interpolatorAnimator.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            this.interpolatorAnimator.setFloatValues(1.0f - f, f);
            this.interpolatorAnimator.start();
        }
    }

    private void calculateCollapsedOffset() {
        int iMax;
        if (this.peekHeightAuto) {
            iMax = java.lang.Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16));
        } else {
            iMax = this.peekHeight;
        }
        if (this.fitToContents) {
            this.collapsedOffset = java.lang.Math.max(this.parentHeight - iMax, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - iMax;
        }
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) (this.parentHeight * (1.0f - this.halfExpandedRatio));
    }

    private void reset() {
        this.activePointerId = -1;
        android.view.VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState savedState) {
        int i = this.saveFlags;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.peekHeight = savedState.peekHeight;
        }
        int i2 = this.saveFlags;
        if (i2 == -1 || (i2 & 2) == 2) {
            this.fitToContents = savedState.fitToContents;
        }
        int i3 = this.saveFlags;
        if (i3 == -1 || (i3 & 4) == 4) {
            this.hideable = savedState.hideable;
        }
        int i4 = this.saveFlags;
        if (i4 == -1 || (i4 & 8) == 8) {
            this.skipCollapsed = savedState.skipCollapsed;
        }
    }

    boolean shouldHide(android.view.View view, float f) {
        if (this.skipCollapsed) {
            return true;
        }
        return view.getTop() >= this.collapsedOffset && java.lang.Math.abs((((float) view.getTop()) + (f * HIDE_FRICTION)) - ((float) this.collapsedOffset)) / ((float) this.peekHeight) > HIDE_THRESHOLD;
    }

    android.view.View findScrollingChild(android.view.View view) {
        if (androidx.core.view.ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View viewFindScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
            if (viewFindScrollingChild != null) {
                return viewFindScrollingChild;
            }
        }
        return null;
    }

    private void createMaterialShapeDrawable(android.content.Context context, android.util.AttributeSet attributeSet, boolean z) {
        createMaterialShapeDrawable(context, attributeSet, z, null);
    }

    private void createMaterialShapeDrawable(android.content.Context context, android.util.AttributeSet attributeSet, boolean z, android.content.res.ColorStateList colorStateList) {
        if (this.shapeThemingEnabled) {
            this.shapeAppearanceModelDefault = com.google.android.material.shape.ShapeAppearanceModel.builder(context, attributeSet, com.google.android.material.R.attr.bottomSheetStyle, DEF_STYLE_RES).build();
            com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable(this.shapeAppearanceModelDefault);
            this.materialShapeDrawable = materialShapeDrawable;
            materialShapeDrawable.initializeElevationOverlay(context);
            if (z && colorStateList != null) {
                this.materialShapeDrawable.setFillColor(colorStateList);
                return;
            }
            android.util.TypedValue typedValue = new android.util.TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.materialShapeDrawable.setTint(typedValue.data);
        }
    }

    private void createShapeValueAnimator() {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.interpolatorAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.materialShapeDrawable != null) {
                    com.google.android.material.bottomsheet.BottomSheetBehavior.this.materialShapeDrawable.setInterpolation(fFloatValue);
                }
            }
        });
    }

    private float getYVelocity() {
        android.view.VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getExpandedOffset() {
        return this.fitToContents ? this.fitToContentsOffset : this.expandedOffset;
    }

    void settleToState(android.view.View view, int i) {
        int expandedOffset;
        int i2;
        if (i == 4) {
            expandedOffset = this.collapsedOffset;
        } else if (i == 6) {
            int i3 = this.halfExpandedOffset;
            if (!this.fitToContents || i3 > (i2 = this.fitToContentsOffset)) {
                expandedOffset = i3;
            } else {
                expandedOffset = i2;
                i = 3;
            }
        } else if (i == 3) {
            expandedOffset = getExpandedOffset();
        } else if (this.hideable && i == 5) {
            expandedOffset = this.parentHeight;
        } else {
            throw new java.lang.IllegalArgumentException("Illegal state argument: " + i);
        }
        startSettlingAnimation(view, i, expandedOffset, false);
    }

    void startSettlingAnimation(android.view.View view, int i, int i2, boolean z) {
        boolean zSmoothSlideViewTo;
        if (z) {
            zSmoothSlideViewTo = this.viewDragHelper.settleCapturedViewAt(view.getLeft(), i2);
        } else {
            zSmoothSlideViewTo = this.viewDragHelper.smoothSlideViewTo(view, view.getLeft(), i2);
        }
        if (zSmoothSlideViewTo) {
            setStateInternal(2);
            updateDrawableForTargetState(i);
            androidx.core.view.ViewCompat.postOnAnimation(view, new com.google.android.material.bottomsheet.BottomSheetBehavior.SettleRunnable(view, i));
            return;
        }
        setStateInternal(i);
    }

    void dispatchOnSlide(int i) {
        float f;
        float expandedOffset;
        V v = this.viewRef.get();
        if (v == null || this.callbacks.isEmpty()) {
            return;
        }
        int i2 = this.collapsedOffset;
        if (i > i2) {
            f = i2 - i;
            expandedOffset = this.parentHeight - i2;
        } else {
            f = i2 - i;
            expandedOffset = i2 - getExpandedOffset();
        }
        float f2 = f / expandedOffset;
        for (int i3 = 0; i3 < this.callbacks.size(); i3++) {
            this.callbacks.get(i3).onSlide(v, f2);
        }
    }

    int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    private class SettleRunnable implements java.lang.Runnable {
        private final int targetState;
        private final android.view.View view;

        SettleRunnable(android.view.View view, int i) {
            this.view = view;
            this.targetState = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.viewDragHelper != null && com.google.android.material.bottomsheet.BottomSheetBehavior.this.viewDragHelper.continueSettling(true)) {
                androidx.core.view.ViewCompat.postOnAnimation(this.view, this);
            } else if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.state == 2) {
                com.google.android.material.bottomsheet.BottomSheetBehavior.this.setStateInternal(this.targetState);
            }
        }
    }

    protected static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState(parcel, (java.lang.ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState[] newArray(int i) {
                return new com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState[i];
            }
        };
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
        final int state;

        public SavedState(android.os.Parcel parcel) {
            this(parcel, (java.lang.ClassLoader) null);
        }

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        public SavedState(android.os.Parcelable parcelable, com.google.android.material.bottomsheet.BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = ((com.google.android.material.bottomsheet.BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.fitToContents = ((com.google.android.material.bottomsheet.BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = ((com.google.android.material.bottomsheet.BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }

        @java.lang.Deprecated
        public SavedState(android.os.Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }
    }

    public static <V extends android.view.View> com.google.android.material.bottomsheet.BottomSheetBehavior<V> from(V v) {
        android.view.ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)) {
            throw new java.lang.IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (!(behavior instanceof com.google.android.material.bottomsheet.BottomSheetBehavior)) {
            throw new java.lang.IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        return (com.google.android.material.bottomsheet.BottomSheetBehavior) behavior;
    }

    private void updateImportantForAccessibility(boolean z) {
        java.lang.ref.WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        android.view.ViewParent parent = weakReference.get().getParent();
        if (parent instanceof androidx.coordinatorlayout.widget.CoordinatorLayout) {
            androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (android.os.Build.VERSION.SDK_INT >= 16 && z) {
                if (this.importantForAccessibilityMap != null) {
                    return;
                } else {
                    this.importantForAccessibilityMap = new java.util.HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.viewRef.get()) {
                    if (!z) {
                        java.util.Map<android.view.View, java.lang.Integer> map = this.importantForAccessibilityMap;
                        if (map != null && map.containsKey(childAt)) {
                            androidx.core.view.ViewCompat.setImportantForAccessibility(childAt, this.importantForAccessibilityMap.get(childAt).intValue());
                        }
                    } else {
                        if (android.os.Build.VERSION.SDK_INT >= 16) {
                            this.importantForAccessibilityMap.put(childAt, java.lang.Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        androidx.core.view.ViewCompat.setImportantForAccessibility(childAt, 4);
                    }
                }
            }
            if (z) {
                return;
            }
            this.importantForAccessibilityMap = null;
        }
    }

    private void updateAccessibilityActions() {
        V v;
        java.lang.ref.WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        androidx.core.view.ViewCompat.removeAccessibilityAction(v, 524288);
        androidx.core.view.ViewCompat.removeAccessibilityAction(v, 262144);
        androidx.core.view.ViewCompat.removeAccessibilityAction(v, 1048576);
        if (this.hideable && this.state != 5) {
            addAccessibilityActionForState(v, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
        }
        int i = this.state;
        if (i == 3) {
            addAccessibilityActionForState(v, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, this.fitToContents ? 4 : 6);
            return;
        }
        if (i == 4) {
            addAccessibilityActionForState(v, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, this.fitToContents ? 3 : 6);
        } else {
            if (i != 6) {
                return;
            }
            addAccessibilityActionForState(v, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, 4);
            addAccessibilityActionForState(v, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
        }
    }

    private void addAccessibilityActionForState(V v, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, final int i) {
        androidx.core.view.ViewCompat.replaceAccessibilityAction(v, accessibilityActionCompat, null, new androidx.core.view.accessibility.AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean perform(android.view.View view, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments commandArguments) {
                com.google.android.material.bottomsheet.BottomSheetBehavior.this.setState(i);
                return true;
            }
        });
    }
}
