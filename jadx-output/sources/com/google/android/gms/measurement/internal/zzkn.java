package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzkn extends com.google.android.gms.measurement.internal.zzaf {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzks zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzko zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzkn(com.google.android.gms.measurement.internal.zzko zzkoVar, com.google.android.gms.measurement.internal.zzhh zzhhVar, com.google.android.gms.measurement.internal.zzks zzksVar) {
        super(zzhhVar);
        this.zzb = zzkoVar;
        this.zza = zzksVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaf
    public final void zza() {
        this.zzb.zzf();
        this.zzb.zzr().zzx().zza("Starting upload from DelayedRunnable");
        this.zza.zzl();
    }
}
