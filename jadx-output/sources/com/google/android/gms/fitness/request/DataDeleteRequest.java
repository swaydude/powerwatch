package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class DataDeleteRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.DataDeleteRequest> CREATOR = new com.google.android.gms.fitness.request.zzj();
    private final long zzib;
    private final long zzic;
    private final java.util.List<com.google.android.gms.fitness.data.DataType> zzio;
    private final com.google.android.gms.internal.fitness.zzcm zzok;
    private final java.util.List<com.google.android.gms.fitness.data.DataSource> zzon;
    private final java.util.List<com.google.android.gms.fitness.data.Session> zzoo;
    private final boolean zzop;
    private final boolean zzoq;
    private final boolean zzor;

    DataDeleteRequest(long j, long j2, java.util.List<com.google.android.gms.fitness.data.DataSource> list, java.util.List<com.google.android.gms.fitness.data.DataType> list2, java.util.List<com.google.android.gms.fitness.data.Session> list3, boolean z, boolean z2, boolean z3, android.os.IBinder iBinder) {
        this.zzib = j;
        this.zzic = j2;
        this.zzon = java.util.Collections.unmodifiableList(list);
        this.zzio = java.util.Collections.unmodifiableList(list2);
        this.zzoo = list3;
        this.zzop = z;
        this.zzoq = z2;
        this.zzor = z3;
        this.zzok = com.google.android.gms.internal.fitness.zzcp.zzj(iBinder);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class Builder {
        private long zzib;
        private long zzic;
        private java.util.List<com.google.android.gms.fitness.data.DataSource> zzon = new java.util.ArrayList();
        private java.util.List<com.google.android.gms.fitness.data.DataType> zzio = new java.util.ArrayList();
        private java.util.List<com.google.android.gms.fitness.data.Session> zzoo = new java.util.ArrayList();
        private boolean zzop = false;
        private boolean zzoq = false;
        private boolean zzor = false;

        public com.google.android.gms.fitness.request.DataDeleteRequest.Builder setTimeInterval(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0, "Invalid start time: %d", java.lang.Long.valueOf(j));
            com.google.android.gms.common.internal.Preconditions.checkArgument(j2 > j, "Invalid end time: %d", java.lang.Long.valueOf(j2));
            this.zzib = timeUnit.toMillis(j);
            this.zzic = timeUnit.toMillis(j2);
            return this;
        }

        public com.google.android.gms.fitness.request.DataDeleteRequest.Builder deleteAllData() {
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.zzio.isEmpty(), "Specific data type already added for deletion. deleteAllData() will delete all data types and cannot be combined with addDataType()");
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.zzon.isEmpty(), "Specific data source already added for deletion. deleteAllData() will delete all data sources and cannot be combined with addDataSource()");
            this.zzop = true;
            return this;
        }

        public com.google.android.gms.fitness.request.DataDeleteRequest.Builder addDataType(com.google.android.gms.fitness.data.DataType dataType) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(!this.zzop, "All data is already marked for deletion.  addDataType() cannot be combined with deleteAllData()");
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataType != null, "Must specify a valid data type");
            if (!this.zzio.contains(dataType)) {
                this.zzio.add(dataType);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.DataDeleteRequest.Builder addDataSource(com.google.android.gms.fitness.data.DataSource dataSource) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(!this.zzop, "All data is already marked for deletion.  addDataSource() cannot be combined with deleteAllData()");
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataSource != null, "Must specify a valid data source");
            if (!this.zzon.contains(dataSource)) {
                this.zzon.add(dataSource);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.DataDeleteRequest.Builder addSession(com.google.android.gms.fitness.data.Session session) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(!this.zzoq, "All sessions already marked for deletion.  addSession() cannot be combined with deleteAllSessions()");
            com.google.android.gms.common.internal.Preconditions.checkArgument(session != null, "Must specify a valid session");
            com.google.android.gms.common.internal.Preconditions.checkArgument(session.getEndTime(java.util.concurrent.TimeUnit.MILLISECONDS) > 0, "Cannot delete an ongoing session. Please stop the session prior to deleting it");
            this.zzoo.add(session);
            return this;
        }

        public com.google.android.gms.fitness.request.DataDeleteRequest.Builder deleteAllSessions() {
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.zzoo.isEmpty(), "Specific session already added for deletion. deleteAllData() will delete all sessions and cannot be combined with addSession()");
            this.zzoq = true;
            return this;
        }

        public com.google.android.gms.fitness.request.DataDeleteRequest build() {
            long j = this.zzib;
            com.google.android.gms.common.internal.Preconditions.checkState(j > 0 && this.zzic > j, "Must specify a valid time interval");
            com.google.android.gms.common.internal.Preconditions.checkState((this.zzop || !this.zzon.isEmpty() || !this.zzio.isEmpty()) || (this.zzoq || !this.zzoo.isEmpty()), "No data or session marked for deletion");
            if (!this.zzoo.isEmpty()) {
                for (com.google.android.gms.fitness.data.Session session : this.zzoo) {
                    com.google.android.gms.common.internal.Preconditions.checkState(session.getStartTime(java.util.concurrent.TimeUnit.MILLISECONDS) >= this.zzib && session.getEndTime(java.util.concurrent.TimeUnit.MILLISECONDS) <= this.zzic, "Session %s is outside the time interval [%d, %d]", session, java.lang.Long.valueOf(this.zzib), java.lang.Long.valueOf(this.zzic));
                }
            }
            return new com.google.android.gms.fitness.request.DataDeleteRequest(this);
        }
    }

    private DataDeleteRequest(com.google.android.gms.fitness.request.DataDeleteRequest.Builder builder) {
        this(builder.zzib, builder.zzic, (java.util.List<com.google.android.gms.fitness.data.DataSource>) builder.zzon, (java.util.List<com.google.android.gms.fitness.data.DataType>) builder.zzio, (java.util.List<com.google.android.gms.fitness.data.Session>) builder.zzoo, builder.zzop, builder.zzoq, false, (com.google.android.gms.internal.fitness.zzcm) null);
    }

    public DataDeleteRequest(com.google.android.gms.fitness.request.DataDeleteRequest dataDeleteRequest, com.google.android.gms.internal.fitness.zzcm zzcmVar) {
        this(dataDeleteRequest.zzib, dataDeleteRequest.zzic, dataDeleteRequest.zzon, dataDeleteRequest.zzio, dataDeleteRequest.zzoo, dataDeleteRequest.zzop, dataDeleteRequest.zzoq, dataDeleteRequest.zzor, zzcmVar);
    }

    private DataDeleteRequest(long j, long j2, java.util.List<com.google.android.gms.fitness.data.DataSource> list, java.util.List<com.google.android.gms.fitness.data.DataType> list2, java.util.List<com.google.android.gms.fitness.data.Session> list3, boolean z, boolean z2, boolean z3, com.google.android.gms.internal.fitness.zzcm zzcmVar) {
        this.zzib = j;
        this.zzic = j2;
        this.zzon = java.util.Collections.unmodifiableList(list);
        this.zzio = java.util.Collections.unmodifiableList(list2);
        this.zzoo = list3;
        this.zzop = z;
        this.zzoq = z2;
        this.zzor = z3;
        this.zzok = zzcmVar;
    }

    public long getStartTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzib, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public long getEndTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzic, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSource> getDataSources() {
        return this.zzon;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataType> getDataTypes() {
        return this.zzio;
    }

    public java.util.List<com.google.android.gms.fitness.data.Session> getSessions() {
        return this.zzoo;
    }

    public boolean deleteAllData() {
        return this.zzop;
    }

    public boolean deleteAllSessions() {
        return this.zzoq;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != this) {
            if (obj instanceof com.google.android.gms.fitness.request.DataDeleteRequest) {
                com.google.android.gms.fitness.request.DataDeleteRequest dataDeleteRequest = (com.google.android.gms.fitness.request.DataDeleteRequest) obj;
                if (this.zzib == dataDeleteRequest.zzib && this.zzic == dataDeleteRequest.zzic && com.google.android.gms.common.internal.Objects.equal(this.zzon, dataDeleteRequest.zzon) && com.google.android.gms.common.internal.Objects.equal(this.zzio, dataDeleteRequest.zzio) && com.google.android.gms.common.internal.Objects.equal(this.zzoo, dataDeleteRequest.zzoo) && this.zzop == dataDeleteRequest.zzop && this.zzoq == dataDeleteRequest.zzoq && this.zzor == dataDeleteRequest.zzor) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zzib), java.lang.Long.valueOf(this.zzic));
    }

    public java.lang.String toString() {
        com.google.android.gms.common.internal.Objects.ToStringHelper toStringHelperAdd = com.google.android.gms.common.internal.Objects.toStringHelper(this).add("startTimeMillis", java.lang.Long.valueOf(this.zzib)).add("endTimeMillis", java.lang.Long.valueOf(this.zzic)).add("dataSources", this.zzon).add("dateTypes", this.zzio).add("sessions", this.zzoo).add("deleteAllData", java.lang.Boolean.valueOf(this.zzop)).add("deleteAllSessions", java.lang.Boolean.valueOf(this.zzoq));
        boolean z = this.zzor;
        if (z) {
            toStringHelperAdd.add("deleteByTimeRange", java.lang.Boolean.valueOf(z));
        }
        return toStringHelperAdd.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zzib);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzic);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, getDataSources(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 4, getDataTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 5, getSessions(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, deleteAllData());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, deleteAllSessions());
        com.google.android.gms.internal.fitness.zzcm zzcmVar = this.zzok;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 8, zzcmVar == null ? null : zzcmVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, this.zzor);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
