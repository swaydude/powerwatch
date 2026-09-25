package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzbx {
    private static final com.google.android.gms.internal.clearcut.zzbu<?> zzgr = new com.google.android.gms.internal.clearcut.zzbv();
    private static final com.google.android.gms.internal.clearcut.zzbu<?> zzgs = zzao();

    private static com.google.android.gms.internal.clearcut.zzbu<?> zzao() {
        try {
            return (com.google.android.gms.internal.clearcut.zzbu) java.lang.Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    static com.google.android.gms.internal.clearcut.zzbu<?> zzap() {
        return zzgr;
    }

    static com.google.android.gms.internal.clearcut.zzbu<?> zzaq() {
        com.google.android.gms.internal.clearcut.zzbu<?> zzbuVar = zzgs;
        if (zzbuVar != null) {
            return zzbuVar;
        }
        throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
