package powerwatch.matrix.com.pwgen2android.main.watch.settings.personal;

/* JADX INFO: compiled from: PersonalSettingsVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0014\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010.\u001a\u00020,H\u0016J\u0010\u0010/\u001a\u00020,2\u0006\u00100\u001a\u000201H\u0016J\n\u00102\u001a\u00020,*\u000203J\n\u00104\u001a\u00020,*\u000203J\n\u00105\u001a\u00020,*\u000203J\n\u00106\u001a\u00020,*\u000203J\n\u00107\u001a\u00020,*\u000203R\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010 \u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u001c\u0010\"\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00120\u00120\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010%\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010)\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019¨\u00069"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;", "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "deviceProtocolStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "sleepTimeUIStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;", "activity", "Landroid/app/Activity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V", "ageField", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getAgeField", "()Landroidx/databinding/ObservableField;", "contextWeakReference", "Ljava/lang/ref/WeakReference;", "genderField", "getGenderField", "goalConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;", "heightField", "getHeightField", "managerWeakReference", "pairedDevice", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;", "sleepTimeField", "getSleepTimeField", "user", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "weightField", "getWeightField", "displaySleepTime", "", "deviceID", "onBackClicked", "onCreateView", "context", "Landroid/content/Context;", "onAgeClicked", "Landroid/view/View;", "onGenderClicked", "onHeightClicked", "onSleepTimeClicked", "onWeightClicked", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PersonalSettingsVM extends powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.class).getSimpleName();
    private final androidx.databinding.ObservableField<java.lang.String> ageField;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final java.lang.ref.WeakReference<android.app.Activity> contextWeakReference;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage deviceProtocolStorage;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository;
    private final androidx.databinding.ObservableField<java.lang.String> genderField;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfig;
    private final androidx.databinding.ObservableField<java.lang.String> heightField;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> managerWeakReference;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.Device pairedDevice;
    private final androidx.databinding.ObservableField<java.lang.String> sleepTimeField;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeUIStorage sleepTimeUIStorage;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.User user;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;
    private final androidx.databinding.ObservableField<java.lang.String> weightField;

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PersonalSettingsVM(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage deviceProtocolStorage, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeUIStorage sleepTimeUIStorage, android.app.Activity activity, androidx.fragment.app.FragmentManager fragmentManager) {
        super(activity, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceProtocolStorage, "deviceProtocolStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepTimeUIStorage, "sleepTimeUIStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.userAccountRepository = userAccountRepository;
        this.userPrefsUtils = userPrefsUtils;
        this.deviceRepository = deviceRepository;
        this.deviceProtocolStorage = deviceProtocolStorage;
        this.communicator = communicator;
        this.sleepTimeUIStorage = sleepTimeUIStorage;
        this.weightField = new androidx.databinding.ObservableField<>("");
        this.heightField = new androidx.databinding.ObservableField<>("");
        this.ageField = new androidx.databinding.ObservableField<>("");
        this.genderField = new androidx.databinding.ObservableField<>("");
        this.sleepTimeField = new androidx.databinding.ObservableField<>("");
        this.managerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.contextWeakReference = new java.lang.ref.WeakReference<>(activity);
    }

    public final androidx.databinding.ObservableField<java.lang.String> getWeightField() {
        return this.weightField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getHeightField() {
        return this.heightField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getAgeField() {
        return this.ageField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getGenderField() {
        return this.genderField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getSleepTimeField() {
        return this.sleepTimeField;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        androidx.databinding.ObservableField<java.lang.String> observableField = this.sleepTimeField;
        android.app.Activity activity = this.contextWeakReference.get();
        observableField.set(activity == null ? null : activity.getString(powerwatch.matrix.com.pwgen2android.R.string.sleep_time_fw_update));
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository.DefaultImpls.load$default(this.deviceRepository, false, false, 3, null).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.-$$Lambda$PersonalSettingsVM$jAy3DMYCmuwX-e3kb9td2MHNdtA
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM.m1982onCreateView$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.Device) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.-$$Lambda$PersonalSettingsVM$H56I0A_tO65XKQra4cB5OQjGJq8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetFirstRepository.DefaultImpls.getFirst$default(this.userAccountRepository, false, false, 3, null).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.-$$Lambda$PersonalSettingsVM$gbZvwIFKOZRKqF3jBIfkyW2aWFQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM.m1984onCreateView$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.-$$Lambda$PersonalSettingsVM$n1gPEbVO5P65UGQ1rvFcTANwnnM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m1982onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.pairedDevice = device;
        this$0.displaySleepTime(device == null ? null : device.getBluetoothAddress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m1984onCreateView$lambda2(powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.User it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.user = it;
        kotlin.Pair<java.lang.Float, java.lang.String> value = this$0.userPrefsUtils.getValue(java.lang.Integer.valueOf(it.getHeight()), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.HEIGHT.INSTANCE);
        this$0.getHeightField().set(kotlin.math.MathKt.roundToInt(value.getFirst().floatValue()) + value.getSecond());
        kotlin.Pair<java.lang.Float, java.lang.String> value2 = this$0.userPrefsUtils.getValue(java.lang.Float.valueOf(it.getWeight()), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.WEIGHT.INSTANCE);
        this$0.getWeightField().set(kotlin.math.MathKt.roundToInt(value2.getFirst().floatValue()) + value2.getSecond());
        this$0.getAgeField().set(java.lang.String.valueOf(it.getAge()));
        int displayResource = kotlin.jvm.internal.Intrinsics.areEqual(it.getGender(), powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDescription()) ? powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDisplayResource() : powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Female.INSTANCE.getDisplayResource();
        android.app.Activity activity = this$0.contextWeakReference.get();
        java.lang.String string = activity == null ? null : activity.getString(displayResource);
        if (string == null) {
            string = it.getGender();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "contextWeakReference.get()?.getString(res) ?: it.gender");
        this$0.getGenderField().set(string);
    }

    public final void onHeightClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils = this.userPrefsUtils;
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user = this.user;
        if (user == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
            throw null;
        }
        kotlin.Pair<java.lang.Float, java.lang.String> value = userPrefsUtils.getValue(java.lang.Integer.valueOf(user.getHeight()), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.HEIGHT.INSTANCE);
        powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils2 = this.userPrefsUtils;
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user2 = this.user;
        if (user2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
            throw null;
        }
        boolean zIsMetricsUsed = userPrefsUtils2.isMetricsUsed(user2);
        int iMaxUnitValue = this.userPrefsUtils.maxUnitValue(powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.HEIGHT.INSTANCE, zIsMetricsUsed);
        int iMinUnitValue = this.userPrefsUtils.minUnitValue(powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.HEIGHT.INSTANCE, zIsMetricsUsed);
        java.lang.String str = kotlin.math.MathKt.roundToInt(value.getFirst().floatValue()) + value.getSecond();
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Height height = powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Height.INSTANCE;
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(iMinUnitValue, iMaxUnitValue);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((kotlin.collections.IntIterator) it).nextInt()));
        }
        java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
        java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig wheelConfig = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig(height, str, new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter(new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData(str, (java.lang.String[]) array, iMaxUnitValue, iMinUnitValue, null, 16, null), value.getSecond()), iMaxUnitValue, iMinUnitValue, 0, 32, null);
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment.INSTANCE.newInstance(wheelConfig), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onWeightClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils = this.userPrefsUtils;
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user = this.user;
        if (user == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
            throw null;
        }
        kotlin.Pair<java.lang.Float, java.lang.String> value = userPrefsUtils.getValue(java.lang.Float.valueOf(user.getWeight()), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.WEIGHT.INSTANCE);
        java.lang.String str = kotlin.math.MathKt.roundToInt(value.getFirst().floatValue()) + value.getSecond();
        powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils2 = this.userPrefsUtils;
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user2 = this.user;
        if (user2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
            throw null;
        }
        boolean zIsMetricsUsed = userPrefsUtils2.isMetricsUsed(user2);
        int iMaxUnitValue = this.userPrefsUtils.maxUnitValue(powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.WEIGHT.INSTANCE, zIsMetricsUsed);
        int iMinUnitValue = this.userPrefsUtils.minUnitValue(powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.WEIGHT.INSTANCE, zIsMetricsUsed);
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight weight = powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight.INSTANCE;
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(iMinUnitValue, iMaxUnitValue);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((kotlin.collections.IntIterator) it).nextInt()));
        }
        java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
        java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig wheelConfig = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig(weight, str, new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter(new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData(str, (java.lang.String[]) array, 0, 0, null, 28, null), value.getSecond()), iMaxUnitValue, iMinUnitValue, 0, 32, null);
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment.INSTANCE.newInstance(wheelConfig), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onGenderClicked(android.view.View view) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user = this.user;
        if (user == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
            throw null;
        }
        java.lang.String gender = user.getGender();
        int displayResource = kotlin.jvm.internal.Intrinsics.areEqual(gender, powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDescription()) ? powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDisplayResource() : powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Female.INSTANCE.getDisplayResource();
        android.app.Activity activity = this.contextWeakReference.get();
        java.lang.String str = (activity == null || (string3 = activity.getString(displayResource)) == null) ? gender : string3;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "contextWeakReference.get()?.getString(res) ?: currentGender");
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Gender gender2 = powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Gender.INSTANCE;
        java.lang.String[] strArr = {powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDescription(), powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Female.INSTANCE.getDescription()};
        java.lang.String[] strArr2 = new java.lang.String[2];
        android.app.Activity activity2 = this.contextWeakReference.get();
        if (activity2 == null || (string = activity2.getString(powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDisplayResource())) == null) {
            string = gender;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "contextWeakReference.get()?.getString(Gender.Male.displayResource) ?: currentGender");
        strArr2[0] = string;
        android.app.Activity activity3 = this.contextWeakReference.get();
        if (activity3 != null && (string2 = activity3.getString(powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Female.INSTANCE.getDisplayResource())) != null) {
            gender = string2;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(gender, "contextWeakReference.get()?.getString(Gender.Female.displayResource) ?: currentGender");
        strArr2[1] = gender;
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig wheelConfig = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig(gender2, str, new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter(new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData(null, strArr, 0, 0, strArr2, 13, null), null, 2, null), 0, 0, 0, 56, null);
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment.INSTANCE.newInstance(wheelConfig), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onAgeClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user = this.user;
        if (user == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
            throw null;
        }
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig wheelConfig = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig(powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Age.INSTANCE, java.lang.String.valueOf(user.getAge()), null, 120, 13, 0, 36, null);
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment.INSTANCE.newInstance(wheelConfig), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onSleepTimeClicked(android.view.View view) {
        java.lang.Object next;
        java.lang.String uid;
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device device;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        if (this.pairedDevice != null) {
            java.util.Iterator<T> it = this.communicator.connectedDevices().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    uid = ((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) next).getUid();
                    device = this.pairedDevice;
                }
            } while (!kotlin.jvm.internal.Intrinsics.areEqual(uid, device == null ? null : device.getBluetoothAddress()));
            if (((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) next) == null) {
                return;
            }
            powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage deviceProtocolStorage = this.deviceProtocolStorage;
            powerwatch.matrix.com.pwgen2android.shared.data.models.Device device2 = this.pairedDevice;
            if (deviceProtocolStorage.getDeviceProtocolVersion(device2 == null ? null : device2.getBluetoothAddress()) >= 3) {
                java.lang.String displayValue = this.sleepTimeUIStorage.getDisplayValue();
                powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.SleepTime sleepTime = powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.SleepTime.INSTANCE;
                java.lang.Object[] array = this.sleepTimeUIStorage.getPossibleValues().toArray(new java.lang.String[0]);
                java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig wheelConfig = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig(sleepTime, displayValue, new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter(new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData(null, (java.lang.String[]) array, 0, 0, null, 29, null), null, 2, null), 0, 0, 0, 56, null);
                androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
                if (fragmentManager == null) {
                    return;
                }
                powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment.INSTANCE.newInstance(wheelConfig), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
            }
        }
    }

    static /* synthetic */ void displaySleepTime$default(powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM personalSettingsVM, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        personalSettingsVM.displaySleepTime(str);
    }

    private final void displaySleepTime(java.lang.String deviceID) {
        if (this.deviceProtocolStorage.getDeviceProtocolVersion(deviceID) < 3) {
            androidx.databinding.ObservableField<java.lang.String> observableField = this.sleepTimeField;
            android.app.Activity activity = this.contextWeakReference.get();
            observableField.set(activity == null ? null : activity.getString(powerwatch.matrix.com.pwgen2android.R.string.sleep_time_fw_update));
            return;
        }
        this.sleepTimeField.set(this.sleepTimeUIStorage.getDisplayValue());
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel
    public void onBackClicked() {
        super.onBackClicked();
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }
}
