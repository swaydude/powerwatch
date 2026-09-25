package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public class zzcv {
    private static final com.google.android.gms.internal.clearcut.zzbt zzez = com.google.android.gms.internal.clearcut.zzbt.zzan();
    private com.google.android.gms.internal.clearcut.zzbb zzln;
    private volatile com.google.android.gms.internal.clearcut.zzdo zzlo;
    private volatile com.google.android.gms.internal.clearcut.zzbb zzlp;

    private final com.google.android.gms.internal.clearcut.zzdo zzh(com.google.android.gms.internal.clearcut.zzdo zzdoVar) {
        if (this.zzlo == null) {
            synchronized (this) {
                if (this.zzlo == null) {
                    try {
                        this.zzlo = zzdoVar;
                        this.zzlp = com.google.android.gms.internal.clearcut.zzbb.zzfi;
                    } catch (com.google.android.gms.internal.clearcut.zzco unused) {
                        this.zzlo = zzdoVar;
                        this.zzlp = com.google.android.gms.internal.clearcut.zzbb.zzfi;
                    }
                }
            }
        }
        return this.zzlo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.clearcut.zzcv)) {
            return false;
        }
        com.google.android.gms.internal.clearcut.zzcv zzcvVar = (com.google.android.gms.internal.clearcut.zzcv) obj;
        com.google.android.gms.internal.clearcut.zzdo zzdoVar = this.zzlo;
        com.google.android.gms.internal.clearcut.zzdo zzdoVar2 = zzcvVar.zzlo;
        if (zzdoVar == null && zzdoVar2 == null) {
            return zzr().equals(zzcvVar.zzr());
        }
        if (zzdoVar == null || zzdoVar2 == null) {
            return zzdoVar != null ? zzdoVar.equals(zzcvVar.zzh(zzdoVar.zzbe())) : zzh(zzdoVar2.zzbe()).equals(zzdoVar2);
        }
        return zzdoVar.equals(zzdoVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zzas() {
        if (this.zzlp != null) {
            return this.zzlp.size();
        }
        if (this.zzlo != null) {
            return this.zzlo.zzas();
        }
        return 0;
    }

    public final com.google.android.gms.internal.clearcut.zzdo zzi(com.google.android.gms.internal.clearcut.zzdo zzdoVar) {
        com.google.android.gms.internal.clearcut.zzdo zzdoVar2 = this.zzlo;
        this.zzln = null;
        this.zzlp = null;
        this.zzlo = zzdoVar;
        return zzdoVar2;
    }

    public final com.google.android.gms.internal.clearcut.zzbb zzr() {
        if (this.zzlp != null) {
            return this.zzlp;
        }
        synchronized (this) {
            if (this.zzlp != null) {
                return this.zzlp;
            }
            this.zzlp = this.zzlo == null ? com.google.android.gms.internal.clearcut.zzbb.zzfi : this.zzlo.zzr();
            return this.zzlp;
        }
    }
}
