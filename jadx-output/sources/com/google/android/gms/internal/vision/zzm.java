package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzm {
    private static final java.lang.Object sLock = new java.lang.Object();
    private static final java.util.HashMap<java.lang.String, java.lang.Integer> zzbx = new java.util.HashMap<>();

    public static boolean zza(java.lang.String str, java.lang.String str2) {
        synchronized (sLock) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            java.lang.String strValueOf2 = java.lang.String.valueOf(str2);
            java.lang.String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new java.lang.String(strValueOf);
            java.util.HashMap<java.lang.String, java.lang.Integer> map = zzbx;
            int iIntValue = map.containsKey(strConcat) ? map.get(strConcat).intValue() : 0;
            if ((iIntValue & 1) != 0) {
                return true;
            }
            try {
                java.lang.System.loadLibrary(str2);
                map.put(strConcat, java.lang.Integer.valueOf(iIntValue | 1));
                return true;
            } catch (java.lang.UnsatisfiedLinkError e) {
                if ((iIntValue & 4) == 0) {
                    com.google.android.gms.vision.L.e(e, "System.loadLibrary failed: %s", str2);
                    zzbx.put(strConcat, java.lang.Integer.valueOf(iIntValue | 4));
                }
                return false;
            }
        }
    }
}
