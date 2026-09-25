package com.google.android.gms.fitness.result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class BleDevicesResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.result.BleDevicesResult> CREATOR = new com.google.android.gms.fitness.result.zza();
    private final java.util.List<com.google.android.gms.fitness.data.BleDevice> zzqq;
    private final com.google.android.gms.common.api.Status zzqr;

    public BleDevicesResult(java.util.List<com.google.android.gms.fitness.data.BleDevice> list, com.google.android.gms.common.api.Status status) {
        this.zzqq = java.util.Collections.unmodifiableList(list);
        this.zzqr = status;
    }

    public static com.google.android.gms.fitness.result.BleDevicesResult zzb(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.fitness.result.BleDevicesResult(java.util.Collections.emptyList(), status);
    }

    public java.util.List<com.google.android.gms.fitness.data.BleDevice> getClaimedBleDevices() {
        return this.zzqq;
    }

    public java.util.List<com.google.android.gms.fitness.data.BleDevice> getClaimedBleDevices(com.google.android.gms.fitness.data.DataType dataType) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.gms.fitness.data.BleDevice bleDevice : this.zzqq) {
            if (bleDevice.getDataTypes().contains(dataType)) {
                arrayList.add(bleDevice);
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zzqr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof com.google.android.gms.fitness.result.BleDevicesResult) {
                com.google.android.gms.fitness.result.BleDevicesResult bleDevicesResult = (com.google.android.gms.fitness.result.BleDevicesResult) obj;
                if (this.zzqr.equals(bleDevicesResult.zzqr) && com.google.android.gms.common.internal.Objects.equal(this.zzqq, bleDevicesResult.zzqq)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzqr, this.zzqq);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("status", this.zzqr).add("bleDevices", this.zzqq).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getClaimedBleDevices(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
