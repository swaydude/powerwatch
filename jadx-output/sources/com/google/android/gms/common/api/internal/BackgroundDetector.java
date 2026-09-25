package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public final class BackgroundDetector implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {
    private static final com.google.android.gms.common.api.internal.BackgroundDetector zzat = new com.google.android.gms.common.api.internal.BackgroundDetector();
    private final java.util.concurrent.atomic.AtomicBoolean zzau = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean zzav = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.ArrayList<com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener> zzaw = new java.util.ArrayList<>();
    private boolean zzax = false;

    public interface BackgroundStateChangeListener {
        void onBackgroundStateChanged(boolean z);
    }

    private BackgroundDetector() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public static com.google.android.gms.common.api.internal.BackgroundDetector getInstance() {
        return zzat;
    }

    public static void initialize(android.app.Application application) {
        com.google.android.gms.common.api.internal.BackgroundDetector backgroundDetector = zzat;
        synchronized (backgroundDetector) {
            if (!backgroundDetector.zzax) {
                application.registerActivityLifecycleCallbacks(backgroundDetector);
                application.registerComponentCallbacks(backgroundDetector);
                backgroundDetector.zzax = true;
            }
        }
    }

    public final boolean readCurrentStateIfPossible(boolean z) {
        if (!this.zzav.get()) {
            if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBean()) {
                return z;
            }
            android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
            android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.zzav.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.zzau.set(true);
            }
        }
        return isInBackground();
    }

    public final boolean isInBackground() {
        return this.zzau.get();
    }

    public final void addListener(com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (zzat) {
            this.zzaw.add(backgroundStateChangeListener);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        boolean zCompareAndSet = this.zzau.compareAndSet(true, false);
        this.zzav.set(true);
        if (zCompareAndSet) {
            onBackgroundStateChanged(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        boolean zCompareAndSet = this.zzau.compareAndSet(true, false);
        this.zzav.set(true);
        if (zCompareAndSet) {
            onBackgroundStateChanged(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.zzau.compareAndSet(false, true)) {
            this.zzav.set(true);
            onBackgroundStateChanged(true);
        }
    }

    private final void onBackgroundStateChanged(boolean z) {
        synchronized (zzat) {
            java.util.ArrayList<com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener> arrayList = this.zzaw;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener backgroundStateChangeListener = arrayList.get(i);
                i++;
                backgroundStateChangeListener.onBackgroundStateChanged(z);
            }
        }
    }
}
