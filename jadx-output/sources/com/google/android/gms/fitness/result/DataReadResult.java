package com.google.android.gms.fitness.result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class DataReadResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.result.DataReadResult> CREATOR = new com.google.android.gms.fitness.result.zzc();
    private final java.util.List<com.google.android.gms.fitness.data.DataSet> zziq;
    private final java.util.List<com.google.android.gms.fitness.data.DataSource> zzjc;
    private final com.google.android.gms.common.api.Status zzqr;
    private final java.util.List<com.google.android.gms.fitness.data.Bucket> zzqs;
    private int zzqt;

    DataReadResult(java.util.List<com.google.android.gms.fitness.data.RawDataSet> list, com.google.android.gms.common.api.Status status, java.util.List<com.google.android.gms.fitness.data.RawBucket> list2, int i, java.util.List<com.google.android.gms.fitness.data.DataSource> list3) {
        this.zzqr = status;
        this.zzqt = i;
        this.zzjc = list3;
        this.zziq = new java.util.ArrayList(list.size());
        java.util.Iterator<com.google.android.gms.fitness.data.RawDataSet> it = list.iterator();
        while (it.hasNext()) {
            this.zziq.add(new com.google.android.gms.fitness.data.DataSet(it.next(), list3));
        }
        this.zzqs = new java.util.ArrayList(list2.size());
        java.util.Iterator<com.google.android.gms.fitness.data.RawBucket> it2 = list2.iterator();
        while (it2.hasNext()) {
            this.zzqs.add(new com.google.android.gms.fitness.data.Bucket(it2.next(), list3));
        }
    }

    private DataReadResult(java.util.List<com.google.android.gms.fitness.data.DataSet> list, java.util.List<com.google.android.gms.fitness.data.Bucket> list2, com.google.android.gms.common.api.Status status) {
        this.zziq = list;
        this.zzqr = status;
        this.zzqs = list2;
        this.zzqt = 1;
        this.zzjc = new java.util.ArrayList();
    }

    public static com.google.android.gms.fitness.result.DataReadResult zza(com.google.android.gms.common.api.Status status, java.util.List<com.google.android.gms.fitness.data.DataType> list, java.util.List<com.google.android.gms.fitness.data.DataSource> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.google.android.gms.fitness.data.DataSource> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.android.gms.fitness.data.DataSet.create(it.next()));
        }
        java.util.Iterator<com.google.android.gms.fitness.data.DataType> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(com.google.android.gms.fitness.data.DataSet.create(new com.google.android.gms.fitness.data.DataSource.Builder().setType(1).setDataType(it2.next()).setName("Default").build()));
        }
        return new com.google.android.gms.fitness.result.DataReadResult(arrayList, java.util.Collections.emptyList(), status);
    }

    public com.google.android.gms.fitness.data.DataSet getDataSet(com.google.android.gms.fitness.data.DataType dataType) {
        for (com.google.android.gms.fitness.data.DataSet dataSet : this.zziq) {
            if (dataType.equals(dataSet.getDataType())) {
                return dataSet;
            }
        }
        return com.google.android.gms.fitness.data.DataSet.create(new com.google.android.gms.fitness.data.DataSource.Builder().setType(1).setDataType(dataType).build());
    }

    public com.google.android.gms.fitness.data.DataSet getDataSet(com.google.android.gms.fitness.data.DataSource dataSource) {
        for (com.google.android.gms.fitness.data.DataSet dataSet : this.zziq) {
            if (dataSource.equals(dataSet.getDataSource())) {
                return dataSet;
            }
        }
        return com.google.android.gms.fitness.data.DataSet.create(dataSource);
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSet> getDataSets() {
        return this.zziq;
    }

    public java.util.List<com.google.android.gms.fitness.data.Bucket> getBuckets() {
        return this.zzqs;
    }

    public final int zzae() {
        return this.zzqt;
    }

    public final void zzb(com.google.android.gms.fitness.result.DataReadResult dataReadResult) {
        java.util.Iterator<com.google.android.gms.fitness.data.DataSet> it = dataReadResult.getDataSets().iterator();
        while (it.hasNext()) {
            zza(it.next(), this.zziq);
        }
        for (com.google.android.gms.fitness.data.Bucket bucket : dataReadResult.getBuckets()) {
            java.util.Iterator<com.google.android.gms.fitness.data.Bucket> it2 = this.zzqs.iterator();
            while (true) {
                if (it2.hasNext()) {
                    com.google.android.gms.fitness.data.Bucket next = it2.next();
                    if (next.zza(bucket)) {
                        java.util.Iterator<com.google.android.gms.fitness.data.DataSet> it3 = bucket.getDataSets().iterator();
                        while (it3.hasNext()) {
                            zza(it3.next(), next.getDataSets());
                        }
                        break;
                    }
                } else {
                    this.zzqs.add(bucket);
                    break;
                }
            }
        }
    }

    private static void zza(com.google.android.gms.fitness.data.DataSet dataSet, java.util.List<com.google.android.gms.fitness.data.DataSet> list) {
        for (com.google.android.gms.fitness.data.DataSet dataSet2 : list) {
            if (dataSet2.getDataSource().equals(dataSet.getDataSource())) {
                dataSet2.zza(dataSet.getDataPoints());
                return;
            }
        }
        list.add(dataSet);
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zzqr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof com.google.android.gms.fitness.result.DataReadResult) {
                com.google.android.gms.fitness.result.DataReadResult dataReadResult = (com.google.android.gms.fitness.result.DataReadResult) obj;
                if (this.zzqr.equals(dataReadResult.zzqr) && com.google.android.gms.common.internal.Objects.equal(this.zziq, dataReadResult.zziq) && com.google.android.gms.common.internal.Objects.equal(this.zzqs, dataReadResult.zzqs)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzqr, this.zziq, this.zzqs);
    }

    public java.lang.String toString() {
        java.lang.Object string;
        java.lang.Object string2;
        com.google.android.gms.common.internal.Objects.ToStringHelper toStringHelperAdd = com.google.android.gms.common.internal.Objects.toStringHelper(this).add("status", this.zzqr);
        if (this.zziq.size() > 5) {
            int size = this.zziq.size();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(21);
            sb.append(size);
            sb.append(" data sets");
            string = sb.toString();
        } else {
            string = this.zziq;
        }
        com.google.android.gms.common.internal.Objects.ToStringHelper toStringHelperAdd2 = toStringHelperAdd.add("dataSets", string);
        if (this.zzqs.size() > 5) {
            int size2 = this.zzqs.size();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(19);
            sb2.append(size2);
            sb2.append(" buckets");
            string2 = sb2.toString();
        } else {
            string2 = this.zzqs;
        }
        return toStringHelperAdd2.add("buckets", string2).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        java.util.ArrayList arrayList = new java.util.ArrayList(this.zziq.size());
        java.util.Iterator<com.google.android.gms.fitness.data.DataSet> it = this.zziq.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.google.android.gms.fitness.data.RawDataSet(it.next(), this.zzjc));
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeList(parcel, 1, arrayList, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getStatus(), i, false);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.zzqs.size());
        java.util.Iterator<com.google.android.gms.fitness.data.Bucket> it2 = this.zzqs.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new com.google.android.gms.fitness.data.RawBucket(it2.next(), this.zzjc));
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeList(parcel, 3, arrayList2, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zzqt);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 6, this.zzjc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
