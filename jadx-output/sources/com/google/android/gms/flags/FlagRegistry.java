package com.google.android.gms.flags;

/* JADX INFO: loaded from: classes.dex */
public class FlagRegistry {
    private final java.util.Collection<com.google.android.gms.flags.Flag> zzg = new java.util.ArrayList();
    private final java.util.Collection<com.google.android.gms.flags.Flag.StringFlag> zzh = new java.util.ArrayList();
    private final java.util.Collection<com.google.android.gms.flags.Flag.StringFlag> zzi = new java.util.ArrayList();

    public final void zza(com.google.android.gms.flags.Flag flag) {
        this.zzg.add(flag);
    }

    public static void initialize(android.content.Context context) {
        com.google.android.gms.flags.Singletons.zzd().initialize(context);
    }
}
