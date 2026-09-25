package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzb implements com.google.android.gms.tasks.OnSuccessListener<java.lang.Void> {
    private final /* synthetic */ com.google.android.gms.tasks.OnTokenCanceledListener zzb;

    zzb(com.google.android.gms.tasks.zza zzaVar, com.google.android.gms.tasks.OnTokenCanceledListener onTokenCanceledListener) {
        this.zzb = onTokenCanceledListener;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(java.lang.Void r1) {
        this.zzb.onCanceled();
    }
}
