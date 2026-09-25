package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzft extends com.google.android.gms.internal.fitness.zzfr {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzrv;
    private int zzrw;
    private int zzrx;
    private int zzry;

    private zzft(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzry = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzrx = i;
        this.zzrv = z;
    }

    @Override // com.google.android.gms.internal.fitness.zzfr
    public final int zzk(int i) throws com.google.android.gms.internal.fitness.zzgo {
        if (i < 0) {
            throw new com.google.android.gms.internal.fitness.zzgo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iZzav = i + zzav();
        int i2 = this.zzry;
        if (iZzav > i2) {
            throw new com.google.android.gms.internal.fitness.zzgo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzry = iZzav;
        int i3 = this.limit + this.zzrw;
        this.limit = i3;
        int i4 = i3 - this.zzrx;
        if (i4 > iZzav) {
            int i5 = i4 - iZzav;
            this.zzrw = i5;
            this.limit = i3 - i5;
        } else {
            this.zzrw = 0;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.fitness.zzfr
    public final int zzav() {
        return this.pos - this.zzrx;
    }
}
