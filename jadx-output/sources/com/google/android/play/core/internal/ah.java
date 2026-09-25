package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
final class ah implements com.google.android.play.core.internal.ak {
    ah() {
    }

    @Override // com.google.android.play.core.internal.ak
    public final boolean a(java.lang.Object obj, java.io.File file, java.io.File file2) {
        return new java.io.File((java.lang.String) com.google.android.play.core.internal.ba.a(obj.getClass(), "optimizedPathFor", java.lang.String.class, java.io.File.class, file, java.io.File.class, file2)).exists();
    }
}
