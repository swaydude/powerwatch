package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
class UtcDates {
    static final java.lang.String UTC = "UTC";

    private UtcDates() {
    }

    static java.util.TimeZone getTimeZone() {
        return java.util.TimeZone.getTimeZone(UTC);
    }

    private static android.icu.util.TimeZone getAndroidTimeZone() {
        return android.icu.util.TimeZone.getTimeZone(UTC);
    }

    static java.util.Calendar getTodayCalendar() {
        return getDayCopy(java.util.Calendar.getInstance());
    }

    static java.util.Calendar getCalendar() {
        java.util.Calendar calendar = java.util.Calendar.getInstance(getTimeZone());
        calendar.clear();
        return calendar;
    }

    static java.util.Calendar getDayCopy(java.util.Calendar calendar) {
        java.util.Calendar calendar2 = getCalendar();
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5));
        return calendar2;
    }

    static long canonicalYearMonthDay(long j) {
        java.util.Calendar calendar = getCalendar();
        calendar.setTimeInMillis(j);
        return getDayCopy(calendar).getTimeInMillis();
    }

    private static android.icu.text.DateFormat getAndroidFormat(java.lang.String str, java.util.Locale locale) {
        android.icu.text.DateFormat instanceForSkeleton = android.icu.text.DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(getAndroidTimeZone());
        return instanceForSkeleton;
    }

    private static java.text.DateFormat getFormat(int i, java.util.Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(getTimeZone());
        return dateInstance;
    }

    static java.text.SimpleDateFormat getSimpleFormat(java.lang.String str) {
        return getSimpleFormat(str, java.util.Locale.getDefault());
    }

    private static java.text.SimpleDateFormat getSimpleFormat(java.lang.String str, java.util.Locale locale) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(getTimeZone());
        return simpleDateFormat;
    }

    static android.icu.text.DateFormat getYearAbbrMonthDayFormat(java.util.Locale locale) {
        return getAndroidFormat("yMMMd", locale);
    }

    static android.icu.text.DateFormat getAbbrMonthDayFormat(java.util.Locale locale) {
        return getAndroidFormat("MMMd", locale);
    }

    static android.icu.text.DateFormat getAbbrMonthWeekdayDayFormat(java.util.Locale locale) {
        return getAndroidFormat("MMMEd", locale);
    }

    static android.icu.text.DateFormat getYearAbbrMonthWeekdayDayFormat(java.util.Locale locale) {
        return getAndroidFormat("yMMMEd", locale);
    }

    static java.text.DateFormat getMediumFormat() {
        return getMediumFormat(java.util.Locale.getDefault());
    }

    static java.text.DateFormat getMediumFormat(java.util.Locale locale) {
        return getFormat(2, locale);
    }

    static java.text.DateFormat getMediumNoYear() {
        return getMediumNoYear(java.util.Locale.getDefault());
    }

    static java.text.DateFormat getMediumNoYear(java.util.Locale locale) {
        java.text.SimpleDateFormat simpleDateFormat = (java.text.SimpleDateFormat) getMediumFormat(locale);
        simpleDateFormat.applyPattern(removeYearFromDateFormatPattern(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    static java.text.DateFormat getFullFormat() {
        return getFullFormat(java.util.Locale.getDefault());
    }

    static java.text.DateFormat getFullFormat(java.util.Locale locale) {
        return getFormat(0, locale);
    }

    static java.text.SimpleDateFormat getYearMonthFormat() {
        return getYearMonthFormat(java.util.Locale.getDefault());
    }

    private static java.text.SimpleDateFormat getYearMonthFormat(java.util.Locale locale) {
        return getSimpleFormat("MMMM, yyyy", locale);
    }

    private static java.lang.String removeYearFromDateFormatPattern(java.lang.String str) {
        int iFindCharactersInDateFormatPattern = findCharactersInDateFormatPattern(str, "yY", 1, 0);
        if (iFindCharactersInDateFormatPattern >= str.length()) {
            return str;
        }
        java.lang.String str2 = "EMd";
        int iFindCharactersInDateFormatPattern2 = findCharactersInDateFormatPattern(str, "EMd", 1, iFindCharactersInDateFormatPattern);
        if (iFindCharactersInDateFormatPattern2 < str.length()) {
            str2 = "EMd,";
        }
        return str.replace(str.substring(findCharactersInDateFormatPattern(str, str2, -1, iFindCharactersInDateFormatPattern) + 1, iFindCharactersInDateFormatPattern2), " ").trim();
    }

    private static int findCharactersInDateFormatPattern(java.lang.String str, java.lang.String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 < 0 || i2 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i2) != '\'');
            }
            i2 += i;
        }
        return i2;
    }
}
