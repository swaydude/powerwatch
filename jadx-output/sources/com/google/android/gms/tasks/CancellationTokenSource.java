package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
public class CancellationTokenSource {
    private final com.google.android.gms.tasks.zza zzc = new com.google.android.gms.tasks.zza();

    public com.google.android.gms.tasks.CancellationToken getToken() {
        return this.zzc;
    }

    public void cancel() {
        this.zzc.cancel();
    }
}
