package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public class zzby {
    private static android.os.UserManager zza;
    private static volatile boolean zzb = !zza();
    private static boolean zzc = false;

    private zzby() {
    }

    public static boolean zza() {
        return android.os.Build.VERSION.SDK_INT >= 24;
    }

    public static boolean zza(android.content.Context context) {
        return !zza() || zzc(context);
    }

    private static boolean zzb(android.content.Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (zza == null) {
                zza = (android.os.UserManager) context.getSystemService(android.os.UserManager.class);
            }
            android.os.UserManager userManager = zza;
            if (userManager == null) {
                return true;
            }
            try {
                if (!userManager.isUserUnlocked() && userManager.isUserRunning(android.os.Process.myUserHandle())) {
                    z2 = false;
                }
                z = z2;
                break;
            } catch (java.lang.NullPointerException e) {
                android.util.Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                zza = null;
                i++;
            }
        }
        if (z) {
            zza = null;
        }
        return z;
    }

    private static boolean zzc(android.content.Context context) {
        if (zzb) {
            return true;
        }
        synchronized (com.google.android.gms.internal.measurement.zzby.class) {
            if (zzb) {
                return true;
            }
            boolean zZzb = zzb(context);
            if (zZzb) {
                zzb = zZzb;
            }
            return zZzb;
        }
    }
}
