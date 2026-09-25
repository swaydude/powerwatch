package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class DataReadRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.DataReadRequest> CREATOR = new com.google.android.gms.fitness.request.zzn();
    public static final int NO_LIMIT = 0;
    private final int limit;
    private final long zzib;
    private final long zzic;
    private final java.util.List<com.google.android.gms.fitness.data.DataType> zzio;
    private final int zzir;
    private final java.util.List<com.google.android.gms.fitness.data.DataSource> zzon;
    private final java.util.List<com.google.android.gms.fitness.data.DataType> zzot;
    private final java.util.List<com.google.android.gms.fitness.data.DataSource> zzou;
    private final long zzov;
    private final com.google.android.gms.fitness.data.DataSource zzow;
    private final boolean zzox;
    private final boolean zzoy;
    private final com.google.android.gms.internal.fitness.zzbf zzoz;
    private final java.util.List<com.google.android.gms.fitness.data.Device> zzpa;
    private final java.util.List<java.lang.Integer> zzpb;
    private final java.util.List<java.lang.Long> zzpc;
    private final java.util.List<java.lang.Long> zzpd;

    DataReadRequest(java.util.List<com.google.android.gms.fitness.data.DataType> list, java.util.List<com.google.android.gms.fitness.data.DataSource> list2, long j, long j2, java.util.List<com.google.android.gms.fitness.data.DataType> list3, java.util.List<com.google.android.gms.fitness.data.DataSource> list4, int i, long j3, com.google.android.gms.fitness.data.DataSource dataSource, int i2, boolean z, boolean z2, android.os.IBinder iBinder, java.util.List<com.google.android.gms.fitness.data.Device> list5, java.util.List<java.lang.Integer> list6, java.util.List<java.lang.Long> list7, java.util.List<java.lang.Long> list8) {
        this.zzio = list;
        this.zzon = list2;
        this.zzib = j;
        this.zzic = j2;
        this.zzot = list3;
        this.zzou = list4;
        this.zzir = i;
        this.zzov = j3;
        this.zzow = dataSource;
        this.limit = i2;
        this.zzox = z;
        this.zzoy = z2;
        this.zzoz = iBinder == null ? null : com.google.android.gms.internal.fitness.zzbe.zzc(iBinder);
        this.zzpa = list5 == null ? java.util.Collections.emptyList() : list5;
        this.zzpb = list6 == null ? java.util.Collections.emptyList() : list6;
        java.util.List<java.lang.Long> listEmptyList = list7 == null ? java.util.Collections.emptyList() : list7;
        this.zzpc = listEmptyList;
        java.util.List<java.lang.Long> listEmptyList2 = list8 == null ? java.util.Collections.emptyList() : list8;
        this.zzpd = listEmptyList2;
        com.google.android.gms.common.internal.Preconditions.checkArgument(listEmptyList.size() == listEmptyList2.size(), "Unequal number of interval start and end times.");
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class Builder {
        private long zzib;
        private long zzic;
        private com.google.android.gms.fitness.data.DataSource zzow;
        private java.util.List<com.google.android.gms.fitness.data.DataType> zzio = new java.util.ArrayList();
        private java.util.List<com.google.android.gms.fitness.data.DataSource> zzon = new java.util.ArrayList();
        private java.util.List<com.google.android.gms.fitness.data.DataType> zzot = new java.util.ArrayList();
        private java.util.List<com.google.android.gms.fitness.data.DataSource> zzou = new java.util.ArrayList();
        private java.util.List<java.lang.Long> zzpc = new java.util.ArrayList();
        private java.util.List<java.lang.Long> zzpd = new java.util.ArrayList();
        private int zzir = 0;
        private long zzov = 0;
        private int limit = 0;
        private boolean zzox = false;
        private boolean zzoy = false;
        private final java.util.List<com.google.android.gms.fitness.data.Device> zzpa = new java.util.ArrayList();
        private final java.util.List<java.lang.Integer> zzpb = new java.util.ArrayList();

        public com.google.android.gms.fitness.request.DataReadRequest.Builder read(com.google.android.gms.fitness.data.DataSource dataSource) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSource, "Attempting to add a null data source");
            com.google.android.gms.common.internal.Preconditions.checkArgument(!this.zzou.contains(dataSource), "Cannot add the same data source as aggregated and detailed");
            if (!this.zzon.contains(dataSource)) {
                this.zzon.add(dataSource);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder read(com.google.android.gms.fitness.data.DataType dataType) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataType, "Attempting to use a null data type");
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzot.contains(dataType), "Cannot add the same data type as aggregated and detailed");
            if (!this.zzio.contains(dataType)) {
                this.zzio.add(dataType);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder aggregate(com.google.android.gms.fitness.data.DataSource dataSource, com.google.android.gms.fitness.data.DataType dataType) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSource, "Attempting to add a null data source");
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzon.contains(dataSource), "Cannot add the same data source for aggregated and detailed");
            com.google.android.gms.fitness.data.DataType dataType2 = dataSource.getDataType();
            java.util.List<com.google.android.gms.fitness.data.DataType> aggregatesForInput = com.google.android.gms.fitness.data.DataType.getAggregatesForInput(dataType2);
            com.google.android.gms.common.internal.Preconditions.checkArgument(!aggregatesForInput.isEmpty(), "Unsupported input data type specified for aggregation: %s", dataType2);
            com.google.android.gms.common.internal.Preconditions.checkArgument(aggregatesForInput.contains(dataType), "Invalid output aggregate data type specified: %s -> %s", dataType2, dataType);
            if (!this.zzou.contains(dataSource)) {
                this.zzou.add(dataSource);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder aggregate(com.google.android.gms.fitness.data.DataType dataType, com.google.android.gms.fitness.data.DataType dataType2) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataType, "Attempting to use a null data type");
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzio.contains(dataType), "Cannot add the same data type as aggregated and detailed");
            java.util.List<com.google.android.gms.fitness.data.DataType> aggregatesForInput = com.google.android.gms.fitness.data.DataType.getAggregatesForInput(dataType);
            com.google.android.gms.common.internal.Preconditions.checkArgument(!aggregatesForInput.isEmpty(), "Unsupported input data type specified for aggregation: %s", dataType);
            com.google.android.gms.common.internal.Preconditions.checkArgument(aggregatesForInput.contains(dataType2), "Invalid output aggregate data type specified: %s -> %s", dataType, dataType2);
            if (!this.zzot.contains(dataType)) {
                this.zzot.add(dataType);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder bucketByTime(int i, java.util.concurrent.TimeUnit timeUnit) {
            int i2 = this.zzir;
            com.google.android.gms.common.internal.Preconditions.checkArgument(i2 == 0, "Bucketing strategy already set to %s", java.lang.Integer.valueOf(i2));
            com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0, "Must specify a valid minimum duration: %d", java.lang.Integer.valueOf(i));
            this.zzir = 1;
            this.zzov = timeUnit.toMillis(i);
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder bucketByActivityType(int i, java.util.concurrent.TimeUnit timeUnit) {
            int i2 = this.zzir;
            com.google.android.gms.common.internal.Preconditions.checkArgument(i2 == 0, "Bucketing strategy already set to %s", java.lang.Integer.valueOf(i2));
            com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0, "Must specify a valid minimum duration for an activity segment: %d", java.lang.Integer.valueOf(i));
            this.zzir = 3;
            this.zzov = timeUnit.toMillis(i);
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder bucketByActivityType(int i, java.util.concurrent.TimeUnit timeUnit, com.google.android.gms.fitness.data.DataSource dataSource) {
            int i2 = this.zzir;
            com.google.android.gms.common.internal.Preconditions.checkArgument(i2 == 0, "Bucketing strategy already set to %s", java.lang.Integer.valueOf(i2));
            com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0, "Must specify a valid minimum duration for an activity segment: %d", java.lang.Integer.valueOf(i));
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataSource != null, "Invalid activity data source specified");
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataSource.getDataType().equals(com.google.android.gms.fitness.data.DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", dataSource);
            this.zzow = dataSource;
            this.zzir = 3;
            this.zzov = timeUnit.toMillis(i);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.gms.fitness.request.DataReadRequest.Builder addFilteredDataQualityStandard(int i) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.zzpa.isEmpty(), "Cannot add data quality standard filter when filtering by device.");
            this.zzpb.add(java.lang.Integer.valueOf(i));
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder bucketByActivitySegment(int i, java.util.concurrent.TimeUnit timeUnit) {
            int i2 = this.zzir;
            com.google.android.gms.common.internal.Preconditions.checkArgument(i2 == 0, "Bucketing strategy already set to %s", java.lang.Integer.valueOf(i2));
            com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0, "Must specify a valid minimum duration for an activity segment: %d", java.lang.Integer.valueOf(i));
            this.zzir = 4;
            this.zzov = timeUnit.toMillis(i);
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder bucketByActivitySegment(int i, java.util.concurrent.TimeUnit timeUnit, com.google.android.gms.fitness.data.DataSource dataSource) {
            int i2 = this.zzir;
            com.google.android.gms.common.internal.Preconditions.checkArgument(i2 == 0, "Bucketing strategy already set to %s", java.lang.Integer.valueOf(i2));
            com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0, "Must specify a valid minimum duration for an activity segment: %d", java.lang.Integer.valueOf(i));
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataSource != null, "Invalid activity data source specified");
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataSource.getDataType().equals(com.google.android.gms.fitness.data.DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", dataSource);
            this.zzow = dataSource;
            this.zzir = 4;
            this.zzov = timeUnit.toMillis(i);
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder bucketBySession(int i, java.util.concurrent.TimeUnit timeUnit) {
            int i2 = this.zzir;
            com.google.android.gms.common.internal.Preconditions.checkArgument(i2 == 0, "Bucketing strategy already set to %s", java.lang.Integer.valueOf(i2));
            com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0, "Must specify a valid minimum duration for a session: %d", java.lang.Integer.valueOf(i));
            this.zzir = 2;
            this.zzov = timeUnit.toMillis(i);
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder setTimeRange(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            this.zzib = timeUnit.toMillis(j);
            this.zzic = timeUnit.toMillis(j2);
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder enableServerQueries() {
            this.zzoy = true;
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder setLimit(int i) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0, "Invalid limit %d is specified", java.lang.Integer.valueOf(i));
            this.limit = i;
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest build() {
            com.google.android.gms.common.internal.Preconditions.checkState((this.zzon.isEmpty() && this.zzio.isEmpty() && this.zzou.isEmpty() && this.zzot.isEmpty()) ? false : true, "Must add at least one data source (aggregated or detailed)");
            if (this.zzir != 5) {
                long j = this.zzib;
                com.google.android.gms.common.internal.Preconditions.checkState(j > 0, "Invalid start time: %s", java.lang.Long.valueOf(j));
                long j2 = this.zzic;
                com.google.android.gms.common.internal.Preconditions.checkState(j2 > 0 && j2 > this.zzib, "Invalid end time: %s", java.lang.Long.valueOf(j2));
            }
            boolean z = this.zzou.isEmpty() && this.zzot.isEmpty();
            if (this.zzir == 0) {
                com.google.android.gms.common.internal.Preconditions.checkState(z, "Must specify a valid bucketing strategy while requesting aggregation");
            }
            if (!z) {
                com.google.android.gms.common.internal.Preconditions.checkState(this.zzir != 0, "Must specify a valid bucketing strategy while requesting aggregation");
            }
            return new com.google.android.gms.fitness.request.DataReadRequest(this);
        }
    }

    private DataReadRequest(com.google.android.gms.fitness.request.DataReadRequest.Builder builder) {
        this((java.util.List<com.google.android.gms.fitness.data.DataType>) builder.zzio, (java.util.List<com.google.android.gms.fitness.data.DataSource>) builder.zzon, builder.zzib, builder.zzic, (java.util.List<com.google.android.gms.fitness.data.DataType>) builder.zzot, (java.util.List<com.google.android.gms.fitness.data.DataSource>) builder.zzou, builder.zzir, builder.zzov, builder.zzow, builder.limit, false, builder.zzoy, (com.google.android.gms.internal.fitness.zzbf) null, (java.util.List<com.google.android.gms.fitness.data.Device>) builder.zzpa, (java.util.List<java.lang.Integer>) builder.zzpb, (java.util.List<java.lang.Long>) builder.zzpc, (java.util.List<java.lang.Long>) builder.zzpd);
    }

    public DataReadRequest(com.google.android.gms.fitness.request.DataReadRequest dataReadRequest, com.google.android.gms.internal.fitness.zzbf zzbfVar) {
        this(dataReadRequest.zzio, dataReadRequest.zzon, dataReadRequest.zzib, dataReadRequest.zzic, dataReadRequest.zzot, dataReadRequest.zzou, dataReadRequest.zzir, dataReadRequest.zzov, dataReadRequest.zzow, dataReadRequest.limit, dataReadRequest.zzox, dataReadRequest.zzoy, zzbfVar, dataReadRequest.zzpa, dataReadRequest.zzpb, dataReadRequest.zzpc, dataReadRequest.zzpd);
    }

    private DataReadRequest(java.util.List<com.google.android.gms.fitness.data.DataType> list, java.util.List<com.google.android.gms.fitness.data.DataSource> list2, long j, long j2, java.util.List<com.google.android.gms.fitness.data.DataType> list3, java.util.List<com.google.android.gms.fitness.data.DataSource> list4, int i, long j3, com.google.android.gms.fitness.data.DataSource dataSource, int i2, boolean z, boolean z2, com.google.android.gms.internal.fitness.zzbf zzbfVar, java.util.List<com.google.android.gms.fitness.data.Device> list5, java.util.List<java.lang.Integer> list6, java.util.List<java.lang.Long> list7, java.util.List<java.lang.Long> list8) {
        this(list, list2, j, j2, list3, list4, i, j3, dataSource, i2, z, z2, zzbfVar == null ? null : zzbfVar.asBinder(), list5, list6, list7, list8);
    }

    public long getStartTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzib, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public long getEndTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzic, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public java.util.List<com.google.android.gms.fitness.data.DataType> getDataTypes() {
        return this.zzio;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSource> getDataSources() {
        return this.zzon;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataType> getAggregatedDataTypes() {
        return this.zzot;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSource> getAggregatedDataSources() {
        return this.zzou;
    }

    public int getBucketType() {
        return this.zzir;
    }

    public long getBucketDuration(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzov, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public com.google.android.gms.fitness.data.DataSource getActivityDataSource() {
        return this.zzow;
    }

    public int getLimit() {
        return this.limit;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof com.google.android.gms.fitness.request.DataReadRequest) {
                com.google.android.gms.fitness.request.DataReadRequest dataReadRequest = (com.google.android.gms.fitness.request.DataReadRequest) obj;
                if (this.zzio.equals(dataReadRequest.zzio) && this.zzon.equals(dataReadRequest.zzon) && this.zzib == dataReadRequest.zzib && this.zzic == dataReadRequest.zzic && this.zzir == dataReadRequest.zzir && this.zzou.equals(dataReadRequest.zzou) && this.zzot.equals(dataReadRequest.zzot) && com.google.android.gms.common.internal.Objects.equal(this.zzow, dataReadRequest.zzow) && this.zzov == dataReadRequest.zzov && this.zzoy == dataReadRequest.zzoy && this.limit == dataReadRequest.limit && this.zzox == dataReadRequest.zzox && com.google.android.gms.common.internal.Objects.equal(this.zzoz, dataReadRequest.zzoz) && com.google.android.gms.common.internal.Objects.equal(this.zzpa, dataReadRequest.zzpa) && com.google.android.gms.common.internal.Objects.equal(this.zzpb, dataReadRequest.zzpb)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzir), java.lang.Long.valueOf(this.zzib), java.lang.Long.valueOf(this.zzic));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DataReadRequest{");
        if (!this.zzio.isEmpty()) {
            java.util.Iterator<com.google.android.gms.fitness.data.DataType> it = this.zzio.iterator();
            while (it.hasNext()) {
                sb.append(it.next().zzp());
                sb.append(" ");
            }
        }
        if (!this.zzon.isEmpty()) {
            java.util.Iterator<com.google.android.gms.fitness.data.DataSource> it2 = this.zzon.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next().toDebugString());
                sb.append(" ");
            }
        }
        if (this.zzir != 0) {
            sb.append("bucket by ");
            sb.append(com.google.android.gms.fitness.data.Bucket.zza(this.zzir));
            if (this.zzov > 0) {
                sb.append(" >");
                sb.append(this.zzov);
                sb.append("ms");
            }
            sb.append(": ");
        }
        if (!this.zzot.isEmpty()) {
            java.util.Iterator<com.google.android.gms.fitness.data.DataType> it3 = this.zzot.iterator();
            while (it3.hasNext()) {
                sb.append(it3.next().zzp());
                sb.append(" ");
            }
        }
        if (!this.zzou.isEmpty()) {
            java.util.Iterator<com.google.android.gms.fitness.data.DataSource> it4 = this.zzou.iterator();
            while (it4.hasNext()) {
                sb.append(it4.next().toDebugString());
                sb.append(" ");
            }
        }
        sb.append(java.lang.String.format(java.util.Locale.US, "(%tF %tT - %tF %tT)", java.lang.Long.valueOf(this.zzib), java.lang.Long.valueOf(this.zzib), java.lang.Long.valueOf(this.zzic), java.lang.Long.valueOf(this.zzic)));
        if (this.zzow != null) {
            sb.append("activities: ");
            sb.append(this.zzow.toDebugString());
        }
        if (!this.zzpb.isEmpty()) {
            sb.append("quality: ");
            java.util.Iterator<java.lang.Integer> it5 = this.zzpb.iterator();
            while (it5.hasNext()) {
                sb.append(com.google.android.gms.fitness.data.DataSource.zzd(it5.next().intValue()));
                sb.append(" ");
            }
        }
        if (this.zzoy) {
            sb.append(" +server");
        }
        sb.append("}");
        return sb.toString();
    }

    @java.lang.Deprecated
    public java.util.List<java.lang.Integer> getFilteredDataQualityStandards() {
        return this.zzpb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getDataTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, getDataSources(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzib);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, this.zzic);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 5, getAggregatedDataTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 6, getAggregatedDataSources(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, getBucketType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 8, this.zzov);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, getActivityDataSource(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 10, getLimit());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 12, this.zzox);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 13, this.zzoy);
        com.google.android.gms.internal.fitness.zzbf zzbfVar = this.zzoz;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 14, zzbfVar == null ? null : zzbfVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 16, this.zzpa, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerList(parcel, 17, getFilteredDataQualityStandards(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongList(parcel, 18, this.zzpc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongList(parcel, 19, this.zzpd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
