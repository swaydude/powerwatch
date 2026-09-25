package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzba extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzba> CREATOR = new com.google.android.gms.fitness.request.zzaz();
    private final com.google.android.gms.fitness.data.Session zzii;
    private final com.google.android.gms.internal.fitness.zzcm zzok;

    zzba(com.google.android.gms.fitness.data.Session session, android.os.IBinder iBinder) {
        this.zzii = session;
        this.zzok = com.google.android.gms.internal.fitness.zzcp.zzj(iBinder);
    }

    public zzba(com.google.android.gms.fitness.data.Session session, com.google.android.gms.internal.fitness.zzcm zzcmVar) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(session.getStartTime(java.util.concurrent.TimeUnit.MILLISECONDS) <= java.lang.System.currentTimeMillis(), "Cannot start a session in the future");
        com.google.android.gms.common.internal.Preconditions.checkArgument(session.isOngoing(), "Cannot start a session which has already ended");
        this.zzii = session;
        this.zzok = zzcmVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.google.android.gms.fitness.request.zzba) && com.google.android.gms.common.internal.Objects.equal(this.zzii, ((com.google.android.gms.fitness.request.zzba) obj).zzii);
        }
        return true;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzii);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SESSION_KEY, this.zzii).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzii, i, false);
        com.google.android.gms.internal.fitness.zzcm zzcmVar = this.zzok;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzcmVar == null ? null : zzcmVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
