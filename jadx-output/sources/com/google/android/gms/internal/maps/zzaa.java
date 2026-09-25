package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzaa extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzz {
    public static com.google.android.gms.internal.maps.zzz zzi(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.maps.zzz) {
            return (com.google.android.gms.internal.maps.zzz) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.maps.zzab(iBinder);
    }
}
