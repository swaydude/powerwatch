package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzgw {

    public static final class zza extends com.google.android.gms.internal.clearcut.zzcg<com.google.android.gms.internal.clearcut.zzgw.zza, com.google.android.gms.internal.clearcut.zzgw.zza.C0023zza> implements com.google.android.gms.internal.clearcut.zzdq {
        private static volatile com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgw.zza> zzbg;
        private static final com.google.android.gms.internal.clearcut.zzgw.zza zzbir;
        private com.google.android.gms.internal.clearcut.zzcn<com.google.android.gms.internal.clearcut.zzgw.zza.zzb> zzbiq = zzbb();

        /* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.zzgw$zza$zza, reason: collision with other inner class name */
        public static final class C0023zza extends com.google.android.gms.internal.clearcut.zzcg.zza<com.google.android.gms.internal.clearcut.zzgw.zza, com.google.android.gms.internal.clearcut.zzgw.zza.C0023zza> implements com.google.android.gms.internal.clearcut.zzdq {
            private C0023zza() {
                super(com.google.android.gms.internal.clearcut.zzgw.zza.zzbir);
            }

            /* synthetic */ C0023zza(com.google.android.gms.internal.clearcut.zzgx zzgxVar) {
                this();
            }
        }

        public static final class zzb extends com.google.android.gms.internal.clearcut.zzcg<com.google.android.gms.internal.clearcut.zzgw.zza.zzb, com.google.android.gms.internal.clearcut.zzgw.zza.zzb.C0024zza> implements com.google.android.gms.internal.clearcut.zzdq {
            private static volatile com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgw.zza.zzb> zzbg;
            private static final com.google.android.gms.internal.clearcut.zzgw.zza.zzb zzbiv;
            private int zzbb;
            private java.lang.String zzbis = "";
            private long zzbit;
            private long zzbiu;
            private int zzya;

            /* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.zzgw$zza$zzb$zza, reason: collision with other inner class name */
            public static final class C0024zza extends com.google.android.gms.internal.clearcut.zzcg.zza<com.google.android.gms.internal.clearcut.zzgw.zza.zzb, com.google.android.gms.internal.clearcut.zzgw.zza.zzb.C0024zza> implements com.google.android.gms.internal.clearcut.zzdq {
                private C0024zza() {
                    super(com.google.android.gms.internal.clearcut.zzgw.zza.zzb.zzbiv);
                }

                /* synthetic */ C0024zza(com.google.android.gms.internal.clearcut.zzgx zzgxVar) {
                    this();
                }

                public final com.google.android.gms.internal.clearcut.zzgw.zza.zzb.C0024zza zzn(java.lang.String str) {
                    zzbf();
                    ((com.google.android.gms.internal.clearcut.zzgw.zza.zzb) this.zzjt).zzm(str);
                    return this;
                }

                public final com.google.android.gms.internal.clearcut.zzgw.zza.zzb.C0024zza zzr(long j) {
                    zzbf();
                    ((com.google.android.gms.internal.clearcut.zzgw.zza.zzb) this.zzjt).zzp(j);
                    return this;
                }

                public final com.google.android.gms.internal.clearcut.zzgw.zza.zzb.C0024zza zzs(long j) {
                    zzbf();
                    ((com.google.android.gms.internal.clearcut.zzgw.zza.zzb) this.zzjt).zzq(j);
                    return this;
                }
            }

            static {
                com.google.android.gms.internal.clearcut.zzgw.zza.zzb zzbVar = new com.google.android.gms.internal.clearcut.zzgw.zza.zzb();
                zzbiv = zzbVar;
                com.google.android.gms.internal.clearcut.zzcg.zza((java.lang.Class<com.google.android.gms.internal.clearcut.zzgw.zza.zzb>) com.google.android.gms.internal.clearcut.zzgw.zza.zzb.class, zzbVar);
            }

            private zzb() {
            }

            public static com.google.android.gms.internal.clearcut.zzgw.zza.zzb.C0024zza zzfz() {
                return (com.google.android.gms.internal.clearcut.zzgw.zza.zzb.C0024zza) ((com.google.android.gms.internal.clearcut.zzcg.zza) zzbiv.zza(com.google.android.gms.internal.clearcut.zzcg.zzg.zzkh, (java.lang.Object) null, (java.lang.Object) null));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzm(java.lang.String str) {
                java.util.Objects.requireNonNull(str);
                this.zzbb |= 2;
                this.zzbis = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzp(long j) {
                this.zzbb |= 4;
                this.zzbit = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzq(long j) {
                this.zzbb |= 8;
                this.zzbiu = j;
            }

            public final int getEventCode() {
                return this.zzya;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v13 */
            /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.zzcg$zzb, com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgw$zza$zzb>] */
            /* JADX WARN: Type inference failed for: r2v17 */
            /* JADX WARN: Type inference failed for: r2v18 */
            @Override // com.google.android.gms.internal.clearcut.zzcg
            protected final java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2) {
                ?? r2;
                com.google.android.gms.internal.clearcut.zzgx zzgxVar = null;
                switch (com.google.android.gms.internal.clearcut.zzgx.zzba[i - 1]) {
                    case 1:
                        return new com.google.android.gms.internal.clearcut.zzgw.zza.zzb();
                    case 2:
                        return new com.google.android.gms.internal.clearcut.zzgw.zza.zzb.C0024zza(zzgxVar);
                    case 3:
                        return zza(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new java.lang.Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
                    case 4:
                        return zzbiv;
                    case 5:
                        com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgw.zza.zzb> zzdzVar = zzbg;
                        java.lang.Object obj3 = zzdzVar;
                        if (zzdzVar == null) {
                            synchronized (com.google.android.gms.internal.clearcut.zzgw.zza.zzb.class) {
                                com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgw.zza.zzb> zzdzVar2 = zzbg;
                                r2 = zzdzVar2;
                                if (zzdzVar2 == null) {
                                    ?? zzbVar = new com.google.android.gms.internal.clearcut.zzcg.zzb(zzbiv);
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

            public final boolean zzfv() {
                return (this.zzbb & 1) == 1;
            }

            public final java.lang.String zzfw() {
                return this.zzbis;
            }

            public final long zzfx() {
                return this.zzbit;
            }

            public final long zzfy() {
                return this.zzbiu;
            }
        }

        static {
            com.google.android.gms.internal.clearcut.zzgw.zza zzaVar = new com.google.android.gms.internal.clearcut.zzgw.zza();
            zzbir = zzaVar;
            com.google.android.gms.internal.clearcut.zzcg.zza((java.lang.Class<com.google.android.gms.internal.clearcut.zzgw.zza>) com.google.android.gms.internal.clearcut.zzgw.zza.class, zzaVar);
        }

        private zza() {
        }

        public static com.google.android.gms.internal.clearcut.zzgw.zza zzft() {
            return zzbir;
        }

        public static com.google.android.gms.internal.clearcut.zzgw.zza zzi(byte[] bArr) throws com.google.android.gms.internal.clearcut.zzco {
            return (com.google.android.gms.internal.clearcut.zzgw.zza) com.google.android.gms.internal.clearcut.zzcg.zzb(zzbir, bArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.zzcg$zzb, com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgw$zza>] */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v18 */
        @Override // com.google.android.gms.internal.clearcut.zzcg
        protected final java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2) {
            ?? r2;
            com.google.android.gms.internal.clearcut.zzgx zzgxVar = null;
            switch (com.google.android.gms.internal.clearcut.zzgx.zzba[i - 1]) {
                case 1:
                    return new com.google.android.gms.internal.clearcut.zzgw.zza();
                case 2:
                    return new com.google.android.gms.internal.clearcut.zzgw.zza.C0023zza(zzgxVar);
                case 3:
                    return zza(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"zzbiq", com.google.android.gms.internal.clearcut.zzgw.zza.zzb.class});
                case 4:
                    return zzbir;
                case 5:
                    com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgw.zza> zzdzVar = zzbg;
                    java.lang.Object obj3 = zzdzVar;
                    if (zzdzVar == null) {
                        synchronized (com.google.android.gms.internal.clearcut.zzgw.zza.class) {
                            com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgw.zza> zzdzVar2 = zzbg;
                            r2 = zzdzVar2;
                            if (zzdzVar2 == null) {
                                ?? zzbVar = new com.google.android.gms.internal.clearcut.zzcg.zzb(zzbir);
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

        public final java.util.List<com.google.android.gms.internal.clearcut.zzgw.zza.zzb> zzfs() {
            return this.zzbiq;
        }
    }
}
