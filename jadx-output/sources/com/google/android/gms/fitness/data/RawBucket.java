package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RawBucket extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.RawBucket> CREATOR = new com.google.android.gms.fitness.data.zzy();
    public final long zzib;
    public final long zzic;
    public final com.google.android.gms.fitness.data.Session zzii;
    public final java.util.List<com.google.android.gms.fitness.data.RawDataSet> zziq;
    public final int zzir;
    public final boolean zzis;
    public final int zzlv;

    public RawBucket(long j, long j2, com.google.android.gms.fitness.data.Session session, int i, java.util.List<com.google.android.gms.fitness.data.RawDataSet> list, int i2, boolean z) {
        this.zzib = j;
        this.zzic = j2;
        this.zzii = session;
        this.zzlv = i;
        this.zziq = list;
        this.zzir = i2;
        this.zzis = z;
    }

    public RawBucket(com.google.android.gms.fitness.data.Bucket bucket, java.util.List<com.google.android.gms.fitness.data.DataSource> list) {
        this.zzib = bucket.getStartTime(java.util.concurrent.TimeUnit.MILLISECONDS);
        this.zzic = bucket.getEndTime(java.util.concurrent.TimeUnit.MILLISECONDS);
        this.zzii = bucket.getSession();
        this.zzlv = bucket.zzd();
        this.zzir = bucket.getBucketType();
        this.zzis = bucket.zze();
        java.util.List<com.google.android.gms.fitness.data.DataSet> dataSets = bucket.getDataSets();
        this.zziq = new java.util.ArrayList(dataSets.size());
        java.util.Iterator<com.google.android.gms.fitness.data.DataSet> it = dataSets.iterator();
        while (it.hasNext()) {
            this.zziq.add(new com.google.android.gms.fitness.data.RawDataSet(it.next(), list));
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.RawBucket)) {
            return false;
        }
        com.google.android.gms.fitness.data.RawBucket rawBucket = (com.google.android.gms.fitness.data.RawBucket) obj;
        return this.zzib == rawBucket.zzib && this.zzic == rawBucket.zzic && this.zzlv == rawBucket.zzlv && com.google.android.gms.common.internal.Objects.equal(this.zziq, rawBucket.zziq) && this.zzir == rawBucket.zzir && this.zzis == rawBucket.zzis;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zzib), java.lang.Long.valueOf(this.zzic), java.lang.Integer.valueOf(this.zzir));
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("startTime", java.lang.Long.valueOf(this.zzib)).add("endTime", java.lang.Long.valueOf(this.zzic)).add("activity", java.lang.Integer.valueOf(this.zzlv)).add("dataSets", this.zziq).add("bucketType", java.lang.Integer.valueOf(this.zzir)).add("serverHasMoreData", java.lang.Boolean.valueOf(this.zzis)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zzib);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzic);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzii, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzlv);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 5, this.zziq, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zzir);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, this.zzis);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
