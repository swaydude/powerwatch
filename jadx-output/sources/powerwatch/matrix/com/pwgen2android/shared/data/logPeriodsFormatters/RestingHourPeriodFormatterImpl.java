package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: RestingPeriodFormatters.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0007J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0014R\u0014\u0010\b\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingHourPeriodFormatterImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingBaseLog;", "RestingLogs", "", "lastStoredPeriod", "(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;)V", "emptyPeriod", "getEmptyPeriod", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;", "filler", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingPeriodFillerImpl;", "formatFromRecords", "periods", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RestingHourPeriodFormatterImpl extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod, powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingBaseLog> {
    private final powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingPeriodFillerImpl<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingBaseLog, powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> filler;
    private final powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod lastStoredPeriod;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestingHourPeriodFormatterImpl(java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingBaseLog> RestingLogs, powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHourPeriod) {
        super(RestingLogs, false, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(RestingLogs, "RestingLogs");
        this.lastStoredPeriod = restingHourPeriod;
        this.filler = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingPeriodFillerImpl<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter
    public powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod getEmptyPeriod() {
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod(0L, 0L, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0L, 0, 0, 0.0f, 0.0f, 0.0f, 1048575, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter
    protected java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> formatFromRecords(java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingBaseLog> periods) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        if (this.lastStoredPeriod != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : periods) {
                if (((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingBaseLog) obj).getStartTime() > this.lastStoredPeriod.getStartTime()) {
                    arrayList.add(obj);
                }
            }
            periods = arrayList;
        }
        java.util.Map mapGroupBy = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.LogToHourGrouper1(0, 1, null).groupBy(periods);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(mapGroupBy.size());
        java.util.Iterator it = mapGroupBy.entrySet().iterator();
        while (it.hasNext()) {
            powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHourPeriodFill = this.filler.fill(getEmptyPeriod(), (java.util.List) ((java.util.Map.Entry) it.next()).getValue());
            restingHourPeriodFill.setHourInDay(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.hourInDay(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toZonedCalendar$default(restingHourPeriodFill.getStartTime(), null, 1, null)));
            if (this.lastStoredPeriod != null && restingHourPeriodFill.getStartTime() > this.lastStoredPeriod.getStartTime() && this.lastStoredPeriod.getHourInDay() == restingHourPeriodFill.getHourInDay()) {
                restingHourPeriodFill = this.filler.mergePeriod(restingHourPeriodFill, this.lastStoredPeriod);
            }
            arrayList2.add(restingHourPeriodFill);
        }
        return arrayList2;
    }
}
