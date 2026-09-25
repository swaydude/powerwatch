package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel;

/* JADX INFO: compiled from: SleepLogsAdjustment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\n2\u0006\u0010\f\u001a\u00020\u0006J\"\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0002J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0002J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;", "", "()V", "enableAdjustment", "", "threshold", "", "adjustInitialAndFinalSessions", "", "sleepPeriodsList", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;", "hourOffset", "adjustSessions", "lastSession", "newSession", "appendFakeEntriesAfter", "", "targetPeriod", "count", "appendFakeEntriesBefore", "period", "fillFakeEntriesBetween", "lastPeriod", "nextPeriod", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepLogsAdjustment {
    private final int threshold = 3;
    private final boolean enableAdjustment = true;

    static /* synthetic */ java.util.List appendFakeEntriesBefore$default(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepLogsAdjustment sleepLogsAdjustment, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod sleepFiveMinPeriod, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = sleepLogsAdjustment.threshold;
        }
        return sleepLogsAdjustment.appendFakeEntriesBefore(sleepFiveMinPeriod, i);
    }

    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> appendFakeEntriesBefore(powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod period, int count) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (count > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                long startTime = period.getStartTime() - (((long) (i2 * 5)) * 60000);
                arrayList.add(0, period.copy((2094076 & 1) != 0 ? period.getStartTime() : startTime, (2094076 & 2) != 0 ? period.fiveMinsInHour : powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.minInHour(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toZonedCalendar$default(startTime, null, 1, null)), (2094076 & 4) != 0 ? period.getActiveCalories() : 0, (2094076 & 8) != 0 ? period.getSkinTemp() : 0.0f, (2094076 & 16) != 0 ? period.getMaxSkinTemp() : 0.0f, (2094076 & 32) != 0 ? period.getMinSkinTemp() : 0.0f, (2094076 & 64) != 0 ? period.getHrv() : 0.0f, (2094076 & 128) != 0 ? period.getBodyPower() : 0.0f, (2094076 & 256) != 0 ? period.getSolarPower() : 0.0f, (2094076 & 512) != 0 ? period.getPeakTemp() : 0.0f, (2094076 & 1024) != 0 ? period.getSleepType() : powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.SLEEP_AWAKE, (2094076 & 2048) != 0 ? period.getEndTime() : period.getStartTime() - (((long) (i * 5)) * 60000), (2094076 & 4096) != 0 ? period.getHeartRate() : 0.0f, (2094076 & 8192) != 0 ? period.getMaxHeartRate() : 0, (2094076 & 16384) != 0 ? period.getMinHeartRate() : 0, (2094076 & 32768) != 0 ? period.getLastUpdated() : 0L, (2094076 & 65536) != 0 ? period.getMinsInPeriod() : 0, (2094076 & 131072) != 0 ? period.getBmrCalories() : 0, (2094076 & 262144) != 0 ? period.getCaseTemp() : 0.0f, (2094076 & 524288) != 0 ? period.getMinCaseTemp() : 0.0f, (2094076 & 1048576) != 0 ? period.getMaxCaseTemp() : 0.0f, (2094076 & 2097152) != 0 ? period.getRestlessMinutes() : 0));
                if (i2 >= count) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    static /* synthetic */ java.util.List appendFakeEntriesAfter$default(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepLogsAdjustment sleepLogsAdjustment, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod sleepFiveMinPeriod, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = sleepLogsAdjustment.threshold;
        }
        return sleepLogsAdjustment.appendFakeEntriesAfter(sleepFiveMinPeriod, i);
    }

    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> appendFakeEntriesAfter(powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod targetPeriod, int count) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (count > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                long j = ((long) (i * 5)) * 60000;
                long endTime = targetPeriod.getEndTime() + j;
                arrayList.add(targetPeriod.copy((2094076 & 1) != 0 ? targetPeriod.getStartTime() : targetPeriod.getEndTime() + j, (2094076 & 2) != 0 ? targetPeriod.fiveMinsInHour : powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.minInHour(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toZonedCalendar$default(endTime, null, 1, null)), (2094076 & 4) != 0 ? targetPeriod.getActiveCalories() : 0, (2094076 & 8) != 0 ? targetPeriod.getSkinTemp() : 0.0f, (2094076 & 16) != 0 ? targetPeriod.getMaxSkinTemp() : 0.0f, (2094076 & 32) != 0 ? targetPeriod.getMinSkinTemp() : 0.0f, (2094076 & 64) != 0 ? targetPeriod.getHrv() : 0.0f, (2094076 & 128) != 0 ? targetPeriod.getBodyPower() : 0.0f, (2094076 & 256) != 0 ? targetPeriod.getSolarPower() : 0.0f, (2094076 & 512) != 0 ? targetPeriod.getPeakTemp() : 0.0f, (2094076 & 1024) != 0 ? targetPeriod.getSleepType() : powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.SLEEP_AWAKE, (2094076 & 2048) != 0 ? targetPeriod.getEndTime() : targetPeriod.getEndTime() + (((long) (i2 * 5)) * 60000), (2094076 & 4096) != 0 ? targetPeriod.getHeartRate() : 0.0f, (2094076 & 8192) != 0 ? targetPeriod.getMaxHeartRate() : 0, (2094076 & 16384) != 0 ? targetPeriod.getMinHeartRate() : 0, (2094076 & 32768) != 0 ? targetPeriod.getLastUpdated() : 0L, (2094076 & 65536) != 0 ? targetPeriod.getMinsInPeriod() : 0, (2094076 & 131072) != 0 ? targetPeriod.getBmrCalories() : 0, (2094076 & 262144) != 0 ? targetPeriod.getCaseTemp() : 0.0f, (2094076 & 524288) != 0 ? targetPeriod.getMinCaseTemp() : 0.0f, (2094076 & 1048576) != 0 ? targetPeriod.getMaxCaseTemp() : 0.0f, (2094076 & 2097152) != 0 ? targetPeriod.getRestlessMinutes() : 0));
                if (i2 >= count) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> fillFakeEntriesBetween(powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod lastPeriod, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod nextPeriod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastPeriod, "lastPeriod");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextPeriod, "nextPeriod");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.ranges.LongProgression longProgressionStep = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(lastPeriod.getEndTime(), nextPeriod.getStartTime()), 300000L);
        long first = longProgressionStep.getFirst();
        long last = longProgressionStep.getLast();
        long step = longProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            long j = first;
            while (true) {
                long j2 = j + step;
                long j3 = j;
                arrayList.add(lastPeriod.copy((2094076 & 1) != 0 ? lastPeriod.getStartTime() : j3, (2094076 & 2) != 0 ? lastPeriod.fiveMinsInHour : powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.minInHour(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toZonedCalendar$default(j, null, 1, null)), (2094076 & 4) != 0 ? lastPeriod.getActiveCalories() : 0, (2094076 & 8) != 0 ? lastPeriod.getSkinTemp() : 0.0f, (2094076 & 16) != 0 ? lastPeriod.getMaxSkinTemp() : 0.0f, (2094076 & 32) != 0 ? lastPeriod.getMinSkinTemp() : 0.0f, (2094076 & 64) != 0 ? lastPeriod.getHrv() : 0.0f, (2094076 & 128) != 0 ? lastPeriod.getBodyPower() : 0.0f, (2094076 & 256) != 0 ? lastPeriod.getSolarPower() : 0.0f, (2094076 & 512) != 0 ? lastPeriod.getPeakTemp() : 0.0f, (2094076 & 1024) != 0 ? lastPeriod.getSleepType() : powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.SLEEP_AWAKE, (2094076 & 2048) != 0 ? lastPeriod.getEndTime() : j + ((long) 300000), (2094076 & 4096) != 0 ? lastPeriod.getHeartRate() : 0.0f, (2094076 & 8192) != 0 ? lastPeriod.getMaxHeartRate() : 0, (2094076 & 16384) != 0 ? lastPeriod.getMinHeartRate() : 0, (2094076 & 32768) != 0 ? lastPeriod.getLastUpdated() : 0L, (2094076 & 65536) != 0 ? lastPeriod.getMinsInPeriod() : 0, (2094076 & 131072) != 0 ? lastPeriod.getBmrCalories() : 0, (2094076 & 262144) != 0 ? lastPeriod.getCaseTemp() : 0.0f, (2094076 & 524288) != 0 ? lastPeriod.getMinCaseTemp() : 0.0f, (2094076 & 1048576) != 0 ? lastPeriod.getMaxCaseTemp() : 0.0f, (2094076 & 2097152) != 0 ? lastPeriod.getRestlessMinutes() : 0));
                if (j3 == last) {
                    break;
                }
                j = j2;
            }
        }
        return arrayList;
    }

    public final boolean adjustSessions(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> lastSession, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> newSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastSession, "lastSession");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newSession, "newSession");
        if (!this.enableAdjustment) {
            return true;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod sleepFiveMinPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod) kotlin.collections.CollectionsKt.last((java.util.List) lastSession);
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod sleepFiveMinPeriod2 = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod) kotlin.collections.CollectionsKt.first((java.util.List) newSession);
        long startTime = sleepFiveMinPeriod2.getStartTime() - sleepFiveMinPeriod.getEndTime();
        int i = this.threshold;
        if (startTime < i * 10 * 60000) {
            lastSession.addAll(fillFakeEntriesBetween(sleepFiveMinPeriod, sleepFiveMinPeriod2));
            lastSession.add(sleepFiveMinPeriod2);
            return false;
        }
        lastSession.addAll(appendFakeEntriesAfter(sleepFiveMinPeriod, i));
        newSession.addAll(0, appendFakeEntriesBefore(sleepFiveMinPeriod2, this.threshold));
        return true;
    }

    public final void adjustInitialAndFinalSessions(java.util.List<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod>> sleepPeriodsList, int hourOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepPeriodsList, "sleepPeriodsList");
        if (this.enableAdjustment && (!sleepPeriodsList.isEmpty())) {
            java.util.List list = (java.util.List) kotlin.collections.CollectionsKt.last((java.util.List) sleepPeriodsList);
            java.util.List list2 = (java.util.List) kotlin.collections.CollectionsKt.first((java.util.List) sleepPeriodsList);
            if (!list.isEmpty()) {
                powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod sleepFiveMinPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod) kotlin.collections.CollectionsKt.last(list);
                if (powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.hourInDay(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toCalendar(sleepFiveMinPeriod.getStartTime()), hourOffset) < 23 || sleepFiveMinPeriod.getFiveMinsInHour() < 60 - (this.threshold * 5)) {
                    list.addAll(appendFakeEntriesAfter(sleepFiveMinPeriod, this.threshold));
                }
            }
            if (!list2.isEmpty()) {
                powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod sleepFiveMinPeriod2 = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod) kotlin.collections.CollectionsKt.first(list2);
                if (powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.hourInDay(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toCalendar(sleepFiveMinPeriod2.getStartTime()), hourOffset) > 0 || sleepFiveMinPeriod2.getFiveMinsInHour() >= this.threshold * 5) {
                    list2.addAll(appendFakeEntriesBefore(sleepFiveMinPeriod2, this.threshold));
                }
            }
        }
    }
}
