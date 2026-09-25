package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzk extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.zzi {
    zzk(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzi
    public final com.google.android.gms.dynamic.IObjectWrapper zzb() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(1, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza.readStrongBinder());
        parcelZza.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.common.internal.zzi
    public final int zzc() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(2, zza());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }
}
