package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DataPoint extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.DataPoint> CREATOR = new com.google.android.gms.fitness.data.zzg();
    private final com.google.android.gms.fitness.data.DataSource zzia;
    private long zzit;
    private long zziu;
    private final com.google.android.gms.fitness.data.Value[] zziv;
    private com.google.android.gms.fitness.data.DataSource zziw;
    private long zzix;
    private long zziy;

    public DataPoint(com.google.android.gms.fitness.data.DataSource dataSource, long j, long j2, com.google.android.gms.fitness.data.Value[] valueArr, com.google.android.gms.fitness.data.DataSource dataSource2, long j3, long j4) {
        this.zzia = dataSource;
        this.zziw = dataSource2;
        this.zzit = j;
        this.zziu = j2;
        this.zziv = valueArr;
        this.zzix = j3;
        this.zziy = j4;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class Builder {
        private final com.google.android.gms.fitness.data.DataPoint zziz;
        private boolean zzja;

        private Builder(com.google.android.gms.fitness.data.DataSource dataSource) {
            this.zzja = false;
            this.zziz = com.google.android.gms.fitness.data.DataPoint.create(dataSource);
        }

        public com.google.android.gms.fitness.data.DataPoint build() {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzja, "DataPoint#build should not be called multiple times.");
            this.zzja = true;
            return this.zziz;
        }

        public com.google.android.gms.fitness.data.DataPoint.Builder setTimestamp(long j, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzja, "Builder should not be mutated after calling #build.");
            this.zziz.setTimestamp(j, timeUnit);
            return this;
        }

        public com.google.android.gms.fitness.data.DataPoint.Builder setTimeInterval(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzja, "Builder should not be mutated after calling #build.");
            this.zziz.setTimeInterval(j, j2, timeUnit);
            return this;
        }

        public com.google.android.gms.fitness.data.DataPoint.Builder setActivityField(com.google.android.gms.fitness.data.Field field, java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzja, "Builder should not be mutated after calling #build.");
            this.zziz.getValue(field).setInt(com.google.android.gms.internal.fitness.zzjn.zzp(str));
            return this;
        }

        public com.google.android.gms.fitness.data.DataPoint.Builder setField(com.google.android.gms.fitness.data.Field field, int i) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzja, "Builder should not be mutated after calling #build.");
            this.zziz.getValue(field).setInt(i);
            return this;
        }

        public com.google.android.gms.fitness.data.DataPoint.Builder setField(com.google.android.gms.fitness.data.Field field, float f) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzja, "Builder should not be mutated after calling #build.");
            this.zziz.getValue(field).setFloat(f);
            return this;
        }

        public com.google.android.gms.fitness.data.DataPoint.Builder setField(com.google.android.gms.fitness.data.Field field, java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzja, "Builder should not be mutated after calling #build.");
            this.zziz.getValue(field).setString(str);
            return this;
        }

        public com.google.android.gms.fitness.data.DataPoint.Builder setField(com.google.android.gms.fitness.data.Field field, java.util.Map<java.lang.String, java.lang.Float> map) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzja, "Builder should not be mutated after calling #build.");
            this.zziz.getValue(field).zza(map);
            return this;
        }

        public com.google.android.gms.fitness.data.DataPoint.Builder setFloatValues(float... fArr) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzja, "Builder should not be mutated after calling #build.");
            this.zziz.setFloatValues(fArr);
            return this;
        }

        public com.google.android.gms.fitness.data.DataPoint.Builder setIntValues(int... iArr) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzja, "Builder should not be mutated after calling #build.");
            this.zziz.setIntValues(iArr);
            return this;
        }
    }

    DataPoint(java.util.List<com.google.android.gms.fitness.data.DataSource> list, com.google.android.gms.fitness.data.RawDataPoint rawDataPoint) {
        this(zza(list, rawDataPoint.zzs()), zza(list, rawDataPoint.zzt()), rawDataPoint);
    }

    private DataPoint(com.google.android.gms.fitness.data.DataSource dataSource, com.google.android.gms.fitness.data.DataSource dataSource2, com.google.android.gms.fitness.data.RawDataPoint rawDataPoint) {
        this(dataSource, rawDataPoint.zzq(), rawDataPoint.zzr(), rawDataPoint.zzf(), dataSource2, rawDataPoint.zzh(), rawDataPoint.zzi());
    }

    private static com.google.android.gms.fitness.data.DataSource zza(java.util.List<com.google.android.gms.fitness.data.DataSource> list, int i) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    private DataPoint(com.google.android.gms.fitness.data.DataSource dataSource) {
        this.zzia = (com.google.android.gms.fitness.data.DataSource) com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSource, "Data source cannot be null");
        java.util.List<com.google.android.gms.fitness.data.Field> fields = dataSource.getDataType().getFields();
        this.zziv = new com.google.android.gms.fitness.data.Value[fields.size()];
        java.util.Iterator<com.google.android.gms.fitness.data.Field> it = fields.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.zziv[i] = new com.google.android.gms.fitness.data.Value(it.next().getFormat());
            i++;
        }
    }

    public static com.google.android.gms.fitness.data.DataPoint.Builder builder(com.google.android.gms.fitness.data.DataSource dataSource) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSource, "DataSource should be specified");
        return new com.google.android.gms.fitness.data.DataPoint.Builder(dataSource);
    }

    @java.lang.Deprecated
    public static com.google.android.gms.fitness.data.DataPoint create(com.google.android.gms.fitness.data.DataSource dataSource) {
        return new com.google.android.gms.fitness.data.DataPoint(dataSource);
    }

    public static com.google.android.gms.fitness.data.DataPoint extract(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        return (com.google.android.gms.fitness.data.DataPoint) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.fitness.EXTRA_DATA_POINT", CREATOR);
    }

    @java.lang.Deprecated
    public final com.google.android.gms.fitness.data.DataPoint setTimestamp(long j, java.util.concurrent.TimeUnit timeUnit) {
        this.zzit = timeUnit.toNanos(j);
        return this;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.fitness.data.DataPoint setTimeInterval(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        this.zziu = timeUnit.toNanos(j);
        this.zzit = timeUnit.toNanos(j2);
        return this;
    }

    public final com.google.android.gms.fitness.data.Value zzb(int i) {
        com.google.android.gms.fitness.data.DataType dataType = getDataType();
        com.google.android.gms.common.internal.Preconditions.checkArgument(i >= 0 && i < dataType.getFields().size(), "fieldIndex %s is out of range for %s", java.lang.Integer.valueOf(i), dataType);
        return this.zziv[i];
    }

    public final com.google.android.gms.fitness.data.Value getValue(com.google.android.gms.fitness.data.Field field) {
        return this.zziv[getDataType().indexOf(field)];
    }

    public final com.google.android.gms.fitness.data.Value[] zzf() {
        return this.zziv;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.fitness.data.DataPoint setFloatValues(float... fArr) {
        zzc(fArr.length);
        for (int i = 0; i < fArr.length; i++) {
            this.zziv[i].setFloat(fArr[i]);
        }
        return this;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.fitness.data.DataPoint setIntValues(int... iArr) {
        zzc(iArr.length);
        for (int i = 0; i < iArr.length; i++) {
            this.zziv[i].setInt(iArr[i]);
        }
        return this;
    }

    private final void zzc(int i) {
        java.util.List<com.google.android.gms.fitness.data.Field> fields = getDataType().getFields();
        int size = fields.size();
        com.google.android.gms.common.internal.Preconditions.checkArgument(i == size, "Attempting to insert %s values, but needed %s: %s", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(size), fields);
    }

    public final com.google.android.gms.fitness.data.DataType getDataType() {
        return this.zzia.getDataType();
    }

    public final com.google.android.gms.fitness.data.DataSource getDataSource() {
        return this.zzia;
    }

    public final com.google.android.gms.fitness.data.DataSource getOriginalDataSource() {
        com.google.android.gms.fitness.data.DataSource dataSource = this.zziw;
        return dataSource != null ? dataSource : this.zzia;
    }

    public final com.google.android.gms.fitness.data.DataSource zzg() {
        return this.zziw;
    }

    public final long getTimestamp(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzit, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final long zzh() {
        return this.zzix;
    }

    public final long zzi() {
        return this.zziy;
    }

    public final long getStartTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zziu, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final long getEndTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzit, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final void zzj() {
        com.google.android.gms.common.internal.Preconditions.checkArgument(getDataType().getName().equals(getDataSource().getDataType().getName()), "Conflicting data types found %s vs %s", getDataType(), getDataType());
        com.google.android.gms.common.internal.Preconditions.checkArgument(this.zzit > 0, "Data point does not have the timestamp set: %s", this);
        com.google.android.gms.common.internal.Preconditions.checkArgument(this.zziu <= this.zzit, "Data point with start time greater than end time found: %s", this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.DataPoint)) {
            return false;
        }
        com.google.android.gms.fitness.data.DataPoint dataPoint = (com.google.android.gms.fitness.data.DataPoint) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzia, dataPoint.zzia) && this.zzit == dataPoint.zzit && this.zziu == dataPoint.zziu && java.util.Arrays.equals(this.zziv, dataPoint.zziv) && com.google.android.gms.common.internal.Objects.equal(getOriginalDataSource(), dataPoint.getOriginalDataSource());
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzia, java.lang.Long.valueOf(this.zzit), java.lang.Long.valueOf(this.zziu));
    }

    public final java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.util.Arrays.toString(this.zziv);
        objArr[1] = java.lang.Long.valueOf(this.zziu);
        objArr[2] = java.lang.Long.valueOf(this.zzit);
        objArr[3] = java.lang.Long.valueOf(this.zzix);
        objArr[4] = java.lang.Long.valueOf(this.zziy);
        objArr[5] = this.zzia.toDebugString();
        com.google.android.gms.fitness.data.DataSource dataSource = this.zziw;
        objArr[6] = dataSource != null ? dataSource.toDebugString() : "N/A";
        return java.lang.String.format("DataPoint{%s@[%s, %s,raw=%s,insert=%s](%s %s)}", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getDataSource(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzit);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, this.zziu);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 5, this.zziv, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zziw, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 7, this.zzix);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 8, this.zziy);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
