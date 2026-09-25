package com.google.android.gms.internal.firebase_messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzl extends java.io.FilterInputStream {
    private long zza;
    private long zzb;

    zzl(java.io.InputStream inputStream, long j) {
        super(inputStream);
        this.zzb = -1L;
        com.google.android.gms.internal.firebase_messaging.zzg.zza(inputStream);
        this.zza = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws java.io.IOException {
        return (int) java.lang.Math.min(this.in.available(), this.zza);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.zzb = this.zza;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        if (this.zza == 0) {
            return -1;
        }
        int i = this.in.read();
        if (i != -1) {
            this.zza--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        long j = this.zza;
        if (j == 0) {
            return -1;
        }
        int i3 = this.in.read(bArr, i, (int) java.lang.Math.min(i2, j));
        if (i3 != -1) {
            this.zza -= (long) i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws java.io.IOException {
        if (!this.in.markSupported()) {
            throw new java.io.IOException("Mark not supported");
        }
        if (this.zzb == -1) {
            throw new java.io.IOException("Mark not set");
        }
        this.in.reset();
        this.zza = this.zzb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        long jSkip = this.in.skip(java.lang.Math.min(j, this.zza));
        this.zza -= jSkip;
        return jSkip;
    }
}
