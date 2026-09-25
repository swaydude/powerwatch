package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class zzbi extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzbi> CREATOR = new com.google.android.gms.fitness.request.zzbh();
    private final com.google.android.gms.internal.fitness.zzcm zzok;
    private final com.google.android.gms.fitness.request.zzaf zzqk;

    zzbi(android.os.IBinder iBinder, android.os.IBinder iBinder2) {
        com.google.android.gms.fitness.request.zzaf zzahVar;
        if (iBinder == null) {
            zzahVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            zzahVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.fitness.request.zzaf ? (com.google.android.gms.fitness.request.zzaf) iInterfaceQueryLocalInterface : new com.google.android.gms.fitness.request.zzah(iBinder);
        }
        this.zzqk = zzahVar;
        this.zzok = com.google.android.gms.internal.fitness.zzcp.zzj(iBinder2);
    }

    public zzbi(com.google.android.gms.fitness.request.zzaf zzafVar, com.google.android.gms.internal.fitness.zzcm zzcmVar) {
        this.zzqk = zzafVar;
        this.zzok = zzcmVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 1, this.zzqk.asBinder(), false);
        com.google.android.gms.internal.fitness.zzcm zzcmVar = this.zzok;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzcmVar == null ? null : zzcmVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
