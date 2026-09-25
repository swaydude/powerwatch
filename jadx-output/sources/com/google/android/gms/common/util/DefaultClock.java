package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public class DefaultClock implements com.google.android.gms.common.util.Clock {
    private static final com.google.android.gms.common.util.DefaultClock zzgm = new com.google.android.gms.common.util.DefaultClock();

    public static com.google.android.gms.common.util.Clock getInstance() {
        return zzgm;
    }

    @Override // com.google.android.gms.common.util.Clock
    public long currentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.Clock
    public long elapsedRealtime() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.Clock
    public long nanoTime() {
        return java.lang.System.nanoTime();
    }

    @Override // com.google.android.gms.common.util.Clock
    public long currentThreadTimeMillis() {
        return android.os.SystemClock.currentThreadTimeMillis();
    }

    private DefaultClock() {
    }
}
