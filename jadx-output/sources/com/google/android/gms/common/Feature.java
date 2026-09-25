package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
public class Feature extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.Feature> CREATOR = new com.google.android.gms.common.zzb();
    private final java.lang.String name;

    @java.lang.Deprecated
    private final int zzk;
    private final long zzl;

    public Feature(java.lang.String str, long j) {
        this.name = str;
        this.zzl = j;
        this.zzk = -1;
    }

    public Feature(java.lang.String str, int i, long j) {
        this.name = str;
        this.zzk = i;
        this.zzl = j;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public long getVersion() {
        long j = this.zzl;
        return j == -1 ? this.zzk : j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, getVersion());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.common.Feature) {
            com.google.android.gms.common.Feature feature = (com.google.android.gms.common.Feature) obj;
            if (((getName() != null && getName().equals(feature.getName())) || (getName() == null && feature.getName() == null)) && getVersion() == feature.getVersion()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(getName(), java.lang.Long.valueOf(getVersion()));
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, getName()).add("version", java.lang.Long.valueOf(getVersion())).toString();
    }
}
