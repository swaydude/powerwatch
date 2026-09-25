package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RawDataPoint extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.RawDataPoint> CREATOR = new com.google.android.gms.fitness.data.zzz();
    private final long zziu;
    private final com.google.android.gms.fitness.data.Value[] zziv;
    private final long zzix;
    private final long zziy;
    private final long zzlw;
    private final int zzlx;
    private final int zzly;

    public RawDataPoint(long j, long j2, com.google.android.gms.fitness.data.Value[] valueArr, int i, int i2, long j3, long j4) {
        this.zzlw = j;
        this.zziu = j2;
        this.zzlx = i;
        this.zzly = i2;
        this.zzix = j3;
        this.zziy = j4;
        this.zziv = valueArr;
    }

    RawDataPoint(com.google.android.gms.fitness.data.DataPoint dataPoint, java.util.List<com.google.android.gms.fitness.data.DataSource> list) {
        this.zzlw = dataPoint.getTimestamp(java.util.concurrent.TimeUnit.NANOSECONDS);
        this.zziu = dataPoint.getStartTime(java.util.concurrent.TimeUnit.NANOSECONDS);
        this.zziv = dataPoint.zzf();
        this.zzlx = com.google.android.gms.internal.fitness.zzi.zza(dataPoint.getDataSource(), list);
        this.zzly = com.google.android.gms.internal.fitness.zzi.zza(dataPoint.zzg(), list);
        this.zzix = dataPoint.zzh();
        this.zziy = dataPoint.zzi();
    }

    public final long zzq() {
        return this.zzlw;
    }

    public final long zzr() {
        return this.zziu;
    }

    public final com.google.android.gms.fitness.data.Value[] zzf() {
        return this.zziv;
    }

    public final int zzs() {
        return this.zzlx;
    }

    public final int zzt() {
        return this.zzly;
    }

    public final long zzh() {
        return this.zzix;
    }

    public final long zzi() {
        return this.zziy;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.RawDataPoint)) {
            return false;
        }
        com.google.android.gms.fitness.data.RawDataPoint rawDataPoint = (com.google.android.gms.fitness.data.RawDataPoint) obj;
        return this.zzlw == rawDataPoint.zzlw && this.zziu == rawDataPoint.zziu && java.util.Arrays.equals(this.zziv, rawDataPoint.zziv) && this.zzlx == rawDataPoint.zzlx && this.zzly == rawDataPoint.zzly && this.zzix == rawDataPoint.zzix;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zzlw), java.lang.Long.valueOf(this.zziu));
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "RawDataPoint{%s@[%s, %s](%d,%d)}", java.util.Arrays.toString(this.zziv), java.lang.Long.valueOf(this.zziu), java.lang.Long.valueOf(this.zzlw), java.lang.Integer.valueOf(this.zzlx), java.lang.Integer.valueOf(this.zzly));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zzlw);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zziu);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 3, this.zziv, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzlx);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zzly);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 6, this.zzix);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 7, this.zziy);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
