package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzt extends com.google.android.gms.internal.fitness.zza implements com.google.android.gms.fitness.data.zzu {
    public zzt() {
        super("com.google.android.gms.fitness.data.IDataSourceListener");
    }

    public static com.google.android.gms.fitness.data.zzu zza(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.data.IDataSourceListener");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.fitness.data.zzu) {
            return (com.google.android.gms.fitness.data.zzu) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.fitness.data.zzv(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zza
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zzc((com.google.android.gms.fitness.data.DataPoint) com.google.android.gms.internal.fitness.zzd.zza(parcel, com.google.android.gms.fitness.data.DataPoint.CREATOR));
        return true;
    }
}
