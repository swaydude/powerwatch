package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzj extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.zzi {
    public zzj() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static com.google.android.gms.common.internal.zzi zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.zzi) {
            return (com.google.android.gms.common.internal.zzi) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.common.internal.zzk(iBinder);
    }

    @Override // com.google.android.gms.internal.common.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzb = zzb();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.zzc.zza(parcel2, iObjectWrapperZzb);
        } else {
            if (i != 2) {
                return false;
            }
            int iZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(iZzc);
        }
        return true;
    }
}
