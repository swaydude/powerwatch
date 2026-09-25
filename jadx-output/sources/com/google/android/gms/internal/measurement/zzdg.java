package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdg {
    private static final com.google.android.gms.internal.measurement.zzdf zza;
    private static final int zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
    static final class zza extends com.google.android.gms.internal.measurement.zzdf {
        zza() {
        }

        @Override // com.google.android.gms.internal.measurement.zzdf
        public final void zza(java.lang.Throwable th, java.lang.Throwable th2) {
        }
    }

    public static void zza(java.lang.Throwable th, java.lang.Throwable th2) {
        zza.zza(th, th2);
    }

    private static java.lang.Integer zza() {
        try {
            return (java.lang.Integer) java.lang.Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (java.lang.Exception e) {
            java.lang.System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(java.lang.System.err);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:5:0x0007, B:7:0x000f, B:8:0x0015, B:10:0x001e, B:11:0x0024), top: B:25:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:5:0x0007, B:7:0x000f, B:8:0x0015, B:10:0x001e, B:11:0x0024), top: B:25:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0015 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:5:0x0007, B:7:0x000f, B:8:0x0015, B:10:0x001e, B:11:0x0024), top: B:25:0x0007 }] */
    static {
        java.lang.Integer numZza;
        com.google.android.gms.internal.measurement.zzdf zzaVar;
        try {
            numZza = zza();
            if (numZza != null) {
                try {
                    if (numZza.intValue() >= 19) {
                        zzaVar = new com.google.android.gms.internal.measurement.zzdk();
                    } else if (!java.lang.Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                        zzaVar = new com.google.android.gms.internal.measurement.zzdj();
                    } else {
                        zzaVar = new com.google.android.gms.internal.measurement.zzdg.zza();
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    java.io.PrintStream printStream = java.lang.System.err;
                    java.lang.String name = com.google.android.gms.internal.measurement.zzdg.zza.class.getName();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 133);
                    sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
                    sb.append(name);
                    sb.append("will be used. The error is: ");
                    printStream.println(sb.toString());
                    th.printStackTrace(java.lang.System.err);
                    zzaVar = new com.google.android.gms.internal.measurement.zzdg.zza();
                }
            } else if (!java.lang.Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                zzaVar = new com.google.android.gms.internal.measurement.zzdj();
            } else {
                zzaVar = new com.google.android.gms.internal.measurement.zzdg.zza();
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            numZza = null;
        }
        zza = zzaVar;
        zzb = numZza != null ? numZza.intValue() : 1;
    }
}
