package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class SessionReadRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.SessionReadRequest> CREATOR = new com.google.android.gms.fitness.request.zzaw();
    private final long zzib;
    private final long zzic;
    private final java.util.List<com.google.android.gms.fitness.data.DataType> zzio;
    private final java.util.List<com.google.android.gms.fitness.data.DataSource> zzon;
    private final boolean zzoy;
    private final java.lang.String zzqd;
    private final java.lang.String zzqe;
    private boolean zzqf;
    private final java.util.List<java.lang.String> zzqg;
    private final com.google.android.gms.internal.fitness.zzcg zzqh;

    SessionReadRequest(java.lang.String str, java.lang.String str2, long j, long j2, java.util.List<com.google.android.gms.fitness.data.DataType> list, java.util.List<com.google.android.gms.fitness.data.DataSource> list2, boolean z, boolean z2, java.util.List<java.lang.String> list3, android.os.IBinder iBinder) {
        this.zzqd = str;
        this.zzqe = str2;
        this.zzib = j;
        this.zzic = j2;
        this.zzio = list;
        this.zzon = list2;
        this.zzqf = z;
        this.zzoy = z2;
        this.zzqg = list3;
        this.zzqh = com.google.android.gms.internal.fitness.zzcj.zzh(iBinder);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class Builder {
        private java.lang.String zzqd;
        private java.lang.String zzqe;
        private long zzib = 0;
        private long zzic = 0;
        private java.util.List<com.google.android.gms.fitness.data.DataType> zzio = new java.util.ArrayList();
        private java.util.List<com.google.android.gms.fitness.data.DataSource> zzon = new java.util.ArrayList();
        private boolean zzqi = false;
        private boolean zzoy = false;
        private java.util.List<java.lang.String> zzqg = new java.util.ArrayList();

        public com.google.android.gms.fitness.request.SessionReadRequest.Builder setTimeInterval(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            this.zzib = timeUnit.toMillis(j);
            this.zzic = timeUnit.toMillis(j2);
            return this;
        }

        public com.google.android.gms.fitness.request.SessionReadRequest.Builder setSessionName(java.lang.String str) {
            this.zzqd = str;
            return this;
        }

        public com.google.android.gms.fitness.request.SessionReadRequest.Builder setSessionId(java.lang.String str) {
            this.zzqe = str;
            return this;
        }

        public com.google.android.gms.fitness.request.SessionReadRequest.Builder read(com.google.android.gms.fitness.data.DataSource dataSource) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSource, "Attempting to add a null data source");
            if (!this.zzon.contains(dataSource)) {
                this.zzon.add(dataSource);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.SessionReadRequest.Builder read(com.google.android.gms.fitness.data.DataType dataType) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataType, "Attempting to use a null data type");
            if (!this.zzio.contains(dataType)) {
                this.zzio.add(dataType);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.SessionReadRequest.Builder readSessionsFromAllApps() {
            this.zzqi = true;
            return this;
        }

        public com.google.android.gms.fitness.request.SessionReadRequest.Builder excludePackage(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Attempting to use a null package name");
            if (!this.zzqg.contains(str)) {
                this.zzqg.add(str);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.SessionReadRequest.Builder enableServerQueries() {
            this.zzoy = true;
            return this;
        }

        public com.google.android.gms.fitness.request.SessionReadRequest build() {
            long j = this.zzib;
            com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0, "Invalid start time: %s", java.lang.Long.valueOf(j));
            long j2 = this.zzic;
            com.google.android.gms.common.internal.Preconditions.checkArgument(j2 > 0 && j2 > this.zzib, "Invalid end time: %s", java.lang.Long.valueOf(j2));
            return new com.google.android.gms.fitness.request.SessionReadRequest(this);
        }
    }

    private SessionReadRequest(com.google.android.gms.fitness.request.SessionReadRequest.Builder builder) {
        this(builder.zzqd, builder.zzqe, builder.zzib, builder.zzic, (java.util.List<com.google.android.gms.fitness.data.DataType>) builder.zzio, (java.util.List<com.google.android.gms.fitness.data.DataSource>) builder.zzon, builder.zzqi, builder.zzoy, (java.util.List<java.lang.String>) builder.zzqg, (com.google.android.gms.internal.fitness.zzcg) null);
    }

    public SessionReadRequest(com.google.android.gms.fitness.request.SessionReadRequest sessionReadRequest, com.google.android.gms.internal.fitness.zzcg zzcgVar) {
        this(sessionReadRequest.zzqd, sessionReadRequest.zzqe, sessionReadRequest.zzib, sessionReadRequest.zzic, sessionReadRequest.zzio, sessionReadRequest.zzon, sessionReadRequest.zzqf, sessionReadRequest.zzoy, sessionReadRequest.zzqg, zzcgVar);
    }

    private SessionReadRequest(java.lang.String str, java.lang.String str2, long j, long j2, java.util.List<com.google.android.gms.fitness.data.DataType> list, java.util.List<com.google.android.gms.fitness.data.DataSource> list2, boolean z, boolean z2, java.util.List<java.lang.String> list3, com.google.android.gms.internal.fitness.zzcg zzcgVar) {
        this(str, str2, j, j2, list, list2, z, z2, list3, zzcgVar == null ? null : zzcgVar.asBinder());
    }

    public long getStartTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzib, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public long getEndTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzic, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public java.lang.String getSessionName() {
        return this.zzqd;
    }

    public java.lang.String getSessionId() {
        return this.zzqe;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataType> getDataTypes() {
        return this.zzio;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSource> getDataSources() {
        return this.zzon;
    }

    public boolean includeSessionsFromAllApps() {
        return this.zzqf;
    }

    public java.util.List<java.lang.String> getExcludedPackages() {
        return this.zzqg;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof com.google.android.gms.fitness.request.SessionReadRequest) {
                com.google.android.gms.fitness.request.SessionReadRequest sessionReadRequest = (com.google.android.gms.fitness.request.SessionReadRequest) obj;
                if (com.google.android.gms.common.internal.Objects.equal(this.zzqd, sessionReadRequest.zzqd) && this.zzqe.equals(sessionReadRequest.zzqe) && this.zzib == sessionReadRequest.zzib && this.zzic == sessionReadRequest.zzic && com.google.android.gms.common.internal.Objects.equal(this.zzio, sessionReadRequest.zzio) && com.google.android.gms.common.internal.Objects.equal(this.zzon, sessionReadRequest.zzon) && this.zzqf == sessionReadRequest.zzqf && this.zzqg.equals(sessionReadRequest.zzqg) && this.zzoy == sessionReadRequest.zzoy) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzqd, this.zzqe, java.lang.Long.valueOf(this.zzib), java.lang.Long.valueOf(this.zzic));
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("sessionName", this.zzqd).add("sessionId", this.zzqe).add("startTimeMillis", java.lang.Long.valueOf(this.zzib)).add("endTimeMillis", java.lang.Long.valueOf(this.zzic)).add("dataTypes", this.zzio).add("dataSources", this.zzon).add("sessionsFromAllApps", java.lang.Boolean.valueOf(this.zzqf)).add("excludedPackages", this.zzqg).add("useServer", java.lang.Boolean.valueOf(this.zzoy)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getSessionName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getSessionId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzib);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, this.zzic);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 5, getDataTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 6, getDataSources(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, includeSessionsFromAllApps());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzoy);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 9, getExcludedPackages(), false);
        com.google.android.gms.internal.fitness.zzcg zzcgVar = this.zzqh;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 10, zzcgVar == null ? null : zzcgVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
