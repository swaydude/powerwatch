package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public class zzfz {
    protected volatile int zzrs = -1;

    public static final void zza(com.google.android.gms.internal.clearcut.zzfz zzfzVar, byte[] bArr, int i, int i2) {
        try {
            com.google.android.gms.internal.clearcut.zzfs zzfsVarZzh = com.google.android.gms.internal.clearcut.zzfs.zzh(bArr, 0, i2);
            zzfzVar.zza(zzfsVarZzh);
            zzfsVarZzh.zzem();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public java.lang.String toString() {
        return com.google.android.gms.internal.clearcut.zzga.zza(this);
    }

    public void zza(com.google.android.gms.internal.clearcut.zzfs zzfsVar) throws java.io.IOException {
    }

    public final int zzas() {
        int iZzen = zzen();
        this.zzrs = iZzen;
        return iZzen;
    }

    protected int zzen() {
        return 0;
    }

    @Override // 
    /* JADX INFO: renamed from: zzep, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.clearcut.zzfz clone() throws java.lang.CloneNotSupportedException {
        return (com.google.android.gms.internal.clearcut.zzfz) super.clone();
    }
}
