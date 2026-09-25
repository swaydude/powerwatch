package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum b3 {
    VERBOSE("V"),
    DEBUG("D"),
    INFO("I"),
    WARNING("W"),
    ERROR("E"),
    ASSERT("A"),
    WTF("F");

    private final java.lang.String a;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.bugfender.sdk.b3.values().length];
            a = iArr;
            try {
                iArr[com.bugfender.sdk.b3.VERBOSE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                a[com.bugfender.sdk.b3.INFO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                a[com.bugfender.sdk.b3.WARNING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                a[com.bugfender.sdk.b3.ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                a[com.bugfender.sdk.b3.WTF.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                a[com.bugfender.sdk.b3.DEBUG.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                a[com.bugfender.sdk.b3.ASSERT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    b3(java.lang.String str) {
        this.a = str;
    }

    public static com.bugfender.sdk.b3 a(char c) {
        if (c == 'A') {
            return ASSERT;
        }
        if (c == 'I') {
            return INFO;
        }
        if (c == 'E') {
            return ERROR;
        }
        if (c == 'F') {
            return WTF;
        }
        if (c != 'V') {
            return c != 'W' ? DEBUG : WARNING;
        }
        return VERBOSE;
    }

    public java.lang.String a() {
        return this.a;
    }

    public com.bugfender.sdk.LogLevel b() {
        int i2 = com.bugfender.sdk.b3.a.a[ordinal()];
        if (i2 == 1) {
            return com.bugfender.sdk.LogLevel.Trace;
        }
        if (i2 == 2) {
            return com.bugfender.sdk.LogLevel.Info;
        }
        if (i2 == 3) {
            return com.bugfender.sdk.LogLevel.Warning;
        }
        if (i2 != 4) {
            return i2 != 5 ? com.bugfender.sdk.LogLevel.Debug : com.bugfender.sdk.LogLevel.Fatal;
        }
        return com.bugfender.sdk.LogLevel.Error;
    }
}
