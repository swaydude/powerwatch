package powerwatch.matrix.com.pwgen2android.shared.extensions;

/* JADX INFO: compiled from: DateTimeExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0002*\u00020\u0005\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0005\u001a\u0012\u0010\b\u001a\u00020\t*\u00020\u00052\u0006\u0010\n\u001a\u00020\t\u001a\n\u0010\u000b\u001a\u00020\t*\u00020\u0005\u001a\u0012\u0010\u000b\u001a\u00020\t*\u00020\u00052\u0006\u0010\n\u001a\u00020\t\u001a\n\u0010\f\u001a\u00020\t*\u00020\u0005\u001a\n\u0010\r\u001a\u00020\u0002*\u00020\u0005\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0010\u001a\u00020\t*\u00020\u0005\u001a\u0012\u0010\u0010\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\t\u001a\n\u0010\u0012\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0001*\u00020\u0005\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u001a\u0012\u0010\u0017\u001a\u00020\u0016*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005\u001a\u0012\u0010\u0019\u001a\u00020\u0016*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005\u001a\n\u0010\u001a\u001a\u00020\u0016*\u00020\u0005\u001a\n\u0010\u001b\u001a\u00020\u0005*\u00020\u0005\u001a\u0014\u0010\u001c\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0016\u001a\n\u0010\u001e\u001a\u00020\t*\u00020\u0005\u001a\n\u0010\u001f\u001a\u00020\u0005*\u00020\u0005\u001a\n\u0010 \u001a\u00020\u0005*\u00020\u0005\u001a\n\u0010!\u001a\u00020\u0005*\u00020\u0005\u001a\u0016\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020#*\u00020\u0002\u001a\n\u0010$\u001a\u00020\t*\u00020\u0005\u001a\u0014\u0010%\u001a\u00020\u0001*\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u0016\u001a\n\u0010&\u001a\u00020\t*\u00020\u0005\u001a\n\u0010'\u001a\u00020\u0001*\u00020\u0005\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00052\u0006\u0010)\u001a\u00020\u0001\u001a\n\u0010*\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010+\u001a\u00020\u0002*\u00020\u0005\u001a\n\u0010,\u001a\u00020\u0002*\u00020\u0005\u001a\n\u0010-\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010.\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010/\u001a\u00020\u0001*\u00020\u0005\u001a\n\u00100\u001a\u00020\t*\u00020\u0005\u001a\n\u00101\u001a\u00020\u0005*\u00020\u0005\u001a\u0012\u00102\u001a\u00020\u0005*\u00020\u00052\u0006\u00103\u001a\u00020\t\u001a\n\u00104\u001a\u00020\u0005*\u00020\u0005\u001a\n\u00105\u001a\u00020\u0005*\u00020\u0005\u001a\n\u00106\u001a\u00020\u0002*\u00020\u0002\u001a\n\u00107\u001a\u00020\u0005*\u00020\u0005\u001a\n\u00108\u001a\u00020\u0005*\u00020\u0005\u001a\n\u00109\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010:\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010;\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010<\u001a\u00020\u0001*\u00020\u0005\u001a\u0014\u0010=\u001a\u00020\u0005*\u00020\u00022\b\b\u0002\u0010>\u001a\u00020?\u001a\n\u0010@\u001a\u00020\u0001*\u00020\u0005\u001a\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00010B*\u00020C2\b\b\u0002\u0010D\u001a\u00020E\u001a\n\u0010F\u001a\u00020\t*\u00020\u0005\u001a\n\u0010G\u001a\u00020\u0002*\u00020\u0005\u001a\n\u0010H\u001a\u00020\t*\u00020\u0005\u001a\u0012\u0010H\u001a\u00020\t*\u00020\u00052\u0006\u0010\n\u001a\u00020\t\u001a\n\u0010I\u001a\u00020\t*\u00020\u0005\u001a\n\u0010J\u001a\u00020\u0002*\u00020\u0005\u001a\n\u0010K\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010L\u001a\u00020\t*\u00020\u0005¨\u0006M"}, d2 = {"activityShareDateFormat", "", "", "completeTimeFormat", "copy", "Ljava/util/Calendar;", "dateFormat", "dayHoursOffsetFromToday", "dayInWeek", "", "hourOffset", "dayOfMonth", "dayOfYear", "dayOffsetFromToday", "dayUniqueID", "gpxTimeFormat", "hourInDay", "offset", "hourMinSecTimeFormat", "hourUniqueID", "hoursMinutesTimeFormat", "pmAm", "", "isSameDay", "dateToCompare", "isSameMonth", "isToday", "midnight", "millisToHoursAndMinutesFormat", "showHAndM", "minInHour", "minusDay", "minusMonth", "minusWeek", "minutesAndSeconds", "Lkotlin/Pair;", "minutesFromMidnight", "minutesToHoursAndMinutesFormat", "month", "monthDayFormatText", "monthDayYearFormatText", "languageKey", "monthFormatText", "monthHoursOffsetFromToday", "monthOffsetFromToday", "monthUniqueID", "monthWeekYearFormatText", "monthYearFormatText", "numOfDaysInMonth", "plusDay", "plusDays", "numOfDays", "plusMonth", "plusWeek", "roundMillisToSeconds", "startOfTheMonth", "startOfWeek", "timeToRawString", "toCalendar", "toDateString", "toDateStringDashed", "toZonedCalendar", "timeZone", "Ljava/util/TimeZone;", "weekDayName", "weekDaysByLocale", "", "Ljava/text/DateFormatSymbols;", "locale", "Ljava/util/Locale;", "weekFromEpoch", "weekHoursOffsetFromToday", "weekOfMonth", "weekOfYear", "weekOffsetFromToday", "weekUniqueID", "year", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class DateTimeExtensionsKt {
    public static final java.lang.String toDateString(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        java.lang.String str = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:s", java.util.Locale.getDefault()).format(calendar.getTime());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "SimpleDateFormat(\"dd/MM/yyyy HH:mm:s\", Locale.getDefault()).format(this.time)");
        return str;
    }

    public static final java.lang.String toDateStringDashed(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        java.lang.String str = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.getDefault()).format(calendar.getTime());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "SimpleDateFormat(\"yyyy-MM-dd HH:mm:ss\", Locale.getDefault()).format(this.time)");
        return str;
    }

    public static final java.lang.String monthDayFormatText(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        java.lang.String str = new java.text.SimpleDateFormat("MMMM, d", java.util.Locale.getDefault()).format(new java.util.Date(calendar.getTimeInMillis()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "formatter.format(Date(timeInMillis))");
        return str;
    }

    public static final java.lang.String weekDayName(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        java.lang.String str = new java.text.DateFormatSymbols().getWeekdays()[calendar.get(7)];
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "weekdays[this.get(DAY_OF_WEEK)]");
        return str;
    }

    public static final boolean isToday(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        java.util.Calendar today = java.util.Calendar.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(today, "today");
        return dayOfMonth(today) == dayOfMonth(calendar) && month(today) == month(calendar) && year(today) == year(calendar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    public static final java.lang.String monthDayYearFormatText(java.util.Calendar calendar, java.lang.String languageKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageKey, "languageKey");
        int iHashCode = languageKey.hashCode();
        java.lang.String str = "MM月dd日, YYYY";
        if (iHashCode != 3383) {
            if (iHashCode != 3428) {
                if (iHashCode != 115861276) {
                    if (iHashCode != 115861812 || !languageKey.equals("zh_TW")) {
                        str = "MMMM d, yyyy";
                    }
                } else if (languageKey.equals("zh_CN")) {
                    str = "MM月d日, YYYY";
                } else {
                    str = "MMMM d, yyyy";
                }
            } else if (languageKey.equals("ko")) {
                str = "MM월dd일, YYYY";
            } else {
                str = "MMMM d, yyyy";
            }
        } else if (!languageKey.equals("ja")) {
            str = "MMMM d, yyyy";
        }
        java.lang.String str2 = new java.text.SimpleDateFormat(str, java.util.Locale.getDefault()).format(new java.util.Date(calendar.getTimeInMillis()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "formatter.format(Date(timeInMillis))");
        return str2;
    }

    public static final java.lang.String monthYearFormatText(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        java.lang.String str = new java.text.SimpleDateFormat("MMMM, yyyy", java.util.Locale.getDefault()).format(new java.util.Date(calendar.getTimeInMillis()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "formatter.format(Date(timeInMillis))");
        return str;
    }

    public static final java.lang.String monthWeekYearFormatText(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(calendar.getTimeZone());
        calendar2.setTime(calendar.getTime());
        calendar2.set(7, calendar.getFirstDayOfWeek());
        java.lang.String str = new java.text.SimpleDateFormat("MMMM dd", java.util.Locale.getDefault()).format(calendar2.getTime());
        if (calendar.getFirstDayOfWeek() == 1) {
            calendar2.set(7, 7);
        } else {
            calendar2.set(7, 1);
        }
        return str + " - " + ((java.lang.Object) new java.text.SimpleDateFormat("dd.yyyy", java.util.Locale.getDefault()).format(calendar2.getTime()));
    }

    public static final java.lang.String monthFormatText(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        java.lang.String str = new java.text.SimpleDateFormat("MMMM", java.util.Locale.getDefault()).format(new java.util.Date(calendar.getTimeInMillis()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "formatter.format(Date(timeInMillis))");
        return str;
    }

    public static final java.lang.String timeToRawString(long j) {
        java.lang.String str = new java.text.SimpleDateFormat("MMddYYYYHHmmss", java.util.Locale.getDefault()).format(java.lang.Long.valueOf(j));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "SimpleDateFormat(\"MMddYYYYHHmmss\", Locale.getDefault()).format(this)");
        return str;
    }

    public static final kotlin.Pair<java.lang.Long, java.lang.Long> minutesAndSeconds(long j) {
        return new kotlin.Pair<>(java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(j)), java.lang.Long.valueOf((j / ((long) 1000)) % ((long) 60)));
    }

    public static final long roundMillisToSeconds(long j) {
        return (j / ((long) 60000)) * ((long) 60) * 1000;
    }

    public static /* synthetic */ java.lang.String millisToHoursAndMinutesFormat$default(long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return millisToHoursAndMinutesFormat(j, z);
    }

    public static final java.lang.String millisToHoursAndMinutesFormat(long j, boolean z) {
        long j2 = j / ((long) 60000);
        long j3 = 60;
        long j4 = j2 / j3;
        long j5 = j2 - (j3 * j4);
        if (!z) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String str = java.lang.String.format("%s:%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j4), java.lang.Long.valueOf(j5)}, 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            return str;
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str2 = java.lang.String.format("%sh:%sm", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j4), java.lang.Long.valueOf(j5)}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        return str2;
    }

    public static /* synthetic */ java.lang.String minutesToHoursAndMinutesFormat$default(int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return minutesToHoursAndMinutesFormat(i, z);
    }

    public static final java.lang.String minutesToHoursAndMinutesFormat(int i, boolean z) {
        int i2 = i / 60;
        int i3 = i - (i2 * 60);
        if (!z) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String str = java.lang.String.format("%s:%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)}, 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            return str;
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str2 = java.lang.String.format("%sh:%sm", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        return str2;
    }

    public static final java.lang.String hourMinSecTimeFormat(long j) {
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toHours(j))}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str2 = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(j) - java.util.concurrent.TimeUnit.HOURS.toMinutes(java.util.concurrent.TimeUnit.MILLISECONDS.toHours(j)))}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject3 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str3 = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(j) - java.util.concurrent.TimeUnit.MINUTES.toSeconds(java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(j)))}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "java.lang.String.format(format, *args)");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject4 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str4 = java.lang.String.format("%s:%s:%s", java.util.Arrays.copyOf(new java.lang.Object[]{str, str2, str3}, 3));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "java.lang.String.format(format, *args)");
        return str4;
    }

    public static final java.lang.String completeTimeFormat(long j) {
        long hours = java.util.concurrent.TimeUnit.MILLISECONDS.toHours(j);
        long minutes = java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(j) - java.util.concurrent.TimeUnit.HOURS.toMinutes(java.util.concurrent.TimeUnit.MILLISECONDS.toHours(j));
        long seconds = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(j) - java.util.concurrent.TimeUnit.MINUTES.toSeconds(java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(j));
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format("%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(minutes)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str2 = java.lang.String.format("%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(seconds)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject3 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str3 = minutes > 0 ? java.lang.String.format("%sm%ss", java.util.Arrays.copyOf(new java.lang.Object[]{str, str2}, 2)) : java.lang.String.format("%ss", java.util.Arrays.copyOf(new java.lang.Object[]{str2}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "java.lang.String.format(format, *args)");
        if (hours <= 0) {
            return str3;
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject4 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str4 = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toHours(j))}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "java.lang.String.format(format, *args)");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject5 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str5 = java.lang.String.format("%sh%sm%ss", java.util.Arrays.copyOf(new java.lang.Object[]{str4, str, str2}, 3));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "java.lang.String.format(format, *args)");
        return str5;
    }

    public static final java.lang.String gpxTimeFormat(long j) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.getDefault());
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        java.lang.String str = simpleDateFormat.format(toCalendar(j).getTime());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(date)");
        return str;
    }

    public static final java.lang.String dateFormat(long j) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.getDefault());
        simpleDateFormat.setTimeZone(java.util.TimeZone.getDefault());
        java.lang.String str = simpleDateFormat.format(toCalendar(j).getTime());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(this.toCalendar().time)");
        return str;
    }

    public static final java.lang.String activityShareDateFormat(long j) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd_HH-mm", java.util.Locale.getDefault());
        simpleDateFormat.setTimeZone(java.util.TimeZone.getDefault());
        java.lang.String str = simpleDateFormat.format(toCalendar(j).getTime());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(this.toCalendar().time)");
        return str;
    }

    public static /* synthetic */ java.lang.String hoursMinutesTimeFormat$default(long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return hoursMinutesTimeFormat(j, z);
    }

    public static final java.lang.String hoursMinutesTimeFormat(long j, boolean z) {
        java.lang.String str = new java.text.SimpleDateFormat(z ? "hh:mma" : "HH:mm", java.util.Locale.getDefault()).format(new java.util.Date(j));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "SimpleDateFormat(pattern, Locale.getDefault()).format(date)");
        return str;
    }

    public static /* synthetic */ java.util.Calendar toZonedCalendar$default(long j, java.util.TimeZone timeZone, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            timeZone = java.util.TimeZone.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault()");
        }
        return toZonedCalendar(j, timeZone);
    }

    public static final java.util.Calendar toZonedCalendar(long j, java.util.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        java.util.Calendar calendar = java.util.Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
        return calendar;
    }

    public static final java.util.Calendar toCalendar(long j) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(j);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
        return calendar;
    }

    public static final java.util.Calendar midnight(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public static final java.util.Calendar startOfWeek(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        calendar.set(7, calendar.getFirstDayOfWeek());
        midnight(calendar);
        return calendar;
    }

    public static final java.util.Calendar startOfTheMonth(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        calendar.set(5, calendar.getMinimum(5));
        midnight(calendar);
        return calendar;
    }

    public static final int year(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        return calendar.get(1);
    }

    public static final int dayOfMonth(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        return calendar.get(5);
    }

    public static final int dayOfMonth(java.util.Calendar calendar, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        java.util.Calendar calendarCopy = copy(calendar);
        calendarCopy.add(11, i);
        return calendarCopy.get(5);
    }

    public static final int dayInWeek(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        int i = calendar.get(7);
        if (calendar.getFirstDayOfWeek() == 1) {
            return i - 1;
        }
        if (i == 1) {
            return 6;
        }
        return i - 2;
    }

    public static final int dayInWeek(java.util.Calendar calendar, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        java.util.Calendar calendarCopy = copy(calendar);
        calendarCopy.add(11, i);
        int i2 = calendarCopy.get(7);
        if (calendarCopy.getFirstDayOfWeek() == 1) {
            return i2 - 1;
        }
        if (i2 == 1) {
            return 6;
        }
        return i2 - 2;
    }

    public static final int dayOfYear(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        return calendar.get(6);
    }

    public static final int weekOfYear(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        return calendar.get(3);
    }

    public static final int weekOfMonth(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        return calendar.get(3);
    }

    public static final int weekOfMonth(java.util.Calendar calendar, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        java.util.Calendar calendarCopy = copy(calendar);
        calendarCopy.add(11, i);
        return calendarCopy.get(3);
    }

    public static final int month(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        return calendar.get(2) + 1;
    }

    public static final int hourInDay(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        return calendar.get(11);
    }

    public static final int hourInDay(java.util.Calendar calendar, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        java.util.Calendar calendarCopy = copy(calendar);
        calendarCopy.add(11, i);
        return calendarCopy.get(11);
    }

    public static final int minInHour(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        return calendar.get(12) + 1;
    }

    public static final int weekFromEpoch(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        calendar.add(1, -1970);
        return calendar.get(2) + (calendar.get(1) * 52);
    }

    public static final boolean isSameDay(java.util.Calendar calendar, java.util.Calendar dateToCompare) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateToCompare, "dateToCompare");
        return calendar.get(0) == dateToCompare.get(0) && year(calendar) == year(dateToCompare) && dayOfYear(calendar) == dateToCompare.get(6);
    }

    public static final boolean isSameMonth(java.util.Calendar calendar, java.util.Calendar dateToCompare) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateToCompare, "dateToCompare");
        return calendar.get(0) == dateToCompare.get(0) && year(calendar) == year(dateToCompare) && month(calendar) == month(dateToCompare);
    }

    public static final java.util.Calendar minusDay(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        calendar.add(5, -1);
        return calendar;
    }

    public static final java.util.Calendar plusDay(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        calendar.add(5, 1);
        return calendar;
    }

    public static final java.util.Calendar plusDays(java.util.Calendar calendar, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        calendar.add(5, i);
        return calendar;
    }

    public static final java.util.Calendar minusWeek(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        calendar.add(3, -1);
        return calendar;
    }

    public static final java.util.Calendar plusWeek(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        calendar.add(3, 1);
        return calendar;
    }

    public static final java.util.Calendar minusMonth(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        calendar.add(2, -1);
        return calendar;
    }

    public static final java.util.Calendar plusMonth(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        calendar.add(2, 1);
        return calendar;
    }

    public static final long dayHoursOffsetFromToday(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        midnight(calendar);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        calendar2.add(11, 1);
        return java.lang.Math.round((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / ((double) 3600000)) - ((long) 24);
    }

    public static final long weekHoursOffsetFromToday(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        calendar2.add(11, 1);
        startOfWeek(calendar);
        return java.lang.Math.round((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / ((double) 3600000)) - ((long) powerwatch.matrix.com.pwgen2android.shared.data.models.ActivityConstantsKt.WEEK_HOURS_PAGE_LIMIT);
    }

    public static final long monthHoursOffsetFromToday(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        calendar2.add(11, 1);
        startOfTheMonth(calendar);
        return java.lang.Math.round((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / ((double) 3600000)) - ((long) (numOfDaysInMonth(calendar) * 24));
    }

    public static final long dayOffsetFromToday(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        java.util.Calendar today = java.util.Calendar.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(today, "today");
        midnight(today);
        return java.lang.Math.round((today.getTimeInMillis() - calendar.getTimeInMillis()) / ((double) 86400000));
    }

    public static final long weekOffsetFromToday(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        return kotlin.math.MathKt.roundToLong((java.util.Calendar.getInstance().getTimeInMillis() - calendar.getTimeInMillis()) / ((double) 604800000));
    }

    public static final long monthOffsetFromToday(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        calendar.set(5, calendar.getMinimum(5));
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(5, calendar.getMinimum(5));
        return ((calendar2.get(1) - calendar.get(1)) * 12) + (calendar2.get(2) - calendar.get(2));
    }

    public static final int numOfDaysInMonth(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        return calendar.getActualMaximum(5);
    }

    public static final java.lang.String hourUniqueID(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        return calendar.get(11) + "H/" + calendar.get(5) + "D/" + (calendar.get(2) + 1) + "M/" + calendar.get(1) + 'Y';
    }

    public static final java.lang.String monthUniqueID(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        return (calendar.get(2) + 1) + "M/" + calendar.get(1) + 'Y';
    }

    public static final java.lang.String dayUniqueID(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        return calendar.get(5) + "D/" + (calendar.get(2) + 1) + "M/" + calendar.get(1) + 'Y';
    }

    public static final java.lang.String weekUniqueID(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        int iDayInWeek = dayInWeek(calendar);
        int i = calendar.get(3);
        int i2 = calendar.get(1);
        java.util.Calendar calendarCopy = copy(calendar);
        calendarCopy.add(5, 6 - iDayInWeek);
        if (i2 != calendarCopy.get(1)) {
            return i + "W/" + (i2 + 1) + 'Y';
        }
        return i + "W/" + i2 + 'Y';
    }

    public static final java.util.Calendar copy(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        return (java.util.Calendar) calendar.clone();
    }

    public static final int minutesFromMidnight(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        return (calendar.get(11) * 60) + calendar.get(12);
    }

    public static /* synthetic */ java.util.List weekDaysByLocale$default(java.text.DateFormatSymbols dateFormatSymbols, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        return weekDaysByLocale(dateFormatSymbols, locale);
    }

    public static final java.util.List<java.lang.String> weekDaysByLocale(java.text.DateFormatSymbols dateFormatSymbols, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormatSymbols, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        java.util.Calendar calendar = java.util.Calendar.getInstance(locale);
        java.lang.String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(shortWeekdays, "shortWeekdays");
        java.lang.String[] strArr = shortWeekdays;
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String it : strArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
            java.lang.String upperCase = it.toUpperCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            arrayList.add(upperCase);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        java.util.List<java.lang.String> mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) arrayList2);
        if (calendar.getFirstDayOfWeek() == 2) {
            java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.first((java.util.List) mutableList);
            mutableList.remove(0);
            mutableList.add(mutableList.size(), str);
        }
        return mutableList;
    }
}
