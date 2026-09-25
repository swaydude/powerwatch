package io.fabric.sdk.android.services.network;

/* JADX INFO: loaded from: classes2.dex */
public final class UrlUtils {
    public static final java.lang.String UTF8 = "UTF8";

    private UrlUtils() {
    }

    public static java.util.TreeMap<java.lang.String, java.lang.String> getQueryParams(java.net.URI uri, boolean z) {
        return getQueryParams(uri.getRawQuery(), z);
    }

    public static java.util.TreeMap<java.lang.String, java.lang.String> getQueryParams(java.lang.String str, boolean z) {
        java.util.TreeMap<java.lang.String, java.lang.String> treeMap = new java.util.TreeMap<>();
        if (str == null) {
            return treeMap;
        }
        for (java.lang.String str2 : str.split("&")) {
            java.lang.String[] strArrSplit = str2.split("=");
            if (strArrSplit.length == 2) {
                if (z) {
                    treeMap.put(urlDecode(strArrSplit[0]), urlDecode(strArrSplit[1]));
                } else {
                    treeMap.put(strArrSplit[0], strArrSplit[1]);
                }
            } else if (!android.text.TextUtils.isEmpty(strArrSplit[0])) {
                if (z) {
                    treeMap.put(urlDecode(strArrSplit[0]), "");
                } else {
                    treeMap.put(strArrSplit[0], "");
                }
            }
        }
        return treeMap;
    }

    public static java.lang.String urlEncode(java.lang.String str) {
        if (str == null) {
            return "";
        }
        try {
            return java.net.URLEncoder.encode(str, UTF8);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException(e.getMessage(), e);
        }
    }

    public static java.lang.String urlDecode(java.lang.String str) {
        if (str == null) {
            return "";
        }
        try {
            return java.net.URLDecoder.decode(str, UTF8);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException(e.getMessage(), e);
        }
    }

    public static java.lang.String percentEncode(java.lang.String str) {
        int i;
        if (str == null) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strUrlEncode = urlEncode(str);
        int length = strUrlEncode.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = strUrlEncode.charAt(i2);
            if (cCharAt == '*') {
                sb.append("%2A");
            } else if (cCharAt == '+') {
                sb.append("%20");
            } else if (cCharAt == '%' && (i = i2 + 2) < length && strUrlEncode.charAt(i2 + 1) == '7' && strUrlEncode.charAt(i) == 'E') {
                sb.append('~');
                i2 = i;
            } else {
                sb.append(cCharAt);
            }
            i2++;
        }
        return sb.toString();
    }
}
