package com.google.maps.android.ui;

/* JADX INFO: loaded from: classes2.dex */
class BubbleDrawable extends android.graphics.drawable.Drawable {
    private int mColor = -1;
    private final android.graphics.drawable.Drawable mMask;
    private final android.graphics.drawable.Drawable mShadow;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public BubbleDrawable(android.content.res.Resources resources) {
        this.mMask = resources.getDrawable(com.google.maps.android.R.drawable.amu_bubble_mask);
        this.mShadow = resources.getDrawable(com.google.maps.android.R.drawable.amu_bubble_shadow);
    }

    public void setColor(int i) {
        this.mColor = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        this.mMask.draw(canvas);
        canvas.drawColor(this.mColor, android.graphics.PorterDuff.Mode.SRC_IN);
        this.mShadow.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        this.mMask.setBounds(i, i2, i3, i4);
        this.mShadow.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(android.graphics.Rect rect) {
        this.mMask.setBounds(rect);
        this.mShadow.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect rect) {
        return this.mMask.getPadding(rect);
    }
}
