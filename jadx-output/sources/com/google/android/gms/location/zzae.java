package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzae extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.zzae> CREATOR = new com.google.android.gms.location.zzaf();
    private final java.lang.String zzbd;
    private final java.lang.String zzbe;
    private final java.lang.String zzbf;

    zzae(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zzbf = str;
        this.zzbd = str2;
        this.zzbe = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.zzbd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzbe, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzbf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
