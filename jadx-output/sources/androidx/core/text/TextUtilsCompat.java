package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public final class TextUtilsCompat {
    private static final java.lang.String ARAB_SCRIPT_SUBTAG = "Arab";
    private static final java.lang.String HEBR_SCRIPT_SUBTAG = "Hebr";
    private static final java.util.Locale ROOT = new java.util.Locale("", "");

    public static java.lang.String htmlEncode(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return android.text.TextUtils.htmlEncode(str);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"') {
                sb.append("&quot;");
            } else if (cCharAt == '<') {
                sb.append("&lt;");
            } else if (cCharAt == '>') {
                sb.append("&gt;");
            } else if (cCharAt == '&') {
                sb.append("&amp;");
            } else if (cCharAt == '\'') {
                sb.append("&#39;");
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static int getLayoutDirectionFromLocale(java.util.Locale locale) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return android.text.TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(ROOT)) {
            return 0;
        }
        java.lang.String strMaximizeAndGetScript = androidx.core.text.ICUCompat.maximizeAndGetScript(locale);
        if (strMaximizeAndGetScript == null) {
            return getLayoutDirectionFromFirstChar(locale);
        }
        return (strMaximizeAndGetScript.equalsIgnoreCase(ARAB_SCRIPT_SUBTAG) || strMaximizeAndGetScript.equalsIgnoreCase(HEBR_SCRIPT_SUBTAG)) ? 1 : 0;
    }

    private static int getLayoutDirectionFromFirstChar(java.util.Locale locale) {
        byte directionality = java.lang.Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    private TextUtilsCompat() {
    }
}
