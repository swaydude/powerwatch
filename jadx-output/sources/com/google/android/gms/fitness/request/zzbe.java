package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbe extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzbe> CREATOR = new com.google.android.gms.fitness.request.zzbd();
    private final com.google.android.gms.internal.fitness.zzcm zzok;
    private final android.app.PendingIntent zzpk;

    zzbe(android.app.PendingIntent pendingIntent, android.os.IBinder iBinder) {
        this.zzpk = pendingIntent;
        this.zzok = com.google.android.gms.internal.fitness.zzcp.zzj(iBinder);
    }

    public zzbe(android.app.PendingIntent pendingIntent, com.google.android.gms.internal.fitness.zzcm zzcmVar) {
        this.zzpk = pendingIntent;
        this.zzok = zzcmVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzpk, i, false);
        com.google.android.gms.internal.fitness.zzcm zzcmVar = this.zzok;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzcmVar == null ? null : zzcmVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add(com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, this.zzpk).toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof com.google.android.gms.fitness.request.zzbe) && com.google.android.gms.common.internal.Objects.equal(this.zzpk, ((com.google.android.gms.fitness.request.zzbe) obj).zzpk);
        }
        return true;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzpk);
    }
}
