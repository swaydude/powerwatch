package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfd<MessageType extends com.google.android.gms.internal.measurement.zzfd<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.measurement.zzfd.zzb<MessageType, BuilderType>> extends com.google.android.gms.internal.measurement.zzdl<MessageType, BuilderType> {
    private static java.util.Map<java.lang.Object, com.google.android.gms.internal.measurement.zzfd<?, ?>> zzd = new java.util.concurrent.ConcurrentHashMap();
    protected com.google.android.gms.internal.measurement.zzhy zzb = com.google.android.gms.internal.measurement.zzhy.zza();
    private int zzc = -1;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
    public static class zza<T extends com.google.android.gms.internal.measurement.zzfd<T, ?>> extends com.google.android.gms.internal.measurement.zzdp<T> {
        private final T zza;

        public zza(T t) {
            this.zza = t;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
    static final class zzc implements com.google.android.gms.internal.measurement.zzey<com.google.android.gms.internal.measurement.zzfd.zzc> {
        @Override // com.google.android.gms.internal.measurement.zzey
        public final int zza() {
            throw new java.lang.NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzey
        public final com.google.android.gms.internal.measurement.zzim zzb() {
            throw new java.lang.NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzey
        public final com.google.android.gms.internal.measurement.zzip zzc() {
            throw new java.lang.NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzey
        public final boolean zzd() {
            throw new java.lang.NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzey
        public final boolean zze() {
            throw new java.lang.NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzey
        public final com.google.android.gms.internal.measurement.zzgn zza(com.google.android.gms.internal.measurement.zzgn zzgnVar, com.google.android.gms.internal.measurement.zzgo zzgoVar) {
            throw new java.lang.NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzey
        public final com.google.android.gms.internal.measurement.zzgt zza(com.google.android.gms.internal.measurement.zzgt zzgtVar, com.google.android.gms.internal.measurement.zzgt zzgtVar2) {
            throw new java.lang.NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(java.lang.Object obj) {
            throw new java.lang.NoSuchMethodError();
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
    public static final enum zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 1;
        public static final int zzi = 2;
        public static final int zzj = 1;
        public static final int zzk = 2;
        private static final /* synthetic */ int[] zzl = {1, 2, 3, 4, 5, 6, 7};
        private static final /* synthetic */ int[] zzm = {1, 2};
        private static final /* synthetic */ int[] zzn = {1, 2};

        public static int[] zza() {
            return (int[]) zzl.clone();
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
    public static class zzf<ContainingType extends com.google.android.gms.internal.measurement.zzgo, Type> extends com.google.android.gms.internal.measurement.zzer<ContainingType, Type> {
    }

    protected abstract java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2);

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
    public static abstract class zzd<MessageType extends com.google.android.gms.internal.measurement.zzfd.zzd<MessageType, BuilderType>, BuilderType> extends com.google.android.gms.internal.measurement.zzfd<MessageType, BuilderType> implements com.google.android.gms.internal.measurement.zzgq {
        protected com.google.android.gms.internal.measurement.zzew<com.google.android.gms.internal.measurement.zzfd.zzc> zzc = com.google.android.gms.internal.measurement.zzew.zza();

        final com.google.android.gms.internal.measurement.zzew<com.google.android.gms.internal.measurement.zzfd.zzc> zza() {
            if (this.zzc.zzc()) {
                this.zzc = (com.google.android.gms.internal.measurement.zzew) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public java.lang.String toString() {
        return com.google.android.gms.internal.measurement.zzgp.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zza != 0) {
            return this.zza;
        }
        this.zza = com.google.android.gms.internal.measurement.zzgz.zza().zza(this).zza(this);
        return this.zza;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
    public static abstract class zzb<MessageType extends com.google.android.gms.internal.measurement.zzfd<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.measurement.zzfd.zzb<MessageType, BuilderType>> extends com.google.android.gms.internal.measurement.zzdn<MessageType, BuilderType> {
        protected MessageType zza;
        protected boolean zzb = false;
        private final MessageType zzc;

        protected zzb(MessageType messagetype) {
            this.zzc = messagetype;
            this.zza = (MessageType) messagetype.zza(com.google.android.gms.internal.measurement.zzfd.zze.zzd, null, null);
        }

        protected void zzq() {
            MessageType messagetype = (MessageType) this.zza.zza(com.google.android.gms.internal.measurement.zzfd.zze.zzd, null, null);
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.measurement.zzgq
        public final boolean zzbl() {
            return com.google.android.gms.internal.measurement.zzfd.zza(this.zza, false);
        }

        @Override // com.google.android.gms.internal.measurement.zzgn
        /* JADX INFO: renamed from: zzr, reason: merged with bridge method [inline-methods] */
        public MessageType zzt() {
            if (this.zzb) {
                return this.zza;
            }
            MessageType messagetype = this.zza;
            com.google.android.gms.internal.measurement.zzgz.zza().zza(messagetype).zzc(messagetype);
            this.zzb = true;
            return this.zza;
        }

        @Override // com.google.android.gms.internal.measurement.zzgn
        /* JADX INFO: renamed from: zzs, reason: merged with bridge method [inline-methods] */
        public final MessageType zzu() {
            MessageType messagetype = (MessageType) zzt();
            if (messagetype.zzbl()) {
                return messagetype;
            }
            throw new com.google.android.gms.internal.measurement.zzhw(messagetype);
        }

        @Override // com.google.android.gms.internal.measurement.zzdn
        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb) {
                zzq();
                this.zzb = false;
            }
            zza(this.zza, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            com.google.android.gms.internal.measurement.zzgz.zza().zza(messagetype).zzb(messagetype, messagetype2);
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzeq zzeqVar) throws com.google.android.gms.internal.measurement.zzfo {
            if (this.zzb) {
                zzq();
                this.zzb = false;
            }
            try {
                com.google.android.gms.internal.measurement.zzgz.zza().zza(this.zza).zza(this.zza, bArr, 0, i2 + 0, new com.google.android.gms.internal.measurement.zzdt(zzeqVar));
                return this;
            } catch (com.google.android.gms.internal.measurement.zzfo e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (java.lang.IndexOutOfBoundsException unused) {
                throw com.google.android.gms.internal.measurement.zzfo.zza();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.measurement.zzdn
        /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
        public final BuilderType zza(com.google.android.gms.internal.measurement.zzeg zzegVar, com.google.android.gms.internal.measurement.zzeq zzeqVar) throws java.io.IOException {
            if (this.zzb) {
                zzq();
                this.zzb = false;
            }
            try {
                com.google.android.gms.internal.measurement.zzgz.zza().zza(this.zza).zza(this.zza, com.google.android.gms.internal.measurement.zzel.zza(zzegVar), zzeqVar);
                return this;
            } catch (java.lang.RuntimeException e) {
                if (e.getCause() instanceof java.io.IOException) {
                    throw ((java.io.IOException) e.getCause());
                }
                throw e;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzdn
        public final /* synthetic */ com.google.android.gms.internal.measurement.zzdn zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzeq zzeqVar) throws com.google.android.gms.internal.measurement.zzfo {
            return zzb(bArr, 0, i2, zzeqVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzdn
        public final /* synthetic */ com.google.android.gms.internal.measurement.zzdn zza(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.measurement.zzfo {
            return zzb(bArr, 0, i2, com.google.android.gms.internal.measurement.zzeq.zza());
        }

        @Override // com.google.android.gms.internal.measurement.zzdn
        /* JADX INFO: renamed from: zzp */
        public final /* synthetic */ com.google.android.gms.internal.measurement.zzdn clone() {
            return (com.google.android.gms.internal.measurement.zzfd.zzb) clone();
        }

        @Override // com.google.android.gms.internal.measurement.zzgq
        public final /* synthetic */ com.google.android.gms.internal.measurement.zzgo zzbt() {
            return this.zzc;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.measurement.zzdn
        public /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            com.google.android.gms.internal.measurement.zzfd.zzb zzbVar = (com.google.android.gms.internal.measurement.zzfd.zzb) this.zzc.zza(com.google.android.gms.internal.measurement.zzfd.zze.zze, null, null);
            zzbVar.zza((com.google.android.gms.internal.measurement.zzfd) zzt());
            return zzbVar;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return com.google.android.gms.internal.measurement.zzgz.zza().zza(this).zza(this, (com.google.android.gms.internal.measurement.zzfd) obj);
        }
        return false;
    }

    protected final <MessageType extends com.google.android.gms.internal.measurement.zzfd<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.measurement.zzfd.zzb<MessageType, BuilderType>> BuilderType zzbk() {
        return (BuilderType) zza(com.google.android.gms.internal.measurement.zzfd.zze.zze, (java.lang.Object) null, (java.lang.Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzgq
    public final boolean zzbl() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        return zza(this, true);
    }

    public final BuilderType zzbm() {
        BuilderType buildertype = (BuilderType) zza(com.google.android.gms.internal.measurement.zzfd.zze.zze, (java.lang.Object) null, (java.lang.Object) null);
        buildertype.zza(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    final int zzbj() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    final void zzc(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzgo
    public final void zza(com.google.android.gms.internal.measurement.zzen zzenVar) throws java.io.IOException {
        com.google.android.gms.internal.measurement.zzgz.zza().zza(this).zza(this, com.google.android.gms.internal.measurement.zzep.zza(zzenVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzgo
    public final int zzbn() {
        if (this.zzc == -1) {
            this.zzc = com.google.android.gms.internal.measurement.zzgz.zza().zza(this).zzb(this);
        }
        return this.zzc;
    }

    static <T extends com.google.android.gms.internal.measurement.zzfd<?, ?>> T zza(java.lang.Class<T> cls) {
        com.google.android.gms.internal.measurement.zzfd<?, ?> zzfdVar = zzd.get(cls);
        if (zzfdVar == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                zzfdVar = zzd.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzfdVar == null) {
            zzfdVar = (T) ((com.google.android.gms.internal.measurement.zzfd) com.google.android.gms.internal.measurement.zzib.zza(cls)).zza(com.google.android.gms.internal.measurement.zzfd.zze.zzf, (java.lang.Object) null, (java.lang.Object) null);
            if (zzfdVar == null) {
                throw new java.lang.IllegalStateException();
            }
            zzd.put(cls, zzfdVar);
        }
        return (T) zzfdVar;
    }

    protected static <T extends com.google.android.gms.internal.measurement.zzfd<?, ?>> void zza(java.lang.Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    protected static java.lang.Object zza(com.google.android.gms.internal.measurement.zzgo zzgoVar, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.android.gms.internal.measurement.zzhb(zzgoVar, str, objArr);
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

    protected static final <T extends com.google.android.gms.internal.measurement.zzfd<T, ?>> boolean zza(T t, boolean z) {
        byte bByteValue = ((java.lang.Byte) t.zza(com.google.android.gms.internal.measurement.zzfd.zze.zza, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzd = com.google.android.gms.internal.measurement.zzgz.zza().zza(t).zzd(t);
        if (z) {
            t.zza(com.google.android.gms.internal.measurement.zzfd.zze.zzb, zZzd ? t : null, null);
        }
        return zZzd;
    }

    protected static com.google.android.gms.internal.measurement.zzfj zzbo() {
        return com.google.android.gms.internal.measurement.zzfg.zzd();
    }

    protected static com.google.android.gms.internal.measurement.zzfm zzbp() {
        return com.google.android.gms.internal.measurement.zzgc.zzd();
    }

    protected static com.google.android.gms.internal.measurement.zzfm zza(com.google.android.gms.internal.measurement.zzfm zzfmVar) {
        int size = zzfmVar.size();
        return zzfmVar.zza(size == 0 ? 10 : size << 1);
    }

    protected static <E> com.google.android.gms.internal.measurement.zzfl<E> zzbq() {
        return com.google.android.gms.internal.measurement.zzhc.zzd();
    }

    protected static <E> com.google.android.gms.internal.measurement.zzfl<E> zza(com.google.android.gms.internal.measurement.zzfl<E> zzflVar) {
        int size = zzflVar.size();
        return zzflVar.zza(size == 0 ? 10 : size << 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzgo
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzgn zzbr() {
        com.google.android.gms.internal.measurement.zzfd.zzb zzbVar = (com.google.android.gms.internal.measurement.zzfd.zzb) zza(com.google.android.gms.internal.measurement.zzfd.zze.zze, (java.lang.Object) null, (java.lang.Object) null);
        zzbVar.zza(this);
        return zzbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzgo
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzgn zzbs() {
        return (com.google.android.gms.internal.measurement.zzfd.zzb) zza(com.google.android.gms.internal.measurement.zzfd.zze.zze, (java.lang.Object) null, (java.lang.Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzgq
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzgo zzbt() {
        return (com.google.android.gms.internal.measurement.zzfd) zza(com.google.android.gms.internal.measurement.zzfd.zze.zzf, (java.lang.Object) null, (java.lang.Object) null);
    }
}
