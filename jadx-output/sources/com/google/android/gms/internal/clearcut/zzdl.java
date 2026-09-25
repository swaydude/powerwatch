package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzdl {
    private static final com.google.android.gms.internal.clearcut.zzdj zzmf = zzce();
    private static final com.google.android.gms.internal.clearcut.zzdj zzmg = new com.google.android.gms.internal.clearcut.zzdk();

    static com.google.android.gms.internal.clearcut.zzdj zzcc() {
        return zzmf;
    }

    static com.google.android.gms.internal.clearcut.zzdj zzcd() {
        return zzmg;
    }

    private static com.google.android.gms.internal.clearcut.zzdj zzce() {
        try {
            return (com.google.android.gms.internal.clearcut.zzdj) java.lang.Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
