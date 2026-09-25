package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcg<MessageType extends com.google.android.gms.internal.clearcut.zzcg<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.clearcut.zzcg.zza<MessageType, BuilderType>> extends com.google.android.gms.internal.clearcut.zzas<MessageType, BuilderType> {
    private static java.util.Map<java.lang.Object, com.google.android.gms.internal.clearcut.zzcg<?, ?>> zzjr = new java.util.concurrent.ConcurrentHashMap();
    protected com.google.android.gms.internal.clearcut.zzey zzjp = com.google.android.gms.internal.clearcut.zzey.zzea();
    private int zzjq = -1;

    public static abstract class zza<MessageType extends com.google.android.gms.internal.clearcut.zzcg<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.clearcut.zzcg.zza<MessageType, BuilderType>> extends com.google.android.gms.internal.clearcut.zzat<MessageType, BuilderType> {
        private final MessageType zzjs;
        protected MessageType zzjt;
        protected boolean zzju = false;

        protected zza(MessageType messagetype) {
            this.zzjs = messagetype;
            this.zzjt = (MessageType) messagetype.zza(com.google.android.gms.internal.clearcut.zzcg.zzg.zzkg, null, null);
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            com.google.android.gms.internal.clearcut.zzea.zzcm().zzp(messagetype).zzc(messagetype, messagetype2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.clearcut.zzat
        public /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            com.google.android.gms.internal.clearcut.zzcg.zza zzaVar = (com.google.android.gms.internal.clearcut.zzcg.zza) this.zzjs.zza(com.google.android.gms.internal.clearcut.zzcg.zzg.zzkh, null, null);
            zzaVar.zza((com.google.android.gms.internal.clearcut.zzcg) zzbi());
            return zzaVar;
        }

        @Override // com.google.android.gms.internal.clearcut.zzdq
        public final boolean isInitialized() {
            return com.google.android.gms.internal.clearcut.zzcg.zza(this.zzjt, false);
        }

        @Override // com.google.android.gms.internal.clearcut.zzat
        public final BuilderType zza(MessageType messagetype) {
            zzbf();
            zza(this.zzjt, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.clearcut.zzdq
        public final /* synthetic */ com.google.android.gms.internal.clearcut.zzdo zzbe() {
            return this.zzjs;
        }

        protected void zzbf() {
            if (this.zzju) {
                MessageType messagetype = (MessageType) this.zzjt.zza(com.google.android.gms.internal.clearcut.zzcg.zzg.zzkg, null, null);
                zza(messagetype, this.zzjt);
                this.zzjt = messagetype;
                this.zzju = false;
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzdp
        /* JADX INFO: renamed from: zzbg, reason: merged with bridge method [inline-methods] */
        public MessageType zzbi() {
            if (this.zzju) {
                return this.zzjt;
            }
            MessageType messagetype = this.zzjt;
            com.google.android.gms.internal.clearcut.zzea.zzcm().zzp(messagetype).zzc(messagetype);
            this.zzju = true;
            return this.zzjt;
        }

        public final MessageType zzbh() {
            MessageType messagetype = (MessageType) zzbi();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            byte bByteValue = ((java.lang.Byte) messagetype.zza(com.google.android.gms.internal.clearcut.zzcg.zzg.zzkd, null, null)).byteValue();
            boolean zZzo = true;
            if (bByteValue != 1) {
                if (bByteValue == 0) {
                    zZzo = false;
                } else {
                    zZzo = com.google.android.gms.internal.clearcut.zzea.zzcm().zzp(messagetype).zzo(messagetype);
                    messagetype.zza(com.google.android.gms.internal.clearcut.zzcg.zzg.zzke, zZzo ? messagetype : null, null);
                }
            }
            if (zZzo) {
                return messagetype;
            }
            throw new com.google.android.gms.internal.clearcut.zzew(messagetype);
        }

        @Override // com.google.android.gms.internal.clearcut.zzdp
        public final /* synthetic */ com.google.android.gms.internal.clearcut.zzdo zzbj() {
            com.google.android.gms.internal.clearcut.zzcg zzcgVar = (com.google.android.gms.internal.clearcut.zzcg) zzbi();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            byte bByteValue = ((java.lang.Byte) zzcgVar.zza(com.google.android.gms.internal.clearcut.zzcg.zzg.zzkd, (java.lang.Object) null, (java.lang.Object) null)).byteValue();
            boolean zZzo = true;
            if (bByteValue != 1) {
                if (bByteValue == 0) {
                    zZzo = false;
                } else {
                    zZzo = com.google.android.gms.internal.clearcut.zzea.zzcm().zzp(zzcgVar).zzo(zzcgVar);
                    zzcgVar.zza(com.google.android.gms.internal.clearcut.zzcg.zzg.zzke, zZzo ? zzcgVar : null, (java.lang.Object) null);
                }
            }
            if (zZzo) {
                return zzcgVar;
            }
            throw new com.google.android.gms.internal.clearcut.zzew(zzcgVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzat
        /* JADX INFO: renamed from: zzt */
        public final /* synthetic */ com.google.android.gms.internal.clearcut.zzat clone() {
            return (com.google.android.gms.internal.clearcut.zzcg.zza) clone();
        }
    }

    public static class zzb<T extends com.google.android.gms.internal.clearcut.zzcg<T, ?>> extends com.google.android.gms.internal.clearcut.zzau<T> {
        private T zzjs;

        public zzb(T t) {
            this.zzjs = t;
        }
    }

    public static abstract class zzc<MessageType extends com.google.android.gms.internal.clearcut.zzcg.zzd<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.clearcut.zzcg.zzc<MessageType, BuilderType>> extends com.google.android.gms.internal.clearcut.zzcg.zza<MessageType, BuilderType> implements com.google.android.gms.internal.clearcut.zzdq {
        protected zzc(MessageType messagetype) {
            super(messagetype);
        }

        @Override // com.google.android.gms.internal.clearcut.zzcg.zza
        protected final void zzbf() {
            if (this.zzju) {
                super.zzbf();
                ((com.google.android.gms.internal.clearcut.zzcg.zzd) this.zzjt).zzjv = (com.google.android.gms.internal.clearcut.zzby) ((com.google.android.gms.internal.clearcut.zzcg.zzd) this.zzjt).zzjv.clone();
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzcg.zza
        /* JADX INFO: renamed from: zzbg */
        public final /* synthetic */ com.google.android.gms.internal.clearcut.zzcg zzbi() {
            return (com.google.android.gms.internal.clearcut.zzcg.zzd) zzbi();
        }

        @Override // com.google.android.gms.internal.clearcut.zzcg.zza, com.google.android.gms.internal.clearcut.zzdp
        public final /* synthetic */ com.google.android.gms.internal.clearcut.zzdo zzbi() {
            MessageType messagetype;
            if (this.zzju) {
                messagetype = this.zzjt;
            } else {
                ((com.google.android.gms.internal.clearcut.zzcg.zzd) this.zzjt).zzjv.zzv();
                messagetype = (MessageType) super.zzbi();
            }
            return messagetype;
        }
    }

    public static abstract class zzd<MessageType extends com.google.android.gms.internal.clearcut.zzcg.zzd<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.clearcut.zzcg.zzc<MessageType, BuilderType>> extends com.google.android.gms.internal.clearcut.zzcg<MessageType, BuilderType> implements com.google.android.gms.internal.clearcut.zzdq {
        protected com.google.android.gms.internal.clearcut.zzby<com.google.android.gms.internal.clearcut.zzcg.zze> zzjv = com.google.android.gms.internal.clearcut.zzby.zzar();
    }

    static final class zze implements com.google.android.gms.internal.clearcut.zzca<com.google.android.gms.internal.clearcut.zzcg.zze> {
        final com.google.android.gms.internal.clearcut.zzfl zzjx;
        private final com.google.android.gms.internal.clearcut.zzck<?> zzjw = null;
        final int number = 66321687;
        final boolean zzjy = false;
        final boolean zzjz = false;

        zze(com.google.android.gms.internal.clearcut.zzck<?> zzckVar, int i, com.google.android.gms.internal.clearcut.zzfl zzflVar, boolean z, boolean z2) {
            this.zzjx = zzflVar;
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(java.lang.Object obj) {
            return this.number - ((com.google.android.gms.internal.clearcut.zzcg.zze) obj).number;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.clearcut.zzca
        public final com.google.android.gms.internal.clearcut.zzdp zza(com.google.android.gms.internal.clearcut.zzdp zzdpVar, com.google.android.gms.internal.clearcut.zzdo zzdoVar) {
            return ((com.google.android.gms.internal.clearcut.zzcg.zza) zzdpVar).zza((com.google.android.gms.internal.clearcut.zzcg) zzdoVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzca
        public final com.google.android.gms.internal.clearcut.zzdv zza(com.google.android.gms.internal.clearcut.zzdv zzdvVar, com.google.android.gms.internal.clearcut.zzdv zzdvVar2) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.android.gms.internal.clearcut.zzca
        public final com.google.android.gms.internal.clearcut.zzfl zzau() {
            return this.zzjx;
        }

        @Override // com.google.android.gms.internal.clearcut.zzca
        public final com.google.android.gms.internal.clearcut.zzfq zzav() {
            return this.zzjx.zzek();
        }

        @Override // com.google.android.gms.internal.clearcut.zzca
        public final boolean zzaw() {
            return false;
        }

        @Override // com.google.android.gms.internal.clearcut.zzca
        public final boolean zzax() {
            return false;
        }

        @Override // com.google.android.gms.internal.clearcut.zzca
        public final int zzc() {
            return this.number;
        }
    }

    public static class zzf<ContainingType extends com.google.android.gms.internal.clearcut.zzdo, Type> extends com.google.android.gms.internal.clearcut.zzbr<ContainingType, Type> {
        private final Type zzdu;
        private final ContainingType zzka;
        private final com.google.android.gms.internal.clearcut.zzdo zzkb;
        private final com.google.android.gms.internal.clearcut.zzcg.zze zzkc;

        zzf(ContainingType containingtype, Type type, com.google.android.gms.internal.clearcut.zzdo zzdoVar, com.google.android.gms.internal.clearcut.zzcg.zze zzeVar, java.lang.Class cls) {
            if (containingtype == null) {
                throw new java.lang.IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (zzeVar.zzjx == com.google.android.gms.internal.clearcut.zzfl.zzqm && zzdoVar == null) {
                throw new java.lang.IllegalArgumentException("Null messageDefaultInstance");
            }
            this.zzka = containingtype;
            this.zzdu = type;
            this.zzkb = zzdoVar;
            this.zzkc = zzeVar;
        }
    }

    public static final enum zzg {
        public static final int zzkd = 1;
        public static final int zzke = 2;
        public static final int zzkf = 3;
        public static final int zzkg = 4;
        public static final int zzkh = 5;
        public static final int zzki = 6;
        public static final int zzkj = 7;
        public static final int zzkl = 1;
        public static final int zzkm = 2;
        public static final int zzko = 1;
        public static final int zzkp = 2;
        private static final /* synthetic */ int[] zzkk = {1, 2, 3, 4, 5, 6, 7};
        private static final /* synthetic */ int[] zzkn = {1, 2};
        private static final /* synthetic */ int[] zzkq = {1, 2};

        public static int[] values$50KLMJ33DTMIUPRFDTJMOP9FE1P6UT3FC9QMCBQ7CLN6ASJ1EHIM8JB5EDPM2PR59HKN8P949LIN8Q3FCHA6UIBEEPNMMP9R0() {
            return (int[]) zzkk.clone();
        }
    }

    public static <ContainingType extends com.google.android.gms.internal.clearcut.zzdo, Type> com.google.android.gms.internal.clearcut.zzcg.zzf<ContainingType, Type> zza(ContainingType containingtype, Type type, com.google.android.gms.internal.clearcut.zzdo zzdoVar, com.google.android.gms.internal.clearcut.zzck<?> zzckVar, int i, com.google.android.gms.internal.clearcut.zzfl zzflVar, java.lang.Class cls) {
        return new com.google.android.gms.internal.clearcut.zzcg.zzf<>(containingtype, type, zzdoVar, new com.google.android.gms.internal.clearcut.zzcg.zze(null, 66321687, zzflVar, false, false), cls);
    }

    private static <T extends com.google.android.gms.internal.clearcut.zzcg<T, ?>> T zza(T t, byte[] bArr) throws com.google.android.gms.internal.clearcut.zzco {
        T t2 = (T) t.zza(com.google.android.gms.internal.clearcut.zzcg.zzg.zzkg, null, null);
        try {
            com.google.android.gms.internal.clearcut.zzea.zzcm().zzp(t2).zza(t2, bArr, 0, bArr.length, new com.google.android.gms.internal.clearcut.zzay());
            com.google.android.gms.internal.clearcut.zzea.zzcm().zzp(t2).zzc(t2);
            if (t2.zzex == 0) {
                return t2;
            }
            throw new java.lang.RuntimeException();
        } catch (java.io.IOException e) {
            if (e.getCause() instanceof com.google.android.gms.internal.clearcut.zzco) {
                throw ((com.google.android.gms.internal.clearcut.zzco) e.getCause());
            }
            throw new com.google.android.gms.internal.clearcut.zzco(e.getMessage()).zzg(t2);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw com.google.android.gms.internal.clearcut.zzco.zzbl().zzg(t2);
        }
    }

    protected static java.lang.Object zza(com.google.android.gms.internal.clearcut.zzdo zzdoVar, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.android.gms.internal.clearcut.zzec(zzdoVar, str, objArr);
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

    protected static <T extends com.google.android.gms.internal.clearcut.zzcg<?, ?>> void zza(java.lang.Class<T> cls, T t) {
        zzjr.put(cls, t);
    }

    protected static final <T extends com.google.android.gms.internal.clearcut.zzcg<T, ?>> boolean zza(T t, boolean z) {
        byte bByteValue = ((java.lang.Byte) t.zza(com.google.android.gms.internal.clearcut.zzcg.zzg.zzkd, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        return com.google.android.gms.internal.clearcut.zzea.zzcm().zzp(t).zzo(t);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.clearcut.zzch, com.google.android.gms.internal.clearcut.zzcl] */
    protected static com.google.android.gms.internal.clearcut.zzcl zzaz() {
        return com.google.android.gms.internal.clearcut.zzch.zzbk();
    }

    protected static <T extends com.google.android.gms.internal.clearcut.zzcg<T, ?>> T zzb(T t, byte[] bArr) throws com.google.android.gms.internal.clearcut.zzco {
        com.google.android.gms.internal.clearcut.zzge.zzg zzgVar = (T) zza(t, bArr);
        if (zzgVar != null) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            byte bByteValue = ((java.lang.Byte) zzgVar.zza(com.google.android.gms.internal.clearcut.zzcg.zzg.zzkd, (java.lang.Object) null, (java.lang.Object) null)).byteValue();
            boolean zZzo = true;
            if (bByteValue != 1) {
                if (bByteValue == 0) {
                    zZzo = false;
                } else {
                    zZzo = com.google.android.gms.internal.clearcut.zzea.zzcm().zzp(zzgVar).zzo(zzgVar);
                    zzgVar.zza(com.google.android.gms.internal.clearcut.zzcg.zzg.zzke, zZzo ? zzgVar : null, (java.lang.Object) null);
                }
            }
            if (!zZzo) {
                throw new com.google.android.gms.internal.clearcut.zzco(new com.google.android.gms.internal.clearcut.zzew(zzgVar).getMessage()).zzg(zzgVar);
            }
        }
        return zzgVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.clearcut.zzcm, com.google.android.gms.internal.clearcut.zzdc] */
    protected static com.google.android.gms.internal.clearcut.zzcm zzba() {
        return com.google.android.gms.internal.clearcut.zzdc.zzbx();
    }

    protected static <E> com.google.android.gms.internal.clearcut.zzcn<E> zzbb() {
        return com.google.android.gms.internal.clearcut.zzeb.zzcn();
    }

    static <T extends com.google.android.gms.internal.clearcut.zzcg<?, ?>> T zzc(java.lang.Class<T> cls) {
        T t = (T) zzjr.get(cls);
        if (t == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzjr.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(cls.getName());
        throw new java.lang.IllegalStateException(strValueOf.length() != 0 ? "Unable to get default instance for: ".concat(strValueOf) : new java.lang.String("Unable to get default instance for: "));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (((com.google.android.gms.internal.clearcut.zzcg) zza(com.google.android.gms.internal.clearcut.zzcg.zzg.zzki, (java.lang.Object) null, (java.lang.Object) null)).getClass().isInstance(obj)) {
            return com.google.android.gms.internal.clearcut.zzea.zzcm().zzp(this).equals(this, (com.google.android.gms.internal.clearcut.zzcg) obj);
        }
        return false;
    }

    public int hashCode() {
        if (this.zzex != 0) {
            return this.zzex;
        }
        this.zzex = com.google.android.gms.internal.clearcut.zzea.zzcm().zzp(this).hashCode(this);
        return this.zzex;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdq
    public final boolean isInitialized() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        byte bByteValue = ((java.lang.Byte) zza(com.google.android.gms.internal.clearcut.zzcg.zzg.zzkd, (java.lang.Object) null, (java.lang.Object) null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzo = com.google.android.gms.internal.clearcut.zzea.zzcm().zzp(this).zzo(this);
        zza(com.google.android.gms.internal.clearcut.zzcg.zzg.zzke, zZzo ? this : null, (java.lang.Object) null);
        return zZzo;
    }

    public java.lang.String toString() {
        return com.google.android.gms.internal.clearcut.zzdr.zza(this, super.toString());
    }

    protected abstract java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2);

    @Override // com.google.android.gms.internal.clearcut.zzdo
    public final int zzas() {
        if (this.zzjq == -1) {
            this.zzjq = com.google.android.gms.internal.clearcut.zzea.zzcm().zzp(this).zzm(this);
        }
        return this.zzjq;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdo
    public final void zzb(com.google.android.gms.internal.clearcut.zzbn zzbnVar) throws java.io.IOException {
        com.google.android.gms.internal.clearcut.zzea.zzcm().zze(getClass()).zza(this, com.google.android.gms.internal.clearcut.zzbp.zza(zzbnVar));
    }

    @Override // com.google.android.gms.internal.clearcut.zzdo
    public final /* synthetic */ com.google.android.gms.internal.clearcut.zzdp zzbc() {
        com.google.android.gms.internal.clearcut.zzcg.zza zzaVar = (com.google.android.gms.internal.clearcut.zzcg.zza) zza(com.google.android.gms.internal.clearcut.zzcg.zzg.zzkh, (java.lang.Object) null, (java.lang.Object) null);
        zzaVar.zza(this);
        return zzaVar;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdo
    public final /* synthetic */ com.google.android.gms.internal.clearcut.zzdp zzbd() {
        return (com.google.android.gms.internal.clearcut.zzcg.zza) zza(com.google.android.gms.internal.clearcut.zzcg.zzg.zzkh, (java.lang.Object) null, (java.lang.Object) null);
    }

    @Override // com.google.android.gms.internal.clearcut.zzdq
    public final /* synthetic */ com.google.android.gms.internal.clearcut.zzdo zzbe() {
        return (com.google.android.gms.internal.clearcut.zzcg) zza(com.google.android.gms.internal.clearcut.zzcg.zzg.zzki, (java.lang.Object) null, (java.lang.Object) null);
    }

    @Override // com.google.android.gms.internal.clearcut.zzas
    final void zzf(int i) {
        this.zzjq = i;
    }

    @Override // com.google.android.gms.internal.clearcut.zzas
    final int zzs() {
        return this.zzjq;
    }
}
