package com.google.android.gms.dynamite;

/* JADX INFO: loaded from: classes.dex */
public final class zzl extends com.google.android.gms.internal.common.zza implements com.google.android.gms.dynamite.zzk {
    zzl(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    @Override // com.google.android.gms.dynamite.zzk
    public final com.google.android.gms.dynamic.IObjectWrapper zza(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, int i, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zza(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        com.google.android.gms.internal.common.zzc.zza(parcelZza, iObjectWrapper2);
        android.os.Parcel parcelZza2 = zza(2, parcelZza);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.dynamite.zzk
    public final com.google.android.gms.dynamic.IObjectWrapper zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, int i, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zza(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        com.google.android.gms.internal.common.zzc.zza(parcelZza, iObjectWrapper2);
        android.os.Parcel parcelZza2 = zza(3, parcelZza);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return iObjectWrapperAsInterface;
    }
}
