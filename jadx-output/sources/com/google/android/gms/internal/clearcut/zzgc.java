package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzgc extends com.google.android.gms.internal.clearcut.zzcg.zzd<com.google.android.gms.internal.clearcut.zzgc, com.google.android.gms.internal.clearcut.zzgc.zza> implements com.google.android.gms.internal.clearcut.zzdq {
    private static volatile com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgc> zzbg;
    private static final com.google.android.gms.internal.clearcut.zzgc zzsg;
    private byte zzsf = 2;

    public static final class zza extends com.google.android.gms.internal.clearcut.zzcg.zzc<com.google.android.gms.internal.clearcut.zzgc, com.google.android.gms.internal.clearcut.zzgc.zza> implements com.google.android.gms.internal.clearcut.zzdq {
        private zza() {
            super(com.google.android.gms.internal.clearcut.zzgc.zzsg);
        }

        /* synthetic */ zza(com.google.android.gms.internal.clearcut.zzgd zzgdVar) {
            this();
        }
    }

    static {
        com.google.android.gms.internal.clearcut.zzgc zzgcVar = new com.google.android.gms.internal.clearcut.zzgc();
        zzsg = zzgcVar;
        com.google.android.gms.internal.clearcut.zzcg.zza((java.lang.Class<com.google.android.gms.internal.clearcut.zzgc>) com.google.android.gms.internal.clearcut.zzgc.class, zzgcVar);
    }

    private zzgc() {
    }

    public static com.google.android.gms.internal.clearcut.zzgc zzer() {
        return zzsg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.google.android.gms.internal.clearcut.zzcg$zzb, com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgc>] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    @Override // com.google.android.gms.internal.clearcut.zzcg
    protected final java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2) {
        ?? r2;
        com.google.android.gms.internal.clearcut.zzgd zzgdVar = null;
        switch (com.google.android.gms.internal.clearcut.zzgd.zzba[i - 1]) {
            case 1:
                return new com.google.android.gms.internal.clearcut.zzgc();
            case 2:
                return new com.google.android.gms.internal.clearcut.zzgc.zza(zzgdVar);
            case 3:
                return zza(zzsg, "\u0003\u0000", (java.lang.Object[]) null);
            case 4:
                return zzsg;
            case 5:
                com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgc> zzdzVar = zzbg;
                java.lang.Object obj3 = zzdzVar;
                if (zzdzVar == null) {
                    synchronized (com.google.android.gms.internal.clearcut.zzgc.class) {
                        com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgc> zzdzVar2 = zzbg;
                        r2 = zzdzVar2;
                        if (zzdzVar2 == null) {
                            ?? zzbVar = new com.google.android.gms.internal.clearcut.zzcg.zzb(zzsg);
                            zzbg = zzbVar;
                            r2 = zzbVar;
                        }
                        break;
                    }
                    obj3 = r2;
                }
                return obj3;
            case 6:
                return java.lang.Byte.valueOf(this.zzsf);
            case 7:
                this.zzsf = (byte) (obj == null ? 0 : 1);
                return null;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }
}
