package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zza extends com.google.android.gms.tasks.CancellationToken {
    private final com.google.android.gms.tasks.zzu<java.lang.Void> zza = new com.google.android.gms.tasks.zzu<>();

    zza() {
    }

    @Override // com.google.android.gms.tasks.CancellationToken
    public final boolean isCancellationRequested() {
        return this.zza.isComplete();
    }

    @Override // com.google.android.gms.tasks.CancellationToken
    public final com.google.android.gms.tasks.CancellationToken onCanceledRequested(com.google.android.gms.tasks.OnTokenCanceledListener onTokenCanceledListener) {
        this.zza.addOnSuccessListener(new com.google.android.gms.tasks.zzb(this, onTokenCanceledListener));
        return this;
    }

    public final void cancel() {
        this.zza.trySetResult(null);
    }
}
