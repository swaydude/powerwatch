package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzg extends com.google.android.gms.internal.measurement.zzc implements com.google.android.gms.internal.measurement.zzd {
    public static com.google.android.gms.internal.measurement.zzd zza(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.zzd) {
            return (com.google.android.gms.internal.measurement.zzd) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.measurement.zzf(iBinder);
    }
}
