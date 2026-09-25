package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: PeriodGroupers.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/DayToWeekGrouper1;", "T", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseTimePeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodGrouper1;", "offset", "", "(I)V", "groupCriteria", "", "cal", "Ljava/util/Calendar;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DayToWeekGrouper1<T extends powerwatch.matrix.com.pwgen2android.shared.data.models.BaseTimePeriod> implements powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.PeriodGrouper1<T> {
    private final int offset;

    public DayToWeekGrouper1() {
        this(0, 1, null);
    }

    public DayToWeekGrouper1(int i) {
        this.offset = i;
    }

    public /* synthetic */ DayToWeekGrouper1(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.PeriodGrouper1
    public java.util.Map<java.lang.String, java.util.List<T>> groupBy(java.util.List<? extends T> list) {
        return powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.PeriodGrouper1.DefaultImpls.groupBy(this, list);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.PeriodGrouper1
    public java.lang.String groupCriteria(java.util.Calendar cal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cal, "cal");
        cal.add(11, this.offset);
        return powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.weekUniqueID(cal);
    }
}
