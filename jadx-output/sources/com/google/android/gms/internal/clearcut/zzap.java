package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzap {

    public static final class zza extends com.google.android.gms.internal.clearcut.zzcg<com.google.android.gms.internal.clearcut.zzap.zza, com.google.android.gms.internal.clearcut.zzap.zza.C0020zza> implements com.google.android.gms.internal.clearcut.zzdq {
        private static volatile com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzap.zza> zzbg;
        private static final com.google.android.gms.internal.clearcut.zzap.zza zzes;
        private int zzbb;
        private int zzel;
        private int zzem;
        private int zzen;
        private int zzeo;
        private int zzep;
        private int zzeq;
        private int zzer;

        /* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.zzap$zza$zza, reason: collision with other inner class name */
        public static final class C0020zza extends com.google.android.gms.internal.clearcut.zzcg.zza<com.google.android.gms.internal.clearcut.zzap.zza, com.google.android.gms.internal.clearcut.zzap.zza.C0020zza> implements com.google.android.gms.internal.clearcut.zzdq {
            private C0020zza() {
                super(com.google.android.gms.internal.clearcut.zzap.zza.zzes);
            }

            /* synthetic */ C0020zza(com.google.android.gms.internal.clearcut.zzaq zzaqVar) {
                this();
            }
        }

        public enum zzb implements com.google.android.gms.internal.clearcut.zzcj {
            UNKNOWN(0),
            ON(1),
            OFF(2);

            private static final com.google.android.gms.internal.clearcut.zzck<com.google.android.gms.internal.clearcut.zzap.zza.zzb> zzbq = new com.google.android.gms.internal.clearcut.zzar();
            private final int value;

            zzb(int i) {
                this.value = i;
            }

            public static com.google.android.gms.internal.clearcut.zzck<com.google.android.gms.internal.clearcut.zzap.zza.zzb> zzd() {
                return zzbq;
            }

            public static com.google.android.gms.internal.clearcut.zzap.zza.zzb zze(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ON;
                }
                if (i != 2) {
                    return null;
                }
                return OFF;
            }

            @Override // com.google.android.gms.internal.clearcut.zzcj
            public final int zzc() {
                return this.value;
            }
        }

        static {
            com.google.android.gms.internal.clearcut.zzap.zza zzaVar = new com.google.android.gms.internal.clearcut.zzap.zza();
            zzes = zzaVar;
            com.google.android.gms.internal.clearcut.zzcg.zza((java.lang.Class<com.google.android.gms.internal.clearcut.zzap.zza>) com.google.android.gms.internal.clearcut.zzap.zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.zzcg$zzb, com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzap$zza>] */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v18 */
        @Override // com.google.android.gms.internal.clearcut.zzcg
        protected final java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2) {
            ?? r2;
            com.google.android.gms.internal.clearcut.zzaq zzaqVar = null;
            switch (com.google.android.gms.internal.clearcut.zzaq.zzba[i - 1]) {
                case 1:
                    return new com.google.android.gms.internal.clearcut.zzap.zza();
                case 2:
                    return new com.google.android.gms.internal.clearcut.zzap.zza.C0020zza(zzaqVar);
                case 3:
                    return zza(zzes, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\b\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003\u0005\f\u0004\u0006\f\u0005\u0007\f\u0006", new java.lang.Object[]{"zzbb", "zzel", com.google.android.gms.internal.clearcut.zzap.zza.zzb.zzd(), "zzem", com.google.android.gms.internal.clearcut.zzap.zza.zzb.zzd(), "zzen", com.google.android.gms.internal.clearcut.zzap.zza.zzb.zzd(), "zzeo", com.google.android.gms.internal.clearcut.zzap.zza.zzb.zzd(), "zzep", com.google.android.gms.internal.clearcut.zzap.zza.zzb.zzd(), "zzeq", com.google.android.gms.internal.clearcut.zzap.zza.zzb.zzd(), "zzer", com.google.android.gms.internal.clearcut.zzap.zza.zzb.zzd()});
                case 4:
                    return zzes;
                case 5:
                    com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzap.zza> zzdzVar = zzbg;
                    java.lang.Object obj3 = zzdzVar;
                    if (zzdzVar == null) {
                        synchronized (com.google.android.gms.internal.clearcut.zzap.zza.class) {
                            com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzap.zza> zzdzVar2 = zzbg;
                            r2 = zzdzVar2;
                            if (zzdzVar2 == null) {
                                ?? zzbVar = new com.google.android.gms.internal.clearcut.zzcg.zzb(zzes);
                                zzbg = zzbVar;
                                r2 = zzbVar;
                            }
                            break;
                        }
                        obj3 = r2;
                    }
                    return obj3;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }
    }
}
