package com.google.android.play.core.appupdate;

/* JADX INFO: loaded from: classes2.dex */
final class k extends com.google.android.play.core.appupdate.AppUpdateInfo {
    private final java.lang.String a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final long f;
    private final long g;
    private final android.app.PendingIntent h;
    private final android.app.PendingIntent i;

    k(java.lang.String str, int i, int i2, int i3, int i4, long j, long j2, android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2) {
        java.util.Objects.requireNonNull(str, "Null packageName");
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = j;
        this.g = j2;
        this.h = pendingIntent;
        this.i = pendingIntent2;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    public final int a() {
        return this.e;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    public final int availableVersionCode() {
        return this.b;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    public final long b() {
        return this.f;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    public final long c() {
        return this.g;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    final android.app.PendingIntent d() {
        return this.h;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    final android.app.PendingIntent e() {
        return this.i;
    }

    public final boolean equals(java.lang.Object obj) {
        android.app.PendingIntent pendingIntent;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.play.core.appupdate.AppUpdateInfo) {
            com.google.android.play.core.appupdate.AppUpdateInfo appUpdateInfo = (com.google.android.play.core.appupdate.AppUpdateInfo) obj;
            if (this.a.equals(appUpdateInfo.packageName()) && this.b == appUpdateInfo.availableVersionCode() && this.c == appUpdateInfo.updateAvailability() && this.d == appUpdateInfo.installStatus() && this.e == appUpdateInfo.a() && this.f == appUpdateInfo.b() && this.g == appUpdateInfo.c() && ((pendingIntent = this.h) != null ? pendingIntent.equals(appUpdateInfo.d()) : appUpdateInfo.d() == null)) {
                android.app.PendingIntent pendingIntent2 = this.i;
                android.app.PendingIntent pendingIntentE = appUpdateInfo.e();
                if (pendingIntent2 != null ? pendingIntent2.equals(pendingIntentE) : pendingIntentE == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003;
        long j = this.f;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.g;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        android.app.PendingIntent pendingIntent = this.h;
        int iHashCode2 = (i2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        android.app.PendingIntent pendingIntent2 = this.i;
        return iHashCode2 ^ (pendingIntent2 != null ? pendingIntent2.hashCode() : 0);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    public final int installStatus() {
        return this.d;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    public final java.lang.String packageName() {
        return this.a;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        long j = this.f;
        long j2 = this.g;
        java.lang.String strValueOf = java.lang.String.valueOf(this.h);
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.i);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 288 + java.lang.String.valueOf(strValueOf).length() + java.lang.String.valueOf(strValueOf2).length());
        sb.append("AppUpdateInfo{packageName=");
        sb.append(str);
        sb.append(", availableVersionCode=");
        sb.append(i);
        sb.append(", updateAvailability=");
        sb.append(i2);
        sb.append(", installStatus=");
        sb.append(i3);
        sb.append(", clientVersionStalenessDays=");
        sb.append(i4);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", immediateUpdateIntent=");
        sb.append(strValueOf);
        sb.append(", flexibleUpdateIntent=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    public final int updateAvailability() {
        return this.c;
    }
}
