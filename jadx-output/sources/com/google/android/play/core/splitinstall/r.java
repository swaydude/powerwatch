package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
final class r {
    private static final com.google.android.play.core.splitcompat.a b = new com.google.android.play.core.splitcompat.a("SplitInstallService");
    private static final android.content.Intent c = new android.content.Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    final com.google.android.play.core.internal.t<com.google.android.play.core.internal.bc> a;
    private final java.lang.String d;

    public r(android.content.Context context) {
        this(context, context.getPackageName());
    }

    private r(android.content.Context context, java.lang.String str) {
        this.d = str;
        this.a = new com.google.android.play.core.internal.t<>(com.google.android.play.core.internal.ag.a(context), b, "SplitInstallService", c, com.google.android.play.core.splitinstall.q.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.ArrayList<android.os.Bundle> c(java.util.Collection<java.lang.String> collection) {
        java.util.ArrayList<android.os.Bundle> arrayList = new java.util.ArrayList<>(collection.size());
        for (java.lang.String str : collection) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("language", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.os.Bundle d() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("playcore_version_code", 10604);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.ArrayList<android.os.Bundle> d(java.util.Collection<java.lang.String> collection) {
        java.util.ArrayList<android.os.Bundle> arrayList = new java.util.ArrayList<>(collection.size());
        for (java.lang.String str : collection) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final com.google.android.play.core.tasks.Task<java.util.List<com.google.android.play.core.splitinstall.SplitInstallSessionState>> a() {
        b.a("getSessionStates", new java.lang.Object[0]);
        com.google.android.play.core.tasks.h hVar = new com.google.android.play.core.tasks.h();
        this.a.a(new com.google.android.play.core.splitinstall.z(this, hVar, hVar));
        return hVar.a();
    }

    public final com.google.android.play.core.tasks.Task<com.google.android.play.core.splitinstall.SplitInstallSessionState> a(int i) {
        b.a("getSessionState(%d)", java.lang.Integer.valueOf(i));
        com.google.android.play.core.tasks.h hVar = new com.google.android.play.core.tasks.h();
        this.a.a(new com.google.android.play.core.splitinstall.w(this, hVar, i, hVar));
        return hVar.a();
    }

    public final com.google.android.play.core.tasks.Task<java.lang.Integer> a(java.util.Collection<java.lang.String> collection, java.util.Collection<java.lang.String> collection2) {
        b.a("startInstall(%s,%s)", collection, collection2);
        com.google.android.play.core.tasks.h hVar = new com.google.android.play.core.tasks.h();
        this.a.a(new com.google.android.play.core.splitinstall.t(this, hVar, collection, collection2, hVar));
        return hVar.a();
    }

    public final com.google.android.play.core.tasks.Task<java.lang.Void> a(java.util.List<java.lang.String> list) {
        b.a("deferredUninstall(%s)", list);
        com.google.android.play.core.tasks.h hVar = new com.google.android.play.core.tasks.h();
        this.a.a(new com.google.android.play.core.splitinstall.s(this, hVar, list, hVar));
        return hVar.a();
    }

    public final com.google.android.play.core.tasks.Task<java.lang.Void> b(int i) {
        b.a("cancelInstall(%d)", java.lang.Integer.valueOf(i));
        com.google.android.play.core.tasks.h hVar = new com.google.android.play.core.tasks.h();
        this.a.a(new com.google.android.play.core.splitinstall.y(this, hVar, i, hVar));
        return hVar.a();
    }

    public final com.google.android.play.core.tasks.Task<java.lang.Void> b(java.util.List<java.lang.String> list) {
        b.a("deferredInstall(%s)", list);
        com.google.android.play.core.tasks.h hVar = new com.google.android.play.core.tasks.h();
        this.a.a(new com.google.android.play.core.splitinstall.v(this, hVar, list, hVar));
        return hVar.a();
    }

    public final com.google.android.play.core.tasks.Task<java.lang.Void> c(java.util.List<java.lang.String> list) {
        b.a("deferredLanguageInstall(%s)", list);
        com.google.android.play.core.tasks.h hVar = new com.google.android.play.core.tasks.h();
        this.a.a(new com.google.android.play.core.splitinstall.u(this, hVar, list, hVar));
        return hVar.a();
    }

    public final com.google.android.play.core.tasks.Task<java.lang.Void> d(java.util.List<java.lang.String> list) {
        b.a("deferredLanguageUninstall(%s)", list);
        com.google.android.play.core.tasks.h hVar = new com.google.android.play.core.tasks.h();
        this.a.a(new com.google.android.play.core.splitinstall.x(this, hVar, list, hVar));
        return hVar.a();
    }
}
