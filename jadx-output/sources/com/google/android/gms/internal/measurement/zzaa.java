package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzaa extends com.google.android.gms.internal.measurement.zzx.zza {
    private final /* synthetic */ java.lang.String zzc;
    private final /* synthetic */ java.lang.String zzd;
    private final /* synthetic */ android.content.Context zze;
    private final /* synthetic */ android.os.Bundle zzf;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzx zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaa(com.google.android.gms.internal.measurement.zzx zzxVar, java.lang.String str, java.lang.String str2, android.content.Context context, android.os.Bundle bundle) {
        super(zzxVar);
        this.zzg = zzxVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    public final void zza() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean z;
        int iMax;
        try {
            this.zzg.zzf = new java.util.ArrayList();
            com.google.android.gms.internal.measurement.zzx zzxVar = this.zzg;
            if (com.google.android.gms.internal.measurement.zzx.zzc(this.zzc, this.zzd)) {
                java.lang.String str4 = this.zzd;
                str2 = this.zzc;
                str3 = str4;
                str = this.zzg.zzc;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            com.google.android.gms.internal.measurement.zzx.zzi(this.zze);
            boolean z2 = com.google.android.gms.internal.measurement.zzx.zzi.booleanValue() || str2 != null;
            com.google.android.gms.internal.measurement.zzx zzxVar2 = this.zzg;
            zzxVar2.zzr = zzxVar2.zza(this.zze, z2);
            if (this.zzg.zzr == null) {
                android.util.Log.w(this.zzg.zzc, "Failed to connect to measurement client.");
                return;
            }
            int iZzh = com.google.android.gms.internal.measurement.zzx.zzh(this.zze);
            int iZzg = com.google.android.gms.internal.measurement.zzx.zzg(this.zze);
            if (z2) {
                iMax = java.lang.Math.max(iZzh, iZzg);
                z = iZzg < iZzh;
            } else {
                if (iZzh > 0) {
                    iZzg = iZzh;
                }
                z = iZzh > 0;
                iMax = iZzg;
            }
            this.zzg.zzr.initialize(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zze), new com.google.android.gms.internal.measurement.zzv(22048L, iMax, z, str, str2, str3, this.zzf), this.zza);
        } catch (java.lang.Exception e) {
            this.zzg.zza(e, true, false);
        }
    }
}
