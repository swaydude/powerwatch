package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class Constraints extends android.view.ViewGroup {
    public static final java.lang.String TAG = "Constraints";
    androidx.constraintlayout.widget.ConstraintSet myConstraintSet;

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public Constraints(android.content.Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Constraints(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
        super.setVisibility(8);
    }

    public Constraints(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public androidx.constraintlayout.widget.Constraints.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.constraintlayout.widget.Constraints.LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends androidx.constraintlayout.widget.ConstraintLayout.LayoutParams {
        public float alpha;
        public boolean applyElevation;
        public float elevation;
        public float rotation;
        public float rotationX;
        public float rotationY;
        public float scaleX;
        public float scaleY;
        public float transformPivotX;
        public float transformPivotY;
        public float translationX;
        public float translationY;
        public float translationZ;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.alpha = 1.0f;
            this.applyElevation = false;
            this.elevation = 0.0f;
            this.rotation = 0.0f;
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = 0.0f;
            this.transformPivotY = 0.0f;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
            this.translationZ = 0.0f;
        }

        public LayoutParams(androidx.constraintlayout.widget.Constraints.LayoutParams layoutParams) {
            super((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams);
            this.alpha = 1.0f;
            this.applyElevation = false;
            this.elevation = 0.0f;
            this.rotation = 0.0f;
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = 0.0f;
            this.transformPivotY = 0.0f;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
            this.translationZ = 0.0f;
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.alpha = 1.0f;
            this.applyElevation = false;
            this.elevation = 0.0f;
            this.rotation = 0.0f;
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = 0.0f;
            this.transformPivotY = 0.0f;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
            this.translationZ = 0.0f;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.ConstraintSet);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_alpha) {
                    this.alpha = typedArrayObtainStyledAttributes.getFloat(index, this.alpha);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_elevation) {
                    if (android.os.Build.VERSION.SDK_INT >= 21) {
                        this.elevation = typedArrayObtainStyledAttributes.getFloat(index, this.elevation);
                        this.applyElevation = true;
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_rotationX) {
                    this.rotationX = typedArrayObtainStyledAttributes.getFloat(index, this.rotationX);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_rotationY) {
                    this.rotationY = typedArrayObtainStyledAttributes.getFloat(index, this.rotationY);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_rotation) {
                    this.rotation = typedArrayObtainStyledAttributes.getFloat(index, this.rotation);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_scaleX) {
                    this.scaleX = typedArrayObtainStyledAttributes.getFloat(index, this.scaleX);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_scaleY) {
                    this.scaleY = typedArrayObtainStyledAttributes.getFloat(index, this.scaleY);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_transformPivotX) {
                    this.transformPivotX = typedArrayObtainStyledAttributes.getFloat(index, this.transformPivotX);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_transformPivotY) {
                    this.transformPivotY = typedArrayObtainStyledAttributes.getFloat(index, this.transformPivotY);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_translationX) {
                    this.translationX = typedArrayObtainStyledAttributes.getFloat(index, this.translationX);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_translationY) {
                    this.translationY = typedArrayObtainStyledAttributes.getFloat(index, this.translationY);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_translationZ && android.os.Build.VERSION.SDK_INT >= 21) {
                    this.translationZ = typedArrayObtainStyledAttributes.getFloat(index, this.translationZ);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public androidx.constraintlayout.widget.Constraints.LayoutParams generateDefaultLayoutParams() {
        return new androidx.constraintlayout.widget.Constraints.LayoutParams(-2, -2);
    }

    private void init(android.util.AttributeSet attributeSet) {
        android.util.Log.v(TAG, " ################# init");
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(layoutParams);
    }

    public androidx.constraintlayout.widget.ConstraintSet getConstraintSet() {
        if (this.myConstraintSet == null) {
            this.myConstraintSet = new androidx.constraintlayout.widget.ConstraintSet();
        }
        this.myConstraintSet.clone(this);
        return this.myConstraintSet;
    }
}
