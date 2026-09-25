package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzai extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzai> CREATOR = new com.google.android.gms.fitness.request.zzal();
    private final com.google.android.gms.fitness.data.DataType zzhz;
    private final com.google.android.gms.internal.fitness.zzcf zzpo;

    zzai(com.google.android.gms.fitness.data.DataType dataType, android.os.IBinder iBinder) {
        this.zzhz = dataType;
        this.zzpo = com.google.android.gms.internal.fitness.zzce.zzg(iBinder);
    }

    public zzai(com.google.android.gms.fitness.data.DataType dataType, com.google.android.gms.internal.fitness.zzcf zzcfVar) {
        this.zzhz = dataType;
        this.zzpo = zzcfVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzhz, i, false);
        com.google.android.gms.internal.fitness.zzcf zzcfVar = this.zzpo;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzcfVar == null ? null : zzcfVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
