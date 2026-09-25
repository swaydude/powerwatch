package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class e1 {
    private int a;
    private int b;
    private long c;
    private java.util.Date d;
    private java.lang.String e;
    private java.lang.String f;
    private java.lang.String g;
    private java.lang.String h;
    private java.lang.String i;
    private java.lang.String j;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.bugfender.sdk.LogLevel.values().length];
            a = iArr;
            try {
                iArr[com.bugfender.sdk.LogLevel.Debug.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                a[com.bugfender.sdk.LogLevel.Warning.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                a[com.bugfender.sdk.LogLevel.Error.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                a[com.bugfender.sdk.LogLevel.Trace.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                a[com.bugfender.sdk.LogLevel.Info.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                a[com.bugfender.sdk.LogLevel.Fatal.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public static class b {
        private int a;
        private int b;
        private long c;
        private java.util.Date d;
        private java.lang.String e;
        private java.lang.String f;
        private java.lang.String g;
        private java.lang.String h;
        private java.lang.String i;
        private java.lang.String j;

        public com.bugfender.sdk.e1.b a(int i) {
            this.b = i;
            return this;
        }

        public com.bugfender.sdk.e1.b a(long j) {
            this.c = j;
            return this;
        }

        public com.bugfender.sdk.e1.b a(java.lang.String str) {
            this.g = str;
            return this;
        }

        public com.bugfender.sdk.e1.b a(java.util.Date date) {
            this.d = date;
            return this;
        }

        public com.bugfender.sdk.e1 a() {
            return new com.bugfender.sdk.e1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null);
        }

        public com.bugfender.sdk.e1.b b(int i) {
            this.a = i;
            return this;
        }

        public com.bugfender.sdk.e1.b b(java.lang.String str) {
            this.f = str;
            return this;
        }

        public com.bugfender.sdk.e1.b c(java.lang.String str) {
            this.e = str;
            return this;
        }

        public com.bugfender.sdk.e1.b d(java.lang.String str) {
            this.h = str;
            return this;
        }

        public com.bugfender.sdk.e1.b e(java.lang.String str) {
            this.j = str;
            return this;
        }

        public com.bugfender.sdk.e1.b f(java.lang.String str) {
            this.i = str;
            return this;
        }
    }

    public enum c {
        D(0),
        W(1),
        E(2),
        T(3),
        I(4),
        F(5);

        private final int a;

        c(int i) {
            this.a = i;
        }

        public static com.bugfender.sdk.e1.c a(com.bugfender.sdk.LogLevel logLevel) {
            switch (com.bugfender.sdk.e1.a.a[logLevel.ordinal()]) {
                case 1:
                    return D;
                case 2:
                    return W;
                case 3:
                    return E;
                case 4:
                    return T;
                case 5:
                    return I;
                case 6:
                    return F;
                default:
                    return D;
            }
        }

        public int a() {
            return this.a;
        }
    }

    private e1(int i, int i2, long j, java.util.Date date, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = date;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
    }

    /* synthetic */ e1(int i, int i2, long j, java.util.Date date, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.bugfender.sdk.e1.a aVar) {
        this(i, i2, j, date, str, str2, str3, str4, str5, str6);
    }

    public long a() {
        return this.c;
    }

    public java.util.Date b() {
        return this.d;
    }

    public java.lang.String c() {
        return this.g;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.a;
    }

    public java.lang.String f() {
        return this.f;
    }

    public java.lang.String g() {
        return this.e;
    }

    public java.lang.String h() {
        return this.h;
    }

    public java.lang.String i() {
        return this.j;
    }

    public java.lang.String j() {
        return this.i;
    }
}
