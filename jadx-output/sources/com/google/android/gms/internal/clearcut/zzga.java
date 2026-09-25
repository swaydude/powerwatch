package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzga {
    public static <T extends com.google.android.gms.internal.clearcut.zzfz> java.lang.String zza(T t) {
        if (t == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            zza(null, t, new java.lang.StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (java.lang.IllegalAccessException e) {
            java.lang.String strValueOf = java.lang.String.valueOf(e.getMessage());
            return strValueOf.length() != 0 ? "Error printing proto: ".concat(strValueOf) : new java.lang.String("Error printing proto: ");
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(e2.getMessage());
            return strValueOf2.length() != 0 ? "Error printing proto: ".concat(strValueOf2) : new java.lang.String("Error printing proto: ");
        }
    }

    private static void zza(java.lang.String str, java.lang.Object obj, java.lang.StringBuffer stringBuffer, java.lang.StringBuffer stringBuffer2) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        if (obj != null) {
            if (!(obj instanceof com.google.android.gms.internal.clearcut.zzfz)) {
                java.lang.String strZzl = zzl(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(strZzl);
                stringBuffer2.append(": ");
                if (obj instanceof java.lang.String) {
                    java.lang.String strConcat = (java.lang.String) obj;
                    if (!strConcat.startsWith("http") && strConcat.length() > 200) {
                        strConcat = java.lang.String.valueOf(strConcat.substring(0, 200)).concat("[...]");
                    }
                    int length = strConcat.length();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(length);
                    for (int i = 0; i < length; i++) {
                        char cCharAt = strConcat.charAt(i);
                        if (cCharAt < ' ' || cCharAt > '~' || cCharAt == '\"' || cCharAt == '\'') {
                            sb.append(java.lang.String.format("\\u%04x", java.lang.Integer.valueOf(cCharAt)));
                        } else {
                            sb.append(cCharAt);
                        }
                    }
                    java.lang.String string = sb.toString();
                    stringBuffer2.append("\"");
                    stringBuffer2.append(string);
                    stringBuffer2.append("\"");
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    if (bArr == null) {
                        stringBuffer2.append("\"\"");
                    } else {
                        stringBuffer2.append(kotlin.text.Typography.quote);
                        for (byte b : bArr) {
                            int i2 = b & kotlin.UByte.MAX_VALUE;
                            if (i2 == 92 || i2 == 34) {
                                stringBuffer2.append('\\');
                            } else {
                                if (i2 < 32 || i2 >= 127) {
                                    stringBuffer2.append(java.lang.String.format("\\%03o", java.lang.Integer.valueOf(i2)));
                                }
                            }
                            stringBuffer2.append((char) i2);
                        }
                        stringBuffer2.append(kotlin.text.Typography.quote);
                    }
                } else {
                    stringBuffer2.append(obj);
                }
                stringBuffer2.append("\n");
                return;
            }
            int length2 = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(zzl(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            java.lang.Class<?> cls = obj.getClass();
            for (java.lang.reflect.Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                java.lang.String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith(io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR) && !name.endsWith(io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR)) {
                    java.lang.Class<?> type = field.getType();
                    java.lang.Object obj2 = field.get(obj);
                    if (!type.isArray() || type.getComponentType() == java.lang.Byte.TYPE) {
                        zza(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length3 = obj2 == null ? 0 : java.lang.reflect.Array.getLength(obj2);
                        for (int i3 = 0; i3 < length3; i3++) {
                            zza(name, java.lang.reflect.Array.get(obj2, i3), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (java.lang.reflect.Method method : cls.getMethods()) {
                java.lang.String name2 = method.getName();
                if (name2.startsWith("set")) {
                    java.lang.String strSubstring = name2.substring(3);
                    try {
                        java.lang.String strValueOf = java.lang.String.valueOf(strSubstring);
                        if (((java.lang.Boolean) cls.getMethod(strValueOf.length() != 0 ? "has".concat(strValueOf) : new java.lang.String("has"), new java.lang.Class[0]).invoke(obj, new java.lang.Object[0])).booleanValue()) {
                            java.lang.String strValueOf2 = java.lang.String.valueOf(strSubstring);
                            zza(strSubstring, cls.getMethod(strValueOf2.length() != 0 ? "get".concat(strValueOf2) : new java.lang.String("get"), new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]), stringBuffer, stringBuffer2);
                        }
                    } catch (java.lang.NoSuchMethodException unused) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length2);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
            }
        }
    }

    private static java.lang.String zzl(java.lang.String str) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (i == 0) {
                cCharAt = java.lang.Character.toLowerCase(cCharAt);
            } else if (java.lang.Character.isUpperCase(cCharAt)) {
                stringBuffer.append('_');
                cCharAt = java.lang.Character.toLowerCase(cCharAt);
            }
            stringBuffer.append(cCharAt);
        }
        return stringBuffer.toString();
    }
}
