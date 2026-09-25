package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public class zzft {
    private static final com.google.android.gms.internal.measurement.zzeq zza = com.google.android.gms.internal.measurement.zzeq.zza();
    private com.google.android.gms.internal.measurement.zzdu zzb;
    private volatile com.google.android.gms.internal.measurement.zzgo zzc;
    private volatile com.google.android.gms.internal.measurement.zzdu zzd;

    public int hashCode() {
        return 1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzft)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzft zzftVar = (com.google.android.gms.internal.measurement.zzft) obj;
        com.google.android.gms.internal.measurement.zzgo zzgoVar = this.zzc;
        com.google.android.gms.internal.measurement.zzgo zzgoVar2 = zzftVar.zzc;
        if (zzgoVar == null && zzgoVar2 == null) {
            return zzc().equals(zzftVar.zzc());
        }
        if (zzgoVar != null && zzgoVar2 != null) {
            return zzgoVar.equals(zzgoVar2);
        }
        if (zzgoVar != null) {
            return zzgoVar.equals(zzftVar.zzb(zzgoVar.zzbt()));
        }
        return zzb(zzgoVar2.zzbt()).equals(zzgoVar2);
    }

    private final com.google.android.gms.internal.measurement.zzgo zzb(com.google.android.gms.internal.measurement.zzgo zzgoVar) {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    try {
                        this.zzc = zzgoVar;
                        this.zzd = com.google.android.gms.internal.measurement.zzdu.zza;
                    } catch (com.google.android.gms.internal.measurement.zzfo unused) {
                        this.zzc = zzgoVar;
                        this.zzd = com.google.android.gms.internal.measurement.zzdu.zza;
                    }
                }
            }
        }
        return this.zzc;
    }

    public final com.google.android.gms.internal.measurement.zzgo zza(com.google.android.gms.internal.measurement.zzgo zzgoVar) {
        com.google.android.gms.internal.measurement.zzgo zzgoVar2 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzgoVar;
        return zzgoVar2;
    }

    public final int zzb() {
        if (this.zzd != null) {
            return this.zzd.zza();
        }
        if (this.zzc != null) {
            return this.zzc.zzbn();
        }
        return 0;
    }

    public final com.google.android.gms.internal.measurement.zzdu zzc() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            if (this.zzd != null) {
                return this.zzd;
            }
            if (this.zzc == null) {
                this.zzd = com.google.android.gms.internal.measurement.zzdu.zza;
            } else {
                this.zzd = this.zzc.zzbh();
            }
            return this.zzd;
        }
    }
}
