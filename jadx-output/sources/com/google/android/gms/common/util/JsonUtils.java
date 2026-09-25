package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class JsonUtils {
    private static final java.util.regex.Pattern zzhd = java.util.regex.Pattern.compile("\\\\.");
    private static final java.util.regex.Pattern zzhe = java.util.regex.Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    private JsonUtils() {
    }

    public static java.lang.String unescapeString(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.lang.String strUnescape = com.google.android.gms.common.util.zzd.unescape(str);
        java.util.regex.Matcher matcher = zzhd.matcher(strUnescape);
        java.lang.StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new java.lang.StringBuffer();
            }
            char cCharAt = matcher.group().charAt(1);
            if (cCharAt == '\"') {
                matcher.appendReplacement(stringBuffer, "\"");
            } else if (cCharAt == '/') {
                matcher.appendReplacement(stringBuffer, "/");
            } else if (cCharAt == '\\') {
                matcher.appendReplacement(stringBuffer, "\\\\");
            } else if (cCharAt == 'b') {
                matcher.appendReplacement(stringBuffer, "\b");
            } else if (cCharAt == 'f') {
                matcher.appendReplacement(stringBuffer, "\f");
            } else if (cCharAt == 'n') {
                matcher.appendReplacement(stringBuffer, "\n");
            } else if (cCharAt == 'r') {
                matcher.appendReplacement(stringBuffer, "\r");
            } else {
                if (cCharAt != 't') {
                    throw new java.lang.IllegalStateException("Found an escaped character that should never be.");
                }
                matcher.appendReplacement(stringBuffer, "\t");
            }
        }
        if (stringBuffer == null) {
            return strUnescape;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static java.lang.String escapeString(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.util.regex.Matcher matcher = zzhe.matcher(str);
        java.lang.StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new java.lang.StringBuffer();
            }
            char cCharAt = matcher.group().charAt(0);
            if (cCharAt == '\f') {
                matcher.appendReplacement(stringBuffer, "\\\\f");
            } else if (cCharAt == '\r') {
                matcher.appendReplacement(stringBuffer, "\\\\r");
            } else if (cCharAt == '\"') {
                matcher.appendReplacement(stringBuffer, "\\\\\\\"");
            } else if (cCharAt == '/') {
                matcher.appendReplacement(stringBuffer, "\\\\/");
            } else if (cCharAt == '\\') {
                matcher.appendReplacement(stringBuffer, "\\\\\\\\");
            } else {
                switch (cCharAt) {
                    case '\b':
                        matcher.appendReplacement(stringBuffer, "\\\\b");
                        break;
                    case '\t':
                        matcher.appendReplacement(stringBuffer, "\\\\t");
                        break;
                    case '\n':
                        matcher.appendReplacement(stringBuffer, "\\\\n");
                        break;
                }
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static boolean areJsonValuesEquivalent(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof org.json.JSONObject) && (obj2 instanceof org.json.JSONObject)) {
            org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
            org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj2;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                if (!jSONObject2.has(next)) {
                    return false;
                }
                try {
                    if (!areJsonValuesEquivalent(jSONObject.get(next), jSONObject2.get(next))) {
                        return false;
                    }
                } catch (org.json.JSONException unused) {
                }
            }
            return true;
        }
        if ((obj instanceof org.json.JSONArray) && (obj2 instanceof org.json.JSONArray)) {
            org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
            org.json.JSONArray jSONArray2 = (org.json.JSONArray) obj2;
            if (jSONArray.length() != jSONArray2.length()) {
                return false;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    if (!areJsonValuesEquivalent(jSONArray.get(i), jSONArray2.get(i))) {
                        return false;
                    }
                } catch (org.json.JSONException unused2) {
                    return false;
                }
            }
            return true;
        }
        return obj.equals(obj2);
    }
}
