package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class AppCompatDelegateImpl extends androidx.appcompat.app.AppCompatDelegate implements androidx.appcompat.view.menu.MenuBuilder.Callback, android.view.LayoutInflater.Factory2 {
    private static final boolean DEBUG = false;
    static final java.lang.String EXCEPTION_HANDLER_MESSAGE_SUFFIX = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    private static final boolean IS_PRE_LOLLIPOP;
    private static final boolean sAlwaysOverrideConfiguration;
    private static boolean sInstalledExceptionHandler;
    private static final java.util.Map<java.lang.Class<?>, java.lang.Integer> sLocalNightModes = new androidx.collection.ArrayMap();
    private static final int[] sWindowBackgroundStyleable;
    androidx.appcompat.app.ActionBar mActionBar;
    private androidx.appcompat.app.AppCompatDelegateImpl.ActionMenuPresenterCallback mActionMenuPresenterCallback;
    androidx.appcompat.view.ActionMode mActionMode;
    android.widget.PopupWindow mActionModePopup;
    androidx.appcompat.widget.ActionBarContextView mActionModeView;
    private boolean mActivityHandlesUiMode;
    private boolean mActivityHandlesUiModeChecked;
    final androidx.appcompat.app.AppCompatCallback mAppCompatCallback;
    private androidx.appcompat.app.AppCompatViewInflater mAppCompatViewInflater;
    private androidx.appcompat.app.AppCompatDelegateImpl.AppCompatWindowCallback mAppCompatWindowCallback;
    private androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager mAutoBatteryNightModeManager;
    private androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager mAutoTimeNightModeManager;
    private boolean mBaseContextAttached;
    private boolean mClosingActionMenu;
    final android.content.Context mContext;
    private boolean mCreated;
    private androidx.appcompat.widget.DecorContentParent mDecorContentParent;
    private boolean mEnableDefaultActionBarUp;
    androidx.core.view.ViewPropertyAnimatorCompat mFadeAnim;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    private boolean mHandleNativeActionModes;
    boolean mHasActionBar;
    final java.lang.Object mHost;
    int mInvalidatePanelMenuFeatures;
    boolean mInvalidatePanelMenuPosted;
    private final java.lang.Runnable mInvalidatePanelMenuRunnable;
    boolean mIsDestroyed;
    boolean mIsFloating;
    private int mLocalNightMode;
    private boolean mLongPressBackDown;
    android.view.MenuInflater mMenuInflater;
    boolean mOverlayActionBar;
    boolean mOverlayActionMode;
    private androidx.appcompat.app.AppCompatDelegateImpl.PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    private androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState[] mPanels;
    private androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState mPreparedPanel;
    java.lang.Runnable mShowActionModePopup;
    private boolean mStarted;
    private android.view.View mStatusGuard;
    private android.view.ViewGroup mSubDecor;
    private boolean mSubDecorInstalled;
    private android.graphics.Rect mTempRect1;
    private android.graphics.Rect mTempRect2;
    private int mThemeResId;
    private java.lang.CharSequence mTitle;
    private android.widget.TextView mTitleView;
    android.view.Window mWindow;
    boolean mWindowNoTitle;

    void onSubDecorInstalled(android.view.ViewGroup viewGroup) {
    }

    static {
        boolean z = false;
        boolean z2 = android.os.Build.VERSION.SDK_INT < 21;
        IS_PRE_LOLLIPOP = z2;
        sWindowBackgroundStyleable = new int[]{android.R.attr.windowBackground};
        if (android.os.Build.VERSION.SDK_INT >= 21 && android.os.Build.VERSION.SDK_INT <= 25) {
            z = true;
        }
        sAlwaysOverrideConfiguration = z;
        if (!z2 || sInstalledExceptionHandler) {
            return;
        }
        final java.lang.Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        java.lang.Thread.setDefaultUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
                if (shouldWrapException(th)) {
                    android.content.res.Resources.NotFoundException notFoundException = new android.content.res.Resources.NotFoundException(th.getMessage() + androidx.appcompat.app.AppCompatDelegateImpl.EXCEPTION_HANDLER_MESSAGE_SUFFIX);
                    notFoundException.initCause(th.getCause());
                    notFoundException.setStackTrace(th.getStackTrace());
                    defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                    return;
                }
                defaultUncaughtExceptionHandler.uncaughtException(thread, th);
            }

            private boolean shouldWrapException(java.lang.Throwable th) {
                java.lang.String message;
                if (!(th instanceof android.content.res.Resources.NotFoundException) || (message = th.getMessage()) == null) {
                    return false;
                }
                return message.contains("drawable") || message.contains("Drawable");
            }
        });
        sInstalledExceptionHandler = true;
    }

    AppCompatDelegateImpl(android.app.Activity activity, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        this(activity, null, appCompatCallback, activity);
    }

    AppCompatDelegateImpl(android.app.Dialog dialog, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        this(dialog.getContext(), dialog.getWindow(), appCompatCallback, dialog);
    }

    AppCompatDelegateImpl(android.content.Context context, android.view.Window window, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        this(context, window, appCompatCallback, context);
    }

    AppCompatDelegateImpl(android.content.Context context, android.app.Activity activity, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        this(context, null, appCompatCallback, activity);
    }

    private AppCompatDelegateImpl(android.content.Context context, android.view.Window window, androidx.appcompat.app.AppCompatCallback appCompatCallback, java.lang.Object obj) {
        java.util.Map<java.lang.Class<?>, java.lang.Integer> map;
        java.lang.Integer num;
        androidx.appcompat.app.AppCompatActivity appCompatActivityTryUnwrapContext;
        this.mFadeAnim = null;
        this.mHandleNativeActionModes = true;
        this.mLocalNightMode = -100;
        this.mInvalidatePanelMenuRunnable = new java.lang.Runnable() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.2
            @Override // java.lang.Runnable
            public void run() {
                if ((androidx.appcompat.app.AppCompatDelegateImpl.this.mInvalidatePanelMenuFeatures & 1) != 0) {
                    androidx.appcompat.app.AppCompatDelegateImpl.this.doInvalidatePanelMenu(0);
                }
                if ((androidx.appcompat.app.AppCompatDelegateImpl.this.mInvalidatePanelMenuFeatures & 4096) != 0) {
                    androidx.appcompat.app.AppCompatDelegateImpl.this.doInvalidatePanelMenu(108);
                }
                androidx.appcompat.app.AppCompatDelegateImpl.this.mInvalidatePanelMenuPosted = false;
                androidx.appcompat.app.AppCompatDelegateImpl.this.mInvalidatePanelMenuFeatures = 0;
            }
        };
        this.mContext = context;
        this.mAppCompatCallback = appCompatCallback;
        this.mHost = obj;
        if (this.mLocalNightMode == -100 && (obj instanceof android.app.Dialog) && (appCompatActivityTryUnwrapContext = tryUnwrapContext()) != null) {
            this.mLocalNightMode = appCompatActivityTryUnwrapContext.getDelegate().getLocalNightMode();
        }
        if (this.mLocalNightMode == -100 && (num = (map = sLocalNightModes).get(obj.getClass())) != null) {
            this.mLocalNightMode = num.intValue();
            map.remove(obj.getClass());
        }
        if (window != null) {
            attachToWindow(window);
        }
        androidx.appcompat.widget.AppCompatDrawableManager.preload();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void attachBaseContext(android.content.Context context) {
        applyDayNight(false);
        this.mBaseContextAttached = true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onCreate(android.os.Bundle bundle) {
        this.mBaseContextAttached = true;
        applyDayNight(false);
        ensureWindow();
        java.lang.Object obj = this.mHost;
        if (obj instanceof android.app.Activity) {
            java.lang.String parentActivityName = null;
            try {
                parentActivityName = androidx.core.app.NavUtils.getParentActivityName((android.app.Activity) obj);
            } catch (java.lang.IllegalArgumentException unused) {
            }
            if (parentActivityName != null) {
                androidx.appcompat.app.ActionBar actionBarPeekSupportActionBar = peekSupportActionBar();
                if (actionBarPeekSupportActionBar == null) {
                    this.mEnableDefaultActionBarUp = true;
                } else {
                    actionBarPeekSupportActionBar.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
        }
        this.mCreated = true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onPostCreate(android.os.Bundle bundle) {
        ensureSubDecor();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public androidx.appcompat.app.ActionBar getSupportActionBar() {
        initWindowDecorActionBar();
        return this.mActionBar;
    }

    final androidx.appcompat.app.ActionBar peekSupportActionBar() {
        return this.mActionBar;
    }

    final android.view.Window.Callback getWindowCallback() {
        return this.mWindow.getCallback();
    }

    private void initWindowDecorActionBar() {
        ensureSubDecor();
        if (this.mHasActionBar && this.mActionBar == null) {
            java.lang.Object obj = this.mHost;
            if (obj instanceof android.app.Activity) {
                this.mActionBar = new androidx.appcompat.app.WindowDecorActionBar((android.app.Activity) this.mHost, this.mOverlayActionBar);
            } else if (obj instanceof android.app.Dialog) {
                this.mActionBar = new androidx.appcompat.app.WindowDecorActionBar((android.app.Dialog) this.mHost);
            }
            androidx.appcompat.app.ActionBar actionBar = this.mActionBar;
            if (actionBar != null) {
                actionBar.setDefaultDisplayHomeAsUpEnabled(this.mEnableDefaultActionBarUp);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setSupportActionBar(androidx.appcompat.widget.Toolbar toolbar) {
        if (this.mHost instanceof android.app.Activity) {
            androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar instanceof androidx.appcompat.app.WindowDecorActionBar) {
                throw new java.lang.IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.mMenuInflater = null;
            if (supportActionBar != null) {
                supportActionBar.onDestroy();
            }
            if (toolbar != null) {
                androidx.appcompat.app.ToolbarActionBar toolbarActionBar = new androidx.appcompat.app.ToolbarActionBar(toolbar, getTitle(), this.mAppCompatWindowCallback);
                this.mActionBar = toolbarActionBar;
                this.mWindow.setCallback(toolbarActionBar.getWrappedWindowCallback());
            } else {
                this.mActionBar = null;
                this.mWindow.setCallback(this.mAppCompatWindowCallback);
            }
            invalidateOptionsMenu();
        }
    }

    final android.content.Context getActionBarThemedContext() {
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        android.content.Context themedContext = supportActionBar != null ? supportActionBar.getThemedContext() : null;
        return themedContext == null ? this.mContext : themedContext;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public android.view.MenuInflater getMenuInflater() {
        if (this.mMenuInflater == null) {
            initWindowDecorActionBar();
            androidx.appcompat.app.ActionBar actionBar = this.mActionBar;
            this.mMenuInflater = new androidx.appcompat.view.SupportMenuInflater(actionBar != null ? actionBar.getThemedContext() : this.mContext);
        }
        return this.mMenuInflater;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public <T extends android.view.View> T findViewById(int i) {
        ensureSubDecor();
        return (T) this.mWindow.findViewById(i);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        androidx.appcompat.app.ActionBar supportActionBar;
        if (this.mHasActionBar && this.mSubDecorInstalled && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.onConfigurationChanged(configuration);
        }
        androidx.appcompat.widget.AppCompatDrawableManager.get().onConfigurationChanged(this.mContext);
        applyDayNight(false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onStart() {
        this.mStarted = true;
        applyDayNight();
        markStarted(this);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onStop() {
        this.mStarted = false;
        markStopped(this);
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
        }
        if (this.mHost instanceof android.app.Dialog) {
            cleanupAutoManagers();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onPostResume() {
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(android.view.View view) {
        ensureSubDecor();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.mSubDecor.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.mAppCompatWindowCallback.getWrapped().onContentChanged();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(int i) {
        ensureSubDecor();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.mSubDecor.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        android.view.LayoutInflater.from(this.mContext).inflate(i, viewGroup);
        this.mAppCompatWindowCallback.getWrapped().onContentChanged();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        ensureSubDecor();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.mSubDecor.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.mAppCompatWindowCallback.getWrapped().onContentChanged();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        ensureSubDecor();
        ((android.view.ViewGroup) this.mSubDecor.findViewById(android.R.id.content)).addView(view, layoutParams);
        this.mAppCompatWindowCallback.getWrapped().onContentChanged();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onSaveInstanceState(android.os.Bundle bundle) {
        if (this.mLocalNightMode != -100) {
            sLocalNightModes.put(this.mHost.getClass(), java.lang.Integer.valueOf(this.mLocalNightMode));
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onDestroy() {
        markStopped(this);
        if (this.mInvalidatePanelMenuPosted) {
            this.mWindow.getDecorView().removeCallbacks(this.mInvalidatePanelMenuRunnable);
        }
        this.mStarted = false;
        this.mIsDestroyed = true;
        androidx.appcompat.app.ActionBar actionBar = this.mActionBar;
        if (actionBar != null) {
            actionBar.onDestroy();
        }
        cleanupAutoManagers();
    }

    private void cleanupAutoManagers() {
        androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager autoNightModeManager = this.mAutoTimeNightModeManager;
        if (autoNightModeManager != null) {
            autoNightModeManager.cleanup();
        }
        androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager autoNightModeManager2 = this.mAutoBatteryNightModeManager;
        if (autoNightModeManager2 != null) {
            autoNightModeManager2.cleanup();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setTheme(int i) {
        this.mThemeResId = i;
    }

    private void ensureWindow() {
        if (this.mWindow == null) {
            java.lang.Object obj = this.mHost;
            if (obj instanceof android.app.Activity) {
                attachToWindow(((android.app.Activity) obj).getWindow());
            }
        }
        if (this.mWindow == null) {
            throw new java.lang.IllegalStateException("We have not been given a Window");
        }
    }

    private void attachToWindow(android.view.Window window) {
        if (this.mWindow != null) {
            throw new java.lang.IllegalStateException("AppCompat has already installed itself into the Window");
        }
        android.view.Window.Callback callback = window.getCallback();
        if (callback instanceof androidx.appcompat.app.AppCompatDelegateImpl.AppCompatWindowCallback) {
            throw new java.lang.IllegalStateException("AppCompat has already installed itself into the Window");
        }
        androidx.appcompat.app.AppCompatDelegateImpl.AppCompatWindowCallback appCompatWindowCallback = new androidx.appcompat.app.AppCompatDelegateImpl.AppCompatWindowCallback(callback);
        this.mAppCompatWindowCallback = appCompatWindowCallback;
        window.setCallback(appCompatWindowCallback);
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(this.mContext, (android.util.AttributeSet) null, sWindowBackgroundStyleable);
        android.graphics.drawable.Drawable drawableIfKnown = tintTypedArrayObtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            window.setBackgroundDrawable(drawableIfKnown);
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        this.mWindow = window;
    }

    private void ensureSubDecor() {
        if (this.mSubDecorInstalled) {
            return;
        }
        this.mSubDecor = createSubDecor();
        java.lang.CharSequence title = getTitle();
        if (!android.text.TextUtils.isEmpty(title)) {
            androidx.appcompat.widget.DecorContentParent decorContentParent = this.mDecorContentParent;
            if (decorContentParent != null) {
                decorContentParent.setWindowTitle(title);
            } else if (peekSupportActionBar() != null) {
                peekSupportActionBar().setWindowTitle(title);
            } else {
                android.widget.TextView textView = this.mTitleView;
                if (textView != null) {
                    textView.setText(title);
                }
            }
        }
        applyFixedSizeWindow();
        onSubDecorInstalled(this.mSubDecor);
        this.mSubDecorInstalled = true;
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelState = getPanelState(0, false);
        if (this.mIsDestroyed) {
            return;
        }
        if (panelState == null || panelState.menu == null) {
            invalidatePanelMenu(108);
        }
    }

    private android.view.ViewGroup createSubDecor() {
        android.view.ViewGroup viewGroup;
        android.content.Context contextThemeWrapper;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme);
        if (!typedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new java.lang.IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowNoTitle, false)) {
            requestWindowFeature(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar, false)) {
            requestWindowFeature(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            requestWindowFeature(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            requestWindowFeature(10);
        }
        this.mIsFloating = typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        ensureWindow();
        this.mWindow.getDecorView();
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(this.mContext);
        if (!this.mWindowNoTitle) {
            if (this.mIsFloating) {
                viewGroup = (android.view.ViewGroup) layoutInflaterFrom.inflate(androidx.appcompat.R.layout.abc_dialog_title_material, (android.view.ViewGroup) null);
                this.mOverlayActionBar = false;
                this.mHasActionBar = false;
            } else if (this.mHasActionBar) {
                android.util.TypedValue typedValue = new android.util.TypedValue();
                this.mContext.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    contextThemeWrapper = new androidx.appcompat.view.ContextThemeWrapper(this.mContext, typedValue.resourceId);
                } else {
                    contextThemeWrapper = this.mContext;
                }
                viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(contextThemeWrapper).inflate(androidx.appcompat.R.layout.abc_screen_toolbar, (android.view.ViewGroup) null);
                androidx.appcompat.widget.DecorContentParent decorContentParent = (androidx.appcompat.widget.DecorContentParent) viewGroup.findViewById(androidx.appcompat.R.id.decor_content_parent);
                this.mDecorContentParent = decorContentParent;
                decorContentParent.setWindowCallback(getWindowCallback());
                if (this.mOverlayActionBar) {
                    this.mDecorContentParent.initFeature(109);
                }
                if (this.mFeatureProgress) {
                    this.mDecorContentParent.initFeature(2);
                }
                if (this.mFeatureIndeterminateProgress) {
                    this.mDecorContentParent.initFeature(5);
                }
            } else {
                viewGroup = null;
            }
        } else {
            if (this.mOverlayActionMode) {
                viewGroup = (android.view.ViewGroup) layoutInflaterFrom.inflate(androidx.appcompat.R.layout.abc_screen_simple_overlay_action_mode, (android.view.ViewGroup) null);
            } else {
                viewGroup = (android.view.ViewGroup) layoutInflaterFrom.inflate(androidx.appcompat.R.layout.abc_screen_simple, (android.view.ViewGroup) null);
            }
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.3
                    @Override // androidx.core.view.OnApplyWindowInsetsListener
                    public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
                        int iUpdateStatusGuard = androidx.appcompat.app.AppCompatDelegateImpl.this.updateStatusGuard(systemWindowInsetTop);
                        if (systemWindowInsetTop != iUpdateStatusGuard) {
                            windowInsetsCompat = windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), iUpdateStatusGuard, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                        }
                        return androidx.core.view.ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                    }
                });
            } else {
                ((androidx.appcompat.widget.FitWindowsViewGroup) viewGroup).setOnFitSystemWindowsListener(new androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.4
                    @Override // androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
                    public void onFitSystemWindows(android.graphics.Rect rect) {
                        rect.top = androidx.appcompat.app.AppCompatDelegateImpl.this.updateStatusGuard(rect.top);
                    }
                });
            }
        }
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.mHasActionBar + ", windowActionBarOverlay: " + this.mOverlayActionBar + ", android:windowIsFloating: " + this.mIsFloating + ", windowActionModeOverlay: " + this.mOverlayActionMode + ", windowNoTitle: " + this.mWindowNoTitle + " }");
        }
        if (this.mDecorContentParent == null) {
            this.mTitleView = (android.widget.TextView) viewGroup.findViewById(androidx.appcompat.R.id.title);
        }
        androidx.appcompat.widget.ViewUtils.makeOptionalFitsSystemWindows(viewGroup);
        androidx.appcompat.widget.ContentFrameLayout contentFrameLayout = (androidx.appcompat.widget.ContentFrameLayout) viewGroup.findViewById(androidx.appcompat.R.id.action_bar_activity_content);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.mWindow.findViewById(android.R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                android.view.View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(android.R.id.content);
            if (viewGroup2 instanceof android.widget.FrameLayout) {
                ((android.widget.FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.mWindow.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new androidx.appcompat.widget.ContentFrameLayout.OnAttachListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.5
            @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
            public void onAttachedFromWindow() {
            }

            @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
            public void onDetachedFromWindow() {
                androidx.appcompat.app.AppCompatDelegateImpl.this.dismissPopups();
            }
        });
        return viewGroup;
    }

    private void applyFixedSizeWindow() {
        androidx.appcompat.widget.ContentFrameLayout contentFrameLayout = (androidx.appcompat.widget.ContentFrameLayout) this.mSubDecor.findViewById(android.R.id.content);
        android.view.View decorView = this.mWindow.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme);
        typedArrayObtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean requestWindowFeature(int i) {
        int iSanitizeWindowFeatureId = sanitizeWindowFeatureId(i);
        if (this.mWindowNoTitle && iSanitizeWindowFeatureId == 108) {
            return false;
        }
        if (this.mHasActionBar && iSanitizeWindowFeatureId == 1) {
            this.mHasActionBar = false;
        }
        if (iSanitizeWindowFeatureId == 1) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mWindowNoTitle = true;
            return true;
        }
        if (iSanitizeWindowFeatureId == 2) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mFeatureProgress = true;
            return true;
        }
        if (iSanitizeWindowFeatureId == 5) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mFeatureIndeterminateProgress = true;
            return true;
        }
        if (iSanitizeWindowFeatureId == 10) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mOverlayActionMode = true;
            return true;
        }
        if (iSanitizeWindowFeatureId == 108) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mHasActionBar = true;
            return true;
        }
        if (iSanitizeWindowFeatureId == 109) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mOverlayActionBar = true;
            return true;
        }
        return this.mWindow.requestFeature(iSanitizeWindowFeatureId);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean hasWindowFeature(int i) {
        boolean z;
        int iSanitizeWindowFeatureId = sanitizeWindowFeatureId(i);
        if (iSanitizeWindowFeatureId == 1) {
            z = this.mWindowNoTitle;
        } else if (iSanitizeWindowFeatureId == 2) {
            z = this.mFeatureProgress;
        } else if (iSanitizeWindowFeatureId == 5) {
            z = this.mFeatureIndeterminateProgress;
        } else if (iSanitizeWindowFeatureId == 10) {
            z = this.mOverlayActionMode;
        } else if (iSanitizeWindowFeatureId == 108) {
            z = this.mHasActionBar;
        } else {
            z = iSanitizeWindowFeatureId != 109 ? false : this.mOverlayActionBar;
        }
        return z || this.mWindow.hasFeature(i);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setTitle(java.lang.CharSequence charSequence) {
        this.mTitle = charSequence;
        androidx.appcompat.widget.DecorContentParent decorContentParent = this.mDecorContentParent;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
            return;
        }
        if (peekSupportActionBar() != null) {
            peekSupportActionBar().setWindowTitle(charSequence);
            return;
        }
        android.widget.TextView textView = this.mTitleView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    final java.lang.CharSequence getTitle() {
        java.lang.Object obj = this.mHost;
        if (obj instanceof android.app.Activity) {
            return ((android.app.Activity) obj).getTitle();
        }
        return this.mTitle;
    }

    void onPanelClosed(int i) {
        if (i == 108) {
            androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.dispatchMenuVisibilityChanged(false);
                return;
            }
            return;
        }
        if (i == 0) {
            androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelState = getPanelState(i, true);
            if (panelState.isOpen) {
                closePanel(panelState, false);
            }
        }
    }

    void onMenuOpened(int i) {
        androidx.appcompat.app.ActionBar supportActionBar;
        if (i != 108 || (supportActionBar = getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.dispatchMenuVisibilityChanged(true);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureStateFindMenuPanel;
        android.view.Window.Callback windowCallback = getWindowCallback();
        if (windowCallback == null || this.mIsDestroyed || (panelFeatureStateFindMenuPanel = findMenuPanel(menuBuilder.getRootMenu())) == null) {
            return false;
        }
        return windowCallback.onMenuItemSelected(panelFeatureStateFindMenuPanel.featureId, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        reopenMenu(menuBuilder, true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public androidx.appcompat.view.ActionMode startSupportActionMode(androidx.appcompat.view.ActionMode.Callback callback) {
        androidx.appcompat.app.AppCompatCallback appCompatCallback;
        if (callback == null) {
            throw new java.lang.IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.ActionMode actionMode = this.mActionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9 actionModeCallbackWrapperV9 = new androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9(callback);
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            androidx.appcompat.view.ActionMode actionModeStartActionMode = supportActionBar.startActionMode(actionModeCallbackWrapperV9);
            this.mActionMode = actionModeStartActionMode;
            if (actionModeStartActionMode != null && (appCompatCallback = this.mAppCompatCallback) != null) {
                appCompatCallback.onSupportActionModeStarted(actionModeStartActionMode);
            }
        }
        if (this.mActionMode == null) {
            this.mActionMode = startSupportActionModeFromWindow(actionModeCallbackWrapperV9);
        }
        return this.mActionMode;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void invalidateOptionsMenu() {
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar == null || !supportActionBar.invalidateOptionsMenu()) {
            invalidatePanelMenu(0);
        }
    }

    androidx.appcompat.view.ActionMode startSupportActionModeFromWindow(androidx.appcompat.view.ActionMode.Callback callback) {
        androidx.appcompat.view.ActionMode actionModeOnWindowStartingSupportActionMode;
        android.content.Context contextThemeWrapper;
        androidx.appcompat.app.AppCompatCallback appCompatCallback;
        endOnGoingFadeAnimation();
        androidx.appcompat.view.ActionMode actionMode = this.mActionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        if (!(callback instanceof androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9)) {
            callback = new androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9(callback);
        }
        androidx.appcompat.app.AppCompatCallback appCompatCallback2 = this.mAppCompatCallback;
        if (appCompatCallback2 == null || this.mIsDestroyed) {
            actionModeOnWindowStartingSupportActionMode = null;
        } else {
            try {
                actionModeOnWindowStartingSupportActionMode = appCompatCallback2.onWindowStartingSupportActionMode(callback);
            } catch (java.lang.AbstractMethodError unused) {
                actionModeOnWindowStartingSupportActionMode = null;
            }
        }
        if (actionModeOnWindowStartingSupportActionMode != null) {
            this.mActionMode = actionModeOnWindowStartingSupportActionMode;
        } else {
            if (this.mActionModeView == null) {
                if (this.mIsFloating) {
                    android.util.TypedValue typedValue = new android.util.TypedValue();
                    android.content.res.Resources.Theme theme = this.mContext.getTheme();
                    theme.resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        android.content.res.Resources.Theme themeNewTheme = this.mContext.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        contextThemeWrapper = new androidx.appcompat.view.ContextThemeWrapper(this.mContext, 0);
                        contextThemeWrapper.getTheme().setTo(themeNewTheme);
                    } else {
                        contextThemeWrapper = this.mContext;
                    }
                    this.mActionModeView = new androidx.appcompat.widget.ActionBarContextView(contextThemeWrapper);
                    android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(contextThemeWrapper, (android.util.AttributeSet) null, androidx.appcompat.R.attr.actionModePopupWindowStyle);
                    this.mActionModePopup = popupWindow;
                    androidx.core.widget.PopupWindowCompat.setWindowLayoutType(popupWindow, 2);
                    this.mActionModePopup.setContentView(this.mActionModeView);
                    this.mActionModePopup.setWidth(-1);
                    contextThemeWrapper.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionBarSize, typedValue, true);
                    this.mActionModeView.setContentHeight(android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, contextThemeWrapper.getResources().getDisplayMetrics()));
                    this.mActionModePopup.setHeight(-2);
                    this.mShowActionModePopup = new java.lang.Runnable() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.6
                        @Override // java.lang.Runnable
                        public void run() {
                            androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModePopup.showAtLocation(androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModeView, 55, 0, 0);
                            androidx.appcompat.app.AppCompatDelegateImpl.this.endOnGoingFadeAnimation();
                            if (androidx.appcompat.app.AppCompatDelegateImpl.this.shouldAnimateActionModeView()) {
                                androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModeView.setAlpha(0.0f);
                                androidx.appcompat.app.AppCompatDelegateImpl appCompatDelegateImpl = androidx.appcompat.app.AppCompatDelegateImpl.this;
                                appCompatDelegateImpl.mFadeAnim = androidx.core.view.ViewCompat.animate(appCompatDelegateImpl.mActionModeView).alpha(1.0f);
                                androidx.appcompat.app.AppCompatDelegateImpl.this.mFadeAnim.setListener(new androidx.core.view.ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.6.1
                                    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                                    public void onAnimationStart(android.view.View view) {
                                        androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModeView.setVisibility(0);
                                    }

                                    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                                    public void onAnimationEnd(android.view.View view) {
                                        androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModeView.setAlpha(1.0f);
                                        androidx.appcompat.app.AppCompatDelegateImpl.this.mFadeAnim.setListener(null);
                                        androidx.appcompat.app.AppCompatDelegateImpl.this.mFadeAnim = null;
                                    }
                                });
                                return;
                            }
                            androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModeView.setAlpha(1.0f);
                            androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModeView.setVisibility(0);
                        }
                    };
                } else {
                    androidx.appcompat.widget.ViewStubCompat viewStubCompat = (androidx.appcompat.widget.ViewStubCompat) this.mSubDecor.findViewById(androidx.appcompat.R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(android.view.LayoutInflater.from(getActionBarThemedContext()));
                        this.mActionModeView = (androidx.appcompat.widget.ActionBarContextView) viewStubCompat.inflate();
                    }
                }
            }
            if (this.mActionModeView != null) {
                endOnGoingFadeAnimation();
                this.mActionModeView.killMode();
                androidx.appcompat.view.StandaloneActionMode standaloneActionMode = new androidx.appcompat.view.StandaloneActionMode(this.mActionModeView.getContext(), this.mActionModeView, callback, this.mActionModePopup == null);
                if (callback.onCreateActionMode(standaloneActionMode, standaloneActionMode.getMenu())) {
                    standaloneActionMode.invalidate();
                    this.mActionModeView.initForMode(standaloneActionMode);
                    this.mActionMode = standaloneActionMode;
                    if (shouldAnimateActionModeView()) {
                        this.mActionModeView.setAlpha(0.0f);
                        androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAlpha = androidx.core.view.ViewCompat.animate(this.mActionModeView).alpha(1.0f);
                        this.mFadeAnim = viewPropertyAnimatorCompatAlpha;
                        viewPropertyAnimatorCompatAlpha.setListener(new androidx.core.view.ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.7
                            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                            public void onAnimationStart(android.view.View view) {
                                androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModeView.setVisibility(0);
                                androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModeView.sendAccessibilityEvent(32);
                                if (androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModeView.getParent() instanceof android.view.View) {
                                    androidx.core.view.ViewCompat.requestApplyInsets((android.view.View) androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModeView.getParent());
                                }
                            }

                            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                            public void onAnimationEnd(android.view.View view) {
                                androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModeView.setAlpha(1.0f);
                                androidx.appcompat.app.AppCompatDelegateImpl.this.mFadeAnim.setListener(null);
                                androidx.appcompat.app.AppCompatDelegateImpl.this.mFadeAnim = null;
                            }
                        });
                    } else {
                        this.mActionModeView.setAlpha(1.0f);
                        this.mActionModeView.setVisibility(0);
                        this.mActionModeView.sendAccessibilityEvent(32);
                        if (this.mActionModeView.getParent() instanceof android.view.View) {
                            androidx.core.view.ViewCompat.requestApplyInsets((android.view.View) this.mActionModeView.getParent());
                        }
                    }
                    if (this.mActionModePopup != null) {
                        this.mWindow.getDecorView().post(this.mShowActionModePopup);
                    }
                } else {
                    this.mActionMode = null;
                }
            }
        }
        androidx.appcompat.view.ActionMode actionMode2 = this.mActionMode;
        if (actionMode2 != null && (appCompatCallback = this.mAppCompatCallback) != null) {
            appCompatCallback.onSupportActionModeStarted(actionMode2);
        }
        return this.mActionMode;
    }

    final boolean shouldAnimateActionModeView() {
        android.view.ViewGroup viewGroup;
        return this.mSubDecorInstalled && (viewGroup = this.mSubDecor) != null && androidx.core.view.ViewCompat.isLaidOut(viewGroup);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setHandleNativeActionModesEnabled(boolean z) {
        this.mHandleNativeActionModes = z;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean isHandleNativeActionModesEnabled() {
        return this.mHandleNativeActionModes;
    }

    void endOnGoingFadeAnimation() {
        androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.mFadeAnim;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
        }
    }

    boolean onBackPressed() {
        androidx.appcompat.view.ActionMode actionMode = this.mActionMode;
        if (actionMode != null) {
            actionMode.finish();
            return true;
        }
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        return supportActionBar != null && supportActionBar.collapseActionView();
    }

    boolean onKeyShortcut(int i, android.view.KeyEvent keyEvent) {
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null && supportActionBar.onKeyShortcut(i, keyEvent)) {
            return true;
        }
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState = this.mPreparedPanel;
        if (panelFeatureState != null && performPanelShortcut(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState2 = this.mPreparedPanel;
            if (panelFeatureState2 != null) {
                panelFeatureState2.isHandled = true;
            }
            return true;
        }
        if (this.mPreparedPanel == null) {
            androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelState = getPanelState(0, true);
            preparePanel(panelState, keyEvent);
            boolean zPerformPanelShortcut = performPanelShortcut(panelState, keyEvent.getKeyCode(), keyEvent, 1);
            panelState.isPrepared = false;
            if (zPerformPanelShortcut) {
                return true;
            }
        }
        return false;
    }

    boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        android.view.View decorView;
        java.lang.Object obj = this.mHost;
        if (((obj instanceof androidx.core.view.KeyEventDispatcher.Component) || (obj instanceof androidx.appcompat.app.AppCompatDialog)) && (decorView = this.mWindow.getDecorView()) != null && androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.mAppCompatWindowCallback.getWrapped().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent);
    }

    boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.mLongPressBackDown;
            this.mLongPressBackDown = false;
            androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelState = getPanelState(0, false);
            if (panelState != null && panelState.isOpen) {
                if (!z) {
                    closePanel(panelState, true);
                }
                return true;
            }
            if (onBackPressed()) {
                return true;
            }
        } else if (i == 82) {
            onKeyUpPanel(0, keyEvent);
            return true;
        }
        return false;
    }

    boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (i == 4) {
            this.mLongPressBackDown = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            onKeyDownPanel(0, keyEvent);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.AppCompatDelegate
    public android.view.View createView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        boolean z;
        boolean zShouldInheritContext = false;
        if (this.mAppCompatViewInflater == null) {
            java.lang.String string = this.mContext.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme).getString(androidx.appcompat.R.styleable.AppCompatTheme_viewInflaterClass);
            if (string == null || androidx.appcompat.app.AppCompatViewInflater.class.getName().equals(string)) {
                this.mAppCompatViewInflater = new androidx.appcompat.app.AppCompatViewInflater();
            } else {
                try {
                    this.mAppCompatViewInflater = (androidx.appcompat.app.AppCompatViewInflater) java.lang.Class.forName(string).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                } catch (java.lang.Throwable th) {
                    android.util.Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.mAppCompatViewInflater = new androidx.appcompat.app.AppCompatViewInflater();
                }
            }
        }
        boolean z2 = IS_PRE_LOLLIPOP;
        if (z2) {
            if (attributeSet instanceof org.xmlpull.v1.XmlPullParser) {
                if (((org.xmlpull.v1.XmlPullParser) attributeSet).getDepth() > 1) {
                    zShouldInheritContext = true;
                }
            } else {
                zShouldInheritContext = shouldInheritContext((android.view.ViewParent) view);
            }
            z = zShouldInheritContext;
        } else {
            z = false;
        }
        return this.mAppCompatViewInflater.createView(view, str, context, attributeSet, z, z2, true, androidx.appcompat.widget.VectorEnabledTintResources.shouldBeUsed());
    }

    private boolean shouldInheritContext(android.view.ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        android.view.View decorView = this.mWindow.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof android.view.View) || androidx.core.view.ViewCompat.isAttachedToWindow((android.view.View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void installViewFactory() {
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(this.mContext);
        if (layoutInflaterFrom.getFactory() == null) {
            androidx.core.view.LayoutInflaterCompat.setFactory2(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof androidx.appcompat.app.AppCompatDelegateImpl) {
                return;
            }
            android.util.Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return createView(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private androidx.appcompat.app.AppCompatActivity tryUnwrapContext() {
        for (android.content.Context baseContext = this.mContext; baseContext != null; baseContext = ((android.content.ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.AppCompatActivity) {
                return (androidx.appcompat.app.AppCompatActivity) baseContext;
            }
            if (!(baseContext instanceof android.content.ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void openPanel(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState, android.view.KeyEvent keyEvent) {
        int i;
        android.view.ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.isOpen || this.mIsDestroyed) {
            return;
        }
        if (panelFeatureState.featureId == 0) {
            if ((this.mContext.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        android.view.Window.Callback windowCallback = getWindowCallback();
        if (windowCallback != null && !windowCallback.onMenuOpened(panelFeatureState.featureId, panelFeatureState.menu)) {
            closePanel(panelFeatureState, true);
            return;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) this.mContext.getSystemService("window");
        if (windowManager != null && preparePanel(panelFeatureState, keyEvent)) {
            if (panelFeatureState.decorView == null || panelFeatureState.refreshDecorView) {
                if (panelFeatureState.decorView == null) {
                    if (!initializePanelDecor(panelFeatureState) || panelFeatureState.decorView == null) {
                        return;
                    }
                } else if (panelFeatureState.refreshDecorView && panelFeatureState.decorView.getChildCount() > 0) {
                    panelFeatureState.decorView.removeAllViews();
                }
                if (!initializePanelContent(panelFeatureState) || !panelFeatureState.hasPanelItems()) {
                    return;
                }
                android.view.ViewGroup.LayoutParams layoutParams2 = panelFeatureState.shownPanelView.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new android.view.ViewGroup.LayoutParams(-2, -2);
                }
                panelFeatureState.decorView.setBackgroundResource(panelFeatureState.background);
                android.view.ViewParent parent = panelFeatureState.shownPanelView.getParent();
                if (parent instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) parent).removeView(panelFeatureState.shownPanelView);
                }
                panelFeatureState.decorView.addView(panelFeatureState.shownPanelView, layoutParams2);
                if (!panelFeatureState.shownPanelView.hasFocus()) {
                    panelFeatureState.shownPanelView.requestFocus();
                }
            } else {
                if (panelFeatureState.createdPanelView != null && (layoutParams = panelFeatureState.createdPanelView.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                }
                panelFeatureState.isHandled = false;
                android.view.WindowManager.LayoutParams layoutParams3 = new android.view.WindowManager.LayoutParams(i, -2, panelFeatureState.x, panelFeatureState.y, 1002, 8519680, -3);
                layoutParams3.gravity = panelFeatureState.gravity;
                layoutParams3.windowAnimations = panelFeatureState.windowAnimations;
                windowManager.addView(panelFeatureState.decorView, layoutParams3);
                panelFeatureState.isOpen = true;
            }
            i = -2;
            panelFeatureState.isHandled = false;
            android.view.WindowManager.LayoutParams layoutParams4 = new android.view.WindowManager.LayoutParams(i, -2, panelFeatureState.x, panelFeatureState.y, 1002, 8519680, -3);
            layoutParams4.gravity = panelFeatureState.gravity;
            layoutParams4.windowAnimations = panelFeatureState.windowAnimations;
            windowManager.addView(panelFeatureState.decorView, layoutParams4);
            panelFeatureState.isOpen = true;
        }
    }

    private boolean initializePanelDecor(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState) {
        panelFeatureState.setStyle(getActionBarThemedContext());
        panelFeatureState.decorView = new androidx.appcompat.app.AppCompatDelegateImpl.ListMenuDecorView(panelFeatureState.listPresenterContext);
        panelFeatureState.gravity = 81;
        return true;
    }

    private void reopenMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
        androidx.appcompat.widget.DecorContentParent decorContentParent = this.mDecorContentParent;
        if (decorContentParent != null && decorContentParent.canShowOverflowMenu() && (!android.view.ViewConfiguration.get(this.mContext).hasPermanentMenuKey() || this.mDecorContentParent.isOverflowMenuShowPending())) {
            android.view.Window.Callback windowCallback = getWindowCallback();
            if (!this.mDecorContentParent.isOverflowMenuShowing() || !z) {
                if (windowCallback == null || this.mIsDestroyed) {
                    return;
                }
                if (this.mInvalidatePanelMenuPosted && (this.mInvalidatePanelMenuFeatures & 1) != 0) {
                    this.mWindow.getDecorView().removeCallbacks(this.mInvalidatePanelMenuRunnable);
                    this.mInvalidatePanelMenuRunnable.run();
                }
                androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelState = getPanelState(0, true);
                if (panelState.menu == null || panelState.refreshMenuContent || !windowCallback.onPreparePanel(0, panelState.createdPanelView, panelState.menu)) {
                    return;
                }
                windowCallback.onMenuOpened(108, panelState.menu);
                this.mDecorContentParent.showOverflowMenu();
                return;
            }
            this.mDecorContentParent.hideOverflowMenu();
            if (this.mIsDestroyed) {
                return;
            }
            windowCallback.onPanelClosed(108, getPanelState(0, true).menu);
            return;
        }
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelState2 = getPanelState(0, true);
        panelState2.refreshDecorView = true;
        closePanel(panelState2, false);
        openPanel(panelState2, null);
    }

    private boolean initializePanelMenu(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState) {
        android.content.Context context = this.mContext;
        if ((panelFeatureState.featureId == 0 || panelFeatureState.featureId == 108) && this.mDecorContentParent != null) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            android.content.res.Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
            android.content.res.Resources.Theme themeNewTheme = null;
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(androidx.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(androidx.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                androidx.appcompat.view.ContextThemeWrapper contextThemeWrapper = new androidx.appcompat.view.ContextThemeWrapper(context, 0);
                contextThemeWrapper.getTheme().setTo(themeNewTheme);
                context = contextThemeWrapper;
            }
        }
        androidx.appcompat.view.menu.MenuBuilder menuBuilder = new androidx.appcompat.view.menu.MenuBuilder(context);
        menuBuilder.setCallback(this);
        panelFeatureState.setMenu(menuBuilder);
        return true;
    }

    private boolean initializePanelContent(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState) {
        if (panelFeatureState.createdPanelView != null) {
            panelFeatureState.shownPanelView = panelFeatureState.createdPanelView;
            return true;
        }
        if (panelFeatureState.menu == null) {
            return false;
        }
        if (this.mPanelMenuPresenterCallback == null) {
            this.mPanelMenuPresenterCallback = new androidx.appcompat.app.AppCompatDelegateImpl.PanelMenuPresenterCallback();
        }
        panelFeatureState.shownPanelView = (android.view.View) panelFeatureState.getListMenuView(this.mPanelMenuPresenterCallback);
        return panelFeatureState.shownPanelView != null;
    }

    private boolean preparePanel(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState, android.view.KeyEvent keyEvent) {
        androidx.appcompat.widget.DecorContentParent decorContentParent;
        androidx.appcompat.widget.DecorContentParent decorContentParent2;
        androidx.appcompat.widget.DecorContentParent decorContentParent3;
        if (this.mIsDestroyed) {
            return false;
        }
        if (panelFeatureState.isPrepared) {
            return true;
        }
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState2 = this.mPreparedPanel;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            closePanel(panelFeatureState2, false);
        }
        android.view.Window.Callback windowCallback = getWindowCallback();
        if (windowCallback != null) {
            panelFeatureState.createdPanelView = windowCallback.onCreatePanelView(panelFeatureState.featureId);
        }
        boolean z = panelFeatureState.featureId == 0 || panelFeatureState.featureId == 108;
        if (z && (decorContentParent3 = this.mDecorContentParent) != null) {
            decorContentParent3.setMenuPrepared();
        }
        if (panelFeatureState.createdPanelView == null && (!z || !(peekSupportActionBar() instanceof androidx.appcompat.app.ToolbarActionBar))) {
            if (panelFeatureState.menu == null || panelFeatureState.refreshMenuContent) {
                if (panelFeatureState.menu == null && (!initializePanelMenu(panelFeatureState) || panelFeatureState.menu == null)) {
                    return false;
                }
                if (z && this.mDecorContentParent != null) {
                    if (this.mActionMenuPresenterCallback == null) {
                        this.mActionMenuPresenterCallback = new androidx.appcompat.app.AppCompatDelegateImpl.ActionMenuPresenterCallback();
                    }
                    this.mDecorContentParent.setMenu(panelFeatureState.menu, this.mActionMenuPresenterCallback);
                }
                panelFeatureState.menu.stopDispatchingItemsChanged();
                if (!windowCallback.onCreatePanelMenu(panelFeatureState.featureId, panelFeatureState.menu)) {
                    panelFeatureState.setMenu(null);
                    if (z && (decorContentParent = this.mDecorContentParent) != null) {
                        decorContentParent.setMenu(null, this.mActionMenuPresenterCallback);
                    }
                    return false;
                }
                panelFeatureState.refreshMenuContent = false;
            }
            panelFeatureState.menu.stopDispatchingItemsChanged();
            if (panelFeatureState.frozenActionViewState != null) {
                panelFeatureState.menu.restoreActionViewStates(panelFeatureState.frozenActionViewState);
                panelFeatureState.frozenActionViewState = null;
            }
            if (!windowCallback.onPreparePanel(0, panelFeatureState.createdPanelView, panelFeatureState.menu)) {
                if (z && (decorContentParent2 = this.mDecorContentParent) != null) {
                    decorContentParent2.setMenu(null, this.mActionMenuPresenterCallback);
                }
                panelFeatureState.menu.startDispatchingItemsChanged();
                return false;
            }
            panelFeatureState.qwertyMode = android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.menu.setQwertyMode(panelFeatureState.qwertyMode);
            panelFeatureState.menu.startDispatchingItemsChanged();
        }
        panelFeatureState.isPrepared = true;
        panelFeatureState.isHandled = false;
        this.mPreparedPanel = panelFeatureState;
        return true;
    }

    void checkCloseActionMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        if (this.mClosingActionMenu) {
            return;
        }
        this.mClosingActionMenu = true;
        this.mDecorContentParent.dismissPopups();
        android.view.Window.Callback windowCallback = getWindowCallback();
        if (windowCallback != null && !this.mIsDestroyed) {
            windowCallback.onPanelClosed(108, menuBuilder);
        }
        this.mClosingActionMenu = false;
    }

    void closePanel(int i) {
        closePanel(getPanelState(i, true), true);
    }

    void closePanel(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState, boolean z) {
        androidx.appcompat.widget.DecorContentParent decorContentParent;
        if (z && panelFeatureState.featureId == 0 && (decorContentParent = this.mDecorContentParent) != null && decorContentParent.isOverflowMenuShowing()) {
            checkCloseActionMenu(panelFeatureState.menu);
            return;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) this.mContext.getSystemService("window");
        if (windowManager != null && panelFeatureState.isOpen && panelFeatureState.decorView != null) {
            windowManager.removeView(panelFeatureState.decorView);
            if (z) {
                callOnPanelClosed(panelFeatureState.featureId, panelFeatureState, null);
            }
        }
        panelFeatureState.isPrepared = false;
        panelFeatureState.isHandled = false;
        panelFeatureState.isOpen = false;
        panelFeatureState.shownPanelView = null;
        panelFeatureState.refreshDecorView = true;
        if (this.mPreparedPanel == panelFeatureState) {
            this.mPreparedPanel = null;
        }
    }

    private boolean onKeyDownPanel(int i, android.view.KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelState = getPanelState(i, true);
        if (panelState.isOpen) {
            return false;
        }
        return preparePanel(panelState, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    private boolean onKeyUpPanel(int i, android.view.KeyEvent keyEvent) {
        boolean zPreparePanel;
        androidx.appcompat.widget.DecorContentParent decorContentParent;
        if (this.mActionMode != null) {
            return false;
        }
        boolean zHideOverflowMenu = true;
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelState = getPanelState(i, true);
        if (i == 0 && (decorContentParent = this.mDecorContentParent) != null && decorContentParent.canShowOverflowMenu() && !android.view.ViewConfiguration.get(this.mContext).hasPermanentMenuKey()) {
            if (!this.mDecorContentParent.isOverflowMenuShowing()) {
                if (this.mIsDestroyed || !preparePanel(panelState, keyEvent)) {
                    zHideOverflowMenu = false;
                } else {
                    zHideOverflowMenu = this.mDecorContentParent.showOverflowMenu();
                }
            } else {
                zHideOverflowMenu = this.mDecorContentParent.hideOverflowMenu();
            }
        } else if (panelState.isOpen || panelState.isHandled) {
            boolean z = panelState.isOpen;
            closePanel(panelState, true);
            zHideOverflowMenu = z;
        } else if (panelState.isPrepared) {
            if (panelState.refreshMenuContent) {
                panelState.isPrepared = false;
                zPreparePanel = preparePanel(panelState, keyEvent);
            } else {
                zPreparePanel = true;
            }
            if (zPreparePanel) {
                openPanel(panelState, keyEvent);
            } else {
                zHideOverflowMenu = false;
            }
        } else {
            zHideOverflowMenu = false;
        }
        if (zHideOverflowMenu) {
            android.media.AudioManager audioManager = (android.media.AudioManager) this.mContext.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                android.util.Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return zHideOverflowMenu;
    }

    void callOnPanelClosed(int i, androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState, android.view.Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState[] panelFeatureStateArr = this.mPanels;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.menu;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.isOpen) && !this.mIsDestroyed) {
            this.mAppCompatWindowCallback.getWrapped().onPanelClosed(i, menu);
        }
    }

    androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState findMenuPanel(android.view.Menu menu) {
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState[] panelFeatureStateArr = this.mPanels;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.menu == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    protected androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState getPanelState(int i, boolean z) {
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState[] panelFeatureStateArr = this.mPanels;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState[] panelFeatureStateArr2 = new androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                java.lang.System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.mPanels = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState2 = new androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    private boolean performPanelShortcut(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState, int i, android.view.KeyEvent keyEvent, int i2) {
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.isPrepared || preparePanel(panelFeatureState, keyEvent)) && panelFeatureState.menu != null) {
            zPerformShortcut = panelFeatureState.menu.performShortcut(i, keyEvent, i2);
        }
        if (zPerformShortcut && (i2 & 1) == 0 && this.mDecorContentParent == null) {
            closePanel(panelFeatureState, true);
        }
        return zPerformShortcut;
    }

    private void invalidatePanelMenu(int i) {
        this.mInvalidatePanelMenuFeatures = (1 << i) | this.mInvalidatePanelMenuFeatures;
        if (this.mInvalidatePanelMenuPosted) {
            return;
        }
        androidx.core.view.ViewCompat.postOnAnimation(this.mWindow.getDecorView(), this.mInvalidatePanelMenuRunnable);
        this.mInvalidatePanelMenuPosted = true;
    }

    void doInvalidatePanelMenu(int i) {
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelState;
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelState2 = getPanelState(i, true);
        if (panelState2.menu != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            panelState2.menu.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                panelState2.frozenActionViewState = bundle;
            }
            panelState2.menu.stopDispatchingItemsChanged();
            panelState2.menu.clear();
        }
        panelState2.refreshMenuContent = true;
        panelState2.refreshDecorView = true;
        if ((i != 108 && i != 0) || this.mDecorContentParent == null || (panelState = getPanelState(0, false)) == null) {
            return;
        }
        panelState.isPrepared = false;
        preparePanel(panelState, null);
    }

    int updateStatusGuard(int i) {
        boolean z;
        boolean z2;
        androidx.appcompat.widget.ActionBarContextView actionBarContextView = this.mActionModeView;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.mActionModeView.getLayoutParams();
            boolean z3 = true;
            if (this.mActionModeView.isShown()) {
                if (this.mTempRect1 == null) {
                    this.mTempRect1 = new android.graphics.Rect();
                    this.mTempRect2 = new android.graphics.Rect();
                }
                android.graphics.Rect rect = this.mTempRect1;
                android.graphics.Rect rect2 = this.mTempRect2;
                rect.set(0, i, 0, 0);
                androidx.appcompat.widget.ViewUtils.computeFitSystemWindows(this.mSubDecor, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    android.view.View view = this.mStatusGuard;
                    if (view == null) {
                        android.view.View view2 = new android.view.View(this.mContext);
                        this.mStatusGuard = view2;
                        view2.setBackgroundColor(this.mContext.getResources().getColor(androidx.appcompat.R.color.abc_input_method_navigation_guard));
                        this.mSubDecor.addView(this.mStatusGuard, -1, new android.view.ViewGroup.LayoutParams(-1, i));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.mStatusGuard.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = this.mStatusGuard != null;
                if (!this.mOverlayActionMode && z3) {
                    i = 0;
                }
                boolean z4 = z3;
                z3 = z2;
                z = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.mActionModeView.setLayoutParams(marginLayoutParams);
            }
        }
        android.view.View view3 = this.mStatusGuard;
        if (view3 != null) {
            view3.setVisibility(z ? 0 : 8);
        }
        return i;
    }

    private void throwFeatureRequestIfSubDecorInstalled() {
        if (this.mSubDecorInstalled) {
            throw new android.util.AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private int sanitizeWindowFeatureId(int i) {
        if (i == 8) {
            android.util.Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i != 9) {
            return i;
        }
        android.util.Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    android.view.ViewGroup getSubDecor() {
        return this.mSubDecor;
    }

    void dismissPopups() {
        androidx.appcompat.widget.DecorContentParent decorContentParent = this.mDecorContentParent;
        if (decorContentParent != null) {
            decorContentParent.dismissPopups();
        }
        if (this.mActionModePopup != null) {
            this.mWindow.getDecorView().removeCallbacks(this.mShowActionModePopup);
            if (this.mActionModePopup.isShowing()) {
                try {
                    this.mActionModePopup.dismiss();
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
            this.mActionModePopup = null;
        }
        endOnGoingFadeAnimation();
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelState = getPanelState(0, false);
        if (panelState == null || panelState.menu == null) {
            return;
        }
        panelState.menu.close();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean applyDayNight() {
        return applyDayNight(true);
    }

    private boolean applyDayNight(boolean z) {
        if (this.mIsDestroyed) {
            return false;
        }
        int iCalculateNightMode = calculateNightMode();
        boolean zUpdateForNightMode = updateForNightMode(mapNightMode(iCalculateNightMode), z);
        if (iCalculateNightMode == 0) {
            getAutoTimeNightModeManager().setup();
        } else {
            androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager autoNightModeManager = this.mAutoTimeNightModeManager;
            if (autoNightModeManager != null) {
                autoNightModeManager.cleanup();
            }
        }
        if (iCalculateNightMode == 3) {
            getAutoBatteryNightModeManager().setup();
        } else {
            androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager autoNightModeManager2 = this.mAutoBatteryNightModeManager;
            if (autoNightModeManager2 != null) {
                autoNightModeManager2.cleanup();
            }
        }
        return zUpdateForNightMode;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setLocalNightMode(int i) {
        if (this.mLocalNightMode != i) {
            this.mLocalNightMode = i;
            applyDayNight();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public int getLocalNightMode() {
        return this.mLocalNightMode;
    }

    int mapNightMode(int i) {
        if (i == -100) {
            return -1;
        }
        if (i == -1) {
            return i;
        }
        if (i == 0) {
            if (android.os.Build.VERSION.SDK_INT < 23 || ((android.app.UiModeManager) this.mContext.getSystemService(android.app.UiModeManager.class)).getNightMode() != 0) {
                return getAutoTimeNightModeManager().getApplyableNightMode();
            }
            return -1;
        }
        if (i == 1 || i == 2) {
            return i;
        }
        if (i == 3) {
            return getAutoBatteryNightModeManager().getApplyableNightMode();
        }
        throw new java.lang.IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
    }

    private int calculateNightMode() {
        int i = this.mLocalNightMode;
        return i != -100 ? i : getDefaultNightMode();
    }

    private boolean updateForNightMode(int i, boolean z) {
        int i2;
        int i3 = this.mContext.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z2 = true;
        if (i != 1) {
            i2 = i != 2 ? i3 : 32;
        } else {
            i2 = 16;
        }
        boolean zIsActivityManifestHandlingUiMode = isActivityManifestHandlingUiMode();
        boolean z3 = false;
        if ((sAlwaysOverrideConfiguration || i2 != i3) && !zIsActivityManifestHandlingUiMode && android.os.Build.VERSION.SDK_INT >= 17 && !this.mBaseContextAttached && (this.mHost instanceof android.view.ContextThemeWrapper)) {
            android.content.res.Configuration configuration = new android.content.res.Configuration();
            configuration.uiMode = (configuration.uiMode & (-49)) | i2;
            try {
                ((android.view.ContextThemeWrapper) this.mHost).applyOverrideConfiguration(configuration);
                z3 = true;
            } catch (java.lang.IllegalStateException e) {
                android.util.Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e);
            }
        }
        int i4 = this.mContext.getResources().getConfiguration().uiMode & 48;
        if (!z3 && i4 != i2 && z && !zIsActivityManifestHandlingUiMode && this.mBaseContextAttached && (android.os.Build.VERSION.SDK_INT >= 17 || this.mCreated)) {
            java.lang.Object obj = this.mHost;
            if (obj instanceof android.app.Activity) {
                androidx.core.app.ActivityCompat.recreate((android.app.Activity) obj);
                z3 = true;
            }
        }
        if (z3 || i4 == i2) {
            z2 = z3;
        } else {
            updateResourcesConfigurationForNightMode(i2, zIsActivityManifestHandlingUiMode);
        }
        if (z2) {
            java.lang.Object obj2 = this.mHost;
            if (obj2 instanceof androidx.appcompat.app.AppCompatActivity) {
                ((androidx.appcompat.app.AppCompatActivity) obj2).onNightModeChanged(i);
            }
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateResourcesConfigurationForNightMode(int i, boolean z) {
        android.content.res.Resources resources = this.mContext.getResources();
        android.content.res.Configuration configuration = new android.content.res.Configuration(resources.getConfiguration());
        configuration.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration, null);
        if (android.os.Build.VERSION.SDK_INT < 26) {
            androidx.appcompat.app.ResourcesFlusher.flush(resources);
        }
        int i2 = this.mThemeResId;
        if (i2 != 0) {
            this.mContext.setTheme(i2);
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                this.mContext.getTheme().applyStyle(this.mThemeResId, true);
            }
        }
        if (z) {
            java.lang.Object obj = this.mHost;
            if (obj instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) obj;
                if (activity instanceof androidx.lifecycle.LifecycleOwner) {
                    if (((androidx.lifecycle.LifecycleOwner) activity).getLifecycle().getCurrentState().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
                        activity.onConfigurationChanged(configuration);
                    }
                } else if (this.mStarted) {
                    activity.onConfigurationChanged(configuration);
                }
            }
        }
    }

    final androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager getAutoTimeNightModeManager() {
        if (this.mAutoTimeNightModeManager == null) {
            this.mAutoTimeNightModeManager = new androidx.appcompat.app.AppCompatDelegateImpl.AutoTimeNightModeManager(androidx.appcompat.app.TwilightManager.getInstance(this.mContext));
        }
        return this.mAutoTimeNightModeManager;
    }

    private androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager getAutoBatteryNightModeManager() {
        if (this.mAutoBatteryNightModeManager == null) {
            this.mAutoBatteryNightModeManager = new androidx.appcompat.app.AppCompatDelegateImpl.AutoBatteryNightModeManager(this.mContext);
        }
        return this.mAutoBatteryNightModeManager;
    }

    private boolean isActivityManifestHandlingUiMode() {
        if (!this.mActivityHandlesUiModeChecked && (this.mHost instanceof android.app.Activity)) {
            android.content.pm.PackageManager packageManager = this.mContext.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                android.content.pm.ActivityInfo activityInfo = packageManager.getActivityInfo(new android.content.ComponentName(this.mContext, this.mHost.getClass()), 0);
                this.mActivityHandlesUiMode = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.util.Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.mActivityHandlesUiMode = false;
            }
        }
        this.mActivityHandlesUiModeChecked = true;
        return this.mActivityHandlesUiMode;
    }

    class ActionModeCallbackWrapperV9 implements androidx.appcompat.view.ActionMode.Callback {
        private androidx.appcompat.view.ActionMode.Callback mWrapped;

        public ActionModeCallbackWrapperV9(androidx.appcompat.view.ActionMode.Callback callback) {
            this.mWrapped = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onCreateActionMode(androidx.appcompat.view.ActionMode actionMode, android.view.Menu menu) {
            return this.mWrapped.onCreateActionMode(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onPrepareActionMode(androidx.appcompat.view.ActionMode actionMode, android.view.Menu menu) {
            return this.mWrapped.onPrepareActionMode(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onActionItemClicked(androidx.appcompat.view.ActionMode actionMode, android.view.MenuItem menuItem) {
            return this.mWrapped.onActionItemClicked(actionMode, menuItem);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void onDestroyActionMode(androidx.appcompat.view.ActionMode actionMode) {
            this.mWrapped.onDestroyActionMode(actionMode);
            if (androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModePopup != null) {
                androidx.appcompat.app.AppCompatDelegateImpl.this.mWindow.getDecorView().removeCallbacks(androidx.appcompat.app.AppCompatDelegateImpl.this.mShowActionModePopup);
            }
            if (androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModeView != null) {
                androidx.appcompat.app.AppCompatDelegateImpl.this.endOnGoingFadeAnimation();
                androidx.appcompat.app.AppCompatDelegateImpl appCompatDelegateImpl = androidx.appcompat.app.AppCompatDelegateImpl.this;
                appCompatDelegateImpl.mFadeAnim = androidx.core.view.ViewCompat.animate(appCompatDelegateImpl.mActionModeView).alpha(0.0f);
                androidx.appcompat.app.AppCompatDelegateImpl.this.mFadeAnim.setListener(new androidx.core.view.ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9.1
                    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                    public void onAnimationEnd(android.view.View view) {
                        androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModeView.setVisibility(8);
                        if (androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModePopup != null) {
                            androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModePopup.dismiss();
                        } else if (androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModeView.getParent() instanceof android.view.View) {
                            androidx.core.view.ViewCompat.requestApplyInsets((android.view.View) androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModeView.getParent());
                        }
                        androidx.appcompat.app.AppCompatDelegateImpl.this.mActionModeView.removeAllViews();
                        androidx.appcompat.app.AppCompatDelegateImpl.this.mFadeAnim.setListener(null);
                        androidx.appcompat.app.AppCompatDelegateImpl.this.mFadeAnim = null;
                    }
                });
            }
            if (androidx.appcompat.app.AppCompatDelegateImpl.this.mAppCompatCallback != null) {
                androidx.appcompat.app.AppCompatDelegateImpl.this.mAppCompatCallback.onSupportActionModeFinished(androidx.appcompat.app.AppCompatDelegateImpl.this.mActionMode);
            }
            androidx.appcompat.app.AppCompatDelegateImpl.this.mActionMode = null;
        }
    }

    private final class PanelMenuPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        PanelMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
            androidx.appcompat.view.menu.MenuBuilder rootMenu = menuBuilder.getRootMenu();
            boolean z2 = rootMenu != menuBuilder;
            androidx.appcompat.app.AppCompatDelegateImpl appCompatDelegateImpl = androidx.appcompat.app.AppCompatDelegateImpl.this;
            if (z2) {
                menuBuilder = rootMenu;
            }
            androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureStateFindMenuPanel = appCompatDelegateImpl.findMenuPanel(menuBuilder);
            if (panelFeatureStateFindMenuPanel != null) {
                if (z2) {
                    androidx.appcompat.app.AppCompatDelegateImpl.this.callOnPanelClosed(panelFeatureStateFindMenuPanel.featureId, panelFeatureStateFindMenuPanel, rootMenu);
                    androidx.appcompat.app.AppCompatDelegateImpl.this.closePanel(panelFeatureStateFindMenuPanel, true);
                } else {
                    androidx.appcompat.app.AppCompatDelegateImpl.this.closePanel(panelFeatureStateFindMenuPanel, z);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
            android.view.Window.Callback windowCallback;
            if (menuBuilder != null || !androidx.appcompat.app.AppCompatDelegateImpl.this.mHasActionBar || (windowCallback = androidx.appcompat.app.AppCompatDelegateImpl.this.getWindowCallback()) == null || androidx.appcompat.app.AppCompatDelegateImpl.this.mIsDestroyed) {
                return true;
            }
            windowCallback.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    private final class ActionMenuPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        ActionMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
            android.view.Window.Callback windowCallback = androidx.appcompat.app.AppCompatDelegateImpl.this.getWindowCallback();
            if (windowCallback == null) {
                return true;
            }
            windowCallback.onMenuOpened(108, menuBuilder);
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
            androidx.appcompat.app.AppCompatDelegateImpl.this.checkCloseActionMenu(menuBuilder);
        }
    }

    protected static final class PanelFeatureState {
        int background;
        android.view.View createdPanelView;
        android.view.ViewGroup decorView;
        int featureId;
        android.os.Bundle frozenActionViewState;
        android.os.Bundle frozenMenuState;
        int gravity;
        boolean isHandled;
        boolean isOpen;
        boolean isPrepared;
        androidx.appcompat.view.menu.ListMenuPresenter listMenuPresenter;
        android.content.Context listPresenterContext;
        androidx.appcompat.view.menu.MenuBuilder menu;
        public boolean qwertyMode;
        boolean refreshDecorView = false;
        boolean refreshMenuContent;
        android.view.View shownPanelView;
        boolean wasLastOpen;
        int windowAnimations;
        int x;
        int y;

        PanelFeatureState(int i) {
            this.featureId = i;
        }

        public boolean hasPanelItems() {
            if (this.shownPanelView == null) {
                return false;
            }
            return this.createdPanelView != null || this.listMenuPresenter.getAdapter().getCount() > 0;
        }

        public void clearMenuPresenters() {
            androidx.appcompat.view.menu.MenuBuilder menuBuilder = this.menu;
            if (menuBuilder != null) {
                menuBuilder.removeMenuPresenter(this.listMenuPresenter);
            }
            this.listMenuPresenter = null;
        }

        void setStyle(android.content.Context context) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            android.content.res.Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(androidx.appcompat.R.attr.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            themeNewTheme.resolveAttribute(androidx.appcompat.R.attr.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            } else {
                themeNewTheme.applyStyle(androidx.appcompat.R.style.Theme_AppCompat_CompactMenu, true);
            }
            androidx.appcompat.view.ContextThemeWrapper contextThemeWrapper = new androidx.appcompat.view.ContextThemeWrapper(context, 0);
            contextThemeWrapper.getTheme().setTo(themeNewTheme);
            this.listPresenterContext = contextThemeWrapper;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme);
            this.background = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTheme_panelBackground, 0);
            this.windowAnimations = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        void setMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
            androidx.appcompat.view.menu.ListMenuPresenter listMenuPresenter;
            androidx.appcompat.view.menu.MenuBuilder menuBuilder2 = this.menu;
            if (menuBuilder == menuBuilder2) {
                return;
            }
            if (menuBuilder2 != null) {
                menuBuilder2.removeMenuPresenter(this.listMenuPresenter);
            }
            this.menu = menuBuilder;
            if (menuBuilder == null || (listMenuPresenter = this.listMenuPresenter) == null) {
                return;
            }
            menuBuilder.addMenuPresenter(listMenuPresenter);
        }

        androidx.appcompat.view.menu.MenuView getListMenuView(androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
            if (this.menu == null) {
                return null;
            }
            if (this.listMenuPresenter == null) {
                androidx.appcompat.view.menu.ListMenuPresenter listMenuPresenter = new androidx.appcompat.view.menu.ListMenuPresenter(this.listPresenterContext, androidx.appcompat.R.layout.abc_list_menu_item_layout);
                this.listMenuPresenter = listMenuPresenter;
                listMenuPresenter.setCallback(callback);
                this.menu.addMenuPresenter(this.listMenuPresenter);
            }
            return this.listMenuPresenter.getMenuView(this.decorView);
        }

        android.os.Parcelable onSaveInstanceState() {
            androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState savedState = new androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState();
            savedState.featureId = this.featureId;
            savedState.isOpen = this.isOpen;
            if (this.menu != null) {
                savedState.menuState = new android.os.Bundle();
                this.menu.savePresenterStates(savedState.menuState);
            }
            return savedState;
        }

        void onRestoreInstanceState(android.os.Parcelable parcelable) {
            androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState savedState = (androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState) parcelable;
            this.featureId = savedState.featureId;
            this.wasLastOpen = savedState.isOpen;
            this.frozenMenuState = savedState.menuState;
            this.shownPanelView = null;
            this.decorView = null;
        }

        void applyFrozenState() {
            android.os.Bundle bundle;
            androidx.appcompat.view.menu.MenuBuilder menuBuilder = this.menu;
            if (menuBuilder == null || (bundle = this.frozenMenuState) == null) {
                return;
            }
            menuBuilder.restorePresenterStates(bundle);
            this.frozenMenuState = null;
        }

        private static class SavedState implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState>() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.ClassLoaderCreator
                public androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                    return androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState.readFromParcel(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState createFromParcel(android.os.Parcel parcel) {
                    return androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState.readFromParcel(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState[] newArray(int i) {
                    return new androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState[i];
                }
            };
            int featureId;
            boolean isOpen;
            android.os.Bundle menuState;

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            SavedState() {
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel, int i) {
                parcel.writeInt(this.featureId);
                parcel.writeInt(this.isOpen ? 1 : 0);
                if (this.isOpen) {
                    parcel.writeBundle(this.menuState);
                }
            }

            static androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState readFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState savedState = new androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState();
                savedState.featureId = parcel.readInt();
                boolean z = parcel.readInt() == 1;
                savedState.isOpen = z;
                if (z) {
                    savedState.menuState = parcel.readBundle(classLoader);
                }
                return savedState;
            }
        }
    }

    private class ListMenuDecorView extends androidx.appcompat.widget.ContentFrameLayout {
        public ListMenuDecorView(android.content.Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
            return androidx.appcompat.app.AppCompatDelegateImpl.this.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && isOutOfBounds((int) motionEvent.getX(), (int) motionEvent.getY())) {
                androidx.appcompat.app.AppCompatDelegateImpl.this.closePanel(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
        }

        private boolean isOutOfBounds(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }
    }

    class AppCompatWindowCallback extends androidx.appcompat.view.WindowCallbackWrapper {
        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onContentChanged() {
        }

        AppCompatWindowCallback(android.view.Window.Callback callback) {
            super(callback);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
            return androidx.appcompat.app.AppCompatDelegateImpl.this.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || androidx.appcompat.app.AppCompatDelegateImpl.this.onKeyShortcut(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, android.view.Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.MenuBuilder)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
            androidx.appcompat.view.menu.MenuBuilder menuBuilder = menu instanceof androidx.appcompat.view.menu.MenuBuilder ? (androidx.appcompat.view.menu.MenuBuilder) menu : null;
            if (i == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onMenuOpened(int i, android.view.Menu menu) {
            super.onMenuOpened(i, menu);
            androidx.appcompat.app.AppCompatDelegateImpl.this.onMenuOpened(i);
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onPanelClosed(int i, android.view.Menu menu) {
            super.onPanelClosed(i, menu);
            androidx.appcompat.app.AppCompatDelegateImpl.this.onPanelClosed(i);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (androidx.appcompat.app.AppCompatDelegateImpl.this.isHandleNativeActionModesEnabled()) {
                return startAsSupportActionMode(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        final android.view.ActionMode startAsSupportActionMode(android.view.ActionMode.Callback callback) {
            androidx.appcompat.view.SupportActionModeWrapper.CallbackWrapper callbackWrapper = new androidx.appcompat.view.SupportActionModeWrapper.CallbackWrapper(androidx.appcompat.app.AppCompatDelegateImpl.this.mContext, callback);
            androidx.appcompat.view.ActionMode actionModeStartSupportActionMode = androidx.appcompat.app.AppCompatDelegateImpl.this.startSupportActionMode(callbackWrapper);
            if (actionModeStartSupportActionMode != null) {
                return callbackWrapper.getActionModeWrapper(actionModeStartSupportActionMode);
            }
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i) {
            if (androidx.appcompat.app.AppCompatDelegateImpl.this.isHandleNativeActionModesEnabled() && i == 0) {
                return startAsSupportActionMode(callback);
            }
            return super.onWindowStartingActionMode(callback, i);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> list, android.view.Menu menu, int i) {
            androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelState = androidx.appcompat.app.AppCompatDelegateImpl.this.getPanelState(0, true);
            if (panelState != null && panelState.menu != null) {
                super.onProvideKeyboardShortcuts(list, panelState.menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }
    }

    abstract class AutoNightModeManager {
        private android.content.BroadcastReceiver mReceiver;

        abstract android.content.IntentFilter createIntentFilterForBroadcastReceiver();

        abstract int getApplyableNightMode();

        abstract void onChange();

        AutoNightModeManager() {
        }

        void setup() {
            cleanup();
            android.content.IntentFilter intentFilterCreateIntentFilterForBroadcastReceiver = createIntentFilterForBroadcastReceiver();
            if (intentFilterCreateIntentFilterForBroadcastReceiver == null || intentFilterCreateIntentFilterForBroadcastReceiver.countActions() == 0) {
                return;
            }
            if (this.mReceiver == null) {
                this.mReceiver = new android.content.BroadcastReceiver() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(android.content.Context context, android.content.Intent intent) {
                        androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager.this.onChange();
                    }
                };
            }
            androidx.appcompat.app.AppCompatDelegateImpl.this.mContext.registerReceiver(this.mReceiver, intentFilterCreateIntentFilterForBroadcastReceiver);
        }

        void cleanup() {
            if (this.mReceiver != null) {
                try {
                    androidx.appcompat.app.AppCompatDelegateImpl.this.mContext.unregisterReceiver(this.mReceiver);
                } catch (java.lang.IllegalArgumentException unused) {
                }
                this.mReceiver = null;
            }
        }

        boolean isListening() {
            return this.mReceiver != null;
        }
    }

    private class AutoTimeNightModeManager extends androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager {
        private final androidx.appcompat.app.TwilightManager mTwilightManager;

        AutoTimeNightModeManager(androidx.appcompat.app.TwilightManager twilightManager) {
            super();
            this.mTwilightManager = twilightManager;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public int getApplyableNightMode() {
            return this.mTwilightManager.isNight() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void onChange() {
            androidx.appcompat.app.AppCompatDelegateImpl.this.applyDayNight();
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        android.content.IntentFilter createIntentFilterForBroadcastReceiver() {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }
    }

    private class AutoBatteryNightModeManager extends androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager {
        private final android.os.PowerManager mPowerManager;

        AutoBatteryNightModeManager(android.content.Context context) {
            super();
            this.mPowerManager = (android.os.PowerManager) context.getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public int getApplyableNightMode() {
            return (android.os.Build.VERSION.SDK_INT < 21 || !this.mPowerManager.isPowerSaveMode()) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void onChange() {
            androidx.appcompat.app.AppCompatDelegateImpl.this.applyDayNight();
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        android.content.IntentFilter createIntentFilterForBroadcastReceiver() {
            if (android.os.Build.VERSION.SDK_INT < 21) {
                return null;
            }
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final androidx.appcompat.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        return new androidx.appcompat.app.AppCompatDelegateImpl.ActionBarDrawableToggleImpl();
    }

    private class ActionBarDrawableToggleImpl implements androidx.appcompat.app.ActionBarDrawerToggle.Delegate {
        ActionBarDrawableToggleImpl() {
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.graphics.drawable.Drawable getThemeUpIndicator() {
            androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(getActionBarThemedContext(), (android.util.AttributeSet) null, new int[]{androidx.appcompat.R.attr.homeAsUpIndicator});
            android.graphics.drawable.Drawable drawable = tintTypedArrayObtainStyledAttributes.getDrawable(0);
            tintTypedArrayObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.content.Context getActionBarThemedContext() {
            return androidx.appcompat.app.AppCompatDelegateImpl.this.getActionBarThemedContext();
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
            androidx.appcompat.app.ActionBar supportActionBar = androidx.appcompat.app.AppCompatDelegateImpl.this.getSupportActionBar();
            return (supportActionBar == null || (supportActionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(android.graphics.drawable.Drawable drawable, int i) {
            androidx.appcompat.app.ActionBar supportActionBar = androidx.appcompat.app.AppCompatDelegateImpl.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeAsUpIndicator(drawable);
                supportActionBar.setHomeActionContentDescription(i);
            }
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
            androidx.appcompat.app.ActionBar supportActionBar = androidx.appcompat.app.AppCompatDelegateImpl.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeActionContentDescription(i);
            }
        }
    }
}
