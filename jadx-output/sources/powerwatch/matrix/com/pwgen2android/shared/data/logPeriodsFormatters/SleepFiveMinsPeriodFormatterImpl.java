package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: SleepPeriodFormatters.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0014R\u0014\u0010\n\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;", "periods", "", "lastStoredPeriod", "offset", "", "(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;I)V", "emptyPeriod", "getEmptyPeriod", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;", "filler", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl;", "formatFromRecords", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepFiveMinsPeriodFormatterImpl extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod, powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepBaseLog> {
    private final powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepPeriodFillerImpl<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepBaseLog, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> filler;
    private final powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod lastStoredPeriod;
    private final int offset;

    public /* synthetic */ SleepFiveMinsPeriodFormatterImpl(java.util.List list, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod sleepFiveMinPeriod, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, sleepFiveMinPeriod, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepFiveMinsPeriodFormatterImpl(java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepBaseLog> periods, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod sleepFiveMinPeriod, int i) {
        super(periods, false, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        this.lastStoredPeriod = sleepFiveMinPeriod;
        this.offset = i;
        this.filler = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepPeriodFillerImpl<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter
    public powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod getEmptyPeriod() {
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod(0L, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0L, 0.0f, 0, 0, 0L, 0, 0, 0.0f, 0.0f, 0.0f, 0, 4194303, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter
    protected java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> formatFromRecords(java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepBaseLog> periods) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        if (this.lastStoredPeriod != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : periods) {
                if (((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepBaseLog) obj).getStartTime() > this.lastStoredPeriod.getStartTime()) {
                    arrayList.add(obj);
                }
            }
            periods = arrayList;
        }
        java.util.Map mapGroupBy = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.LogToFiveMinGrouper1(this.offset).groupBy(periods);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(mapGroupBy.size());
        java.util.Iterator it = mapGroupBy.entrySet().iterator();
        while (it.hasNext()) {
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod sleepFiveMinPeriodMergePeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod) this.filler.fill(getEmptyPeriod(), (java.util.List) ((java.util.Map.Entry) it.next()).getValue());
            sleepFiveMinPeriodMergePeriod.setFiveMinsInHour(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.minInHour(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toZonedCalendar$default(sleepFiveMinPeriodMergePeriod.getStartTime(), null, 1, null)));
            if (this.lastStoredPeriod != null && sleepFiveMinPeriodMergePeriod.getStartTime() > this.lastStoredPeriod.getStartTime() && this.lastStoredPeriod.getFiveMinsInHour() == sleepFiveMinPeriodMergePeriod.getFiveMinsInHour()) {
                sleepFiveMinPeriodMergePeriod = this.filler.mergePeriod(sleepFiveMinPeriodMergePeriod, this.lastStoredPeriod);
            }
            arrayList2.add(sleepFiveMinPeriodMergePeriod);
        }
        return arrayList2;
    }
}
