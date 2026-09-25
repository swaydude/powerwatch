package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
final class a implements com.google.android.play.core.internal.b {
    private final java.nio.channels.FileChannel a;
    private final long b;
    private final long c;

    public a(java.nio.channels.FileChannel fileChannel, long j, long j2) {
        this.a = fileChannel;
        this.b = j;
        this.c = j2;
    }

    @Override // com.google.android.play.core.internal.b
    public final long a() {
        return this.c;
    }

    @Override // com.google.android.play.core.internal.b
    public final void a(java.security.MessageDigest[] messageDigestArr, long j, int i) throws java.io.IOException {
        java.nio.MappedByteBuffer map = this.a.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, this.b + j, i);
        map.load();
        for (java.security.MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
