package com.google.android.gms.fitness.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class FitnessSensorServiceRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.service.FitnessSensorServiceRequest> CREATOR = new com.google.android.gms.fitness.service.zzb();
    public static final int UNSPECIFIED = -1;
    private final com.google.android.gms.fitness.data.DataSource zzia;
    private final com.google.android.gms.fitness.data.zzu zzpt;
    private final long zzqy;
    private final long zzqz;

    FitnessSensorServiceRequest(com.google.android.gms.fitness.data.DataSource dataSource, android.os.IBinder iBinder, long j, long j2) {
        this.zzia = dataSource;
        this.zzpt = com.google.android.gms.fitness.data.zzt.zza(iBinder);
        this.zzqy = j;
        this.zzqz = j2;
    }

    public com.google.android.gms.fitness.data.DataSource getDataSource() {
        return this.zzia;
    }

    public com.google.android.gms.fitness.service.SensorEventDispatcher getDispatcher() {
        return new com.google.android.gms.fitness.service.zzc(this.zzpt);
    }

    public long getSamplingRate(java.util.concurrent.TimeUnit timeUnit) {
        long j = this.zzqy;
        if (j == -1) {
            return -1L;
        }
        return timeUnit.convert(j, java.util.concurrent.TimeUnit.MICROSECONDS);
    }

    public long getBatchInterval(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzqz, java.util.concurrent.TimeUnit.MICROSECONDS);
    }

    public java.lang.String toString() {
        return java.lang.String.format("FitnessSensorServiceRequest{%s}", this.zzia);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getDataSource(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, this.zzpt.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzqy);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, this.zzqz);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.service.FitnessSensorServiceRequest)) {
            return false;
        }
        com.google.android.gms.fitness.service.FitnessSensorServiceRequest fitnessSensorServiceRequest = (com.google.android.gms.fitness.service.FitnessSensorServiceRequest) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzia, fitnessSensorServiceRequest.zzia) && this.zzqy == fitnessSensorServiceRequest.zzqy && this.zzqz == fitnessSensorServiceRequest.zzqz;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzia, java.lang.Long.valueOf(this.zzqy), java.lang.Long.valueOf(this.zzqz));
    }
}
