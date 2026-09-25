package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzab extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzab> CREATOR = new com.google.android.gms.fitness.request.zzaa();
    private final com.google.android.gms.internal.fitness.zzcm zzok;

    zzab(android.os.IBinder iBinder) {
        this.zzok = com.google.android.gms.internal.fitness.zzcp.zzj(iBinder);
    }

    public zzab(com.google.android.gms.internal.fitness.zzcm zzcmVar) {
        this.zzok = zzcmVar;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("DisableFitRequest", new java.lang.Object[0]);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 1, this.zzok.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
