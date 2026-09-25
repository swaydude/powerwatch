package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzan extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzan> CREATOR = new com.google.android.gms.measurement.internal.zzaq();
    public final java.lang.String zza;
    public final com.google.android.gms.measurement.internal.zzam zzb;
    public final java.lang.String zzc;
    public final long zzd;

    public zzan(java.lang.String str, com.google.android.gms.measurement.internal.zzam zzamVar, java.lang.String str2, long j) {
        this.zza = str;
        this.zzb = zzamVar;
        this.zzc = str2;
        this.zzd = j;
    }

    zzan(com.google.android.gms.measurement.internal.zzan zzanVar, long j) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzanVar);
        this.zza = zzanVar.zza;
        this.zzb = zzanVar.zzb;
        this.zzc = zzanVar.zzc;
        this.zzd = j;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zzc;
        java.lang.String str2 = this.zza;
        java.lang.String strValueOf = java.lang.String.valueOf(this.zzb);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 21 + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(strValueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(strValueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
