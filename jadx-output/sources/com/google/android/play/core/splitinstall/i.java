package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
public final class i {
    private static final java.util.concurrent.atomic.AtomicReference<com.google.android.play.core.splitinstall.k> a = new java.util.concurrent.atomic.AtomicReference<>(null);

    static com.google.android.play.core.splitinstall.k a() {
        return a.get();
    }

    public static void a(com.google.android.play.core.splitinstall.k kVar) {
        a.compareAndSet(null, kVar);
    }
}
