package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zal extends com.google.android.gms.internal.base.zab implements com.google.android.gms.common.internal.service.zam {
    zal(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    @Override // com.google.android.gms.common.internal.service.zam
    public final void zaa(com.google.android.gms.common.internal.service.zak zakVar) throws android.os.RemoteException {
        android.os.Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zad.zaa(parcelZaa, zakVar);
        zac(1, parcelZaa);
    }
}
