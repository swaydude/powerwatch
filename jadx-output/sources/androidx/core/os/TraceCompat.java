package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class TraceCompat {
    public static void beginSection(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            android.os.Trace.beginSection(str);
        }
    }

    public static void endSection() {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            android.os.Trace.endSection();
        }
    }

    private TraceCompat() {
    }
}
