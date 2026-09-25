package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzip implements com.google.android.gms.internal.vision.zzia {
    private final int flags;
    private final java.lang.String info;
    private final java.lang.Object[] zzyv;
    private final com.google.android.gms.internal.vision.zzic zzyy;

    zzip(com.google.android.gms.internal.vision.zzic zzicVar, java.lang.String str, java.lang.Object[] objArr) {
        this.zzyy = zzicVar;
        this.info = str;
        this.zzyv = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.flags = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.flags = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    final java.lang.String zzhp() {
        return this.info;
    }

    final java.lang.Object[] zzhq() {
        return this.zzyv;
    }

    @Override // com.google.android.gms.internal.vision.zzia
    public final com.google.android.gms.internal.vision.zzic zzhk() {
        return this.zzyy;
    }

    @Override // com.google.android.gms.internal.vision.zzia
    public final int zzhi() {
        return (this.flags & 1) == 1 ? com.google.android.gms.internal.vision.zzgs.zzf.zzwt : com.google.android.gms.internal.vision.zzgs.zzf.zzwu;
    }

    @Override // com.google.android.gms.internal.vision.zzia
    public final boolean zzhj() {
        return (this.flags & 2) == 2;
    }
}
