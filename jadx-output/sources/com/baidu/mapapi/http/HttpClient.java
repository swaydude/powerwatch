package com.baidu.mapapi.http;

/* JADX INFO: loaded from: classes.dex */
public class HttpClient {
    public static boolean isHttpsEnable = true;
    java.net.HttpURLConnection a;
    private java.lang.String b = null;
    private java.lang.String c = null;
    private int d;
    private int e;
    private java.lang.String f;
    private com.baidu.mapapi.http.HttpClient.ProtoResultCallback g;

    public enum HttpStateError {
        NO_ERROR,
        NETWORK_ERROR,
        INNER_ERROR,
        REQUEST_ERROR,
        SERVER_ERROR
    }

    public static abstract class ProtoResultCallback {
        public abstract void onFailed(com.baidu.mapapi.http.HttpClient.HttpStateError httpStateError);

        public abstract void onSuccess(java.lang.String str);
    }

    public HttpClient(java.lang.String str, com.baidu.mapapi.http.HttpClient.ProtoResultCallback protoResultCallback) {
        this.f = str;
        this.g = protoResultCallback;
    }

    private java.net.HttpURLConnection a() {
        java.net.HttpURLConnection httpURLConnection;
        try {
            java.net.URL url = new java.net.URL(this.b);
            if (isHttpsEnable) {
                httpURLConnection = (javax.net.ssl.HttpsURLConnection) url.openConnection();
                ((javax.net.ssl.HttpsURLConnection) httpURLConnection).setHostnameVerifier(new com.baidu.mapapi.http.b(this));
            } else {
                httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
            }
            httpURLConnection.setRequestMethod(this.f);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setConnectTimeout(this.d);
            httpURLConnection.setReadTimeout(this.e);
            return httpURLConnection;
        } catch (java.lang.Exception e) {
            android.util.Log.e("HttpClient", "url connect failed");
            if (com.baidu.mapapi.common.Logger.debugEnable()) {
                e.printStackTrace();
                return null;
            }
            com.baidu.mapapi.common.Logger.logW("HttpClient", e.getMessage());
            return null;
        }
    }

    public static java.lang.String getAuthToken() {
        return com.baidu.mapsdkplatform.comapi.util.h.d;
    }

    public static java.lang.String getPhoneInfo() {
        return com.baidu.mapsdkplatform.comapi.util.h.c();
    }

