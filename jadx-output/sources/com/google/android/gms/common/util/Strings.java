package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public class Strings {
    private static final java.util.regex.Pattern zzhh = java.util.regex.Pattern.compile("\\$\\{(.*?)\\}");

    private Strings() {
    }

    public static java.lang.String emptyToNull(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static boolean isEmptyOrWhitespace(java.lang.String str) {
        return str == null || str.trim().isEmpty();
    }
}
