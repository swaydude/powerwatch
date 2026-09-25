package com.baidu.mapsdkplatform.comapi.b.a;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static java.lang.String a = "";
    private static java.lang.String b = "";
    private static java.lang.String c = "";
    private android.content.Context d;

    private static final class a {
        private static final com.baidu.mapsdkplatform.comapi.b.a.c a = new com.baidu.mapsdkplatform.comapi.b.a.c();
    }

    public static com.baidu.mapsdkplatform.comapi.b.a.c a() {
        return com.baidu.mapsdkplatform.comapi.b.a.c.a.a;
    }

    private void a(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.lang.Exception {
        java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(outputStream);
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr, 0, 1024);
            if (i == -1) {
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                try {
                    outputStream.close();
                    inputStream.close();
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            }
            gZIPOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.io.File[] fileArr) {
        int length = fileArr.length;
        for (int i = 0; i < length - 10; i++) {
            int i2 = i + 10;
            if (fileArr[i2] != null && fileArr[i2].exists()) {
                fileArr[i2].delete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:109:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[Catch: all -> 0x0137, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #17 {all -> 0x0137, blocks: (B:7:0x000b, B:39:0x00ea, B:44:0x00f3, B:48:0x00fd, B:64:0x0117, B:69:0x0120, B:73:0x012a, B:74:0x012d, B:78:0x0133, B:85:0x013e, B:89:0x0148), top: B:121:0x0003 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.BufferedReader] */
    public synchronized boolean a(java.io.File file) {
        java.net.HttpURLConnection httpURLConnectionG;
        java.io.InputStream inputStream;
        ?? r5;
        ?? r6;
        java.io.BufferedReader bufferedReader;
        java.io.OutputStream outputStream = null;
        java.io.BufferedReader bufferedReader2 = null;
        java.io.OutputStream outputStream2 = null;
        try {
            try {
                httpURLConnectionG = g();
                if (httpURLConnectionG == null) {
                    if (httpURLConnectionG != null) {
                        try {
                            httpURLConnectionG.disconnect();
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    return false;
                }
                try {
                    httpURLConnectionG.connect();
                    java.io.OutputStream outputStream3 = httpURLConnectionG.getOutputStream();
                    try {
                        outputStream3.write(a(b(file).toString().getBytes()));
                        outputStream3.write(a(("--bd_map_sdk_cc\r\nContent-Disposition: form-data; name=\"file\"; filename=\"c.txt\"\r\n\r\n").getBytes()));
                        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream((int) file.length());
                        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(file));
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = dataInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                            outputStream2 = outputStream3;
                            r6 = bufferedReader;
                            if (outputStream2 != null) {
                                try {
                                    outputStream2.close();
                                } catch (java.lang.Exception unused2) {
                                }
                            }
                            if (inputStream != null && r6 != 0) {
                                try {
                                    inputStream.close();
                                    r6.close();
                                } catch (java.lang.Exception unused3) {
                                }
                            }
                            if (httpURLConnectionG != null) {
                                try {
                                    httpURLConnectionG.disconnect();
                                } catch (java.lang.Exception unused4) {
                                }
                            }
                            return false;
                        }
                        outputStream3.write(a(byteArrayOutputStream.toByteArray()));
                        dataInputStream.close();
                        byteArrayOutputStream.close();
                        outputStream3.write(a("\r\n--bd_map_sdk_cc--\r\n".getBytes()));
                        outputStream3.flush();
                        if (httpURLConnectionG.getResponseCode() == 200) {
                            inputStream = httpURLConnectionG.getInputStream();
                            try {
                                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
                                try {
                                    try {
                                        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                                        while (true) {
                                            int i2 = bufferedReader.read();
                                            if (i2 == -1) {
                                                break;
                                            }
                                            stringBuffer.append((char) i2);
                                        }
                                        try {
                                            org.json.JSONObject jSONObject = new org.json.JSONObject(stringBuffer.toString());
                                            if (jSONObject.has("status") && jSONObject.getInt("status") == 0 && file.exists()) {
                                                file.delete();
                                            }
                                        } catch (java.lang.Exception unused5) {
                                        }
                                        bufferedReader2 = bufferedReader;
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        outputStream = outputStream3;
                                        r5 = bufferedReader;
                                        if (outputStream != null) {
                                            try {
                                                outputStream.close();
                                            } catch (java.lang.Exception unused6) {
                                            }
                                        }
                                        if (inputStream != null && r5 != 0) {
                                            try {
                                                inputStream.close();
                                                r5.close();
                                            } catch (java.lang.Exception unused7) {
                                            }
                                        }
                                        if (httpURLConnectionG != null) {
                                            throw th;
                                        }
                                        try {
                                            httpURLConnectionG.disconnect();
                                            throw th;
                                        } catch (java.lang.Exception unused8) {
                                            throw th;
                                        }
                                    }
                                } catch (java.lang.Exception unused9) {
                                }
                            } catch (java.lang.Exception unused10) {
                                bufferedReader = null;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                bufferedReader = null;
                            }
                        } else {
                            inputStream = null;
                        }
                        if (outputStream3 != null) {
                            try {
                                outputStream3.close();
                            } catch (java.lang.Exception unused11) {
                            }
                        }
                        if (inputStream != null && bufferedReader2 != null) {
                            try {
                                inputStream.close();
                                bufferedReader2.close();
                            } catch (java.lang.Exception unused12) {
                            }
                        }
                        if (httpURLConnectionG != null) {
                            try {
                                httpURLConnectionG.disconnect();
                            } catch (java.lang.Exception unused13) {
                            }
                        }
                        return true;
                    } catch (java.lang.Exception unused14) {
                        inputStream = null;
                        bufferedReader = null;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        inputStream = null;
                        bufferedReader = null;
                    }
                } catch (java.lang.Exception unused15) {
                    inputStream = null;
                    r6 = inputStream;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    inputStream = null;
                    r5 = inputStream;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                        r5.close();
                    }
                    if (httpURLConnectionG != null) {
                        throw th;
                    }
                    httpURLConnectionG.disconnect();
                    throw th;
                }
            } catch (java.lang.Throwable th5) {
                throw th5;
            }
        } catch (java.lang.Exception unused16) {
            httpURLConnectionG = null;
            inputStream = null;
        } catch (java.lang.Throwable th6) {
            th = th6;
            httpURLConnectionG = null;
            inputStream = null;
        }
    }

    private byte[] a(byte[] bArr) throws java.lang.Exception {
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(bArr.length);
        a(byteArrayInputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        byteArrayInputStream.close();
        return byteArray;
    }

    private java.lang.StringBuilder b(java.io.File file) {
        java.lang.String[] strArrSplit = file.getName().substring(0, file.getName().length() - 4).split(io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("--bd_map_sdk_cc");
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"phoneinfo\"\r\n");
        sb.append("\r\n");
        sb.append(java.net.URLDecoder.decode(com.baidu.mapsdkplatform.comapi.util.SyncSysInfo.getPhoneInfo() + "&abi=" + c));
        sb.append("\r\n");
        sb.append("--bd_map_sdk_cc");
        sb.append("\r\n");
        if (strArrSplit[0] != null && !strArrSplit[0].isEmpty()) {
            sb.append("Content-Disposition: form-data; name=\"packname\"\r\n");
            sb.append("\r\n");
            sb.append(strArrSplit[0]);
            sb.append("\r\n");
            sb.append("--bd_map_sdk_cc");
            sb.append("\r\n");
        }
        if (strArrSplit[1] != null && !strArrSplit[1].isEmpty()) {
            sb.append("Content-Disposition: form-data; name=\"version\"\r\n");
            sb.append("\r\n");
            sb.append(strArrSplit[1]);
            sb.append("\r\n");
            sb.append("--bd_map_sdk_cc");
            sb.append("\r\n");
        }
        if (strArrSplit[2] != null && !strArrSplit[2].isEmpty()) {
            sb.append("Content-Disposition: form-data; name=\"timestamp\"\r\n");
            sb.append("\r\n");
            sb.append(strArrSplit[2]);
            sb.append("\r\n");
            sb.append("--bd_map_sdk_cc");
            sb.append("\r\n");
        }
        sb.append("Content-Disposition: form-data; name=\"os\"\r\n");
        sb.append("\r\n");
        sb.append("android");
        sb.append("\r\n");
        sb.append("--bd_map_sdk_cc");
        sb.append("\r\n");
        return sb;
    }

    private void d() {
        if (com.baidu.mapsdkplatform.comapi.util.g.a().b() == null) {
            return;
        }
        java.lang.String strB = com.baidu.mapsdkplatform.comapi.util.g.a().b().b();
        if (strB.isEmpty()) {
            return;
        }
        java.lang.String str = strB + java.io.File.separator + "crash";
        java.io.File file = new java.io.File(str);
        if (file.exists() || file.mkdir()) {
            a = str;
        } else {
            a = strB;
        }
    }

    private void e() {
        java.lang.String str;
        java.lang.String str2 = a;
        if (str2 == null || str2.isEmpty() || (str = b) == null || str.isEmpty()) {
            return;
        }
        java.lang.String str3 = a + java.io.File.separator + b;
        com.baidu.mapsdkplatform.comapi.b.a.a.a().a(str3);
        com.baidu.mapsdkplatform.comjni.util.JNIHandler.registerNativeHandler(str3);
    }

    private void f() {
        if (com.baidu.mapapi.NetworkUtil.isNetworkAvailable(this.d)) {
            new java.lang.Thread(new com.baidu.mapsdkplatform.comapi.b.a.d(this)).start();
        }
    }

    private java.net.HttpURLConnection g() {
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL("https://api.map.baidu.com/lbs_sdkcc/report").openConnection();
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod(io.fabric.sdk.android.services.network.HttpRequest.METHOD_POST);
            httpURLConnection.setRequestProperty("Connection", "keep-alive");
            httpURLConnection.setRequestProperty(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_TYPE, "multipart/form-data; boundary=bd_map_sdk_cc");
            httpURLConnection.setRequestProperty(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CACHE_CONTROL, "no-cache");
            httpURLConnection.setRequestProperty(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_ENCODING, io.fabric.sdk.android.services.network.HttpRequest.ENCODING_GZIP);
            httpURLConnection.setConnectTimeout(10000);
            return httpURLConnection;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public void a(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (android.os.Build.SUPPORTED_ABIS.length > 0) {
            c = android.os.Build.SUPPORTED_ABIS[0];
        }
        this.d = context;
        java.lang.String strN = com.baidu.mapsdkplatform.comapi.util.h.n();
        if (strN.isEmpty()) {
            return;
        }
        if (strN.contains(io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR)) {
            strN = strN.replaceAll(io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR, "");
        }
        b = strN + io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + com.baidu.mapsdkplatform.comapi.util.h.i() + io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR;
        d();
        e();
        f();
    }
}
