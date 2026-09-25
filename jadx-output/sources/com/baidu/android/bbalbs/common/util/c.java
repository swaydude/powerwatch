package com.baidu.android.bbalbs.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static com.baidu.android.bbalbs.common.util.b b = null;
    private static java.lang.String c = "";
    private static volatile java.lang.String d = "";
    private final android.content.Context a;

    private c(android.content.Context context) {
        this.a = context.getApplicationContext();
    }

    static java.lang.String a() {
        if (android.text.TextUtils.isEmpty(c)) {
            c = "0newiqr3mini0";
        }
        return c;
    }

    public static java.lang.String a(android.content.Context context) {
        return b(context).a();
    }

    public static void a(java.lang.String str) {
        if (!com.baidu.android.bbalbs.common.util.d.a(str, 5)) {
            throw new java.lang.IllegalArgumentException("expect src only letter or number , less than 6");
        }
        synchronized (com.baidu.android.bbalbs.common.util.b.class) {
            if (android.text.TextUtils.isEmpty(d)) {
                d = str;
                int length = 5 - str.length();
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                stringBuffer.append("0newiqr3");
                stringBuffer.append(str);
                for (int i = 0; i < length; i++) {
                    stringBuffer.append("0");
                }
                c = stringBuffer.toString().trim();
            }
        }
    }

    private com.baidu.android.bbalbs.common.util.b b() {
        com.baidu.android.bbalbs.common.util.b bVarB = com.baidu.android.bbalbs.common.util.b.b(this.a);
        boolean z = bVarB == null;
        if (bVarB == null) {
            com.baidu.android.bbalbs.common.util.a aVarB = com.baidu.android.bbalbs.common.util.a.b(this.a);
            if (aVarB == null) {
                bVarB = com.baidu.android.bbalbs.common.util.b.a(this.a, a());
            } else {
                aVarB.c();
                bVarB = com.baidu.android.bbalbs.common.util.b.a(aVarB);
            }
        }
        if (z) {
            bVarB.a(this.a);
        }
        com.baidu.android.bbalbs.common.util.a.a(this.a);
        return bVarB;
    }

    private static com.baidu.android.bbalbs.common.util.b b(android.content.Context context) {
        if (b == null) {
            synchronized (com.baidu.android.bbalbs.common.util.b.class) {
                if (b == null) {
                    b = new com.baidu.android.bbalbs.common.util.c(context).b();
                }
            }
        }
        return b;
    }
}
