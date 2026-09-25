package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: WalkingPeriodFormatters.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0007J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0014R\u0014\u0010\b\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingWeekPeriodFormatterImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;", "periods", "", "lastStoredPeriod", "(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;)V", "emptyPeriod", "getEmptyPeriod", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;", "filler", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingBaseLog;", "formatFromRecords", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WalkingWeekPeriodFormatterImpl extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod, powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> {
    private final powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingPeriodFillerImpl<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingBaseLog, powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod> filler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkingWeekPeriodFormatterImpl(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> periods, powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod walkingWeekPeriod) {
        super(periods, false, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        this.filler = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingPeriodFillerImpl<>();
    }

    public /* synthetic */ WalkingWeekPeriodFormatterImpl(java.util.List list, powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod walkingWeekPeriod, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : walkingWeekPeriod);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter
    protected java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod> formatFromRecords(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> periods) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        java.util.Map mapGroupBy = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.DayToWeekGrouper1(0, 1, null).groupBy(periods);
        java.util.ArrayList arrayList = new java.util.ArrayList(mapGroupBy.size());
        for (java.util.Map.Entry entry : mapGroupBy.entrySet()) {
            powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod walkingWeekPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod) this.filler.fill(getEmptyPeriod(), (java.util.List) entry.getValue());
            walkingWeekPeriod.setWalkingDays((java.util.List) entry.getValue());
            walkingWeekPeriod.setWeekInMonth(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.weekOfMonth(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toZonedCalendar$default(walkingWeekPeriod.getStartTime(), null, 1, null)));
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
                java.util.Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) it.next()).getMalformed()) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
                break;
            }
            walkingWeekPeriod.setMalformed(z);
            arrayList.add(walkingWeekPeriod);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter
    public powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod getEmptyPeriod() {
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod(0L, 0L, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0d, 0, 0, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 8388607, null);
    }
}
