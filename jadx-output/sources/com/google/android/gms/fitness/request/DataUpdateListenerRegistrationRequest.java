package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class DataUpdateListenerRegistrationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest> CREATOR = new com.google.android.gms.fitness.request.zzv();
    private com.google.android.gms.fitness.data.DataType zzhz;
    private com.google.android.gms.fitness.data.DataSource zzia;
    private final com.google.android.gms.internal.fitness.zzcm zzok;
    private final android.app.PendingIntent zzpk;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class Builder {
        private com.google.android.gms.fitness.data.DataType zzhz;
        private com.google.android.gms.fitness.data.DataSource zzia;
        private android.app.PendingIntent zzpk;

        public com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest.Builder setDataSource(com.google.android.gms.fitness.data.DataSource dataSource) throws java.lang.NullPointerException {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSource);
            this.zzia = dataSource;
            return this;
        }

        public com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest.Builder setDataType(com.google.android.gms.fitness.data.DataType dataType) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataType);
            this.zzhz = dataType;
            return this;
        }

        public com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest.Builder setPendingIntent(android.app.PendingIntent pendingIntent) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
            this.zzpk = pendingIntent;
            return this;
        }

        public com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest build() {
            com.google.android.gms.common.internal.Preconditions.checkState((this.zzia == null && this.zzhz == null) ? false : true, "Set either dataSource or dataTYpe");
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzpk, "pendingIntent must be set");
            return new com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest(this);
        }
    }

    public DataUpdateListenerRegistrationRequest(com.google.android.gms.fitness.data.DataSource dataSource, com.google.android.gms.fitness.data.DataType dataType, android.app.PendingIntent pendingIntent, android.os.IBinder iBinder) {
        this.zzia = dataSource;
        this.zzhz = dataType;
        this.zzpk = pendingIntent;
        this.zzok = com.google.android.gms.internal.fitness.zzcp.zzj(iBinder);
    }

    public DataUpdateListenerRegistrationRequest(com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest, android.os.IBinder iBinder) {
        this(dataUpdateListenerRegistrationRequest.zzia, dataUpdateListenerRegistrationRequest.zzhz, dataUpdateListenerRegistrationRequest.zzpk, iBinder);
    }

    private DataUpdateListenerRegistrationRequest(com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest.Builder builder) {
        this(builder.zzia, builder.zzhz, builder.zzpk, null);
    }

    public com.google.android.gms.fitness.data.DataSource getDataSource() {
        return this.zzia;
    }

    public com.google.android.gms.fitness.data.DataType getDataType() {
        return this.zzhz;
    }

    public android.app.PendingIntent getIntent() {
        return this.zzpk;
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("dataSource", this.zzia).add("dataType", this.zzhz).add(com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, this.zzpk).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getDataSource(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getDataType(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getIntent(), i, false);
        com.google.android.gms.internal.fitness.zzcm zzcmVar = this.zzok;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 4, zzcmVar == null ? null : zzcmVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest) {
                com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest = (com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest) obj;
                if (com.google.android.gms.common.internal.Objects.equal(this.zzia, dataUpdateListenerRegistrationRequest.zzia) && com.google.android.gms.common.internal.Objects.equal(this.zzhz, dataUpdateListenerRegistrationRequest.zzhz) && com.google.android.gms.common.internal.Objects.equal(this.zzpk, dataUpdateListenerRegistrationRequest.zzpk)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzia, this.zzhz, this.zzpk);
    }
}
