package powerwatch.matrix.com.pwgen2android.shared.ui.calendar;

/* JADX INFO: compiled from: CalendarView.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;", "", "weekOfMonth", "", "weekOfYear", "year", "date", "Ljava/util/Date;", "days", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;", "(IIILjava/util/Date;Ljava/util/List;)V", "getDate", "()Ljava/util/Date;", "getDays", "()Ljava/util/List;", "getWeekOfMonth", "()I", "getWeekOfYear", "getYear", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class WeekRow {
    private final java.util.Date date;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell> days;
    private final int weekOfMonth;
    private final int weekOfYear;
    private final int year;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.calendar.WeekRow copy$default(powerwatch.matrix.com.pwgen2android.shared.ui.calendar.WeekRow weekRow, int i, int i2, int i3, java.util.Date date, java.util.List list, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = weekRow.weekOfMonth;
        }
        if ((i4 & 2) != 0) {
            i2 = weekRow.weekOfYear;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = weekRow.year;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            date = weekRow.date;
        }
        java.util.Date date2 = date;
        if ((i4 & 16) != 0) {
            list = weekRow.days;
        }
        return weekRow.copy(i, i5, i6, date2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWeekOfMonth() {
        return this.weekOfMonth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWeekOfYear() {
        return this.weekOfYear;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.util.Date getDate() {
        return this.date;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell> component5() {
        return this.days;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.calendar.WeekRow copy(int weekOfMonth, int weekOfYear, int year, java.util.Date date, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell> days) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(days, "days");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.calendar.WeekRow(weekOfMonth, weekOfYear, year, date, days);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.ui.calendar.WeekRow)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.calendar.WeekRow weekRow = (powerwatch.matrix.com.pwgen2android.shared.ui.calendar.WeekRow) other;
        return this.weekOfMonth == weekRow.weekOfMonth && this.weekOfYear == weekRow.weekOfYear && this.year == weekRow.year && kotlin.jvm.internal.Intrinsics.areEqual(this.date, weekRow.date) && kotlin.jvm.internal.Intrinsics.areEqual(this.days, weekRow.days);
    }

    public int hashCode() {
        return (((((((this.weekOfMonth * 31) + this.weekOfYear) * 31) + this.year) * 31) + this.date.hashCode()) * 31) + this.days.hashCode();
    }

    public java.lang.String toString() {
        return "WeekRow(weekOfMonth=" + this.weekOfMonth + ", weekOfYear=" + this.weekOfYear + ", year=" + this.year + ", date=" + this.date + ", days=" + this.days + ')';
    }

    public WeekRow(int i, int i2, int i3, java.util.Date date, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell> days) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(days, "days");
        this.weekOfMonth = i;
        this.weekOfYear = i2;
        this.year = i3;
        this.date = date;
        this.days = days;
    }

    public final int getWeekOfMonth() {
        return this.weekOfMonth;
    }

    public final int getWeekOfYear() {
        return this.weekOfYear;
    }

    public final int getYear() {
        return this.year;
    }

    public final java.util.Date getDate() {
        return this.date;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell> getDays() {
        return this.days;
    }
}
