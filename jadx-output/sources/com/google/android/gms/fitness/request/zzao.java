package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzao extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzao> CREATOR = new com.google.android.gms.fitness.request.zzap();
    private com.google.android.gms.fitness.data.DataType zzhz;
    private com.google.android.gms.fitness.data.DataSource zzia;
    private final long zzmc;
    private final int zzmd;
    private final com.google.android.gms.internal.fitness.zzcm zzok;
    private final android.app.PendingIntent zzpk;
    private com.google.android.gms.fitness.data.zzu zzpt;
    private final long zzpu;
    private final long zzpv;
    private final long zzpw;
    private final java.util.List<com.google.android.gms.common.internal.ClientIdentity> zzpx;

    zzao(com.google.android.gms.fitness.data.DataSource dataSource, com.google.android.gms.fitness.data.DataType dataType, android.os.IBinder iBinder, long j, long j2, android.app.PendingIntent pendingIntent, long j3, int i, long j4, android.os.IBinder iBinder2) {
        this.zzia = dataSource;
        this.zzhz = dataType;
        this.zzpt = iBinder == null ? null : com.google.android.gms.fitness.data.zzt.zza(iBinder);
        this.zzmc = j;
        this.zzpv = j3;
        this.zzpu = j2;
        this.zzpk = pendingIntent;
        this.zzmd = i;
        this.zzpx = java.util.Collections.emptyList();
        this.zzpw = j4;
        this.zzok = com.google.android.gms.internal.fitness.zzcp.zzj(iBinder2);
    }

    public zzao(com.google.android.gms.fitness.request.SensorRequest sensorRequest, com.google.android.gms.fitness.data.zzu zzuVar, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.fitness.zzcm zzcmVar) {
        this(sensorRequest.getDataSource(), sensorRequest.getDataType(), zzuVar, pendingIntent, sensorRequest.getSamplingRate(java.util.concurrent.TimeUnit.MICROSECONDS), sensorRequest.getFastestRate(java.util.concurrent.TimeUnit.MICROSECONDS), sensorRequest.getMaxDeliveryLatency(java.util.concurrent.TimeUnit.MICROSECONDS), sensorRequest.getAccuracyMode(), java.util.Collections.emptyList(), sensorRequest.zzab(), zzcmVar);
    }

    private zzao(com.google.android.gms.fitness.data.DataSource dataSource, com.google.android.gms.fitness.data.DataType dataType, com.google.android.gms.fitness.data.zzu zzuVar, android.app.PendingIntent pendingIntent, long j, long j2, long j3, int i, java.util.List<com.google.android.gms.common.internal.ClientIdentity> list, long j4, com.google.android.gms.internal.fitness.zzcm zzcmVar) {
        this.zzia = dataSource;
        this.zzhz = dataType;
        this.zzpt = zzuVar;
        this.zzpk = pendingIntent;
        this.zzmc = j;
        this.zzpv = j2;
        this.zzpu = j3;
        this.zzmd = i;
        this.zzpx = list;
        this.zzpw = j4;
        this.zzok = zzcmVar;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}", this.zzhz, this.zzia, java.lang.Long.valueOf(this.zzmc), java.lang.Long.valueOf(this.zzpv), java.lang.Long.valueOf(this.zzpu));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzia, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzhz, i, false);
        com.google.android.gms.fitness.data.zzu zzuVar = this.zzpt;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzuVar == null ? null : zzuVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 6, this.zzmc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 7, this.zzpu);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzpk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 9, this.zzpv);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 10, this.zzmd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 12, this.zzpw);
        com.google.android.gms.internal.fitness.zzcm zzcmVar = this.zzok;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 13, zzcmVar != null ? zzcmVar.asBinder() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof com.google.android.gms.fitness.request.zzao) {
                com.google.android.gms.fitness.request.zzao zzaoVar = (com.google.android.gms.fitness.request.zzao) obj;
                if (com.google.android.gms.common.internal.Objects.equal(this.zzia, zzaoVar.zzia) && com.google.android.gms.common.internal.Objects.equal(this.zzhz, zzaoVar.zzhz) && com.google.android.gms.common.internal.Objects.equal(this.zzpt, zzaoVar.zzpt) && this.zzmc == zzaoVar.zzmc && this.zzpv == zzaoVar.zzpv && this.zzpu == zzaoVar.zzpu && this.zzmd == zzaoVar.zzmd) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzia, this.zzhz, this.zzpt, java.lang.Long.valueOf(this.zzmc), java.lang.Long.valueOf(this.zzpv), java.lang.Long.valueOf(this.zzpu), java.lang.Integer.valueOf(this.zzmd));
    }
}
