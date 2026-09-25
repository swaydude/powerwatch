package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzbm {
    public static android.os.Looper zza(android.os.Looper looper) {
        return looper != null ? looper : zzc();
    }

    public static android.os.Looper zzc() {
        com.google.android.gms.common.internal.Preconditions.checkState(android.os.Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        return android.os.Looper.myLooper();
    }
}
