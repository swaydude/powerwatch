package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public class Gradient {
    private final int a;
    private final int[] b;
    private final float[] c;

    private class a {
        private final int b;
        private final int c;
        private final float d;

        private a(int i, int i2, float f) {
            this.b = i;
            this.c = i2;
            this.d = f;
        }
    }

    public Gradient(int[] iArr, float[] fArr) {
        this(iArr, fArr, 1000);
    }

    private Gradient(int[] iArr, float[] fArr, int i) {
        if (iArr == null || fArr == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: colors and startPoints should not be null");
        }
        if (iArr.length != fArr.length) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: colors and startPoints should be same length");
        }
        if (iArr.length == 0) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: No colors have been defined");
        }
        for (int i2 = 1; i2 < fArr.length; i2++) {
            if (fArr[i2] <= fArr[i2 - 1]) {
                throw new java.lang.IllegalArgumentException("BDMapSDKException: startPoints should be in increasing order");
            }
        }
        this.a = i;
        int[] iArr2 = new int[iArr.length];
        this.b = iArr2;
        float[] fArr2 = new float[fArr.length];
        this.c = fArr2;
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
    }

    private static int a(int i, int i2, float f) {
        int iAlpha = (int) (((android.graphics.Color.alpha(i2) - android.graphics.Color.alpha(i)) * f) + android.graphics.Color.alpha(i));
        float[] fArr = new float[3];
        android.graphics.Color.RGBToHSV(android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i), fArr);
        float[] fArr2 = new float[3];
        android.graphics.Color.RGBToHSV(android.graphics.Color.red(i2), android.graphics.Color.green(i2), android.graphics.Color.blue(i2), fArr2);
        if (fArr[0] - fArr2[0] > 180.0f) {
            fArr2[0] = fArr2[0] + 360.0f;
        } else if (fArr2[0] - fArr[0] > 180.0f) {
            fArr[0] = fArr[0] + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i3 = 0; i3 < 3; i3++) {
            fArr3[i3] = ((fArr2[i3] - fArr[i3]) * f) + fArr[i3];
        }
        return android.graphics.Color.HSVToColor(iAlpha, fArr3);
    }

    private java.util.HashMap<java.lang.Integer, com.baidu.mapapi.map.Gradient.a> a() {
        java.util.HashMap<java.lang.Integer, com.baidu.mapapi.map.Gradient.a> map = new java.util.HashMap<>();
        if (this.c[0] != 0.0f) {
            map.put(0, new com.baidu.mapapi.map.Gradient.a(android.graphics.Color.argb(0, android.graphics.Color.red(this.b[0]), android.graphics.Color.green(this.b[0]), android.graphics.Color.blue(this.b[0])), this.b[0], this.a * this.c[0]));
        }
        for (int i = 1; i < this.b.length; i++) {
            int i2 = i - 1;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf((int) (this.a * this.c[i2]));
            int[] iArr = this.b;
            int i3 = iArr[i2];
            int i4 = iArr[i];
            float f = this.a;
            float[] fArr = this.c;
            map.put(numValueOf, new com.baidu.mapapi.map.Gradient.a(i3, i4, (fArr[i] - fArr[i2]) * f));
        }
        float[] fArr2 = this.c;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf((int) (this.a * fArr2[length]));
            int[] iArr2 = this.b;
            map.put(numValueOf2, new com.baidu.mapapi.map.Gradient.a(iArr2[length], iArr2[length], this.a * (1.0f - this.c[length])));
        }
        return map;
    }

    int[] a(double d) {
        java.util.HashMap<java.lang.Integer, com.baidu.mapapi.map.Gradient.a> mapA = a();
        int[] iArr = new int[this.a];
        com.baidu.mapapi.map.Gradient.a aVar = mapA.get(0);
        int i = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            if (mapA.containsKey(java.lang.Integer.valueOf(i2))) {
                aVar = mapA.get(java.lang.Integer.valueOf(i2));
                i = i2;
            }
            iArr[i2] = a(aVar.b, aVar.c, (i2 - i) / aVar.d);
        }
        if (d != 1.0d) {
            for (int i3 = 0; i3 < this.a; i3++) {
                int i4 = iArr[i3];
                iArr[i3] = android.graphics.Color.argb((int) (((double) android.graphics.Color.alpha(i4)) * d), android.graphics.Color.red(i4), android.graphics.Color.green(i4), android.graphics.Color.blue(i4));
            }
        }
        return iArr;
    }
}
