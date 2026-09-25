package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RawDataSet extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.RawDataSet> CREATOR = new com.google.android.gms.fitness.data.zzaa();
    public final boolean zzis;
    public final int zzlx;
    public final java.util.List<com.google.android.gms.fitness.data.RawDataPoint> zzlz;

    public RawDataSet(int i, java.util.List<com.google.android.gms.fitness.data.RawDataPoint> list, boolean z) {
        this.zzlx = i;
        this.zzlz = list;
        this.zzis = z;
    }

    public RawDataSet(com.google.android.gms.fitness.data.DataSet dataSet, java.util.List<com.google.android.gms.fitness.data.DataSource> list) {
        this.zzlz = dataSet.zza(list);
        this.zzis = dataSet.zze();
        this.zzlx = com.google.android.gms.internal.fitness.zzi.zza(dataSet.getDataSource(), list);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.RawDataSet)) {
            return false;
        }
        com.google.android.gms.fitness.data.RawDataSet rawDataSet = (com.google.android.gms.fitness.data.RawDataSet) obj;
        return this.zzlx == rawDataSet.zzlx && this.zzis == rawDataSet.zzis && com.google.android.gms.common.internal.Objects.equal(this.zzlz, rawDataSet.zzlz);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzlx));
    }

    public final java.lang.String toString() {
        return java.lang.String.format("RawDataSet{%s@[%s]}", java.lang.Integer.valueOf(this.zzlx), this.zzlz);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzlx);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, this.zzlz, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzis);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
