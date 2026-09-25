package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class DataUpdateNotification extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final java.lang.String ACTION = "com.google.android.gms.fitness.DATA_UPDATE_NOTIFICATION";
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.DataUpdateNotification> CREATOR = new com.google.android.gms.fitness.data.zzn();
    public static final java.lang.String EXTRA_DATA_UPDATE_NOTIFICATION = "vnd.google.fitness.data_udpate_notification";
    public static final int OPERATION_DELETE = 2;
    public static final int OPERATION_INSERT = 1;
    public static final int OPERATION_UPDATE = 3;
    private final com.google.android.gms.fitness.data.DataType zzhz;
    private final com.google.android.gms.fitness.data.DataSource zzia;
    private final long zzka;
    private final long zzkb;
    private final int zzkc;

    public DataUpdateNotification(long j, long j2, int i, com.google.android.gms.fitness.data.DataSource dataSource, com.google.android.gms.fitness.data.DataType dataType) {
        this.zzka = j;
        this.zzkb = j2;
        this.zzkc = i;
        this.zzia = dataSource;
        this.zzhz = dataType;
    }

    public static com.google.android.gms.fitness.data.DataUpdateNotification getDataUpdateNotification(android.content.Intent intent) {
        return (com.google.android.gms.fitness.data.DataUpdateNotification) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, EXTRA_DATA_UPDATE_NOTIFICATION, CREATOR);
    }

    public long getUpdateStartTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzka, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public long getUpdateEndTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzkb, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public int getOperationType() {
        return this.zzkc;
    }

    public com.google.android.gms.fitness.data.DataSource getDataSource() {
        return this.zzia;
    }

    public com.google.android.gms.fitness.data.DataType getDataType() {
        return this.zzhz;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.DataUpdateNotification)) {
            return false;
        }
        com.google.android.gms.fitness.data.DataUpdateNotification dataUpdateNotification = (com.google.android.gms.fitness.data.DataUpdateNotification) obj;
        return this.zzka == dataUpdateNotification.zzka && this.zzkb == dataUpdateNotification.zzkb && this.zzkc == dataUpdateNotification.zzkc && com.google.android.gms.common.internal.Objects.equal(this.zzia, dataUpdateNotification.zzia) && com.google.android.gms.common.internal.Objects.equal(this.zzhz, dataUpdateNotification.zzhz);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zzka), java.lang.Long.valueOf(this.zzkb), java.lang.Integer.valueOf(this.zzkc), this.zzia, this.zzhz);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("updateStartTimeNanos", java.lang.Long.valueOf(this.zzka)).add("updateEndTimeNanos", java.lang.Long.valueOf(this.zzkb)).add("operationType", java.lang.Integer.valueOf(this.zzkc)).add("dataSource", this.zzia).add("dataType", this.zzhz).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zzka);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzkb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getOperationType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getDataSource(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, getDataType(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
