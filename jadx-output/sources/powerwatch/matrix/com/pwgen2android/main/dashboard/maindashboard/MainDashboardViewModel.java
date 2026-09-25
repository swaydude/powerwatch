package powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard;

/* JADX INFO: compiled from: MainDashboardViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010!J\u0006\u0010K\u001a\u00020:J\u0010\u0010L\u001a\u00020:2\b\u0010I\u001a\u0004\u0018\u00010JJ\u0010\u0010M\u001a\u00020:2\b\u0010N\u001a\u0004\u0018\u00010JJ\u0010\u0010O\u001a\u00020:2\b\u0010I\u001a\u0004\u0018\u00010JJ\u0010\u0010P\u001a\u00020:2\u0006\u0010Q\u001a\u00020\u001cH\u0016J\u0010\u0010R\u001a\u00020:2\u0006\u0010Q\u001a\u00020\u001cH\u0016J\u0006\u0010S\u001a\u00020:J\u0006\u0010T\u001a\u00020:J\b\u0010U\u001a\u00020:H\u0002J\b\u0010V\u001a\u00020:H\u0002J\u0012\u0010W\u001a\u00020:2\b\u0010I\u001a\u0004\u0018\u00010JH\u0007J\u0006\u0010X\u001a\u00020:J\b\u0010Y\u001a\u00020:H\u0002J\b\u0010Z\u001a\u00020:H\u0002J\u0012\u0010[\u001a\u00020:2\b\u0010I\u001a\u0004\u0018\u00010JH\u0002J\f\u0010\\\u001a\u00020:*\u00020]H\u0007R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\"\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010$0$0#¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010+\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010,0,0#¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u001f\u0010-\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010,0,0#¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010\u001a0\u001a01X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u00102\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010,0,0#¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R5\u00104\u001a&\u0012\f\u0012\n %*\u0004\u0018\u00010606 %*\u0012\u0012\f\u0012\n %*\u0004\u0018\u00010606\u0018\u00010505¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020:05¢\u0006\b\n\u0000\u001a\u0004\b;\u00108R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010=\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010,0,0#¢\u0006\b\n\u0000\u001a\u0004\b>\u0010'R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010C\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010$0$0#¢\u0006\b\n\u0000\u001a\u0004\bD\u0010'R\u001f\u0010E\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010,0,0#¢\u0006\b\n\u0000\u001a\u0004\bF\u0010'R\u001f\u0010G\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010$0$0#¢\u0006\b\n\u0000\u001a\u0004\bH\u0010'R\u0010\u0010I\u001a\u0004\u0018\u00010JX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006^"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "goalConfigurationRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "watchSynchronizer", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;", "syncViewModel", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;", "bluetoothManager", "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;", "otaProcessExecutor", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;", "updateInfoRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "deviceManager", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;", "selectDate", "Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;", "selectedDateProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "parentFragmentManager", "Landroidx/fragment/app/FragmentManager;", "appContext", "Landroid/content/Context;", "metricsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;", "dashboardToastConfigViewModel", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;)V", "backButtonFieldText", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getBackButtonFieldText", "()Landroidx/databinding/ObservableField;", "connectionDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "dataDisposable", "isSwipeRefreshing", "", "isSyncBlocked", "mainHandler", "Landroid/os/Handler;", "parentFragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "pullToSyncDisplayed", "getPullToSyncDisplayed", "realtimeWidgetTapEvent", "Lio/reactivex/Observable;", "", "getRealtimeWidgetTapEvent", "()Lio/reactivex/Observable;", "scrollToTopEvent", "", "getScrollToTopEvent", "syncDisposable", "syncInProgress", "getSyncInProgress", "timer", "Ljava/util/Timer;", "timerValue", "", "toastActionButtonFieldText", "getToastActionButtonFieldText", "toastMessageDisplayed", "getToastMessageDisplayed", "toastMessageFieldText", "getToastMessageFieldText", "toolbar", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;", "onBackButtonClicked", "onConnectivityOff", "onConnectivityOn", "mainToolbar", "onConnectivitySearching", "onCreateView", "context", "onDestroyView", "onRefresh", "onRightButtonClicked", "onSyncFinished", "onSyncStarted", "prepare", "resetDateToToday", "startSync", "stopAnimation", "triggerAnimation", "onToastMessageClicked", "Landroid/view/View;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MainDashboardViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final android.content.Context appContext;
    private final androidx.databinding.ObservableField<java.lang.String> backButtonFieldText;
    private final powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager;
    private final io.reactivex.disposables.CompositeDisposable connectionDisposable;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageViewModel dashboardToastConfigViewModel;
    private final io.reactivex.disposables.CompositeDisposable dataDisposable;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository;
    private final androidx.databinding.ObservableField<java.lang.Boolean> isSwipeRefreshing;
    private final androidx.databinding.ObservableField<java.lang.Boolean> isSyncBlocked;
    private final android.os.Handler mainHandler;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> parentFragmentManagerWeakReference;
    private final androidx.databinding.ObservableField<java.lang.Boolean> pullToSyncDisplayed;
    private final io.reactivex.Observable<java.lang.Object> realtimeWidgetTapEvent;
    private final powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus;
    private final io.reactivex.Observable<kotlin.Unit> scrollToTopEvent;
    private final powerwatch.matrix.com.pwgen2android.shared.SelectDate selectDate;
    private final powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider;
    private final io.reactivex.disposables.CompositeDisposable syncDisposable;
    private final androidx.databinding.ObservableField<java.lang.Boolean> syncInProgress;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel syncViewModel;
    private java.util.Timer timer;
    private int timerValue;
    private final androidx.databinding.ObservableField<java.lang.String> toastActionButtonFieldText;
    private final androidx.databinding.ObservableField<java.lang.Boolean> toastMessageDisplayed;
    private final androidx.databinding.ObservableField<java.lang.String> toastMessageFieldText;
    private powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar toolbar;
    private final powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer watchSynchronizer;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-11, reason: not valid java name */
    public static final void m1818onCreateView$lambda11(powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult syncProcessResult) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: prepare$lambda-20, reason: not valid java name */
    public static final void m1831prepare$lambda20(java.lang.Throwable th) {
    }

    public final void onRightButtonClicked() {
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainDashboardViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer watchSynchronizer, powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel syncViewModel, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager, powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor otaProcessExecutor, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepository updateInfoRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, powerwatch.matrix.com.pwgen2android.shared.SelectDate selectDate, powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, androidx.fragment.app.FragmentManager parentFragmentManager, android.content.Context appContext, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageViewModel dashboardToastConfigViewModel) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationRepository, "goalConfigurationRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchSynchronizer, "watchSynchronizer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syncViewModel, "syncViewModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otaProcessExecutor, "otaProcessExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoRepository, "updateInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectDate, "selectDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedDateProvider, "selectedDateProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBus, "rxBus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentFragmentManager, "parentFragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRepository, "metricsRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dashboardToastConfigViewModel, "dashboardToastConfigViewModel");
        this.goalConfigurationRepository = goalConfigurationRepository;
        this.watchSynchronizer = watchSynchronizer;
        this.syncViewModel = syncViewModel;
        this.bluetoothManager = bluetoothManager;
        this.deviceManager = deviceManager;
        this.selectDate = selectDate;
        this.selectedDateProvider = selectedDateProvider;
        this.rxBus = rxBus;
        this.appContext = appContext;
        this.dashboardToastConfigViewModel = dashboardToastConfigViewModel;
        io.reactivex.Observable map = rxBus.getEvents().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$g0uK9KcjDE-jKhQhPPmkldNyBKw
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1833scrollToTopEvent$lambda0(obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$C-le_a1dZAuCIJ-zcXdfg5dGGXw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1834scrollToTopEvent$lambda1(obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "rxBus.events.filter { it is MainTabReselected }.map { Unit }");
        this.scrollToTopEvent = map;
        this.realtimeWidgetTapEvent = rxBus.getEvents().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$fd7YiHstIYlkD_gYkGrA7qyPLs0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1832realtimeWidgetTapEvent$lambda2(obj);
            }
        });
        this.syncDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.parentFragmentManagerWeakReference = new java.lang.ref.WeakReference<>(parentFragmentManager);
        this.isSwipeRefreshing = new androidx.databinding.ObservableField<>(false);
        this.isSyncBlocked = new androidx.databinding.ObservableField<>(false);
        this.syncInProgress = new androidx.databinding.ObservableField<>(false);
        this.toastMessageDisplayed = new androidx.databinding.ObservableField<>(false);
        this.toastMessageFieldText = new androidx.databinding.ObservableField<>("");
        this.backButtonFieldText = new androidx.databinding.ObservableField<>(appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.history));
        this.toastActionButtonFieldText = new androidx.databinding.ObservableField<>("");
        this.pullToSyncDisplayed = new androidx.databinding.ObservableField<>(false);
        this.mainHandler = new android.os.Handler();
        this.connectionDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.dataDisposable = new io.reactivex.disposables.CompositeDisposable();
        deviceManager.init();
        this.timer = new java.util.Timer();
    }

    public /* synthetic */ MainDashboardViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer watchSynchronizer, powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel syncViewModel, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager, powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor otaProcessExecutor, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepository updateInfoRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, powerwatch.matrix.com.pwgen2android.shared.SelectDate selectDate, powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, androidx.fragment.app.FragmentManager fragmentManager, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageViewModel dashboardToastMessageViewModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(goalConfigurationRepository, watchSynchronizer, syncViewModel, bluetoothManager, otaProcessExecutor, updateInfoRepository, deviceRepository, deviceManager, selectDate, selectedDateProvider, rxBus, fragmentManager, context, metricsRepository, (i & 16384) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageViewModel(bluetoothManager, deviceRepository, watchSynchronizer, updateInfoRepository, otaProcessExecutor, context, metricsRepository) : dashboardToastMessageViewModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: scrollToTopEvent$lambda-0, reason: not valid java name */
    public static final boolean m1833scrollToTopEvent$lambda0(java.lang.Object it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof powerwatch.matrix.com.pwgen2android.shared.MainTabReselected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: scrollToTopEvent$lambda-1, reason: not valid java name */
    public static final kotlin.Unit m1834scrollToTopEvent$lambda1(java.lang.Object it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.Unit.INSTANCE;
    }

    public final io.reactivex.Observable<kotlin.Unit> getScrollToTopEvent() {
        return this.scrollToTopEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: realtimeWidgetTapEvent$lambda-2, reason: not valid java name */
    public static final boolean m1832realtimeWidgetTapEvent$lambda2(java.lang.Object it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof powerwatch.matrix.com.pwgen2android.shared.RealTimeWidgetTap;
    }

    public final io.reactivex.Observable<java.lang.Object> getRealtimeWidgetTapEvent() {
        return this.realtimeWidgetTapEvent;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> isSwipeRefreshing() {
        return this.isSwipeRefreshing;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> isSyncBlocked() {
        return this.isSyncBlocked;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getSyncInProgress() {
        return this.syncInProgress;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getToastMessageDisplayed() {
        return this.toastMessageDisplayed;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getToastMessageFieldText() {
        return this.toastMessageFieldText;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getBackButtonFieldText() {
        return this.backButtonFieldText;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getToastActionButtonFieldText() {
        return this.toastActionButtonFieldText;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getPullToSyncDisplayed() {
        return this.pullToSyncDisplayed;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        this.dataDisposable.add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository.DefaultImpls.all$default(this.goalConfigurationRepository, null, false, 1, null).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$B-4YTza6SPU7Lj2HxmGi6LXywpI
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1820onCreateView$lambda3(this.f$0, (java.util.List) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$N4ZO93qUXDzICP-4qG85ZPdhxTc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1821onCreateView$lambda4(this.f$0, (java.lang.Throwable) obj);
            }
        }));
        this.pullToSyncDisplayed.set(java.lang.Boolean.valueOf(!powerwatch.matrix.com.pwgen2android.AppConfigPreferences.INSTANCE.getPullDownShown(context)));
        this.syncInProgress.set(java.lang.Boolean.valueOf(this.watchSynchronizer.getSyncInProgress()));
        this.syncDisposable.add(this.dashboardToastConfigViewModel.getCurrentConfig().distinctUntilChanged().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$TR2-v3mqkXSDaRjYc-CuAps-QYU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1822onCreateView$lambda6(this.f$0, context, (powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig) obj);
            }
        }));
        this.syncDisposable.add(this.watchSynchronizer.formattedDataOutput().repeat().retry().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$SFBYgVI4U69iEg7K8dXW0QByN6k
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1824onCreateView$lambda7(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.sync.SyncEvent.SyncFinishedEvent) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$Ykc5MfQJTb0Af4lUN4tEyMSGeNU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1825onCreateView$lambda8(this.f$0, (java.lang.Throwable) obj);
            }
        }));
        this.syncDisposable.add(this.watchSynchronizer.gpsTransferOutput().doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$VGPFeBYIaF0j870ezmberaO0OQM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1826onCreateView$lambda9(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult) obj);
            }
        }).doOnEach(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$ZMLNOTCpmIv3MbxpucCsuq4p4F4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1817onCreateView$lambda10(this.f$0, context, (io.reactivex.Notification) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$7GLnQcvYxJ7fiHyRdwKfmgtauxk
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1818onCreateView$lambda11((powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$znz-rzBYYnd21u4-tRDRRv6cx2I
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1819onCreateView$lambda12(this.f$0, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-3, reason: not valid java name */
    public static final void m1820onCreateView$lambda3(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel this$0, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.info$default(this$0, "Goals successfully retrieved from the server", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-4, reason: not valid java name */
    public static final void m1821onCreateView$lambda4(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Error while getting goals from the server..", th, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-6, reason: not valid java name */
    public static final void m1822onCreateView$lambda6(final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel this$0, android.content.Context context, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig dashboardToastMessageConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        this$0.isSyncBlocked().set(java.lang.Boolean.valueOf(this$0.watchSynchronizer.getSyncInProgress()));
        powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType type = dashboardToastMessageConfig.getType();
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.None.INSTANCE)) {
            this$0.getToastMessageDisplayed().set(false);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.OTAInProgress.INSTANCE)) {
            this$0.isSyncBlocked().set(true);
            this$0.getToastMessageDisplayed().set(false);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.FontUpdateInProgress.INSTANCE)) {
            this$0.syncViewModel.getSyncProgressText().set(context.getString(powerwatch.matrix.com.pwgen2android.R.string.font_update));
        } else {
            if (kotlin.jvm.internal.Intrinsics.areEqual(dashboardToastMessageConfig.getType(), powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.CriticalUpdateRequired.INSTANCE)) {
                this$0.isSyncBlocked().set(true);
            }
            this$0.getToastMessageFieldText().set(dashboardToastMessageConfig.getText());
            this$0.getToastMessageDisplayed().set(true);
            this$0.getToastActionButtonFieldText().set(dashboardToastMessageConfig.getButtonText());
        }
        if (dashboardToastMessageConfig.getDurationSec() != null) {
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$dFYUvGqZNrm7AF66a1e89wT5PwA
                @Override // java.lang.Runnable
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1823onCreateView$lambda6$lambda5(this.f$0);
                }
            }, ((long) dashboardToastMessageConfig.getDurationSec().intValue()) * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-6$lambda-5, reason: not valid java name */
    public static final void m1823onCreateView$lambda6$lambda5(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getToastMessageDisplayed().set(false);
        this$0.dashboardToastConfigViewModel.resetSyncErrorEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-7, reason: not valid java name */
    public static final void m1824onCreateView$lambda7(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.sync.SyncEvent.SyncFinishedEvent syncFinishedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "getInstance()");
        java.util.Calendar calendarMidnight = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.midnight(calendar);
        if (powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.isSameDay(this$0.selectedDateProvider.getSelectedDate(), calendarMidnight)) {
            return;
        }
        this$0.selectDate.setDate(calendarMidnight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-8, reason: not valid java name */
    public static final void m1825onCreateView$lambda8(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Sync tracker error received", th, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-9, reason: not valid java name */
    public static final void m1826onCreateView$lambda9(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult syncProcessResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.syncViewModel.getSyncProgressField().set(java.lang.Integer.valueOf(syncProcessResult.getProgress()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-10, reason: not valid java name */
    public static final void m1817onCreateView$lambda10(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel this$0, android.content.Context context, io.reactivex.Notification notification) {
        java.lang.String message;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult syncProcessResult = (powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult) notification.getValue();
        if (syncProcessResult instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.SyncProgress) {
            this$0.syncViewModel.getSyncProgressText().set(this$0.appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.syncing_watch));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("AGPS - Sync progress: datainfo - ");
            powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.SyncProgress syncProgress = (powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.SyncProgress) syncProcessResult;
            sb.append(syncProgress.getDataInfo() != null);
            sb.append(", progress: ");
            sb.append(syncProgress.getProgress());
            java.lang.System.out.println((java.lang.Object) sb.toString());
            if (!notification.isOnComplete() && !notification.isOnError()) {
                if (!notification.isOnNext()) {
                    return;
                }
                if (syncProgress.getDataInfo() == null && syncProgress.getError() == null) {
                    return;
                }
            }
            if (!syncProgress.getIsAGPSNeeded() || (syncProgress.getError() != null && (syncProgress.getError() instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.DeviceNotConnected))) {
                this$0.onSyncFinished();
            }
            this$0.syncViewModel.getSyncProgressField().set(0);
            if (syncProgress.getError() != null) {
                powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Sync error!", syncProgress.getError(), null, 4, null);
                java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.class).getSimpleName();
                java.lang.Throwable error = syncProgress.getError();
                java.lang.String str = "No message provided.";
                if (error != null && (message = error.getMessage()) != null) {
                    str = message;
                }
                android.util.Log.e(simpleName, str);
                return;
            }
            return;
        }
        if (syncProcessResult instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.AGPSProgress) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("AGPS Progress: started - ");
            powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.AGPSProgress aGPSProgress = (powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.AGPSProgress) syncProcessResult;
            sb2.append(aGPSProgress.getStarted());
            sb2.append(", completed: ");
            sb2.append(aGPSProgress.getCompleted());
            java.lang.System.out.println((java.lang.Object) sb2.toString());
            this$0.getSyncInProgress().set(java.lang.Boolean.valueOf(aGPSProgress.getStarted() && !aGPSProgress.getCompleted()));
            this$0.isSyncBlocked().set(java.lang.Boolean.valueOf(aGPSProgress.getStarted() && !aGPSProgress.getCompleted()));
            if (aGPSProgress.getCompleted()) {
                this$0.syncViewModel.getSyncProgressField().set(0);
            }
            this$0.syncViewModel.getSyncProgressText().set(context.getString(powerwatch.matrix.com.pwgen2android.R.string.performance_update));
            return;
        }
        if (syncProcessResult instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append("Font update progress: started - ");
            powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress fontUpdateProgress = (powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress) syncProcessResult;
            sb3.append(fontUpdateProgress.getStarted());
            sb3.append(", completed: ");
            sb3.append(fontUpdateProgress.getCompleted());
            java.lang.System.out.println((java.lang.Object) sb3.toString());
            this$0.getSyncInProgress().set(java.lang.Boolean.valueOf(fontUpdateProgress.getStarted() && !fontUpdateProgress.getCompleted()));
            this$0.isSyncBlocked().set(java.lang.Boolean.valueOf(fontUpdateProgress.getStarted() && !fontUpdateProgress.getCompleted()));
            if (fontUpdateProgress.getCompleted()) {
                this$0.syncViewModel.getSyncProgressField().set(0);
            }
            this$0.syncViewModel.getSyncProgressText().set(context.getString(powerwatch.matrix.com.pwgen2android.R.string.font_update));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-12, reason: not valid java name */
    public static final void m1819onCreateView$lambda12(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Sync error occurred.", th, null, 4, null);
    }

    private final void onSyncFinished() {
        this.syncInProgress.set(false);
        this.isSyncBlocked.set(false);
    }

    private final void onSyncStarted() {
        this.syncViewModel.getSyncProgressText().set(this.appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.syncing_watch));
        this.syncInProgress.set(true);
        this.isSyncBlocked.set(true);
    }

    public final void onBackButtonClicked() {
        androidx.fragment.app.FragmentManager fragmentManager = this.parentFragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.dashboard_fragment_container, true, null, 8, null);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002c  */
    public final void onRefresh() {
        java.lang.Boolean bool = this.pullToSyncDisplayed.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
        if (!bool.booleanValue()) {
            java.lang.Boolean bool2 = this.toastMessageDisplayed.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(bool2);
            if (bool2.booleanValue()) {
                powerwatch.matrix.com.pwgen2android.AppConfigPreferences.INSTANCE.setPullDownShown(true, this.appContext);
                this.pullToSyncDisplayed.set(false);
            }
        } else {
            powerwatch.matrix.com.pwgen2android.AppConfigPreferences.INSTANCE.setPullDownShown(true, this.appContext);
            this.pullToSyncDisplayed.set(false);
        }
        this.syncInProgress.set(true);
        this.isSwipeRefreshing.set(true);
        this.isSwipeRefreshing.set(false);
        startSync();
    }

    public final void onToastMessageClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.dashboardToastConfigViewModel.getCurrentConfig().firstOrError().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$v_ckqOJwxX6koOUO7d6pGTsI3e4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1827onToastMessageClicked$lambda13(this.f$0, (powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onToastMessageClicked$lambda-13, reason: not valid java name */
    public static final void m1827onToastMessageClicked$lambda13(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel this$0, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig dashboardToastMessageConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType type = dashboardToastMessageConfig.getType();
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.BluetoothDisabled.INSTANCE)) {
            this$0.bluetoothManager.enable();
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.CriticalUpdateRequired.INSTANCE)) {
            powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo updateInfo = dashboardToastMessageConfig.getUpdateInfo();
            powerwatch.matrix.com.pwgen2android.shared.data.models.Device device = dashboardToastMessageConfig.getDevice();
            powerwatch.matrix.com.pwgen2android.main.update.UpdateAvailableData updateAvailableData = new powerwatch.matrix.com.pwgen2android.main.update.UpdateAvailableData(new powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData(updateInfo.getReleaseVersion(), device.getFirmwareVersion(), updateInfo.getReleaseNotes(), updateInfo.getDownloadUrl(), device.getPid(), updateInfo.getReleaseDate()), new powerwatch.matrix.com.pwgen2android.main.update.DeviceUpdateData(device.getBluetoothAddress(), device.getFirmwareVersion()), true);
            androidx.fragment.app.FragmentManager fragmentManager = this$0.parentFragmentManagerWeakReference.get();
            if (fragmentManager == null) {
                return;
            }
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableFragment.INSTANCE.newInstance(updateAvailableData.getVersion(), updateAvailableData.getDeviceInfo(), updateAvailableData.getUpdateAvailable()), powerwatch.matrix.com.pwgen2android.R.id.dashboard_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
        }
    }

    private final void startSync() {
        onSyncStarted();
        this.watchSynchronizer.startSync(new powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig(false, null, null, false, false, 23, null));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroyView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroyView(context);
        this.syncDisposable.clear();
        this.dataDisposable.clear();
        this.connectionDisposable.clear();
        stopAnimation();
    }

    public final void resetDateToToday() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "getInstance()");
        java.util.Calendar calendarMidnight = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.midnight(calendar);
        if (powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.isSameDay(this.selectedDateProvider.getSelectedDate(), calendarMidnight)) {
            return;
        }
        this.selectDate.setDate(calendarMidnight);
    }

    /* JADX INFO: renamed from: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel$triggerAnimation$1, reason: invalid class name */
    /* JADX INFO: compiled from: MainDashboardViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"powerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel$triggerAnimation$1", "Ljava/util/TimerTask;", "run", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AnonymousClass1 extends java.util.TimerTask {
        final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar $toolbar;

        AnonymousClass1(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar) {
            this.$toolbar = mainToolbar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            java.lang.System.out.println((java.lang.Object) "timer_issue: running");
            android.os.Handler handler = powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.this.mainHandler;
            final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel mainDashboardViewModel = powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.this;
            final powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar = this.$toolbar;
            handler.post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$triggerAnimation$1$-kPUEyUTu_Q1cbczQllt3bx3-cM
                @Override // java.lang.Runnable
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.AnonymousClass1.m1836run$lambda0(mainDashboardViewModel, mainToolbar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: run$lambda-0, reason: not valid java name */
        public static final void m1836run$lambda0(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.timerValue = (this$0.timerValue + 1) % 4;
            java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("timer_issue: value - ", java.lang.Integer.valueOf(this$0.timerValue)));
            int i = this$0.timerValue;
            if (i == 0) {
                if (mainToolbar == null) {
                    return;
                }
                powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonIcon(mainToolbar, powerwatch.matrix.com.pwgen2android.R.mipmap.connectivity_searching_0);
            } else if (i == 1) {
                if (mainToolbar == null) {
                    return;
                }
                powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonIcon(mainToolbar, powerwatch.matrix.com.pwgen2android.R.mipmap.connectivity_searching_1);
            } else if ((i == 2 || i == 3 || i == 4) && mainToolbar != null) {
                powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonIcon(mainToolbar, powerwatch.matrix.com.pwgen2android.R.mipmap.connectivity_searching_2);
            }
        }
    }

    private final void triggerAnimation(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar toolbar) {
        this.timer.schedule(new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.AnonymousClass1(toolbar), 0L, 500L);
    }

    private final void stopAnimation() {
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("timer_issue: stopping - ", java.lang.Integer.valueOf(this.timerValue)));
        this.timer.cancel();
        this.timer.purge();
        this.timer = new java.util.Timer();
        this.timerValue = 0;
        java.lang.System.out.println((java.lang.Object) "timer_issue: stop done");
    }

    public final void onConnectivitySearching(final powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar toolbar) {
        java.lang.System.out.println((java.lang.Object) "timer_issue: searching");
        stopAnimation();
        this.mainHandler.post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$w4vRvk1ru3V6SDtWTk8aOoX_i1c
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1816onConnectivitySearching$lambda14(toolbar);
            }
        });
        triggerAnimation(toolbar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onConnectivitySearching$lambda-14, reason: not valid java name */
    public static final void m1816onConnectivitySearching$lambda14(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar) {
        if (mainToolbar == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonIcon(mainToolbar, powerwatch.matrix.com.pwgen2android.R.mipmap.connectivity_searching_0);
    }

    public final void onConnectivityOn(final powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar) {
        java.lang.System.out.println((java.lang.Object) "timer_issue: on");
        stopAnimation();
        this.mainHandler.post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$1KLaSiXD8ancBDBcGIJKdIma92U
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1815onConnectivityOn$lambda15(mainToolbar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onConnectivityOn$lambda-15, reason: not valid java name */
    public static final void m1815onConnectivityOn$lambda15(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar) {
        if (mainToolbar == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonIcon(mainToolbar, powerwatch.matrix.com.pwgen2android.R.mipmap.connectivity_on);
    }

    public final void onConnectivityOff(final powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar toolbar) {
        java.lang.System.out.println((java.lang.Object) "timer_issue: off");
        stopAnimation();
        this.mainHandler.post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$bPb-Jop865-5aAlLMZF3BE3Djnk
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1814onConnectivityOff$lambda16(toolbar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onConnectivityOff$lambda-16, reason: not valid java name */
    public static final void m1814onConnectivityOff$lambda16(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar) {
        if (mainToolbar == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonIcon(mainToolbar, powerwatch.matrix.com.pwgen2android.R.mipmap.connectivity_off);
    }

    public final void prepare(final powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar toolbar) {
        this.toolbar = toolbar;
        this.deviceManager.defaultDevice();
        this.bluetoothManager.isEnabled();
        this.connectionDisposable.add(io.reactivex.Observable.combineLatest(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.DefaultImpls.connect$default(this.deviceManager, false, 1, null).startWith(new powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo("", null, (short) 0, 0, "", null, null, null, 238, null)), this.bluetoothManager.getChangeState(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Enabled.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Disabled.INSTANCE).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$aI1kphLQtIT0G-0ppp-RWU-4vtw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1828prepare$lambda17((powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState) obj);
            }
        }).startWith(java.lang.Boolean.valueOf(this.bluetoothManager.isEnabled())), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$5EohLT5i7yRMzTs0gr_FLFj3tmE
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1829prepare$lambda18((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj, (java.lang.Boolean) obj2);
            }
        }).distinctUntilChanged().observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$uVXtR6y3vvZboY0_PFcuZM6WRXM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1830prepare$lambda19(this.f$0, toolbar, (powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardViewModel$3IJOOLhPBZ2UJtlc67AJ5FMrgGU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.m1831prepare$lambda20((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: prepare$lambda-17, reason: not valid java name */
    public static final java.lang.Boolean m1828prepare$lambda17(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Enabled.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: prepare$lambda-18, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState m1829prepare$lambda18(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, java.lang.Boolean bluetoothState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothState, "bluetoothState");
        if (deviceInfo.isConnected()) {
            return powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState.ConnectivityOn.INSTANCE;
        }
        if (bluetoothState.booleanValue()) {
            return powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState.ConnectivitySearch.INSTANCE;
        }
        return powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState.ConnectivityOff.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: prepare$lambda-19, reason: not valid java name */
    public static final void m1830prepare$lambda19(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState toolbarChangeState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (kotlin.jvm.internal.Intrinsics.areEqual(toolbarChangeState, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState.ConnectivityOn.INSTANCE)) {
            this$0.onConnectivityOn(mainToolbar);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(toolbarChangeState, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState.ConnectivityOff.INSTANCE)) {
            this$0.onConnectivityOff(mainToolbar);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(toolbarChangeState, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState.ConnectivitySearch.INSTANCE)) {
            this$0.onConnectivitySearching(mainToolbar);
        }
    }
}
