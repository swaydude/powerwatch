package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzib {
    static final boolean zza;
    private static final java.util.logging.Logger zzb = java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.zzib.class.getName());
    private static final sun.misc.Unsafe zzc;
    private static final java.lang.Class<?> zzd;
    private static final boolean zze;
    private static final boolean zzf;
    private static final com.google.android.gms.internal.measurement.zzib.zzd zzg;
    private static final boolean zzh;
    private static final boolean zzi;
    private static final long zzj;
    private static final long zzk;
    private static final long zzl;
    private static final long zzm;
    private static final long zzn;
    private static final long zzo;
    private static final long zzp;
    private static final long zzq;
    private static final long zzr;
    private static final long zzs;
    private static final long zzt;
    private static final long zzu;
    private static final long zzv;
    private static final long zzw;
    private static final int zzx;

    private zzib() {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
    static final class zza extends com.google.android.gms.internal.measurement.zzib.zzd {
        zza(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final byte zza(java.lang.Object obj, long j) {
            if (com.google.android.gms.internal.measurement.zzib.zza) {
                return com.google.android.gms.internal.measurement.zzib.zzk(obj, j);
            }
            return com.google.android.gms.internal.measurement.zzib.zzl(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final void zza(java.lang.Object obj, long j, byte b) {
            if (com.google.android.gms.internal.measurement.zzib.zza) {
                com.google.android.gms.internal.measurement.zzib.zzc(obj, j, b);
            } else {
                com.google.android.gms.internal.measurement.zzib.zzd(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final boolean zzb(java.lang.Object obj, long j) {
            if (com.google.android.gms.internal.measurement.zzib.zza) {
                return com.google.android.gms.internal.measurement.zzib.zzm(obj, j);
            }
            return com.google.android.gms.internal.measurement.zzib.zzn(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final void zza(java.lang.Object obj, long j, boolean z) {
            if (com.google.android.gms.internal.measurement.zzib.zza) {
                com.google.android.gms.internal.measurement.zzib.zzd(obj, j, z);
            } else {
                com.google.android.gms.internal.measurement.zzib.zze(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final float zzc(java.lang.Object obj, long j) {
            return java.lang.Float.intBitsToFloat(zze(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final void zza(java.lang.Object obj, long j, float f) {
            zza(obj, j, java.lang.Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final double zzd(java.lang.Object obj, long j) {
            return java.lang.Double.longBitsToDouble(zzf(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final void zza(java.lang.Object obj, long j, double d) {
            zza(obj, j, java.lang.Double.doubleToLongBits(d));
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
    static final class zzb extends com.google.android.gms.internal.measurement.zzib.zzd {
        zzb(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final byte zza(java.lang.Object obj, long j) {
            return this.zza.getByte(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final void zza(java.lang.Object obj, long j, byte b) {
            this.zza.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final boolean zzb(java.lang.Object obj, long j) {
            return this.zza.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final void zza(java.lang.Object obj, long j, boolean z) {
            this.zza.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final float zzc(java.lang.Object obj, long j) {
            return this.zza.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final void zza(java.lang.Object obj, long j, float f) {
            this.zza.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final double zzd(java.lang.Object obj, long j) {
            return this.zza.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final void zza(java.lang.Object obj, long j, double d) {
            this.zza.putDouble(obj, j, d);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
    static final class zzc extends com.google.android.gms.internal.measurement.zzib.zzd {
        zzc(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final byte zza(java.lang.Object obj, long j) {
            if (com.google.android.gms.internal.measurement.zzib.zza) {
                return com.google.android.gms.internal.measurement.zzib.zzk(obj, j);
            }
            return com.google.android.gms.internal.measurement.zzib.zzl(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final void zza(java.lang.Object obj, long j, byte b) {
            if (com.google.android.gms.internal.measurement.zzib.zza) {
                com.google.android.gms.internal.measurement.zzib.zzc(obj, j, b);
            } else {
                com.google.android.gms.internal.measurement.zzib.zzd(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final boolean zzb(java.lang.Object obj, long j) {
            if (com.google.android.gms.internal.measurement.zzib.zza) {
                return com.google.android.gms.internal.measurement.zzib.zzm(obj, j);
            }
            return com.google.android.gms.internal.measurement.zzib.zzn(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final void zza(java.lang.Object obj, long j, boolean z) {
            if (com.google.android.gms.internal.measurement.zzib.zza) {
                com.google.android.gms.internal.measurement.zzib.zzd(obj, j, z);
            } else {
                com.google.android.gms.internal.measurement.zzib.zze(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final float zzc(java.lang.Object obj, long j) {
            return java.lang.Float.intBitsToFloat(zze(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final void zza(java.lang.Object obj, long j, float f) {
            zza(obj, j, java.lang.Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final double zzd(java.lang.Object obj, long j) {
            return java.lang.Double.longBitsToDouble(zzf(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.zzib.zzd
        public final void zza(java.lang.Object obj, long j, double d) {
            zza(obj, j, java.lang.Double.doubleToLongBits(d));
        }
    }

    static boolean zza() {
        return zzi;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
    static abstract class zzd {
        sun.misc.Unsafe zza;

        zzd(sun.misc.Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract byte zza(java.lang.Object obj, long j);

        public abstract void zza(java.lang.Object obj, long j, byte b);

        public abstract void zza(java.lang.Object obj, long j, double d);

        public abstract void zza(java.lang.Object obj, long j, float f);

        public abstract void zza(java.lang.Object obj, long j, boolean z);

        public abstract boolean zzb(java.lang.Object obj, long j);

        public abstract float zzc(java.lang.Object obj, long j);

        public abstract double zzd(java.lang.Object obj, long j);

        public final int zze(java.lang.Object obj, long j) {
            return this.zza.getInt(obj, j);
        }

        public final void zza(java.lang.Object obj, long j, int i) {
            this.zza.putInt(obj, j, i);
        }

        public final long zzf(java.lang.Object obj, long j) {
            return this.zza.getLong(obj, j);
        }

        public final void zza(java.lang.Object obj, long j, long j2) {
            this.zza.putLong(obj, j, j2);
        }
    }

    static boolean zzb() {
        return zzh;
    }

    static <T> T zza(java.lang.Class<T> cls) {
        try {
            return (T) zzc.allocateInstance(cls);
        } catch (java.lang.InstantiationException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    private static int zzb(java.lang.Class<?> cls) {
        if (zzi) {
            return zzg.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzc(java.lang.Class<?> cls) {
        if (zzi) {
            return zzg.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    static int zza(java.lang.Object obj, long j) {
        return zzg.zze(obj, j);
    }

    static void zza(java.lang.Object obj, long j, int i) {
        zzg.zza(obj, j, i);
    }

    static long zzb(java.lang.Object obj, long j) {
        return zzg.zzf(obj, j);
    }

    static void zza(java.lang.Object obj, long j, long j2) {
        zzg.zza(obj, j, j2);
    }

    static boolean zzc(java.lang.Object obj, long j) {
        return zzg.zzb(obj, j);
    }

    static void zza(java.lang.Object obj, long j, boolean z) {
        zzg.zza(obj, j, z);
    }

    static float zzd(java.lang.Object obj, long j) {
        return zzg.zzc(obj, j);
    }

    static void zza(java.lang.Object obj, long j, float f) {
        zzg.zza(obj, j, f);
    }

    static double zze(java.lang.Object obj, long j) {
        return zzg.zzd(obj, j);
    }

    static void zza(java.lang.Object obj, long j, double d) {
        zzg.zza(obj, j, d);
    }

    static java.lang.Object zzf(java.lang.Object obj, long j) {
        return zzg.zza.getObject(obj, j);
    }

    static void zza(java.lang.Object obj, long j, java.lang.Object obj2) {
        zzg.zza.putObject(obj, j, obj2);
    }

    static byte zza(byte[] bArr, long j) {
        return zzg.zza(bArr, zzj + j);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzg.zza((java.lang.Object) bArr, zzj + j, b);
    }

    static sun.misc.Unsafe zzc() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.measurement.zzid());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static boolean zzd() {
        sun.misc.Unsafe unsafe = zzc;
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
            if (com.google.android.gms.internal.measurement.zzdr.zza()) {
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
            java.util.logging.Logger logger = zzb;
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.lang.String strValueOf = java.lang.String.valueOf(th);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zze() {
        sun.misc.Unsafe unsafe = zzc;
        if (unsafe == null) {
            return false;
        }
        try {
            java.lang.Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
            if (zzf() == null) {
                return false;
            }
            if (com.google.android.gms.internal.measurement.zzdr.zza()) {
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
            java.util.logging.Logger logger = zzb;
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.lang.String strValueOf = java.lang.String.valueOf(th);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzd(java.lang.Class<?> cls) {
        if (!com.google.android.gms.internal.measurement.zzdr.zza()) {
            return false;
        }
        try {
            java.lang.Class<?> cls2 = zzd;
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

    private static java.lang.reflect.Field zzf() {
        java.lang.reflect.Field fieldZza;
        if (com.google.android.gms.internal.measurement.zzdr.zza() && (fieldZza = zza((java.lang.Class<?>) java.nio.Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldZza;
        }
        java.lang.reflect.Field fieldZza2 = zza((java.lang.Class<?>) java.nio.Buffer.class, "address");
        if (fieldZza2 == null || fieldZza2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return fieldZza2;
    }

    private static java.lang.reflect.Field zza(java.lang.Class<?> cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzk(java.lang.Object obj, long j) {
        return (byte) (zza(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzl(java.lang.Object obj, long j) {
        return (byte) (zza(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(java.lang.Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iZza = zza(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (iZza & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(java.lang.Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zza(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzm(java.lang.Object obj, long j) {
        return zzk(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzn(java.lang.Object obj, long j) {
        return zzl(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(java.lang.Object obj, long j, boolean z) {
        zzc(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zze(java.lang.Object obj, long j, boolean z) {
        zzd(obj, j, z ? (byte) 1 : (byte) 0);
    }

    static {
        sun.misc.Unsafe unsafeZzc = zzc();
        zzc = unsafeZzc;
        zzd = com.google.android.gms.internal.measurement.zzdr.zzb();
        boolean zZzd = zzd(java.lang.Long.TYPE);
        zze = zZzd;
        boolean zZzd2 = zzd(java.lang.Integer.TYPE);
        zzf = zZzd2;
        com.google.android.gms.internal.measurement.zzib.zzd zzbVar = null;
        if (unsafeZzc != null) {
            if (!com.google.android.gms.internal.measurement.zzdr.zza()) {
                zzbVar = new com.google.android.gms.internal.measurement.zzib.zzb(unsafeZzc);
            } else if (zZzd) {
                zzbVar = new com.google.android.gms.internal.measurement.zzib.zzc(unsafeZzc);
            } else if (zZzd2) {
                zzbVar = new com.google.android.gms.internal.measurement.zzib.zza(unsafeZzc);
            }
        }
        zzg = zzbVar;
        zzh = zze();
        zzi = zzd();
        long jZzb = zzb(byte[].class);
        zzj = jZzb;
        zzk = zzb(boolean[].class);
        zzl = zzc(boolean[].class);
        zzm = zzb(int[].class);
        zzn = zzc(int[].class);
        zzo = zzb(long[].class);
        zzp = zzc(long[].class);
        zzq = zzb(float[].class);
        zzr = zzc(float[].class);
        zzs = zzb(double[].class);
        zzt = zzc(double[].class);
        zzu = zzb(java.lang.Object[].class);
        zzv = zzc(java.lang.Object[].class);
        java.lang.reflect.Field fieldZzf = zzf();
        zzw = (fieldZzf == null || zzbVar == null) ? -1L : zzbVar.zza.objectFieldOffset(fieldZzf);
        zzx = (int) (7 & jZzb);
        zza = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }
}
