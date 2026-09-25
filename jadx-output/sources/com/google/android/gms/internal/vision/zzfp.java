package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfp {
    private final byte[] buffer;
    private final com.google.android.gms.internal.vision.zzga zzsd;

    private zzfp(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.zzsd = com.google.android.gms.internal.vision.zzga.zze(bArr);
    }

    public final com.google.android.gms.internal.vision.zzfh zzev() {
        this.zzsd.zzfh();
        return new com.google.android.gms.internal.vision.zzfr(this.buffer);
    }

    public final com.google.android.gms.internal.vision.zzga zzew() {
        return this.zzsd;
    }

    /* synthetic */ zzfp(int i, com.google.android.gms.internal.vision.zzfk zzfkVar) {
        this(i);
    }
}
