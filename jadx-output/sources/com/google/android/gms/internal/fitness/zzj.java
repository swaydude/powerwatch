package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzj {
    private static int zzmu = -1;

    public static int zza(android.content.Context context) {
        if (zzmu == -1) {
            if (com.google.android.gms.common.util.DeviceProperties.isWearable(context)) {
                zzmu = 3;
            } else {
                boolean z = false;
                if (com.google.android.gms.common.util.DeviceProperties.isTv(context) || com.google.android.gms.common.util.DeviceProperties.isAuto(context)) {
                    zzmu = 0;
                } else {
                    if (com.google.android.gms.common.util.DeviceProperties.isTablet(context.getResources()) && !zzb(context)) {
                        zzmu = 2;
                    } else {
                        if (!android.text.TextUtils.isEmpty(android.os.Build.PRODUCT) && android.os.Build.PRODUCT.startsWith("glass_")) {
                            z = true;
                        }
                        if (z) {
                            zzmu = 6;
                        } else {
                            zzmu = 1;
                        }
                    }
                }
            }
        }
        return zzmu;
    }

    private static boolean zzb(android.content.Context context) {
        try {
            return ((android.telephony.TelephonyManager) context.getSystemService("phone")).getPhoneType() != 0;
        } catch (android.content.res.Resources.NotFoundException e) {
            android.util.Log.e("Fitness", "Unable to determine type of device, assuming phone.", e);
            return true;
        }
    }
}
