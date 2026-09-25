package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfb extends com.google.android.gms.internal.measurement.zzc implements com.google.android.gms.measurement.internal.zzfc {
    public zzfb() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzc
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                zza((com.google.android.gms.measurement.internal.zzan) com.google.android.gms.internal.measurement.zzb.zza(parcel, com.google.android.gms.measurement.internal.zzan.CREATOR), (com.google.android.gms.measurement.internal.zzm) com.google.android.gms.internal.measurement.zzb.zza(parcel, com.google.android.gms.measurement.internal.zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                zza((com.google.android.gms.measurement.internal.zzkz) com.google.android.gms.internal.measurement.zzb.zza(parcel, com.google.android.gms.measurement.internal.zzkz.CREATOR), (com.google.android.gms.measurement.internal.zzm) com.google.android.gms.internal.measurement.zzb.zza(parcel, com.google.android.gms.measurement.internal.zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                zza((com.google.android.gms.measurement.internal.zzm) com.google.android.gms.internal.measurement.zzb.zza(parcel, com.google.android.gms.measurement.internal.zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                zza((com.google.android.gms.measurement.internal.zzan) com.google.android.gms.internal.measurement.zzb.zza(parcel, com.google.android.gms.measurement.internal.zzan.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                zzb((com.google.android.gms.measurement.internal.zzm) com.google.android.gms.internal.measurement.zzb.zza(parcel, com.google.android.gms.measurement.internal.zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                java.util.List<com.google.android.gms.measurement.internal.zzkz> listZza = zza((com.google.android.gms.measurement.internal.zzm) com.google.android.gms.internal.measurement.zzb.zza(parcel, com.google.android.gms.measurement.internal.zzm.CREATOR), com.google.android.gms.internal.measurement.zzb.zza(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(listZza);
                return true;
            case 9:
                byte[] bArrZza = zza((com.google.android.gms.measurement.internal.zzan) com.google.android.gms.internal.measurement.zzb.zza(parcel, com.google.android.gms.measurement.internal.zzan.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrZza);
                return true;
            case 10:
                zza(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                java.lang.String strZzc = zzc((com.google.android.gms.measurement.internal.zzm) com.google.android.gms.internal.measurement.zzb.zza(parcel, com.google.android.gms.measurement.internal.zzm.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(strZzc);
                return true;
            case 12:
                zza((com.google.android.gms.measurement.internal.zzv) com.google.android.gms.internal.measurement.zzb.zza(parcel, com.google.android.gms.measurement.internal.zzv.CREATOR), (com.google.android.gms.measurement.internal.zzm) com.google.android.gms.internal.measurement.zzb.zza(parcel, com.google.android.gms.measurement.internal.zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zza((com.google.android.gms.measurement.internal.zzv) com.google.android.gms.internal.measurement.zzb.zza(parcel, com.google.android.gms.measurement.internal.zzv.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                java.util.List<com.google.android.gms.measurement.internal.zzkz> listZza2 = zza(parcel.readString(), parcel.readString(), com.google.android.gms.internal.measurement.zzb.zza(parcel), (com.google.android.gms.measurement.internal.zzm) com.google.android.gms.internal.measurement.zzb.zza(parcel, com.google.android.gms.measurement.internal.zzm.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(listZza2);
                return true;
            case 15:
                java.util.List<com.google.android.gms.measurement.internal.zzkz> listZza3 = zza(parcel.readString(), parcel.readString(), parcel.readString(), com.google.android.gms.internal.measurement.zzb.zza(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(listZza3);
                return true;
            case 16:
                java.util.List<com.google.android.gms.measurement.internal.zzv> listZza4 = zza(parcel.readString(), parcel.readString(), (com.google.android.gms.measurement.internal.zzm) com.google.android.gms.internal.measurement.zzb.zza(parcel, com.google.android.gms.measurement.internal.zzm.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(listZza4);
                return true;
            case 17:
                java.util.List<com.google.android.gms.measurement.internal.zzv> listZza5 = zza(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(listZza5);
                return true;
            case 18:
                zzd((com.google.android.gms.measurement.internal.zzm) com.google.android.gms.internal.measurement.zzb.zza(parcel, com.google.android.gms.measurement.internal.zzm.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
