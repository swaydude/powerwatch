package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class Group extends androidx.constraintlayout.widget.ConstraintHelper {
    public Group(android.content.Context context) {
        super(context);
    }

    public Group(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void init(android.util.AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePreLayout(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = android.os.Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        if (this.mReferenceIds != null) {
            setIds(this.mReferenceIds);
        }
        for (int i = 0; i < this.mCount; i++) {
            android.view.View viewById = constraintLayout.getViewById(this.mIds[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f && android.os.Build.VERSION.SDK_INT >= 21) {
                    viewById.setElevation(elevation);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePostLayout(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.widget.setWidth(0);
        layoutParams.widget.setHeight(0);
    }
}
