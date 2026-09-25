package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class BleDevice extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.BleDevice> CREATOR = new com.google.android.gms.fitness.data.zzd();
    private final java.lang.String name;
    private final java.lang.String zzim;
    private final java.util.List<java.lang.String> zzin;
    private final java.util.List<com.google.android.gms.fitness.data.DataType> zzio;

    BleDevice(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list, java.util.List<com.google.android.gms.fitness.data.DataType> list2) {
        this.zzim = str;
        this.name = str2;
        this.zzin = java.util.Collections.unmodifiableList(list);
        this.zzio = java.util.Collections.unmodifiableList(list2);
    }

    public java.lang.String getAddress() {
        return this.zzim;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.util.List<java.lang.String> getSupportedProfiles() {
        return this.zzin;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataType> getDataTypes() {
        return this.zzio;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.BleDevice)) {
            return false;
        }
        com.google.android.gms.fitness.data.BleDevice bleDevice = (com.google.android.gms.fitness.data.BleDevice) obj;
        return this.name.equals(bleDevice.name) && this.zzim.equals(bleDevice.zzim) && new java.util.HashSet(this.zzin).equals(new java.util.HashSet(bleDevice.zzin)) && new java.util.HashSet(this.zzio).equals(new java.util.HashSet(bleDevice.zzio));
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.name, this.zzim, this.zzin, this.zzio);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, this.name).add("address", this.zzim).add("dataTypes", this.zzio).add("supportedProfiles", this.zzin).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getAddress(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 3, getSupportedProfiles(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 4, getDataTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
