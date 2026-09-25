package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzas extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzas> CREATOR = new com.google.android.gms.fitness.request.zzar();
    private final com.google.android.gms.internal.fitness.zzcm zzok;
    private final android.app.PendingIntent zzpk;
    private final com.google.android.gms.fitness.data.zzu zzpt;

    zzas(android.os.IBinder iBinder, android.app.PendingIntent pendingIntent, android.os.IBinder iBinder2) {
        this.zzpt = iBinder == null ? null : com.google.android.gms.fitness.data.zzt.zza(iBinder);
        this.zzpk = pendingIntent;
        this.zzok = com.google.android.gms.internal.fitness.zzcp.zzj(iBinder2);
    }

    public zzas(com.google.android.gms.fitness.data.zzu zzuVar, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.fitness.zzcm zzcmVar) {
        this.zzpt = zzuVar;
        this.zzpk = pendingIntent;
        this.zzok = zzcmVar;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("SensorUnregistrationRequest{%s}", this.zzpt);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.fitness.data.zzu zzuVar = this.zzpt;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 1, zzuVar == null ? null : zzuVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzpk, i, false);
        com.google.android.gms.internal.fitness.zzcm zzcmVar = this.zzok;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzcmVar != null ? zzcmVar.asBinder() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
