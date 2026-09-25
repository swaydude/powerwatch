package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.clearcut.zzr> CREATOR = new com.google.android.gms.internal.clearcut.zzs();
    private final java.lang.String packageName;
    private final boolean zzay;
    private final int zzaz;
    private final int zzi;
    public final java.lang.String zzj;
    public final int zzk;
    private final java.lang.String zzl;
    private final java.lang.String zzm;
    private final boolean zzn;

    public zzr(java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, com.google.android.gms.internal.clearcut.zzge.zzv.zzb zzbVar) {
        this.packageName = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzi = i;
        this.zzk = i2;
        this.zzj = str2;
        this.zzl = str3;
        this.zzm = str4;
        this.zzay = !z;
        this.zzn = z;
        this.zzaz = zzbVar.zzc();
    }

    public zzr(java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, boolean z2, int i3) {
        this.packageName = str;
        this.zzi = i;
        this.zzk = i2;
        this.zzl = str2;
        this.zzm = str3;
        this.zzay = z;
        this.zzj = str4;
        this.zzn = z2;
        this.zzaz = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.clearcut.zzr) {
            com.google.android.gms.internal.clearcut.zzr zzrVar = (com.google.android.gms.internal.clearcut.zzr) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.packageName, zzrVar.packageName) && this.zzi == zzrVar.zzi && this.zzk == zzrVar.zzk && com.google.android.gms.common.internal.Objects.equal(this.zzj, zzrVar.zzj) && com.google.android.gms.common.internal.Objects.equal(this.zzl, zzrVar.zzl) && com.google.android.gms.common.internal.Objects.equal(this.zzm, zzrVar.zzm) && this.zzay == zzrVar.zzay && this.zzn == zzrVar.zzn && this.zzaz == zzrVar.zzaz) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.packageName, java.lang.Integer.valueOf(this.zzi), java.lang.Integer.valueOf(this.zzk), this.zzj, this.zzl, this.zzm, java.lang.Boolean.valueOf(this.zzay), java.lang.Boolean.valueOf(this.zzn), java.lang.Integer.valueOf(this.zzaz));
    }

    public final java.lang.String toString() {
        return "PlayLoggerContext[package=" + this.packageName + ",packageVersionCode=" + this.zzi + ",logSource=" + this.zzk + ",logSourceName=" + this.zzj + ",uploadAccount=" + this.zzl + ",loggingId=" + this.zzm + ",logAndroidId=" + this.zzay + ",isAnonymous=" + this.zzn + ",qosTier=" + this.zzaz + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzl, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zzm, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, this.zzay);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzj, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, this.zzn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 10, this.zzaz);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
