package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzo extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzn {
    public static com.google.android.gms.internal.maps.zzn zze(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.maps.zzn) {
            return (com.google.android.gms.internal.maps.zzn) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.maps.zzp(iBinder);
    }
}
