package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public interface IAccountAccessor extends android.os.IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.IAccountAccessor {
        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        public static class zza extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.IAccountAccessor {
            zza(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            @Override // com.google.android.gms.common.internal.IAccountAccessor
            public final android.accounts.Account getAccount() throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza(2, zza());
                android.accounts.Account account = (android.accounts.Account) com.google.android.gms.internal.common.zzc.zza(parcelZza, android.accounts.Account.CREATOR);
                parcelZza.recycle();
                return account;
            }
        }

        public static com.google.android.gms.common.internal.IAccountAccessor asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.IAccountAccessor) {
                return (com.google.android.gms.common.internal.IAccountAccessor) iInterfaceQueryLocalInterface;
            }
            return new com.google.android.gms.common.internal.IAccountAccessor.Stub.zza(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i != 2) {
                return false;
            }
            android.accounts.Account account = getAccount();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.zzc.zzb(parcel2, account);
            return true;
        }
    }

    android.accounts.Account getAccount() throws android.os.RemoteException;
}
