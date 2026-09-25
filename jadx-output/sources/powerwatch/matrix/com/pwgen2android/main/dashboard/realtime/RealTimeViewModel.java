package powerwatch.matrix.com.pwgen2android.main.dashboard.realtime;

/* JADX INFO: compiled from: RealTimeViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u001bH\u0002J\u0010\u00107\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u00108\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u00109\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010:\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010;\u001a\u000205*\u00020<J\n\u0010=\u001a\u000205*\u00020<J\n\u0010>\u001a\u000205*\u00020<J\n\u0010?\u001a\u000205*\u00020<R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0012R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0012R \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014R \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010\u0014R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0012\"\u0004\b0\u0010\u0014R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0012\"\u0004\b3\u0010\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "realTimeDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;", "selectedDateProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "context", "Landroid/content/Context;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Landroid/content/Context;)V", "bodyPowerField", "Landroidx/databinding/ObservableField;", "", "getBodyPowerField", "()Landroidx/databinding/ObservableField;", "setBodyPowerField", "(Landroidx/databinding/ObservableField;)V", "caloriesField", "getCaloriesField", "setCaloriesField", "dataDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "dataField", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;", "getDataField", "setDataField", "distanceField", "getDistanceField", "setDistanceField", "heartBeatField", "getHeartBeatField", "setHeartBeatField", "selectedDateSubTitle", "getSelectedDateSubTitle", "selectedDateTitle", "getSelectedDateTitle", "sleepField", "getSleepField", "setSleepField", "sleepPercentageField", "getSleepPercentageField", "setSleepPercentageField", "solarPowerField", "getSolarPowerField", "setSolarPowerField", "stepsField", "getStepsField", "setStepsField", "fillUpUI", "", "realTimeData", "loadData", "onCreateView", "onDataReload", "onDestroyView", "onCaloriesCircleClicked", "Landroid/view/View;", "onPowerCircleClicked", "onSleepCircleClicked", "onStepsCircleClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RealTimeViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private androidx.databinding.ObservableField<java.lang.String> bodyPowerField;
    private androidx.databinding.ObservableField<java.lang.String> caloriesField;
    private final io.reactivex.disposables.CompositeDisposable dataDisposable;
    private androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData> dataField;
    private androidx.databinding.ObservableField<java.lang.String> distanceField;
    private androidx.databinding.ObservableField<java.lang.String> heartBeatField;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider realTimeDataProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus;
    private final powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider;
    private final androidx.databinding.ObservableField<java.lang.String> selectedDateSubTitle;
    private final androidx.databinding.ObservableField<java.lang.String> selectedDateTitle;
    private androidx.databinding.ObservableField<java.lang.String> sleepField;
    private androidx.databinding.ObservableField<java.lang.String> sleepPercentageField;
    private androidx.databinding.ObservableField<java.lang.String> solarPowerField;
    private androidx.databinding.ObservableField<java.lang.String> stepsField;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTimeViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider realTimeDataProvider, powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, android.content.Context context) {
        super(context, rxBus);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realTimeDataProvider, "realTimeDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedDateProvider, "selectedDateProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBus, "rxBus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.realTimeDataProvider = realTimeDataProvider;
        this.selectedDateProvider = selectedDateProvider;
        this.userPrefsUtils = userPrefsUtils;
        this.rxBus = rxBus;
        this.bodyPowerField = new androidx.databinding.ObservableField<>();
        this.solarPowerField = new androidx.databinding.ObservableField<>();
        this.stepsField = new androidx.databinding.ObservableField<>();
        this.distanceField = new androidx.databinding.ObservableField<>();
        this.caloriesField = new androidx.databinding.ObservableField<>();
        this.heartBeatField = new androidx.databinding.ObservableField<>();
        this.sleepField = new androidx.databinding.ObservableField<>();
        this.sleepPercentageField = new androidx.databinding.ObservableField<>();
        this.selectedDateTitle = new androidx.databinding.ObservableField<>("");
        this.selectedDateSubTitle = new androidx.databinding.ObservableField<>("");
        this.dataField = new androidx.databinding.ObservableField<>();
        this.dataDisposable = new io.reactivex.disposables.CompositeDisposable();
    }

    public final androidx.databinding.ObservableField<java.lang.String> getBodyPowerField() {
        return this.bodyPowerField;
    }

    public final void setBodyPowerField(androidx.databinding.ObservableField<java.lang.String> observableField) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.bodyPowerField = observableField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getSolarPowerField() {
        return this.solarPowerField;
    }

    public final void setSolarPowerField(androidx.databinding.ObservableField<java.lang.String> observableField) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.solarPowerField = observableField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getStepsField() {
        return this.stepsField;
    }

    public final void setStepsField(androidx.databinding.ObservableField<java.lang.String> observableField) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.stepsField = observableField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getDistanceField() {
        return this.distanceField;
    }

    public final void setDistanceField(androidx.databinding.ObservableField<java.lang.String> observableField) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.distanceField = observableField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getCaloriesField() {
        return this.caloriesField;
    }

    public final void setCaloriesField(androidx.databinding.ObservableField<java.lang.String> observableField) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.caloriesField = observableField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getHeartBeatField() {
        return this.heartBeatField;
    }

    public final void setHeartBeatField(androidx.databinding.ObservableField<java.lang.String> observableField) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.heartBeatField = observableField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getSleepField() {
        return this.sleepField;
    }

    public final void setSleepField(androidx.databinding.ObservableField<java.lang.String> observableField) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.sleepField = observableField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getSleepPercentageField() {
        return this.sleepPercentageField;
    }

    public final void setSleepPercentageField(androidx.databinding.ObservableField<java.lang.String> observableField) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.sleepPercentageField = observableField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getSelectedDateTitle() {
        return this.selectedDateTitle;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getSelectedDateSubTitle() {
        return this.selectedDateSubTitle;
    }

    public final androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData> getDataField() {
        return this.dataField;
    }

    public final void setDataField(androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData> observableField) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.dataField = observableField;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDataReload(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDataReload(context);
        loadData(context);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        fillUpUI(new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData(null, null, null, null, null, null, null, kotlinx.coroutines.scheduling.WorkQueueKt.MASK, null));
        loadData(context);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroyView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroyView(context);
        this.dataDisposable.clear();
    }

    private final void loadData(final android.content.Context context) {
        this.dataDisposable.clear();
        this.dataDisposable.add(this.selectedDateProvider.getSelectedDateObservable().flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.-$$Lambda$RealTimeViewModel$BigpfZ0HV3rrdfvhQqWsfl5FYHM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel.m1843loadData$lambda1(this.f$0, (java.util.Calendar) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.-$$Lambda$RealTimeViewModel$KnL7-ZbbORBvOzJFPXTarV8b1oE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel.m1845loadData$lambda2(this.f$0, context, (kotlin.Pair) obj);
            }
        }).switchMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.-$$Lambda$RealTimeViewModel$ya6Fo_v72uOqrydQoAIIQXEbn-Y
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel.m1846loadData$lambda3(this.f$0, (kotlin.Pair) obj);
            }
        }).retry().repeat().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.-$$Lambda$RealTimeViewModel$WvXsB-ROa9XYTllLqOtGGcRksF8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel.m1847loadData$lambda4(this.f$0, (powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.-$$Lambda$RealTimeViewModel$GSoM_igsiwj1izhwmlecSBx9hzs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel.m1848loadData$lambda5(this.f$0, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadData$lambda-1, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1843loadData$lambda1(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel this$0, final java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "calendar");
        return this$0.userPrefsUtils.getLanguage().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.-$$Lambda$RealTimeViewModel$m5ZnE_5OBnObst2ZpgkllyCvFV4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel.m1844loadData$lambda1$lambda0(calendar, (powerwatch.matrix.com.pwgen2android.utils.LanguageInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadData$lambda-1$lambda-0, reason: not valid java name */
    public static final kotlin.Pair m1844loadData$lambda1$lambda0(java.util.Calendar calendar, powerwatch.matrix.com.pwgen2android.utils.LanguageInfo language) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "$calendar");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "language");
        return new kotlin.Pair(language.getLanguageKey(), calendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadData$lambda-2, reason: not valid java name */
    public static final void m1845loadData$lambda2(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel this$0, android.content.Context context, kotlin.Pair pair) {
        java.lang.String strMonthDayYearFormatText;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        androidx.databinding.ObservableField<java.lang.String> selectedDateTitle = this$0.getSelectedDateTitle();
        java.lang.Object second = pair.getSecond();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(second, "it.second");
        if (powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.isToday((java.util.Calendar) second)) {
            strMonthDayYearFormatText = context.getString(powerwatch.matrix.com.pwgen2android.R.string.today);
        } else {
            java.lang.Object second2 = pair.getSecond();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(second2, "it.second");
            strMonthDayYearFormatText = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthDayYearFormatText((java.util.Calendar) second2, (java.lang.String) pair.getFirst());
        }
        selectedDateTitle.set(strMonthDayYearFormatText);
        androidx.databinding.ObservableField<java.lang.String> selectedDateSubTitle = this$0.getSelectedDateSubTitle();
        java.lang.Object second3 = pair.getSecond();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(second3, "it.second");
        selectedDateSubTitle.set(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.weekDayName((java.util.Calendar) second3));
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.setIncomingCallString(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.getIncomingCallString((java.lang.String) pair.getFirst()));
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.setMissedCallString(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.getMissedCallString((java.lang.String) pair.getFirst()));
        powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.setBatteryTitle(powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getBatteryTitle((java.lang.String) pair.getFirst()));
        powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.setBatteryLowMessage(powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getBatteryLowMessage((java.lang.String) pair.getFirst()));
        powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.setBatteryCriticalMessage(powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getBatteryCriticalMessage((java.lang.String) pair.getFirst()));
        powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.setWatchConnectedTitle(powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getWatchConnectedTitle((java.lang.String) pair.getFirst()));
        powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.setWatchConnectedBody(powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getWatchConnectedBody((java.lang.String) pair.getFirst()));
        powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.setWatchDisconnectedTitle(powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getWatchDisconnectedTitle((java.lang.String) pair.getFirst()));
        powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.setWatchDisconnectedBody(powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getWatchDisconnectedBody((java.lang.String) pair.getFirst()));
        powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.setGoalsAchievedResource(powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getGoalMessage((java.lang.String) pair.getFirst()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadData$lambda-3, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1846loadData$lambda3(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel this$0, kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.realTimeDataProvider.observeData(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(24, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayHoursOffsetFromToday(this$0.selectedDateProvider.getSelectedDate()), 0L, 0, 12, null)).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadData$lambda-4, reason: not valid java name */
    public static final void m1847loadData$lambda4(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel this$0, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.fillUpUI(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadData$lambda-5, reason: not valid java name */
    public static final void m1848loadData$lambda5(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Day data error occurred: Error is: ", th, null, 4, null);
    }

    private final void fillUpUI(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData realTimeData) {
        this.bodyPowerField.set(java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(realTimeData.getBodyPower().getValue())));
        this.solarPowerField.set(java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(realTimeData.getSolarPower().getValue())));
        this.stepsField.set(java.lang.String.valueOf((int) realTimeData.getStepsData().getValue()));
        kotlin.Pair<java.lang.Float, java.lang.String> value = this.userPrefsUtils.getValue(java.lang.Float.valueOf(realTimeData.getDistanceData().getValue()), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.DISTANCE.INSTANCE);
        this.distanceField.set(powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.twoDecimalsFormat(value.getFirst().floatValue()) + ' ' + value.getSecond());
        this.caloriesField.set(java.lang.String.valueOf((int) realTimeData.getCaloriesData().getValue()));
        this.heartBeatField.set(java.lang.String.valueOf((int) realTimeData.getHeartBeatData().getValue()));
        this.sleepField.set(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.minutesToHoursAndMinutesFormat((int) realTimeData.getSleepData().getValue(), false));
        this.sleepPercentageField.set(powerwatch.matrix.com.pwgen2android.shared.extensions.RealtimeExtensionsKt.showPercentage(realTimeData.getSleepData()));
        this.dataField.set(realTimeData);
    }

    public final void onPowerCircleClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.rxBus.send(powerwatch.matrix.com.pwgen2android.shared.RealTimeWidgetTap.PowerWidgetTap.INSTANCE);
    }

    public final void onStepsCircleClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.rxBus.send(powerwatch.matrix.com.pwgen2android.shared.RealTimeWidgetTap.StepsWidgetTap.INSTANCE);
    }

    public final void onCaloriesCircleClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.rxBus.send(powerwatch.matrix.com.pwgen2android.shared.RealTimeWidgetTap.CaloriesWidgetTap.INSTANCE);
    }

    public final void onSleepCircleClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.rxBus.send(powerwatch.matrix.com.pwgen2android.shared.RealTimeWidgetTap.SleepWidgetTap.INSTANCE);
    }
}
