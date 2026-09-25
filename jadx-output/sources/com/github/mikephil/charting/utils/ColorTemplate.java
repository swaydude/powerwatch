package com.github.mikephil.charting.utils;

/* JADX INFO: loaded from: classes.dex */
public class ColorTemplate {
    public static final int COLOR_NONE = 1122867;
    public static final int COLOR_SKIP = 1122868;
    public static final int[] LIBERTY_COLORS = {android.graphics.Color.rgb(207, 248, 246), android.graphics.Color.rgb(148, 212, 212), android.graphics.Color.rgb(136, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricHeightDefault, 187), android.graphics.Color.rgb(118, 174, 175), android.graphics.Color.rgb(42, 109, 130)};
    public static final int[] JOYFUL_COLORS = {android.graphics.Color.rgb(217, 80, 138), android.graphics.Color.rgb(254, 149, 7), android.graphics.Color.rgb(254, 247, 120), android.graphics.Color.rgb(106, 167, 134), android.graphics.Color.rgb(53, 194, 209)};
    public static final int[] PASTEL_COLORS = {android.graphics.Color.rgb(64, 89, 128), android.graphics.Color.rgb(149, 165, 124), android.graphics.Color.rgb(217, 184, 162), android.graphics.Color.rgb(191, 134, 134), android.graphics.Color.rgb(179, 48, 80)};
    public static final int[] COLORFUL_COLORS = {android.graphics.Color.rgb(193, 37, 82), android.graphics.Color.rgb(255, 102, 0), android.graphics.Color.rgb(245, 199, 0), android.graphics.Color.rgb(106, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricWeightMax, 31), android.graphics.Color.rgb(179, 100, 53)};
    public static final int[] VORDIPLOM_COLORS = {android.graphics.Color.rgb(192, 255, 140), android.graphics.Color.rgb(255, 247, 140), android.graphics.Color.rgb(255, 208, 140), android.graphics.Color.rgb(140, 234, 255), android.graphics.Color.rgb(255, 140, 157)};
    public static final int[] MATERIAL_COLORS = {rgb("#2ecc71"), rgb("#f1c40f"), rgb("#e74c3c"), rgb("#3498db")};

    public static int colorWithAlpha(int i, int i2) {
        return (i & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK) | ((i2 & 255) << 24);
    }

    public static int rgb(java.lang.String str) {
        int i = (int) java.lang.Long.parseLong(str.replace("#", ""), 16);
        return android.graphics.Color.rgb((i >> 16) & 255, (i >> 8) & 255, (i >> 0) & 255);
    }

    public static int getHoloBlue() {
        return android.graphics.Color.rgb(51, 181, 229);
    }

    public static java.util.List<java.lang.Integer> createColors(android.content.res.Resources resources, int[] iArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i : iArr) {
            arrayList.add(java.lang.Integer.valueOf(resources.getColor(i)));
        }
        return arrayList;
    }

    public static java.util.List<java.lang.Integer> createColors(int[] iArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i));
        }
        return arrayList;
    }
}
