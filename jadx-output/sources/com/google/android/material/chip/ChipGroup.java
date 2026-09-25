package com.google.android.material.chip;

/* JADX INFO: loaded from: classes.dex */
public class ChipGroup extends com.google.android.material.internal.FlowLayout {
    private int checkedId;
    private final com.google.android.material.chip.ChipGroup.CheckedStateTracker checkedStateTracker;
    private int chipSpacingHorizontal;
    private int chipSpacingVertical;
    private com.google.android.material.chip.ChipGroup.OnCheckedChangeListener onCheckedChangeListener;
    private com.google.android.material.chip.ChipGroup.PassThroughHierarchyChangeListener passThroughListener;
    private boolean protectFromCheckedChange;
    private boolean singleSelection;

    public interface OnCheckedChangeListener {
        void onCheckedChanged(com.google.android.material.chip.ChipGroup chipGroup, int i);
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ChipGroup(android.content.Context context) {
        this(context, null);
    }

    public ChipGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.chipGroupStyle);
    }

    public ChipGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.checkedStateTracker = new com.google.android.material.chip.ChipGroup.CheckedStateTracker();
        this.passThroughListener = new com.google.android.material.chip.ChipGroup.PassThroughHierarchyChangeListener();
        this.checkedId = -1;
        this.protectFromCheckedChange = false;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context, attributeSet, com.google.android.material.R.styleable.ChipGroup, i, com.google.android.material.R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.ChipGroup_singleLine, false));
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.ChipGroup_singleSelection, false));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.checkedId = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        super.setOnHierarchyChangeListener(this.passThroughListener);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.google.android.material.chip.ChipGroup.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new com.google.android.material.chip.ChipGroup.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.google.android.material.chip.ChipGroup.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof com.google.android.material.chip.ChipGroup.LayoutParams);
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.passThroughListener.onHierarchyChangeListener = onHierarchyChangeListener;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.checkedId;
        if (i != -1) {
            setCheckedStateForView(i, true);
            setCheckedId(this.checkedId);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view instanceof com.google.android.material.chip.Chip) {
            com.google.android.material.chip.Chip chip = (com.google.android.material.chip.Chip) view;
            if (chip.isChecked()) {
                int i2 = this.checkedId;
                if (i2 != -1 && this.singleSelection) {
                    setCheckedStateForView(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    @java.lang.Deprecated
    public void setDividerDrawableHorizontal(android.graphics.drawable.Drawable drawable) {
        throw new java.lang.UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @java.lang.Deprecated
    public void setDividerDrawableVertical(android.graphics.drawable.Drawable drawable) {
        throw new java.lang.UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @java.lang.Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new java.lang.UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @java.lang.Deprecated
    public void setShowDividerVertical(int i) {
        throw new java.lang.UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @java.lang.Deprecated
    public void setFlexWrap(int i) {
        throw new java.lang.UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void check(int i) {
        int i2 = this.checkedId;
        if (i == i2) {
            return;
        }
        if (i2 != -1 && this.singleSelection) {
            setCheckedStateForView(i2, false);
        }
        if (i != -1) {
            setCheckedStateForView(i, true);
        }
        setCheckedId(i);
    }

    public int getCheckedChipId() {
        if (this.singleSelection) {
            return this.checkedId;
        }
        return -1;
    }

    public void clearCheck() {
        this.protectFromCheckedChange = true;
        for (int i = 0; i < getChildCount(); i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt instanceof com.google.android.material.chip.Chip) {
                ((com.google.android.material.chip.Chip) childAt).setChecked(false);
            }
        }
        this.protectFromCheckedChange = false;
        setCheckedId(-1);
    }

    public void setOnCheckedChangeListener(com.google.android.material.chip.ChipGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.checkedId = i;
        com.google.android.material.chip.ChipGroup.OnCheckedChangeListener onCheckedChangeListener = this.onCheckedChangeListener;
        if (onCheckedChangeListener == null || !this.singleSelection) {
            return;
        }
        onCheckedChangeListener.onCheckedChanged(this, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedStateForView(int i, boolean z) {
        android.view.View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof com.google.android.material.chip.Chip) {
            this.protectFromCheckedChange = true;
            ((com.google.android.material.chip.Chip) viewFindViewById).setChecked(z);
            this.protectFromCheckedChange = false;
        }
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public int getChipSpacingHorizontal() {
        return this.chipSpacingHorizontal;
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.chipSpacingHorizontal != i) {
            this.chipSpacingHorizontal = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public int getChipSpacingVertical() {
        return this.chipSpacingVertical;
    }

    public void setChipSpacingVertical(int i) {
        if (this.chipSpacingVertical != i) {
            this.chipSpacingVertical = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean isSingleLine() {
        return super.isSingleLine();
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void setSingleSelection(boolean z) {
        if (this.singleSelection != z) {
            this.singleSelection = z;
            clearCheck();
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    private class CheckedStateTracker implements android.widget.CompoundButton.OnCheckedChangeListener {
        private CheckedStateTracker() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
            if (com.google.android.material.chip.ChipGroup.this.protectFromCheckedChange) {
                return;
            }
            int id = compoundButton.getId();
            if (z) {
                if (com.google.android.material.chip.ChipGroup.this.checkedId != -1 && com.google.android.material.chip.ChipGroup.this.checkedId != id && com.google.android.material.chip.ChipGroup.this.singleSelection) {
                    com.google.android.material.chip.ChipGroup chipGroup = com.google.android.material.chip.ChipGroup.this;
                    chipGroup.setCheckedStateForView(chipGroup.checkedId, false);
                }
                com.google.android.material.chip.ChipGroup.this.setCheckedId(id);
                return;
            }
            if (com.google.android.material.chip.ChipGroup.this.checkedId == id) {
                com.google.android.material.chip.ChipGroup.this.setCheckedId(-1);
            }
        }
    }

    private class PassThroughHierarchyChangeListener implements android.view.ViewGroup.OnHierarchyChangeListener {
        private android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;

        private PassThroughHierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(android.view.View view, android.view.View view2) {
            int iHashCode;
            if (view == com.google.android.material.chip.ChipGroup.this && (view2 instanceof com.google.android.material.chip.Chip)) {
                if (view2.getId() == -1) {
                    if (android.os.Build.VERSION.SDK_INT >= 17) {
                        iHashCode = android.view.View.generateViewId();
                    } else {
                        iHashCode = view2.hashCode();
                    }
                    view2.setId(iHashCode);
                }
                ((com.google.android.material.chip.Chip) view2).setOnCheckedChangeListenerInternal(com.google.android.material.chip.ChipGroup.this.checkedStateTracker);
            }
            android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(android.view.View view, android.view.View view2) {
            if (view == com.google.android.material.chip.ChipGroup.this && (view2 instanceof com.google.android.material.chip.Chip)) {
                ((com.google.android.material.chip.Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }
}
