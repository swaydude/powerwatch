package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class zzgd {
    private static volatile boolean zzsv = false;
    private static boolean zzsw = true;
    private static volatile com.google.android.gms.internal.vision.zzgd zzsx;
    private static volatile com.google.android.gms.internal.vision.zzgd zzsy;
    private static final com.google.android.gms.internal.vision.zzgd zzsz = new com.google.android.gms.internal.vision.zzgd(true);
    private final java.util.Map<com.google.android.gms.internal.vision.zzgd.zza, com.google.android.gms.internal.vision.zzgs.zzg<?, ?>> zzta;

    public static com.google.android.gms.internal.vision.zzgd zzfk() {
        return new com.google.android.gms.internal.vision.zzgd();
    }

    public static com.google.android.gms.internal.vision.zzgd zzfl() {
        com.google.android.gms.internal.vision.zzgd zzgdVar = zzsx;
        if (zzgdVar == null) {
            synchronized (com.google.android.gms.internal.vision.zzgd.class) {
                zzgdVar = zzsx;
                if (zzgdVar == null) {
                    zzgdVar = zzsz;
                    zzsx = zzgdVar;
                }
            }
        }
        return zzgdVar;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    static final class zza {
        private final int number;
        private final java.lang.Object object;

        zza(java.lang.Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public final int hashCode() {
            return (java.lang.System.identityHashCode(this.object) * androidx.core.internal.view.SupportMenu.USER_MASK) + this.number;
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.android.gms.internal.vision.zzgd.zza)) {
                return false;
            }
            com.google.android.gms.internal.vision.zzgd.zza zzaVar = (com.google.android.gms.internal.vision.zzgd.zza) obj;
            return this.object == zzaVar.object && this.number == zzaVar.number;
        }
    }

    public static com.google.android.gms.internal.vision.zzgd zzfm() {
        com.google.android.gms.internal.vision.zzgd zzgdVarZzc = zzsy;
        if (zzgdVarZzc == null) {
            synchronized (com.google.android.gms.internal.vision.zzgd.class) {
                zzgdVarZzc = zzsy;
                if (zzgdVarZzc == null) {
                    zzgdVarZzc = com.google.android.gms.internal.vision.zzgr.zzc(com.google.android.gms.internal.vision.zzgd.class);
                    zzsy = zzgdVarZzc;
                }
            }
        }
        return zzgdVarZzc;
    }

    public final <ContainingType extends com.google.android.gms.internal.vision.zzic> com.google.android.gms.internal.vision.zzgs.zzg<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (com.google.android.gms.internal.vision.zzgs.zzg) this.zzta.get(new com.google.android.gms.internal.vision.zzgd.zza(containingtype, i));
    }

    public final void zza(com.google.android.gms.internal.vision.zzgs.zzg<?, ?> zzgVar) {
        this.zzta.put(new com.google.android.gms.internal.vision.zzgd.zza(zzgVar.zzwz, zzgVar.zzxb.number), zzgVar);
    }

    zzgd() {
        this.zzta = new java.util.HashMap();
    }

    private zzgd(boolean z) {
        this.zzta = java.util.Collections.emptyMap();
    }
}
