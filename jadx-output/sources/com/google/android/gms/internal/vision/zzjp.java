package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzjp {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.android.gms.internal.vision.zzjp.class.getName());
    private static final boolean zzaap;
    private static final boolean zzaaq;
    private static final com.google.android.gms.internal.vision.zzjp.zzd zzaar;
    private static final boolean zzaas;
    private static final long zzaat;
    private static final long zzaau;
    private static final long zzaav;
    private static final long zzaaw;
    private static final long zzaax;
    private static final long zzaay;
    private static final long zzaaz;
    private static final long zzaba;
    private static final long zzabb;
    private static final long zzabc;
    private static final long zzabd;
    private static final long zzabe;
    private static final long zzabf;
    private static final long zzabg;
    private static final int zzabh;
    static final boolean zzabi;
    private static final java.lang.Class<?> zzrm;
    private static final boolean zzsr;
    private static final sun.misc.Unsafe zzyt;

    private zzjp() {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    static final class zza extends com.google.android.gms.internal.vision.zzjp.zzd {
        zza(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final byte zzy(java.lang.Object obj, long j) {
            if (com.google.android.gms.internal.vision.zzjp.zzabi) {
                return com.google.android.gms.internal.vision.zzjp.zzq(obj, j);
            }
            return com.google.android.gms.internal.vision.zzjp.zzr(obj, j);
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final void zze(java.lang.Object obj, long j, byte b) {
            if (com.google.android.gms.internal.vision.zzjp.zzabi) {
                com.google.android.gms.internal.vision.zzjp.zza(obj, j, b);
            } else {
                com.google.android.gms.internal.vision.zzjp.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final boolean zzm(java.lang.Object obj, long j) {
            if (com.google.android.gms.internal.vision.zzjp.zzabi) {
                return com.google.android.gms.internal.vision.zzjp.zzs(obj, j);
            }
            return com.google.android.gms.internal.vision.zzjp.zzt(obj, j);
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final void zza(java.lang.Object obj, long j, boolean z) {
            if (com.google.android.gms.internal.vision.zzjp.zzabi) {
                com.google.android.gms.internal.vision.zzjp.zzb(obj, j, z);
            } else {
                com.google.android.gms.internal.vision.zzjp.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final float zzn(java.lang.Object obj, long j) {
            return java.lang.Float.intBitsToFloat(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final void zza(java.lang.Object obj, long j, float f) {
            zzb(obj, j, java.lang.Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final double zzo(java.lang.Object obj, long j) {
            return java.lang.Double.longBitsToDouble(zzl(obj, j));
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final void zza(java.lang.Object obj, long j, double d) {
            zza(obj, j, java.lang.Double.doubleToLongBits(d));
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    static final class zzb extends com.google.android.gms.internal.vision.zzjp.zzd {
        zzb(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final byte zzy(java.lang.Object obj, long j) {
            return this.zzabl.getByte(obj, j);
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final void zze(java.lang.Object obj, long j, byte b) {
            this.zzabl.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final boolean zzm(java.lang.Object obj, long j) {
            return this.zzabl.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final void zza(java.lang.Object obj, long j, boolean z) {
            this.zzabl.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final float zzn(java.lang.Object obj, long j) {
            return this.zzabl.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final void zza(java.lang.Object obj, long j, float f) {
            this.zzabl.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final double zzo(java.lang.Object obj, long j) {
            return this.zzabl.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final void zza(java.lang.Object obj, long j, double d) {
            this.zzabl.putDouble(obj, j, d);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    static final class zzc extends com.google.android.gms.internal.vision.zzjp.zzd {
        zzc(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final byte zzy(java.lang.Object obj, long j) {
            if (com.google.android.gms.internal.vision.zzjp.zzabi) {
                return com.google.android.gms.internal.vision.zzjp.zzq(obj, j);
            }
            return com.google.android.gms.internal.vision.zzjp.zzr(obj, j);
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final void zze(java.lang.Object obj, long j, byte b) {
            if (com.google.android.gms.internal.vision.zzjp.zzabi) {
                com.google.android.gms.internal.vision.zzjp.zza(obj, j, b);
            } else {
                com.google.android.gms.internal.vision.zzjp.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final boolean zzm(java.lang.Object obj, long j) {
            if (com.google.android.gms.internal.vision.zzjp.zzabi) {
                return com.google.android.gms.internal.vision.zzjp.zzs(obj, j);
            }
            return com.google.android.gms.internal.vision.zzjp.zzt(obj, j);
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final void zza(java.lang.Object obj, long j, boolean z) {
            if (com.google.android.gms.internal.vision.zzjp.zzabi) {
                com.google.android.gms.internal.vision.zzjp.zzb(obj, j, z);
            } else {
                com.google.android.gms.internal.vision.zzjp.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final float zzn(java.lang.Object obj, long j) {
            return java.lang.Float.intBitsToFloat(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final void zza(java.lang.Object obj, long j, float f) {
            zzb(obj, j, java.lang.Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final double zzo(java.lang.Object obj, long j) {
            return java.lang.Double.longBitsToDouble(zzl(obj, j));
        }

        @Override // com.google.android.gms.internal.vision.zzjp.zzd
        public final void zza(java.lang.Object obj, long j, double d) {
            zza(obj, j, java.lang.Double.doubleToLongBits(d));
        }
    }

    static boolean zzij() {
        return zzsr;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    static abstract class zzd {
        sun.misc.Unsafe zzabl;

        zzd(sun.misc.Unsafe unsafe) {
            this.zzabl = unsafe;
        }

        public abstract void zza(java.lang.Object obj, long j, double d);

        public abstract void zza(java.lang.Object obj, long j, float f);

        public abstract void zza(java.lang.Object obj, long j, boolean z);

        public abstract void zze(java.lang.Object obj, long j, byte b);

        public abstract boolean zzm(java.lang.Object obj, long j);

        public abstract float zzn(java.lang.Object obj, long j);

        public abstract double zzo(java.lang.Object obj, long j);

        public abstract byte zzy(java.lang.Object obj, long j);

        public final int zzk(java.lang.Object obj, long j) {
            return this.zzabl.getInt(obj, j);
        }

        public final void zzb(java.lang.Object obj, long j, int i) {
            this.zzabl.putInt(obj, j, i);
        }

        public final long zzl(java.lang.Object obj, long j) {
            return this.zzabl.getLong(obj, j);
        }

        public final void zza(java.lang.Object obj, long j, long j2) {
            this.zzabl.putLong(obj, j, j2);
        }
    }

    static boolean zzik() {
        return zzaas;
    }

    static <T> T zzh(java.lang.Class<T> cls) {
        try {
            return (T) zzyt.allocateInstance(cls);
        } catch (java.lang.InstantiationException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    private static int zzi(java.lang.Class<?> cls) {
        if (zzsr) {
            return zzaar.zzabl.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzj(java.lang.Class<?> cls) {
        if (zzsr) {
            return zzaar.zzabl.arrayIndexScale(cls);
        }
        return -1;
    }

    static int zzk(java.lang.Object obj, long j) {
        return zzaar.zzk(obj, j);
    }

    static void zzb(java.lang.Object obj, long j, int i) {
        zzaar.zzb(obj, j, i);
    }

    static long zzl(java.lang.Object obj, long j) {
        return zzaar.zzl(obj, j);
    }

    static void zza(java.lang.Object obj, long j, long j2) {
        zzaar.zza(obj, j, j2);
    }

    static boolean zzm(java.lang.Object obj, long j) {
        return zzaar.zzm(obj, j);
    }

    static void zza(java.lang.Object obj, long j, boolean z) {
        zzaar.zza(obj, j, z);
    }

    static float zzn(java.lang.Object obj, long j) {
        return zzaar.zzn(obj, j);
    }

    static void zza(java.lang.Object obj, long j, float f) {
        zzaar.zza(obj, j, f);
    }

    static double zzo(java.lang.Object obj, long j) {
        return zzaar.zzo(obj, j);
    }

    static void zza(java.lang.Object obj, long j, double d) {
        zzaar.zza(obj, j, d);
    }

    static java.lang.Object zzp(java.lang.Object obj, long j) {
        return zzaar.zzabl.getObject(obj, j);
    }

    static void zza(java.lang.Object obj, long j, java.lang.Object obj2) {
        zzaar.zzabl.putObject(obj, j, obj2);
    }

    static byte zza(byte[] bArr, long j) {
        return zzaar.zzy(bArr, zzaat + j);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzaar.zze(bArr, zzaat + j, b);
    }

    static sun.misc.Unsafe zzil() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.vision.zzjr());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static boolean zzim() {
        sun.misc.Unsafe unsafe = zzyt;
        if (unsafe == null) {
            return false;
        }
        try {
            java.lang.Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("arrayBaseOffset", java.lang.Class.class);
            cls.getMethod("arrayIndexScale", java.lang.Class.class);
            cls.getMethod("getInt", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putInt", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Integer.TYPE);
            cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putLong", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Long.TYPE);
            cls.getMethod("getObject", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putObject", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Object.class);
            if (com.google.android.gms.internal.vision.zzfa.zzdr()) {
                return true;
            }
            cls.getMethod("getByte", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putByte", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Byte.TYPE);
            cls.getMethod("getBoolean", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putBoolean", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
            cls.getMethod("getFloat", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putFloat", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Float.TYPE);
            cls.getMethod("getDouble", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putDouble", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Double.TYPE);
            return true;
        } catch (java.lang.Throwable th) {
            java.util.logging.Logger logger2 = logger;
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.lang.String strValueOf = java.lang.String.valueOf(th);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzin() {
        sun.misc.Unsafe unsafe = zzyt;
        if (unsafe == null) {
            return false;
        }
        try {
            java.lang.Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
            if (zzio() == null) {
                return false;
            }
            if (com.google.android.gms.internal.vision.zzfa.zzdr()) {
                return true;
            }
            cls.getMethod("getByte", java.lang.Long.TYPE);
            cls.getMethod("putByte", java.lang.Long.TYPE, java.lang.Byte.TYPE);
            cls.getMethod("getInt", java.lang.Long.TYPE);
            cls.getMethod("putInt", java.lang.Long.TYPE, java.lang.Integer.TYPE);
            cls.getMethod("getLong", java.lang.Long.TYPE);
            cls.getMethod("putLong", java.lang.Long.TYPE, java.lang.Long.TYPE);
            cls.getMethod("copyMemory", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
            cls.getMethod("copyMemory", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Object.class, java.lang.Long.TYPE, java.lang.Long.TYPE);
            return true;
        } catch (java.lang.Throwable th) {
            java.util.logging.Logger logger2 = logger;
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.lang.String strValueOf = java.lang.String.valueOf(th);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzk(java.lang.Class<?> cls) {
        if (!com.google.android.gms.internal.vision.zzfa.zzdr()) {
            return false;
        }
        try {
            java.lang.Class<?> cls2 = zzrm;
            cls2.getMethod("peekLong", cls, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            cls2.getMethod("peekInt", cls, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, java.lang.Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    private static java.lang.reflect.Field zzio() {
        java.lang.reflect.Field fieldZzb;
        if (com.google.android.gms.internal.vision.zzfa.zzdr() && (fieldZzb = zzb(java.nio.Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldZzb;
        }
        java.lang.reflect.Field fieldZzb2 = zzb(java.nio.Buffer.class, "address");
        if (fieldZzb2 == null || fieldZzb2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return fieldZzb2;
    }

    private static java.lang.reflect.Field zzb(java.lang.Class<?> cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzq(java.lang.Object obj, long j) {
        return (byte) (zzk(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzr(java.lang.Object obj, long j) {
        return (byte) (zzk(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(java.lang.Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iZzk = zzk(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (iZzk & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(java.lang.Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzs(java.lang.Object obj, long j) {
        return zzq(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzt(java.lang.Object obj, long j) {
        return zzr(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(java.lang.Object obj, long j, boolean z) {
        zza(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(java.lang.Object obj, long j, boolean z) {
        zzb(obj, j, z ? (byte) 1 : (byte) 0);
    }

    static {
        sun.misc.Unsafe unsafeZzil = zzil();
        zzyt = unsafeZzil;
        zzrm = com.google.android.gms.internal.vision.zzfa.zzds();
        boolean zZzk = zzk(java.lang.Long.TYPE);
        zzaap = zZzk;
        boolean zZzk2 = zzk(java.lang.Integer.TYPE);
        zzaaq = zZzk2;
        com.google.android.gms.internal.vision.zzjp.zzd zzbVar = null;
        if (unsafeZzil != null) {
            if (!com.google.android.gms.internal.vision.zzfa.zzdr()) {
                zzbVar = new com.google.android.gms.internal.vision.zzjp.zzb(unsafeZzil);
            } else if (zZzk) {
                zzbVar = new com.google.android.gms.internal.vision.zzjp.zzc(unsafeZzil);
            } else if (zZzk2) {
                zzbVar = new com.google.android.gms.internal.vision.zzjp.zza(unsafeZzil);
            }
        }
        zzaar = zzbVar;
        zzaas = zzin();
        zzsr = zzim();
        long jZzi = zzi(byte[].class);
        zzaat = jZzi;
        zzaau = zzi(boolean[].class);
        zzaav = zzj(boolean[].class);
        zzaaw = zzi(int[].class);
        zzaax = zzj(int[].class);
        zzaay = zzi(long[].class);
        zzaaz = zzj(long[].class);
        zzaba = zzi(float[].class);
        zzabb = zzj(float[].class);
        zzabc = zzi(double[].class);
        zzabd = zzj(double[].class);
        zzabe = zzi(java.lang.Object[].class);
        zzabf = zzj(java.lang.Object[].class);
        java.lang.reflect.Field fieldZzio = zzio();
        zzabg = (fieldZzio == null || zzbVar == null) ? -1L : zzbVar.zzabl.objectFieldOffset(fieldZzio);
        zzabh = (int) (7 & jZzi);
        zzabi = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }
}
