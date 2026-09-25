package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzac extends android.database.ContentObserver {
    private final /* synthetic */ com.google.android.gms.internal.clearcut.zzab zzdm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzac(com.google.android.gms.internal.clearcut.zzab zzabVar, android.os.Handler handler) {
        super(null);
        this.zzdm = zzabVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zzdm.zzh();
        this.zzdm.zzj();
    }
}
