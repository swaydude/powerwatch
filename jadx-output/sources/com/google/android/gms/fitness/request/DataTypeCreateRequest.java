package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class DataTypeCreateRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.DataTypeCreateRequest> CREATOR = new com.google.android.gms.fitness.request.zzr();
    private final java.lang.String name;
    private final java.util.List<com.google.android.gms.fitness.data.Field> zzjv;
    private final com.google.android.gms.internal.fitness.zzbl zzpj;

    DataTypeCreateRequest(java.lang.String str, java.util.List<com.google.android.gms.fitness.data.Field> list, android.os.IBinder iBinder) {
        this.name = str;
        this.zzjv = java.util.Collections.unmodifiableList(list);
        this.zzpj = com.google.android.gms.internal.fitness.zzbk.zze(iBinder);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class Builder {
        private java.lang.String name;
        private java.util.List<com.google.android.gms.fitness.data.Field> zzjv = new java.util.ArrayList();

        public com.google.android.gms.fitness.request.DataTypeCreateRequest.Builder setName(java.lang.String str) {
            this.name = str;
            return this;
        }

        public com.google.android.gms.fitness.request.DataTypeCreateRequest.Builder addField(com.google.android.gms.fitness.data.Field field) {
            if (!this.zzjv.contains(field)) {
                this.zzjv.add(field);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.DataTypeCreateRequest.Builder addField(java.lang.String str, int i) {
            com.google.android.gms.common.internal.Preconditions.checkArgument((str == null || str.isEmpty()) ? false : true, "Invalid name specified");
            return addField(com.google.android.gms.fitness.data.Field.zza(str, i));
        }

        public com.google.android.gms.fitness.request.DataTypeCreateRequest build() {
            com.google.android.gms.common.internal.Preconditions.checkState(this.name != null, "Must set the name");
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzjv.isEmpty(), "Must specify the data fields");
            return new com.google.android.gms.fitness.request.DataTypeCreateRequest(this);
        }
    }

    private DataTypeCreateRequest(com.google.android.gms.fitness.request.DataTypeCreateRequest.Builder builder) {
        this(builder.name, (java.util.List<com.google.android.gms.fitness.data.Field>) builder.zzjv, (com.google.android.gms.internal.fitness.zzbl) null);
    }

    public DataTypeCreateRequest(com.google.android.gms.fitness.request.DataTypeCreateRequest dataTypeCreateRequest, com.google.android.gms.internal.fitness.zzbl zzblVar) {
        this(dataTypeCreateRequest.name, dataTypeCreateRequest.zzjv, zzblVar);
    }

    private DataTypeCreateRequest(java.lang.String str, java.util.List<com.google.android.gms.fitness.data.Field> list, com.google.android.gms.internal.fitness.zzbl zzblVar) {
        this.name = str;
        this.zzjv = java.util.Collections.unmodifiableList(list);
        this.zzpj = zzblVar;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.util.List<com.google.android.gms.fitness.data.Field> getFields() {
        return this.zzjv;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != this) {
            if (obj instanceof com.google.android.gms.fitness.request.DataTypeCreateRequest) {
                com.google.android.gms.fitness.request.DataTypeCreateRequest dataTypeCreateRequest = (com.google.android.gms.fitness.request.DataTypeCreateRequest) obj;
                if (com.google.android.gms.common.internal.Objects.equal(this.name, dataTypeCreateRequest.name) && com.google.android.gms.common.internal.Objects.equal(this.zzjv, dataTypeCreateRequest.zzjv)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.name, this.zzjv);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, this.name).add("fields", this.zzjv).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, getFields(), false);
        com.google.android.gms.internal.fitness.zzbl zzblVar = this.zzpj;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzblVar == null ? null : zzblVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
