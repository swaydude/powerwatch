package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public final class IntentCompat {
    public static final java.lang.String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
    public static final java.lang.String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
    public static final java.lang.String EXTRA_START_PLAYBACK = "android.intent.extra.START_PLAYBACK";

    private IntentCompat() {
    }

    public static android.content.Intent makeMainSelectorActivity(java.lang.String str, java.lang.String str2) {
        if (android.os.Build.VERSION.SDK_INT >= 15) {
            return android.content.Intent.makeMainSelectorActivity(str, str2);
        }
        android.content.Intent intent = new android.content.Intent(str);
        intent.addCategory(str2);
        return intent;
    }
}
