package com.google.android.play.core.install;

/* JADX INFO: loaded from: classes2.dex */
final class a extends com.google.android.play.core.install.InstallState {
    private final int a;
    private final long b;
    private final long c;
    private final int d;
    private final java.lang.String e;

    a(int i, long j, long j2, int i2, java.lang.String str) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = i2;
        java.util.Objects.requireNonNull(str, "Null packageName");
        this.e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long a() {
        return this.b;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long b() {
        return this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.play.core.install.InstallState) {
            com.google.android.play.core.install.InstallState installState = (com.google.android.play.core.install.InstallState) obj;
            if (this.a == installState.installStatus() && this.b == installState.a() && this.c == installState.b() && this.d == installState.installErrorCode() && this.e.equals(installState.packageName())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        long j = this.b;
        int i2 = (i ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.c;
        return ((((i2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int installErrorCode() {
        return this.d;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int installStatus() {
        return this.a;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final java.lang.String packageName() {
        return this.e;
    }

    public final java.lang.String toString() {
        int i = this.a;
        long j = this.b;
        long j2 = this.c;
        int i2 = this.d;
        java.lang.String str = this.e;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
