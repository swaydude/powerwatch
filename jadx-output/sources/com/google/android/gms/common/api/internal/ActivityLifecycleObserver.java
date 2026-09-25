package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityLifecycleObserver {
    public abstract com.google.android.gms.common.api.internal.ActivityLifecycleObserver onStopCallOnce(java.lang.Runnable runnable);

    public static final com.google.android.gms.common.api.internal.ActivityLifecycleObserver of(android.app.Activity activity) {
        return new com.google.android.gms.common.api.internal.zaa(activity);
    }
}
