package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzb extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.zzb> CREATOR = new com.google.android.gms.common.internal.zzc();
    android.os.Bundle zzda;
    com.google.android.gms.common.Feature[] zzdb;

    zzb(android.os.Bundle bundle, com.google.android.gms.common.Feature[] featureArr) {
        this.zzda = bundle;
        this.zzdb = featureArr;
    }

    public zzb() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 1, this.zzda, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 2, this.zzdb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
