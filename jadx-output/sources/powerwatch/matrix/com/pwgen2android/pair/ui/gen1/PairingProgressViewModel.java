package powerwatch.matrix.com.pwgen2android.pair.ui.gen1;

/* JADX INFO: compiled from: PairingProgressViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;", "Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingBaseViewModel;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "goalConfigurationRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "languageController", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;", "logger", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;", "bluetoothManager", "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;", "activity", "Landroid/app/Activity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "context", "Landroid/content/Context;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;)V", "pairingInfoSubject", "Lio/reactivex/subjects/PublishSubject;", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "kotlin.jvm.PlatformType", "startPairing", "", "deviceInfo", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PairingProgressViewModel extends powerwatch.matrix.com.pwgen2android.pair.ui.PairingBaseViewModel {
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository;
    private final powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput logger;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> pairingInfoSubject;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo m2049_init_$lambda1(java.lang.Boolean noName_0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return deviceInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairingProgressViewModel(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput logger, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager, final android.app.Activity activity, androidx.fragment.app.FragmentManager fragmentManager, android.content.Context context) {
        super(deviceRepository, userAccountRepository, goalConfigurationRepository, languageController, communicator, bluetoothManager, fragmentManager, logger, activity);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationRepository, "goalConfigurationRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageController, "languageController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.communicator = communicator;
        this.userAccountRepository = userAccountRepository;
        this.goalConfigurationRepository = goalConfigurationRepository;
        this.languageController = languageController;
        this.logger = logger;
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<DeviceInfo>()");
        this.pairingInfoSubject = publishSubjectCreate;
        getCompositeDisposable().add(io.reactivex.Observable.combineLatest(getBluetoothEnabledSubject().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$PairingProgressViewModel$LLucln4etxkYr3W4EnDyXdaD6MY
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel.m2048_init_$lambda0((java.lang.Boolean) obj);
            }
        }), publishSubjectCreate, new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$PairingProgressViewModel$e8t5ki0XMYRSuZ_ATzBqRnKwiNE
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel.m2049_init_$lambda1((java.lang.Boolean) obj, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj2);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$PairingProgressViewModel$6YGgwwi3QpF9BKj7GK0VMqqdCpo
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel.m2050_init_$lambda10(this.f$0, activity, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }));
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final boolean m2048_init_$lambda0(java.lang.Boolean it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-10, reason: not valid java name */
    public static final void m2050_init_$lambda10(final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel this$0, android.app.Activity activity, final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "$activity");
        this$0.getPairingDisposable().add(this$0.communicator.connectedDevicesChange().take(1L).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$PairingProgressViewModel$N-KmKAUI5ZvWQtF1rsJht8HtYK4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel.m2056lambda10$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }).withLatestFrom(this$0.getUserData(), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$PairingProgressViewModel$USZ45O5uhtDgw8dC58kRv4Tbe-0
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel.m2057lambda10$lambda3((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj, (powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig) obj2);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$PairingProgressViewModel$YE9tdqElS3H82qYlNt0QZHQeGSs
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel.m2058lambda10$lambda4(this.f$0, (kotlin.Pair) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$PairingProgressViewModel$Taakk-nk-HcTHrblwjThs8om-_k
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel.m2059lambda10$lambda5(this.f$0, (kotlin.Pair) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$PairingProgressViewModel$d2Yl6x6lwJZUO2TSaAlRESieh-8
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel.m2060lambda10$lambda6((kotlin.Pair) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$PairingProgressViewModel$sjm6LKh_MmSO4nX1AhL70XCzLE8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel.m2061lambda10$lambda7((kotlin.Pair) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).timeout(45L, java.util.concurrent.TimeUnit.SECONDS).take(1L).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$PairingProgressViewModel$gtWjRPHa83ccR5YL5vKqvm_BYm4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel.m2062lambda10$lambda8(this.f$0, deviceInfo, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$PairingProgressViewModel$9BLVRyicbgSbOEZ-hr0Wc6exD_0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel.m2063lambda10$lambda9(this.f$0, (java.lang.Throwable) obj);
            }
        }));
        this$0.getPairingProgressText().set(activity.getString(powerwatch.matrix.com.pwgen2android.R.string.connecting_to_device));
        this$0.communicator.startConnection(kotlin.collections.CollectionsKt.listOf(deviceInfo.getUid()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-10$lambda-2, reason: not valid java name */
    public static final void m2056lambda10$lambda2(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getPairingProgressText().set("Pairing...");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-10$lambda-3, reason: not valid java name */
    public static final kotlin.Pair m2057lambda10$lambda3(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo device, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "pairingConfig");
        return new kotlin.Pair(device, pairingConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-10$lambda-4, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2058lambda10$lambda4(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel this$0, kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.transferDataWithProgress$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.ExecutorsFactory.Companion.createPairExecutor$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.ExecutorsFactory.INSTANCE, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) it.getFirst(), this$0.communicator, this$0.logger, 0, 8, null), ((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) it.getFirst()).getUid(), (powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig) it.getSecond(), 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: lambda-10$lambda-5, reason: not valid java name */
    public static final void m2059lambda10$lambda5(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getPairingProgressField().set(pair.getFirst());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-10$lambda-6, reason: not valid java name */
    public static final boolean m2060lambda10$lambda6(kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getSecond() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-10$lambda-7, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo m2061lambda10$lambda7(kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) it.getSecond();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-10$lambda-8, reason: not valid java name */
    public static final void m2062lambda10$lambda8(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getPairingProgressText().set("Success...");
        kotlin.jvm.internal.Intrinsics.checkNotNull(dataInfo);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceInfo, "deviceInfo");
        this$0.onPairingSuccess(dataInfo, deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-10$lambda-9, reason: not valid java name */
    public static final void m2063lambda10$lambda9(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        th.printStackTrace();
        this$0.onPairingFailed();
    }

    public final void startPairing(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            onPairingFailed();
        } else {
            this.pairingInfoSubject.onNext(deviceInfo);
        }
    }
}
