package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class f0 {
    private static final int a = com.bugfender.sdk.t1.i - 1024;

    private static java.lang.String a(java.lang.String str, int i) {
        int iRound = (int) java.lang.Math.round((((long) str.length()) * ((long) i)) / ((double) com.bugfender.sdk.r2.b(str)));
        while (true) {
            str = str.substring(0, iRound);
            if (com.bugfender.sdk.r2.b(str) <= i) {
                return str;
            }
            iRound = str.length() - 1;
        }
    }

    public static boolean a(java.lang.String str) {
        return com.bugfender.sdk.r2.b(str) > a;
    }

    public static java.lang.String b(java.lang.String str) {
        return b(str, a - com.bugfender.sdk.r2.a("…")) + "…";
    }

    private static java.lang.String b(java.lang.String str, int i) {
        return java.nio.charset.Charset.defaultCharset().displayName().equals(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8) ? c(str, i) : a(str, i);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0033 A[LOOP:0: B:3:0x0003->B:23:0x0033, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x002e A[SYNTHETIC] */
    private static java.lang.String c(java.lang.String str, int i) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < str.length()) {
            char cCharAt = str.charAt(i4);
            if (cCharAt <= 127) {
                i2 = 1;
            } else if (cCharAt <= 2047) {
                i2 = 2;
            } else {
                if (cCharAt > 55295 && cCharAt <= 57343) {
                    i2 = 4;
                    i3 = 1;
                } else {
                    i2 = 3;
                }
                i5 += i2;
                if (i5 > i) {
                    return str.substring(0, i4);
                }
                i4 = i4 + i3 + 1;
            }
            i3 = 0;
            i5 += i2;
            if (i5 > i) {
                return str.substring(0, i4);
            }
            i4 = i4 + i3 + 1;
        }
        return str;
    }
}
