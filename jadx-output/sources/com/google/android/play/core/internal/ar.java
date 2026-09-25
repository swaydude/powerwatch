package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
final class ar implements com.google.android.play.core.internal.ad {
    ar() {
    }

    static void b(java.lang.ClassLoader classLoader, java.util.Set<java.io.File> set) {
        com.google.android.play.core.internal.al.a(classLoader, set, new com.google.android.play.core.internal.au());
    }

    static boolean b(java.lang.ClassLoader classLoader, java.io.File file, java.io.File file2, boolean z) {
        return com.google.android.play.core.internal.af.a(classLoader, file, file2, z, new com.google.android.play.core.internal.ao(), "path", new com.google.android.play.core.internal.at());
    }

    @Override // com.google.android.play.core.internal.ad
    public final void a(java.lang.ClassLoader classLoader, java.util.Set<java.io.File> set) {
        b(classLoader, set);
    }

    @Override // com.google.android.play.core.internal.ad
    public final boolean a(java.lang.ClassLoader classLoader, java.io.File file, java.io.File file2, boolean z) {
        return b(classLoader, file, file2, z);
    }
}
