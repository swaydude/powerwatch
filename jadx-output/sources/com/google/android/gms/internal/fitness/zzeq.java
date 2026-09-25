package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeq extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.fitness.zzeq> CREATOR = new com.google.android.gms.internal.fitness.zzet();
    private final java.util.List<com.google.android.gms.fitness.data.DataType> zzio;

    public zzeq(java.util.List<com.google.android.gms.fitness.data.DataType> list) {
        this.zzio = list;
    }

    public final java.util.List<com.google.android.gms.fitness.data.DataType> getDataTypes() {
        return java.util.Collections.unmodifiableList(this.zzio);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("dataTypes", this.zzio).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, java.util.Collections.unmodifiableList(this.zzio), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
