package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public class HttpUtils {
    private static final java.util.regex.Pattern zzha = java.util.regex.Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final java.util.regex.Pattern zzhb = java.util.regex.Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    private static final java.util.regex.Pattern zzhc = java.util.regex.Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    public static java.util.Map<java.lang.String, java.lang.String> parse(java.net.URI uri, java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> mapEmptyMap = java.util.Collections.emptyMap();
        java.lang.String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            mapEmptyMap = new java.util.HashMap<>();
            java.util.Scanner scanner = new java.util.Scanner(rawQuery);
            scanner.useDelimiter("&");
            while (scanner.hasNext()) {
                java.lang.String[] strArrSplit = scanner.next().split("=");
                if (strArrSplit.length == 0 || strArrSplit.length > 2) {
                    throw new java.lang.IllegalArgumentException("bad parameter");
                }
                java.lang.String strDecode = decode(strArrSplit[0], str);
                java.lang.String strDecode2 = null;
                if (strArrSplit.length == 2) {
                    strDecode2 = decode(strArrSplit[1], str);
                }
                mapEmptyMap.put(strDecode, strDecode2);
            }
        }
        return mapEmptyMap;
    }

    private static java.lang.String decode(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return java.net.URLDecoder.decode(str, str2);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    private HttpUtils() {
    }
}
