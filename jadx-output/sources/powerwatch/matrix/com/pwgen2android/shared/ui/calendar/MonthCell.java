package powerwatch.matrix.com.pwgen2android.shared.ui.calendar;

/* JADX INFO: compiled from: CalendarView.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003JW\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006)"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "isCurrentMonth", "", "month", "year", "date", "Ljava/util/Date;", "label", "", "weeks", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;", "(IZIILjava/util/Date;Ljava/lang/String;Ljava/util/List;)V", "getDate", "()Ljava/util/Date;", "getIndex", "()I", "()Z", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "getMonth", "getWeeks", "()Ljava/util/List;", "getYear", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class MonthCell {
    private final java.util.Date date;
    private final int index;
    private final boolean isCurrentMonth;
    private java.lang.String label;
    private final int month;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.WeekRow> weeks;
    private final int year;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCell copy$default(powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCell monthCell, int i, boolean z, int i2, int i3, java.util.Date date, java.lang.String str, java.util.List list, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = monthCell.index;
        }
        if ((i4 & 2) != 0) {
            z = monthCell.isCurrentMonth;
        }
        boolean z2 = z;
        if ((i4 & 4) != 0) {
            i2 = monthCell.month;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = monthCell.year;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            date = monthCell.date;
        }
        java.util.Date date2 = date;
        if ((i4 & 32) != 0) {
            str = monthCell.label;
        }
        java.lang.String str2 = str;
        if ((i4 & 64) != 0) {
            list = monthCell.weeks;
        }
        return monthCell.copy(i, z2, i5, i6, date2, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsCurrentMonth() {
        return this.isCurrentMonth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.util.Date getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.WeekRow> component7() {
        return this.weeks;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCell copy(int index, boolean isCurrentMonth, int month, int year, java.util.Date date, java.lang.String label, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.WeekRow> weeks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weeks, "weeks");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCell(index, isCurrentMonth, month, year, date, label, weeks);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCell)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCell monthCell = (powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCell) other;
        return this.index == monthCell.index && this.isCurrentMonth == monthCell.isCurrentMonth && this.month == monthCell.month && this.year == monthCell.year && kotlin.jvm.internal.Intrinsics.areEqual(this.date, monthCell.date) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, monthCell.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.weeks, monthCell.weeks);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    public int hashCode() {
        int i = this.index * 31;
        boolean z = this.isCurrentMonth;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode = (((((((i + r1) * 31) + this.month) * 31) + this.year) * 31) + this.date.hashCode()) * 31;
        java.lang.String str = this.label;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.weeks.hashCode();
    }

    public java.lang.String toString() {
        return "MonthCell(index=" + this.index + ", isCurrentMonth=" + this.isCurrentMonth + ", month=" + this.month + ", year=" + this.year + ", date=" + this.date + ", label=" + ((java.lang.Object) this.label) + ", weeks=" + this.weeks + ')';
    }

    public MonthCell(int i, boolean z, int i2, int i3, java.util.Date date, java.lang.String str, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.WeekRow> weeks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weeks, "weeks");
        this.index = i;
        this.isCurrentMonth = z;
        this.month = i2;
        this.year = i3;
        this.date = date;
        this.label = str;
        this.weeks = weeks;
    }

    public /* synthetic */ MonthCell(int i, boolean z, int i2, int i3, java.util.Date date, java.lang.String str, java.util.List list, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, i2, i3, date, (i4 & 32) != 0 ? null : str, list);
    }

    public final int getIndex() {
        return this.index;
    }

    public final boolean isCurrentMonth() {
        return this.isCurrentMonth;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getYear() {
        return this.year;
    }

    public final java.util.Date getDate() {
        return this.date;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final void setLabel(java.lang.String str) {
        this.label = str;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.WeekRow> getWeeks() {
        return this.weeks;
    }
}
