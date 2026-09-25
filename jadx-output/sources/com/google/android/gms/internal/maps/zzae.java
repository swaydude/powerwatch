package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public final class zzae extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzac {
    zzae(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final void remove() throws android.os.RemoteException {
        zzb(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final void clearTileCache() throws android.os.RemoteException {
        zzb(2, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final java.lang.String getId() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(3, zza());
        java.lang.String string = parcelZza.readString();
        parcelZza.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final void setZIndex(float f) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzb(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final float getZIndex() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(5, zza());
        float f = parcelZza.readFloat();
        parcelZza.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final void setVisible(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final boolean isVisible() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(7, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final boolean zza(com.google.android.gms.internal.maps.zzac zzacVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzacVar);
        android.os.Parcel parcelZza2 = zza(8, parcelZza);
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza2);
        parcelZza2.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final int zzj() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(9, zza());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final void setFadeIn(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final boolean getFadeIn() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(11, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final void setTransparency(float f) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzb(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final float getTransparency() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(13, zza());
        float f = parcelZza.readFloat();
        parcelZza.recycle();
        return f;
    }
}
