package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DataSet extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.DataSet> CREATOR = new com.google.android.gms.fitness.data.zzi();
    private final int versionCode;
    private final com.google.android.gms.fitness.data.DataSource zzia;
    private boolean zzis;
    private final java.util.List<com.google.android.gms.fitness.data.DataPoint> zzjb;
    private final java.util.List<com.google.android.gms.fitness.data.DataSource> zzjc;

    DataSet(int i, com.google.android.gms.fitness.data.DataSource dataSource, java.util.List<com.google.android.gms.fitness.data.RawDataPoint> list, java.util.List<com.google.android.gms.fitness.data.DataSource> list2, boolean z) {
        this.zzis = false;
        this.versionCode = i;
        this.zzia = dataSource;
        this.zzis = z;
        this.zzjb = new java.util.ArrayList(list.size());
        this.zzjc = i < 2 ? java.util.Collections.singletonList(dataSource) : list2;
        java.util.Iterator<com.google.android.gms.fitness.data.RawDataPoint> it = list.iterator();
        while (it.hasNext()) {
            this.zzjb.add(new com.google.android.gms.fitness.data.DataPoint(this.zzjc, it.next()));
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class Builder {
        private boolean zzja;
        private final com.google.android.gms.fitness.data.DataSet zzjd;

        private Builder(com.google.android.gms.fitness.data.DataSource dataSource) {
            this.zzja = false;
            this.zzjd = com.google.android.gms.fitness.data.DataSet.create(dataSource);
        }

        public com.google.android.gms.fitness.data.DataSet build() {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzja, "DataSet#build() should only be called once.");
            this.zzja = true;
            return this.zzjd;
        }

        public com.google.android.gms.fitness.data.DataSet.Builder add(com.google.android.gms.fitness.data.DataPoint dataPoint) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzja, "Builder should not be mutated after calling #build.");
            this.zzjd.add(dataPoint);
            return this;
        }

        public com.google.android.gms.fitness.data.DataSet.Builder addAll(java.lang.Iterable<com.google.android.gms.fitness.data.DataPoint> iterable) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzja, "Builder should not be mutated after calling #build.");
            this.zzjd.addAll(iterable);
            return this;
        }
    }

    private DataSet(com.google.android.gms.fitness.data.DataSource dataSource) {
        this.zzis = false;
        this.versionCode = 3;
        com.google.android.gms.fitness.data.DataSource dataSource2 = (com.google.android.gms.fitness.data.DataSource) com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSource);
        this.zzia = dataSource2;
        this.zzjb = new java.util.ArrayList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.zzjc = arrayList;
        arrayList.add(dataSource2);
    }

    public DataSet(com.google.android.gms.fitness.data.RawDataSet rawDataSet, java.util.List<com.google.android.gms.fitness.data.DataSource> list) {
        this.zzis = false;
        this.versionCode = 3;
        this.zzia = list.get(rawDataSet.zzlx);
        this.zzjc = list;
        this.zzis = rawDataSet.zzis;
        java.util.List<com.google.android.gms.fitness.data.RawDataPoint> list2 = rawDataSet.zzlz;
        this.zzjb = new java.util.ArrayList(list2.size());
        java.util.Iterator<com.google.android.gms.fitness.data.RawDataPoint> it = list2.iterator();
        while (it.hasNext()) {
            this.zzjb.add(new com.google.android.gms.fitness.data.DataPoint(this.zzjc, it.next()));
        }
    }

    public static com.google.android.gms.fitness.data.DataSet.Builder builder(com.google.android.gms.fitness.data.DataSource dataSource) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSource, "DataSource should be specified");
        return new com.google.android.gms.fitness.data.DataSet.Builder(dataSource);
    }

    public static com.google.android.gms.fitness.data.DataSet create(com.google.android.gms.fitness.data.DataSource dataSource) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSource, "DataSource should be specified");
        return new com.google.android.gms.fitness.data.DataSet(dataSource);
    }

    public final com.google.android.gms.fitness.data.DataPoint createDataPoint() {
        return com.google.android.gms.fitness.data.DataPoint.create(this.zzia);
    }

    @java.lang.Deprecated
    public final void add(com.google.android.gms.fitness.data.DataPoint dataPoint) {
        com.google.android.gms.fitness.data.DataSource dataSource = dataPoint.getDataSource();
        com.google.android.gms.common.internal.Preconditions.checkArgument(dataSource.getStreamIdentifier().equals(this.zzia.getStreamIdentifier()), "Conflicting data sources found %s vs %s", dataSource, this.zzia);
        dataPoint.zzj();
        zzb(dataPoint);
        zza(dataPoint);
    }

    @java.lang.Deprecated
    private final void zza(com.google.android.gms.fitness.data.DataPoint dataPoint) {
        this.zzjb.add(dataPoint);
        com.google.android.gms.fitness.data.DataSource originalDataSource = dataPoint.getOriginalDataSource();
        if (originalDataSource == null || this.zzjc.contains(originalDataSource)) {
            return;
        }
        this.zzjc.add(originalDataSource);
    }

    @java.lang.Deprecated
    public final void addAll(java.lang.Iterable<com.google.android.gms.fitness.data.DataPoint> iterable) {
        java.util.Iterator<com.google.android.gms.fitness.data.DataPoint> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    @java.lang.Deprecated
    public final void zza(java.lang.Iterable<com.google.android.gms.fitness.data.DataPoint> iterable) {
        java.util.Iterator<com.google.android.gms.fitness.data.DataPoint> it = iterable.iterator();
        while (it.hasNext()) {
            zza(it.next());
        }
    }

    public final com.google.android.gms.fitness.data.DataSource getDataSource() {
        return this.zzia;
    }

    public final com.google.android.gms.fitness.data.DataType getDataType() {
        return this.zzia.getDataType();
    }

    public final java.util.List<com.google.android.gms.fitness.data.DataPoint> getDataPoints() {
        return java.util.Collections.unmodifiableList(this.zzjb);
    }

    public final boolean isEmpty() {
        return this.zzjb.isEmpty();
    }

    public final boolean zze() {
        return this.zzis;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.DataSet)) {
            return false;
        }
        com.google.android.gms.fitness.data.DataSet dataSet = (com.google.android.gms.fitness.data.DataSet) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzia, dataSet.zzia) && com.google.android.gms.common.internal.Objects.equal(this.zzjb, dataSet.zzjb) && this.zzis == dataSet.zzis;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzia);
    }

    public final java.lang.String toString() {
        java.util.List<com.google.android.gms.fitness.data.RawDataPoint> listZzk = zzk();
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this.zzia.toDebugString();
        java.lang.Object obj = listZzk;
        if (this.zzjb.size() >= 10) {
            obj = java.lang.String.format(java.util.Locale.US, "%d data points, first 5: %s", java.lang.Integer.valueOf(this.zzjb.size()), listZzk.subList(0, 5));
        }
        objArr[1] = obj;
        return java.lang.String.format(locale, "DataSet{%s %s}", objArr);
    }

    public static void zzb(com.google.android.gms.fitness.data.DataPoint dataPoint) throws java.lang.IllegalArgumentException {
        double dAsFloat;
        java.lang.String strConcat = "DataPoint out of range";
        if (com.google.android.gms.fitness.data.zzl.zzb(dataPoint.getDataType().getName()) == null) {
            strConcat = null;
            break;
        }
        com.google.android.gms.fitness.data.DataType dataType = dataPoint.getDataType();
        int i = 0;
        while (true) {
            if (i < dataType.getFields().size()) {
                java.lang.String name = dataType.getFields().get(i).getName();
                if (!dataPoint.zzb(i).isSet()) {
                    if (!java.lang.Boolean.TRUE.equals(dataType.getFields().get(i).isOptional()) && !com.google.android.gms.fitness.data.zzah.zzmi.contains(name)) {
                        strConcat = java.lang.String.valueOf(name).concat(" not set");
                        break;
                    }
                    i++;
                } else {
                    double format = dataType.getFields().get(i).getFormat();
                    if (format == 1.0d) {
                        dAsFloat = dataPoint.zzb(i).asInt();
                    } else {
                        if (format == 2.0d) {
                            dAsFloat = dataPoint.zzb(i).asFloat();
                        } else {
                            continue;
                        }
                        i++;
                    }
                    com.google.android.gms.fitness.data.zzaj zzajVarZzj = com.google.android.gms.fitness.data.zzah.zzw().zzj(name);
                    if (zzajVarZzj != null && !zzajVarZzj.zza(dAsFloat)) {
                        strConcat = "Field out of range";
                        break;
                    }
                    com.google.android.gms.fitness.data.zzaj zzajVarZza = com.google.android.gms.fitness.data.zzah.zzw().zza(dataType.getName(), name);
                    if (zzajVarZza != null) {
                        long endTime = dataPoint.getEndTime(java.util.concurrent.TimeUnit.NANOSECONDS) - dataPoint.getStartTime(java.util.concurrent.TimeUnit.NANOSECONDS);
                        if (endTime == 0) {
                            if (dAsFloat != 0.0d) {
                                break;
                            } else {
                                break;
                            }
                        } else if (!zzajVarZza.zza(dAsFloat / endTime)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i++;
                }
            }
            strConcat = null;
            break;
        }
        if (strConcat == null) {
            return;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(dataPoint);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 20);
        sb.append("Invalid data point: ");
        sb.append(strValueOf);
        android.util.Log.w("Fitness", sb.toString());
        throw new java.lang.IllegalArgumentException(strConcat);
    }

    private final java.util.List<com.google.android.gms.fitness.data.RawDataPoint> zzk() {
        return zza(this.zzjc);
    }

    final java.util.List<com.google.android.gms.fitness.data.RawDataPoint> zza(java.util.List<com.google.android.gms.fitness.data.DataSource> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.zzjb.size());
        java.util.Iterator<com.google.android.gms.fitness.data.DataPoint> it = this.zzjb.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.google.android.gms.fitness.data.RawDataPoint(it.next(), list));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getDataSource(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeList(parcel, 3, zzk(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 4, this.zzjc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zzis);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.versionCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
