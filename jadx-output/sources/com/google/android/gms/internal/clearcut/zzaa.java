package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public class zzaa {
    private static volatile android.os.UserManager zzdc;
    private static volatile boolean zzdd = !zzf();

    private zzaa() {
    }

    public static boolean zze(android.content.Context context) {
        return zzf() && !zzf(context);
    }

    private static boolean zzf() {
        return android.os.Build.VERSION.SDK_INT >= 24;
    }

    private static boolean zzf(android.content.Context context) {
        boolean zIsUserUnlocked = zzdd;
        if (!zIsUserUnlocked) {
            android.os.UserManager userManager = zzdc;
            if (userManager == null) {
                synchronized (com.google.android.gms.internal.clearcut.zzaa.class) {
                    userManager = zzdc;
                    if (userManager == null) {
                        android.os.UserManager userManager2 = (android.os.UserManager) context.getSystemService(android.os.UserManager.class);
                        zzdc = userManager2;
                        if (userManager2 == null) {
                            zzdd = true;
                            return true;
                        }
                        userManager = userManager2;
                    }
                }
            }
            zIsUserUnlocked = userManager.isUserUnlocked();
            zzdd = zIsUserUnlocked;
            if (zIsUserUnlocked) {
                zzdc = null;
            }
        }
        return zIsUserUnlocked;
    }
}
