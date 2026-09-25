package androidx.slidingpanelayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class SlidingPaneLayout extends android.view.ViewGroup {
    private static final int DEFAULT_FADE_COLOR = -858993460;
    private static final int DEFAULT_OVERHANG_SIZE = 32;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final java.lang.String TAG = "SlidingPaneLayout";
    private boolean mCanSlide;
    private int mCoveredFadeColor;
    private boolean mDisplayListReflectionLoaded;
    final androidx.customview.widget.ViewDragHelper mDragHelper;
    private boolean mFirstLayout;
    private java.lang.reflect.Method mGetDisplayList;
    private float mInitialMotionX;
    private float mInitialMotionY;
    boolean mIsUnableToDrag;
    private final int mOverhangSize;
    private androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener mPanelSlideListener;
    private int mParallaxBy;
    private float mParallaxOffset;
    final java.util.ArrayList<androidx.slidingpanelayout.widget.SlidingPaneLayout.DisableLayerRunnable> mPostedRunnables;
    boolean mPreservedOpenState;
    private java.lang.reflect.Field mRecreateDisplayList;
    private android.graphics.drawable.Drawable mShadowDrawableLeft;
    private android.graphics.drawable.Drawable mShadowDrawableRight;
    float mSlideOffset;
    int mSlideRange;
    android.view.View mSlideableView;
    private int mSliderFadeColor;
    private final android.graphics.Rect mTmpRect;

    public interface PanelSlideListener {
        void onPanelClosed(android.view.View view);

        void onPanelOpened(android.view.View view);

        void onPanelSlide(android.view.View view, float f);
    }

    public static class SimplePanelSlideListener implements androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener {
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelClosed(android.view.View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelOpened(android.view.View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelSlide(android.view.View view, float f) {
        }
    }

    public SlidingPaneLayout(android.content.Context context) {
        this(context, null);
    }

    public SlidingPaneLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSliderFadeColor = DEFAULT_FADE_COLOR;
        this.mFirstLayout = true;
        this.mTmpRect = new android.graphics.Rect();
        this.mPostedRunnables = new java.util.ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.mOverhangSize = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        androidx.core.view.ViewCompat.setAccessibilityDelegate(this, new androidx.slidingpanelayout.widget.SlidingPaneLayout.AccessibilityDelegate());
        androidx.core.view.ViewCompat.setImportantForAccessibility(this, 1);
        androidx.customview.widget.ViewDragHelper viewDragHelperCreate = androidx.customview.widget.ViewDragHelper.create(this, 0.5f, new androidx.slidingpanelayout.widget.SlidingPaneLayout.DragHelperCallback());
        this.mDragHelper = viewDragHelperCreate;
        viewDragHelperCreate.setMinVelocity(f * 400.0f);
    }

    public void setParallaxDistance(int i) {
        this.mParallaxBy = i;
        requestLayout();
    }

    public int getParallaxDistance() {
        return this.mParallaxBy;
    }

    public void setSliderFadeColor(int i) {
        this.mSliderFadeColor = i;
    }

    public int getSliderFadeColor() {
        return this.mSliderFadeColor;
    }

    public void setCoveredFadeColor(int i) {
        this.mCoveredFadeColor = i;
    }

    public int getCoveredFadeColor() {
        return this.mCoveredFadeColor;
    }

    public void setPanelSlideListener(androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener panelSlideListener) {
        this.mPanelSlideListener = panelSlideListener;
    }

    void dispatchOnPanelSlide(android.view.View view) {
        androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener panelSlideListener = this.mPanelSlideListener;
        if (panelSlideListener != null) {
            panelSlideListener.onPanelSlide(view, this.mSlideOffset);
        }
    }

    void dispatchOnPanelOpened(android.view.View view) {
        androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener panelSlideListener = this.mPanelSlideListener;
        if (panelSlideListener != null) {
            panelSlideListener.onPanelOpened(view);
        }
        sendAccessibilityEvent(32);
    }

    void dispatchOnPanelClosed(android.view.View view) {
        androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener panelSlideListener = this.mPanelSlideListener;
        if (panelSlideListener != null) {
            panelSlideListener.onPanelClosed(view);
        }
        sendAccessibilityEvent(32);
    }

    void updateObscuredViewsVisibility(android.view.View view) {
        int left;
        int right;
        int top;
        int bottom;
        android.view.View childAt;
        android.view.View view2 = view;
        boolean zIsLayoutRtlSupport = isLayoutRtlSupport();
        int width = zIsLayoutRtlSupport ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zIsLayoutRtlSupport ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !viewIsOpaque(view)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount && (childAt = getChildAt(i)) != view2) {
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((java.lang.Math.max(zIsLayoutRtlSupport ? paddingLeft : width, childAt.getLeft()) < left || java.lang.Math.max(paddingTop, childAt.getTop()) < top || java.lang.Math.min(zIsLayoutRtlSupport ? width : paddingLeft, childAt.getRight()) > right || java.lang.Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i++;
            view2 = view;
            zIsLayoutRtlSupport = zIsLayoutRtlSupport;
        }
    }

    void setAllChildrenVisible() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    private static boolean viewIsOpaque(android.view.View view) {
        android.graphics.drawable.Drawable background;
        if (view.isOpaque()) {
            return true;
        }
        return android.os.Build.VERSION.SDK_INT < 18 && (background = view.getBackground()) != null && background.getOpacity() == -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
        int size = this.mPostedRunnables.size();
        for (int i = 0; i < size; i++) {
            this.mPostedRunnables.get(i).run();
        }
        this.mPostedRunnables.clear();
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3 A[PHI: r13
      0x00b3: PHI (r13v2 float) = (r13v1 float), (r13v3 float) binds: [B:35:0x00a8, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:60:0x0118  */
    /* JADX WARN: Code duplicated, block: B:63:0x0120  */
    /* JADX WARN: Code duplicated, block: B:72:0x0143  */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int paddingTop;
        int iMin;
        int i3;
        int iMakeMeasureSpec;
        int i4;
        int i5;
        int iMakeMeasureSpec2;
        int i6;
        int iMakeMeasureSpec3;
        int iMakeMeasureSpec4;
        int measuredHeight;
        boolean z;
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new java.lang.IllegalStateException("Width must have an exact value or MATCH_PARENT");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new java.lang.IllegalStateException("Height must not be UNSPECIFIED");
            }
            if (mode2 == 0) {
                mode2 = Integer.MIN_VALUE;
                size2 = 300;
            }
        }
        boolean z2 = false;
        if (mode2 == Integer.MIN_VALUE) {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        } else if (mode2 != 1073741824) {
            iMin = 0;
            paddingTop = 0;
        } else {
            iMin = (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            android.util.Log.e(TAG, "onMeasure: More than two child views are not supported.");
        }
        this.mSlideableView = null;
        int i7 = paddingLeft;
        int i8 = 0;
        boolean z3 = false;
        float f = 0.0f;
        while (true) {
            i3 = 8;
            if (i8 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i8);
            androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.dimWhenOffset = z2;
            } else if (layoutParams.weight > 0.0f) {
                f += layoutParams.weight;
                if (layoutParams.width != 0) {
                    i6 = layoutParams.leftMargin + layoutParams.rightMargin;
                    if (layoutParams.width == -2) {
                        iMakeMeasureSpec3 = android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft - i6, Integer.MIN_VALUE);
                    } else if (layoutParams.width == -1) {
                        iMakeMeasureSpec3 = android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft - i6, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                    } else {
                        iMakeMeasureSpec3 = android.view.View.MeasureSpec.makeMeasureSpec(layoutParams.width, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                    }
                    if (layoutParams.height == -2) {
                        iMakeMeasureSpec4 = android.view.View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                    } else if (layoutParams.height == -1) {
                        iMakeMeasureSpec4 = android.view.View.MeasureSpec.makeMeasureSpec(paddingTop, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                    } else {
                        iMakeMeasureSpec4 = android.view.View.MeasureSpec.makeMeasureSpec(layoutParams.height, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                    }
                    childAt.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    int measuredWidth = childAt.getMeasuredWidth();
                    measuredHeight = childAt.getMeasuredHeight();
                    if (mode2 == Integer.MIN_VALUE && measuredHeight > iMin) {
                        iMin = java.lang.Math.min(measuredHeight, paddingTop);
                    }
                    i7 -= measuredWidth;
                    if (i7 < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    layoutParams.slideable = z;
                    z3 |= z;
                    if (layoutParams.slideable) {
                        this.mSlideableView = childAt;
                    }
                }
            } else {
                i6 = layoutParams.leftMargin + layoutParams.rightMargin;
                if (layoutParams.width == -2) {
                    iMakeMeasureSpec3 = android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft - i6, Integer.MIN_VALUE);
                } else if (layoutParams.width == -1) {
                    iMakeMeasureSpec3 = android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft - i6, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                } else {
                    iMakeMeasureSpec3 = android.view.View.MeasureSpec.makeMeasureSpec(layoutParams.width, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                }
                if (layoutParams.height == -2) {
                    iMakeMeasureSpec4 = android.view.View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                } else if (layoutParams.height == -1) {
                    iMakeMeasureSpec4 = android.view.View.MeasureSpec.makeMeasureSpec(paddingTop, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                } else {
                    iMakeMeasureSpec4 = android.view.View.MeasureSpec.makeMeasureSpec(layoutParams.height, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                }
                childAt.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                int measuredWidth2 = childAt.getMeasuredWidth();
                measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == Integer.MIN_VALUE) {
                    iMin = java.lang.Math.min(measuredHeight, paddingTop);
                }
                i7 -= measuredWidth2;
                if (i7 < 0) {
                    z = true;
                } else {
                    z = false;
                }
                layoutParams.slideable = z;
                z3 |= z;
                if (layoutParams.slideable) {
                    this.mSlideableView = childAt;
                }
            }
            i8++;
            z2 = false;
        }
        if (z3 || f > 0.0f) {
            int i9 = paddingLeft - this.mOverhangSize;
            int i10 = 0;
            while (i10 < childCount) {
                android.view.View childAt2 = getChildAt(i10);
                if (childAt2.getVisibility() == i3) {
                    i4 = i9;
                } else {
                    androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams2 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i3) {
                        boolean z4 = layoutParams2.width == 0 && layoutParams2.weight > 0.0f;
                        int measuredWidth3 = z4 ? 0 : childAt2.getMeasuredWidth();
                        if (!z3 || childAt2 == this.mSlideableView) {
                            if (layoutParams2.weight > 0.0f) {
                                if (layoutParams2.width == 0) {
                                    if (layoutParams2.height == -2) {
                                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                    } else if (layoutParams2.height == -1) {
                                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(paddingTop, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                    } else {
                                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(layoutParams2.height, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                    }
                                } else {
                                    iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                }
                                if (z3) {
                                    int i11 = paddingLeft - (layoutParams2.leftMargin + layoutParams2.rightMargin);
                                    i4 = i9;
                                    int iMakeMeasureSpec5 = android.view.View.MeasureSpec.makeMeasureSpec(i11, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                    if (measuredWidth3 != i11) {
                                        childAt2.measure(iMakeMeasureSpec5, iMakeMeasureSpec);
                                    }
                                } else {
                                    i4 = i9;
                                    childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth3 + ((int) ((layoutParams2.weight * java.lang.Math.max(0, i7)) / f)), androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY), iMakeMeasureSpec);
                                }
                            }
                        } else if (layoutParams2.width < 0 && (measuredWidth3 > i9 || layoutParams2.weight > 0.0f)) {
                            if (z4) {
                                if (layoutParams2.height == -2) {
                                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                    i5 = androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY;
                                } else if (layoutParams2.height == -1) {
                                    i5 = androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY;
                                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(paddingTop, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                } else {
                                    i5 = androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY;
                                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(layoutParams2.height, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                }
                            } else {
                                i5 = androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY;
                                iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                            }
                            childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec(i9, i5), iMakeMeasureSpec2);
                        }
                        i4 = i9;
                    } else {
                        i4 = i9;
                    }
                }
                i10++;
                i9 = i4;
                i3 = 8;
            }
        }
        setMeasuredDimension(size, iMin + getPaddingTop() + getPaddingBottom());
        this.mCanSlide = z3;
        if (this.mDragHelper.getViewDragState() == 0 || z3) {
            return;
        }
        this.mDragHelper.abort();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean zIsLayoutRtlSupport = isLayoutRtlSupport();
        if (zIsLayoutRtlSupport) {
            this.mDragHelper.setEdgeTrackingEnabled(2);
        } else {
            this.mDragHelper.setEdgeTrackingEnabled(1);
        }
        int i9 = i3 - i;
        int paddingRight = zIsLayoutRtlSupport ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zIsLayoutRtlSupport ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.mFirstLayout) {
            this.mSlideOffset = (this.mCanSlide && this.mPreservedOpenState) ? 1.0f : 0.0f;
        }
        int i10 = paddingRight;
        for (int i11 = 0; i11 < childCount; i11++) {
            android.view.View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.slideable) {
                    int i12 = i9 - paddingLeft;
                    int iMin = (java.lang.Math.min(paddingRight, i12 - this.mOverhangSize) - i10) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.mSlideRange = iMin;
                    int i13 = zIsLayoutRtlSupport ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.dimWhenOffset = ((i10 + i13) + iMin) + (measuredWidth / 2) > i12;
                    int i14 = (int) (iMin * this.mSlideOffset);
                    i10 += i13 + i14;
                    this.mSlideOffset = i14 / this.mSlideRange;
                    i5 = 0;
                } else if (!this.mCanSlide || (i6 = this.mParallaxBy) == 0) {
                    i10 = paddingRight;
                    i5 = 0;
                } else {
                    i5 = (int) ((1.0f - this.mSlideOffset) * i6);
                    i10 = paddingRight;
                }
                if (zIsLayoutRtlSupport) {
                    i8 = (i9 - i10) + i5;
                    i7 = i8 - measuredWidth;
                } else {
                    i7 = i10 - i5;
                    i8 = i7 + measuredWidth;
                }
                childAt.layout(i7, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                paddingRight += childAt.getWidth();
            }
        }
        if (this.mFirstLayout) {
            if (this.mCanSlide) {
                if (this.mParallaxBy != 0) {
                    parallaxOtherViews(this.mSlideOffset);
                }
                if (((androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) this.mSlideableView.getLayoutParams()).dimWhenOffset) {
                    dimChildView(this.mSlideableView, this.mSlideOffset, this.mSliderFadeColor);
                }
            } else {
                for (int i15 = 0; i15 < childCount; i15++) {
                    dimChildView(getChildAt(i15), 0.0f, this.mSliderFadeColor);
                }
            }
            updateObscuredViewsVisibility(this.mSlideableView);
        }
        this.mFirstLayout = false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.mFirstLayout = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View view, android.view.View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.mCanSlide) {
            return;
        }
        this.mPreservedOpenState = view == this.mSlideableView;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        android.view.View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.mCanSlide && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.mPreservedOpenState = !this.mDragHelper.isViewUnder(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.mCanSlide || (this.mIsUnableToDrag && actionMasked != 0)) {
            this.mDragHelper.cancel();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.mDragHelper.cancel();
            return false;
        }
        if (actionMasked == 0) {
            this.mIsUnableToDrag = false;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.mInitialMotionX = x;
            this.mInitialMotionY = y;
            if (this.mDragHelper.isViewUnder(this.mSlideableView, (int) x, (int) y) && isDimmed(this.mSlideableView)) {
                z = true;
            }
            return this.mDragHelper.shouldInterceptTouchEvent(motionEvent) || z;
        }
        if (actionMasked == 2) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float fAbs = java.lang.Math.abs(x2 - this.mInitialMotionX);
            float fAbs2 = java.lang.Math.abs(y2 - this.mInitialMotionY);
            if (fAbs > this.mDragHelper.getTouchSlop() && fAbs2 > fAbs) {
                this.mDragHelper.cancel();
                this.mIsUnableToDrag = true;
                return false;
            }
        }
        z = false;
        if (this.mDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.mCanSlide) {
            return super.onTouchEvent(motionEvent);
        }
        this.mDragHelper.processTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.mInitialMotionX = x;
            this.mInitialMotionY = y;
        } else if (actionMasked == 1 && isDimmed(this.mSlideableView)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.mInitialMotionX;
            float f2 = y2 - this.mInitialMotionY;
            int touchSlop = this.mDragHelper.getTouchSlop();
            if ((f * f) + (f2 * f2) < touchSlop * touchSlop && this.mDragHelper.isViewUnder(this.mSlideableView, (int) x2, (int) y2)) {
                closePane(this.mSlideableView, 0);
            }
        }
        return true;
    }

    private boolean closePane(android.view.View view, int i) {
        if (!this.mFirstLayout && !smoothSlideTo(0.0f, i)) {
            return false;
        }
        this.mPreservedOpenState = false;
        return true;
    }

    private boolean openPane(android.view.View view, int i) {
        if (!this.mFirstLayout && !smoothSlideTo(1.0f, i)) {
            return false;
        }
        this.mPreservedOpenState = true;
        return true;
    }

    @java.lang.Deprecated
    public void smoothSlideOpen() {
        openPane();
    }

    public boolean openPane() {
        return openPane(this.mSlideableView, 0);
    }

    @java.lang.Deprecated
    public void smoothSlideClosed() {
        closePane();
    }

    public boolean closePane() {
        return closePane(this.mSlideableView, 0);
    }

    public boolean isOpen() {
        return !this.mCanSlide || this.mSlideOffset == 1.0f;
    }

    @java.lang.Deprecated
    public boolean canSlide() {
        return this.mCanSlide;
    }

    public boolean isSlideable() {
        return this.mCanSlide;
    }

    void onPanelDragged(int i) {
        if (this.mSlideableView == null) {
            this.mSlideOffset = 0.0f;
            return;
        }
        boolean zIsLayoutRtlSupport = isLayoutRtlSupport();
        androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) this.mSlideableView.getLayoutParams();
        int width = this.mSlideableView.getWidth();
        if (zIsLayoutRtlSupport) {
            i = (getWidth() - i) - width;
        }
        float paddingRight = (i - ((zIsLayoutRtlSupport ? getPaddingRight() : getPaddingLeft()) + (zIsLayoutRtlSupport ? layoutParams.rightMargin : layoutParams.leftMargin))) / this.mSlideRange;
        this.mSlideOffset = paddingRight;
        if (this.mParallaxBy != 0) {
            parallaxOtherViews(paddingRight);
        }
        if (layoutParams.dimWhenOffset) {
            dimChildView(this.mSlideableView, this.mSlideOffset, this.mSliderFadeColor);
        }
        dispatchOnPanelSlide(this.mSlideableView);
    }

    private void dimChildView(android.view.View view, float f, int i) {
        androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) ((((-16777216) & i) >>> 24) * f)) << 24) | (i & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK);
            if (layoutParams.dimPaint == null) {
                layoutParams.dimPaint = new android.graphics.Paint();
            }
            layoutParams.dimPaint.setColorFilter(new android.graphics.PorterDuffColorFilter(i2, android.graphics.PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.dimPaint);
            }
            invalidateChildRegion(view);
            return;
        }
        if (view.getLayerType() != 0) {
            if (layoutParams.dimPaint != null) {
                layoutParams.dimPaint.setColorFilter(null);
            }
            androidx.slidingpanelayout.widget.SlidingPaneLayout.DisableLayerRunnable disableLayerRunnable = new androidx.slidingpanelayout.widget.SlidingPaneLayout.DisableLayerRunnable(view);
            this.mPostedRunnables.add(disableLayerRunnable);
            androidx.core.view.ViewCompat.postOnAnimation(this, disableLayerRunnable);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.mCanSlide && !layoutParams.slideable && this.mSlideableView != null) {
            canvas.getClipBounds(this.mTmpRect);
            if (isLayoutRtlSupport()) {
                android.graphics.Rect rect = this.mTmpRect;
                rect.left = java.lang.Math.max(rect.left, this.mSlideableView.getRight());
            } else {
                android.graphics.Rect rect2 = this.mTmpRect;
                rect2.right = java.lang.Math.min(rect2.right, this.mSlideableView.getLeft());
            }
            canvas.clipRect(this.mTmpRect);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    void invalidateChildRegion(android.view.View view) {
        java.lang.reflect.Field field;
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            androidx.core.view.ViewCompat.setLayerPaint(view, ((androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams()).dimPaint);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            if (!this.mDisplayListReflectionLoaded) {
                try {
                    this.mGetDisplayList = android.view.View.class.getDeclaredMethod("getDisplayList", (java.lang.Class[]) null);
                } catch (java.lang.NoSuchMethodException e) {
                    android.util.Log.e(TAG, "Couldn't fetch getDisplayList method; dimming won't work right.", e);
                }
                try {
                    java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mRecreateDisplayList");
                    this.mRecreateDisplayList = declaredField;
                    declaredField.setAccessible(true);
                } catch (java.lang.NoSuchFieldException e2) {
                    android.util.Log.e(TAG, "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e2);
                }
                this.mDisplayListReflectionLoaded = true;
            }
            if (this.mGetDisplayList == null || (field = this.mRecreateDisplayList) == null) {
                view.invalidate();
                return;
            }
            try {
                field.setBoolean(view, true);
                this.mGetDisplayList.invoke(view, (java.lang.Object[]) null);
            } catch (java.lang.Exception e3) {
                android.util.Log.e(TAG, "Error refreshing display list state", e3);
            }
        }
        androidx.core.view.ViewCompat.postInvalidateOnAnimation(this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    boolean smoothSlideTo(float f, int i) {
        int paddingLeft;
        if (!this.mCanSlide) {
            return false;
        }
        boolean zIsLayoutRtlSupport = isLayoutRtlSupport();
        androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) this.mSlideableView.getLayoutParams();
        if (zIsLayoutRtlSupport) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + layoutParams.rightMargin) + (f * this.mSlideRange)) + this.mSlideableView.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + layoutParams.leftMargin + (f * this.mSlideRange));
        }
        androidx.customview.widget.ViewDragHelper viewDragHelper = this.mDragHelper;
        android.view.View view = this.mSlideableView;
        if (!viewDragHelper.smoothSlideViewTo(view, paddingLeft, view.getTop())) {
            return false;
        }
        setAllChildrenVisible();
        androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        return true;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mDragHelper.continueSettling(true)) {
            if (!this.mCanSlide) {
                this.mDragHelper.abort();
            } else {
                androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
            }
        }
    }

    @java.lang.Deprecated
    public void setShadowDrawable(android.graphics.drawable.Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(android.graphics.drawable.Drawable drawable) {
        this.mShadowDrawableLeft = drawable;
    }

    public void setShadowDrawableRight(android.graphics.drawable.Drawable drawable) {
        this.mShadowDrawableRight = drawable;
    }

    @java.lang.Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(androidx.core.content.ContextCompat.getDrawable(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(androidx.core.content.ContextCompat.getDrawable(getContext(), i));
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable;
        int i;
        int right;
        super.draw(canvas);
        if (isLayoutRtlSupport()) {
            drawable = this.mShadowDrawableRight;
        } else {
            drawable = this.mShadowDrawableLeft;
        }
        android.view.View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (isLayoutRtlSupport()) {
            right = childAt.getRight();
            i = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i2 = left - intrinsicWidth;
            i = left;
            right = i2;
        }
        drawable.setBounds(right, top, i, bottom);
        drawable.draw(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    private void parallaxOtherViews(float f) {
        boolean z;
        boolean zIsLayoutRtlSupport = isLayoutRtlSupport();
        androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) this.mSlideableView.getLayoutParams();
        if (!layoutParams.dimWhenOffset) {
            z = false;
        } else if ((zIsLayoutRtlSupport ? layoutParams.rightMargin : layoutParams.leftMargin) <= 0) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt != this.mSlideableView) {
                float f2 = 1.0f - this.mParallaxOffset;
                int i2 = this.mParallaxBy;
                this.mParallaxOffset = f;
                int i3 = ((int) (f2 * i2)) - ((int) ((1.0f - f) * i2));
                if (zIsLayoutRtlSupport) {
                    i3 = -i3;
                }
                childAt.offsetLeftAndRight(i3);
                if (z) {
                    float f3 = this.mParallaxOffset;
                    dimChildView(childAt, zIsLayoutRtlSupport ? f3 - 1.0f : 1.0f - f3, this.mCoveredFadeColor);
                }
            }
        }
    }

    protected boolean canScroll(android.view.View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z) {
            if (view.canScrollHorizontally(isLayoutRtlSupport() ? i : -i)) {
                return true;
            }
        }
        return false;
    }

    boolean isDimmed(android.view.View view) {
        if (view == null) {
            return false;
        }
        return this.mCanSlide && ((androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams()).dimWhenOffset && this.mSlideOffset > 0.0f;
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState savedState = new androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState(super.onSaveInstanceState());
        savedState.isOpen = isSlideable() ? isOpen() : this.mPreservedOpenState;
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState savedState = (androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.isOpen) {
            openPane();
        } else {
            closePane();
        }
        this.mPreservedOpenState = savedState.isOpen;
    }

    private class DragHelperCallback extends androidx.customview.widget.ViewDragHelper.Callback {
        DragHelperCallback() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(android.view.View view, int i) {
            if (androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mIsUnableToDrag) {
                return false;
            }
            return ((androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams()).slideable;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            if (androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mDragHelper.getViewDragState() == 0) {
                if (androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideOffset == 0.0f) {
                    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout = androidx.slidingpanelayout.widget.SlidingPaneLayout.this;
                    slidingPaneLayout.updateObscuredViewsVisibility(slidingPaneLayout.mSlideableView);
                    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout2 = androidx.slidingpanelayout.widget.SlidingPaneLayout.this;
                    slidingPaneLayout2.dispatchOnPanelClosed(slidingPaneLayout2.mSlideableView);
                    androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mPreservedOpenState = false;
                    return;
                }
                androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout3 = androidx.slidingpanelayout.widget.SlidingPaneLayout.this;
                slidingPaneLayout3.dispatchOnPanelOpened(slidingPaneLayout3.mSlideableView);
                androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mPreservedOpenState = true;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(android.view.View view, int i) {
            androidx.slidingpanelayout.widget.SlidingPaneLayout.this.setAllChildrenVisible();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(android.view.View view, int i, int i2, int i3, int i4) {
            androidx.slidingpanelayout.widget.SlidingPaneLayout.this.onPanelDragged(i);
            androidx.slidingpanelayout.widget.SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(android.view.View view, float f, float f2) {
            int paddingLeft;
            androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams();
            if (androidx.slidingpanelayout.widget.SlidingPaneLayout.this.isLayoutRtlSupport()) {
                int paddingRight = androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin;
                if (f < 0.0f || (f == 0.0f && androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideOffset > 0.5f)) {
                    paddingRight += androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideRange;
                }
                paddingLeft = (androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getWidth() - paddingRight) - androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideableView.getWidth();
            } else {
                paddingLeft = layoutParams.leftMargin + androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideOffset > 0.5f)) {
                    paddingLeft += androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideRange;
                }
            }
            androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mDragHelper.settleCapturedViewAt(paddingLeft, view.getTop());
            androidx.slidingpanelayout.widget.SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(android.view.View view) {
            return androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideRange;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(android.view.View view, int i, int i2) {
            androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideableView.getLayoutParams();
            if (androidx.slidingpanelayout.widget.SlidingPaneLayout.this.isLayoutRtlSupport()) {
                int width = androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getWidth() - ((androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin) + androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideableView.getWidth());
                return java.lang.Math.max(java.lang.Math.min(i, width), width - androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideRange);
            }
            int paddingLeft = androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getPaddingLeft() + layoutParams.leftMargin;
            return java.lang.Math.min(java.lang.Math.max(i, paddingLeft), androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideRange + paddingLeft);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(android.view.View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int i, int i2) {
            androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mDragHelper.captureChildView(androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mSlideableView, i2);
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        private static final int[] ATTRS = {android.R.attr.layout_weight};
        android.graphics.Paint dimPaint;
        boolean dimWhenOffset;
        boolean slideable;
        public float weight;

        public LayoutParams() {
            super(-1, -1);
            this.weight = 0.0f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.weight = 0.0f;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams) {
            super((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            this.weight = 0.0f;
            this.weight = layoutParams.weight;
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.weight = 0.0f;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS);
            this.weight = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState>() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState[] newArray(int i) {
                return new androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState[i];
            }
        };
        boolean isOpen;

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.isOpen = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.isOpen ? 1 : 0);
        }
    }

    class AccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        private final android.graphics.Rect mTmpRect = new android.graphics.Rect();

        AccessibilityDelegate() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompatObtain);
            copyNodeInfoNoChildren(accessibilityNodeInfoCompat, accessibilityNodeInfoCompatObtain);
            accessibilityNodeInfoCompatObtain.recycle();
            accessibilityNodeInfoCompat.setClassName(androidx.slidingpanelayout.widget.SlidingPaneLayout.class.getName());
            accessibilityNodeInfoCompat.setSource(view);
            java.lang.Object parentForAccessibility = androidx.core.view.ViewCompat.getParentForAccessibility(view);
            if (parentForAccessibility instanceof android.view.View) {
                accessibilityNodeInfoCompat.setParent((android.view.View) parentForAccessibility);
            }
            int childCount = androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getChildAt(i);
                if (!filter(childAt) && childAt.getVisibility() == 0) {
                    androidx.core.view.ViewCompat.setImportantForAccessibility(childAt, 1);
                    accessibilityNodeInfoCompat.addChild(childAt);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(androidx.slidingpanelayout.widget.SlidingPaneLayout.class.getName());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            if (filter(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public boolean filter(android.view.View view) {
            return androidx.slidingpanelayout.widget.SlidingPaneLayout.this.isDimmed(view);
        }

        private void copyNodeInfoNoChildren(androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
            android.graphics.Rect rect = this.mTmpRect;
            accessibilityNodeInfoCompat2.getBoundsInParent(rect);
            accessibilityNodeInfoCompat.setBoundsInParent(rect);
            accessibilityNodeInfoCompat2.getBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setVisibleToUser(accessibilityNodeInfoCompat2.isVisibleToUser());
            accessibilityNodeInfoCompat.setPackageName(accessibilityNodeInfoCompat2.getPackageName());
            accessibilityNodeInfoCompat.setClassName(accessibilityNodeInfoCompat2.getClassName());
            accessibilityNodeInfoCompat.setContentDescription(accessibilityNodeInfoCompat2.getContentDescription());
            accessibilityNodeInfoCompat.setEnabled(accessibilityNodeInfoCompat2.isEnabled());
            accessibilityNodeInfoCompat.setClickable(accessibilityNodeInfoCompat2.isClickable());
            accessibilityNodeInfoCompat.setFocusable(accessibilityNodeInfoCompat2.isFocusable());
            accessibilityNodeInfoCompat.setFocused(accessibilityNodeInfoCompat2.isFocused());
            accessibilityNodeInfoCompat.setAccessibilityFocused(accessibilityNodeInfoCompat2.isAccessibilityFocused());
            accessibilityNodeInfoCompat.setSelected(accessibilityNodeInfoCompat2.isSelected());
            accessibilityNodeInfoCompat.setLongClickable(accessibilityNodeInfoCompat2.isLongClickable());
            accessibilityNodeInfoCompat.addAction(accessibilityNodeInfoCompat2.getActions());
            accessibilityNodeInfoCompat.setMovementGranularities(accessibilityNodeInfoCompat2.getMovementGranularities());
        }
    }

    private class DisableLayerRunnable implements java.lang.Runnable {
        final android.view.View mChildView;

        DisableLayerRunnable(android.view.View view) {
            this.mChildView = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mChildView.getParent() == androidx.slidingpanelayout.widget.SlidingPaneLayout.this) {
                this.mChildView.setLayerType(0, null);
                androidx.slidingpanelayout.widget.SlidingPaneLayout.this.invalidateChildRegion(this.mChildView);
            }
            androidx.slidingpanelayout.widget.SlidingPaneLayout.this.mPostedRunnables.remove(this);
        }
    }

    boolean isLayoutRtlSupport() {
        return androidx.core.view.ViewCompat.getLayoutDirection(this) == 1;
    }
}
