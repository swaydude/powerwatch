package powerwatch.matrix.com.pwgen2android.sdk.highlevel;

/* JADX INFO: compiled from: SettingsLiteCommunicator.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "deviceCommunicationQueuer", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)V", "settingsExecutor", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;", "applySetting", "Lio/reactivex/Completable;", "setting", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SettingsLiteCommunicatorImpl implements powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator {
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsExecutor settingsExecutor;

    public SettingsLiteCommunicatorImpl(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "deviceCommunicationQueuer");
        this.communicator = communicator;
        this.settingsExecutor = new powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsExecutor(communicator, deviceCommunicationQueuer);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator
    public io.reactivex.Completable applySetting(final powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        io.reactivex.Completable completableDefer = io.reactivex.Completable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.sdk.highlevel.-$$Lambda$SettingsLiteCommunicatorImpl$2tIcsoIkPhHddXBPxudtU-Z8brA
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicatorImpl.m2288applySetting$lambda0(setting, this);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDefer, "defer {\n\n        val deviceID = setting.deviceID ?: communicator.defaultConnectedDevice()?.uid\n        ?: return@defer Completable.error(Throwable(\"No device connected\"))\n\n        when (setting) {\n            is WatchSetting.Units -> {\n                val command = Gen2SendUserInformationCommand(\n                        UnitsInfoData(twelveHourFormat = setting.user.accountSettings.timeFormatType == HourFormat.Twelve.format,\n                                metricsFormat = setting.user.accountSettings.unitType == UnitType.METRIC.type))\n                settingsExecutor.sendSettingCommand(deviceID, command)\n            }\n            is WatchSetting.Biometrics -> {\n                val command = Gen2SendBiometricsCommand(UserInfoData(\n                        age = setting.user.age,\n                        height = setting.user.height,\n                        weight = setting.user.weight,\n                        genderMale = setting.user.gender == Gender.Male.description,\n                        email = setting.user.email))\n                settingsExecutor.sendSettingCommand(deviceID, command)\n            }\n            is WatchSetting.Goals -> {\n                val goalInfoData = GoalInfoData(setting.goals.steps, setting.goals.distance, setting.goals.calories, setting.goals.sleep)\n                val stepsDistanceGoal = Gen2SendStepsDistanceGoal(goalInfoData)\n                val caloriesGoal = Gen2SendCaloriesSleepGoal(goalInfoData)\n                settingsExecutor.sendSettingCommand(deviceID, stepsDistanceGoal, caloriesGoal)\n\n            }\n            is WatchSetting.Language -> {\n                val command = Gen2SendLanguageCommand(setting.locale)\n                settingsExecutor.sendSettingCommand(deviceID, command)\n            }\n            is WatchSetting.SleepTime -> {\n                val command = Gen2SendUserPrefsAndGoalsCommandVer3(\n                        PairingConfig(\n                                unitsInfoData = UnitsInfoData(twelveHourFormat = setting.user.accountSettings.timeFormatType == HourFormat.Twelve.format,\n                                        metricsFormat = setting.user.accountSettings.unitType == UnitType.METRIC.type),\n                                userInfoData = UserInfoData(\n                                        age = setting.user.age,\n                                        height = setting.user.height,\n                                        weight = setting.user.weight,\n                                        genderMale = setting.user.gender == Gender.Male.description,\n                                        email = setting.user.email,\n                                        sleepTimeSelection = setting.sleepTime),\n                                languageInfoData = LanguageInfoData(setting.locale),\n                                goalInfoData = GoalInfoData(setting.goals.steps, setting.goals.distance, setting.goals.calories, setting.goals.sleep))\n                        )\n                settingsExecutor.sendSettingCommand(deviceID, command)\n            }\n        }\n    }");
        return completableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: applySetting$lambda-0, reason: not valid java name */
    public static final io.reactivex.CompletableSource m2288applySetting$lambda0(powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting setting, powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicatorImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "$setting");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.lang.String deviceID = setting.getDeviceID();
        if (deviceID == null) {
            powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfoDefaultConnectedDevice = this$0.communicator.defaultConnectedDevice();
            deviceID = deviceInfoDefaultConnectedDevice == null ? null : deviceInfoDefaultConnectedDevice.getUid();
            if (deviceID == null) {
                return io.reactivex.Completable.error(new java.lang.Throwable("No device connected"));
            }
        }
        if (setting instanceof powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Units) {
            powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Units units = (powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Units) setting;
            return this$0.settingsExecutor.sendSettingCommand(deviceID, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendUserInformationCommand(new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData(units.getUser().getAccountSettings().getTimeFormatType() == powerwatch.matrix.com.pwgen2android.shared.data.models.HourFormat.Twelve.INSTANCE.getFormat(), kotlin.jvm.internal.Intrinsics.areEqual(units.getUser().getAccountSettings().getUnitType(), powerwatch.matrix.com.pwgen2android.shared.data.models.UnitType.METRIC.INSTANCE.getType()))));
        }
        if (setting instanceof powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Biometrics) {
            powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Biometrics biometrics = (powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Biometrics) setting;
            return this$0.settingsExecutor.sendSettingCommand(deviceID, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendBiometricsCommand(new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData(kotlin.jvm.internal.Intrinsics.areEqual(biometrics.getUser().getGender(), powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDescription()), biometrics.getUser().getAge(), biometrics.getUser().getHeight(), biometrics.getUser().getWeight(), biometrics.getUser().getEmail(), 0, 32, null)));
        }
        if (setting instanceof powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Goals) {
            powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Goals goals = (powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Goals) setting;
            powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData goalInfoData = new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData(goals.getGoals().getSteps(), goals.getGoals().getDistance(), goals.getGoals().getCalories(), goals.getGoals().getSleep());
            return this$0.settingsExecutor.sendSettingCommand(deviceID, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendStepsDistanceGoal(goalInfoData), new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendCaloriesSleepGoal(goalInfoData));
        }
        if (setting instanceof powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Language) {
            return this$0.settingsExecutor.sendSettingCommand(deviceID, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendLanguageCommand(((powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Language) setting).getLocale()));
        }
        if (!(setting instanceof powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.SleepTime)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.SleepTime sleepTime = (powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.SleepTime) setting;
        return this$0.settingsExecutor.sendSettingCommand(deviceID, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendUserPrefsAndGoalsCommandVer3(new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig(new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData(sleepTime.getUser().getAccountSettings().getTimeFormatType() == powerwatch.matrix.com.pwgen2android.shared.data.models.HourFormat.Twelve.INSTANCE.getFormat(), kotlin.jvm.internal.Intrinsics.areEqual(sleepTime.getUser().getAccountSettings().getUnitType(), powerwatch.matrix.com.pwgen2android.shared.data.models.UnitType.METRIC.INSTANCE.getType())), new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData(kotlin.jvm.internal.Intrinsics.areEqual(sleepTime.getUser().getGender(), powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDescription()), sleepTime.getUser().getAge(), sleepTime.getUser().getHeight(), sleepTime.getUser().getWeight(), sleepTime.getUser().getEmail(), sleepTime.getSleepTime()), new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData(sleepTime.getGoals().getSteps(), sleepTime.getGoals().getDistance(), sleepTime.getGoals().getCalories(), sleepTime.getGoals().getSleep()), new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LanguageInfoData(sleepTime.getLocale()))));
    }
}
