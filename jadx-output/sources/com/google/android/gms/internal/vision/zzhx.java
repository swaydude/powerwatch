package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhx {
    private static final com.google.android.gms.internal.vision.zzhv zzyq = zzhh();
    private static final com.google.android.gms.internal.vision.zzhv zzyr = new com.google.android.gms.internal.vision.zzhy();

    static com.google.android.gms.internal.vision.zzhv zzhf() {
        return zzyq;
    }

    static com.google.android.gms.internal.vision.zzhv zzhg() {
        return zzyr;
    }

    private static com.google.android.gms.internal.vision.zzhv zzhh() {
        try {
            return (com.google.android.gms.internal.vision.zzhv) java.lang.Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
