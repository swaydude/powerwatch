package com.google.android.gms.vision.text;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzc {
    static android.graphics.Rect zza(com.google.android.gms.vision.text.Text text) {
        int iMax = Integer.MIN_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        for (android.graphics.Point point : text.getCornerPoints()) {
            iMin = java.lang.Math.min(iMin, point.x);
            iMax = java.lang.Math.max(iMax, point.x);
            iMin2 = java.lang.Math.min(iMin2, point.y);
            iMax2 = java.lang.Math.max(iMax2, point.y);
        }
        return new android.graphics.Rect(iMin, iMin2, iMax, iMax2);
    }

    static android.graphics.Point[] zza(com.google.android.gms.internal.vision.zzw zzwVar) {
        android.graphics.Point[] pointArr = new android.graphics.Point[4];
        double dSin = java.lang.Math.sin(java.lang.Math.toRadians(zzwVar.zzeg));
        double dCos = java.lang.Math.cos(java.lang.Math.toRadians(zzwVar.zzeg));
        pointArr[0] = new android.graphics.Point(zzwVar.left, zzwVar.top);
        pointArr[1] = new android.graphics.Point((int) (((double) zzwVar.left) + (((double) zzwVar.width) * dCos)), (int) (((double) zzwVar.top) + (((double) zzwVar.width) * dSin)));
        pointArr[2] = new android.graphics.Point((int) (((double) pointArr[1].x) - (((double) zzwVar.height) * dSin)), (int) (((double) pointArr[1].y) + (((double) zzwVar.height) * dCos)));
        pointArr[3] = new android.graphics.Point(pointArr[0].x + (pointArr[2].x - pointArr[1].x), pointArr[0].y + (pointArr[2].y - pointArr[1].y));
        return pointArr;
    }
}
