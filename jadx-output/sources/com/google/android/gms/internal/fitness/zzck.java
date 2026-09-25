package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzck extends com.google.android.gms.internal.fitness.zza implements com.google.android.gms.internal.fitness.zzcl {
    public zzck() {
        super("com.google.android.gms.fitness.internal.ISessionStopCallback");
    }

    public static com.google.android.gms.internal.fitness.zzcl zzi(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionStopCallback");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.fitness.zzcl) {
            return (com.google.android.gms.internal.fitness.zzcl) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.fitness.zzcn(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zza
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zza((com.google.android.gms.fitness.result.SessionStopResult) com.google.android.gms.internal.fitness.zzd.zza(parcel, com.google.android.gms.fitness.result.SessionStopResult.CREATOR));
        return true;
    }
}
