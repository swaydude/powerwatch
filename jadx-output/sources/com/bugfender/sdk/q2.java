package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class q2 {
    private static final int d = -1;
    private final java.net.URL a;
    private final java.lang.String b;
    private final java.lang.String c;

    public q2(java.net.URL url, java.lang.String str, java.lang.String str2) {
        this.a = url;
        this.b = str;
        this.c = str2;
    }

    private java.lang.String a(java.io.InputStream inputStream) throws java.io.IOException {
        if (inputStream == null) {
            return null;
        }
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        char[] cArr = new char[4096];
        while (true) {
            int i = bufferedReader.read(cArr);
            if (-1 == i) {
                bufferedReader.close();
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, i);
        }
    }

    public java.lang.String a(java.lang.String str, java.lang.String str2) throws com.bugfender.sdk.p1 {
        return a(str, str2, -1L);
    }

    public java.lang.String a(java.lang.String str, java.lang.String str2, long j) throws com.bugfender.sdk.p1 {
        try {
            try {
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(this.a, str).openConnection();
                try {
                    try {
                        httpURLConnection.setRequestProperty("User-Agent", "bugfender-android/" + this.b);
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setUseCaches(false);
                        httpURLConnection.setDefaultUseCaches(false);
                        httpURLConnection.setChunkedStreamingMode(0);
                        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(20L));
                        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(60L));
                        httpURLConnection.setRequestProperty(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_TYPE, "application/json;charset=utf-8");
                        httpURLConnection.setRequestProperty("X-App-Token", this.c);
                        if (j != -1) {
                            httpURLConnection.setRequestProperty("X-App-Session", java.lang.String.valueOf(j));
                        }
                        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(httpURLConnection.getOutputStream());
                        bufferedOutputStream.write(str2.getBytes());
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        httpURLConnection.connect();
                        int responseCode = httpURLConnection.getResponseCode();
                        if (200 <= responseCode && responseCode <= 299) {
                            java.lang.String strA = a(httpURLConnection.getInputStream());
                            httpURLConnection.disconnect();
                            return strA;
                        }
                        throw new com.bugfender.sdk.p1(1, "Error status: " + responseCode + " / Response Message: " + httpURLConnection.getResponseMessage() + " / Error Body: " + a(httpURLConnection.getErrorStream()));
                    } catch (java.io.IOException e) {
                        java.lang.String message = e.getMessage();
                        if (message == null || !message.contains("EPERM (Operation not permitted)")) {
                            throw new com.bugfender.sdk.p1(1, "IO Exception: " + message);
                        }
                        throw new com.bugfender.sdk.p1(0, "IO Exception: " + message);
                    }
                } catch (java.lang.Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (java.io.IOException e2) {
                throw new com.bugfender.sdk.p1(1, "IO Exception: " + e2.getMessage());
            }
        } catch (java.net.MalformedURLException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }
}
