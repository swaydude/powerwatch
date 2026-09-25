package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public interface IResolveAccountCallbacks extends android.os.IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static abstract class Stub extends com.google.android.gms.internal.base.zaa implements com.google.android.gms.common.internal.IResolveAccountCallbacks {
        public Stub() {
            super("com.google.android.gms.common.internal.IResolveAccountCallbacks");
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public static class Proxy extends com.google.android.gms.internal.base.zab implements com.google.android.gms.common.internal.IResolveAccountCallbacks {
            Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IResolveAccountCallbacks");
            }

            @Override // com.google.android.gms.common.internal.IResolveAccountCallbacks
            public void onAccountResolutionComplete(com.google.android.gms.common.internal.ResolveAccountResponse resolveAccountResponse) throws android.os.RemoteException {
                android.os.Parcel parcelZaa = zaa();
                com.google.android.gms.internal.base.zad.zaa(parcelZaa, resolveAccountResponse);
                zab(2, parcelZaa);
            }
        }

        public static com.google.android.gms.common.internal.IResolveAccountCallbacks asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.IResolveAccountCallbacks) {
                return (com.google.android.gms.common.internal.IResolveAccountCallbacks) iInterfaceQueryLocalInterface;
            }
            return new com.google.android.gms.common.internal.IResolveAccountCallbacks.Stub.Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.base.zaa
        protected boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i != 2) {
                return false;
            }
            onAccountResolutionComplete((com.google.android.gms.common.internal.ResolveAccountResponse) com.google.android.gms.internal.base.zad.zaa(parcel, com.google.android.gms.common.internal.ResolveAccountResponse.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    void onAccountResolutionComplete(com.google.android.gms.common.internal.ResolveAccountResponse resolveAccountResponse) throws android.os.RemoteException;
}
