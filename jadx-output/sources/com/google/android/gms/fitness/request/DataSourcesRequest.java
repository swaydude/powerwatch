package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class DataSourcesRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.DataSourcesRequest> CREATOR = new com.google.android.gms.fitness.request.zzp();
    private final java.util.List<com.google.android.gms.fitness.data.DataType> zzio;
    private final java.util.List<java.lang.Integer> zzpe;
    private final boolean zzpf;
    private final com.google.android.gms.internal.fitness.zzbg zzpg;

    DataSourcesRequest(java.util.List<com.google.android.gms.fitness.data.DataType> list, java.util.List<java.lang.Integer> list2, boolean z, android.os.IBinder iBinder) {
        this.zzio = list;
        this.zzpe = list2;
        this.zzpf = z;
        this.zzpg = com.google.android.gms.internal.fitness.zzbj.zzd(iBinder);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class Builder {
        private com.google.android.gms.fitness.data.DataType[] zzph = new com.google.android.gms.fitness.data.DataType[0];
        private int[] zzpi = {0, 1};
        private boolean zzpf = false;

        public com.google.android.gms.fitness.request.DataSourcesRequest.Builder setDataTypes(com.google.android.gms.fitness.data.DataType... dataTypeArr) {
            this.zzph = dataTypeArr;
            return this;
        }

        public com.google.android.gms.fitness.request.DataSourcesRequest.Builder setDataSourceTypes(int... iArr) {
            this.zzpi = iArr;
            return this;
        }

        public com.google.android.gms.fitness.request.DataSourcesRequest build() {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzph.length > 0, "Must add at least one data type");
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzpi.length > 0, "Must add at least one data source type");
            return new com.google.android.gms.fitness.request.DataSourcesRequest(this);
        }
    }

    private DataSourcesRequest(com.google.android.gms.fitness.request.DataSourcesRequest.Builder builder) {
        this((java.util.List<com.google.android.gms.fitness.data.DataType>) com.google.android.gms.common.util.ArrayUtils.toArrayList(builder.zzph), (java.util.List<java.lang.Integer>) java.util.Arrays.asList(com.google.android.gms.common.util.ArrayUtils.toWrapperArray(builder.zzpi)), false, (com.google.android.gms.internal.fitness.zzbg) null);
    }

    public DataSourcesRequest(com.google.android.gms.fitness.request.DataSourcesRequest dataSourcesRequest, com.google.android.gms.internal.fitness.zzbg zzbgVar) {
        this(dataSourcesRequest.zzio, dataSourcesRequest.zzpe, dataSourcesRequest.zzpf, zzbgVar);
    }

    private DataSourcesRequest(java.util.List<com.google.android.gms.fitness.data.DataType> list, java.util.List<java.lang.Integer> list2, boolean z, com.google.android.gms.internal.fitness.zzbg zzbgVar) {
        this.zzio = list;
        this.zzpe = list2;
        this.zzpf = z;
        this.zzpg = zzbgVar;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataType> getDataTypes() {
        return this.zzio;
    }

    public java.lang.String toString() {
        com.google.android.gms.common.internal.Objects.ToStringHelper toStringHelperAdd = com.google.android.gms.common.internal.Objects.toStringHelper(this).add("dataTypes", this.zzio).add("sourceTypes", this.zzpe);
        if (this.zzpf) {
            toStringHelperAdd.add("includeDbOnlySources", "true");
        }
        return toStringHelperAdd.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getDataTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerList(parcel, 2, this.zzpe, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzpf);
        com.google.android.gms.internal.fitness.zzbg zzbgVar = this.zzpg;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 4, zzbgVar == null ? null : zzbgVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
