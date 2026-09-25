package powerwatch.matrix.com.pwgen2android.main.battery;

/* JADX INFO: compiled from: BatteryNotificationCenter.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/battery/MockProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;", "()V", "loadData", "Lio/reactivex/Observable;", "", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "observeCurrentData", "Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;", "observeData", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MockProvider implements powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider {
    @Override // powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData> observeData(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData> observeCurrentData() {
        io.reactivex.Observable observableConcatMap = io.reactivex.Observable.range(1, 10).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.battery.-$$Lambda$MockProvider$fpW4GzlWaJ3ZyFPWpTyl_3IXsbw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.battery.MockProvider.m1650observeCurrentData$lambda0((java.lang.Integer) obj);
            }
        }).concatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.battery.-$$Lambda$MockProvider$XQeN2MT0F2farxtvT1L-XSDOk3Q
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.battery.MockProvider.m1651observeCurrentData$lambda4((java.lang.Integer) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableConcatMap, "range(1, 10)\n                .doOnNext { println(\"mock_receive : next - $it\") }\n                .concatMap { next ->\n                    Observable.timer(5, TimeUnit.SECONDS)\n                            .map {\n                                val level = 100 - 10*next\n\n                                RealtimeWatchData(batteryPercent = level.toFloat())\n                                        .apply {\n                                            when (level) {\n                                                90 -> totalSteps = 12000\n                                                60 -> totalSleep = 600\n                                                40 -> totalActiveCalories = 5000\n                                                10 -> totalThermalPower = 5000\n                                            }\n                                        }\n                            }\n                            .doOnNext { \"mock_receive : next run - ${it.batteryPercent}\" }\n                }");
        return observableConcatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: observeCurrentData$lambda-0, reason: not valid java name */
    public static final void m1650observeCurrentData$lambda0(java.lang.Integer num) {
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("mock_receive : next - ", num));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: observeCurrentData$lambda-4, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1651observeCurrentData$lambda4(final java.lang.Integer next) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
        return io.reactivex.Observable.timer(5L, java.util.concurrent.TimeUnit.SECONDS).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.battery.-$$Lambda$MockProvider$N2vB96qz5S1pLrsB9_2YekdyI4E
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.battery.MockProvider.m1652observeCurrentData$lambda4$lambda2(next, (java.lang.Long) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.battery.-$$Lambda$MockProvider$1k1HItYBWjsGe4z90jpsu-TT9hQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.battery.MockProvider.m1653observeCurrentData$lambda4$lambda3((powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: observeCurrentData$lambda-4$lambda-2, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData m1652observeCurrentData$lambda4$lambda2(java.lang.Integer next, java.lang.Long it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "$next");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        int iIntValue = 100 - (next.intValue() * 10);
        powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData realtimeWatchData = new powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData(0, 0, 0, 0.0f, 0, 0, 0L, 0.0f, iIntValue, null, 767, null);
        if (iIntValue == 10) {
            realtimeWatchData.setTotalThermalPower(5000);
            return realtimeWatchData;
        }
        if (iIntValue == 40) {
            realtimeWatchData.setTotalActiveCalories(5000);
            return realtimeWatchData;
        }
        if (iIntValue == 60) {
            realtimeWatchData.setTotalSleep(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ANALYTICS_FLUSH_INTERVAL_SECS_DEFAULT);
            return realtimeWatchData;
        }
        if (iIntValue != 90) {
            return realtimeWatchData;
        }
        realtimeWatchData.setTotalSteps(12000);
        return realtimeWatchData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: observeCurrentData$lambda-4$lambda-3, reason: not valid java name */
    public static final void m1653observeCurrentData$lambda4$lambda3(powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData realtimeWatchData) {
        kotlin.jvm.internal.Intrinsics.stringPlus("mock_receive : next run - ", java.lang.Float.valueOf(realtimeWatchData.getBatteryPercent()));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.providers.DataProvider
    public io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData>> loadData(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
