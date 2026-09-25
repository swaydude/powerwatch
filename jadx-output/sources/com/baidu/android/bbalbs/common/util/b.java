package com.baidu.android.bbalbs.common.util;

/* JADX INFO: loaded from: classes.dex */
final class b {
    private static final java.lang.String e = a(new byte[]{81, 72, 116, 79, 75, 72, 69, 52, 76, 51, 103, 61}, new byte[]{82, 51, 104, 90, 83, 122, 65, 105, 101, 49, 107, 61});
    private static final java.lang.String f = a(new byte[]{76, 67, 77, 53, 77, 70, 90, 73, 81, 107, 107, 61}, new byte[]{90, 105, 108, 121, 79, 68, 100, 81, 86, 121, 89, 61});
    private java.lang.String a;
    private java.lang.String b;
    private int c = 3;
    private int d;

    b() {
    }

    static com.baidu.android.bbalbs.common.util.b a(android.content.Context context, java.lang.String str) {
        return b(context, str);
    }

    static com.baidu.android.bbalbs.common.util.b a(com.baidu.android.bbalbs.common.util.a aVar) {
        if (aVar == null) {
            throw new java.lang.IllegalArgumentException("arg non-nullable is expected");
        }
        com.baidu.android.bbalbs.common.util.b bVar = new com.baidu.android.bbalbs.common.util.b();
        bVar.a(aVar.a());
        bVar.b(aVar.b());
        return bVar;
    }

