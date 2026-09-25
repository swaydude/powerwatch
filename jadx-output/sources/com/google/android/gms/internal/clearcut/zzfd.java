package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzfd {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.android.gms.internal.clearcut.zzfd.class.getName());
    private static final java.lang.Class<?> zzfb;
    private static final boolean zzfy;
    private static final sun.misc.Unsafe zzmh;
    private static final boolean zzpg;
    private static final boolean zzph;
    private static final com.google.android.gms.internal.clearcut.zzfd.zzd zzpi;
    private static final boolean zzpj;
    private static final long zzpk;
    private static final long zzpl;
    private static final long zzpm;
    private static final long zzpn;
    private static final long zzpo;
    private static final long zzpp;
    private static final long zzpq;
    private static final long zzpr;
    private static final long zzps;
    private static final long zzpt;
    private static final long zzpu;
    private static final long zzpv;
    private static final long zzpw;
    private static final long zzpx;
    private static final long zzpy;
    private static final boolean zzpz;

    static final class zza extends com.google.android.gms.internal.clearcut.zzfd.zzd {
        zza(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(long j, byte b) {
            libcore.io.Memory.pokeByte((int) (j & (-1)), b);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(java.lang.Object obj, long j, double d) {
            zza(obj, j, java.lang.Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(java.lang.Object obj, long j, float f) {
            zza(obj, j, java.lang.Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(java.lang.Object obj, long j, boolean z) {
            if (com.google.android.gms.internal.clearcut.zzfd.zzpz) {
                com.google.android.gms.internal.clearcut.zzfd.zzb(obj, j, z);
            } else {
                com.google.android.gms.internal.clearcut.zzfd.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(byte[] bArr, long j, long j2, long j3) {
            libcore.io.Memory.pokeByteArray((int) (j2 & (-1)), bArr, (int) j, (int) j3);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zze(java.lang.Object obj, long j, byte b) {
            if (com.google.android.gms.internal.clearcut.zzfd.zzpz) {
                com.google.android.gms.internal.clearcut.zzfd.zza(obj, j, b);
            } else {
                com.google.android.gms.internal.clearcut.zzfd.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final boolean zzl(java.lang.Object obj, long j) {
            return com.google.android.gms.internal.clearcut.zzfd.zzpz ? com.google.android.gms.internal.clearcut.zzfd.zzr(obj, j) : com.google.android.gms.internal.clearcut.zzfd.zzs(obj, j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final float zzm(java.lang.Object obj, long j) {
            return java.lang.Float.intBitsToFloat(zzj(obj, j));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final double zzn(java.lang.Object obj, long j) {
            return java.lang.Double.longBitsToDouble(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final byte zzx(java.lang.Object obj, long j) {
            return com.google.android.gms.internal.clearcut.zzfd.zzpz ? com.google.android.gms.internal.clearcut.zzfd.zzp(obj, j) : com.google.android.gms.internal.clearcut.zzfd.zzq(obj, j);
        }
    }

    static final class zzb extends com.google.android.gms.internal.clearcut.zzfd.zzd {
        zzb(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(long j, byte b) {
            libcore.io.Memory.pokeByte(j, b);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(java.lang.Object obj, long j, double d) {
            zza(obj, j, java.lang.Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(java.lang.Object obj, long j, float f) {
            zza(obj, j, java.lang.Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(java.lang.Object obj, long j, boolean z) {
            if (com.google.android.gms.internal.clearcut.zzfd.zzpz) {
                com.google.android.gms.internal.clearcut.zzfd.zzb(obj, j, z);
            } else {
                com.google.android.gms.internal.clearcut.zzfd.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(byte[] bArr, long j, long j2, long j3) {
            libcore.io.Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zze(java.lang.Object obj, long j, byte b) {
            if (com.google.android.gms.internal.clearcut.zzfd.zzpz) {
                com.google.android.gms.internal.clearcut.zzfd.zza(obj, j, b);
            } else {
                com.google.android.gms.internal.clearcut.zzfd.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final boolean zzl(java.lang.Object obj, long j) {
            return com.google.android.gms.internal.clearcut.zzfd.zzpz ? com.google.android.gms.internal.clearcut.zzfd.zzr(obj, j) : com.google.android.gms.internal.clearcut.zzfd.zzs(obj, j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final float zzm(java.lang.Object obj, long j) {
            return java.lang.Float.intBitsToFloat(zzj(obj, j));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final double zzn(java.lang.Object obj, long j) {
            return java.lang.Double.longBitsToDouble(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final byte zzx(java.lang.Object obj, long j) {
            return com.google.android.gms.internal.clearcut.zzfd.zzpz ? com.google.android.gms.internal.clearcut.zzfd.zzp(obj, j) : com.google.android.gms.internal.clearcut.zzfd.zzq(obj, j);
        }
    }

    static final class zzc extends com.google.android.gms.internal.clearcut.zzfd.zzd {
        zzc(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(long j, byte b) {
            this.zzqa.putByte(j, b);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(java.lang.Object obj, long j, double d) {
            this.zzqa.putDouble(obj, j, d);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(java.lang.Object obj, long j, float f) {
            this.zzqa.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(java.lang.Object obj, long j, boolean z) {
            this.zzqa.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(byte[] bArr, long j, long j2, long j3) {
            this.zzqa.copyMemory(bArr, com.google.android.gms.internal.clearcut.zzfd.zzpk + j, (java.lang.Object) null, j2, j3);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zze(java.lang.Object obj, long j, byte b) {
            this.zzqa.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final boolean zzl(java.lang.Object obj, long j) {
            return this.zzqa.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final float zzm(java.lang.Object obj, long j) {
            return this.zzqa.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final double zzn(java.lang.Object obj, long j) {
            return this.zzqa.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final byte zzx(java.lang.Object obj, long j) {
            return this.zzqa.getByte(obj, j);
        }
    }

    static abstract class zzd {
        sun.misc.Unsafe zzqa;

        zzd(sun.misc.Unsafe unsafe) {
            this.zzqa = unsafe;
        }

        public final long zza(java.lang.reflect.Field field) {
            return this.zzqa.objectFieldOffset(field);
        }

        public abstract void zza(long j, byte b);

        public abstract void zza(java.lang.Object obj, long j, double d);

        public abstract void zza(java.lang.Object obj, long j, float f);

        public final void zza(java.lang.Object obj, long j, int i) {
            this.zzqa.putInt(obj, j, i);
        }

        public final void zza(java.lang.Object obj, long j, long j2) {
            this.zzqa.putLong(obj, j, j2);
        }

        public abstract void zza(java.lang.Object obj, long j, boolean z);

        public abstract void zza(byte[] bArr, long j, long j2, long j3);

        public abstract void zze(java.lang.Object obj, long j, byte b);

        public final int zzj(java.lang.Object obj, long j) {
            return this.zzqa.getInt(obj, j);
        }

        public final long zzk(java.lang.Object obj, long j) {
            return this.zzqa.getLong(obj, j);
        }

        public abstract boolean zzl(java.lang.Object obj, long j);

        public abstract float zzm(java.lang.Object obj, long j);

        public abstract double zzn(java.lang.Object obj, long j);

        public abstract byte zzx(java.lang.Object obj, long j);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0035  */
    static {
        com.google.android.gms.internal.clearcut.zzfd.zzd zzcVar;
        sun.misc.Unsafe unsafeZzef = zzef();
        zzmh = unsafeZzef;
        zzfb = com.google.android.gms.internal.clearcut.zzaw.zzy();
        boolean zZzi = zzi(java.lang.Long.TYPE);
        zzpg = zZzi;
        boolean zZzi2 = zzi(java.lang.Integer.TYPE);
        zzph = zZzi2;
        java.lang.reflect.Field field = null;
        if (unsafeZzef == null) {
            zzcVar = null;
        } else if (!com.google.android.gms.internal.clearcut.zzaw.zzx()) {
            zzcVar = new com.google.android.gms.internal.clearcut.zzfd.zzc(unsafeZzef);
        } else if (zZzi) {
            zzcVar = new com.google.android.gms.internal.clearcut.zzfd.zzb(unsafeZzef);
        } else if (zZzi2) {
            zzcVar = new com.google.android.gms.internal.clearcut.zzfd.zza(unsafeZzef);
        } else {
            zzcVar = null;
        }
        zzpi = zzcVar;
        zzpj = zzeh();
        zzfy = zzeg();
        zzpk = zzg(byte[].class);
        zzpl = zzg(boolean[].class);
        zzpm = zzh(boolean[].class);
        zzpn = zzg(int[].class);
        zzpo = zzh(int[].class);
        zzpp = zzg(long[].class);
        zzpq = zzh(long[].class);
        zzpr = zzg(float[].class);
        zzps = zzh(float[].class);
        zzpt = zzg(double[].class);
        zzpu = zzh(double[].class);
        zzpv = zzg(java.lang.Object[].class);
        zzpw = zzh(java.lang.Object[].class);
        zzpx = zzb(zzei());
        java.lang.reflect.Field fieldZzb = zzb(java.lang.String.class, "value");
        if (fieldZzb != null && fieldZzb.getType() == char[].class) {
            field = fieldZzb;
        }
        zzpy = zzb(field);
        zzpz = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    private zzfd() {
    }

    static byte zza(byte[] bArr, long j) {
        return zzpi.zzx(bArr, zzpk + j);
    }

    static long zza(java.lang.reflect.Field field) {
        return zzpi.zza(field);
    }

    static void zza(long j, byte b) {
        zzpi.zza(j, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(java.lang.Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iZzj = zzj(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (iZzj & (~(255 << i))));
    }

    static void zza(java.lang.Object obj, long j, double d) {
        zzpi.zza(obj, j, d);
    }

    static void zza(java.lang.Object obj, long j, float f) {
        zzpi.zza(obj, j, f);
    }

    static void zza(java.lang.Object obj, long j, int i) {
        zzpi.zza(obj, j, i);
    }

    static void zza(java.lang.Object obj, long j, long j2) {
        zzpi.zza(obj, j, j2);
    }

    static void zza(java.lang.Object obj, long j, java.lang.Object obj2) {
        zzpi.zzqa.putObject(obj, j, obj2);
    }

    static void zza(java.lang.Object obj, long j, boolean z) {
        zzpi.zza(obj, j, z);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzpi.zze(bArr, zzpk + j, b);
    }

    static void zza(byte[] bArr, long j, long j2, long j3) {
        zzpi.zza(bArr, j, j2, j3);
    }

    private static long zzb(java.lang.reflect.Field field) {
        com.google.android.gms.internal.clearcut.zzfd.zzd zzdVar;
        if (field == null || (zzdVar = zzpi) == null) {
            return -1L;
        }
        return zzdVar.zza(field);
    }

    static long zzb(java.nio.ByteBuffer byteBuffer) {
        return zzpi.zzk(byteBuffer, zzpx);
    }

    private static java.lang.reflect.Field zzb(java.lang.Class<?> cls, java.lang.String str) {
        try {
            java.lang.reflect.Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(java.lang.Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zzj(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(java.lang.Object obj, long j, boolean z) {
        zza(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(java.lang.Object obj, long j, boolean z) {
        zzb(obj, j, z ? (byte) 1 : (byte) 0);
    }

    static boolean zzed() {
        return zzfy;
    }

    static boolean zzee() {
        return zzpj;
    }

    static sun.misc.Unsafe zzef() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.clearcut.zzfe());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static boolean zzeg() {
        sun.misc.Unsafe unsafe = zzmh;
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
            if (com.google.android.gms.internal.clearcut.zzaw.zzx()) {
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

    private static boolean zzeh() {
        sun.misc.Unsafe unsafe = zzmh;
        if (unsafe == null) {
            return false;
        }
        try {
            java.lang.Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
            if (zzei() == null) {
                return false;
            }
            if (com.google.android.gms.internal.clearcut.zzaw.zzx()) {
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

    private static java.lang.reflect.Field zzei() {
        java.lang.reflect.Field fieldZzb;
        if (com.google.android.gms.internal.clearcut.zzaw.zzx() && (fieldZzb = zzb(java.nio.Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldZzb;
        }
        java.lang.reflect.Field fieldZzb2 = zzb(java.nio.Buffer.class, "address");
        if (fieldZzb2 == null || fieldZzb2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return fieldZzb2;
    }

    private static int zzg(java.lang.Class<?> cls) {
        if (zzfy) {
            return zzpi.zzqa.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzh(java.lang.Class<?> cls) {
        if (zzfy) {
            return zzpi.zzqa.arrayIndexScale(cls);
        }
        return -1;
    }

    private static boolean zzi(java.lang.Class<?> cls) {
        if (!com.google.android.gms.internal.clearcut.zzaw.zzx()) {
            return false;
        }
        try {
            java.lang.Class<?> cls2 = zzfb;
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

    static int zzj(java.lang.Object obj, long j) {
        return zzpi.zzj(obj, j);
    }

    static long zzk(java.lang.Object obj, long j) {
        return zzpi.zzk(obj, j);
    }

    static boolean zzl(java.lang.Object obj, long j) {
        return zzpi.zzl(obj, j);
    }

    static float zzm(java.lang.Object obj, long j) {
        return zzpi.zzm(obj, j);
    }

    static double zzn(java.lang.Object obj, long j) {
        return zzpi.zzn(obj, j);
    }

    static java.lang.Object zzo(java.lang.Object obj, long j) {
        return zzpi.zzqa.getObject(obj, j);
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
    public static boolean zzr(java.lang.Object obj, long j) {
        return zzp(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzs(java.lang.Object obj, long j) {
        return zzq(obj, j) != 0;
    }
}
