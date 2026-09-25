package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzl {
    public static boolean zza(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String strZzk = com.google.android.gms.internal.vision.zzcv.zzk(str2);
        if (!"face".equals(str) && !"ica".equals(str) && !"ocr".equals(str) && !"barcode".equals(str)) {
            android.util.Log.e("NativeLibraryLoader", java.lang.String.format("Unrecognized engine: %s", str));
            return false;
        }
        int iLastIndexOf = strZzk.lastIndexOf(".so");
        if (iLastIndexOf == strZzk.length() - 3) {
            strZzk = strZzk.substring(0, iLastIndexOf);
        }
        if (strZzk.indexOf("lib") == 0) {
            strZzk = strZzk.substring(3);
        }
        boolean zZza = com.google.android.gms.internal.vision.zzm.zza(str, strZzk);
        if (!zZza) {
            android.util.Log.d("NativeLibraryLoader", java.lang.String.format("%s engine not loaded with %s.", str, strZzk));
        }
        return zZza;
    }
}
