package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzez<V> {
    private static final java.lang.Object zzf = new java.lang.Object();
    private final java.lang.String zza;
    private final com.google.android.gms.measurement.internal.zzex<V> zzb;
    private final V zzc;
    private final V zzd;
    private final java.lang.Object zze;
    private volatile V zzg;
    private volatile V zzh;

    private zzez(java.lang.String str, V v, V v2, com.google.android.gms.measurement.internal.zzex<V> zzexVar) {
        this.zze = new java.lang.Object();
        this.zzg = null;
        this.zzh = null;
        this.zza = str;
        this.zzc = v;
        this.zzd = v2;
        this.zzb = zzexVar;
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final V zza(V v) {
        synchronized (this.zze) {
        }
        if (v != null) {
            return v;
        }
        if (com.google.android.gms.measurement.internal.zzfa.zza == null) {
            return this.zzc;
        }
        com.google.android.gms.measurement.internal.zzw zzwVar = com.google.android.gms.measurement.internal.zzfa.zza;
        synchronized (zzf) {
            if (com.google.android.gms.measurement.internal.zzw.zza()) {
                return this.zzh == null ? this.zzc : this.zzh;
            }
            try {
                for (com.google.android.gms.measurement.internal.zzez zzezVar : com.google.android.gms.measurement.internal.zzap.zzdh) {
                    if (com.google.android.gms.measurement.internal.zzw.zza()) {
                        throw new java.lang.IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    V vZza = null;
                    try {
                        com.google.android.gms.measurement.internal.zzex<V> zzexVar = zzezVar.zzb;
                        if (zzexVar != null) {
                            vZza = zzexVar.zza();
                        }
                    } catch (java.lang.IllegalStateException unused) {
                    }
                    synchronized (zzf) {
                        zzezVar.zzh = vZza;
                    }
                }
            } catch (java.lang.SecurityException unused2) {
            }
            com.google.android.gms.measurement.internal.zzex<V> zzexVar2 = this.zzb;
            if (zzexVar2 == null) {
                com.google.android.gms.measurement.internal.zzw zzwVar2 = com.google.android.gms.measurement.internal.zzfa.zza;
                return this.zzc;
            }
            try {
                return zzexVar2.zza();
            } catch (java.lang.IllegalStateException unused3) {
                com.google.android.gms.measurement.internal.zzw zzwVar3 = com.google.android.gms.measurement.internal.zzfa.zza;
                return this.zzc;
            } catch (java.lang.SecurityException unused4) {
                com.google.android.gms.measurement.internal.zzw zzwVar4 = com.google.android.gms.measurement.internal.zzfa.zza;
                return this.zzc;
            }
        }
    }
}
