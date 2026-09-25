package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
final class bl {
    private final java.util.concurrent.ConcurrentHashMap<com.google.android.play.core.internal.bk, java.util.List<java.lang.Throwable>> a = new java.util.concurrent.ConcurrentHashMap<>(16, 0.75f, 10);
    private final java.lang.ref.ReferenceQueue<java.lang.Throwable> b = new java.lang.ref.ReferenceQueue<>();

    bl() {
    }

    public final java.util.List<java.lang.Throwable> a(java.lang.Throwable th, boolean z) {
        while (true) {
            java.lang.ref.Reference<? extends java.lang.Throwable> referencePoll = this.b.poll();
            if (referencePoll == null) {
                break;
            }
            this.a.remove(referencePoll);
        }
        java.util.List<java.lang.Throwable> list = this.a.get(new com.google.android.play.core.internal.bk(th, null));
        if (list != null) {
            return list;
        }
        java.util.Vector vector = new java.util.Vector(2);
        java.util.List<java.lang.Throwable> listPutIfAbsent = this.a.putIfAbsent(new com.google.android.play.core.internal.bk(th, this.b), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }
}
