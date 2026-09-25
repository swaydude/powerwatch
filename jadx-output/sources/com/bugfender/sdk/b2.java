package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class b2 implements com.bugfender.sdk.a2 {
    private final android.content.Context a;

    public b2(android.content.Context context) {
        com.bugfender.sdk.w1.a(context, "Context must be not null");
        this.a = context;
    }

    @Override // com.bugfender.sdk.a2
    public boolean a() {
        android.net.NetworkInfo activeNetworkInfo;
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) this.a.getSystemService("connectivity");
            return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
