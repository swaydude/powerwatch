package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zah extends com.google.android.gms.internal.base.zab implements com.google.android.gms.common.internal.ISignInButtonCreator {
    zah(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    @Override // com.google.android.gms.common.internal.ISignInButtonCreator
    public final com.google.android.gms.dynamic.IObjectWrapper newSignInButton(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i, int i2) throws android.os.RemoteException {
        android.os.Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zad.zaa(parcelZaa, iObjectWrapper);
        parcelZaa.writeInt(i);
        parcelZaa.writeInt(i2);
        android.os.Parcel parcelZaa2 = zaa(1, parcelZaa);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZaa2.readStrongBinder());
        parcelZaa2.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.common.internal.ISignInButtonCreator
    public final com.google.android.gms.dynamic.IObjectWrapper newSignInButtonFromConfig(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.common.internal.SignInButtonConfig signInButtonConfig) throws android.os.RemoteException {
        android.os.Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zad.zaa(parcelZaa, iObjectWrapper);
        com.google.android.gms.internal.base.zad.zaa(parcelZaa, signInButtonConfig);
        android.os.Parcel parcelZaa2 = zaa(2, parcelZaa);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZaa2.readStrongBinder());
        parcelZaa2.recycle();
        return iObjectWrapperAsInterface;
    }
}
