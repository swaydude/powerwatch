package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzo> CREATOR = new com.google.android.gms.internal.location.zzp();
    private int zzcg;
    private com.google.android.gms.internal.location.zzm zzch;
    private com.google.android.gms.location.zzr zzci;
    private com.google.android.gms.internal.location.zzaj zzcj;

    zzo(int i, com.google.android.gms.internal.location.zzm zzmVar, android.os.IBinder iBinder, android.os.IBinder iBinder2) {
        this.zzcg = i;
        this.zzch = zzmVar;
        com.google.android.gms.internal.location.zzaj zzalVar = null;
        this.zzci = iBinder == null ? null : com.google.android.gms.location.zzs.zza(iBinder);
        if (iBinder2 != null && iBinder2 != null) {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzalVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.location.zzaj ? (com.google.android.gms.internal.location.zzaj) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.location.zzal(iBinder2);
        }
        this.zzcj = zzalVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzcg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzch, i, false);
        com.google.android.gms.location.zzr zzrVar = this.zzci;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzrVar == null ? null : zzrVar.asBinder(), false);
        com.google.android.gms.internal.location.zzaj zzajVar = this.zzcj;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 4, zzajVar != null ? zzajVar.asBinder() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
