package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent;

/* JADX INFO: compiled from: HeartRatePeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001\u001a\u001c\u0010\u0005\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\"\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0001\u001a\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b\u001a\u001e\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b\u001a\u001e\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b\u001a\u001e\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015¨\u0006\u001f"}, d2 = {"buildEntries", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;", "combinedData", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;", "buildHeaderValues", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateHeaderValues;", "hrv", "", "getMaximum", "", "combinedHeartRate", "lineChartData", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;", "processForArtificial", "", "walkingDay", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;", "restingDay", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;", "sleepDay", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;", "walkingHour", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;", "restingHour", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;", "sleepHour", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;", "processForValid", "processHourPeriod", "processWeekPeriod", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class HeartRatePeriodFormatterViewModelsKt {
    public static final boolean processForArtificial(powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod walkingHour, powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHour, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHour) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingHour, "walkingHour");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingHour, "restingHour");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepHour, "sleepHour");
        return walkingHour.getStartTime() == 0 && restingHour.getStartTime() == 0 && sleepHour.getStartTime() == 0;
    }

    public static final boolean processForValid(powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod walkingHour, powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHour, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHour) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingHour, "walkingHour");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingHour, "restingHour");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepHour, "sleepHour");
        if (walkingHour.getHeartRate() == 0.0f) {
            if (restingHour.getHeartRate() == 0.0f) {
                if (sleepHour.getHeartRate() == 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean processForArtificial(powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDay, powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDay, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDay) {
        boolean z;
        boolean z2;
        boolean z3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDay, "walkingDay");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingDay, "restingDay");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDay, "sleepDay");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> walkingHours = walkingDay.getWalkingHours();
        if (!(walkingHours instanceof java.util.Collection) || !walkingHours.isEmpty()) {
            java.util.Iterator<T> it = walkingHours.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                if (!(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) it.next()).getStartTime() == 0)) {
                    z = false;
                    break;
                }
            }
        } else {
            z = true;
            break;
        }
        if (!z) {
            return false;
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> restingHours = restingDay.getRestingHours();
        if (!(restingHours instanceof java.util.Collection) || !restingHours.isEmpty()) {
            java.util.Iterator<T> it2 = restingHours.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = true;
                    break;
                }
                if (!(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) it2.next()).getStartTime() == 0)) {
                    z2 = false;
                    break;
                }
            }
        } else {
            z2 = true;
            break;
        }
        if (!z2) {
            return false;
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> sleepHours = sleepDay.getSleepHours();
        if ((sleepHours instanceof java.util.Collection) && sleepHours.isEmpty()) {
            z3 = true;
        } else {
            java.util.Iterator<T> it3 = sleepHours.iterator();
            while (it3.hasNext()) {
                if (!(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) it3.next()).getStartTime() == 0)) {
                    z3 = false;
                }
            }
            z3 = true;
        }
        return z3;
    }

    public static final boolean processHourPeriod(powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod walkingHour, powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHour, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHour) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingHour, "walkingHour");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingHour, "restingHour");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepHour, "sleepHour");
        return (((walkingHour.getHeartRate() > 0.0f ? 1 : (walkingHour.getHeartRate() == 0.0f ? 0 : -1)) > 0 ? walkingHour.getMinsInPeriod() : 0) + ((restingHour.getHeartRate() > 0.0f ? 1 : (restingHour.getHeartRate() == 0.0f ? 0 : -1)) > 0 ? restingHour.getMinsInPeriod() : 0)) + ((sleepHour.getHeartRate() > 0.0f ? 1 : (sleepHour.getHeartRate() == 0.0f ? 0 : -1)) > 0 ? sleepHour.getMinsInPeriod() : 0) == 0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d4  */
    public static final boolean processWeekPeriod(powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDay, powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDay, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDay) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDay, "walkingDay");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingDay, "restingDay");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDay, "sleepDay");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> walkingHours = walkingDay.getWalkingHours();
        if (!(walkingHours instanceof java.util.Collection) || !walkingHours.isEmpty()) {
            java.util.Iterator<T> it = walkingHours.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod walkingHourPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) it.next();
                if (walkingHourPeriod.getStartTime() == 0) {
                    z = false;
                } else if (walkingHourPeriod.getHeartRate() == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        if (z2) {
            return true;
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> restingHours = restingDay.getRestingHours();
        if (!(restingHours instanceof java.util.Collection) || !restingHours.isEmpty()) {
            java.util.Iterator<T> it2 = restingHours.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z4 = false;
                    break;
                }
                powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHourPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) it2.next();
                if (restingHourPeriod.getStartTime() == 0) {
                    z3 = false;
                } else if (restingHourPeriod.getHeartRate() == 0.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    z4 = true;
                    break;
                }
            }
        } else {
            z4 = false;
            break;
        }
        if (z4) {
            return true;
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> sleepHours = sleepDay.getSleepHours();
        if ((sleepHours instanceof java.util.Collection) && sleepHours.isEmpty()) {
            z6 = false;
        } else {
            for (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHourPeriod : sleepHours) {
                if (sleepHourPeriod.getStartTime() == 0) {
                    z5 = false;
                } else if (sleepHourPeriod.getHeartRate() == 0.0f) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    z6 = true;
                }
            }
            z6 = false;
        }
        return z6;
    }

    public static final int getMaximum(java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer> combinedHeartRate, java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData> lineChartData) {
        java.lang.Object next;
        java.lang.Object next2;
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedHeartRate, "combinedHeartRate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineChartData, "lineChartData");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : combinedHeartRate) {
            if (!((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) obj).getMalformed()) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        java.lang.Float fValueOf = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int max = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) next).getMax();
                do {
                    java.lang.Object next3 = it.next();
                    int max2 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) next3).getMax();
                    if (max < max2) {
                        next = next3;
                        max = max2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer heartRateDataContainer = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) next;
        int max3 = heartRateDataContainer == null ? 0 : heartRateDataContainer.getMax();
        java.util.Iterator<T> it2 = lineChartData.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                float maxAvg = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next2).getAvgData().getMaxAvg();
                do {
                    java.lang.Object next4 = it2.next();
                    float maxAvg2 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next4).getAvgData().getMaxAvg();
                    if (java.lang.Float.compare(maxAvg, maxAvg2) < 0) {
                        next2 = next4;
                        maxAvg = maxAvg2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData avgLineChartData = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next2;
        if (avgLineChartData != null && (avgData = avgLineChartData.getAvgData()) != null) {
            fValueOf = java.lang.Float.valueOf(avgData.getMaxAvg());
        }
        return java.lang.Math.max(fValueOf == null ? max3 : kotlin.math.MathKt.roundToInt(fValueOf.floatValue()), max3);
    }

    public static final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData> buildEntries(java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer> combinedData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedData, "combinedData");
        java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer> list = combinedData;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer heartRateDataContainer = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) obj;
            arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData(i, heartRateDataContainer.getMax(), heartRateDataContainer.getMin(), heartRateDataContainer.getMax(), heartRateDataContainer.getMin(), heartRateDataContainer.getMalformed()));
            i = i2;
        }
        return arrayList;
    }

    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateHeaderValues buildHeaderValues(java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer> combinedData, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedData, "combinedData");
        java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer> list = combinedData;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) obj).getMalformed()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) it.next()).getAvg()));
        }
        double dAverageOfInt = kotlin.collections.CollectionsKt.averageOfInt(arrayList3);
        java.lang.String strValueOf = java.lang.Double.isNaN(dAverageOfInt) ? "0" : java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(dAverageOfInt));
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (!((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) obj2).getMalformed()) {
                arrayList4.add(obj2);
            }
        }
        java.util.ArrayList arrayList5 = arrayList4;
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        java.util.Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayList6.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) it2.next()).getMin()));
        }
        java.lang.Object objValueOf = (java.lang.Integer) kotlin.collections.CollectionsKt.minOrNull((java.lang.Iterable) arrayList6);
        if (objValueOf == null) {
            objValueOf = java.lang.Float.valueOf(0.0f);
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            if (!((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) obj3).getMalformed()) {
                arrayList7.add(obj3);
            }
        }
        java.util.ArrayList arrayList8 = arrayList7;
        java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList8, 10));
        java.util.Iterator it3 = arrayList8.iterator();
        while (it3.hasNext()) {
            arrayList9.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) it3.next()).getMax()));
        }
        java.lang.Object objValueOf2 = (java.lang.Integer) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) arrayList9);
        if (objValueOf2 == null) {
            objValueOf2 = java.lang.Float.valueOf(0.0f);
        }
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateHeaderValues(strValueOf, objValueOf + " - " + objValueOf2, java.lang.String.valueOf((int) d));
    }
}
