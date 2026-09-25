package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzl extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzk {
    public static com.google.android.gms.internal.maps.zzk zzd(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.maps.zzk) {
            return (com.google.android.gms.internal.maps.zzk) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.maps.zzm(iBinder);
    }
}
