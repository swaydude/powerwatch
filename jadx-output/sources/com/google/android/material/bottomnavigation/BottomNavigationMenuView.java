package com.google.android.material.bottomnavigation;

/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationMenuView extends android.view.ViewGroup implements androidx.appcompat.view.menu.MenuView {
    private static final long ACTIVE_ANIMATION_DURATION_MS = 115;
    private static final int[] CHECKED_STATE_SET = {android.R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int ITEM_POOL_SIZE = 5;
    private final int activeItemMaxWidth;
    private final int activeItemMinWidth;
    private android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> badgeDrawables;
    private com.google.android.material.bottomnavigation.BottomNavigationItemView[] buttons;
    private final int inactiveItemMaxWidth;
    private final int inactiveItemMinWidth;
    private android.graphics.drawable.Drawable itemBackground;
    private int itemBackgroundRes;
    private final int itemHeight;
    private boolean itemHorizontalTranslationEnabled;
    private int itemIconSize;
    private android.content.res.ColorStateList itemIconTint;
    private final androidx.core.util.Pools.Pool<com.google.android.material.bottomnavigation.BottomNavigationItemView> itemPool;
    private int itemTextAppearanceActive;
    private int itemTextAppearanceInactive;
    private final android.content.res.ColorStateList itemTextColorDefault;
    private android.content.res.ColorStateList itemTextColorFromUser;
    private int labelVisibilityMode;
    private androidx.appcompat.view.menu.MenuBuilder menu;
    private final android.view.View.OnClickListener onClickListener;
    private com.google.android.material.bottomnavigation.BottomNavigationPresenter presenter;
    private int selectedItemId;
    private int selectedItemPosition;
    private final androidx.transition.TransitionSet set;
    private int[] tempChildWidths;

    private boolean isShifting(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    private boolean isValidId(int i) {
        return i != -1;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return 0;
    }

    public BottomNavigationMenuView(android.content.Context context) {
        this(context, null);
    }

    public BottomNavigationMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.itemPool = new androidx.core.util.Pools.SynchronizedPool(5);
        this.selectedItemId = 0;
        this.selectedItemPosition = 0;
        this.badgeDrawables = new android.util.SparseArray<>(5);
        android.content.res.Resources resources = getResources();
        this.inactiveItemMaxWidth = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_item_max_width);
        this.inactiveItemMinWidth = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_item_min_width);
        this.activeItemMaxWidth = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_active_item_max_width);
        this.activeItemMinWidth = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_active_item_min_width);
        this.itemHeight = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_height);
        this.itemTextColorDefault = createDefaultColorStateList(android.R.attr.textColorSecondary);
        androidx.transition.AutoTransition autoTransition = new androidx.transition.AutoTransition();
        this.set = autoTransition;
        autoTransition.setOrdering(0);
        autoTransition.setDuration(ACTIVE_ANIMATION_DURATION_MS);
        autoTransition.setInterpolator((android.animation.TimeInterpolator) new androidx.interpolator.view.animation.FastOutSlowInInterpolator());
        autoTransition.addTransition(new com.google.android.material.internal.TextScale());
        this.onClickListener = new android.view.View.OnClickListener() { // from class: com.google.android.material.bottomnavigation.BottomNavigationMenuView.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                androidx.appcompat.view.menu.MenuItemImpl itemData = ((com.google.android.material.bottomnavigation.BottomNavigationItemView) view).getItemData();
                if (com.google.android.material.bottomnavigation.BottomNavigationMenuView.this.menu.performItemAction(itemData, com.google.android.material.bottomnavigation.BottomNavigationMenuView.this.presenter, 0)) {
                    return;
                }
                itemData.setChecked(true);
            }
        };
        this.tempChildWidths = new int[5];
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        this.menu = menuBuilder;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = this.menu.getVisibleItems().size();
        int childCount = getChildCount();
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(this.itemHeight, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
        if (isShifting(this.labelVisibilityMode, size2) && this.itemHorizontalTranslationEnabled) {
            android.view.View childAt = getChildAt(this.selectedItemPosition);
            int iMax = this.activeItemMinWidth;
            if (childAt.getVisibility() != 8) {
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.activeItemMaxWidth, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = java.lang.Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i3 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin = java.lang.Math.min(size - (this.inactiveItemMinWidth * i3), java.lang.Math.min(iMax, this.activeItemMaxWidth));
            int i4 = size - iMin;
            int iMin2 = java.lang.Math.min(i4 / (i3 == 0 ? 1 : i3), this.inactiveItemMaxWidth);
            int i5 = i4 - (i3 * iMin2);
            int i6 = 0;
            while (i6 < childCount) {
                if (getChildAt(i6).getVisibility() != 8) {
                    int[] iArr = this.tempChildWidths;
                    iArr[i6] = i6 == this.selectedItemPosition ? iMin : iMin2;
                    if (i5 > 0) {
                        iArr[i6] = iArr[i6] + 1;
                        i5--;
                    }
                } else {
                    this.tempChildWidths[i6] = 0;
                }
                i6++;
            }
        } else {
            int iMin3 = java.lang.Math.min(size / (size2 == 0 ? 1 : size2), this.activeItemMaxWidth);
            int i7 = size - (size2 * iMin3);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getVisibility() != 8) {
                    int[] iArr2 = this.tempChildWidths;
                    iArr2[i8] = iMin3;
                    if (i7 > 0) {
                        iArr2[i8] = iArr2[i8] + 1;
                        i7--;
                    }
                } else {
                    this.tempChildWidths[i8] = 0;
                }
            }
        }
        int measuredWidth = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            android.view.View childAt2 = getChildAt(i9);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.tempChildWidths[i9], androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(android.view.View.resolveSizeAndState(measuredWidth, android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY), 0), android.view.View.resolveSizeAndState(this.itemHeight, iMakeMeasureSpec, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            android.view.View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                if (androidx.core.view.ViewCompat.getLayoutDirection(this) == 1) {
                    int i8 = i5 - measuredWidth;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i6);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i6);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    public void setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.itemIconTint = colorStateList;
        com.google.android.material.bottomnavigation.BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null) {
            for (com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setIconTintList(colorStateList);
            }
        }
    }

    public android.content.res.ColorStateList getIconTintList() {
        return this.itemIconTint;
    }

    public void setItemIconSize(int i) {
        this.itemIconSize = i;
        com.google.android.material.bottomnavigation.BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null) {
            for (com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setIconSize(i);
            }
        }
    }

    public int getItemIconSize() {
        return this.itemIconSize;
    }

    public void setItemTextColor(android.content.res.ColorStateList colorStateList) {
        this.itemTextColorFromUser = colorStateList;
        com.google.android.material.bottomnavigation.BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null) {
            for (com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextColor(colorStateList);
            }
        }
    }

    public android.content.res.ColorStateList getItemTextColor() {
        return this.itemTextColorFromUser;
    }

    public void setItemTextAppearanceInactive(int i) {
        this.itemTextAppearanceInactive = i;
        com.google.android.material.bottomnavigation.BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null) {
            for (com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceInactive(i);
                android.content.res.ColorStateList colorStateList = this.itemTextColorFromUser;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public int getItemTextAppearanceInactive() {
        return this.itemTextAppearanceInactive;
    }

    public void setItemTextAppearanceActive(int i) {
        this.itemTextAppearanceActive = i;
        com.google.android.material.bottomnavigation.BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null) {
            for (com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceActive(i);
                android.content.res.ColorStateList colorStateList = this.itemTextColorFromUser;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public int getItemTextAppearanceActive() {
        return this.itemTextAppearanceActive;
    }

    public void setItemBackgroundRes(int i) {
        this.itemBackgroundRes = i;
        com.google.android.material.bottomnavigation.BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null) {
            for (com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setItemBackground(i);
            }
        }
    }

    @java.lang.Deprecated
    public int getItemBackgroundRes() {
        return this.itemBackgroundRes;
    }

    public void setItemBackground(android.graphics.drawable.Drawable drawable) {
        this.itemBackground = drawable;
        com.google.android.material.bottomnavigation.BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null) {
            for (com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setItemBackground(drawable);
            }
        }
    }

    public android.graphics.drawable.Drawable getItemBackground() {
        com.google.android.material.bottomnavigation.BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null && bottomNavigationItemViewArr.length > 0) {
            return bottomNavigationItemViewArr[0].getBackground();
        }
        return this.itemBackground;
    }

    public void setLabelVisibilityMode(int i) {
        this.labelVisibilityMode = i;
    }

    public int getLabelVisibilityMode() {
        return this.labelVisibilityMode;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.itemHorizontalTranslationEnabled = z;
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.itemHorizontalTranslationEnabled;
    }

    public android.content.res.ColorStateList createDefaultColorStateList(int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        android.content.res.ColorStateList colorStateList = androidx.appcompat.content.res.AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new android.content.res.ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    public void setPresenter(com.google.android.material.bottomnavigation.BottomNavigationPresenter bottomNavigationPresenter) {
        this.presenter = bottomNavigationPresenter;
    }

    public void buildMenuView() {
        removeAllViews();
        com.google.android.material.bottomnavigation.BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null) {
            for (com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                if (bottomNavigationItemView != null) {
                    this.itemPool.release(bottomNavigationItemView);
                    bottomNavigationItemView.removeBadge();
                }
            }
        }
        if (this.menu.size() == 0) {
            this.selectedItemId = 0;
            this.selectedItemPosition = 0;
            this.buttons = null;
            return;
        }
        removeUnusedBadges();
        this.buttons = new com.google.android.material.bottomnavigation.BottomNavigationItemView[this.menu.size()];
        boolean zIsShifting = isShifting(this.labelVisibilityMode, this.menu.getVisibleItems().size());
        for (int i = 0; i < this.menu.size(); i++) {
            this.presenter.setUpdateSuspended(true);
            this.menu.getItem(i).setCheckable(true);
            this.presenter.setUpdateSuspended(false);
            com.google.android.material.bottomnavigation.BottomNavigationItemView newItem = getNewItem();
            this.buttons[i] = newItem;
            newItem.setIconTintList(this.itemIconTint);
            newItem.setIconSize(this.itemIconSize);
            newItem.setTextColor(this.itemTextColorDefault);
            newItem.setTextAppearanceInactive(this.itemTextAppearanceInactive);
            newItem.setTextAppearanceActive(this.itemTextAppearanceActive);
            newItem.setTextColor(this.itemTextColorFromUser);
            android.graphics.drawable.Drawable drawable = this.itemBackground;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.itemBackgroundRes);
            }
            newItem.setShifting(zIsShifting);
            newItem.setLabelVisibilityMode(this.labelVisibilityMode);
            newItem.initialize((androidx.appcompat.view.menu.MenuItemImpl) this.menu.getItem(i), 0);
            newItem.setItemPosition(i);
            newItem.setOnClickListener(this.onClickListener);
            if (this.selectedItemId != 0 && this.menu.getItem(i).getItemId() == this.selectedItemId) {
                this.selectedItemPosition = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = java.lang.Math.min(this.menu.size() - 1, this.selectedItemPosition);
        this.selectedItemPosition = iMin;
        this.menu.getItem(iMin).setChecked(true);
    }

    public void updateMenuView() {
        androidx.appcompat.view.menu.MenuBuilder menuBuilder = this.menu;
        if (menuBuilder == null || this.buttons == null) {
            return;
        }
        int size = menuBuilder.size();
        if (size != this.buttons.length) {
            buildMenuView();
            return;
        }
        int i = this.selectedItemId;
        for (int i2 = 0; i2 < size; i2++) {
            android.view.MenuItem item = this.menu.getItem(i2);
            if (item.isChecked()) {
                this.selectedItemId = item.getItemId();
                this.selectedItemPosition = i2;
            }
        }
        if (i != this.selectedItemId) {
            androidx.transition.TransitionManager.beginDelayedTransition(this, this.set);
        }
        boolean zIsShifting = isShifting(this.labelVisibilityMode, this.menu.getVisibleItems().size());
        for (int i3 = 0; i3 < size; i3++) {
            this.presenter.setUpdateSuspended(true);
            this.buttons[i3].setLabelVisibilityMode(this.labelVisibilityMode);
            this.buttons[i3].setShifting(zIsShifting);
            this.buttons[i3].initialize((androidx.appcompat.view.menu.MenuItemImpl) this.menu.getItem(i3), 0);
            this.presenter.setUpdateSuspended(false);
        }
    }

    private com.google.android.material.bottomnavigation.BottomNavigationItemView getNewItem() {
        com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemViewAcquire = this.itemPool.acquire();
        return bottomNavigationItemViewAcquire == null ? new com.google.android.material.bottomnavigation.BottomNavigationItemView(getContext()) : bottomNavigationItemViewAcquire;
    }

    public int getSelectedItemId() {
        return this.selectedItemId;
    }

    void tryRestoreSelectedItemId(int i) {
        int size = this.menu.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.view.MenuItem item = this.menu.getItem(i2);
            if (i == item.getItemId()) {
                this.selectedItemId = i;
                this.selectedItemPosition = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> getBadgeDrawables() {
        return this.badgeDrawables;
    }

    void setBadgeDrawables(android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> sparseArray) {
        this.badgeDrawables = sparseArray;
    }

    com.google.android.material.badge.BadgeDrawable getBadge(int i) {
        return this.badgeDrawables.get(i);
    }

    com.google.android.material.badge.BadgeDrawable getOrCreateBadge(int i) {
        validateMenuItemId(i);
        com.google.android.material.badge.BadgeDrawable badgeDrawableCreate = this.badgeDrawables.get(i);
        if (badgeDrawableCreate == null) {
            badgeDrawableCreate = com.google.android.material.badge.BadgeDrawable.create(getContext());
            this.badgeDrawables.put(i, badgeDrawableCreate);
        }
        com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemViewFindItemView = findItemView(i);
        if (bottomNavigationItemViewFindItemView != null) {
            bottomNavigationItemViewFindItemView.setBadge(badgeDrawableCreate);
        }
        return badgeDrawableCreate;
    }

    void removeBadge(int i) {
        validateMenuItemId(i);
        com.google.android.material.badge.BadgeDrawable badgeDrawable = this.badgeDrawables.get(i);
        com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemViewFindItemView = findItemView(i);
        if (bottomNavigationItemViewFindItemView != null) {
            bottomNavigationItemViewFindItemView.removeBadge();
        }
        if (badgeDrawable != null) {
            this.badgeDrawables.remove(i);
        }
    }

    private void setBadgeIfNeeded(com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemView) {
        com.google.android.material.badge.BadgeDrawable badgeDrawable;
        int id = bottomNavigationItemView.getId();
        if (isValidId(id) && (badgeDrawable = this.badgeDrawables.get(id)) != null) {
            bottomNavigationItemView.setBadge(badgeDrawable);
        }
    }

    private void removeUnusedBadges() {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i = 0; i < this.menu.size(); i++) {
            hashSet.add(java.lang.Integer.valueOf(this.menu.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.badgeDrawables.size(); i2++) {
            int iKeyAt = this.badgeDrawables.keyAt(i2);
            if (!hashSet.contains(java.lang.Integer.valueOf(iKeyAt))) {
                this.badgeDrawables.delete(iKeyAt);
            }
        }
    }

    private com.google.android.material.bottomnavigation.BottomNavigationItemView findItemView(int i) {
        validateMenuItemId(i);
        com.google.android.material.bottomnavigation.BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr == null) {
            return null;
        }
        for (com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
            if (bottomNavigationItemView.getId() == i) {
                return bottomNavigationItemView;
            }
        }
        return null;
    }

    private void validateMenuItemId(int i) {
        if (isValidId(i)) {
            return;
        }
        throw new java.lang.IllegalArgumentException(i + " is not a valid view id");
    }
}
