package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgc implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzfz zza;
    private final java.lang.String zzb;

    zzgc(com.google.android.gms.measurement.internal.zzfz zzfzVar, java.lang.String str) {
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (iBinder == null) {
            this.zza.zza.zzr().zzi().zza("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzd zzdVarZza = com.google.android.gms.internal.measurement.zzg.zza(iBinder);
            if (zzdVarZza == null) {
                this.zza.zza.zzr().zzi().zza("Install Referrer Service implementation was not found");
            } else {
                this.zza.zza.zzr().zzx().zza("Install Referrer Service connected");
                this.zza.zza.zzq().zza(new com.google.android.gms.measurement.internal.zzgb(this, zzdVarZza, this));
            }
        } catch (java.lang.Exception e) {
            this.zza.zza.zzr().zzi().zza("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.zza.zza.zzr().zzx().zza("Install Referrer Service disconnected");
    }
}
