package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbk extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzbk> CREATOR = new com.google.android.gms.fitness.request.zzbj();
    private final com.google.android.gms.internal.fitness.zzcm zzok;
    private com.google.android.gms.fitness.data.Subscription zzqo;
    private final boolean zzqp;

    zzbk(com.google.android.gms.fitness.data.Subscription subscription, boolean z, android.os.IBinder iBinder) {
        this.zzqo = subscription;
        this.zzqp = z;
        this.zzok = com.google.android.gms.internal.fitness.zzcp.zzj(iBinder);
    }

    public zzbk(com.google.android.gms.fitness.data.Subscription subscription, boolean z, com.google.android.gms.internal.fitness.zzcm zzcmVar) {
        this.zzqo = subscription;
        this.zzqp = false;
        this.zzok = zzcmVar;
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("subscription", this.zzqo).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzqo, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zzqp);
        com.google.android.gms.internal.fitness.zzcm zzcmVar = this.zzok;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzcmVar == null ? null : zzcmVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
