package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzl extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzl> CREATOR = new com.google.android.gms.fitness.request.zzk();
    private final com.google.android.gms.fitness.data.DataSet zzjd;
    private final com.google.android.gms.internal.fitness.zzcm zzok;
    private final boolean zzos;

    zzl(com.google.android.gms.fitness.data.DataSet dataSet, android.os.IBinder iBinder, boolean z) {
        this.zzjd = dataSet;
        this.zzok = com.google.android.gms.internal.fitness.zzcp.zzj(iBinder);
        this.zzos = z;
    }

    public zzl(com.google.android.gms.fitness.data.DataSet dataSet, com.google.android.gms.internal.fitness.zzcm zzcmVar, boolean z) {
        this.zzjd = dataSet;
        this.zzok = zzcmVar;
        this.zzos = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.google.android.gms.fitness.request.zzl) && com.google.android.gms.common.internal.Objects.equal(this.zzjd, ((com.google.android.gms.fitness.request.zzl) obj).zzjd);
        }
        return true;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzjd);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("dataSet", this.zzjd).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzjd, i, false);
        com.google.android.gms.internal.fitness.zzcm zzcmVar = this.zzok;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzcmVar == null ? null : zzcmVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzos);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
