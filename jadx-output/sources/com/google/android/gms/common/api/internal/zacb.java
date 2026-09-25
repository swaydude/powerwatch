package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zacb {
    private static final java.util.concurrent.ExecutorService zahy = new java.util.concurrent.ThreadPoolExecutor(0, 4, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.NumberedThreadFactory("GAC_Transform"));

    public static java.util.concurrent.ExecutorService zaaz() {
        return zahy;
    }
}
