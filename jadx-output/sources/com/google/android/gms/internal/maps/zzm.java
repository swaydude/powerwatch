package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public final class zzm extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzk {
    zzm(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void remove() throws android.os.RemoteException {
        zzb(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final java.lang.String getId() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(2, zza());
        java.lang.String string = parcelZza.readString();
        parcelZza.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setPosition(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, latLng);
        zzb(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final com.google.android.gms.maps.model.LatLng getPosition() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(4, zza());
        com.google.android.gms.maps.model.LatLng latLng = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.internal.maps.zzc.zza(parcelZza, com.google.android.gms.maps.model.LatLng.CREATOR);
        parcelZza.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setDimensions(float f) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzb(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void zza(float f, float f2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        parcelZza.writeFloat(f2);
        zzb(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final float getWidth() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(7, zza());
        float f = parcelZza.readFloat();
        parcelZza.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final float getHeight() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(8, zza());
        float f = parcelZza.readFloat();
        parcelZza.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setPositionFromBounds(com.google.android.gms.maps.model.LatLngBounds latLngBounds) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, latLngBounds);
        zzb(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final com.google.android.gms.maps.model.LatLngBounds getBounds() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(10, zza());
        com.google.android.gms.maps.model.LatLngBounds latLngBounds = (com.google.android.gms.maps.model.LatLngBounds) com.google.android.gms.internal.maps.zzc.zza(parcelZza, com.google.android.gms.maps.model.LatLngBounds.CREATOR);
        parcelZza.recycle();
        return latLngBounds;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setBearing(float f) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzb(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final float getBearing() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(12, zza());
        float f = parcelZza.readFloat();
        parcelZza.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setZIndex(float f) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzb(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final float getZIndex() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(14, zza());
        float f = parcelZza.readFloat();
        parcelZza.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setVisible(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final boolean isVisible() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(16, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setTransparency(float f) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzb(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final float getTransparency() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(18, zza());
        float f = parcelZza.readFloat();
        parcelZza.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final boolean zzb(com.google.android.gms.internal.maps.zzk zzkVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzkVar);
        android.os.Parcel parcelZza2 = zza(19, parcelZza);
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza2);
        parcelZza2.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final int zzj() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(20, zza());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        zzb(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setClickable(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final boolean isClickable() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(23, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        zzb(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final com.google.android.gms.dynamic.IObjectWrapper zzk() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(25, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza.readStrongBinder());
        parcelZza.recycle();
        return iObjectWrapperAsInterface;
    }
}
