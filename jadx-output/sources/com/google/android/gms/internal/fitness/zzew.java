package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzew extends com.google.android.gms.internal.fitness.zza implements com.google.android.gms.internal.fitness.zzeu {
    public zzew() {
        super("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
    }

    @Override // com.google.android.gms.internal.fitness.zza
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            zza((com.google.android.gms.internal.fitness.zzeq) com.google.android.gms.internal.fitness.zzd.zza(parcel, com.google.android.gms.internal.fitness.zzeq.CREATOR), com.google.android.gms.internal.fitness.zzbj.zzd(parcel.readStrongBinder()));
        } else if (i == 2) {
            zza((com.google.android.gms.fitness.service.FitnessSensorServiceRequest) com.google.android.gms.internal.fitness.zzd.zza(parcel, com.google.android.gms.fitness.service.FitnessSensorServiceRequest.CREATOR), com.google.android.gms.internal.fitness.zzcp.zzj(parcel.readStrongBinder()));
        } else {
            if (i != 3) {
                return false;
            }
            zza((com.google.android.gms.internal.fitness.zzes) com.google.android.gms.internal.fitness.zzd.zza(parcel, com.google.android.gms.internal.fitness.zzes.CREATOR), com.google.android.gms.internal.fitness.zzcp.zzj(parcel.readStrongBinder()));
        }
        return true;
    }
}
