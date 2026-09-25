package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzf> CREATOR = new com.google.android.gms.fitness.request.zze();
    private final java.lang.String deviceAddress;
    private final com.google.android.gms.fitness.data.BleDevice zzoj;
    private final com.google.android.gms.internal.fitness.zzcm zzok;

    zzf(java.lang.String str, com.google.android.gms.fitness.data.BleDevice bleDevice, android.os.IBinder iBinder) {
        this.deviceAddress = str;
        this.zzoj = bleDevice;
        this.zzok = com.google.android.gms.internal.fitness.zzcp.zzj(iBinder);
    }

    public zzf(java.lang.String str, com.google.android.gms.fitness.data.BleDevice bleDevice, com.google.android.gms.internal.fitness.zzcm zzcmVar) {
        this.deviceAddress = str;
        this.zzoj = bleDevice;
        this.zzok = zzcmVar;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("ClaimBleDeviceRequest{%s %s}", this.deviceAddress, this.zzoj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.deviceAddress, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzoj, i, false);
        com.google.android.gms.internal.fitness.zzcm zzcmVar = this.zzok;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzcmVar == null ? null : zzcmVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
