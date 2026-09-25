package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class d2 implements java.io.Closeable {
    private final int a;
    private final java.nio.charset.Charset b;
    private final java.io.RandomAccessFile c;
    private final byte[][] d;
    private final int e;
    private final int f;
    private com.bugfender.sdk.d2.b g;
    private boolean h;

    private class b {
        private final long a;
        private final byte[] b;
        private byte[] c;
        private int d;

        private b(long j, int i, byte[] bArr) throws java.io.IOException {
            this.a = j;
            int length = (bArr != null ? bArr.length : 0) + i;
            byte[] bArr2 = new byte[length];
            this.b = bArr2;
            long j2 = (j - 1) * ((long) com.bugfender.sdk.d2.this.a);
            if (j > 0) {
                com.bugfender.sdk.d2.this.c.seek(j2);
                if (com.bugfender.sdk.d2.this.c.read(bArr2, 0, i) != i) {
                    throw new java.lang.IllegalStateException("Count of requested bytes and actually read bytes don't match");
                }
            }
            if (bArr != null) {
                java.lang.System.arraycopy(bArr, 0, bArr2, i, bArr.length);
            }
            this.d = length - 1;
            this.c = null;
        }

        private int a(byte[] bArr, int i) {
            for (byte[] bArr2 : com.bugfender.sdk.d2.this.d) {
                boolean z = true;
                for (int length = bArr2.length - 1; length >= 0; length--) {
                    int length2 = (i + length) - (bArr2.length - 1);
                    z &= length2 >= 0 && bArr[length2] == bArr2[length];
                }
                if (z) {
                    return bArr2.length;
                }
            }
            return 0;
        }

        private void a() {
            int i = this.d + 1;
            if (i > 0) {
                byte[] bArr = new byte[i];
                this.c = bArr;
                java.lang.System.arraycopy(this.b, 0, bArr, 0, i);
            } else {
                this.c = null;
            }
            this.d = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.String b() throws java.io.IOException {
            java.lang.String str;
            byte[] bArr;
            boolean z = this.a == 1;
            int i = this.d;
            while (true) {
                if (i > -1) {
                    if (z || i >= com.bugfender.sdk.d2.this.e) {
                        int iA = a(this.b, i);
                        if (iA > 0) {
                            int i2 = i + 1;
                            int i3 = (this.d - i2) + 1;
                            if (i3 < 0) {
                                throw new java.lang.IllegalStateException("Unexpected negative line length=" + i3);
                            }
                            byte[] bArr2 = new byte[i3];
                            java.lang.System.arraycopy(this.b, i2, bArr2, 0, i3);
                            str = new java.lang.String(bArr2, com.bugfender.sdk.d2.this.b);
                            this.d = i - iA;
                        } else {
                            i -= com.bugfender.sdk.d2.this.f;
                            if (i < 0) {
                            }
                        }
                        if (!z && (bArr = this.c) != null) {
                            java.lang.String str2 = new java.lang.String(bArr, com.bugfender.sdk.d2.this.b);
                            this.c = null;
                            return str2;
                        }
                    }
                    a();
                }
                str = null;
                return !z ? str : str;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.bugfender.sdk.d2.b c() throws java.io.IOException {
            if (this.d > -1) {
                throw new java.lang.IllegalStateException("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=" + this.d);
            }
            long j = this.a;
            if (j > 1) {
                com.bugfender.sdk.d2 d2Var = com.bugfender.sdk.d2.this;
                return d2Var.new b(j - 1, d2Var.a, this.c);
            }
            if (this.c == null) {
                return null;
            }
            throw new java.lang.IllegalStateException("Unexpected leftover of the last block: leftOverOfThisFilePart=" + new java.lang.String(this.c, com.bugfender.sdk.d2.this.b));
        }
    }

    private d2(java.io.File file, int i, java.nio.charset.Charset charset) throws java.io.IOException {
        int i2;
        long j;
        this.h = false;
        this.a = i;
        this.b = charset;
        if (charset.newEncoder().maxBytesPerChar() != 1.0f && charset != com.bugfender.sdk.t2.a) {
            throw new java.io.UnsupportedEncodingException("Encoding " + charset + " is not supported yet (feel free to submit a patch)");
        }
        this.f = 1;
        byte[][] bArr = {"\r\n".getBytes(charset), "\n".getBytes(charset), "\r".getBytes(charset)};
        this.d = bArr;
        this.e = bArr[0].length;
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "r");
        this.c = randomAccessFile;
        long length = randomAccessFile.length();
        long j2 = i;
        int i3 = (int) (length % j2);
        if (i3 > 0) {
            i2 = i3;
            j = (length / j2) + 1;
        } else {
            long j3 = length / j2;
            i2 = length > 0 ? i : i3;
            j = j3;
        }
        this.g = new com.bugfender.sdk.d2.b(j, i2, null);
    }

    public d2(java.io.File file, java.nio.charset.Charset charset) throws java.io.IOException {
        this(file, 4096, charset);
    }

    public long a() throws java.io.IOException {
        return this.c.length();
    }

    public java.lang.String b() throws java.io.IOException {
        java.lang.String strB = this.g.b();
        while (strB == null) {
            com.bugfender.sdk.d2.b bVarC = this.g.c();
            this.g = bVarC;
            if (bVarC == null) {
                break;
            }
            strB = bVarC.b();
        }
        if (!"".equals(strB) || this.h) {
            return strB;
        }
        this.h = true;
        return b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.c.close();
    }
}