    protected boolean checkNetwork() {
        android.net.NetworkInfo activeNetworkInfo;
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.baidu.mapapi.JNIInitializer.getCachedContext().getSystemService("connectivity");
            return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) ? false : true;
        } catch (java.lang.Exception e) {
            if (com.baidu.mapapi.common.Logger.debugEnable()) {
                e.printStackTrace();
            } else {
                com.baidu.mapapi.common.Logger.logW("HttpClient", e.getMessage());
            }
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.StringBuilder] */
    protected void request(java.lang.String str) throws java.lang.Throwable {
        java.io.BufferedReader bufferedReader;
        java.lang.Throwable th;
        ?? r1;
        java.io.BufferedReader bufferedReader2;
        java.lang.Exception e;
        ?? responseCode;
        com.baidu.mapapi.http.HttpClient.HttpStateError httpStateError;
        this.b = str;
        if (!checkNetwork()) {
            this.g.onFailed(com.baidu.mapapi.http.HttpClient.HttpStateError.NETWORK_ERROR);
            return;
        }
        java.net.HttpURLConnection httpURLConnectionA = a();
        this.a = httpURLConnectionA;
        if (httpURLConnectionA == null) {
            android.util.Log.e("HttpClient", "url connection failed");
            this.g.onFailed(com.baidu.mapapi.http.HttpClient.HttpStateError.INNER_ERROR);
            return;
        }
        if (android.text.TextUtils.isEmpty(this.b)) {
            this.g.onFailed(com.baidu.mapapi.http.HttpClient.HttpStateError.REQUEST_ERROR);
            return;
        }
        try {
            this.a.connect();
            try {
                try {
                    responseCode = this.a.getResponseCode();
                    try {
                        if (200 != responseCode) {
                            android.util.Log.e("HttpClient", "responseCode is: " + responseCode);
                            if (responseCode >= 500) {
                                httpStateError = com.baidu.mapapi.http.HttpClient.HttpStateError.SERVER_ERROR;
                            } else {
                                httpStateError = responseCode >= 400 ? com.baidu.mapapi.http.HttpClient.HttpStateError.REQUEST_ERROR : com.baidu.mapapi.http.HttpClient.HttpStateError.INNER_ERROR;
                            }
                            if (com.baidu.mapapi.common.Logger.debugEnable()) {
                                com.baidu.mapapi.common.Logger.logW("HttpClient", this.a.getErrorStream().toString());
                            } else {
                                com.baidu.mapapi.common.Logger.logW("HttpClient", "Get response from server failed, http response code=" + responseCode + ", error=" + httpStateError);
                            }
                            this.g.onFailed(httpStateError);
                            java.net.HttpURLConnection httpURLConnection = this.a;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                                return;
                            }
                            return;
                        }
                        responseCode = this.a.getInputStream();
                        bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader((java.io.InputStream) responseCode, io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8));
                        try {
                            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                            while (true) {
                                int i = bufferedReader2.read();
                                if (i == -1) {
                                    break;
                                } else {
                                    stringBuffer.append((char) i);
                                }
                            }
                            this.c = stringBuffer.toString();
                            if (responseCode != 0) {
                                bufferedReader2.close();
                                responseCode.close();
                            }
                            java.net.HttpURLConnection httpURLConnection2 = this.a;
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            this.g.onSuccess(this.c);
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            if (com.baidu.mapapi.common.Logger.debugEnable()) {
                                e.printStackTrace();
                            } else {
                                com.baidu.mapapi.common.Logger.logW("HttpClient", e.getMessage());
                            }
                            android.util.Log.e("HttpClient", "Catch exception. INNER_ERROR", e);
                            this.g.onFailed(com.baidu.mapapi.http.HttpClient.HttpStateError.INNER_ERROR);
                            if (responseCode != 0 && bufferedReader2 != null) {
                                bufferedReader2.close();
                                responseCode.close();
                            }
                            java.net.HttpURLConnection httpURLConnection3 = this.a;
                            if (httpURLConnection3 != null) {
                                httpURLConnection3.disconnect();
                            }
                        }
                    } catch (java.lang.Exception e3) {
                        bufferedReader2 = null;
                        e = e3;
                    } catch (java.lang.Throwable th2) {
                        bufferedReader = null;
                        th = th2;
                        r1 = responseCode;
                        if (r1 != 0 && bufferedReader != null) {
                            bufferedReader.close();
                            r1.close();
                        }
                        java.net.HttpURLConnection httpURLConnection4 = this.a;
                        if (httpURLConnection4 != null) {
                            httpURLConnection4.disconnect();
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
            } catch (java.lang.Exception e4) {
                bufferedReader2 = null;
                e = e4;
                responseCode = 0;
            } catch (java.lang.Throwable th4) {
                bufferedReader = null;
                th = th4;
                r1 = 0;
            }
        } catch (java.lang.Exception e5) {
            if (com.baidu.mapapi.common.Logger.debugEnable()) {
                e5.printStackTrace();
            } else {
                com.baidu.mapapi.common.Logger.logW("HttpClient", e5.getMessage());
            }
            android.util.Log.e("HttpClient", "Catch connection exception, INNER_ERROR", e5);
            this.g.onFailed(com.baidu.mapapi.http.HttpClient.HttpStateError.INNER_ERROR);
        }
    }

    public void setMaxTimeOut(int i) {
        this.d = i;
    }

    public void setReadTimeOut(int i) {
        this.e = i;
    }
}
