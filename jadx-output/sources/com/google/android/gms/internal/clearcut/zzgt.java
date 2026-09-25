package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzgt {

    public static final class zza extends com.google.android.gms.internal.clearcut.zzcg<com.google.android.gms.internal.clearcut.zzgt.zza, com.google.android.gms.internal.clearcut.zzgt.zza.C0022zza> implements com.google.android.gms.internal.clearcut.zzdq {
        private static volatile com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgt.zza> zzbg;
        private static final com.google.android.gms.internal.clearcut.zzgt.zza zzbil;

        /* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.zzgt$zza$zza, reason: collision with other inner class name */
        public static final class C0022zza extends com.google.android.gms.internal.clearcut.zzcg.zza<com.google.android.gms.internal.clearcut.zzgt.zza, com.google.android.gms.internal.clearcut.zzgt.zza.C0022zza> implements com.google.android.gms.internal.clearcut.zzdq {
            private C0022zza() {
                super(com.google.android.gms.internal.clearcut.zzgt.zza.zzbil);
            }

            /* synthetic */ C0022zza(com.google.android.gms.internal.clearcut.zzgu zzguVar) {
                this();
            }
        }

        public enum zzb implements com.google.android.gms.internal.clearcut.zzcj {
            NO_RESTRICTION(0),
            SIDEWINDER_DEVICE(1),
            LATCHSKY_DEVICE(2);

            private static final com.google.android.gms.internal.clearcut.zzck<com.google.android.gms.internal.clearcut.zzgt.zza.zzb> zzbq = new com.google.android.gms.internal.clearcut.zzgv();
            private final int value;

            zzb(int i) {
                this.value = i;
            }

            public static com.google.android.gms.internal.clearcut.zzgt.zza.zzb zzbe(int i) {
                if (i == 0) {
                    return NO_RESTRICTION;
                }
                if (i == 1) {
                    return SIDEWINDER_DEVICE;
                }
                if (i != 2) {
                    return null;
                }
                return LATCHSKY_DEVICE;
            }

            public static com.google.android.gms.internal.clearcut.zzck<com.google.android.gms.internal.clearcut.zzgt.zza.zzb> zzd() {
                return zzbq;
            }

            @Override // com.google.android.gms.internal.clearcut.zzcj
            public final int zzc() {
                return this.value;
            }
        }

        static {
            com.google.android.gms.internal.clearcut.zzgt.zza zzaVar = new com.google.android.gms.internal.clearcut.zzgt.zza();
            zzbil = zzaVar;
            com.google.android.gms.internal.clearcut.zzcg.zza((java.lang.Class<com.google.android.gms.internal.clearcut.zzgt.zza>) com.google.android.gms.internal.clearcut.zzgt.zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.clearcut.zzcg$zzb, com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgt$zza>] */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17 */
        @Override // com.google.android.gms.internal.clearcut.zzcg
        protected final java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2) {
            ?? r1;
            com.google.android.gms.internal.clearcut.zzgu zzguVar = null;
            switch (com.google.android.gms.internal.clearcut.zzgu.zzba[i - 1]) {
                case 1:
                    return new com.google.android.gms.internal.clearcut.zzgt.zza();
                case 2:
                    return new com.google.android.gms.internal.clearcut.zzgt.zza.C0022zza(zzguVar);
                case 3:
                    return zza(zzbil, "\u0001\u0000", (java.lang.Object[]) null);
                case 4:
                    return zzbil;
                case 5:
                    com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgt.zza> zzdzVar = zzbg;
                    java.lang.Object obj3 = zzdzVar;
                    if (zzdzVar == null) {
                        synchronized (com.google.android.gms.internal.clearcut.zzgt.zza.class) {
                            com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgt.zza> zzdzVar2 = zzbg;
                            r1 = zzdzVar2;
                            if (zzdzVar2 == null) {
                                ?? zzbVar = new com.google.android.gms.internal.clearcut.zzcg.zzb(zzbil);
                                zzbg = zzbVar;
                                r1 = zzbVar;
                            }
                            break;
                        }
                        obj3 = r1;
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
