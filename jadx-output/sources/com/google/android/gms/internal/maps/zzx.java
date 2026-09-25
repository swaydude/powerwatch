package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzx extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzw {
    public static com.google.android.gms.internal.maps.zzw zzh(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.maps.zzw) {
            return (com.google.android.gms.internal.maps.zzw) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.maps.zzy(iBinder);
    }
}
