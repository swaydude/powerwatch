package powerwatch.matrix.com.pwgen2android.pair.ui;

/* JADX INFO: compiled from: PairingBaseViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\b\u00108\u001a\u000209H\u0004J\u0006\u0010:\u001a\u000209J\u0010\u0010;\u001a\u0002092\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010<\u001a\u000209H\u0014J\u0018\u0010=\u001a\u0002092\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0014J\b\u0010B\u001a\u000209H\u0004J\n\u0010C\u001a\u000209*\u00020DR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u0016X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\"X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\"\u0010'\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u000f0\u000f0\"X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u00020*X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001f\u0010-\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010.0.0\u001c¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u001f\u00100\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u000101010\u001c¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\"\u00103\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u0001050504X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006E"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "goalConfigurationRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "languageController", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "bluetoothManager", "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "logger", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;", "context", "Landroid/content/Context;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;Landroid/content/Context;)V", "bluetoothEnabledSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getBluetoothEnabledSubject", "()Lio/reactivex/subjects/PublishSubject;", "bluetoothWarnDisplayed", "Landroidx/databinding/ObservableField;", "getBluetoothWarnDisplayed", "()Landroidx/databinding/ObservableField;", "getContext", "()Landroid/content/Context;", "contextWeakRef", "Ljava/lang/ref/WeakReference;", "getContextWeakRef", "()Ljava/lang/ref/WeakReference;", "getDeviceRepository", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "fragmentManagerWeakReference", "getFragmentManagerWeakReference", "pairingDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getPairingDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "pairingProgressField", "", "getPairingProgressField", "pairingProgressText", "", "getPairingProgressText", "userData", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;", "getUserData", "()Lio/reactivex/Observable;", "init", "", "onBackClicked", "onDestroyView", "onPairingFailed", "onPairingSuccess", "deviceInformation", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "deviceInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "stopPairing", "onBluetoothEnableClicked", "Landroid/view/View;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class PairingBaseViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final io.reactivex.subjects.PublishSubject<java.lang.Boolean> bluetoothEnabledSubject;
    private final powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager;
    private final androidx.databinding.ObservableField<java.lang.Boolean> bluetoothWarnDisplayed;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final android.content.Context context;
    private final java.lang.ref.WeakReference<android.content.Context> contextWeakRef;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput logger;
    private final io.reactivex.disposables.CompositeDisposable pairingDisposable;
    private final androidx.databinding.ObservableField<java.lang.Integer> pairingProgressField;
    private final androidx.databinding.ObservableField<java.lang.String> pairingProgressText;
    private final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig> userData;

    protected final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository getDeviceRepository() {
        return this.deviceRepository;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairingBaseViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput logger, android.content.Context context) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationRepository, "goalConfigurationRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageController, "languageController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.deviceRepository = deviceRepository;
        this.languageController = languageController;
        this.communicator = communicator;
        this.bluetoothManager = bluetoothManager;
        this.logger = logger;
        this.context = context;
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.pairingProgressText = new androidx.databinding.ObservableField<>("");
        this.pairingProgressField = new androidx.databinding.ObservableField<>(0);
        this.bluetoothWarnDisplayed = new androidx.databinding.ObservableField<>(false);
        io.reactivex.subjects.PublishSubject<java.lang.Boolean> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Boolean>()");
        this.bluetoothEnabledSubject = publishSubjectCreate;
        this.pairingDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.contextWeakRef = new java.lang.ref.WeakReference<>(context);
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig> observableZip = io.reactivex.Observable.zip(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetFirstRepository.DefaultImpls.getFirst$default(userAccountRepository, false, false, 3, null).toObservable(), powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository.DefaultImpls.all$default(goalConfigurationRepository, null, true, 1, null), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.-$$Lambda$PairingBaseViewModel$BgVKyH5o9xoYuALEZ0Wg5uqBC_c
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.PairingBaseViewModel.m2022userData$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj, (java.util.List) obj2);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNull(observableZip);
        this.userData = observableZip;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    protected final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> getFragmentManagerWeakReference() {
        return this.fragmentManagerWeakReference;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getPairingProgressText() {
        return this.pairingProgressText;
    }

    public final androidx.databinding.ObservableField<java.lang.Integer> getPairingProgressField() {
        return this.pairingProgressField;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getBluetoothWarnDisplayed() {
        return this.bluetoothWarnDisplayed;
    }

    protected final io.reactivex.subjects.PublishSubject<java.lang.Boolean> getBluetoothEnabledSubject() {
        return this.bluetoothEnabledSubject;
    }

    protected final io.reactivex.disposables.CompositeDisposable getPairingDisposable() {
        return this.pairingDisposable;
    }

    protected final java.lang.ref.WeakReference<android.content.Context> getContextWeakRef() {
        return this.contextWeakRef;
    }

    protected final void init() {
        getCompositeDisposable().add(this.bluetoothManager.getChangeState(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Enabled.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Disabled.INSTANCE).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.-$$Lambda$PairingBaseViewModel$XC3qwn01dx-f1Bg3z2Hef5Guh1E
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.PairingBaseViewModel.m2016init$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-0, reason: not valid java name */
    public static final void m2016init$lambda0(powerwatch.matrix.com.pwgen2android.pair.ui.PairingBaseViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState bluetoothState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean zAreEqual = kotlin.jvm.internal.Intrinsics.areEqual(bluetoothState, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Enabled.INSTANCE);
        this$0.getBluetoothWarnDisplayed().set(java.lang.Boolean.valueOf(!zAreEqual));
        if (!zAreEqual) {
            this$0.stopPairing();
        }
        this$0.getBluetoothEnabledSubject().onNext(java.lang.Boolean.valueOf(zAreEqual));
    }

    protected final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig> getUserData() {
        return this.userData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: userData$lambda-1, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig m2022userData$lambda1(powerwatch.matrix.com.pwgen2android.pair.ui.PairingBaseViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.User user, java.util.List goalList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "user");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalList, "goalList");
        powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) kotlin.collections.CollectionsKt.lastOrNull(goalList);
        if (goalConfiguration == null) {
            goalConfiguration = new powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration(0L, 0, 0.0f, 0, 0, 0, 0L, false, 192, null);
        }
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig(new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData(user.getAccountSettings().getTimeFormatType() == powerwatch.matrix.com.pwgen2android.shared.data.models.HourFormat.Twelve.INSTANCE.getFormat(), kotlin.jvm.internal.Intrinsics.areEqual(user.getAccountSettings().getUnitType(), powerwatch.matrix.com.pwgen2android.shared.data.models.UnitType.METRIC.INSTANCE.getType())), new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData(kotlin.jvm.internal.Intrinsics.areEqual(user.getGender(), powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDescription()), user.getAge(), user.getHeight(), user.getWeight(), user.getEmail(), 0, 32, null), new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData(goalConfiguration.getSteps(), goalConfiguration.getDistance(), goalConfiguration.getCalories(), goalConfiguration.getSleep()), new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LanguageInfoData(this$0.languageController.getLanguageByKey(user.getAccountSettings().getLanguage()).getLocale()));
    }

    public final void onBackClicked() {
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    protected void onPairingSuccess(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo deviceInformation, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        java.lang.String serialNumber;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInformation, "deviceInformation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.pairingProgressText.set(this.context.getString(powerwatch.matrix.com.pwgen2android.R.string.saving_info));
        java.lang.String serialNumber2 = deviceInformation.getData().getSerialNumber();
        if (serialNumber2 == null || serialNumber2.length() == 0) {
            serialNumber = deviceInformation.getData().getUid();
        } else {
            serialNumber = deviceInformation.getData().getSerialNumber();
            kotlin.jvm.internal.Intrinsics.checkNotNull(serialNumber);
        }
        java.lang.String uid = deviceInformation.getData().getUid();
        int pid = deviceInformation.getData().getPid();
        java.lang.String firmwareVersion = deviceInformation.getData().getFirmwareVersion();
        kotlin.jvm.internal.Intrinsics.checkNotNull(firmwareVersion);
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddRepository.DefaultImpls.save$default(this.deviceRepository, new powerwatch.matrix.com.pwgen2android.shared.data.models.Device(0L, serialNumber, uid, pid, firmwareVersion, deviceInfo.getDeviceName(), null, false, false, false, false, 1985, null), false, 2, null).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.-$$Lambda$PairingBaseViewModel$bLXyjKRDddQIcGMTG5x0W3StP-Q
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.PairingBaseViewModel.m2019onPairingSuccess$lambda3(this.f$0, (java.lang.Throwable) obj);
            }
        }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.-$$Lambda$PairingBaseViewModel$oJFQhoJWCyYh5TJtwDX0JWiq4Kc
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.pair.ui.PairingBaseViewModel.m2020onPairingSuccess$lambda4(this.f$0);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.-$$Lambda$PairingBaseViewModel$fNsyfLBXswvLw0p6l6ESsVND81s
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.PairingBaseViewModel.m2021onPairingSuccess$lambda5(this.f$0, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPairingSuccess$lambda-3, reason: not valid java name */
    public static final void m2019onPairingSuccess$lambda3(powerwatch.matrix.com.pwgen2android.pair.ui.PairingBaseViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        androidx.fragment.app.FragmentManager fragmentManager = this$0.getFragmentManagerWeakReference().get();
        int iCount = kotlin.collections.CollectionsKt.count(new kotlin.ranges.IntRange(0, fragmentManager == null ? 0 : fragmentManager.getBackStackEntryCount()));
        for (int i = 0; i < iCount; i++) {
            androidx.fragment.app.FragmentManager fragmentManager2 = this$0.getFragmentManagerWeakReference().get();
            if (fragmentManager2 != null) {
                powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.popBackStackAllowingStateLoss(fragmentManager2);
            }
        }
        androidx.fragment.app.FragmentManager fragmentManager3 = this$0.getFragmentManagerWeakReference().get();
        if (fragmentManager3 == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager3, powerwatch.matrix.com.pwgen2android.pair.ui.PairingSuccessFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.pairing_fragment_container, false, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPairingSuccess$lambda-4, reason: not valid java name */
    public static final void m2020onPairingSuccess$lambda4(powerwatch.matrix.com.pwgen2android.pair.ui.PairingBaseViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.logger.info("Device saved.", this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPairingSuccess$lambda-5, reason: not valid java name */
    public static final void m2021onPairingSuccess$lambda5(powerwatch.matrix.com.pwgen2android.pair.ui.PairingBaseViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput.DefaultImpls.error$default(this$0.logger, "Error while saving device.", this$0, null, 4, null);
        th.printStackTrace();
    }

    protected final void stopPairing() {
        this.communicator.stopConnection();
        this.pairingDisposable.clear();
    }

    protected void onPairingFailed() {
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.pair.ui.PairingFailedFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.pairing_fragment_container, false, null, 12, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroyView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroyView(context);
        getCompositeDisposable().dispose();
        setCompositeDisposable(new io.reactivex.disposables.CompositeDisposable());
        this.pairingDisposable.clear();
    }

    public final void onBluetoothEnableClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.bluetoothManager.enable();
    }
}
