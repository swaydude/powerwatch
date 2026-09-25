package com.baidu.lbsapi.auth;

/* JADX INFO: loaded from: classes.dex */
public class g {
    private android.content.Context a;
    private java.lang.String b = null;
    private java.util.HashMap<java.lang.String, java.lang.String> c = null;
    private java.lang.String d = null;

    public g(android.content.Context context) {
        this.a = context;
    }

    private java.lang.String a(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo;
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                java.lang.String extraInfo = activeNetworkInfo.getExtraInfo();
                if (extraInfo == null || !(extraInfo.trim().toLowerCase().equals("cmwap") || extraInfo.trim().toLowerCase().equals("uniwap") || extraInfo.trim().toLowerCase().equals("3gwap") || extraInfo.trim().toLowerCase().equals("ctwap"))) {
                    return "wifi";
                }
                return extraInfo.trim().toLowerCase().equals("ctwap") ? "ctwap" : "cmwap";
            }
            return null;
        } catch (java.lang.Exception e) {
            if (com.baidu.lbsapi.auth.a.a) {
                e.printStackTrace();
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x016d A[Catch: all -> 0x0131, TryCatch #12 {all -> 0x0131, blocks: (B:7:0x002f, B:88:0x0136, B:90:0x013a, B:91:0x013d, B:101:0x0169, B:103:0x016d, B:104:0x0170, B:114:0x0197, B:116:0x019b, B:117:0x019e), top: B:148:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:116:0x019b A[Catch: all -> 0x0131, TryCatch #12 {all -> 0x0131, blocks: (B:7:0x002f, B:88:0x0136, B:90:0x013a, B:91:0x013d, B:101:0x0169, B:103:0x016d, B:104:0x0170, B:114:0x0197, B:116:0x019b, B:117:0x019e), top: B:148:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:131:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:133:0x0205  */
    /* JADX WARN: Code duplicated, block: B:146:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4 A[Catch: all -> 0x0109, TryCatch #5 {all -> 0x0109, blocks: (B:45:0x00b0, B:47:0x00b4, B:48:0x00cf), top: B:144:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4 A[Catch: Exception -> 0x011a, IOException -> 0x011d, MalformedURLException -> 0x0120, all -> 0x0124, TRY_LEAVE, TryCatch #2 {all -> 0x0124, blocks: (B:8:0x0033, B:66:0x010e, B:68:0x0116, B:69:0x0119, B:51:0x00ec, B:53:0x00f4, B:31:0x0095, B:33:0x009d), top: B:143:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x010c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x0116 A[Catch: Exception -> 0x011a, IOException -> 0x011d, MalformedURLException -> 0x0120, all -> 0x0124, TryCatch #2 {all -> 0x0124, blocks: (B:8:0x0033, B:66:0x010e, B:68:0x0116, B:69:0x0119, B:51:0x00ec, B:53:0x00f4, B:31:0x0095, B:33:0x009d), top: B:143:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x013a A[Catch: all -> 0x0131, TryCatch #12 {all -> 0x0131, blocks: (B:7:0x002f, B:88:0x0136, B:90:0x013a, B:91:0x013d, B:101:0x0169, B:103:0x016d, B:104:0x0170, B:114:0x0197, B:116:0x019b, B:117:0x019e), top: B:148:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0163 A[PHI: r10 r14
      0x0163: PHI (r10v5 int) = (r10v0 int), (r10v1 int), (r10v2 int) binds: [B:97:0x0161, B:110:0x0192, B:123:0x01c2] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r14v18 'e' java.io.IOException) = (r14v12 'e' java.io.IOException), (r14v17 'e' java.io.IOException), (r14v23 'e' java.io.IOException) binds: [B:97:0x0161, B:110:0x0192, B:123:0x01c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:133:0x0205, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00b4, please report this as an issue */
    private void a(javax.net.ssl.HttpsURLConnection httpsURLConnection) throws java.lang.Throwable {
        int responseCode;
        com.baidu.lbsapi.auth.a.a("https Post start,url:" + this.b);
        if (this.c == null) {
            this.d = com.baidu.lbsapi.auth.ErrorMessage.a("httpsPost request paramters is null.");
            return;
        }
        boolean z = true;
        java.io.OutputStream outputStream = null;
        bufferedReader = null;
        java.io.BufferedReader bufferedReader = null;
        java.io.BufferedReader bufferedReader2 = null;
        inputStream = null;
        java.io.InputStream inputStream = null;
        java.io.OutputStream outputStream2 = null;
        java.io.OutputStream outputStream3 = null;
        java.io.OutputStream outputStream4 = null;
        boolean z2 = false;
        try {
            try {
                java.io.OutputStream outputStream5 = httpsURLConnection.getOutputStream();
                try {
                    try {
                        try {
                            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(outputStream5, io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8));
                            bufferedWriter.write(b(this.c));
                            com.baidu.lbsapi.auth.a.a(b(this.c));
                            bufferedWriter.flush();
                            bufferedWriter.close();
                            httpsURLConnection.connect();
                            try {
                                java.io.InputStream inputStream2 = httpsURLConnection.getInputStream();
                                try {
                                    responseCode = httpsURLConnection.getResponseCode();
                                    if (200 == responseCode) {
                                        try {
                                            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream2, io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8));
                                            try {
                                                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                                                while (true) {
                                                    int i = bufferedReader.read();
                                                    if (i == -1) {
                                                        break;
                                                    } else {
                                                        stringBuffer.append((char) i);
                                                    }
                                                }
                                                this.d = stringBuffer.toString();
                                                bufferedReader2 = bufferedReader;
                                            } catch (java.io.IOException e) {
                                                e = e;
                                                inputStream = inputStream2;
                                                try {
                                                    if (com.baidu.lbsapi.auth.a.a) {
                                                        e.printStackTrace();
                                                        com.baidu.lbsapi.auth.a.a("httpsPost parse failed;" + e.getMessage());
                                                    }
                                                    this.d = com.baidu.lbsapi.auth.ErrorMessage.a(-11, "httpsPost failed,IOException:" + e.getMessage());
                                                    if (inputStream != null) {
                                                        bufferedReader.close();
                                                        inputStream.close();
                                                    }
                                                    if (httpsURLConnection != null) {
                                                        httpsURLConnection.disconnect();
                                                    }
                                                    z = false;
                                                } catch (java.lang.Throwable th) {
                                                    th = th;
                                                    if (inputStream != null && bufferedReader != null) {
                                                        bufferedReader.close();
                                                        inputStream.close();
                                                    }
                                                    if (httpsURLConnection != null) {
                                                        httpsURLConnection.disconnect();
                                                    }
                                                    throw th;
                                                }
                                            } catch (java.lang.Throwable th2) {
                                                th = th2;
                                                inputStream = inputStream2;
                                                if (inputStream != null) {
                                                    bufferedReader.close();
                                                    inputStream.close();
                                                }
                                                if (httpsURLConnection != null) {
                                                    httpsURLConnection.disconnect();
                                                }
                                                throw th;
                                            }
                                        } catch (java.io.IOException e2) {
                                            e = e2;
                                            bufferedReader = null;
                                        } catch (java.lang.Throwable th3) {
                                            th = th3;
                                            bufferedReader = null;
                                        }
                                    }
                                    if (inputStream2 != null && bufferedReader2 != null) {
                                        bufferedReader2.close();
                                        inputStream2.close();
                                    }
                                    if (httpsURLConnection != null) {
                                        httpsURLConnection.disconnect();
                                    }
                                } catch (java.io.IOException e3) {
                                    e = e3;
                                    inputStream = inputStream2;
                                    responseCode = -1;
                                    if (com.baidu.lbsapi.auth.a.a) {
                                        e.printStackTrace();
                                        com.baidu.lbsapi.auth.a.a("httpsPost parse failed;" + e.getMessage());
                                    }
                                    this.d = com.baidu.lbsapi.auth.ErrorMessage.a(-11, "httpsPost failed,IOException:" + e.getMessage());
                                    if (inputStream != null && bufferedReader != null) {
                                        bufferedReader.close();
                                        inputStream.close();
                                    }
                                    if (httpsURLConnection != null) {
                                        httpsURLConnection.disconnect();
                                    }
                                    z = false;
                                    if (outputStream5 != null) {
                                        try {
                                            outputStream5.close();
                                        } catch (java.io.IOException e4) {
                                            if (com.baidu.lbsapi.auth.a.a) {
                                                e4.printStackTrace();
                                            }
                                        }
                                    }
                                    z2 = z;
                                    if (z2) {
                                    }
                                    if (this.d == null) {
                                        com.baidu.lbsapi.auth.a.a("httpsPost failed,mResult is null");
                                        this.d = com.baidu.lbsapi.auth.ErrorMessage.a(-1, "httpsPost failed,internal error");
                                        return;
                                    } else {
                                        com.baidu.lbsapi.auth.a.a("httpsPost success end,parse result = " + this.d);
                                        return;
                                    }
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    inputStream = inputStream2;
                                    if (inputStream != null) {
                                        bufferedReader.close();
                                        inputStream.close();
                                    }
                                    if (httpsURLConnection != null) {
                                        httpsURLConnection.disconnect();
                                    }
                                    throw th;
                                }
                            } catch (java.io.IOException e5) {
                                e = e5;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                            }
                            if (outputStream5 != null) {
                                outputStream5.close();
                            }
                            z2 = z;
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            outputStream2 = outputStream5;
                            if (outputStream2 != null) {
                                try {
                                    outputStream2.close();
                                } catch (java.io.IOException e6) {
                                    if (com.baidu.lbsapi.auth.a.a) {
                                        e6.printStackTrace();
                                    }
                                }
                            }
                            throw th;
                        }
                    } catch (java.net.MalformedURLException e7) {
                        e = e7;
                        outputStream3 = outputStream5;
                        if (com.baidu.lbsapi.auth.a.a) {
                            e.printStackTrace();
                        }
                        this.d = com.baidu.lbsapi.auth.ErrorMessage.a(-11, "httpsPost failed,MalformedURLException:" + e.getMessage());
                        if (outputStream3 != null) {
                            try {
                                outputStream3.close();
                            } catch (java.io.IOException e8) {
                                e = e8;
                                if (com.baidu.lbsapi.auth.a.a) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    } catch (java.io.IOException e9) {
                        e = e9;
                        outputStream4 = outputStream5;
                        if (com.baidu.lbsapi.auth.a.a) {
                            e.printStackTrace();
                        }
                        this.d = com.baidu.lbsapi.auth.ErrorMessage.a(-11, "httpsPost failed,IOException:" + e.getMessage());
                        if (outputStream4 != null) {
                            try {
                                outputStream4.close();
                            } catch (java.io.IOException e10) {
                                e = e10;
                                if (com.baidu.lbsapi.auth.a.a) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    } catch (java.lang.Exception e11) {
                        e = e11;
                        outputStream = outputStream5;
                        if (com.baidu.lbsapi.auth.a.a) {
                            e.printStackTrace();
                        }
                        this.d = com.baidu.lbsapi.auth.ErrorMessage.a(-11, "httpsPost failed,Exception:" + e.getMessage());
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (java.io.IOException e12) {
                                e = e12;
                                if (com.baidu.lbsapi.auth.a.a) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                } catch (java.net.MalformedURLException e13) {
                    e = e13;
                    outputStream3 = outputStream5;
                    responseCode = -1;
                    if (com.baidu.lbsapi.auth.a.a) {
                        e.printStackTrace();
                    }
                    this.d = com.baidu.lbsapi.auth.ErrorMessage.a(-11, "httpsPost failed,MalformedURLException:" + e.getMessage());
                    if (outputStream3 != null) {
                        outputStream3.close();
                    }
                } catch (java.io.IOException e14) {
                    e = e14;
                    outputStream4 = outputStream5;
                    responseCode = -1;
                    if (com.baidu.lbsapi.auth.a.a) {
                        e.printStackTrace();
                    }
                    this.d = com.baidu.lbsapi.auth.ErrorMessage.a(-11, "httpsPost failed,IOException:" + e.getMessage());
                    if (outputStream4 != null) {
                        outputStream4.close();
                    }
                } catch (java.lang.Exception e15) {
                    e = e15;
                    outputStream = outputStream5;
                    responseCode = -1;
                    if (com.baidu.lbsapi.auth.a.a) {
                        e.printStackTrace();
                    }
                    this.d = com.baidu.lbsapi.auth.ErrorMessage.a(-11, "httpsPost failed,Exception:" + e.getMessage());
                    if (outputStream != null) {
                        outputStream.close();
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } catch (java.net.MalformedURLException e16) {
            e = e16;
        } catch (java.io.IOException e17) {
            e = e17;
        } catch (java.lang.Exception e18) {
            e = e18;
        }
        if (z2 || 200 == responseCode) {
            if (this.d == null) {
                com.baidu.lbsapi.auth.a.a("httpsPost failed,mResult is null");
                this.d = com.baidu.lbsapi.auth.ErrorMessage.a(-1, "httpsPost failed,internal error");
                return;
            } else {
                com.baidu.lbsapi.auth.a.a("httpsPost success end,parse result = " + this.d);
                return;
            }
        }
        com.baidu.lbsapi.auth.a.a("httpsPost failed,statusCode:" + responseCode);
        this.d = com.baidu.lbsapi.auth.ErrorMessage.a(-11, "httpsPost failed,statusCode:" + responseCode);
    }

    private static java.lang.String b(java.util.HashMap<java.lang.String, java.lang.String> map) throws java.io.UnsupportedEncodingException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean z = true;
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            sb.append(java.net.URLEncoder.encode(entry.getKey(), io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8));
            sb.append("=");
            sb.append(java.net.URLEncoder.encode(entry.getValue(), io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8));
        }
        return sb.toString();
    }

    private javax.net.ssl.HttpsURLConnection b() {
        java.lang.String str;
        java.net.URLConnection uRLConnectionOpenConnection;
        try {
            java.net.URL url = new java.net.URL(this.b);
            com.baidu.lbsapi.auth.a.a("https URL: " + this.b);
            java.lang.String strA = a(this.a);
            if (strA != null && !strA.equals("")) {
                com.baidu.lbsapi.auth.a.a("checkNetwork = " + strA);
                if (strA.equals("cmwap")) {
                    uRLConnectionOpenConnection = url.openConnection(new java.net.Proxy(java.net.Proxy.Type.HTTP, new java.net.InetSocketAddress("10.0.0.172", 80)));
                } else {
                    uRLConnectionOpenConnection = strA.equals("ctwap") ? url.openConnection(new java.net.Proxy(java.net.Proxy.Type.HTTP, new java.net.InetSocketAddress("10.0.0.200", 80))) : url.openConnection();
                }
                javax.net.ssl.HttpsURLConnection httpsURLConnection = (javax.net.ssl.HttpsURLConnection) uRLConnectionOpenConnection;
                httpsURLConnection.setHostnameVerifier(new com.baidu.lbsapi.auth.h(this));
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setRequestMethod(io.fabric.sdk.android.services.network.HttpRequest.METHOD_POST);
                httpsURLConnection.setConnectTimeout(net.sqlcipher.database.SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH);
                httpsURLConnection.setReadTimeout(net.sqlcipher.database.SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH);
                return httpsURLConnection;
            }
            com.baidu.lbsapi.auth.a.c("Current network is not available.");
            this.d = com.baidu.lbsapi.auth.ErrorMessage.a(-10, "Current network is not available.");
            return null;
        } catch (java.net.MalformedURLException e) {
            if (com.baidu.lbsapi.auth.a.a) {
                e.printStackTrace();
                com.baidu.lbsapi.auth.a.a(e.getMessage());
            }
            str = "Auth server could not be parsed as a URL.";
            this.d = com.baidu.lbsapi.auth.ErrorMessage.a(-11, str);
            return null;
        } catch (java.lang.Exception e2) {
            if (com.baidu.lbsapi.auth.a.a) {
                e2.printStackTrace();
                com.baidu.lbsapi.auth.a.a(e2.getMessage());
            }
            str = "Init httpsurlconnection failed.";
            this.d = com.baidu.lbsapi.auth.ErrorMessage.a(-11, str);
            return null;
        }
    }

    private java.util.HashMap<java.lang.String, java.lang.String> c(java.util.HashMap<java.lang.String, java.lang.String> map) {
        java.util.HashMap<java.lang.String, java.lang.String> map2 = new java.util.HashMap<>();
        java.util.Iterator<java.lang.String> it = map.keySet().iterator();
        while (it.hasNext()) {
            java.lang.String string = it.next().toString();
            map2.put(string, map.get(string));
        }
        return map2;
    }

    protected java.lang.String a(java.util.HashMap<java.lang.String, java.lang.String> map) throws java.lang.Throwable {
        java.util.HashMap<java.lang.String, java.lang.String> mapC = c(map);
        this.c = mapC;
        this.b = mapC.get("url");
        javax.net.ssl.HttpsURLConnection httpsURLConnectionB = b();
        if (httpsURLConnectionB == null) {
            com.baidu.lbsapi.auth.a.c("syncConnect failed,httpsURLConnection is null");
        } else {
            a(httpsURLConnectionB);
        }
        return this.d;
    }

    protected boolean a() {
        android.net.NetworkInfo activeNetworkInfo;
        com.baidu.lbsapi.auth.a.a("checkNetwork start");
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) this.a.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            com.baidu.lbsapi.auth.a.a("checkNetwork end");
            return true;
        } catch (java.lang.Exception e) {
            if (com.baidu.lbsapi.auth.a.a) {
                e.printStackTrace();
            }
            return false;
        }
    }
}
