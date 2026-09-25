package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
final class bm extends com.google.android.play.core.internal.bi {
    private final com.google.android.play.core.internal.bl a = new com.google.android.play.core.internal.bl();

    bm() {
    }

    @Override // com.google.android.play.core.internal.bi
    public final void a(java.lang.Throwable th, java.lang.Throwable th2) {
        if (th2 == th) {
            throw new java.lang.IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        java.util.Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
        this.a.a(th, true).add(th2);
    }
}
