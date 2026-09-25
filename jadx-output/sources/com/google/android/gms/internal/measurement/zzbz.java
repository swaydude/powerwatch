package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbz extends android.database.ContentObserver {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzbx zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbz(com.google.android.gms.internal.measurement.zzbx zzbxVar, android.os.Handler handler) {
        super(null);
        this.zza = zzbxVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.zzb();
    }
}
