package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzcp extends com.google.android.gms.internal.fitness.zza implements com.google.android.gms.internal.fitness.zzcm {
    public zzcp() {
        super("com.google.android.gms.fitness.internal.IStatusCallback");
    }

    public static com.google.android.gms.internal.fitness.zzcm zzj(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.fitness.zzcm) {
            return (com.google.android.gms.internal.fitness.zzcm) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.fitness.zzco(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zza
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        onResult((com.google.android.gms.common.api.Status) com.google.android.gms.internal.fitness.zzd.zza(parcel, com.google.android.gms.common.api.Status.CREATOR));
        return true;
    }
}
