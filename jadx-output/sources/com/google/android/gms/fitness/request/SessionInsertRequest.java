package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class SessionInsertRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    private final com.google.android.gms.fitness.data.Session zzii;
    private final java.util.List<com.google.android.gms.fitness.data.DataSet> zziq;
    private final com.google.android.gms.internal.fitness.zzcm zzok;
    private final java.util.List<com.google.android.gms.fitness.data.DataPoint> zzqb;
    private static final java.util.concurrent.TimeUnit zzqa = java.util.concurrent.TimeUnit.MILLISECONDS;
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.SessionInsertRequest> CREATOR = new com.google.android.gms.fitness.request.zzau();

    SessionInsertRequest(com.google.android.gms.fitness.data.Session session, java.util.List<com.google.android.gms.fitness.data.DataSet> list, java.util.List<com.google.android.gms.fitness.data.DataPoint> list2, android.os.IBinder iBinder) {
        this.zzii = session;
        this.zziq = java.util.Collections.unmodifiableList(list);
        this.zzqb = java.util.Collections.unmodifiableList(list2);
        this.zzok = com.google.android.gms.internal.fitness.zzcp.zzj(iBinder);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class Builder {
        private com.google.android.gms.fitness.data.Session zzii;
        private java.util.List<com.google.android.gms.fitness.data.DataSet> zziq = new java.util.ArrayList();
        private java.util.List<com.google.android.gms.fitness.data.DataPoint> zzqb = new java.util.ArrayList();
        private java.util.List<com.google.android.gms.fitness.data.DataSource> zzqc = new java.util.ArrayList();

        public com.google.android.gms.fitness.request.SessionInsertRequest.Builder setSession(com.google.android.gms.fitness.data.Session session) {
            this.zzii = session;
            return this;
        }

        public com.google.android.gms.fitness.request.SessionInsertRequest.Builder addDataSet(com.google.android.gms.fitness.data.DataSet dataSet) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataSet != null, "Must specify a valid data set.");
            com.google.android.gms.fitness.data.DataSource dataSource = dataSet.getDataSource();
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzqc.contains(dataSource), "Data set for this data source %s is already added.", dataSource);
            com.google.android.gms.common.internal.Preconditions.checkArgument(!dataSet.getDataPoints().isEmpty(), "No data points specified in the input data set.");
            this.zzqc.add(dataSource);
            this.zziq.add(dataSet);
            return this;
        }

        public com.google.android.gms.fitness.request.SessionInsertRequest.Builder addAggregateDataPoint(com.google.android.gms.fitness.data.DataPoint dataPoint) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataPoint != null, "Must specify a valid aggregate data point.");
            com.google.android.gms.fitness.data.DataSource dataSource = dataPoint.getDataSource();
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzqc.contains(dataSource), "Data set/Aggregate data point for this data source %s is already added.", dataSource);
            com.google.android.gms.fitness.data.DataSet.zzb(dataPoint);
            this.zzqc.add(dataSource);
            this.zzqb.add(dataPoint);
            return this;
        }

        public com.google.android.gms.fitness.request.SessionInsertRequest build() {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzii != null, "Must specify a valid session.");
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzii.getEndTime(java.util.concurrent.TimeUnit.MILLISECONDS) != 0, "Must specify a valid end time, cannot insert a continuing session.");
            java.util.Iterator<com.google.android.gms.fitness.data.DataSet> it = this.zziq.iterator();
            while (it.hasNext()) {
                java.util.Iterator<com.google.android.gms.fitness.data.DataPoint> it2 = it.next().getDataPoints().iterator();
                while (it2.hasNext()) {
                    zzd(it2.next());
                }
            }
            java.util.Iterator<com.google.android.gms.fitness.data.DataPoint> it3 = this.zzqb.iterator();
            while (it3.hasNext()) {
                zzd(it3.next());
            }
            return new com.google.android.gms.fitness.request.SessionInsertRequest(this);
        }

        private final void zzd(com.google.android.gms.fitness.data.DataPoint dataPoint) {
            long startTime = this.zzii.getStartTime(java.util.concurrent.TimeUnit.NANOSECONDS);
            long endTime = this.zzii.getEndTime(java.util.concurrent.TimeUnit.NANOSECONDS);
            long timestamp = dataPoint.getTimestamp(java.util.concurrent.TimeUnit.NANOSECONDS);
            if (timestamp != 0) {
                if (timestamp < startTime || timestamp > endTime) {
                    timestamp = com.google.android.gms.internal.fitness.zzh.zza(timestamp, java.util.concurrent.TimeUnit.NANOSECONDS, com.google.android.gms.fitness.request.SessionInsertRequest.zzqa);
                }
                com.google.android.gms.common.internal.Preconditions.checkState(timestamp >= startTime && timestamp <= endTime, "Data point %s has time stamp outside session interval [%d, %d]", dataPoint, java.lang.Long.valueOf(startTime), java.lang.Long.valueOf(endTime));
                if (dataPoint.getTimestamp(java.util.concurrent.TimeUnit.NANOSECONDS) != timestamp) {
                    android.util.Log.w("Fitness", java.lang.String.format("Data point timestamp [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", java.lang.Long.valueOf(dataPoint.getTimestamp(java.util.concurrent.TimeUnit.NANOSECONDS)), java.lang.Long.valueOf(timestamp), com.google.android.gms.fitness.request.SessionInsertRequest.zzqa));
                    dataPoint.setTimestamp(timestamp, java.util.concurrent.TimeUnit.NANOSECONDS);
                }
            }
            long startTime2 = this.zzii.getStartTime(java.util.concurrent.TimeUnit.NANOSECONDS);
            long endTime2 = this.zzii.getEndTime(java.util.concurrent.TimeUnit.NANOSECONDS);
            long startTime3 = dataPoint.getStartTime(java.util.concurrent.TimeUnit.NANOSECONDS);
            long endTime3 = dataPoint.getEndTime(java.util.concurrent.TimeUnit.NANOSECONDS);
            if (startTime3 == 0 || endTime3 == 0) {
                return;
            }
            if (endTime3 > endTime2) {
                endTime3 = com.google.android.gms.internal.fitness.zzh.zza(endTime3, java.util.concurrent.TimeUnit.NANOSECONDS, com.google.android.gms.fitness.request.SessionInsertRequest.zzqa);
            }
            com.google.android.gms.common.internal.Preconditions.checkState(startTime3 >= startTime2 && endTime3 <= endTime2, "Data point %s has start and end times outside session interval [%d, %d]", dataPoint, java.lang.Long.valueOf(startTime2), java.lang.Long.valueOf(endTime2));
            if (endTime3 != dataPoint.getEndTime(java.util.concurrent.TimeUnit.NANOSECONDS)) {
                android.util.Log.w("Fitness", java.lang.String.format("Data point end time [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", java.lang.Long.valueOf(dataPoint.getEndTime(java.util.concurrent.TimeUnit.NANOSECONDS)), java.lang.Long.valueOf(endTime3), com.google.android.gms.fitness.request.SessionInsertRequest.zzqa));
                dataPoint.setTimeInterval(startTime3, endTime3, java.util.concurrent.TimeUnit.NANOSECONDS);
            }
        }
    }

    private SessionInsertRequest(com.google.android.gms.fitness.request.SessionInsertRequest.Builder builder) {
        this(builder.zzii, (java.util.List<com.google.android.gms.fitness.data.DataSet>) builder.zziq, (java.util.List<com.google.android.gms.fitness.data.DataPoint>) builder.zzqb, (com.google.android.gms.internal.fitness.zzcm) null);
    }

    public SessionInsertRequest(com.google.android.gms.fitness.request.SessionInsertRequest sessionInsertRequest, com.google.android.gms.internal.fitness.zzcm zzcmVar) {
        this(sessionInsertRequest.zzii, sessionInsertRequest.zziq, sessionInsertRequest.zzqb, zzcmVar);
    }

    private SessionInsertRequest(com.google.android.gms.fitness.data.Session session, java.util.List<com.google.android.gms.fitness.data.DataSet> list, java.util.List<com.google.android.gms.fitness.data.DataPoint> list2, com.google.android.gms.internal.fitness.zzcm zzcmVar) {
        this.zzii = session;
        this.zziq = java.util.Collections.unmodifiableList(list);
        this.zzqb = java.util.Collections.unmodifiableList(list2);
        this.zzok = zzcmVar;
    }

    public com.google.android.gms.fitness.data.Session getSession() {
        return this.zzii;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSet> getDataSets() {
        return this.zziq;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataPoint> getAggregateDataPoints() {
        return this.zzqb;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != this) {
            if (obj instanceof com.google.android.gms.fitness.request.SessionInsertRequest) {
                com.google.android.gms.fitness.request.SessionInsertRequest sessionInsertRequest = (com.google.android.gms.fitness.request.SessionInsertRequest) obj;
                if (com.google.android.gms.common.internal.Objects.equal(this.zzii, sessionInsertRequest.zzii) && com.google.android.gms.common.internal.Objects.equal(this.zziq, sessionInsertRequest.zziq) && com.google.android.gms.common.internal.Objects.equal(this.zzqb, sessionInsertRequest.zzqb)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzii, this.zziq, this.zzqb);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SESSION_KEY, this.zzii).add("dataSets", this.zziq).add("aggregateDataPoints", this.zzqb).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getSession(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, getDataSets(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, getAggregateDataPoints(), false);
        com.google.android.gms.internal.fitness.zzcm zzcmVar = this.zzok;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 4, zzcmVar == null ? null : zzcmVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
