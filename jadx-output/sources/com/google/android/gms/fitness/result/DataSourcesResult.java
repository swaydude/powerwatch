package com.google.android.gms.fitness.result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class DataSourcesResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.result.DataSourcesResult> CREATOR = new com.google.android.gms.fitness.result.zzd();
    private final java.util.List<com.google.android.gms.fitness.data.DataSource> zzon;
    private final com.google.android.gms.common.api.Status zzqr;

    public DataSourcesResult(java.util.List<com.google.android.gms.fitness.data.DataSource> list, com.google.android.gms.common.api.Status status) {
        this.zzon = java.util.Collections.unmodifiableList(list);
        this.zzqr = status;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSource> getDataSources() {
        return this.zzon;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSource> getDataSources(com.google.android.gms.fitness.data.DataType dataType) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.gms.fitness.data.DataSource dataSource : this.zzon) {
            if (dataSource.getDataType().equals(dataType)) {
                arrayList.add(dataSource);
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zzqr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof com.google.android.gms.fitness.result.DataSourcesResult) {
                com.google.android.gms.fitness.result.DataSourcesResult dataSourcesResult = (com.google.android.gms.fitness.result.DataSourcesResult) obj;
                if (this.zzqr.equals(dataSourcesResult.zzqr) && com.google.android.gms.common.internal.Objects.equal(this.zzon, dataSourcesResult.zzon)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzqr, this.zzon);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("status", this.zzqr).add("dataSources", this.zzon).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getDataSources(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
