package com.baidu.mapapi.http;

/* JADX INFO: loaded from: classes.dex */
public class AsyncHttpClient {
    private int a = 10000;
    private int b = 10000;
    private java.util.concurrent.ExecutorService c = java.util.concurrent.Executors.newCachedThreadPool();

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class a implements java.lang.Runnable {
        private a() {
        }

        /* synthetic */ a(com.baidu.mapapi.http.a aVar) {
            this();
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    static {
        if (android.os.Build.VERSION.SDK_INT <= 8) {
            java.lang.System.setProperty("http.keepAlive", "false");
        }
    }

    public void get(java.lang.String str, com.baidu.mapapi.http.HttpClient.ProtoResultCallback protoResultCallback) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("URI cannot be null");
        }
        this.c.submit(new com.baidu.mapapi.http.a(this, protoResultCallback, str));
    }

    protected boolean isAuthorized() {
        int iPermissionCheck = com.baidu.mapsdkplatform.comapi.util.PermissionCheck.permissionCheck();
        return iPermissionCheck == 0 || iPermissionCheck == 602 || iPermissionCheck == 601;
    }
}
