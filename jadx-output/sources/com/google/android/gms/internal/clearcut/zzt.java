package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzt {

    public static final class zza extends com.google.android.gms.internal.clearcut.zzcg<com.google.android.gms.internal.clearcut.zzt.zza, com.google.android.gms.internal.clearcut.zzt.zza.C0025zza> implements com.google.android.gms.internal.clearcut.zzdq {
        private static final com.google.android.gms.internal.clearcut.zzt.zza zzbf;
        private static volatile com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzt.zza> zzbg;
        private int zzbb;
        private int zzbc;
        private int zzbd;
        private int zzbe;

        /* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.zzt$zza$zza, reason: collision with other inner class name */
        public static final class C0025zza extends com.google.android.gms.internal.clearcut.zzcg.zza<com.google.android.gms.internal.clearcut.zzt.zza, com.google.android.gms.internal.clearcut.zzt.zza.C0025zza> implements com.google.android.gms.internal.clearcut.zzdq {
            private C0025zza() {
                super(com.google.android.gms.internal.clearcut.zzt.zza.zzbf);
            }

            /* synthetic */ C0025zza(com.google.android.gms.internal.clearcut.zzu zzuVar) {
                this();
            }
        }

        public enum zzb implements com.google.android.gms.internal.clearcut.zzcj {
            ARCH_UNKNOWN(0),
            ARCH_NON_NATIVE(1),
            ARCH_ARMV5(2),
            ARCH_ARMV7(4),
            ARCH_ARM64(5),
            ARCH_MIPS(6),
            ARCH_MIPS_64(7),
            ARCH_X86(8),
            ARCH_X86_64(9);

            private static final com.google.android.gms.internal.clearcut.zzck<com.google.android.gms.internal.clearcut.zzt.zza.zzb> zzbq = new com.google.android.gms.internal.clearcut.zzv();
            private final int value;

            zzb(int i) {
                this.value = i;
            }

            public static com.google.android.gms.internal.clearcut.zzt.zza.zzb zza(int i) {
                switch (i) {
                    case 0:
                        return ARCH_UNKNOWN;
                    case 1:
                        return ARCH_NON_NATIVE;
                    case 2:
                        return ARCH_ARMV5;
                    case 3:
                    default:
                        return null;
                    case 4:
                        return ARCH_ARMV7;
                    case 5:
                        return ARCH_ARM64;
                    case 6:
                        return ARCH_MIPS;
                    case 7:
                        return ARCH_MIPS_64;
                    case 8:
                        return ARCH_X86;
                    case 9:
                        return ARCH_X86_64;
                }
            }

            public static com.google.android.gms.internal.clearcut.zzck<com.google.android.gms.internal.clearcut.zzt.zza.zzb> zzd() {
                return zzbq;
            }

            @Override // com.google.android.gms.internal.clearcut.zzcj
            public final int zzc() {
                return this.value;
            }
        }

        public enum zzc implements com.google.android.gms.internal.clearcut.zzcj {
            BUILD_TYPE_UNKNOWN(0),
            BUILD_TYPE_PROD(1),
            BUILD_TYPE_INTERNAL(2),
            BUILD_TYPE_PRODLMP(3),
            BUILD_TYPE_THINGS(4),
            BUILD_TYPE_PRODMNC(5),
            BUILD_TYPE_WEARABLE(6),
            BUILD_TYPE_AUTO(7),
            BUILD_TYPE_SIDEWINDERMNC(8),
            BUILD_TYPE_ATV(9),
            BUILD_TYPE_PRODPIX(10),
            BUILD_TYPE_PRODPI(11);

            private static final com.google.android.gms.internal.clearcut.zzck<com.google.android.gms.internal.clearcut.zzt.zza.zzc> zzbq = new com.google.android.gms.internal.clearcut.zzw();
            private final int value;

            zzc(int i) {
                this.value = i;
            }

            public static com.google.android.gms.internal.clearcut.zzt.zza.zzc zzc(int i) {
                switch (i) {
                    case 0:
                        return BUILD_TYPE_UNKNOWN;
                    case 1:
                        return BUILD_TYPE_PROD;
                    case 2:
                        return BUILD_TYPE_INTERNAL;
                    case 3:
                        return BUILD_TYPE_PRODLMP;
                    case 4:
                        return BUILD_TYPE_THINGS;
                    case 5:
                        return BUILD_TYPE_PRODMNC;
                    case 6:
                        return BUILD_TYPE_WEARABLE;
                    case 7:
                        return BUILD_TYPE_AUTO;
                    case 8:
                        return BUILD_TYPE_SIDEWINDERMNC;
                    case 9:
                        return BUILD_TYPE_ATV;
                    case 10:
                        return BUILD_TYPE_PRODPIX;
                    case 11:
                        return BUILD_TYPE_PRODPI;
                    default:
                        return null;
                }
            }

            public static com.google.android.gms.internal.clearcut.zzck<com.google.android.gms.internal.clearcut.zzt.zza.zzc> zzd() {
                return zzbq;
            }

            @Override // com.google.android.gms.internal.clearcut.zzcj
            public final int zzc() {
                return this.value;
            }
        }

        public enum zzd implements com.google.android.gms.internal.clearcut.zzcj {
            DENSITY_UNKNOWN(0),
            DENSITY_ALLDPI(1),
            DENSITY_LDPI(2),
            DENSITY_MDPI(3),
            DENSITY_TVDPI(4),
            DENSITY_HDPI(5),
            DENSITY_XHDPI(7),
            DENSITY_DPI400(8),
            DENSITY_XXHDPI(9),
            DENSITY_XXXHDPI(10);

            private static final com.google.android.gms.internal.clearcut.zzck<com.google.android.gms.internal.clearcut.zzt.zza.zzd> zzbq = new com.google.android.gms.internal.clearcut.zzx();
            private final int value;

            zzd(int i) {
                this.value = i;
            }

            public static com.google.android.gms.internal.clearcut.zzck<com.google.android.gms.internal.clearcut.zzt.zza.zzd> zzd() {
                return zzbq;
            }

            public static com.google.android.gms.internal.clearcut.zzt.zza.zzd zzd(int i) {
                switch (i) {
                    case 0:
                        return DENSITY_UNKNOWN;
                    case 1:
                        return DENSITY_ALLDPI;
                    case 2:
                        return DENSITY_LDPI;
                    case 3:
                        return DENSITY_MDPI;
                    case 4:
                        return DENSITY_TVDPI;
                    case 5:
                        return DENSITY_HDPI;
                    case 6:
                    default:
                        return null;
                    case 7:
                        return DENSITY_XHDPI;
                    case 8:
                        return DENSITY_DPI400;
                    case 9:
                        return DENSITY_XXHDPI;
                    case 10:
                        return DENSITY_XXXHDPI;
                }
            }

            @Override // com.google.android.gms.internal.clearcut.zzcj
            public final int zzc() {
                return this.value;
            }
        }

        static {
            com.google.android.gms.internal.clearcut.zzt.zza zzaVar = new com.google.android.gms.internal.clearcut.zzt.zza();
            zzbf = zzaVar;
            com.google.android.gms.internal.clearcut.zzcg.zza((java.lang.Class<com.google.android.gms.internal.clearcut.zzt.zza>) com.google.android.gms.internal.clearcut.zzt.zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.zzcg$zzb, com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzt$zza>] */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v18 */
        @Override // com.google.android.gms.internal.clearcut.zzcg
        protected final java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2) {
            ?? r2;
            com.google.android.gms.internal.clearcut.zzu zzuVar = null;
            switch (com.google.android.gms.internal.clearcut.zzu.zzba[i - 1]) {
                case 1:
                    return new com.google.android.gms.internal.clearcut.zzt.zza();
                case 2:
                    return new com.google.android.gms.internal.clearcut.zzt.zza.C0025zza(zzuVar);
                case 3:
                    return zza(zzbf, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002", new java.lang.Object[]{"zzbb", "zzbc", com.google.android.gms.internal.clearcut.zzt.zza.zzc.zzd(), "zzbd", com.google.android.gms.internal.clearcut.zzt.zza.zzb.zzd(), "zzbe", com.google.android.gms.internal.clearcut.zzt.zza.zzd.zzd()});
                case 4:
                    return zzbf;
                case 5:
                    com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzt.zza> zzdzVar = zzbg;
                    java.lang.Object obj3 = zzdzVar;
                    if (zzdzVar == null) {
                        synchronized (com.google.android.gms.internal.clearcut.zzt.zza.class) {
                            com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzt.zza> zzdzVar2 = zzbg;
                            r2 = zzdzVar2;
                            if (zzdzVar2 == null) {
                                ?? zzbVar = new com.google.android.gms.internal.clearcut.zzcg.zzb(zzbf);
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
