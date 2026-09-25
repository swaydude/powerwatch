package powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api;

/* JADX INFO: compiled from: TCXWriter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\b¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriter;", "", "()V", "gpsPosition", "", "point", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;", "mapToTCXActivity", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;", "userActivitySession", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "write", "tcxActivity", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TCXWriter {
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXActivity mapToTCXActivity(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession) {
        java.util.List listEmptyList;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivitySession, "userActivitySession");
        java.util.List<kotlin.Pair> listZip = kotlin.collections.CollectionsKt.zip(userActivitySession.getGpsPositions(), userActivitySession.getHeartRates());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listZip, 10));
        for (kotlin.Pair pair : listZip) {
            powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gPSPosition = (powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) pair.getFirst();
            arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXPoint(gPSPosition.getLatitude(), gPSPosition.getLongitude(), ((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) pair.getSecond()).getValue(), gPSPosition.getTimestamp(), 0.0f, 16, null));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition> gpsPositions = userActivitySession.getGpsPositions();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator<T> it = gpsPositions.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gPSPosition2 = (powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) next;
            if (!(gPSPosition2.getLatitude() == 0.0d)) {
                if (!(gPSPosition2.getLongitude() == 0.0d)) {
                    z = true;
                }
            }
            if (z) {
                arrayList3.add(next);
            }
        }
        java.util.Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.Object next2 = it2.next();
            while (it2.hasNext()) {
                java.lang.Object next3 = it2.next();
                arrayList4.add(java.lang.Float.valueOf(powerwatch.matrix.com.pwgen2android.shared.data.models.ActivityPeriodsModelsKt.toLocation((powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) next2).distanceTo(powerwatch.matrix.com.pwgen2android.shared.data.models.ActivityPeriodsModelsKt.toLocation((powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) next3))));
                next2 = next3;
            }
            listEmptyList = arrayList4;
        } else {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        float f = 0.0f;
        int i = 0;
        for (java.lang.Object obj2 : listEmptyList) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue = ((java.lang.Number) obj2).floatValue();
            powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXPoint tCXPoint = (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXPoint) kotlin.collections.CollectionsKt.getOrNull(arrayList2, i);
            if (tCXPoint != null) {
                tCXPoint.setDistanceFromStart(f > userActivitySession.getDistance() ? userActivitySession.getDistance() : f);
            }
            f += fFloatValue;
            i = i2;
        }
        ((powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXPoint) kotlin.collections.CollectionsKt.last((java.util.List) arrayList2)).setDistanceFromStart(userActivitySession.getDistance());
        java.util.Iterator<T> it3 = userActivitySession.getHeartRates().iterator();
        if (it3.hasNext()) {
            java.lang.Object next4 = it3.next();
            if (it3.hasNext()) {
                int value = ((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) next4).getValue();
                do {
                    java.lang.Object next5 = it3.next();
                    int value2 = ((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) next5).getValue();
                    if (value < value2) {
                        next4 = next5;
                        value = value2;
                    }
                } while (it3.hasNext());
            }
            obj = next4;
        } else {
            obj = null;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate = (powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) obj;
        int value3 = heartRate == null ? 0 : heartRate.getValue();
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate> heartRates = userActivitySession.getHeartRates();
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(heartRates, 10));
        java.util.Iterator<T> it4 = heartRates.iterator();
        while (it4.hasNext()) {
            arrayList5.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) it4.next()).getValue()));
        }
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXActivity(arrayList2, userActivitySession.getDistance(), powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXWriterKt.getTCXType(userActivitySession.getActivityType()), userActivitySession.getStartTime(), userActivitySession.getEndTime(), userActivitySession.getActiveCalories(), userActivitySession.getBmrCalories(), (int) kotlin.collections.CollectionsKt.averageOfInt(arrayList5), value3, 0.0f, 512, null);
    }

    public final java.lang.String write(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXActivity tcxActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcxActivity, "tcxActivity");
        java.lang.String strGpxTimeFormat = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.gpxTimeFormat(tcxActivity.getStartTime());
        long endTime = (tcxActivity.getEndTime() - tcxActivity.getStartTime()) / ((long) 1000);
        float activeCalories = (tcxActivity.getActiveCalories() * 1.0f) / 1000;
        java.lang.String str = "\n<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\" ?> \n    <TrainingCenterDatabase xmlns=\"http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" \n                            xsi:schemaLocation=\"http://www.garmin.com/xmlschemas/ActivityExtension/v2 http://www.garmin.com/xmlschemas/ActivityExtensionv2.xsd \n                            http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2 http://www.garmin.com/xmlschemas/TrainingCenterDatabasev2.xsd\">\n        <Activities>\n            <Activity Sport=\"" + tcxActivity.getType() + "\">\n                <Id>" + strGpxTimeFormat + "</Id>\n                <Lap StartTime=\"" + strGpxTimeFormat + "\">\n                    <TotalTimeSeconds>" + endTime + "</TotalTimeSeconds>\n                    <DistanceMeters>" + tcxActivity.getDistance() + "</DistanceMeters>\n                    <Calories>" + activeCalories + "</Calories>\n                    <AverageHeartRateBpm xsi:type=\"HeartRateInBeatsPerMinute_t\">\n                        <Value>" + tcxActivity.getAvgHeartRate() + "</Value>\n                    </AverageHeartRateBpm>\n                    <MaximumHeartRateBpm xsi:type=\"HeartRateInBeatsPerMinute_t\">\n                        <Value>" + tcxActivity.getMaxHeartRate() + "</Value>\n                    </MaximumHeartRateBpm>\n                    <Intensity>Active</Intensity>\n                    <TriggerMethod>Location</TriggerMethod>\n                    <Track>\n";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXPoint tCXPoint : tcxActivity.getPoints()) {
            sb.append("\n                        <Trackpoint>\n                        <DistanceMeters>" + tCXPoint.getDistanceFromStart() + "</DistanceMeters>\n                        <Time>" + powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.gpxTimeFormat(tCXPoint.getTime()) + "</Time>\n                        " + gpsPosition(tCXPoint) + "\n                          <HeartRateBpm xsi:type=\"HeartRateInBeatsPerMinute_t\">\n                            <Value>" + tCXPoint.getHeartRate() + "</Value>\n                          </HeartRateBpm>\n                          <SensorState>Present</SensorState>\n                            <Extensions>\n                            <ns3:TPX/>\n                            </Extensions>\n                        </Trackpoint>\n                        ");
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "pointBuild.toString()");
        return str + string + "\n                    </Track>\n                </Lap>\n            </Activity>\n        </Activities>\n    </TrainingCenterDatabase>\n   ";
    }

    private final java.lang.String gpsPosition(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXPoint point) {
        if (point.getLat() == 0.0d) {
            if (point.getLong() == 0.0d) {
                return "";
            }
        }
        return " <Position>\n                            <LatitudeDegrees>" + point.getLat() + "</LatitudeDegrees>\n                            <LongitudeDegrees>" + point.getLong() + "</LongitudeDegrees>\n                          </Position>\n            ";
    }
}
