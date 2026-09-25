package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes.dex */
abstract class HeaderBehavior<V extends android.view.View> extends com.google.android.material.appbar.ViewOffsetBehavior<V> {
    private static final int INVALID_POINTER = -1;
    private int activePointerId;
    private java.lang.Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    android.widget.OverScroller scroller;
    private int touchSlop;
    private android.view.VelocityTracker velocityTracker;

    boolean canDragView(V v) {
        return false;
    }

    void onFlingFinished(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v) {
    }

    public HeaderBehavior() {
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    public HeaderBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.MotionEvent motionEvent) {
        android.view.VelocityTracker velocityTracker;
        int iFindPointerIndex;
        if (this.touchSlop < 0) {
            this.touchSlop = android.view.ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.isBeingDragged) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.isBeingDragged = false;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (canDragView(v) && coordinatorLayout.isPointInChildBounds(v, x, y)) {
                this.lastMotionY = y;
                this.activePointerId = motionEvent.getPointerId(0);
                ensureVelocityTracker();
            }
        } else if (actionMasked == 1) {
            this.isBeingDragged = false;
            this.activePointerId = -1;
            velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.velocityTracker = null;
            }
        } else if (actionMasked == 2) {
            int i = this.activePointerId;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (java.lang.Math.abs(y2 - this.lastMotionY) > this.touchSlop) {
                    this.isBeingDragged = true;
                    this.lastMotionY = y2;
                }
            }
        } else if (actionMasked == 3) {
            this.isBeingDragged = false;
            this.activePointerId = -1;
            velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.velocityTracker = null;
            }
        }
        android.view.VelocityTracker velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return this.isBeingDragged;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.MotionEvent motionEvent) {
        if (this.touchSlop < 0) {
            this.touchSlop = android.view.ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (!coordinatorLayout.isPointInChildBounds(v, x, y) || !canDragView(v)) {
                return false;
            }
            this.lastMotionY = y;
            this.activePointerId = motionEvent.getPointerId(0);
            ensureVelocityTracker();
        } else {
            if (actionMasked == 1) {
                android.view.VelocityTracker velocityTracker = this.velocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.velocityTracker.computeCurrentVelocity(1000);
                    fling(coordinatorLayout, v, -getScrollRangeForDragFling(v), 0, this.velocityTracker.getYVelocity(this.activePointerId));
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.activePointerId);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                int i = this.lastMotionY - y2;
                if (!this.isBeingDragged) {
                    int iAbs = java.lang.Math.abs(i);
                    int i2 = this.touchSlop;
                    if (iAbs > i2) {
                        this.isBeingDragged = true;
                        i = i > 0 ? i - i2 : i + i2;
                    }
                }
                int i3 = i;
                if (this.isBeingDragged) {
                    this.lastMotionY = y2;
                    scroll(coordinatorLayout, v, i3, getMaxDragOffset(v), 0);
                }
            } else if (actionMasked == 3) {
            }
            this.isBeingDragged = false;
            this.activePointerId = -1;
            android.view.VelocityTracker velocityTracker2 = this.velocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.velocityTracker = null;
            }
        }
        android.view.VelocityTracker velocityTracker3 = this.velocityTracker;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
        }
        return true;
    }

    int setHeaderTopBottomOffset(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i) {
        return setHeaderTopBottomOffset(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int setHeaderTopBottomOffset(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int iClamp;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i2 == 0 || topAndBottomOffset < i2 || topAndBottomOffset > i3 || topAndBottomOffset == (iClamp = androidx.core.math.MathUtils.clamp(i, i2, i3))) {
            return 0;
        }
        setTopAndBottomOffset(iClamp);
        return topAndBottomOffset - iClamp;
    }

    int getTopBottomOffsetForScrollingSibling() {
        return getTopAndBottomOffset();
    }

    final int scroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return setHeaderTopBottomOffset(coordinatorLayout, v, getTopBottomOffsetForScrollingSibling() - i, i2, i3);
    }

    final boolean fling(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        java.lang.Runnable runnable = this.flingRunnable;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.flingRunnable = null;
        }
        if (this.scroller == null) {
            this.scroller = new android.widget.OverScroller(v.getContext());
        }
        this.scroller.fling(0, getTopAndBottomOffset(), 0, java.lang.Math.round(f), 0, 0, i, i2);
        if (this.scroller.computeScrollOffset()) {
            com.google.android.material.appbar.HeaderBehavior.FlingRunnable flingRunnable = new com.google.android.material.appbar.HeaderBehavior.FlingRunnable(coordinatorLayout, v);
            this.flingRunnable = flingRunnable;
            androidx.core.view.ViewCompat.postOnAnimation(v, flingRunnable);
            return true;
        }
        onFlingFinished(coordinatorLayout, v);
        return false;
    }

    int getMaxDragOffset(V v) {
        return -v.getHeight();
    }

    int getScrollRangeForDragFling(V v) {
        return v.getHeight();
    }

    private void ensureVelocityTracker() {
        if (this.velocityTracker == null) {
            this.velocityTracker = android.view.VelocityTracker.obtain();
        }
    }

    private class FlingRunnable implements java.lang.Runnable {
        private final V layout;
        private final androidx.coordinatorlayout.widget.CoordinatorLayout parent;

        FlingRunnable(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v) {
            this.parent = coordinatorLayout;
            this.layout = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.layout == null || com.google.android.material.appbar.HeaderBehavior.this.scroller == null) {
                return;
            }
            if (com.google.android.material.appbar.HeaderBehavior.this.scroller.computeScrollOffset()) {
                com.google.android.material.appbar.HeaderBehavior headerBehavior = com.google.android.material.appbar.HeaderBehavior.this;
                headerBehavior.setHeaderTopBottomOffset(this.parent, this.layout, headerBehavior.scroller.getCurrY());
                androidx.core.view.ViewCompat.postOnAnimation(this.layout, this);
                return;
            }
            com.google.android.material.appbar.HeaderBehavior.this.onFlingFinished(this.parent, this.layout);
        }
    }
}
