package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class StartBleScanRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.StartBleScanRequest> CREATOR = new com.google.android.gms.fitness.request.zzbg();
    private final java.util.List<com.google.android.gms.fitness.data.DataType> zzio;
    private final com.google.android.gms.internal.fitness.zzcm zzok;
    private final com.google.android.gms.fitness.request.zzaf zzqk;
    private final int zzql;
    private final com.google.android.gms.fitness.request.BleScanCallback zzqm;

    StartBleScanRequest(java.util.List<com.google.android.gms.fitness.data.DataType> list, android.os.IBinder iBinder, int i, android.os.IBinder iBinder2) {
        com.google.android.gms.fitness.request.zzaf zzahVar;
        this.zzio = list;
        if (iBinder == null) {
            zzahVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            zzahVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.fitness.request.zzaf ? (com.google.android.gms.fitness.request.zzaf) iInterfaceQueryLocalInterface : new com.google.android.gms.fitness.request.zzah(iBinder);
        }
        this.zzqk = zzahVar;
        this.zzql = i;
        this.zzok = com.google.android.gms.internal.fitness.zzcp.zzj(iBinder2);
        this.zzqm = null;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class Builder {
        private com.google.android.gms.fitness.data.DataType[] zzph = new com.google.android.gms.fitness.data.DataType[0];
        private int zzql = 10;
        private com.google.android.gms.fitness.request.BleScanCallback zzqn;

        public com.google.android.gms.fitness.request.StartBleScanRequest.Builder setDataTypes(com.google.android.gms.fitness.data.DataType... dataTypeArr) {
            this.zzph = dataTypeArr;
            return this;
        }

        public com.google.android.gms.fitness.request.StartBleScanRequest.Builder setBleScanCallback(com.google.android.gms.fitness.request.BleScanCallback bleScanCallback) {
            this.zzqn = bleScanCallback;
            return this;
        }

        public com.google.android.gms.fitness.request.StartBleScanRequest.Builder setTimeoutSecs(int i) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0, "Stop time must be greater than zero");
            com.google.android.gms.common.internal.Preconditions.checkArgument(i <= 60, "Stop time must be less than 1 minute");
            this.zzql = i;
            return this;
        }

        public com.google.android.gms.fitness.request.StartBleScanRequest build() {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzqn != null, "Must set BleScanCallback");
            return new com.google.android.gms.fitness.request.StartBleScanRequest(com.google.android.gms.common.util.ArrayUtils.toArrayList(this.zzph), this.zzqn, this.zzql);
        }
    }

    private StartBleScanRequest(java.util.List<com.google.android.gms.fitness.data.DataType> list, com.google.android.gms.fitness.request.BleScanCallback bleScanCallback, int i) {
        this.zzio = list;
        this.zzqk = null;
        this.zzql = i;
        this.zzok = null;
        this.zzqm = bleScanCallback;
    }

    public StartBleScanRequest(java.util.List<com.google.android.gms.fitness.data.DataType> list, com.google.android.gms.fitness.request.zzaf zzafVar, int i, com.google.android.gms.internal.fitness.zzcm zzcmVar) {
        this.zzio = list;
        this.zzqk = zzafVar;
        this.zzql = i;
        this.zzok = zzcmVar;
        this.zzqm = null;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataType> getDataTypes() {
        return java.util.Collections.unmodifiableList(this.zzio);
    }

    public int getTimeoutSecs() {
        return this.zzql;
    }

    public final com.google.android.gms.fitness.request.BleScanCallback zzad() {
        return this.zzqm;
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("dataTypes", this.zzio).add("timeoutSecs", java.lang.Integer.valueOf(this.zzql)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getDataTypes(), false);
        com.google.android.gms.fitness.request.zzaf zzafVar = this.zzqk;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzafVar == null ? null : zzafVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getTimeoutSecs());
        com.google.android.gms.internal.fitness.zzcm zzcmVar = this.zzok;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 4, zzcmVar != null ? zzcmVar.asBinder() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
