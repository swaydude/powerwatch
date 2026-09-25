package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class ViewCompat {
    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_HARDWARE = 2;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_NONE = 0;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_SOFTWARE = 1;
    public static final int LAYOUT_DIRECTION_INHERIT = 2;
    public static final int LAYOUT_DIRECTION_LOCALE = 3;
    public static final int LAYOUT_DIRECTION_LTR = 0;
    public static final int LAYOUT_DIRECTION_RTL = 1;

    @java.lang.Deprecated
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;

    @java.lang.Deprecated
    public static final int MEASURED_SIZE_MASK = 16777215;

    @java.lang.Deprecated
    public static final int MEASURED_STATE_MASK = -16777216;

    @java.lang.Deprecated
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_ALWAYS = 0;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_END = 32;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_TOP = 1;
    private static final java.lang.String TAG = "ViewCompat";
    public static final int TYPE_NON_TOUCH = 1;
    public static final int TYPE_TOUCH = 0;
    private static java.lang.reflect.Field sAccessibilityDelegateField;
    private static java.lang.reflect.Method sChildrenDrawingOrderMethod;
    private static java.lang.reflect.Method sDispatchFinishTemporaryDetach;
    private static java.lang.reflect.Method sDispatchStartTemporaryDetach;
    private static java.lang.reflect.Field sMinHeightField;
    private static boolean sMinHeightFieldFetched;
    private static java.lang.reflect.Field sMinWidthField;
    private static boolean sMinWidthFieldFetched;
    private static boolean sTempDetachBound;
    private static java.lang.ThreadLocal<android.graphics.Rect> sThreadLocalRect;
    private static java.util.WeakHashMap<android.view.View, java.lang.String> sTransitionNameMap;
    private static final java.util.concurrent.atomic.AtomicInteger sNextGeneratedId = new java.util.concurrent.atomic.AtomicInteger(1);
    private static java.util.WeakHashMap<android.view.View, androidx.core.view.ViewPropertyAnimatorCompat> sViewPropertyAnimatorMap = null;
    private static boolean sAccessibilityDelegateCheckFailed = false;
    private static final int[] ACCESSIBILITY_ACTIONS_RESOURCE_IDS = {androidx.core.R.id.accessibility_custom_action_0, androidx.core.R.id.accessibility_custom_action_1, androidx.core.R.id.accessibility_custom_action_2, androidx.core.R.id.accessibility_custom_action_3, androidx.core.R.id.accessibility_custom_action_4, androidx.core.R.id.accessibility_custom_action_5, androidx.core.R.id.accessibility_custom_action_6, androidx.core.R.id.accessibility_custom_action_7, androidx.core.R.id.accessibility_custom_action_8, androidx.core.R.id.accessibility_custom_action_9, androidx.core.R.id.accessibility_custom_action_10, androidx.core.R.id.accessibility_custom_action_11, androidx.core.R.id.accessibility_custom_action_12, androidx.core.R.id.accessibility_custom_action_13, androidx.core.R.id.accessibility_custom_action_14, androidx.core.R.id.accessibility_custom_action_15, androidx.core.R.id.accessibility_custom_action_16, androidx.core.R.id.accessibility_custom_action_17, androidx.core.R.id.accessibility_custom_action_18, androidx.core.R.id.accessibility_custom_action_19, androidx.core.R.id.accessibility_custom_action_20, androidx.core.R.id.accessibility_custom_action_21, androidx.core.R.id.accessibility_custom_action_22, androidx.core.R.id.accessibility_custom_action_23, androidx.core.R.id.accessibility_custom_action_24, androidx.core.R.id.accessibility_custom_action_25, androidx.core.R.id.accessibility_custom_action_26, androidx.core.R.id.accessibility_custom_action_27, androidx.core.R.id.accessibility_custom_action_28, androidx.core.R.id.accessibility_custom_action_29, androidx.core.R.id.accessibility_custom_action_30, androidx.core.R.id.accessibility_custom_action_31};
    private static androidx.core.view.ViewCompat.AccessibilityPaneVisibilityManager sAccessibilityPaneVisibilityManager = new androidx.core.view.ViewCompat.AccessibilityPaneVisibilityManager();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FocusDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FocusRealDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FocusRelativeDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface NestedScrollType {
    }

    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(android.view.View view, android.view.KeyEvent keyEvent);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ScrollAxis {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ScrollIndicators {
    }

    private static android.graphics.Rect getEmptyTempRect() {
        if (sThreadLocalRect == null) {
            sThreadLocalRect = new java.lang.ThreadLocal<>();
        }
        android.graphics.Rect rect = sThreadLocalRect.get();
        if (rect == null) {
            rect = new android.graphics.Rect();
            sThreadLocalRect.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    @java.lang.Deprecated
    public static boolean canScrollHorizontally(android.view.View view, int i) {
        return view.canScrollHorizontally(i);
    }

    @java.lang.Deprecated
    public static boolean canScrollVertically(android.view.View view, int i) {
        return view.canScrollVertically(i);
    }

    @java.lang.Deprecated
    public static int getOverScrollMode(android.view.View view) {
        return view.getOverScrollMode();
    }

    @java.lang.Deprecated
    public static void setOverScrollMode(android.view.View view, int i) {
        view.setOverScrollMode(i);
    }

    @java.lang.Deprecated
    public static void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @java.lang.Deprecated
    public static void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public static void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.unwrap());
    }

    public static void setAccessibilityDelegate(android.view.View view, androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat) {
        if (accessibilityDelegateCompat == null && (getAccessibilityDelegateInternal(view) instanceof androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter)) {
            accessibilityDelegateCompat = new androidx.core.view.AccessibilityDelegateCompat();
        }
        view.setAccessibilityDelegate(accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.getBridge());
    }

    public static void setAutofillHints(android.view.View view, java.lang.String... strArr) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            view.setAutofillHints(strArr);
        }
    }

    public static int getImportantForAutofill(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static void setImportantForAutofill(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    public static boolean isImportantForAutofill(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return view.isImportantForAutofill();
        }
        return true;
    }

    public static boolean hasAccessibilityDelegate(android.view.View view) {
        return getAccessibilityDelegateInternal(view) != null;
    }

    public static androidx.core.view.AccessibilityDelegateCompat getAccessibilityDelegate(android.view.View view) {
        android.view.View.AccessibilityDelegate accessibilityDelegateInternal = getAccessibilityDelegateInternal(view);
        if (accessibilityDelegateInternal == null) {
            return null;
        }
        if (accessibilityDelegateInternal instanceof androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter) {
            return ((androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter) accessibilityDelegateInternal).mCompat;
        }
        return new androidx.core.view.AccessibilityDelegateCompat(accessibilityDelegateInternal);
    }

    static androidx.core.view.AccessibilityDelegateCompat getOrCreateAccessibilityDelegateCompat(android.view.View view) {
        androidx.core.view.AccessibilityDelegateCompat accessibilityDelegate = getAccessibilityDelegate(view);
        if (accessibilityDelegate == null) {
            accessibilityDelegate = new androidx.core.view.AccessibilityDelegateCompat();
        }
        setAccessibilityDelegate(view, accessibilityDelegate);
        return accessibilityDelegate;
    }

    private static android.view.View.AccessibilityDelegate getAccessibilityDelegateInternal(android.view.View view) {
        if (sAccessibilityDelegateCheckFailed) {
            return null;
        }
        if (sAccessibilityDelegateField == null) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mAccessibilityDelegate");
                sAccessibilityDelegateField = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.Throwable unused) {
                sAccessibilityDelegateCheckFailed = true;
                return null;
            }
        }
        try {
            java.lang.Object obj = sAccessibilityDelegateField.get(view);
            if (obj instanceof android.view.View.AccessibilityDelegate) {
                return (android.view.View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (java.lang.Throwable unused2) {
            sAccessibilityDelegateCheckFailed = true;
            return null;
        }
    }

    public static boolean hasTransientState(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    public static void setHasTransientState(android.view.View view, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    public static void postInvalidateOnAnimation(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static void postInvalidateOnAnimation(android.view.View view, int i, int i2, int i3, int i4) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        } else {
            view.postInvalidate(i, i2, i3, i4);
        }
    }

    public static void postOnAnimation(android.view.View view, java.lang.Runnable runnable) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, android.animation.ValueAnimator.getFrameDelay());
        }
    }

    public static void postOnAnimationDelayed(android.view.View view, java.lang.Runnable runnable, long j) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, android.animation.ValueAnimator.getFrameDelay() + j);
        }
    }

    public static int getImportantForAccessibility(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    public static void setImportantForAccessibility(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            view.setImportantForAccessibility(i);
        } else if (android.os.Build.VERSION.SDK_INT >= 16) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }
    }

    public static boolean isImportantForAccessibility(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return view.isImportantForAccessibility();
        }
        return true;
    }

    public static boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    public static int addAccessibilityAction(android.view.View view, java.lang.CharSequence charSequence, androidx.core.view.accessibility.AccessibilityViewCommand accessibilityViewCommand) {
        int availableActionIdFromResources = getAvailableActionIdFromResources(view);
        if (availableActionIdFromResources != -1) {
            addAccessibilityAction(view, new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(availableActionIdFromResources, charSequence, accessibilityViewCommand));
        }
        return availableActionIdFromResources;
    }

    private static int getAvailableActionIdFromResources(android.view.View view) {
        java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = getActionList(view);
        int i = 0;
        int i2 = -1;
        while (true) {
            int[] iArr = ACCESSIBILITY_ACTIONS_RESOURCE_IDS;
            if (i >= iArr.length || i2 != -1) {
                break;
            }
            int i3 = iArr[i];
            boolean z = true;
            for (int i4 = 0; i4 < actionList.size(); i4++) {
                z &= actionList.get(i4).getId() != i3;
            }
            if (z) {
                i2 = i3;
            }
            i++;
        }
        return i2;
    }

    public static void replaceAccessibilityAction(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, java.lang.CharSequence charSequence, androidx.core.view.accessibility.AccessibilityViewCommand accessibilityViewCommand) {
        addAccessibilityAction(view, accessibilityActionCompat.createReplacementAction(charSequence, accessibilityViewCommand));
    }

    private static void addAccessibilityAction(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            getOrCreateAccessibilityDelegateCompat(view);
            removeActionWithId(accessibilityActionCompat.getId(), view);
            getActionList(view).add(accessibilityActionCompat);
            notifyViewAccessibilityStateChangedIfNeeded(view, 0);
        }
    }

    public static void removeAccessibilityAction(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            removeActionWithId(i, view);
            notifyViewAccessibilityStateChangedIfNeeded(view, 0);
        }
    }

    private static void removeActionWithId(int i, android.view.View view) {
        java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = getActionList(view);
        for (int i2 = 0; i2 < actionList.size(); i2++) {
            if (actionList.get(i2).getId() == i) {
                actionList.remove(i2);
                return;
            }
        }
    }

    private static java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList(android.view.View view) {
        java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(androidx.core.R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        view.setTag(androidx.core.R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void enableAccessibleClickableSpanSupport(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            getOrCreateAccessibilityDelegateCompat(view);
        }
    }

    public static androidx.core.view.accessibility.AccessibilityNodeProviderCompat getAccessibilityNodeProvider(android.view.View view) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider;
        if (android.os.Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = view.getAccessibilityNodeProvider()) == null) {
            return null;
        }
        return new androidx.core.view.accessibility.AccessibilityNodeProviderCompat(accessibilityNodeProvider);
    }

    @java.lang.Deprecated
    public static float getAlpha(android.view.View view) {
        return view.getAlpha();
    }

    @java.lang.Deprecated
    public static void setLayerType(android.view.View view, int i, android.graphics.Paint paint) {
        view.setLayerType(i, paint);
    }

    @java.lang.Deprecated
    public static int getLayerType(android.view.View view) {
        return view.getLayerType();
    }

    public static int getLabelFor(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return view.getLabelFor();
        }
        return 0;
    }

    public static void setLabelFor(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            view.setLabelFor(i);
        }
    }

    public static void setLayerPaint(android.view.View view, android.graphics.Paint paint) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            view.setLayerPaint(paint);
        } else {
            view.setLayerType(view.getLayerType(), paint);
            view.invalidate();
        }
    }

    public static int getLayoutDirection(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static void setLayoutDirection(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            view.setLayoutDirection(i);
        }
    }

    public static android.view.ViewParent getParentForAccessibility(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    public static <T extends android.view.View> T requireViewById(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return (T) view.requireViewById(i);
        }
        T t = (T) view.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalArgumentException("ID does not reference a View inside this View");
    }

    @java.lang.Deprecated
    public static boolean isOpaque(android.view.View view) {
        return view.isOpaque();
    }

    @java.lang.Deprecated
    public static int resolveSizeAndState(int i, int i2, int i3) {
        return android.view.View.resolveSizeAndState(i, i2, i3);
    }

    @java.lang.Deprecated
    public static int getMeasuredWidthAndState(android.view.View view) {
        return view.getMeasuredWidthAndState();
    }

    @java.lang.Deprecated
    public static int getMeasuredHeightAndState(android.view.View view) {
        return view.getMeasuredHeightAndState();
    }

    @java.lang.Deprecated
    public static int getMeasuredState(android.view.View view) {
        return view.getMeasuredState();
    }

    @java.lang.Deprecated
    public static int combineMeasuredStates(int i, int i2) {
        return android.view.View.combineMeasuredStates(i, i2);
    }

    public static int getAccessibilityLiveRegion(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static void setAccessibilityLiveRegion(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    public static int getPaddingStart(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    public static int getPaddingEnd(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    public static void setPaddingRelative(android.view.View view, int i, int i2, int i3, int i4) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    private static void bindTempDetach() {
        try {
            sDispatchStartTemporaryDetach = android.view.View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new java.lang.Class[0]);
            sDispatchFinishTemporaryDetach = android.view.View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new java.lang.Class[0]);
        } catch (java.lang.NoSuchMethodException e) {
            android.util.Log.e(TAG, "Couldn't find method", e);
        }
        sTempDetachBound = true;
    }

    public static void dispatchStartTemporaryDetach(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            view.dispatchStartTemporaryDetach();
            return;
        }
        if (!sTempDetachBound) {
            bindTempDetach();
        }
        java.lang.reflect.Method method = sDispatchStartTemporaryDetach;
        if (method != null) {
            try {
                method.invoke(view, new java.lang.Object[0]);
                return;
            } catch (java.lang.Exception e) {
                android.util.Log.d(TAG, "Error calling dispatchStartTemporaryDetach", e);
                return;
            }
        }
        view.onStartTemporaryDetach();
    }

    public static void dispatchFinishTemporaryDetach(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            view.dispatchFinishTemporaryDetach();
            return;
        }
        if (!sTempDetachBound) {
            bindTempDetach();
        }
        java.lang.reflect.Method method = sDispatchFinishTemporaryDetach;
        if (method != null) {
            try {
                method.invoke(view, new java.lang.Object[0]);
                return;
            } catch (java.lang.Exception e) {
                android.util.Log.d(TAG, "Error calling dispatchFinishTemporaryDetach", e);
                return;
            }
        }
        view.onFinishTemporaryDetach();
    }

    @java.lang.Deprecated
    public static float getTranslationX(android.view.View view) {
        return view.getTranslationX();
    }

    @java.lang.Deprecated
    public static float getTranslationY(android.view.View view) {
        return view.getTranslationY();
    }

    @java.lang.Deprecated
    public static android.graphics.Matrix getMatrix(android.view.View view) {
        return view.getMatrix();
    }

    public static int getMinimumWidth(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!sMinWidthFieldFetched) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mMinWidth");
                sMinWidthField = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException unused) {
            }
            sMinWidthFieldFetched = true;
        }
        java.lang.reflect.Field field = sMinWidthField;
        if (field == null) {
            return 0;
        }
        try {
            return ((java.lang.Integer) field.get(view)).intValue();
        } catch (java.lang.Exception unused2) {
            return 0;
        }
    }

    public static int getMinimumHeight(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!sMinHeightFieldFetched) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mMinHeight");
                sMinHeightField = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException unused) {
            }
            sMinHeightFieldFetched = true;
        }
        java.lang.reflect.Field field = sMinHeightField;
        if (field == null) {
            return 0;
        }
        try {
            return ((java.lang.Integer) field.get(view)).intValue();
        } catch (java.lang.Exception unused2) {
            return 0;
        }
    }

    public static androidx.core.view.ViewPropertyAnimatorCompat animate(android.view.View view) {
        if (sViewPropertyAnimatorMap == null) {
            sViewPropertyAnimatorMap = new java.util.WeakHashMap<>();
        }
        androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = sViewPropertyAnimatorMap.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new androidx.core.view.ViewPropertyAnimatorCompat(view);
        sViewPropertyAnimatorMap.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    @java.lang.Deprecated
    public static void setTranslationX(android.view.View view, float f) {
        view.setTranslationX(f);
    }

    @java.lang.Deprecated
    public static void setTranslationY(android.view.View view, float f) {
        view.setTranslationY(f);
    }

    @java.lang.Deprecated
    public static void setAlpha(android.view.View view, float f) {
        view.setAlpha(f);
    }

    @java.lang.Deprecated
    public static void setX(android.view.View view, float f) {
        view.setX(f);
    }

    @java.lang.Deprecated
    public static void setY(android.view.View view, float f) {
        view.setY(f);
    }

    @java.lang.Deprecated
    public static void setRotation(android.view.View view, float f) {
        view.setRotation(f);
    }

    @java.lang.Deprecated
    public static void setRotationX(android.view.View view, float f) {
        view.setRotationX(f);
    }

    @java.lang.Deprecated
    public static void setRotationY(android.view.View view, float f) {
        view.setRotationY(f);
    }

    @java.lang.Deprecated
    public static void setScaleX(android.view.View view, float f) {
        view.setScaleX(f);
    }

    @java.lang.Deprecated
    public static void setScaleY(android.view.View view, float f) {
        view.setScaleY(f);
    }

    @java.lang.Deprecated
    public static float getPivotX(android.view.View view) {
        return view.getPivotX();
    }

    @java.lang.Deprecated
    public static void setPivotX(android.view.View view, float f) {
        view.setPivotX(f);
    }

    @java.lang.Deprecated
    public static float getPivotY(android.view.View view) {
        return view.getPivotY();
    }

    @java.lang.Deprecated
    public static void setPivotY(android.view.View view, float f) {
        view.setPivotY(f);
    }

    @java.lang.Deprecated
    public static float getRotation(android.view.View view) {
        return view.getRotation();
    }

    @java.lang.Deprecated
    public static float getRotationX(android.view.View view) {
        return view.getRotationX();
    }

    @java.lang.Deprecated
    public static float getRotationY(android.view.View view) {
        return view.getRotationY();
    }

    @java.lang.Deprecated
    public static float getScaleX(android.view.View view) {
        return view.getScaleX();
    }

    @java.lang.Deprecated
    public static float getScaleY(android.view.View view) {
        return view.getScaleY();
    }

    @java.lang.Deprecated
    public static float getX(android.view.View view) {
        return view.getX();
    }

    @java.lang.Deprecated
    public static float getY(android.view.View view) {
        return view.getY();
    }

    public static void setElevation(android.view.View view, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    public static float getElevation(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    public static void setTranslationZ(android.view.View view, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f);
        }
    }

    public static float getTranslationZ(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return view.getTranslationZ();
        }
        return 0.0f;
    }

    public static void setTransitionName(android.view.View view, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (sTransitionNameMap == null) {
            sTransitionNameMap = new java.util.WeakHashMap<>();
        }
        sTransitionNameMap.put(view, str);
    }

    public static java.lang.String getTransitionName(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        java.util.WeakHashMap<android.view.View, java.lang.String> weakHashMap = sTransitionNameMap;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static int getWindowSystemUiVisibility(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static void requestApplyInsets(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
        } else if (android.os.Build.VERSION.SDK_INT >= 16) {
            view.requestFitSystemWindows();
        }
    }

    @java.lang.Deprecated
    public static void setChildrenDrawingOrderEnabled(android.view.ViewGroup viewGroup, boolean z) {
        if (sChildrenDrawingOrderMethod == null) {
            try {
                sChildrenDrawingOrderMethod = android.view.ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", java.lang.Boolean.TYPE);
            } catch (java.lang.NoSuchMethodException e) {
                android.util.Log.e(TAG, "Unable to find childrenDrawingOrderEnabled", e);
            }
            sChildrenDrawingOrderMethod.setAccessible(true);
        }
        try {
            sChildrenDrawingOrderMethod.invoke(viewGroup, java.lang.Boolean.valueOf(z));
        } catch (java.lang.IllegalAccessException e2) {
            android.util.Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e2);
        } catch (java.lang.IllegalArgumentException e3) {
            android.util.Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            android.util.Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e4);
        }
    }

    public static boolean getFitsSystemWindows(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    @java.lang.Deprecated
    public static void setFitsSystemWindows(android.view.View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    @java.lang.Deprecated
    public static void jumpDrawablesToCurrentState(android.view.View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static void setOnApplyWindowInsetsListener(android.view.View view, final androidx.core.view.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            if (onApplyWindowInsetsListener == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewCompat.1
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public android.view.WindowInsets onApplyWindowInsets(android.view.View view2, android.view.WindowInsets windowInsets) {
                        return (android.view.WindowInsets) androidx.core.view.WindowInsetsCompat.unwrap(onApplyWindowInsetsListener.onApplyWindowInsets(view2, androidx.core.view.WindowInsetsCompat.wrap(windowInsets)));
                    }
                });
            }
        }
    }

    public static androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        if (android.os.Build.VERSION.SDK_INT < 21) {
            return windowInsetsCompat;
        }
        android.view.WindowInsets windowInsets = (android.view.WindowInsets) androidx.core.view.WindowInsetsCompat.unwrap(windowInsetsCompat);
        android.view.WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (!windowInsetsOnApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new android.view.WindowInsets(windowInsetsOnApplyWindowInsets);
        }
        return androidx.core.view.WindowInsetsCompat.wrap(windowInsets);
    }

    public static androidx.core.view.WindowInsetsCompat dispatchApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        if (android.os.Build.VERSION.SDK_INT < 21) {
            return windowInsetsCompat;
        }
        android.view.WindowInsets windowInsets = (android.view.WindowInsets) androidx.core.view.WindowInsetsCompat.unwrap(windowInsetsCompat);
        android.view.WindowInsets windowInsetsDispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (!windowInsetsDispatchApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new android.view.WindowInsets(windowInsetsDispatchApplyWindowInsets);
        }
        return androidx.core.view.WindowInsetsCompat.wrap(windowInsets);
    }

    @java.lang.Deprecated
    public static void setSaveFromParentEnabled(android.view.View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    @java.lang.Deprecated
    public static void setActivated(android.view.View view, boolean z) {
        view.setActivated(z);
    }

    public static boolean hasOverlappingRendering(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    public static boolean isPaddingRelative(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    public static void setBackground(android.view.View view, android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static android.content.res.ColorStateList getBackgroundTintList(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof androidx.core.view.TintableBackgroundView) {
            return ((androidx.core.view.TintableBackgroundView) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setBackgroundTintList(android.view.View view, android.content.res.ColorStateList colorStateList) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (android.os.Build.VERSION.SDK_INT == 21) {
                android.graphics.drawable.Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
                return;
            }
            return;
        }
        if (view instanceof androidx.core.view.TintableBackgroundView) {
            ((androidx.core.view.TintableBackgroundView) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static android.graphics.PorterDuff.Mode getBackgroundTintMode(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof androidx.core.view.TintableBackgroundView) {
            return ((androidx.core.view.TintableBackgroundView) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setBackgroundTintMode(android.view.View view, android.graphics.PorterDuff.Mode mode) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (android.os.Build.VERSION.SDK_INT == 21) {
                android.graphics.drawable.Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
                return;
            }
            return;
        }
        if (view instanceof androidx.core.view.TintableBackgroundView) {
            ((androidx.core.view.TintableBackgroundView) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setNestedScrollingEnabled(android.view.View view, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            view.setNestedScrollingEnabled(z);
        } else if (view instanceof androidx.core.view.NestedScrollingChild) {
            ((androidx.core.view.NestedScrollingChild) view).setNestedScrollingEnabled(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean isNestedScrollingEnabled(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof androidx.core.view.NestedScrollingChild) {
            return ((androidx.core.view.NestedScrollingChild) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean startNestedScroll(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return view.startNestedScroll(i);
        }
        if (view instanceof androidx.core.view.NestedScrollingChild) {
            return ((androidx.core.view.NestedScrollingChild) view).startNestedScroll(i);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void stopNestedScroll(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof androidx.core.view.NestedScrollingChild) {
            ((androidx.core.view.NestedScrollingChild) view).stopNestedScroll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean hasNestedScrollingParent(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return view.hasNestedScrollingParent();
        }
        if (view instanceof androidx.core.view.NestedScrollingChild) {
            return ((androidx.core.view.NestedScrollingChild) view).hasNestedScrollingParent();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int[] iArr) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }
        if (view instanceof androidx.core.view.NestedScrollingChild) {
            return ((androidx.core.view.NestedScrollingChild) view).dispatchNestedScroll(i, i2, i3, i4, iArr);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedPreScroll(android.view.View view, int i, int i2, int[] iArr, int[] iArr2) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }
        if (view instanceof androidx.core.view.NestedScrollingChild) {
            return ((androidx.core.view.NestedScrollingChild) view).dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean startNestedScroll(android.view.View view, int i, int i2) {
        if (view instanceof androidx.core.view.NestedScrollingChild2) {
            return ((androidx.core.view.NestedScrollingChild2) view).startNestedScroll(i, i2);
        }
        if (i2 == 0) {
            return startNestedScroll(view, i);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void stopNestedScroll(android.view.View view, int i) {
        if (view instanceof androidx.core.view.NestedScrollingChild2) {
            ((androidx.core.view.NestedScrollingChild2) view).stopNestedScroll(i);
        } else if (i == 0) {
            stopNestedScroll(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean hasNestedScrollingParent(android.view.View view, int i) {
        if (view instanceof androidx.core.view.NestedScrollingChild2) {
            ((androidx.core.view.NestedScrollingChild2) view).hasNestedScrollingParent(i);
            return false;
        }
        if (i == 0) {
            return hasNestedScrollingParent(view);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void dispatchNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        if (view instanceof androidx.core.view.NestedScrollingChild3) {
            ((androidx.core.view.NestedScrollingChild3) view).dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
        } else {
            dispatchNestedScroll(view, i, i2, i3, i4, iArr, i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int[] iArr, int i5) {
        if (view instanceof androidx.core.view.NestedScrollingChild2) {
            return ((androidx.core.view.NestedScrollingChild2) view).dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
        }
        if (i5 == 0) {
            return dispatchNestedScroll(view, i, i2, i3, i4, iArr);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedPreScroll(android.view.View view, int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (view instanceof androidx.core.view.NestedScrollingChild2) {
            return ((androidx.core.view.NestedScrollingChild2) view).dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        }
        if (i3 == 0) {
            return dispatchNestedPreScroll(view, i, i2, iArr, iArr2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedFling(android.view.View view, float f, float f2, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return view.dispatchNestedFling(f, f2, z);
        }
        if (view instanceof androidx.core.view.NestedScrollingChild) {
            return ((androidx.core.view.NestedScrollingChild) view).dispatchNestedFling(f, f2, z);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedPreFling(android.view.View view, float f, float f2) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return view.dispatchNestedPreFling(f, f2);
        }
        if (view instanceof androidx.core.view.NestedScrollingChild) {
            return ((androidx.core.view.NestedScrollingChild) view).dispatchNestedPreFling(f, f2);
        }
        return false;
    }

    public static boolean isInLayout(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            return view.isInLayout();
        }
        return false;
    }

    public static boolean isLaidOut(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean isLayoutDirectionResolved(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return view.isLayoutDirectionResolved();
        }
        return false;
    }

    public static float getZ(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static void setZ(android.view.View view, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            view.setZ(f);
        }
    }

    public static void offsetTopAndBottom(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            android.graphics.Rect emptyTempRect = getEmptyTempRect();
            boolean z = false;
            java.lang.Object parent = view.getParent();
            if (parent instanceof android.view.View) {
                android.view.View view2 = (android.view.View) parent;
                emptyTempRect.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !emptyTempRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            compatOffsetTopAndBottom(view, i);
            if (z && emptyTempRect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((android.view.View) parent).invalidate(emptyTempRect);
                return;
            }
            return;
        }
        compatOffsetTopAndBottom(view, i);
    }

    private static void compatOffsetTopAndBottom(android.view.View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            tickleInvalidationFlag(view);
            java.lang.Object parent = view.getParent();
            if (parent instanceof android.view.View) {
                tickleInvalidationFlag((android.view.View) parent);
            }
        }
    }

    public static void offsetLeftAndRight(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            android.graphics.Rect emptyTempRect = getEmptyTempRect();
            boolean z = false;
            java.lang.Object parent = view.getParent();
            if (parent instanceof android.view.View) {
                android.view.View view2 = (android.view.View) parent;
                emptyTempRect.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !emptyTempRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            compatOffsetLeftAndRight(view, i);
            if (z && emptyTempRect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((android.view.View) parent).invalidate(emptyTempRect);
                return;
            }
            return;
        }
        compatOffsetLeftAndRight(view, i);
    }

    private static void compatOffsetLeftAndRight(android.view.View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            tickleInvalidationFlag(view);
            java.lang.Object parent = view.getParent();
            if (parent instanceof android.view.View) {
                tickleInvalidationFlag((android.view.View) parent);
            }
        }
    }

    private static void tickleInvalidationFlag(android.view.View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void setClipBounds(android.view.View view, android.graphics.Rect rect) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    public static android.graphics.Rect getClipBounds(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    public static boolean isAttachedToWindow(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    public static boolean hasOnClickListeners(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static void setScrollIndicators(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i);
        }
    }

    public static void setScrollIndicators(android.view.View view, int i, int i2) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    public static int getScrollIndicators(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return view.getScrollIndicators();
        }
        return 0;
    }

    public static void setPointerIcon(android.view.View view, androidx.core.view.PointerIconCompat pointerIconCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((android.view.PointerIcon) (pointerIconCompat != null ? pointerIconCompat.getPointerIcon() : null));
        }
    }

    public static android.view.Display getDisplay(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (isAttachedToWindow(view)) {
            return ((android.view.WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static void setTooltipText(android.view.View view, java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        }
    }

    public static boolean startDragAndDrop(android.view.View view, android.content.ClipData clipData, android.view.View.DragShadowBuilder dragShadowBuilder, java.lang.Object obj, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }
        return view.startDrag(clipData, dragShadowBuilder, obj, i);
    }

    public static void cancelDragAndDrop(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            view.cancelDragAndDrop();
        }
    }

    public static void updateDragShadow(android.view.View view, android.view.View.DragShadowBuilder dragShadowBuilder) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    public static int getNextClusterForwardId(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return view.getNextClusterForwardId();
        }
        return -1;
    }

    public static void setNextClusterForwardId(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            view.setNextClusterForwardId(i);
        }
    }

    public static boolean isKeyboardNavigationCluster(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return view.isKeyboardNavigationCluster();
        }
        return false;
    }

    public static void setKeyboardNavigationCluster(android.view.View view, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            view.setKeyboardNavigationCluster(z);
        }
    }

    public static boolean isFocusedByDefault(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return view.isFocusedByDefault();
        }
        return false;
    }

    public static void setFocusedByDefault(android.view.View view, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            view.setFocusedByDefault(z);
        }
    }

    public static android.view.View keyboardNavigationClusterSearch(android.view.View view, android.view.View view2, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }
        return null;
    }

    public static void addKeyboardNavigationClusters(android.view.View view, java.util.Collection<android.view.View> collection, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            view.addKeyboardNavigationClusters(collection, i);
        }
    }

    public static boolean restoreDefaultFocus(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return view.restoreDefaultFocus();
        }
        return view.requestFocus();
    }

    public static boolean hasExplicitFocusable(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return view.hasExplicitFocusable();
        }
        return view.hasFocusable();
    }

    public static int generateViewId() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i;
        int i2;
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return android.view.View.generateViewId();
        }
        do {
            atomicInteger = sNextGeneratedId;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    public static void addOnUnhandledKeyEventListener(android.view.View view, final androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            java.util.Map arrayMap = (java.util.Map) view.getTag(androidx.core.R.id.tag_unhandled_key_listeners);
            if (arrayMap == null) {
                arrayMap = new androidx.collection.ArrayMap();
                view.setTag(androidx.core.R.id.tag_unhandled_key_listeners, arrayMap);
            }
            android.view.View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new android.view.View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.ViewCompat.2
                @Override // android.view.View.OnUnhandledKeyEventListener
                public boolean onUnhandledKeyEvent(android.view.View view2, android.view.KeyEvent keyEvent) {
                    return onUnhandledKeyEventListenerCompat.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            arrayMap.put(onUnhandledKeyEventListenerCompat, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(androidx.core.R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            view.setTag(androidx.core.R.id.tag_unhandled_key_listeners, arrayList);
        }
        arrayList.add(onUnhandledKeyEventListenerCompat);
        if (arrayList.size() == 1) {
            androidx.core.view.ViewCompat.UnhandledKeyEventManager.registerListeningView(view);
        }
    }

    public static void removeOnUnhandledKeyEventListener(android.view.View view, androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        android.view.View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            java.util.Map map = (java.util.Map) view.getTag(androidx.core.R.id.tag_unhandled_key_listeners);
            if (map == null || (onUnhandledKeyEventListener = (android.view.View.OnUnhandledKeyEventListener) map.get(onUnhandledKeyEventListenerCompat)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(androidx.core.R.id.tag_unhandled_key_listeners);
        if (arrayList != null) {
            arrayList.remove(onUnhandledKeyEventListenerCompat);
            if (arrayList.size() == 0) {
                androidx.core.view.ViewCompat.UnhandledKeyEventManager.unregisterListeningView(view);
            }
        }
    }

    protected ViewCompat() {
    }

    static boolean dispatchUnhandledKeyEventBeforeHierarchy(android.view.View view, android.view.KeyEvent keyEvent) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return androidx.core.view.ViewCompat.UnhandledKeyEventManager.at(view).preDispatch(keyEvent);
    }

    static boolean dispatchUnhandledKeyEventBeforeCallback(android.view.View view, android.view.KeyEvent keyEvent) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return androidx.core.view.ViewCompat.UnhandledKeyEventManager.at(view).dispatch(view, keyEvent);
    }

    public static void setScreenReaderFocusable(android.view.View view, boolean z) {
        screenReaderFocusableProperty().set(view, java.lang.Boolean.valueOf(z));
    }

    public static boolean isScreenReaderFocusable(android.view.View view) {
        java.lang.Boolean bool = screenReaderFocusableProperty().get(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean> screenReaderFocusableProperty() {
        return new androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean>(androidx.core.R.id.tag_screen_reader_focusable, java.lang.Boolean.class, 28) { // from class: androidx.core.view.ViewCompat.3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public java.lang.Boolean frameworkGet(android.view.View view) {
                return java.lang.Boolean.valueOf(view.isScreenReaderFocusable());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public void frameworkSet(android.view.View view, java.lang.Boolean bool) {
                view.setScreenReaderFocusable(bool.booleanValue());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public boolean shouldUpdate(java.lang.Boolean bool, java.lang.Boolean bool2) {
                return !booleanNullToFalseEquals(bool, bool2);
            }
        };
    }

    public static void setAccessibilityPaneTitle(android.view.View view, java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            paneTitleProperty().set(view, charSequence);
            if (charSequence != null) {
                sAccessibilityPaneVisibilityManager.addAccessibilityPane(view);
            } else {
                sAccessibilityPaneVisibilityManager.removeAccessibilityPane(view);
            }
        }
    }

    public static java.lang.CharSequence getAccessibilityPaneTitle(android.view.View view) {
        return paneTitleProperty().get(view);
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.CharSequence> paneTitleProperty() {
        return new androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.CharSequence>(androidx.core.R.id.tag_accessibility_pane_title, java.lang.CharSequence.class, 8, 28) { // from class: androidx.core.view.ViewCompat.4
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public java.lang.CharSequence frameworkGet(android.view.View view) {
                return view.getAccessibilityPaneTitle();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public void frameworkSet(android.view.View view, java.lang.CharSequence charSequence) {
                view.setAccessibilityPaneTitle(charSequence);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public boolean shouldUpdate(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
                return !android.text.TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    public static boolean isAccessibilityHeading(android.view.View view) {
        java.lang.Boolean bool = accessibilityHeadingProperty().get(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void setAccessibilityHeading(android.view.View view, boolean z) {
        accessibilityHeadingProperty().set(view, java.lang.Boolean.valueOf(z));
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean> accessibilityHeadingProperty() {
        return new androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean>(androidx.core.R.id.tag_accessibility_heading, java.lang.Boolean.class, 28) { // from class: androidx.core.view.ViewCompat.5
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public java.lang.Boolean frameworkGet(android.view.View view) {
                return java.lang.Boolean.valueOf(view.isAccessibilityHeading());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public void frameworkSet(android.view.View view, java.lang.Boolean bool) {
                view.setAccessibilityHeading(bool.booleanValue());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public boolean shouldUpdate(java.lang.Boolean bool, java.lang.Boolean bool2) {
                return !booleanNullToFalseEquals(bool, bool2);
            }
        };
    }

    static abstract class AccessibilityViewProperty<T> {
        private final int mContentChangeType;
        private final int mFrameworkMinimumSdk;
        private final int mTagKey;
        private final java.lang.Class<T> mType;

        abstract T frameworkGet(android.view.View view);

        abstract void frameworkSet(android.view.View view, T t);

        AccessibilityViewProperty(int i, java.lang.Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        AccessibilityViewProperty(int i, java.lang.Class<T> cls, int i2, int i3) {
            this.mTagKey = i;
            this.mType = cls;
            this.mContentChangeType = i2;
            this.mFrameworkMinimumSdk = i3;
        }

        void set(android.view.View view, T t) {
            if (frameworkAvailable()) {
                frameworkSet(view, t);
            } else if (extrasAvailable() && shouldUpdate(get(view), t)) {
                androidx.core.view.ViewCompat.getOrCreateAccessibilityDelegateCompat(view);
                view.setTag(this.mTagKey, t);
                androidx.core.view.ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, 0);
            }
        }

        T get(android.view.View view) {
            if (frameworkAvailable()) {
                return frameworkGet(view);
            }
            if (!extrasAvailable()) {
                return null;
            }
            T t = (T) view.getTag(this.mTagKey);
            if (this.mType.isInstance(t)) {
                return t;
            }
            return null;
        }

        private boolean frameworkAvailable() {
            return android.os.Build.VERSION.SDK_INT >= this.mFrameworkMinimumSdk;
        }

        private boolean extrasAvailable() {
            return android.os.Build.VERSION.SDK_INT >= 19;
        }

        boolean shouldUpdate(T t, T t2) {
            return !t2.equals(t);
        }

        boolean booleanNullToFalseEquals(java.lang.Boolean bool, java.lang.Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }
    }

    static void notifyViewAccessibilityStateChangedIfNeeded(android.view.View view, int i) {
        if (((android.view.accessibility.AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = getAccessibilityPaneTitle(view) != null;
            if (getAccessibilityLiveRegion(view) != 0 || (z && view.getVisibility() == 0)) {
                android.view.accessibility.AccessibilityEvent accessibilityEventObtain = android.view.accessibility.AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (java.lang.AbstractMethodError e) {
                    android.util.Log.e(TAG, view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    static class AccessibilityPaneVisibilityManager implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.View.OnAttachStateChangeListener {
        private java.util.WeakHashMap<android.view.View, java.lang.Boolean> mPanesToVisible = new java.util.WeakHashMap<>();

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
        }

        AccessibilityPaneVisibilityManager() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            for (java.util.Map.Entry<android.view.View, java.lang.Boolean> entry : this.mPanesToVisible.entrySet()) {
                checkPaneVisibility(entry.getKey(), entry.getValue().booleanValue());
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            registerForLayoutCallback(view);
        }

        void addAccessibilityPane(android.view.View view) {
            this.mPanesToVisible.put(view, java.lang.Boolean.valueOf(view.getVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                registerForLayoutCallback(view);
            }
        }

        void removeAccessibilityPane(android.view.View view) {
            this.mPanesToVisible.remove(view);
            view.removeOnAttachStateChangeListener(this);
            unregisterForLayoutCallback(view);
        }

        private void checkPaneVisibility(android.view.View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                if (z2) {
                    androidx.core.view.ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, 16);
                }
                this.mPanesToVisible.put(view, java.lang.Boolean.valueOf(z2));
            }
        }

        private void registerForLayoutCallback(android.view.View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void unregisterForLayoutCallback(android.view.View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    static class UnhandledKeyEventManager {
        private static final java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> sViewsWithListeners = new java.util.ArrayList<>();
        private java.util.WeakHashMap<android.view.View, java.lang.Boolean> mViewsContainingListeners = null;
        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> mCapturedKeys = null;
        private java.lang.ref.WeakReference<android.view.KeyEvent> mLastDispatchedPreViewKeyEvent = null;

        UnhandledKeyEventManager() {
        }

        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> getCapturedKeys() {
            if (this.mCapturedKeys == null) {
                this.mCapturedKeys = new android.util.SparseArray<>();
            }
            return this.mCapturedKeys;
        }

        static androidx.core.view.ViewCompat.UnhandledKeyEventManager at(android.view.View view) {
            androidx.core.view.ViewCompat.UnhandledKeyEventManager unhandledKeyEventManager = (androidx.core.view.ViewCompat.UnhandledKeyEventManager) view.getTag(androidx.core.R.id.tag_unhandled_key_event_manager);
            if (unhandledKeyEventManager != null) {
                return unhandledKeyEventManager;
            }
            androidx.core.view.ViewCompat.UnhandledKeyEventManager unhandledKeyEventManager2 = new androidx.core.view.ViewCompat.UnhandledKeyEventManager();
            view.setTag(androidx.core.R.id.tag_unhandled_key_event_manager, unhandledKeyEventManager2);
            return unhandledKeyEventManager2;
        }

        boolean dispatch(android.view.View view, android.view.KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                recalcViewsWithUnhandled();
            }
            android.view.View viewDispatchInOrder = dispatchInOrder(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewDispatchInOrder != null && !android.view.KeyEvent.isModifierKey(keyCode)) {
                    getCapturedKeys().put(keyCode, new java.lang.ref.WeakReference<>(viewDispatchInOrder));
                }
            }
            return viewDispatchInOrder != null;
        }

        private android.view.View dispatchInOrder(android.view.View view, android.view.KeyEvent keyEvent) {
            java.util.WeakHashMap<android.view.View, java.lang.Boolean> weakHashMap = this.mViewsContainingListeners;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        android.view.View viewDispatchInOrder = dispatchInOrder(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewDispatchInOrder != null) {
                            return viewDispatchInOrder;
                        }
                    }
                }
                if (onUnhandledKeyEvent(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        boolean preDispatch(android.view.KeyEvent keyEvent) {
            int iIndexOfKey;
            java.lang.ref.WeakReference<android.view.KeyEvent> weakReference = this.mLastDispatchedPreViewKeyEvent;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.mLastDispatchedPreViewKeyEvent = new java.lang.ref.WeakReference<>(keyEvent);
            java.lang.ref.WeakReference<android.view.View> weakReferenceValueAt = null;
            android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> capturedKeys = getCapturedKeys();
            if (keyEvent.getAction() == 1 && (iIndexOfKey = capturedKeys.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReferenceValueAt = capturedKeys.valueAt(iIndexOfKey);
                capturedKeys.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = capturedKeys.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            android.view.View view = weakReferenceValueAt.get();
            if (view != null && androidx.core.view.ViewCompat.isAttachedToWindow(view)) {
                onUnhandledKeyEvent(view, keyEvent);
            }
            return true;
        }

        private boolean onUnhandledKeyEvent(android.view.View view, android.view.KeyEvent keyEvent) {
            java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(androidx.core.R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        static void registerListeningView(android.view.View view) {
            java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> arrayList = sViewsWithListeners;
            synchronized (arrayList) {
                java.util.Iterator<java.lang.ref.WeakReference<android.view.View>> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == view) {
                        return;
                    }
                }
                sViewsWithListeners.add(new java.lang.ref.WeakReference<>(view));
            }
        }

        static void unregisterListeningView(android.view.View view) {
            synchronized (sViewsWithListeners) {
                int i = 0;
                while (true) {
                    java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> arrayList = sViewsWithListeners;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    if (arrayList.get(i).get() == view) {
                        arrayList.remove(i);
                        return;
                    }
                    i++;
                }
            }
        }

        private void recalcViewsWithUnhandled() {
            java.util.WeakHashMap<android.view.View, java.lang.Boolean> weakHashMap = this.mViewsContainingListeners;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> arrayList = sViewsWithListeners;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.mViewsContainingListeners == null) {
                    this.mViewsContainingListeners = new java.util.WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> arrayList2 = sViewsWithListeners;
                    android.view.View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.mViewsContainingListeners.put(view, java.lang.Boolean.TRUE);
                        for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
                            this.mViewsContainingListeners.put((android.view.View) parent, java.lang.Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }
}
