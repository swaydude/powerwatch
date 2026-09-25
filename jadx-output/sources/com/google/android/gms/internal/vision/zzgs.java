package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzgs<MessageType extends com.google.android.gms.internal.vision.zzgs<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.vision.zzgs.zza<MessageType, BuilderType>> extends com.google.android.gms.internal.vision.zzet<MessageType, BuilderType> {
    private static java.util.Map<java.lang.Object, com.google.android.gms.internal.vision.zzgs<?, ?>> zzwf = new java.util.concurrent.ConcurrentHashMap();
    protected com.google.android.gms.internal.vision.zzjm zzwd = com.google.android.gms.internal.vision.zzjm.zzig();
    private int zzwe = -1;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    public static class zzc<T extends com.google.android.gms.internal.vision.zzgs<T, ?>> extends com.google.android.gms.internal.vision.zzey<T> {
        private final T zzwa;

        public zzc(T t) {
            this.zzwa = t;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    public static final enum zzf {
        public static final int zzwl = 1;
        public static final int zzwm = 2;
        public static final int zzwn = 3;
        public static final int zzwo = 4;
        public static final int zzwp = 5;
        public static final int zzwq = 6;
        public static final int zzwr = 7;
        public static final int zzwt = 1;
        public static final int zzwu = 2;
        public static final int zzww = 1;
        public static final int zzwx = 2;
        private static final /* synthetic */ int[] zzws = {1, 2, 3, 4, 5, 6, 7};
        private static final /* synthetic */ int[] zzwv = {1, 2};
        private static final /* synthetic */ int[] zzwy = {1, 2};

        public static int[] values$50KLMJ33DTMIUPRFDTJMOP9FE1P6UT3FC9QMCBQ7CLN6ASJ1EHIM8JB5EDPM2PR59HKN8P949LIN8Q3FCHA6UIBEEPNMMP9R0() {
            return (int[]) zzws.clone();
        }
    }

    protected abstract java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2);

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    public static abstract class zzb<MessageType extends com.google.android.gms.internal.vision.zzgs.zze<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.vision.zzgs.zzb<MessageType, BuilderType>> extends com.google.android.gms.internal.vision.zzgs.zza<MessageType, BuilderType> implements com.google.android.gms.internal.vision.zzie {
        protected zzb(MessageType messagetype) {
            super(messagetype);
        }

        @Override // com.google.android.gms.internal.vision.zzgs.zza
        protected void zzfy() {
            super.zzfy();
            ((com.google.android.gms.internal.vision.zzgs.zze) this.zzwb).zzwk = (com.google.android.gms.internal.vision.zzgi) ((com.google.android.gms.internal.vision.zzgs.zze) this.zzwb).zzwk.clone();
        }

        @Override // com.google.android.gms.internal.vision.zzgs.zza
        /* JADX INFO: renamed from: zzfz */
        public /* synthetic */ com.google.android.gms.internal.vision.zzgs zzgb() {
            return (com.google.android.gms.internal.vision.zzgs.zze) zzgb();
        }

        @Override // com.google.android.gms.internal.vision.zzgs.zza, com.google.android.gms.internal.vision.zzib
        public /* synthetic */ com.google.android.gms.internal.vision.zzic zzgb() {
            if (this.zzwc) {
                return (com.google.android.gms.internal.vision.zzgs.zze) this.zzwb;
            }
            ((com.google.android.gms.internal.vision.zzgs.zze) this.zzwb).zzwk.zzdp();
            return (com.google.android.gms.internal.vision.zzgs.zze) super.zzgb();
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    public static abstract class zze<MessageType extends com.google.android.gms.internal.vision.zzgs.zze<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.vision.zzgs.zzb<MessageType, BuilderType>> extends com.google.android.gms.internal.vision.zzgs<MessageType, BuilderType> implements com.google.android.gms.internal.vision.zzie {
        protected com.google.android.gms.internal.vision.zzgi<com.google.android.gms.internal.vision.zzgs.zzd> zzwk = com.google.android.gms.internal.vision.zzgi.zzfn();

        final com.google.android.gms.internal.vision.zzgi<com.google.android.gms.internal.vision.zzgs.zzd> zzgk() {
            if (this.zzwk.isImmutable()) {
                this.zzwk = (com.google.android.gms.internal.vision.zzgi) this.zzwk.clone();
            }
            return this.zzwk;
        }

        /* JADX WARN: Type inference failed for: r1v8, types: [Type, java.util.ArrayList, java.util.List] */
        public final <Type> Type zzc(com.google.android.gms.internal.vision.zzge<MessageType, Type> zzgeVar) {
            com.google.android.gms.internal.vision.zzgs.zzg zzgVarZza = com.google.android.gms.internal.vision.zzgs.zza(zzgeVar);
            if (zzgVarZza.zzwz != ((com.google.android.gms.internal.vision.zzgs) zzgd())) {
                throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
            Type type = (Type) this.zzwk.zza(zzgVarZza.zzxb);
            if (type == null) {
                return zzgVarZza.zzgc;
            }
            if (zzgVarZza.zzxb.zzwi) {
                if (zzgVarZza.zzxb.zzwh.zzip() != com.google.android.gms.internal.vision.zzkd.ENUM) {
                    return type;
                }
                ?? r1 = (Type) new java.util.ArrayList();
                java.util.Iterator it = ((java.util.List) type).iterator();
                while (it.hasNext()) {
                    r1.add(zzgVarZza.zzi(it.next()));
                }
                return r1;
            }
            return (Type) zzgVarZza.zzi(type);
        }
    }

    public java.lang.String toString() {
        return com.google.android.gms.internal.vision.zzid.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zzri != 0) {
            return this.zzri;
        }
        this.zzri = com.google.android.gms.internal.vision.zzin.zzho().zzu(this).hashCode(this);
        return this.zzri;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    static final class zzd implements com.google.android.gms.internal.vision.zzgk<com.google.android.gms.internal.vision.zzgs.zzd> {
        final com.google.android.gms.internal.vision.zzka zzwh;
        final com.google.android.gms.internal.vision.zzgv<?> zzwg = null;
        final int number = 202056002;
        final boolean zzwi = true;
        final boolean zzwj = false;

        zzd(com.google.android.gms.internal.vision.zzgv<?> zzgvVar, int i, com.google.android.gms.internal.vision.zzka zzkaVar, boolean z, boolean z2) {
            this.zzwh = zzkaVar;
        }

        @Override // com.google.android.gms.internal.vision.zzgk
        public final int zzag() {
            return this.number;
        }

        @Override // com.google.android.gms.internal.vision.zzgk
        public final com.google.android.gms.internal.vision.zzka zzfs() {
            return this.zzwh;
        }

        @Override // com.google.android.gms.internal.vision.zzgk
        public final com.google.android.gms.internal.vision.zzkd zzft() {
            return this.zzwh.zzip();
        }

        @Override // com.google.android.gms.internal.vision.zzgk
        public final boolean zzfu() {
            return this.zzwi;
        }

        @Override // com.google.android.gms.internal.vision.zzgk
        public final boolean zzfv() {
            return this.zzwj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.vision.zzgk
        public final com.google.android.gms.internal.vision.zzib zza(com.google.android.gms.internal.vision.zzib zzibVar, com.google.android.gms.internal.vision.zzic zzicVar) {
            return ((com.google.android.gms.internal.vision.zzgs.zza) zzibVar).zza((com.google.android.gms.internal.vision.zzgs) zzicVar);
        }

        @Override // com.google.android.gms.internal.vision.zzgk
        public final com.google.android.gms.internal.vision.zzih zza(com.google.android.gms.internal.vision.zzih zzihVar, com.google.android.gms.internal.vision.zzih zzihVar2) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(java.lang.Object obj) {
            return this.number - ((com.google.android.gms.internal.vision.zzgs.zzd) obj).number;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    public static abstract class zza<MessageType extends com.google.android.gms.internal.vision.zzgs<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.vision.zzgs.zza<MessageType, BuilderType>> extends com.google.android.gms.internal.vision.zzew<MessageType, BuilderType> {
        private final MessageType zzwa;
        protected MessageType zzwb;
        protected boolean zzwc = false;

        protected zza(MessageType messagetype) {
            this.zzwa = messagetype;
            this.zzwb = (MessageType) messagetype.zza(com.google.android.gms.internal.vision.zzgs.zzf.zzwo, null, null);
        }

        protected void zzfy() {
            MessageType messagetype = (MessageType) this.zzwb.zza(com.google.android.gms.internal.vision.zzgs.zzf.zzwo, null, null);
            zza(messagetype, this.zzwb);
            this.zzwb = messagetype;
        }

        @Override // com.google.android.gms.internal.vision.zzie
        public final boolean isInitialized() {
            return com.google.android.gms.internal.vision.zzgs.zza(this.zzwb, false);
        }

        @Override // com.google.android.gms.internal.vision.zzib
        /* JADX INFO: renamed from: zzfz, reason: merged with bridge method [inline-methods] */
        public MessageType zzgb() {
            if (this.zzwc) {
                return this.zzwb;
            }
            MessageType messagetype = this.zzwb;
            com.google.android.gms.internal.vision.zzin.zzho().zzu(messagetype).zzg(messagetype);
            this.zzwc = true;
            return this.zzwb;
        }

        @Override // com.google.android.gms.internal.vision.zzib
        /* JADX INFO: renamed from: zzga, reason: merged with bridge method [inline-methods] */
        public final MessageType zzgc() {
            MessageType messagetype = (MessageType) zzgb();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new com.google.android.gms.internal.vision.zzjk(messagetype);
        }

        @Override // com.google.android.gms.internal.vision.zzew
        public final BuilderType zza(MessageType messagetype) {
            if (this.zzwc) {
                zzfy();
                this.zzwc = false;
            }
            zza(this.zzwb, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            com.google.android.gms.internal.vision.zzin.zzho().zzu(messagetype).zzd(messagetype, messagetype2);
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, com.google.android.gms.internal.vision.zzgd zzgdVar) throws com.google.android.gms.internal.vision.zzhc {
            if (this.zzwc) {
                zzfy();
                this.zzwc = false;
            }
            try {
                com.google.android.gms.internal.vision.zzin.zzho().zzu(this.zzwb).zza(this.zzwb, bArr, 0, i2 + 0, new com.google.android.gms.internal.vision.zzfb(zzgdVar));
                return this;
            } catch (com.google.android.gms.internal.vision.zzhc e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (java.lang.IndexOutOfBoundsException unused) {
                throw com.google.android.gms.internal.vision.zzhc.zzgm();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.vision.zzew
        /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
        public final BuilderType zza(com.google.android.gms.internal.vision.zzft zzftVar, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException {
            if (this.zzwc) {
                zzfy();
                this.zzwc = false;
            }
            try {
                com.google.android.gms.internal.vision.zzin.zzho().zzu(this.zzwb).zza(this.zzwb, com.google.android.gms.internal.vision.zzfy.zza(zzftVar), zzgdVar);
                return this;
            } catch (java.lang.RuntimeException e) {
                if (e.getCause() instanceof java.io.IOException) {
                    throw ((java.io.IOException) e.getCause());
                }
                throw e;
            }
        }

        @Override // com.google.android.gms.internal.vision.zzew
        public final /* synthetic */ com.google.android.gms.internal.vision.zzew zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.vision.zzgd zzgdVar) throws com.google.android.gms.internal.vision.zzhc {
            return zzb(bArr, 0, i2, zzgdVar);
        }

        @Override // com.google.android.gms.internal.vision.zzew
        /* JADX INFO: renamed from: zzdn */
        public final /* synthetic */ com.google.android.gms.internal.vision.zzew clone() {
            return (com.google.android.gms.internal.vision.zzgs.zza) clone();
        }

        @Override // com.google.android.gms.internal.vision.zzie
        public final /* synthetic */ com.google.android.gms.internal.vision.zzic zzgd() {
            return this.zzwa;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.vision.zzew
        public /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            com.google.android.gms.internal.vision.zzgs.zza zzaVar = (com.google.android.gms.internal.vision.zzgs.zza) this.zzwa.zza(com.google.android.gms.internal.vision.zzgs.zzf.zzwp, null, null);
            zzaVar.zza((com.google.android.gms.internal.vision.zzgs) zzgb());
            return zzaVar;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    public static class zzg<ContainingType extends com.google.android.gms.internal.vision.zzic, Type> extends com.google.android.gms.internal.vision.zzge<ContainingType, Type> {
        final Type zzgc;
        final ContainingType zzwz;
        final com.google.android.gms.internal.vision.zzic zzxa;
        final com.google.android.gms.internal.vision.zzgs.zzd zzxb;

        zzg(ContainingType containingtype, Type type, com.google.android.gms.internal.vision.zzic zzicVar, com.google.android.gms.internal.vision.zzgs.zzd zzdVar, java.lang.Class cls) {
            if (containingtype == null) {
                throw new java.lang.IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (zzdVar.zzwh == com.google.android.gms.internal.vision.zzka.zzabw && zzicVar == null) {
                throw new java.lang.IllegalArgumentException("Null messageDefaultInstance");
            }
            this.zzwz = containingtype;
            this.zzgc = type;
            this.zzxa = zzicVar;
            this.zzxb = zzdVar;
        }

        final java.lang.Object zzi(java.lang.Object obj) {
            return this.zzxb.zzwh.zzip() == com.google.android.gms.internal.vision.zzkd.ENUM ? this.zzxb.zzwg.zzg(((java.lang.Integer) obj).intValue()) : obj;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (((com.google.android.gms.internal.vision.zzgs) zza(com.google.android.gms.internal.vision.zzgs.zzf.zzwq, (java.lang.Object) null, (java.lang.Object) null)).getClass().isInstance(obj)) {
            return com.google.android.gms.internal.vision.zzin.zzho().zzu(this).equals(this, (com.google.android.gms.internal.vision.zzgs) obj);
        }
        return false;
    }

    protected final <MessageType extends com.google.android.gms.internal.vision.zzgs<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.vision.zzgs.zza<MessageType, BuilderType>> BuilderType zzge() {
        return (BuilderType) zza(com.google.android.gms.internal.vision.zzgs.zzf.zzwp, (java.lang.Object) null, (java.lang.Object) null);
    }

    @Override // com.google.android.gms.internal.vision.zzie
    public final boolean isInitialized() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        return zza(this, true);
    }

    @Override // com.google.android.gms.internal.vision.zzet
    final int zzdl() {
        return this.zzwe;
    }

    @Override // com.google.android.gms.internal.vision.zzet
    final void zzad(int i) {
        this.zzwe = i;
    }

    @Override // com.google.android.gms.internal.vision.zzic
    public final void zzb(com.google.android.gms.internal.vision.zzga zzgaVar) throws java.io.IOException {
        com.google.android.gms.internal.vision.zzin.zzho().zzu(this).zza(this, com.google.android.gms.internal.vision.zzgc.zza(zzgaVar));
    }

    @Override // com.google.android.gms.internal.vision.zzic
    public final int zzgf() {
        if (this.zzwe == -1) {
            this.zzwe = com.google.android.gms.internal.vision.zzin.zzho().zzu(this).zzr(this);
        }
        return this.zzwe;
    }

    static <T extends com.google.android.gms.internal.vision.zzgs<?, ?>> T zzd(java.lang.Class<T> cls) {
        com.google.android.gms.internal.vision.zzgs<?, ?> zzgsVar = zzwf.get(cls);
        if (zzgsVar == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgsVar = zzwf.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgsVar == null) {
            zzgsVar = (T) ((com.google.android.gms.internal.vision.zzgs) com.google.android.gms.internal.vision.zzjp.zzh(cls)).zza(com.google.android.gms.internal.vision.zzgs.zzf.zzwq, (java.lang.Object) null, (java.lang.Object) null);
            if (zzgsVar == null) {
                throw new java.lang.IllegalStateException();
            }
            zzwf.put(cls, zzgsVar);
        }
        return (T) zzgsVar;
    }

    protected static <T extends com.google.android.gms.internal.vision.zzgs<?, ?>> void zza(java.lang.Class<T> cls, T t) {
        zzwf.put(cls, t);
    }

    protected static java.lang.Object zza(com.google.android.gms.internal.vision.zzic zzicVar, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.android.gms.internal.vision.zzip(zzicVar, str, objArr);
    }

    public static <ContainingType extends com.google.android.gms.internal.vision.zzic, Type> com.google.android.gms.internal.vision.zzgs.zzg<ContainingType, Type> zza(ContainingType containingtype, com.google.android.gms.internal.vision.zzic zzicVar, com.google.android.gms.internal.vision.zzgv<?> zzgvVar, int i, com.google.android.gms.internal.vision.zzka zzkaVar, boolean z, java.lang.Class cls) {
        return new com.google.android.gms.internal.vision.zzgs.zzg<>(containingtype, java.util.Collections.emptyList(), zzicVar, new com.google.android.gms.internal.vision.zzgs.zzd(null, 202056002, zzkaVar, true, false), cls);
    }

    static java.lang.Object zza(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends com.google.android.gms.internal.vision.zzgs.zze<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.vision.zzgs.zzb<MessageType, BuilderType>, T> com.google.android.gms.internal.vision.zzgs.zzg<MessageType, T> zza(com.google.android.gms.internal.vision.zzge<MessageType, T> zzgeVar) {
        return (com.google.android.gms.internal.vision.zzgs.zzg) zzgeVar;
    }

    protected static final <T extends com.google.android.gms.internal.vision.zzgs<T, ?>> boolean zza(T t, boolean z) {
        byte bByteValue = ((java.lang.Byte) t.zza(com.google.android.gms.internal.vision.zzgs.zzf.zzwl, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzt = com.google.android.gms.internal.vision.zzin.zzho().zzu(t).zzt(t);
        if (z) {
            t.zza(com.google.android.gms.internal.vision.zzgs.zzf.zzwm, zZzt ? t : null, null);
        }
        return zZzt;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.zzgu, com.google.android.gms.internal.vision.zzgx] */
    protected static com.google.android.gms.internal.vision.zzgx zzgg() {
        return com.google.android.gms.internal.vision.zzgu.zzgl();
    }

    protected static <E> com.google.android.gms.internal.vision.zzgz<E> zzgh() {
        return com.google.android.gms.internal.vision.zziq.zzhr();
    }

    protected static <E> com.google.android.gms.internal.vision.zzgz<E> zza(com.google.android.gms.internal.vision.zzgz<E> zzgzVar) {
        int size = zzgzVar.size();
        return zzgzVar.zzag(size == 0 ? 10 : size << 1);
    }

    private static <T extends com.google.android.gms.internal.vision.zzgs<T, ?>> T zza(T t, byte[] bArr, int i, int i2, com.google.android.gms.internal.vision.zzgd zzgdVar) throws com.google.android.gms.internal.vision.zzhc {
        T t2 = (T) t.zza(com.google.android.gms.internal.vision.zzgs.zzf.zzwo, null, null);
        try {
            com.google.android.gms.internal.vision.zzir zzirVarZzu = com.google.android.gms.internal.vision.zzin.zzho().zzu(t2);
            zzirVarZzu.zza(t2, bArr, 0, i2, new com.google.android.gms.internal.vision.zzfb(zzgdVar));
            zzirVarZzu.zzg(t2);
            if (t2.zzri == 0) {
                return t2;
            }
            throw new java.lang.RuntimeException();
        } catch (java.io.IOException e) {
            if (e.getCause() instanceof com.google.android.gms.internal.vision.zzhc) {
                throw ((com.google.android.gms.internal.vision.zzhc) e.getCause());
            }
            throw new com.google.android.gms.internal.vision.zzhc(e.getMessage()).zzg(t2);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw com.google.android.gms.internal.vision.zzhc.zzgm().zzg(t2);
        }
    }

    private static <T extends com.google.android.gms.internal.vision.zzgs<T, ?>> T zzb(T t) throws com.google.android.gms.internal.vision.zzhc {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw new com.google.android.gms.internal.vision.zzhc(new com.google.android.gms.internal.vision.zzjk(t).getMessage()).zzg(t);
    }

    protected static <T extends com.google.android.gms.internal.vision.zzgs<T, ?>> T zza(T t, byte[] bArr) throws com.google.android.gms.internal.vision.zzhc {
        return (T) zzb(zza(t, bArr, 0, bArr.length, com.google.android.gms.internal.vision.zzgd.zzfl()));
    }

    protected static <T extends com.google.android.gms.internal.vision.zzgs<T, ?>> T zza(T t, byte[] bArr, com.google.android.gms.internal.vision.zzgd zzgdVar) throws com.google.android.gms.internal.vision.zzhc {
        return (T) zzb(zza(t, bArr, 0, bArr.length, zzgdVar));
    }

    @Override // com.google.android.gms.internal.vision.zzic
    public final /* synthetic */ com.google.android.gms.internal.vision.zzib zzgi() {
        com.google.android.gms.internal.vision.zzgs.zza zzaVar = (com.google.android.gms.internal.vision.zzgs.zza) zza(com.google.android.gms.internal.vision.zzgs.zzf.zzwp, (java.lang.Object) null, (java.lang.Object) null);
        zzaVar.zza(this);
        return zzaVar;
    }

    @Override // com.google.android.gms.internal.vision.zzic
    public final /* synthetic */ com.google.android.gms.internal.vision.zzib zzgj() {
        return (com.google.android.gms.internal.vision.zzgs.zza) zza(com.google.android.gms.internal.vision.zzgs.zzf.zzwp, (java.lang.Object) null, (java.lang.Object) null);
    }

    @Override // com.google.android.gms.internal.vision.zzie
    public final /* synthetic */ com.google.android.gms.internal.vision.zzic zzgd() {
        return (com.google.android.gms.internal.vision.zzgs) zza(com.google.android.gms.internal.vision.zzgs.zzf.zzwq, (java.lang.Object) null, (java.lang.Object) null);
    }
}
