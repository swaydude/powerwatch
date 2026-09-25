package com.baidu.mapsdkplatform.comapi.b.a;

/* JADX INFO: loaded from: classes.dex */
public class a implements java.lang.Thread.UncaughtExceptionHandler {
    private static volatile boolean b = false;
    private java.lang.String a;
    private java.lang.Thread.UncaughtExceptionHandler c;

    /* JADX INFO: renamed from: com.baidu.mapsdkplatform.comapi.b.a.a$a, reason: collision with other inner class name */
    private static class C0010a {
        private static final com.baidu.mapsdkplatform.comapi.b.a.a a = new com.baidu.mapsdkplatform.comapi.b.a.a();
    }

    private a() {
        this.a = "";
        this.c = java.lang.Thread.getDefaultUncaughtExceptionHandler();
    }

    public static com.baidu.mapsdkplatform.comapi.b.a.a a() {
        return com.baidu.mapsdkplatform.comapi.b.a.a.C0010a.a;
    }

    private void a(java.lang.Throwable th) {
        java.lang.String str;
        if (th == null) {
            return;
        }
        java.lang.String string = th.toString();
        if (string.isEmpty() || string.contains("BDMapSDKException")) {
            return;
        }
        if (string.contains("com.baidu.platform") || string.contains("com.baidu.mapsdkplatform") || string.contains("com.baidu.mapsdkvi")) {
            try {
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    cause.printStackTrace(printWriter);
                }
                printWriter.close();
                java.lang.String string2 = stringWriter.toString();
                if (!string2.isEmpty() && (str = this.a) != null && !str.isEmpty()) {
                    java.io.File file = new java.io.File(java.net.URLEncoder.encode(this.a + (java.lang.System.currentTimeMillis() / 1000) + ".txt", io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8));
                    if (file.exists() || file.createNewFile()) {
                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                        fileOutputStream.write(string2.getBytes());
                        fileOutputStream.close();
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    protected void a(java.lang.String str) {
        this.a = str;
        if (java.lang.Thread.getDefaultUncaughtExceptionHandler() instanceof com.baidu.mapsdkplatform.comapi.b.a.a) {
            return;
        }
        java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        if (b) {
            return;
        }
        b = true;
        a(th);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
