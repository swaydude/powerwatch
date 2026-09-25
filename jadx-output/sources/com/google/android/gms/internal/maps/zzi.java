package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzi extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzh {
    public static com.google.android.gms.internal.maps.zzh zzc(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.maps.zzh) {
            return (com.google.android.gms.internal.maps.zzh) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.maps.zzj(iBinder);
    }
}
