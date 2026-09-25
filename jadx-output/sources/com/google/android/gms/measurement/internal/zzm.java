package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzm extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzm> CREATOR = new com.google.android.gms.measurement.internal.zzo();
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final java.lang.String zzd;
    public final long zze;
    public final long zzf;
    public final java.lang.String zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final long zzj;
    public final java.lang.String zzk;
    public final long zzl;
    public final long zzm;
    public final int zzn;
    public final boolean zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final java.lang.String zzr;
    public final java.lang.Boolean zzs;
    public final long zzt;
    public final java.util.List<java.lang.String> zzu;
    public final java.lang.String zzv;

    zzm(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.lang.String str4, long j2, long j3, java.lang.String str5, boolean z, boolean z2, java.lang.String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, java.lang.String str7, java.lang.Boolean bool, long j6, java.util.List<java.lang.String> list, java.lang.String str8) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = android.text.TextUtils.isEmpty(str2) ? null : str2;
        this.zzc = str3;
        this.zzj = j;
        this.zzd = str4;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j4;
        this.zzm = j5;
        this.zzn = i;
        this.zzo = z3;
        this.zzp = z4;
        this.zzq = z5;
        this.zzr = str7;
        this.zzs = bool;
        this.zzt = j6;
        this.zzu = list;
        this.zzv = str8;
    }

    zzm(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, long j2, java.lang.String str5, boolean z, boolean z2, long j3, java.lang.String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, java.lang.String str7, java.lang.Boolean bool, long j6, java.util.List<java.lang.String> list, java.lang.String str8) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzj = j3;
        this.zzd = str4;
        this.zze = j;
        this.zzf = j2;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j4;
        this.zzm = j5;
        this.zzn = i;
        this.zzo = z3;
        this.zzp = z4;
        this.zzq = z5;
        this.zzr = str7;
        this.zzs = bool;
        this.zzt = j6;
        this.zzu = list;
        this.zzv = str8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 6, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 7, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 12, this.zzk, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 13, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 14, this.zzm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 15, this.zzn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 16, this.zzo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 17, this.zzp);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 18, this.zzq);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 19, this.zzr, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanObject(parcel, 21, this.zzs, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 22, this.zzt);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 23, this.zzu, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 24, this.zzv, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
