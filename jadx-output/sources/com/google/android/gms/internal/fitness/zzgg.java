package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzgg<MessageType extends com.google.android.gms.internal.fitness.zzgg<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.fitness.zzgg.zzb<MessageType, BuilderType>> extends com.google.android.gms.internal.fitness.zzex<MessageType, BuilderType> {
    private static java.util.Map<java.lang.Object, com.google.android.gms.internal.fitness.zzgg<?, ?>> zzvd = new java.util.concurrent.ConcurrentHashMap();
    protected com.google.android.gms.internal.fitness.zzit zzvb = com.google.android.gms.internal.fitness.zzit.zzdd();
    private int zzvc = -1;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class zza<T extends com.google.android.gms.internal.fitness.zzgg<T, ?>> extends com.google.android.gms.internal.fitness.zzfb<T> {
        private final T zzvf;

        public zza(T t) {
            this.zzvf = t;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    static final class zzc implements com.google.android.gms.internal.fitness.zzgd<com.google.android.gms.internal.fitness.zzgg.zzc> {
        @Override // com.google.android.gms.internal.fitness.zzgd
        public final int zzc() {
            throw new java.lang.NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.fitness.zzgd
        public final com.google.android.gms.internal.fitness.zzji zzbg() {
            throw new java.lang.NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.fitness.zzgd
        public final com.google.android.gms.internal.fitness.zzjl zzbh() {
            throw new java.lang.NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.fitness.zzgd
        public final boolean zzbi() {
            throw new java.lang.NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.fitness.zzgd
        public final boolean zzbj() {
            throw new java.lang.NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.fitness.zzgd
        public final com.google.android.gms.internal.fitness.zzhn zza(com.google.android.gms.internal.fitness.zzhn zzhnVar, com.google.android.gms.internal.fitness.zzho zzhoVar) {
            throw new java.lang.NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.fitness.zzgd
        public final com.google.android.gms.internal.fitness.zzhu zza(com.google.android.gms.internal.fitness.zzhu zzhuVar, com.google.android.gms.internal.fitness.zzhu zzhuVar2) {
            throw new java.lang.NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(java.lang.Object obj) {
            throw new java.lang.NoSuchMethodError();
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static abstract class zzd<MessageType extends com.google.android.gms.internal.fitness.zzgg.zzd<MessageType, BuilderType>, BuilderType> extends com.google.android.gms.internal.fitness.zzgg<MessageType, BuilderType> implements com.google.android.gms.internal.fitness.zzhq {
        protected com.google.android.gms.internal.fitness.zzgb<com.google.android.gms.internal.fitness.zzgg.zzc> zzvi = com.google.android.gms.internal.fitness.zzgb.zzbe();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static final enum zze {
        public static final int zzvl = 1;
        public static final int zzvm = 2;
        public static final int zzvn = 3;
        public static final int zzvo = 4;
        public static final int zzvp = 5;
        public static final int zzvq = 6;
        public static final int zzvr = 7;
        public static final int zzvt = 1;
        public static final int zzvu = 2;
        public static final int zzvw = 1;
        public static final int zzvx = 2;
        private static final /* synthetic */ int[] zzvs = {1, 2, 3, 4, 5, 6, 7};
        private static final /* synthetic */ int[] zzvv = {1, 2};
        private static final /* synthetic */ int[] zzvy = {1, 2};

        public static int[] zzbs() {
            return (int[]) zzvs.clone();
        }
    }

    protected abstract java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2);

    public java.lang.String toString() {
        return com.google.android.gms.internal.fitness.zzhp.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zzrb != 0) {
            return this.zzrb;
        }
        this.zzrb = com.google.android.gms.internal.fitness.zzia.zzcp().zzl(this).hashCode(this);
        return this.zzrb;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static abstract class zzb<MessageType extends com.google.android.gms.internal.fitness.zzgg<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.fitness.zzgg.zzb<MessageType, BuilderType>> extends com.google.android.gms.internal.fitness.zzez<MessageType, BuilderType> {
        private final MessageType zzvf;
        private MessageType zzvg;
        private boolean zzvh = false;

        protected zzb(MessageType messagetype) {
            this.zzvf = messagetype;
            this.zzvg = (MessageType) messagetype.zza(com.google.android.gms.internal.fitness.zzgg.zze.zzvo, null, null);
        }

        @Override // com.google.android.gms.internal.fitness.zzhq
        public final boolean isInitialized() {
            return com.google.android.gms.internal.fitness.zzgg.zza(this.zzvg, false);
        }

        @Override // com.google.android.gms.internal.fitness.zzhn
        /* JADX INFO: renamed from: zzbo, reason: merged with bridge method [inline-methods] */
        public MessageType zzbq() {
            if (this.zzvh) {
                return this.zzvg;
            }
            MessageType messagetype = this.zzvg;
            com.google.android.gms.internal.fitness.zzia.zzcp().zzl(messagetype).zzc(messagetype);
            this.zzvh = true;
            return this.zzvg;
        }

        @Override // com.google.android.gms.internal.fitness.zzhn
        /* JADX INFO: renamed from: zzbp, reason: merged with bridge method [inline-methods] */
        public final MessageType zzbr() {
            MessageType messagetype = (MessageType) zzbq();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new com.google.android.gms.internal.fitness.zzir(messagetype);
        }

        @Override // com.google.android.gms.internal.fitness.zzez
        public final BuilderType zza(MessageType messagetype) {
            if (this.zzvh) {
                MessageType messagetype2 = (MessageType) this.zzvg.zza(com.google.android.gms.internal.fitness.zzgg.zze.zzvo, null, null);
                zza(messagetype2, this.zzvg);
                this.zzvg = messagetype2;
                this.zzvh = false;
            }
            zza(this.zzvg, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            com.google.android.gms.internal.fitness.zzia.zzcp().zzl(messagetype).zzd(messagetype, messagetype2);
        }

        @Override // com.google.android.gms.internal.fitness.zzez
        /* JADX INFO: renamed from: zzaj */
        public final /* synthetic */ com.google.android.gms.internal.fitness.zzez clone() {
            return (com.google.android.gms.internal.fitness.zzgg.zzb) clone();
        }

        @Override // com.google.android.gms.internal.fitness.zzhq
        public final /* synthetic */ com.google.android.gms.internal.fitness.zzho zzbm() {
            return this.zzvf;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.fitness.zzez
        public /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            com.google.android.gms.internal.fitness.zzgg.zzb zzbVar = (com.google.android.gms.internal.fitness.zzgg.zzb) this.zzvf.zza(com.google.android.gms.internal.fitness.zzgg.zze.zzvp, null, null);
            zzbVar.zza((com.google.android.gms.internal.fitness.zzgg) zzbq());
            return zzbVar;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (((com.google.android.gms.internal.fitness.zzgg) zza(com.google.android.gms.internal.fitness.zzgg.zze.zzvq, (java.lang.Object) null, (java.lang.Object) null)).getClass().isInstance(obj)) {
            return com.google.android.gms.internal.fitness.zzia.zzcp().zzl(this).equals(this, (com.google.android.gms.internal.fitness.zzgg) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fitness.zzhq
    public final boolean isInitialized() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        return zza(this, true);
    }

    @Override // com.google.android.gms.internal.fitness.zzex
    final int zzah() {
        return this.zzvc;
    }

    @Override // com.google.android.gms.internal.fitness.zzex
    final void zzg(int i) {
        this.zzvc = i;
    }

    @Override // com.google.android.gms.internal.fitness.zzho
    public final void zzb(com.google.android.gms.internal.fitness.zzfs zzfsVar) throws java.io.IOException {
        com.google.android.gms.internal.fitness.zzia.zzcp().zzl(this).zza(this, com.google.android.gms.internal.fitness.zzfv.zza(zzfsVar));
    }

    @Override // com.google.android.gms.internal.fitness.zzho
    public final int zzbk() {
        if (this.zzvc == -1) {
            this.zzvc = com.google.android.gms.internal.fitness.zzia.zzcp().zzl(this).zzk(this);
        }
        return this.zzvc;
    }

    static <T extends com.google.android.gms.internal.fitness.zzgg<?, ?>> T zza(java.lang.Class<T> cls) {
        com.google.android.gms.internal.fitness.zzgg<?, ?> zzggVar = zzvd.get(cls);
        if (zzggVar == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                zzggVar = zzvd.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzggVar == null) {
            zzggVar = (T) ((com.google.android.gms.internal.fitness.zzgg) com.google.android.gms.internal.fitness.zzja.zzg(cls)).zza(com.google.android.gms.internal.fitness.zzgg.zze.zzvq, (java.lang.Object) null, (java.lang.Object) null);
            if (zzggVar == null) {
                throw new java.lang.IllegalStateException();
            }
            zzvd.put(cls, zzggVar);
        }
        return (T) zzggVar;
    }

    protected static <T extends com.google.android.gms.internal.fitness.zzgg<?, ?>> void zza(java.lang.Class<T> cls, T t) {
        zzvd.put(cls, t);
    }

    protected static java.lang.Object zza(com.google.android.gms.internal.fitness.zzho zzhoVar, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.android.gms.internal.fitness.zzhz(zzhoVar, str, null);
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

    protected static final <T extends com.google.android.gms.internal.fitness.zzgg<T, ?>> boolean zza(T t, boolean z) {
        byte bByteValue = ((java.lang.Byte) t.zza(com.google.android.gms.internal.fitness.zzgg.zze.zzvl, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzj = com.google.android.gms.internal.fitness.zzia.zzcp().zzl(t).zzj(t);
        if (z) {
            t.zza(com.google.android.gms.internal.fitness.zzgg.zze.zzvm, zZzj ? t : null, null);
        }
        return zZzj;
    }

    @Override // com.google.android.gms.internal.fitness.zzho
    public final /* synthetic */ com.google.android.gms.internal.fitness.zzhn zzbl() {
        com.google.android.gms.internal.fitness.zzgg.zzb zzbVar = (com.google.android.gms.internal.fitness.zzgg.zzb) zza(com.google.android.gms.internal.fitness.zzgg.zze.zzvp, (java.lang.Object) null, (java.lang.Object) null);
        zzbVar.zza(this);
        return zzbVar;
    }

    @Override // com.google.android.gms.internal.fitness.zzhq
    public final /* synthetic */ com.google.android.gms.internal.fitness.zzho zzbm() {
        return (com.google.android.gms.internal.fitness.zzgg) zza(com.google.android.gms.internal.fitness.zzgg.zze.zzvq, (java.lang.Object) null, (java.lang.Object) null);
    }
}
