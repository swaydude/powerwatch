package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
class DateStrings {
    private DateStrings() {
    }

    static java.lang.String getYearMonthDay(long j) {
        return getYearMonthDay(j, java.util.Locale.getDefault());
    }

    static java.lang.String getYearMonthDay(long j, java.util.Locale locale) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return com.google.android.material.datepicker.UtcDates.getYearAbbrMonthDayFormat(locale).format(new java.util.Date(j));
        }
        return com.google.android.material.datepicker.UtcDates.getMediumFormat(locale).format(new java.util.Date(j));
    }

    static java.lang.String getMonthDay(long j) {
        return getMonthDay(j, java.util.Locale.getDefault());
    }

    static java.lang.String getMonthDay(long j, java.util.Locale locale) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return com.google.android.material.datepicker.UtcDates.getAbbrMonthDayFormat(locale).format(new java.util.Date(j));
        }
        return com.google.android.material.datepicker.UtcDates.getMediumNoYear(locale).format(new java.util.Date(j));
    }

    static java.lang.String getMonthDayOfWeekDay(long j) {
        return getMonthDayOfWeekDay(j, java.util.Locale.getDefault());
    }

    static java.lang.String getMonthDayOfWeekDay(long j, java.util.Locale locale) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return com.google.android.material.datepicker.UtcDates.getAbbrMonthWeekdayDayFormat(locale).format(new java.util.Date(j));
        }
        return com.google.android.material.datepicker.UtcDates.getFullFormat(locale).format(new java.util.Date(j));
    }

    static java.lang.String getYearMonthDayOfWeekDay(long j) {
        return getYearMonthDayOfWeekDay(j, java.util.Locale.getDefault());
    }

    static java.lang.String getYearMonthDayOfWeekDay(long j, java.util.Locale locale) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return com.google.android.material.datepicker.UtcDates.getYearAbbrMonthWeekdayDayFormat(locale).format(new java.util.Date(j));
        }
        return com.google.android.material.datepicker.UtcDates.getFullFormat(locale).format(new java.util.Date(j));
    }

    static java.lang.String getDateString(long j) {
        return getDateString(j, null);
    }

    static java.lang.String getDateString(long j, java.text.SimpleDateFormat simpleDateFormat) {
        java.util.Calendar todayCalendar = com.google.android.material.datepicker.UtcDates.getTodayCalendar();
        java.util.Calendar calendar = com.google.android.material.datepicker.UtcDates.getCalendar();
        calendar.setTimeInMillis(j);
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new java.util.Date(j));
        }
        if (todayCalendar.get(1) == calendar.get(1)) {
            return getMonthDay(j);
        }
        return getYearMonthDay(j);
    }

    static androidx.core.util.Pair<java.lang.String, java.lang.String> getDateRangeString(java.lang.Long l, java.lang.Long l2) {
        return getDateRangeString(l, l2, null);
    }

    static androidx.core.util.Pair<java.lang.String, java.lang.String> getDateRangeString(java.lang.Long l, java.lang.Long l2, java.text.SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return androidx.core.util.Pair.create(null, null);
        }
        if (l == null) {
            return androidx.core.util.Pair.create(null, getDateString(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return androidx.core.util.Pair.create(getDateString(l.longValue(), simpleDateFormat), null);
        }
        java.util.Calendar todayCalendar = com.google.android.material.datepicker.UtcDates.getTodayCalendar();
        java.util.Calendar calendar = com.google.android.material.datepicker.UtcDates.getCalendar();
        calendar.setTimeInMillis(l.longValue());
        java.util.Calendar calendar2 = com.google.android.material.datepicker.UtcDates.getCalendar();
        calendar2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return androidx.core.util.Pair.create(simpleDateFormat.format(new java.util.Date(l.longValue())), simpleDateFormat.format(new java.util.Date(l2.longValue())));
        }
        if (calendar.get(1) == calendar2.get(1)) {
            if (calendar.get(1) == todayCalendar.get(1)) {
                return androidx.core.util.Pair.create(getMonthDay(l.longValue(), java.util.Locale.getDefault()), getMonthDay(l2.longValue(), java.util.Locale.getDefault()));
            }
            return androidx.core.util.Pair.create(getMonthDay(l.longValue(), java.util.Locale.getDefault()), getYearMonthDay(l2.longValue(), java.util.Locale.getDefault()));
        }
        return androidx.core.util.Pair.create(getYearMonthDay(l.longValue(), java.util.Locale.getDefault()), getYearMonthDay(l2.longValue(), java.util.Locale.getDefault()));
    }
}
