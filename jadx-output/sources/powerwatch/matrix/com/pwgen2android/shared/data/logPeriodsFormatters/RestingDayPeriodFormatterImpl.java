package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: RestingPeriodFormatters.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0014R\u0014\u0010\u0007\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingDayPeriodFormatterImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;", "periods", "", "(Ljava/util/List;)V", "emptyPeriod", "getEmptyPeriod", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;", "filler", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingPeriodFillerImpl;", "formatFromRecords", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RestingDayPeriodFormatterImpl extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod, powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> {
    private final powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingPeriodFillerImpl<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod, powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> filler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestingDayPeriodFormatterImpl(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> periods) {
        super(periods, false, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        this.filler = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingPeriodFillerImpl<>();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter
    protected java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> formatFromRecords(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> periods) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        java.util.Map mapGroupBy = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.HourToDayGrouper1(0, 1, null).groupBy(periods);
        java.util.ArrayList arrayList = new java.util.ArrayList(mapGroupBy.size());
        for (java.util.Map.Entry entry : mapGroupBy.entrySet()) {
            powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriodFill = this.filler.fill(getEmptyPeriod(), (java.util.List) entry.getValue());
            restingDayPeriodFill.setRestingHours((java.util.List) entry.getValue());
            restingDayPeriodFill.setDayInMonth(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayOfMonth(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toZonedCalendar$default(restingDayPeriodFill.getStartTime(), null, 1, null)));
            restingDayPeriodFill.setDayInWeek(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayInWeek(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toZonedCalendar$default(restingDayPeriodFill.getStartTime(), null, 1, null)));
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            float fAverageOfFloat = 0.0f;
            if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
                java.util.Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) it.next()).getHeartRate() == 0.0f) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            restingDayPeriodFill.setMalformed(z);
            java.lang.Iterable iterable2 = (java.lang.Iterable) entry.getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : iterable2) {
                if (((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) obj).getHrv() > 0.0f) {
                    arrayList2.add(obj);
                }
            }
            java.util.ArrayList arrayList3 = arrayList2;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            java.util.Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) it2.next()).getHrv()));
            }
            java.util.ArrayList arrayList5 = arrayList4;
            if (!arrayList5.isEmpty()) {
                fAverageOfFloat = (float) kotlin.collections.CollectionsKt.averageOfFloat(arrayList5);
            }
            restingDayPeriodFill.setHrv(fAverageOfFloat);
            arrayList.add(restingDayPeriodFill);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.AbstractPeriodFormatter
    public powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod getEmptyPeriod() {
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 4194303, null);
    }
}
