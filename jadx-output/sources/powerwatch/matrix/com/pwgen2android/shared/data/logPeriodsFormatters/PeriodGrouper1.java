package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: PeriodGroupers.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J(\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodGrouper1;", "T", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseTimePeriod;", "", "groupBy", "", "", "", "data", "groupCriteria", "cal", "Ljava/util/Calendar;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface PeriodGrouper1<T extends powerwatch.matrix.com.pwgen2android.shared.data.models.BaseTimePeriod> {
    java.util.Map<java.lang.String, java.util.List<T>> groupBy(java.util.List<? extends T> data);

    java.lang.String groupCriteria(java.util.Calendar cal);

    /* JADX INFO: compiled from: PeriodGroupers.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static <T extends powerwatch.matrix.com.pwgen2android.shared.data.models.BaseTimePeriod> java.util.Map<java.lang.String, java.util.List<T>> groupBy(powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.PeriodGrouper1<T> periodGrouper1, java.util.List<? extends T> data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periodGrouper1, "this");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.lang.Object obj : data) {
                java.lang.String strGroupCriteria = periodGrouper1.groupCriteria(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toZonedCalendar$default(((powerwatch.matrix.com.pwgen2android.shared.data.models.BaseTimePeriod) obj).getStartTime(), null, 1, null));
                java.lang.Object obj2 = linkedHashMap.get(strGroupCriteria);
                if (obj2 == null) {
                    obj2 = (java.util.List) new java.util.ArrayList();
                    linkedHashMap.put(strGroupCriteria, obj2);
                }
                ((java.util.List) obj2).add(obj);
            }
            return linkedHashMap;
        }
    }
}
