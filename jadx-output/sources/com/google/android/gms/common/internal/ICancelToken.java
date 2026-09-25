package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public interface ICancelToken extends android.os.IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.ICancelToken {
        public Stub() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        public static class zza extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.ICancelToken {
            zza(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
            }

            @Override // com.google.android.gms.common.internal.ICancelToken
            public final void cancel() throws android.os.RemoteException {
                zzc(2, zza());
            }
        }

        public static com.google.android.gms.common.internal.ICancelToken asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.ICancelToken) {
                return (com.google.android.gms.common.internal.ICancelToken) iInterfaceQueryLocalInterface;
            }
            return new com.google.android.gms.common.internal.ICancelToken.Stub.zza(iBinder);
        }
    }

    void cancel() throws android.os.RemoteException;
}
