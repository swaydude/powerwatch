package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends androidx.appcompat.widget.Toolbar {
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(android.content.Context context) {
        this(context, null);
    }

    public MaterialToolbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.toolbarStyle);
    }

    public MaterialToolbar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(com.google.android.material.internal.ThemeEnforcement.createThemedContext(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
        initBackground(getContext());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.shape.MaterialShapeUtils.setElevation(this, f);
    }

    private void initBackground(android.content.Context context) {
        android.graphics.drawable.Drawable background = getBackground();
        if (background == null || (background instanceof android.graphics.drawable.ColorDrawable)) {
            com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(android.content.res.ColorStateList.valueOf(background != null ? ((android.graphics.drawable.ColorDrawable) background).getColor() : 0));
            materialShapeDrawable.initializeElevationOverlay(context);
            materialShapeDrawable.setElevation(androidx.core.view.ViewCompat.getElevation(this));
            androidx.core.view.ViewCompat.setBackground(this, materialShapeDrawable);
        }
    }
}
