package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzv extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzv> CREATOR = new com.google.android.gms.measurement.internal.zzy();
    public java.lang.String zza;
    public java.lang.String zzb;
    public com.google.android.gms.measurement.internal.zzkz zzc;
    public long zzd;
    public boolean zze;
    public java.lang.String zzf;
    public com.google.android.gms.measurement.internal.zzan zzg;
    public long zzh;
    public com.google.android.gms.measurement.internal.zzan zzi;
    public long zzj;
    public com.google.android.gms.measurement.internal.zzan zzk;

    zzv(com.google.android.gms.measurement.internal.zzv zzvVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzvVar);
        this.zza = zzvVar.zza;
        this.zzb = zzvVar.zzb;
        this.zzc = zzvVar.zzc;
        this.zzd = zzvVar.zzd;
        this.zze = zzvVar.zze;
        this.zzf = zzvVar.zzf;
        this.zzg = zzvVar.zzg;
        this.zzh = zzvVar.zzh;
        this.zzi = zzvVar.zzi;
        this.zzj = zzvVar.zzj;
        this.zzk = zzvVar.zzk;
    }

    zzv(java.lang.String str, java.lang.String str2, com.google.android.gms.measurement.internal.zzkz zzkzVar, long j, boolean z, java.lang.String str3, com.google.android.gms.measurement.internal.zzan zzanVar, long j2, com.google.android.gms.measurement.internal.zzan zzanVar2, long j3, com.google.android.gms.measurement.internal.zzan zzanVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzkzVar;
        this.zzd = j;
        this.zze = z;
        this.zzf = str3;
        this.zzg = zzanVar;
        this.zzh = j2;
        this.zzi = zzanVar2;
        this.zzj = j3;
        this.zzk = zzanVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
