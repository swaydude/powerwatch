package com.google.android.material.tabs;

/* JADX INFO: loaded from: classes2.dex */
@androidx.viewpager.widget.ViewPager.DecorView
public class TabLayout extends android.widget.HorizontalScrollView {
    private static final int ANIMATION_DURATION = 300;
    static final int DEFAULT_GAP_TEXT_ICON = 8;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    private static final int INVALID_WIDTH = -1;
    private static final int MIN_INDICATOR_WIDTH = 24;
    public static final int MODE_AUTO = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
    public static final int TAB_LABEL_VISIBILITY_UNLABELED = 0;
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private static final androidx.core.util.Pools.Pool<com.google.android.material.tabs.TabLayout.Tab> tabPool = new androidx.core.util.Pools.SynchronizedPool(16);
    private com.google.android.material.tabs.TabLayout.AdapterChangeListener adapterChangeListener;
    private int contentInsetStart;
    private com.google.android.material.tabs.TabLayout.OnTabSelectedListener currentVpSelectedListener;
    boolean inlineLabel;
    int mode;
    private com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener pageChangeListener;
    private androidx.viewpager.widget.PagerAdapter pagerAdapter;
    private android.database.DataSetObserver pagerAdapterObserver;
    private final int requestedTabMaxWidth;
    private final int requestedTabMinWidth;
    private android.animation.ValueAnimator scrollAnimator;
    private final int scrollableTabMinWidth;
    private final java.util.HashMap<com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener<? extends com.google.android.material.tabs.TabLayout.Tab>, com.google.android.material.tabs.TabLayout.OnTabSelectedListener> selectedListenerMap;
    private final java.util.ArrayList<com.google.android.material.tabs.TabLayout.OnTabSelectedListener> selectedListeners;
    private com.google.android.material.tabs.TabLayout.Tab selectedTab;
    private boolean setupViewPagerImplicitly;
    private final com.google.android.material.tabs.TabLayout.SlidingTabIndicator slidingTabIndicator;
    final int tabBackgroundResId;
    int tabGravity;
    android.content.res.ColorStateList tabIconTint;
    android.graphics.PorterDuff.Mode tabIconTintMode;
    int tabIndicatorAnimationDuration;
    boolean tabIndicatorFullWidth;
    int tabIndicatorGravity;
    int tabMaxWidth;
    int tabPaddingBottom;
    int tabPaddingEnd;
    int tabPaddingStart;
    int tabPaddingTop;
    android.content.res.ColorStateList tabRippleColorStateList;
    android.graphics.drawable.Drawable tabSelectedIndicator;
    int tabTextAppearance;
    android.content.res.ColorStateList tabTextColors;
    float tabTextMultiLineSize;
    float tabTextSize;
    private final android.graphics.RectF tabViewContentBounds;
    private final androidx.core.util.Pools.Pool<com.google.android.material.tabs.TabLayout.TabView> tabViewPool;
    private final java.util.ArrayList<com.google.android.material.tabs.TabLayout.Tab> tabs;
    boolean unboundedRipple;
    androidx.viewpager.widget.ViewPager viewPager;

    @java.lang.Deprecated
    public interface BaseOnTabSelectedListener<T extends com.google.android.material.tabs.TabLayout.Tab> {
        void onTabReselected(T t);

        void onTabSelected(T t);

        void onTabUnselected(T t);
    }

    public @interface LabelVisibility {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public interface OnTabSelectedListener {
        void onTabReselected(com.google.android.material.tabs.TabLayout.Tab tab);

        void onTabSelected(com.google.android.material.tabs.TabLayout.Tab tab);

        void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab tab);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TabGravity {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TabIndicatorGravity {
    }

    public TabLayout(android.content.Context context) {
        this(context, null);
    }

    public TabLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.tabStyle);
    }

