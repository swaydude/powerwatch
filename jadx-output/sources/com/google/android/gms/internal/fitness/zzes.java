package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzes extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.fitness.zzes> CREATOR = new com.google.android.gms.internal.fitness.zzev();
    private final com.google.android.gms.fitness.data.DataSource zzia;

    public zzes(com.google.android.gms.fitness.data.DataSource dataSource) {
        this.zzia = dataSource;
    }

    public final com.google.android.gms.fitness.data.DataSource getDataSource() {
        return this.zzia;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("ApplicationUnregistrationRequest{%s}", this.zzia);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzia, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
