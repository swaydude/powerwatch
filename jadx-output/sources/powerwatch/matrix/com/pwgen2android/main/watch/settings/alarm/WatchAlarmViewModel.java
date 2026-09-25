package powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm;

/* JADX INFO: compiled from: WatchAlarmViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BG\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\u0006\u0010H\u001a\u00020FJ\b\u0010I\u001a\u00020FH\u0002J\u0006\u0010J\u001a\u00020FJ\u0011\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00150L¢\u0006\u0002\u0010MJ\u0011\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00150L¢\u0006\u0002\u0010MJ\u0011\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00150L¢\u0006\u0002\u0010MJ\b\u0010P\u001a\u00020QH\u0016J\u0010\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020TH\u0016J\u0006\u0010U\u001a\u00020QJ \u0010V\u001a\u00020Q2\u0006\u0010W\u001a\u00020\"2\u0006\u0010X\u001a\u00020\"2\u0006\u0010Y\u001a\u00020FH\u0002J \u0010Z\u001a\u00020Q2\u0006\u0010W\u001a\u00020\"2\u0006\u0010X\u001a\u00020\"2\u0006\u0010Y\u001a\u00020FH\u0002J\u0018\u0010[\u001a\u00020\"2\u0006\u0010W\u001a\u00020\"2\u0006\u0010Y\u001a\u00020FH\u0002J\n\u0010\\\u001a\u00020Q*\u00020]J\n\u0010^\u001a\u00020Q*\u00020]R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082D¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0018¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u001a\u0010$\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u001c\u00101\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010\u00070\u000702X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\"0\u0018¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001aR\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u00010=X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010B\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010&\"\u0004\bD\u0010(R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010\u001aR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006_"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;", "activity", "Landroid/app/Activity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "settingsDisplayValueLoader", "Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;", "alarmTimerSettingExecutor", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "settingsDataRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;", "savePreferencesViewModel", "(Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V", "AM", "", "PM", "alarmActivationField", "Landroidx/databinding/ObservableField;", "getAlarmActivationField", "()Landroidx/databinding/ObservableField;", "alarmRepeatField", "getAlarmRepeatField", "amPm", "getAmPm", "getCommunicator", "()Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "hourValue", "", "getHourValue", "initialAM", "getInitialAM", "()Ljava/lang/String;", "setInitialAM", "(Ljava/lang/String;)V", "initialHourValue", "getInitialHourValue", "()I", "setInitialHourValue", "(I)V", "initialMinuteValue", "getInitialMinuteValue", "setInitialMinuteValue", "managerWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "minuteValue", "getMinuteValue", "oldAlarmActive", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;", "getOldAlarmActive", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;", "setOldAlarmActive", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;)V", "oldAlarmRepetition", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;", "getOldAlarmRepetition", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;", "setOldAlarmRepetition", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;)V", "oldAlarmTime", "getOldAlarmTime", "setOldAlarmTime", "showSaveProgress", "", "getShowSaveProgress", "isAMPMUSed", "isAMSet", "isOldAlarmSet", "loadAMValues", "", "()[Ljava/lang/String;", "loadHourValues", "loadMinuteValues", "onBackClicked", "", "onCreateView", "context", "Landroid/content/Context;", "onDoneClicked", "prepareForMainDisplay", "hour", "minute", "amSelected", "prepareForOldDisplay", "processHourValue", "onActivationClicked", "Landroid/view/View;", "onAlarmRepeatClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WatchAlarmViewModel extends powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable, powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel {
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel $$delegate_0;
    private final java.lang.String AM;
    private final java.lang.String PM;
    private final androidx.databinding.ObservableField<java.lang.String> alarmActivationField;
    private final androidx.databinding.ObservableField<java.lang.String> alarmRepeatField;
    private final powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor alarmTimerSettingExecutor;
    private final androidx.databinding.ObservableField<java.lang.String> amPm;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final androidx.databinding.ObservableField<java.lang.Integer> hourValue;
    private java.lang.String initialAM;
    private int initialHourValue;
    private int initialMinuteValue;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> managerWeakReference;
    private final androidx.databinding.ObservableField<java.lang.Integer> minuteValue;
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl oldAlarmActive;
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection oldAlarmRepetition;
    private java.lang.String oldAlarmTime;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository settingsDataRepository;
    private final powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader settingsDisplayValueLoader;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onDoneClicked$lambda-3, reason: not valid java name */
    public static final void m1972onDoneClicked$lambda3() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel
    public androidx.databinding.ObservableField<java.lang.Boolean> getShowSaveProgress() {
        return this.$$delegate_0.getShowSaveProgress();
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator getCommunicator() {
        return this.communicator;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WatchAlarmViewModel(android.app.Activity activity, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader settingsDisplayValueLoader, powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor alarmTimerSettingExecutor, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository settingsDataRepository, powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel savePreferencesViewModel) {
        super(activity, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDisplayValueLoader, "settingsDisplayValueLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alarmTimerSettingExecutor, "alarmTimerSettingExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDataRepository, "settingsDataRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savePreferencesViewModel, "savePreferencesViewModel");
        this.communicator = communicator;
        this.settingsDisplayValueLoader = settingsDisplayValueLoader;
        this.alarmTimerSettingExecutor = alarmTimerSettingExecutor;
        this.userPrefsUtils = userPrefsUtils;
        this.settingsDataRepository = settingsDataRepository;
        this.$$delegate_0 = savePreferencesViewModel;
        this.managerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.AM = "AM";
        this.PM = "PM";
        this.alarmRepeatField = new androidx.databinding.ObservableField<>();
        this.alarmActivationField = new androidx.databinding.ObservableField<>();
        this.hourValue = new androidx.databinding.ObservableField<>();
        this.minuteValue = new androidx.databinding.ObservableField<>();
        this.amPm = new androidx.databinding.ObservableField<>();
        this.initialAM = "AM";
    }

    public /* synthetic */ WatchAlarmViewModel(android.app.Activity activity, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader settingsDisplayValueLoader, powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor watchSettingsExecutor, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository settingsDataRepository, powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel savePreferencesViewModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, fragmentManager, communicator, settingsDisplayValueLoader, watchSettingsExecutor, userPrefsUtils, settingsDataRepository, (i & 128) != 0 ? new powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModelImpl(null, 1, null) : savePreferencesViewModel);
    }

    public final androidx.databinding.ObservableField<java.lang.String> getAlarmRepeatField() {
        return this.alarmRepeatField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getAlarmActivationField() {
        return this.alarmActivationField;
    }

    public final androidx.databinding.ObservableField<java.lang.Integer> getHourValue() {
        return this.hourValue;
    }

    public final androidx.databinding.ObservableField<java.lang.Integer> getMinuteValue() {
        return this.minuteValue;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getAmPm() {
        return this.amPm;
    }

    public final int getInitialHourValue() {
        return this.initialHourValue;
    }

    public final void setInitialHourValue(int i) {
        this.initialHourValue = i;
    }

    public final int getInitialMinuteValue() {
        return this.initialMinuteValue;
    }

    public final void setInitialMinuteValue(int i) {
        this.initialMinuteValue = i;
    }

    public final java.lang.String getInitialAM() {
        return this.initialAM;
    }

    public final void setInitialAM(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.initialAM = str;
    }

    public final java.lang.String getOldAlarmTime() {
        return this.oldAlarmTime;
    }

    public final void setOldAlarmTime(java.lang.String str) {
        this.oldAlarmTime = str;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl getOldAlarmActive() {
        return this.oldAlarmActive;
    }

    public final void setOldAlarmActive(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl alarmControl) {
        this.oldAlarmActive = alarmControl;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection getOldAlarmRepetition() {
        return this.oldAlarmRepetition;
    }

    public final void setOldAlarmRepetition(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection daySelection) {
        this.oldAlarmRepetition = daySelection;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        androidx.databinding.ObservableField<java.lang.String> observableField = this.alarmRepeatField;
        powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader settingsDisplayValueLoader = this.settingsDisplayValueLoader;
        byte mode = powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegateKt.getCurrentRepeat().getMode();
        powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.AlarmRepeatMode alarmRepeatMode = powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.AlarmRepeatMode.INSTANCE;
        android.content.Context activityContext = getActivityContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(activityContext);
        observableField.set(settingsDisplayValueLoader.getDisplayValue(mode, alarmRepeatMode, activityContext));
        this.alarmActivationField.set(this.settingsDisplayValueLoader.getDisplayValue(powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegateKt.getCurrentSelectionMode().getMode(), powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.AlarmActivation.INSTANCE, getActivityContext()));
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmData alarmDataLoadAlarm = this.settingsDataRepository.loadAlarm();
        if (alarmDataLoadAlarm != null) {
            prepareForOldDisplay(alarmDataLoadAlarm.getHour(), alarmDataLoadAlarm.getMinute(), alarmDataLoadAlarm.isAM());
            this.oldAlarmActive = alarmDataLoadAlarm.getAlarmControl();
            this.oldAlarmRepetition = alarmDataLoadAlarm.getDaySelection();
        }
        java.util.Calendar calendar = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toCalendar(java.lang.System.currentTimeMillis());
        prepareForMainDisplay(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.hourInDay(calendar), powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.minInHour(calendar) - 1, isAMPMUSed() && powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.hourInDay(calendar) < 12);
    }

    public final boolean isOldAlarmSet() {
        return this.oldAlarmActive != null;
    }

    private final int processHourValue(int hour, boolean amSelected) {
        boolean zIsAMPMUSed = isAMPMUSed();
        int i = (!zIsAMPMUSed || hour <= 12) ? hour : hour - 12;
        return (zIsAMPMUSed || hour >= 12) ? i : hour + 12;
    }

    private final void prepareForOldDisplay(int hour, int minute, boolean amSelected) {
        int iProcessHourValue = processHourValue(hour, amSelected);
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iProcessHourValue), java.lang.Integer.valueOf(minute)}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        this.oldAlarmTime = str;
    }

    private final void prepareForMainDisplay(int hour, int minute, boolean amSelected) {
        this.initialHourValue = processHourValue(hour, amSelected);
        this.initialMinuteValue = minute;
        this.initialAM = amSelected ? this.AM : this.PM;
    }

    public final boolean isAMPMUSed() {
        return this.userPrefsUtils.isTwelveHourFormatUsed();
    }

    public final java.lang.String[] loadHourValues() {
        kotlin.ranges.IntRange intRange = isAMPMUSed() ? new kotlin.ranges.IntRange(0, 12) : new kotlin.ranges.IntRange(0, 23);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it).nextInt();
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String str = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iNextInt)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            arrayList.add(str);
        }
        java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
        java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (java.lang.String[]) array;
    }

    public final java.lang.String[] loadMinuteValues() {
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(0, 59);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it).nextInt();
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String str = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iNextInt)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            arrayList.add(str);
        }
        java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
        java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (java.lang.String[]) array;
    }

    public final java.lang.String[] loadAMValues() {
        return new java.lang.String[]{this.AM, this.PM};
    }

    private final boolean isAMSet() {
        java.lang.String str = this.amPm.get();
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) (str == null ? null : java.lang.Boolean.valueOf(kotlin.text.StringsKt.equals(str, this.AM, true))), (java.lang.Object) true);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel
    public void onBackClicked() {
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    public final void onDoneClicked() {
        java.lang.Integer num = this.hourValue.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        java.lang.Integer num2 = this.minuteValue.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(num2);
        int iIntValue2 = num2.intValue();
        boolean zIsAMPMUSed = isAMPMUSed();
        getShowSaveProgress().set(true);
        boolean z = iIntValue < 12 && (!zIsAMPMUSed || isAMSet());
        if (zIsAMPMUSed && iIntValue > 12) {
            iIntValue -= 12;
        }
        getCompositeDisposable().add(this.alarmTimerSettingExecutor.setAlarm(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmData((byte) iIntValue, (byte) iIntValue2, z, powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegateKt.getCurrentRepeat(), powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegateKt.getCurrentSelectionMode())).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.-$$Lambda$WatchAlarmViewModel$rvPKcUBssDy_uDcWLuCOt2FnQz4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel.m1971onDoneClicked$lambda2(this.f$0, (java.lang.Throwable) obj);
            }
        }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.-$$Lambda$WatchAlarmViewModel$D7KrapNuoVTS_JPQgKV3v4Gdsbg
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel.m1972onDoneClicked$lambda3();
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.-$$Lambda$WatchAlarmViewModel$xMXShJ9NoqJVduGKQj5Nkpw56NQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onDoneClicked$lambda-2, reason: not valid java name */
    public static final void m1971onDoneClicked$lambda2(powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getShowSaveProgress().set(false);
        this$0.onBackClicked();
    }

    public final void onAlarmRepeatClicked(android.view.View view) {
        androidx.fragment.app.FragmentManager fragmentManager;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfoDefaultConnectedDevice = this.communicator.defaultConnectedDevice();
        if ((deviceInfoDefaultConnectedDevice == null ? null : deviceInfoDefaultConnectedDevice.getUid()) == null || (fragmentManager = this.managerWeakReference.get()) == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment.Companion companion = powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment.INSTANCE;
        powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.AlarmRepeatMode alarmRepeatMode = powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.AlarmRepeatMode.INSTANCE;
        java.lang.String string = view.getContext().getString(powerwatch.matrix.com.pwgen2android.R.string.repeat);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.repeat)");
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, companion.newInstance(alarmRepeatMode, string, powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegateKt.getCurrentRepeat().getMode()), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onActivationClicked(android.view.View view) {
        androidx.fragment.app.FragmentManager fragmentManager;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfoDefaultConnectedDevice = this.communicator.defaultConnectedDevice();
        if ((deviceInfoDefaultConnectedDevice == null ? null : deviceInfoDefaultConnectedDevice.getUid()) == null || (fragmentManager = this.managerWeakReference.get()) == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment.Companion companion = powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment.INSTANCE;
        powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.AlarmActivation alarmActivation = powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.AlarmActivation.INSTANCE;
        java.lang.String string = view.getContext().getString(powerwatch.matrix.com.pwgen2android.R.string.activation);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.activation)");
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, companion.newInstance(alarmActivation, string, powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegateKt.getCurrentSelectionMode().getMode()), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }
}
