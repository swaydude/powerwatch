package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class GhostViewApi14 extends android.view.View implements androidx.transition.GhostViewImpl {
    android.graphics.Matrix mCurrentMatrix;
    private int mDeltaX;
    private int mDeltaY;
    private final android.graphics.Matrix mMatrix;
    private final android.view.ViewTreeObserver.OnPreDrawListener mOnPreDrawListener;
    int mReferences;
    android.view.ViewGroup mStartParent;
    android.view.View mStartView;
    final android.view.View mView;

    static androidx.transition.GhostViewImpl addGhost(android.view.View view, android.view.ViewGroup viewGroup) {
        androidx.transition.GhostViewApi14 ghostView = getGhostView(view);
        if (ghostView == null) {
            android.widget.FrameLayout frameLayoutFindFrameLayout = findFrameLayout(viewGroup);
            if (frameLayoutFindFrameLayout == null) {
                return null;
            }
            ghostView = new androidx.transition.GhostViewApi14(view);
            frameLayoutFindFrameLayout.addView(ghostView);
        }
        ghostView.mReferences++;
        return ghostView;
    }

    static void removeGhost(android.view.View view) {
        androidx.transition.GhostViewApi14 ghostView = getGhostView(view);
        if (ghostView != null) {
            int i = ghostView.mReferences - 1;
            ghostView.mReferences = i;
            if (i <= 0) {
                android.view.ViewParent parent = ghostView.getParent();
                if (parent instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                    viewGroup.endViewTransition(ghostView);
                    viewGroup.removeView(ghostView);
                }
            }
        }
    }

    private static android.widget.FrameLayout findFrameLayout(android.view.ViewGroup viewGroup) {
        while (!(viewGroup instanceof android.widget.FrameLayout)) {
            android.view.ViewParent parent = viewGroup.getParent();
            if (!(parent instanceof android.view.ViewGroup)) {
                return null;
            }
            viewGroup = (android.view.ViewGroup) parent;
        }
        return (android.widget.FrameLayout) viewGroup;
    }

    GhostViewApi14(android.view.View view) {
        super(view.getContext());
        this.mMatrix = new android.graphics.Matrix();
        this.mOnPreDrawListener = new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: androidx.transition.GhostViewApi14.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                androidx.transition.GhostViewApi14 ghostViewApi14 = androidx.transition.GhostViewApi14.this;
                ghostViewApi14.mCurrentMatrix = ghostViewApi14.mView.getMatrix();
                androidx.core.view.ViewCompat.postInvalidateOnAnimation(androidx.transition.GhostViewApi14.this);
                if (androidx.transition.GhostViewApi14.this.mStartParent == null || androidx.transition.GhostViewApi14.this.mStartView == null) {
                    return true;
                }
                androidx.transition.GhostViewApi14.this.mStartParent.endViewTransition(androidx.transition.GhostViewApi14.this.mStartView);
                androidx.core.view.ViewCompat.postInvalidateOnAnimation(androidx.transition.GhostViewApi14.this.mStartParent);
                androidx.transition.GhostViewApi14.this.mStartParent = null;
                androidx.transition.GhostViewApi14.this.mStartView = null;
                return true;
            }
        };
        this.mView = view;
        setLayerType(2, null);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setGhostView(this.mView, this);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr);
        this.mView.getLocationOnScreen(iArr2);
        iArr2[0] = (int) (iArr2[0] - this.mView.getTranslationX());
        iArr2[1] = (int) (iArr2[1] - this.mView.getTranslationY());
        this.mDeltaX = iArr2[0] - iArr[0];
        this.mDeltaY = iArr2[1] - iArr[1];
        this.mView.getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        this.mView.setVisibility(4);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        this.mView.getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        this.mView.setVisibility(0);
        setGhostView(this.mView, null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        this.mMatrix.set(this.mCurrentMatrix);
        this.mMatrix.postTranslate(this.mDeltaX, this.mDeltaY);
        canvas.setMatrix(this.mMatrix);
        this.mView.draw(canvas);
    }

    @Override // android.view.View, androidx.transition.GhostViewImpl
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.mView.setVisibility(i == 0 ? 4 : 0);
    }

    @Override // androidx.transition.GhostViewImpl
    public void reserveEndViewTransition(android.view.ViewGroup viewGroup, android.view.View view) {
        this.mStartParent = viewGroup;
        this.mStartView = view;
    }

    private static void setGhostView(android.view.View view, androidx.transition.GhostViewApi14 ghostViewApi14) {
        view.setTag(androidx.transition.R.id.ghost_view, ghostViewApi14);
    }

    static androidx.transition.GhostViewApi14 getGhostView(android.view.View view) {
        return (androidx.transition.GhostViewApi14) view.getTag(androidx.transition.R.id.ghost_view);
    }
}
