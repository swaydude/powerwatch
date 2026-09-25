package com.baidu.lbsapi.auth;

/* JADX INFO: loaded from: classes.dex */
public class LBSAuthManager {
    public static final int CODE_AUTHENTICATE_SUCC = 0;
    public static final int CODE_AUTHENTICATING = 602;
    public static final int CODE_INNER_ERROR = -1;
    public static final int CODE_KEY_NOT_EXIST = 101;
    public static final int CODE_NETWORK_FAILED = -11;
    public static final int CODE_NETWORK_INVALID = -10;
    public static final int CODE_UNAUTHENTICATE = 601;
    public static final java.lang.String VERSION = "1.0.23";
    private static android.content.Context a;
    private static com.baidu.lbsapi.auth.m d;
    private static int e;
    private static java.util.Hashtable<java.lang.String, com.baidu.lbsapi.auth.LBSAuthManagerListener> f = new java.util.Hashtable<>();
    private static com.baidu.lbsapi.auth.LBSAuthManager g;
    private com.baidu.lbsapi.auth.c b = null;
    private com.baidu.lbsapi.auth.e c = null;
    private boolean h = false;
    private final android.os.Handler i = new com.baidu.lbsapi.auth.i(this, android.os.Looper.getMainLooper());

    private LBSAuthManager(android.content.Context context) {
        a = context;
        com.baidu.lbsapi.auth.m mVar = d;
        if (mVar != null && !mVar.isAlive()) {
            d = null;
        }
        com.baidu.lbsapi.auth.a.b("BaiduApiAuth SDK Version:1.0.23");
        d();
    }

