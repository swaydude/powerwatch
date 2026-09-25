package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzbd extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    private java.lang.String moduleId;
    private java.lang.String tag;
    private com.google.android.gms.location.LocationRequest zzdg;
    private boolean zzdh;
    private boolean zzdi;
    private boolean zzdj;
    private boolean zzdk = true;
    private java.util.List<com.google.android.gms.common.internal.ClientIdentity> zzm;
    static final java.util.List<com.google.android.gms.common.internal.ClientIdentity> zzcd = java.util.Collections.emptyList();
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzbd> CREATOR = new com.google.android.gms.internal.location.zzbe();

    zzbd(com.google.android.gms.location.LocationRequest locationRequest, java.util.List<com.google.android.gms.common.internal.ClientIdentity> list, java.lang.String str, boolean z, boolean z2, boolean z3, java.lang.String str2) {
        this.zzdg = locationRequest;
        this.zzm = list;
        this.tag = str;
        this.zzdh = z;
        this.zzdi = z2;
        this.zzdj = z3;
        this.moduleId = str2;
    }

    @java.lang.Deprecated
    public static com.google.android.gms.internal.location.zzbd zza(com.google.android.gms.location.LocationRequest locationRequest) {
        return new com.google.android.gms.internal.location.zzbd(locationRequest, zzcd, null, false, false, false, null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.location.zzbd)) {
            return false;
        }
        com.google.android.gms.internal.location.zzbd zzbdVar = (com.google.android.gms.internal.location.zzbd) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzdg, zzbdVar.zzdg) && com.google.android.gms.common.internal.Objects.equal(this.zzm, zzbdVar.zzm) && com.google.android.gms.common.internal.Objects.equal(this.tag, zzbdVar.tag) && this.zzdh == zzbdVar.zzdh && this.zzdi == zzbdVar.zzdi && this.zzdj == zzbdVar.zzdj && com.google.android.gms.common.internal.Objects.equal(this.moduleId, zzbdVar.moduleId);
    }

    public final int hashCode() {
        return this.zzdg.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.zzdg);
        if (this.tag != null) {
            sb.append(" tag=");
            sb.append(this.tag);
        }
        if (this.moduleId != null) {
            sb.append(" moduleId=");
            sb.append(this.moduleId);
        }
        sb.append(" hideAppOps=");
        sb.append(this.zzdh);
        sb.append(" clients=");
        sb.append(this.zzm);
        sb.append(" forceCoarseLocation=");
        sb.append(this.zzdi);
        if (this.zzdj) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzdg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 5, this.zzm, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.tag, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, this.zzdh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzdi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, this.zzdj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, this.moduleId, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
