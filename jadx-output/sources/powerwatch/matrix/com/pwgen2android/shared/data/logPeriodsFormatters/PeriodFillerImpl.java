package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: PeriodFiller.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0005¢\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl;", "INPUT", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/BaseLog;", "OUTPUT", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFiller;", "()V", "fill", "output", "inputs", "", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;", "mergePeriod", "periodToMerge", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class PeriodFillerImpl<INPUT extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog, OUTPUT extends powerwatch.matrix.com.pwgen2android.shared.data.models.BaseActivityPeriod> implements powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.PeriodFiller<INPUT, OUTPUT> {
    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.PeriodFiller
    public OUTPUT fill(OUTPUT output, java.util.List<? extends INPUT> inputs) {
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.Object next3;
        java.lang.Object next4;
        java.lang.Object next5;
        java.lang.Object next6;
        java.lang.Object next7;
        java.lang.Object next8;
        java.lang.Object next9;
        float f;
        java.lang.Object next10;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputs, "inputs");
        java.util.List<? extends INPUT> list = inputs;
        java.util.Iterator<T> it = list.iterator();
        int activeCalories = 0;
        while (it.hasNext()) {
            activeCalories += ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) it.next()).getActiveCalories();
        }
        java.util.Iterator<T> it2 = list.iterator();
        int bmrCalories = 0;
        while (it2.hasNext()) {
            bmrCalories += ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) it2.next()).getBmrCalories();
        }
        java.util.Iterator<T> it3 = list.iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                long startTime = ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next).getStartTime();
                do {
                    java.lang.Object next11 = it3.next();
                    long startTime2 = ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next11).getStartTime();
                    if (startTime > startTime2) {
                        next = next11;
                        startTime = startTime2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog baseLog = (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next;
        long startTime3 = baseLog == null ? 0L : baseLog.getStartTime();
        java.util.Iterator<T> it4 = list.iterator();
        if (it4.hasNext()) {
            next2 = it4.next();
            if (it4.hasNext()) {
                long endTime = ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next2).getEndTime();
                do {
                    java.lang.Object next12 = it4.next();
                    long endTime2 = ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next12).getEndTime();
                    if (endTime < endTime2) {
                        next2 = next12;
                        endTime = endTime2;
                    }
                } while (it4.hasNext());
            }
        } else {
            next2 = null;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog baseLog2 = (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next2;
        long endTime3 = baseLog2 != null ? baseLog2.getEndTime() : 0L;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) obj).getMinHeartRate() > 0) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it5 = arrayList.iterator();
        if (it5.hasNext()) {
            next3 = it5.next();
            if (it5.hasNext()) {
                int minHeartRate = ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next3).getMinHeartRate();
                do {
                    java.lang.Object next13 = it5.next();
                    int minHeartRate2 = ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next13).getMinHeartRate();
                    if (minHeartRate > minHeartRate2) {
                        next3 = next13;
                        minHeartRate = minHeartRate2;
                    }
                } while (it5.hasNext());
            }
        } else {
            next3 = null;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog baseLog3 = (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next3;
        int minHeartRate3 = baseLog3 == null ? 0 : baseLog3.getMinHeartRate();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) obj2).getHeartRate() > 0.0f) {
                arrayList2.add(obj2);
            }
        }
        java.util.ArrayList arrayList3 = arrayList2;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            arrayList4.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) it6.next()).getHeartRate()));
        }
        float fAverageOfFloat = (float) kotlin.collections.CollectionsKt.averageOfFloat(arrayList4);
        float f2 = java.lang.Float.isNaN(fAverageOfFloat) ? 0.0f : fAverageOfFloat;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            if (((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) obj3).getMaxHeartRate() > 0) {
                arrayList5.add(obj3);
            }
        }
        java.util.Iterator it7 = arrayList5.iterator();
        if (it7.hasNext()) {
            next4 = it7.next();
            if (it7.hasNext()) {
                int maxHeartRate = ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next4).getMaxHeartRate();
                do {
                    java.lang.Object next14 = it7.next();
                    int maxHeartRate2 = ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next14).getMaxHeartRate();
                    if (maxHeartRate < maxHeartRate2) {
                        maxHeartRate = maxHeartRate2;
                        next4 = next14;
                    }
                } while (it7.hasNext());
            }
        } else {
            next4 = null;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog baseLog4 = (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next4;
        int maxHeartRate3 = baseLog4 == null ? 0 : baseLog4.getMaxHeartRate();
        java.util.Iterator<T> it8 = list.iterator();
        int minsInPeriod = 0;
        while (it8.hasNext()) {
            minsInPeriod += ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) it8.next()).getMinsInPeriod();
        }
        java.util.Iterator<T> it9 = list.iterator();
        int i = maxHeartRate3;
        double bodyPower = 0.0d;
        while (it9.hasNext()) {
            bodyPower += (double) ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) it9.next()).getBodyPower();
            minHeartRate3 = minHeartRate3;
        }
        int i2 = minHeartRate3;
        java.util.Iterator<T> it10 = list.iterator();
        double solarPower = 0.0d;
        while (it10.hasNext()) {
            solarPower += (double) ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) it10.next()).getSolarPower();
            bodyPower = bodyPower;
        }
        double d = bodyPower;
        java.util.Iterator<T> it11 = list.iterator();
        if (it11.hasNext()) {
            next5 = it11.next();
            if (it11.hasNext()) {
                float maxSkinTemp = ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next5).getMaxSkinTemp();
                while (true) {
                    java.lang.Object next15 = it11.next();
                    java.lang.Object obj4 = next5;
                    float maxSkinTemp2 = ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next15).getMaxSkinTemp();
                    if (java.lang.Float.compare(maxSkinTemp, maxSkinTemp2) < 0) {
                        maxSkinTemp = maxSkinTemp2;
                        next5 = next15;
                    } else {
                        next5 = obj4;
                    }
                    if (!it11.hasNext()) {
                        break;
                    }
                    i2 = i2;
                    i = i;
                    d = d;
                }
            }
        } else {
            next5 = null;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog baseLog5 = (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next5;
        float maxSkinTemp3 = baseLog5 == null ? 0.0f : baseLog5.getMaxSkinTemp();
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it12 = list.iterator();
        while (it12.hasNext()) {
            arrayList6.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) it12.next()).getSkinTemp()));
        }
        float f3 = maxSkinTemp3;
        float fAverageOfFloat2 = (float) kotlin.collections.CollectionsKt.averageOfFloat(arrayList6);
        java.util.Iterator<T> it13 = list.iterator();
        do {
            if (!it13.hasNext()) {
                next6 = null;
                break;
            }
            next6 = it13.next();
        } while (!(((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next6).getHrv() > 0.0f));
        powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog baseLog6 = (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next6;
        float hrv = baseLog6 == null ? 0.0f : baseLog6.getHrv();
        java.util.Iterator<T> it14 = list.iterator();
        if (it14.hasNext()) {
            next7 = it14.next();
            if (it14.hasNext()) {
                float caseTemp = ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next7).getCaseTemp();
                while (true) {
                    java.lang.Object next16 = it14.next();
                    java.lang.Object obj5 = next7;
                    float caseTemp2 = ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next16).getCaseTemp();
                    if (java.lang.Float.compare(caseTemp, caseTemp2) < 0) {
                        caseTemp = caseTemp2;
                        next7 = next16;
                    } else {
                        next7 = obj5;
                    }
                    if (!it14.hasNext()) {
                        break;
                    }
                    i2 = i2;
                    i = i;
                    d = d;
                }
            }
        } else {
            next7 = null;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog baseLog7 = (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next7;
        float caseTemp3 = baseLog7 == null ? 0.0f : baseLog7.getCaseTemp();
        java.util.Iterator<T> it15 = list.iterator();
        if (it15.hasNext()) {
            next8 = it15.next();
            if (it15.hasNext()) {
                java.lang.Object obj6 = next8;
                float caseTemp4 = ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next8).getCaseTemp();
                while (true) {
                    next9 = it15.next();
                    f = caseTemp3;
                    float caseTemp5 = ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next9).getCaseTemp();
                    if (java.lang.Float.compare(caseTemp4, caseTemp5) > 0) {
                        caseTemp4 = caseTemp5;
                    } else {
                        next9 = obj6;
                    }
                    if (!it15.hasNext()) {
                        break;
                    }
                    obj6 = next9;
                    caseTemp3 = f;
                    i2 = i2;
                    i = i;
                    d = d;
                }
                next8 = next9;
            } else {
                f = caseTemp3;
            }
        } else {
            f = caseTemp3;
            next8 = null;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog baseLog8 = (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next8;
        float caseTemp6 = baseLog8 == null ? 0.0f : baseLog8.getCaseTemp();
        java.util.Iterator<T> it16 = list.iterator();
        if (it16.hasNext()) {
            next10 = it16.next();
            if (it16.hasNext()) {
                float minSkinTemp = ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next10).getMinSkinTemp();
                while (true) {
                    java.lang.Object next17 = it16.next();
                    java.lang.Object obj7 = next10;
                    float minSkinTemp2 = ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next17).getMinSkinTemp();
                    if (java.lang.Float.compare(minSkinTemp, minSkinTemp2) > 0) {
                        minSkinTemp = minSkinTemp2;
                        next10 = next17;
                    } else {
                        next10 = obj7;
                    }
                    if (!it16.hasNext()) {
                        break;
                    }
                    i2 = i2;
                    i = i;
                    d = d;
                }
            }
        } else {
            next10 = null;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog baseLog9 = (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) next10;
        float minSkinTemp3 = baseLog9 == null ? 0.0f : baseLog9.getMinSkinTemp();
        output.setStartTime(startTime3);
        output.setEndTime(endTime3);
        output.setMinsInPeriod(minsInPeriod);
        output.setActiveCalories(activeCalories);
        output.setBmrCalories(bmrCalories);
        output.setHeartRate(f2);
        output.setMaxHeartRate(i);
        output.setMinHeartRate(i2);
        output.setBodyPower((float) d);
        output.setSolarPower((float) solarPower);
        output.setPeakTemp(f3);
        output.setHrv(hrv);
        output.setSkinTemp(fAverageOfFloat2);
        output.setMaxSkinTemp(f3);
        output.setMinSkinTemp(minSkinTemp3);
        output.setMaxCaseTemp(f);
        output.setMinCaseTemp(caseTemp6);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        return output;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.PeriodFiller
    public OUTPUT mergePeriod(OUTPUT output, OUTPUT periodToMerge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periodToMerge, "periodToMerge");
        int minsInPeriod = output.getMinsInPeriod() + periodToMerge.getMinsInPeriod();
        if (minsInPeriod > 0) {
            double d = minsInPeriod;
            output.setHeartRate(output.getHeartRate() * kotlin.math.MathKt.roundToInt(((double) output.getMinsInPeriod()) / d));
            periodToMerge.getHeartRate();
            kotlin.math.MathKt.roundToInt(((double) periodToMerge.getMinsInPeriod()) / d);
            output.setSkinTemp(output.getSkinTemp() * kotlin.math.MathKt.roundToInt(((double) output.getMinsInPeriod()) / d));
            periodToMerge.getSkinTemp();
            kotlin.math.MathKt.roundToInt(((double) periodToMerge.getMinsInPeriod()) / d);
        }
        output.setPeakTemp(java.lang.Math.max(output.getPeakTemp(), periodToMerge.getPeakTemp()));
        output.setMaxCaseTemp(java.lang.Math.max(output.getMaxCaseTemp(), periodToMerge.getMaxCaseTemp()));
        output.setMinCaseTemp(java.lang.Math.min(output.getMinCaseTemp(), periodToMerge.getMinCaseTemp()));
        output.setMaxSkinTemp(java.lang.Math.max(output.getMaxSkinTemp(), periodToMerge.getMaxSkinTemp()));
        output.setMinSkinTemp(java.lang.Math.min(output.getMinSkinTemp(), periodToMerge.getMinSkinTemp()));
        output.setMinHeartRate(java.lang.Math.min(output.getMinHeartRate(), periodToMerge.getMinHeartRate()));
        output.setMaxHeartRate(java.lang.Math.min(output.getMaxHeartRate(), periodToMerge.getMaxHeartRate()));
        output.setBodyPower(output.getBodyPower() + periodToMerge.getBodyPower());
        output.setSolarPower(output.getSolarPower() + periodToMerge.getSolarPower());
        output.setActiveCalories(output.getActiveCalories() + periodToMerge.getActiveCalories());
        output.setBmrCalories(output.getBmrCalories() + periodToMerge.getBmrCalories());
        output.setStartTime(periodToMerge.getStartTime());
        output.setMinsInPeriod(output.getMinsInPeriod() + periodToMerge.getMinsInPeriod());
        return output;
    }
}
