package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public class LifecycleActivity {
    private final java.lang.Object zzbd;

    public LifecycleActivity(android.app.Activity activity) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activity, "Activity must not be null");
        this.zzbd = activity;
    }

    public boolean isChimera() {
        return false;
    }

    public LifecycleActivity(android.content.ContextWrapper contextWrapper) {
        throw new java.lang.UnsupportedOperationException();
    }

    public boolean isSupport() {
        return this.zzbd instanceof androidx.fragment.app.FragmentActivity;
    }

    public final boolean zzh() {
        return this.zzbd instanceof android.app.Activity;
    }

    public android.app.Activity asActivity() {
        return (android.app.Activity) this.zzbd;
    }

    public androidx.fragment.app.FragmentActivity asFragmentActivity() {
        return (androidx.fragment.app.FragmentActivity) this.zzbd;
    }

    public java.lang.Object asObject() {
        return this.zzbd;
    }
}
