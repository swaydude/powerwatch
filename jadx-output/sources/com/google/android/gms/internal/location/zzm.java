package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzm extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    private java.lang.String tag;
    private com.google.android.gms.location.zzj zzcf;
    private java.util.List<com.google.android.gms.common.internal.ClientIdentity> zzm;
    static final java.util.List<com.google.android.gms.common.internal.ClientIdentity> zzcd = java.util.Collections.emptyList();
    static final com.google.android.gms.location.zzj zzce = new com.google.android.gms.location.zzj();
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzm> CREATOR = new com.google.android.gms.internal.location.zzn();

    zzm(com.google.android.gms.location.zzj zzjVar, java.util.List<com.google.android.gms.common.internal.ClientIdentity> list, java.lang.String str) {
        this.zzcf = zzjVar;
        this.zzm = list;
        this.tag = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.location.zzm)) {
            return false;
        }
        com.google.android.gms.internal.location.zzm zzmVar = (com.google.android.gms.internal.location.zzm) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzcf, zzmVar.zzcf) && com.google.android.gms.common.internal.Objects.equal(this.zzm, zzmVar.zzm) && com.google.android.gms.common.internal.Objects.equal(this.tag, zzmVar.tag);
    }

    public final int hashCode() {
        return this.zzcf.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzcf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zzm, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.tag, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
