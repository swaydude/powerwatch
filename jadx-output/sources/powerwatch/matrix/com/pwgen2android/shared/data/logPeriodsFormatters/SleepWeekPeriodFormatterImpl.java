package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: SleepPeriodFormatters.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0014R\u0014\u0010\t\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepWeekPeriodFormatterImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;", "periods", "", "hourOffset", "", "(Ljava/util/List;I)V", "emptyPeriod", "getEmptyPeriod", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;", "filler", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;", "formatFromRecords", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepWeekPeriodFormatterImpl extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod> {
    private final powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepPeriodFillerImpl<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepBaseLog, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod> filler;
    private final int hourOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepWeekPeriodFormatterImpl(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod> periods, int i) {
        super(periods, false, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        this.hourOffset = i;
        this.filler = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepPeriodFillerImpl<>();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter
    protected java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod> formatFromRecords(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod> periods) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        java.util.Map mapGroupBy = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.DayToWeekGrouper1(this.hourOffset).groupBy(periods);
        java.util.ArrayList arrayList = new java.util.ArrayList(mapGroupBy.size());
        for (java.util.Map.Entry entry : mapGroupBy.entrySet()) {
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod sleepWeekPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod) this.filler.fill(getEmptyPeriod(), (java.util.List) entry.getValue());
            sleepWeekPeriod.setSleepDays((java.util.List) entry.getValue());
            sleepWeekPeriod.setWeekInMonth(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.weekOfMonth(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toZonedCalendar$default(sleepWeekPeriod.getStartTime(), null, 1, null), this.hourOffset));
            arrayList.add(sleepWeekPeriod);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter
    public powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod getEmptyPeriod() {
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, null, 0L, 0, 0.0f, 0, 0.0f, 0.0f, null, 8388607, null);
    }
}
