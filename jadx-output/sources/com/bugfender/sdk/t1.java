package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class t1<T> {
    public static int i = 65536;
    private static final int j = 1;
    private final java.io.File a;
    private final java.lang.String b;
    private java.io.File c;
    private java.io.PrintWriter d;
    private final com.bugfender.sdk.a<T, java.lang.String> e;
    private final com.bugfender.sdk.a<java.io.File, java.util.List<T>> f;
    private int g = 0;
    private final com.bugfender.sdk.c0 h;

    class a implements java.io.FilenameFilter {
        final /* synthetic */ java.lang.String a;

        a(java.lang.String str) {
            this.a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(java.io.File file, java.lang.String str) {
            return str.startsWith(this.a);
        }
    }

    private static class b extends com.bugfender.sdk.h0.a {
        public b(java.io.File[] fileArr) {
            super(fileArr);
        }

        @Override // com.bugfender.sdk.h0.a
        public int a(java.io.File file, java.lang.Long l, java.io.File file2, java.lang.Long l2) {
            return l.compareTo(l2);
        }
    }

    public t1(com.bugfender.sdk.a<T, java.lang.String> aVar, com.bugfender.sdk.a<java.io.File, java.util.List<T>> aVar2, java.io.File file, java.lang.String str, com.bugfender.sdk.c0 c0Var) {
        this.e = aVar;
        this.f = aVar2;
        this.a = file;
        this.b = str;
        this.h = c0Var;
    }

    private com.bugfender.sdk.e0<T> a(java.io.File file, java.lang.String str, int i2) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (file != null) {
            java.io.File[] fileArrListFiles = file.listFiles(new com.bugfender.sdk.t1.a(str));
            com.bugfender.sdk.h0.a(fileArrListFiles, new com.bugfender.sdk.t1.b(fileArrListFiles));
            if (i2 == 0) {
                i2 = Integer.MAX_VALUE;
            }
            for (int i3 = 0; i3 < fileArrListFiles.length && i3 < i2; i3++) {
                java.io.File file2 = fileArrListFiles[i3];
                linkedList2.add(file2);
                linkedList.addAll(this.f.b(file2));
            }
        }
        return new com.bugfender.sdk.e0<>(linkedList, linkedList2);
    }

    private boolean a(java.lang.String str, java.io.File file) {
        return file.length() + ((long) com.bugfender.sdk.r2.b(str)) <= ((long) i);
    }

    private boolean a(boolean z) {
        boolean z2 = !z;
        if (z2 && this.g > 0) {
            this.g = 0;
            return true;
        }
        int i2 = this.g;
        if (i2 > 1) {
            return true;
        }
        if (z) {
            this.g = i2 + 1;
        }
        return z2;
    }

    public com.bugfender.sdk.e0<T> a(int i2) {
        return a(this.a, this.b, i2);
    }

    public boolean a() {
        boolean z = true;
        for (java.io.File file : this.a.listFiles()) {
            long length = file.length();
            boolean zDelete = file.delete();
            if (zDelete) {
                this.h.c(length);
            }
            z &= zDelete;
        }
        return z;
    }

    public boolean a(java.io.File file) {
        long length = file.length();
        boolean zDelete = file.delete();
        if (zDelete) {
            this.h.c(length);
        }
        return zDelete;
    }

    public boolean a(T t) {
        try {
            java.lang.String strB = this.e.b(t);
            java.io.File file = this.c;
            if (file != null && !a(strB, file)) {
                d();
            }
            if (this.c == null) {
                this.c = new java.io.File(this.a, this.b);
            }
            if (this.d == null) {
                this.d = new java.io.PrintWriter(this.c);
            }
            this.d.println(strB);
            this.d.flush();
            boolean zCheckError = this.d.checkError();
            if (!zCheckError) {
                this.h.a(com.bugfender.sdk.r2.b(strB));
            }
            return a(zCheckError);
        } catch (java.lang.Exception unused) {
            return a(true);
        }
    }

    public boolean a(java.util.List<java.io.File> list) {
        boolean z = true;
        for (java.io.File file : list) {
            long length = file.length();
            boolean zDelete = file.delete();
            if (zDelete) {
                this.h.c(length);
            }
            z &= zDelete;
        }
        return z;
    }

    public com.bugfender.sdk.e0<T> b() {
        return a(0);
    }

    public com.bugfender.sdk.e0<T> b(int i2) {
        return a(this.a, this.b + "-", i2);
    }

    public com.bugfender.sdk.e0<T> c() {
        return b(0);
    }

    public boolean d() {
        java.io.PrintWriter printWriter = this.d;
        if (printWriter != null) {
            printWriter.close();
        }
        if (this.c == null) {
            return false;
        }
        java.io.File file = new java.io.File(this.a, this.b + "-" + java.lang.System.currentTimeMillis() + ".json");
        boolean zRenameTo = this.c.renameTo(file);
        if (zRenameTo) {
            this.c = null;
            this.d = null;
            if (file.length() == 0) {
                file.delete();
            }
        }
        return zRenameTo;
    }
}
