package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public class zzfu<M extends com.google.android.gms.internal.clearcut.zzfu<M>> extends com.google.android.gms.internal.clearcut.zzfz {
    protected com.google.android.gms.internal.clearcut.zzfw zzrj;

    @Override // com.google.android.gms.internal.clearcut.zzfz
    public void zza(com.google.android.gms.internal.clearcut.zzfs zzfsVar) throws java.io.IOException {
        if (this.zzrj == null) {
            return;
        }
        for (int i = 0; i < this.zzrj.size(); i++) {
            this.zzrj.zzaq(i).zza(zzfsVar);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfz
    protected int zzen() {
        if (this.zzrj != null) {
            for (int i = 0; i < this.zzrj.size(); i++) {
                this.zzrj.zzaq(i).zzen();
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfz
    /* JADX INFO: renamed from: zzeo, reason: merged with bridge method [inline-methods] */
    public M clone() throws java.lang.CloneNotSupportedException {
        M m = (M) super.clone();
        com.google.android.gms.internal.clearcut.zzfy.zza(this, m);
        return m;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfz
    /* JADX INFO: renamed from: zzep */
    public /* synthetic */ com.google.android.gms.internal.clearcut.zzfz clone() throws java.lang.CloneNotSupportedException {
        return (com.google.android.gms.internal.clearcut.zzfu) clone();
    }
}
