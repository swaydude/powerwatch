package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzja {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.android.gms.internal.fitness.zzja.class.getName());
    private static final long zzaaa;
    private static final int zzaab;
    static final boolean zzaac;
    private static final java.lang.Class<?> zzrf;
    private static final boolean zzrt;
    private static final sun.misc.Unsafe zzxr;
    private static final boolean zzzj;
    private static final boolean zzzk;
    private static final com.google.android.gms.internal.fitness.zzja.zzc zzzl;
    private static final boolean zzzm;
    private static final long zzzn;
    private static final long zzzo;
    private static final long zzzp;
    private static final long zzzq;
    private static final long zzzr;
    private static final long zzzs;
    private static final long zzzt;
    private static final long zzzu;
    private static final long zzzv;
    private static final long zzzw;
    private static final long zzzx;
    private static final long zzzy;
    private static final long zzzz;

    private zzja() {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    static final class zza extends com.google.android.gms.internal.fitness.zzja.zzc {
        zza(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final byte zzx(java.lang.Object obj, long j) {
            if (com.google.android.gms.internal.fitness.zzja.zzaac) {
                return com.google.android.gms.internal.fitness.zzja.zzp(obj, j);
            }
            return com.google.android.gms.internal.fitness.zzja.zzq(obj, j);
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final void zze(java.lang.Object obj, long j, byte b) {
            if (com.google.android.gms.internal.fitness.zzja.zzaac) {
                com.google.android.gms.internal.fitness.zzja.zza(obj, j, b);
            } else {
                com.google.android.gms.internal.fitness.zzja.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final boolean zzl(java.lang.Object obj, long j) {
            if (com.google.android.gms.internal.fitness.zzja.zzaac) {
                return com.google.android.gms.internal.fitness.zzja.zzr(obj, j);
            }
            return com.google.android.gms.internal.fitness.zzja.zzs(obj, j);
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final void zza(java.lang.Object obj, long j, boolean z) {
            if (com.google.android.gms.internal.fitness.zzja.zzaac) {
                com.google.android.gms.internal.fitness.zzja.zzb(obj, j, z);
            } else {
                com.google.android.gms.internal.fitness.zzja.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final float zzm(java.lang.Object obj, long j) {
            return java.lang.Float.intBitsToFloat(zzj(obj, j));
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final void zza(java.lang.Object obj, long j, float f) {
            zza(obj, j, java.lang.Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final double zzn(java.lang.Object obj, long j) {
            return java.lang.Double.longBitsToDouble(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final void zza(java.lang.Object obj, long j, double d) {
            zza(obj, j, java.lang.Double.doubleToLongBits(d));
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    static final class zzb extends com.google.android.gms.internal.fitness.zzja.zzc {
        zzb(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final byte zzx(java.lang.Object obj, long j) {
            if (com.google.android.gms.internal.fitness.zzja.zzaac) {
                return com.google.android.gms.internal.fitness.zzja.zzp(obj, j);
            }
            return com.google.android.gms.internal.fitness.zzja.zzq(obj, j);
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final void zze(java.lang.Object obj, long j, byte b) {
            if (com.google.android.gms.internal.fitness.zzja.zzaac) {
                com.google.android.gms.internal.fitness.zzja.zza(obj, j, b);
            } else {
                com.google.android.gms.internal.fitness.zzja.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final boolean zzl(java.lang.Object obj, long j) {
            if (com.google.android.gms.internal.fitness.zzja.zzaac) {
                return com.google.android.gms.internal.fitness.zzja.zzr(obj, j);
            }
            return com.google.android.gms.internal.fitness.zzja.zzs(obj, j);
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final void zza(java.lang.Object obj, long j, boolean z) {
            if (com.google.android.gms.internal.fitness.zzja.zzaac) {
                com.google.android.gms.internal.fitness.zzja.zzb(obj, j, z);
            } else {
                com.google.android.gms.internal.fitness.zzja.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final float zzm(java.lang.Object obj, long j) {
            return java.lang.Float.intBitsToFloat(zzj(obj, j));
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final void zza(java.lang.Object obj, long j, float f) {
            zza(obj, j, java.lang.Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final double zzn(java.lang.Object obj, long j) {
            return java.lang.Double.longBitsToDouble(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final void zza(java.lang.Object obj, long j, double d) {
            zza(obj, j, java.lang.Double.doubleToLongBits(d));
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    static final class zzd extends com.google.android.gms.internal.fitness.zzja.zzc {
        zzd(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final byte zzx(java.lang.Object obj, long j) {
            return this.zzaad.getByte(obj, j);
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final void zze(java.lang.Object obj, long j, byte b) {
            this.zzaad.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final boolean zzl(java.lang.Object obj, long j) {
            return this.zzaad.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final void zza(java.lang.Object obj, long j, boolean z) {
            this.zzaad.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final float zzm(java.lang.Object obj, long j) {
            return this.zzaad.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final void zza(java.lang.Object obj, long j, float f) {
            this.zzaad.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final double zzn(java.lang.Object obj, long j) {
            return this.zzaad.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.fitness.zzja.zzc
        public final void zza(java.lang.Object obj, long j, double d) {
            this.zzaad.putDouble(obj, j, d);
        }
    }

    static boolean zzdf() {
        return zzrt;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    static abstract class zzc {
        sun.misc.Unsafe zzaad;

        zzc(sun.misc.Unsafe unsafe) {
            this.zzaad = unsafe;
        }

        public abstract void zza(java.lang.Object obj, long j, double d);

        public abstract void zza(java.lang.Object obj, long j, float f);

        public abstract void zza(java.lang.Object obj, long j, boolean z);

        public abstract void zze(java.lang.Object obj, long j, byte b);

        public abstract boolean zzl(java.lang.Object obj, long j);

        public abstract float zzm(java.lang.Object obj, long j);

        public abstract double zzn(java.lang.Object obj, long j);

        public abstract byte zzx(java.lang.Object obj, long j);

        public final int zzj(java.lang.Object obj, long j) {
            return this.zzaad.getInt(obj, j);
        }

        public final void zza(java.lang.Object obj, long j, int i) {
            this.zzaad.putInt(obj, j, i);
        }

        public final long zzk(java.lang.Object obj, long j) {
            return this.zzaad.getLong(obj, j);
        }

        public final void zza(java.lang.Object obj, long j, long j2) {
            this.zzaad.putLong(obj, j, j2);
        }
    }

    static boolean zzdg() {
        return zzzm;
    }

    static <T> T zzg(java.lang.Class<T> cls) {
        try {
            return (T) zzxr.allocateInstance(cls);
        } catch (java.lang.InstantiationException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    private static int zzh(java.lang.Class<?> cls) {
        if (zzrt) {
            return zzzl.zzaad.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzi(java.lang.Class<?> cls) {
        if (zzrt) {
            return zzzl.zzaad.arrayIndexScale(cls);
        }
        return -1;
    }

    static int zzj(java.lang.Object obj, long j) {
        return zzzl.zzj(obj, j);
    }

    static void zza(java.lang.Object obj, long j, int i) {
        zzzl.zza(obj, j, i);
    }

    static long zzk(java.lang.Object obj, long j) {
        return zzzl.zzk(obj, j);
    }

    static void zza(java.lang.Object obj, long j, long j2) {
        zzzl.zza(obj, j, j2);
    }

    static boolean zzl(java.lang.Object obj, long j) {
        return zzzl.zzl(obj, j);
    }

    static void zza(java.lang.Object obj, long j, boolean z) {
        zzzl.zza(obj, j, z);
    }

    static float zzm(java.lang.Object obj, long j) {
        return zzzl.zzm(obj, j);
    }

    static void zza(java.lang.Object obj, long j, float f) {
        zzzl.zza(obj, j, f);
    }

    static double zzn(java.lang.Object obj, long j) {
        return zzzl.zzn(obj, j);
    }

    static void zza(java.lang.Object obj, long j, double d) {
        zzzl.zza(obj, j, d);
    }

    static java.lang.Object zzo(java.lang.Object obj, long j) {
        return zzzl.zzaad.getObject(obj, j);
    }

    static void zza(java.lang.Object obj, long j, java.lang.Object obj2) {
        zzzl.zzaad.putObject(obj, j, obj2);
    }

    static byte zza(byte[] bArr, long j) {
        return zzzl.zzx(bArr, zzzn + j);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzzl.zze(bArr, zzzn + j, b);
    }

    static sun.misc.Unsafe zzdh() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.fitness.zziz());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static boolean zzdi() {
        sun.misc.Unsafe unsafe = zzxr;
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
            if (com.google.android.gms.internal.fitness.zzfd.zzan()) {
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

    private static boolean zzdj() {
        sun.misc.Unsafe unsafe = zzxr;
        if (unsafe == null) {
            return false;
        }
        try {
            java.lang.Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
            if (zzdk() == null) {
                return false;
            }
            if (com.google.android.gms.internal.fitness.zzfd.zzan()) {
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

    private static boolean zzj(java.lang.Class<?> cls) {
        if (!com.google.android.gms.internal.fitness.zzfd.zzan()) {
            return false;
        }
        try {
            java.lang.Class<?> cls2 = zzrf;
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

    private static java.lang.reflect.Field zzdk() {
        java.lang.reflect.Field fieldZzb;
        if (com.google.android.gms.internal.fitness.zzfd.zzan() && (fieldZzb = zzb(java.nio.Buffer.class, "effectiveDirectAddress")) != null) {
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
    public static byte zzp(java.lang.Object obj, long j) {
        return (byte) (zzj(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzq(java.lang.Object obj, long j) {
        return (byte) (zzj(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(java.lang.Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iZzj = zzj(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (iZzj & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(java.lang.Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zzj(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzr(java.lang.Object obj, long j) {
        return zzp(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzs(java.lang.Object obj, long j) {
        return zzq(obj, j) != 0;
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
        sun.misc.Unsafe unsafeZzdh = zzdh();
        zzxr = unsafeZzdh;
        zzrf = com.google.android.gms.internal.fitness.zzfd.zzao();
        boolean zZzj = zzj(java.lang.Long.TYPE);
        zzzj = zZzj;
        boolean zZzj2 = zzj(java.lang.Integer.TYPE);
        zzzk = zZzj2;
        com.google.android.gms.internal.fitness.zzja.zzc zzdVar = null;
        if (unsafeZzdh != null) {
            if (!com.google.android.gms.internal.fitness.zzfd.zzan()) {
                zzdVar = new com.google.android.gms.internal.fitness.zzja.zzd(unsafeZzdh);
            } else if (zZzj) {
                zzdVar = new com.google.android.gms.internal.fitness.zzja.zza(unsafeZzdh);
            } else if (zZzj2) {
                zzdVar = new com.google.android.gms.internal.fitness.zzja.zzb(unsafeZzdh);
            }
        }
        zzzl = zzdVar;
        zzzm = zzdj();
        zzrt = zzdi();
        long jZzh = zzh(byte[].class);
        zzzn = jZzh;
        zzzo = zzh(boolean[].class);
        zzzp = zzi(boolean[].class);
        zzzq = zzh(int[].class);
        zzzr = zzi(int[].class);
        zzzs = zzh(long[].class);
        zzzt = zzi(long[].class);
        zzzu = zzh(float[].class);
        zzzv = zzi(float[].class);
        zzzw = zzh(double[].class);
        zzzx = zzi(double[].class);
        zzzy = zzh(java.lang.Object[].class);
        zzzz = zzi(java.lang.Object[].class);
        java.lang.reflect.Field fieldZzdk = zzdk();
        zzaaa = (fieldZzdk == null || zzdVar == null) ? -1L : zzdVar.zzaad.objectFieldOffset(fieldZzdk);
        zzaab = (int) (7 & jZzh);
        zzaac = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }
}
