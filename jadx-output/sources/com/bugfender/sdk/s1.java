package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class s1 implements com.bugfender.sdk.r1 {
    private static final java.lang.String r = "session.json";
    private static final java.lang.String s = "bugfender";
    private static final java.lang.String t = "logs";
    private static final java.lang.String u = "issues";
    private static final java.lang.String v = "crashes";
    private final android.content.Context c;
    private final com.bugfender.sdk.n2 d;
    private final com.bugfender.sdk.l2 e;
    private final com.bugfender.sdk.a<com.bugfender.sdk.e1, java.lang.String> f;
    private final com.bugfender.sdk.a<java.io.File, java.util.List<com.bugfender.sdk.e1>> g;
    private final com.bugfender.sdk.a<com.bugfender.sdk.u0, java.lang.String> h;
    private final com.bugfender.sdk.a<java.io.File, java.util.List<com.bugfender.sdk.u0>> i;
    private final com.bugfender.sdk.a<java.lang.String, java.lang.String> j = new com.bugfender.sdk.v2();
    private final com.bugfender.sdk.a<java.io.File, java.util.List<java.lang.String>> k = new com.bugfender.sdk.u2();
    private com.bugfender.sdk.t1<com.bugfender.sdk.e1> l;
    private com.bugfender.sdk.t1<com.bugfender.sdk.u0> m;
    private com.bugfender.sdk.t1<java.lang.String> n;
    private java.io.File o;
    private java.io.File p;
    private com.bugfender.sdk.c0 q;

    class a implements java.io.FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(java.io.File file) {
            return file.isDirectory() && file.getName().equalsIgnoreCase(com.bugfender.sdk.s1.t);
        }
    }

    class b extends com.bugfender.sdk.h0.a {
        b(java.io.File[] fileArr) {
            super(fileArr);
        }

        @Override // com.bugfender.sdk.h0.a
        public int a(java.io.File file, java.lang.Long l, java.io.File file2, java.lang.Long l2) {
            return l.compareTo(l2);
        }
    }

    class c extends com.bugfender.sdk.h0.a {
        c(java.io.File[] fileArr) {
            super(fileArr);
        }

        @Override // com.bugfender.sdk.h0.a
        public int a(java.io.File file, java.lang.Long l, java.io.File file2, java.lang.Long l2) {
            return l.compareTo(l2);
        }
    }

    public s1(android.content.Context context, com.bugfender.sdk.n2 n2Var, com.bugfender.sdk.l2 l2Var, com.bugfender.sdk.g1 g1Var, com.bugfender.sdk.f1 f1Var, com.bugfender.sdk.x0 x0Var, com.bugfender.sdk.v0 v0Var, com.bugfender.sdk.c0 c0Var) {
        this.c = context;
        this.d = n2Var;
        this.e = l2Var;
        this.f = g1Var;
        this.g = f1Var;
        this.h = x0Var;
        this.i = v0Var;
        this.q = c0Var;
    }

    private java.io.File a(java.io.File file, java.lang.String str) throws java.io.FileNotFoundException {
        for (java.io.File file2 : file.listFiles()) {
            if (file2.isDirectory() && file2.getName().contains(str)) {
                return file2;
            }
        }
        java.lang.String str2 = "The " + str + " folder inside the session folder: " + file.getName() + " couldn't be opened.";
        com.bugfender.sdk.d1.b(com.bugfender.sdk.k1.G, str2);
        throw new java.io.FileNotFoundException(str2);
    }

    private void a(java.io.File[] fileArr, java.util.Comparator<java.io.File> comparator) {
        if (comparator == null) {
            com.bugfender.sdk.h0.a(fileArr, new com.bugfender.sdk.s1.b(fileArr));
        } else {
            java.util.Arrays.sort(fileArr, comparator);
        }
    }

    private static int b(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    private long b(java.io.File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        long length = 0;
        for (java.io.File file2 : file.listFiles()) {
            length += file2.isFile() ? file2.length() : b(file2);
        }
        return length;
    }

    private java.io.File e(long j) {
        java.io.File file = new java.io.File(h(), "session-" + j);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    private java.io.File e(com.bugfender.sdk.k2 k2Var) throws java.io.FileNotFoundException {
        java.io.File fileE = e(k2Var.f());
        if (fileE != null && fileE.exists()) {
            return fileE;
        }
        java.lang.String str = "The old session with local-sessionId: " + k2Var.f() + " couldn't be opened.";
        com.bugfender.sdk.d1.b(com.bugfender.sdk.k1.G, str);
        throw new java.io.FileNotFoundException(str);
    }

    private java.io.File h() {
        return this.c.getDir(s, 0);
    }

    @Override // com.bugfender.sdk.r1
    public com.bugfender.sdk.t1<com.bugfender.sdk.u0> a(com.bugfender.sdk.k2 k2Var) throws com.bugfender.sdk.u1 {
        try {
            return new com.bugfender.sdk.t1<>(this.h, this.i, a(e(k2Var), u), u, this.q);
        } catch (java.io.FileNotFoundException e) {
            throw new com.bugfender.sdk.u1(e);
        }
    }

    @Override // com.bugfender.sdk.r1
    public java.util.List<com.bugfender.sdk.k2> a() {
        java.io.File fileH = h();
        com.bugfender.sdk.k2 k2VarC = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.File[] fileArrListFiles = fileH.listFiles();
        com.bugfender.sdk.h0.a(fileArrListFiles, new com.bugfender.sdk.s1.c(fileArrListFiles));
        for (java.io.File file : fileArrListFiles) {
            if (file.isDirectory() && !file.getName().contains(java.lang.String.valueOf(k2VarC.f()))) {
                for (java.io.File file2 : file.listFiles()) {
                    if (file2.getName().equalsIgnoreCase(r)) {
                        com.bugfender.sdk.k2 k2VarB = this.e.b(file2);
                        if (k2VarB != null) {
                            arrayList.add(k2VarB);
                        } else {
                            com.bugfender.sdk.h0.a(file, this.q);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.bugfender.sdk.r1
    public java.util.List<java.io.File> a(long j, java.util.Comparator<java.io.File> comparator) {
        java.io.File[] fileArrListFiles = e(j).listFiles(new com.bugfender.sdk.s1.a());
        if (fileArrListFiles.length <= 0) {
            return java.util.Collections.emptyList();
        }
        java.io.File[] fileArrListFiles2 = fileArrListFiles[0].listFiles();
        a(fileArrListFiles2, comparator);
        return java.util.Arrays.asList(fileArrListFiles2);
    }

    @Override // com.bugfender.sdk.r1
    public void a(long j, long j2) throws java.lang.Throwable {
        java.io.File file = new java.io.File(e(j), r);
        com.bugfender.sdk.k2 k2VarB = this.e.b(file);
        k2VarB.a(j2);
        com.bugfender.sdk.h0.b(file, this.d.b(k2VarB), this.q);
    }

    @Override // com.bugfender.sdk.r1
    public boolean a(long j) {
        return com.bugfender.sdk.h0.a(e(j), this.q);
    }

    @Override // com.bugfender.sdk.r1
    public boolean a(java.io.File file) {
        long length = file.length();
        boolean zDelete = file.delete();
        if (zDelete) {
            this.q.c(length);
        }
        return zDelete;
    }

    @Override // com.bugfender.sdk.r1
    public com.bugfender.sdk.t1<com.bugfender.sdk.e1> b(com.bugfender.sdk.k2 k2Var) throws com.bugfender.sdk.u1 {
        try {
            return new com.bugfender.sdk.t1<>(this.f, this.g, a(e(k2Var), t), t, this.q);
        } catch (java.io.FileNotFoundException e) {
            throw new com.bugfender.sdk.u1(e);
        }
    }

    @Override // com.bugfender.sdk.r1
    public java.util.List<com.bugfender.sdk.k2> b() {
        com.bugfender.sdk.k2 k2VarC = c();
        java.util.List<com.bugfender.sdk.k2> listA = a();
        if (listA.isEmpty()) {
            return java.util.Collections.singletonList(k2VarC);
        }
        listA.add(listA.size(), k2VarC);
        return listA;
    }

    @Override // com.bugfender.sdk.r1
    public boolean b(long j) {
        return com.bugfender.sdk.h0.b(new java.io.File(e(j), v), this.q);
    }

    @Override // com.bugfender.sdk.r1
    public com.bugfender.sdk.k2 c() {
        if (this.p != null) {
            this.p = new java.io.File(this.o, r);
        }
        return this.e.b(this.p);
    }

    @Override // com.bugfender.sdk.r1
    public com.bugfender.sdk.t1<java.lang.String> c(com.bugfender.sdk.k2 k2Var) throws com.bugfender.sdk.u1 {
        try {
            return new com.bugfender.sdk.t1<>(this.j, this.k, a(e(k2Var), v), v, this.q);
        } catch (java.io.FileNotFoundException e) {
            throw new com.bugfender.sdk.u1(e);
        }
    }

    @Override // com.bugfender.sdk.r1
    public java.util.List<java.io.File> c(long j) {
        return a(j, (java.util.Comparator<java.io.File>) null);
    }

    @Override // com.bugfender.sdk.r1
    public com.bugfender.sdk.t1<com.bugfender.sdk.e1> d() {
        return this.l;
    }

    @Override // com.bugfender.sdk.r1
    public void d(long j) throws java.lang.Throwable {
        com.bugfender.sdk.k2 k2VarC = c();
        k2VarC.a(j);
        com.bugfender.sdk.h0.b(this.p, this.d.b(k2VarC), this.q);
    }

    @Override // com.bugfender.sdk.r1
    public void d(com.bugfender.sdk.k2 k2Var) throws java.lang.Throwable {
        java.io.File fileH = h();
        if (!fileH.exists()) {
            throw new com.bugfender.sdk.i("Bugfender folder doesn't exist and it couldn't be created");
        }
        java.lang.String str = "session-" + k2Var.f();
        java.io.File file = new java.io.File(fileH, str);
        this.o = file;
        if (!file.mkdir()) {
            throw new com.bugfender.sdk.i("Session with name: " + str + " couldn't create the session folder.");
        }
        this.p = new java.io.File(this.o, r);
        com.bugfender.sdk.h0.a(this.p, this.d.b(k2Var), this.q);
        java.io.File file2 = new java.io.File(this.o, t);
        if (!file2.mkdir()) {
            throw new com.bugfender.sdk.i("Session folder: " + this.o.getName() + " couldn't create the log folder.");
        }
        this.l = new com.bugfender.sdk.t1<>(this.f, this.g, file2, t, this.q);
        java.io.File file3 = new java.io.File(this.o, u);
        if (!file3.mkdir()) {
            throw new com.bugfender.sdk.i("Session folder: " + this.o.getName() + " couldn't create the issue folder.");
        }
        this.m = new com.bugfender.sdk.t1<>(this.h, this.i, file3, u, this.q);
        java.io.File file4 = new java.io.File(this.o, v);
        if (file4.mkdir()) {
            this.n = new com.bugfender.sdk.t1<>(this.j, this.k, file4, v, this.q);
            return;
        }
        throw new com.bugfender.sdk.i("Crashes folder: " + file4.getName() + " couldn't create the crashes folder.");
    }

    @Override // com.bugfender.sdk.r1
    public com.bugfender.sdk.t1<com.bugfender.sdk.u0> e() {
        return this.m;
    }

    @Override // com.bugfender.sdk.r1
    public com.bugfender.sdk.t1<java.lang.String> f() {
        return this.n;
    }

    @Override // com.bugfender.sdk.r1
    public long g() {
        if (!this.q.b()) {
            this.q.b(b(h()));
        }
        return this.q.a();
    }
}
