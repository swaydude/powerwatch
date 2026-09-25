package com.google.android.gms.fitness.result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class DailyTotalResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.result.DailyTotalResult> CREATOR = new com.google.android.gms.fitness.result.zzb();
    private final com.google.android.gms.fitness.data.DataSet zzjd;
    private final com.google.android.gms.common.api.Status zzqr;

    DailyTotalResult(com.google.android.gms.common.api.Status status, com.google.android.gms.fitness.data.DataSet dataSet) {
        this.zzqr = status;
        this.zzjd = dataSet;
    }

    private DailyTotalResult(com.google.android.gms.fitness.data.DataSet dataSet, com.google.android.gms.common.api.Status status) {
        this.zzqr = status;
        this.zzjd = dataSet;
    }

    public static com.google.android.gms.fitness.result.DailyTotalResult zza(com.google.android.gms.common.api.Status status, com.google.android.gms.fitness.data.DataType dataType) {
        return new com.google.android.gms.fitness.result.DailyTotalResult(com.google.android.gms.fitness.data.DataSet.create(new com.google.android.gms.fitness.data.DataSource.Builder().setType(1).setDataType(dataType).build()), status);
    }

    public com.google.android.gms.fitness.data.DataSet getTotal() {
        return this.zzjd;
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zzqr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof com.google.android.gms.fitness.result.DailyTotalResult) {
                com.google.android.gms.fitness.result.DailyTotalResult dailyTotalResult = (com.google.android.gms.fitness.result.DailyTotalResult) obj;
                if (this.zzqr.equals(dailyTotalResult.zzqr) && com.google.android.gms.common.internal.Objects.equal(this.zzjd, dailyTotalResult.zzjd)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzqr, this.zzjd);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("status", this.zzqr).add("dataPoint", this.zzjd).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getTotal(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
