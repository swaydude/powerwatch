package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class zzag extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzag> CREATOR = new com.google.android.gms.fitness.request.zzaj();
    private final com.google.android.gms.internal.fitness.zzep zzpn;

    zzag(android.os.IBinder iBinder) {
        this.zzpn = com.google.android.gms.internal.fitness.zzeo.zzk(iBinder);
    }

    public zzag(com.google.android.gms.internal.fitness.zzep zzepVar) {
        this.zzpn = zzepVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 1, this.zzpn.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
