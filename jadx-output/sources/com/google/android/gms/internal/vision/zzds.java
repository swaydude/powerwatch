package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzds {
    private static final com.google.android.gms.internal.vision.zzdv zzmc;
    private static final int zzmd;

    public static void zza(java.lang.Throwable th, java.lang.Throwable th2) {
        zzmc.zza(th, th2);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    static final class zza extends com.google.android.gms.internal.vision.zzdv {
        zza() {
        }

        @Override // com.google.android.gms.internal.vision.zzdv
        public final void zza(java.lang.Throwable th, java.lang.Throwable th2) {
        }

        @Override // com.google.android.gms.internal.vision.zzdv
        public final void zza(java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public static void zza(java.lang.Throwable th) {
        zzmc.zza(th);
    }

    private static java.lang.Integer zzci() {
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
        java.lang.Integer numZzci;
        com.google.android.gms.internal.vision.zzdv zzaVar;
        try {
            numZzci = zzci();
            if (numZzci != null) {
                try {
                    if (numZzci.intValue() >= 19) {
                        zzaVar = new com.google.android.gms.internal.vision.zzdy();
                    } else if (!java.lang.Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                        zzaVar = new com.google.android.gms.internal.vision.zzdw();
                    } else {
                        zzaVar = new com.google.android.gms.internal.vision.zzds.zza();
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    java.io.PrintStream printStream = java.lang.System.err;
                    java.lang.String name = com.google.android.gms.internal.vision.zzds.zza.class.getName();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 133);
                    sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
                    sb.append(name);
                    sb.append("will be used. The error is: ");
                    printStream.println(sb.toString());
                    th.printStackTrace(java.lang.System.err);
                    zzaVar = new com.google.android.gms.internal.vision.zzds.zza();
                }
            } else if (!java.lang.Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                zzaVar = new com.google.android.gms.internal.vision.zzdw();
            } else {
                zzaVar = new com.google.android.gms.internal.vision.zzds.zza();
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            numZzci = null;
        }
        zzmc = zzaVar;
        zzmd = numZzci != null ? numZzci.intValue() : 1;
    }
}
