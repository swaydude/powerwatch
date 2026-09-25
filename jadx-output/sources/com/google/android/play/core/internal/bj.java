package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class bj {
    private static final com.google.android.play.core.internal.bi a;
    private static final int b;

    static final class a extends com.google.android.play.core.internal.bi {
        a() {
        }

        @Override // com.google.android.play.core.internal.bi
        public final void a(java.lang.Throwable th, java.lang.Throwable th2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:5:0x0007, B:7:0x000f, B:8:0x0015, B:10:0x001e, B:11:0x0024), top: B:25:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:5:0x0007, B:7:0x000f, B:8:0x0015, B:10:0x001e, B:11:0x0024), top: B:25:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0015 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:5:0x0007, B:7:0x000f, B:8:0x0015, B:10:0x001e, B:11:0x0024), top: B:25:0x0007 }] */
    static {
        java.lang.Integer numA;
        com.google.android.play.core.internal.bi aVar;
        try {
            numA = a();
            if (numA != null) {
                try {
                    if (numA.intValue() >= 19) {
                        aVar = new com.google.android.play.core.internal.bn();
                    } else if (!java.lang.Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                        aVar = new com.google.android.play.core.internal.bm();
                    } else {
                        aVar = new com.google.android.play.core.internal.bj.a();
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    java.io.PrintStream printStream = java.lang.System.err;
                    java.lang.String name = com.google.android.play.core.internal.bj.a.class.getName();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 133);
                    sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
                    sb.append(name);
                    sb.append("will be used. The error is: ");
                    printStream.println(sb.toString());
                    th.printStackTrace(java.lang.System.err);
                    aVar = new com.google.android.play.core.internal.bj.a();
                }
            } else if (!java.lang.Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                aVar = new com.google.android.play.core.internal.bm();
            } else {
                aVar = new com.google.android.play.core.internal.bj.a();
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            numA = null;
        }
        a = aVar;
        b = numA != null ? numA.intValue() : 1;
    }

    private static java.lang.Integer a() {
        try {
            return (java.lang.Integer) java.lang.Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (java.lang.Exception e) {
            java.lang.System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(java.lang.System.err);
            return null;
        }
    }

    public static void a(java.lang.Throwable th, java.lang.Throwable th2) {
        a.a(th, th2);
    }
}
