package com.google.gson.internal.bind.util;

/* JADX INFO: loaded from: classes2.dex */
public class ISO8601Utils {
    private static final java.lang.String UTC_ID = "UTC";
    private static final java.util.TimeZone TIMEZONE_UTC = java.util.TimeZone.getTimeZone(UTC_ID);

    public static java.lang.String format(java.util.Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    public static java.lang.String format(java.util.Date date, boolean z) {
        return format(date, z, TIMEZONE_UTC);
    }

    public static java.lang.String format(java.util.Date date, boolean z, java.util.TimeZone timeZone) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(timeZone, java.util.Locale.US);
        gregorianCalendar.setTime(date);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(19 + (z ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        if (z) {
            sb.append('.');
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int iAbs = java.lang.Math.abs(i / 60);
            int iAbs2 = java.lang.Math.abs(i % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, iAbs, 2);
            sb.append(':');
            padInt(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00cd A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, NumberFormatException -> 0x01be, IndexOutOfBoundsException -> 0x01c0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:3:0x0006, B:5:0x0018, B:6:0x001a, B:8:0x0026, B:9:0x0028, B:11:0x0037, B:13:0x003d, B:17:0x0052, B:19:0x0062, B:20:0x0064, B:22:0x0070, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:47:0x00c7, B:49:0x00cd, B:51:0x00d4, B:76:0x0182, B:56:0x00e0, B:57:0x00f9, B:58:0x00fa, B:62:0x0116, B:64:0x0123, B:67:0x012c, B:69:0x014b, B:72:0x015a, B:73:0x017c, B:75:0x017f, B:61:0x0105, B:78:0x01b4, B:79:0x01bb, B:40:0x00b2, B:41:0x00b5), top: B:95:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d4 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, NumberFormatException -> 0x01be, IndexOutOfBoundsException -> 0x01c0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:3:0x0006, B:5:0x0018, B:6:0x001a, B:8:0x0026, B:9:0x0028, B:11:0x0037, B:13:0x003d, B:17:0x0052, B:19:0x0062, B:20:0x0064, B:22:0x0070, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:47:0x00c7, B:49:0x00cd, B:51:0x00d4, B:76:0x0182, B:56:0x00e0, B:57:0x00f9, B:58:0x00fa, B:62:0x0116, B:64:0x0123, B:67:0x012c, B:69:0x014b, B:72:0x015a, B:73:0x017c, B:75:0x017f, B:61:0x0105, B:78:0x01b4, B:79:0x01bb, B:40:0x00b2, B:41:0x00b5), top: B:95:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:60:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0105 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, NumberFormatException -> 0x01be, IndexOutOfBoundsException -> 0x01c0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:3:0x0006, B:5:0x0018, B:6:0x001a, B:8:0x0026, B:9:0x0028, B:11:0x0037, B:13:0x003d, B:17:0x0052, B:19:0x0062, B:20:0x0064, B:22:0x0070, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:47:0x00c7, B:49:0x00cd, B:51:0x00d4, B:76:0x0182, B:56:0x00e0, B:57:0x00f9, B:58:0x00fa, B:62:0x0116, B:64:0x0123, B:67:0x012c, B:69:0x014b, B:72:0x015a, B:73:0x017c, B:75:0x017f, B:61:0x0105, B:78:0x01b4, B:79:0x01bb, B:40:0x00b2, B:41:0x00b5), top: B:95:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x017f A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, NumberFormatException -> 0x01be, IndexOutOfBoundsException -> 0x01c0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:3:0x0006, B:5:0x0018, B:6:0x001a, B:8:0x0026, B:9:0x0028, B:11:0x0037, B:13:0x003d, B:17:0x0052, B:19:0x0062, B:20:0x0064, B:22:0x0070, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:47:0x00c7, B:49:0x00cd, B:51:0x00d4, B:76:0x0182, B:56:0x00e0, B:57:0x00f9, B:58:0x00fa, B:62:0x0116, B:64:0x0123, B:67:0x012c, B:69:0x014b, B:72:0x015a, B:73:0x017c, B:75:0x017f, B:61:0x0105, B:78:0x01b4, B:79:0x01bb, B:40:0x00b2, B:41:0x00b5), top: B:95:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b4 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, NumberFormatException -> 0x01be, IndexOutOfBoundsException -> 0x01c0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:3:0x0006, B:5:0x0018, B:6:0x001a, B:8:0x0026, B:9:0x0028, B:11:0x0037, B:13:0x003d, B:17:0x0052, B:19:0x0062, B:20:0x0064, B:22:0x0070, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:47:0x00c7, B:49:0x00cd, B:51:0x00d4, B:76:0x0182, B:56:0x00e0, B:57:0x00f9, B:58:0x00fa, B:62:0x0116, B:64:0x0123, B:67:0x012c, B:69:0x014b, B:72:0x015a, B:73:0x017c, B:75:0x017f, B:61:0x0105, B:78:0x01b4, B:79:0x01bb, B:40:0x00b2, B:41:0x00b5), top: B:95:0x0006 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x0105, please report this as an issue */
    public static java.util.Date parse(java.lang.String str, java.text.ParsePosition parsePosition) throws java.text.ParseException {
        java.lang.String str2;
        int i;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        java.lang.String strSubstring;
        int length;
        java.util.TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i5 = index + 4;
            int i6 = parseInt(str, index, i5);
            if (checkOffset(str, i5, '-')) {
                i5++;
            }
            int i7 = i5 + 2;
            int i8 = parseInt(str, i5, i7);
            if (checkOffset(str, i7, '-')) {
                i7++;
            }
            int i9 = i7 + 2;
            int i10 = parseInt(str, i7, i9);
            boolean zCheckOffset = checkOffset(str, i9, 'T');
            if (!zCheckOffset && str.length() <= i9) {
                java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(i6, i8 - 1, i10);
                parsePosition.setIndex(i9);
                return gregorianCalendar.getTime();
            }
            if (zCheckOffset) {
                int i11 = i9 + 1;
                int i12 = i11 + 2;
                int i13 = parseInt(str, i11, i12);
                if (checkOffset(str, i12, ':')) {
                    i12++;
                }
                int i14 = i12 + 2;
                i2 = parseInt(str, i12, i14);
                if (checkOffset(str, i14, ':')) {
                    i14++;
                }
                if (str.length() <= i14 || (cCharAt2 = str.charAt(i14)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i = i13;
                    i9 = i14;
                } else {
                    int i15 = i14 + 2;
                    i4 = parseInt(str, i14, i15);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (checkOffset(str, i15, '.')) {
                        int i16 = i15 + 1;
                        int iIndexOfNonDigit = indexOfNonDigit(str, i16 + 1);
                        int iMin = java.lang.Math.min(iIndexOfNonDigit, i16 + 3);
                        int i17 = parseInt(str, i16, iMin);
                        int i18 = iMin - i16;
                        if (i18 == 1) {
                            i17 *= 100;
                        } else if (i18 == 2) {
                            i17 *= 10;
                        }
                        i = i13;
                        i9 = iIndexOfNonDigit;
                        i3 = i17;
                    } else {
                        i = i13;
                        i9 = i15;
                        i3 = 0;
                    }
                }
                if (str.length() > i9) {
                    throw new java.lang.IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i9);
                if (cCharAt == 'Z') {
                    timeZone = TIMEZONE_UTC;
                    length = i9 + 1;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new java.lang.IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i9);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i9 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                        timeZone = TIMEZONE_UTC;
                    } else {
                        java.lang.String str3 = "GMT" + strSubstring;
                        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone(str3);
                        java.lang.String id = timeZone2.getID();
                        if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                            throw new java.lang.IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, i6);
                gregorianCalendar2.set(2, i8 - 1);
                gregorianCalendar2.set(5, i10);
                gregorianCalendar2.set(11, i);
                gregorianCalendar2.set(12, i2);
                gregorianCalendar2.set(13, i4);
                gregorianCalendar2.set(14, i3);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            if (str.length() > i9) {
                throw new java.lang.IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i9);
            if (cCharAt == 'Z') {
                timeZone = TIMEZONE_UTC;
                length = i9 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new java.lang.IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i9);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i9 + strSubstring.length();
                if (!"+0000".equals(strSubstring)) {
                    timeZone = TIMEZONE_UTC;
                } else {
                    timeZone = TIMEZONE_UTC;
                }
            }
            java.util.GregorianCalendar gregorianCalendar3 = new java.util.GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, i6);
            gregorianCalendar3.set(2, i8 - 1);
            gregorianCalendar3.set(5, i10);
            gregorianCalendar3.set(11, i);
            gregorianCalendar3.set(12, i2);
            gregorianCalendar3.set(13, i4);
            gregorianCalendar3.set(14, i3);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (java.lang.IllegalArgumentException | java.lang.IndexOutOfBoundsException | java.lang.NumberFormatException e) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = kotlin.text.Typography.quote + str + "'";
            }
            java.lang.String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            java.text.ParseException parseException = new java.text.ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    private static boolean checkOffset(java.lang.String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private static int parseInt(java.lang.String str, int i, int i2) throws java.lang.NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new java.lang.NumberFormatException(str);
        }
        if (i < i2) {
            i3 = i + 1;
            int iDigit = java.lang.Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new java.lang.NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i4 = -iDigit;
        } else {
            i3 = i;
            i4 = 0;
        }
        while (i3 < i2) {
            int i5 = i3 + 1;
            int iDigit2 = java.lang.Character.digit(str.charAt(i3), 10);
            if (iDigit2 < 0) {
                throw new java.lang.NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i4 = (i4 * 10) - iDigit2;
            i3 = i5;
        }
        return -i4;
    }

    private static void padInt(java.lang.StringBuilder sb, int i, int i2) {
        java.lang.String string = java.lang.Integer.toString(i);
        for (int length = i2 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    private static int indexOfNonDigit(java.lang.String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
