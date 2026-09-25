package com.google.android.gms.flags;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class Flag<T> {
    private final java.lang.String mKey;
    private final int zze;
    private final T zzf;

    private Flag(int i, java.lang.String str, T t) {
        this.zze = i;
        this.mKey = str;
        this.zzf = t;
        com.google.android.gms.flags.Singletons.flagRegistry().zza(this);
    }

    protected abstract T zza(com.google.android.gms.flags.zzc zzcVar);

    @java.lang.Deprecated
    public static class BooleanFlag extends com.google.android.gms.flags.Flag<java.lang.Boolean> {
        public BooleanFlag(int i, java.lang.String str, java.lang.Boolean bool) {
            super(i, str, bool);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.flags.Flag
        /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean zza(com.google.android.gms.flags.zzc zzcVar) {
            try {
                return java.lang.Boolean.valueOf(zzcVar.getBooleanFlagValue(getKey(), zzb().booleanValue(), getSource()));
            } catch (android.os.RemoteException unused) {
                return zzb();
            }
        }
    }

    @java.lang.Deprecated
    public static class IntegerFlag extends com.google.android.gms.flags.Flag<java.lang.Integer> {
        public IntegerFlag(int i, java.lang.String str, java.lang.Integer num) {
            super(i, str, num);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.flags.Flag
        /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public final java.lang.Integer zza(com.google.android.gms.flags.zzc zzcVar) {
            try {
                return java.lang.Integer.valueOf(zzcVar.getIntFlagValue(getKey(), zzb().intValue(), getSource()));
            } catch (android.os.RemoteException unused) {
                return zzb();
            }
        }
    }

    @java.lang.Deprecated
    public static class LongFlag extends com.google.android.gms.flags.Flag<java.lang.Long> {
        public LongFlag(int i, java.lang.String str, java.lang.Long l) {
            super(i, str, l);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.flags.Flag
        /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Long zza(com.google.android.gms.flags.zzc zzcVar) {
            try {
                return java.lang.Long.valueOf(zzcVar.getLongFlagValue(getKey(), zzb().longValue(), getSource()));
            } catch (android.os.RemoteException unused) {
                return zzb();
            }
        }
    }

    @java.lang.Deprecated
    public static class StringFlag extends com.google.android.gms.flags.Flag<java.lang.String> {
        public StringFlag(int i, java.lang.String str, java.lang.String str2) {
            super(i, str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.flags.Flag
        /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
        public final java.lang.String zza(com.google.android.gms.flags.zzc zzcVar) {
            try {
                return zzcVar.getStringFlagValue(getKey(), zzb(), getSource());
            } catch (android.os.RemoteException unused) {
                return zzb();
            }
        }
    }

    public final java.lang.String getKey() {
        return this.mKey;
    }

    public final T zzb() {
        return this.zzf;
    }

    public T get() {
        return (T) com.google.android.gms.flags.Singletons.zzd().zzb(this);
    }

    @java.lang.Deprecated
    public static com.google.android.gms.flags.Flag.BooleanFlag define(int i, java.lang.String str, java.lang.Boolean bool) {
        return new com.google.android.gms.flags.Flag.BooleanFlag(i, str, bool);
    }

    @java.lang.Deprecated
    public static com.google.android.gms.flags.Flag.IntegerFlag define(int i, java.lang.String str, int i2) {
        return new com.google.android.gms.flags.Flag.IntegerFlag(i, str, java.lang.Integer.valueOf(i2));
    }

    @java.lang.Deprecated
    public static com.google.android.gms.flags.Flag.LongFlag define(int i, java.lang.String str, long j) {
        return new com.google.android.gms.flags.Flag.LongFlag(i, str, java.lang.Long.valueOf(j));
    }

    @java.lang.Deprecated
    public static com.google.android.gms.flags.Flag.StringFlag define(int i, java.lang.String str, java.lang.String str2) {
        return new com.google.android.gms.flags.Flag.StringFlag(i, str, str2);
    }

    @java.lang.Deprecated
    public final int getSource() {
        return this.zze;
    }
}
