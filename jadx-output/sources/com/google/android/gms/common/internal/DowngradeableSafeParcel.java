package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class DowngradeableSafeParcel extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    private static final java.lang.Object zzdc = new java.lang.Object();
    private static java.lang.ClassLoader zzdd;
    private static java.lang.Integer zzde;
    private boolean zzdf = false;

    protected abstract boolean prepareForClientVersion(int i);

    private static java.lang.ClassLoader zzp() {
        synchronized (zzdc) {
        }
        return null;
    }

    protected static java.lang.Integer getUnparcelClientVersion() {
        synchronized (zzdc) {
        }
        return null;
    }

    protected boolean shouldDowngrade() {
        return this.zzdf;
    }

    public void setShouldDowngrade(boolean z) {
        this.zzdf = z;
    }

    protected static boolean canUnparcelSafely(java.lang.String str) {
        zzp();
        return true;
    }
}
