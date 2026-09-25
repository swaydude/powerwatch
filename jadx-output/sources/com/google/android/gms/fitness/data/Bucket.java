package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class Bucket extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Bucket> CREATOR = new com.google.android.gms.fitness.data.zze();
    public static final int TYPE_ACTIVITY_SEGMENT = 4;
    public static final int TYPE_ACTIVITY_TYPE = 3;
    public static final int TYPE_SESSION = 2;
    public static final int TYPE_TIME = 1;
    private final long zzib;
    private final long zzic;
    private final com.google.android.gms.fitness.data.Session zzii;
    private final int zzip;
    private final java.util.List<com.google.android.gms.fitness.data.DataSet> zziq;
    private final int zzir;
    private boolean zzis;

    Bucket(long j, long j2, com.google.android.gms.fitness.data.Session session, int i, java.util.List<com.google.android.gms.fitness.data.DataSet> list, int i2, boolean z) {
        this.zzis = false;
        this.zzib = j;
        this.zzic = j2;
        this.zzii = session;
        this.zzip = i;
        this.zziq = list;
        this.zzir = i2;
        this.zzis = z;
    }

    public static java.lang.String zza(int i) {
        if (i == 0) {
            return io.reactivex.annotations.SchedulerSupport.NONE;
        }
        if (i == 1) {
            return "time";
        }
        if (i == 2) {
            return io.fabric.sdk.android.services.settings.SettingsJsonConstants.SESSION_KEY;
        }
        if (i == 3) {
            return "type";
        }
        if (i != 4) {
            return i != 5 ? "bug" : "intervals";
        }
        return "segment";
    }

    public Bucket(com.google.android.gms.fitness.data.RawBucket rawBucket, java.util.List<com.google.android.gms.fitness.data.DataSource> list) {
        long j = rawBucket.zzib;
        long j2 = rawBucket.zzic;
        com.google.android.gms.fitness.data.Session session = rawBucket.zzii;
        int i = rawBucket.zzlv;
        java.util.List<com.google.android.gms.fitness.data.RawDataSet> list2 = rawBucket.zziq;
        java.util.ArrayList arrayList = new java.util.ArrayList(list2.size());
        java.util.Iterator<com.google.android.gms.fitness.data.RawDataSet> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.google.android.gms.fitness.data.DataSet(it.next(), list));
        }
        this(j, j2, session, i, arrayList, rawBucket.zzir, rawBucket.zzis);
    }

    public long getStartTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzib, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public long getEndTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzic, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public com.google.android.gms.fitness.data.Session getSession() {
        return this.zzii;
    }

    public java.lang.String getActivity() {
        return com.google.android.gms.internal.fitness.zzjn.getName(this.zzip);
    }

    public final int zzd() {
        return this.zzip;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSet> getDataSets() {
        return this.zziq;
    }

    public com.google.android.gms.fitness.data.DataSet getDataSet(com.google.android.gms.fitness.data.DataType dataType) {
        for (com.google.android.gms.fitness.data.DataSet dataSet : this.zziq) {
            if (dataSet.getDataType().equals(dataType)) {
                return dataSet;
            }
        }
        return null;
    }

    public int getBucketType() {
        return this.zzir;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.Bucket)) {
            return false;
        }
        com.google.android.gms.fitness.data.Bucket bucket = (com.google.android.gms.fitness.data.Bucket) obj;
        return this.zzib == bucket.zzib && this.zzic == bucket.zzic && this.zzip == bucket.zzip && com.google.android.gms.common.internal.Objects.equal(this.zziq, bucket.zziq) && this.zzir == bucket.zzir && this.zzis == bucket.zzis;
    }

    public final boolean zza(com.google.android.gms.fitness.data.Bucket bucket) {
        return this.zzib == bucket.zzib && this.zzic == bucket.zzic && this.zzip == bucket.zzip && this.zzir == bucket.zzir;
    }

    public final boolean zze() {
        if (this.zzis) {
            return true;
        }
        java.util.Iterator<com.google.android.gms.fitness.data.DataSet> it = this.zziq.iterator();
        while (it.hasNext()) {
            if (it.next().zze()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zzib), java.lang.Long.valueOf(this.zzic), java.lang.Integer.valueOf(this.zzip), java.lang.Integer.valueOf(this.zzir));
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("startTime", java.lang.Long.valueOf(this.zzib)).add("endTime", java.lang.Long.valueOf(this.zzic)).add("activity", java.lang.Integer.valueOf(this.zzip)).add("dataSets", this.zziq).add("bucketType", zza(this.zzir)).add("serverHasMoreData", java.lang.Boolean.valueOf(this.zzis)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zzib);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzic);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getSession(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzip);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 5, getDataSets(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, getBucketType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, zze());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
