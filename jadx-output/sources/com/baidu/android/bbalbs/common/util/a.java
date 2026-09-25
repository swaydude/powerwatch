package com.baidu.android.bbalbs.common.util;

/* JADX INFO: loaded from: classes.dex */
final class a {
    private static final java.lang.String e = new java.lang.String(com.baidu.android.bbalbs.common.a.b.a(new byte[]{77, 122, 65, 121, 77, 84, 73, 120, 77, 68, 73, 61})) + new java.lang.String(com.baidu.android.bbalbs.common.a.b.a(new byte[]{90, 71, 108, 106, 100, 87, 82, 112, 89, 87, 73, 61}));
    private java.lang.String a;
    private java.lang.String b;
    private int c = 0;
    private int d = 2;

    a() {
    }

    static boolean a(android.content.Context context) {
        java.io.File fileC = c(context);
        if (fileC.exists()) {
            return fileC.delete();
        }
        return false;
    }

    static com.baidu.android.bbalbs.common.util.a b(android.content.Context context) {
        return d(com.baidu.android.bbalbs.common.util.d.a(c(context)));
    }

    public static boolean b(int i) {
        return i >= 14;
    }

    static com.baidu.android.bbalbs.common.util.a c(java.lang.String str) throws java.lang.Throwable {
        android.util.JsonReader jsonReader;
        android.util.JsonReader jsonReader2 = null;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            jsonReader = new android.util.JsonReader(new java.io.StringReader(str));
            try {
                jsonReader.beginObject();
                java.lang.String strG = g("ZGV2aWNlaWQ=");
                java.lang.String strG2 = g("dmVy");
                java.lang.String strNextString = "0";
                java.lang.String strNextString2 = "";
                int iNextInt = 2;
                while (jsonReader.hasNext()) {
                    java.lang.String strNextName = jsonReader.nextName();
                    if (strG.equals(strNextName)) {
                        strNextString2 = jsonReader.nextString();
                    } else if (strG2.equals(strNextName)) {
                        iNextInt = jsonReader.nextInt();
                    } else {
                        strNextString = jsonReader.nextString();
                    }
                }
                jsonReader.endObject();
                int length = 0;
                if (iNextInt == 2 && !android.text.TextUtils.isEmpty(strNextString)) {
                    length = strNextString.length();
                }
                try {
                    jsonReader.close();
                } catch (java.lang.Exception e2) {
                    com.baidu.android.bbalbs.common.util.d.a(e2);
                }
                if (android.text.TextUtils.isEmpty(strNextString2)) {
                    return null;
                }
                com.baidu.android.bbalbs.common.util.a aVar = new com.baidu.android.bbalbs.common.util.a();
                aVar.a(strNextString2);
                aVar.a(length);
                if (!aVar.d()) {
                    aVar.b(strNextString);
                }
                return aVar;
            } catch (java.io.IOException unused) {
                if (jsonReader != null) {
                    try {
                        jsonReader.close();
                    } catch (java.lang.Exception e3) {
                        com.baidu.android.bbalbs.common.util.d.a(e3);
                    }
                }
                return null;
            } catch (java.lang.Throwable th) {
                th = th;
                jsonReader2 = jsonReader;
                if (jsonReader2 != null) {
                    try {
                        jsonReader2.close();
                    } catch (java.lang.Exception e4) {
                        com.baidu.android.bbalbs.common.util.d.a(e4);
                    }
                }
                throw th;
            }
        } catch (java.io.IOException unused2) {
            jsonReader = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private static java.io.File c(android.content.Context context) {
        return new java.io.File(context.getFilesDir(), "libcuid.so");
    }

    static com.baidu.android.bbalbs.common.util.a d(java.lang.String str) {
        return c(f(str));
    }

    public static boolean e(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str);
    }

    private static java.lang.String f(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            java.lang.String str2 = e;
            return new java.lang.String(com.baidu.android.bbalbs.common.a.a.b(str2, str2, com.baidu.android.bbalbs.common.a.b.a(str.getBytes())));
        } catch (java.lang.Exception e2) {
            com.baidu.android.bbalbs.common.util.d.a(e2);
            return "";
        }
    }

    private static java.lang.String g(java.lang.String str) {
        return new java.lang.String(com.baidu.android.bbalbs.common.a.b.a(str.getBytes()));
    }

    public java.lang.String a() {
        return this.a;
    }

    public void a(int i) {
        this.c = i;
    }

    public void a(java.lang.String str) {
        this.a = str;
    }

    public java.lang.String b() {
        return this.b;
    }

    public void b(java.lang.String str) {
        this.b = str;
    }

    boolean c() {
        java.lang.String str;
        if (d()) {
            str = "O";
        } else {
            if (!e()) {
                return false;
            }
            str = "0";
        }
        this.b = str;
        return true;
    }

    public boolean d() {
        return b(this.c);
    }

    public boolean e() {
        return e(this.b);
    }
}
