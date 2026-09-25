package com.google.android.play.core.appupdate;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AppUpdateInfo {
    public static com.google.android.play.core.appupdate.AppUpdateInfo a(java.lang.String str, int i, int i2, int i3, int i4, long j, long j2, android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2) {
        return new com.google.android.play.core.appupdate.k(str, i, i2, i3, i4, j, j2, pendingIntent, pendingIntent2);
    }

    public abstract int a();

    public abstract int availableVersionCode();

    public abstract long b();

    public abstract long c();

    abstract android.app.PendingIntent d();

    abstract android.app.PendingIntent e();

    public abstract int installStatus();

    public boolean isUpdateTypeAllowed(int i) {
        if (i == 0) {
            return e() != null;
        }
        return i == 1 && d() != null;
    }

    public abstract java.lang.String packageName();

    public abstract int updateAvailability();
}
