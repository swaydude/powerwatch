package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzs implements com.google.android.gms.tasks.OnTokenCanceledListener {
    private final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zzv;

    zzs(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zzv = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
        this.zzv.zza.zza();
    }
}
