package com.google.android.gms.flags;

/* JADX INFO: loaded from: classes.dex */
public final class Singletons {
    private static com.google.android.gms.flags.Singletons zzl;
    private final com.google.android.gms.flags.FlagRegistry zzm = new com.google.android.gms.flags.FlagRegistry();
    private final com.google.android.gms.flags.zzb zzn = new com.google.android.gms.flags.zzb();

    private Singletons() {
    }

    private static com.google.android.gms.flags.Singletons zzc() {
        com.google.android.gms.flags.Singletons singletons;
        synchronized (com.google.android.gms.flags.Singletons.class) {
            singletons = zzl;
        }
        return singletons;
    }

    public static com.google.android.gms.flags.FlagRegistry flagRegistry() {
        return zzc().zzm;
    }

    public static com.google.android.gms.flags.zzb zzd() {
        return zzc().zzn;
    }

    static {
        com.google.android.gms.flags.Singletons singletons = new com.google.android.gms.flags.Singletons();
        synchronized (com.google.android.gms.flags.Singletons.class) {
            zzl = singletons;
        }
    }
}
