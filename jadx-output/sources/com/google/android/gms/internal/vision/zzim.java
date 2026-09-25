package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzim {
    private static final com.google.android.gms.internal.vision.zzik zzzl = zzhn();
    private static final com.google.android.gms.internal.vision.zzik zzzm = new com.google.android.gms.internal.vision.zzij();

    static com.google.android.gms.internal.vision.zzik zzhl() {
        return zzzl;
    }

    static com.google.android.gms.internal.vision.zzik zzhm() {
        return zzzm;
    }

    private static com.google.android.gms.internal.vision.zzik zzhn() {
        try {
            return (com.google.android.gms.internal.vision.zzik) java.lang.Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
