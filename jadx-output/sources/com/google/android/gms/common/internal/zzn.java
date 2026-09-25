package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzn extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.zzm {
    public static com.google.android.gms.common.internal.zzm zzc(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.zzm) {
            return (com.google.android.gms.common.internal.zzm) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.common.internal.zzo(iBinder);
    }
}
