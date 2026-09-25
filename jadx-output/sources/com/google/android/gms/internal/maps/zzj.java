package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public final class zzj extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzh {
    zzj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void remove() throws android.os.RemoteException {
        zzb(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final java.lang.String getId() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(2, zza());
        java.lang.String string = parcelZza.readString();
        parcelZza.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void setCenter(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, latLng);
        zzb(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final com.google.android.gms.maps.model.LatLng getCenter() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(4, zza());
        com.google.android.gms.maps.model.LatLng latLng = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.internal.maps.zzc.zza(parcelZza, com.google.android.gms.maps.model.LatLng.CREATOR);
        parcelZza.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void setRadius(double d) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeDouble(d);
        zzb(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final double getRadius() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(6, zza());
        double d = parcelZza.readDouble();
        parcelZza.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void setStrokeWidth(float f) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzb(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final float getStrokeWidth() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(8, zza());
        float f = parcelZza.readFloat();
        parcelZza.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void setStrokeColor(int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzb(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final int getStrokeColor() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(10, zza());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void setFillColor(int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzb(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final int getFillColor() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(12, zza());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void setZIndex(float f) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzb(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final float getZIndex() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(14, zza());
        float f = parcelZza.readFloat();
        parcelZza.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void setVisible(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final boolean isVisible() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(16, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final boolean zzb(com.google.android.gms.internal.maps.zzh zzhVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzhVar);
        android.os.Parcel parcelZza2 = zza(17, parcelZza);
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza2);
        parcelZza2.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final int zzj() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(18, zza());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void setClickable(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final boolean isClickable() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(20, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void setStrokePattern(java.util.List<com.google.android.gms.maps.model.PatternItem> list) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzb(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final java.util.List<com.google.android.gms.maps.model.PatternItem> getStrokePattern() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(22, zza());
        java.util.ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(com.google.android.gms.maps.model.PatternItem.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        zzb(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final com.google.android.gms.dynamic.IObjectWrapper zzk() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(24, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza.readStrongBinder());
        parcelZza.recycle();
        return iObjectWrapperAsInterface;
    }
}
