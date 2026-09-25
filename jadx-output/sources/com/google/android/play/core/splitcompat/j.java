package com.google.android.play.core.splitcompat;

/* JADX INFO: loaded from: classes2.dex */
final class j implements com.google.android.play.core.splitcompat.l {
    private final /* synthetic */ java.util.Set a;
    private final /* synthetic */ com.google.android.play.core.splitcompat.q b;
    private final /* synthetic */ java.util.zip.ZipFile c;

    j(java.util.Set set, com.google.android.play.core.splitcompat.q qVar, java.util.zip.ZipFile zipFile) {
        this.a = set;
        this.b = qVar;
        this.c = zipFile;
    }

    @Override // com.google.android.play.core.splitcompat.l
    public final void a(com.google.android.play.core.splitcompat.k kVar, java.io.File file, boolean z) throws java.io.IOException {
        this.a.add(file);
        if (z) {
            return;
        }
        android.util.Log.i("SplitCompat", java.lang.String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", this.b.b(), kVar.a, this.b.a().getAbsolutePath(), kVar.b.getName(), file.getAbsolutePath()));
        com.google.android.play.core.splitcompat.f.b(this.c, kVar.b, file);
    }
}