    public TabLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.tabs = new java.util.ArrayList<>();
        this.tabViewContentBounds = new android.graphics.RectF();
        this.tabMaxWidth = Integer.MAX_VALUE;
        this.selectedListeners = new java.util.ArrayList<>();
        this.selectedListenerMap = new java.util.HashMap<>();
        this.tabViewPool = new androidx.core.util.Pools.SimplePool(12);
        setHorizontalScrollBarEnabled(false);
        com.google.android.material.tabs.TabLayout.SlidingTabIndicator slidingTabIndicator = new com.google.android.material.tabs.TabLayout.SlidingTabIndicator(context);
        this.slidingTabIndicator = slidingTabIndicator;
        super.addView(slidingTabIndicator, 0, new android.widget.FrameLayout.LayoutParams(-2, -1));
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context, attributeSet, com.google.android.material.R.styleable.TabLayout, i, com.google.android.material.R.style.Widget_Design_TabLayout, com.google.android.material.R.styleable.TabLayout_tabTextAppearance);
        if (getBackground() instanceof android.graphics.drawable.ColorDrawable) {
            android.graphics.drawable.ColorDrawable colorDrawable = (android.graphics.drawable.ColorDrawable) getBackground();
            com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(android.content.res.ColorStateList.valueOf(colorDrawable.getColor()));
            materialShapeDrawable.initializeElevationOverlay(context);
            materialShapeDrawable.setElevation(androidx.core.view.ViewCompat.getElevation(this));
            androidx.core.view.ViewCompat.setBackground(this, materialShapeDrawable);
        }
        slidingTabIndicator.setSelectedIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.TabLayout_tabIndicatorHeight, -1));
        slidingTabIndicator.setSelectedIndicatorColor(typedArrayObtainStyledAttributes.getColor(com.google.android.material.R.styleable.TabLayout_tabIndicatorColor, 0));
        setSelectedTabIndicator(com.google.android.material.resources.MaterialResources.getDrawable(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.TabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.TabLayout_tabPadding, 0);
        this.tabPaddingBottom = dimensionPixelSize;
        this.tabPaddingEnd = dimensionPixelSize;
        this.tabPaddingTop = dimensionPixelSize;
        this.tabPaddingStart = dimensionPixelSize;
        this.tabPaddingStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.TabLayout_tabPaddingStart, this.tabPaddingStart);
        this.tabPaddingTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.TabLayout_tabPaddingTop, this.tabPaddingTop);
        this.tabPaddingEnd = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.TabLayout_tabPaddingEnd, this.tabPaddingEnd);
        this.tabPaddingBottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.TabLayout_tabPaddingBottom, this.tabPaddingBottom);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.TabLayout_tabTextAppearance, com.google.android.material.R.style.TextAppearance_Design_Tab);
        this.tabTextAppearance = resourceId;
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, androidx.appcompat.R.styleable.TextAppearance);
        try {
            this.tabTextSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(androidx.appcompat.R.styleable.TextAppearance_android_textSize, 0);
            this.tabTextColors = com.google.android.material.resources.MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes2, androidx.appcompat.R.styleable.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes2.recycle();
            if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.TabLayout_tabTextColor)) {
                this.tabTextColors = com.google.android.material.resources.MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.TabLayout_tabTextColor);
            }
            if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.TabLayout_tabSelectedTextColor)) {
                this.tabTextColors = createColorStateList(this.tabTextColors.getDefaultColor(), typedArrayObtainStyledAttributes.getColor(com.google.android.material.R.styleable.TabLayout_tabSelectedTextColor, 0));
            }
            this.tabIconTint = com.google.android.material.resources.MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.TabLayout_tabIconTint);
            this.tabIconTintMode = com.google.android.material.internal.ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.TabLayout_tabIconTintMode, -1), null);
            this.tabRippleColorStateList = com.google.android.material.resources.MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.TabLayout_tabRippleColor);
            this.tabIndicatorAnimationDuration = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.TabLayout_tabIndicatorAnimationDuration, ANIMATION_DURATION);
            this.requestedTabMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.TabLayout_tabMinWidth, -1);
            this.requestedTabMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.TabLayout_tabMaxWidth, -1);
            this.tabBackgroundResId = typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.TabLayout_tabBackground, 0);
            this.contentInsetStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.TabLayout_tabContentStart, 0);
            this.mode = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.TabLayout_tabMode, 1);
            this.tabGravity = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.TabLayout_tabGravity, 0);
            this.inlineLabel = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.TabLayout_tabInlineLabel, false);
            this.unboundedRipple = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.TabLayout_tabUnboundedRipple, false);
            typedArrayObtainStyledAttributes.recycle();
            android.content.res.Resources resources = getResources();
            this.tabTextMultiLineSize = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_tab_text_size_2line);
            this.scrollableTabMinWidth = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_tab_scrollable_min_width);
            applyModeAndGravity();
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.slidingTabIndicator.setSelectedIndicatorColor(i);
    }

    @java.lang.Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.slidingTabIndicator.setSelectedIndicatorHeight(i);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int iRound = java.lang.Math.round(i + f);
        if (iRound < 0 || iRound >= this.slidingTabIndicator.getChildCount()) {
            return;
        }
        if (z2) {
            this.slidingTabIndicator.setIndicatorPositionFromTabPosition(i, f);
        }
        android.animation.ValueAnimator valueAnimator = this.scrollAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.scrollAnimator.cancel();
        }
        scrollTo(calculateScrollXForTab(i, f), 0);
        if (z) {
            setSelectedTabView(iRound);
        }
    }

    public void addTab(com.google.android.material.tabs.TabLayout.Tab tab) {
        addTab(tab, this.tabs.isEmpty());
    }

    public void addTab(com.google.android.material.tabs.TabLayout.Tab tab, int i) {
        addTab(tab, i, this.tabs.isEmpty());
    }

    public void addTab(com.google.android.material.tabs.TabLayout.Tab tab, boolean z) {
        addTab(tab, this.tabs.size(), z);
    }

    public void addTab(com.google.android.material.tabs.TabLayout.Tab tab, int i, boolean z) {
        if (tab.parent != this) {
            throw new java.lang.IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        configureTab(tab, i);
        addTabView(tab);
        if (z) {
            tab.select();
        }
    }

    private void addTabFromItemView(com.google.android.material.tabs.TabItem tabItem) {
        com.google.android.material.tabs.TabLayout.Tab tabNewTab = newTab();
        if (tabItem.text != null) {
            tabNewTab.setText(tabItem.text);
        }
        if (tabItem.icon != null) {
            tabNewTab.setIcon(tabItem.icon);
        }
        if (tabItem.customLayout != 0) {
            tabNewTab.setCustomView(tabItem.customLayout);
        }
        if (!android.text.TextUtils.isEmpty(tabItem.getContentDescription())) {
            tabNewTab.setContentDescription(tabItem.getContentDescription());
        }
        addTab(tabNewTab);
    }

    @java.lang.Deprecated
    public void setOnTabSelectedListener(com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener baseOnTabSelectedListener) {
        clearOnTabSelectedListeners();
        addOnTabSelectedListener(wrapOnTabSelectedListener(baseOnTabSelectedListener));
    }

    public void addOnTabSelectedListener(com.google.android.material.tabs.TabLayout.OnTabSelectedListener onTabSelectedListener) {
        if (this.selectedListeners.contains(onTabSelectedListener)) {
            return;
        }
        this.selectedListeners.add(onTabSelectedListener);
    }

    @java.lang.Deprecated
    public void addOnTabSelectedListener(com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener baseOnTabSelectedListener) {
        addOnTabSelectedListener(wrapOnTabSelectedListener(baseOnTabSelectedListener));
    }

    public void removeOnTabSelectedListener(com.google.android.material.tabs.TabLayout.OnTabSelectedListener onTabSelectedListener) {
        this.selectedListeners.remove(onTabSelectedListener);
    }

    @java.lang.Deprecated
    public void removeOnTabSelectedListener(com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener baseOnTabSelectedListener) {
        removeOnTabSelectedListener(wrapOnTabSelectedListener(baseOnTabSelectedListener));
    }

    protected com.google.android.material.tabs.TabLayout.OnTabSelectedListener wrapOnTabSelectedListener(final com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener baseOnTabSelectedListener) {
        if (baseOnTabSelectedListener == null) {
            return null;
        }
        if (this.selectedListenerMap.containsKey(baseOnTabSelectedListener)) {
            return this.selectedListenerMap.get(baseOnTabSelectedListener);
        }
        com.google.android.material.tabs.TabLayout.OnTabSelectedListener onTabSelectedListener = new com.google.android.material.tabs.TabLayout.OnTabSelectedListener() { // from class: com.google.android.material.tabs.TabLayout.1
            @Override // com.google.android.material.tabs.TabLayout.OnTabSelectedListener
            public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab tab) {
                baseOnTabSelectedListener.onTabSelected(tab);
            }

            @Override // com.google.android.material.tabs.TabLayout.OnTabSelectedListener
            public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab tab) {
                baseOnTabSelectedListener.onTabUnselected(tab);
            }

            @Override // com.google.android.material.tabs.TabLayout.OnTabSelectedListener
            public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab tab) {
                baseOnTabSelectedListener.onTabReselected(tab);
            }
        };
        this.selectedListenerMap.put(baseOnTabSelectedListener, onTabSelectedListener);
        return onTabSelectedListener;
    }

    public void clearOnTabSelectedListeners() {
        this.selectedListeners.clear();
        this.selectedListenerMap.clear();
    }

    public com.google.android.material.tabs.TabLayout.Tab newTab() {
        com.google.android.material.tabs.TabLayout.Tab tabCreateTabFromPool = createTabFromPool();
        tabCreateTabFromPool.parent = this;
        tabCreateTabFromPool.view = createTabView(tabCreateTabFromPool);
        return tabCreateTabFromPool;
    }

    protected com.google.android.material.tabs.TabLayout.Tab createTabFromPool() {
        com.google.android.material.tabs.TabLayout.Tab tabAcquire = tabPool.acquire();
        return tabAcquire == null ? new com.google.android.material.tabs.TabLayout.Tab() : tabAcquire;
    }

    protected boolean releaseFromTabPool(com.google.android.material.tabs.TabLayout.Tab tab) {
        return tabPool.release(tab);
    }

    public int getTabCount() {
        return this.tabs.size();
    }

    public com.google.android.material.tabs.TabLayout.Tab getTabAt(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.tabs.get(i);
    }

    public int getSelectedTabPosition() {
        com.google.android.material.tabs.TabLayout.Tab tab = this.selectedTab;
        if (tab != null) {
            return tab.getPosition();
        }
        return -1;
    }

    public void removeTab(com.google.android.material.tabs.TabLayout.Tab tab) {
        if (tab.parent != this) {
            throw new java.lang.IllegalArgumentException("Tab does not belong to this TabLayout.");
        }
        removeTabAt(tab.getPosition());
    }

    public void removeTabAt(int i) {
        com.google.android.material.tabs.TabLayout.Tab tab = this.selectedTab;
        int position = tab != null ? tab.getPosition() : 0;
        removeTabViewAt(i);
        com.google.android.material.tabs.TabLayout.Tab tabRemove = this.tabs.remove(i);
        if (tabRemove != null) {
            tabRemove.reset();
            releaseFromTabPool(tabRemove);
        }
        int size = this.tabs.size();
        for (int i2 = i; i2 < size; i2++) {
            this.tabs.get(i2).setPosition(i2);
        }
        if (position == i) {
            selectTab(this.tabs.isEmpty() ? null : this.tabs.get(java.lang.Math.max(0, i - 1)));
        }
    }

    public void removeAllTabs() {
        for (int childCount = this.slidingTabIndicator.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        java.util.Iterator<com.google.android.material.tabs.TabLayout.Tab> it = this.tabs.iterator();
        while (it.hasNext()) {
            com.google.android.material.tabs.TabLayout.Tab next = it.next();
            it.remove();
            next.reset();
            releaseFromTabPool(next);
        }
        this.selectedTab = null;
    }

    public void setTabMode(int i) {
        if (i != this.mode) {
            this.mode = i;
            applyModeAndGravity();
        }
    }

    public int getTabMode() {
        return this.mode;
    }

    public void setTabGravity(int i) {
        if (this.tabGravity != i) {
            this.tabGravity = i;
            applyModeAndGravity();
        }
    }

    public int getTabGravity() {
        return this.tabGravity;
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.tabIndicatorGravity != i) {
            this.tabIndicatorGravity = i;
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this.slidingTabIndicator);
        }
    }

    public int getTabIndicatorGravity() {
        return this.tabIndicatorGravity;
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.tabIndicatorFullWidth = z;
        androidx.core.view.ViewCompat.postInvalidateOnAnimation(this.slidingTabIndicator);
    }

    public boolean isTabIndicatorFullWidth() {
        return this.tabIndicatorFullWidth;
    }

    public void setInlineLabel(boolean z) {
        if (this.inlineLabel != z) {
            this.inlineLabel = z;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                android.view.View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof com.google.android.material.tabs.TabLayout.TabView) {
                    ((com.google.android.material.tabs.TabLayout.TabView) childAt).updateOrientation();
                }
            }
            applyModeAndGravity();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public boolean isInlineLabel() {
        return this.inlineLabel;
    }

    public void setUnboundedRipple(boolean z) {
        if (this.unboundedRipple != z) {
            this.unboundedRipple = z;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                android.view.View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof com.google.android.material.tabs.TabLayout.TabView) {
                    ((com.google.android.material.tabs.TabLayout.TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public boolean hasUnboundedRipple() {
        return this.unboundedRipple;
    }

    public void setTabTextColors(android.content.res.ColorStateList colorStateList) {
        if (this.tabTextColors != colorStateList) {
            this.tabTextColors = colorStateList;
            updateAllTabs();
        }
    }

    public android.content.res.ColorStateList getTabTextColors() {
        return this.tabTextColors;
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(createColorStateList(i, i2));
    }

    public void setTabIconTint(android.content.res.ColorStateList colorStateList) {
        if (this.tabIconTint != colorStateList) {
            this.tabIconTint = colorStateList;
            updateAllTabs();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(androidx.appcompat.content.res.AppCompatResources.getColorStateList(getContext(), i));
    }

    public android.content.res.ColorStateList getTabIconTint() {
        return this.tabIconTint;
    }

    public android.content.res.ColorStateList getTabRippleColor() {
        return this.tabRippleColorStateList;
    }

    public void setTabRippleColor(android.content.res.ColorStateList colorStateList) {
        if (this.tabRippleColorStateList != colorStateList) {
            this.tabRippleColorStateList = colorStateList;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                android.view.View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof com.google.android.material.tabs.TabLayout.TabView) {
                    ((com.google.android.material.tabs.TabLayout.TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(androidx.appcompat.content.res.AppCompatResources.getColorStateList(getContext(), i));
    }

    public android.graphics.drawable.Drawable getTabSelectedIndicator() {
        return this.tabSelectedIndicator;
    }

    public void setSelectedTabIndicator(android.graphics.drawable.Drawable drawable) {
        if (this.tabSelectedIndicator != drawable) {
            this.tabSelectedIndicator = drawable;
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this.slidingTabIndicator);
        }
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
        } else {
            setSelectedTabIndicator((android.graphics.drawable.Drawable) null);
        }
    }

    public void setupWithViewPager(androidx.viewpager.widget.ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public void setupWithViewPager(androidx.viewpager.widget.ViewPager viewPager, boolean z) {
        setupWithViewPager(viewPager, z, false);
    }

    private void setupWithViewPager(androidx.viewpager.widget.ViewPager viewPager, boolean z, boolean z2) {
        androidx.viewpager.widget.ViewPager viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.pageChangeListener;
            if (tabLayoutOnPageChangeListener != null) {
                viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
            }
            com.google.android.material.tabs.TabLayout.AdapterChangeListener adapterChangeListener = this.adapterChangeListener;
            if (adapterChangeListener != null) {
                this.viewPager.removeOnAdapterChangeListener(adapterChangeListener);
            }
        }
        com.google.android.material.tabs.TabLayout.OnTabSelectedListener onTabSelectedListener = this.currentVpSelectedListener;
        if (onTabSelectedListener != null) {
            removeOnTabSelectedListener(onTabSelectedListener);
            this.currentVpSelectedListener = null;
        }
        if (viewPager != null) {
            this.viewPager = viewPager;
            if (this.pageChangeListener == null) {
                this.pageChangeListener = new com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener(this);
            }
            this.pageChangeListener.reset();
            viewPager.addOnPageChangeListener(this.pageChangeListener);
            com.google.android.material.tabs.TabLayout.ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new com.google.android.material.tabs.TabLayout.ViewPagerOnTabSelectedListener(viewPager);
            this.currentVpSelectedListener = viewPagerOnTabSelectedListener;
            addOnTabSelectedListener(viewPagerOnTabSelectedListener);
            androidx.viewpager.widget.PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z);
            }
            if (this.adapterChangeListener == null) {
                this.adapterChangeListener = new com.google.android.material.tabs.TabLayout.AdapterChangeListener();
            }
            this.adapterChangeListener.setAutoRefresh(z);
            viewPager.addOnAdapterChangeListener(this.adapterChangeListener);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.viewPager = null;
            setPagerAdapter(null, false);
        }
        this.setupViewPagerImplicitly = z2;
    }

    @java.lang.Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.PagerAdapter pagerAdapter) {
        setPagerAdapter(pagerAdapter, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(this);
        if (this.viewPager == null) {
            android.view.ViewParent parent = getParent();
            if (parent instanceof androidx.viewpager.widget.ViewPager) {
                setupWithViewPager((androidx.viewpager.widget.ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.setupViewPagerImplicitly) {
            setupWithViewPager(null);
            this.setupViewPagerImplicitly = false;
        }
    }

    private int getTabScrollRange() {
        return java.lang.Math.max(0, ((this.slidingTabIndicator.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    void setPagerAdapter(androidx.viewpager.widget.PagerAdapter pagerAdapter, boolean z) {
        android.database.DataSetObserver dataSetObserver;
        androidx.viewpager.widget.PagerAdapter pagerAdapter2 = this.pagerAdapter;
        if (pagerAdapter2 != null && (dataSetObserver = this.pagerAdapterObserver) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.pagerAdapter = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.pagerAdapterObserver == null) {
                this.pagerAdapterObserver = new com.google.android.material.tabs.TabLayout.PagerAdapterObserver();
            }
            pagerAdapter.registerDataSetObserver(this.pagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    void populateFromPagerAdapter() {
        int currentItem;
        removeAllTabs();
        androidx.viewpager.widget.PagerAdapter pagerAdapter = this.pagerAdapter;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                addTab(newTab().setText(this.pagerAdapter.getPageTitle(i)), false);
            }
            androidx.viewpager.widget.ViewPager viewPager = this.viewPager;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            selectTab(getTabAt(currentItem));
        }
    }

    private void updateAllTabs() {
        int size = this.tabs.size();
        for (int i = 0; i < size; i++) {
            this.tabs.get(i).updateView();
        }
    }

    private com.google.android.material.tabs.TabLayout.TabView createTabView(com.google.android.material.tabs.TabLayout.Tab tab) {
        androidx.core.util.Pools.Pool<com.google.android.material.tabs.TabLayout.TabView> pool = this.tabViewPool;
        com.google.android.material.tabs.TabLayout.TabView tabViewAcquire = pool != null ? pool.acquire() : null;
        if (tabViewAcquire == null) {
            tabViewAcquire = new com.google.android.material.tabs.TabLayout.TabView(getContext());
        }
        tabViewAcquire.setTab(tab);
        tabViewAcquire.setFocusable(true);
        tabViewAcquire.setMinimumWidth(getTabMinWidth());
        if (android.text.TextUtils.isEmpty(tab.contentDesc)) {
            tabViewAcquire.setContentDescription(tab.text);
        } else {
            tabViewAcquire.setContentDescription(tab.contentDesc);
        }
        return tabViewAcquire;
    }

    private void configureTab(com.google.android.material.tabs.TabLayout.Tab tab, int i) {
        tab.setPosition(i);
        this.tabs.add(i, tab);
        int size = this.tabs.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.tabs.get(i).setPosition(i);
            }
        }
    }

    private void addTabView(com.google.android.material.tabs.TabLayout.Tab tab) {
        com.google.android.material.tabs.TabLayout.TabView tabView = tab.view;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.slidingTabIndicator.addView(tabView, tab.getPosition(), createLayoutParamsForTabs());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View view) {
        addViewInternal(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View view, int i) {
        addViewInternal(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    private void addViewInternal(android.view.View view) {
        if (view instanceof com.google.android.material.tabs.TabItem) {
            addTabFromItemView((com.google.android.material.tabs.TabItem) view);
            return;
        }
        throw new java.lang.IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private android.widget.LinearLayout.LayoutParams createLayoutParamsForTabs() {
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    private void updateTabViewLayoutParams(android.widget.LinearLayout.LayoutParams layoutParams) {
        if (this.mode == 1 && this.tabGravity == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.shape.MaterialShapeUtils.setElevation(this, f);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
            android.view.View childAt = this.slidingTabIndicator.getChildAt(i);
            if (childAt instanceof com.google.android.material.tabs.TabLayout.TabView) {
                ((com.google.android.material.tabs.TabLayout.TabView) childAt).drawBackground(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int iDpToPx = (int) com.google.android.material.internal.ViewUtils.dpToPx(getContext(), getDefaultHeight());
        int mode = android.view.View.MeasureSpec.getMode(i2);
        boolean z = false;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = android.view.View.MeasureSpec.makeMeasureSpec(iDpToPx + getPaddingTop() + getPaddingBottom(), androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
            }
        } else if (getChildCount() == 1 && android.view.View.MeasureSpec.getSize(i2) >= iDpToPx) {
            getChildAt(0).setMinimumHeight(iDpToPx);
        }
        int size = android.view.View.MeasureSpec.getSize(i);
        if (android.view.View.MeasureSpec.getMode(i) != 0) {
            int iDpToPx2 = this.requestedTabMaxWidth;
            if (iDpToPx2 <= 0) {
                iDpToPx2 = (int) (size - com.google.android.material.internal.ViewUtils.dpToPx(getContext(), 56));
            }
            this.tabMaxWidth = iDpToPx2;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            android.view.View childAt = getChildAt(0);
            int i3 = this.mode;
            if (i3 == 0) {
                if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                    z = true;
                }
            } else if (i3 != 1) {
                if (i3 == 2) {
                    if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                        z = true;
                    }
                }
            } else if (childAt.getMeasuredWidth() != getMeasuredWidth()) {
                z = true;
            }
            if (z) {
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    private void removeTabViewAt(int i) {
        com.google.android.material.tabs.TabLayout.TabView tabView = (com.google.android.material.tabs.TabLayout.TabView) this.slidingTabIndicator.getChildAt(i);
        this.slidingTabIndicator.removeViewAt(i);
        if (tabView != null) {
            tabView.reset();
            this.tabViewPool.release(tabView);
        }
        requestLayout();
    }

    private void animateToTab(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() == null || !androidx.core.view.ViewCompat.isLaidOut(this) || this.slidingTabIndicator.childrenNeedLayout()) {
            setScrollPosition(i, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iCalculateScrollXForTab = calculateScrollXForTab(i, 0.0f);
        if (scrollX != iCalculateScrollXForTab) {
            ensureScrollAnimator();
            this.scrollAnimator.setIntValues(scrollX, iCalculateScrollXForTab);
            this.scrollAnimator.start();
        }
        this.slidingTabIndicator.animateIndicatorToPosition(i, this.tabIndicatorAnimationDuration);
    }

    private void ensureScrollAnimator() {
        if (this.scrollAnimator == null) {
            android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
            this.scrollAnimator = valueAnimator;
            valueAnimator.setInterpolator(com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.scrollAnimator.setDuration(this.tabIndicatorAnimationDuration);
            this.scrollAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                    com.google.android.material.tabs.TabLayout.this.scrollTo(((java.lang.Integer) valueAnimator2.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    void setScrollAnimatorListener(android.animation.Animator.AnimatorListener animatorListener) {
        ensureScrollAnimator();
        this.scrollAnimator.addListener(animatorListener);
    }

    private void setSelectedTabView(int i) {
        int childCount = this.slidingTabIndicator.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                android.view.View childAt = this.slidingTabIndicator.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    public void selectTab(com.google.android.material.tabs.TabLayout.Tab tab) {
        selectTab(tab, true);
    }

    public void selectTab(com.google.android.material.tabs.TabLayout.Tab tab, boolean z) {
        com.google.android.material.tabs.TabLayout.Tab tab2 = this.selectedTab;
        if (tab2 == tab) {
            if (tab2 != null) {
                dispatchTabReselected(tab);
                animateToTab(tab.getPosition());
                return;
            }
            return;
        }
        int position = tab != null ? tab.getPosition() : -1;
        if (z) {
            if ((tab2 == null || tab2.getPosition() == -1) && position != -1) {
                setScrollPosition(position, 0.0f, true);
            } else {
                animateToTab(position);
            }
            if (position != -1) {
                setSelectedTabView(position);
            }
        }
        this.selectedTab = tab;
        if (tab2 != null) {
            dispatchTabUnselected(tab2);
        }
        if (tab != null) {
            dispatchTabSelected(tab);
        }
    }

    private void dispatchTabSelected(com.google.android.material.tabs.TabLayout.Tab tab) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).onTabSelected(tab);
        }
    }

    private void dispatchTabUnselected(com.google.android.material.tabs.TabLayout.Tab tab) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).onTabUnselected(tab);
        }
    }

    private void dispatchTabReselected(com.google.android.material.tabs.TabLayout.Tab tab) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).onTabReselected(tab);
        }
    }

    private int calculateScrollXForTab(int i, float f) {
        int i2 = this.mode;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        android.view.View childAt = this.slidingTabIndicator.getChildAt(i);
        int i3 = i + 1;
        android.view.View childAt2 = i3 < this.slidingTabIndicator.getChildCount() ? this.slidingTabIndicator.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return androidx.core.view.ViewCompat.getLayoutDirection(this) == 0 ? left + i4 : left - i4;
    }

    private void applyModeAndGravity() {
        int i = this.mode;
        androidx.core.view.ViewCompat.setPaddingRelative(this.slidingTabIndicator, (i == 0 || i == 2) ? java.lang.Math.max(0, this.contentInsetStart - this.tabPaddingStart) : 0, 0, 0, 0);
        int i2 = this.mode;
        if (i2 == 0) {
            this.slidingTabIndicator.setGravity(androidx.core.view.GravityCompat.START);
        } else if (i2 == 1 || i2 == 2) {
            this.slidingTabIndicator.setGravity(1);
        }
        updateTabViews(true);
    }

    void updateTabViews(boolean z) {
        for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
            android.view.View childAt = this.slidingTabIndicator.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((android.widget.LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public static class Tab {
        public static final int INVALID_POSITION = -1;
        private java.lang.CharSequence contentDesc;
        private android.view.View customView;
        private android.graphics.drawable.Drawable icon;
        public com.google.android.material.tabs.TabLayout parent;
        private java.lang.Object tag;
        private java.lang.CharSequence text;
        public com.google.android.material.tabs.TabLayout.TabView view;
        private int position = -1;
        private int labelVisibilityMode = 1;

        public java.lang.Object getTag() {
            return this.tag;
        }

        public com.google.android.material.tabs.TabLayout.Tab setTag(java.lang.Object obj) {
            this.tag = obj;
            return this;
        }

        public android.view.View getCustomView() {
            return this.customView;
        }

        public com.google.android.material.tabs.TabLayout.Tab setCustomView(android.view.View view) {
            this.customView = view;
            updateView();
            return this;
        }

        public com.google.android.material.tabs.TabLayout.Tab setCustomView(int i) {
            return setCustomView(android.view.LayoutInflater.from(this.view.getContext()).inflate(i, (android.view.ViewGroup) this.view, false));
        }

        public android.graphics.drawable.Drawable getIcon() {
            return this.icon;
        }

        public int getPosition() {
            return this.position;
        }

        void setPosition(int i) {
            this.position = i;
        }

        public java.lang.CharSequence getText() {
            return this.text;
        }

        public com.google.android.material.tabs.TabLayout.Tab setIcon(android.graphics.drawable.Drawable drawable) {
            this.icon = drawable;
            if (this.parent.tabGravity == 1 || this.parent.mode == 2) {
                this.parent.updateTabViews(true);
            }
            updateView();
            if (com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT && this.view.hasBadgeDrawable() && this.view.badgeDrawable.isVisible()) {
                this.view.invalidate();
            }
            return this;
        }

        public com.google.android.material.tabs.TabLayout.Tab setIcon(int i) {
            com.google.android.material.tabs.TabLayout tabLayout = this.parent;
            if (tabLayout == null) {
                throw new java.lang.IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return setIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(tabLayout.getContext(), i));
        }

        public com.google.android.material.tabs.TabLayout.Tab setText(java.lang.CharSequence charSequence) {
            if (android.text.TextUtils.isEmpty(this.contentDesc) && !android.text.TextUtils.isEmpty(charSequence)) {
                this.view.setContentDescription(charSequence);
            }
            this.text = charSequence;
            updateView();
            return this;
        }

        public com.google.android.material.tabs.TabLayout.Tab setText(int i) {
            com.google.android.material.tabs.TabLayout tabLayout = this.parent;
            if (tabLayout == null) {
                throw new java.lang.IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return setText(tabLayout.getResources().getText(i));
        }

        public com.google.android.material.badge.BadgeDrawable getOrCreateBadge() {
            return this.view.getOrCreateBadge();
        }

        public void removeBadge() {
            this.view.removeBadge();
        }

        public com.google.android.material.badge.BadgeDrawable getBadge() {
            return this.view.getBadge();
        }

        public com.google.android.material.tabs.TabLayout.Tab setTabLabelVisibility(int i) {
            this.labelVisibilityMode = i;
            if (this.parent.tabGravity == 1 || this.parent.mode == 2) {
                this.parent.updateTabViews(true);
            }
            updateView();
            if (com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT && this.view.hasBadgeDrawable() && this.view.badgeDrawable.isVisible()) {
                this.view.invalidate();
            }
            return this;
        }

        public int getTabLabelVisibility() {
            return this.labelVisibilityMode;
        }

        public void select() {
            com.google.android.material.tabs.TabLayout tabLayout = this.parent;
            if (tabLayout == null) {
                throw new java.lang.IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.selectTab(this);
        }

        public boolean isSelected() {
            com.google.android.material.tabs.TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.position;
            }
            throw new java.lang.IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public com.google.android.material.tabs.TabLayout.Tab setContentDescription(int i) {
            com.google.android.material.tabs.TabLayout tabLayout = this.parent;
            if (tabLayout == null) {
                throw new java.lang.IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return setContentDescription(tabLayout.getResources().getText(i));
        }

        public com.google.android.material.tabs.TabLayout.Tab setContentDescription(java.lang.CharSequence charSequence) {
            this.contentDesc = charSequence;
            updateView();
            return this;
        }

        public java.lang.CharSequence getContentDescription() {
            com.google.android.material.tabs.TabLayout.TabView tabView = this.view;
            if (tabView == null) {
                return null;
            }
            return tabView.getContentDescription();
        }

        void updateView() {
            com.google.android.material.tabs.TabLayout.TabView tabView = this.view;
            if (tabView != null) {
                tabView.update();
            }
        }

        void reset() {
            this.parent = null;
            this.view = null;
            this.tag = null;
            this.icon = null;
            this.text = null;
            this.contentDesc = null;
            this.position = -1;
            this.customView = null;
        }
    }

    public final class TabView extends android.widget.LinearLayout {
        private android.view.View badgeAnchorView;
        private com.google.android.material.badge.BadgeDrawable badgeDrawable;
        private android.graphics.drawable.Drawable baseBackgroundDrawable;
        private android.widget.ImageView customIconView;
        private android.widget.TextView customTextView;
        private android.view.View customView;
        private int defaultMaxLines;
        private android.widget.ImageView iconView;
        private com.google.android.material.tabs.TabLayout.Tab tab;
        private android.widget.TextView textView;

        public TabView(android.content.Context context) {
            super(context);
            this.defaultMaxLines = 2;
            updateBackgroundDrawable(context);
            androidx.core.view.ViewCompat.setPaddingRelative(this, com.google.android.material.tabs.TabLayout.this.tabPaddingStart, com.google.android.material.tabs.TabLayout.this.tabPaddingTop, com.google.android.material.tabs.TabLayout.this.tabPaddingEnd, com.google.android.material.tabs.TabLayout.this.tabPaddingBottom);
            setGravity(17);
            setOrientation(!com.google.android.material.tabs.TabLayout.this.inlineLabel ? 1 : 0);
            setClickable(true);
            androidx.core.view.ViewCompat.setPointerIcon(this, androidx.core.view.PointerIconCompat.getSystemIcon(getContext(), 1002));
            androidx.core.view.ViewCompat.setAccessibilityDelegate(this, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateBackgroundDrawable(android.content.Context context) {
            if (com.google.android.material.tabs.TabLayout.this.tabBackgroundResId != 0) {
                android.graphics.drawable.Drawable drawable = androidx.appcompat.content.res.AppCompatResources.getDrawable(context, com.google.android.material.tabs.TabLayout.this.tabBackgroundResId);
                this.baseBackgroundDrawable = drawable;
                if (drawable != null && drawable.isStateful()) {
                    this.baseBackgroundDrawable.setState(getDrawableState());
                }
            } else {
                this.baseBackgroundDrawable = null;
            }
            android.graphics.drawable.Drawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            ((android.graphics.drawable.GradientDrawable) gradientDrawable).setColor(0);
            if (com.google.android.material.tabs.TabLayout.this.tabRippleColorStateList != null) {
                android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                android.content.res.ColorStateList colorStateListConvertToRippleDrawableColor = com.google.android.material.ripple.RippleUtils.convertToRippleDrawableColor(com.google.android.material.tabs.TabLayout.this.tabRippleColorStateList);
                if (android.os.Build.VERSION.SDK_INT >= 21) {
                    if (com.google.android.material.tabs.TabLayout.this.unboundedRipple) {
                        gradientDrawable = null;
                    }
                    gradientDrawable = new android.graphics.drawable.RippleDrawable(colorStateListConvertToRippleDrawableColor, gradientDrawable, com.google.android.material.tabs.TabLayout.this.unboundedRipple ? null : gradientDrawable2);
                } else {
                    android.graphics.drawable.Drawable drawableWrap = androidx.core.graphics.drawable.DrawableCompat.wrap(gradientDrawable2);
                    androidx.core.graphics.drawable.DrawableCompat.setTintList(drawableWrap, colorStateListConvertToRippleDrawableColor);
                    gradientDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{gradientDrawable, drawableWrap});
                }
            }
            androidx.core.view.ViewCompat.setBackground(this, gradientDrawable);
            com.google.android.material.tabs.TabLayout.this.invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void drawBackground(android.graphics.Canvas canvas) {
            android.graphics.drawable.Drawable drawable = this.baseBackgroundDrawable;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.baseBackgroundDrawable.draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            android.graphics.drawable.Drawable drawable = this.baseBackgroundDrawable;
            boolean state = false;
            if (drawable != null && drawable.isStateful()) {
                state = false | this.baseBackgroundDrawable.setState(drawableState);
            }
            if (state) {
                invalidate();
                com.google.android.material.tabs.TabLayout.this.invalidate();
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.tab == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.tab.select();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && android.os.Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            android.widget.TextView textView = this.textView;
            if (textView != null) {
                textView.setSelected(z);
            }
            android.widget.ImageView imageView = this.iconView;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            android.view.View view = this.customView;
            if (view != null) {
                view.setSelected(z);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(androidx.appcompat.app.ActionBar.Tab.class.getName());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(androidx.appcompat.app.ActionBar.Tab.class.getName());
            com.google.android.material.badge.BadgeDrawable badgeDrawable = this.badgeDrawable;
            if (badgeDrawable == null || !badgeDrawable.isVisible()) {
                return;
            }
            accessibilityNodeInfo.setContentDescription(((java.lang.Object) getContentDescription()) + ", " + ((java.lang.Object) this.badgeDrawable.getContentDescription()));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            android.text.Layout layout;
            int size = android.view.View.MeasureSpec.getSize(i);
            int mode = android.view.View.MeasureSpec.getMode(i);
            int tabMaxWidth = com.google.android.material.tabs.TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = android.view.View.MeasureSpec.makeMeasureSpec(com.google.android.material.tabs.TabLayout.this.tabMaxWidth, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.textView != null) {
                float f = com.google.android.material.tabs.TabLayout.this.tabTextSize;
                int i3 = this.defaultMaxLines;
                android.widget.ImageView imageView = this.iconView;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    android.widget.TextView textView = this.textView;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = com.google.android.material.tabs.TabLayout.this.tabTextMultiLineSize;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.textView.getTextSize();
                int lineCount = this.textView.getLineCount();
                int maxLines = androidx.core.widget.TextViewCompat.getMaxLines(this.textView);
                if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                    if (com.google.android.material.tabs.TabLayout.this.mode == 1 && f > textSize && lineCount == 1 && ((layout = this.textView.getLayout()) == null || approximateLineWidth(layout, 0, f) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z = false;
                    }
                    if (z) {
                        this.textView.setTextSize(0, f);
                        this.textView.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        void setTab(com.google.android.material.tabs.TabLayout.Tab tab) {
            if (tab != this.tab) {
                this.tab = tab;
                update();
            }
        }

        void reset() {
            setTab(null);
            setSelected(false);
        }

        final void update() {
            com.google.android.material.tabs.TabLayout.Tab tab = this.tab;
            android.graphics.drawable.Drawable drawableMutate = null;
            android.view.View customView = tab != null ? tab.getCustomView() : null;
            if (customView != null) {
                android.view.ViewParent parent = customView.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((android.view.ViewGroup) parent).removeView(customView);
                    }
                    addView(customView);
                }
                this.customView = customView;
                android.widget.TextView textView = this.textView;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                android.widget.ImageView imageView = this.iconView;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.iconView.setImageDrawable(null);
                }
                android.widget.TextView textView2 = (android.widget.TextView) customView.findViewById(android.R.id.text1);
                this.customTextView = textView2;
                if (textView2 != null) {
                    this.defaultMaxLines = androidx.core.widget.TextViewCompat.getMaxLines(textView2);
                }
                this.customIconView = (android.widget.ImageView) customView.findViewById(android.R.id.icon);
            } else {
                android.view.View view = this.customView;
                if (view != null) {
                    removeView(view);
                    this.customView = null;
                }
                this.customTextView = null;
                this.customIconView = null;
            }
            if (this.customView == null) {
                if (this.iconView == null) {
                    inflateAndAddDefaultIconView();
                }
                if (tab != null && tab.getIcon() != null) {
                    drawableMutate = androidx.core.graphics.drawable.DrawableCompat.wrap(tab.getIcon()).mutate();
                }
                if (drawableMutate != null) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintList(drawableMutate, com.google.android.material.tabs.TabLayout.this.tabIconTint);
                    if (com.google.android.material.tabs.TabLayout.this.tabIconTintMode != null) {
                        androidx.core.graphics.drawable.DrawableCompat.setTintMode(drawableMutate, com.google.android.material.tabs.TabLayout.this.tabIconTintMode);
                    }
                }
                if (this.textView == null) {
                    inflateAndAddDefaultTextView();
                    this.defaultMaxLines = androidx.core.widget.TextViewCompat.getMaxLines(this.textView);
                }
                androidx.core.widget.TextViewCompat.setTextAppearance(this.textView, com.google.android.material.tabs.TabLayout.this.tabTextAppearance);
                if (com.google.android.material.tabs.TabLayout.this.tabTextColors != null) {
                    this.textView.setTextColor(com.google.android.material.tabs.TabLayout.this.tabTextColors);
                }
                updateTextAndIcon(this.textView, this.iconView);
                tryUpdateBadgeAnchor();
                addOnLayoutChangeListener(this.iconView);
                addOnLayoutChangeListener(this.textView);
            } else {
                android.widget.TextView textView3 = this.customTextView;
                if (textView3 != null || this.customIconView != null) {
                    updateTextAndIcon(textView3, this.customIconView);
                }
            }
            if (tab != null && !android.text.TextUtils.isEmpty(tab.contentDesc)) {
                setContentDescription(tab.contentDesc);
            }
            setSelected(tab != null && tab.isSelected());
        }

        private void inflateAndAddDefaultIconView() {
            android.view.ViewGroup viewGroup;
            if (com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT) {
                android.widget.FrameLayout frameLayoutCreatePreApi18BadgeAnchorRoot = createPreApi18BadgeAnchorRoot();
                addView(frameLayoutCreatePreApi18BadgeAnchorRoot, 0);
                viewGroup = frameLayoutCreatePreApi18BadgeAnchorRoot;
            } else {
                viewGroup = this;
            }
            android.widget.ImageView imageView = (android.widget.ImageView) android.view.LayoutInflater.from(getContext()).inflate(com.google.android.material.R.layout.design_layout_tab_icon, viewGroup, false);
            this.iconView = imageView;
            viewGroup.addView(imageView, 0);
        }

        private void inflateAndAddDefaultTextView() {
            android.view.ViewGroup viewGroup;
            if (com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT) {
                android.widget.FrameLayout frameLayoutCreatePreApi18BadgeAnchorRoot = createPreApi18BadgeAnchorRoot();
                addView(frameLayoutCreatePreApi18BadgeAnchorRoot);
                viewGroup = frameLayoutCreatePreApi18BadgeAnchorRoot;
            } else {
                viewGroup = this;
            }
            android.widget.TextView textView = (android.widget.TextView) android.view.LayoutInflater.from(getContext()).inflate(com.google.android.material.R.layout.design_layout_tab_text, viewGroup, false);
            this.textView = textView;
            viewGroup.addView(textView);
        }

        private android.widget.FrameLayout createPreApi18BadgeAnchorRoot() {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
            frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.google.android.material.badge.BadgeDrawable getOrCreateBadge() {
            if (this.badgeDrawable == null) {
                this.badgeDrawable = com.google.android.material.badge.BadgeDrawable.create(getContext());
            }
            tryUpdateBadgeAnchor();
            com.google.android.material.badge.BadgeDrawable badgeDrawable = this.badgeDrawable;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new java.lang.IllegalStateException("Unable to create badge");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.google.android.material.badge.BadgeDrawable getBadge() {
            return this.badgeDrawable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeBadge() {
            if (this.badgeAnchorView != null) {
                tryRemoveBadgeFromAnchor();
            }
            this.badgeDrawable = null;
        }

        private void addOnLayoutChangeListener(final android.view.View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: com.google.android.material.tabs.TabLayout.TabView.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(android.view.View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (view.getVisibility() == 0) {
                        com.google.android.material.tabs.TabLayout.TabView.this.tryUpdateBadgeDrawableBounds(view);
                    }
                }
            });
        }

        private void tryUpdateBadgeAnchor() {
            com.google.android.material.tabs.TabLayout.Tab tab;
            com.google.android.material.tabs.TabLayout.Tab tab2;
            if (hasBadgeDrawable()) {
                if (this.customView != null) {
                    tryRemoveBadgeFromAnchor();
                    return;
                }
                if (this.iconView != null && (tab2 = this.tab) != null && tab2.getIcon() != null) {
                    android.view.View view = this.badgeAnchorView;
                    android.widget.ImageView imageView = this.iconView;
                    if (view != imageView) {
                        tryRemoveBadgeFromAnchor();
                        tryAttachBadgeToAnchor(this.iconView);
                        return;
                    } else {
                        tryUpdateBadgeDrawableBounds(imageView);
                        return;
                    }
                }
                if (this.textView != null && (tab = this.tab) != null && tab.getTabLabelVisibility() == 1) {
                    android.view.View view2 = this.badgeAnchorView;
                    android.widget.TextView textView = this.textView;
                    if (view2 != textView) {
                        tryRemoveBadgeFromAnchor();
                        tryAttachBadgeToAnchor(this.textView);
                        return;
                    } else {
                        tryUpdateBadgeDrawableBounds(textView);
                        return;
                    }
                }
                tryRemoveBadgeFromAnchor();
            }
        }

        private void tryAttachBadgeToAnchor(android.view.View view) {
            if (hasBadgeDrawable() && view != null) {
                setClipChildren(false);
                setClipToPadding(false);
                com.google.android.material.badge.BadgeUtils.attachBadgeDrawable(this.badgeDrawable, view, getCustomParentForBadge(view));
                this.badgeAnchorView = view;
            }
        }

        private void tryRemoveBadgeFromAnchor() {
            if (hasBadgeDrawable() && this.badgeAnchorView != null) {
                setClipChildren(true);
                setClipToPadding(true);
                com.google.android.material.badge.BadgeDrawable badgeDrawable = this.badgeDrawable;
                android.view.View view = this.badgeAnchorView;
                com.google.android.material.badge.BadgeUtils.detachBadgeDrawable(badgeDrawable, view, getCustomParentForBadge(view));
                this.badgeAnchorView = null;
            }
        }

        final void updateOrientation() {
            setOrientation(!com.google.android.material.tabs.TabLayout.this.inlineLabel ? 1 : 0);
            android.widget.TextView textView = this.customTextView;
            if (textView != null || this.customIconView != null) {
                updateTextAndIcon(textView, this.customIconView);
            } else {
                updateTextAndIcon(this.textView, this.iconView);
            }
        }

        private void updateTextAndIcon(android.widget.TextView textView, android.widget.ImageView imageView) {
            com.google.android.material.tabs.TabLayout.Tab tab = this.tab;
            android.graphics.drawable.Drawable drawableMutate = (tab == null || tab.getIcon() == null) ? null : androidx.core.graphics.drawable.DrawableCompat.wrap(this.tab.getIcon()).mutate();
            com.google.android.material.tabs.TabLayout.Tab tab2 = this.tab;
            java.lang.CharSequence text = tab2 != null ? tab2.getText() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !android.text.TextUtils.isEmpty(text);
            if (textView != null) {
                if (z) {
                    textView.setText(text);
                    if (this.tab.labelVisibilityMode == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((java.lang.CharSequence) null);
                }
            }
            if (imageView != null) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iDpToPx = (z && imageView.getVisibility() == 0) ? (int) com.google.android.material.internal.ViewUtils.dpToPx(getContext(), 8) : 0;
                if (com.google.android.material.tabs.TabLayout.this.inlineLabel) {
                    if (iDpToPx != androidx.core.view.MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) {
                        androidx.core.view.MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, iDpToPx);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iDpToPx != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iDpToPx;
                    androidx.core.view.MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            com.google.android.material.tabs.TabLayout.Tab tab3 = this.tab;
            androidx.appcompat.widget.TooltipCompat.setTooltipText(this, z ? null : tab3 != null ? tab3.contentDesc : null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tryUpdateBadgeDrawableBounds(android.view.View view) {
            if (hasBadgeDrawable() && view == this.badgeAnchorView) {
                com.google.android.material.badge.BadgeUtils.setBadgeDrawableBounds(this.badgeDrawable, view, getCustomParentForBadge(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasBadgeDrawable() {
            return this.badgeDrawable != null;
        }

        private android.widget.FrameLayout getCustomParentForBadge(android.view.View view) {
            if ((view == this.iconView || view == this.textView) && com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT) {
                return (android.widget.FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getContentWidth() {
            android.view.View[] viewArr = {this.textView, this.iconView, this.customView};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                android.view.View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? java.lang.Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z ? java.lang.Math.max(iMax, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public com.google.android.material.tabs.TabLayout.Tab getTab() {
            return this.tab;
        }

        private float approximateLineWidth(android.text.Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }
    }

    private class SlidingTabIndicator extends android.widget.LinearLayout {
        private final android.graphics.drawable.GradientDrawable defaultSelectionIndicator;
        private android.animation.ValueAnimator indicatorAnimator;
        private int indicatorLeft;
        private int indicatorRight;
        private int layoutDirection;
        private int selectedIndicatorHeight;
        private final android.graphics.Paint selectedIndicatorPaint;
        int selectedPosition;
        float selectionOffset;

        SlidingTabIndicator(android.content.Context context) {
            super(context);
            this.selectedPosition = -1;
            this.layoutDirection = -1;
            this.indicatorLeft = -1;
            this.indicatorRight = -1;
            setWillNotDraw(false);
            this.selectedIndicatorPaint = new android.graphics.Paint();
            this.defaultSelectionIndicator = new android.graphics.drawable.GradientDrawable();
        }

        void setSelectedIndicatorColor(int i) {
            if (this.selectedIndicatorPaint.getColor() != i) {
                this.selectedIndicatorPaint.setColor(i);
                androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        void setSelectedIndicatorHeight(int i) {
            if (this.selectedIndicatorHeight != i) {
                this.selectedIndicatorHeight = i;
                androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        boolean childrenNeedLayout() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        void setIndicatorPositionFromTabPosition(int i, float f) {
            android.animation.ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.indicatorAnimator.cancel();
            }
            this.selectedPosition = i;
            this.selectionOffset = f;
            updateIndicatorPosition();
        }

        float getIndicatorPosition() {
            return this.selectedPosition + this.selectionOffset;
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (android.os.Build.VERSION.SDK_INT >= 23 || this.layoutDirection == i) {
                return;
            }
            requestLayout();
            this.layoutDirection = i;
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (android.view.View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            boolean z = true;
            if (com.google.android.material.tabs.TabLayout.this.tabGravity == 1 || com.google.android.material.tabs.TabLayout.this.mode == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i3 = 0; i3 < childCount; i3++) {
                    android.view.View childAt = getChildAt(i3);
                    if (childAt.getVisibility() == 0) {
                        iMax = java.lang.Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) com.google.android.material.internal.ViewUtils.dpToPx(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    com.google.android.material.tabs.TabLayout.this.tabGravity = 0;
                    com.google.android.material.tabs.TabLayout.this.updateTabViews(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            android.animation.ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.indicatorAnimator.cancel();
                animateIndicatorToPosition(this.selectedPosition, java.lang.Math.round((1.0f - this.indicatorAnimator.getAnimatedFraction()) * this.indicatorAnimator.getDuration()));
                return;
            }
            updateIndicatorPosition();
        }

        private void updateIndicatorPosition() {
            int left;
            int right;
            android.view.View childAt = getChildAt(this.selectedPosition);
            if (childAt == null || childAt.getWidth() <= 0) {
                left = -1;
                right = -1;
            } else {
                left = childAt.getLeft();
                right = childAt.getRight();
                if (!com.google.android.material.tabs.TabLayout.this.tabIndicatorFullWidth && (childAt instanceof com.google.android.material.tabs.TabLayout.TabView)) {
                    calculateTabViewContentBounds((com.google.android.material.tabs.TabLayout.TabView) childAt, com.google.android.material.tabs.TabLayout.this.tabViewContentBounds);
                    left = (int) com.google.android.material.tabs.TabLayout.this.tabViewContentBounds.left;
                    right = (int) com.google.android.material.tabs.TabLayout.this.tabViewContentBounds.right;
                }
                if (this.selectionOffset > 0.0f && this.selectedPosition < getChildCount() - 1) {
                    android.view.View childAt2 = getChildAt(this.selectedPosition + 1);
                    int left2 = childAt2.getLeft();
                    int right2 = childAt2.getRight();
                    if (!com.google.android.material.tabs.TabLayout.this.tabIndicatorFullWidth && (childAt2 instanceof com.google.android.material.tabs.TabLayout.TabView)) {
                        calculateTabViewContentBounds((com.google.android.material.tabs.TabLayout.TabView) childAt2, com.google.android.material.tabs.TabLayout.this.tabViewContentBounds);
                        left2 = (int) com.google.android.material.tabs.TabLayout.this.tabViewContentBounds.left;
                        right2 = (int) com.google.android.material.tabs.TabLayout.this.tabViewContentBounds.right;
                    }
                    float f = this.selectionOffset;
                    left = (int) ((left2 * f) + ((1.0f - f) * left));
                    right = (int) ((right2 * f) + ((1.0f - f) * right));
                }
            }
            setIndicatorPosition(left, right);
        }

        void setIndicatorPosition(int i, int i2) {
            if (i == this.indicatorLeft && i2 == this.indicatorRight) {
                return;
            }
            this.indicatorLeft = i;
            this.indicatorRight = i2;
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        }

        void animateIndicatorToPosition(final int i, int i2) {
            android.animation.ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.indicatorAnimator.cancel();
            }
            android.view.View childAt = getChildAt(i);
            if (childAt == null) {
                updateIndicatorPosition();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            if (!com.google.android.material.tabs.TabLayout.this.tabIndicatorFullWidth && (childAt instanceof com.google.android.material.tabs.TabLayout.TabView)) {
                calculateTabViewContentBounds((com.google.android.material.tabs.TabLayout.TabView) childAt, com.google.android.material.tabs.TabLayout.this.tabViewContentBounds);
                left = (int) com.google.android.material.tabs.TabLayout.this.tabViewContentBounds.left;
                right = (int) com.google.android.material.tabs.TabLayout.this.tabViewContentBounds.right;
            }
            final int i3 = left;
            final int i4 = right;
            final int i5 = this.indicatorLeft;
            final int i6 = this.indicatorRight;
            if (i5 == i3 && i6 == i4) {
                return;
            }
            android.animation.ValueAnimator valueAnimator2 = new android.animation.ValueAnimator();
            this.indicatorAnimator = valueAnimator2;
            valueAnimator2.setInterpolator(com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            valueAnimator2.setDuration(i2);
            valueAnimator2.setFloatValues(0.0f, 1.0f);
            valueAnimator2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.SlidingTabIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator3) {
                    float animatedFraction = valueAnimator3.getAnimatedFraction();
                    com.google.android.material.tabs.TabLayout.SlidingTabIndicator.this.setIndicatorPosition(com.google.android.material.animation.AnimationUtils.lerp(i5, i3, animatedFraction), com.google.android.material.animation.AnimationUtils.lerp(i6, i4, animatedFraction));
                }
            });
            valueAnimator2.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.tabs.TabLayout.SlidingTabIndicator.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    com.google.android.material.tabs.TabLayout.SlidingTabIndicator.this.selectedPosition = i;
                    com.google.android.material.tabs.TabLayout.SlidingTabIndicator.this.selectionOffset = 0.0f;
                }
            });
            valueAnimator2.start();
        }

        private void calculateTabViewContentBounds(com.google.android.material.tabs.TabLayout.TabView tabView, android.graphics.RectF rectF) {
            int contentWidth = tabView.getContentWidth();
            int iDpToPx = (int) com.google.android.material.internal.ViewUtils.dpToPx(getContext(), 24);
            if (contentWidth < iDpToPx) {
                contentWidth = iDpToPx;
            }
            int left = (tabView.getLeft() + tabView.getRight()) / 2;
            int i = contentWidth / 2;
            rectF.set(left - i, 0.0f, left + i, 0.0f);
        }

        @Override // android.view.View
        public void draw(android.graphics.Canvas canvas) {
            int height = 0;
            int intrinsicHeight = com.google.android.material.tabs.TabLayout.this.tabSelectedIndicator != null ? com.google.android.material.tabs.TabLayout.this.tabSelectedIndicator.getIntrinsicHeight() : 0;
            int i = this.selectedIndicatorHeight;
            if (i >= 0) {
                intrinsicHeight = i;
            }
            int i2 = com.google.android.material.tabs.TabLayout.this.tabIndicatorGravity;
            if (i2 == 0) {
                height = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
            } else if (i2 == 1) {
                height = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
            } else if (i2 != 2) {
                intrinsicHeight = i2 != 3 ? 0 : getHeight();
            }
            int i3 = this.indicatorLeft;
            if (i3 >= 0 && this.indicatorRight > i3) {
                android.graphics.drawable.Drawable drawableWrap = androidx.core.graphics.drawable.DrawableCompat.wrap(com.google.android.material.tabs.TabLayout.this.tabSelectedIndicator != null ? com.google.android.material.tabs.TabLayout.this.tabSelectedIndicator : this.defaultSelectionIndicator);
                drawableWrap.setBounds(this.indicatorLeft, height, this.indicatorRight, intrinsicHeight);
                if (this.selectedIndicatorPaint != null) {
                    if (android.os.Build.VERSION.SDK_INT == 21) {
                        drawableWrap.setColorFilter(this.selectedIndicatorPaint.getColor(), android.graphics.PorterDuff.Mode.SRC_IN);
                    } else {
                        androidx.core.graphics.drawable.DrawableCompat.setTint(drawableWrap, this.selectedIndicatorPaint.getColor());
                    }
                }
                drawableWrap.draw(canvas);
            }
            super.draw(canvas);
        }
    }

    private static android.content.res.ColorStateList createColorStateList(int i, int i2) {
        return new android.content.res.ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private int getDefaultHeight() {
        int size = this.tabs.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            com.google.android.material.tabs.TabLayout.Tab tab = this.tabs.get(i);
            if (tab != null && tab.getIcon() != null && !android.text.TextUtils.isEmpty(tab.getText())) {
                z = true;
                break;
            }
        }
        return (!z || this.inlineLabel) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.requestedTabMinWidth;
        if (i != -1) {
            return i;
        }
        int i2 = this.mode;
        if (i2 == 0 || i2 == 2) {
            return this.scrollableTabMinWidth;
        }
        return 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    int getTabMaxWidth() {
        return this.tabMaxWidth;
    }

    public static class TabLayoutOnPageChangeListener implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
        private int previousScrollState;
        private int scrollState;
        private final java.lang.ref.WeakReference<com.google.android.material.tabs.TabLayout> tabLayoutRef;

        public TabLayoutOnPageChangeListener(com.google.android.material.tabs.TabLayout tabLayout) {
            this.tabLayoutRef = new java.lang.ref.WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.previousScrollState = this.scrollState;
            this.scrollState = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            com.google.android.material.tabs.TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null) {
                int i3 = this.scrollState;
                tabLayout.setScrollPosition(i, f, i3 != 2 || this.previousScrollState == 1, (i3 == 2 && this.previousScrollState == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            com.google.android.material.tabs.TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.scrollState;
            tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.previousScrollState == 0));
        }

        void reset() {
            this.scrollState = 0;
            this.previousScrollState = 0;
        }
    }

    public static class ViewPagerOnTabSelectedListener implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
        private final androidx.viewpager.widget.ViewPager viewPager;

        @Override // com.google.android.material.tabs.TabLayout.OnTabSelectedListener
        public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.OnTabSelectedListener
        public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab tab) {
        }

        public ViewPagerOnTabSelectedListener(androidx.viewpager.widget.ViewPager viewPager) {
            this.viewPager = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.OnTabSelectedListener
        public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab tab) {
            this.viewPager.setCurrentItem(tab.getPosition());
        }
    }

    private class PagerAdapterObserver extends android.database.DataSetObserver {
        PagerAdapterObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            com.google.android.material.tabs.TabLayout.this.populateFromPagerAdapter();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            com.google.android.material.tabs.TabLayout.this.populateFromPagerAdapter();
        }
    }

    private class AdapterChangeListener implements androidx.viewpager.widget.ViewPager.OnAdapterChangeListener {
        private boolean autoRefresh;

        AdapterChangeListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(androidx.viewpager.widget.ViewPager viewPager, androidx.viewpager.widget.PagerAdapter pagerAdapter, androidx.viewpager.widget.PagerAdapter pagerAdapter2) {
            if (com.google.android.material.tabs.TabLayout.this.viewPager == viewPager) {
                com.google.android.material.tabs.TabLayout.this.setPagerAdapter(pagerAdapter2, this.autoRefresh);
            }
        }

        void setAutoRefresh(boolean z) {
            this.autoRefresh = z;
        }
    }
}
