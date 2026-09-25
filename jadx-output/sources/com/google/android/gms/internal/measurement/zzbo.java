package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbo {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
    public static final class zza extends com.google.android.gms.internal.measurement.zzfd<com.google.android.gms.internal.measurement.zzbo.zza, com.google.android.gms.internal.measurement.zzbo.zza.C0027zza> implements com.google.android.gms.internal.measurement.zzgq {
        private static final com.google.android.gms.internal.measurement.zzbo.zza zzh;
        private static volatile com.google.android.gms.internal.measurement.zzgx<com.google.android.gms.internal.measurement.zzbo.zza> zzi;
        private int zzc;
        private java.lang.String zzd = "";
        private boolean zze;
        private boolean zzf;
        private int zzg;

        private zza() {
        }

        /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzbo$zza$zza, reason: collision with other inner class name */
        /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
        public static final class C0027zza extends com.google.android.gms.internal.measurement.zzfd.zzb<com.google.android.gms.internal.measurement.zzbo.zza, com.google.android.gms.internal.measurement.zzbo.zza.C0027zza> implements com.google.android.gms.internal.measurement.zzgq {
            private C0027zza() {
                super(com.google.android.gms.internal.measurement.zzbo.zza.zzh);
            }

            public final java.lang.String zza() {
                return ((com.google.android.gms.internal.measurement.zzbo.zza) this.zza).zza();
            }

            public final com.google.android.gms.internal.measurement.zzbo.zza.C0027zza zza(java.lang.String str) {
                if (this.zzb) {
                    zzq();
                    this.zzb = false;
                }
                ((com.google.android.gms.internal.measurement.zzbo.zza) this.zza).zza(str);
                return this;
            }

            public final boolean zzb() {
                return ((com.google.android.gms.internal.measurement.zzbo.zza) this.zza).zzb();
            }

            public final boolean zzc() {
                return ((com.google.android.gms.internal.measurement.zzbo.zza) this.zza).zzc();
            }

            public final boolean zzd() {
                return ((com.google.android.gms.internal.measurement.zzbo.zza) this.zza).zzd();
            }

            public final int zze() {
                return ((com.google.android.gms.internal.measurement.zzbo.zza) this.zza).zze();
            }

            /* synthetic */ C0027zza(com.google.android.gms.internal.measurement.zzbq zzbqVar) {
                this();
            }
        }

        public final java.lang.String zza() {
            return this.zzd;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(java.lang.String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        public final boolean zzb() {
            return this.zze;
        }

        public final boolean zzc() {
            return this.zzf;
        }

        public final boolean zzd() {
            return (this.zzc & 8) != 0;
        }

        public final int zze() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        protected final java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2) {
            com.google.android.gms.internal.measurement.zzbq zzbqVar = null;
            switch (com.google.android.gms.internal.measurement.zzbq.zza[i - 1]) {
                case 1:
                    return new com.google.android.gms.internal.measurement.zzbo.zza();
                case 2:
                    return new com.google.android.gms.internal.measurement.zzbo.zza.C0027zza(zzbqVar);
                case 3:
                    return zza(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0004\u0003", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    com.google.android.gms.internal.measurement.zzgx<com.google.android.gms.internal.measurement.zzbo.zza> zzaVar = zzi;
                    if (zzaVar == null) {
                        synchronized (com.google.android.gms.internal.measurement.zzbo.zza.class) {
                            zzaVar = zzi;
                            if (zzaVar == null) {
                                zzaVar = new com.google.android.gms.internal.measurement.zzfd.zza<>(zzh);
                                zzi = zzaVar;
                            }
                            break;
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        static {
            com.google.android.gms.internal.measurement.zzbo.zza zzaVar = new com.google.android.gms.internal.measurement.zzbo.zza();
            zzh = zzaVar;
            com.google.android.gms.internal.measurement.zzfd.zza((java.lang.Class<com.google.android.gms.internal.measurement.zzbo.zza>) com.google.android.gms.internal.measurement.zzbo.zza.class, zzaVar);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
    public static final class zzb extends com.google.android.gms.internal.measurement.zzfd<com.google.android.gms.internal.measurement.zzbo.zzb, com.google.android.gms.internal.measurement.zzbo.zzb.zza> implements com.google.android.gms.internal.measurement.zzgq {
        private static final com.google.android.gms.internal.measurement.zzbo.zzb zzl;
        private static volatile com.google.android.gms.internal.measurement.zzgx<com.google.android.gms.internal.measurement.zzbo.zzb> zzm;
        private int zzc;
        private long zzd;
        private int zzf;
        private boolean zzk;
        private java.lang.String zze = "";
        private com.google.android.gms.internal.measurement.zzfl<com.google.android.gms.internal.measurement.zzbo.zzc> zzg = zzbq();
        private com.google.android.gms.internal.measurement.zzfl<com.google.android.gms.internal.measurement.zzbo.zza> zzh = zzbq();
        private com.google.android.gms.internal.measurement.zzfl<com.google.android.gms.internal.measurement.zzbj.zza> zzi = zzbq();
        private java.lang.String zzj = "";

        private zzb() {
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
        public static final class zza extends com.google.android.gms.internal.measurement.zzfd.zzb<com.google.android.gms.internal.measurement.zzbo.zzb, com.google.android.gms.internal.measurement.zzbo.zzb.zza> implements com.google.android.gms.internal.measurement.zzgq {
            private zza() {
                super(com.google.android.gms.internal.measurement.zzbo.zzb.zzl);
            }

            public final int zza() {
                return ((com.google.android.gms.internal.measurement.zzbo.zzb) this.zza).zzf();
            }

            public final com.google.android.gms.internal.measurement.zzbo.zza zza(int i) {
                return ((com.google.android.gms.internal.measurement.zzbo.zzb) this.zza).zza(i);
            }

            public final com.google.android.gms.internal.measurement.zzbo.zzb.zza zza(int i, com.google.android.gms.internal.measurement.zzbo.zza.C0027zza c0027zza) {
                if (this.zzb) {
                    zzq();
                    this.zzb = false;
                }
                ((com.google.android.gms.internal.measurement.zzbo.zzb) this.zza).zza(i, (com.google.android.gms.internal.measurement.zzbo.zza) ((com.google.android.gms.internal.measurement.zzfd) c0027zza.zzu()));
                return this;
            }

            public final java.util.List<com.google.android.gms.internal.measurement.zzbj.zza> zzb() {
                return java.util.Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzbo.zzb) this.zza).zzg());
            }

            public final com.google.android.gms.internal.measurement.zzbo.zzb.zza zzc() {
                if (this.zzb) {
                    zzq();
                    this.zzb = false;
                }
                ((com.google.android.gms.internal.measurement.zzbo.zzb) this.zza).zzl();
                return this;
            }

            /* synthetic */ zza(com.google.android.gms.internal.measurement.zzbq zzbqVar) {
                this();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final long zzb() {
            return this.zzd;
        }

        public final boolean zzc() {
            return (this.zzc & 2) != 0;
        }

        public final java.lang.String zzd() {
            return this.zze;
        }

        public final java.util.List<com.google.android.gms.internal.measurement.zzbo.zzc> zze() {
            return this.zzg;
        }

        public final int zzf() {
            return this.zzh.size();
        }

        public final com.google.android.gms.internal.measurement.zzbo.zza zza(int i) {
            return this.zzh.get(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, com.google.android.gms.internal.measurement.zzbo.zza zzaVar) {
            zzaVar.getClass();
            if (!this.zzh.zza()) {
                this.zzh = com.google.android.gms.internal.measurement.zzfd.zza(this.zzh);
            }
            this.zzh.set(i, zzaVar);
        }

        public final java.util.List<com.google.android.gms.internal.measurement.zzbj.zza> zzg() {
            return this.zzi;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzl() {
            this.zzi = zzbq();
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public static com.google.android.gms.internal.measurement.zzbo.zzb.zza zzi() {
            return zzl.zzbk();
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        protected final java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2) {
            com.google.android.gms.internal.measurement.zzbq zzbqVar = null;
            switch (com.google.android.gms.internal.measurement.zzbq.zza[i - 1]) {
                case 1:
                    return new com.google.android.gms.internal.measurement.zzbo.zzb();
                case 2:
                    return new com.google.android.gms.internal.measurement.zzbo.zzb.zza(zzbqVar);
                case 3:
                    return zza(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\u0004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\b\u0003\b\u0007\u0004", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", com.google.android.gms.internal.measurement.zzbo.zzc.class, "zzh", com.google.android.gms.internal.measurement.zzbo.zza.class, "zzi", com.google.android.gms.internal.measurement.zzbj.zza.class, "zzj", "zzk"});
                case 4:
                    return zzl;
                case 5:
                    com.google.android.gms.internal.measurement.zzgx<com.google.android.gms.internal.measurement.zzbo.zzb> zzaVar = zzm;
                    if (zzaVar == null) {
                        synchronized (com.google.android.gms.internal.measurement.zzbo.zzb.class) {
                            zzaVar = zzm;
                            if (zzaVar == null) {
                                zzaVar = new com.google.android.gms.internal.measurement.zzfd.zza<>(zzl);
                                zzm = zzaVar;
                            }
                            break;
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public static com.google.android.gms.internal.measurement.zzbo.zzb zzj() {
            return zzl;
        }

        static {
            com.google.android.gms.internal.measurement.zzbo.zzb zzbVar = new com.google.android.gms.internal.measurement.zzbo.zzb();
            zzl = zzbVar;
            com.google.android.gms.internal.measurement.zzfd.zza((java.lang.Class<com.google.android.gms.internal.measurement.zzbo.zzb>) com.google.android.gms.internal.measurement.zzbo.zzb.class, zzbVar);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
    public static final class zzc extends com.google.android.gms.internal.measurement.zzfd<com.google.android.gms.internal.measurement.zzbo.zzc, com.google.android.gms.internal.measurement.zzbo.zzc.zza> implements com.google.android.gms.internal.measurement.zzgq {
        private static final com.google.android.gms.internal.measurement.zzbo.zzc zzf;
        private static volatile com.google.android.gms.internal.measurement.zzgx<com.google.android.gms.internal.measurement.zzbo.zzc> zzg;
        private int zzc;
        private java.lang.String zzd = "";
        private java.lang.String zze = "";

        private zzc() {
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
        public static final class zza extends com.google.android.gms.internal.measurement.zzfd.zzb<com.google.android.gms.internal.measurement.zzbo.zzc, com.google.android.gms.internal.measurement.zzbo.zzc.zza> implements com.google.android.gms.internal.measurement.zzgq {
            private zza() {
                super(com.google.android.gms.internal.measurement.zzbo.zzc.zzf);
            }

            /* synthetic */ zza(com.google.android.gms.internal.measurement.zzbq zzbqVar) {
                this();
            }
        }

        public final java.lang.String zza() {
            return this.zzd;
        }

        public final java.lang.String zzb() {
            return this.zze;
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        protected final java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2) {
            com.google.android.gms.internal.measurement.zzbq zzbqVar = null;
            switch (com.google.android.gms.internal.measurement.zzbq.zza[i - 1]) {
                case 1:
                    return new com.google.android.gms.internal.measurement.zzbo.zzc();
                case 2:
                    return new com.google.android.gms.internal.measurement.zzbo.zzc.zza(zzbqVar);
                case 3:
                    return zza(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new java.lang.Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    com.google.android.gms.internal.measurement.zzgx<com.google.android.gms.internal.measurement.zzbo.zzc> zzaVar = zzg;
                    if (zzaVar == null) {
                        synchronized (com.google.android.gms.internal.measurement.zzbo.zzc.class) {
                            zzaVar = zzg;
                            if (zzaVar == null) {
                                zzaVar = new com.google.android.gms.internal.measurement.zzfd.zza<>(zzf);
                                zzg = zzaVar;
                            }
                            break;
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        static {
            com.google.android.gms.internal.measurement.zzbo.zzc zzcVar = new com.google.android.gms.internal.measurement.zzbo.zzc();
            zzf = zzcVar;
            com.google.android.gms.internal.measurement.zzfd.zza((java.lang.Class<com.google.android.gms.internal.measurement.zzbo.zzc>) com.google.android.gms.internal.measurement.zzbo.zzc.class, zzcVar);
        }
    }
}
