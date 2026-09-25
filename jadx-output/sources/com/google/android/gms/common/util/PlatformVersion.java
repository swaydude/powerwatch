package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class PlatformVersion {
    private PlatformVersion() {
    }

    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    public static boolean isAtLeastJellyBean() {
        return true;
    }

    public static boolean isAtLeastJellyBeanMR1() {
        return android.os.Build.VERSION.SDK_INT >= 17;
    }

    public static boolean isAtLeastJellyBeanMR2() {
        return android.os.Build.VERSION.SDK_INT >= 18;
    }

    public static boolean isAtLeastKitKat() {
        return android.os.Build.VERSION.SDK_INT >= 19;
    }

    public static boolean isAtLeastKitKatWatch() {
        return android.os.Build.VERSION.SDK_INT >= 20;
    }

    public static boolean isAtLeastLollipop() {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }

    public static boolean isAtLeastLollipopMR1() {
        return android.os.Build.VERSION.SDK_INT >= 22;
    }

    public static boolean isAtLeastM() {
        return android.os.Build.VERSION.SDK_INT >= 23;
    }

    public static boolean isAtLeastN() {
        return android.os.Build.VERSION.SDK_INT >= 24;
    }

    public static boolean isAtLeastO() {
        return android.os.Build.VERSION.SDK_INT >= 26;
    }

    public static boolean isAtLeastP() {
        return android.os.Build.VERSION.SDK_INT >= 28;
    }

    public static boolean isAtLeastQ() {
        return androidx.core.os.BuildCompat.isAtLeastQ() || (android.os.Build.VERSION.CODENAME.equals("REL") && android.os.Build.VERSION.SDK_INT >= 29) || (android.os.Build.VERSION.CODENAME.length() == 1 && android.os.Build.VERSION.CODENAME.charAt(0) >= 'Q' && android.os.Build.VERSION.CODENAME.charAt(0) <= 'Z');
    }
}