    private int a(java.lang.String str) {
        int i = -1;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (!jSONObject.has("status")) {
                jSONObject.put("status", -1);
            }
            i = jSONObject.getInt("status");
            if (jSONObject.has("current") && i == 0) {
                long j = jSONObject.getLong("current");
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if ((jCurrentTimeMillis - j) / 3600000.0d >= 24.0d) {
                    i = CODE_UNAUTHENTICATE;
                } else if (this.h) {
                    java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
                    if (!simpleDateFormat.format(java.lang.Long.valueOf(jCurrentTimeMillis)).equals(simpleDateFormat.format(java.lang.Long.valueOf(j)))) {
                        i = CODE_UNAUTHENTICATE;
                    }
                    return i;
                }
            }
            if (jSONObject.has("current") && i == 602) {
                if ((java.lang.System.currentTimeMillis() - jSONObject.getLong("current")) / 1000 > 180.0d) {
                    return CODE_UNAUTHENTICATE;
                }
            }
        } catch (org.json.JSONException e2) {
            e2.printStackTrace();
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:8:0x0035 A[PHI: r0 r6
      0x0035: PHI (r0v6 java.lang.String) = (r0v0 java.lang.String), (r0v0 java.lang.String), (r0v12 java.lang.String) binds: [B:36:0x0074, B:44:0x0084, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r6v10 java.io.FileInputStream) = (r6v8 java.io.FileInputStream), (r6v9 java.io.FileInputStream), (r6v13 java.io.FileInputStream) binds: [B:36:0x0074, B:44:0x0084, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.BufferedReader] */
    private java.lang.String a(int i) throws java.lang.Throwable {
        java.io.InputStreamReader inputStreamReader;
        java.io.BufferedReader bufferedReader;
        java.lang.Throwable th;
        java.io.FileInputStream fileInputStream;
        ?? r2;
        ?? r3;
        java.lang.String line = null;
        try {
            fileInputStream = new java.io.FileInputStream(new java.io.File("/proc/" + i + "/cmdline"));
            try {
                inputStreamReader = new java.io.InputStreamReader(fileInputStream);
                try {
                    bufferedReader = new java.io.BufferedReader(inputStreamReader);
                    try {
                        line = bufferedReader.readLine();
                        bufferedReader.close();
                        inputStreamReader.close();
                    } catch (java.io.FileNotFoundException unused) {
                        r3 = bufferedReader;
                        if (r3 != 0) {
                            r3.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (fileInputStream != null) {
                        }
                        return line;
                    } catch (java.io.IOException unused2) {
                        r2 = bufferedReader;
                        if (r2 != 0) {
                            r2.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (fileInputStream != null) {
                        }
                        return line;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                } catch (java.io.FileNotFoundException unused3) {
                    r3 = 0;
                } catch (java.io.IOException unused4) {
                    r2 = 0;
                } catch (java.lang.Throwable th3) {
                    bufferedReader = null;
                    th = th3;
                }
            } catch (java.io.FileNotFoundException unused5) {
                inputStreamReader = null;
                r3 = inputStreamReader;
                if (r3 != 0) {
                    r3.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return line;
            } catch (java.io.IOException unused6) {
                inputStreamReader = null;
                r2 = inputStreamReader;
                if (r2 != 0) {
                    r2.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return line;
            } catch (java.lang.Throwable th4) {
                bufferedReader = null;
                th = th4;
                inputStreamReader = null;
            }
        } catch (java.io.FileNotFoundException unused7) {
            fileInputStream = null;
            inputStreamReader = null;
        } catch (java.io.IOException unused8) {
            fileInputStream = null;
            inputStreamReader = null;
        } catch (java.lang.Throwable th5) {
            inputStreamReader = null;
            bufferedReader = null;
            th = th5;
            fileInputStream = null;
        }
        fileInputStream.close();
        return line;
    }

    private java.lang.String a(android.content.Context context) throws java.lang.Throwable {
        int iMyPid = android.os.Process.myPid();
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        java.lang.String strA = null;
        try {
            strA = a(iMyPid);
        } catch (java.io.IOException unused) {
        }
        return strA != null ? strA : a.getPackageName();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c A[Catch: NameNotFoundException -> 0x004f, TryCatch #1 {NameNotFoundException -> 0x004f, blocks: (B:10:0x0036, B:12:0x003c, B:14:0x0046), top: B:25:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[Catch: NameNotFoundException -> 0x004f, TRY_LEAVE, TryCatch #1 {NameNotFoundException -> 0x004f, blocks: (B:10:0x0036, B:12:0x003c, B:14:0x0046), top: B:25:0x0036 }] */
    private java.lang.String a(android.content.Context context, java.lang.String str) {
        com.baidu.lbsapi.auth.LBSAuthManagerListener lBSAuthManagerListener;
        java.lang.String str2 = "";
        try {
            android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                java.lang.String string = applicationInfo.metaData.getString("com.baidu.lbsapi.API_KEY");
                if (string != null) {
                    try {
                        if (string.equals("")) {
                            lBSAuthManagerListener = f.get(str);
                            if (lBSAuthManagerListener != null) {
                                lBSAuthManagerListener.onAuthResult(101, com.baidu.lbsapi.auth.ErrorMessage.a(101, "无法在AndroidManifest.xml中获取com.baidu.android.lbs.API_KEY的值"));
                            }
                        }
                        str2 = string;
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                        str2 = string;
                        com.baidu.lbsapi.auth.LBSAuthManagerListener lBSAuthManagerListener2 = f.get(str);
                        if (lBSAuthManagerListener2 != null) {
                            lBSAuthManagerListener2.onAuthResult(101, com.baidu.lbsapi.auth.ErrorMessage.a(101, "无法在AndroidManifest.xml中获取com.baidu.android.lbs.API_KEY的值"));
                        }
                    }
                } else {
                    lBSAuthManagerListener = f.get(str);
                    if (lBSAuthManagerListener != null) {
                        lBSAuthManagerListener.onAuthResult(101, com.baidu.lbsapi.auth.ErrorMessage.a(101, "无法在AndroidManifest.xml中获取com.baidu.android.lbs.API_KEY的值"));
                    }
                    str2 = string;
                }
                return str2;
            }
            com.baidu.lbsapi.auth.LBSAuthManagerListener lBSAuthManagerListener3 = f.get(str);
            if (lBSAuthManagerListener3 != null) {
                lBSAuthManagerListener3.onAuthResult(101, com.baidu.lbsapi.auth.ErrorMessage.a(101, "AndroidManifest.xml的application中没有meta-data标签"));
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0028 A[Catch: JSONException -> 0x0066, all -> 0x00b8, TryCatch #0 {JSONException -> 0x0066, blocks: (B:7:0x000e, B:9:0x001b, B:10:0x0020, B:12:0x0028, B:13:0x0031, B:15:0x0040, B:16:0x0045), top: B:33:0x000e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0040 A[Catch: JSONException -> 0x0066, all -> 0x00b8, TryCatch #0 {JSONException -> 0x0066, blocks: (B:7:0x000e, B:9:0x001b, B:10:0x0020, B:12:0x0028, B:13:0x0031, B:15:0x0040, B:16:0x0045), top: B:33:0x000e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0089 A[Catch: all -> 0x00b8, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x0007, B:7:0x000e, B:9:0x001b, B:10:0x0020, B:12:0x0028, B:13:0x0031, B:15:0x0040, B:16:0x0045, B:20:0x0085, B:22:0x0089, B:23:0x008c, B:25:0x00ac, B:27:0x00b0, B:19:0x0067), top: B:35:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b A[Catch: JSONException -> 0x0066, all -> 0x00b8, TryCatch #0 {JSONException -> 0x0066, blocks: (B:7:0x000e, B:9:0x001b, B:10:0x0020, B:12:0x0028, B:13:0x0031, B:15:0x0040, B:16:0x0045), top: B:33:0x000e, outer: #1 }] */
    public synchronized void a(java.lang.String str, java.lang.String str2) {
        android.os.Message messageObtainMessage;
        int i;
        com.baidu.lbsapi.auth.m mVar;
        com.baidu.lbsapi.auth.m mVar2;
        org.json.JSONObject jSONObject;
        if (str == null) {
            str = e();
            messageObtainMessage = this.i.obtainMessage();
            i = -1;
            try {
                jSONObject = new org.json.JSONObject(str);
                if (!jSONObject.has("status")) {
                    jSONObject.put("status", -1);
                }
                if (!jSONObject.has("current")) {
                    jSONObject.put("current", java.lang.System.currentTimeMillis());
                }
                c(jSONObject.toString());
                if (jSONObject.has("current")) {
                    jSONObject.remove("current");
                }
                i = jSONObject.getInt("status");
                messageObtainMessage.what = i;
                messageObtainMessage.obj = jSONObject.toString();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("listenerKey", str2);
                messageObtainMessage.setData(bundle);
                this.i.sendMessage(messageObtainMessage);
            } catch (org.json.JSONException e2) {
                e2.printStackTrace();
                messageObtainMessage.what = i;
                messageObtainMessage.obj = new org.json.JSONObject();
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("listenerKey", str2);
                messageObtainMessage.setData(bundle2);
                this.i.sendMessage(messageObtainMessage);
            }
            mVar = d;
            if (mVar != null) {
                mVar.c();
            }
            e--;
            com.baidu.lbsapi.auth.a.a("httpRequest called mAuthCounter-- = " + e);
            if (e == 0 && (mVar2 = d) != null) {
                mVar2.a();
                d = null;
            }
        } else {
            messageObtainMessage = this.i.obtainMessage();
            i = -1;
            jSONObject = new org.json.JSONObject(str);
            if (!jSONObject.has("status")) {
                jSONObject.put("status", -1);
            }
            if (!jSONObject.has("current")) {
                jSONObject.put("current", java.lang.System.currentTimeMillis());
            }
            c(jSONObject.toString());
            if (jSONObject.has("current")) {
                jSONObject.remove("current");
            }
            i = jSONObject.getInt("status");
            messageObtainMessage.what = i;
            messageObtainMessage.obj = jSONObject.toString();
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putString("listenerKey", str2);
            messageObtainMessage.setData(bundle3);
            this.i.sendMessage(messageObtainMessage);
            mVar = d;
            if (mVar != null) {
                mVar.c();
            }
            e--;
            com.baidu.lbsapi.auth.a.a("httpRequest called mAuthCounter-- = " + e);
            if (e == 0) {
                mVar2.a();
                d = null;
            }
        }
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, java.lang.String str, java.util.Hashtable<java.lang.String, java.lang.String> hashtable, java.lang.String str2) {
        java.lang.String cuid;
        java.lang.String strA;
        java.lang.String strA2 = a(a, str2);
        if (strA2 == null || strA2.equals("")) {
            return;
        }
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        map.put("url", "https://api.map.baidu.com/sdkcs/verify");
        com.baidu.lbsapi.auth.a.a("url:https://api.map.baidu.com/sdkcs/verify");
        map.put("output", "json");
        map.put("ak", strA2);
        com.baidu.lbsapi.auth.a.a("ak:" + strA2);
        map.put("mcode", com.baidu.lbsapi.auth.b.a(a));
        map.put("from", "lbs_yunsdk");
        if (hashtable != null && hashtable.size() > 0) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : hashtable.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                if (!android.text.TextUtils.isEmpty(key) && !android.text.TextUtils.isEmpty(value)) {
                    map.put(key, value);
                }
            }
        }
        try {
            cuid = com.baidu.android.bbalbs.common.util.CommonParam.getCUID(a);
        } catch (java.lang.Exception e2) {
            com.baidu.lbsapi.auth.a.a("get cuid failed");
            e2.printStackTrace();
            cuid = "";
        }
        com.baidu.lbsapi.auth.a.a("cuid:" + cuid);
        if (android.text.TextUtils.isEmpty(cuid)) {
            map.put("cuid", "");
        } else {
            map.put("cuid", cuid);
        }
        map.put("pcn", a.getPackageName());
        map.put("version", VERSION);
        map.put("macaddr", "");
        try {
            strA = com.baidu.lbsapi.auth.b.a();
        } catch (java.lang.Exception unused) {
            strA = "";
        }
        if (android.text.TextUtils.isEmpty(strA)) {
            map.put("language", "");
        } else {
            map.put("language", strA);
        }
        if (z) {
            map.put("force", z ? "1" : "0");
        }
        if (str == null) {
            map.put("from_service", "");
        } else {
            map.put("from_service", str);
        }
        com.baidu.lbsapi.auth.c cVar = new com.baidu.lbsapi.auth.c(a);
        this.b = cVar;
        cVar.a(map, new com.baidu.lbsapi.auth.k(this, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, java.lang.String str, java.util.Hashtable<java.lang.String, java.lang.String> hashtable, java.lang.String[] strArr, java.lang.String str2) {
        java.lang.String cuid;
        java.lang.String strA;
        java.lang.String strA2 = a(a, str2);
        if (strA2 == null || strA2.equals("")) {
            return;
        }
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        map.put("url", "https://api.map.baidu.com/sdkcs/verify");
        map.put("output", "json");
        map.put("ak", strA2);
        map.put("from", "lbs_yunsdk");
        if (hashtable != null && hashtable.size() > 0) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : hashtable.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                if (!android.text.TextUtils.isEmpty(key) && !android.text.TextUtils.isEmpty(value)) {
                    map.put(key, value);
                }
            }
        }
        try {
            cuid = com.baidu.android.bbalbs.common.util.CommonParam.getCUID(a);
        } catch (java.lang.Exception unused) {
            cuid = "";
        }
        if (android.text.TextUtils.isEmpty(cuid)) {
            map.put("cuid", "");
        } else {
            map.put("cuid", cuid);
        }
        map.put("pcn", a.getPackageName());
        map.put("version", VERSION);
        map.put("macaddr", "");
        try {
            strA = com.baidu.lbsapi.auth.b.a();
        } catch (java.lang.Exception unused2) {
            strA = "";
        }
        if (android.text.TextUtils.isEmpty(strA)) {
            map.put("language", "");
        } else {
            map.put("language", strA);
        }
        if (z) {
            map.put("force", z ? "1" : "0");
        }
        if (str == null) {
            map.put("from_service", "");
        } else {
            map.put("from_service", str);
        }
        com.baidu.lbsapi.auth.e eVar = new com.baidu.lbsapi.auth.e(a);
        this.c = eVar;
        eVar.a(map, strArr, new com.baidu.lbsapi.auth.l(this, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(java.lang.String str) {
        java.lang.String string;
        java.lang.String strA = a(a, str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(e());
            if (!jSONObject.has("ak")) {
                return true;
            }
            string = jSONObject.getString("ak");
        } catch (org.json.JSONException e2) {
            e2.printStackTrace();
            string = "";
        }
        return (strA == null || string == null || strA.equals(string)) ? false : true;
    }

    private void c(java.lang.String str) {
        a.getSharedPreferences("authStatus_" + a(a), 0).edit().putString("status", str).commit();
    }

    private void d() {
        synchronized (com.baidu.lbsapi.auth.LBSAuthManager.class) {
            if (d == null) {
                com.baidu.lbsapi.auth.m mVar = new com.baidu.lbsapi.auth.m("auth");
                d = mVar;
                mVar.start();
                while (d.a == null) {
                    try {
                        com.baidu.lbsapi.auth.a.a("wait for create auth thread.");
                        java.lang.Thread.sleep(3L);
                    } catch (java.lang.InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    private java.lang.String e() {
        return a.getSharedPreferences("authStatus_" + a(a), 0).getString("status", "{\"status\":601}");
    }

    public static com.baidu.lbsapi.auth.LBSAuthManager getInstance(android.content.Context context) {
        if (g == null) {
            synchronized (com.baidu.lbsapi.auth.LBSAuthManager.class) {
                if (g == null) {
                    g = new com.baidu.lbsapi.auth.LBSAuthManager(context);
                }
            }
        } else if (context != null) {
            a = context;
        } else if (com.baidu.lbsapi.auth.a.a) {
            com.baidu.lbsapi.auth.a.c("input context is null");
            new java.lang.RuntimeException("here").printStackTrace();
        }
        return g;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036 A[Catch: all -> 0x00e0, TryCatch #0 {, blocks: (B:6:0x0007, B:9:0x0012, B:12:0x001d, B:14:0x0036, B:15:0x003b, B:17:0x0043, B:20:0x004d, B:23:0x0088, B:27:0x00a1, B:29:0x00a8, B:32:0x00ad, B:33:0x00d7, B:36:0x00da, B:26:0x009e, B:39:0x00de), top: B:44:0x0007, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public int authenticate(boolean z, java.lang.String str, java.util.Hashtable<java.lang.String, java.lang.String> hashtable, com.baidu.lbsapi.auth.LBSAuthManagerListener lBSAuthManagerListener) {
        java.lang.String str2;
        java.lang.String strA;
        int iA;
        com.baidu.lbsapi.auth.m mVar;
        synchronized (com.baidu.lbsapi.auth.LBSAuthManager.class) {
            boolean z2 = false;
            if (hashtable == null) {
                this.h = z2;
                str2 = java.lang.System.currentTimeMillis() + "";
                if (lBSAuthManagerListener != null) {
                    f.put(str2, lBSAuthManagerListener);
                }
                strA = a(a, str2);
                if (strA != null) {
                    e++;
                    com.baidu.lbsapi.auth.a.a(" mAuthCounter  ++ = " + e);
                    java.lang.String strE = e();
                    com.baidu.lbsapi.auth.a.a("getAuthMessage from cache:" + strE);
                    iA = a(strE);
                    if (iA == 601) {
                        c(new org.json.JSONObject().put("status", CODE_AUTHENTICATING).toString());
                    }
                    d();
                    mVar = d;
                    if (mVar != null) {
                        com.baidu.lbsapi.auth.a.a("mThreadLooper.mHandler = " + d.a);
                        d.a.post(new com.baidu.lbsapi.auth.j(this, iA, z, str2, str, hashtable));
                        return iA;
                    }
                    return -1;
                }
                return 101;
            }
            java.lang.String str3 = hashtable.get("zero_auth");
            if (str3 != null && java.lang.Integer.valueOf(str3).intValue() == 1) {
                z2 = true;
            }
            this.h = z2;
            str2 = java.lang.System.currentTimeMillis() + "";
            if (lBSAuthManagerListener != null) {
                f.put(str2, lBSAuthManagerListener);
            }
            strA = a(a, str2);
            if (strA != null && !strA.equals("")) {
                e++;
                com.baidu.lbsapi.auth.a.a(" mAuthCounter  ++ = " + e);
                java.lang.String strE2 = e();
                com.baidu.lbsapi.auth.a.a("getAuthMessage from cache:" + strE2);
                iA = a(strE2);
                if (iA == 601) {
                    try {
                        c(new org.json.JSONObject().put("status", CODE_AUTHENTICATING).toString());
                    } catch (org.json.JSONException e2) {
                        e2.printStackTrace();
                    }
                }
                d();
                mVar = d;
                if (mVar != null && mVar.a != null) {
                    com.baidu.lbsapi.auth.a.a("mThreadLooper.mHandler = " + d.a);
                    d.a.post(new com.baidu.lbsapi.auth.j(this, iA, z, str2, str, hashtable));
                    return iA;
                }
                return -1;
            }
            return 101;
            throw th;
        }
    }

    public java.lang.String getCUID() {
        android.content.Context context = a;
        if (context == null) {
            return "";
        }
        try {
            return com.baidu.android.bbalbs.common.util.CommonParam.getCUID(context);
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public java.lang.String getKey() {
        android.content.Context context = a;
        if (context == null) {
            return "";
        }
        try {
            return getPublicKey(context);
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public java.lang.String getMCode() {
        android.content.Context context = a;
        return context == null ? "" : com.baidu.lbsapi.auth.b.a(context);
    }

    public java.lang.String getPublicKey(android.content.Context context) throws android.content.pm.PackageManager.NameNotFoundException {
        return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("com.baidu.lbsapi.API_KEY");
    }
}
