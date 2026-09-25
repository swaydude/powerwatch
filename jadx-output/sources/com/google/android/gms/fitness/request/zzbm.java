package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbm extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzbm> CREATOR = new com.google.android.gms.fitness.request.zzbl();
    private final java.lang.String deviceAddress;
    private final com.google.android.gms.internal.fitness.zzcm zzok;

    zzbm(java.lang.String str, android.os.IBinder iBinder) {
        this.deviceAddress = str;
        this.zzok = com.google.android.gms.internal.fitness.zzcp.zzj(iBinder);
    }

    public zzbm(java.lang.String str, com.google.android.gms.internal.fitness.zzcm zzcmVar) {
        this.deviceAddress = str;
        this.zzok = zzcmVar;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("UnclaimBleDeviceRequest{%s}", this.deviceAddress);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.deviceAddress, false);
        com.google.android.gms.internal.fitness.zzcm zzcmVar = this.zzok;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzcmVar == null ? null : zzcmVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
