package powerwatch.matrix.com.pwgen2android.setup.language;

/* JADX INFO: compiled from: ItemExecutorDelegate.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;", "", "settingsExecutor", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;)V", "executeItem", "Lio/reactivex/Completable;", "Lpowerwatch/matrix/com/pwgen2android/setup/language/ExecuteItem;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ItemExecutorDelegate {
    private final powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor settingsExecutor;

    public ItemExecutorDelegate(powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor settingsExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsExecutor, "settingsExecutor");
        this.settingsExecutor = settingsExecutor;
    }

    public final io.reactivex.Completable executeItem(powerwatch.matrix.com.pwgen2android.setup.language.ExecuteItem executeItem) {
        io.reactivex.Completable completableFromAction;
        io.reactivex.Completable completableFromAction2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executeItem, "executeItem");
        powerwatch.matrix.com.pwgen2android.setup.language.SupportedType type = executeItem.getType();
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.DND.INSTANCE)) {
            int id = executeItem.getId();
            if (id == 0) {
                return this.settingsExecutor.setDNDMode(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode.OFF.INSTANCE);
            }
            if (id == 1) {
                return this.settingsExecutor.setDNDMode(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode.ON.INSTANCE);
            }
            if (id == 2) {
                return this.settingsExecutor.setDNDMode(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode.AUTO.INSTANCE);
            }
            io.reactivex.Completable completableComplete = io.reactivex.Completable.complete();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableComplete, "complete()");
            return completableComplete;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BackLight.INSTANCE)) {
            int id2 = executeItem.getId();
            if (id2 == 0) {
                return this.settingsExecutor.setBackLightMode(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightMode.Off.INSTANCE);
            }
            if (id2 == 1) {
                return this.settingsExecutor.setBackLightMode(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightMode.DoubleTap.INSTANCE);
            }
            if (id2 == 2) {
                return this.settingsExecutor.setBackLightMode(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightMode.WristTilt.INSTANCE);
            }
            if (id2 == 3) {
                return this.settingsExecutor.setBackLightMode(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightMode.WristShake.INSTANCE);
            }
            io.reactivex.Completable completableComplete2 = io.reactivex.Completable.complete();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableComplete2, "complete()");
            return completableComplete2;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BackLightDuration.INSTANCE)) {
            int id3 = executeItem.getId();
            if (id3 == 0) {
                return this.settingsExecutor.setBackLightDuration(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration.timed2Sec.INSTANCE);
            }
            if (id3 == 1) {
                return this.settingsExecutor.setBackLightDuration(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration.timed5Sec.INSTANCE);
            }
            if (id3 == 2) {
                return this.settingsExecutor.setBackLightDuration(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration.timed10Sec.INSTANCE);
            }
            io.reactivex.Completable completableComplete3 = io.reactivex.Completable.complete();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableComplete3, "complete()");
            return completableComplete3;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.PopUpDuration.INSTANCE)) {
            int id4 = executeItem.getId();
            if (id4 == 0) {
                return this.settingsExecutor.setPopupDuration(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.PopupDuration.Timed5Sec.INSTANCE);
            }
            if (id4 == 1) {
                return this.settingsExecutor.setPopupDuration(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.PopupDuration.Timed10Sec.INSTANCE);
            }
            if (id4 == 2) {
                return this.settingsExecutor.setPopupDuration(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.PopupDuration.Timed15Sec.INSTANCE);
            }
            io.reactivex.Completable completableComplete4 = io.reactivex.Completable.complete();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableComplete4, "complete()");
            return completableComplete4;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.GPSUpdateRate.INSTANCE)) {
            int id5 = executeItem.getId();
            if (id5 == 0) {
                return this.settingsExecutor.setGPSUpdateRate(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Auto.INSTANCE);
            }
            if (id5 == 1) {
                return this.settingsExecutor.setGPSUpdateRate(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed1Sec.INSTANCE);
            }
            if (id5 == 2) {
                return this.settingsExecutor.setGPSUpdateRate(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed2Sec.INSTANCE);
            }
            if (id5 == 3) {
                return this.settingsExecutor.setGPSUpdateRate(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed5Sec.INSTANCE);
            }
            if (id5 == 4) {
                return this.settingsExecutor.setGPSUpdateRate(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed10Sec.INSTANCE);
            }
            io.reactivex.Completable completableComplete5 = io.reactivex.Completable.complete();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableComplete5, "complete()");
            return completableComplete5;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.HomeScreen.INSTANCE)) {
            int id6 = executeItem.getId();
            if (id6 == 0) {
                return this.settingsExecutor.setHomeScreenMode(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.StepsCalories.INSTANCE);
            }
            if (id6 == 1) {
                return this.settingsExecutor.setHomeScreenMode(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.SleepHR.INSTANCE);
            }
            if (id6 == 2) {
                return this.settingsExecutor.setHomeScreenMode(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.Temperature.INSTANCE);
            }
            if (id6 == 3) {
                return this.settingsExecutor.setHomeScreenMode(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.Power.INSTANCE);
            }
            io.reactivex.Completable completableComplete6 = io.reactivex.Completable.complete();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableComplete6, "complete()");
            return completableComplete6;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.BLEDisconnection.INSTANCE)) {
            int id7 = executeItem.getId();
            if (id7 == 0) {
                return this.settingsExecutor.setBLEDisconnectionAlert(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BLEAlertMode.Off.INSTANCE);
            }
            if (id7 == 1) {
                return this.settingsExecutor.setBLEDisconnectionAlert(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BLEAlertMode.Vibrate.INSTANCE);
            }
            if (id7 == 2) {
                return this.settingsExecutor.setBLEDisconnectionAlert(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BLEAlertMode.Audio.INSTANCE);
            }
            if (id7 == 3) {
                return this.settingsExecutor.setBLEDisconnectionAlert(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BLEAlertMode.VibeAudio.INSTANCE);
            }
            io.reactivex.Completable completableComplete7 = io.reactivex.Completable.complete();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableComplete7, "complete()");
            return completableComplete7;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.Ringtone.INSTANCE)) {
            int id8 = executeItem.getId();
            if (id8 == 0) {
                return this.settingsExecutor.setRingtone(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode.Single.INSTANCE);
            }
            if (id8 == 1) {
                return this.settingsExecutor.setRingtone(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode.Double.INSTANCE);
            }
            if (id8 == 2) {
                return this.settingsExecutor.setRingtone(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode.Triple.INSTANCE);
            }
            io.reactivex.Completable completableComplete8 = io.reactivex.Completable.complete();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableComplete8, "complete()");
            return completableComplete8;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.Alert.INSTANCE)) {
            int id9 = executeItem.getId();
            if (id9 == 0) {
                return this.settingsExecutor.setAlert(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlertMode.VibeAudio.INSTANCE);
            }
            if (id9 == 1) {
                return this.settingsExecutor.setAlert(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlertMode.Vibrate.INSTANCE);
            }
            if (id9 == 2) {
                return this.settingsExecutor.setAlert(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlertMode.Audio.INSTANCE);
            }
            io.reactivex.Completable completableComplete9 = io.reactivex.Completable.complete();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableComplete9, "complete()");
            return completableComplete9;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.AlarmRepeatMode.INSTANCE)) {
            int id10 = executeItem.getId();
            if (id10 == 0) {
                completableFromAction2 = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.-$$Lambda$ItemExecutorDelegate$BiER0ealNenP4-sa_J16e16Vvq0
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegate.m2890executeItem$lambda0();
                    }
                });
            } else if (id10 == 1) {
                completableFromAction2 = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.-$$Lambda$ItemExecutorDelegate$lxFyO20sVzbb6T6R29NYKmNh6RM
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegate.m2891executeItem$lambda1();
                    }
                });
            } else if (id10 == 2) {
                completableFromAction2 = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.-$$Lambda$ItemExecutorDelegate$mnJHWRzgC167JQZnLhlRch44I9U
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegate.m2892executeItem$lambda2();
                    }
                });
            } else {
                completableFromAction2 = io.reactivex.Completable.complete();
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction2, "{\n                when (executeItem.id) {\n                    //todo move this to some kind of persistence\n                    0 -> Completable.fromAction {\n                        currentRepeat = DaySelection.EveryDay\n                    }\n                    1 -> Completable.fromAction {\n                        currentRepeat = DaySelection.EveryWeekDay\n                    }\n                    2 -> Completable.fromAction {\n                        currentRepeat = DaySelection.EveryWeekend\n                    }\n                    else -> Completable.complete()\n                }\n            }");
            return completableFromAction2;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.AlarmActivation.INSTANCE)) {
            int id11 = executeItem.getId();
            if (id11 == 0) {
                completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.-$$Lambda$ItemExecutorDelegate$DH3Zx2jx4_4Hrpu3T2NSY4uGM3Y
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegate.m2893executeItem$lambda3();
                    }
                });
            } else if (id11 == 1) {
                completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.-$$Lambda$ItemExecutorDelegate$cMjLJNgFr8RsS3UOwOM3BQ7Bar4
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegate.m2894executeItem$lambda4();
                    }
                });
            } else if (id11 == 2) {
                completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.-$$Lambda$ItemExecutorDelegate$RjzSQaMv1eUhvP-RmytdkjpaYcQ
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegate.m2895executeItem$lambda5();
                    }
                });
            } else {
                completableFromAction = io.reactivex.Completable.complete();
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "when (executeItem.id) {\n                //todo move this to some kind of persistence\n                0 -> Completable.fromAction {\n                    currentSelectionMode = AlarmControl.Off\n                }\n                1 -> Completable.fromAction {\n                    currentSelectionMode = AlarmControl.On\n                }\n                2 -> Completable.fromAction {\n                    currentSelectionMode = AlarmControl.Once\n                }\n                else -> Completable.complete()\n            }");
            return completableFromAction;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.UNKNOWN.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        io.reactivex.Completable completableComplete10 = io.reactivex.Completable.complete();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableComplete10, "complete()");
        return completableComplete10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executeItem$lambda-0, reason: not valid java name */
    public static final void m2890executeItem$lambda0() {
        powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegateKt.setCurrentRepeat(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection.EveryDay.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executeItem$lambda-1, reason: not valid java name */
    public static final void m2891executeItem$lambda1() {
        powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegateKt.setCurrentRepeat(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection.EveryWeekDay.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executeItem$lambda-2, reason: not valid java name */
    public static final void m2892executeItem$lambda2() {
        powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegateKt.setCurrentRepeat(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection.EveryWeekend.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executeItem$lambda-3, reason: not valid java name */
    public static final void m2893executeItem$lambda3() {
        powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegateKt.setCurrentSelectionMode(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl.Off.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executeItem$lambda-4, reason: not valid java name */
    public static final void m2894executeItem$lambda4() {
        powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegateKt.setCurrentSelectionMode(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl.On.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executeItem$lambda-5, reason: not valid java name */
    public static final void m2895executeItem$lambda5() {
        powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegateKt.setCurrentSelectionMode(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl.Once.INSTANCE);
    }
}
