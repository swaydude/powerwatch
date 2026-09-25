package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzbf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzbf> CREATOR = new com.google.android.gms.internal.location.zzbg();
    private android.app.PendingIntent zzbv;
    private int zzcg;
    private com.google.android.gms.internal.location.zzaj zzcj;
    private com.google.android.gms.internal.location.zzbd zzdl;
    private com.google.android.gms.location.zzx zzdm;
    private com.google.android.gms.location.zzu zzdn;

    zzbf(int i, com.google.android.gms.internal.location.zzbd zzbdVar, android.os.IBinder iBinder, android.app.PendingIntent pendingIntent, android.os.IBinder iBinder2, android.os.IBinder iBinder3) {
        this.zzcg = i;
        this.zzdl = zzbdVar;
        com.google.android.gms.internal.location.zzaj zzalVar = null;
        this.zzdm = iBinder == null ? null : com.google.android.gms.location.zzy.zzc(iBinder);
        this.zzbv = pendingIntent;
        this.zzdn = iBinder2 == null ? null : com.google.android.gms.location.zzv.zzb(iBinder2);
        if (iBinder3 != null && iBinder3 != null) {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzalVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.location.zzaj ? (com.google.android.gms.internal.location.zzaj) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.location.zzal(iBinder3);
        }
        this.zzcj = zzalVar;
    }

    public static com.google.android.gms.internal.location.zzbf zza(com.google.android.gms.location.zzu zzuVar, com.google.android.gms.internal.location.zzaj zzajVar) {
        return new com.google.android.gms.internal.location.zzbf(2, null, null, null, zzuVar.asBinder(), zzajVar != null ? zzajVar.asBinder() : null);
    }

    public static com.google.android.gms.internal.location.zzbf zza(com.google.android.gms.location.zzx zzxVar, com.google.android.gms.internal.location.zzaj zzajVar) {
        return new com.google.android.gms.internal.location.zzbf(2, null, zzxVar.asBinder(), null, null, zzajVar != null ? zzajVar.asBinder() : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzcg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzdl, i, false);
        com.google.android.gms.location.zzx zzxVar = this.zzdm;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzxVar == null ? null : zzxVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzbv, i, false);
        com.google.android.gms.location.zzu zzuVar = this.zzdn;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 5, zzuVar == null ? null : zzuVar.asBinder(), false);
        com.google.android.gms.internal.location.zzaj zzajVar = this.zzcj;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 6, zzajVar != null ? zzajVar.asBinder() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
