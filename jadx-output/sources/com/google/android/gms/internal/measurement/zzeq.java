package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public class zzeq {
    private static volatile boolean zza = false;
    private static boolean zzb = true;
    private static volatile com.google.android.gms.internal.measurement.zzeq zzc;
    private static volatile com.google.android.gms.internal.measurement.zzeq zzd;
    private static final com.google.android.gms.internal.measurement.zzeq zze = new com.google.android.gms.internal.measurement.zzeq(true);
    private final java.util.Map<com.google.android.gms.internal.measurement.zzeq.zza, com.google.android.gms.internal.measurement.zzfd.zzf<?, ?>> zzf;

    public static com.google.android.gms.internal.measurement.zzeq zza() {
        com.google.android.gms.internal.measurement.zzeq zzeqVar = zzc;
        if (zzeqVar == null) {
            synchronized (com.google.android.gms.internal.measurement.zzeq.class) {
                zzeqVar = zzc;
                if (zzeqVar == null) {
                    zzeqVar = zze;
                    zzc = zzeqVar;
                }
            }
        }
        return zzeqVar;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
    static final class zza {
        private final java.lang.Object zza;
        private final int zzb;

        zza(java.lang.Object obj, int i) {
            this.zza = obj;
            this.zzb = i;
        }

        public final int hashCode() {
            return (java.lang.System.identityHashCode(this.zza) * androidx.core.internal.view.SupportMenu.USER_MASK) + this.zzb;
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.android.gms.internal.measurement.zzeq.zza)) {
                return false;
            }
            com.google.android.gms.internal.measurement.zzeq.zza zzaVar = (com.google.android.gms.internal.measurement.zzeq.zza) obj;
            return this.zza == zzaVar.zza && this.zzb == zzaVar.zzb;
        }
    }

    public static com.google.android.gms.internal.measurement.zzeq zzb() {
        com.google.android.gms.internal.measurement.zzeq zzeqVar = zzd;
        if (zzeqVar != null) {
            return zzeqVar;
        }
        synchronized (com.google.android.gms.internal.measurement.zzeq.class) {
            com.google.android.gms.internal.measurement.zzeq zzeqVar2 = zzd;
            if (zzeqVar2 != null) {
                return zzeqVar2;
            }
            com.google.android.gms.internal.measurement.zzeq zzeqVarZza = com.google.android.gms.internal.measurement.zzfb.zza(com.google.android.gms.internal.measurement.zzeq.class);
            zzd = zzeqVarZza;
            return zzeqVarZza;
        }
    }

    public final <ContainingType extends com.google.android.gms.internal.measurement.zzgo> com.google.android.gms.internal.measurement.zzfd.zzf<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (com.google.android.gms.internal.measurement.zzfd.zzf) this.zzf.get(new com.google.android.gms.internal.measurement.zzeq.zza(containingtype, i));
    }

    zzeq() {
        this.zzf = new java.util.HashMap();
    }

    private zzeq(boolean z) {
        this.zzf = java.util.Collections.emptyMap();
    }
}
