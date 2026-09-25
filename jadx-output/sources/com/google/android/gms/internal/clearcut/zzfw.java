package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzfw implements java.lang.Cloneable {
    private static final com.google.android.gms.internal.clearcut.zzfx zzrl = new com.google.android.gms.internal.clearcut.zzfx();
    private int mSize;
    private boolean zzrm;
    private int[] zzrn;
    private com.google.android.gms.internal.clearcut.zzfx[] zzro;

    zzfw() {
        this(10);
    }

    private zzfw(int i) {
        this.zzrm = false;
        int i2 = i << 2;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 4;
        this.zzrn = new int[i5];
        this.zzro = new com.google.android.gms.internal.clearcut.zzfx[i5];
        this.mSize = 0;
    }

    public final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        int i = this.mSize;
        com.google.android.gms.internal.clearcut.zzfw zzfwVar = new com.google.android.gms.internal.clearcut.zzfw(i);
        java.lang.System.arraycopy(this.zzrn, 0, zzfwVar.zzrn, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            com.google.android.gms.internal.clearcut.zzfx[] zzfxVarArr = this.zzro;
            if (zzfxVarArr[i2] != null) {
                zzfwVar.zzro[i2] = (com.google.android.gms.internal.clearcut.zzfx) zzfxVarArr[i2].clone();
            }
        }
        zzfwVar.mSize = i;
        return zzfwVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0043 A[RETURN] */
    public final boolean equals(java.lang.Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.clearcut.zzfw)) {
            return false;
        }
        com.google.android.gms.internal.clearcut.zzfw zzfwVar = (com.google.android.gms.internal.clearcut.zzfw) obj;
        int i = this.mSize;
        if (i != zzfwVar.mSize) {
            return false;
        }
        int[] iArr = this.zzrn;
        int[] iArr2 = zzfwVar.zzrn;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            }
            if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            }
            i2++;
        }
        if (z) {
            com.google.android.gms.internal.clearcut.zzfx[] zzfxVarArr = this.zzro;
            com.google.android.gms.internal.clearcut.zzfx[] zzfxVarArr2 = zzfwVar.zzro;
            int i3 = this.mSize;
            for (int i4 = 0; i4 < i3; i4++) {
                if (!zzfxVarArr[i4].equals(zzfxVarArr2[i4])) {
                    z2 = false;
                    if (z2) {
                        return true;
                    }
                }
            }
            z2 = true;
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 17;
        for (int i = 0; i < this.mSize; i++) {
            iHashCode = (((iHashCode * 31) + this.zzrn[i]) * 31) + this.zzro[i].hashCode();
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.mSize == 0;
    }

    final int size() {
        return this.mSize;
    }

    final com.google.android.gms.internal.clearcut.zzfx zzaq(int i) {
        return this.zzro[i];
    }
}
