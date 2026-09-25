package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
final class b extends com.google.android.play.core.splitinstall.SplitInstallSessionState {
    private final int a;
    private final int b;
    private final int c;
    private final long d;
    private final long e;
    private final java.util.List<java.lang.String> f;
    private final java.util.List<java.lang.String> g;
    private final android.app.PendingIntent h;
    private final java.util.List<android.content.Intent> i;

    b(int i, int i2, int i3, long j, long j2, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, android.app.PendingIntent pendingIntent, java.util.List<android.content.Intent> list3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = list;
        this.g = list2;
        this.h = pendingIntent;
        this.i = list3;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    final java.util.List<java.lang.String> a() {
        return this.f;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    final java.util.List<java.lang.String> b() {
        return this.g;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final long bytesDownloaded() {
        return this.d;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    final java.util.List<android.content.Intent> c() {
        return this.i;
    }

    public final boolean equals(java.lang.Object obj) {
        java.util.List<java.lang.String> list;
        java.util.List<java.lang.String> list2;
        android.app.PendingIntent pendingIntent;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.play.core.splitinstall.SplitInstallSessionState) {
            com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState = (com.google.android.play.core.splitinstall.SplitInstallSessionState) obj;
            if (this.a == splitInstallSessionState.sessionId() && this.b == splitInstallSessionState.status() && this.c == splitInstallSessionState.errorCode() && this.d == splitInstallSessionState.bytesDownloaded() && this.e == splitInstallSessionState.totalBytesToDownload() && ((list = this.f) != null ? list.equals(splitInstallSessionState.a()) : splitInstallSessionState.a() == null) && ((list2 = this.g) != null ? list2.equals(splitInstallSessionState.b()) : splitInstallSessionState.b() == null) && ((pendingIntent = this.h) != null ? pendingIntent.equals(splitInstallSessionState.resolutionIntent()) : splitInstallSessionState.resolutionIntent() == null)) {
                java.util.List<android.content.Intent> list3 = this.i;
                java.util.List<android.content.Intent> listC = splitInstallSessionState.c();
                if (list3 != null ? list3.equals(listC) : listC == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final int errorCode() {
        return this.c;
    }

    public final int hashCode() {
        int i = (((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        long j = this.d;
        int i2 = (i ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int i3 = (i2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        java.util.List<java.lang.String> list = this.f;
        int iHashCode = (i3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        java.util.List<java.lang.String> list2 = this.g;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        android.app.PendingIntent pendingIntent = this.h;
        int iHashCode3 = (iHashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        java.util.List<android.content.Intent> list3 = this.i;
        return iHashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @java.lang.Deprecated
    public final android.app.PendingIntent resolutionIntent() {
        return this.h;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final int sessionId() {
        return this.a;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final int status() {
        return this.b;
    }

    public final java.lang.String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        long j = this.d;
        long j2 = this.e;
        java.lang.String strValueOf = java.lang.String.valueOf(this.f);
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.g);
        java.lang.String strValueOf3 = java.lang.String.valueOf(this.h);
        java.lang.String strValueOf4 = java.lang.String.valueOf(this.i);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 251 + java.lang.String.valueOf(strValueOf2).length() + java.lang.String.valueOf(strValueOf3).length() + java.lang.String.valueOf(strValueOf4).length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", moduleNamesNullable=");
        sb.append(strValueOf);
        sb.append(", languagesNullable=");
        sb.append(strValueOf2);
        sb.append(", resolutionIntent=");
        sb.append(strValueOf3);
        sb.append(", splitFileIntents=");
        sb.append(strValueOf4);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final long totalBytesToDownload() {
        return this.e;
    }
}
