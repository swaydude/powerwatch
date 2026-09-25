package com.google.android.play.core.appupdate;

/* JADX INFO: loaded from: classes2.dex */
final class c {
    private static final com.google.android.play.core.splitcompat.a b = new com.google.android.play.core.splitcompat.a("AppUpdateService");
    private static final android.content.Intent c = new android.content.Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    final com.google.android.play.core.internal.t<com.google.android.play.core.internal.l> a;
    private final java.lang.String d;
    private final android.content.Context e;

    public c(android.content.Context context) {
        this.d = context.getPackageName();
        this.e = context;
        this.a = new com.google.android.play.core.internal.t<>(com.google.android.play.core.internal.ag.a(context), b, "AppUpdateService", c, com.google.android.play.core.appupdate.f.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(android.os.Bundle bundle) {
        return bundle.getInt("error.code", -2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.play.core.appupdate.AppUpdateInfo b(android.os.Bundle bundle, java.lang.String str) {
        return com.google.android.play.core.appupdate.AppUpdateInfo.a(str, bundle.getInt("version.code", -1), bundle.getInt("update.availability"), bundle.getInt("install.status", 0), bundle.getInt("client.version.staleness", -1), bundle.getLong("bytes.downloaded"), bundle.getLong("total.bytes.to.download"), (android.app.PendingIntent) bundle.getParcelable("blocking.intent"), (android.app.PendingIntent) bundle.getParcelable("nonblocking.intent"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.os.Bundle c() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("playcore.version.code", 10604);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.os.Bundle c(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putAll(c());
        bundle.putString("package.name", str);
        java.lang.Integer numD = d();
        if (numD != null) {
            bundle.putInt("app.version.code", numD.intValue());
        }
        return bundle;
    }

    private final java.lang.Integer d() {
        try {
            return java.lang.Integer.valueOf(this.e.getPackageManager().getPackageInfo(this.e.getPackageName(), 0).versionCode);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            b.d("The current version of the app could not be retrieved", new java.lang.Object[0]);
            return null;
        }
    }

    public final com.google.android.play.core.tasks.Task<com.google.android.play.core.appupdate.AppUpdateInfo> a(java.lang.String str) {
        b.a("requestUpdateInfo(%s)", str);
        com.google.android.play.core.tasks.h hVar = new com.google.android.play.core.tasks.h();
        this.a.a(new com.google.android.play.core.appupdate.e(this, hVar, str, hVar));
        return hVar.a();
    }

    public final com.google.android.play.core.tasks.Task<java.lang.Void> b(java.lang.String str) {
        b.a("completeUpdate(%s)", str);
        com.google.android.play.core.tasks.h hVar = new com.google.android.play.core.tasks.h();
        this.a.a(new com.google.android.play.core.appupdate.h(this, hVar, hVar, str));
        return hVar.a();
    }
}
