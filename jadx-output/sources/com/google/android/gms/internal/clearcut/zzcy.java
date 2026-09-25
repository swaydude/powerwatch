package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
abstract class zzcy {
    private static final com.google.android.gms.internal.clearcut.zzcy zzlt;
    private static final com.google.android.gms.internal.clearcut.zzcy zzlu;

    static {
        com.google.android.gms.internal.clearcut.zzcz zzczVar = null;
        zzlt = new com.google.android.gms.internal.clearcut.zzda();
        zzlu = new com.google.android.gms.internal.clearcut.zzdb();
    }

    private zzcy() {
    }

    static com.google.android.gms.internal.clearcut.zzcy zzbv() {
        return zzlt;
    }

    static com.google.android.gms.internal.clearcut.zzcy zzbw() {
        return zzlu;
    }

    abstract void zza(java.lang.Object obj, long j);

    abstract <L> void zza(java.lang.Object obj, java.lang.Object obj2, long j);
}
