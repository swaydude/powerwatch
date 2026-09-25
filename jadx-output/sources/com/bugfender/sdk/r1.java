package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public interface r1 {
    public static final java.util.Comparator<java.io.File> a = new com.bugfender.sdk.r1.a();
    public static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("logs-([\\d]+)\\.json");

    class a implements java.util.Comparator<java.io.File> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(java.io.File file, java.io.File file2) {
            java.lang.String name = file.getName();
            java.lang.String name2 = file2.getName();
            java.util.regex.Pattern pattern = com.bugfender.sdk.r1.b;
            java.util.regex.Matcher matcher = pattern.matcher(name);
            java.util.regex.Matcher matcher2 = pattern.matcher(name2);
            boolean zMatches = matcher.matches();
            boolean zMatches2 = matcher2.matches();
            if (zMatches && zMatches2) {
                return java.lang.Long.valueOf(matcher.group(1)).compareTo(java.lang.Long.valueOf(matcher2.group(1)));
            }
            if (zMatches || zMatches2) {
                return name.equals("logs") ? 1 : -1;
            }
            throw new java.lang.IllegalStateException("Log file doesn't comply to log-TIMESTAMP.json");
        }
    }

    com.bugfender.sdk.t1<com.bugfender.sdk.u0> a(com.bugfender.sdk.k2 k2Var) throws com.bugfender.sdk.u1;

    java.util.List<com.bugfender.sdk.k2> a();

    java.util.List<java.io.File> a(long j, java.util.Comparator<java.io.File> comparator);

    void a(long j, long j2);

    boolean a(long j);

    boolean a(java.io.File file);

    com.bugfender.sdk.t1<com.bugfender.sdk.e1> b(com.bugfender.sdk.k2 k2Var) throws com.bugfender.sdk.u1;

    java.util.List<com.bugfender.sdk.k2> b();

    boolean b(long j);

    com.bugfender.sdk.k2 c();

    com.bugfender.sdk.t1<java.lang.String> c(com.bugfender.sdk.k2 k2Var) throws com.bugfender.sdk.u1;

    java.util.List<java.io.File> c(long j);

    com.bugfender.sdk.t1<com.bugfender.sdk.e1> d();

    void d(long j);

    void d(com.bugfender.sdk.k2 k2Var) throws com.bugfender.sdk.i;

    com.bugfender.sdk.t1<com.bugfender.sdk.u0> e();

    com.bugfender.sdk.t1<java.lang.String> f();

    long g();
}
