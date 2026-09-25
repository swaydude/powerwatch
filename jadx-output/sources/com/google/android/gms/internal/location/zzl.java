package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzl implements com.google.android.gms.internal.location.zzbj<com.google.android.gms.internal.location.zzao> {
    private final /* synthetic */ com.google.android.gms.internal.location.zzk zzcc;

    zzl(com.google.android.gms.internal.location.zzk zzkVar) {
        this.zzcc = zzkVar;
    }

    @Override // com.google.android.gms.internal.location.zzbj
    public final void checkConnected() {
        this.zzcc.checkConnected();
    }

    @Override // com.google.android.gms.internal.location.zzbj
    public final /* synthetic */ android.os.IInterface getService() throws android.os.DeadObjectException {
        return (com.google.android.gms.internal.location.zzao) this.zzcc.getService();
    }
}
