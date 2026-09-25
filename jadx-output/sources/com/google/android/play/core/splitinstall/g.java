package com.google.android.play.core.splitinstall;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements com.google.android.play.core.splitinstall.c {
    public static final com.google.android.play.core.splitinstall.g a = new com.google.android.play.core.splitinstall.g("INSTANCE", 0);
    private static final java.util.concurrent.atomic.AtomicReference<com.google.android.play.core.splitinstall.a> b = new java.util.concurrent.atomic.AtomicReference<>(null);

    private g(java.lang.String str, int i) {
        super(str, 0);
    }

    public static void a(com.google.android.play.core.splitinstall.a aVar) {
        b.compareAndSet(null, aVar);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final com.google.android.play.core.splitinstall.a a() {
        return b.get();
    }
}
