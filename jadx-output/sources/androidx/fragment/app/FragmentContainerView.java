package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends android.widget.FrameLayout {
    private java.util.ArrayList<android.view.View> mDisappearingFragmentChildren;
    private boolean mDrawDisappearingViewsFirst;
    private java.util.ArrayList<android.view.View> mTransitioningFragmentViews;

    public FragmentContainerView(android.content.Context context) {
        super(context);
        this.mDrawDisappearingViewsFirst = true;
    }

    public FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDrawDisappearingViewsFirst = true;
        throw new java.lang.UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to be instantiated from XML.");
    }

    public FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDrawDisappearingViewsFirst = true;
        throw new java.lang.UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to be instantiated from XML.");
    }

    FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet, androidx.fragment.app.FragmentManager fragmentManager) {
        java.lang.String str;
        super(context, attributeSet);
        this.mDrawDisappearingViewsFirst = true;
        java.lang.String classAttribute = attributeSet.getClassAttribute();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.fragment.R.styleable.FragmentContainerView);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(androidx.fragment.R.styleable.FragmentContainerView_android_name) : classAttribute;
        java.lang.String string = typedArrayObtainStyledAttributes.getString(androidx.fragment.R.styleable.FragmentContainerView_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        androidx.fragment.app.Fragment fragmentFindFragmentById = fragmentManager.findFragmentById(id);
        if (classAttribute == null || fragmentFindFragmentById != null) {
            return;
        }
        if (id <= 0) {
            if (string != null) {
                str = " with tag " + string;
            } else {
                str = "";
            }
            throw new java.lang.IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
        }
        androidx.fragment.app.Fragment fragmentInstantiate = fragmentManager.getFragmentFactory().instantiate(context.getClassLoader(), classAttribute);
        fragmentInstantiate.onInflate(context, attributeSet, (android.os.Bundle) null);
        fragmentManager.beginTransaction().setReorderingAllowed(true).add(this, fragmentInstantiate, string).commitNowAllowingStateLoss();
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(android.animation.LayoutTransition layoutTransition) {
        if (android.os.Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new java.lang.UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).dispatchApplyWindowInsets(new android.view.WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        if (this.mDrawDisappearingViewsFirst && this.mDisappearingFragmentChildren != null) {
            for (int i = 0; i < this.mDisappearingFragmentChildren.size(); i++) {
                super.drawChild(canvas, this.mDisappearingFragmentChildren.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        java.util.ArrayList<android.view.View> arrayList;
        if (!this.mDrawDisappearingViewsFirst || (arrayList = this.mDisappearingFragmentChildren) == null || arrayList.size() <= 0 || !this.mDisappearingFragmentChildren.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(android.view.View view) {
        if (view.getParent() == this) {
            if (this.mTransitioningFragmentViews == null) {
                this.mTransitioningFragmentViews = new java.util.ArrayList<>();
            }
            this.mTransitioningFragmentViews.add(view);
        }
        super.startViewTransition(view);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(android.view.View view) {
        java.util.ArrayList<android.view.View> arrayList = this.mTransitioningFragmentViews;
        if (arrayList != null) {
            arrayList.remove(view);
            java.util.ArrayList<android.view.View> arrayList2 = this.mDisappearingFragmentChildren;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.mDrawDisappearingViewsFirst = true;
            }
        }
        super.endViewTransition(view);
    }

    void setDrawDisappearingViewsLast(boolean z) {
        this.mDrawDisappearingViewsFirst = z;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (androidx.fragment.app.FragmentManager.getViewFragment(view) == null) {
            throw new java.lang.IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams, boolean z) {
        if (androidx.fragment.app.FragmentManager.getViewFragment(view) == null) {
            throw new java.lang.IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
        }
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        addDisappearingFragmentView(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(android.view.View view) {
        addDisappearingFragmentView(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        addDisappearingFragmentView(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            addDisappearingFragmentView(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            addDisappearingFragmentView(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            addDisappearingFragmentView(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(android.view.View view, boolean z) {
        if (z) {
            addDisappearingFragmentView(view);
        }
        super.removeDetachedView(view, z);
    }

    private void addDisappearingFragmentView(android.view.View view) {
        java.util.ArrayList<android.view.View> arrayList;
        if (view.getAnimation() != null || ((arrayList = this.mTransitioningFragmentViews) != null && arrayList.contains(view))) {
            if (this.mDisappearingFragmentChildren == null) {
                this.mDisappearingFragmentChildren = new java.util.ArrayList<>();
            }
            this.mDisappearingFragmentChildren.add(view);
        }
    }
}
