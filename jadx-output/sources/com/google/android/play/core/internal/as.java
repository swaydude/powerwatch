package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
final class as implements com.google.android.play.core.internal.ad {
    as() {
    }

    @Override // com.google.android.play.core.internal.ad
    public final void a(java.lang.ClassLoader classLoader, java.util.Set<java.io.File> set) {
        com.google.android.play.core.internal.al.a(classLoader, set, new com.google.android.play.core.internal.an());
    }

    @Override // com.google.android.play.core.internal.ad
    public final boolean a(java.lang.ClassLoader classLoader, java.io.File file, java.io.File file2, boolean z) {
        return com.google.android.play.core.internal.al.a(classLoader, file, file2, z, "zip");
    }
}
