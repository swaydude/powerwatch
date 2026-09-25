package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class Subscription extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Subscription> CREATOR = new com.google.android.gms.fitness.data.zzai();
    private final com.google.android.gms.fitness.data.DataType zzhz;
    private final com.google.android.gms.fitness.data.DataSource zzia;
    private final long zzmc;
    private final int zzmd;

    Subscription(com.google.android.gms.fitness.data.DataSource dataSource, com.google.android.gms.fitness.data.DataType dataType, long j, int i) {
        this.zzia = dataSource;
        this.zzhz = dataType;
        this.zzmc = j;
        this.zzmd = i;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class zza {
        private com.google.android.gms.fitness.data.DataType zzhz;
        private com.google.android.gms.fitness.data.DataSource zzia;
        private long zzmc = -1;
        private int zzmd = 2;

        public final com.google.android.gms.fitness.data.Subscription.zza zza(com.google.android.gms.fitness.data.DataSource dataSource) {
            this.zzia = dataSource;
            return this;
        }

        public final com.google.android.gms.fitness.data.Subscription.zza zza(com.google.android.gms.fitness.data.DataType dataType) {
            this.zzhz = dataType;
            return this;
        }

        public final com.google.android.gms.fitness.data.Subscription zzv() {
            com.google.android.gms.fitness.data.DataSource dataSource;
            com.google.android.gms.common.internal.Preconditions.checkState((this.zzia == null && this.zzhz == null) ? false : true, "Must call setDataSource() or setDataType()");
            com.google.android.gms.fitness.data.DataType dataType = this.zzhz;
            com.google.android.gms.common.internal.Preconditions.checkState(dataType == null || (dataSource = this.zzia) == null || dataType.equals(dataSource.getDataType()), "Specified data type is incompatible with specified data source");
            return new com.google.android.gms.fitness.data.Subscription(this);
        }
    }

    private Subscription(com.google.android.gms.fitness.data.Subscription.zza zzaVar) {
        this.zzhz = zzaVar.zzhz;
        this.zzia = zzaVar.zzia;
        this.zzmc = zzaVar.zzmc;
        this.zzmd = zzaVar.zzmd;
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
        if (!(obj instanceof com.google.android.gms.fitness.data.Subscription)) {
            return false;
        }
        com.google.android.gms.fitness.data.Subscription subscription = (com.google.android.gms.fitness.data.Subscription) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzia, subscription.zzia) && com.google.android.gms.common.internal.Objects.equal(this.zzhz, subscription.zzhz) && this.zzmc == subscription.zzmc && this.zzmd == subscription.zzmd;
    }

    public int hashCode() {
        com.google.android.gms.fitness.data.DataSource dataSource = this.zzia;
        return com.google.android.gms.common.internal.Objects.hashCode(dataSource, dataSource, java.lang.Long.valueOf(this.zzmc), java.lang.Integer.valueOf(this.zzmd));
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("dataSource", this.zzia).add("dataType", this.zzhz).add("samplingIntervalMicros", java.lang.Long.valueOf(this.zzmc)).add("accuracyMode", java.lang.Integer.valueOf(this.zzmd)).toString();
    }

    public java.lang.String toDebugString() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.google.android.gms.fitness.data.DataSource dataSource = this.zzia;
        objArr[0] = dataSource == null ? this.zzhz.getName() : dataSource.toDebugString();
        return java.lang.String.format("Subscription{%s}", objArr);
    }

    public final com.google.android.gms.fitness.data.DataType zzu() {
        com.google.android.gms.fitness.data.DataType dataType = this.zzhz;
        return dataType == null ? this.zzia.getDataType() : dataType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getDataSource(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getDataType(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzmc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzmd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