    private static java.lang.String a(byte[]... bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte[] bArr2 : bArr) {
            sb.append(new java.lang.String(com.baidu.android.bbalbs.common.a.b.a(bArr2)));
        }
        return sb.toString();
    }

    static com.baidu.android.bbalbs.common.util.b b(android.content.Context context) {
        java.io.File fileD = d(context);
        if (fileD.exists()) {
            return d(com.baidu.android.bbalbs.common.util.d.a(fileD));
        }
        return null;
    }

    private static com.baidu.android.bbalbs.common.util.b b(android.content.Context context, java.lang.String str) {
        java.lang.StringBuilder sb;
        com.baidu.android.bbalbs.common.util.b bVar = new com.baidu.android.bbalbs.common.util.b();
        boolean z = android.os.Build.VERSION.SDK_INT < 23;
        java.lang.String strA = com.baidu.android.bbalbs.common.util.d.a(context);
        if (z) {
            java.lang.String strE = e(context);
            if (android.text.TextUtils.isEmpty(strE)) {
                strE = java.util.UUID.randomUUID().toString();
                c(context, strE);
            }
            sb = new java.lang.StringBuilder();
            sb.append(strA);
            sb.append(strE);
        } else {
            sb = new java.lang.StringBuilder();
            sb.append("com.baidu");
            sb.append(strA);
        }
        bVar.a(com.baidu.android.bbalbs.common.a.c.a(sb.toString().getBytes(), true));
        bVar.b(str);
        bVar.a(android.os.Build.VERSION.SDK_INT);
        return bVar;
    }

    private java.lang.String b() {
        try {
            org.json.JSONObject jSONObjectPut = new org.json.JSONObject().put(i("ZGV2aWNlaWQ="), this.a);
            java.lang.String strI = i("ZmxhZw==");
            java.lang.String str = this.b;
            if (str == null) {
                str = "0";
            }
            return jSONObjectPut.put(strI, str).put(i("dmVy"), this.c).put(i("c2Rr"), this.d).toString();
        } catch (org.json.JSONException e2) {
            com.baidu.android.bbalbs.common.util.d.a(e2);
            return null;
        }
    }

    static com.baidu.android.bbalbs.common.util.b c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String strOptString = jSONObject.optString(i("ZmxhZw=="), "0");
            java.lang.String string = jSONObject.getString(i("ZGV2aWNlaWQ="));
            int iOptInt = jSONObject.optInt(i("c2Rr"), 0);
            if (!android.text.TextUtils.isEmpty(string)) {
                com.baidu.android.bbalbs.common.util.b bVar = new com.baidu.android.bbalbs.common.util.b();
                bVar.a(string);
                bVar.b(strOptString);
                bVar.a(iOptInt);
                return bVar;
            }
        } catch (org.json.JSONException e2) {
            com.baidu.android.bbalbs.common.util.d.a(e2);
        }
        return null;
    }

    private static void c(android.content.Context context, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(com.baidu.android.bbalbs.common.util.d.a(context, "XL5g0WZAHpIaKspIHIHYg5k")) && com.baidu.android.bbalbs.common.util.d.b(context)) {
            com.baidu.android.bbalbs.common.util.d.a(context, "XL5g0WZAHpIaKspIHIHYg5k", g(str));
        }
    }

    private boolean c(android.content.Context context) {
        java.lang.String strE = e(b());
        java.io.FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            fileOutputStreamOpenFileOutput = context.openFileOutput("libcuid_v3.so", 0);
            fileOutputStreamOpenFileOutput.write(strE.getBytes());
            fileOutputStreamOpenFileOutput.flush();
            if (fileOutputStreamOpenFileOutput == null) {
                return true;
            }
            try {
                return true;
            } catch (java.lang.Exception e2) {
                return true;
            }
        } catch (java.lang.Exception e3) {
            com.baidu.android.bbalbs.common.util.d.a(e3);
            return false;
        } finally {
            if (fileOutputStreamOpenFileOutput != null) {
                try {
                    fileOutputStreamOpenFileOutput.close();
                } catch (java.lang.Exception e4) {
                    com.baidu.android.bbalbs.common.util.d.a(e4);
                }
            }
        }
    }

    static com.baidu.android.bbalbs.common.util.b d(java.lang.String str) {
        return c(f(str));
    }

    private static java.io.File d(android.content.Context context) {
        return new java.io.File(context.getFilesDir(), "libcuid_v3.so");
    }

    private static java.lang.String e(android.content.Context context) {
        return h(com.baidu.android.bbalbs.common.util.d.a(context, "XL5g0WZAHpIaKspIHIHYg5k"));
    }

    static java.lang.String e(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return com.baidu.android.bbalbs.common.a.b.a(com.baidu.android.bbalbs.common.a.a.a(e, f, str.getBytes()), "utf-8");
        } catch (java.io.UnsupportedEncodingException | java.lang.Exception e2) {
            com.baidu.android.bbalbs.common.util.d.a(e2);
            return "";
        }
    }

    static java.lang.String f(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new java.lang.String(com.baidu.android.bbalbs.common.a.a.b(e, f, com.baidu.android.bbalbs.common.a.b.a(str.getBytes())));
        } catch (java.lang.Exception e2) {
            com.baidu.android.bbalbs.common.util.d.a(e2);
            return "";
        }
    }

    static java.lang.String g(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return com.baidu.android.bbalbs.common.a.b.a(com.baidu.android.bbalbs.common.a.a.a(f, e, str.getBytes()), "utf-8");
        } catch (java.io.UnsupportedEncodingException | java.lang.Exception e2) {
            com.baidu.android.bbalbs.common.util.d.a(e2);
            return "";
        }
    }

    static java.lang.String h(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new java.lang.String(com.baidu.android.bbalbs.common.a.a.b(f, e, com.baidu.android.bbalbs.common.a.b.a(str.getBytes())));
        } catch (java.lang.Exception e2) {
            com.baidu.android.bbalbs.common.util.d.a(e2);
            return "";
        }
    }

    static java.lang.String i(java.lang.String str) {
        return new java.lang.String(com.baidu.android.bbalbs.common.a.b.a(str.getBytes()));
    }

    public java.lang.String a() {
        if (android.text.TextUtils.isEmpty(this.b)) {
            this.b = "0";
        }
        return this.a + "|" + this.b;
    }

    public void a(int i) {
        this.d = i;
    }

    public void a(java.lang.String str) {
        this.a = str;
    }

    boolean a(android.content.Context context) {
        return c(context);
    }

    public void b(java.lang.String str) {
        this.b = str;
    }
}
