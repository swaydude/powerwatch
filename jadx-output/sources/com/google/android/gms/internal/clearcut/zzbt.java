package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzbt {
    private static volatile boolean zzgm = false;
    private static final java.lang.Class<?> zzgn = zzam();
    static final com.google.android.gms.internal.clearcut.zzbt zzgo = new com.google.android.gms.internal.clearcut.zzbt(true);
    private final java.util.Map<java.lang.Object, com.google.android.gms.internal.clearcut.zzcg.zzf<?, ?>> zzgp;

    zzbt() {
        this.zzgp = new java.util.HashMap();
    }

    private zzbt(boolean z) {
        this.zzgp = java.util.Collections.emptyMap();
    }

    private static java.lang.Class<?> zzam() {
        try {
            return java.lang.Class.forName("com.google.protobuf.Extension");
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    public static com.google.android.gms.internal.clearcut.zzbt zzan() {
        return com.google.android.gms.internal.clearcut.zzbs.zzal();
    }
}
