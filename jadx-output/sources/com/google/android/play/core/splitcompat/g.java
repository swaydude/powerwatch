package com.google.android.play.core.splitcompat;

/* JADX INFO: loaded from: classes2.dex */
final class g implements com.google.android.play.core.splitcompat.i {
    private final /* synthetic */ java.util.Set a;
    private final /* synthetic */ com.google.android.play.core.splitcompat.q b;
    private final /* synthetic */ com.google.android.play.core.splitcompat.f c;

    g(com.google.android.play.core.splitcompat.f fVar, java.util.Set set, com.google.android.play.core.splitcompat.q qVar) {
        this.c = fVar;
        this.a = set;
        this.b = qVar;
    }

    @Override // com.google.android.play.core.splitcompat.i
    public final void a(java.util.zip.ZipFile zipFile, java.util.Set<com.google.android.play.core.splitcompat.k> set) throws java.io.IOException {
        this.a.addAll(this.c.a((java.util.Set<com.google.android.play.core.splitcompat.k>) set, this.b, zipFile));
    }
}
