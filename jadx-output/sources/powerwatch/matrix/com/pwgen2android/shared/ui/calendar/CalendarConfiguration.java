package powerwatch.matrix.com.pwgen2android.shared.ui.calendar;

/* JADX INFO: compiled from: CalendarView.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003JU\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;", "", "startDate", "Ljava/util/Calendar;", "endDate", "currentDate", "timeZone", "Ljava/util/TimeZone;", "locale", "Ljava/util/Locale;", "monthNameFormat", "Ljava/text/DateFormat;", "filledDates", "", "(Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/TimeZone;Ljava/util/Locale;Ljava/text/DateFormat;Ljava/util/List;)V", "getCurrentDate", "()Ljava/util/Calendar;", "getEndDate", "getFilledDates", "()Ljava/util/List;", "getLocale", "()Ljava/util/Locale;", "getMonthNameFormat", "()Ljava/text/DateFormat;", "getStartDate", "getTimeZone", "()Ljava/util/TimeZone;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class CalendarConfiguration {
    private final java.util.Calendar currentDate;
    private final java.util.Calendar endDate;
    private final java.util.List<java.util.Calendar> filledDates;
    private final java.util.Locale locale;
    private final java.text.DateFormat monthNameFormat;
    private final java.util.Calendar startDate;
    private final java.util.TimeZone timeZone;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration copy$default(powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration calendarConfiguration, java.util.Calendar calendar, java.util.Calendar calendar2, java.util.Calendar calendar3, java.util.TimeZone timeZone, java.util.Locale locale, java.text.DateFormat dateFormat, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            calendar = calendarConfiguration.startDate;
        }
        if ((i & 2) != 0) {
            calendar2 = calendarConfiguration.endDate;
        }
        java.util.Calendar calendar4 = calendar2;
        if ((i & 4) != 0) {
            calendar3 = calendarConfiguration.currentDate;
        }
        java.util.Calendar calendar5 = calendar3;
        if ((i & 8) != 0) {
            timeZone = calendarConfiguration.timeZone;
        }
        java.util.TimeZone timeZone2 = timeZone;
        if ((i & 16) != 0) {
            locale = calendarConfiguration.locale;
        }
        java.util.Locale locale2 = locale;
        if ((i & 32) != 0) {
            dateFormat = calendarConfiguration.monthNameFormat;
        }
        java.text.DateFormat dateFormat2 = dateFormat;
        if ((i & 64) != 0) {
            list = calendarConfiguration.filledDates;
        }
        return calendarConfiguration.copy(calendar, calendar4, calendar5, timeZone2, locale2, dateFormat2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.util.Calendar getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.util.Calendar getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.util.Calendar getCurrentDate() {
        return this.currentDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.util.TimeZone getTimeZone() {
        return this.timeZone;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.util.Locale getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final java.text.DateFormat getMonthNameFormat() {
        return this.monthNameFormat;
    }

    public final java.util.List<java.util.Calendar> component7() {
        return this.filledDates;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration copy(java.util.Calendar startDate, java.util.Calendar endDate, java.util.Calendar currentDate, java.util.TimeZone timeZone, java.util.Locale locale, java.text.DateFormat monthNameFormat, java.util.List<? extends java.util.Calendar> filledDates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDate, "startDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endDate, "endDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthNameFormat, "monthNameFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filledDates, "filledDates");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration(startDate, endDate, currentDate, timeZone, locale, monthNameFormat, filledDates);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration calendarConfiguration = (powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, calendarConfiguration.startDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.endDate, calendarConfiguration.endDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentDate, calendarConfiguration.currentDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.timeZone, calendarConfiguration.timeZone) && kotlin.jvm.internal.Intrinsics.areEqual(this.locale, calendarConfiguration.locale) && kotlin.jvm.internal.Intrinsics.areEqual(this.monthNameFormat, calendarConfiguration.monthNameFormat) && kotlin.jvm.internal.Intrinsics.areEqual(this.filledDates, calendarConfiguration.filledDates);
    }

    public int hashCode() {
        return (((((((((((this.startDate.hashCode() * 31) + this.endDate.hashCode()) * 31) + this.currentDate.hashCode()) * 31) + this.timeZone.hashCode()) * 31) + this.locale.hashCode()) * 31) + this.monthNameFormat.hashCode()) * 31) + this.filledDates.hashCode();
    }

    public java.lang.String toString() {
        return "CalendarConfiguration(startDate=" + this.startDate + ", endDate=" + this.endDate + ", currentDate=" + this.currentDate + ", timeZone=" + this.timeZone + ", locale=" + this.locale + ", monthNameFormat=" + this.monthNameFormat + ", filledDates=" + this.filledDates + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CalendarConfiguration(java.util.Calendar startDate, java.util.Calendar endDate, java.util.Calendar currentDate, java.util.TimeZone timeZone, java.util.Locale locale, java.text.DateFormat monthNameFormat, java.util.List<? extends java.util.Calendar> filledDates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDate, "startDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endDate, "endDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthNameFormat, "monthNameFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filledDates, "filledDates");
        this.startDate = startDate;
        this.endDate = endDate;
        this.currentDate = currentDate;
        this.timeZone = timeZone;
        this.locale = locale;
        this.monthNameFormat = monthNameFormat;
        this.filledDates = filledDates;
    }

    public final java.util.Calendar getCurrentDate() {
        return this.currentDate;
    }

    public final java.util.Calendar getEndDate() {
        return this.endDate;
    }

    public final java.util.Calendar getStartDate() {
        return this.startDate;
    }

    public final java.util.Locale getLocale() {
        return this.locale;
    }

    public final java.text.DateFormat getMonthNameFormat() {
        return this.monthNameFormat;
    }

    public final java.util.TimeZone getTimeZone() {
        return this.timeZone;
    }

    public final java.util.List<java.util.Calendar> getFilledDates() {
        return this.filledDates;
    }
}
