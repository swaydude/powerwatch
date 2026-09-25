package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public interface IStatusCallback extends android.os.IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static abstract class Stub extends com.google.android.gms.internal.base.zaa implements com.google.android.gms.common.api.internal.IStatusCallback {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public static class zaa extends com.google.android.gms.internal.base.zab implements com.google.android.gms.common.api.internal.IStatusCallback {
            zaa(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
            }

            @Override // com.google.android.gms.common.api.internal.IStatusCallback
            public final void onResult(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
                android.os.Parcel parcelZaa = zaa();
                com.google.android.gms.internal.base.zad.zaa(parcelZaa, status);
                zac(1, parcelZaa);
            }
        }

        public static com.google.android.gms.common.api.internal.IStatusCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.api.internal.IStatusCallback) {
                return (com.google.android.gms.common.api.internal.IStatusCallback) iInterfaceQueryLocalInterface;
            }
            return new com.google.android.gms.common.api.internal.IStatusCallback.Stub.zaa(iBinder);
        }

        @Override // com.google.android.gms.internal.base.zaa
        protected boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i != 1) {
                return false;
            }
            onResult((com.google.android.gms.common.api.Status) com.google.android.gms.internal.base.zad.zaa(parcel, com.google.android.gms.common.api.Status.CREATOR));
            return true;
        }
    }

    void onResult(com.google.android.gms.common.api.Status status) throws android.os.RemoteException;
}
