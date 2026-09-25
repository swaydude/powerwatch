package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class zzd {
    private static final java.util.regex.Pattern zzhi = java.util.regex.Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static java.lang.String unescape(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.util.regex.Matcher matcher = zzhi.matcher(str);
        java.lang.StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new java.lang.StringBuffer();
            }
            matcher.appendReplacement(stringBuffer, new java.lang.String(java.lang.Character.toChars(java.lang.Integer.parseInt(matcher.group().substring(2), 16))));
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
