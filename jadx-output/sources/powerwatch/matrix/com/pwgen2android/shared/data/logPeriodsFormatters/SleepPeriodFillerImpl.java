package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: PeriodFiller.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0005¢\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl;", "INPUT", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;", "OUTPUT", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl;", "()V", "fill", "output", "inputs", "", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepPeriodFillerImpl<INPUT extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepBaseLog, OUTPUT extends powerwatch.matrix.com.pwgen2android.shared.data.models.SleepBasePeriod> extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.PeriodFillerImpl<INPUT, OUTPUT> {
    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.PeriodFillerImpl
    public OUTPUT fill(OUTPUT output, java.util.List<? extends INPUT> inputs) {
        java.lang.Object next;
        int iIntValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputs, "inputs");
        OUTPUT output2 = (OUTPUT) super.fill(output, (java.util.List) inputs);
        final java.util.List<? extends INPUT> list = inputs;
        java.util.Iterator it = kotlin.collections.GroupingKt.eachCount(new kotlin.collections.Grouping<INPUT, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepPeriodFillerImpl$fill$$inlined$groupingBy$1
            @Override // kotlin.collections.Grouping
            public java.util.Iterator<INPUT> sourceIterator() {
                return list.iterator();
            }

            @Override // kotlin.collections.Grouping
            public powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType keyOf(INPUT element) {
                return ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepBaseLog) element).getSleepType();
            }
        }).entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iIntValue2 = ((java.lang.Number) ((java.util.Map.Entry) next).getValue()).intValue();
                do {
                    java.lang.Object next2 = it.next();
                    int iIntValue3 = ((java.lang.Number) ((java.util.Map.Entry) next2).getValue()).intValue();
                    if (iIntValue2 < iIntValue3) {
                        next = next2;
                        iIntValue2 = iIntValue3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) next;
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType = entry != null ? (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType) entry.getKey() : null;
        if (sleepType == null) {
            sleepType = powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.RESTLESS;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it2 = list.iterator();
        while (true) {
            iIntValue = 0;
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next3 = it2.next();
            if (((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepBaseLog) next3).getSleepType() == powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.RESTLESS) {
                arrayList.add(next3);
            }
        }
        java.util.ArrayList<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepBaseLog> arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepBaseLog sleepBaseLog : arrayList2) {
            arrayList3.add(java.lang.Integer.valueOf(kotlin.math.MathKt.roundToInt((sleepBaseLog.getEndTime() - sleepBaseLog.getStartTime()) / ((double) 60000))));
        }
        java.util.ArrayList arrayList4 = arrayList3;
        if (!arrayList4.isEmpty()) {
            java.util.Iterator it3 = arrayList4.iterator();
            if (!it3.hasNext()) {
                throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
            }
            java.lang.Object next4 = it3.next();
            while (it3.hasNext()) {
                next4 = java.lang.Integer.valueOf(((java.lang.Number) next4).intValue() + ((java.lang.Number) it3.next()).intValue());
            }
            iIntValue = ((java.lang.Number) next4).intValue();
        }
        output2.setRestlessMinutes(iIntValue);
        output2.setSleepType(sleepType);
        return output2;
    }
}
