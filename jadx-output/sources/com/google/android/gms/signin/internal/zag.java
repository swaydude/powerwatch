package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zag extends com.google.android.gms.internal.base.zab implements com.google.android.gms.signin.internal.zae {
    zag(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.signin.internal.zae
    public final void zam(int i) throws android.os.RemoteException {
        android.os.Parcel parcelZaa = zaa();
        parcelZaa.writeInt(i);
        zab(7, parcelZaa);
    }

    @Override // com.google.android.gms.signin.internal.zae
    public final void zaa(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor, int i, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zad.zaa(parcelZaa, iAccountAccessor);
        parcelZaa.writeInt(i);
        com.google.android.gms.internal.base.zad.writeBoolean(parcelZaa, z);
        zab(9, parcelZaa);
    }

    @Override // com.google.android.gms.signin.internal.zae
    public final void zaa(com.google.android.gms.signin.internal.zai zaiVar, com.google.android.gms.signin.internal.zac zacVar) throws android.os.RemoteException {
        android.os.Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zad.zaa(parcelZaa, zaiVar);
        com.google.android.gms.internal.base.zad.zaa(parcelZaa, zacVar);
        zab(12, parcelZaa);
    }
}
