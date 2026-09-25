package com.google.maps.android.ui;

/* JADX INFO: loaded from: classes2.dex */
public class SquareTextView extends android.widget.TextView {
    private int mOffsetLeft;
    private int mOffsetTop;

    public SquareTextView(android.content.Context context) {
        super(context);
        this.mOffsetTop = 0;
        this.mOffsetLeft = 0;
    }

    public SquareTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOffsetTop = 0;
        this.mOffsetLeft = 0;
    }

    public SquareTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mOffsetTop = 0;
        this.mOffsetLeft = 0;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iMax = java.lang.Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.mOffsetTop = measuredWidth - measuredHeight;
            this.mOffsetLeft = 0;
        } else {
            this.mOffsetTop = 0;
            this.mOffsetLeft = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(iMax, iMax);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        canvas.translate(this.mOffsetLeft / 2, this.mOffsetTop / 2);
        super.draw(canvas);
    }
}
