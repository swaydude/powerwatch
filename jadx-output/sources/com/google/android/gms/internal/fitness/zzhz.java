package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhz implements com.google.android.gms.internal.fitness.zzhm {
    private final int flags;
    private final java.lang.String info;
    private final com.google.android.gms.internal.fitness.zzho zzxm;
    private final java.lang.Object[] zzxt = null;

    zzhz(com.google.android.gms.internal.fitness.zzho zzhoVar, java.lang.String str, java.lang.Object[] objArr) {
        this.zzxm = zzhoVar;
        this.info = str;
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

    final java.lang.String zzcn() {
        return this.info;
    }

    final java.lang.Object[] zzco() {
        return this.zzxt;
    }

    @Override // com.google.android.gms.internal.fitness.zzhm
    public final com.google.android.gms.internal.fitness.zzho zzcj() {
        return this.zzxm;
    }

    @Override // com.google.android.gms.internal.fitness.zzhm
    public final int zzch() {
        return (this.flags & 1) == 1 ? com.google.android.gms.internal.fitness.zzgg.zze.zzvt : com.google.android.gms.internal.fitness.zzgg.zze.zzvu;
    }

    @Override // com.google.android.gms.internal.fitness.zzhm
    public final boolean zzci() {
        return (this.flags & 2) == 2;
    }
}
