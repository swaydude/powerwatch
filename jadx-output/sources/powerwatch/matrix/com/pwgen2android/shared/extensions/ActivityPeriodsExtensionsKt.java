package powerwatch.matrix.com.pwgen2android.shared.extensions;

/* JADX INFO: compiled from: ActivityPeriodsExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0005\u001a\u001e\u0010\u0004\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n\u001a\n\u0010\u0004\u001a\u00020\u000b*\u00020\u000b\u001a\n\u0010\f\u001a\u00020\r*\u00020\r\u001a\n\u0010\f\u001a\u00020\u000e*\u00020\u000e\u001a\n\u0010\f\u001a\u00020\u000f*\u00020\u000f\u001a\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011*\u00020\u0012\u001a\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011*\u00020\u00132\b\b\u0002\u0010\t\u001a\u00020\n\u001a\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011*\u00020\u0014\u001a\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011*\u00020\u0003\u001a\u0012\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a\u001a\u0012\u0010\u001b\u001a\u00020\u0018*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a\u001a\u0016\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¨\u0006\u001d"}, d2 = {"dayStartEndTime", "Lkotlin/Pair;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "fillWithEmptyDays", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;", "withEmptyHours", "", "hourOffset", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;", "fillWithEmptyHours", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;", "getFilledDays", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingMonthPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepMonthPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingMonthPeriod;", "hourActivityIds", "mapActivityNameToActivityType", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;", "", "context", "Landroid/content/Context;", "mapActivityTypeToName", "startEndTime", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ActivityPeriodsExtensionsKt {

    /* JADX INFO: compiled from: ActivityPeriodsExtensions.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.valuesCustom().length];
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_RUNNING.ordinal()] = 1;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_WALKING.ordinal()] = 2;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_STATIONARY.ordinal()] = 3;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_BIKING.ordinal()] = 4;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_JOGGING.ordinal()] = 5;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_DRIVING.ordinal()] = 6;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_UNKNOWN.ordinal()] = 7;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_INDOOR_WALKING.ordinal()] = 8;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_INDOOR_RUNNING.ordinal()] = 9;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_INDOOR_JOGGING.ordinal()] = 10;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_INDOOR_BIKING.ordinal()] = 11;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_HIIT.ordinal()] = 12;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final java.util.List<java.lang.Long> hourActivityIds(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "<this>");
        kotlin.ranges.IntRange intRangeUntil = kotlin.ranges.RangesKt.until(0, page.getLimit());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        java.util.Iterator<java.lang.Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            long offset = (page.getOffset() * ((long) page.getLimit())) + ((long) ((kotlin.collections.IntIterator) it).nextInt());
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "getInstance()");
            java.util.Calendar calendarMidnight = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.midnight(calendar);
            calendarMidnight.add(5, 1);
            calendarMidnight.add(11, -((int) offset));
            arrayList.add(java.lang.Long.valueOf(calendarMidnight.getTimeInMillis()));
        }
        return arrayList;
    }

    public static final kotlin.Pair<java.lang.Long, java.lang.Long> startEndTime(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "<this>");
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(11, 1);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        calendar2.add(11, 1);
        long offset = page.getOffset();
        long offset2 = page.getOffset() + ((long) page.getLimit());
        calendar.add(11, -((int) offset));
        calendar2.add(11, -((int) offset2));
        return new kotlin.Pair<>(java.lang.Long.valueOf(calendar2.getTimeInMillis()), java.lang.Long.valueOf(calendar.getTimeInMillis()));
    }

    public static final kotlin.Pair<java.lang.Long, java.lang.Long> dayStartEndTime(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "<this>");
        java.util.Calendar endCal = java.util.Calendar.getInstance();
        endCal.add(5, 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(endCal, "endCal");
        powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.midnight(endCal);
        java.util.Calendar startCal = java.util.Calendar.getInstance();
        startCal.add(5, 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(startCal, "startCal");
        powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.midnight(startCal);
        long offset = page.getOffset();
        long offset2 = page.getOffset() + ((long) page.getLimit());
        endCal.add(5, -((int) offset));
        startCal.add(5, -((int) offset2));
        return new kotlin.Pair<>(java.lang.Long.valueOf(startCal.getTimeInMillis()), java.lang.Long.valueOf(endCal.getTimeInMillis()));
    }

    public static final powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod fillWithEmptyHours(powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDayPeriod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDayPeriod, "<this>");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> walkingHours = walkingDayPeriod.getWalkingHours();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(walkingHours, 10));
        java.util.Iterator<T> it = walkingHours.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) it.next()).getHourInDay()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(0, 23);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it2 = intRange.iterator();
        while (it2.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it2).nextInt();
            arrayList3.add(!arrayList2.contains(java.lang.Integer.valueOf(iNextInt)) ? new powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod(0L, 0L, iNextInt, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0d, 0L, 0, 0, 0.0f, 0.0f, 0.0f, 4194299, null) : null);
        }
        java.util.List listFilterNotNull = kotlin.collections.CollectionsKt.filterNotNull(arrayList3);
        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) walkingDayPeriod.getWalkingHours());
        mutableList.addAll(listFilterNotNull);
        return walkingDayPeriod.copy((16777199 & 1) != 0 ? walkingDayPeriod.getStartTime() : 0L, (16777199 & 2) != 0 ? walkingDayPeriod.getEndTime() : 0L, (16777199 & 4) != 0 ? walkingDayPeriod.dayInWeek : 0, (16777199 & 8) != 0 ? walkingDayPeriod.dayInMonth : 0, (16777199 & 16) != 0 ? walkingDayPeriod.walkingHours : mutableList, (16777199 & 32) != 0 ? walkingDayPeriod.getHeartRate() : 0.0f, (16777199 & 64) != 0 ? walkingDayPeriod.getMaxHeartRate() : 0, (16777199 & 128) != 0 ? walkingDayPeriod.getMinHeartRate() : 0, (16777199 & 256) != 0 ? walkingDayPeriod.getHrv() : 0.0f, (16777199 & 512) != 0 ? walkingDayPeriod.getSkinTemp() : 0.0f, (16777199 & 1024) != 0 ? walkingDayPeriod.getMaxSkinTemp() : 0.0f, (16777199 & 2048) != 0 ? walkingDayPeriod.getMinSkinTemp() : 0.0f, (16777199 & 4096) != 0 ? walkingDayPeriod.getBodyPower() : 0.0f, (16777199 & 8192) != 0 ? walkingDayPeriod.getSolarPower() : 0.0f, (16777199 & 16384) != 0 ? walkingDayPeriod.getPeakTemp() : 0.0f, (16777199 & 32768) != 0 ? walkingDayPeriod.getActiveCalories() : 0, (16777199 & 65536) != 0 ? walkingDayPeriod.getSteps() : 0, (16777199 & 131072) != 0 ? walkingDayPeriod.getDistance() : 0.0d, (16777199 & 262144) != 0 ? walkingDayPeriod.getMinsInPeriod() : 0, (16777199 & 524288) != 0 ? walkingDayPeriod.getLastUpdated() : 0L, (16777199 & 1048576) != 0 ? walkingDayPeriod.getBmrCalories() : 0, (16777199 & 2097152) != 0 ? walkingDayPeriod.getCaseTemp() : 0.0f, (16777199 & 4194304) != 0 ? walkingDayPeriod.getMinCaseTemp() : 0.0f, (16777199 & 8388608) != 0 ? walkingDayPeriod.getMaxCaseTemp() : 0.0f);
    }

    public static final powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod fillWithEmptyDays(powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod walkingWeekPeriod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingWeekPeriod, "<this>");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> walkingDays = walkingWeekPeriod.getWalkingDays();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(walkingDays, 10));
        java.util.Iterator<T> it = walkingDays.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) it.next()).getDayInWeek()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(0, 6);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it2 = intRange.iterator();
        while (it2.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it2).nextInt();
            arrayList3.add(!arrayList2.contains(java.lang.Integer.valueOf(iNextInt)) ? new powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod(0L, 0L, iNextInt, 0, kotlin.collections.CollectionsKt.emptyList(), 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0d, 0, 0L, 0, 0.0f, 0.0f, 0.0f, 16777195, null) : null);
        }
        java.util.List listFilterNotNull = kotlin.collections.CollectionsKt.filterNotNull(arrayList3);
        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) walkingWeekPeriod.getWalkingDays());
        mutableList.addAll(listFilterNotNull);
        return walkingWeekPeriod.copy((8257535 & 1) != 0 ? walkingWeekPeriod.getStartTime() : 0L, (8257535 & 2) != 0 ? walkingWeekPeriod.getEndTime() : 0L, (8257535 & 4) != 0 ? walkingWeekPeriod.getSteps() : 0, (8257535 & 8) != 0 ? walkingWeekPeriod.getHeartRate() : 0.0f, (8257535 & 16) != 0 ? walkingWeekPeriod.getMaxHeartRate() : 0, (8257535 & 32) != 0 ? walkingWeekPeriod.getMinHeartRate() : 0, (8257535 & 64) != 0 ? walkingWeekPeriod.getHrv() : 0.0f, (8257535 & 128) != 0 ? walkingWeekPeriod.getSkinTemp() : 0.0f, (8257535 & 256) != 0 ? walkingWeekPeriod.getMaxSkinTemp() : 0.0f, (8257535 & 512) != 0 ? walkingWeekPeriod.getMinSkinTemp() : 0.0f, (8257535 & 1024) != 0 ? walkingWeekPeriod.getBodyPower() : 0.0f, (8257535 & 2048) != 0 ? walkingWeekPeriod.getSolarPower() : 0.0f, (8257535 & 4096) != 0 ? walkingWeekPeriod.getPeakTemp() : 0.0f, (8257535 & 8192) != 0 ? walkingWeekPeriod.getDistance() : 0.0d, (8257535 & 16384) != 0 ? walkingWeekPeriod.getActiveCalories() : 0, (8257535 & 32768) != 0 ? walkingWeekPeriod.weekInMonth : 0, (8257535 & 65536) != 0 ? walkingWeekPeriod.getMinsInPeriod() : 0, (8257535 & 131072) != 0 ? walkingWeekPeriod.walkingDays : mutableList, (8257535 & 262144) != 0 ? walkingWeekPeriod.getLastUpdated() : 0L, (8257535 & 524288) != 0 ? walkingWeekPeriod.getBmrCalories() : 0, (8257535 & 1048576) != 0 ? walkingWeekPeriod.getCaseTemp() : 0.0f, (8257535 & 2097152) != 0 ? walkingWeekPeriod.getMinCaseTemp() : 0.0f, (8257535 & 4194304) != 0 ? walkingWeekPeriod.getMaxCaseTemp() : 0.0f);
    }

    public static final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> getFilledDays(powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingMonthPeriod walkingMonthPeriod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingMonthPeriod, "<this>");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod> walkingWeeks = walkingMonthPeriod.getWalkingWeeks();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(walkingWeeks, 10));
        java.util.Iterator<T> it = walkingWeeks.iterator();
        while (it.hasNext()) {
            arrayList.add(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod) it.next()).getWalkingDays());
        }
        java.util.List listFlatten = kotlin.collections.CollectionsKt.flatten(kotlin.collections.CollectionsKt.toList(arrayList));
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(2, walkingMonthPeriod.getMonthInYear() - 1);
        java.util.List list = listFlatten;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) it2.next()).getDayInMonth()));
        }
        java.util.ArrayList arrayList3 = arrayList2;
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(1, calendar.getActualMaximum(5));
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it3 = intRange.iterator();
        while (it3.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it3).nextInt();
            powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDayPeriod = arrayList3.contains(java.lang.Integer.valueOf(iNextInt)) ? null : new powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod(0L, 0L, 0, iNextInt, kotlin.collections.CollectionsKt.emptyList(), 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0d, 0, 0L, 0, 0.0f, 0.0f, 0.0f, 16777191, null);
            if (walkingDayPeriod != null) {
                arrayList4.add(walkingDayPeriod);
            }
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) listFlatten);
        mutableList.addAll(arrayList4);
        return mutableList;
    }

    public static final powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod fillWithEmptyHours(powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingDayPeriod, "<this>");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> restingHours = restingDayPeriod.getRestingHours();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(restingHours, 10));
        java.util.Iterator<T> it = restingHours.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) it.next()).getHourInDay()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(0, 23);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it2 = intRange.iterator();
        while (it2.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it2).nextInt();
            arrayList3.add(!arrayList2.contains(java.lang.Integer.valueOf(iNextInt)) ? new powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod(0L, 0L, iNextInt, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0L, 0, 0, 0.0f, 0.0f, 0.0f, 1048571, null) : null);
        }
        java.util.List listFilterNotNull = kotlin.collections.CollectionsKt.filterNotNull(arrayList3);
        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) restingDayPeriod.getRestingHours());
        mutableList.addAll(listFilterNotNull);
        return restingDayPeriod.copy((4128767 & 1) != 0 ? restingDayPeriod.getStartTime() : 0L, (4128767 & 2) != 0 ? restingDayPeriod.getEndTime() : 0L, (4128767 & 4) != 0 ? restingDayPeriod.getHeartRate() : 0.0f, (4128767 & 8) != 0 ? restingDayPeriod.getMaxHeartRate() : 0, (4128767 & 16) != 0 ? restingDayPeriod.getMinHeartRate() : 0, (4128767 & 32) != 0 ? restingDayPeriod.getHrv() : 0.0f, (4128767 & 64) != 0 ? restingDayPeriod.getSkinTemp() : 0.0f, (4128767 & 128) != 0 ? restingDayPeriod.getMaxSkinTemp() : 0.0f, (4128767 & 256) != 0 ? restingDayPeriod.getMinSkinTemp() : 0.0f, (4128767 & 512) != 0 ? restingDayPeriod.getBodyPower() : 0.0f, (4128767 & 1024) != 0 ? restingDayPeriod.getSolarPower() : 0.0f, (4128767 & 2048) != 0 ? restingDayPeriod.getPeakTemp() : 0.0f, (4128767 & 4096) != 0 ? restingDayPeriod.getActiveCalories() : 0, (4128767 & 8192) != 0 ? restingDayPeriod.dayInWeek : 0, (4128767 & 16384) != 0 ? restingDayPeriod.dayInMonth : 0, (4128767 & 32768) != 0 ? restingDayPeriod.getMinsInPeriod() : 0, (4128767 & 65536) != 0 ? restingDayPeriod.restingHours : mutableList, (4128767 & 131072) != 0 ? restingDayPeriod.getLastUpdated() : 0L, (4128767 & 262144) != 0 ? restingDayPeriod.getBmrCalories() : 0, (4128767 & 524288) != 0 ? restingDayPeriod.getCaseTemp() : 0.0f, (4128767 & 1048576) != 0 ? restingDayPeriod.getMinCaseTemp() : 0.0f, (4128767 & 2097152) != 0 ? restingDayPeriod.getMaxCaseTemp() : 0.0f);
    }

    public static final powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod fillWithEmptyDays(powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod restingWeekPeriod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingWeekPeriod, "<this>");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> restingDays = restingWeekPeriod.getRestingDays();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(restingDays, 10));
        java.util.Iterator<T> it = restingDays.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) it.next()).getDayInWeek()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(0, 6);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it2 = intRange.iterator();
        while (it2.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it2).nextInt();
            arrayList3.add(!arrayList2.contains(java.lang.Integer.valueOf(iNextInt)) ? new powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, iNextInt, 0, 0, kotlin.collections.CollectionsKt.emptyList(), 0L, 0, 0.0f, 0.0f, 0.0f, 4120575, null) : null);
        }
        java.util.List listFilterNotNull = kotlin.collections.CollectionsKt.filterNotNull(arrayList3);
        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) restingWeekPeriod.getRestingDays());
        mutableList.addAll(listFilterNotNull);
        return restingWeekPeriod.copy((2064383 & 1) != 0 ? restingWeekPeriod.getStartTime() : 0L, (2064383 & 2) != 0 ? restingWeekPeriod.getEndTime() : 0L, (2064383 & 4) != 0 ? restingWeekPeriod.getHeartRate() : 0.0f, (2064383 & 8) != 0 ? restingWeekPeriod.getMaxHeartRate() : 0, (2064383 & 16) != 0 ? restingWeekPeriod.getMinHeartRate() : 0, (2064383 & 32) != 0 ? restingWeekPeriod.getHrv() : 0.0f, (2064383 & 64) != 0 ? restingWeekPeriod.getSkinTemp() : 0.0f, (2064383 & 128) != 0 ? restingWeekPeriod.getMaxSkinTemp() : 0.0f, (2064383 & 256) != 0 ? restingWeekPeriod.getMinSkinTemp() : 0.0f, (2064383 & 512) != 0 ? restingWeekPeriod.getBodyPower() : 0.0f, (2064383 & 1024) != 0 ? restingWeekPeriod.getSolarPower() : 0.0f, (2064383 & 2048) != 0 ? restingWeekPeriod.getPeakTemp() : 0.0f, (2064383 & 4096) != 0 ? restingWeekPeriod.getActiveCalories() : 0, (2064383 & 8192) != 0 ? restingWeekPeriod.weekInMonth : 0, (2064383 & 16384) != 0 ? restingWeekPeriod.getMinsInPeriod() : 0, (2064383 & 32768) != 0 ? restingWeekPeriod.restingDays : mutableList, (2064383 & 65536) != 0 ? restingWeekPeriod.getLastUpdated() : 0L, (2064383 & 131072) != 0 ? restingWeekPeriod.getBmrCalories() : 0, (2064383 & 262144) != 0 ? restingWeekPeriod.getCaseTemp() : 0.0f, (2064383 & 524288) != 0 ? restingWeekPeriod.getMinCaseTemp() : 0.0f, (2064383 & 1048576) != 0 ? restingWeekPeriod.getMaxCaseTemp() : 0.0f);
    }

    public static final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> getFilledDays(powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod restingMonthPeriod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingMonthPeriod, "<this>");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> restingWeeks = restingMonthPeriod.getRestingWeeks();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(restingWeeks, 10));
        java.util.Iterator<T> it = restingWeeks.iterator();
        while (it.hasNext()) {
            arrayList.add(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod) it.next()).getRestingDays());
        }
        java.util.List listFlatten = kotlin.collections.CollectionsKt.flatten(kotlin.collections.CollectionsKt.toList(arrayList));
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(2, restingMonthPeriod.getMonthInYear() - 1);
        java.util.List list = listFlatten;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) it2.next()).getDayInMonth()));
        }
        java.util.ArrayList arrayList3 = arrayList2;
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(1, calendar.getActualMaximum(5));
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it3 = intRange.iterator();
        while (it3.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it3).nextInt();
            powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriod = arrayList3.contains(java.lang.Integer.valueOf(iNextInt)) ? null : new powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, iNextInt, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 4177919, null);
            if (restingDayPeriod != null) {
                arrayList4.add(restingDayPeriod);
            }
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) listFlatten);
        mutableList.addAll(arrayList4);
        return mutableList;
    }

    public static final powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod fillWithEmptyHours(powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDayPeriod, "<this>");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> sleepHours = sleepDayPeriod.getSleepHours();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(sleepHours, 10));
        java.util.Iterator<T> it = sleepHours.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) it.next()).getHourInDay()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(0, 23);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it2 = intRange.iterator();
        while (it2.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it2).nextInt();
            arrayList3.add(!arrayList2.contains(java.lang.Integer.valueOf(iNextInt)) ? new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, iNextInt, 0, null, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.DEEP, 0L, 0, 0, 0.0f, 0.0f, 0.0f, 8314879, null) : null);
        }
        java.util.List listFilterNotNull = kotlin.collections.CollectionsKt.filterNotNull(arrayList3);
        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) sleepDayPeriod.getSleepHours());
        mutableList.addAll(listFilterNotNull);
        return sleepDayPeriod.copy((16515071 & 1) != 0 ? sleepDayPeriod.getStartTime() : 0L, (16515071 & 2) != 0 ? sleepDayPeriod.getEndTime() : 0L, (16515071 & 4) != 0 ? sleepDayPeriod.getHeartRate() : 0.0f, (16515071 & 8) != 0 ? sleepDayPeriod.getMaxHeartRate() : 0, (16515071 & 16) != 0 ? sleepDayPeriod.getMinHeartRate() : 0, (16515071 & 32) != 0 ? sleepDayPeriod.getHrv() : 0.0f, (16515071 & 64) != 0 ? sleepDayPeriod.getSkinTemp() : 0.0f, (16515071 & 128) != 0 ? sleepDayPeriod.getMaxSkinTemp() : 0.0f, (16515071 & 256) != 0 ? sleepDayPeriod.getMinSkinTemp() : 0.0f, (16515071 & 512) != 0 ? sleepDayPeriod.getBodyPower() : 0.0f, (16515071 & 1024) != 0 ? sleepDayPeriod.getSolarPower() : 0.0f, (16515071 & 2048) != 0 ? sleepDayPeriod.getPeakTemp() : 0.0f, (16515071 & 4096) != 0 ? sleepDayPeriod.getActiveCalories() : 0, (16515071 & 8192) != 0 ? sleepDayPeriod.dayInWeek : 0, (16515071 & 16384) != 0 ? sleepDayPeriod.dayInMonth : 0, (16515071 & 32768) != 0 ? sleepDayPeriod.getRestlessMinutes() : 0, (16515071 & 65536) != 0 ? sleepDayPeriod.getSleepType() : null, (16515071 & 131072) != 0 ? sleepDayPeriod.getMinsInPeriod() : 0, (16515071 & 262144) != 0 ? sleepDayPeriod.sleepHours : mutableList, (16515071 & 524288) != 0 ? sleepDayPeriod.getLastUpdated() : 0L, (16515071 & 1048576) != 0 ? sleepDayPeriod.getBmrCalories() : 0, (16515071 & 2097152) != 0 ? sleepDayPeriod.getCaseTemp() : 0.0f, (16515071 & 4194304) != 0 ? sleepDayPeriod.getMinCaseTemp() : 0.0f, (16515071 & 8388608) != 0 ? sleepDayPeriod.getMaxCaseTemp() : 0.0f);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod fillWithEmptyDays$default(powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod sleepWeekPeriod, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return fillWithEmptyDays(sleepWeekPeriod, z, i);
    }

    public static final powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod fillWithEmptyDays(powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod sleepWeekPeriod, boolean z, int i) {
        java.util.Calendar calendar;
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriodFillWithEmptyHours;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepWeekPeriod, "<this>");
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) sleepWeekPeriod.getSleepDays());
        java.lang.Long lValueOf = sleepDayPeriod == null ? null : java.lang.Long.valueOf(sleepDayPeriod.getStartTime());
        java.util.Calendar calendarStartOfWeek = (lValueOf == null || (calendar = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toCalendar(lValueOf.longValue())) == null) ? null : powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.startOfWeek(calendar);
        if (calendarStartOfWeek == null) {
            return sleepWeekPeriod;
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod> sleepDays = sleepWeekPeriod.getSleepDays();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(sleepDays, 10));
        java.util.Iterator<T> it = sleepDays.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayInWeek(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toCalendar(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) it.next()).getStartTime()), i)));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(0, 6);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it2 = intRange.iterator();
        while (it2.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it2).nextInt();
            if (arrayList2.contains(java.lang.Integer.valueOf(iNextInt))) {
                sleepDayPeriodFillWithEmptyHours = null;
            } else {
                sleepDayPeriodFillWithEmptyHours = z ? fillWithEmptyHours(new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, iNextInt, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayOfMonth(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.midnight(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.plusDays(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.copy(calendarStartOfWeek), iNextInt)), i), 0, null, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 16752639, null)) : new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, iNextInt, 0, 0, null, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 16769023, null);
            }
            arrayList3.add(sleepDayPeriodFillWithEmptyHours);
        }
        java.util.List listFilterNotNull = kotlin.collections.CollectionsKt.filterNotNull(arrayList3);
        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) sleepWeekPeriod.getSleepDays());
        mutableList.addAll(listFilterNotNull);
        return sleepWeekPeriod.copy((8355839 & 1) != 0 ? sleepWeekPeriod.getStartTime() : 0L, (8355839 & 2) != 0 ? sleepWeekPeriod.getEndTime() : 0L, (8355839 & 4) != 0 ? sleepWeekPeriod.getHeartRate() : 0.0f, (8355839 & 8) != 0 ? sleepWeekPeriod.getMaxHeartRate() : 0, (8355839 & 16) != 0 ? sleepWeekPeriod.getMinHeartRate() : 0, (8355839 & 32) != 0 ? sleepWeekPeriod.getHrv() : 0.0f, (8355839 & 64) != 0 ? sleepWeekPeriod.getSkinTemp() : 0.0f, (8355839 & 128) != 0 ? sleepWeekPeriod.getMaxSkinTemp() : 0.0f, (8355839 & 256) != 0 ? sleepWeekPeriod.getMinSkinTemp() : 0.0f, (8355839 & 512) != 0 ? sleepWeekPeriod.getBodyPower() : 0.0f, (8355839 & 1024) != 0 ? sleepWeekPeriod.getSolarPower() : 0.0f, (8355839 & 2048) != 0 ? sleepWeekPeriod.getPeakTemp() : 0.0f, (8355839 & 4096) != 0 ? sleepWeekPeriod.getActiveCalories() : 0, (8355839 & 8192) != 0 ? sleepWeekPeriod.weekInMonth : 0, (8355839 & 16384) != 0 ? sleepWeekPeriod.getMinsInPeriod() : 0, (8355839 & 32768) != 0 ? sleepWeekPeriod.sleepDays : mutableList, (8355839 & 65536) != 0 ? sleepWeekPeriod.getLastUpdated() : 0L, (8355839 & 131072) != 0 ? sleepWeekPeriod.getBmrCalories() : 0, (8355839 & 262144) != 0 ? sleepWeekPeriod.getCaseTemp() : 0.0f, (8355839 & 524288) != 0 ? sleepWeekPeriod.getRestlessMinutes() : 0, (8355839 & 1048576) != 0 ? sleepWeekPeriod.getMinCaseTemp() : 0.0f, (8355839 & 2097152) != 0 ? sleepWeekPeriod.getMaxCaseTemp() : 0.0f, (8355839 & 4194304) != 0 ? sleepWeekPeriod.getSleepType() : null);
    }

    public static /* synthetic */ java.util.List getFilledDays$default(powerwatch.matrix.com.pwgen2android.shared.data.models.SleepMonthPeriod sleepMonthPeriod, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return getFilledDays(sleepMonthPeriod, i);
    }

    public static final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod> getFilledDays(powerwatch.matrix.com.pwgen2android.shared.data.models.SleepMonthPeriod sleepMonthPeriod, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepMonthPeriod, "<this>");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod> sleepWeeks = sleepMonthPeriod.getSleepWeeks();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(sleepWeeks, 10));
        java.util.Iterator<T> it = sleepWeeks.iterator();
        while (it.hasNext()) {
            arrayList.add(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod) it.next()).getSleepDays());
        }
        java.util.List listFlatten = kotlin.collections.CollectionsKt.flatten(kotlin.collections.CollectionsKt.toList(arrayList));
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(2, sleepMonthPeriod.getMonthInYear() - 1);
        java.util.List list = listFlatten;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayOfMonth(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toCalendar(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) it2.next()).getStartTime()), i)));
        }
        java.util.ArrayList arrayList3 = arrayList2;
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(1, calendar.getActualMaximum(5));
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it3 = intRange.iterator();
        while (it3.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it3).nextInt();
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod = arrayList3.contains(java.lang.Integer.valueOf(iNextInt)) ? null : new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, iNextInt, 0, null, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 16760831, null);
            if (sleepDayPeriod != null) {
                arrayList4.add(sleepDayPeriod);
            }
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod> mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) listFlatten);
        mutableList.addAll(arrayList4);
        return mutableList;
    }

    public static final java.lang.String mapActivityTypeToName(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType userActivityType, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivityType, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        switch (powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.WhenMappings.$EnumSwitchMapping$0[userActivityType.ordinal()]) {
            case 1:
                java.lang.String string = context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_outdoor_run);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.activity_outdoor_run)");
                return string;
            case 2:
                java.lang.String string2 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_walking);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.activity_walking)");
                return string2;
            case 3:
                java.lang.String string3 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_stationary);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.string.activity_stationary)");
                return string3;
            case 4:
                java.lang.String string4 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_biking);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.string.activity_biking)");
                return string4;
            case 5:
                java.lang.String string5 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_jogging);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.string.activity_jogging)");
                return string5;
            case 6:
                java.lang.String string6 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_driving);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "context.getString(R.string.activity_driving)");
                return string6;
            case 7:
                java.lang.String string7 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_unknown);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "context.getString(R.string.activity_unknown)");
                return string7;
            case 8:
                java.lang.String string8 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_indoor_walking);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "context.getString(R.string.activity_indoor_walking)");
                return string8;
            case 9:
                java.lang.String string9 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_indoor_run);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string9, "context.getString(R.string.activity_indoor_run)");
                return string9;
            case 10:
                java.lang.String string10 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_indoor_jogging);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string10, "context.getString(R.string.activity_indoor_jogging)");
                return string10;
            case 11:
                java.lang.String string11 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_indoor_biking);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string11, "context.getString(R.string.activity_indoor_biking)");
                return string11;
            case 12:
                java.lang.String string12 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_hiit);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string12, "context.getString(R.string.activity_hiit)");
                return string12;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType mapActivityNameToActivityType(java.lang.String str, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_outdoor_run))) {
            return powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_RUNNING;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_outdoor_run))) {
            return powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_WALKING;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_stationary))) {
            return powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_STATIONARY;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_biking))) {
            return powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_BIKING;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_jogging))) {
            return powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_JOGGING;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_driving))) {
            return powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_DRIVING;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_indoor_walking))) {
            return powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_INDOOR_WALKING;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_indoor_run))) {
            return powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_INDOOR_RUNNING;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_indoor_jogging))) {
            return powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_INDOOR_JOGGING;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_indoor_biking))) {
            return powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_INDOOR_BIKING;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(str, context.getString(powerwatch.matrix.com.pwgen2android.R.string.activity_hiit)) ? powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_HIIT : powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_UNKNOWN;
    }
}
