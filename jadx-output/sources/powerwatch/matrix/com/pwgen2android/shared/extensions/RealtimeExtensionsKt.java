package powerwatch.matrix.com.pwgen2android.shared.extensions;

/* JADX INFO: compiled from: RealtimeExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\"\u00020\u0002¢\u0006\u0002\u0010\u0005\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0004\"\u00020\u0006¢\u0006\u0002\u0010\b\u001a\n\u0010\t\u001a\u00020\n*\u00020\u0006¨\u0006\u000b"}, d2 = {"add", "", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;", "dataItems", "", "(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;[Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;)V", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;", "valueItems", "(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;[Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;)V", "showPercentage", "", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class RealtimeExtensionsKt {
    public static final java.lang.String showPercentage(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realTimeValue, "<this>");
        if (realTimeValue.getGoalValue() == 0.0f) {
            return "0.00%";
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf((realTimeValue.getValue() * 100) / realTimeValue.getGoalValue())}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        return kotlin.jvm.internal.Intrinsics.stringPlus(str, "%");
    }

    public static final void add(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue... valueItems) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realTimeValue, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueItems, "valueItems");
        for (powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue2 : valueItems) {
            realTimeValue.setValue(realTimeValue.getValue() + realTimeValue2.getValue());
            realTimeValue.setGoalValue(!((realTimeValue.getGoalValue() > realTimeValue2.getGoalValue() ? 1 : (realTimeValue.getGoalValue() == realTimeValue2.getGoalValue() ? 0 : -1)) == 0) ? realTimeValue2.getGoalValue() : realTimeValue.getGoalValue());
        }
    }

    public static final void add(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData realTimeData, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData... dataItems) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realTimeData, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataItems, "dataItems");
        for (powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData realTimeData2 : dataItems) {
            add(realTimeData.getBodyPower(), realTimeData2.getBodyPower());
            add(realTimeData.getStepsData(), realTimeData2.getStepsData());
            add(realTimeData.getDistanceData(), realTimeData2.getDistanceData());
            add(realTimeData.getHeartBeatData(), realTimeData2.getHeartBeatData());
            add(realTimeData.getCaloriesData(), realTimeData2.getCaloriesData());
            add(realTimeData.getSleepData(), realTimeData2.getSleepData());
        }
    }
}
