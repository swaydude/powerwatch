package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public class MapUtils {
    public static void writeStringMapToJson(java.lang.StringBuilder sb, java.util.HashMap<java.lang.String, java.lang.String> map) {
        sb.append("{");
        boolean z = true;
        for (java.lang.String str : map.keySet()) {
            if (z) {
                z = false;
            } else {
                sb.append(",");
            }
            java.lang.String str2 = map.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
        }
        sb.append("}");
    }
}
