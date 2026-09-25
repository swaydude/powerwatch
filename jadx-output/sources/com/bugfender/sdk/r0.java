package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
class r0 {
    private static final java.lang.String a = "GMT";
    private static final java.util.TimeZone b = java.util.TimeZone.getTimeZone(a);

    r0() {
    }

    private static int a(java.lang.String str, int i, int i2) throws java.lang.NumberFormatException {
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new java.lang.NumberFormatException(str);
        }
        int i3 = 0;
        if (i < i2) {
            int i4 = i + 1;
            int iDigit = java.lang.Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new java.lang.NumberFormatException("Invalid number: " + str);
            }
            i3 = -iDigit;
            i = i4;
        }
        while (i < i2) {
            int i5 = i + 1;
            int iDigit2 = java.lang.Character.digit(str.charAt(i), 10);
            if (iDigit2 < 0) {
                throw new java.lang.NumberFormatException("Invalid number: " + str);
            }
            i3 = (i3 * 10) - iDigit2;
            i = i5;
        }
        return -i3;
    }

    public static java.lang.String a(java.util.Date date) {
        return a(date, false, b);
    }

    public static java.lang.String a(java.util.Date date, boolean z) {
        return a(date, z, b);
    }

    public static java.lang.String a(java.util.Date date, boolean z, java.util.TimeZone timeZone) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(timeZone, java.util.Locale.US);
        gregorianCalendar.setTime(date);
        java.lang.StringBuilder sb = new java.lang.StringBuilder((z ? 4 : 0) + 19 + (timeZone.getRawOffset() == 0 ? 1 : 6));
        a(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        a(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        a(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        a(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        a(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        a(sb, gregorianCalendar.get(13), 2);
        if (z) {
            sb.append('.');
            a(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int iAbs = java.lang.Math.abs(i / 60);
            int iAbs2 = java.lang.Math.abs(i % 60);
            sb.append(offset >= 0 ? '+' : '-');
            a(sb, iAbs, 2);
            sb.append(':');
            a(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    public static java.util.Date a(java.lang.String str) {
        int iA;
        try {
            int iA2 = a(str, 0, 4);
            a(str, 4, '-');
            int iA3 = a(str, 5, 7);
            a(str, 7, '-');
            int iA4 = a(str, 8, 10);
            a(str, 10, 'T');
            int iA5 = a(str, 11, 13);
            a(str, 13, ':');
            int iA6 = a(str, 14, 16);
            a(str, 16, ':');
            int i = 19;
            int iA7 = a(str, 17, 19);
            if (str.charAt(19) == '.') {
                a(str, 19, '.');
                i = 23;
                iA = a(str, 20, 23);
            } else {
                iA = 0;
            }
            char cCharAt = str.charAt(i);
            java.lang.String str2 = a;
            if (cCharAt == '+' || cCharAt == '-') {
                str2 = a + str.substring(i);
            } else if (cCharAt != 'Z') {
                throw new java.lang.IndexOutOfBoundsException("Invalid time zone indicator " + cCharAt);
            }
            java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone(str2);
            if (!timeZone.getID().equals(str2)) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(timeZone);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, iA2);
            gregorianCalendar.set(2, iA3 - 1);
            gregorianCalendar.set(5, iA4);
            gregorianCalendar.set(11, iA5);
            gregorianCalendar.set(12, iA6);
            gregorianCalendar.set(13, iA7);
            gregorianCalendar.set(14, iA);
            return gregorianCalendar.getTime();
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.lang.IllegalArgumentException("Failed to parse date " + str, e);
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new java.lang.IllegalArgumentException("Failed to parse date " + str, e2);
        } catch (java.lang.NumberFormatException e3) {
            throw new java.lang.IllegalArgumentException("Failed to parse date " + str, e3);
        }
    }

    private static void a(java.lang.String str, int i, char c) throws java.lang.IndexOutOfBoundsException {
        char cCharAt = str.charAt(i);
        if (cCharAt == c) {
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("Expected '" + c + "' character but found '" + cCharAt + "'");
    }

    private static void a(java.lang.StringBuilder sb, int i, int i2) {
        java.lang.String string = java.lang.Integer.toString(i);
        for (int length = i2 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }
}
