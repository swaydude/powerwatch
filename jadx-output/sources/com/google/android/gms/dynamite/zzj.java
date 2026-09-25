package com.google.android.gms.dynamite;

/* JADX INFO: loaded from: classes.dex */
public final class zzj extends com.google.android.gms.internal.common.zza implements com.google.android.gms.dynamite.zzi {
    zzj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // com.google.android.gms.dynamite.zzi
    public final com.google.android.gms.dynamic.IObjectWrapper zza(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zza(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        android.os.Parcel parcelZza2 = zza(2, parcelZza);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.dynamite.zzi
    public final int zza(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zza(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        com.google.android.gms.internal.common.zzc.writeBoolean(parcelZza, z);
        android.os.Parcel parcelZza2 = zza(3, parcelZza);
        int i = parcelZza2.readInt();
        parcelZza2.recycle();
        return i;
    }

    @Override // com.google.android.gms.dynamite.zzi
    public final com.google.android.gms.dynamic.IObjectWrapper zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zza(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        android.os.Parcel parcelZza2 = zza(4, parcelZza);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.dynamite.zzi
    public final int zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zza(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        com.google.android.gms.internal.common.zzc.writeBoolean(parcelZza, z);
        android.os.Parcel parcelZza2 = zza(5, parcelZza);
        int i = parcelZza2.readInt();
        parcelZza2.recycle();
        return i;
    }

    @Override // com.google.android.gms.dynamite.zzi
    public final int zzak() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(6, zza());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }
}
