package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzce extends com.google.android.gms.internal.fitness.zza implements com.google.android.gms.internal.fitness.zzcf {
    public zzce() {
        super("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
    }

    public static com.google.android.gms.internal.fitness.zzcf zzg(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.fitness.zzcf) {
            return (com.google.android.gms.internal.fitness.zzcf) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.fitness.zzch(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zza
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zza((com.google.android.gms.fitness.result.ListSubscriptionsResult) com.google.android.gms.internal.fitness.zzd.zza(parcel, com.google.android.gms.fitness.result.ListSubscriptionsResult.CREATOR));
        return true;
    }
}
