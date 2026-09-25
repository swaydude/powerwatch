package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzad extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status zzbl;
    private static final com.google.android.gms.internal.location.zzad zzcr = new com.google.android.gms.internal.location.zzad(com.google.android.gms.common.api.Status.RESULT_SUCCESS);
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzad> CREATOR = new com.google.android.gms.internal.location.zzae();

    public zzad(com.google.android.gms.common.api.Status status) {
        this.zzbl = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzbl;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
