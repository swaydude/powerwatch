package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzh> CREATOR = new com.google.android.gms.fitness.request.zzg();
    private com.google.android.gms.fitness.data.DataType zzhz;
    private final com.google.android.gms.internal.fitness.zzba zzol;
    private final boolean zzom;

    zzh(android.os.IBinder iBinder, com.google.android.gms.fitness.data.DataType dataType, boolean z) {
        this.zzol = com.google.android.gms.internal.fitness.zzbd.zzb(iBinder);
        this.zzhz = dataType;
        this.zzom = z;
    }

    public zzh(com.google.android.gms.internal.fitness.zzba zzbaVar, com.google.android.gms.fitness.data.DataType dataType, boolean z) {
        this.zzol = zzbaVar;
        this.zzhz = dataType;
        this.zzom = z;
    }

    public final java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.google.android.gms.fitness.data.DataType dataType = this.zzhz;
        objArr[0] = dataType == null ? "null" : dataType.zzp();
        return java.lang.String.format("DailyTotalRequest{%s}", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 1, this.zzol.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzhz, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzom);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
