package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
final class bn extends com.google.android.play.core.internal.bi {
    bn() {
    }

    @Override // com.google.android.play.core.internal.bi
    public final void a(java.lang.Throwable th, java.lang.Throwable th2) {
        th.addSuppressed(th2);
    }
}
