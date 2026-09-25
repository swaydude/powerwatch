package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public interface IGmsCallbacks extends android.os.IInterface {
    void onPostInitComplete(int i, android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException;

    void zza(int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void zza(int i, android.os.IBinder iBinder, com.google.android.gms.common.internal.zzb zzbVar) throws android.os.RemoteException;

    public static abstract class zza extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.IGmsCallbacks {
        public zza() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        @Override // com.google.android.gms.internal.common.zzb
        protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1) {
                onPostInitComplete(parcel.readInt(), parcel.readStrongBinder(), (android.os.Bundle) com.google.android.gms.internal.common.zzc.zza(parcel, android.os.Bundle.CREATOR));
            } else if (i == 2) {
                zza(parcel.readInt(), (android.os.Bundle) com.google.android.gms.internal.common.zzc.zza(parcel, android.os.Bundle.CREATOR));
            } else {
                if (i != 3) {
                    return false;
                }
                zza(parcel.readInt(), parcel.readStrongBinder(), (com.google.android.gms.common.internal.zzb) com.google.android.gms.internal.common.zzc.zza(parcel, com.google.android.gms.common.internal.zzb.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
