package com.google.android.play.core.splitcompat;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    private static java.util.concurrent.ThreadPoolExecutor a;
    private final java.lang.String b;

    public a(java.lang.String str) {
        int iMyUid = android.os.Process.myUid();
        int iMyPid = android.os.Process.myPid();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(39);
        sb.append("UID: [");
        sb.append(iMyUid);
        sb.append("]  PID: [");
        sb.append(iMyPid);
        sb.append("] ");
        java.lang.String strValueOf = java.lang.String.valueOf(sb.toString());
        java.lang.String strValueOf2 = java.lang.String.valueOf(str);
        this.b = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new java.lang.String(strValueOf);
    }

    private int a(int i, java.lang.String str, java.lang.Object[] objArr) {
        if (android.util.Log.isLoggable("PlayCore", i)) {
            return android.util.Log.i("PlayCore", a(this.b, str, objArr));
        }
        return 0;
    }

    private static java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            try {
                str2 = java.lang.String.format(java.util.Locale.US, str2, objArr);
            } catch (java.util.IllegalFormatException e) {
                java.lang.String strValueOf = java.lang.String.valueOf(str2);
                android.util.Log.e("PlayCore", strValueOf.length() != 0 ? "Unable to format ".concat(strValueOf) : new java.lang.String("Unable to format "), e);
                java.lang.String strJoin = android.text.TextUtils.join(", ", objArr);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 3 + java.lang.String.valueOf(strJoin).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(strJoin);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 3 + java.lang.String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    public static java.util.concurrent.Executor a() {
        if (a == null) {
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(1, 1, 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.play.core.splitcompat.d());
            a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return a;
    }

    public int a(java.lang.String str, java.lang.Object... objArr) {
        return a(4, str, objArr);
    }

    public int a(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            return android.util.Log.e("PlayCore", a(this.b, str, objArr), th);
        }
        return 0;
    }

    public int b(java.lang.String str, java.lang.Object... objArr) {
        return a(3, str, objArr);
    }

    public int c(java.lang.String str, java.lang.Object... objArr) {
        return a(5, str, objArr);
    }

    public int d(java.lang.String str, java.lang.Object... objArr) {
        return a(6, str, objArr);
    }
}
