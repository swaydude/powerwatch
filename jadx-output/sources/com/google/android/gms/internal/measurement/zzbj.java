package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbj {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
    public static final class zza extends com.google.android.gms.internal.measurement.zzfd<com.google.android.gms.internal.measurement.zzbj.zza, com.google.android.gms.internal.measurement.zzbj.zza.C0026zza> implements com.google.android.gms.internal.measurement.zzgq {
        private static final com.google.android.gms.internal.measurement.zzbj.zza zzi;
        private static volatile com.google.android.gms.internal.measurement.zzgx<com.google.android.gms.internal.measurement.zzbj.zza> zzj;
        private int zzc;
        private int zzd;
        private com.google.android.gms.internal.measurement.zzfl<com.google.android.gms.internal.measurement.zzbj.zze> zze = zzbq();
        private com.google.android.gms.internal.measurement.zzfl<com.google.android.gms.internal.measurement.zzbj.zzb> zzf = zzbq();
        private boolean zzg;
        private boolean zzh;

        private zza() {
        }

        /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzbj$zza$zza, reason: collision with other inner class name */
        /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
        public static final class C0026zza extends com.google.android.gms.internal.measurement.zzfd.zzb<com.google.android.gms.internal.measurement.zzbj.zza, com.google.android.gms.internal.measurement.zzbj.zza.C0026zza> implements com.google.android.gms.internal.measurement.zzgq {
            private C0026zza() {
                super(com.google.android.gms.internal.measurement.zzbj.zza.zzi);
            }

            public final int zza() {
                return ((com.google.android.gms.internal.measurement.zzbj.zza) this.zza).zzd();
            }

            public final com.google.android.gms.internal.measurement.zzbj.zze zza(int i) {
                return ((com.google.android.gms.internal.measurement.zzbj.zza) this.zza).zza(i);
            }

            public final com.google.android.gms.internal.measurement.zzbj.zza.C0026zza zza(int i, com.google.android.gms.internal.measurement.zzbj.zze.zza zzaVar) {
                if (this.zzb) {
                    zzq();
                    this.zzb = false;
                }
                ((com.google.android.gms.internal.measurement.zzbj.zza) this.zza).zza(i, (com.google.android.gms.internal.measurement.zzbj.zze) ((com.google.android.gms.internal.measurement.zzfd) zzaVar.zzu()));
                return this;
            }

            public final int zzb() {
                return ((com.google.android.gms.internal.measurement.zzbj.zza) this.zza).zzf();
            }

            public final com.google.android.gms.internal.measurement.zzbj.zzb zzb(int i) {
                return ((com.google.android.gms.internal.measurement.zzbj.zza) this.zza).zzb(i);
            }

            public final com.google.android.gms.internal.measurement.zzbj.zza.C0026zza zza(int i, com.google.android.gms.internal.measurement.zzbj.zzb.zza zzaVar) {
                if (this.zzb) {
                    zzq();
                    this.zzb = false;
                }
                ((com.google.android.gms.internal.measurement.zzbj.zza) this.zza).zza(i, (com.google.android.gms.internal.measurement.zzbj.zzb) ((com.google.android.gms.internal.measurement.zzfd) zzaVar.zzu()));
                return this;
            }

            /* synthetic */ C0026zza(com.google.android.gms.internal.measurement.zzbk zzbkVar) {
                this();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final int zzb() {
            return this.zzd;
        }

        public final java.util.List<com.google.android.gms.internal.measurement.zzbj.zze> zzc() {
            return this.zze;
        }

        public final int zzd() {
            return this.zze.size();
        }

        public final com.google.android.gms.internal.measurement.zzbj.zze zza(int i) {
            return this.zze.get(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, com.google.android.gms.internal.measurement.zzbj.zze zzeVar) {
            zzeVar.getClass();
            if (!this.zze.zza()) {
                this.zze = com.google.android.gms.internal.measurement.zzfd.zza(this.zze);
            }
            this.zze.set(i, zzeVar);
        }

        public final java.util.List<com.google.android.gms.internal.measurement.zzbj.zzb> zze() {
            return this.zzf;
        }

        public final int zzf() {
            return this.zzf.size();
        }

        public final com.google.android.gms.internal.measurement.zzbj.zzb zzb(int i) {
            return this.zzf.get(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, com.google.android.gms.internal.measurement.zzbj.zzb zzbVar) {
            zzbVar.getClass();
            if (!this.zzf.zza()) {
                this.zzf = com.google.android.gms.internal.measurement.zzfd.zza(this.zzf);
            }
            this.zzf.set(i, zzbVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        protected final java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2) {
            com.google.android.gms.internal.measurement.zzbk zzbkVar = null;
            switch (com.google.android.gms.internal.measurement.zzbk.zza[i - 1]) {
                case 1:
                    return new com.google.android.gms.internal.measurement.zzbj.zza();
                case 2:
                    return new com.google.android.gms.internal.measurement.zzbj.zza.C0026zza(zzbkVar);
                case 3:
                    return zza(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u001b\u0004\u0007\u0001\u0005\u0007\u0002", new java.lang.Object[]{"zzc", "zzd", "zze", com.google.android.gms.internal.measurement.zzbj.zze.class, "zzf", com.google.android.gms.internal.measurement.zzbj.zzb.class, "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    com.google.android.gms.internal.measurement.zzgx<com.google.android.gms.internal.measurement.zzbj.zza> zzaVar = zzj;
                    if (zzaVar == null) {
                        synchronized (com.google.android.gms.internal.measurement.zzbj.zza.class) {
                            zzaVar = zzj;
                            if (zzaVar == null) {
                                zzaVar = new com.google.android.gms.internal.measurement.zzfd.zza<>(zzi);
                                zzj = zzaVar;
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
            com.google.android.gms.internal.measurement.zzbj.zza zzaVar = new com.google.android.gms.internal.measurement.zzbj.zza();
            zzi = zzaVar;
            com.google.android.gms.internal.measurement.zzfd.zza((java.lang.Class<com.google.android.gms.internal.measurement.zzbj.zza>) com.google.android.gms.internal.measurement.zzbj.zza.class, zzaVar);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
    public static final class zzb extends com.google.android.gms.internal.measurement.zzfd<com.google.android.gms.internal.measurement.zzbj.zzb, com.google.android.gms.internal.measurement.zzbj.zzb.zza> implements com.google.android.gms.internal.measurement.zzgq {
        private static final com.google.android.gms.internal.measurement.zzbj.zzb zzl;
        private static volatile com.google.android.gms.internal.measurement.zzgx<com.google.android.gms.internal.measurement.zzbj.zzb> zzm;
        private int zzc;
        private int zzd;
        private java.lang.String zze = "";
        private com.google.android.gms.internal.measurement.zzfl<com.google.android.gms.internal.measurement.zzbj.zzc> zzf = zzbq();
        private boolean zzg;
        private com.google.android.gms.internal.measurement.zzbj.zzd zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        private zzb() {
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
        public static final class zza extends com.google.android.gms.internal.measurement.zzfd.zzb<com.google.android.gms.internal.measurement.zzbj.zzb, com.google.android.gms.internal.measurement.zzbj.zzb.zza> implements com.google.android.gms.internal.measurement.zzgq {
            private zza() {
                super(com.google.android.gms.internal.measurement.zzbj.zzb.zzl);
            }

            public final java.lang.String zza() {
                return ((com.google.android.gms.internal.measurement.zzbj.zzb) this.zza).zzc();
            }

            public final com.google.android.gms.internal.measurement.zzbj.zzb.zza zza(java.lang.String str) {
                if (this.zzb) {
                    zzq();
                    this.zzb = false;
                }
                ((com.google.android.gms.internal.measurement.zzbj.zzb) this.zza).zza(str);
                return this;
            }

            public final int zzb() {
                return ((com.google.android.gms.internal.measurement.zzbj.zzb) this.zza).zze();
            }

            public final com.google.android.gms.internal.measurement.zzbj.zzc zza(int i) {
                return ((com.google.android.gms.internal.measurement.zzbj.zzb) this.zza).zza(i);
            }

            public final com.google.android.gms.internal.measurement.zzbj.zzb.zza zza(int i, com.google.android.gms.internal.measurement.zzbj.zzc zzcVar) {
                if (this.zzb) {
                    zzq();
                    this.zzb = false;
                }
                ((com.google.android.gms.internal.measurement.zzbj.zzb) this.zza).zza(i, zzcVar);
                return this;
            }

            /* synthetic */ zza(com.google.android.gms.internal.measurement.zzbk zzbkVar) {
                this();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final int zzb() {
            return this.zzd;
        }

        public final java.lang.String zzc() {
            return this.zze;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(java.lang.String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        public final java.util.List<com.google.android.gms.internal.measurement.zzbj.zzc> zzd() {
            return this.zzf;
        }

        public final int zze() {
            return this.zzf.size();
        }

        public final com.google.android.gms.internal.measurement.zzbj.zzc zza(int i) {
            return this.zzf.get(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, com.google.android.gms.internal.measurement.zzbj.zzc zzcVar) {
            zzcVar.getClass();
            if (!this.zzf.zza()) {
                this.zzf = com.google.android.gms.internal.measurement.zzfd.zza(this.zzf);
            }
            this.zzf.set(i, zzcVar);
        }

        public final boolean zzf() {
            return (this.zzc & 8) != 0;
        }

        public final com.google.android.gms.internal.measurement.zzbj.zzd zzg() {
            com.google.android.gms.internal.measurement.zzbj.zzd zzdVar = this.zzh;
            return zzdVar == null ? com.google.android.gms.internal.measurement.zzbj.zzd.zzk() : zzdVar;
        }

        public final boolean zzh() {
            return this.zzi;
        }

        public final boolean zzi() {
            return this.zzj;
        }

        public final boolean zzj() {
            return (this.zzc & 64) != 0;
        }

        public final boolean zzk() {
            return this.zzk;
        }

        public static com.google.android.gms.internal.measurement.zzbj.zzb.zza zzl() {
            return zzl.zzbk();
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        protected final java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2) {
            com.google.android.gms.internal.measurement.zzbk zzbkVar = null;
            switch (com.google.android.gms.internal.measurement.zzbk.zza[i - 1]) {
                case 1:
                    return new com.google.android.gms.internal.measurement.zzbj.zzb();
                case 2:
                    return new com.google.android.gms.internal.measurement.zzbj.zzb.zza(zzbkVar);
                case 3:
                    return zza(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u001b\u0004\u0007\u0002\u0005\t\u0003\u0006\u0007\u0004\u0007\u0007\u0005\b\u0007\u0006", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", com.google.android.gms.internal.measurement.zzbj.zzc.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzl;
                case 5:
                    com.google.android.gms.internal.measurement.zzgx<com.google.android.gms.internal.measurement.zzbj.zzb> zzaVar = zzm;
                    if (zzaVar == null) {
                        synchronized (com.google.android.gms.internal.measurement.zzbj.zzb.class) {
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

        static {
            com.google.android.gms.internal.measurement.zzbj.zzb zzbVar = new com.google.android.gms.internal.measurement.zzbj.zzb();
            zzl = zzbVar;
            com.google.android.gms.internal.measurement.zzfd.zza((java.lang.Class<com.google.android.gms.internal.measurement.zzbj.zzb>) com.google.android.gms.internal.measurement.zzbj.zzb.class, zzbVar);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
    public static final class zzd extends com.google.android.gms.internal.measurement.zzfd<com.google.android.gms.internal.measurement.zzbj.zzd, com.google.android.gms.internal.measurement.zzbj.zzd.zzb> implements com.google.android.gms.internal.measurement.zzgq {
        private static final com.google.android.gms.internal.measurement.zzbj.zzd zzi;
        private static volatile com.google.android.gms.internal.measurement.zzgx<com.google.android.gms.internal.measurement.zzbj.zzd> zzj;
        private int zzc;
        private int zzd;
        private boolean zze;
        private java.lang.String zzf = "";
        private java.lang.String zzg = "";
        private java.lang.String zzh = "";

        /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
        public enum zza implements com.google.android.gms.internal.measurement.zzfi {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);

            private static final com.google.android.gms.internal.measurement.zzfh<com.google.android.gms.internal.measurement.zzbj.zzd.zza> zzf = new com.google.android.gms.internal.measurement.zzbm();
            private final int zzg;

            @Override // com.google.android.gms.internal.measurement.zzfi
            public final int zza() {
                return this.zzg;
            }

            public static com.google.android.gms.internal.measurement.zzbj.zzd.zza zza(int i) {
                if (i == 0) {
                    return UNKNOWN_COMPARISON_TYPE;
                }
                if (i == 1) {
                    return LESS_THAN;
                }
                if (i == 2) {
                    return GREATER_THAN;
                }
                if (i == 3) {
                    return EQUAL;
                }
                if (i != 4) {
                    return null;
                }
                return BETWEEN;
            }

            public static com.google.android.gms.internal.measurement.zzfk zzb() {
                return com.google.android.gms.internal.measurement.zzbl.zza;
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "<" + getClass().getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + kotlin.text.Typography.greater;
            }

            zza(int i) {
                this.zzg = i;
            }
        }

        private zzd() {
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
        public static final class zzb extends com.google.android.gms.internal.measurement.zzfd.zzb<com.google.android.gms.internal.measurement.zzbj.zzd, com.google.android.gms.internal.measurement.zzbj.zzd.zzb> implements com.google.android.gms.internal.measurement.zzgq {
            private zzb() {
                super(com.google.android.gms.internal.measurement.zzbj.zzd.zzi);
            }

            /* synthetic */ zzb(com.google.android.gms.internal.measurement.zzbk zzbkVar) {
                this();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final com.google.android.gms.internal.measurement.zzbj.zzd.zza zzb() {
            com.google.android.gms.internal.measurement.zzbj.zzd.zza zzaVarZza = com.google.android.gms.internal.measurement.zzbj.zzd.zza.zza(this.zzd);
            return zzaVarZza == null ? com.google.android.gms.internal.measurement.zzbj.zzd.zza.UNKNOWN_COMPARISON_TYPE : zzaVarZza;
        }

        public final boolean zzc() {
            return (this.zzc & 2) != 0;
        }

        public final boolean zzd() {
            return this.zze;
        }

        public final boolean zze() {
            return (this.zzc & 4) != 0;
        }

        public final java.lang.String zzf() {
            return this.zzf;
        }

        public final boolean zzg() {
            return (this.zzc & 8) != 0;
        }

        public final java.lang.String zzh() {
            return this.zzg;
        }

        public final boolean zzi() {
            return (this.zzc & 16) != 0;
        }

        public final java.lang.String zzj() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        protected final java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2) {
            com.google.android.gms.internal.measurement.zzbk zzbkVar = null;
            switch (com.google.android.gms.internal.measurement.zzbk.zza[i - 1]) {
                case 1:
                    return new com.google.android.gms.internal.measurement.zzbj.zzd();
                case 2:
                    return new com.google.android.gms.internal.measurement.zzbj.zzd.zzb(zzbkVar);
                case 3:
                    return zza(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004", new java.lang.Object[]{"zzc", "zzd", com.google.android.gms.internal.measurement.zzbj.zzd.zza.zzb(), "zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    com.google.android.gms.internal.measurement.zzgx<com.google.android.gms.internal.measurement.zzbj.zzd> zzaVar = zzj;
                    if (zzaVar == null) {
                        synchronized (com.google.android.gms.internal.measurement.zzbj.zzd.class) {
                            zzaVar = zzj;
                            if (zzaVar == null) {
                                zzaVar = new com.google.android.gms.internal.measurement.zzfd.zza<>(zzi);
                                zzj = zzaVar;
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

        public static com.google.android.gms.internal.measurement.zzbj.zzd zzk() {
            return zzi;
        }

        static {
            com.google.android.gms.internal.measurement.zzbj.zzd zzdVar = new com.google.android.gms.internal.measurement.zzbj.zzd();
            zzi = zzdVar;
            com.google.android.gms.internal.measurement.zzfd.zza((java.lang.Class<com.google.android.gms.internal.measurement.zzbj.zzd>) com.google.android.gms.internal.measurement.zzbj.zzd.class, zzdVar);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
    public static final class zzf extends com.google.android.gms.internal.measurement.zzfd<com.google.android.gms.internal.measurement.zzbj.zzf, com.google.android.gms.internal.measurement.zzbj.zzf.zza> implements com.google.android.gms.internal.measurement.zzgq {
        private static final com.google.android.gms.internal.measurement.zzbj.zzf zzh;
        private static volatile com.google.android.gms.internal.measurement.zzgx<com.google.android.gms.internal.measurement.zzbj.zzf> zzi;
        private int zzc;
        private int zzd;
        private boolean zzf;
        private java.lang.String zze = "";
        private com.google.android.gms.internal.measurement.zzfl<java.lang.String> zzg = com.google.android.gms.internal.measurement.zzfd.zzbq();

        /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
        public enum zzb implements com.google.android.gms.internal.measurement.zzfi {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);

            private static final com.google.android.gms.internal.measurement.zzfh<com.google.android.gms.internal.measurement.zzbj.zzf.zzb> zzh = new com.google.android.gms.internal.measurement.zzbn();
            private final int zzi;

            @Override // com.google.android.gms.internal.measurement.zzfi
            public final int zza() {
                return this.zzi;
            }

            public static com.google.android.gms.internal.measurement.zzbj.zzf.zzb zza(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }

            public static com.google.android.gms.internal.measurement.zzfk zzb() {
                return com.google.android.gms.internal.measurement.zzbp.zza;
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "<" + getClass().getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + kotlin.text.Typography.greater;
            }

            zzb(int i) {
                this.zzi = i;
            }
        }

        private zzf() {
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
        public static final class zza extends com.google.android.gms.internal.measurement.zzfd.zzb<com.google.android.gms.internal.measurement.zzbj.zzf, com.google.android.gms.internal.measurement.zzbj.zzf.zza> implements com.google.android.gms.internal.measurement.zzgq {
            private zza() {
                super(com.google.android.gms.internal.measurement.zzbj.zzf.zzh);
            }

            /* synthetic */ zza(com.google.android.gms.internal.measurement.zzbk zzbkVar) {
                this();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final com.google.android.gms.internal.measurement.zzbj.zzf.zzb zzb() {
            com.google.android.gms.internal.measurement.zzbj.zzf.zzb zzbVarZza = com.google.android.gms.internal.measurement.zzbj.zzf.zzb.zza(this.zzd);
            return zzbVarZza == null ? com.google.android.gms.internal.measurement.zzbj.zzf.zzb.UNKNOWN_MATCH_TYPE : zzbVarZza;
        }

        public final boolean zzc() {
            return (this.zzc & 2) != 0;
        }

        public final java.lang.String zzd() {
            return this.zze;
        }

        public final boolean zze() {
            return (this.zzc & 4) != 0;
        }

        public final boolean zzf() {
            return this.zzf;
        }

        public final java.util.List<java.lang.String> zzg() {
            return this.zzg;
        }

        public final int zzh() {
            return this.zzg.size();
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        protected final java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2) {
            com.google.android.gms.internal.measurement.zzbk zzbkVar = null;
            switch (com.google.android.gms.internal.measurement.zzbk.zza[i - 1]) {
                case 1:
                    return new com.google.android.gms.internal.measurement.zzbj.zzf();
                case 2:
                    return new com.google.android.gms.internal.measurement.zzbj.zzf.zza(zzbkVar);
                case 3:
                    return zza(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u001a", new java.lang.Object[]{"zzc", "zzd", com.google.android.gms.internal.measurement.zzbj.zzf.zzb.zzb(), "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    com.google.android.gms.internal.measurement.zzgx<com.google.android.gms.internal.measurement.zzbj.zzf> zzaVar = zzi;
                    if (zzaVar == null) {
                        synchronized (com.google.android.gms.internal.measurement.zzbj.zzf.class) {
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

        public static com.google.android.gms.internal.measurement.zzbj.zzf zzi() {
            return zzh;
        }

        static {
            com.google.android.gms.internal.measurement.zzbj.zzf zzfVar = new com.google.android.gms.internal.measurement.zzbj.zzf();
            zzh = zzfVar;
            com.google.android.gms.internal.measurement.zzfd.zza((java.lang.Class<com.google.android.gms.internal.measurement.zzbj.zzf>) com.google.android.gms.internal.measurement.zzbj.zzf.class, zzfVar);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
    public static final class zzc extends com.google.android.gms.internal.measurement.zzfd<com.google.android.gms.internal.measurement.zzbj.zzc, com.google.android.gms.internal.measurement.zzbj.zzc.zza> implements com.google.android.gms.internal.measurement.zzgq {
        private static final com.google.android.gms.internal.measurement.zzbj.zzc zzh;
        private static volatile com.google.android.gms.internal.measurement.zzgx<com.google.android.gms.internal.measurement.zzbj.zzc> zzi;
        private int zzc;
        private com.google.android.gms.internal.measurement.zzbj.zzf zzd;
        private com.google.android.gms.internal.measurement.zzbj.zzd zze;
        private boolean zzf;
        private java.lang.String zzg = "";

        private zzc() {
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
        public static final class zza extends com.google.android.gms.internal.measurement.zzfd.zzb<com.google.android.gms.internal.measurement.zzbj.zzc, com.google.android.gms.internal.measurement.zzbj.zzc.zza> implements com.google.android.gms.internal.measurement.zzgq {
            private zza() {
                super(com.google.android.gms.internal.measurement.zzbj.zzc.zzh);
            }

            public final com.google.android.gms.internal.measurement.zzbj.zzc.zza zza(java.lang.String str) {
                if (this.zzb) {
                    zzq();
                    this.zzb = false;
                }
                ((com.google.android.gms.internal.measurement.zzbj.zzc) this.zza).zza(str);
                return this;
            }

            /* synthetic */ zza(com.google.android.gms.internal.measurement.zzbk zzbkVar) {
                this();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final com.google.android.gms.internal.measurement.zzbj.zzf zzb() {
            com.google.android.gms.internal.measurement.zzbj.zzf zzfVar = this.zzd;
            return zzfVar == null ? com.google.android.gms.internal.measurement.zzbj.zzf.zzi() : zzfVar;
        }

        public final boolean zzc() {
            return (this.zzc & 2) != 0;
        }

        public final com.google.android.gms.internal.measurement.zzbj.zzd zzd() {
            com.google.android.gms.internal.measurement.zzbj.zzd zzdVar = this.zze;
            return zzdVar == null ? com.google.android.gms.internal.measurement.zzbj.zzd.zzk() : zzdVar;
        }

        public final boolean zze() {
            return (this.zzc & 4) != 0;
        }

        public final boolean zzf() {
            return this.zzf;
        }

        public final boolean zzg() {
            return (this.zzc & 8) != 0;
        }

        public final java.lang.String zzh() {
            return this.zzg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(java.lang.String str) {
            str.getClass();
            this.zzc |= 8;
            this.zzg = str;
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        protected final java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2) {
            com.google.android.gms.internal.measurement.zzbk zzbkVar = null;
            switch (com.google.android.gms.internal.measurement.zzbk.zza[i - 1]) {
                case 1:
                    return new com.google.android.gms.internal.measurement.zzbj.zzc();
                case 2:
                    return new com.google.android.gms.internal.measurement.zzbj.zzc.zza(zzbkVar);
                case 3:
                    return zza(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0007\u0002\u0004\b\u0003", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    com.google.android.gms.internal.measurement.zzgx<com.google.android.gms.internal.measurement.zzbj.zzc> zzaVar = zzi;
                    if (zzaVar == null) {
                        synchronized (com.google.android.gms.internal.measurement.zzbj.zzc.class) {
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

        public static com.google.android.gms.internal.measurement.zzbj.zzc zzi() {
            return zzh;
        }

        static {
            com.google.android.gms.internal.measurement.zzbj.zzc zzcVar = new com.google.android.gms.internal.measurement.zzbj.zzc();
            zzh = zzcVar;
            com.google.android.gms.internal.measurement.zzfd.zza((java.lang.Class<com.google.android.gms.internal.measurement.zzbj.zzc>) com.google.android.gms.internal.measurement.zzbj.zzc.class, zzcVar);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
    public static final class zze extends com.google.android.gms.internal.measurement.zzfd<com.google.android.gms.internal.measurement.zzbj.zze, com.google.android.gms.internal.measurement.zzbj.zze.zza> implements com.google.android.gms.internal.measurement.zzgq {
        private static final com.google.android.gms.internal.measurement.zzbj.zze zzj;
        private static volatile com.google.android.gms.internal.measurement.zzgx<com.google.android.gms.internal.measurement.zzbj.zze> zzk;
        private int zzc;
        private int zzd;
        private java.lang.String zze = "";
        private com.google.android.gms.internal.measurement.zzbj.zzc zzf;
        private boolean zzg;
        private boolean zzh;
        private boolean zzi;

        private zze() {
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
        public static final class zza extends com.google.android.gms.internal.measurement.zzfd.zzb<com.google.android.gms.internal.measurement.zzbj.zze, com.google.android.gms.internal.measurement.zzbj.zze.zza> implements com.google.android.gms.internal.measurement.zzgq {
            private zza() {
                super(com.google.android.gms.internal.measurement.zzbj.zze.zzj);
            }

            public final com.google.android.gms.internal.measurement.zzbj.zze.zza zza(java.lang.String str) {
                if (this.zzb) {
                    zzq();
                    this.zzb = false;
                }
                ((com.google.android.gms.internal.measurement.zzbj.zze) this.zza).zza(str);
                return this;
            }

            /* synthetic */ zza(com.google.android.gms.internal.measurement.zzbk zzbkVar) {
                this();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final int zzb() {
            return this.zzd;
        }

        public final java.lang.String zzc() {
            return this.zze;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(java.lang.String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        public final com.google.android.gms.internal.measurement.zzbj.zzc zzd() {
            com.google.android.gms.internal.measurement.zzbj.zzc zzcVar = this.zzf;
            return zzcVar == null ? com.google.android.gms.internal.measurement.zzbj.zzc.zzi() : zzcVar;
        }

        public final boolean zze() {
            return this.zzg;
        }

        public final boolean zzf() {
            return this.zzh;
        }

        public final boolean zzg() {
            return (this.zzc & 32) != 0;
        }

        public final boolean zzh() {
            return this.zzi;
        }

        public static com.google.android.gms.internal.measurement.zzbj.zze.zza zzi() {
            return zzj.zzbk();
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        protected final java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2) {
            com.google.android.gms.internal.measurement.zzbk zzbkVar = null;
            switch (com.google.android.gms.internal.measurement.zzbk.zza[i - 1]) {
                case 1:
                    return new com.google.android.gms.internal.measurement.zzbj.zze();
                case 2:
                    return new com.google.android.gms.internal.measurement.zzbj.zze.zza(zzbkVar);
                case 3:
                    return zza(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\t\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzj;
                case 5:
                    com.google.android.gms.internal.measurement.zzgx<com.google.android.gms.internal.measurement.zzbj.zze> zzaVar = zzk;
                    if (zzaVar == null) {
                        synchronized (com.google.android.gms.internal.measurement.zzbj.zze.class) {
                            zzaVar = zzk;
                            if (zzaVar == null) {
                                zzaVar = new com.google.android.gms.internal.measurement.zzfd.zza<>(zzj);
                                zzk = zzaVar;
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
            com.google.android.gms.internal.measurement.zzbj.zze zzeVar = new com.google.android.gms.internal.measurement.zzbj.zze();
            zzj = zzeVar;
            com.google.android.gms.internal.measurement.zzfd.zza((java.lang.Class<com.google.android.gms.internal.measurement.zzbj.zze>) com.google.android.gms.internal.measurement.zzbj.zze.class, zzeVar);
        }
    }
}
