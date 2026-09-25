package powerwatch.matrix.com.pwgen2android.shared.ui;

/* JADX INFO: compiled from: TimeAnimator.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/TimeAnimator;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "create", "Lkotlin/Pair;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/MapAnimationData;", "", "userActivitySession", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TimeAnimator implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final kotlin.Pair<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData>, java.lang.Integer> create(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession) {
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation> listEmptyList;
        java.util.List listEmptyList2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivitySession, "userActivitySession");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition> gpsPositions = userActivitySession.getGpsPositions();
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate> heartRates = userActivitySession.getHeartRates();
        java.util.Iterator<T> it = gpsPositions.iterator();
        java.util.Iterator<T> it2 = heartRates.iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList(java.lang.Math.min(kotlin.collections.CollectionsKt.collectionSizeOrDefault(gpsPositions, 10), kotlin.collections.CollectionsKt.collectionSizeOrDefault(heartRates, 10)));
        while (it.hasNext() && it2.hasNext()) {
            powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gPSPosition = (powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) it.next();
            arrayList.add(new kotlin.Triple(gPSPosition, (powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) it2.next(), java.lang.Long.valueOf(gPSPosition.getTimestamp())));
        }
        java.util.Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.Object next = it3.next();
            while (it3.hasNext()) {
                java.lang.Object next2 = it3.next();
                kotlin.Triple triple = (kotlin.Triple) next;
                powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation runningAnimation = new powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation(null, null, 0.0d, 0.0d, 0.0f, null, 0, 0L, 255, null);
                runningAnimation.setLastLocation(powerwatch.matrix.com.pwgen2android.shared.data.models.ActivityPeriodsModelsKt.toLocation((powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) triple.getFirst()));
                runningAnimation.setNextLocation(powerwatch.matrix.com.pwgen2android.shared.data.models.ActivityPeriodsModelsKt.toLocation((powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) ((kotlin.Triple) next2).getFirst()));
                runningAnimation.setDistance(runningAnimation.getLastLocation().distanceTo(runningAnimation.getNextLocation()));
                runningAnimation.setHeartRate((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) triple.getSecond());
                runningAnimation.setTimestamp(1000L);
                runningAnimation.setElevation(kotlin.math.MathKt.roundToInt(((powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) triple.getFirst()).getAltitude()));
                arrayList2.add(runningAnimation);
                next = next2;
            }
            listEmptyList = arrayList2;
        } else {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation runningAnimation2 : listEmptyList) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            int iRoundToInt = kotlin.math.MathKt.roundToInt(runningAnimation2.getDistance());
            if (iRoundToInt == 0) {
                arrayList4 = arrayList4;
                arrayList4.add(runningAnimation2.copy((255 & 1) != 0 ? runningAnimation2.lastLocation : null, (255 & 2) != 0 ? runningAnimation2.nextLocation : null, (255 & 4) != 0 ? runningAnimation2.distance : 0.0d, (255 & 8) != 0 ? runningAnimation2.step : 0.0d, (255 & 16) != 0 ? runningAnimation2.distanceUntil : 0.0f, (255 & 32) != 0 ? runningAnimation2.heartRate : null, (255 & 64) != 0 ? runningAnimation2.elevation : 0, (255 & 128) != 0 ? runningAnimation2.timestamp : 0L));
            }
            int i = iRoundToInt;
            java.util.Iterator<java.lang.Integer> it4 = new kotlin.ranges.IntRange(1, i).iterator();
            while (it4.hasNext()) {
                ((kotlin.collections.IntIterator) it4).nextInt();
                double distance = runningAnimation2.getDistance() / ((double) i);
                runningAnimation2.setStep(runningAnimation2.getStep() + distance);
                int i2 = i;
                java.util.ArrayList arrayList5 = arrayList4;
                powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation runningAnimationCopy = runningAnimation2.copy((255 & 1) != 0 ? runningAnimation2.lastLocation : null, (255 & 2) != 0 ? runningAnimation2.nextLocation : null, (255 & 4) != 0 ? runningAnimation2.distance : distance, (255 & 8) != 0 ? runningAnimation2.step : 0.0d, (255 & 16) != 0 ? runningAnimation2.distanceUntil : 0.0f, (255 & 32) != 0 ? runningAnimation2.heartRate : null, (255 & 64) != 0 ? runningAnimation2.elevation : 0, (255 & 128) != 0 ? runningAnimation2.timestamp : 0L);
                runningAnimationCopy.setTimestamp(runningAnimationCopy.getTimestamp() / ((long) i2));
                arrayList5.add(runningAnimationCopy);
                arrayList4 = arrayList5;
                i = i2;
            }
            kotlin.collections.CollectionsKt.addAll(arrayList3, arrayList4);
        }
        java.util.Iterator it5 = arrayList3.iterator();
        if (it5.hasNext()) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.Object next3 = it5.next();
            while (it5.hasNext()) {
                java.lang.Object next4 = it5.next();
                powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation runningAnimation3 = (powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation) next3;
                runningAnimation3.setDistanceUntil(runningAnimation3.getDistanceUntil() + runningAnimation3.getTimestamp());
                ((powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation) next4).setDistanceUntil(runningAnimation3.getDistanceUntil());
                arrayList6.add(runningAnimation3);
                next3 = next4;
            }
            listEmptyList2 = arrayList6;
        } else {
            listEmptyList2 = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list = listEmptyList2;
        java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            arrayList7.add((powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation) it6.next());
        }
        java.util.ArrayList arrayList8 = arrayList7;
        powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation runningAnimation4 = (powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) arrayList8);
        float distanceUntil = runningAnimation4 == null ? 0.0f : runningAnimation4.getDistanceUntil();
        int size = arrayList8.size();
        java.util.ArrayList arrayList9 = arrayList8;
        java.util.ArrayList arrayList10 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
        int i3 = 0;
        for (java.lang.Object obj : arrayList9) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            arrayList10.add(new powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData((powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation) obj, distanceUntil, kotlin.math.MathKt.roundToInt(i3 * (100.0f / size))));
            i3 = i4;
        }
        return new kotlin.Pair<>(kotlin.collections.CollectionsKt.distinct(arrayList10), java.lang.Integer.valueOf(size));
    }
}
