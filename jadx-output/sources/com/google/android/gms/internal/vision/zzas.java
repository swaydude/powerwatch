package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzas extends android.database.ContentObserver {
    private final /* synthetic */ com.google.android.gms.internal.vision.zzaq zzfq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzas(com.google.android.gms.internal.vision.zzaq zzaqVar, android.os.Handler handler) {
        super(null);
        this.zzfq = zzaqVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zzfq.zzv();
    }
}
