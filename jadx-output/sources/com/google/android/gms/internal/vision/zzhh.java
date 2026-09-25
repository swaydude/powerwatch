package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class zzhh {
    private static final com.google.android.gms.internal.vision.zzgd zzrl = com.google.android.gms.internal.vision.zzgd.zzfl();
    private com.google.android.gms.internal.vision.zzfh zzxx;
    private volatile com.google.android.gms.internal.vision.zzic zzxy;
    private volatile com.google.android.gms.internal.vision.zzfh zzxz;

    public int hashCode() {
        return 1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.vision.zzhh)) {
            return false;
        }
        com.google.android.gms.internal.vision.zzhh zzhhVar = (com.google.android.gms.internal.vision.zzhh) obj;
        com.google.android.gms.internal.vision.zzic zzicVar = this.zzxy;
        com.google.android.gms.internal.vision.zzic zzicVar2 = zzhhVar.zzxy;
        if (zzicVar == null && zzicVar2 == null) {
            return zzdk().equals(zzhhVar.zzdk());
        }
        if (zzicVar != null && zzicVar2 != null) {
            return zzicVar.equals(zzicVar2);
        }
        if (zzicVar != null) {
            return zzicVar.equals(zzhhVar.zzh(zzicVar.zzgd()));
        }
        return zzh(zzicVar2.zzgd()).equals(zzicVar2);
    }

    private final com.google.android.gms.internal.vision.zzic zzh(com.google.android.gms.internal.vision.zzic zzicVar) {
        if (this.zzxy == null) {
            synchronized (this) {
                if (this.zzxy == null) {
                    try {
                        this.zzxy = zzicVar;
                        this.zzxz = com.google.android.gms.internal.vision.zzfh.zzrx;
                    } catch (com.google.android.gms.internal.vision.zzhc unused) {
                        this.zzxy = zzicVar;
                        this.zzxz = com.google.android.gms.internal.vision.zzfh.zzrx;
                    }
                }
            }
        }
        return this.zzxy;
    }

    public final com.google.android.gms.internal.vision.zzic zzi(com.google.android.gms.internal.vision.zzic zzicVar) {
        com.google.android.gms.internal.vision.zzic zzicVar2 = this.zzxy;
        this.zzxx = null;
        this.zzxz = null;
        this.zzxy = zzicVar;
        return zzicVar2;
    }

    public final int zzgf() {
        if (this.zzxz != null) {
            return this.zzxz.size();
        }
        if (this.zzxy != null) {
            return this.zzxy.zzgf();
        }
        return 0;
    }

    public final com.google.android.gms.internal.vision.zzfh zzdk() {
        if (this.zzxz != null) {
            return this.zzxz;
        }
        synchronized (this) {
            if (this.zzxz != null) {
                return this.zzxz;
            }
            if (this.zzxy == null) {
                this.zzxz = com.google.android.gms.internal.vision.zzfh.zzrx;
            } else {
                this.zzxz = this.zzxy.zzdk();
            }
            return this.zzxz;
        }
    }
}
