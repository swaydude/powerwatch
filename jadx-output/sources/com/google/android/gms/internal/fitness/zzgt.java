package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class zzgt {
    private static final com.google.android.gms.internal.fitness.zzfx zzre = com.google.android.gms.internal.fitness.zzfx.zzba();
    private com.google.android.gms.internal.fitness.zzff zzws;
    private volatile com.google.android.gms.internal.fitness.zzho zzwt;
    private volatile com.google.android.gms.internal.fitness.zzff zzwu;

    public int hashCode() {
        return 1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.fitness.zzgt)) {
            return false;
        }
        com.google.android.gms.internal.fitness.zzgt zzgtVar = (com.google.android.gms.internal.fitness.zzgt) obj;
        com.google.android.gms.internal.fitness.zzho zzhoVar = this.zzwt;
        com.google.android.gms.internal.fitness.zzho zzhoVar2 = zzgtVar.zzwt;
        if (zzhoVar == null && zzhoVar2 == null) {
            return zzag().equals(zzgtVar.zzag());
        }
        if (zzhoVar != null && zzhoVar2 != null) {
            return zzhoVar.equals(zzhoVar2);
        }
        if (zzhoVar != null) {
            return zzhoVar.equals(zzgtVar.zzg(zzhoVar.zzbm()));
        }
        return zzg(zzhoVar2.zzbm()).equals(zzhoVar2);
    }

    private final com.google.android.gms.internal.fitness.zzho zzg(com.google.android.gms.internal.fitness.zzho zzhoVar) {
        if (this.zzwt == null) {
            synchronized (this) {
                if (this.zzwt == null) {
                    try {
                        this.zzwt = zzhoVar;
                        this.zzwu = com.google.android.gms.internal.fitness.zzff.zzri;
                    } catch (com.google.android.gms.internal.fitness.zzgo unused) {
                        this.zzwt = zzhoVar;
                        this.zzwu = com.google.android.gms.internal.fitness.zzff.zzri;
                    }
                }
            }
        }
        return this.zzwt;
    }

    public final com.google.android.gms.internal.fitness.zzho zzh(com.google.android.gms.internal.fitness.zzho zzhoVar) {
        com.google.android.gms.internal.fitness.zzho zzhoVar2 = this.zzwt;
        this.zzws = null;
        this.zzwu = null;
        this.zzwt = zzhoVar;
        return zzhoVar2;
    }

    public final int zzbk() {
        if (this.zzwu != null) {
            return this.zzwu.size();
        }
        if (this.zzwt != null) {
            return this.zzwt.zzbk();
        }
        return 0;
    }

    public final com.google.android.gms.internal.fitness.zzff zzag() {
        if (this.zzwu != null) {
            return this.zzwu;
        }
        synchronized (this) {
            if (this.zzwu != null) {
                return this.zzwu;
            }
            if (this.zzwt == null) {
                this.zzwu = com.google.android.gms.internal.fitness.zzff.zzri;
            } else {
                this.zzwu = this.zzwt.zzag();
            }
            return this.zzwu;
        }
    }
}
