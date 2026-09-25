package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzm extends com.google.android.gms.internal.clearcut.zzb implements com.google.android.gms.internal.clearcut.zzl {
    public zzm() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    @Override // com.google.android.gms.internal.clearcut.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                zza((com.google.android.gms.common.api.Status) com.google.android.gms.internal.clearcut.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR));
                return true;
            case 2:
                zzb((com.google.android.gms.common.api.Status) com.google.android.gms.internal.clearcut.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR));
                return true;
            case 3:
                zza((com.google.android.gms.common.api.Status) com.google.android.gms.internal.clearcut.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), parcel.readLong());
                return true;
            case 4:
                zzc((com.google.android.gms.common.api.Status) com.google.android.gms.internal.clearcut.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR));
                return true;
            case 5:
                zzb((com.google.android.gms.common.api.Status) com.google.android.gms.internal.clearcut.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), parcel.readLong());
                return true;
            case 6:
                zza((com.google.android.gms.common.api.Status) com.google.android.gms.internal.clearcut.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), (com.google.android.gms.clearcut.zze[]) parcel.createTypedArray(com.google.android.gms.clearcut.zze.CREATOR));
                return true;
            case 7:
                zza((com.google.android.gms.common.data.DataHolder) com.google.android.gms.internal.clearcut.zzc.zza(parcel, com.google.android.gms.common.data.DataHolder.CREATOR));
                return true;
            case 8:
                zza((com.google.android.gms.common.api.Status) com.google.android.gms.internal.clearcut.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), (com.google.android.gms.clearcut.zzc) com.google.android.gms.internal.clearcut.zzc.zza(parcel, com.google.android.gms.clearcut.zzc.CREATOR));
                return true;
            case 9:
                zzb((com.google.android.gms.common.api.Status) com.google.android.gms.internal.clearcut.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), (com.google.android.gms.clearcut.zzc) com.google.android.gms.internal.clearcut.zzc.zza(parcel, com.google.android.gms.clearcut.zzc.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
