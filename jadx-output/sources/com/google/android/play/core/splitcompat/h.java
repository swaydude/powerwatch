package com.google.android.play.core.splitcompat;

/* JADX INFO: loaded from: classes2.dex */
final class h implements com.google.android.play.core.splitcompat.l {
    private final /* synthetic */ com.google.android.play.core.splitcompat.e a;

    h(com.google.android.play.core.splitcompat.e eVar) {
        this.a = eVar;
    }

    @Override // com.google.android.play.core.splitcompat.l
    public final void a(com.google.android.play.core.splitcompat.k kVar, java.io.File file, boolean z) throws java.io.IOException {
        this.a.a.add(file);
        if (z) {
            return;
        }
        this.a.b.set(false);
    }
}
