package com.google.android.gms.flags;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzd extends com.google.android.gms.internal.flags.zzb implements com.google.android.gms.flags.zzc {
    public zzd() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static com.google.android.gms.flags.zzc asInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.flags.zzc) {
            return (com.google.android.gms.flags.zzc) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.flags.zze(iBinder);
    }

    @Override // com.google.android.gms.internal.flags.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            init(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i == 2) {
            boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), com.google.android.gms.internal.flags.zzc.zza(parcel), parcel.readInt());
            parcel2.writeNoException();
            com.google.android.gms.internal.flags.zzc.writeBoolean(parcel2, booleanFlagValue);
        } else if (i == 3) {
            int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
        } else if (i == 4) {
            long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
        } else {
            if (i != 5) {
                return false;
            }
            java.lang.String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeString(stringFlagValue);
        }
        return true;
    }
}
