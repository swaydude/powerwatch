package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public final class zzv extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzt {
    zzv(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void remove() throws android.os.RemoteException {
        zzb(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final java.lang.String getId() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(2, zza());
        java.lang.String string = parcelZza.readString();
        parcelZza.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setPosition(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, latLng);
        zzb(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final com.google.android.gms.maps.model.LatLng getPosition() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(4, zza());
        com.google.android.gms.maps.model.LatLng latLng = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.internal.maps.zzc.zza(parcelZza, com.google.android.gms.maps.model.LatLng.CREATOR);
        parcelZza.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setTitle(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzb(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final java.lang.String getTitle() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(6, zza());
        java.lang.String string = parcelZza.readString();
        parcelZza.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setSnippet(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzb(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final java.lang.String getSnippet() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(8, zza());
        java.lang.String string = parcelZza.readString();
        parcelZza.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setDraggable(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final boolean isDraggable() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(10, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void showInfoWindow() throws android.os.RemoteException {
        zzb(11, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void hideInfoWindow() throws android.os.RemoteException {
        zzb(12, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final boolean isInfoWindowShown() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(13, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setVisible(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final boolean isVisible() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(15, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final boolean zzj(com.google.android.gms.internal.maps.zzt zztVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zztVar);
        android.os.Parcel parcelZza2 = zza(16, parcelZza);
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza2);
        parcelZza2.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final int zzj() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(17, zza());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void zzg(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        zzb(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setAnchor(float f, float f2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        parcelZza.writeFloat(f2);
        zzb(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setFlat(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final boolean isFlat() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(21, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setRotation(float f) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzb(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final float getRotation() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(23, zza());
        float f = parcelZza.readFloat();
        parcelZza.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setInfoWindowAnchor(float f, float f2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        parcelZza.writeFloat(f2);
        zzb(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setAlpha(float f) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzb(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final float getAlpha() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(26, zza());
        float f = parcelZza.readFloat();
        parcelZza.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setZIndex(float f) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzb(27, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final float getZIndex() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(28, zza());
        float f = parcelZza.readFloat();
        parcelZza.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        zzb(29, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final com.google.android.gms.dynamic.IObjectWrapper zzk() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(30, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza.readStrongBinder());
        parcelZza.recycle();
        return iObjectWrapperAsInterface;
    }
}
