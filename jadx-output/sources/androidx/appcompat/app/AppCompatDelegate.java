package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppCompatDelegate {
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    public static final int FEATURE_SUPPORT_ACTION_BAR = 108;
    public static final int FEATURE_SUPPORT_ACTION_BAR_OVERLAY = 109;

    @java.lang.Deprecated
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_AUTO_BATTERY = 3;

    @java.lang.Deprecated
    public static final int MODE_NIGHT_AUTO_TIME = 0;
    public static final int MODE_NIGHT_FOLLOW_SYSTEM = -1;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_UNSPECIFIED = -100;
    public static final int MODE_NIGHT_YES = 2;
    static final java.lang.String TAG = "AppCompatDelegate";
    private static final androidx.collection.ArraySet<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> sActiveDelegates = new androidx.collection.ArraySet<>();
    private static final java.lang.Object sActiveDelegatesLock = new java.lang.Object();
    private static int sDefaultNightMode = -100;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface NightMode {
    }

    public abstract void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    public abstract boolean applyDayNight();

    public void attachBaseContext(android.content.Context context) {
    }

    public abstract android.view.View createView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet);

    public abstract <T extends android.view.View> T findViewById(int i);

    public abstract androidx.appcompat.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();

    public int getLocalNightMode() {
        return -100;
    }

    public abstract android.view.MenuInflater getMenuInflater();

    public abstract androidx.appcompat.app.ActionBar getSupportActionBar();

    public abstract boolean hasWindowFeature(int i);

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    public abstract boolean isHandleNativeActionModesEnabled();

    public abstract void onConfigurationChanged(android.content.res.Configuration configuration);

    public abstract void onCreate(android.os.Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPostCreate(android.os.Bundle bundle);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(android.os.Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int i);

    public abstract void setContentView(int i);

    public abstract void setContentView(android.view.View view);

    public abstract void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    public abstract void setHandleNativeActionModesEnabled(boolean z);

    public abstract void setLocalNightMode(int i);

    public abstract void setSupportActionBar(androidx.appcompat.widget.Toolbar toolbar);

    public void setTheme(int i) {
    }

    public abstract void setTitle(java.lang.CharSequence charSequence);

    public abstract androidx.appcompat.view.ActionMode startSupportActionMode(androidx.appcompat.view.ActionMode.Callback callback);

    public static androidx.appcompat.app.AppCompatDelegate create(android.app.Activity activity, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        return new androidx.appcompat.app.AppCompatDelegateImpl(activity, appCompatCallback);
    }

    public static androidx.appcompat.app.AppCompatDelegate create(android.app.Dialog dialog, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        return new androidx.appcompat.app.AppCompatDelegateImpl(dialog, appCompatCallback);
    }

    public static androidx.appcompat.app.AppCompatDelegate create(android.content.Context context, android.view.Window window, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        return new androidx.appcompat.app.AppCompatDelegateImpl(context, window, appCompatCallback);
    }

    public static androidx.appcompat.app.AppCompatDelegate create(android.content.Context context, android.app.Activity activity, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        return new androidx.appcompat.app.AppCompatDelegateImpl(context, activity, appCompatCallback);
    }

    AppCompatDelegate() {
    }

    public static void setDefaultNightMode(int i) {
        if (i == -1 || i == 0 || i == 1 || i == 2 || i == 3) {
            if (sDefaultNightMode != i) {
                sDefaultNightMode = i;
                applyDayNightToActiveDelegates();
                return;
            }
            return;
        }
        android.util.Log.d(TAG, "setDefaultNightMode() called with an unknown mode");
    }

    public static int getDefaultNightMode() {
        return sDefaultNightMode;
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z) {
        androidx.appcompat.widget.VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(z);
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        return androidx.appcompat.widget.VectorEnabledTintResources.isCompatVectorFromResourcesEnabled();
    }

    static void markStarted(androidx.appcompat.app.AppCompatDelegate appCompatDelegate) {
        synchronized (sActiveDelegatesLock) {
            removeDelegateFromActives(appCompatDelegate);
            sActiveDelegates.add(new java.lang.ref.WeakReference<>(appCompatDelegate));
        }
    }

    static void markStopped(androidx.appcompat.app.AppCompatDelegate appCompatDelegate) {
        synchronized (sActiveDelegatesLock) {
            removeDelegateFromActives(appCompatDelegate);
        }
    }

    private static void removeDelegateFromActives(androidx.appcompat.app.AppCompatDelegate appCompatDelegate) {
        synchronized (sActiveDelegatesLock) {
            java.util.Iterator<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> it = sActiveDelegates.iterator();
            while (it.hasNext()) {
                androidx.appcompat.app.AppCompatDelegate appCompatDelegate2 = it.next().get();
                if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                    it.remove();
                }
            }
        }
    }

    private static void applyDayNightToActiveDelegates() {
        synchronized (sActiveDelegatesLock) {
            java.util.Iterator<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> it = sActiveDelegates.iterator();
            while (it.hasNext()) {
                androidx.appcompat.app.AppCompatDelegate appCompatDelegate = it.next().get();
                if (appCompatDelegate != null) {
                    appCompatDelegate.applyDayNight();
                }
            }
        }
    }
}
