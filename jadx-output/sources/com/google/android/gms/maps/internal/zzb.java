package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzb extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate {
    zzb(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper zoomIn() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(1, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza.readStrongBinder());
        parcelZza.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper zoomOut() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(2, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza.readStrongBinder());
        parcelZza.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper scrollBy(float f, float f2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        parcelZza.writeFloat(f2);
        android.os.Parcel parcelZza2 = zza(3, parcelZza);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper zoomTo(float f) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        android.os.Parcel parcelZza2 = zza(4, parcelZza);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper zoomBy(float f) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        android.os.Parcel parcelZza2 = zza(5, parcelZza);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper zoomByWithFocus(float f, int i, int i2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        android.os.Parcel parcelZza2 = zza(6, parcelZza);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper newCameraPosition(com.google.android.gms.maps.model.CameraPosition cameraPosition) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, cameraPosition);
        android.os.Parcel parcelZza2 = zza(7, parcelZza);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper newLatLng(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, latLng);
        android.os.Parcel parcelZza2 = zza(8, parcelZza);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper newLatLngZoom(com.google.android.gms.maps.model.LatLng latLng, float f) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, latLng);
        parcelZza.writeFloat(f);
        android.os.Parcel parcelZza2 = zza(9, parcelZza);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper newLatLngBounds(com.google.android.gms.maps.model.LatLngBounds latLngBounds, int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, latLngBounds);
        parcelZza.writeInt(i);
        android.os.Parcel parcelZza2 = zza(10, parcelZza);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper newLatLngBoundsWithSize(com.google.android.gms.maps.model.LatLngBounds latLngBounds, int i, int i2, int i3) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, latLngBounds);
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        parcelZza.writeInt(i3);
        android.os.Parcel parcelZza2 = zza(11, parcelZza);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return iObjectWrapperAsInterface;
    }
}
