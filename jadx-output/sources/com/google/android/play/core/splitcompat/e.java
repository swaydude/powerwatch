package com.google.android.play.core.splitcompat;

/* JADX INFO: loaded from: classes2.dex */
final class e implements com.google.android.play.core.splitcompat.i {
    final /* synthetic */ java.util.Set a;
    final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean b;
    private final /* synthetic */ com.google.android.play.core.splitcompat.q c;
    private final /* synthetic */ com.google.android.play.core.splitcompat.f d;

    e(com.google.android.play.core.splitcompat.f fVar, com.google.android.play.core.splitcompat.q qVar, java.util.Set set, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        this.d = fVar;
        this.c = qVar;
        this.a = set;
        this.b = atomicBoolean;
    }

    @Override // com.google.android.play.core.splitcompat.i
    public final void a(java.util.zip.ZipFile zipFile, java.util.Set<com.google.android.play.core.splitcompat.k> set) throws java.io.IOException {
        this.d.a(this.c, (java.util.Set<com.google.android.play.core.splitcompat.k>) set, new com.google.android.play.core.splitcompat.h(this));
    }
}
