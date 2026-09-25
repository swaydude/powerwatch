package powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate;

/* JADX INFO: compiled from: ActivityHeartRateViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001dJ\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0016R#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "runningAnimator", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimator;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimator;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V", "limitLinePosition", "Landroidx/databinding/ObservableField;", "Lkotlin/Pair;", "", "", "getLimitLinePosition", "()Landroidx/databinding/ObservableField;", "linesData", "", "Lcom/github/mikephil/charting/data/LineDataSet;", "getLinesData", "getRxBus", "()Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "getUserPrefsUtils", "()Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "createLimitLineValue", "heartRate", "", "elevation", "loadActivityData", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.SESSION_KEY, "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "onChartClicked", "onCreateView", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ActivityHeartRateViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final androidx.databinding.ObservableField<kotlin.Pair<java.lang.String, java.lang.Float>> limitLinePosition;
    private final androidx.databinding.ObservableField<java.util.List<com.github.mikephil.charting.data.LineDataSet>> linesData;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator runningAnimator;
    private final powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    public final powerwatch.matrix.com.pwgen2android.shared.RxBus getRxBus() {
        return this.rxBus;
    }

    public final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils getUserPrefsUtils() {
        return this.userPrefsUtils;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityHeartRateViewModel(powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator runningAnimator, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runningAnimator, "runningAnimator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBus, "rxBus");
        this.runningAnimator = runningAnimator;
        this.userPrefsUtils = userPrefsUtils;
        this.rxBus = rxBus;
        this.linesData = new androidx.databinding.ObservableField<>(kotlin.collections.CollectionsKt.emptyList());
        this.limitLinePosition = new androidx.databinding.ObservableField<>(new kotlin.Pair("0", java.lang.Float.valueOf(0.0f)));
    }

    public final androidx.databinding.ObservableField<java.util.List<com.github.mikephil.charting.data.LineDataSet>> getLinesData() {
        return this.linesData;
    }

    public final androidx.databinding.ObservableField<kotlin.Pair<java.lang.String, java.lang.Float>> getLimitLinePosition() {
        return this.limitLinePosition;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        getCompositeDisposable().add(this.runningAnimator.runningAnimationEvents().observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.-$$Lambda$ActivityHeartRateViewModel$VTc9DdLH7bhEYSah7Ao-M8Ry9N8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel.m3465onCreateView$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m3465onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData mapAnimationData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        androidx.databinding.ObservableField<kotlin.Pair<java.lang.String, java.lang.Float>> limitLinePosition = this$0.getLimitLinePosition();
        powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate = mapAnimationData.getCurrentAnimationItem().getHeartRate();
        limitLinePosition.set(new kotlin.Pair<>(this$0.createLimitLineValue(heartRate == null ? 0 : heartRate.getValue(), mapAnimationData.getCurrentAnimationItem().getElevation()), java.lang.Float.valueOf(mapAnimationData.getCurrentAnimationItem().getDistanceUntil())));
    }

    private final java.lang.String createLimitLineValue(int heartRate, int elevation) {
        return heartRate + " bpm, \n" + elevation + ' ' + (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.userPrefsUtils.isMetricsUsedOrNull(), (java.lang.Object) true) ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricsMetersUnit : powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.imperialFeetUnit);
    }

    public final void loadActivityData(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession session) {
        java.util.List listEmptyList;
        java.util.ArrayList gpsPositions;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "session");
        java.util.Iterator<T> it = session.getHeartRates().iterator();
        if (it.hasNext()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.Object next = it.next();
            while (it.hasNext()) {
                java.lang.Object next2 = it.next();
                arrayList.add(java.lang.Float.valueOf(java.lang.Math.abs(((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) next2).getStartTime() - ((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) next).getStartTime())));
                next = next2;
            }
            listEmptyList = arrayList;
        } else {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) listEmptyList);
        float fFloatValue = 0.0f;
        mutableList.add(0, java.lang.Float.valueOf(0.0f));
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate> heartRates = session.getHeartRates();
        java.util.Iterator<T> it2 = heartRates.iterator();
        java.util.List list = mutableList;
        java.util.Iterator it3 = list.iterator();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(java.lang.Math.min(kotlin.collections.CollectionsKt.collectionSizeOrDefault(heartRates, 10), kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            arrayList2.add(new kotlin.Pair((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) it2.next(), java.lang.Float.valueOf(((java.lang.Number) it3.next()).floatValue())));
        }
        java.util.ArrayList<kotlin.Pair> arrayList3 = arrayList2;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        float fFloatValue2 = 0.0f;
        for (kotlin.Pair pair : arrayList3) {
            fFloatValue2 += ((java.lang.Number) pair.getSecond()).floatValue();
            arrayList4.add(new com.github.mikephil.charting.data.Entry(fFloatValue2, ((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) pair.getFirst()).getValue()));
        }
        com.github.mikephil.charting.data.LineDataSet lineDataSet = new com.github.mikephil.charting.data.LineDataSet(arrayList4, "Heart Rate");
        if (!session.getGpsPositions().isEmpty()) {
            gpsPositions = session.getGpsPositions();
        } else {
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate> heartRates2 = session.getHeartRates();
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(heartRates2, 10));
            java.util.Iterator<T> it4 = heartRates2.iterator();
            while (it4.hasNext()) {
                arrayList5.add(new powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition(0.0d, 0.0d, 0.0d, 0.0d, ((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) it4.next()).getEndTime(), 15, null));
            }
            gpsPositions = arrayList5;
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition> list2 = gpsPositions;
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it5 = list2.iterator();
        while (it5.hasNext()) {
            arrayList6.add(java.lang.Double.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) it5.next()).getAltitude()));
        }
        java.util.ArrayList arrayList7 = arrayList6;
        java.util.Iterator it6 = arrayList7.iterator();
        java.util.Iterator it7 = list.iterator();
        java.util.ArrayList arrayList8 = new java.util.ArrayList(java.lang.Math.min(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList7, 10), kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)));
        while (it6.hasNext() && it7.hasNext()) {
            arrayList8.add(new kotlin.Pair(java.lang.Double.valueOf(((java.lang.Number) it6.next()).doubleValue()), java.lang.Float.valueOf(((java.lang.Number) it7.next()).floatValue())));
        }
        java.util.ArrayList<kotlin.Pair> arrayList9 = arrayList8;
        java.util.ArrayList arrayList10 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
        for (kotlin.Pair pair2 : arrayList9) {
            fFloatValue += ((java.lang.Number) pair2.getSecond()).floatValue();
            arrayList10.add(new com.github.mikephil.charting.data.Entry(fFloatValue, (float) ((java.lang.Number) pair2.getFirst()).doubleValue()));
        }
        this.linesData.set(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.github.mikephil.charting.data.LineDataSet[]{lineDataSet, new com.github.mikephil.charting.data.LineDataSet(arrayList10, "Elevation")}));
    }

    public final void onChartClicked() {
        this.rxBus.send(powerwatch.matrix.com.pwgen2android.shared.ActivityChartClicked.INSTANCE);
    }
}
