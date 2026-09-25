package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzq {
    public static android.graphics.Bitmap zzb(android.graphics.Bitmap bitmap, com.google.android.gms.internal.vision.zzp zzpVar) {
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (zzpVar.rotation != 0) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            int i2 = zzpVar.rotation;
            if (i2 == 0) {
                i = 0;
            } else if (i2 == 1) {
                i = 90;
            } else if (i2 == 2) {
                i = powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricHeightDefault;
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalArgumentException("Unsupported rotation degree.");
                }
                i = powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricHeightMax;
            }
            matrix.postRotate(i);
            bitmap = android.graphics.Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        }
        if (zzpVar.rotation == 1 || zzpVar.rotation == 3) {
            zzpVar.width = height;
            zzpVar.height = width;
        }
        return bitmap;
    }
}
