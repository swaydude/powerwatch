package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: SleepPeriodFormatters.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0014R\u0014\u0010\t\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepHourPeriodFormatterImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;", "periods", "", "offset", "", "(Ljava/util/List;I)V", "emptyPeriod", "getEmptyPeriod", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;", "filler", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;", "formatFromRecords", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepHourPeriodFormatterImpl extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> {
    private final powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepPeriodFillerImpl<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepBaseLog, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> filler;
    private final int offset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepHourPeriodFormatterImpl(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> periods, int i) {
        super(periods, false, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        this.offset = i;
        this.filler = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepPeriodFillerImpl<>();
    }

    public /* synthetic */ SleepHourPeriodFormatterImpl(java.util.List list, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter
    public powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod getEmptyPeriod() {
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, null, null, 0L, 0, 0, 0.0f, 0.0f, 0.0f, 8388607, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter
    protected java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> formatFromRecords(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> periods) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        java.util.Map mapGroupBy = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.LogToHourGrouper1(this.offset).groupBy(periods);
        java.util.ArrayList arrayList = new java.util.ArrayList(mapGroupBy.size());
        for (java.util.Map.Entry entry : mapGroupBy.entrySet()) {
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHourPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) this.filler.fill(getEmptyPeriod(), (java.util.List) entry.getValue());
            sleepHourPeriod.setSleepFiveMins((java.util.List) entry.getValue());
            sleepHourPeriod.setHourInDay(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.hourInDay(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toZonedCalendar$default(sleepHourPeriod.getStartTime(), null, 1, null)));
            arrayList.add(sleepHourPeriod);
        }
        return arrayList;
    }
}
