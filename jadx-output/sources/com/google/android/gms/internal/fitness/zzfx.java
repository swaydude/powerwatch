package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class zzfx {
    private static volatile boolean zzrz = false;
    private static boolean zzsa = true;
    private static volatile com.google.android.gms.internal.fitness.zzfx zzsc;
    private final java.util.Map<java.lang.Object, java.lang.Object> zzse;
    private static final java.lang.Class<?> zzsb = zzaz();
    private static final com.google.android.gms.internal.fitness.zzfx zzsd = new com.google.android.gms.internal.fitness.zzfx(true);

    private static java.lang.Class<?> zzaz() {
        try {
            return java.lang.Class.forName("com.google.protobuf.Extension");
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    public static com.google.android.gms.internal.fitness.zzfx zzba() {
        com.google.android.gms.internal.fitness.zzfx zzfxVar = zzsc;
        if (zzfxVar == null) {
            synchronized (com.google.android.gms.internal.fitness.zzfx.class) {
                zzfxVar = zzsc;
                if (zzfxVar == null) {
                    zzfxVar = zzsd;
                    zzsc = zzfxVar;
                }
            }
        }
        return zzfxVar;
    }

    zzfx() {
        this.zzse = new java.util.HashMap();
    }

    private zzfx(boolean z) {
        this.zzse = java.util.Collections.emptyMap();
    }
}
