package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public final class zzab extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzz {
    zzab(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void remove() throws android.os.RemoteException {
        zzb(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final java.lang.String getId() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(2, zza());
        java.lang.String string = parcelZza.readString();
        parcelZza.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setPoints(java.util.List<com.google.android.gms.maps.model.LatLng> list) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzb(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final java.util.List<com.google.android.gms.maps.model.LatLng> getPoints() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(4, zza());
        java.util.ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(com.google.android.gms.maps.model.LatLng.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setWidth(float f) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzb(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final float getWidth() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(6, zza());
        float f = parcelZza.readFloat();
        parcelZza.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setColor(int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzb(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final int getColor() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(8, zza());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setZIndex(float f) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzb(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final float getZIndex() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(10, zza());
        float f = parcelZza.readFloat();
        parcelZza.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setVisible(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final boolean isVisible() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(12, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setGeodesic(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final boolean isGeodesic() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(14, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final boolean zzb(com.google.android.gms.internal.maps.zzz zzzVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzzVar);
        android.os.Parcel parcelZza2 = zza(15, parcelZza);
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza2);
        parcelZza2.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final int zzj() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(16, zza());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setClickable(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final boolean isClickable() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(18, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setStartCap(com.google.android.gms.maps.model.Cap cap) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, cap);
        zzb(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final com.google.android.gms.maps.model.Cap getStartCap() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(20, zza());
        com.google.android.gms.maps.model.Cap cap = (com.google.android.gms.maps.model.Cap) com.google.android.gms.internal.maps.zzc.zza(parcelZza, com.google.android.gms.maps.model.Cap.CREATOR);
        parcelZza.recycle();
        return cap;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setEndCap(com.google.android.gms.maps.model.Cap cap) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, cap);
        zzb(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final com.google.android.gms.maps.model.Cap getEndCap() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(22, zza());
        com.google.android.gms.maps.model.Cap cap = (com.google.android.gms.maps.model.Cap) com.google.android.gms.internal.maps.zzc.zza(parcelZza, com.google.android.gms.maps.model.Cap.CREATOR);
        parcelZza.recycle();
        return cap;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setJointType(int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzb(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final int getJointType() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(24, zza());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setPattern(java.util.List<com.google.android.gms.maps.model.PatternItem> list) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzb(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final java.util.List<com.google.android.gms.maps.model.PatternItem> getPattern() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(26, zza());
        java.util.ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(com.google.android.gms.maps.model.PatternItem.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        zzb(27, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final com.google.android.gms.dynamic.IObjectWrapper zzk() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(28, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza.readStrongBinder());
        parcelZza.recycle();
        return iObjectWrapperAsInterface;
    }
}
