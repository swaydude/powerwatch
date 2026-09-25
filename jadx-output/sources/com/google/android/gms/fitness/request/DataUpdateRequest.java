package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class DataUpdateRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.DataUpdateRequest> CREATOR = new com.google.android.gms.fitness.request.zzz();
    private final long zzib;
    private final long zzic;
    private final com.google.android.gms.fitness.data.DataSet zzjd;
    private final com.google.android.gms.internal.fitness.zzcm zzok;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class Builder {
        private long zzib;
        private long zzic;
        private com.google.android.gms.fitness.data.DataSet zzjd;

        public com.google.android.gms.fitness.request.DataUpdateRequest.Builder setTimeInterval(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0, "Invalid start time :%d", java.lang.Long.valueOf(j));
            com.google.android.gms.common.internal.Preconditions.checkArgument(j2 >= j, "Invalid end time :%d", java.lang.Long.valueOf(j2));
            this.zzib = timeUnit.toMillis(j);
            this.zzic = timeUnit.toMillis(j2);
            return this;
        }

        public com.google.android.gms.fitness.request.DataUpdateRequest.Builder setDataSet(com.google.android.gms.fitness.data.DataSet dataSet) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSet, "Must set the data set");
            this.zzjd = dataSet;
            return this;
        }

        public com.google.android.gms.fitness.request.DataUpdateRequest build() {
            com.google.android.gms.common.internal.Preconditions.checkNotZero(this.zzib, "Must set a non-zero value for startTimeMillis/startTime");
            com.google.android.gms.common.internal.Preconditions.checkNotZero(this.zzic, "Must set a non-zero value for endTimeMillis/endTime");
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzjd, "Must set the data set");
            for (com.google.android.gms.fitness.data.DataPoint dataPoint : this.zzjd.getDataPoints()) {
                long startTime = dataPoint.getStartTime(java.util.concurrent.TimeUnit.MILLISECONDS);
                long endTime = dataPoint.getEndTime(java.util.concurrent.TimeUnit.MILLISECONDS);
                com.google.android.gms.common.internal.Preconditions.checkState(!(startTime > endTime || (startTime != 0 && startTime < this.zzib) || ((startTime != 0 && startTime > this.zzic) || endTime > this.zzic || endTime < this.zzib)), "Data Point's startTimeMillis %d, endTimeMillis %d should lie between timeRange provided in the request. StartTimeMillis %d, EndTimeMillis: %d", java.lang.Long.valueOf(startTime), java.lang.Long.valueOf(endTime), java.lang.Long.valueOf(this.zzib), java.lang.Long.valueOf(this.zzic));
            }
            return new com.google.android.gms.fitness.request.DataUpdateRequest(this);
        }
    }

    public DataUpdateRequest(long j, long j2, com.google.android.gms.fitness.data.DataSet dataSet, android.os.IBinder iBinder) {
        this.zzib = j;
        this.zzic = j2;
        this.zzjd = dataSet;
        this.zzok = com.google.android.gms.internal.fitness.zzcp.zzj(iBinder);
    }

    private DataUpdateRequest(com.google.android.gms.fitness.request.DataUpdateRequest.Builder builder) {
        this(builder.zzib, builder.zzic, builder.zzjd, null);
    }

    public DataUpdateRequest(com.google.android.gms.fitness.request.DataUpdateRequest dataUpdateRequest, android.os.IBinder iBinder) {
        this(dataUpdateRequest.zzib, dataUpdateRequest.zzic, dataUpdateRequest.getDataSet(), iBinder);
    }

    public final long zzy() {
        return this.zzib;
    }

    public final long zzz() {
        return this.zzic;
    }

    public com.google.android.gms.fitness.data.DataSet getDataSet() {
        return this.zzjd;
    }

    public android.os.IBinder getCallbackBinder() {
        com.google.android.gms.internal.fitness.zzcm zzcmVar = this.zzok;
        if (zzcmVar == null) {
            return null;
        }
        return zzcmVar.asBinder();
    }

    public long getStartTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzib, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public long getEndTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzic, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != this) {
            if (obj instanceof com.google.android.gms.fitness.request.DataUpdateRequest) {
                com.google.android.gms.fitness.request.DataUpdateRequest dataUpdateRequest = (com.google.android.gms.fitness.request.DataUpdateRequest) obj;
                if (this.zzib == dataUpdateRequest.zzib && this.zzic == dataUpdateRequest.zzic && com.google.android.gms.common.internal.Objects.equal(this.zzjd, dataUpdateRequest.zzjd)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zzib), java.lang.Long.valueOf(this.zzic), this.zzjd);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("startTimeMillis", java.lang.Long.valueOf(this.zzib)).add("endTimeMillis", java.lang.Long.valueOf(this.zzic)).add("dataSet", this.zzjd).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zzib);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzic);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getDataSet(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 4, getCallbackBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
