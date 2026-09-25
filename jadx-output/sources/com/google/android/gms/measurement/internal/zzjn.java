package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzjn implements java.lang.Runnable {
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    private final /* synthetic */ java.lang.String zzb;
    private final /* synthetic */ java.lang.String zzc;
    private final /* synthetic */ java.lang.String zzd;
    private final /* synthetic */ boolean zze;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzm zzf;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzix zzg;

    zzjn(com.google.android.gms.measurement.internal.zzix zzixVar, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, com.google.android.gms.measurement.internal.zzm zzmVar) {
        this.zzg = zzixVar;
        this.zza = atomicReference;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z;
        this.zzf = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            try {
                try {
                    com.google.android.gms.measurement.internal.zzfc zzfcVar = this.zzg.zzb;
                    if (zzfcVar == null) {
                        this.zzg.zzr().zzf().zza("(legacy) Failed to get user properties; not connected to service", com.google.android.gms.measurement.internal.zzfk.zza(this.zzb), this.zzc, this.zzd);
                        this.zza.set(java.util.Collections.emptyList());
                        this.zza.notify();
                    } else {
                        if (android.text.TextUtils.isEmpty(this.zzb)) {
                            this.zza.set(zzfcVar.zza(this.zzc, this.zzd, this.zze, this.zzf));
                        } else {
                            this.zza.set(zzfcVar.zza(this.zzb, this.zzc, this.zzd, this.zze));
                        }
                        this.zzg.zzaj();
                        this.zza.notify();
                    }
                } catch (android.os.RemoteException e) {
                    this.zzg.zzr().zzf().zza("(legacy) Failed to get user properties; remote exception", com.google.android.gms.measurement.internal.zzfk.zza(this.zzb), this.zzc, e);
                    this.zza.set(java.util.Collections.emptyList());
                    this.zza.notify();
                }
            } catch (java.lang.Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
