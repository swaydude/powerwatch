package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zabf {
    private static final java.util.concurrent.ExecutorService zahy = com.google.android.gms.internal.base.zan.zact().zaa(2, new com.google.android.gms.common.util.concurrent.NumberedThreadFactory("GAC_Executor"), com.google.android.gms.internal.base.zao.zasg);

    public static java.util.concurrent.ExecutorService zaaz() {
        return zahy;
    }
}
