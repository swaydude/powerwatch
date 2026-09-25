package androidx.appcompat.content.res;

/* JADX INFO: loaded from: classes.dex */
public final class AppCompatResources {
    private static final java.lang.String LOG_TAG = "AppCompatResources";
    private static final java.lang.ThreadLocal<android.util.TypedValue> TL_TYPED_VALUE = new java.lang.ThreadLocal<>();
    private static final java.util.WeakHashMap<android.content.Context, android.util.SparseArray<androidx.appcompat.content.res.AppCompatResources.ColorStateListCacheEntry>> sColorStateCaches = new java.util.WeakHashMap<>(0);
    private static final java.lang.Object sColorStateCacheLock = new java.lang.Object();

    private AppCompatResources() {
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context context, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        android.content.res.ColorStateList cachedColorStateList = getCachedColorStateList(context, i);
        if (cachedColorStateList != null) {
            return cachedColorStateList;
        }
        android.content.res.ColorStateList colorStateListInflateColorStateList = inflateColorStateList(context, i);
        if (colorStateListInflateColorStateList != null) {
            addColorStateListToCache(context, i, colorStateListInflateColorStateList);
            return colorStateListInflateColorStateList;
        }
        return androidx.core.content.ContextCompat.getColorStateList(context, i);
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context context, int i) {
        return androidx.appcompat.widget.ResourceManagerInternal.get().getDrawable(context, i);
    }

    private static android.content.res.ColorStateList inflateColorStateList(android.content.Context context, int i) {
        if (isColorInt(context, i)) {
            return null;
        }
        android.content.res.Resources resources = context.getResources();
        try {
            return androidx.core.content.res.ColorStateListInflaterCompat.createFromXml(resources, resources.getXml(i), context.getTheme());
        } catch (java.lang.Exception e) {
            android.util.Log.e(LOG_TAG, "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    private static android.content.res.ColorStateList getCachedColorStateList(android.content.Context context, int i) {
        androidx.appcompat.content.res.AppCompatResources.ColorStateListCacheEntry colorStateListCacheEntry;
        synchronized (sColorStateCacheLock) {
            android.util.SparseArray<androidx.appcompat.content.res.AppCompatResources.ColorStateListCacheEntry> sparseArray = sColorStateCaches.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (colorStateListCacheEntry = sparseArray.get(i)) != null) {
                if (colorStateListCacheEntry.configuration.equals(context.getResources().getConfiguration())) {
                    return colorStateListCacheEntry.value;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    private static void addColorStateListToCache(android.content.Context context, int i, android.content.res.ColorStateList colorStateList) {
        synchronized (sColorStateCacheLock) {
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<androidx.appcompat.content.res.AppCompatResources.ColorStateListCacheEntry>> weakHashMap = sColorStateCaches;
            android.util.SparseArray<androidx.appcompat.content.res.AppCompatResources.ColorStateListCacheEntry> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new android.util.SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i, new androidx.appcompat.content.res.AppCompatResources.ColorStateListCacheEntry(colorStateList, context.getResources().getConfiguration()));
        }
    }

    private static boolean isColorInt(android.content.Context context, int i) {
        android.content.res.Resources resources = context.getResources();
        android.util.TypedValue typedValue = getTypedValue();
        resources.getValue(i, typedValue, true);
        return typedValue.type >= 28 && typedValue.type <= 31;
    }

    private static android.util.TypedValue getTypedValue() {
        java.lang.ThreadLocal<android.util.TypedValue> threadLocal = TL_TYPED_VALUE;
        android.util.TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        android.util.TypedValue typedValue2 = new android.util.TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static class ColorStateListCacheEntry {
        final android.content.res.Configuration configuration;
        final android.content.res.ColorStateList value;

        ColorStateListCacheEntry(android.content.res.ColorStateList colorStateList, android.content.res.Configuration configuration) {
            this.value = colorStateList;
            this.configuration = configuration;
        }
    }
}
