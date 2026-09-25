package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: RestingPeriodFormatters.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0014R\u0014\u0010\u0007\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingMonthPeriodFormatterImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingMonthPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;", "periods", "", "(Ljava/util/List;)V", "emptyPeriod", "getEmptyPeriod", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingMonthPeriod;", "filler", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingPeriodFillerImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingBaseLog;", "formatFromRecords", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RestingMonthPeriodFormatterImpl extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod, powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> {
    private final powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingPeriodFillerImpl<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingBaseLog, powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod> filler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestingMonthPeriodFormatterImpl(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> periods) {
        super(periods, false, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        this.filler = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingPeriodFillerImpl<>();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter
    protected java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod> formatFromRecords(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> periods) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        java.util.Map mapGroupBy = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WeekToMonthPeriodGrouper1(0, 1, null).groupBy(periods);
        java.util.ArrayList arrayList = new java.util.ArrayList(mapGroupBy.size());
        for (java.util.Map.Entry entry : mapGroupBy.entrySet()) {
            powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod restingMonthPeriodFill = this.filler.fill(getEmptyPeriod(), (java.util.List) entry.getValue());
            restingMonthPeriodFill.setRestingWeeks((java.util.List) entry.getValue());
            restingMonthPeriodFill.setMonthInYear(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.month(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toZonedCalendar$default(restingMonthPeriodFill.getStartTime(), null, 1, null)));
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
                java.util.Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod) it.next()).getMalformed()) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
                break;
            }
            restingMonthPeriodFill.setMalformed(z);
            arrayList.add(restingMonthPeriodFill);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter
    public powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod getEmptyPeriod() {
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 2097151, null);
    }
}
