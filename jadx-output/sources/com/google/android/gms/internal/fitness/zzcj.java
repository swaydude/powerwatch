package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzcj extends com.google.android.gms.internal.fitness.zza implements com.google.android.gms.internal.fitness.zzcg {
    public zzcj() {
        super("com.google.android.gms.fitness.internal.ISessionReadCallback");
    }

    public static com.google.android.gms.internal.fitness.zzcg zzh(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionReadCallback");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.fitness.zzcg) {
            return (com.google.android.gms.internal.fitness.zzcg) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.fitness.zzci(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zza
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zza((com.google.android.gms.fitness.result.SessionReadResult) com.google.android.gms.internal.fitness.zzd.zza(parcel, com.google.android.gms.fitness.result.SessionReadResult.CREATOR));
        return true;
    }
}
