package com.google.android.gms.internal.ads_identifier;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzf extends com.google.android.gms.internal.ads_identifier.zzb implements com.google.android.gms.internal.ads_identifier.zze {
    public static com.google.android.gms.internal.ads_identifier.zze zza(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(io.fabric.sdk.android.services.common.AdvertisingInfoServiceStrategy.AdvertisingInterface.ADVERTISING_ID_SERVICE_INTERFACE_TOKEN);
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads_identifier.zze ? (com.google.android.gms.internal.ads_identifier.zze) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads_identifier.zzg(iBinder);
    }
}
