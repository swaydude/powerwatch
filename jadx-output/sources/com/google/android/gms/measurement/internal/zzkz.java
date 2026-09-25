package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkz extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzkz> CREATOR = new com.google.android.gms.measurement.internal.zzky();
    public final java.lang.String zza;
    public final long zzb;
    public final java.lang.Long zzc;
    public final java.lang.String zzd;
    public final java.lang.String zze;
    public final java.lang.Double zzf;
    private final int zzg;
    private final java.lang.Float zzh;

    zzkz(com.google.android.gms.measurement.internal.zzlb zzlbVar) {
        this(zzlbVar.zzc, zzlbVar.zzd, zzlbVar.zze, zzlbVar.zzb);
    }

    zzkz(java.lang.String str, long j, java.lang.Object obj, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzg = 2;
        this.zza = str;
        this.zzb = j;
        this.zze = str2;
        if (obj == null) {
            this.zzc = null;
            this.zzh = null;
            this.zzf = null;
            this.zzd = null;
            return;
        }
        if (obj instanceof java.lang.Long) {
            this.zzc = (java.lang.Long) obj;
            this.zzh = null;
            this.zzf = null;
            this.zzd = null;
            return;
        }
        if (obj instanceof java.lang.String) {
            this.zzc = null;
            this.zzh = null;
            this.zzf = null;
            this.zzd = (java.lang.String) obj;
            return;
        }
        if (obj instanceof java.lang.Double) {
            this.zzc = null;
            this.zzh = null;
            this.zzf = (java.lang.Double) obj;
            this.zzd = null;
            return;
        }
        throw new java.lang.IllegalArgumentException("User attribute given of un-supported type");
    }

    zzkz(java.lang.String str, long j, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzg = 2;
        this.zza = str;
        this.zzb = 0L;
        this.zzc = null;
        this.zzh = null;
        this.zzf = null;
        this.zzd = null;
        this.zze = null;
    }

    zzkz(int i, java.lang.String str, long j, java.lang.Long l, java.lang.Float f, java.lang.String str2, java.lang.String str3, java.lang.Double d) {
        this.zzg = i;
        this.zza = str;
        this.zzb = j;
        this.zzc = l;
        this.zzh = null;
        if (i == 1) {
            this.zzf = f != null ? java.lang.Double.valueOf(f.doubleValue()) : null;
        } else {
            this.zzf = d;
        }
        this.zzd = str2;
        this.zze = str3;
    }

    public final java.lang.Object zza() {
        java.lang.Long l = this.zzc;
        if (l != null) {
            return l;
        }
        java.lang.Double d = this.zzf;
        if (d != null) {
            return d;
        }
        java.lang.String str = this.zzd;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(parcel, 4, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatObject(parcel, 5, null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleObject(parcel, 8, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
