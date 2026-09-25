package powerwatch.matrix.com.pwgen2android.pair.ui.gen2;

/* JADX INFO: compiled from: Gen2PairingProgressViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010\u001eJ\u0010\u0010)\u001a\u00020*2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010&R\u001c\u0010\u001f\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\u00050\u00050 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010&0&0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;", "Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingBaseViewModel;", "context", "Landroid/content/Context;", "activity", "Landroid/app/Activity;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "connectionPreference", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "languageController", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;", "goalConfigurationRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "logger", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;", "bluetoothManager", "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "sleepTimeStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;", "deviceProtocolStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;", "metricsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;", "(Landroid/content/Context;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V", "activityWeakRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "isDevicePaired", "", "pairingInfoSubject", "Lio/reactivex/subjects/PublishSubject;", "", "getSleepTimeStorage", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;", "onDestroyView", "", "startPairing", "pairingCode", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2PairingProgressViewModel extends powerwatch.matrix.com.pwgen2android.pair.ui.PairingBaseViewModel {
    private final java.lang.ref.WeakReference<android.app.Activity> activityWeakRef;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference connectionPreference;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository;
    private boolean isDevicePaired;
    private final powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput logger;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository;
    private final io.reactivex.subjects.PublishSubject<java.lang.String> pairingInfoSubject;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage sleepTimeStorage;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-2, reason: not valid java name */
    public static final java.lang.String m2068_init_$lambda2(java.lang.Boolean noName_0, java.lang.String deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return deviceInfo;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage getSleepTimeStorage() {
        return this.sleepTimeStorage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2PairingProgressViewModel(android.content.Context context, android.app.Activity activity, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference connectionPreference, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput logger, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage sleepTimeStorage, final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage deviceProtocolStorage, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository) {
        super(deviceRepository, userAccountRepository, goalConfigurationRepository, languageController, communicator, bluetoothManager, fragmentManager, logger, activity);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionPreference, "connectionPreference");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageController, "languageController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationRepository, "goalConfigurationRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepTimeStorage, "sleepTimeStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceProtocolStorage, "deviceProtocolStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRepository, "metricsRepository");
        this.communicator = communicator;
        this.connectionPreference = connectionPreference;
        this.userAccountRepository = userAccountRepository;
        this.languageController = languageController;
        this.goalConfigurationRepository = goalConfigurationRepository;
        this.logger = logger;
        this.sleepTimeStorage = sleepTimeStorage;
        this.metricsRepository = metricsRepository;
        io.reactivex.subjects.PublishSubject<java.lang.String> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<String>()");
        this.pairingInfoSubject = publishSubjectCreate;
        this.activityWeakRef = new java.lang.ref.WeakReference<>(activity);
        getCompositeDisposable().add(io.reactivex.Observable.combineLatest(getBluetoothEnabledSubject().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$GtVeGKYqXbQUhJgU42ErQzXn6Nk
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2066_init_$lambda0((java.lang.Boolean) obj);
            }
        }), publishSubjectCreate.doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$FqpqNy0HaJsYz4mp_jU3zTS2vYU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2067_init_$lambda1(this.f$0, (java.lang.String) obj);
            }
        }), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$9q_CBBlKZiweQZL8h94VPrhIHiQ
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2068_init_$lambda2((java.lang.Boolean) obj, (java.lang.String) obj2);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$9LtyUGKjVLkB2Ijj6x8syRhNwtA
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2069_init_$lambda20(this.f$0, deviceProtocolStorage, (java.lang.String) obj);
            }
        }));
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final boolean m2066_init_$lambda0(java.lang.Boolean it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final void m2067_init_$lambda1(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel this$0, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.metricsRepository.logEvent(new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent(powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.PairStart.INSTANCE, null, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-20, reason: not valid java name */
    public static final void m2069_init_$lambda20(final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel this$0, final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage deviceProtocolStorage, final java.lang.String str) {
        java.lang.String string;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceProtocolStorage, "$deviceProtocolStorage");
        this$0.getPairingDisposable().add(this$0.communicator.foundDevicesChange().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$S5IEEmq1BvC545lPFzs7tgrx27s
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2086lambda20$lambda3(str, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }).take(1L).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$h4RMqCDdU6QoOBvsfbvNTpZJHBE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2087lambda20$lambda4(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$FO7KEKUX_ojcmunOPg926VtMEq8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2088lambda20$lambda5(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$JPziVhf02s71yRSlNLAqUndHjVg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2073lambda20$lambda15(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }).timeout(60L, java.util.concurrent.TimeUnit.SECONDS).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$7vn7snwyOFb1hyRBd8pQG6aWSzo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2082lambda20$lambda16((java.lang.Throwable) obj);
            }
        }).take(1L).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).doOnDispose(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$mcXANjE5vTDfueQdJtxAbOrIdhE
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2083lambda20$lambda17(this.f$0);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$80D612e6DcdRsrHn07VeDucJjaI
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2084lambda20$lambda18(this.f$0, deviceProtocolStorage, (kotlin.Pair) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$aKZ7TyRX-JBL5R6NtUkA0HMKhPo
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2085lambda20$lambda19(this.f$0, (java.lang.Throwable) obj);
            }
        }));
        android.content.Context context = this$0.getContextWeakRef().get();
        java.lang.String str2 = "Searching for ";
        if (context != null && (string = context.getString(powerwatch.matrix.com.pwgen2android.R.string.searching_for_single_device)) != null) {
            str2 = string;
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str3 = java.lang.String.format(str2, java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "java.lang.String.format(format, *args)");
        this$0.getPairingProgressText().set(str3);
        // --- PATCHED: scan for all BLE devices instead of just "PowerWatch 2" ---
this$0.communicator.startScanning(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-20$lambda-3, reason: not valid java name */
    public static final boolean m2086lambda20$lambda3(java.lang.String pairingCode, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.lang.Short pairingCode2 = it.getPairingCode();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pairingCode, "pairingCode");
        return pairingCode2 != null && pairingCode2.shortValue() == java.lang.Short.parseShort(pairingCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-20$lambda-4, reason: not valid java name */
    public static final void m2087lambda20$lambda4(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.communicator.releaseScanningResources();
        androidx.databinding.ObservableField<java.lang.String> pairingProgressText = this$0.getPairingProgressText();
        android.app.Activity activity = this$0.activityWeakRef.get();
        pairingProgressText.set(activity == null ? null : activity.getString(powerwatch.matrix.com.pwgen2android.R.string.connecting_to_device));
        this$0.connectionPreference.enableAutoConnect(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-20$lambda-5, reason: not valid java name */
    public static final void m2088lambda20$lambda5(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.communicator.startConnection(kotlin.collections.CollectionsKt.listOf(deviceInfo.getUid()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-20$lambda-15, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2073lambda20$lambda15(final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel this$0, final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo scannnedDevice) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scannnedDevice, "scannnedDevice");
        return this$0.communicator.connectedDevicesChange().take(1L).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$a1JfDJS-04DdsIjKEAO27gBJ02w
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2080lambda20$lambda15$lambda6(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }).withLatestFrom(this$0.getUserData(), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$A86-ddK3W1AjufFgNCvsiejqeQQ
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2081lambda20$lambda15$lambda8(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj, (powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig) obj2);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$wG0eesOTZWCe0M32Gfv7mvSSNok
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2074lambda20$lambda15$lambda14(this.f$0, scannnedDevice, (kotlin.Pair) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-20$lambda-15$lambda-6, reason: not valid java name */
    public static final void m2080lambda20$lambda15$lambda6(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.connectionPreference.restoreLastState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-20$lambda-15$lambda-8, reason: not valid java name */
    public static final kotlin.Pair m2081lambda20$lambda15$lambda8(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo device, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "pairingConfig");
        pairingConfig.getUserInfoData().setSleepTimeSelection(this$0.getSleepTimeStorage().getSleepTime());
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        return new kotlin.Pair(device, pairingConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-20$lambda-15$lambda-14, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2074lambda20$lambda15$lambda14(final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo scannnedDevice, final kotlin.Pair deviceInfoPairConfigPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scannnedDevice, "$scannnedDevice");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoPairConfigPair, "deviceInfoPairConfigPair");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.transferDataWithProgress$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.ExecutorsFactory.INSTANCE.createPairExecutor((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) deviceInfoPairConfigPair.getFirst(), this$0.communicator, this$0.logger, scannnedDevice.getProtocolVersion()), ((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) deviceInfoPairConfigPair.getFirst()).getUid(), (powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig) deviceInfoPairConfigPair.getSecond(), 0.0f, 4, null).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$n3Fn7uFik_B_kBRAaN2S5iaieH0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2079lambda20$lambda15$lambda14$lambda9(this.f$0, (kotlin.Pair) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$YRmo34sLvkd22xeGxSBhv3BvNxk
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2075lambda20$lambda15$lambda14$lambda10((kotlin.Pair) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$eWfuxSQYsvLfEaxRX9sp447H0go
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2076lambda20$lambda15$lambda14$lambda11((kotlin.Pair) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$dyGCj4qHDGgcbikvIjX2SmnTjJs
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2077lambda20$lambda15$lambda14$lambda12(deviceInfoPairConfigPair, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$Gen2PairingProgressViewModel$cslOkVeXjZo8Kojm3M4mLUcK3Ts
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.m2078lambda20$lambda15$lambda14$lambda13(deviceInfoPairConfigPair, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: lambda-20$lambda-15$lambda-14$lambda-9, reason: not valid java name */
    public static final void m2079lambda20$lambda15$lambda14$lambda9(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getPairingProgressField().set(pair.getFirst());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-20$lambda-15$lambda-14$lambda-10, reason: not valid java name */
    public static final boolean m2075lambda20$lambda15$lambda14$lambda10(kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getSecond() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-20$lambda-15$lambda-14$lambda-11, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo m2076lambda20$lambda15$lambda14$lambda11(kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) it.getSecond();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-20$lambda-15$lambda-14$lambda-12, reason: not valid java name */
    public static final kotlin.Pair m2077lambda20$lambda15$lambda14$lambda12(kotlin.Pair deviceInfoPairConfigPair, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoPairConfigPair, "$deviceInfoPairConfigPair");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new kotlin.Pair(it, deviceInfoPairConfigPair.getFirst());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-20$lambda-15$lambda-14$lambda-13, reason: not valid java name */
    public static final io.reactivex.Observable m2078lambda20$lambda15$lambda14$lambda13(kotlin.Pair deviceInfoPairConfigPair, java.lang.Throwable error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoPairConfigPair, "$deviceInfoPairConfigPair");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof java.util.concurrent.TimeoutException) {
            return io.reactivex.Observable.error(new powerwatch.matrix.com.pwgen2android.pair.ui.gen2.ConnectionTimedOutError(((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) deviceInfoPairConfigPair.getFirst()).getUid(), ((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) deviceInfoPairConfigPair.getFirst()).getExtendedDeviceInfo().getFirmwareVersion()));
        }
        return io.reactivex.Observable.error(new powerwatch.matrix.com.pwgen2android.pair.ui.gen2.ConnectionFailedError(((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) deviceInfoPairConfigPair.getFirst()).getUid(), ((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) deviceInfoPairConfigPair.getFirst()).getExtendedDeviceInfo().getFirmwareVersion()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-20$lambda-16, reason: not valid java name */
    public static final io.reactivex.Observable m2082lambda20$lambda16(java.lang.Throwable error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof powerwatch.matrix.com.pwgen2android.pair.ui.gen2.PairingFailedError) {
            return io.reactivex.Observable.error(error);
        }
        return error instanceof java.util.concurrent.TimeoutException ? io.reactivex.Observable.error(new powerwatch.matrix.com.pwgen2android.pair.ui.gen2.ConnectionTimedOutError("", "")) : io.reactivex.Observable.error(new powerwatch.matrix.com.pwgen2android.pair.ui.gen2.ConnectionFailedError("", ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-20$lambda-17, reason: not valid java name */
    public static final void m2083lambda20$lambda17(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.communicator.releaseScanningResources();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-20$lambda-18, reason: not valid java name */
    public static final void m2084lambda20$lambda18(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage deviceProtocolStorage, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceProtocolStorage, "$deviceProtocolStorage");
        powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository = this$0.metricsRepository;
        powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.PairEnd pairEnd = powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.PairEnd.INSTANCE;
        powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.SUCCESS success = powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.SUCCESS.INSTANCE;
        java.lang.String uid = ((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) pair.getFirst()).getData().getUid();
        java.lang.String firmwareVersion = ((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) pair.getFirst()).getData().getFirmwareVersion();
        kotlin.jvm.internal.Intrinsics.checkNotNull(firmwareVersion);
        metricsRepository.logEvent(new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent(pairEnd, success, new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice(uid, firmwareVersion)));
        this$0.isDevicePaired = true;
        androidx.databinding.ObservableField<java.lang.String> pairingProgressText = this$0.getPairingProgressText();
        android.app.Activity activity = this$0.activityWeakRef.get();
        pairingProgressText.set(activity == null ? null : activity.getString(powerwatch.matrix.com.pwgen2android.R.string.success));
        deviceProtocolStorage.saveDeviceProtocolVersion(((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) pair.getFirst()).getData().getUid(), ((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) pair.getFirst()).getData().getGetProtocolVersion());
        java.lang.Object first = pair.getFirst();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(first, "it.first");
        this$0.onPairingSuccess((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) first, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) pair.getSecond());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-20$lambda-19, reason: not valid java name */
    public static final void m2085lambda20$lambda19(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel this$0, java.lang.Throwable th) {
        powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent logEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (th instanceof java.util.concurrent.TimeoutException) {
            logEvent = new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent(powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.PairEnd.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.DEVICE_NOT_FOUND.INSTANCE, null, 4, null);
        } else {
            if (th instanceof powerwatch.matrix.com.pwgen2android.pair.ui.gen2.ConnectionTimedOutError) {
                powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.PairEnd pairEnd = powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.PairEnd.INSTANCE;
                powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.DEVICE_NOT_FOUND device_not_found = powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.DEVICE_NOT_FOUND.INSTANCE;
                powerwatch.matrix.com.pwgen2android.pair.ui.gen2.ConnectionTimedOutError connectionTimedOutError = (powerwatch.matrix.com.pwgen2android.pair.ui.gen2.ConnectionTimedOutError) th;
                java.lang.String deviceId = connectionTimedOutError.getDeviceId();
                if (deviceId == null) {
                    deviceId = "";
                }
                java.lang.String fwVersion = connectionTimedOutError.getFwVersion();
                logEvent = new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent(pairEnd, device_not_found, new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice(deviceId, fwVersion != null ? fwVersion : ""));
            } else if (th instanceof powerwatch.matrix.com.pwgen2android.pair.ui.gen2.ConnectionFailedError) {
                powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.PairEnd pairEnd2 = powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.PairEnd.INSTANCE;
                powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.CONNECTION_FAILURE connection_failure = powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.CONNECTION_FAILURE.INSTANCE;
                powerwatch.matrix.com.pwgen2android.pair.ui.gen2.ConnectionFailedError connectionFailedError = (powerwatch.matrix.com.pwgen2android.pair.ui.gen2.ConnectionFailedError) th;
                java.lang.String deviceId2 = connectionFailedError.getDeviceId();
                if (deviceId2 == null) {
                    deviceId2 = "";
                }
                java.lang.String fwVersion2 = connectionFailedError.getFwVersion();
                logEvent = new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent(pairEnd2, connection_failure, new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice(deviceId2, fwVersion2 != null ? fwVersion2 : ""));
            } else {
                logEvent = new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent(powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.PairEnd.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.CONNECTION_FAILURE.INSTANCE, null, 4, null);
            }
        }
        this$0.metricsRepository.logEvent(logEvent);
        th.printStackTrace();
        this$0.onPairingFailed();
    }

    public final void startPairing(java.lang.String pairingCode) {
        if (pairingCode == null) {
            onPairingFailed();
        } else {
            this.pairingInfoSubject.onNext(pairingCode);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.pair.ui.PairingBaseViewModel, powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroyView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroyView(context);
        this.communicator.releaseScanningResources();
        if (this.isDevicePaired) {
            return;
        }
        this.communicator.stopConnection();
    }
}
