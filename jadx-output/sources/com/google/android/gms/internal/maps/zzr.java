package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzr extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzq {
    public static com.google.android.gms.internal.maps.zzq zzf(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.maps.zzq) {
            return (com.google.android.gms.internal.maps.zzq) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.maps.zzs(iBinder);
    }
}
