package com.google.android.gms.phenotype;

/* JADX INFO: loaded from: classes.dex */
public class Configuration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.lang.Comparable<com.google.android.gms.phenotype.Configuration> {
    public static final android.os.Parcelable.Creator<com.google.android.gms.phenotype.Configuration> CREATOR = new com.google.android.gms.phenotype.zzc();
    private final int zzc;
    private final com.google.android.gms.phenotype.zzi[] zzd;
    private final java.lang.String[] zze;
    private final java.util.Map<java.lang.String, com.google.android.gms.phenotype.zzi> zzf = new java.util.TreeMap();

    public Configuration(int i, com.google.android.gms.phenotype.zzi[] zziVarArr, java.lang.String[] strArr) {
        this.zzc = i;
        this.zzd = zziVarArr;
        for (com.google.android.gms.phenotype.zzi zziVar : zziVarArr) {
            this.zzf.put(zziVar.name, zziVar);
        }
        this.zze = strArr;
        if (strArr != null) {
            java.util.Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(com.google.android.gms.phenotype.Configuration configuration) {
        return this.zzc - configuration.zzc;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.phenotype.Configuration) {
            com.google.android.gms.phenotype.Configuration configuration = (com.google.android.gms.phenotype.Configuration) obj;
            if (this.zzc == configuration.zzc && com.google.android.gms.phenotype.zzn.equals(this.zzf, configuration.zzf) && java.util.Arrays.equals(this.zze, configuration.zze)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Configuration(");
        sb.append(this.zzc);
        sb.append(", ");
        sb.append("(");
        java.util.Iterator<com.google.android.gms.phenotype.zzi> it = this.zzf.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(", ");
        }
        sb.append(")");
        sb.append(", ");
        sb.append("(");
        java.lang.String[] strArr = this.zze;
        if (strArr != null) {
            for (java.lang.String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append(")");
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 3, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 4, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
