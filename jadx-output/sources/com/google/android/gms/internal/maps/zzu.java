package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzu extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzt {
    public static com.google.android.gms.internal.maps.zzt zzg(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.maps.zzt) {
            return (com.google.android.gms.internal.maps.zzt) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.maps.zzv(iBinder);
    }
}
