package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbp extends com.google.android.gms.internal.fitness.zza implements com.google.android.gms.internal.fitness.zzbm {
    public zzbp() {
        super("com.google.android.gms.fitness.internal.IGoalsReadCallback");
    }

    public static com.google.android.gms.internal.fitness.zzbm zzf(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoalsReadCallback");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.fitness.zzbm) {
            return (com.google.android.gms.internal.fitness.zzbm) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.fitness.zzbo(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zza
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zza((com.google.android.gms.fitness.result.GoalsResult) com.google.android.gms.internal.fitness.zzd.zza(parcel, com.google.android.gms.fitness.result.GoalsResult.CREATOR));
        return true;
    }
}
