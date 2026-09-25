package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzbr extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.maps.internal.IProjectionDelegate {
    zzbr(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final com.google.android.gms.maps.model.LatLng fromScreenLocation(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        android.os.Parcel parcelZza2 = zza(1, parcelZza);
        com.google.android.gms.maps.model.LatLng latLng = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.internal.maps.zzc.zza(parcelZza2, com.google.android.gms.maps.model.LatLng.CREATOR);
        parcelZza2.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper toScreenLocation(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, latLng);
        android.os.Parcel parcelZza2 = zza(2, parcelZza);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final com.google.android.gms.maps.model.VisibleRegion getVisibleRegion() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(3, zza());
        com.google.android.gms.maps.model.VisibleRegion visibleRegion = (com.google.android.gms.maps.model.VisibleRegion) com.google.android.gms.internal.maps.zzc.zza(parcelZza, com.google.android.gms.maps.model.VisibleRegion.CREATOR);
        parcelZza.recycle();
        return visibleRegion;
    }
}
