package com.google.android.play.core.install;

/* JADX INFO: loaded from: classes2.dex */
public abstract class InstallState {
    public static com.google.android.play.core.install.InstallState a(int i, long j, long j2, int i2, java.lang.String str) {
        return new com.google.android.play.core.install.a(i, j, j2, i2, str);
    }

    public abstract long a();

    public abstract long b();

    public abstract int installErrorCode();

    public abstract int installStatus();

    public abstract java.lang.String packageName();
}
