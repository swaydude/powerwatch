package com.google.android.material.button;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends android.widget.LinearLayout {
    private static final java.lang.String LOG_TAG = "MaterialButtonToggleGroup";
    private int checkedId;
    private final com.google.android.material.button.MaterialButtonToggleGroup.CheckedStateTracker checkedStateTracker;
    private java.lang.Integer[] childOrder;
    private final java.util.Comparator<com.google.android.material.button.MaterialButton> childOrderComparator;
    private final java.util.LinkedHashSet<com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener> onButtonCheckedListeners;
    private final java.util.List<com.google.android.material.button.MaterialButtonToggleGroup.CornerData> originalCornerData;
    private final com.google.android.material.button.MaterialButtonToggleGroup.PressedStateTracker pressedStateTracker;
    private boolean singleSelection;
    private boolean skipCheckedStateTracker;

    public interface OnButtonCheckedListener {
        void onButtonChecked(com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    public MaterialButtonToggleGroup(android.content.Context context) {
        this(context, null);
    }

    public MaterialButtonToggleGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.originalCornerData = new java.util.ArrayList();
        this.checkedStateTracker = new com.google.android.material.button.MaterialButtonToggleGroup.CheckedStateTracker();
        this.pressedStateTracker = new com.google.android.material.button.MaterialButtonToggleGroup.PressedStateTracker();
        this.onButtonCheckedListeners = new java.util.LinkedHashSet<>();
        this.childOrderComparator = new java.util.Comparator<com.google.android.material.button.MaterialButton>() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.1
            @Override // java.util.Comparator
            public int compare(com.google.android.material.button.MaterialButton materialButton, com.google.android.material.button.MaterialButton materialButton2) {
                int iCompareTo = java.lang.Boolean.valueOf(materialButton.isChecked()).compareTo(java.lang.Boolean.valueOf(materialButton2.isChecked()));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = java.lang.Boolean.valueOf(materialButton.isPressed()).compareTo(java.lang.Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : java.lang.Integer.valueOf(com.google.android.material.button.MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(java.lang.Integer.valueOf(com.google.android.material.button.MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
            }
        };
        this.skipCheckedStateTracker = false;
        setOrientation(0);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context, attributeSet, com.google.android.material.R.styleable.MaterialButtonToggleGroup, i, com.google.android.material.R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.checkedId = typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.MaterialButtonToggleGroup_checkedButton, -1);
        setChildrenDrawingOrderEnabled(true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.checkedId;
        if (i != -1) {
            checkForced(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        updateChildOrder();
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof com.google.android.material.button.MaterialButton)) {
            android.util.Log.e(LOG_TAG, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            updateCheckedStates(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.originalCornerData.add(new com.google.android.material.button.MaterialButtonToggleGroup.CornerData(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel.getBottomRightCornerSize(), shapeAppearanceModel.getBottomLeftCornerSize()));
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        if (view instanceof com.google.android.material.button.MaterialButton) {
            com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) view;
            materialButton.removeOnCheckedChangeListener(this.checkedStateTracker);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.originalCornerData.remove(iIndexOfChild);
        }
        updateChildShapes();
        adjustChildMarginsAndUpdateLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        updateChildShapes();
        adjustChildMarginsAndUpdateLayout();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return com.google.android.material.button.MaterialButtonToggleGroup.class.getName();
    }

    public void check(int i) {
        if (i == this.checkedId) {
            return;
        }
        checkForced(i);
    }

    public void uncheck(int i) {
        setCheckedStateForView(i, false);
        updateCheckedStates(i, false);
        this.checkedId = -1;
        dispatchOnButtonChecked(i, false);
    }

    public void clearChecked() {
        this.skipCheckedStateTracker = true;
        for (int i = 0; i < getChildCount(); i++) {
            com.google.android.material.button.MaterialButton childButton = getChildButton(i);
            childButton.setChecked(false);
            dispatchOnButtonChecked(childButton.getId(), false);
        }
        this.skipCheckedStateTracker = false;
        setCheckedId(-1);
    }

    public int getCheckedButtonId() {
        if (this.singleSelection) {
            return this.checkedId;
        }
        return -1;
    }

    public java.util.List<java.lang.Integer> getCheckedButtonIds() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            com.google.android.material.button.MaterialButton childButton = getChildButton(i);
            if (childButton.isChecked()) {
                arrayList.add(java.lang.Integer.valueOf(childButton.getId()));
            }
        }
        return arrayList;
    }

    public void addOnButtonCheckedListener(com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener onButtonCheckedListener) {
        this.onButtonCheckedListeners.add(onButtonCheckedListener);
    }

    public void removeOnButtonCheckedListener(com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener onButtonCheckedListener) {
        this.onButtonCheckedListeners.remove(onButtonCheckedListener);
    }

    public void clearOnButtonCheckedListeners() {
        this.onButtonCheckedListeners.clear();
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void setSingleSelection(boolean z) {
        if (this.singleSelection != z) {
            this.singleSelection = z;
            clearChecked();
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    private void setCheckedStateForView(int i, boolean z) {
        android.view.View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof com.google.android.material.button.MaterialButton) {
            this.skipCheckedStateTracker = true;
            ((com.google.android.material.button.MaterialButton) viewFindViewById).setChecked(z);
            this.skipCheckedStateTracker = false;
        }
    }

    private void setCheckedId(int i) {
        this.checkedId = i;
        dispatchOnButtonChecked(i, true);
    }

    private void adjustChildMarginsAndUpdateLayout() {
        for (int i = 1; i < getChildCount(); i++) {
            com.google.android.material.button.MaterialButton childButton = getChildButton(i);
            int iMin = java.lang.Math.min(childButton.getStrokeWidth(), getChildButton(i - 1).getStrokeWidth());
            android.widget.LinearLayout.LayoutParams layoutParamsBuildLayoutParams = buildLayoutParams(childButton);
            androidx.core.view.MarginLayoutParamsCompat.setMarginEnd(layoutParamsBuildLayoutParams, 0);
            androidx.core.view.MarginLayoutParamsCompat.setMarginStart(layoutParamsBuildLayoutParams, -iMin);
            childButton.setLayoutParams(layoutParamsBuildLayoutParams);
        }
        resetFirstChildMargin();
    }

    private com.google.android.material.button.MaterialButton getChildButton(int i) {
        return (com.google.android.material.button.MaterialButton) getChildAt(i);
    }

    private void resetFirstChildMargin() {
        if (getChildCount() == 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) getChildButton(0).getLayoutParams();
        androidx.core.view.MarginLayoutParamsCompat.setMarginEnd(layoutParams, 0);
        androidx.core.view.MarginLayoutParamsCompat.setMarginStart(layoutParams, 0);
    }

    void updateChildShapes() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            com.google.android.material.button.MaterialButton childButton = getChildButton(i);
            com.google.android.material.shape.ShapeAppearanceModel.Builder builder = childButton.getShapeAppearanceModel().toBuilder();
            updateBuilderWithCornerData(builder, getNewCornerData(i));
            childButton.setShapeAppearanceModel(builder.build());
        }
    }

    private com.google.android.material.button.MaterialButtonToggleGroup.CornerData getNewCornerData(int i) {
        int childCount = getChildCount();
        com.google.android.material.button.MaterialButtonToggleGroup.CornerData cornerData = this.originalCornerData.get(i);
        if (childCount == 1) {
            return cornerData;
        }
        com.google.android.material.shape.AbsoluteCornerSize absoluteCornerSize = new com.google.android.material.shape.AbsoluteCornerSize(0.0f);
        if (i == (com.google.android.material.internal.ViewUtils.isLayoutRtl(this) ? childCount - 1 : 0)) {
            return new com.google.android.material.button.MaterialButtonToggleGroup.CornerData(cornerData.topLeft, absoluteCornerSize, absoluteCornerSize, cornerData.bottomLeft);
        }
        if (i == (com.google.android.material.internal.ViewUtils.isLayoutRtl(this) ? 0 : childCount - 1)) {
            return new com.google.android.material.button.MaterialButtonToggleGroup.CornerData(absoluteCornerSize, cornerData.topRight, cornerData.bottomRight, absoluteCornerSize);
        }
        return null;
    }

    private static void updateBuilderWithCornerData(com.google.android.material.shape.ShapeAppearanceModel.Builder builder, com.google.android.material.button.MaterialButtonToggleGroup.CornerData cornerData) {
        if (cornerData == null) {
            builder.setAllCornerSizes(0.0f);
        } else {
            builder.setTopLeftCornerSize(cornerData.topLeft).setTopRightCornerSize(cornerData.topRight).setBottomRightCornerSize(cornerData.bottomRight).setBottomLeftCornerSize(cornerData.bottomLeft);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCheckedStates(int i, boolean z) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            com.google.android.material.button.MaterialButton childButton = getChildButton(i2);
            if (childButton.isChecked() && this.singleSelection && z && childButton.getId() != i) {
                setCheckedStateForView(childButton.getId(), false);
                dispatchOnButtonChecked(childButton.getId(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnButtonChecked(int i, boolean z) {
        java.util.Iterator<com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener> it = this.onButtonCheckedListeners.iterator();
        while (it.hasNext()) {
            it.next().onButtonChecked(this, i, z);
        }
    }

    private void checkForced(int i) {
        setCheckedStateForView(i, true);
        updateCheckedStates(i, true);
        setCheckedId(i);
    }

    private void setGeneratedIdIfNeeded(com.google.android.material.button.MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(androidx.core.view.ViewCompat.generateViewId());
        }
    }

    private void setupButtonChild(com.google.android.material.button.MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(android.text.TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.addOnCheckedChangeListener(this.checkedStateTracker);
        materialButton.setOnPressedChangeListenerInternal(this.pressedStateTracker);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private android.widget.LinearLayout.LayoutParams buildLayoutParams(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
            return (android.widget.LinearLayout.LayoutParams) layoutParams;
        }
        return new android.widget.LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        java.lang.Integer[] numArr = this.childOrder;
        if (numArr == null || i2 >= numArr.length) {
            android.util.Log.w(LOG_TAG, "Child order wasn't updated");
            return i2;
        }
        return numArr[i2].intValue();
    }

    private void updateChildOrder() {
        java.util.TreeMap treeMap = new java.util.TreeMap(this.childOrderComparator);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(getChildButton(i), java.lang.Integer.valueOf(i));
        }
        this.childOrder = (java.lang.Integer[]) treeMap.values().toArray(new java.lang.Integer[0]);
    }

    private class CheckedStateTracker implements com.google.android.material.button.MaterialButton.OnCheckedChangeListener {
        private CheckedStateTracker() {
        }

        @Override // com.google.android.material.button.MaterialButton.OnCheckedChangeListener
        public void onCheckedChanged(com.google.android.material.button.MaterialButton materialButton, boolean z) {
            if (com.google.android.material.button.MaterialButtonToggleGroup.this.skipCheckedStateTracker) {
                return;
            }
            if (com.google.android.material.button.MaterialButtonToggleGroup.this.singleSelection) {
                com.google.android.material.button.MaterialButtonToggleGroup.this.checkedId = z ? materialButton.getId() : -1;
            }
            com.google.android.material.button.MaterialButtonToggleGroup.this.dispatchOnButtonChecked(materialButton.getId(), z);
            com.google.android.material.button.MaterialButtonToggleGroup.this.updateCheckedStates(materialButton.getId(), z);
            com.google.android.material.button.MaterialButtonToggleGroup.this.invalidate();
        }
    }

    private class PressedStateTracker implements com.google.android.material.button.MaterialButton.OnPressedChangeListener {
        private PressedStateTracker() {
        }

        @Override // com.google.android.material.button.MaterialButton.OnPressedChangeListener
        public void onPressedChanged(com.google.android.material.button.MaterialButton materialButton, boolean z) {
            com.google.android.material.button.MaterialButtonToggleGroup.this.updateCheckedStates(materialButton.getId(), materialButton.isChecked());
            com.google.android.material.button.MaterialButtonToggleGroup.this.invalidate();
        }
    }

    private static class CornerData {
        com.google.android.material.shape.CornerSize bottomLeft;
        com.google.android.material.shape.CornerSize bottomRight;
        com.google.android.material.shape.CornerSize topLeft;
        com.google.android.material.shape.CornerSize topRight;

        CornerData(com.google.android.material.shape.CornerSize cornerSize, com.google.android.material.shape.CornerSize cornerSize2, com.google.android.material.shape.CornerSize cornerSize3, com.google.android.material.shape.CornerSize cornerSize4) {
            this.topLeft = cornerSize;
            this.topRight = cornerSize2;
            this.bottomRight = cornerSize3;
            this.bottomLeft = cornerSize4;
        }
    }
}
