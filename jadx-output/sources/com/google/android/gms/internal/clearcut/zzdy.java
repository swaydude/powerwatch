package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzdy {
    private static final com.google.android.gms.internal.clearcut.zzdw zzna = zzcl();
    private static final com.google.android.gms.internal.clearcut.zzdw zznb = new com.google.android.gms.internal.clearcut.zzdx();

    static com.google.android.gms.internal.clearcut.zzdw zzcj() {
        return zzna;
    }

    static com.google.android.gms.internal.clearcut.zzdw zzck() {
        return zznb;
    }

    private static com.google.android.gms.internal.clearcut.zzdw zzcl() {
        try {
            return (com.google.android.gms.internal.clearcut.zzdw) java.lang.Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
