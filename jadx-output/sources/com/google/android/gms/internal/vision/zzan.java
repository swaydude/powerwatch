package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class zzan {
    private static android.os.UserManager zzff;
    private static volatile boolean zzfg = !zzs();
    private static boolean zzfh = false;

    private zzan() {
    }

    public static boolean zzs() {
        return android.os.Build.VERSION.SDK_INT >= 24;
    }

    public static boolean isUserUnlocked(android.content.Context context) {
        return !zzs() || zzd(context);
    }

    private static boolean zzc(android.content.Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (zzff == null) {
                zzff = (android.os.UserManager) context.getSystemService(android.os.UserManager.class);
            }
            android.os.UserManager userManager = zzff;
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
                zzff = null;
                i++;
            }
        }
        if (z) {
            zzff = null;
        }
        return z;
    }

    private static boolean zzd(android.content.Context context) {
        if (zzfg) {
            return true;
        }
        synchronized (com.google.android.gms.internal.vision.zzan.class) {
            if (zzfg) {
                return true;
            }
            boolean zZzc = zzc(context);
            if (zZzc) {
                zzfg = zZzc;
            }
            return zZzc;
        }
    }
}
