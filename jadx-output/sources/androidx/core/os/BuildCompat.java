package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public class BuildCompat {
    private BuildCompat() {
    }

    @java.lang.Deprecated
    public static boolean isAtLeastN() {
        return android.os.Build.VERSION.SDK_INT >= 24;
    }

    @java.lang.Deprecated
    public static boolean isAtLeastNMR1() {
        return android.os.Build.VERSION.SDK_INT >= 25;
    }

    @java.lang.Deprecated
    public static boolean isAtLeastO() {
        return android.os.Build.VERSION.SDK_INT >= 26;
    }

    @java.lang.Deprecated
    public static boolean isAtLeastOMR1() {
        return android.os.Build.VERSION.SDK_INT >= 27;
    }

    @java.lang.Deprecated
    public static boolean isAtLeastP() {
        return android.os.Build.VERSION.SDK_INT >= 28;
    }

    public static boolean isAtLeastQ() {
        return android.os.Build.VERSION.CODENAME.length() == 1 && android.os.Build.VERSION.CODENAME.charAt(0) >= 'Q' && android.os.Build.VERSION.CODENAME.charAt(0) <= 'Z';
    }
}
