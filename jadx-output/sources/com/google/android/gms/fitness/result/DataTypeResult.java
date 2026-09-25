package com.google.android.gms.fitness.result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class DataTypeResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.result.DataTypeResult> CREATOR = new com.google.android.gms.fitness.result.zze();
    private final com.google.android.gms.fitness.data.DataType zzhz;
    private final com.google.android.gms.common.api.Status zzqr;

    public DataTypeResult(com.google.android.gms.common.api.Status status, com.google.android.gms.fitness.data.DataType dataType) {
        this.zzqr = status;
        this.zzhz = dataType;
    }

    public static com.google.android.gms.fitness.result.DataTypeResult zzc(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.fitness.result.DataTypeResult(status, null);
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zzqr;
    }

    public com.google.android.gms.fitness.data.DataType getDataType() {
        return this.zzhz;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof com.google.android.gms.fitness.result.DataTypeResult) {
                com.google.android.gms.fitness.result.DataTypeResult dataTypeResult = (com.google.android.gms.fitness.result.DataTypeResult) obj;
                if (this.zzqr.equals(dataTypeResult.zzqr) && com.google.android.gms.common.internal.Objects.equal(this.zzhz, dataTypeResult.zzhz)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzqr, this.zzhz);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("status", this.zzqr).add("dataType", this.zzhz).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getDataType(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
